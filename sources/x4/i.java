package x4;

import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;
public final class i extends j {
    public final Matrix f49291a;
    public final ArrayList f49292b;
    public float f49293c;
    public float d;
    public float e;
    public float f49294f;
    public float f49295g;
    public float h;
    public float f49296i;
    public final Matrix f49297j;
    public String f49298k;

    public i() {
        this.f49291a = new Matrix();
        this.f49292b = new ArrayList();
        this.f49293c = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f49294f = 1.0f;
        this.f49295g = 1.0f;
        this.h = 0.0f;
        this.f49296i = 0.0f;
        this.f49297j = new Matrix();
        this.f49298k = null;
    }

    @Override
    public final boolean a() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f49292b;
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
            ArrayList arrayList = this.f49292b;
            if (i10 < arrayList.size()) {
                z10 |= ((j) arrayList.get(i10)).b(iArr);
                i10++;
            } else {
                return z10;
            }
        }
    }

    public final void c() {
        Matrix matrix = this.f49297j;
        matrix.reset();
        matrix.postTranslate(-this.d, -this.e);
        matrix.postScale(this.f49294f, this.f49295g);
        matrix.postRotate(this.f49293c, 0.0f, 0.0f);
        matrix.postTranslate(this.h + this.d, this.f49296i + this.e);
    }

    public String getGroupName() {
        return this.f49298k;
    }

    public Matrix getLocalMatrix() {
        return this.f49297j;
    }

    public float getPivotX() {
        return this.d;
    }

    public float getPivotY() {
        return this.e;
    }

    public float getRotation() {
        return this.f49293c;
    }

    public float getScaleX() {
        return this.f49294f;
    }

    public float getScaleY() {
        return this.f49295g;
    }

    public float getTranslateX() {
        return this.h;
    }

    public float getTranslateY() {
        return this.f49296i;
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
        if (f7 != this.f49293c) {
            this.f49293c = f7;
            c();
        }
    }

    public void setScaleX(float f7) {
        if (f7 != this.f49294f) {
            this.f49294f = f7;
            c();
        }
    }

    public void setScaleY(float f7) {
        if (f7 != this.f49295g) {
            this.f49295g = f7;
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
        if (f7 != this.f49296i) {
            this.f49296i = f7;
            c();
        }
    }

    public i(i iVar, a0.f fVar) {
        k kVar;
        this.f49291a = new Matrix();
        this.f49292b = new ArrayList();
        this.f49293c = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f49294f = 1.0f;
        this.f49295g = 1.0f;
        this.h = 0.0f;
        this.f49296i = 0.0f;
        Matrix matrix = new Matrix();
        this.f49297j = matrix;
        this.f49298k = null;
        this.f49293c = iVar.f49293c;
        this.d = iVar.d;
        this.e = iVar.e;
        this.f49294f = iVar.f49294f;
        this.f49295g = iVar.f49295g;
        this.h = iVar.h;
        this.f49296i = iVar.f49296i;
        String str = iVar.f49298k;
        this.f49298k = str;
        if (str != null) {
            fVar.put(str, this);
        }
        matrix.set(iVar.f49297j);
        ArrayList arrayList = iVar.f49292b;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            Object obj = arrayList.get(i10);
            if (obj instanceof i) {
                this.f49292b.add(new i((i) obj, fVar));
            } else {
                if (obj instanceof h) {
                    h hVar = (h) obj;
                    ?? kVar2 = new k(hVar);
                    kVar2.e = 0.0f;
                    kVar2.f49284g = 1.0f;
                    kVar2.h = 1.0f;
                    kVar2.f49285i = 0.0f;
                    kVar2.f49286j = 1.0f;
                    kVar2.f49287k = 0.0f;
                    kVar2.f49288l = Paint.Cap.BUTT;
                    kVar2.f49289m = Paint.Join.MITER;
                    kVar2.f49290n = 4.0f;
                    kVar2.d = hVar.d;
                    kVar2.e = hVar.e;
                    kVar2.f49284g = hVar.f49284g;
                    kVar2.f49283f = hVar.f49283f;
                    kVar2.f49301c = hVar.f49301c;
                    kVar2.h = hVar.h;
                    kVar2.f49285i = hVar.f49285i;
                    kVar2.f49286j = hVar.f49286j;
                    kVar2.f49287k = hVar.f49287k;
                    kVar2.f49288l = hVar.f49288l;
                    kVar2.f49289m = hVar.f49289m;
                    kVar2.f49290n = hVar.f49290n;
                    kVar = kVar2;
                } else if (obj instanceof g) {
                    kVar = new k((g) obj);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.f49292b.add(kVar);
                Object obj2 = kVar.f49300b;
                if (obj2 != null) {
                    fVar.put(obj2, kVar);
                }
            }
        }
    }
}
