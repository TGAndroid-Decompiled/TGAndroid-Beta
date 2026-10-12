package x4;

import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;
public final class i extends j {
    public final Matrix f50855a;
    public final ArrayList f50856b;
    public float f50857c;
    public float d;
    public float f50858e;
    public float f50859f;
    public float f50860g;
    public float h;
    public float f50861i;
    public final Matrix f50862j;
    public String f50863k;

    public i() {
        this.f50855a = new Matrix();
        this.f50856b = new ArrayList();
        this.f50857c = 0.0f;
        this.d = 0.0f;
        this.f50858e = 0.0f;
        this.f50859f = 1.0f;
        this.f50860g = 1.0f;
        this.h = 0.0f;
        this.f50861i = 0.0f;
        this.f50862j = new Matrix();
        this.f50863k = null;
    }

    @Override
    public final boolean a() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f50856b;
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
            ArrayList arrayList = this.f50856b;
            if (i10 < arrayList.size()) {
                z10 |= ((j) arrayList.get(i10)).b(iArr);
                i10++;
            } else {
                return z10;
            }
        }
    }

    public final void c() {
        Matrix matrix = this.f50862j;
        matrix.reset();
        matrix.postTranslate(-this.d, -this.f50858e);
        matrix.postScale(this.f50859f, this.f50860g);
        matrix.postRotate(this.f50857c, 0.0f, 0.0f);
        matrix.postTranslate(this.h + this.d, this.f50861i + this.f50858e);
    }

    public String getGroupName() {
        return this.f50863k;
    }

    public Matrix getLocalMatrix() {
        return this.f50862j;
    }

    public float getPivotX() {
        return this.d;
    }

    public float getPivotY() {
        return this.f50858e;
    }

    public float getRotation() {
        return this.f50857c;
    }

    public float getScaleX() {
        return this.f50859f;
    }

    public float getScaleY() {
        return this.f50860g;
    }

    public float getTranslateX() {
        return this.h;
    }

    public float getTranslateY() {
        return this.f50861i;
    }

    public void setPivotX(float f7) {
        if (f7 != this.d) {
            this.d = f7;
            c();
        }
    }

    public void setPivotY(float f7) {
        if (f7 != this.f50858e) {
            this.f50858e = f7;
            c();
        }
    }

    public void setRotation(float f7) {
        if (f7 != this.f50857c) {
            this.f50857c = f7;
            c();
        }
    }

    public void setScaleX(float f7) {
        if (f7 != this.f50859f) {
            this.f50859f = f7;
            c();
        }
    }

    public void setScaleY(float f7) {
        if (f7 != this.f50860g) {
            this.f50860g = f7;
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
        if (f7 != this.f50861i) {
            this.f50861i = f7;
            c();
        }
    }

    public i(i iVar, a0.f fVar) {
        k kVar;
        this.f50855a = new Matrix();
        this.f50856b = new ArrayList();
        this.f50857c = 0.0f;
        this.d = 0.0f;
        this.f50858e = 0.0f;
        this.f50859f = 1.0f;
        this.f50860g = 1.0f;
        this.h = 0.0f;
        this.f50861i = 0.0f;
        Matrix matrix = new Matrix();
        this.f50862j = matrix;
        this.f50863k = null;
        this.f50857c = iVar.f50857c;
        this.d = iVar.d;
        this.f50858e = iVar.f50858e;
        this.f50859f = iVar.f50859f;
        this.f50860g = iVar.f50860g;
        this.h = iVar.h;
        this.f50861i = iVar.f50861i;
        String str = iVar.f50863k;
        this.f50863k = str;
        if (str != null) {
            fVar.put(str, this);
        }
        matrix.set(iVar.f50862j);
        ArrayList arrayList = iVar.f50856b;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            Object obj = arrayList.get(i10);
            if (obj instanceof i) {
                this.f50856b.add(new i((i) obj, fVar));
            } else {
                if (obj instanceof h) {
                    h hVar = (h) obj;
                    ?? kVar2 = new k(hVar);
                    kVar2.f50846e = 0.0f;
                    kVar2.f50848g = 1.0f;
                    kVar2.h = 1.0f;
                    kVar2.f50849i = 0.0f;
                    kVar2.f50850j = 1.0f;
                    kVar2.f50851k = 0.0f;
                    kVar2.f50852l = Paint.Cap.BUTT;
                    kVar2.f50853m = Paint.Join.MITER;
                    kVar2.f50854n = 4.0f;
                    kVar2.d = hVar.d;
                    kVar2.f50846e = hVar.f50846e;
                    kVar2.f50848g = hVar.f50848g;
                    kVar2.f50847f = hVar.f50847f;
                    kVar2.f50866c = hVar.f50866c;
                    kVar2.h = hVar.h;
                    kVar2.f50849i = hVar.f50849i;
                    kVar2.f50850j = hVar.f50850j;
                    kVar2.f50851k = hVar.f50851k;
                    kVar2.f50852l = hVar.f50852l;
                    kVar2.f50853m = hVar.f50853m;
                    kVar2.f50854n = hVar.f50854n;
                    kVar = kVar2;
                } else if (obj instanceof g) {
                    kVar = new k((g) obj);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.f50856b.add(kVar);
                Object obj2 = kVar.f50865b;
                if (obj2 != null) {
                    fVar.put(obj2, kVar);
                }
            }
        }
    }
}
