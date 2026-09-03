package zf;

import android.graphics.Matrix;
public final class l {
    public float f51191a;
    public float f51192b;
    public float f51195f;
    public float h;
    public boolean f51198j;
    public final n f51200l;
    public float f51193c = 0.0f;
    public float d = 0.0f;
    public float f51194e = 1.0f;
    public final float f51196g = 0;
    public float f51197i = 0.0f;
    public final Matrix f51199k = new Matrix();

    public l(n nVar, int i10, int i11) {
        this.f51200l = nVar;
        this.f51191a = i10;
        this.f51192b = i11;
    }

    public static float a(l lVar) {
        if ((lVar.h + lVar.f51196g) % 180.0f != 0.0f) {
            return lVar.f51192b;
        }
        return lVar.f51191a;
    }

    public static float b(l lVar) {
        if ((lVar.h + lVar.f51196g) % 180.0f != 0.0f) {
            return lVar.f51191a;
        }
        return lVar.f51192b;
    }

    public static boolean c(l lVar) {
        if (Math.abs(lVar.f51193c) <= 1.0E-5f && Math.abs(lVar.d) <= 1.0E-5f && Math.abs(lVar.f51194e - lVar.f51195f) <= 1.0E-5f && Math.abs(lVar.f51197i) <= 1.0E-5f && Math.abs(lVar.h) <= 1.0E-5f) {
            return false;
        }
        return true;
    }

    public static void d(l lVar, float f10) {
        Matrix matrix = lVar.f51199k;
        matrix.reset();
        lVar.f51193c = 0.0f;
        lVar.d = 0.0f;
        lVar.f51197i = 0.0f;
        lVar.h = f10;
        lVar.h();
        float f11 = lVar.f51195f;
        lVar.f51194e = f11;
        matrix.postScale(f11, f11);
    }

    public static void e(l lVar, float f10) {
        lVar.f51197i += f10;
        lVar.f51199k.postRotate(f10, 0.0f, 0.0f);
    }

    public static void f(l lVar, float f10, float f11) {
        lVar.f51193c += f10;
        lVar.d += f11;
        lVar.f51199k.postTranslate(f10, f11);
    }

    public static void g(l lVar, float f10, float f11, float f12) {
        lVar.f51194e *= f10;
        lVar.f51199k.postScale(f10, f10, f11, f12);
    }

    public final void h() {
        float f10;
        float f11;
        float f12 = this.h;
        float f13 = this.f51196g;
        if ((f12 + f13) % 180.0f != 0.0f) {
            f10 = this.f51192b;
        } else {
            f10 = this.f51191a;
        }
        if ((f12 + f13) % 180.0f != 0.0f) {
            f11 = this.f51191a;
        } else {
            f11 = this.f51192b;
        }
        n nVar = this.f51200l;
        if (nVar.f51210x) {
            this.f51195f = nVar.f51201a.getCropWidth() / f10;
        } else {
            this.f51195f = Math.max(nVar.f51201a.getCropWidth() / f10, nVar.f51201a.getCropHeight() / f11);
        }
    }
}
