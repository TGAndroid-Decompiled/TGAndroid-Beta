package wf;

import android.graphics.Matrix;
public final class l {
    public float f49943a;
    public float f49944b;
    public float f49947f;
    public float h;
    public boolean f49950j;
    public final n f49952l;
    public float f49945c = 0.0f;
    public float d = 0.0f;
    public float f49946e = 1.0f;
    public final float f49948g = 0;
    public float f49949i = 0.0f;
    public final Matrix f49951k = new Matrix();

    public l(n nVar, int i10, int i11) {
        this.f49952l = nVar;
        this.f49943a = i10;
        this.f49944b = i11;
    }

    public static float a(l lVar) {
        if ((lVar.h + lVar.f49948g) % 180.0f != 0.0f) {
            return lVar.f49944b;
        }
        return lVar.f49943a;
    }

    public static float b(l lVar) {
        if ((lVar.h + lVar.f49948g) % 180.0f != 0.0f) {
            return lVar.f49943a;
        }
        return lVar.f49944b;
    }

    public static boolean c(l lVar) {
        if (Math.abs(lVar.f49945c) <= 1.0E-5f && Math.abs(lVar.d) <= 1.0E-5f && Math.abs(lVar.f49946e - lVar.f49947f) <= 1.0E-5f && Math.abs(lVar.f49949i) <= 1.0E-5f && Math.abs(lVar.h) <= 1.0E-5f) {
            return false;
        }
        return true;
    }

    public static void d(l lVar, float f9) {
        Matrix matrix = lVar.f49951k;
        matrix.reset();
        lVar.f49945c = 0.0f;
        lVar.d = 0.0f;
        lVar.f49949i = 0.0f;
        lVar.h = f9;
        lVar.h();
        float f10 = lVar.f49947f;
        lVar.f49946e = f10;
        matrix.postScale(f10, f10);
    }

    public static void e(l lVar, float f9) {
        lVar.f49949i += f9;
        lVar.f49951k.postRotate(f9, 0.0f, 0.0f);
    }

    public static void f(l lVar, float f9, float f10) {
        lVar.f49945c += f9;
        lVar.d += f10;
        lVar.f49951k.postTranslate(f9, f10);
    }

    public static void g(l lVar, float f9, float f10, float f11) {
        lVar.f49946e *= f9;
        lVar.f49951k.postScale(f9, f9, f10, f11);
    }

    public final void h() {
        float f9;
        float f10;
        float f11 = this.h;
        float f12 = this.f49948g;
        if ((f11 + f12) % 180.0f != 0.0f) {
            f9 = this.f49944b;
        } else {
            f9 = this.f49943a;
        }
        if ((f11 + f12) % 180.0f != 0.0f) {
            f10 = this.f49943a;
        } else {
            f10 = this.f49944b;
        }
        n nVar = this.f49952l;
        if (nVar.f49962x) {
            this.f49947f = nVar.f49953a.getCropWidth() / f9;
        } else {
            this.f49947f = Math.max(nVar.f49953a.getCropWidth() / f9, nVar.f49953a.getCropHeight() / f10);
        }
    }
}
