package w7;

import android.graphics.Matrix;
public abstract class s6 {
    public static float[] a(Matrix matrix) {
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        return new float[]{fArr[0], fArr[1], 0.0f, 0.0f, fArr[3], fArr[4], 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, fArr[2], fArr[5], 0.0f, 1.0f};
    }

    public static float[] b(float f7, float f10) {
        float f11 = f7 - 0.0f;
        float f12 = f10 - 0.0f;
        return new float[]{2.0f / f11, 0.0f, 0.0f, 0.0f, 0.0f, 2.0f / f12, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, (-(f7 + 0.0f)) / f11, (-(f10 + 0.0f)) / f12, -0.0f, 1.0f};
    }

    public static float[] c(float[] fArr, float[] fArr2) {
        float f7 = fArr[0];
        float f10 = fArr2[0];
        float f11 = fArr[4];
        float f12 = fArr2[1];
        float f13 = fArr[8];
        float f14 = fArr2[2];
        float f15 = fArr[12];
        float f16 = fArr2[3];
        float f17 = f15 * f16;
        float f18 = f17 + (f13 * f14) + (f11 * f12) + (f7 * f10);
        float f19 = fArr[1];
        float f20 = fArr[5];
        float f21 = fArr[9];
        float f22 = fArr[13];
        float f23 = f22 * f16;
        float f24 = f23 + (f21 * f14) + (f20 * f12) + (f19 * f10);
        float f25 = fArr[2];
        float f26 = fArr[6];
        float f27 = fArr[10];
        float f28 = fArr[14];
        float f29 = f28 * f16;
        float f30 = f29 + (f27 * f14) + (f26 * f12) + (f25 * f10);
        float f31 = fArr[3];
        float f32 = fArr[7];
        float f33 = fArr[11];
        float f34 = fArr[15];
        float f35 = f16 * f34;
        float f36 = f35 + (f14 * f33) + (f12 * f32) + (f10 * f31);
        float f37 = fArr2[4];
        float f38 = fArr2[5];
        float f39 = fArr2[6];
        float f40 = fArr2[7];
        float f41 = (f15 * f40) + (f13 * f39) + (f11 * f38) + (f7 * f37);
        float f42 = (f22 * f40) + (f21 * f39) + (f20 * f38) + (f19 * f37);
        float f43 = (f28 * f40) + (f27 * f39) + (f26 * f38) + (f25 * f37);
        float f44 = f40 * f34;
        float f45 = f44 + (f39 * f33) + (f38 * f32) + (f37 * f31);
        float f46 = fArr2[8];
        float f47 = fArr2[9];
        float f48 = fArr2[10];
        float f49 = fArr2[11];
        float f50 = (f15 * f49) + (f13 * f48) + (f11 * f47) + (f7 * f46);
        float f51 = (f22 * f49) + (f21 * f48) + (f20 * f47) + (f19 * f46);
        float f52 = (f27 * f48) + (f26 * f47) + (f25 * f46);
        float f53 = f49 * f34;
        float f54 = f53 + (f48 * f33) + (f47 * f32) + (f46 * f31);
        float f55 = fArr2[12];
        float f56 = fArr2[13];
        float f57 = (f11 * f56) + (f7 * f55);
        float f58 = fArr2[14];
        float f59 = (f13 * f58) + f57;
        float f60 = fArr2[15];
        return new float[]{f18, f24, f30, f36, f41, f42, f43, f45, f50, f51, (f28 * f49) + f52, f54, (f15 * f60) + f59, (f22 * f60) + (f21 * f58) + (f20 * f56) + (f19 * f55), (f28 * f60) + (f27 * f58) + (f26 * f56) + (f25 * f55), (f34 * f60) + (f33 * f58) + (f32 * f56) + (f31 * f55)};
    }
}
