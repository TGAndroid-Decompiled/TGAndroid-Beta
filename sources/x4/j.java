package x4;

import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;
public final class j extends k {
    public final Matrix f45610a;
    public final ArrayList f45611b;
    public float f45612c;
    public float d;
    public float e;
    public float f45613f;
    public float f45614g;
    public float h;
    public float f45615i;
    public final Matrix f45616j;
    public String f45617k;

    public j() {
        this.f45610a = new Matrix();
        this.f45611b = new ArrayList();
        this.f45612c = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f45613f = 1.0f;
        this.f45614g = 1.0f;
        this.h = 0.0f;
        this.f45615i = 0.0f;
        this.f45616j = new Matrix();
        this.f45617k = null;
    }

    @Override
    public final boolean a() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f45611b;
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
            ArrayList arrayList = this.f45611b;
            if (i10 < arrayList.size()) {
                z10 |= ((k) arrayList.get(i10)).b(iArr);
                i10++;
            } else {
                return z10;
            }
        }
    }

    public final void c() {
        Matrix matrix = this.f45616j;
        matrix.reset();
        matrix.postTranslate(-this.d, -this.e);
        matrix.postScale(this.f45613f, this.f45614g);
        matrix.postRotate(this.f45612c, 0.0f, 0.0f);
        matrix.postTranslate(this.h + this.d, this.f45615i + this.e);
    }

    public String getGroupName() {
        return this.f45617k;
    }

    public Matrix getLocalMatrix() {
        return this.f45616j;
    }

    public float getPivotX() {
        return this.d;
    }

    public float getPivotY() {
        return this.e;
    }

    public float getRotation() {
        return this.f45612c;
    }

    public float getScaleX() {
        return this.f45613f;
    }

    public float getScaleY() {
        return this.f45614g;
    }

    public float getTranslateX() {
        return this.h;
    }

    public float getTranslateY() {
        return this.f45615i;
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
        if (f7 != this.f45612c) {
            this.f45612c = f7;
            c();
        }
    }

    public void setScaleX(float f7) {
        if (f7 != this.f45613f) {
            this.f45613f = f7;
            c();
        }
    }

    public void setScaleY(float f7) {
        if (f7 != this.f45614g) {
            this.f45614g = f7;
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
        if (f7 != this.f45615i) {
            this.f45615i = f7;
            c();
        }
    }

    public j(j jVar, a0.f fVar) {
        l lVar;
        this.f45610a = new Matrix();
        this.f45611b = new ArrayList();
        this.f45612c = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f45613f = 1.0f;
        this.f45614g = 1.0f;
        this.h = 0.0f;
        this.f45615i = 0.0f;
        Matrix matrix = new Matrix();
        this.f45616j = matrix;
        this.f45617k = null;
        this.f45612c = jVar.f45612c;
        this.d = jVar.d;
        this.e = jVar.e;
        this.f45613f = jVar.f45613f;
        this.f45614g = jVar.f45614g;
        this.h = jVar.h;
        this.f45615i = jVar.f45615i;
        String str = jVar.f45617k;
        this.f45617k = str;
        if (str != null) {
            fVar.put(str, this);
        }
        matrix.set(jVar.f45616j);
        ArrayList arrayList = jVar.f45611b;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            Object obj = arrayList.get(i10);
            if (obj instanceof j) {
                this.f45611b.add(new j((j) obj, fVar));
            } else {
                if (obj instanceof i) {
                    i iVar = (i) obj;
                    ?? lVar2 = new l(iVar);
                    lVar2.e = 0.0f;
                    lVar2.f45603g = 1.0f;
                    lVar2.h = 1.0f;
                    lVar2.f45604i = 0.0f;
                    lVar2.f45605j = 1.0f;
                    lVar2.f45606k = 0.0f;
                    lVar2.f45607l = Paint.Cap.BUTT;
                    lVar2.f45608m = Paint.Join.MITER;
                    lVar2.f45609n = 4.0f;
                    lVar2.d = iVar.d;
                    lVar2.e = iVar.e;
                    lVar2.f45603g = iVar.f45603g;
                    lVar2.f45602f = iVar.f45602f;
                    lVar2.f45620c = iVar.f45620c;
                    lVar2.h = iVar.h;
                    lVar2.f45604i = iVar.f45604i;
                    lVar2.f45605j = iVar.f45605j;
                    lVar2.f45606k = iVar.f45606k;
                    lVar2.f45607l = iVar.f45607l;
                    lVar2.f45608m = iVar.f45608m;
                    lVar2.f45609n = iVar.f45609n;
                    lVar = lVar2;
                } else if (obj instanceof h) {
                    lVar = new l((h) obj);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.f45611b.add(lVar);
                Object obj2 = lVar.f45619b;
                if (obj2 != null) {
                    fVar.put(obj2, lVar);
                }
            }
        }
    }
}
