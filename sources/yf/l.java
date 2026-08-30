package yf;

import android.graphics.Matrix;
public final class l {
    public float f47237a;
    public float f47238b;
    public float f47240f;
    public float h;
    public boolean f47243j;
    public final n f47245l;
    public float f47239c = 0.0f;
    public float d = 0.0f;
    public float e = 1.0f;
    public final float f47241g = 0;
    public float f47242i = 0.0f;
    public final Matrix f47244k = new Matrix();

    public l(n nVar, int i10, int i11) {
        this.f47245l = nVar;
        this.f47237a = i10;
        this.f47238b = i11;
    }

    public static float a(l lVar) {
        if ((lVar.h + lVar.f47241g) % 180.0f != 0.0f) {
            return lVar.f47238b;
        }
        return lVar.f47237a;
    }

    public static float b(l lVar) {
        if ((lVar.h + lVar.f47241g) % 180.0f != 0.0f) {
            return lVar.f47237a;
        }
        return lVar.f47238b;
    }

    public static boolean c(l lVar) {
        if (Math.abs(lVar.f47239c) <= 1.0E-5f && Math.abs(lVar.d) <= 1.0E-5f && Math.abs(lVar.e - lVar.f47240f) <= 1.0E-5f && Math.abs(lVar.f47242i) <= 1.0E-5f && Math.abs(lVar.h) <= 1.0E-5f) {
            return false;
        }
        return true;
    }

    public static void d(l lVar, float f10) {
        Matrix matrix = lVar.f47244k;
        matrix.reset();
        lVar.f47239c = 0.0f;
        lVar.d = 0.0f;
        lVar.f47242i = 0.0f;
        lVar.h = f10;
        lVar.h();
        float f11 = lVar.f47240f;
        lVar.e = f11;
        matrix.postScale(f11, f11);
    }

    public static void e(l lVar, float f10) {
        lVar.f47242i += f10;
        lVar.f47244k.postRotate(f10, 0.0f, 0.0f);
    }

    public static void f(l lVar, float f10, float f11) {
        lVar.f47239c += f10;
        lVar.d += f11;
        lVar.f47244k.postTranslate(f10, f11);
    }

    public static void g(l lVar, float f10, float f11, float f12) {
        lVar.e *= f10;
        lVar.f47244k.postScale(f10, f10, f11, f12);
    }

    public final void h() {
        float f10;
        float f11;
        float f12 = this.h;
        float f13 = this.f47241g;
        if ((f12 + f13) % 180.0f != 0.0f) {
            f10 = this.f47238b;
        } else {
            f10 = this.f47237a;
        }
        if ((f12 + f13) % 180.0f != 0.0f) {
            f11 = this.f47237a;
        } else {
            f11 = this.f47238b;
        }
        n nVar = this.f47245l;
        if (nVar.f47254x) {
            this.f47240f = nVar.f47246a.getCropWidth() / f10;
        } else {
            this.f47240f = Math.max(nVar.f47246a.getCropWidth() / f10, nVar.f47246a.getCropHeight() / f11);
        }
    }
}
