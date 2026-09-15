package x4;

import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;
public final class j extends k {
    public final Matrix f45286a;
    public final ArrayList f45287b;
    public float f45288c;
    public float d;
    public float e;
    public float f45289f;
    public float f45290g;
    public float h;
    public float f45291i;
    public final Matrix f45292j;
    public String f45293k;

    public j() {
        this.f45286a = new Matrix();
        this.f45287b = new ArrayList();
        this.f45288c = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f45289f = 1.0f;
        this.f45290g = 1.0f;
        this.h = 0.0f;
        this.f45291i = 0.0f;
        this.f45292j = new Matrix();
        this.f45293k = null;
    }

    @Override
    public final boolean a() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f45287b;
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
            ArrayList arrayList = this.f45287b;
            if (i10 < arrayList.size()) {
                z10 |= ((k) arrayList.get(i10)).b(iArr);
                i10++;
            } else {
                return z10;
            }
        }
    }

    public final void c() {
        Matrix matrix = this.f45292j;
        matrix.reset();
        matrix.postTranslate(-this.d, -this.e);
        matrix.postScale(this.f45289f, this.f45290g);
        matrix.postRotate(this.f45288c, 0.0f, 0.0f);
        matrix.postTranslate(this.h + this.d, this.f45291i + this.e);
    }

    public String getGroupName() {
        return this.f45293k;
    }

    public Matrix getLocalMatrix() {
        return this.f45292j;
    }

    public float getPivotX() {
        return this.d;
    }

    public float getPivotY() {
        return this.e;
    }

    public float getRotation() {
        return this.f45288c;
    }

    public float getScaleX() {
        return this.f45289f;
    }

    public float getScaleY() {
        return this.f45290g;
    }

    public float getTranslateX() {
        return this.h;
    }

    public float getTranslateY() {
        return this.f45291i;
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
        if (f7 != this.f45288c) {
            this.f45288c = f7;
            c();
        }
    }

    public void setScaleX(float f7) {
        if (f7 != this.f45289f) {
            this.f45289f = f7;
            c();
        }
    }

    public void setScaleY(float f7) {
        if (f7 != this.f45290g) {
            this.f45290g = f7;
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
        if (f7 != this.f45291i) {
            this.f45291i = f7;
            c();
        }
    }

    public j(j jVar, a0.f fVar) {
        l lVar;
        this.f45286a = new Matrix();
        this.f45287b = new ArrayList();
        this.f45288c = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f45289f = 1.0f;
        this.f45290g = 1.0f;
        this.h = 0.0f;
        this.f45291i = 0.0f;
        Matrix matrix = new Matrix();
        this.f45292j = matrix;
        this.f45293k = null;
        this.f45288c = jVar.f45288c;
        this.d = jVar.d;
        this.e = jVar.e;
        this.f45289f = jVar.f45289f;
        this.f45290g = jVar.f45290g;
        this.h = jVar.h;
        this.f45291i = jVar.f45291i;
        String str = jVar.f45293k;
        this.f45293k = str;
        if (str != null) {
            fVar.put(str, this);
        }
        matrix.set(jVar.f45292j);
        ArrayList arrayList = jVar.f45287b;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            Object obj = arrayList.get(i10);
            if (obj instanceof j) {
                this.f45287b.add(new j((j) obj, fVar));
            } else {
                if (obj instanceof i) {
                    i iVar = (i) obj;
                    ?? lVar2 = new l(iVar);
                    lVar2.e = 0.0f;
                    lVar2.f45279g = 1.0f;
                    lVar2.h = 1.0f;
                    lVar2.f45280i = 0.0f;
                    lVar2.f45281j = 1.0f;
                    lVar2.f45282k = 0.0f;
                    lVar2.f45283l = Paint.Cap.BUTT;
                    lVar2.f45284m = Paint.Join.MITER;
                    lVar2.f45285n = 4.0f;
                    lVar2.d = iVar.d;
                    lVar2.e = iVar.e;
                    lVar2.f45279g = iVar.f45279g;
                    lVar2.f45278f = iVar.f45278f;
                    lVar2.f45296c = iVar.f45296c;
                    lVar2.h = iVar.h;
                    lVar2.f45280i = iVar.f45280i;
                    lVar2.f45281j = iVar.f45281j;
                    lVar2.f45282k = iVar.f45282k;
                    lVar2.f45283l = iVar.f45283l;
                    lVar2.f45284m = iVar.f45284m;
                    lVar2.f45285n = iVar.f45285n;
                    lVar = lVar2;
                } else if (obj instanceof h) {
                    lVar = new l((h) obj);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.f45287b.add(lVar);
                Object obj2 = lVar.f45295b;
                if (obj2 != null) {
                    fVar.put(obj2, lVar);
                }
            }
        }
    }
}
