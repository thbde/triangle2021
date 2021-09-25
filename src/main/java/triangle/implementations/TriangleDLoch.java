package triangle.implementations;

import triangle.*;

public class TriangleDLoch implements Triangle 
{
    public TriangleResult getTriangleResultForLengths(int... lengths) 
    {
        if (lengths == null || lengths.length < 3 || lengths.length > 3)
        {
            return TriangleResult.UNKNOWN;
        }
        if (lengths[0] <= 0  || lengths[1] <= 0 || lengths[2] <= 0)
        {
            return TriangleResult.UNKNOWN;
        }

        if (lengths[0] + lengths[1] <= lengths[2] || lengths[0]+lengths[2] <= lengths[1] || lengths[1]+lengths[2] <= lengths[0])
        {
            return TriangleResult.UNKNOWN;
        }

        // Assertion for valid input ...
        assert lengths.length == 3;
        
        // Check for EQUILATERAL
        if (lengths[0] == lengths[1] && lengths[0] == lengths[2])
        {
            return TriangleResult.TRIANGLE_EQUILATERAL;
        }
        // Check for ISOSCELES
        if (lengths[0] == lengths[1] || lengths[0] == lengths[2] || lengths[2] == lengths[1])
        {
            return TriangleResult.TRIANGLE_ISOSCELES;
        }
        
        return TriangleResult.TRIANGLE_NOT_EQUAL;
    }
}