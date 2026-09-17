package x4;

import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;
public final class j extends k {
    public final Matrix f48874a;
    public final ArrayList f48875b;
    public float f48876c;
    public float d;
    public float f48877e;
    public float f48878f;
    public float f48879g;
    public float h;
    public float f48880i;
    public final Matrix f48881j;
    public String f48882k;

    public j() {
        this.f48874a = new Matrix();
        this.f48875b = new ArrayList();
        this.f48876c = 0.0f;
        this.d = 0.0f;
        this.f48877e = 0.0f;
        this.f48878f = 1.0f;
        this.f48879g = 1.0f;
        this.h = 0.0f;
        this.f48880i = 0.0f;
        this.f48881j = new Matrix();
        this.f48882k = null;
    }

    @Override
    public final boolean a() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f48875b;
            if (i10 >= arrayList.size()) {
                return false;
            }
            if (((k) arrayList.get(i10)).a()) {
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
            ArrayList arrayList = this.f48875b;
            if (i10 < arrayList.size()) {
                z10 |= ((k) arrayList.get(i10)).b(iArr);
                i10++;
            } else {
                return z10;
            }
        }
    }

    public final void c() {
        Matrix matrix = this.f48881j;
        matrix.reset();
        matrix.postTranslate(-this.d, -this.f48877e);
        matrix.postScale(this.f48878f, this.f48879g);
        matrix.postRotate(this.f48876c, 0.0f, 0.0f);
        matrix.postTranslate(this.h + this.d, this.f48880i + this.f48877e);
    }

    public String getGroupName() {
        return this.f48882k;
    }

    public Matrix getLocalMatrix() {
        return this.f48881j;
    }

    public float getPivotX() {
        return this.d;
    }

    public float getPivotY() {
        return this.f48877e;
    }

    public float getRotation() {
        return this.f48876c;
    }

    public float getScaleX() {
        return this.f48878f;
    }

    public float getScaleY() {
        return this.f48879g;
    }

    public float getTranslateX() {
        return this.h;
    }

    public float getTranslateY() {
        return this.f48880i;
    }

    public void setPivotX(float f7) {
        if (f7 != this.d) {
            this.d = f7;
            c();
        }
    }

    public void setPivotY(float f7) {
        if (f7 != this.f48877e) {
            this.f48877e = f7;
            c();
        }
    }

    public void setRotation(float f7) {
        if (f7 != this.f48876c) {
            this.f48876c = f7;
            c();
        }
    }

    public void setScaleX(float f7) {
        if (f7 != this.f48878f) {
            this.f48878f = f7;
            c();
        }
    }

    public void setScaleY(float f7) {
        if (f7 != this.f48879g) {
            this.f48879g = f7;
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
        if (f7 != this.f48880i) {
            this.f48880i = f7;
            c();
        }
    }

    public j(j jVar, a0.f fVar) {
        l lVar;
        this.f48874a = new Matrix();
        this.f48875b = new ArrayList();
        this.f48876c = 0.0f;
        this.d = 0.0f;
        this.f48877e = 0.0f;
        this.f48878f = 1.0f;
        this.f48879g = 1.0f;
        this.h = 0.0f;
        this.f48880i = 0.0f;
        Matrix matrix = new Matrix();
        this.f48881j = matrix;
        this.f48882k = null;
        this.f48876c = jVar.f48876c;
        this.d = jVar.d;
        this.f48877e = jVar.f48877e;
        this.f48878f = jVar.f48878f;
        this.f48879g = jVar.f48879g;
        this.h = jVar.h;
        this.f48880i = jVar.f48880i;
        String str = jVar.f48882k;
        this.f48882k = str;
        if (str != null) {
            fVar.put(str, this);
        }
        matrix.set(jVar.f48881j);
        ArrayList arrayList = jVar.f48875b;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            Object obj = arrayList.get(i10);
            if (obj instanceof j) {
                this.f48875b.add(new j((j) obj, fVar));
            } else {
                if (obj instanceof i) {
                    i iVar = (i) obj;
                    ?? lVar2 = new l(iVar);
                    lVar2.f48865e = 0.0f;
                    lVar2.f48867g = 1.0f;
                    lVar2.h = 1.0f;
                    lVar2.f48868i = 0.0f;
                    lVar2.f48869j = 1.0f;
                    lVar2.f48870k = 0.0f;
                    lVar2.f48871l = Paint.Cap.BUTT;
                    lVar2.f48872m = Paint.Join.MITER;
                    lVar2.f48873n = 4.0f;
                    lVar2.d = iVar.d;
                    lVar2.f48865e = iVar.f48865e;
                    lVar2.f48867g = iVar.f48867g;
                    lVar2.f48866f = iVar.f48866f;
                    lVar2.f48885c = iVar.f48885c;
                    lVar2.h = iVar.h;
                    lVar2.f48868i = iVar.f48868i;
                    lVar2.f48869j = iVar.f48869j;
                    lVar2.f48870k = iVar.f48870k;
                    lVar2.f48871l = iVar.f48871l;
                    lVar2.f48872m = iVar.f48872m;
                    lVar2.f48873n = iVar.f48873n;
                    lVar = lVar2;
                } else if (obj instanceof h) {
                    lVar = new l((h) obj);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.f48875b.add(lVar);
                Object obj2 = lVar.f48884b;
                if (obj2 != null) {
                    fVar.put(obj2, lVar);
                }
            }
        }
    }
}
