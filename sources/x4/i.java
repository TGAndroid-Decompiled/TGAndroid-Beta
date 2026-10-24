package x4;

import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;
public final class i extends j {
    public final Matrix f49695a;
    public final ArrayList f49696b;
    public float f49697c;
    public float d;
    public float e;
    public float f49698f;
    public float f49699g;
    public float h;
    public float f49700i;
    public final Matrix f49701j;
    public String f49702k;

    public i() {
        this.f49695a = new Matrix();
        this.f49696b = new ArrayList();
        this.f49697c = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f49698f = 1.0f;
        this.f49699g = 1.0f;
        this.h = 0.0f;
        this.f49700i = 0.0f;
        this.f49701j = new Matrix();
        this.f49702k = null;
    }

    @Override
    public final boolean a() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f49696b;
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
            ArrayList arrayList = this.f49696b;
            if (i10 < arrayList.size()) {
                z10 |= ((j) arrayList.get(i10)).b(iArr);
                i10++;
            } else {
                return z10;
            }
        }
    }

    public final void c() {
        Matrix matrix = this.f49701j;
        matrix.reset();
        matrix.postTranslate(-this.d, -this.e);
        matrix.postScale(this.f49698f, this.f49699g);
        matrix.postRotate(this.f49697c, 0.0f, 0.0f);
        matrix.postTranslate(this.h + this.d, this.f49700i + this.e);
    }

    public String getGroupName() {
        return this.f49702k;
    }

    public Matrix getLocalMatrix() {
        return this.f49701j;
    }

    public float getPivotX() {
        return this.d;
    }

    public float getPivotY() {
        return this.e;
    }

    public float getRotation() {
        return this.f49697c;
    }

    public float getScaleX() {
        return this.f49698f;
    }

    public float getScaleY() {
        return this.f49699g;
    }

    public float getTranslateX() {
        return this.h;
    }

    public float getTranslateY() {
        return this.f49700i;
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
        if (f7 != this.f49697c) {
            this.f49697c = f7;
            c();
        }
    }

    public void setScaleX(float f7) {
        if (f7 != this.f49698f) {
            this.f49698f = f7;
            c();
        }
    }

    public void setScaleY(float f7) {
        if (f7 != this.f49699g) {
            this.f49699g = f7;
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
        if (f7 != this.f49700i) {
            this.f49700i = f7;
            c();
        }
    }

    public i(i iVar, a0.f fVar) {
        k kVar;
        this.f49695a = new Matrix();
        this.f49696b = new ArrayList();
        this.f49697c = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f49698f = 1.0f;
        this.f49699g = 1.0f;
        this.h = 0.0f;
        this.f49700i = 0.0f;
        Matrix matrix = new Matrix();
        this.f49701j = matrix;
        this.f49702k = null;
        this.f49697c = iVar.f49697c;
        this.d = iVar.d;
        this.e = iVar.e;
        this.f49698f = iVar.f49698f;
        this.f49699g = iVar.f49699g;
        this.h = iVar.h;
        this.f49700i = iVar.f49700i;
        String str = iVar.f49702k;
        this.f49702k = str;
        if (str != null) {
            fVar.put(str, this);
        }
        matrix.set(iVar.f49701j);
        ArrayList arrayList = iVar.f49696b;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            Object obj = arrayList.get(i10);
            if (obj instanceof i) {
                this.f49696b.add(new i((i) obj, fVar));
            } else {
                if (obj instanceof h) {
                    h hVar = (h) obj;
                    ?? kVar2 = new k(hVar);
                    kVar2.e = 0.0f;
                    kVar2.f49688g = 1.0f;
                    kVar2.h = 1.0f;
                    kVar2.f49689i = 0.0f;
                    kVar2.f49690j = 1.0f;
                    kVar2.f49691k = 0.0f;
                    kVar2.f49692l = Paint.Cap.BUTT;
                    kVar2.f49693m = Paint.Join.MITER;
                    kVar2.f49694n = 4.0f;
                    kVar2.d = hVar.d;
                    kVar2.e = hVar.e;
                    kVar2.f49688g = hVar.f49688g;
                    kVar2.f49687f = hVar.f49687f;
                    kVar2.f49705c = hVar.f49705c;
                    kVar2.h = hVar.h;
                    kVar2.f49689i = hVar.f49689i;
                    kVar2.f49690j = hVar.f49690j;
                    kVar2.f49691k = hVar.f49691k;
                    kVar2.f49692l = hVar.f49692l;
                    kVar2.f49693m = hVar.f49693m;
                    kVar2.f49694n = hVar.f49694n;
                    kVar = kVar2;
                } else if (obj instanceof g) {
                    kVar = new k((g) obj);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.f49696b.add(kVar);
                Object obj2 = kVar.f49704b;
                if (obj2 != null) {
                    fVar.put(obj2, kVar);
                }
            }
        }
    }
}
