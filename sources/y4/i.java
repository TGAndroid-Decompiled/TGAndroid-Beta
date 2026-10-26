package y4;

import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;
public final class i extends j {
    public final Matrix f52003a;
    public final ArrayList f52004b;
    public float f52005c;
    public float d;
    public float e;
    public float f52006f;
    public float f52007g;
    public float h;
    public float f52008i;
    public final Matrix f52009j;
    public String f52010k;

    public i() {
        this.f52003a = new Matrix();
        this.f52004b = new ArrayList();
        this.f52005c = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f52006f = 1.0f;
        this.f52007g = 1.0f;
        this.h = 0.0f;
        this.f52008i = 0.0f;
        this.f52009j = new Matrix();
        this.f52010k = null;
    }

    @Override
    public final boolean a() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f52004b;
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
            ArrayList arrayList = this.f52004b;
            if (i10 < arrayList.size()) {
                z10 |= ((j) arrayList.get(i10)).b(iArr);
                i10++;
            } else {
                return z10;
            }
        }
    }

    public final void c() {
        Matrix matrix = this.f52009j;
        matrix.reset();
        matrix.postTranslate(-this.d, -this.e);
        matrix.postScale(this.f52006f, this.f52007g);
        matrix.postRotate(this.f52005c, 0.0f, 0.0f);
        matrix.postTranslate(this.h + this.d, this.f52008i + this.e);
    }

    public String getGroupName() {
        return this.f52010k;
    }

    public Matrix getLocalMatrix() {
        return this.f52009j;
    }

    public float getPivotX() {
        return this.d;
    }

    public float getPivotY() {
        return this.e;
    }

    public float getRotation() {
        return this.f52005c;
    }

    public float getScaleX() {
        return this.f52006f;
    }

    public float getScaleY() {
        return this.f52007g;
    }

    public float getTranslateX() {
        return this.h;
    }

    public float getTranslateY() {
        return this.f52008i;
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
        if (f7 != this.f52005c) {
            this.f52005c = f7;
            c();
        }
    }

    public void setScaleX(float f7) {
        if (f7 != this.f52006f) {
            this.f52006f = f7;
            c();
        }
    }

    public void setScaleY(float f7) {
        if (f7 != this.f52007g) {
            this.f52007g = f7;
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
        if (f7 != this.f52008i) {
            this.f52008i = f7;
            c();
        }
    }

    public i(i iVar, a0.f fVar) {
        k kVar;
        this.f52003a = new Matrix();
        this.f52004b = new ArrayList();
        this.f52005c = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f52006f = 1.0f;
        this.f52007g = 1.0f;
        this.h = 0.0f;
        this.f52008i = 0.0f;
        Matrix matrix = new Matrix();
        this.f52009j = matrix;
        this.f52010k = null;
        this.f52005c = iVar.f52005c;
        this.d = iVar.d;
        this.e = iVar.e;
        this.f52006f = iVar.f52006f;
        this.f52007g = iVar.f52007g;
        this.h = iVar.h;
        this.f52008i = iVar.f52008i;
        String str = iVar.f52010k;
        this.f52010k = str;
        if (str != null) {
            fVar.put(str, this);
        }
        matrix.set(iVar.f52009j);
        ArrayList arrayList = iVar.f52004b;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            Object obj = arrayList.get(i10);
            if (obj instanceof i) {
                this.f52004b.add(new i((i) obj, fVar));
            } else {
                if (obj instanceof h) {
                    h hVar = (h) obj;
                    ?? kVar2 = new k(hVar);
                    kVar2.e = 0.0f;
                    kVar2.f51996g = 1.0f;
                    kVar2.h = 1.0f;
                    kVar2.f51997i = 0.0f;
                    kVar2.f51998j = 1.0f;
                    kVar2.f51999k = 0.0f;
                    kVar2.f52000l = Paint.Cap.BUTT;
                    kVar2.f52001m = Paint.Join.MITER;
                    kVar2.f52002n = 4.0f;
                    kVar2.d = hVar.d;
                    kVar2.e = hVar.e;
                    kVar2.f51996g = hVar.f51996g;
                    kVar2.f51995f = hVar.f51995f;
                    kVar2.f52013c = hVar.f52013c;
                    kVar2.h = hVar.h;
                    kVar2.f51997i = hVar.f51997i;
                    kVar2.f51998j = hVar.f51998j;
                    kVar2.f51999k = hVar.f51999k;
                    kVar2.f52000l = hVar.f52000l;
                    kVar2.f52001m = hVar.f52001m;
                    kVar2.f52002n = hVar.f52002n;
                    kVar = kVar2;
                } else if (obj instanceof g) {
                    kVar = new k((g) obj);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.f52004b.add(kVar);
                Object obj2 = kVar.f52012b;
                if (obj2 != null) {
                    fVar.put(obj2, kVar);
                }
            }
        }
    }
}
