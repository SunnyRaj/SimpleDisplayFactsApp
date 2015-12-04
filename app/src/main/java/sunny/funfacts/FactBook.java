package sunny.funfacts;

import java.util.Random;

/**
 * Created by sunny on 11/24/15.
 */
public class FactBook {

    public String[] mFacts = {
            "Ants stretch when they wake up in the morning",
            "Ostriches can run faster than horses",
            "Olympic gold medals are actually mostly made of silver",
            "Banging your head against a wall burns 150 calories an hour",
            "In the UK, it is illegal to eat mince pies on Christmas Day",
            "Pteronophobia is the fear of being tickled by feathers",
            "When hippos are upset, their sweat turns red",
            "A flock of crows is known as a murder",
            "'Facebook Addiction Disorder' is a mental disorder identified by Psychologists",
            "The average woman uses her height in lipstick every 5 years",
            "29th May is officially 'Put a Pillow on Your Fridge Day'",
            "Cherophobia is the fear of fun",
            "Human saliva has a boiling point three times that of regular water",
            "If you lift a kangaroo’s tail off the ground it can’t hop",
            "Hyphephilia are people who get aroused by touching fabrics",
            "Billy goats urinate on their own heads to smell more attractive to females",
            "The person who invented the Frisbee was cremated and made into frisbees after he died",
            "During your lifetime, you will produce enough saliva to fill two swimming pools",
            "An eagle can kill a young deer and fly away with it",
            "Polar bears can eat as many as 86 penguins in a single sitting",
            "King Henry VIII slept with a gigantic axe beside him",
            "Bikinis and tampons invented by men",
            "If Pinokio says “My Noes Will Grow Now”, it would cause a paradox",
            "Heart attacks are more likely to happen on a Monday",
            "If you consistently fart for 6 years & 9 months, enough gas is produced to create the energy of an atomic bomb",
            "An average person’s yearly fast food intake will contain 12 pubic hairs",
            "The top six foods that make your fart are beans, corn, bell peppers, cauliflower, cabbage and milk",
            "There is a species of spider called the Hobo Spider"
    };

    public String getFact(){

        String fact = "";

        // Randomly select a fact
        Random randomgenerator = new Random(); // Construct a new Random number generator
        int randomNumber = randomgenerator.nextInt(mFacts.length);
        fact = mFacts[randomNumber];
        return fact;
    }
}
