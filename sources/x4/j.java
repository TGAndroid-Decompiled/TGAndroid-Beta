package x4;

import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;
public final class j extends k {
    public final Matrix f48845a;
    public final ArrayList f48846b;
    public float f48847c;
    public float d;
    public float f48848e;
    public float f48849f;
    public float f48850g;
    public float h;
    public float f48851i;
    public final Matrix f48852j;
    public String f48853k;

    public j() {
        this.f48845a = new Matrix();
        this.f48846b = new ArrayList();
        this.f48847c = 0.0f;
        this.d = 0.0f;
        this.f48848e = 0.0f;
        this.f48849f = 1.0f;
        this.f48850g = 1.0f;
        this.h = 0.0f;
        this.f48851i = 0.0f;
        this.f48852j = new Matrix();
        this.f48853k = null;
    }

    @Override
    public final boolean a() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f48846b;
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
            ArrayList arrayList = this.f48846b;
            if (i10 < arrayList.size()) {
                z10 |= ((k) arrayList.get(i10)).b(iArr);
                i10++;
            } else {
                return z10;
            }
        }
    }

    public final void c() {
        Matrix matrix = this.f48852j;
        matrix.reset();
        matrix.postTranslate(-this.d, -this.f48848e);
        matrix.postScale(this.f48849f, this.f48850g);
        matrix.postRotate(this.f48847c, 0.0f, 0.0f);
        matrix.postTranslate(this.h + this.d, this.f48851i + this.f48848e);
    }

    public String getGroupName() {
        return this.f48853k;
    }

    public Matrix getLocalMatrix() {
        return this.f48852j;
    }

    public float getPivotX() {
        return this.d;
    }

    public float getPivotY() {
        return this.f48848e;
    }

    public float getRotation() {
        return this.f48847c;
    }

    public float getScaleX() {
        return this.f48849f;
    }

    public float getScaleY() {
        return this.f48850g;
    }

    public float getTranslateX() {
        return this.h;
    }

    public float getTranslateY() {
        return this.f48851i;
    }

    public void setPivotX(float f7) {
        if (f7 != this.d) {
            this.d = f7;
            c();
        }
    }

    public void setPivotY(float f7) {
        if (f7 != this.f48848e) {
            this.f48848e = f7;
            c();
        }
    }

    public void setRotation(float f7) {
        if (f7 != this.f48847c) {
            this.f48847c = f7;
            c();
        }
    }

    public void setScaleX(float f7) {
        if (f7 != this.f48849f) {
            this.f48849f = f7;
            c();
        }
    }

    public void setScaleY(float f7) {
        if (f7 != this.f48850g) {
            this.f48850g = f7;
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
        if (f7 != this.f48851i) {
            this.f48851i = f7;
            c();
        }
    }

    public j(j jVar, a0.f fVar) {
        l lVar;
        this.f48845a = new Matrix();
        this.f48846b = new ArrayList();
        this.f48847c = 0.0f;
        this.d = 0.0f;
        this.f48848e = 0.0f;
        this.f48849f = 1.0f;
        this.f48850g = 1.0f;
        this.h = 0.0f;
        this.f48851i = 0.0f;
        Matrix matrix = new Matrix();
        this.f48852j = matrix;
        this.f48853k = null;
        this.f48847c = jVar.f48847c;
        this.d = jVar.d;
        this.f48848e = jVar.f48848e;
        this.f48849f = jVar.f48849f;
        this.f48850g = jVar.f48850g;
        this.h = jVar.h;
        this.f48851i = jVar.f48851i;
        String str = jVar.f48853k;
        this.f48853k = str;
        if (str != null) {
            fVar.put(str, this);
        }
        matrix.set(jVar.f48852j);
        ArrayList arrayList = jVar.f48846b;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            Object obj = arrayList.get(i10);
            if (obj instanceof j) {
                this.f48846b.add(new j((j) obj, fVar));
            } else {
                if (obj instanceof i) {
                    i iVar = (i) obj;
                    ?? lVar2 = new l(iVar);
                    lVar2.f48836e = 0.0f;
                    lVar2.f48838g = 1.0f;
                    lVar2.h = 1.0f;
                    lVar2.f48839i = 0.0f;
                    lVar2.f48840j = 1.0f;
                    lVar2.f48841k = 0.0f;
                    lVar2.f48842l = Paint.Cap.BUTT;
                    lVar2.f48843m = Paint.Join.MITER;
                    lVar2.f48844n = 4.0f;
                    lVar2.d = iVar.d;
                    lVar2.f48836e = iVar.f48836e;
                    lVar2.f48838g = iVar.f48838g;
                    lVar2.f48837f = iVar.f48837f;
                    lVar2.f48856c = iVar.f48856c;
                    lVar2.h = iVar.h;
                    lVar2.f48839i = iVar.f48839i;
                    lVar2.f48840j = iVar.f48840j;
                    lVar2.f48841k = iVar.f48841k;
                    lVar2.f48842l = iVar.f48842l;
                    lVar2.f48843m = iVar.f48843m;
                    lVar2.f48844n = iVar.f48844n;
                    lVar = lVar2;
                } else if (obj instanceof h) {
                    lVar = new l((h) obj);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.f48846b.add(lVar);
                Object obj2 = lVar.f48855b;
                if (obj2 != null) {
                    fVar.put(obj2, lVar);
                }
            }
        }
    }
}
