package yf;

import android.graphics.Matrix;
public final class l {
    public float f47301a;
    public float f47302b;
    public float f47304f;
    public float h;
    public boolean f47307j;
    public final n f47309l;
    public float f47303c = 0.0f;
    public float d = 0.0f;
    public float e = 1.0f;
    public final float f47305g = 0;
    public float f47306i = 0.0f;
    public final Matrix f47308k = new Matrix();

    public l(n nVar, int i10, int i11) {
        this.f47309l = nVar;
        this.f47301a = i10;
        this.f47302b = i11;
    }

    public static float a(l lVar) {
        if ((lVar.h + lVar.f47305g) % 180.0f != 0.0f) {
            return lVar.f47302b;
        }
        return lVar.f47301a;
    }

    public static float b(l lVar) {
        if ((lVar.h + lVar.f47305g) % 180.0f != 0.0f) {
            return lVar.f47301a;
        }
        return lVar.f47302b;
    }

    public static boolean c(l lVar) {
        if (Math.abs(lVar.f47303c) <= 1.0E-5f && Math.abs(lVar.d) <= 1.0E-5f && Math.abs(lVar.e - lVar.f47304f) <= 1.0E-5f && Math.abs(lVar.f47306i) <= 1.0E-5f && Math.abs(lVar.h) <= 1.0E-5f) {
            return false;
        }
        return true;
    }

    public static void d(l lVar, float f10) {
        Matrix matrix = lVar.f47308k;
        matrix.reset();
        lVar.f47303c = 0.0f;
        lVar.d = 0.0f;
        lVar.f47306i = 0.0f;
        lVar.h = f10;
        lVar.h();
        float f11 = lVar.f47304f;
        lVar.e = f11;
        matrix.postScale(f11, f11);
    }

    public static void e(l lVar, float f10) {
        lVar.f47306i += f10;
        lVar.f47308k.postRotate(f10, 0.0f, 0.0f);
    }

    public static void f(l lVar, float f10, float f11) {
        lVar.f47303c += f10;
        lVar.d += f11;
        lVar.f47308k.postTranslate(f10, f11);
    }

    public static void g(l lVar, float f10, float f11, float f12) {
        lVar.e *= f10;
        lVar.f47308k.postScale(f10, f10, f11, f12);
    }

    public final void h() {
        float f10;
        float f11;
        float f12 = this.h;
        float f13 = this.f47305g;
        if ((f12 + f13) % 180.0f != 0.0f) {
            f10 = this.f47302b;
        } else {
            f10 = this.f47301a;
        }
        if ((f12 + f13) % 180.0f != 0.0f) {
            f11 = this.f47301a;
        } else {
            f11 = this.f47302b;
        }
        n nVar = this.f47309l;
        if (nVar.f47318x) {
            this.f47304f = nVar.f47310a.getCropWidth() / f10;
        } else {
            this.f47304f = Math.max(nVar.f47310a.getCropWidth() / f10, nVar.f47310a.getCropHeight() / f11);
        }
    }
}
