package y4;

import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;
public final class i extends j {
    public final Matrix f52061a;
    public final ArrayList f52062b;
    public float f52063c;
    public float d;
    public float e;
    public float f52064f;
    public float f52065g;
    public float h;
    public float f52066i;
    public final Matrix f52067j;
    public String f52068k;

    public i() {
        this.f52061a = new Matrix();
        this.f52062b = new ArrayList();
        this.f52063c = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f52064f = 1.0f;
        this.f52065g = 1.0f;
        this.h = 0.0f;
        this.f52066i = 0.0f;
        this.f52067j = new Matrix();
        this.f52068k = null;
    }

    @Override
    public final boolean a() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f52062b;
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
            ArrayList arrayList = this.f52062b;
            if (i10 < arrayList.size()) {
                z10 |= ((j) arrayList.get(i10)).b(iArr);
                i10++;
            } else {
                return z10;
            }
        }
    }

    public final void c() {
        Matrix matrix = this.f52067j;
        matrix.reset();
        matrix.postTranslate(-this.d, -this.e);
        matrix.postScale(this.f52064f, this.f52065g);
        matrix.postRotate(this.f52063c, 0.0f, 0.0f);
        matrix.postTranslate(this.h + this.d, this.f52066i + this.e);
    }

    public String getGroupName() {
        return this.f52068k;
    }

    public Matrix getLocalMatrix() {
        return this.f52067j;
    }

    public float getPivotX() {
        return this.d;
    }

    public float getPivotY() {
        return this.e;
    }

    public float getRotation() {
        return this.f52063c;
    }

    public float getScaleX() {
        return this.f52064f;
    }

    public float getScaleY() {
        return this.f52065g;
    }

    public float getTranslateX() {
        return this.h;
    }

    public float getTranslateY() {
        return this.f52066i;
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
        if (f7 != this.f52063c) {
            this.f52063c = f7;
            c();
        }
    }

    public void setScaleX(float f7) {
        if (f7 != this.f52064f) {
            this.f52064f = f7;
            c();
        }
    }

    public void setScaleY(float f7) {
        if (f7 != this.f52065g) {
            this.f52065g = f7;
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
        if (f7 != this.f52066i) {
            this.f52066i = f7;
            c();
        }
    }

    public i(i iVar, a0.f fVar) {
        k kVar;
        this.f52061a = new Matrix();
        this.f52062b = new ArrayList();
        this.f52063c = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f52064f = 1.0f;
        this.f52065g = 1.0f;
        this.h = 0.0f;
        this.f52066i = 0.0f;
        Matrix matrix = new Matrix();
        this.f52067j = matrix;
        this.f52068k = null;
        this.f52063c = iVar.f52063c;
        this.d = iVar.d;
        this.e = iVar.e;
        this.f52064f = iVar.f52064f;
        this.f52065g = iVar.f52065g;
        this.h = iVar.h;
        this.f52066i = iVar.f52066i;
        String str = iVar.f52068k;
        this.f52068k = str;
        if (str != null) {
            fVar.put(str, this);
        }
        matrix.set(iVar.f52067j);
        ArrayList arrayList = iVar.f52062b;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            Object obj = arrayList.get(i10);
            if (obj instanceof i) {
                this.f52062b.add(new i((i) obj, fVar));
            } else {
                if (obj instanceof h) {
                    h hVar = (h) obj;
                    ?? kVar2 = new k(hVar);
                    kVar2.e = 0.0f;
                    kVar2.f52054g = 1.0f;
                    kVar2.h = 1.0f;
                    kVar2.f52055i = 0.0f;
                    kVar2.f52056j = 1.0f;
                    kVar2.f52057k = 0.0f;
                    kVar2.f52058l = Paint.Cap.BUTT;
                    kVar2.f52059m = Paint.Join.MITER;
                    kVar2.f52060n = 4.0f;
                    kVar2.d = hVar.d;
                    kVar2.e = hVar.e;
                    kVar2.f52054g = hVar.f52054g;
                    kVar2.f52053f = hVar.f52053f;
                    kVar2.f52071c = hVar.f52071c;
                    kVar2.h = hVar.h;
                    kVar2.f52055i = hVar.f52055i;
                    kVar2.f52056j = hVar.f52056j;
                    kVar2.f52057k = hVar.f52057k;
                    kVar2.f52058l = hVar.f52058l;
                    kVar2.f52059m = hVar.f52059m;
                    kVar2.f52060n = hVar.f52060n;
                    kVar = kVar2;
                } else if (obj instanceof g) {
                    kVar = new k((g) obj);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.f52062b.add(kVar);
                Object obj2 = kVar.f52070b;
                if (obj2 != null) {
                    fVar.put(obj2, kVar);
                }
            }
        }
    }
}
