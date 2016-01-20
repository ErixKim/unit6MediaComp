public class CollageLab
{
    public static void main(String[] args)
    {
        Picture picture = new Picture("blue-mark.jpg");
        for (int i = 0; i < 6; i++)
        {
            Picture newPicture = picture.scaleByHalf();
            picture.cropAndCopy(newPicture,100,200,100,200,300,300);
        }
        picture.explore();
    }
}