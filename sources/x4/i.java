package x4;

import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;
public final class i extends j {
    public final Matrix f49244a;
    public final ArrayList f49245b;
    public float f49246c;
    public float d;
    public float e;
    public float f49247f;
    public float f49248g;
    public float h;
    public float f49249i;
    public final Matrix f49250j;
    public String f49251k;

    public i() {
        this.f49244a = new Matrix();
        this.f49245b = new ArrayList();
        this.f49246c = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f49247f = 1.0f;
        this.f49248g = 1.0f;
        this.h = 0.0f;
        this.f49249i = 0.0f;
        this.f49250j = new Matrix();
        this.f49251k = null;
    }

    @Override
    public final boolean a() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f49245b;
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
            ArrayList arrayList = this.f49245b;
            if (i10 < arrayList.size()) {
                z10 |= ((j) arrayList.get(i10)).b(iArr);
                i10++;
            } else {
                return z10;
            }
        }
    }

    public final void c() {
        Matrix matrix = this.f49250j;
        matrix.reset();
        matrix.postTranslate(-this.d, -this.e);
        matrix.postScale(this.f49247f, this.f49248g);
        matrix.postRotate(this.f49246c, 0.0f, 0.0f);
        matrix.postTranslate(this.h + this.d, this.f49249i + this.e);
    }

    public String getGroupName() {
        return this.f49251k;
    }

    public Matrix getLocalMatrix() {
        return this.f49250j;
    }

    public float getPivotX() {
        return this.d;
    }

    public float getPivotY() {
        return this.e;
    }

    public float getRotation() {
        return this.f49246c;
    }

    public float getScaleX() {
        return this.f49247f;
    }

    public float getScaleY() {
        return this.f49248g;
    }

    public float getTranslateX() {
        return this.h;
    }

    public float getTranslateY() {
        return this.f49249i;
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
        if (f7 != this.f49246c) {
            this.f49246c = f7;
            c();
        }
    }

    public void setScaleX(float f7) {
        if (f7 != this.f49247f) {
            this.f49247f = f7;
            c();
        }
    }

    public void setScaleY(float f7) {
        if (f7 != this.f49248g) {
            this.f49248g = f7;
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
        if (f7 != this.f49249i) {
            this.f49249i = f7;
            c();
        }
    }

    public i(i iVar, a0.f fVar) {
        k kVar;
        this.f49244a = new Matrix();
        this.f49245b = new ArrayList();
        this.f49246c = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f49247f = 1.0f;
        this.f49248g = 1.0f;
        this.h = 0.0f;
        this.f49249i = 0.0f;
        Matrix matrix = new Matrix();
        this.f49250j = matrix;
        this.f49251k = null;
        this.f49246c = iVar.f49246c;
        this.d = iVar.d;
        this.e = iVar.e;
        this.f49247f = iVar.f49247f;
        this.f49248g = iVar.f49248g;
        this.h = iVar.h;
        this.f49249i = iVar.f49249i;
        String str = iVar.f49251k;
        this.f49251k = str;
        if (str != null) {
            fVar.put(str, this);
        }
        matrix.set(iVar.f49250j);
        ArrayList arrayList = iVar.f49245b;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            Object obj = arrayList.get(i10);
            if (obj instanceof i) {
                this.f49245b.add(new i((i) obj, fVar));
            } else {
                if (obj instanceof h) {
                    h hVar = (h) obj;
                    ?? kVar2 = new k(hVar);
                    kVar2.e = 0.0f;
                    kVar2.f49237g = 1.0f;
                    kVar2.h = 1.0f;
                    kVar2.f49238i = 0.0f;
                    kVar2.f49239j = 1.0f;
                    kVar2.f49240k = 0.0f;
                    kVar2.f49241l = Paint.Cap.BUTT;
                    kVar2.f49242m = Paint.Join.MITER;
                    kVar2.f49243n = 4.0f;
                    kVar2.d = hVar.d;
                    kVar2.e = hVar.e;
                    kVar2.f49237g = hVar.f49237g;
                    kVar2.f49236f = hVar.f49236f;
                    kVar2.f49254c = hVar.f49254c;
                    kVar2.h = hVar.h;
                    kVar2.f49238i = hVar.f49238i;
                    kVar2.f49239j = hVar.f49239j;
                    kVar2.f49240k = hVar.f49240k;
                    kVar2.f49241l = hVar.f49241l;
                    kVar2.f49242m = hVar.f49242m;
                    kVar2.f49243n = hVar.f49243n;
                    kVar = kVar2;
                } else if (obj instanceof g) {
                    kVar = new k((g) obj);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.f49245b.add(kVar);
                Object obj2 = kVar.f49253b;
                if (obj2 != null) {
                    fVar.put(obj2, kVar);
                }
            }
        }
    }
}
