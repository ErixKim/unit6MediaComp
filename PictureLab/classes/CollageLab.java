public class CollageLab
{
    public static void main(String[] args)
    {
        Picture picture = new Picture("blue-mark.jpg");
        Picture canvas = new Picture(480,640);
        canvas.cropAndCopy(picture,0,480,0,640,0,0);
        for (int i = 0; i < 1; i++)
        {
            Picture newPicture = canvas.scaleByHalf();
            if (i % 2 != 0)
            {
                newPicture.grayscale();
            }
            else
            {
                newPicture.negate();
            }
            canvas.cropAndCopy(newPicture,0,240,0,320,0,0);
        }
        canvas.mirrorVertical();
        canvas.mirrorHorizontal();
        canvas.explore();
    }
}