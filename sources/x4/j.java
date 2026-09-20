package x4;

import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;
public final class j extends k {
    public final Matrix f45582a;
    public final ArrayList f45583b;
    public float f45584c;
    public float d;
    public float e;
    public float f45585f;
    public float f45586g;
    public float h;
    public float f45587i;
    public final Matrix f45588j;
    public String f45589k;

    public j() {
        this.f45582a = new Matrix();
        this.f45583b = new ArrayList();
        this.f45584c = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f45585f = 1.0f;
        this.f45586g = 1.0f;
        this.h = 0.0f;
        this.f45587i = 0.0f;
        this.f45588j = new Matrix();
        this.f45589k = null;
    }

    @Override
    public final boolean a() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f45583b;
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
            ArrayList arrayList = this.f45583b;
            if (i10 < arrayList.size()) {
                z10 |= ((k) arrayList.get(i10)).b(iArr);
                i10++;
            } else {
                return z10;
            }
        }
    }

    public final void c() {
        Matrix matrix = this.f45588j;
        matrix.reset();
        matrix.postTranslate(-this.d, -this.e);
        matrix.postScale(this.f45585f, this.f45586g);
        matrix.postRotate(this.f45584c, 0.0f, 0.0f);
        matrix.postTranslate(this.h + this.d, this.f45587i + this.e);
    }

    public String getGroupName() {
        return this.f45589k;
    }

    public Matrix getLocalMatrix() {
        return this.f45588j;
    }

    public float getPivotX() {
        return this.d;
    }

    public float getPivotY() {
        return this.e;
    }

    public float getRotation() {
        return this.f45584c;
    }

    public float getScaleX() {
        return this.f45585f;
    }

    public float getScaleY() {
        return this.f45586g;
    }

    public float getTranslateX() {
        return this.h;
    }

    public float getTranslateY() {
        return this.f45587i;
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
        if (f7 != this.f45584c) {
            this.f45584c = f7;
            c();
        }
    }

    public void setScaleX(float f7) {
        if (f7 != this.f45585f) {
            this.f45585f = f7;
            c();
        }
    }

    public void setScaleY(float f7) {
        if (f7 != this.f45586g) {
            this.f45586g = f7;
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
        if (f7 != this.f45587i) {
            this.f45587i = f7;
            c();
        }
    }

    public j(j jVar, a0.f fVar) {
        l lVar;
        this.f45582a = new Matrix();
        this.f45583b = new ArrayList();
        this.f45584c = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f45585f = 1.0f;
        this.f45586g = 1.0f;
        this.h = 0.0f;
        this.f45587i = 0.0f;
        Matrix matrix = new Matrix();
        this.f45588j = matrix;
        this.f45589k = null;
        this.f45584c = jVar.f45584c;
        this.d = jVar.d;
        this.e = jVar.e;
        this.f45585f = jVar.f45585f;
        this.f45586g = jVar.f45586g;
        this.h = jVar.h;
        this.f45587i = jVar.f45587i;
        String str = jVar.f45589k;
        this.f45589k = str;
        if (str != null) {
            fVar.put(str, this);
        }
        matrix.set(jVar.f45588j);
        ArrayList arrayList = jVar.f45583b;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            Object obj = arrayList.get(i10);
            if (obj instanceof j) {
                this.f45583b.add(new j((j) obj, fVar));
            } else {
                if (obj instanceof i) {
                    i iVar = (i) obj;
                    ?? lVar2 = new l(iVar);
                    lVar2.e = 0.0f;
                    lVar2.f45575g = 1.0f;
                    lVar2.h = 1.0f;
                    lVar2.f45576i = 0.0f;
                    lVar2.f45577j = 1.0f;
                    lVar2.f45578k = 0.0f;
                    lVar2.f45579l = Paint.Cap.BUTT;
                    lVar2.f45580m = Paint.Join.MITER;
                    lVar2.f45581n = 4.0f;
                    lVar2.d = iVar.d;
                    lVar2.e = iVar.e;
                    lVar2.f45575g = iVar.f45575g;
                    lVar2.f45574f = iVar.f45574f;
                    lVar2.f45592c = iVar.f45592c;
                    lVar2.h = iVar.h;
                    lVar2.f45576i = iVar.f45576i;
                    lVar2.f45577j = iVar.f45577j;
                    lVar2.f45578k = iVar.f45578k;
                    lVar2.f45579l = iVar.f45579l;
                    lVar2.f45580m = iVar.f45580m;
                    lVar2.f45581n = iVar.f45581n;
                    lVar = lVar2;
                } else if (obj instanceof h) {
                    lVar = new l((h) obj);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.f45583b.add(lVar);
                Object obj2 = lVar.f45591b;
                if (obj2 != null) {
                    fVar.put(obj2, lVar);
                }
            }
        }
    }
}
