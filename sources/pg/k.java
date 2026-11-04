package pg;

import android.graphics.Matrix;
public final class k {
    public float f53501a;
    public float f53502b;
    public float f53505f;
    public float h;
    public boolean f53508j;
    public final m f53510l;
    public float f53503c = 0.0f;
    public float d = 0.0f;
    public float f53504e = 1.0f;
    public final float f53506g = 0;
    public float f53507i = 0.0f;
    public final Matrix f53509k = new Matrix();

    public k(m mVar, int i3, int i10) {
        this.f53510l = mVar;
        this.f53501a = i3;
        this.f53502b = i10;
    }

    public static float a(k kVar) {
        if ((kVar.h + kVar.f53506g) % 180.0f != 0.0f) {
            return kVar.f53502b;
        }
        return kVar.f53501a;
    }

    public static float b(k kVar) {
        if ((kVar.h + kVar.f53506g) % 180.0f != 0.0f) {
            return kVar.f53501a;
        }
        return kVar.f53502b;
    }

    public static boolean c(k kVar) {
        if (Math.abs(kVar.f53503c) <= 1.0E-5f && Math.abs(kVar.d) <= 1.0E-5f && Math.abs(kVar.f53504e - kVar.f53505f) <= 1.0E-5f && Math.abs(kVar.f53507i) <= 1.0E-5f && Math.abs(kVar.h) <= 1.0E-5f) {
            return false;
        }
        return true;
    }

    public static void d(k kVar, float f10) {
        Matrix matrix = kVar.f53509k;
        matrix.reset();
        kVar.f53503c = 0.0f;
        kVar.d = 0.0f;
        kVar.f53507i = 0.0f;
        kVar.h = f10;
        kVar.h();
        float f11 = kVar.f53505f;
        kVar.f53504e = f11;
        matrix.postScale(f11, f11);
    }

    public static void e(k kVar, float f10) {
        kVar.f53507i += f10;
        kVar.f53509k.postRotate(f10, 0.0f, 0.0f);
    }

    public static void f(k kVar, float f10, float f11) {
        kVar.f53503c += f10;
        kVar.d += f11;
        kVar.f53509k.postTranslate(f10, f11);
    }

    public static void g(k kVar, float f10, float f11, float f12) {
        kVar.f53504e *= f10;
        kVar.f53509k.postScale(f10, f10, f11, f12);
    }

    public final void h() {
        float f10;
        float f11;
        float f12 = this.h;
        float f13 = this.f53506g;
        if ((f12 + f13) % 180.0f != 0.0f) {
            f10 = this.f53502b;
        } else {
            f10 = this.f53501a;
        }
        if ((f12 + f13) % 180.0f != 0.0f) {
            f11 = this.f53501a;
        } else {
            f11 = this.f53502b;
        }
        m mVar = this.f53510l;
        if (mVar.f53521y) {
            this.f53505f = mVar.f53511a.getCropWidth() / f10;
        } else {
            this.f53505f = Math.max(mVar.f53511a.getCropWidth() / f10, mVar.f53511a.getCropHeight() / f11);
        }
    }
}
