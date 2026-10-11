package x4;

import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;
public final class i extends j {
    public final Matrix f50706a;
    public final ArrayList f50707b;
    public float f50708c;
    public float d;
    public float f50709e;
    public float f50710f;
    public float f50711g;
    public float h;
    public float f50712i;
    public final Matrix f50713j;
    public String f50714k;

    public i() {
        this.f50706a = new Matrix();
        this.f50707b = new ArrayList();
        this.f50708c = 0.0f;
        this.d = 0.0f;
        this.f50709e = 0.0f;
        this.f50710f = 1.0f;
        this.f50711g = 1.0f;
        this.h = 0.0f;
        this.f50712i = 0.0f;
        this.f50713j = new Matrix();
        this.f50714k = null;
    }

    @Override
    public final boolean a() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f50707b;
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
            ArrayList arrayList = this.f50707b;
            if (i10 < arrayList.size()) {
                z10 |= ((j) arrayList.get(i10)).b(iArr);
                i10++;
            } else {
                return z10;
            }
        }
    }

    public final void c() {
        Matrix matrix = this.f50713j;
        matrix.reset();
        matrix.postTranslate(-this.d, -this.f50709e);
        matrix.postScale(this.f50710f, this.f50711g);
        matrix.postRotate(this.f50708c, 0.0f, 0.0f);
        matrix.postTranslate(this.h + this.d, this.f50712i + this.f50709e);
    }

    public String getGroupName() {
        return this.f50714k;
    }

    public Matrix getLocalMatrix() {
        return this.f50713j;
    }

    public float getPivotX() {
        return this.d;
    }

    public float getPivotY() {
        return this.f50709e;
    }

    public float getRotation() {
        return this.f50708c;
    }

    public float getScaleX() {
        return this.f50710f;
    }

    public float getScaleY() {
        return this.f50711g;
    }

    public float getTranslateX() {
        return this.h;
    }

    public float getTranslateY() {
        return this.f50712i;
    }

    public void setPivotX(float f7) {
        if (f7 != this.d) {
            this.d = f7;
            c();
        }
    }

    public void setPivotY(float f7) {
        if (f7 != this.f50709e) {
            this.f50709e = f7;
            c();
        }
    }

    public void setRotation(float f7) {
        if (f7 != this.f50708c) {
            this.f50708c = f7;
            c();
        }
    }

    public void setScaleX(float f7) {
        if (f7 != this.f50710f) {
            this.f50710f = f7;
            c();
        }
    }

    public void setScaleY(float f7) {
        if (f7 != this.f50711g) {
            this.f50711g = f7;
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
        if (f7 != this.f50712i) {
            this.f50712i = f7;
            c();
        }
    }

    public i(i iVar, a0.f fVar) {
        k kVar;
        this.f50706a = new Matrix();
        this.f50707b = new ArrayList();
        this.f50708c = 0.0f;
        this.d = 0.0f;
        this.f50709e = 0.0f;
        this.f50710f = 1.0f;
        this.f50711g = 1.0f;
        this.h = 0.0f;
        this.f50712i = 0.0f;
        Matrix matrix = new Matrix();
        this.f50713j = matrix;
        this.f50714k = null;
        this.f50708c = iVar.f50708c;
        this.d = iVar.d;
        this.f50709e = iVar.f50709e;
        this.f50710f = iVar.f50710f;
        this.f50711g = iVar.f50711g;
        this.h = iVar.h;
        this.f50712i = iVar.f50712i;
        String str = iVar.f50714k;
        this.f50714k = str;
        if (str != null) {
            fVar.put(str, this);
        }
        matrix.set(iVar.f50713j);
        ArrayList arrayList = iVar.f50707b;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            Object obj = arrayList.get(i10);
            if (obj instanceof i) {
                this.f50707b.add(new i((i) obj, fVar));
            } else {
                if (obj instanceof h) {
                    h hVar = (h) obj;
                    ?? kVar2 = new k(hVar);
                    kVar2.f50697e = 0.0f;
                    kVar2.f50699g = 1.0f;
                    kVar2.h = 1.0f;
                    kVar2.f50700i = 0.0f;
                    kVar2.f50701j = 1.0f;
                    kVar2.f50702k = 0.0f;
                    kVar2.f50703l = Paint.Cap.BUTT;
                    kVar2.f50704m = Paint.Join.MITER;
                    kVar2.f50705n = 4.0f;
                    kVar2.d = hVar.d;
                    kVar2.f50697e = hVar.f50697e;
                    kVar2.f50699g = hVar.f50699g;
                    kVar2.f50698f = hVar.f50698f;
                    kVar2.f50717c = hVar.f50717c;
                    kVar2.h = hVar.h;
                    kVar2.f50700i = hVar.f50700i;
                    kVar2.f50701j = hVar.f50701j;
                    kVar2.f50702k = hVar.f50702k;
                    kVar2.f50703l = hVar.f50703l;
                    kVar2.f50704m = hVar.f50704m;
                    kVar2.f50705n = hVar.f50705n;
                    kVar = kVar2;
                } else if (obj instanceof g) {
                    kVar = new k((g) obj);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.f50707b.add(kVar);
                Object obj2 = kVar.f50716b;
                if (obj2 != null) {
                    fVar.put(obj2, kVar);
                }
            }
        }
    }
}
