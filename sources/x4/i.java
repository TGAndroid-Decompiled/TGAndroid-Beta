package x4;

import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;
public final class i extends j {
    public final Matrix f50740a;
    public final ArrayList f50741b;
    public float f50742c;
    public float d;
    public float f50743e;
    public float f50744f;
    public float f50745g;
    public float h;
    public float f50746i;
    public final Matrix f50747j;
    public String f50748k;

    public i() {
        this.f50740a = new Matrix();
        this.f50741b = new ArrayList();
        this.f50742c = 0.0f;
        this.d = 0.0f;
        this.f50743e = 0.0f;
        this.f50744f = 1.0f;
        this.f50745g = 1.0f;
        this.h = 0.0f;
        this.f50746i = 0.0f;
        this.f50747j = new Matrix();
        this.f50748k = null;
    }

    @Override
    public final boolean a() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f50741b;
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
            ArrayList arrayList = this.f50741b;
            if (i10 < arrayList.size()) {
                z10 |= ((j) arrayList.get(i10)).b(iArr);
                i10++;
            } else {
                return z10;
            }
        }
    }

    public final void c() {
        Matrix matrix = this.f50747j;
        matrix.reset();
        matrix.postTranslate(-this.d, -this.f50743e);
        matrix.postScale(this.f50744f, this.f50745g);
        matrix.postRotate(this.f50742c, 0.0f, 0.0f);
        matrix.postTranslate(this.h + this.d, this.f50746i + this.f50743e);
    }

    public String getGroupName() {
        return this.f50748k;
    }

    public Matrix getLocalMatrix() {
        return this.f50747j;
    }

    public float getPivotX() {
        return this.d;
    }

    public float getPivotY() {
        return this.f50743e;
    }

    public float getRotation() {
        return this.f50742c;
    }

    public float getScaleX() {
        return this.f50744f;
    }

    public float getScaleY() {
        return this.f50745g;
    }

    public float getTranslateX() {
        return this.h;
    }

    public float getTranslateY() {
        return this.f50746i;
    }

    public void setPivotX(float f7) {
        if (f7 != this.d) {
            this.d = f7;
            c();
        }
    }

    public void setPivotY(float f7) {
        if (f7 != this.f50743e) {
            this.f50743e = f7;
            c();
        }
    }

    public void setRotation(float f7) {
        if (f7 != this.f50742c) {
            this.f50742c = f7;
            c();
        }
    }

    public void setScaleX(float f7) {
        if (f7 != this.f50744f) {
            this.f50744f = f7;
            c();
        }
    }

    public void setScaleY(float f7) {
        if (f7 != this.f50745g) {
            this.f50745g = f7;
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
        if (f7 != this.f50746i) {
            this.f50746i = f7;
            c();
        }
    }

    public i(i iVar, a0.f fVar) {
        k kVar;
        this.f50740a = new Matrix();
        this.f50741b = new ArrayList();
        this.f50742c = 0.0f;
        this.d = 0.0f;
        this.f50743e = 0.0f;
        this.f50744f = 1.0f;
        this.f50745g = 1.0f;
        this.h = 0.0f;
        this.f50746i = 0.0f;
        Matrix matrix = new Matrix();
        this.f50747j = matrix;
        this.f50748k = null;
        this.f50742c = iVar.f50742c;
        this.d = iVar.d;
        this.f50743e = iVar.f50743e;
        this.f50744f = iVar.f50744f;
        this.f50745g = iVar.f50745g;
        this.h = iVar.h;
        this.f50746i = iVar.f50746i;
        String str = iVar.f50748k;
        this.f50748k = str;
        if (str != null) {
            fVar.put(str, this);
        }
        matrix.set(iVar.f50747j);
        ArrayList arrayList = iVar.f50741b;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            Object obj = arrayList.get(i10);
            if (obj instanceof i) {
                this.f50741b.add(new i((i) obj, fVar));
            } else {
                if (obj instanceof h) {
                    h hVar = (h) obj;
                    ?? kVar2 = new k(hVar);
                    kVar2.f50731e = 0.0f;
                    kVar2.f50733g = 1.0f;
                    kVar2.h = 1.0f;
                    kVar2.f50734i = 0.0f;
                    kVar2.f50735j = 1.0f;
                    kVar2.f50736k = 0.0f;
                    kVar2.f50737l = Paint.Cap.BUTT;
                    kVar2.f50738m = Paint.Join.MITER;
                    kVar2.f50739n = 4.0f;
                    kVar2.d = hVar.d;
                    kVar2.f50731e = hVar.f50731e;
                    kVar2.f50733g = hVar.f50733g;
                    kVar2.f50732f = hVar.f50732f;
                    kVar2.f50751c = hVar.f50751c;
                    kVar2.h = hVar.h;
                    kVar2.f50734i = hVar.f50734i;
                    kVar2.f50735j = hVar.f50735j;
                    kVar2.f50736k = hVar.f50736k;
                    kVar2.f50737l = hVar.f50737l;
                    kVar2.f50738m = hVar.f50738m;
                    kVar2.f50739n = hVar.f50739n;
                    kVar = kVar2;
                } else if (obj instanceof g) {
                    kVar = new k((g) obj);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.f50741b.add(kVar);
                Object obj2 = kVar.f50750b;
                if (obj2 != null) {
                    fVar.put(obj2, kVar);
                }
            }
        }
    }
}
