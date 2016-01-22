public class CollageLab
{
    public static void main(String[] args)
    {
        //x and y variables that are set to the length and width of the blue-mark picture
        int x = 480;
        int y = 640;
        //Creating a blue-mark picture
        Picture picture = new Picture("blue-mark.jpg");
        //Creating a blank canvas that is 960 in length and 1280 in width
        Picture canvas = new Picture(960,1280);
        //Using the cropAndCopy method to put the blue-mark picture into the canvas picture
        canvas.cropAndCopy(picture,0,480,0,640,0,0);
        //Using a for loop to scale the blue-mark picture by half four times
        for (int i = 0; i < 4; i++)
        {
            //making the variables divide its current value by 2 each time so it decreases by half each run
            x /= 2;
            y /= 2;
            //Using the scaleByHalf method on the blue-mark picture
            picture = picture.scaleByHalf();
            //Cropping and copying the scaled by half blue-mark picture into the canvas
            canvas.cropAndCopy(picture , 0 , x , 0 , y , 0 , 0);
        }
        //Mirroring the entire canvas over the x axis
        canvas.mirrorHorizontal();
        //Creating another picture for the original and copying it into the canvas
        Picture picture2 = new Picture("blue-mark.jpg");
        canvas.copy(picture2 , 0, 640);
        //Creating another blue-mark picture 
        Picture picture3 = new Picture("blue-mark.jpg");
        //Using the grayscale method on picture3 in order to take out all color and make the picture gray
        picture3.grayscale();
        //Putting in the grayscaled picture of blue-mark into the canvas
        canvas.copy(picture3 , 480, 640);
        //Exploring the final product of the canvas picture
        canvas.explore();
        Picture finalPic = canvas;
        finalPic.write("MyCollage.jpg");
    }
}