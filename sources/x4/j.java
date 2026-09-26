package x4;

import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;
public final class j extends k {
    public final Matrix f45564a;
    public final ArrayList f45565b;
    public float f45566c;
    public float d;
    public float e;
    public float f45567f;
    public float f45568g;
    public float h;
    public float f45569i;
    public final Matrix f45570j;
    public String f45571k;

    public j() {
        this.f45564a = new Matrix();
        this.f45565b = new ArrayList();
        this.f45566c = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f45567f = 1.0f;
        this.f45568g = 1.0f;
        this.h = 0.0f;
        this.f45569i = 0.0f;
        this.f45570j = new Matrix();
        this.f45571k = null;
    }

    @Override
    public final boolean a() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f45565b;
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
            ArrayList arrayList = this.f45565b;
            if (i10 < arrayList.size()) {
                z10 |= ((k) arrayList.get(i10)).b(iArr);
                i10++;
            } else {
                return z10;
            }
        }
    }

    public final void c() {
        Matrix matrix = this.f45570j;
        matrix.reset();
        matrix.postTranslate(-this.d, -this.e);
        matrix.postScale(this.f45567f, this.f45568g);
        matrix.postRotate(this.f45566c, 0.0f, 0.0f);
        matrix.postTranslate(this.h + this.d, this.f45569i + this.e);
    }

    public String getGroupName() {
        return this.f45571k;
    }

    public Matrix getLocalMatrix() {
        return this.f45570j;
    }

    public float getPivotX() {
        return this.d;
    }

    public float getPivotY() {
        return this.e;
    }

    public float getRotation() {
        return this.f45566c;
    }

    public float getScaleX() {
        return this.f45567f;
    }

    public float getScaleY() {
        return this.f45568g;
    }

    public float getTranslateX() {
        return this.h;
    }

    public float getTranslateY() {
        return this.f45569i;
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
        if (f7 != this.f45566c) {
            this.f45566c = f7;
            c();
        }
    }

    public void setScaleX(float f7) {
        if (f7 != this.f45567f) {
            this.f45567f = f7;
            c();
        }
    }

    public void setScaleY(float f7) {
        if (f7 != this.f45568g) {
            this.f45568g = f7;
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
        if (f7 != this.f45569i) {
            this.f45569i = f7;
            c();
        }
    }

    public j(j jVar, a0.f fVar) {
        l lVar;
        this.f45564a = new Matrix();
        this.f45565b = new ArrayList();
        this.f45566c = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f45567f = 1.0f;
        this.f45568g = 1.0f;
        this.h = 0.0f;
        this.f45569i = 0.0f;
        Matrix matrix = new Matrix();
        this.f45570j = matrix;
        this.f45571k = null;
        this.f45566c = jVar.f45566c;
        this.d = jVar.d;
        this.e = jVar.e;
        this.f45567f = jVar.f45567f;
        this.f45568g = jVar.f45568g;
        this.h = jVar.h;
        this.f45569i = jVar.f45569i;
        String str = jVar.f45571k;
        this.f45571k = str;
        if (str != null) {
            fVar.put(str, this);
        }
        matrix.set(jVar.f45570j);
        ArrayList arrayList = jVar.f45565b;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            Object obj = arrayList.get(i10);
            if (obj instanceof j) {
                this.f45565b.add(new j((j) obj, fVar));
            } else {
                if (obj instanceof i) {
                    i iVar = (i) obj;
                    ?? lVar2 = new l(iVar);
                    lVar2.e = 0.0f;
                    lVar2.f45557g = 1.0f;
                    lVar2.h = 1.0f;
                    lVar2.f45558i = 0.0f;
                    lVar2.f45559j = 1.0f;
                    lVar2.f45560k = 0.0f;
                    lVar2.f45561l = Paint.Cap.BUTT;
                    lVar2.f45562m = Paint.Join.MITER;
                    lVar2.f45563n = 4.0f;
                    lVar2.d = iVar.d;
                    lVar2.e = iVar.e;
                    lVar2.f45557g = iVar.f45557g;
                    lVar2.f45556f = iVar.f45556f;
                    lVar2.f45574c = iVar.f45574c;
                    lVar2.h = iVar.h;
                    lVar2.f45558i = iVar.f45558i;
                    lVar2.f45559j = iVar.f45559j;
                    lVar2.f45560k = iVar.f45560k;
                    lVar2.f45561l = iVar.f45561l;
                    lVar2.f45562m = iVar.f45562m;
                    lVar2.f45563n = iVar.f45563n;
                    lVar = lVar2;
                } else if (obj instanceof h) {
                    lVar = new l((h) obj);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.f45565b.add(lVar);
                Object obj2 = lVar.f45573b;
                if (obj2 != null) {
                    fVar.put(obj2, lVar);
                }
            }
        }
    }
}
