package yh;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.tr;
public final class g3 {
    public final Runnable f51333a;
    public f3 f51334b;
    public f3 f51335c;
    public f3 d;
    public int f51336e;
    public float f51337f;
    public final ArrayList f51338g;
    public final f3 h;
    public final f3 f51339i;
    public final float f51340j;
    public final int f51341k;
    public int f51342l;
    public final org.telegram.ui.Components.e6 f51343m;
    public int f51344n = -1;

    public g3(Runnable runnable, ArrayList arrayList, f3 f3Var, f3 f3Var2, float f7, int i10) {
        this.f51337f = 0.0f;
        this.f51333a = runnable;
        this.f51338g = arrayList;
        this.h = f3Var;
        this.f51339i = f3Var2;
        this.f51340j = f7;
        this.f51341k = i10;
        org.telegram.ui.Components.e6 e6Var = new org.telegram.ui.Components.e6(runnable, 300L, tr.h);
        this.f51343m = e6Var;
        e6Var.a(true);
        this.f51337f = -0.5f;
        this.f51336e = 1;
        this.f51342l = i10;
        this.f51334b = f3Var;
        this.f51335c = d(false);
        this.d = d(false);
    }

    public final void a() {
        f3 f3Var = this.h;
        if (f3Var != null) {
            f3Var.a();
        }
        f3 f3Var2 = this.f51339i;
        if (f3Var2 != null) {
            f3Var2.a();
        }
    }

    public final boolean b(float f7) {
        if (this.f51335c == this.f51339i && this.f51337f + f7 >= this.f51336e + 0.5f) {
            return true;
        }
        return false;
    }

    public final boolean c() {
        if (this.f51335c == this.f51339i && this.f51337f >= this.f51336e + 0.5f) {
            return true;
        }
        return false;
    }

    public final f3 d(boolean z10) {
        ArrayList arrayList;
        if (z10) {
            f3 f3Var = this.f51339i;
            if (f3Var.b()) {
                int i10 = this.f51342l;
                if (i10 <= 0) {
                    return f3Var;
                }
                this.f51342l = i10 - 1;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        int i11 = 0;
        while (true) {
            arrayList = this.f51338g;
            if (i11 >= arrayList.size()) {
                break;
            }
            if (i11 != this.f51344n && ((f3) arrayList.get(i11)).b()) {
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
        this.f51344n = intValue;
        return (f3) arrayList.get(intValue);
    }

    public final void e() {
        this.f51334b = this.f51335c;
        this.f51335c = this.f51339i;
        this.d = null;
        int i10 = this.f51336e + 1;
        this.f51336e = i10;
        this.f51337f = i10 + 0.5f;
    }

    public final float f(float f7, boolean z10) {
        int i10;
        long j3;
        boolean z11;
        float f10;
        f3 f3Var;
        f3 d;
        int i11 = this.f51342l;
        int i12 = this.f51341k;
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
        org.telegram.ui.Components.e6 e6Var = this.f51343m;
        e6Var.f25990g = j3;
        if (i11 >= i12) {
            z11 = true;
        } else {
            z11 = false;
        }
        float e7 = e6Var.e(z11);
        if (i12 == 3) {
            f10 = 0.75f;
        } else {
            f10 = 2.0f;
        }
        float lerp = (f7 * AndroidUtilities.lerp(f10, 7.5f, e7) * this.f51340j) + this.f51337f;
        this.f51337f = lerp;
        f3 f3Var2 = this.f51339i;
        if (lerp >= 0.0f) {
            double d10 = lerp;
            if (Math.floor(d10) + 1.0d > this.f51336e && (f3Var = this.f51335c) != f3Var2) {
                this.f51334b = f3Var;
                f3 f3Var3 = this.d;
                this.f51335c = f3Var3;
                if (f3Var3 == f3Var2) {
                    d = null;
                } else {
                    d = d(z10);
                }
                this.d = d;
                this.f51336e = ((int) Math.floor(d10)) + 1;
            }
        }
        if (this.f51335c == f3Var2) {
            return Math.min(lerp, this.f51336e + 0.5f);
        }
        return lerp;
    }
}
