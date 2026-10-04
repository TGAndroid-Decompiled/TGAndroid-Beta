package x4;

import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;
public final class j extends k {
    public final Matrix f49334a;
    public final ArrayList f49335b;
    public float f49336c;
    public float d;
    public float f49337e;
    public float f49338f;
    public float f49339g;
    public float h;
    public float f49340i;
    public final Matrix f49341j;
    public String f49342k;

    public j() {
        this.f49334a = new Matrix();
        this.f49335b = new ArrayList();
        this.f49336c = 0.0f;
        this.d = 0.0f;
        this.f49337e = 0.0f;
        this.f49338f = 1.0f;
        this.f49339g = 1.0f;
        this.h = 0.0f;
        this.f49340i = 0.0f;
        this.f49341j = new Matrix();
        this.f49342k = null;
    }

    @Override
    public final boolean a() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f49335b;
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
            ArrayList arrayList = this.f49335b;
            if (i10 < arrayList.size()) {
                z10 |= ((k) arrayList.get(i10)).b(iArr);
                i10++;
            } else {
                return z10;
            }
        }
    }

    public final void c() {
        Matrix matrix = this.f49341j;
        matrix.reset();
        matrix.postTranslate(-this.d, -this.f49337e);
        matrix.postScale(this.f49338f, this.f49339g);
        matrix.postRotate(this.f49336c, 0.0f, 0.0f);
        matrix.postTranslate(this.h + this.d, this.f49340i + this.f49337e);
    }

    public String getGroupName() {
        return this.f49342k;
    }

    public Matrix getLocalMatrix() {
        return this.f49341j;
    }

    public float getPivotX() {
        return this.d;
    }

    public float getPivotY() {
        return this.f49337e;
    }

    public float getRotation() {
        return this.f49336c;
    }

    public float getScaleX() {
        return this.f49338f;
    }

    public float getScaleY() {
        return this.f49339g;
    }

    public float getTranslateX() {
        return this.h;
    }

    public float getTranslateY() {
        return this.f49340i;
    }

    public void setPivotX(float f7) {
        if (f7 != this.d) {
            this.d = f7;
            c();
        }
    }

    public void setPivotY(float f7) {
        if (f7 != this.f49337e) {
            this.f49337e = f7;
            c();
        }
    }

    public void setRotation(float f7) {
        if (f7 != this.f49336c) {
            this.f49336c = f7;
            c();
        }
    }

    public void setScaleX(float f7) {
        if (f7 != this.f49338f) {
            this.f49338f = f7;
            c();
        }
    }

    public void setScaleY(float f7) {
        if (f7 != this.f49339g) {
            this.f49339g = f7;
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
        if (f7 != this.f49340i) {
            this.f49340i = f7;
            c();
        }
    }

    public j(j jVar, a0.f fVar) {
        l lVar;
        this.f49334a = new Matrix();
        this.f49335b = new ArrayList();
        this.f49336c = 0.0f;
        this.d = 0.0f;
        this.f49337e = 0.0f;
        this.f49338f = 1.0f;
        this.f49339g = 1.0f;
        this.h = 0.0f;
        this.f49340i = 0.0f;
        Matrix matrix = new Matrix();
        this.f49341j = matrix;
        this.f49342k = null;
        this.f49336c = jVar.f49336c;
        this.d = jVar.d;
        this.f49337e = jVar.f49337e;
        this.f49338f = jVar.f49338f;
        this.f49339g = jVar.f49339g;
        this.h = jVar.h;
        this.f49340i = jVar.f49340i;
        String str = jVar.f49342k;
        this.f49342k = str;
        if (str != null) {
            fVar.put(str, this);
        }
        matrix.set(jVar.f49341j);
        ArrayList arrayList = jVar.f49335b;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            Object obj = arrayList.get(i10);
            if (obj instanceof j) {
                this.f49335b.add(new j((j) obj, fVar));
            } else {
                if (obj instanceof i) {
                    i iVar = (i) obj;
                    ?? lVar2 = new l(iVar);
                    lVar2.f49325e = 0.0f;
                    lVar2.f49327g = 1.0f;
                    lVar2.h = 1.0f;
                    lVar2.f49328i = 0.0f;
                    lVar2.f49329j = 1.0f;
                    lVar2.f49330k = 0.0f;
                    lVar2.f49331l = Paint.Cap.BUTT;
                    lVar2.f49332m = Paint.Join.MITER;
                    lVar2.f49333n = 4.0f;
                    lVar2.d = iVar.d;
                    lVar2.f49325e = iVar.f49325e;
                    lVar2.f49327g = iVar.f49327g;
                    lVar2.f49326f = iVar.f49326f;
                    lVar2.f49345c = iVar.f49345c;
                    lVar2.h = iVar.h;
                    lVar2.f49328i = iVar.f49328i;
                    lVar2.f49329j = iVar.f49329j;
                    lVar2.f49330k = iVar.f49330k;
                    lVar2.f49331l = iVar.f49331l;
                    lVar2.f49332m = iVar.f49332m;
                    lVar2.f49333n = iVar.f49333n;
                    lVar = lVar2;
                } else if (obj instanceof h) {
                    lVar = new l((h) obj);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.f49335b.add(lVar);
                Object obj2 = lVar.f49344b;
                if (obj2 != null) {
                    fVar.put(obj2, lVar);
                }
            }
        }
    }
}
