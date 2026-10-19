package x4;

import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;
public final class i extends j {
    public final Matrix f49243a;
    public final ArrayList f49244b;
    public float f49245c;
    public float d;
    public float e;
    public float f49246f;
    public float f49247g;
    public float h;
    public float f49248i;
    public final Matrix f49249j;
    public String f49250k;

    public i() {
        this.f49243a = new Matrix();
        this.f49244b = new ArrayList();
        this.f49245c = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f49246f = 1.0f;
        this.f49247g = 1.0f;
        this.h = 0.0f;
        this.f49248i = 0.0f;
        this.f49249j = new Matrix();
        this.f49250k = null;
    }

    @Override
    public final boolean a() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f49244b;
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
            ArrayList arrayList = this.f49244b;
            if (i10 < arrayList.size()) {
                z10 |= ((j) arrayList.get(i10)).b(iArr);
                i10++;
            } else {
                return z10;
            }
        }
    }

    public final void c() {
        Matrix matrix = this.f49249j;
        matrix.reset();
        matrix.postTranslate(-this.d, -this.e);
        matrix.postScale(this.f49246f, this.f49247g);
        matrix.postRotate(this.f49245c, 0.0f, 0.0f);
        matrix.postTranslate(this.h + this.d, this.f49248i + this.e);
    }

    public String getGroupName() {
        return this.f49250k;
    }

    public Matrix getLocalMatrix() {
        return this.f49249j;
    }

    public float getPivotX() {
        return this.d;
    }

    public float getPivotY() {
        return this.e;
    }

    public float getRotation() {
        return this.f49245c;
    }

    public float getScaleX() {
        return this.f49246f;
    }

    public float getScaleY() {
        return this.f49247g;
    }

    public float getTranslateX() {
        return this.h;
    }

    public float getTranslateY() {
        return this.f49248i;
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
        if (f7 != this.f49245c) {
            this.f49245c = f7;
            c();
        }
    }

    public void setScaleX(float f7) {
        if (f7 != this.f49246f) {
            this.f49246f = f7;
            c();
        }
    }

    public void setScaleY(float f7) {
        if (f7 != this.f49247g) {
            this.f49247g = f7;
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
        if (f7 != this.f49248i) {
            this.f49248i = f7;
            c();
        }
    }

    public i(i iVar, a0.f fVar) {
        k kVar;
        this.f49243a = new Matrix();
        this.f49244b = new ArrayList();
        this.f49245c = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f49246f = 1.0f;
        this.f49247g = 1.0f;
        this.h = 0.0f;
        this.f49248i = 0.0f;
        Matrix matrix = new Matrix();
        this.f49249j = matrix;
        this.f49250k = null;
        this.f49245c = iVar.f49245c;
        this.d = iVar.d;
        this.e = iVar.e;
        this.f49246f = iVar.f49246f;
        this.f49247g = iVar.f49247g;
        this.h = iVar.h;
        this.f49248i = iVar.f49248i;
        String str = iVar.f49250k;
        this.f49250k = str;
        if (str != null) {
            fVar.put(str, this);
        }
        matrix.set(iVar.f49249j);
        ArrayList arrayList = iVar.f49244b;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            Object obj = arrayList.get(i10);
            if (obj instanceof i) {
                this.f49244b.add(new i((i) obj, fVar));
            } else {
                if (obj instanceof h) {
                    h hVar = (h) obj;
                    ?? kVar2 = new k(hVar);
                    kVar2.e = 0.0f;
                    kVar2.f49236g = 1.0f;
                    kVar2.h = 1.0f;
                    kVar2.f49237i = 0.0f;
                    kVar2.f49238j = 1.0f;
                    kVar2.f49239k = 0.0f;
                    kVar2.f49240l = Paint.Cap.BUTT;
                    kVar2.f49241m = Paint.Join.MITER;
                    kVar2.f49242n = 4.0f;
                    kVar2.d = hVar.d;
                    kVar2.e = hVar.e;
                    kVar2.f49236g = hVar.f49236g;
                    kVar2.f49235f = hVar.f49235f;
                    kVar2.f49253c = hVar.f49253c;
                    kVar2.h = hVar.h;
                    kVar2.f49237i = hVar.f49237i;
                    kVar2.f49238j = hVar.f49238j;
                    kVar2.f49239k = hVar.f49239k;
                    kVar2.f49240l = hVar.f49240l;
                    kVar2.f49241m = hVar.f49241m;
                    kVar2.f49242n = hVar.f49242n;
                    kVar = kVar2;
                } else if (obj instanceof g) {
                    kVar = new k((g) obj);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.f49244b.add(kVar);
                Object obj2 = kVar.f49252b;
                if (obj2 != null) {
                    fVar.put(obj2, kVar);
                }
            }
        }
    }
}
