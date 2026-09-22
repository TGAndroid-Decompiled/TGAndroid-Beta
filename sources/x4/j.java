package x4;

import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;
public final class j extends k {
    public final Matrix f45282a;
    public final ArrayList f45283b;
    public float f45284c;
    public float d;
    public float e;
    public float f45285f;
    public float f45286g;
    public float h;
    public float f45287i;
    public final Matrix f45288j;
    public String f45289k;

    public j() {
        this.f45282a = new Matrix();
        this.f45283b = new ArrayList();
        this.f45284c = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f45285f = 1.0f;
        this.f45286g = 1.0f;
        this.h = 0.0f;
        this.f45287i = 0.0f;
        this.f45288j = new Matrix();
        this.f45289k = null;
    }

    @Override
    public final boolean a() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f45283b;
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
            ArrayList arrayList = this.f45283b;
            if (i10 < arrayList.size()) {
                z10 |= ((k) arrayList.get(i10)).b(iArr);
                i10++;
            } else {
                return z10;
            }
        }
    }

    public final void c() {
        Matrix matrix = this.f45288j;
        matrix.reset();
        matrix.postTranslate(-this.d, -this.e);
        matrix.postScale(this.f45285f, this.f45286g);
        matrix.postRotate(this.f45284c, 0.0f, 0.0f);
        matrix.postTranslate(this.h + this.d, this.f45287i + this.e);
    }

    public String getGroupName() {
        return this.f45289k;
    }

    public Matrix getLocalMatrix() {
        return this.f45288j;
    }

    public float getPivotX() {
        return this.d;
    }

    public float getPivotY() {
        return this.e;
    }

    public float getRotation() {
        return this.f45284c;
    }

    public float getScaleX() {
        return this.f45285f;
    }

    public float getScaleY() {
        return this.f45286g;
    }

    public float getTranslateX() {
        return this.h;
    }

    public float getTranslateY() {
        return this.f45287i;
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
        if (f7 != this.f45284c) {
            this.f45284c = f7;
            c();
        }
    }

    public void setScaleX(float f7) {
        if (f7 != this.f45285f) {
            this.f45285f = f7;
            c();
        }
    }

    public void setScaleY(float f7) {
        if (f7 != this.f45286g) {
            this.f45286g = f7;
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
        if (f7 != this.f45287i) {
            this.f45287i = f7;
            c();
        }
    }

    public j(j jVar, a0.f fVar) {
        l lVar;
        this.f45282a = new Matrix();
        this.f45283b = new ArrayList();
        this.f45284c = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f45285f = 1.0f;
        this.f45286g = 1.0f;
        this.h = 0.0f;
        this.f45287i = 0.0f;
        Matrix matrix = new Matrix();
        this.f45288j = matrix;
        this.f45289k = null;
        this.f45284c = jVar.f45284c;
        this.d = jVar.d;
        this.e = jVar.e;
        this.f45285f = jVar.f45285f;
        this.f45286g = jVar.f45286g;
        this.h = jVar.h;
        this.f45287i = jVar.f45287i;
        String str = jVar.f45289k;
        this.f45289k = str;
        if (str != null) {
            fVar.put(str, this);
        }
        matrix.set(jVar.f45288j);
        ArrayList arrayList = jVar.f45283b;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            Object obj = arrayList.get(i10);
            if (obj instanceof j) {
                this.f45283b.add(new j((j) obj, fVar));
            } else {
                if (obj instanceof i) {
                    i iVar = (i) obj;
                    ?? lVar2 = new l(iVar);
                    lVar2.e = 0.0f;
                    lVar2.f45275g = 1.0f;
                    lVar2.h = 1.0f;
                    lVar2.f45276i = 0.0f;
                    lVar2.f45277j = 1.0f;
                    lVar2.f45278k = 0.0f;
                    lVar2.f45279l = Paint.Cap.BUTT;
                    lVar2.f45280m = Paint.Join.MITER;
                    lVar2.f45281n = 4.0f;
                    lVar2.d = iVar.d;
                    lVar2.e = iVar.e;
                    lVar2.f45275g = iVar.f45275g;
                    lVar2.f45274f = iVar.f45274f;
                    lVar2.f45292c = iVar.f45292c;
                    lVar2.h = iVar.h;
                    lVar2.f45276i = iVar.f45276i;
                    lVar2.f45277j = iVar.f45277j;
                    lVar2.f45278k = iVar.f45278k;
                    lVar2.f45279l = iVar.f45279l;
                    lVar2.f45280m = iVar.f45280m;
                    lVar2.f45281n = iVar.f45281n;
                    lVar = lVar2;
                } else if (obj instanceof h) {
                    lVar = new l((h) obj);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.f45283b.add(lVar);
                Object obj2 = lVar.f45291b;
                if (obj2 != null) {
                    fVar.put(obj2, lVar);
                }
            }
        }
    }
}
