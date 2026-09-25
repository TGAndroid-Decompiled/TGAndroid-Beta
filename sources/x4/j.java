package x4;

import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;
public final class j extends k {
    public final Matrix f45565a;
    public final ArrayList f45566b;
    public float f45567c;
    public float d;
    public float e;
    public float f45568f;
    public float f45569g;
    public float h;
    public float f45570i;
    public final Matrix f45571j;
    public String f45572k;

    public j() {
        this.f45565a = new Matrix();
        this.f45566b = new ArrayList();
        this.f45567c = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f45568f = 1.0f;
        this.f45569g = 1.0f;
        this.h = 0.0f;
        this.f45570i = 0.0f;
        this.f45571j = new Matrix();
        this.f45572k = null;
    }

    @Override
    public final boolean a() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f45566b;
            if (i10 >= arrayList.size()) {
                return false;
            }
            if (((k) arrayList.get(i10)).a()) {
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
            ArrayList arrayList = this.f45566b;
            if (i10 < arrayList.size()) {
                z10 |= ((k) arrayList.get(i10)).b(iArr);
                i10++;
            } else {
                return z10;
            }
        }
    }

    public final void c() {
        Matrix matrix = this.f45571j;
        matrix.reset();
        matrix.postTranslate(-this.d, -this.e);
        matrix.postScale(this.f45568f, this.f45569g);
        matrix.postRotate(this.f45567c, 0.0f, 0.0f);
        matrix.postTranslate(this.h + this.d, this.f45570i + this.e);
    }

    public String getGroupName() {
        return this.f45572k;
    }

    public Matrix getLocalMatrix() {
        return this.f45571j;
    }

    public float getPivotX() {
        return this.d;
    }

    public float getPivotY() {
        return this.e;
    }

    public float getRotation() {
        return this.f45567c;
    }

    public float getScaleX() {
        return this.f45568f;
    }

    public float getScaleY() {
        return this.f45569g;
    }

    public float getTranslateX() {
        return this.h;
    }

    public float getTranslateY() {
        return this.f45570i;
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
        if (f7 != this.f45567c) {
            this.f45567c = f7;
            c();
        }
    }

    public void setScaleX(float f7) {
        if (f7 != this.f45568f) {
            this.f45568f = f7;
            c();
        }
    }

    public void setScaleY(float f7) {
        if (f7 != this.f45569g) {
            this.f45569g = f7;
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
        if (f7 != this.f45570i) {
            this.f45570i = f7;
            c();
        }
    }

    public j(j jVar, a0.f fVar) {
        l lVar;
        this.f45565a = new Matrix();
        this.f45566b = new ArrayList();
        this.f45567c = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f45568f = 1.0f;
        this.f45569g = 1.0f;
        this.h = 0.0f;
        this.f45570i = 0.0f;
        Matrix matrix = new Matrix();
        this.f45571j = matrix;
        this.f45572k = null;
        this.f45567c = jVar.f45567c;
        this.d = jVar.d;
        this.e = jVar.e;
        this.f45568f = jVar.f45568f;
        this.f45569g = jVar.f45569g;
        this.h = jVar.h;
        this.f45570i = jVar.f45570i;
        String str = jVar.f45572k;
        this.f45572k = str;
        if (str != null) {
            fVar.put(str, this);
        }
        matrix.set(jVar.f45571j);
        ArrayList arrayList = jVar.f45566b;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            Object obj = arrayList.get(i10);
            if (obj instanceof j) {
                this.f45566b.add(new j((j) obj, fVar));
            } else {
                if (obj instanceof i) {
                    i iVar = (i) obj;
                    ?? lVar2 = new l(iVar);
                    lVar2.e = 0.0f;
                    lVar2.f45558g = 1.0f;
                    lVar2.h = 1.0f;
                    lVar2.f45559i = 0.0f;
                    lVar2.f45560j = 1.0f;
                    lVar2.f45561k = 0.0f;
                    lVar2.f45562l = Paint.Cap.BUTT;
                    lVar2.f45563m = Paint.Join.MITER;
                    lVar2.f45564n = 4.0f;
                    lVar2.d = iVar.d;
                    lVar2.e = iVar.e;
                    lVar2.f45558g = iVar.f45558g;
                    lVar2.f45557f = iVar.f45557f;
                    lVar2.f45575c = iVar.f45575c;
                    lVar2.h = iVar.h;
                    lVar2.f45559i = iVar.f45559i;
                    lVar2.f45560j = iVar.f45560j;
                    lVar2.f45561k = iVar.f45561k;
                    lVar2.f45562l = iVar.f45562l;
                    lVar2.f45563m = iVar.f45563m;
                    lVar2.f45564n = iVar.f45564n;
                    lVar = lVar2;
                } else if (obj instanceof h) {
                    lVar = new l((h) obj);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.f45566b.add(lVar);
                Object obj2 = lVar.f45574b;
                if (obj2 != null) {
                    fVar.put(obj2, lVar);
                }
            }
        }
    }
}
