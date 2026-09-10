package x4;

import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;
public final class j extends k {
    public final Matrix f44626a;
    public final ArrayList f44627b;
    public float f44628c;
    public float d;
    public float e;
    public float f44629f;
    public float f44630g;
    public float h;
    public float f44631i;
    public final Matrix f44632j;
    public String f44633k;

    public j() {
        this.f44626a = new Matrix();
        this.f44627b = new ArrayList();
        this.f44628c = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f44629f = 1.0f;
        this.f44630g = 1.0f;
        this.h = 0.0f;
        this.f44631i = 0.0f;
        this.f44632j = new Matrix();
        this.f44633k = null;
    }

    @Override
    public final boolean a() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f44627b;
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
            ArrayList arrayList = this.f44627b;
            if (i10 < arrayList.size()) {
                z10 |= ((k) arrayList.get(i10)).b(iArr);
                i10++;
            } else {
                return z10;
            }
        }
    }

    public final void c() {
        Matrix matrix = this.f44632j;
        matrix.reset();
        matrix.postTranslate(-this.d, -this.e);
        matrix.postScale(this.f44629f, this.f44630g);
        matrix.postRotate(this.f44628c, 0.0f, 0.0f);
        matrix.postTranslate(this.h + this.d, this.f44631i + this.e);
    }

    public String getGroupName() {
        return this.f44633k;
    }

    public Matrix getLocalMatrix() {
        return this.f44632j;
    }

    public float getPivotX() {
        return this.d;
    }

    public float getPivotY() {
        return this.e;
    }

    public float getRotation() {
        return this.f44628c;
    }

    public float getScaleX() {
        return this.f44629f;
    }

    public float getScaleY() {
        return this.f44630g;
    }

    public float getTranslateX() {
        return this.h;
    }

    public float getTranslateY() {
        return this.f44631i;
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
        if (f7 != this.f44628c) {
            this.f44628c = f7;
            c();
        }
    }

    public void setScaleX(float f7) {
        if (f7 != this.f44629f) {
            this.f44629f = f7;
            c();
        }
    }

    public void setScaleY(float f7) {
        if (f7 != this.f44630g) {
            this.f44630g = f7;
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
        if (f7 != this.f44631i) {
            this.f44631i = f7;
            c();
        }
    }

    public j(j jVar, a0.f fVar) {
        l lVar;
        this.f44626a = new Matrix();
        this.f44627b = new ArrayList();
        this.f44628c = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f44629f = 1.0f;
        this.f44630g = 1.0f;
        this.h = 0.0f;
        this.f44631i = 0.0f;
        Matrix matrix = new Matrix();
        this.f44632j = matrix;
        this.f44633k = null;
        this.f44628c = jVar.f44628c;
        this.d = jVar.d;
        this.e = jVar.e;
        this.f44629f = jVar.f44629f;
        this.f44630g = jVar.f44630g;
        this.h = jVar.h;
        this.f44631i = jVar.f44631i;
        String str = jVar.f44633k;
        this.f44633k = str;
        if (str != null) {
            fVar.put(str, this);
        }
        matrix.set(jVar.f44632j);
        ArrayList arrayList = jVar.f44627b;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            Object obj = arrayList.get(i10);
            if (obj instanceof j) {
                this.f44627b.add(new j((j) obj, fVar));
            } else {
                if (obj instanceof i) {
                    i iVar = (i) obj;
                    ?? lVar2 = new l(iVar);
                    lVar2.e = 0.0f;
                    lVar2.f44619g = 1.0f;
                    lVar2.h = 1.0f;
                    lVar2.f44620i = 0.0f;
                    lVar2.f44621j = 1.0f;
                    lVar2.f44622k = 0.0f;
                    lVar2.f44623l = Paint.Cap.BUTT;
                    lVar2.f44624m = Paint.Join.MITER;
                    lVar2.f44625n = 4.0f;
                    lVar2.d = iVar.d;
                    lVar2.e = iVar.e;
                    lVar2.f44619g = iVar.f44619g;
                    lVar2.f44618f = iVar.f44618f;
                    lVar2.f44636c = iVar.f44636c;
                    lVar2.h = iVar.h;
                    lVar2.f44620i = iVar.f44620i;
                    lVar2.f44621j = iVar.f44621j;
                    lVar2.f44622k = iVar.f44622k;
                    lVar2.f44623l = iVar.f44623l;
                    lVar2.f44624m = iVar.f44624m;
                    lVar2.f44625n = iVar.f44625n;
                    lVar = lVar2;
                } else if (obj instanceof h) {
                    lVar = new l((h) obj);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.f44627b.add(lVar);
                Object obj2 = lVar.f44635b;
                if (obj2 != null) {
                    fVar.put(obj2, lVar);
                }
            }
        }
    }
}
