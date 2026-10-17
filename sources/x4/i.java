package x4;

import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;
public final class i extends j {
    public final Matrix f49266a;
    public final ArrayList f49267b;
    public float f49268c;
    public float d;
    public float e;
    public float f49269f;
    public float f49270g;
    public float h;
    public float f49271i;
    public final Matrix f49272j;
    public String f49273k;

    public i() {
        this.f49266a = new Matrix();
        this.f49267b = new ArrayList();
        this.f49268c = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f49269f = 1.0f;
        this.f49270g = 1.0f;
        this.h = 0.0f;
        this.f49271i = 0.0f;
        this.f49272j = new Matrix();
        this.f49273k = null;
    }

    @Override
    public final boolean a() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f49267b;
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
            ArrayList arrayList = this.f49267b;
            if (i10 < arrayList.size()) {
                z10 |= ((j) arrayList.get(i10)).b(iArr);
                i10++;
            } else {
                return z10;
            }
        }
    }

    public final void c() {
        Matrix matrix = this.f49272j;
        matrix.reset();
        matrix.postTranslate(-this.d, -this.e);
        matrix.postScale(this.f49269f, this.f49270g);
        matrix.postRotate(this.f49268c, 0.0f, 0.0f);
        matrix.postTranslate(this.h + this.d, this.f49271i + this.e);
    }

    public String getGroupName() {
        return this.f49273k;
    }

    public Matrix getLocalMatrix() {
        return this.f49272j;
    }

    public float getPivotX() {
        return this.d;
    }

    public float getPivotY() {
        return this.e;
    }

    public float getRotation() {
        return this.f49268c;
    }

    public float getScaleX() {
        return this.f49269f;
    }

    public float getScaleY() {
        return this.f49270g;
    }

    public float getTranslateX() {
        return this.h;
    }

    public float getTranslateY() {
        return this.f49271i;
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
        if (f7 != this.f49268c) {
            this.f49268c = f7;
            c();
        }
    }

    public void setScaleX(float f7) {
        if (f7 != this.f49269f) {
            this.f49269f = f7;
            c();
        }
    }

    public void setScaleY(float f7) {
        if (f7 != this.f49270g) {
            this.f49270g = f7;
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
        if (f7 != this.f49271i) {
            this.f49271i = f7;
            c();
        }
    }

    public i(i iVar, a0.f fVar) {
        k kVar;
        this.f49266a = new Matrix();
        this.f49267b = new ArrayList();
        this.f49268c = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f49269f = 1.0f;
        this.f49270g = 1.0f;
        this.h = 0.0f;
        this.f49271i = 0.0f;
        Matrix matrix = new Matrix();
        this.f49272j = matrix;
        this.f49273k = null;
        this.f49268c = iVar.f49268c;
        this.d = iVar.d;
        this.e = iVar.e;
        this.f49269f = iVar.f49269f;
        this.f49270g = iVar.f49270g;
        this.h = iVar.h;
        this.f49271i = iVar.f49271i;
        String str = iVar.f49273k;
        this.f49273k = str;
        if (str != null) {
            fVar.put(str, this);
        }
        matrix.set(iVar.f49272j);
        ArrayList arrayList = iVar.f49267b;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            Object obj = arrayList.get(i10);
            if (obj instanceof i) {
                this.f49267b.add(new i((i) obj, fVar));
            } else {
                if (obj instanceof h) {
                    h hVar = (h) obj;
                    ?? kVar2 = new k(hVar);
                    kVar2.e = 0.0f;
                    kVar2.f49259g = 1.0f;
                    kVar2.h = 1.0f;
                    kVar2.f49260i = 0.0f;
                    kVar2.f49261j = 1.0f;
                    kVar2.f49262k = 0.0f;
                    kVar2.f49263l = Paint.Cap.BUTT;
                    kVar2.f49264m = Paint.Join.MITER;
                    kVar2.f49265n = 4.0f;
                    kVar2.d = hVar.d;
                    kVar2.e = hVar.e;
                    kVar2.f49259g = hVar.f49259g;
                    kVar2.f49258f = hVar.f49258f;
                    kVar2.f49276c = hVar.f49276c;
                    kVar2.h = hVar.h;
                    kVar2.f49260i = hVar.f49260i;
                    kVar2.f49261j = hVar.f49261j;
                    kVar2.f49262k = hVar.f49262k;
                    kVar2.f49263l = hVar.f49263l;
                    kVar2.f49264m = hVar.f49264m;
                    kVar2.f49265n = hVar.f49265n;
                    kVar = kVar2;
                } else if (obj instanceof g) {
                    kVar = new k((g) obj);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.f49267b.add(kVar);
                Object obj2 = kVar.f49275b;
                if (obj2 != null) {
                    fVar.put(obj2, kVar);
                }
            }
        }
    }
}
