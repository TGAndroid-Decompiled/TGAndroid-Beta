package x4;

import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;
public final class i extends j {
    public final Matrix f49250a;
    public final ArrayList f49251b;
    public float f49252c;
    public float d;
    public float e;
    public float f49253f;
    public float f49254g;
    public float h;
    public float f49255i;
    public final Matrix f49256j;
    public String f49257k;

    public i() {
        this.f49250a = new Matrix();
        this.f49251b = new ArrayList();
        this.f49252c = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f49253f = 1.0f;
        this.f49254g = 1.0f;
        this.h = 0.0f;
        this.f49255i = 0.0f;
        this.f49256j = new Matrix();
        this.f49257k = null;
    }

    @Override
    public final boolean a() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f49251b;
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
            ArrayList arrayList = this.f49251b;
            if (i10 < arrayList.size()) {
                z10 |= ((j) arrayList.get(i10)).b(iArr);
                i10++;
            } else {
                return z10;
            }
        }
    }

    public final void c() {
        Matrix matrix = this.f49256j;
        matrix.reset();
        matrix.postTranslate(-this.d, -this.e);
        matrix.postScale(this.f49253f, this.f49254g);
        matrix.postRotate(this.f49252c, 0.0f, 0.0f);
        matrix.postTranslate(this.h + this.d, this.f49255i + this.e);
    }

    public String getGroupName() {
        return this.f49257k;
    }

    public Matrix getLocalMatrix() {
        return this.f49256j;
    }

    public float getPivotX() {
        return this.d;
    }

    public float getPivotY() {
        return this.e;
    }

    public float getRotation() {
        return this.f49252c;
    }

    public float getScaleX() {
        return this.f49253f;
    }

    public float getScaleY() {
        return this.f49254g;
    }

    public float getTranslateX() {
        return this.h;
    }

    public float getTranslateY() {
        return this.f49255i;
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
        if (f7 != this.f49252c) {
            this.f49252c = f7;
            c();
        }
    }

    public void setScaleX(float f7) {
        if (f7 != this.f49253f) {
            this.f49253f = f7;
            c();
        }
    }

    public void setScaleY(float f7) {
        if (f7 != this.f49254g) {
            this.f49254g = f7;
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
        if (f7 != this.f49255i) {
            this.f49255i = f7;
            c();
        }
    }

    public i(i iVar, a0.f fVar) {
        k kVar;
        this.f49250a = new Matrix();
        this.f49251b = new ArrayList();
        this.f49252c = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f49253f = 1.0f;
        this.f49254g = 1.0f;
        this.h = 0.0f;
        this.f49255i = 0.0f;
        Matrix matrix = new Matrix();
        this.f49256j = matrix;
        this.f49257k = null;
        this.f49252c = iVar.f49252c;
        this.d = iVar.d;
        this.e = iVar.e;
        this.f49253f = iVar.f49253f;
        this.f49254g = iVar.f49254g;
        this.h = iVar.h;
        this.f49255i = iVar.f49255i;
        String str = iVar.f49257k;
        this.f49257k = str;
        if (str != null) {
            fVar.put(str, this);
        }
        matrix.set(iVar.f49256j);
        ArrayList arrayList = iVar.f49251b;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            Object obj = arrayList.get(i10);
            if (obj instanceof i) {
                this.f49251b.add(new i((i) obj, fVar));
            } else {
                if (obj instanceof h) {
                    h hVar = (h) obj;
                    ?? kVar2 = new k(hVar);
                    kVar2.e = 0.0f;
                    kVar2.f49243g = 1.0f;
                    kVar2.h = 1.0f;
                    kVar2.f49244i = 0.0f;
                    kVar2.f49245j = 1.0f;
                    kVar2.f49246k = 0.0f;
                    kVar2.f49247l = Paint.Cap.BUTT;
                    kVar2.f49248m = Paint.Join.MITER;
                    kVar2.f49249n = 4.0f;
                    kVar2.d = hVar.d;
                    kVar2.e = hVar.e;
                    kVar2.f49243g = hVar.f49243g;
                    kVar2.f49242f = hVar.f49242f;
                    kVar2.f49260c = hVar.f49260c;
                    kVar2.h = hVar.h;
                    kVar2.f49244i = hVar.f49244i;
                    kVar2.f49245j = hVar.f49245j;
                    kVar2.f49246k = hVar.f49246k;
                    kVar2.f49247l = hVar.f49247l;
                    kVar2.f49248m = hVar.f49248m;
                    kVar2.f49249n = hVar.f49249n;
                    kVar = kVar2;
                } else if (obj instanceof g) {
                    kVar = new k((g) obj);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.f49251b.add(kVar);
                Object obj2 = kVar.f49259b;
                if (obj2 != null) {
                    fVar.put(obj2, kVar);
                }
            }
        }
    }
}
