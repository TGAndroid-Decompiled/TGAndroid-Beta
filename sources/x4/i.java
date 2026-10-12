package x4;

import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;
public final class i extends j {
    public final Matrix f47858a;
    public final ArrayList f47859b;
    public float f47860c;
    public float d;
    public float e;
    public float f47861f;
    public float f47862g;
    public float h;
    public float f47863i;
    public final Matrix f47864j;
    public String f47865k;

    public i() {
        this.f47858a = new Matrix();
        this.f47859b = new ArrayList();
        this.f47860c = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f47861f = 1.0f;
        this.f47862g = 1.0f;
        this.h = 0.0f;
        this.f47863i = 0.0f;
        this.f47864j = new Matrix();
        this.f47865k = null;
    }

    @Override
    public final boolean a() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f47859b;
            if (i10 >= arrayList.size()) {
                return false;
            }
            if (((j) arrayList.get(i10)).a()) {
                return true;
            }
            i10++;
        }
    }

    @Override
    public final boolean b(int[] iArr) {
        int i10 = 0;
        boolean z10 = false;
        while (true) {
            ArrayList arrayList = this.f47859b;
            if (i10 < arrayList.size()) {
                z10 |= ((j) arrayList.get(i10)).b(iArr);
                i10++;
            } else {
                return z10;
            }
        }
    }

    public final void c() {
        Matrix matrix = this.f47864j;
        matrix.reset();
        matrix.postTranslate(-this.d, -this.e);
        matrix.postScale(this.f47861f, this.f47862g);
        matrix.postRotate(this.f47860c, 0.0f, 0.0f);
        matrix.postTranslate(this.h + this.d, this.f47863i + this.e);
    }

    public String getGroupName() {
        return this.f47865k;
    }

    public Matrix getLocalMatrix() {
        return this.f47864j;
    }

    public float getPivotX() {
        return this.d;
    }

    public float getPivotY() {
        return this.e;
    }

    public float getRotation() {
        return this.f47860c;
    }

    public float getScaleX() {
        return this.f47861f;
    }

    public float getScaleY() {
        return this.f47862g;
    }

    public float getTranslateX() {
        return this.h;
    }

    public float getTranslateY() {
        return this.f47863i;
    }

    public void setPivotX(float f7) {
        if (f7 != this.d) {
            this.d = f7;
            c();
        }
    }

    public void setPivotY(float f7) {
        if (f7 != this.e) {
            this.e = f7;
            c();
        }
    }

    public void setRotation(float f7) {
        if (f7 != this.f47860c) {
            this.f47860c = f7;
            c();
        }
    }

    public void setScaleX(float f7) {
        if (f7 != this.f47861f) {
            this.f47861f = f7;
            c();
        }
    }

    public void setScaleY(float f7) {
        if (f7 != this.f47862g) {
            this.f47862g = f7;
            c();
        }
    }

    public void setTranslateX(float f7) {
        if (f7 != this.h) {
            this.h = f7;
            c();
        }
    }

    public void setTranslateY(float f7) {
        if (f7 != this.f47863i) {
            this.f47863i = f7;
            c();
        }
    }

    public i(i iVar, a0.f fVar) {
        k kVar;
        this.f47858a = new Matrix();
        this.f47859b = new ArrayList();
        this.f47860c = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f47861f = 1.0f;
        this.f47862g = 1.0f;
        this.h = 0.0f;
        this.f47863i = 0.0f;
        Matrix matrix = new Matrix();
        this.f47864j = matrix;
        this.f47865k = null;
        this.f47860c = iVar.f47860c;
        this.d = iVar.d;
        this.e = iVar.e;
        this.f47861f = iVar.f47861f;
        this.f47862g = iVar.f47862g;
        this.h = iVar.h;
        this.f47863i = iVar.f47863i;
        String str = iVar.f47865k;
        this.f47865k = str;
        if (str != null) {
            fVar.put(str, this);
        }
        matrix.set(iVar.f47864j);
        ArrayList arrayList = iVar.f47859b;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            Object obj = arrayList.get(i10);
            if (obj instanceof i) {
                this.f47859b.add(new i((i) obj, fVar));
            } else {
                if (obj instanceof h) {
                    h hVar = (h) obj;
                    ?? kVar2 = new k(hVar);
                    kVar2.e = 0.0f;
                    kVar2.f47851g = 1.0f;
                    kVar2.h = 1.0f;
                    kVar2.f47852i = 0.0f;
                    kVar2.f47853j = 1.0f;
                    kVar2.f47854k = 0.0f;
                    kVar2.f47855l = Paint.Cap.BUTT;
                    kVar2.f47856m = Paint.Join.MITER;
                    kVar2.f47857n = 4.0f;
                    kVar2.d = hVar.d;
                    kVar2.e = hVar.e;
                    kVar2.f47851g = hVar.f47851g;
                    kVar2.f47850f = hVar.f47850f;
                    kVar2.f47868c = hVar.f47868c;
                    kVar2.h = hVar.h;
                    kVar2.f47852i = hVar.f47852i;
                    kVar2.f47853j = hVar.f47853j;
                    kVar2.f47854k = hVar.f47854k;
                    kVar2.f47855l = hVar.f47855l;
                    kVar2.f47856m = hVar.f47856m;
                    kVar2.f47857n = hVar.f47857n;
                    kVar = kVar2;
                } else if (obj instanceof g) {
                    kVar = new k((g) obj);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.f47859b.add(kVar);
                Object obj2 = kVar.f47867b;
                if (obj2 != null) {
                    fVar.put(obj2, kVar);
                }
            }
        }
    }
}
