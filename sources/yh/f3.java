package yh;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.rr;
public final class f3 {
    public final Runnable f47367a;
    public e3 f47368b;
    public e3 f47369c;
    public e3 d;
    public int e;
    public float f47370f;
    public final ArrayList f47371g;
    public final e3 h;
    public final e3 f47372i;
    public final float f47373j;
    public final int f47374k;
    public int f47375l;
    public final org.telegram.ui.Components.e6 f47376m;
    public int f47377n = -1;

    public f3(Runnable runnable, ArrayList arrayList, e3 e3Var, e3 e3Var2, float f7, int i10) {
        this.f47370f = 0.0f;
        this.f47367a = runnable;
        this.f47371g = arrayList;
        this.h = e3Var;
        this.f47372i = e3Var2;
        this.f47373j = f7;
        this.f47374k = i10;
        org.telegram.ui.Components.e6 e6Var = new org.telegram.ui.Components.e6(runnable, 300L, rr.h);
        this.f47376m = e6Var;
        e6Var.a(true);
        this.f47370f = -0.5f;
        this.e = 1;
        this.f47375l = i10;
        this.f47368b = e3Var;
        this.f47369c = d(false);
        this.d = d(false);
    }

    public final void a() {
        e3 e3Var = this.h;
        if (e3Var != null) {
            e3Var.a();
        }
        e3 e3Var2 = this.f47372i;
        if (e3Var2 != null) {
            e3Var2.a();
        }
    }

    public final boolean b(float f7) {
        if (this.f47369c == this.f47372i && this.f47370f + f7 >= this.e + 0.5f) {
            return true;
        }
        return false;
    }

    public final boolean c() {
        if (this.f47369c == this.f47372i && this.f47370f >= this.e + 0.5f) {
            return true;
        }
        return false;
    }

    public final e3 d(boolean z10) {
        ArrayList arrayList;
        if (z10) {
            e3 e3Var = this.f47372i;
            if (e3Var.b()) {
                int i10 = this.f47375l;
                if (i10 <= 0) {
                    return e3Var;
                }
                this.f47375l = i10 - 1;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        int i11 = 0;
        while (true) {
            arrayList = this.f47371g;
            if (i11 >= arrayList.size()) {
                break;
            }
            if (i11 != this.f47377n && ((e3) arrayList.get(i11)).b()) {
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
        this.f47377n = intValue;
        return (e3) arrayList.get(intValue);
    }

    public final void e() {
        this.f47368b = this.f47369c;
        this.f47369c = this.f47372i;
        this.d = null;
        int i10 = this.e + 1;
        this.e = i10;
        this.f47370f = i10 + 0.5f;
    }

    public final float f(float f7, boolean z10) {
        int i10;
        long j3;
        boolean z11;
        float f10;
        e3 e3Var;
        e3 d;
        int i11 = this.f47375l;
        int i12 = this.f47374k;
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
        org.telegram.ui.Components.e6 e6Var = this.f47376m;
        e6Var.f23846g = j3;
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
        float lerp = (f7 * AndroidUtilities.lerp(f10, 7.5f, e) * this.f47373j) + this.f47370f;
        this.f47370f = lerp;
        e3 e3Var2 = this.f47372i;
        if (lerp >= 0.0f) {
            double d10 = lerp;
            if (Math.floor(d10) + 1.0d > this.e && (e3Var = this.f47369c) != e3Var2) {
                this.f47368b = e3Var;
                e3 e3Var3 = this.d;
                this.f47369c = e3Var3;
                if (e3Var3 == e3Var2) {
                    d = null;
                } else {
                    d = d(z10);
                }
                this.d = d;
                this.e = ((int) Math.floor(d10)) + 1;
            }
        }
        if (this.f47369c == e3Var2) {
            return Math.min(lerp, this.e + 0.5f);
        }
        return lerp;
    }
}
