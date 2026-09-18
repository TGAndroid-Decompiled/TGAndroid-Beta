package x4;

import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;
public final class j extends k {
    public final Matrix f45314a;
    public final ArrayList f45315b;
    public float f45316c;
    public float d;
    public float e;
    public float f45317f;
    public float f45318g;
    public float h;
    public float f45319i;
    public final Matrix f45320j;
    public String f45321k;

    public j() {
        this.f45314a = new Matrix();
        this.f45315b = new ArrayList();
        this.f45316c = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f45317f = 1.0f;
        this.f45318g = 1.0f;
        this.h = 0.0f;
        this.f45319i = 0.0f;
        this.f45320j = new Matrix();
        this.f45321k = null;
    }

    @Override
    public final boolean a() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f45315b;
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
            ArrayList arrayList = this.f45315b;
            if (i10 < arrayList.size()) {
                z10 |= ((k) arrayList.get(i10)).b(iArr);
                i10++;
            } else {
                return z10;
            }
        }
    }

    public final void c() {
        Matrix matrix = this.f45320j;
        matrix.reset();
        matrix.postTranslate(-this.d, -this.e);
        matrix.postScale(this.f45317f, this.f45318g);
        matrix.postRotate(this.f45316c, 0.0f, 0.0f);
        matrix.postTranslate(this.h + this.d, this.f45319i + this.e);
    }

    public String getGroupName() {
        return this.f45321k;
    }

    public Matrix getLocalMatrix() {
        return this.f45320j;
    }

    public float getPivotX() {
        return this.d;
    }

    public float getPivotY() {
        return this.e;
    }

    public float getRotation() {
        return this.f45316c;
    }

    public float getScaleX() {
        return this.f45317f;
    }

    public float getScaleY() {
        return this.f45318g;
    }

    public float getTranslateX() {
        return this.h;
    }

    public float getTranslateY() {
        return this.f45319i;
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
        if (f7 != this.f45316c) {
            this.f45316c = f7;
            c();
        }
    }

    public void setScaleX(float f7) {
        if (f7 != this.f45317f) {
            this.f45317f = f7;
            c();
        }
    }

    public void setScaleY(float f7) {
        if (f7 != this.f45318g) {
            this.f45318g = f7;
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
        if (f7 != this.f45319i) {
            this.f45319i = f7;
            c();
        }
    }

    public j(j jVar, a0.f fVar) {
        l lVar;
        this.f45314a = new Matrix();
        this.f45315b = new ArrayList();
        this.f45316c = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f45317f = 1.0f;
        this.f45318g = 1.0f;
        this.h = 0.0f;
        this.f45319i = 0.0f;
        Matrix matrix = new Matrix();
        this.f45320j = matrix;
        this.f45321k = null;
        this.f45316c = jVar.f45316c;
        this.d = jVar.d;
        this.e = jVar.e;
        this.f45317f = jVar.f45317f;
        this.f45318g = jVar.f45318g;
        this.h = jVar.h;
        this.f45319i = jVar.f45319i;
        String str = jVar.f45321k;
        this.f45321k = str;
        if (str != null) {
            fVar.put(str, this);
        }
        matrix.set(jVar.f45320j);
        ArrayList arrayList = jVar.f45315b;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            Object obj = arrayList.get(i10);
            if (obj instanceof j) {
                this.f45315b.add(new j((j) obj, fVar));
            } else {
                if (obj instanceof i) {
                    i iVar = (i) obj;
                    ?? lVar2 = new l(iVar);
                    lVar2.e = 0.0f;
                    lVar2.f45307g = 1.0f;
                    lVar2.h = 1.0f;
                    lVar2.f45308i = 0.0f;
                    lVar2.f45309j = 1.0f;
                    lVar2.f45310k = 0.0f;
                    lVar2.f45311l = Paint.Cap.BUTT;
                    lVar2.f45312m = Paint.Join.MITER;
                    lVar2.f45313n = 4.0f;
                    lVar2.d = iVar.d;
                    lVar2.e = iVar.e;
                    lVar2.f45307g = iVar.f45307g;
                    lVar2.f45306f = iVar.f45306f;
                    lVar2.f45324c = iVar.f45324c;
                    lVar2.h = iVar.h;
                    lVar2.f45308i = iVar.f45308i;
                    lVar2.f45309j = iVar.f45309j;
                    lVar2.f45310k = iVar.f45310k;
                    lVar2.f45311l = iVar.f45311l;
                    lVar2.f45312m = iVar.f45312m;
                    lVar2.f45313n = iVar.f45313n;
                    lVar = lVar2;
                } else if (obj instanceof h) {
                    lVar = new l((h) obj);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.f45315b.add(lVar);
                Object obj2 = lVar.f45323b;
                if (obj2 != null) {
                    fVar.put(obj2, lVar);
                }
            }
        }
    }
}
