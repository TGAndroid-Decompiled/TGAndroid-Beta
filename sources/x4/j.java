package x4;

import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;
public final class j extends k {
    public final Matrix f45563a;
    public final ArrayList f45564b;
    public float f45565c;
    public float d;
    public float e;
    public float f45566f;
    public float f45567g;
    public float h;
    public float f45568i;
    public final Matrix f45569j;
    public String f45570k;

    public j() {
        this.f45563a = new Matrix();
        this.f45564b = new ArrayList();
        this.f45565c = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f45566f = 1.0f;
        this.f45567g = 1.0f;
        this.h = 0.0f;
        this.f45568i = 0.0f;
        this.f45569j = new Matrix();
        this.f45570k = null;
    }

    @Override
    public final boolean a() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f45564b;
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
            ArrayList arrayList = this.f45564b;
            if (i10 < arrayList.size()) {
                z10 |= ((k) arrayList.get(i10)).b(iArr);
                i10++;
            } else {
                return z10;
            }
        }
    }

    public final void c() {
        Matrix matrix = this.f45569j;
        matrix.reset();
        matrix.postTranslate(-this.d, -this.e);
        matrix.postScale(this.f45566f, this.f45567g);
        matrix.postRotate(this.f45565c, 0.0f, 0.0f);
        matrix.postTranslate(this.h + this.d, this.f45568i + this.e);
    }

    public String getGroupName() {
        return this.f45570k;
    }

    public Matrix getLocalMatrix() {
        return this.f45569j;
    }

    public float getPivotX() {
        return this.d;
    }

    public float getPivotY() {
        return this.e;
    }

    public float getRotation() {
        return this.f45565c;
    }

    public float getScaleX() {
        return this.f45566f;
    }

    public float getScaleY() {
        return this.f45567g;
    }

    public float getTranslateX() {
        return this.h;
    }

    public float getTranslateY() {
        return this.f45568i;
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
        if (f7 != this.f45565c) {
            this.f45565c = f7;
            c();
        }
    }

    public void setScaleX(float f7) {
        if (f7 != this.f45566f) {
            this.f45566f = f7;
            c();
        }
    }

    public void setScaleY(float f7) {
        if (f7 != this.f45567g) {
            this.f45567g = f7;
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
        if (f7 != this.f45568i) {
            this.f45568i = f7;
            c();
        }
    }

    public j(j jVar, a0.f fVar) {
        l lVar;
        this.f45563a = new Matrix();
        this.f45564b = new ArrayList();
        this.f45565c = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f45566f = 1.0f;
        this.f45567g = 1.0f;
        this.h = 0.0f;
        this.f45568i = 0.0f;
        Matrix matrix = new Matrix();
        this.f45569j = matrix;
        this.f45570k = null;
        this.f45565c = jVar.f45565c;
        this.d = jVar.d;
        this.e = jVar.e;
        this.f45566f = jVar.f45566f;
        this.f45567g = jVar.f45567g;
        this.h = jVar.h;
        this.f45568i = jVar.f45568i;
        String str = jVar.f45570k;
        this.f45570k = str;
        if (str != null) {
            fVar.put(str, this);
        }
        matrix.set(jVar.f45569j);
        ArrayList arrayList = jVar.f45564b;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            Object obj = arrayList.get(i10);
            if (obj instanceof j) {
                this.f45564b.add(new j((j) obj, fVar));
            } else {
                if (obj instanceof i) {
                    i iVar = (i) obj;
                    ?? lVar2 = new l(iVar);
                    lVar2.e = 0.0f;
                    lVar2.f45556g = 1.0f;
                    lVar2.h = 1.0f;
                    lVar2.f45557i = 0.0f;
                    lVar2.f45558j = 1.0f;
                    lVar2.f45559k = 0.0f;
                    lVar2.f45560l = Paint.Cap.BUTT;
                    lVar2.f45561m = Paint.Join.MITER;
                    lVar2.f45562n = 4.0f;
                    lVar2.d = iVar.d;
                    lVar2.e = iVar.e;
                    lVar2.f45556g = iVar.f45556g;
                    lVar2.f45555f = iVar.f45555f;
                    lVar2.f45573c = iVar.f45573c;
                    lVar2.h = iVar.h;
                    lVar2.f45557i = iVar.f45557i;
                    lVar2.f45558j = iVar.f45558j;
                    lVar2.f45559k = iVar.f45559k;
                    lVar2.f45560l = iVar.f45560l;
                    lVar2.f45561m = iVar.f45561m;
                    lVar2.f45562n = iVar.f45562n;
                    lVar = lVar2;
                } else if (obj instanceof h) {
                    lVar = new l((h) obj);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.f45564b.add(lVar);
                Object obj2 = lVar.f45572b;
                if (obj2 != null) {
                    fVar.put(obj2, lVar);
                }
            }
        }
    }
}
