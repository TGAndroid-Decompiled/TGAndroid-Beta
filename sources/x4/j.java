package x4;

import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;
public final class j extends k {
    public final Matrix f48873a;
    public final ArrayList f48874b;
    public float f48875c;
    public float d;
    public float f48876e;
    public float f48877f;
    public float f48878g;
    public float h;
    public float f48879i;
    public final Matrix f48880j;
    public String f48881k;

    public j() {
        this.f48873a = new Matrix();
        this.f48874b = new ArrayList();
        this.f48875c = 0.0f;
        this.d = 0.0f;
        this.f48876e = 0.0f;
        this.f48877f = 1.0f;
        this.f48878g = 1.0f;
        this.h = 0.0f;
        this.f48879i = 0.0f;
        this.f48880j = new Matrix();
        this.f48881k = null;
    }

    @Override
    public final boolean a() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f48874b;
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
            ArrayList arrayList = this.f48874b;
            if (i10 < arrayList.size()) {
                z10 |= ((k) arrayList.get(i10)).b(iArr);
                i10++;
            } else {
                return z10;
            }
        }
    }

    public final void c() {
        Matrix matrix = this.f48880j;
        matrix.reset();
        matrix.postTranslate(-this.d, -this.f48876e);
        matrix.postScale(this.f48877f, this.f48878g);
        matrix.postRotate(this.f48875c, 0.0f, 0.0f);
        matrix.postTranslate(this.h + this.d, this.f48879i + this.f48876e);
    }

    public String getGroupName() {
        return this.f48881k;
    }

    public Matrix getLocalMatrix() {
        return this.f48880j;
    }

    public float getPivotX() {
        return this.d;
    }

    public float getPivotY() {
        return this.f48876e;
    }

    public float getRotation() {
        return this.f48875c;
    }

    public float getScaleX() {
        return this.f48877f;
    }

    public float getScaleY() {
        return this.f48878g;
    }

    public float getTranslateX() {
        return this.h;
    }

    public float getTranslateY() {
        return this.f48879i;
    }

    public void setPivotX(float f7) {
        if (f7 != this.d) {
            this.d = f7;
            c();
        }
    }

    public void setPivotY(float f7) {
        if (f7 != this.f48876e) {
            this.f48876e = f7;
            c();
        }
    }

    public void setRotation(float f7) {
        if (f7 != this.f48875c) {
            this.f48875c = f7;
            c();
        }
    }

    public void setScaleX(float f7) {
        if (f7 != this.f48877f) {
            this.f48877f = f7;
            c();
        }
    }

    public void setScaleY(float f7) {
        if (f7 != this.f48878g) {
            this.f48878g = f7;
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
        if (f7 != this.f48879i) {
            this.f48879i = f7;
            c();
        }
    }

    public j(j jVar, a0.f fVar) {
        l lVar;
        this.f48873a = new Matrix();
        this.f48874b = new ArrayList();
        this.f48875c = 0.0f;
        this.d = 0.0f;
        this.f48876e = 0.0f;
        this.f48877f = 1.0f;
        this.f48878g = 1.0f;
        this.h = 0.0f;
        this.f48879i = 0.0f;
        Matrix matrix = new Matrix();
        this.f48880j = matrix;
        this.f48881k = null;
        this.f48875c = jVar.f48875c;
        this.d = jVar.d;
        this.f48876e = jVar.f48876e;
        this.f48877f = jVar.f48877f;
        this.f48878g = jVar.f48878g;
        this.h = jVar.h;
        this.f48879i = jVar.f48879i;
        String str = jVar.f48881k;
        this.f48881k = str;
        if (str != null) {
            fVar.put(str, this);
        }
        matrix.set(jVar.f48880j);
        ArrayList arrayList = jVar.f48874b;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            Object obj = arrayList.get(i10);
            if (obj instanceof j) {
                this.f48874b.add(new j((j) obj, fVar));
            } else {
                if (obj instanceof i) {
                    i iVar = (i) obj;
                    ?? lVar2 = new l(iVar);
                    lVar2.f48864e = 0.0f;
                    lVar2.f48866g = 1.0f;
                    lVar2.h = 1.0f;
                    lVar2.f48867i = 0.0f;
                    lVar2.f48868j = 1.0f;
                    lVar2.f48869k = 0.0f;
                    lVar2.f48870l = Paint.Cap.BUTT;
                    lVar2.f48871m = Paint.Join.MITER;
                    lVar2.f48872n = 4.0f;
                    lVar2.d = iVar.d;
                    lVar2.f48864e = iVar.f48864e;
                    lVar2.f48866g = iVar.f48866g;
                    lVar2.f48865f = iVar.f48865f;
                    lVar2.f48884c = iVar.f48884c;
                    lVar2.h = iVar.h;
                    lVar2.f48867i = iVar.f48867i;
                    lVar2.f48868j = iVar.f48868j;
                    lVar2.f48869k = iVar.f48869k;
                    lVar2.f48870l = iVar.f48870l;
                    lVar2.f48871m = iVar.f48871m;
                    lVar2.f48872n = iVar.f48872n;
                    lVar = lVar2;
                } else if (obj instanceof h) {
                    lVar = new l((h) obj);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.f48874b.add(lVar);
                Object obj2 = lVar.f48883b;
                if (obj2 != null) {
                    fVar.put(obj2, lVar);
                }
            }
        }
    }
}
