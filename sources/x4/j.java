package x4;

import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;
public final class j extends k {
    public final Matrix f49341a;
    public final ArrayList f49342b;
    public float f49343c;
    public float d;
    public float f49344e;
    public float f49345f;
    public float f49346g;
    public float h;
    public float f49347i;
    public final Matrix f49348j;
    public String f49349k;

    public j() {
        this.f49341a = new Matrix();
        this.f49342b = new ArrayList();
        this.f49343c = 0.0f;
        this.d = 0.0f;
        this.f49344e = 0.0f;
        this.f49345f = 1.0f;
        this.f49346g = 1.0f;
        this.h = 0.0f;
        this.f49347i = 0.0f;
        this.f49348j = new Matrix();
        this.f49349k = null;
    }

    @Override
    public final boolean a() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f49342b;
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
            ArrayList arrayList = this.f49342b;
            if (i10 < arrayList.size()) {
                z10 |= ((k) arrayList.get(i10)).b(iArr);
                i10++;
            } else {
                return z10;
            }
        }
    }

    public final void c() {
        Matrix matrix = this.f49348j;
        matrix.reset();
        matrix.postTranslate(-this.d, -this.f49344e);
        matrix.postScale(this.f49345f, this.f49346g);
        matrix.postRotate(this.f49343c, 0.0f, 0.0f);
        matrix.postTranslate(this.h + this.d, this.f49347i + this.f49344e);
    }

    public String getGroupName() {
        return this.f49349k;
    }

    public Matrix getLocalMatrix() {
        return this.f49348j;
    }

    public float getPivotX() {
        return this.d;
    }

    public float getPivotY() {
        return this.f49344e;
    }

    public float getRotation() {
        return this.f49343c;
    }

    public float getScaleX() {
        return this.f49345f;
    }

    public float getScaleY() {
        return this.f49346g;
    }

    public float getTranslateX() {
        return this.h;
    }

    public float getTranslateY() {
        return this.f49347i;
    }

    public void setPivotX(float f7) {
        if (f7 != this.d) {
            this.d = f7;
            c();
        }
    }

    public void setPivotY(float f7) {
        if (f7 != this.f49344e) {
            this.f49344e = f7;
            c();
        }
    }

    public void setRotation(float f7) {
        if (f7 != this.f49343c) {
            this.f49343c = f7;
            c();
        }
    }

    public void setScaleX(float f7) {
        if (f7 != this.f49345f) {
            this.f49345f = f7;
            c();
        }
    }

    public void setScaleY(float f7) {
        if (f7 != this.f49346g) {
            this.f49346g = f7;
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
        if (f7 != this.f49347i) {
            this.f49347i = f7;
            c();
        }
    }

    public j(j jVar, a0.f fVar) {
        l lVar;
        this.f49341a = new Matrix();
        this.f49342b = new ArrayList();
        this.f49343c = 0.0f;
        this.d = 0.0f;
        this.f49344e = 0.0f;
        this.f49345f = 1.0f;
        this.f49346g = 1.0f;
        this.h = 0.0f;
        this.f49347i = 0.0f;
        Matrix matrix = new Matrix();
        this.f49348j = matrix;
        this.f49349k = null;
        this.f49343c = jVar.f49343c;
        this.d = jVar.d;
        this.f49344e = jVar.f49344e;
        this.f49345f = jVar.f49345f;
        this.f49346g = jVar.f49346g;
        this.h = jVar.h;
        this.f49347i = jVar.f49347i;
        String str = jVar.f49349k;
        this.f49349k = str;
        if (str != null) {
            fVar.put(str, this);
        }
        matrix.set(jVar.f49348j);
        ArrayList arrayList = jVar.f49342b;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            Object obj = arrayList.get(i10);
            if (obj instanceof j) {
                this.f49342b.add(new j((j) obj, fVar));
            } else {
                if (obj instanceof i) {
                    i iVar = (i) obj;
                    ?? lVar2 = new l(iVar);
                    lVar2.f49332e = 0.0f;
                    lVar2.f49334g = 1.0f;
                    lVar2.h = 1.0f;
                    lVar2.f49335i = 0.0f;
                    lVar2.f49336j = 1.0f;
                    lVar2.f49337k = 0.0f;
                    lVar2.f49338l = Paint.Cap.BUTT;
                    lVar2.f49339m = Paint.Join.MITER;
                    lVar2.f49340n = 4.0f;
                    lVar2.d = iVar.d;
                    lVar2.f49332e = iVar.f49332e;
                    lVar2.f49334g = iVar.f49334g;
                    lVar2.f49333f = iVar.f49333f;
                    lVar2.f49352c = iVar.f49352c;
                    lVar2.h = iVar.h;
                    lVar2.f49335i = iVar.f49335i;
                    lVar2.f49336j = iVar.f49336j;
                    lVar2.f49337k = iVar.f49337k;
                    lVar2.f49338l = iVar.f49338l;
                    lVar2.f49339m = iVar.f49339m;
                    lVar2.f49340n = iVar.f49340n;
                    lVar = lVar2;
                } else if (obj instanceof h) {
                    lVar = new l((h) obj);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.f49342b.add(lVar);
                Object obj2 = lVar.f49351b;
                if (obj2 != null) {
                    fVar.put(obj2, lVar);
                }
            }
        }
    }
}
