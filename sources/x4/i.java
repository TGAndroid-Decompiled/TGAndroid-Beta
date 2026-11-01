package x4;

import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;
public final class i extends j {
    public final Matrix f53041a;
    public final ArrayList f53042b;
    public float f53043c;
    public float d;
    public float e;
    public float f53044f;
    public float f53045g;
    public float h;
    public float f53046i;
    public final Matrix f53047j;
    public String f53048k;

    public i() {
        this.f53041a = new Matrix();
        this.f53042b = new ArrayList();
        this.f53043c = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f53044f = 1.0f;
        this.f53045g = 1.0f;
        this.h = 0.0f;
        this.f53046i = 0.0f;
        this.f53047j = new Matrix();
        this.f53048k = null;
    }

    @Override
    public final boolean a() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f53042b;
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
            ArrayList arrayList = this.f53042b;
            if (i10 < arrayList.size()) {
                z10 |= ((j) arrayList.get(i10)).b(iArr);
                i10++;
            } else {
                return z10;
            }
        }
    }

    public final void c() {
        Matrix matrix = this.f53047j;
        matrix.reset();
        matrix.postTranslate(-this.d, -this.e);
        matrix.postScale(this.f53044f, this.f53045g);
        matrix.postRotate(this.f53043c, 0.0f, 0.0f);
        matrix.postTranslate(this.h + this.d, this.f53046i + this.e);
    }

    public String getGroupName() {
        return this.f53048k;
    }

    public Matrix getLocalMatrix() {
        return this.f53047j;
    }

    public float getPivotX() {
        return this.d;
    }

    public float getPivotY() {
        return this.e;
    }

    public float getRotation() {
        return this.f53043c;
    }

    public float getScaleX() {
        return this.f53044f;
    }

    public float getScaleY() {
        return this.f53045g;
    }

    public float getTranslateX() {
        return this.h;
    }

    public float getTranslateY() {
        return this.f53046i;
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
        if (f7 != this.f53043c) {
            this.f53043c = f7;
            c();
        }
    }

    public void setScaleX(float f7) {
        if (f7 != this.f53044f) {
            this.f53044f = f7;
            c();
        }
    }

    public void setScaleY(float f7) {
        if (f7 != this.f53045g) {
            this.f53045g = f7;
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
        if (f7 != this.f53046i) {
            this.f53046i = f7;
            c();
        }
    }

    public i(i iVar, a0.f fVar) {
        k kVar;
        this.f53041a = new Matrix();
        this.f53042b = new ArrayList();
        this.f53043c = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f53044f = 1.0f;
        this.f53045g = 1.0f;
        this.h = 0.0f;
        this.f53046i = 0.0f;
        Matrix matrix = new Matrix();
        this.f53047j = matrix;
        this.f53048k = null;
        this.f53043c = iVar.f53043c;
        this.d = iVar.d;
        this.e = iVar.e;
        this.f53044f = iVar.f53044f;
        this.f53045g = iVar.f53045g;
        this.h = iVar.h;
        this.f53046i = iVar.f53046i;
        String str = iVar.f53048k;
        this.f53048k = str;
        if (str != null) {
            fVar.put(str, this);
        }
        matrix.set(iVar.f53047j);
        ArrayList arrayList = iVar.f53042b;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            Object obj = arrayList.get(i10);
            if (obj instanceof i) {
                this.f53042b.add(new i((i) obj, fVar));
            } else {
                if (obj instanceof h) {
                    h hVar = (h) obj;
                    ?? kVar2 = new k(hVar);
                    kVar2.e = 0.0f;
                    kVar2.f53034g = 1.0f;
                    kVar2.h = 1.0f;
                    kVar2.f53035i = 0.0f;
                    kVar2.f53036j = 1.0f;
                    kVar2.f53037k = 0.0f;
                    kVar2.f53038l = Paint.Cap.BUTT;
                    kVar2.f53039m = Paint.Join.MITER;
                    kVar2.f53040n = 4.0f;
                    kVar2.d = hVar.d;
                    kVar2.e = hVar.e;
                    kVar2.f53034g = hVar.f53034g;
                    kVar2.f53033f = hVar.f53033f;
                    kVar2.f53051c = hVar.f53051c;
                    kVar2.h = hVar.h;
                    kVar2.f53035i = hVar.f53035i;
                    kVar2.f53036j = hVar.f53036j;
                    kVar2.f53037k = hVar.f53037k;
                    kVar2.f53038l = hVar.f53038l;
                    kVar2.f53039m = hVar.f53039m;
                    kVar2.f53040n = hVar.f53040n;
                    kVar = kVar2;
                } else if (obj instanceof g) {
                    kVar = new k((g) obj);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.f53042b.add(kVar);
                Object obj2 = kVar.f53050b;
                if (obj2 != null) {
                    fVar.put(obj2, kVar);
                }
            }
        }
    }
}
