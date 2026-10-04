package x4;

import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;
public final class j extends k {
    public final Matrix f49326a;
    public final ArrayList f49327b;
    public float f49328c;
    public float d;
    public float f49329e;
    public float f49330f;
    public float f49331g;
    public float h;
    public float f49332i;
    public final Matrix f49333j;
    public String f49334k;

    public j() {
        this.f49326a = new Matrix();
        this.f49327b = new ArrayList();
        this.f49328c = 0.0f;
        this.d = 0.0f;
        this.f49329e = 0.0f;
        this.f49330f = 1.0f;
        this.f49331g = 1.0f;
        this.h = 0.0f;
        this.f49332i = 0.0f;
        this.f49333j = new Matrix();
        this.f49334k = null;
    }

    @Override
    public final boolean a() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f49327b;
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
            ArrayList arrayList = this.f49327b;
            if (i10 < arrayList.size()) {
                z10 |= ((k) arrayList.get(i10)).b(iArr);
                i10++;
            } else {
                return z10;
            }
        }
    }

    public final void c() {
        Matrix matrix = this.f49333j;
        matrix.reset();
        matrix.postTranslate(-this.d, -this.f49329e);
        matrix.postScale(this.f49330f, this.f49331g);
        matrix.postRotate(this.f49328c, 0.0f, 0.0f);
        matrix.postTranslate(this.h + this.d, this.f49332i + this.f49329e);
    }

    public String getGroupName() {
        return this.f49334k;
    }

    public Matrix getLocalMatrix() {
        return this.f49333j;
    }

    public float getPivotX() {
        return this.d;
    }

    public float getPivotY() {
        return this.f49329e;
    }

    public float getRotation() {
        return this.f49328c;
    }

    public float getScaleX() {
        return this.f49330f;
    }

    public float getScaleY() {
        return this.f49331g;
    }

    public float getTranslateX() {
        return this.h;
    }

    public float getTranslateY() {
        return this.f49332i;
    }

    public void setPivotX(float f7) {
        if (f7 != this.d) {
            this.d = f7;
            c();
        }
    }

    public void setPivotY(float f7) {
        if (f7 != this.f49329e) {
            this.f49329e = f7;
            c();
        }
    }

    public void setRotation(float f7) {
        if (f7 != this.f49328c) {
            this.f49328c = f7;
            c();
        }
    }

    public void setScaleX(float f7) {
        if (f7 != this.f49330f) {
            this.f49330f = f7;
            c();
        }
    }

    public void setScaleY(float f7) {
        if (f7 != this.f49331g) {
            this.f49331g = f7;
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
        if (f7 != this.f49332i) {
            this.f49332i = f7;
            c();
        }
    }

    public j(j jVar, a0.f fVar) {
        l lVar;
        this.f49326a = new Matrix();
        this.f49327b = new ArrayList();
        this.f49328c = 0.0f;
        this.d = 0.0f;
        this.f49329e = 0.0f;
        this.f49330f = 1.0f;
        this.f49331g = 1.0f;
        this.h = 0.0f;
        this.f49332i = 0.0f;
        Matrix matrix = new Matrix();
        this.f49333j = matrix;
        this.f49334k = null;
        this.f49328c = jVar.f49328c;
        this.d = jVar.d;
        this.f49329e = jVar.f49329e;
        this.f49330f = jVar.f49330f;
        this.f49331g = jVar.f49331g;
        this.h = jVar.h;
        this.f49332i = jVar.f49332i;
        String str = jVar.f49334k;
        this.f49334k = str;
        if (str != null) {
            fVar.put(str, this);
        }
        matrix.set(jVar.f49333j);
        ArrayList arrayList = jVar.f49327b;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            Object obj = arrayList.get(i10);
            if (obj instanceof j) {
                this.f49327b.add(new j((j) obj, fVar));
            } else {
                if (obj instanceof i) {
                    i iVar = (i) obj;
                    ?? lVar2 = new l(iVar);
                    lVar2.f49317e = 0.0f;
                    lVar2.f49319g = 1.0f;
                    lVar2.h = 1.0f;
                    lVar2.f49320i = 0.0f;
                    lVar2.f49321j = 1.0f;
                    lVar2.f49322k = 0.0f;
                    lVar2.f49323l = Paint.Cap.BUTT;
                    lVar2.f49324m = Paint.Join.MITER;
                    lVar2.f49325n = 4.0f;
                    lVar2.d = iVar.d;
                    lVar2.f49317e = iVar.f49317e;
                    lVar2.f49319g = iVar.f49319g;
                    lVar2.f49318f = iVar.f49318f;
                    lVar2.f49337c = iVar.f49337c;
                    lVar2.h = iVar.h;
                    lVar2.f49320i = iVar.f49320i;
                    lVar2.f49321j = iVar.f49321j;
                    lVar2.f49322k = iVar.f49322k;
                    lVar2.f49323l = iVar.f49323l;
                    lVar2.f49324m = iVar.f49324m;
                    lVar2.f49325n = iVar.f49325n;
                    lVar = lVar2;
                } else if (obj instanceof h) {
                    lVar = new l((h) obj);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.f49327b.add(lVar);
                Object obj2 = lVar.f49336b;
                if (obj2 != null) {
                    fVar.put(obj2, lVar);
                }
            }
        }
    }
}
