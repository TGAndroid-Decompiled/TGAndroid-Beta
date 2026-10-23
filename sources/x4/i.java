package x4;

import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;
public final class i extends j {
    public final Matrix f49696a;
    public final ArrayList f49697b;
    public float f49698c;
    public float d;
    public float e;
    public float f49699f;
    public float f49700g;
    public float h;
    public float f49701i;
    public final Matrix f49702j;
    public String f49703k;

    public i() {
        this.f49696a = new Matrix();
        this.f49697b = new ArrayList();
        this.f49698c = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f49699f = 1.0f;
        this.f49700g = 1.0f;
        this.h = 0.0f;
        this.f49701i = 0.0f;
        this.f49702j = new Matrix();
        this.f49703k = null;
    }

    @Override
    public final boolean a() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f49697b;
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
            ArrayList arrayList = this.f49697b;
            if (i10 < arrayList.size()) {
                z10 |= ((j) arrayList.get(i10)).b(iArr);
                i10++;
            } else {
                return z10;
            }
        }
    }

    public final void c() {
        Matrix matrix = this.f49702j;
        matrix.reset();
        matrix.postTranslate(-this.d, -this.e);
        matrix.postScale(this.f49699f, this.f49700g);
        matrix.postRotate(this.f49698c, 0.0f, 0.0f);
        matrix.postTranslate(this.h + this.d, this.f49701i + this.e);
    }

    public String getGroupName() {
        return this.f49703k;
    }

    public Matrix getLocalMatrix() {
        return this.f49702j;
    }

    public float getPivotX() {
        return this.d;
    }

    public float getPivotY() {
        return this.e;
    }

    public float getRotation() {
        return this.f49698c;
    }

    public float getScaleX() {
        return this.f49699f;
    }

    public float getScaleY() {
        return this.f49700g;
    }

    public float getTranslateX() {
        return this.h;
    }

    public float getTranslateY() {
        return this.f49701i;
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
        if (f7 != this.f49698c) {
            this.f49698c = f7;
            c();
        }
    }

    public void setScaleX(float f7) {
        if (f7 != this.f49699f) {
            this.f49699f = f7;
            c();
        }
    }

    public void setScaleY(float f7) {
        if (f7 != this.f49700g) {
            this.f49700g = f7;
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
        if (f7 != this.f49701i) {
            this.f49701i = f7;
            c();
        }
    }

    public i(i iVar, a0.f fVar) {
        k kVar;
        this.f49696a = new Matrix();
        this.f49697b = new ArrayList();
        this.f49698c = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f49699f = 1.0f;
        this.f49700g = 1.0f;
        this.h = 0.0f;
        this.f49701i = 0.0f;
        Matrix matrix = new Matrix();
        this.f49702j = matrix;
        this.f49703k = null;
        this.f49698c = iVar.f49698c;
        this.d = iVar.d;
        this.e = iVar.e;
        this.f49699f = iVar.f49699f;
        this.f49700g = iVar.f49700g;
        this.h = iVar.h;
        this.f49701i = iVar.f49701i;
        String str = iVar.f49703k;
        this.f49703k = str;
        if (str != null) {
            fVar.put(str, this);
        }
        matrix.set(iVar.f49702j);
        ArrayList arrayList = iVar.f49697b;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            Object obj = arrayList.get(i10);
            if (obj instanceof i) {
                this.f49697b.add(new i((i) obj, fVar));
            } else {
                if (obj instanceof h) {
                    h hVar = (h) obj;
                    ?? kVar2 = new k(hVar);
                    kVar2.e = 0.0f;
                    kVar2.f49689g = 1.0f;
                    kVar2.h = 1.0f;
                    kVar2.f49690i = 0.0f;
                    kVar2.f49691j = 1.0f;
                    kVar2.f49692k = 0.0f;
                    kVar2.f49693l = Paint.Cap.BUTT;
                    kVar2.f49694m = Paint.Join.MITER;
                    kVar2.f49695n = 4.0f;
                    kVar2.d = hVar.d;
                    kVar2.e = hVar.e;
                    kVar2.f49689g = hVar.f49689g;
                    kVar2.f49688f = hVar.f49688f;
                    kVar2.f49706c = hVar.f49706c;
                    kVar2.h = hVar.h;
                    kVar2.f49690i = hVar.f49690i;
                    kVar2.f49691j = hVar.f49691j;
                    kVar2.f49692k = hVar.f49692k;
                    kVar2.f49693l = hVar.f49693l;
                    kVar2.f49694m = hVar.f49694m;
                    kVar2.f49695n = hVar.f49695n;
                    kVar = kVar2;
                } else if (obj instanceof g) {
                    kVar = new k((g) obj);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.f49697b.add(kVar);
                Object obj2 = kVar.f49705b;
                if (obj2 != null) {
                    fVar.put(obj2, kVar);
                }
            }
        }
    }
}
