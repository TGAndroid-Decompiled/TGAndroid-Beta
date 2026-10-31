package x4;

import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;
public final class i extends j {
    public final Matrix f53023a;
    public final ArrayList f53024b;
    public float f53025c;
    public float d;
    public float e;
    public float f53026f;
    public float f53027g;
    public float h;
    public float f53028i;
    public final Matrix f53029j;
    public String f53030k;

    public i() {
        this.f53023a = new Matrix();
        this.f53024b = new ArrayList();
        this.f53025c = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f53026f = 1.0f;
        this.f53027g = 1.0f;
        this.h = 0.0f;
        this.f53028i = 0.0f;
        this.f53029j = new Matrix();
        this.f53030k = null;
    }

    @Override
    public final boolean a() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f53024b;
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
            ArrayList arrayList = this.f53024b;
            if (i10 < arrayList.size()) {
                z10 |= ((j) arrayList.get(i10)).b(iArr);
                i10++;
            } else {
                return z10;
            }
        }
    }

    public final void c() {
        Matrix matrix = this.f53029j;
        matrix.reset();
        matrix.postTranslate(-this.d, -this.e);
        matrix.postScale(this.f53026f, this.f53027g);
        matrix.postRotate(this.f53025c, 0.0f, 0.0f);
        matrix.postTranslate(this.h + this.d, this.f53028i + this.e);
    }

    public String getGroupName() {
        return this.f53030k;
    }

    public Matrix getLocalMatrix() {
        return this.f53029j;
    }

    public float getPivotX() {
        return this.d;
    }

    public float getPivotY() {
        return this.e;
    }

    public float getRotation() {
        return this.f53025c;
    }

    public float getScaleX() {
        return this.f53026f;
    }

    public float getScaleY() {
        return this.f53027g;
    }

    public float getTranslateX() {
        return this.h;
    }

    public float getTranslateY() {
        return this.f53028i;
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
        if (f7 != this.f53025c) {
            this.f53025c = f7;
            c();
        }
    }

    public void setScaleX(float f7) {
        if (f7 != this.f53026f) {
            this.f53026f = f7;
            c();
        }
    }

    public void setScaleY(float f7) {
        if (f7 != this.f53027g) {
            this.f53027g = f7;
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
        if (f7 != this.f53028i) {
            this.f53028i = f7;
            c();
        }
    }

    public i(i iVar, a0.f fVar) {
        k kVar;
        this.f53023a = new Matrix();
        this.f53024b = new ArrayList();
        this.f53025c = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f53026f = 1.0f;
        this.f53027g = 1.0f;
        this.h = 0.0f;
        this.f53028i = 0.0f;
        Matrix matrix = new Matrix();
        this.f53029j = matrix;
        this.f53030k = null;
        this.f53025c = iVar.f53025c;
        this.d = iVar.d;
        this.e = iVar.e;
        this.f53026f = iVar.f53026f;
        this.f53027g = iVar.f53027g;
        this.h = iVar.h;
        this.f53028i = iVar.f53028i;
        String str = iVar.f53030k;
        this.f53030k = str;
        if (str != null) {
            fVar.put(str, this);
        }
        matrix.set(iVar.f53029j);
        ArrayList arrayList = iVar.f53024b;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            Object obj = arrayList.get(i10);
            if (obj instanceof i) {
                this.f53024b.add(new i((i) obj, fVar));
            } else {
                if (obj instanceof h) {
                    h hVar = (h) obj;
                    ?? kVar2 = new k(hVar);
                    kVar2.e = 0.0f;
                    kVar2.f53016g = 1.0f;
                    kVar2.h = 1.0f;
                    kVar2.f53017i = 0.0f;
                    kVar2.f53018j = 1.0f;
                    kVar2.f53019k = 0.0f;
                    kVar2.f53020l = Paint.Cap.BUTT;
                    kVar2.f53021m = Paint.Join.MITER;
                    kVar2.f53022n = 4.0f;
                    kVar2.d = hVar.d;
                    kVar2.e = hVar.e;
                    kVar2.f53016g = hVar.f53016g;
                    kVar2.f53015f = hVar.f53015f;
                    kVar2.f53033c = hVar.f53033c;
                    kVar2.h = hVar.h;
                    kVar2.f53017i = hVar.f53017i;
                    kVar2.f53018j = hVar.f53018j;
                    kVar2.f53019k = hVar.f53019k;
                    kVar2.f53020l = hVar.f53020l;
                    kVar2.f53021m = hVar.f53021m;
                    kVar2.f53022n = hVar.f53022n;
                    kVar = kVar2;
                } else if (obj instanceof g) {
                    kVar = new k((g) obj);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.f53024b.add(kVar);
                Object obj2 = kVar.f53032b;
                if (obj2 != null) {
                    fVar.put(obj2, kVar);
                }
            }
        }
    }
}
