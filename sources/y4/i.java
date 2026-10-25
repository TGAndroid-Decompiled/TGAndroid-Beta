package y4;

import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;
public final class i extends j {
    public final Matrix f52000a;
    public final ArrayList f52001b;
    public float f52002c;
    public float d;
    public float e;
    public float f52003f;
    public float f52004g;
    public float h;
    public float f52005i;
    public final Matrix f52006j;
    public String f52007k;

    public i() {
        this.f52000a = new Matrix();
        this.f52001b = new ArrayList();
        this.f52002c = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f52003f = 1.0f;
        this.f52004g = 1.0f;
        this.h = 0.0f;
        this.f52005i = 0.0f;
        this.f52006j = new Matrix();
        this.f52007k = null;
    }

    @Override
    public final boolean a() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f52001b;
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
            ArrayList arrayList = this.f52001b;
            if (i10 < arrayList.size()) {
                z10 |= ((j) arrayList.get(i10)).b(iArr);
                i10++;
            } else {
                return z10;
            }
        }
    }

    public final void c() {
        Matrix matrix = this.f52006j;
        matrix.reset();
        matrix.postTranslate(-this.d, -this.e);
        matrix.postScale(this.f52003f, this.f52004g);
        matrix.postRotate(this.f52002c, 0.0f, 0.0f);
        matrix.postTranslate(this.h + this.d, this.f52005i + this.e);
    }

    public String getGroupName() {
        return this.f52007k;
    }

    public Matrix getLocalMatrix() {
        return this.f52006j;
    }

    public float getPivotX() {
        return this.d;
    }

    public float getPivotY() {
        return this.e;
    }

    public float getRotation() {
        return this.f52002c;
    }

    public float getScaleX() {
        return this.f52003f;
    }

    public float getScaleY() {
        return this.f52004g;
    }

    public float getTranslateX() {
        return this.h;
    }

    public float getTranslateY() {
        return this.f52005i;
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
        if (f7 != this.f52002c) {
            this.f52002c = f7;
            c();
        }
    }

    public void setScaleX(float f7) {
        if (f7 != this.f52003f) {
            this.f52003f = f7;
            c();
        }
    }

    public void setScaleY(float f7) {
        if (f7 != this.f52004g) {
            this.f52004g = f7;
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
        if (f7 != this.f52005i) {
            this.f52005i = f7;
            c();
        }
    }

    public i(i iVar, a0.f fVar) {
        k kVar;
        this.f52000a = new Matrix();
        this.f52001b = new ArrayList();
        this.f52002c = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f52003f = 1.0f;
        this.f52004g = 1.0f;
        this.h = 0.0f;
        this.f52005i = 0.0f;
        Matrix matrix = new Matrix();
        this.f52006j = matrix;
        this.f52007k = null;
        this.f52002c = iVar.f52002c;
        this.d = iVar.d;
        this.e = iVar.e;
        this.f52003f = iVar.f52003f;
        this.f52004g = iVar.f52004g;
        this.h = iVar.h;
        this.f52005i = iVar.f52005i;
        String str = iVar.f52007k;
        this.f52007k = str;
        if (str != null) {
            fVar.put(str, this);
        }
        matrix.set(iVar.f52006j);
        ArrayList arrayList = iVar.f52001b;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            Object obj = arrayList.get(i10);
            if (obj instanceof i) {
                this.f52001b.add(new i((i) obj, fVar));
            } else {
                if (obj instanceof h) {
                    h hVar = (h) obj;
                    ?? kVar2 = new k(hVar);
                    kVar2.e = 0.0f;
                    kVar2.f51993g = 1.0f;
                    kVar2.h = 1.0f;
                    kVar2.f51994i = 0.0f;
                    kVar2.f51995j = 1.0f;
                    kVar2.f51996k = 0.0f;
                    kVar2.f51997l = Paint.Cap.BUTT;
                    kVar2.f51998m = Paint.Join.MITER;
                    kVar2.f51999n = 4.0f;
                    kVar2.d = hVar.d;
                    kVar2.e = hVar.e;
                    kVar2.f51993g = hVar.f51993g;
                    kVar2.f51992f = hVar.f51992f;
                    kVar2.f52010c = hVar.f52010c;
                    kVar2.h = hVar.h;
                    kVar2.f51994i = hVar.f51994i;
                    kVar2.f51995j = hVar.f51995j;
                    kVar2.f51996k = hVar.f51996k;
                    kVar2.f51997l = hVar.f51997l;
                    kVar2.f51998m = hVar.f51998m;
                    kVar2.f51999n = hVar.f51999n;
                    kVar = kVar2;
                } else if (obj instanceof g) {
                    kVar = new k((g) obj);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.f52001b.add(kVar);
                Object obj2 = kVar.f52009b;
                if (obj2 != null) {
                    fVar.put(obj2, kVar);
                }
            }
        }
    }
}
