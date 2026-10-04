package x4;

import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;
public final class j extends k {
    public final Matrix f49325a;
    public final ArrayList f49326b;
    public float f49327c;
    public float d;
    public float f49328e;
    public float f49329f;
    public float f49330g;
    public float h;
    public float f49331i;
    public final Matrix f49332j;
    public String f49333k;

    public j() {
        this.f49325a = new Matrix();
        this.f49326b = new ArrayList();
        this.f49327c = 0.0f;
        this.d = 0.0f;
        this.f49328e = 0.0f;
        this.f49329f = 1.0f;
        this.f49330g = 1.0f;
        this.h = 0.0f;
        this.f49331i = 0.0f;
        this.f49332j = new Matrix();
        this.f49333k = null;
    }

    @Override
    public final boolean a() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f49326b;
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
            ArrayList arrayList = this.f49326b;
            if (i10 < arrayList.size()) {
                z10 |= ((k) arrayList.get(i10)).b(iArr);
                i10++;
            } else {
                return z10;
            }
        }
    }

    public final void c() {
        Matrix matrix = this.f49332j;
        matrix.reset();
        matrix.postTranslate(-this.d, -this.f49328e);
        matrix.postScale(this.f49329f, this.f49330g);
        matrix.postRotate(this.f49327c, 0.0f, 0.0f);
        matrix.postTranslate(this.h + this.d, this.f49331i + this.f49328e);
    }

    public String getGroupName() {
        return this.f49333k;
    }

    public Matrix getLocalMatrix() {
        return this.f49332j;
    }

    public float getPivotX() {
        return this.d;
    }

    public float getPivotY() {
        return this.f49328e;
    }

    public float getRotation() {
        return this.f49327c;
    }

    public float getScaleX() {
        return this.f49329f;
    }

    public float getScaleY() {
        return this.f49330g;
    }

    public float getTranslateX() {
        return this.h;
    }

    public float getTranslateY() {
        return this.f49331i;
    }

    public void setPivotX(float f7) {
        if (f7 != this.d) {
            this.d = f7;
            c();
        }
    }

    public void setPivotY(float f7) {
        if (f7 != this.f49328e) {
            this.f49328e = f7;
            c();
        }
    }

    public void setRotation(float f7) {
        if (f7 != this.f49327c) {
            this.f49327c = f7;
            c();
        }
    }

    public void setScaleX(float f7) {
        if (f7 != this.f49329f) {
            this.f49329f = f7;
            c();
        }
    }

    public void setScaleY(float f7) {
        if (f7 != this.f49330g) {
            this.f49330g = f7;
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
        if (f7 != this.f49331i) {
            this.f49331i = f7;
            c();
        }
    }

    public j(j jVar, a0.f fVar) {
        l lVar;
        this.f49325a = new Matrix();
        this.f49326b = new ArrayList();
        this.f49327c = 0.0f;
        this.d = 0.0f;
        this.f49328e = 0.0f;
        this.f49329f = 1.0f;
        this.f49330g = 1.0f;
        this.h = 0.0f;
        this.f49331i = 0.0f;
        Matrix matrix = new Matrix();
        this.f49332j = matrix;
        this.f49333k = null;
        this.f49327c = jVar.f49327c;
        this.d = jVar.d;
        this.f49328e = jVar.f49328e;
        this.f49329f = jVar.f49329f;
        this.f49330g = jVar.f49330g;
        this.h = jVar.h;
        this.f49331i = jVar.f49331i;
        String str = jVar.f49333k;
        this.f49333k = str;
        if (str != null) {
            fVar.put(str, this);
        }
        matrix.set(jVar.f49332j);
        ArrayList arrayList = jVar.f49326b;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            Object obj = arrayList.get(i10);
            if (obj instanceof j) {
                this.f49326b.add(new j((j) obj, fVar));
            } else {
                if (obj instanceof i) {
                    i iVar = (i) obj;
                    ?? lVar2 = new l(iVar);
                    lVar2.f49316e = 0.0f;
                    lVar2.f49318g = 1.0f;
                    lVar2.h = 1.0f;
                    lVar2.f49319i = 0.0f;
                    lVar2.f49320j = 1.0f;
                    lVar2.f49321k = 0.0f;
                    lVar2.f49322l = Paint.Cap.BUTT;
                    lVar2.f49323m = Paint.Join.MITER;
                    lVar2.f49324n = 4.0f;
                    lVar2.d = iVar.d;
                    lVar2.f49316e = iVar.f49316e;
                    lVar2.f49318g = iVar.f49318g;
                    lVar2.f49317f = iVar.f49317f;
                    lVar2.f49336c = iVar.f49336c;
                    lVar2.h = iVar.h;
                    lVar2.f49319i = iVar.f49319i;
                    lVar2.f49320j = iVar.f49320j;
                    lVar2.f49321k = iVar.f49321k;
                    lVar2.f49322l = iVar.f49322l;
                    lVar2.f49323m = iVar.f49323m;
                    lVar2.f49324n = iVar.f49324n;
                    lVar = lVar2;
                } else if (obj instanceof h) {
                    lVar = new l((h) obj);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.f49326b.add(lVar);
                Object obj2 = lVar.f49335b;
                if (obj2 != null) {
                    fVar.put(obj2, lVar);
                }
            }
        }
    }
}
