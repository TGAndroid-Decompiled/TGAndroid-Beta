package x4;

import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;
public final class i extends j {
    public final Matrix f49245a;
    public final ArrayList f49246b;
    public float f49247c;
    public float d;
    public float e;
    public float f49248f;
    public float f49249g;
    public float h;
    public float f49250i;
    public final Matrix f49251j;
    public String f49252k;

    public i() {
        this.f49245a = new Matrix();
        this.f49246b = new ArrayList();
        this.f49247c = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f49248f = 1.0f;
        this.f49249g = 1.0f;
        this.h = 0.0f;
        this.f49250i = 0.0f;
        this.f49251j = new Matrix();
        this.f49252k = null;
    }

    @Override
    public final boolean a() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f49246b;
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
            ArrayList arrayList = this.f49246b;
            if (i10 < arrayList.size()) {
                z10 |= ((j) arrayList.get(i10)).b(iArr);
                i10++;
            } else {
                return z10;
            }
        }
    }

    public final void c() {
        Matrix matrix = this.f49251j;
        matrix.reset();
        matrix.postTranslate(-this.d, -this.e);
        matrix.postScale(this.f49248f, this.f49249g);
        matrix.postRotate(this.f49247c, 0.0f, 0.0f);
        matrix.postTranslate(this.h + this.d, this.f49250i + this.e);
    }

    public String getGroupName() {
        return this.f49252k;
    }

    public Matrix getLocalMatrix() {
        return this.f49251j;
    }

    public float getPivotX() {
        return this.d;
    }

    public float getPivotY() {
        return this.e;
    }

    public float getRotation() {
        return this.f49247c;
    }

    public float getScaleX() {
        return this.f49248f;
    }

    public float getScaleY() {
        return this.f49249g;
    }

    public float getTranslateX() {
        return this.h;
    }

    public float getTranslateY() {
        return this.f49250i;
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
        if (f7 != this.f49247c) {
            this.f49247c = f7;
            c();
        }
    }

    public void setScaleX(float f7) {
        if (f7 != this.f49248f) {
            this.f49248f = f7;
            c();
        }
    }

    public void setScaleY(float f7) {
        if (f7 != this.f49249g) {
            this.f49249g = f7;
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
        if (f7 != this.f49250i) {
            this.f49250i = f7;
            c();
        }
    }

    public i(i iVar, a0.f fVar) {
        k kVar;
        this.f49245a = new Matrix();
        this.f49246b = new ArrayList();
        this.f49247c = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f49248f = 1.0f;
        this.f49249g = 1.0f;
        this.h = 0.0f;
        this.f49250i = 0.0f;
        Matrix matrix = new Matrix();
        this.f49251j = matrix;
        this.f49252k = null;
        this.f49247c = iVar.f49247c;
        this.d = iVar.d;
        this.e = iVar.e;
        this.f49248f = iVar.f49248f;
        this.f49249g = iVar.f49249g;
        this.h = iVar.h;
        this.f49250i = iVar.f49250i;
        String str = iVar.f49252k;
        this.f49252k = str;
        if (str != null) {
            fVar.put(str, this);
        }
        matrix.set(iVar.f49251j);
        ArrayList arrayList = iVar.f49246b;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            Object obj = arrayList.get(i10);
            if (obj instanceof i) {
                this.f49246b.add(new i((i) obj, fVar));
            } else {
                if (obj instanceof h) {
                    h hVar = (h) obj;
                    ?? kVar2 = new k(hVar);
                    kVar2.e = 0.0f;
                    kVar2.f49238g = 1.0f;
                    kVar2.h = 1.0f;
                    kVar2.f49239i = 0.0f;
                    kVar2.f49240j = 1.0f;
                    kVar2.f49241k = 0.0f;
                    kVar2.f49242l = Paint.Cap.BUTT;
                    kVar2.f49243m = Paint.Join.MITER;
                    kVar2.f49244n = 4.0f;
                    kVar2.d = hVar.d;
                    kVar2.e = hVar.e;
                    kVar2.f49238g = hVar.f49238g;
                    kVar2.f49237f = hVar.f49237f;
                    kVar2.f49255c = hVar.f49255c;
                    kVar2.h = hVar.h;
                    kVar2.f49239i = hVar.f49239i;
                    kVar2.f49240j = hVar.f49240j;
                    kVar2.f49241k = hVar.f49241k;
                    kVar2.f49242l = hVar.f49242l;
                    kVar2.f49243m = hVar.f49243m;
                    kVar2.f49244n = hVar.f49244n;
                    kVar = kVar2;
                } else if (obj instanceof g) {
                    kVar = new k((g) obj);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.f49246b.add(kVar);
                Object obj2 = kVar.f49254b;
                if (obj2 != null) {
                    fVar.put(obj2, kVar);
                }
            }
        }
    }
}
