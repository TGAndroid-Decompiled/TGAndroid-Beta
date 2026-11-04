package z4;

import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;
public final class i extends j {
    public final Matrix f59721a;
    public final ArrayList f59722b;
    public float f59723c;
    public float d;
    public float f59724e;
    public float f59725f;
    public float f59726g;
    public float h;
    public float f59727i;
    public final Matrix f59728j;
    public String f59729k;

    public i() {
        this.f59721a = new Matrix();
        this.f59722b = new ArrayList();
        this.f59723c = 0.0f;
        this.d = 0.0f;
        this.f59724e = 0.0f;
        this.f59725f = 1.0f;
        this.f59726g = 1.0f;
        this.h = 0.0f;
        this.f59727i = 0.0f;
        this.f59728j = new Matrix();
        this.f59729k = null;
    }

    @Override
    public final boolean a() {
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.f59722b;
            if (i3 >= arrayList.size()) {
                return false;
            }
            if (((j) arrayList.get(i3)).a()) {
                return true;
            }
            i3++;
        }
    }

    @Override
    public final boolean b(int[] iArr) {
        int i3 = 0;
        boolean z10 = false;
        while (true) {
            ArrayList arrayList = this.f59722b;
            if (i3 < arrayList.size()) {
                z10 |= ((j) arrayList.get(i3)).b(iArr);
                i3++;
            } else {
                return z10;
            }
        }
    }

    public final void c() {
        Matrix matrix = this.f59728j;
        matrix.reset();
        matrix.postTranslate(-this.d, -this.f59724e);
        matrix.postScale(this.f59725f, this.f59726g);
        matrix.postRotate(this.f59723c, 0.0f, 0.0f);
        matrix.postTranslate(this.h + this.d, this.f59727i + this.f59724e);
    }

    public String getGroupName() {
        return this.f59729k;
    }

    public Matrix getLocalMatrix() {
        return this.f59728j;
    }

    public float getPivotX() {
        return this.d;
    }

    public float getPivotY() {
        return this.f59724e;
    }

    public float getRotation() {
        return this.f59723c;
    }

    public float getScaleX() {
        return this.f59725f;
    }

    public float getScaleY() {
        return this.f59726g;
    }

    public float getTranslateX() {
        return this.h;
    }

    public float getTranslateY() {
        return this.f59727i;
    }

    public void setPivotX(float f10) {
        if (f10 != this.d) {
            this.d = f10;
            c();
        }
    }

    public void setPivotY(float f10) {
        if (f10 != this.f59724e) {
            this.f59724e = f10;
            c();
        }
    }

    public void setRotation(float f10) {
        if (f10 != this.f59723c) {
            this.f59723c = f10;
            c();
        }
    }

    public void setScaleX(float f10) {
        if (f10 != this.f59725f) {
            this.f59725f = f10;
            c();
        }
    }

    public void setScaleY(float f10) {
        if (f10 != this.f59726g) {
            this.f59726g = f10;
            c();
        }
    }

    public void setTranslateX(float f10) {
        if (f10 != this.h) {
            this.h = f10;
            c();
        }
    }

    public void setTranslateY(float f10) {
        if (f10 != this.f59727i) {
            this.f59727i = f10;
            c();
        }
    }

    public i(i iVar, a0.f fVar) {
        k kVar;
        this.f59721a = new Matrix();
        this.f59722b = new ArrayList();
        this.f59723c = 0.0f;
        this.d = 0.0f;
        this.f59724e = 0.0f;
        this.f59725f = 1.0f;
        this.f59726g = 1.0f;
        this.h = 0.0f;
        this.f59727i = 0.0f;
        Matrix matrix = new Matrix();
        this.f59728j = matrix;
        this.f59729k = null;
        this.f59723c = iVar.f59723c;
        this.d = iVar.d;
        this.f59724e = iVar.f59724e;
        this.f59725f = iVar.f59725f;
        this.f59726g = iVar.f59726g;
        this.h = iVar.h;
        this.f59727i = iVar.f59727i;
        String str = iVar.f59729k;
        this.f59729k = str;
        if (str != null) {
            fVar.put(str, this);
        }
        matrix.set(iVar.f59728j);
        ArrayList arrayList = iVar.f59722b;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            Object obj = arrayList.get(i3);
            if (obj instanceof i) {
                this.f59722b.add(new i((i) obj, fVar));
            } else {
                if (obj instanceof h) {
                    h hVar = (h) obj;
                    ?? kVar2 = new k(hVar);
                    kVar2.f59712e = 0.0f;
                    kVar2.f59714g = 1.0f;
                    kVar2.h = 1.0f;
                    kVar2.f59715i = 0.0f;
                    kVar2.f59716j = 1.0f;
                    kVar2.f59717k = 0.0f;
                    kVar2.f59718l = Paint.Cap.BUTT;
                    kVar2.f59719m = Paint.Join.MITER;
                    kVar2.f59720n = 4.0f;
                    kVar2.d = hVar.d;
                    kVar2.f59712e = hVar.f59712e;
                    kVar2.f59714g = hVar.f59714g;
                    kVar2.f59713f = hVar.f59713f;
                    kVar2.f59732c = hVar.f59732c;
                    kVar2.h = hVar.h;
                    kVar2.f59715i = hVar.f59715i;
                    kVar2.f59716j = hVar.f59716j;
                    kVar2.f59717k = hVar.f59717k;
                    kVar2.f59718l = hVar.f59718l;
                    kVar2.f59719m = hVar.f59719m;
                    kVar2.f59720n = hVar.f59720n;
                    kVar = kVar2;
                } else if (obj instanceof g) {
                    kVar = new k((g) obj);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.f59722b.add(kVar);
                Object obj2 = kVar.f59731b;
                if (obj2 != null) {
                    fVar.put(obj2, kVar);
                }
            }
        }
    }
}
