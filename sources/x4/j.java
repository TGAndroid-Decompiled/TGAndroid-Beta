package x4;

import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;
public final class j extends k {
    public final Matrix f45537a;
    public final ArrayList f45538b;
    public float f45539c;
    public float d;
    public float e;
    public float f45540f;
    public float f45541g;
    public float h;
    public float f45542i;
    public final Matrix f45543j;
    public String f45544k;

    public j() {
        this.f45537a = new Matrix();
        this.f45538b = new ArrayList();
        this.f45539c = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f45540f = 1.0f;
        this.f45541g = 1.0f;
        this.h = 0.0f;
        this.f45542i = 0.0f;
        this.f45543j = new Matrix();
        this.f45544k = null;
    }

    @Override
    public final boolean a() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f45538b;
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
            ArrayList arrayList = this.f45538b;
            if (i10 < arrayList.size()) {
                z10 |= ((k) arrayList.get(i10)).b(iArr);
                i10++;
            } else {
                return z10;
            }
        }
    }

    public final void c() {
        Matrix matrix = this.f45543j;
        matrix.reset();
        matrix.postTranslate(-this.d, -this.e);
        matrix.postScale(this.f45540f, this.f45541g);
        matrix.postRotate(this.f45539c, 0.0f, 0.0f);
        matrix.postTranslate(this.h + this.d, this.f45542i + this.e);
    }

    public String getGroupName() {
        return this.f45544k;
    }

    public Matrix getLocalMatrix() {
        return this.f45543j;
    }

    public float getPivotX() {
        return this.d;
    }

    public float getPivotY() {
        return this.e;
    }

    public float getRotation() {
        return this.f45539c;
    }

    public float getScaleX() {
        return this.f45540f;
    }

    public float getScaleY() {
        return this.f45541g;
    }

    public float getTranslateX() {
        return this.h;
    }

    public float getTranslateY() {
        return this.f45542i;
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
        if (f7 != this.f45539c) {
            this.f45539c = f7;
            c();
        }
    }

    public void setScaleX(float f7) {
        if (f7 != this.f45540f) {
            this.f45540f = f7;
            c();
        }
    }

    public void setScaleY(float f7) {
        if (f7 != this.f45541g) {
            this.f45541g = f7;
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
        if (f7 != this.f45542i) {
            this.f45542i = f7;
            c();
        }
    }

    public j(j jVar, a0.f fVar) {
        l lVar;
        this.f45537a = new Matrix();
        this.f45538b = new ArrayList();
        this.f45539c = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f45540f = 1.0f;
        this.f45541g = 1.0f;
        this.h = 0.0f;
        this.f45542i = 0.0f;
        Matrix matrix = new Matrix();
        this.f45543j = matrix;
        this.f45544k = null;
        this.f45539c = jVar.f45539c;
        this.d = jVar.d;
        this.e = jVar.e;
        this.f45540f = jVar.f45540f;
        this.f45541g = jVar.f45541g;
        this.h = jVar.h;
        this.f45542i = jVar.f45542i;
        String str = jVar.f45544k;
        this.f45544k = str;
        if (str != null) {
            fVar.put(str, this);
        }
        matrix.set(jVar.f45543j);
        ArrayList arrayList = jVar.f45538b;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            Object obj = arrayList.get(i10);
            if (obj instanceof j) {
                this.f45538b.add(new j((j) obj, fVar));
            } else {
                if (obj instanceof i) {
                    i iVar = (i) obj;
                    ?? lVar2 = new l(iVar);
                    lVar2.e = 0.0f;
                    lVar2.f45530g = 1.0f;
                    lVar2.h = 1.0f;
                    lVar2.f45531i = 0.0f;
                    lVar2.f45532j = 1.0f;
                    lVar2.f45533k = 0.0f;
                    lVar2.f45534l = Paint.Cap.BUTT;
                    lVar2.f45535m = Paint.Join.MITER;
                    lVar2.f45536n = 4.0f;
                    lVar2.d = iVar.d;
                    lVar2.e = iVar.e;
                    lVar2.f45530g = iVar.f45530g;
                    lVar2.f45529f = iVar.f45529f;
                    lVar2.f45547c = iVar.f45547c;
                    lVar2.h = iVar.h;
                    lVar2.f45531i = iVar.f45531i;
                    lVar2.f45532j = iVar.f45532j;
                    lVar2.f45533k = iVar.f45533k;
                    lVar2.f45534l = iVar.f45534l;
                    lVar2.f45535m = iVar.f45535m;
                    lVar2.f45536n = iVar.f45536n;
                    lVar = lVar2;
                } else if (obj instanceof h) {
                    lVar = new l((h) obj);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.f45538b.add(lVar);
                Object obj2 = lVar.f45546b;
                if (obj2 != null) {
                    fVar.put(obj2, lVar);
                }
            }
        }
    }
}
