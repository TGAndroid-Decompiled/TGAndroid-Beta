package x4;

import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;
public final class j extends k {
    public final Matrix f45309a;
    public final ArrayList f45310b;
    public float f45311c;
    public float d;
    public float e;
    public float f45312f;
    public float f45313g;
    public float h;
    public float f45314i;
    public final Matrix f45315j;
    public String f45316k;

    public j() {
        this.f45309a = new Matrix();
        this.f45310b = new ArrayList();
        this.f45311c = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f45312f = 1.0f;
        this.f45313g = 1.0f;
        this.h = 0.0f;
        this.f45314i = 0.0f;
        this.f45315j = new Matrix();
        this.f45316k = null;
    }

    @Override
    public final boolean a() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f45310b;
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
            ArrayList arrayList = this.f45310b;
            if (i10 < arrayList.size()) {
                z10 |= ((k) arrayList.get(i10)).b(iArr);
                i10++;
            } else {
                return z10;
            }
        }
    }

    public final void c() {
        Matrix matrix = this.f45315j;
        matrix.reset();
        matrix.postTranslate(-this.d, -this.e);
        matrix.postScale(this.f45312f, this.f45313g);
        matrix.postRotate(this.f45311c, 0.0f, 0.0f);
        matrix.postTranslate(this.h + this.d, this.f45314i + this.e);
    }

    public String getGroupName() {
        return this.f45316k;
    }

    public Matrix getLocalMatrix() {
        return this.f45315j;
    }

    public float getPivotX() {
        return this.d;
    }

    public float getPivotY() {
        return this.e;
    }

    public float getRotation() {
        return this.f45311c;
    }

    public float getScaleX() {
        return this.f45312f;
    }

    public float getScaleY() {
        return this.f45313g;
    }

    public float getTranslateX() {
        return this.h;
    }

    public float getTranslateY() {
        return this.f45314i;
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
        if (f7 != this.f45311c) {
            this.f45311c = f7;
            c();
        }
    }

    public void setScaleX(float f7) {
        if (f7 != this.f45312f) {
            this.f45312f = f7;
            c();
        }
    }

    public void setScaleY(float f7) {
        if (f7 != this.f45313g) {
            this.f45313g = f7;
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
        if (f7 != this.f45314i) {
            this.f45314i = f7;
            c();
        }
    }

    public j(j jVar, a0.f fVar) {
        l lVar;
        this.f45309a = new Matrix();
        this.f45310b = new ArrayList();
        this.f45311c = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f45312f = 1.0f;
        this.f45313g = 1.0f;
        this.h = 0.0f;
        this.f45314i = 0.0f;
        Matrix matrix = new Matrix();
        this.f45315j = matrix;
        this.f45316k = null;
        this.f45311c = jVar.f45311c;
        this.d = jVar.d;
        this.e = jVar.e;
        this.f45312f = jVar.f45312f;
        this.f45313g = jVar.f45313g;
        this.h = jVar.h;
        this.f45314i = jVar.f45314i;
        String str = jVar.f45316k;
        this.f45316k = str;
        if (str != null) {
            fVar.put(str, this);
        }
        matrix.set(jVar.f45315j);
        ArrayList arrayList = jVar.f45310b;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            Object obj = arrayList.get(i10);
            if (obj instanceof j) {
                this.f45310b.add(new j((j) obj, fVar));
            } else {
                if (obj instanceof i) {
                    i iVar = (i) obj;
                    ?? lVar2 = new l(iVar);
                    lVar2.e = 0.0f;
                    lVar2.f45302g = 1.0f;
                    lVar2.h = 1.0f;
                    lVar2.f45303i = 0.0f;
                    lVar2.f45304j = 1.0f;
                    lVar2.f45305k = 0.0f;
                    lVar2.f45306l = Paint.Cap.BUTT;
                    lVar2.f45307m = Paint.Join.MITER;
                    lVar2.f45308n = 4.0f;
                    lVar2.d = iVar.d;
                    lVar2.e = iVar.e;
                    lVar2.f45302g = iVar.f45302g;
                    lVar2.f45301f = iVar.f45301f;
                    lVar2.f45319c = iVar.f45319c;
                    lVar2.h = iVar.h;
                    lVar2.f45303i = iVar.f45303i;
                    lVar2.f45304j = iVar.f45304j;
                    lVar2.f45305k = iVar.f45305k;
                    lVar2.f45306l = iVar.f45306l;
                    lVar2.f45307m = iVar.f45307m;
                    lVar2.f45308n = iVar.f45308n;
                    lVar = lVar2;
                } else if (obj instanceof h) {
                    lVar = new l((h) obj);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.f45310b.add(lVar);
                Object obj2 = lVar.f45318b;
                if (obj2 != null) {
                    fVar.put(obj2, lVar);
                }
            }
        }
    }
}
