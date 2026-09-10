package v7;

import android.graphics.Path;
public abstract class j8 {
    public static boolean a(i0.e[] eVarArr, i0.e[] eVarArr2) {
        if (eVarArr == null || eVarArr2 == null || eVarArr.length != eVarArr2.length) {
            return false;
        }
        for (int i10 = 0; i10 < eVarArr.length; i10++) {
            i0.e eVar = eVarArr[i10];
            char c10 = eVar.f10078a;
            i0.e eVar2 = eVarArr2[i10];
            if (c10 != eVar2.f10078a || eVar.f10079b.length != eVar2.f10079b.length) {
                return false;
            }
        }
        return true;
    }

    public static float[] b(float[] fArr, int i10) {
        if (i10 >= 0) {
            int length = fArr.length;
            if (length >= 0) {
                int min = Math.min(i10, length);
                float[] fArr2 = new float[i10];
                System.arraycopy(fArr, 0, fArr2, 0, min);
                return fArr2;
            }
            throw new ArrayIndexOutOfBoundsException();
        }
        throw new IllegalArgumentException();
    }

    public static i0.e[] c(java.lang.String r17) {
        throw new UnsupportedOperationException("Method not decompiled: v7.j8.c(java.lang.String):i0.e[]");
    }

    public static Path d(String str) {
        Path path = new Path();
        try {
            i0.e.b(c(str), path);
            return path;
        } catch (RuntimeException e) {
            throw new RuntimeException("Error in parsing ".concat(str), e);
        }
    }

    public static i0.e[] e(i0.e[] eVarArr) {
        i0.e[] eVarArr2 = new i0.e[eVarArr.length];
        for (int i10 = 0; i10 < eVarArr.length; i10++) {
            eVarArr2[i10] = new i0.e(eVarArr[i10]);
        }
        return eVarArr2;
    }
}
