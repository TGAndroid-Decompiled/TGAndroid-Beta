package yh;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.rr;
public final class f3 {
    public final Runnable f47368a;
    public e3 f47369b;
    public e3 f47370c;
    public e3 d;
    public int e;
    public float f47371f;
    public final ArrayList f47372g;
    public final e3 h;
    public final e3 f47373i;
    public final float f47374j;
    public final int f47375k;
    public int f47376l;
    public final org.telegram.ui.Components.e6 f47377m;
    public int f47378n = -1;

    public f3(Runnable runnable, ArrayList arrayList, e3 e3Var, e3 e3Var2, float f7, int i10) {
        this.f47371f = 0.0f;
        this.f47368a = runnable;
        this.f47372g = arrayList;
        this.h = e3Var;
        this.f47373i = e3Var2;
        this.f47374j = f7;
        this.f47375k = i10;
        org.telegram.ui.Components.e6 e6Var = new org.telegram.ui.Components.e6(runnable, 300L, rr.h);
        this.f47377m = e6Var;
        e6Var.a(true);
        this.f47371f = -0.5f;
        this.e = 1;
        this.f47376l = i10;
        this.f47369b = e3Var;
        this.f47370c = d(false);
        this.d = d(false);
    }

    public final void a() {
        e3 e3Var = this.h;
        if (e3Var != null) {
            e3Var.a();
        }
        e3 e3Var2 = this.f47373i;
        if (e3Var2 != null) {
            e3Var2.a();
        }
    }

    public final boolean b(float f7) {
        if (this.f47370c == this.f47373i && this.f47371f + f7 >= this.e + 0.5f) {
            return true;
        }
        return false;
    }

    public final boolean c() {
        if (this.f47370c == this.f47373i && this.f47371f >= this.e + 0.5f) {
            return true;
        }
        return false;
    }

    public final e3 d(boolean z10) {
        ArrayList arrayList;
        if (z10) {
            e3 e3Var = this.f47373i;
            if (e3Var.b()) {
                int i10 = this.f47376l;
                if (i10 <= 0) {
                    return e3Var;
                }
                this.f47376l = i10 - 1;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        int i11 = 0;
        while (true) {
            arrayList = this.f47372g;
            if (i11 >= arrayList.size()) {
                break;
            }
            if (i11 != this.f47378n && ((e3) arrayList.get(i11)).b()) {
                arrayList2.add(Integer.valueOf(i11));
            }
            i11++;
        }
        if (arrayList2.isEmpty()) {
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                if (((e3) arrayList.get(i12)).b()) {
                    arrayList2.add(Integer.valueOf(i12));
                }
            }
            if (arrayList2.isEmpty()) {
                return this.h;
            }
        }
        int intValue = ((Integer) AndroidUtilities.randomOf(arrayList2)).intValue();
        this.f47378n = intValue;
        return (e3) arrayList.get(intValue);
    }

    public final void e() {
        this.f47369b = this.f47370c;
        this.f47370c = this.f47373i;
        this.d = null;
        int i10 = this.e + 1;
        this.e = i10;
        this.f47371f = i10 + 0.5f;
    }

    public final float f(float f7, boolean z10) {
        int i10;
        long j3;
        boolean z11;
        float f10;
        e3 e3Var;
        e3 d;
        int i11 = this.f47376l;
        int i12 = this.f47375k;
        if (i11 >= i12) {
            j3 = 450;
        } else {
            if (i12 == 3) {
                i10 = 4500;
            } else {
                i10 = 2500;
            }
            j3 = i10;
        }
        org.telegram.ui.Components.e6 e6Var = this.f47377m;
        e6Var.f23847g = j3;
        if (i11 >= i12) {
            z11 = true;
        } else {
            z11 = false;
        }
        float e = e6Var.e(z11);
        if (i12 == 3) {
            f10 = 0.75f;
        } else {
            f10 = 2.0f;
        }
        float lerp = (f7 * AndroidUtilities.lerp(f10, 7.5f, e) * this.f47374j) + this.f47371f;
        this.f47371f = lerp;
        e3 e3Var2 = this.f47373i;
        if (lerp >= 0.0f) {
            double d10 = lerp;
            if (Math.floor(d10) + 1.0d > this.e && (e3Var = this.f47370c) != e3Var2) {
                this.f47369b = e3Var;
                e3 e3Var3 = this.d;
                this.f47370c = e3Var3;
                if (e3Var3 == e3Var2) {
                    d = null;
                } else {
                    d = d(z10);
                }
                this.d = d;
                this.e = ((int) Math.floor(d10)) + 1;
            }
        }
        if (this.f47370c == e3Var2) {
            return Math.min(lerp, this.e + 0.5f);
        }
        return lerp;
    }
}
