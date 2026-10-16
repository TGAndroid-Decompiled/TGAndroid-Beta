package x4;

import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;
public final class i extends j {
    public final Matrix f47857a;
    public final ArrayList f47858b;
    public float f47859c;
    public float d;
    public float e;
    public float f47860f;
    public float f47861g;
    public float h;
    public float f47862i;
    public final Matrix f47863j;
    public String f47864k;

    public i() {
        this.f47857a = new Matrix();
        this.f47858b = new ArrayList();
        this.f47859c = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f47860f = 1.0f;
        this.f47861g = 1.0f;
        this.h = 0.0f;
        this.f47862i = 0.0f;
        this.f47863j = new Matrix();
        this.f47864k = null;
    }

    @Override
    public final boolean a() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f47858b;
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
            ArrayList arrayList = this.f47858b;
            if (i10 < arrayList.size()) {
                z10 |= ((j) arrayList.get(i10)).b(iArr);
                i10++;
            } else {
                return z10;
            }
        }
    }

    public final void c() {
        Matrix matrix = this.f47863j;
        matrix.reset();
        matrix.postTranslate(-this.d, -this.e);
        matrix.postScale(this.f47860f, this.f47861g);
        matrix.postRotate(this.f47859c, 0.0f, 0.0f);
        matrix.postTranslate(this.h + this.d, this.f47862i + this.e);
    }

    public String getGroupName() {
        return this.f47864k;
    }

    public Matrix getLocalMatrix() {
        return this.f47863j;
    }

    public float getPivotX() {
        return this.d;
    }

    public float getPivotY() {
        return this.e;
    }

    public float getRotation() {
        return this.f47859c;
    }

    public float getScaleX() {
        return this.f47860f;
    }

    public float getScaleY() {
        return this.f47861g;
    }

    public float getTranslateX() {
        return this.h;
    }

    public float getTranslateY() {
        return this.f47862i;
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
        if (f7 != this.f47859c) {
            this.f47859c = f7;
            c();
        }
    }

    public void setScaleX(float f7) {
        if (f7 != this.f47860f) {
            this.f47860f = f7;
            c();
        }
    }

    public void setScaleY(float f7) {
        if (f7 != this.f47861g) {
            this.f47861g = f7;
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
        if (f7 != this.f47862i) {
            this.f47862i = f7;
            c();
        }
    }

    public i(i iVar, a0.f fVar) {
        k kVar;
        this.f47857a = new Matrix();
        this.f47858b = new ArrayList();
        this.f47859c = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f47860f = 1.0f;
        this.f47861g = 1.0f;
        this.h = 0.0f;
        this.f47862i = 0.0f;
        Matrix matrix = new Matrix();
        this.f47863j = matrix;
        this.f47864k = null;
        this.f47859c = iVar.f47859c;
        this.d = iVar.d;
        this.e = iVar.e;
        this.f47860f = iVar.f47860f;
        this.f47861g = iVar.f47861g;
        this.h = iVar.h;
        this.f47862i = iVar.f47862i;
        String str = iVar.f47864k;
        this.f47864k = str;
        if (str != null) {
            fVar.put(str, this);
        }
        matrix.set(iVar.f47863j);
        ArrayList arrayList = iVar.f47858b;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            Object obj = arrayList.get(i10);
            if (obj instanceof i) {
                this.f47858b.add(new i((i) obj, fVar));
            } else {
                if (obj instanceof h) {
                    h hVar = (h) obj;
                    ?? kVar2 = new k(hVar);
                    kVar2.e = 0.0f;
                    kVar2.f47850g = 1.0f;
                    kVar2.h = 1.0f;
                    kVar2.f47851i = 0.0f;
                    kVar2.f47852j = 1.0f;
                    kVar2.f47853k = 0.0f;
                    kVar2.f47854l = Paint.Cap.BUTT;
                    kVar2.f47855m = Paint.Join.MITER;
                    kVar2.f47856n = 4.0f;
                    kVar2.d = hVar.d;
                    kVar2.e = hVar.e;
                    kVar2.f47850g = hVar.f47850g;
                    kVar2.f47849f = hVar.f47849f;
                    kVar2.f47867c = hVar.f47867c;
                    kVar2.h = hVar.h;
                    kVar2.f47851i = hVar.f47851i;
                    kVar2.f47852j = hVar.f47852j;
                    kVar2.f47853k = hVar.f47853k;
                    kVar2.f47854l = hVar.f47854l;
                    kVar2.f47855m = hVar.f47855m;
                    kVar2.f47856n = hVar.f47856n;
                    kVar = kVar2;
                } else if (obj instanceof g) {
                    kVar = new k((g) obj);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.f47858b.add(kVar);
                Object obj2 = kVar.f47866b;
                if (obj2 != null) {
                    fVar.put(obj2, kVar);
                }
            }
        }
    }
}
