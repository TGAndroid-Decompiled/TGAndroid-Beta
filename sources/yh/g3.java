package yh;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.qr;
public final class g3 {
    public final Runnable f47424a;
    public f3 f47425b;
    public f3 f47426c;
    public f3 d;
    public int e;
    public float f47427f;
    public final ArrayList f47428g;
    public final f3 h;
    public final f3 f47429i;
    public final float f47430j;
    public final int f47431k;
    public int f47432l;
    public final org.telegram.ui.Components.e6 f47433m;
    public int f47434n = -1;

    public g3(Runnable runnable, ArrayList arrayList, f3 f3Var, f3 f3Var2, float f7, int i10) {
        this.f47427f = 0.0f;
        this.f47424a = runnable;
        this.f47428g = arrayList;
        this.h = f3Var;
        this.f47429i = f3Var2;
        this.f47430j = f7;
        this.f47431k = i10;
        org.telegram.ui.Components.e6 e6Var = new org.telegram.ui.Components.e6(runnable, 300L, qr.h);
        this.f47433m = e6Var;
        e6Var.a(true);
        this.f47427f = -0.5f;
        this.e = 1;
        this.f47432l = i10;
        this.f47425b = f3Var;
        this.f47426c = d(false);
        this.d = d(false);
    }

    public final void a() {
        f3 f3Var = this.h;
        if (f3Var != null) {
            f3Var.a();
        }
        f3 f3Var2 = this.f47429i;
        if (f3Var2 != null) {
            f3Var2.a();
        }
    }

    public final boolean b(float f7) {
        if (this.f47426c == this.f47429i && this.f47427f + f7 >= this.e + 0.5f) {
            return true;
        }
        return false;
    }

    public final boolean c() {
        if (this.f47426c == this.f47429i && this.f47427f >= this.e + 0.5f) {
            return true;
        }
        return false;
    }

    public final f3 d(boolean z10) {
        ArrayList arrayList;
        if (z10) {
            f3 f3Var = this.f47429i;
            if (f3Var.b()) {
                int i10 = this.f47432l;
                if (i10 <= 0) {
                    return f3Var;
                }
                this.f47432l = i10 - 1;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        int i11 = 0;
        while (true) {
            arrayList = this.f47428g;
            if (i11 >= arrayList.size()) {
                break;
            }
            if (i11 != this.f47434n && ((f3) arrayList.get(i11)).b()) {
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
        this.f47434n = intValue;
        return (f3) arrayList.get(intValue);
    }

    public final void e() {
        this.f47425b = this.f47426c;
        this.f47426c = this.f47429i;
        this.d = null;
        int i10 = this.e + 1;
        this.e = i10;
        this.f47427f = i10 + 0.5f;
    }

    public final float f(float f7, boolean z10) {
        int i10;
        long j3;
        boolean z11;
        float f10;
        f3 f3Var;
        f3 d;
        int i11 = this.f47432l;
        int i12 = this.f47431k;
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
        org.telegram.ui.Components.e6 e6Var = this.f47433m;
        e6Var.f23796g = j3;
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
        float lerp = (f7 * AndroidUtilities.lerp(f10, 7.5f, e) * this.f47430j) + this.f47427f;
        this.f47427f = lerp;
        f3 f3Var2 = this.f47429i;
        if (lerp >= 0.0f) {
            double d10 = lerp;
            if (Math.floor(d10) + 1.0d > this.e && (f3Var = this.f47426c) != f3Var2) {
                this.f47425b = f3Var;
                f3 f3Var3 = this.d;
                this.f47426c = f3Var3;
                if (f3Var3 == f3Var2) {
                    d = null;
                } else {
                    d = d(z10);
                }
                this.d = d;
                this.e = ((int) Math.floor(d10)) + 1;
            }
        }
        if (this.f47426c == f3Var2) {
            return Math.min(lerp, this.e + 0.5f);
        }
        return lerp;
    }
}
