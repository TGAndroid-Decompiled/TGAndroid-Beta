package x4;

import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;
public final class i extends j {
    public final Matrix f50616a;
    public final ArrayList f50617b;
    public float f50618c;
    public float d;
    public float f50619e;
    public float f50620f;
    public float f50621g;
    public float h;
    public float f50622i;
    public final Matrix f50623j;
    public String f50624k;

    public i() {
        this.f50616a = new Matrix();
        this.f50617b = new ArrayList();
        this.f50618c = 0.0f;
        this.d = 0.0f;
        this.f50619e = 0.0f;
        this.f50620f = 1.0f;
        this.f50621g = 1.0f;
        this.h = 0.0f;
        this.f50622i = 0.0f;
        this.f50623j = new Matrix();
        this.f50624k = null;
    }

    @Override
    public final boolean a() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f50617b;
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
            ArrayList arrayList = this.f50617b;
            if (i10 < arrayList.size()) {
                z10 |= ((j) arrayList.get(i10)).b(iArr);
                i10++;
            } else {
                return z10;
            }
        }
    }

    public final void c() {
        Matrix matrix = this.f50623j;
        matrix.reset();
        matrix.postTranslate(-this.d, -this.f50619e);
        matrix.postScale(this.f50620f, this.f50621g);
        matrix.postRotate(this.f50618c, 0.0f, 0.0f);
        matrix.postTranslate(this.h + this.d, this.f50622i + this.f50619e);
    }

    public String getGroupName() {
        return this.f50624k;
    }

    public Matrix getLocalMatrix() {
        return this.f50623j;
    }

    public float getPivotX() {
        return this.d;
    }

    public float getPivotY() {
        return this.f50619e;
    }

    public float getRotation() {
        return this.f50618c;
    }

    public float getScaleX() {
        return this.f50620f;
    }

    public float getScaleY() {
        return this.f50621g;
    }

    public float getTranslateX() {
        return this.h;
    }

    public float getTranslateY() {
        return this.f50622i;
    }

    public void setPivotX(float f7) {
        if (f7 != this.d) {
            this.d = f7;
            c();
        }
    }

    public void setPivotY(float f7) {
        if (f7 != this.f50619e) {
            this.f50619e = f7;
            c();
        }
    }

    public void setRotation(float f7) {
        if (f7 != this.f50618c) {
            this.f50618c = f7;
            c();
        }
    }

    public void setScaleX(float f7) {
        if (f7 != this.f50620f) {
            this.f50620f = f7;
            c();
        }
    }

    public void setScaleY(float f7) {
        if (f7 != this.f50621g) {
            this.f50621g = f7;
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
        if (f7 != this.f50622i) {
            this.f50622i = f7;
            c();
        }
    }

    public i(i iVar, a0.f fVar) {
        k kVar;
        this.f50616a = new Matrix();
        this.f50617b = new ArrayList();
        this.f50618c = 0.0f;
        this.d = 0.0f;
        this.f50619e = 0.0f;
        this.f50620f = 1.0f;
        this.f50621g = 1.0f;
        this.h = 0.0f;
        this.f50622i = 0.0f;
        Matrix matrix = new Matrix();
        this.f50623j = matrix;
        this.f50624k = null;
        this.f50618c = iVar.f50618c;
        this.d = iVar.d;
        this.f50619e = iVar.f50619e;
        this.f50620f = iVar.f50620f;
        this.f50621g = iVar.f50621g;
        this.h = iVar.h;
        this.f50622i = iVar.f50622i;
        String str = iVar.f50624k;
        this.f50624k = str;
        if (str != null) {
            fVar.put(str, this);
        }
        matrix.set(iVar.f50623j);
        ArrayList arrayList = iVar.f50617b;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            Object obj = arrayList.get(i10);
            if (obj instanceof i) {
                this.f50617b.add(new i((i) obj, fVar));
            } else {
                if (obj instanceof h) {
                    h hVar = (h) obj;
                    ?? kVar2 = new k(hVar);
                    kVar2.f50607e = 0.0f;
                    kVar2.f50609g = 1.0f;
                    kVar2.h = 1.0f;
                    kVar2.f50610i = 0.0f;
                    kVar2.f50611j = 1.0f;
                    kVar2.f50612k = 0.0f;
                    kVar2.f50613l = Paint.Cap.BUTT;
                    kVar2.f50614m = Paint.Join.MITER;
                    kVar2.f50615n = 4.0f;
                    kVar2.d = hVar.d;
                    kVar2.f50607e = hVar.f50607e;
                    kVar2.f50609g = hVar.f50609g;
                    kVar2.f50608f = hVar.f50608f;
                    kVar2.f50627c = hVar.f50627c;
                    kVar2.h = hVar.h;
                    kVar2.f50610i = hVar.f50610i;
                    kVar2.f50611j = hVar.f50611j;
                    kVar2.f50612k = hVar.f50612k;
                    kVar2.f50613l = hVar.f50613l;
                    kVar2.f50614m = hVar.f50614m;
                    kVar2.f50615n = hVar.f50615n;
                    kVar = kVar2;
                } else if (obj instanceof g) {
                    kVar = new k((g) obj);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.f50617b.add(kVar);
                Object obj2 = kVar.f50626b;
                if (obj2 != null) {
                    fVar.put(obj2, kVar);
                }
            }
        }
    }
}
