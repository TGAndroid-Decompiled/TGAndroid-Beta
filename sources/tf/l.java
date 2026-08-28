package tf;

import android.graphics.Matrix;
public final class l {
    public float f47894a;
    public float f47895b;
    public float f47898f;
    public float h;
    public boolean f47901j;
    public final n f47903l;
    public float f47896c = 0.0f;
    public float d = 0.0f;
    public float f47897e = 1.0f;
    public final float f47899g = 0;
    public float f47900i = 0.0f;
    public final Matrix f47902k = new Matrix();

    public l(n nVar, int i9, int i10) {
        this.f47903l = nVar;
        this.f47894a = i9;
        this.f47895b = i10;
    }

    public static float a(l lVar) {
        if ((lVar.h + lVar.f47899g) % 180.0f != 0.0f) {
            return lVar.f47895b;
        }
        return lVar.f47894a;
    }

    public static float b(l lVar) {
        if ((lVar.h + lVar.f47899g) % 180.0f != 0.0f) {
            return lVar.f47894a;
        }
        return lVar.f47895b;
    }

    public static boolean c(l lVar) {
        if (Math.abs(lVar.f47896c) <= 1.0E-5f && Math.abs(lVar.d) <= 1.0E-5f && Math.abs(lVar.f47897e - lVar.f47898f) <= 1.0E-5f && Math.abs(lVar.f47900i) <= 1.0E-5f && Math.abs(lVar.h) <= 1.0E-5f) {
            return false;
        }
        return true;
    }

    public static void d(l lVar, float f10) {
        Matrix matrix = lVar.f47902k;
        matrix.reset();
        lVar.f47896c = 0.0f;
        lVar.d = 0.0f;
        lVar.f47900i = 0.0f;
        lVar.h = f10;
        lVar.h();
        float f11 = lVar.f47898f;
        lVar.f47897e = f11;
        matrix.postScale(f11, f11);
    }

    public static void e(l lVar, float f10) {
        lVar.f47900i += f10;
        lVar.f47902k.postRotate(f10, 0.0f, 0.0f);
    }

    public static void f(l lVar, float f10, float f11) {
        lVar.f47896c += f10;
        lVar.d += f11;
        lVar.f47902k.postTranslate(f10, f11);
    }

    public static void g(l lVar, float f10, float f11, float f12) {
        lVar.f47897e *= f10;
        lVar.f47902k.postScale(f10, f10, f11, f12);
    }

    public final void h() {
        float f10;
        float f11;
        float f12 = this.h;
        float f13 = this.f47899g;
        if ((f12 + f13) % 180.0f != 0.0f) {
            f10 = this.f47895b;
        } else {
            f10 = this.f47894a;
        }
        if ((f12 + f13) % 180.0f != 0.0f) {
            f11 = this.f47894a;
        } else {
            f11 = this.f47895b;
        }
        n nVar = this.f47903l;
        if (nVar.f47913x) {
            this.f47898f = nVar.f47904a.getCropWidth() / f10;
        } else {
            this.f47898f = Math.max(nVar.f47904a.getCropWidth() / f10, nVar.f47904a.getCropHeight() / f11);
        }
    }
}
