package yh;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.qr;
public final class g3 {
    public final Runnable f47490a;
    public f3 f47491b;
    public f3 f47492c;
    public f3 d;
    public int e;
    public float f47493f;
    public final ArrayList f47494g;
    public final f3 h;
    public final f3 f47495i;
    public final float f47496j;
    public final int f47497k;
    public int f47498l;
    public final org.telegram.ui.Components.d6 f47499m;
    public int f47500n = -1;

    public g3(Runnable runnable, ArrayList arrayList, f3 f3Var, f3 f3Var2, float f7, int i10) {
        this.f47493f = 0.0f;
        this.f47490a = runnable;
        this.f47494g = arrayList;
        this.h = f3Var;
        this.f47495i = f3Var2;
        this.f47496j = f7;
        this.f47497k = i10;
        org.telegram.ui.Components.d6 d6Var = new org.telegram.ui.Components.d6(runnable, 300L, qr.h);
        this.f47499m = d6Var;
        d6Var.a(true);
        this.f47493f = -0.5f;
        this.e = 1;
        this.f47498l = i10;
        this.f47491b = f3Var;
        this.f47492c = d(false);
        this.d = d(false);
    }

    public final void a() {
        f3 f3Var = this.h;
        if (f3Var != null) {
            f3Var.a();
        }
        f3 f3Var2 = this.f47495i;
        if (f3Var2 != null) {
            f3Var2.a();
        }
    }

    public final boolean b(float f7) {
        if (this.f47492c == this.f47495i && this.f47493f + f7 >= this.e + 0.5f) {
            return true;
        }
        return false;
    }

    public final boolean c() {
        if (this.f47492c == this.f47495i && this.f47493f >= this.e + 0.5f) {
            return true;
        }
        return false;
    }

    public final f3 d(boolean z10) {
        ArrayList arrayList;
        if (z10) {
            f3 f3Var = this.f47495i;
            if (f3Var.b()) {
                int i10 = this.f47498l;
                if (i10 <= 0) {
                    return f3Var;
                }
                this.f47498l = i10 - 1;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        int i11 = 0;
        while (true) {
            arrayList = this.f47494g;
            if (i11 >= arrayList.size()) {
                break;
            }
            if (i11 != this.f47500n && ((f3) arrayList.get(i11)).b()) {
                arrayList2.add(Integer.valueOf(i11));
            }
            i11++;
        }
        if (arrayList2.isEmpty()) {
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                if (((f3) arrayList.get(i12)).b()) {
                    arrayList2.add(Integer.valueOf(i12));
                }
            }
            if (arrayList2.isEmpty()) {
                return this.h;
            }
        }
        int intValue = ((Integer) AndroidUtilities.randomOf(arrayList2)).intValue();
        this.f47500n = intValue;
        return (f3) arrayList.get(intValue);
    }

    public final void e() {
        this.f47491b = this.f47492c;
        this.f47492c = this.f47495i;
        this.d = null;
        int i10 = this.e + 1;
        this.e = i10;
        this.f47493f = i10 + 0.5f;
    }

    public final float f(float f7, boolean z10) {
        int i10;
        long j3;
        boolean z11;
        float f10;
        f3 f3Var;
        f3 d;
        int i11 = this.f47498l;
        int i12 = this.f47497k;
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
        org.telegram.ui.Components.d6 d6Var = this.f47499m;
        d6Var.f23572g = j3;
        if (i11 >= i12) {
            z11 = true;
        } else {
            z11 = false;
        }
        float e = d6Var.e(z11);
        if (i12 == 3) {
            f10 = 0.75f;
        } else {
            f10 = 2.0f;
        }
        float lerp = (f7 * AndroidUtilities.lerp(f10, 7.5f, e) * this.f47496j) + this.f47493f;
        this.f47493f = lerp;
        f3 f3Var2 = this.f47495i;
        if (lerp >= 0.0f) {
            double d10 = lerp;
            if (Math.floor(d10) + 1.0d > this.e && (f3Var = this.f47492c) != f3Var2) {
                this.f47491b = f3Var;
                f3 f3Var3 = this.d;
                this.f47492c = f3Var3;
                if (f3Var3 == f3Var2) {
                    d = null;
                } else {
                    d = d(z10);
                }
                this.d = d;
                this.e = ((int) Math.floor(d10)) + 1;
            }
        }
        if (this.f47492c == f3Var2) {
            return Math.min(lerp, this.e + 0.5f);
        }
        return lerp;
    }
}
