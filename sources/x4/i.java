package x4;

import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;
public final class i extends j {
    public final Matrix f50662a;
    public final ArrayList f50663b;
    public float f50664c;
    public float d;
    public float f50665e;
    public float f50666f;
    public float f50667g;
    public float h;
    public float f50668i;
    public final Matrix f50669j;
    public String f50670k;

    public i() {
        this.f50662a = new Matrix();
        this.f50663b = new ArrayList();
        this.f50664c = 0.0f;
        this.d = 0.0f;
        this.f50665e = 0.0f;
        this.f50666f = 1.0f;
        this.f50667g = 1.0f;
        this.h = 0.0f;
        this.f50668i = 0.0f;
        this.f50669j = new Matrix();
        this.f50670k = null;
    }

    @Override
    public final boolean a() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f50663b;
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
            ArrayList arrayList = this.f50663b;
            if (i10 < arrayList.size()) {
                z10 |= ((j) arrayList.get(i10)).b(iArr);
                i10++;
            } else {
                return z10;
            }
        }
    }

    public final void c() {
        Matrix matrix = this.f50669j;
        matrix.reset();
        matrix.postTranslate(-this.d, -this.f50665e);
        matrix.postScale(this.f50666f, this.f50667g);
        matrix.postRotate(this.f50664c, 0.0f, 0.0f);
        matrix.postTranslate(this.h + this.d, this.f50668i + this.f50665e);
    }

    public String getGroupName() {
        return this.f50670k;
    }

    public Matrix getLocalMatrix() {
        return this.f50669j;
    }

    public float getPivotX() {
        return this.d;
    }

    public float getPivotY() {
        return this.f50665e;
    }

    public float getRotation() {
        return this.f50664c;
    }

    public float getScaleX() {
        return this.f50666f;
    }

    public float getScaleY() {
        return this.f50667g;
    }

    public float getTranslateX() {
        return this.h;
    }

    public float getTranslateY() {
        return this.f50668i;
    }

    public void setPivotX(float f7) {
        if (f7 != this.d) {
            this.d = f7;
            c();
        }
    }

    public void setPivotY(float f7) {
        if (f7 != this.f50665e) {
            this.f50665e = f7;
            c();
        }
    }

    public void setRotation(float f7) {
        if (f7 != this.f50664c) {
            this.f50664c = f7;
            c();
        }
    }

    public void setScaleX(float f7) {
        if (f7 != this.f50666f) {
            this.f50666f = f7;
            c();
        }
    }

    public void setScaleY(float f7) {
        if (f7 != this.f50667g) {
            this.f50667g = f7;
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
        if (f7 != this.f50668i) {
            this.f50668i = f7;
            c();
        }
    }

    public i(i iVar, a0.f fVar) {
        k kVar;
        this.f50662a = new Matrix();
        this.f50663b = new ArrayList();
        this.f50664c = 0.0f;
        this.d = 0.0f;
        this.f50665e = 0.0f;
        this.f50666f = 1.0f;
        this.f50667g = 1.0f;
        this.h = 0.0f;
        this.f50668i = 0.0f;
        Matrix matrix = new Matrix();
        this.f50669j = matrix;
        this.f50670k = null;
        this.f50664c = iVar.f50664c;
        this.d = iVar.d;
        this.f50665e = iVar.f50665e;
        this.f50666f = iVar.f50666f;
        this.f50667g = iVar.f50667g;
        this.h = iVar.h;
        this.f50668i = iVar.f50668i;
        String str = iVar.f50670k;
        this.f50670k = str;
        if (str != null) {
            fVar.put(str, this);
        }
        matrix.set(iVar.f50669j);
        ArrayList arrayList = iVar.f50663b;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            Object obj = arrayList.get(i10);
            if (obj instanceof i) {
                this.f50663b.add(new i((i) obj, fVar));
            } else {
                if (obj instanceof h) {
                    h hVar = (h) obj;
                    ?? kVar2 = new k(hVar);
                    kVar2.f50653e = 0.0f;
                    kVar2.f50655g = 1.0f;
                    kVar2.h = 1.0f;
                    kVar2.f50656i = 0.0f;
                    kVar2.f50657j = 1.0f;
                    kVar2.f50658k = 0.0f;
                    kVar2.f50659l = Paint.Cap.BUTT;
                    kVar2.f50660m = Paint.Join.MITER;
                    kVar2.f50661n = 4.0f;
                    kVar2.d = hVar.d;
                    kVar2.f50653e = hVar.f50653e;
                    kVar2.f50655g = hVar.f50655g;
                    kVar2.f50654f = hVar.f50654f;
                    kVar2.f50673c = hVar.f50673c;
                    kVar2.h = hVar.h;
                    kVar2.f50656i = hVar.f50656i;
                    kVar2.f50657j = hVar.f50657j;
                    kVar2.f50658k = hVar.f50658k;
                    kVar2.f50659l = hVar.f50659l;
                    kVar2.f50660m = hVar.f50660m;
                    kVar2.f50661n = hVar.f50661n;
                    kVar = kVar2;
                } else if (obj instanceof g) {
                    kVar = new k((g) obj);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.f50663b.add(kVar);
                Object obj2 = kVar.f50672b;
                if (obj2 != null) {
                    fVar.put(obj2, kVar);
                }
            }
        }
    }
}
