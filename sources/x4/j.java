package x4;

import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;
public final class j extends k {
    public final Matrix f45603a;
    public final ArrayList f45604b;
    public float f45605c;
    public float d;
    public float e;
    public float f45606f;
    public float f45607g;
    public float h;
    public float f45608i;
    public final Matrix f45609j;
    public String f45610k;

    public j() {
        this.f45603a = new Matrix();
        this.f45604b = new ArrayList();
        this.f45605c = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f45606f = 1.0f;
        this.f45607g = 1.0f;
        this.h = 0.0f;
        this.f45608i = 0.0f;
        this.f45609j = new Matrix();
        this.f45610k = null;
    }

    @Override
    public final boolean a() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f45604b;
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
            ArrayList arrayList = this.f45604b;
            if (i10 < arrayList.size()) {
                z10 |= ((k) arrayList.get(i10)).b(iArr);
                i10++;
            } else {
                return z10;
            }
        }
    }

    public final void c() {
        Matrix matrix = this.f45609j;
        matrix.reset();
        matrix.postTranslate(-this.d, -this.e);
        matrix.postScale(this.f45606f, this.f45607g);
        matrix.postRotate(this.f45605c, 0.0f, 0.0f);
        matrix.postTranslate(this.h + this.d, this.f45608i + this.e);
    }

    public String getGroupName() {
        return this.f45610k;
    }

    public Matrix getLocalMatrix() {
        return this.f45609j;
    }

    public float getPivotX() {
        return this.d;
    }

    public float getPivotY() {
        return this.e;
    }

    public float getRotation() {
        return this.f45605c;
    }

    public float getScaleX() {
        return this.f45606f;
    }

    public float getScaleY() {
        return this.f45607g;
    }

    public float getTranslateX() {
        return this.h;
    }

    public float getTranslateY() {
        return this.f45608i;
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
        if (f7 != this.f45605c) {
            this.f45605c = f7;
            c();
        }
    }

    public void setScaleX(float f7) {
        if (f7 != this.f45606f) {
            this.f45606f = f7;
            c();
        }
    }

    public void setScaleY(float f7) {
        if (f7 != this.f45607g) {
            this.f45607g = f7;
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
        if (f7 != this.f45608i) {
            this.f45608i = f7;
            c();
        }
    }

    public j(j jVar, a0.f fVar) {
        l lVar;
        this.f45603a = new Matrix();
        this.f45604b = new ArrayList();
        this.f45605c = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f45606f = 1.0f;
        this.f45607g = 1.0f;
        this.h = 0.0f;
        this.f45608i = 0.0f;
        Matrix matrix = new Matrix();
        this.f45609j = matrix;
        this.f45610k = null;
        this.f45605c = jVar.f45605c;
        this.d = jVar.d;
        this.e = jVar.e;
        this.f45606f = jVar.f45606f;
        this.f45607g = jVar.f45607g;
        this.h = jVar.h;
        this.f45608i = jVar.f45608i;
        String str = jVar.f45610k;
        this.f45610k = str;
        if (str != null) {
            fVar.put(str, this);
        }
        matrix.set(jVar.f45609j);
        ArrayList arrayList = jVar.f45604b;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            Object obj = arrayList.get(i10);
            if (obj instanceof j) {
                this.f45604b.add(new j((j) obj, fVar));
            } else {
                if (obj instanceof i) {
                    i iVar = (i) obj;
                    ?? lVar2 = new l(iVar);
                    lVar2.e = 0.0f;
                    lVar2.f45596g = 1.0f;
                    lVar2.h = 1.0f;
                    lVar2.f45597i = 0.0f;
                    lVar2.f45598j = 1.0f;
                    lVar2.f45599k = 0.0f;
                    lVar2.f45600l = Paint.Cap.BUTT;
                    lVar2.f45601m = Paint.Join.MITER;
                    lVar2.f45602n = 4.0f;
                    lVar2.d = iVar.d;
                    lVar2.e = iVar.e;
                    lVar2.f45596g = iVar.f45596g;
                    lVar2.f45595f = iVar.f45595f;
                    lVar2.f45613c = iVar.f45613c;
                    lVar2.h = iVar.h;
                    lVar2.f45597i = iVar.f45597i;
                    lVar2.f45598j = iVar.f45598j;
                    lVar2.f45599k = iVar.f45599k;
                    lVar2.f45600l = iVar.f45600l;
                    lVar2.f45601m = iVar.f45601m;
                    lVar2.f45602n = iVar.f45602n;
                    lVar = lVar2;
                } else if (obj instanceof h) {
                    lVar = new l((h) obj);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.f45604b.add(lVar);
                Object obj2 = lVar.f45612b;
                if (obj2 != null) {
                    fVar.put(obj2, lVar);
                }
            }
        }
    }
}
