package x4;

import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;
public final class i extends j {
    public final Matrix f49253a;
    public final ArrayList f49254b;
    public float f49255c;
    public float d;
    public float e;
    public float f49256f;
    public float f49257g;
    public float h;
    public float f49258i;
    public final Matrix f49259j;
    public String f49260k;

    public i() {
        this.f49253a = new Matrix();
        this.f49254b = new ArrayList();
        this.f49255c = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f49256f = 1.0f;
        this.f49257g = 1.0f;
        this.h = 0.0f;
        this.f49258i = 0.0f;
        this.f49259j = new Matrix();
        this.f49260k = null;
    }

    @Override
    public final boolean a() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f49254b;
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
            ArrayList arrayList = this.f49254b;
            if (i10 < arrayList.size()) {
                z10 |= ((j) arrayList.get(i10)).b(iArr);
                i10++;
            } else {
                return z10;
            }
        }
    }

    public final void c() {
        Matrix matrix = this.f49259j;
        matrix.reset();
        matrix.postTranslate(-this.d, -this.e);
        matrix.postScale(this.f49256f, this.f49257g);
        matrix.postRotate(this.f49255c, 0.0f, 0.0f);
        matrix.postTranslate(this.h + this.d, this.f49258i + this.e);
    }

    public String getGroupName() {
        return this.f49260k;
    }

    public Matrix getLocalMatrix() {
        return this.f49259j;
    }

    public float getPivotX() {
        return this.d;
    }

    public float getPivotY() {
        return this.e;
    }

    public float getRotation() {
        return this.f49255c;
    }

    public float getScaleX() {
        return this.f49256f;
    }

    public float getScaleY() {
        return this.f49257g;
    }

    public float getTranslateX() {
        return this.h;
    }

    public float getTranslateY() {
        return this.f49258i;
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
        if (f7 != this.f49255c) {
            this.f49255c = f7;
            c();
        }
    }

    public void setScaleX(float f7) {
        if (f7 != this.f49256f) {
            this.f49256f = f7;
            c();
        }
    }

    public void setScaleY(float f7) {
        if (f7 != this.f49257g) {
            this.f49257g = f7;
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
        if (f7 != this.f49258i) {
            this.f49258i = f7;
            c();
        }
    }

    public i(i iVar, a0.f fVar) {
        k kVar;
        this.f49253a = new Matrix();
        this.f49254b = new ArrayList();
        this.f49255c = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f49256f = 1.0f;
        this.f49257g = 1.0f;
        this.h = 0.0f;
        this.f49258i = 0.0f;
        Matrix matrix = new Matrix();
        this.f49259j = matrix;
        this.f49260k = null;
        this.f49255c = iVar.f49255c;
        this.d = iVar.d;
        this.e = iVar.e;
        this.f49256f = iVar.f49256f;
        this.f49257g = iVar.f49257g;
        this.h = iVar.h;
        this.f49258i = iVar.f49258i;
        String str = iVar.f49260k;
        this.f49260k = str;
        if (str != null) {
            fVar.put(str, this);
        }
        matrix.set(iVar.f49259j);
        ArrayList arrayList = iVar.f49254b;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            Object obj = arrayList.get(i10);
            if (obj instanceof i) {
                this.f49254b.add(new i((i) obj, fVar));
            } else {
                if (obj instanceof h) {
                    h hVar = (h) obj;
                    ?? kVar2 = new k(hVar);
                    kVar2.e = 0.0f;
                    kVar2.f49246g = 1.0f;
                    kVar2.h = 1.0f;
                    kVar2.f49247i = 0.0f;
                    kVar2.f49248j = 1.0f;
                    kVar2.f49249k = 0.0f;
                    kVar2.f49250l = Paint.Cap.BUTT;
                    kVar2.f49251m = Paint.Join.MITER;
                    kVar2.f49252n = 4.0f;
                    kVar2.d = hVar.d;
                    kVar2.e = hVar.e;
                    kVar2.f49246g = hVar.f49246g;
                    kVar2.f49245f = hVar.f49245f;
                    kVar2.f49263c = hVar.f49263c;
                    kVar2.h = hVar.h;
                    kVar2.f49247i = hVar.f49247i;
                    kVar2.f49248j = hVar.f49248j;
                    kVar2.f49249k = hVar.f49249k;
                    kVar2.f49250l = hVar.f49250l;
                    kVar2.f49251m = hVar.f49251m;
                    kVar2.f49252n = hVar.f49252n;
                    kVar = kVar2;
                } else if (obj instanceof g) {
                    kVar = new k((g) obj);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.f49254b.add(kVar);
                Object obj2 = kVar.f49262b;
                if (obj2 != null) {
                    fVar.put(obj2, kVar);
                }
            }
        }
    }
}
