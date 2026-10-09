package x4;

import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;
public final class i extends j {
    public final Matrix f50618a;
    public final ArrayList f50619b;
    public float f50620c;
    public float d;
    public float f50621e;
    public float f50622f;
    public float f50623g;
    public float h;
    public float f50624i;
    public final Matrix f50625j;
    public String f50626k;

    public i() {
        this.f50618a = new Matrix();
        this.f50619b = new ArrayList();
        this.f50620c = 0.0f;
        this.d = 0.0f;
        this.f50621e = 0.0f;
        this.f50622f = 1.0f;
        this.f50623g = 1.0f;
        this.h = 0.0f;
        this.f50624i = 0.0f;
        this.f50625j = new Matrix();
        this.f50626k = null;
    }

    @Override
    public final boolean a() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f50619b;
            if (i10 >= arrayList.size()) {
                return false;
            }
            if (((j) arrayList.get(i10)).a()) {
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
            ArrayList arrayList = this.f50619b;
            if (i10 < arrayList.size()) {
                z10 |= ((j) arrayList.get(i10)).b(iArr);
                i10++;
            } else {
                return z10;
            }
        }
    }

    public final void c() {
        Matrix matrix = this.f50625j;
        matrix.reset();
        matrix.postTranslate(-this.d, -this.f50621e);
        matrix.postScale(this.f50622f, this.f50623g);
        matrix.postRotate(this.f50620c, 0.0f, 0.0f);
        matrix.postTranslate(this.h + this.d, this.f50624i + this.f50621e);
    }

    public String getGroupName() {
        return this.f50626k;
    }

    public Matrix getLocalMatrix() {
        return this.f50625j;
    }

    public float getPivotX() {
        return this.d;
    }

    public float getPivotY() {
        return this.f50621e;
    }

    public float getRotation() {
        return this.f50620c;
    }

    public float getScaleX() {
        return this.f50622f;
    }

    public float getScaleY() {
        return this.f50623g;
    }

    public float getTranslateX() {
        return this.h;
    }

    public float getTranslateY() {
        return this.f50624i;
    }

    public void setPivotX(float f7) {
        if (f7 != this.d) {
            this.d = f7;
            c();
        }
    }

    public void setPivotY(float f7) {
        if (f7 != this.f50621e) {
            this.f50621e = f7;
            c();
        }
    }

    public void setRotation(float f7) {
        if (f7 != this.f50620c) {
            this.f50620c = f7;
            c();
        }
    }

    public void setScaleX(float f7) {
        if (f7 != this.f50622f) {
            this.f50622f = f7;
            c();
        }
    }

    public void setScaleY(float f7) {
        if (f7 != this.f50623g) {
            this.f50623g = f7;
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
        if (f7 != this.f50624i) {
            this.f50624i = f7;
            c();
        }
    }

    public i(i iVar, a0.f fVar) {
        k kVar;
        this.f50618a = new Matrix();
        this.f50619b = new ArrayList();
        this.f50620c = 0.0f;
        this.d = 0.0f;
        this.f50621e = 0.0f;
        this.f50622f = 1.0f;
        this.f50623g = 1.0f;
        this.h = 0.0f;
        this.f50624i = 0.0f;
        Matrix matrix = new Matrix();
        this.f50625j = matrix;
        this.f50626k = null;
        this.f50620c = iVar.f50620c;
        this.d = iVar.d;
        this.f50621e = iVar.f50621e;
        this.f50622f = iVar.f50622f;
        this.f50623g = iVar.f50623g;
        this.h = iVar.h;
        this.f50624i = iVar.f50624i;
        String str = iVar.f50626k;
        this.f50626k = str;
        if (str != null) {
            fVar.put(str, this);
        }
        matrix.set(iVar.f50625j);
        ArrayList arrayList = iVar.f50619b;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            Object obj = arrayList.get(i10);
            if (obj instanceof i) {
                this.f50619b.add(new i((i) obj, fVar));
            } else {
                if (obj instanceof h) {
                    h hVar = (h) obj;
                    ?? kVar2 = new k(hVar);
                    kVar2.f50609e = 0.0f;
                    kVar2.f50611g = 1.0f;
                    kVar2.h = 1.0f;
                    kVar2.f50612i = 0.0f;
                    kVar2.f50613j = 1.0f;
                    kVar2.f50614k = 0.0f;
                    kVar2.f50615l = Paint.Cap.BUTT;
                    kVar2.f50616m = Paint.Join.MITER;
                    kVar2.f50617n = 4.0f;
                    kVar2.d = hVar.d;
                    kVar2.f50609e = hVar.f50609e;
                    kVar2.f50611g = hVar.f50611g;
                    kVar2.f50610f = hVar.f50610f;
                    kVar2.f50629c = hVar.f50629c;
                    kVar2.h = hVar.h;
                    kVar2.f50612i = hVar.f50612i;
                    kVar2.f50613j = hVar.f50613j;
                    kVar2.f50614k = hVar.f50614k;
                    kVar2.f50615l = hVar.f50615l;
                    kVar2.f50616m = hVar.f50616m;
                    kVar2.f50617n = hVar.f50617n;
                    kVar = kVar2;
                } else if (obj instanceof g) {
                    kVar = new k((g) obj);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.f50619b.add(kVar);
                Object obj2 = kVar.f50628b;
                if (obj2 != null) {
                    fVar.put(obj2, kVar);
                }
            }
        }
    }
}
