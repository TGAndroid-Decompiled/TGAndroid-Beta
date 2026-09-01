package zf;

import android.graphics.Matrix;
public final class l {
    public float f51156a;
    public float f51157b;
    public float f51160f;
    public float h;
    public boolean f51163j;
    public final n f51165l;
    public float f51158c = 0.0f;
    public float d = 0.0f;
    public float f51159e = 1.0f;
    public final float f51161g = 0;
    public float f51162i = 0.0f;
    public final Matrix f51164k = new Matrix();

    public l(n nVar, int i10, int i11) {
        this.f51165l = nVar;
        this.f51156a = i10;
        this.f51157b = i11;
    }

    public static float a(l lVar) {
        if ((lVar.h + lVar.f51161g) % 180.0f != 0.0f) {
            return lVar.f51157b;
        }
        return lVar.f51156a;
    }

    public static float b(l lVar) {
        if ((lVar.h + lVar.f51161g) % 180.0f != 0.0f) {
            return lVar.f51156a;
        }
        return lVar.f51157b;
    }

    public static boolean c(l lVar) {
        if (Math.abs(lVar.f51158c) <= 1.0E-5f && Math.abs(lVar.d) <= 1.0E-5f && Math.abs(lVar.f51159e - lVar.f51160f) <= 1.0E-5f && Math.abs(lVar.f51162i) <= 1.0E-5f && Math.abs(lVar.h) <= 1.0E-5f) {
            return false;
        }
        return true;
    }

    public static void d(l lVar, float f10) {
        Matrix matrix = lVar.f51164k;
        matrix.reset();
        lVar.f51158c = 0.0f;
        lVar.d = 0.0f;
        lVar.f51162i = 0.0f;
        lVar.h = f10;
        lVar.h();
        float f11 = lVar.f51160f;
        lVar.f51159e = f11;
        matrix.postScale(f11, f11);
    }

    public static void e(l lVar, float f10) {
        lVar.f51162i += f10;
        lVar.f51164k.postRotate(f10, 0.0f, 0.0f);
    }

    public static void f(l lVar, float f10, float f11) {
        lVar.f51158c += f10;
        lVar.d += f11;
        lVar.f51164k.postTranslate(f10, f11);
    }

    public static void g(l lVar, float f10, float f11, float f12) {
        lVar.f51159e *= f10;
        lVar.f51164k.postScale(f10, f10, f11, f12);
    }

    public final void h() {
        float f10;
        float f11;
        float f12 = this.h;
        float f13 = this.f51161g;
        if ((f12 + f13) % 180.0f != 0.0f) {
            f10 = this.f51157b;
        } else {
            f10 = this.f51156a;
        }
        if ((f12 + f13) % 180.0f != 0.0f) {
            f11 = this.f51156a;
        } else {
            f11 = this.f51157b;
        }
        n nVar = this.f51165l;
        if (nVar.f51175x) {
            this.f51160f = nVar.f51166a.getCropWidth() / f10;
        } else {
            this.f51160f = Math.max(nVar.f51166a.getCropWidth() / f10, nVar.f51166a.getCropHeight() / f11);
        }
    }
}
