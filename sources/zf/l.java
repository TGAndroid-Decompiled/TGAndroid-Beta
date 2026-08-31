package zf;

import android.graphics.Matrix;
public final class l {
    public float f51155a;
    public float f51156b;
    public float f51159f;
    public float h;
    public boolean f51162j;
    public final n f51164l;
    public float f51157c = 0.0f;
    public float d = 0.0f;
    public float f51158e = 1.0f;
    public final float f51160g = 0;
    public float f51161i = 0.0f;
    public final Matrix f51163k = new Matrix();

    public l(n nVar, int i10, int i11) {
        this.f51164l = nVar;
        this.f51155a = i10;
        this.f51156b = i11;
    }

    public static float a(l lVar) {
        if ((lVar.h + lVar.f51160g) % 180.0f != 0.0f) {
            return lVar.f51156b;
        }
        return lVar.f51155a;
    }

    public static float b(l lVar) {
        if ((lVar.h + lVar.f51160g) % 180.0f != 0.0f) {
            return lVar.f51155a;
        }
        return lVar.f51156b;
    }

    public static boolean c(l lVar) {
        if (Math.abs(lVar.f51157c) <= 1.0E-5f && Math.abs(lVar.d) <= 1.0E-5f && Math.abs(lVar.f51158e - lVar.f51159f) <= 1.0E-5f && Math.abs(lVar.f51161i) <= 1.0E-5f && Math.abs(lVar.h) <= 1.0E-5f) {
            return false;
        }
        return true;
    }

    public static void d(l lVar, float f10) {
        Matrix matrix = lVar.f51163k;
        matrix.reset();
        lVar.f51157c = 0.0f;
        lVar.d = 0.0f;
        lVar.f51161i = 0.0f;
        lVar.h = f10;
        lVar.h();
        float f11 = lVar.f51159f;
        lVar.f51158e = f11;
        matrix.postScale(f11, f11);
    }

    public static void e(l lVar, float f10) {
        lVar.f51161i += f10;
        lVar.f51163k.postRotate(f10, 0.0f, 0.0f);
    }

    public static void f(l lVar, float f10, float f11) {
        lVar.f51157c += f10;
        lVar.d += f11;
        lVar.f51163k.postTranslate(f10, f11);
    }

    public static void g(l lVar, float f10, float f11, float f12) {
        lVar.f51158e *= f10;
        lVar.f51163k.postScale(f10, f10, f11, f12);
    }

    public final void h() {
        float f10;
        float f11;
        float f12 = this.h;
        float f13 = this.f51160g;
        if ((f12 + f13) % 180.0f != 0.0f) {
            f10 = this.f51156b;
        } else {
            f10 = this.f51155a;
        }
        if ((f12 + f13) % 180.0f != 0.0f) {
            f11 = this.f51155a;
        } else {
            f11 = this.f51156b;
        }
        n nVar = this.f51164l;
        if (nVar.f51174x) {
            this.f51159f = nVar.f51165a.getCropWidth() / f10;
        } else {
            this.f51159f = Math.max(nVar.f51165a.getCropWidth() / f10, nVar.f51165a.getCropHeight() / f11);
        }
    }
}
