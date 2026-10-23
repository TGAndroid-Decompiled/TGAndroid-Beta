package x4;

import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;
public final class i extends j {
    public final Matrix f49254a;
    public final ArrayList f49255b;
    public float f49256c;
    public float d;
    public float e;
    public float f49257f;
    public float f49258g;
    public float h;
    public float f49259i;
    public final Matrix f49260j;
    public String f49261k;

    public i() {
        this.f49254a = new Matrix();
        this.f49255b = new ArrayList();
        this.f49256c = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f49257f = 1.0f;
        this.f49258g = 1.0f;
        this.h = 0.0f;
        this.f49259i = 0.0f;
        this.f49260j = new Matrix();
        this.f49261k = null;
    }

    @Override
    public final boolean a() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f49255b;
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
            ArrayList arrayList = this.f49255b;
            if (i10 < arrayList.size()) {
                z10 |= ((j) arrayList.get(i10)).b(iArr);
                i10++;
            } else {
                return z10;
            }
        }
    }

    public final void c() {
        Matrix matrix = this.f49260j;
        matrix.reset();
        matrix.postTranslate(-this.d, -this.e);
        matrix.postScale(this.f49257f, this.f49258g);
        matrix.postRotate(this.f49256c, 0.0f, 0.0f);
        matrix.postTranslate(this.h + this.d, this.f49259i + this.e);
    }

    public String getGroupName() {
        return this.f49261k;
    }

    public Matrix getLocalMatrix() {
        return this.f49260j;
    }

    public float getPivotX() {
        return this.d;
    }

    public float getPivotY() {
        return this.e;
    }

    public float getRotation() {
        return this.f49256c;
    }

    public float getScaleX() {
        return this.f49257f;
    }

    public float getScaleY() {
        return this.f49258g;
    }

    public float getTranslateX() {
        return this.h;
    }

    public float getTranslateY() {
        return this.f49259i;
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
        if (f7 != this.f49256c) {
            this.f49256c = f7;
            c();
        }
    }

    public void setScaleX(float f7) {
        if (f7 != this.f49257f) {
            this.f49257f = f7;
            c();
        }
    }

    public void setScaleY(float f7) {
        if (f7 != this.f49258g) {
            this.f49258g = f7;
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
        if (f7 != this.f49259i) {
            this.f49259i = f7;
            c();
        }
    }

    public i(i iVar, a0.f fVar) {
        k kVar;
        this.f49254a = new Matrix();
        this.f49255b = new ArrayList();
        this.f49256c = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f49257f = 1.0f;
        this.f49258g = 1.0f;
        this.h = 0.0f;
        this.f49259i = 0.0f;
        Matrix matrix = new Matrix();
        this.f49260j = matrix;
        this.f49261k = null;
        this.f49256c = iVar.f49256c;
        this.d = iVar.d;
        this.e = iVar.e;
        this.f49257f = iVar.f49257f;
        this.f49258g = iVar.f49258g;
        this.h = iVar.h;
        this.f49259i = iVar.f49259i;
        String str = iVar.f49261k;
        this.f49261k = str;
        if (str != null) {
            fVar.put(str, this);
        }
        matrix.set(iVar.f49260j);
        ArrayList arrayList = iVar.f49255b;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            Object obj = arrayList.get(i10);
            if (obj instanceof i) {
                this.f49255b.add(new i((i) obj, fVar));
            } else {
                if (obj instanceof h) {
                    h hVar = (h) obj;
                    ?? kVar2 = new k(hVar);
                    kVar2.e = 0.0f;
                    kVar2.f49247g = 1.0f;
                    kVar2.h = 1.0f;
                    kVar2.f49248i = 0.0f;
                    kVar2.f49249j = 1.0f;
                    kVar2.f49250k = 0.0f;
                    kVar2.f49251l = Paint.Cap.BUTT;
                    kVar2.f49252m = Paint.Join.MITER;
                    kVar2.f49253n = 4.0f;
                    kVar2.d = hVar.d;
                    kVar2.e = hVar.e;
                    kVar2.f49247g = hVar.f49247g;
                    kVar2.f49246f = hVar.f49246f;
                    kVar2.f49264c = hVar.f49264c;
                    kVar2.h = hVar.h;
                    kVar2.f49248i = hVar.f49248i;
                    kVar2.f49249j = hVar.f49249j;
                    kVar2.f49250k = hVar.f49250k;
                    kVar2.f49251l = hVar.f49251l;
                    kVar2.f49252m = hVar.f49252m;
                    kVar2.f49253n = hVar.f49253n;
                    kVar = kVar2;
                } else if (obj instanceof g) {
                    kVar = new k((g) obj);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.f49255b.add(kVar);
                Object obj2 = kVar.f49263b;
                if (obj2 != null) {
                    fVar.put(obj2, kVar);
                }
            }
        }
    }
}
