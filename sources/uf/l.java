package uf;

import android.graphics.Matrix;

public final class l {

    public float f48616a;

    public float f48617b;

    public float f48620f;
    public float h;

    public boolean f48623j;

    public final n f48625l;

    public float f48618c = 0.0f;
    public float d = 0.0f;

    public float f48619e = 1.0f;

    public final float f48621g = 0;

    public float f48622i = 0.0f;

    public final Matrix f48624k = new Matrix();

    public l(n nVar, int i10, int i11) {
        this.f48625l = nVar;
        this.f48616a = i10;
        this.f48617b = i11;
    }

    public static float a(l lVar) {
        return (lVar.h + lVar.f48621g) % 180.0f != 0.0f ? lVar.f48617b : lVar.f48616a;
    }

    public static float b(l lVar) {
        return (lVar.h + lVar.f48621g) % 180.0f != 0.0f ? lVar.f48616a : lVar.f48617b;
    }

    public static boolean c(l lVar) {
        return Math.abs(lVar.f48618c) > 1.0E-5f || Math.abs(lVar.d) > 1.0E-5f || Math.abs(lVar.f48619e - lVar.f48620f) > 1.0E-5f || Math.abs(lVar.f48622i) > 1.0E-5f || Math.abs(lVar.h) > 1.0E-5f;
    }

    public static void d(l lVar, float f10) {
        Matrix matrix = lVar.f48624k;
        matrix.reset();
        lVar.f48618c = 0.0f;
        lVar.d = 0.0f;
        lVar.f48622i = 0.0f;
        lVar.h = f10;
        lVar.h();
        float f11 = lVar.f48620f;
        lVar.f48619e = f11;
        matrix.postScale(f11, f11);
    }

    public static void e(l lVar, float f10) {
        lVar.f48622i += f10;
        lVar.f48624k.postRotate(f10, 0.0f, 0.0f);
    }

    public static void f(l lVar, float f10, float f11) {
        lVar.f48618c += f10;
        lVar.d += f11;
        lVar.f48624k.postTranslate(f10, f11);
    }

    public static void g(l lVar, float f10, float f11, float f12) {
        lVar.f48619e *= f10;
        lVar.f48624k.postScale(f10, f10, f11, f12);
    }

    public final void h() {
        float f10 = this.h;
        float f11 = this.f48621g;
        float f12 = (f10 + f11) % 180.0f != 0.0f ? this.f48617b : this.f48616a;
        float f13 = (f10 + f11) % 180.0f != 0.0f ? this.f48616a : this.f48617b;
        n nVar = this.f48625l;
        if (nVar.f48635x) {
            this.f48620f = nVar.f48626a.getCropWidth() / f12;
        } else {
            this.f48620f = Math.max(nVar.f48626a.getCropWidth() / f12, nVar.f48626a.getCropHeight() / f13);
        }
    }
}
