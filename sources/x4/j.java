package x4;

import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;
public final class j extends k {
    public final Matrix f45550a;
    public final ArrayList f45551b;
    public float f45552c;
    public float d;
    public float e;
    public float f45553f;
    public float f45554g;
    public float h;
    public float f45555i;
    public final Matrix f45556j;
    public String f45557k;

    public j() {
        this.f45550a = new Matrix();
        this.f45551b = new ArrayList();
        this.f45552c = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f45553f = 1.0f;
        this.f45554g = 1.0f;
        this.h = 0.0f;
        this.f45555i = 0.0f;
        this.f45556j = new Matrix();
        this.f45557k = null;
    }

    @Override
    public final boolean a() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f45551b;
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
            ArrayList arrayList = this.f45551b;
            if (i10 < arrayList.size()) {
                z10 |= ((k) arrayList.get(i10)).b(iArr);
                i10++;
            } else {
                return z10;
            }
        }
    }

    public final void c() {
        Matrix matrix = this.f45556j;
        matrix.reset();
        matrix.postTranslate(-this.d, -this.e);
        matrix.postScale(this.f45553f, this.f45554g);
        matrix.postRotate(this.f45552c, 0.0f, 0.0f);
        matrix.postTranslate(this.h + this.d, this.f45555i + this.e);
    }

    public String getGroupName() {
        return this.f45557k;
    }

    public Matrix getLocalMatrix() {
        return this.f45556j;
    }

    public float getPivotX() {
        return this.d;
    }

    public float getPivotY() {
        return this.e;
    }

    public float getRotation() {
        return this.f45552c;
    }

    public float getScaleX() {
        return this.f45553f;
    }

    public float getScaleY() {
        return this.f45554g;
    }

    public float getTranslateX() {
        return this.h;
    }

    public float getTranslateY() {
        return this.f45555i;
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
        if (f7 != this.f45552c) {
            this.f45552c = f7;
            c();
        }
    }

    public void setScaleX(float f7) {
        if (f7 != this.f45553f) {
            this.f45553f = f7;
            c();
        }
    }

    public void setScaleY(float f7) {
        if (f7 != this.f45554g) {
            this.f45554g = f7;
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
        if (f7 != this.f45555i) {
            this.f45555i = f7;
            c();
        }
    }

    public j(j jVar, a0.f fVar) {
        l lVar;
        this.f45550a = new Matrix();
        this.f45551b = new ArrayList();
        this.f45552c = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f45553f = 1.0f;
        this.f45554g = 1.0f;
        this.h = 0.0f;
        this.f45555i = 0.0f;
        Matrix matrix = new Matrix();
        this.f45556j = matrix;
        this.f45557k = null;
        this.f45552c = jVar.f45552c;
        this.d = jVar.d;
        this.e = jVar.e;
        this.f45553f = jVar.f45553f;
        this.f45554g = jVar.f45554g;
        this.h = jVar.h;
        this.f45555i = jVar.f45555i;
        String str = jVar.f45557k;
        this.f45557k = str;
        if (str != null) {
            fVar.put(str, this);
        }
        matrix.set(jVar.f45556j);
        ArrayList arrayList = jVar.f45551b;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            Object obj = arrayList.get(i10);
            if (obj instanceof j) {
                this.f45551b.add(new j((j) obj, fVar));
            } else {
                if (obj instanceof i) {
                    i iVar = (i) obj;
                    ?? lVar2 = new l(iVar);
                    lVar2.e = 0.0f;
                    lVar2.f45543g = 1.0f;
                    lVar2.h = 1.0f;
                    lVar2.f45544i = 0.0f;
                    lVar2.f45545j = 1.0f;
                    lVar2.f45546k = 0.0f;
                    lVar2.f45547l = Paint.Cap.BUTT;
                    lVar2.f45548m = Paint.Join.MITER;
                    lVar2.f45549n = 4.0f;
                    lVar2.d = iVar.d;
                    lVar2.e = iVar.e;
                    lVar2.f45543g = iVar.f45543g;
                    lVar2.f45542f = iVar.f45542f;
                    lVar2.f45560c = iVar.f45560c;
                    lVar2.h = iVar.h;
                    lVar2.f45544i = iVar.f45544i;
                    lVar2.f45545j = iVar.f45545j;
                    lVar2.f45546k = iVar.f45546k;
                    lVar2.f45547l = iVar.f45547l;
                    lVar2.f45548m = iVar.f45548m;
                    lVar2.f45549n = iVar.f45549n;
                    lVar = lVar2;
                } else if (obj instanceof h) {
                    lVar = new l((h) obj);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.f45551b.add(lVar);
                Object obj2 = lVar.f45559b;
                if (obj2 != null) {
                    fVar.put(obj2, lVar);
                }
            }
        }
    }
}
