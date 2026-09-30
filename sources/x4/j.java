package x4;

import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;
public final class j extends k {
    public final Matrix f45672a;
    public final ArrayList f45673b;
    public float f45674c;
    public float d;
    public float e;
    public float f45675f;
    public float f45676g;
    public float h;
    public float f45677i;
    public final Matrix f45678j;
    public String f45679k;

    public j() {
        this.f45672a = new Matrix();
        this.f45673b = new ArrayList();
        this.f45674c = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f45675f = 1.0f;
        this.f45676g = 1.0f;
        this.h = 0.0f;
        this.f45677i = 0.0f;
        this.f45678j = new Matrix();
        this.f45679k = null;
    }

    @Override
    public final boolean a() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f45673b;
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
            ArrayList arrayList = this.f45673b;
            if (i10 < arrayList.size()) {
                z10 |= ((k) arrayList.get(i10)).b(iArr);
                i10++;
            } else {
                return z10;
            }
        }
    }

    public final void c() {
        Matrix matrix = this.f45678j;
        matrix.reset();
        matrix.postTranslate(-this.d, -this.e);
        matrix.postScale(this.f45675f, this.f45676g);
        matrix.postRotate(this.f45674c, 0.0f, 0.0f);
        matrix.postTranslate(this.h + this.d, this.f45677i + this.e);
    }

    public String getGroupName() {
        return this.f45679k;
    }

    public Matrix getLocalMatrix() {
        return this.f45678j;
    }

    public float getPivotX() {
        return this.d;
    }

    public float getPivotY() {
        return this.e;
    }

    public float getRotation() {
        return this.f45674c;
    }

    public float getScaleX() {
        return this.f45675f;
    }

    public float getScaleY() {
        return this.f45676g;
    }

    public float getTranslateX() {
        return this.h;
    }

    public float getTranslateY() {
        return this.f45677i;
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
        if (f7 != this.f45674c) {
            this.f45674c = f7;
            c();
        }
    }

    public void setScaleX(float f7) {
        if (f7 != this.f45675f) {
            this.f45675f = f7;
            c();
        }
    }

    public void setScaleY(float f7) {
        if (f7 != this.f45676g) {
            this.f45676g = f7;
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
        if (f7 != this.f45677i) {
            this.f45677i = f7;
            c();
        }
    }

    public j(j jVar, a0.f fVar) {
        l lVar;
        this.f45672a = new Matrix();
        this.f45673b = new ArrayList();
        this.f45674c = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f45675f = 1.0f;
        this.f45676g = 1.0f;
        this.h = 0.0f;
        this.f45677i = 0.0f;
        Matrix matrix = new Matrix();
        this.f45678j = matrix;
        this.f45679k = null;
        this.f45674c = jVar.f45674c;
        this.d = jVar.d;
        this.e = jVar.e;
        this.f45675f = jVar.f45675f;
        this.f45676g = jVar.f45676g;
        this.h = jVar.h;
        this.f45677i = jVar.f45677i;
        String str = jVar.f45679k;
        this.f45679k = str;
        if (str != null) {
            fVar.put(str, this);
        }
        matrix.set(jVar.f45678j);
        ArrayList arrayList = jVar.f45673b;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            Object obj = arrayList.get(i10);
            if (obj instanceof j) {
                this.f45673b.add(new j((j) obj, fVar));
            } else {
                if (obj instanceof i) {
                    i iVar = (i) obj;
                    ?? lVar2 = new l(iVar);
                    lVar2.e = 0.0f;
                    lVar2.f45665g = 1.0f;
                    lVar2.h = 1.0f;
                    lVar2.f45666i = 0.0f;
                    lVar2.f45667j = 1.0f;
                    lVar2.f45668k = 0.0f;
                    lVar2.f45669l = Paint.Cap.BUTT;
                    lVar2.f45670m = Paint.Join.MITER;
                    lVar2.f45671n = 4.0f;
                    lVar2.d = iVar.d;
                    lVar2.e = iVar.e;
                    lVar2.f45665g = iVar.f45665g;
                    lVar2.f45664f = iVar.f45664f;
                    lVar2.f45682c = iVar.f45682c;
                    lVar2.h = iVar.h;
                    lVar2.f45666i = iVar.f45666i;
                    lVar2.f45667j = iVar.f45667j;
                    lVar2.f45668k = iVar.f45668k;
                    lVar2.f45669l = iVar.f45669l;
                    lVar2.f45670m = iVar.f45670m;
                    lVar2.f45671n = iVar.f45671n;
                    lVar = lVar2;
                } else if (obj instanceof h) {
                    lVar = new l((h) obj);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.f45673b.add(lVar);
                Object obj2 = lVar.f45681b;
                if (obj2 != null) {
                    fVar.put(obj2, lVar);
                }
            }
        }
    }
}
