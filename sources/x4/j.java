package x4;

import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;
public final class j extends k {
    public final Matrix f48844a;
    public final ArrayList f48845b;
    public float f48846c;
    public float d;
    public float f48847e;
    public float f48848f;
    public float f48849g;
    public float h;
    public float f48850i;
    public final Matrix f48851j;
    public String f48852k;

    public j() {
        this.f48844a = new Matrix();
        this.f48845b = new ArrayList();
        this.f48846c = 0.0f;
        this.d = 0.0f;
        this.f48847e = 0.0f;
        this.f48848f = 1.0f;
        this.f48849g = 1.0f;
        this.h = 0.0f;
        this.f48850i = 0.0f;
        this.f48851j = new Matrix();
        this.f48852k = null;
    }

    @Override
    public final boolean a() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f48845b;
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
            ArrayList arrayList = this.f48845b;
            if (i10 < arrayList.size()) {
                z10 |= ((k) arrayList.get(i10)).b(iArr);
                i10++;
            } else {
                return z10;
            }
        }
    }

    public final void c() {
        Matrix matrix = this.f48851j;
        matrix.reset();
        matrix.postTranslate(-this.d, -this.f48847e);
        matrix.postScale(this.f48848f, this.f48849g);
        matrix.postRotate(this.f48846c, 0.0f, 0.0f);
        matrix.postTranslate(this.h + this.d, this.f48850i + this.f48847e);
    }

    public String getGroupName() {
        return this.f48852k;
    }

    public Matrix getLocalMatrix() {
        return this.f48851j;
    }

    public float getPivotX() {
        return this.d;
    }

    public float getPivotY() {
        return this.f48847e;
    }

    public float getRotation() {
        return this.f48846c;
    }

    public float getScaleX() {
        return this.f48848f;
    }

    public float getScaleY() {
        return this.f48849g;
    }

    public float getTranslateX() {
        return this.h;
    }

    public float getTranslateY() {
        return this.f48850i;
    }

    public void setPivotX(float f7) {
        if (f7 != this.d) {
            this.d = f7;
            c();
        }
    }

    public void setPivotY(float f7) {
        if (f7 != this.f48847e) {
            this.f48847e = f7;
            c();
        }
    }

    public void setRotation(float f7) {
        if (f7 != this.f48846c) {
            this.f48846c = f7;
            c();
        }
    }

    public void setScaleX(float f7) {
        if (f7 != this.f48848f) {
            this.f48848f = f7;
            c();
        }
    }

    public void setScaleY(float f7) {
        if (f7 != this.f48849g) {
            this.f48849g = f7;
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
        if (f7 != this.f48850i) {
            this.f48850i = f7;
            c();
        }
    }

    public j(j jVar, a0.f fVar) {
        l lVar;
        this.f48844a = new Matrix();
        this.f48845b = new ArrayList();
        this.f48846c = 0.0f;
        this.d = 0.0f;
        this.f48847e = 0.0f;
        this.f48848f = 1.0f;
        this.f48849g = 1.0f;
        this.h = 0.0f;
        this.f48850i = 0.0f;
        Matrix matrix = new Matrix();
        this.f48851j = matrix;
        this.f48852k = null;
        this.f48846c = jVar.f48846c;
        this.d = jVar.d;
        this.f48847e = jVar.f48847e;
        this.f48848f = jVar.f48848f;
        this.f48849g = jVar.f48849g;
        this.h = jVar.h;
        this.f48850i = jVar.f48850i;
        String str = jVar.f48852k;
        this.f48852k = str;
        if (str != null) {
            fVar.put(str, this);
        }
        matrix.set(jVar.f48851j);
        ArrayList arrayList = jVar.f48845b;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            Object obj = arrayList.get(i10);
            if (obj instanceof j) {
                this.f48845b.add(new j((j) obj, fVar));
            } else {
                if (obj instanceof i) {
                    i iVar = (i) obj;
                    ?? lVar2 = new l(iVar);
                    lVar2.f48835e = 0.0f;
                    lVar2.f48837g = 1.0f;
                    lVar2.h = 1.0f;
                    lVar2.f48838i = 0.0f;
                    lVar2.f48839j = 1.0f;
                    lVar2.f48840k = 0.0f;
                    lVar2.f48841l = Paint.Cap.BUTT;
                    lVar2.f48842m = Paint.Join.MITER;
                    lVar2.f48843n = 4.0f;
                    lVar2.d = iVar.d;
                    lVar2.f48835e = iVar.f48835e;
                    lVar2.f48837g = iVar.f48837g;
                    lVar2.f48836f = iVar.f48836f;
                    lVar2.f48855c = iVar.f48855c;
                    lVar2.h = iVar.h;
                    lVar2.f48838i = iVar.f48838i;
                    lVar2.f48839j = iVar.f48839j;
                    lVar2.f48840k = iVar.f48840k;
                    lVar2.f48841l = iVar.f48841l;
                    lVar2.f48842m = iVar.f48842m;
                    lVar2.f48843n = iVar.f48843n;
                    lVar = lVar2;
                } else if (obj instanceof h) {
                    lVar = new l((h) obj);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.f48845b.add(lVar);
                Object obj2 = lVar.f48854b;
                if (obj2 != null) {
                    fVar.put(obj2, lVar);
                }
            }
        }
    }
}
