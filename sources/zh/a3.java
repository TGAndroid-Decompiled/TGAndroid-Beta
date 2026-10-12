package zh;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.es;
public final class a3 {
    public final Runnable f50257a;
    public z2 f50258b;
    public z2 f50259c;
    public z2 d;
    public int e;
    public float f50260f;
    public final ArrayList f50261g;
    public final z2 h;
    public final z2 f50262i;
    public final float f50263j;
    public final int f50264k;
    public int f50265l;
    public final org.telegram.ui.Components.g6 f50266m;
    public int f50267n = -1;

    public a3(Runnable runnable, ArrayList arrayList, z2 z2Var, z2 z2Var2, float f7, int i10) {
        this.f50260f = 0.0f;
        this.f50257a = runnable;
        this.f50261g = arrayList;
        this.h = z2Var;
        this.f50262i = z2Var2;
        this.f50263j = f7;
        this.f50264k = i10;
        org.telegram.ui.Components.g6 g6Var = new org.telegram.ui.Components.g6(runnable, 300L, es.h);
        this.f50266m = g6Var;
        g6Var.a(true);
        this.f50260f = -0.5f;
        this.e = 1;
        this.f50265l = i10;
        this.f50258b = z2Var;
        this.f50259c = d(false);
        this.d = d(false);
    }

    public final void a() {
        z2 z2Var = this.h;
        if (z2Var != null) {
            z2Var.a();
        }
        z2 z2Var2 = this.f50262i;
        if (z2Var2 != null) {
            z2Var2.a();
        }
    }

    public final boolean b(float f7) {
        if (this.f50259c == this.f50262i && this.f50260f + f7 >= this.e + 0.5f) {
            return true;
        }
        return false;
    }

    public final boolean c() {
        if (this.f50259c == this.f50262i && this.f50260f >= this.e + 0.5f) {
            return true;
        }
        return false;
    }

    public final z2 d(boolean z10) {
        ArrayList arrayList;
        if (z10) {
            z2 z2Var = this.f50262i;
            if (z2Var.b()) {
                int i10 = this.f50265l;
                if (i10 <= 0) {
                    return z2Var;
                }
                this.f50265l = i10 - 1;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        int i11 = 0;
        while (true) {
            arrayList = this.f50261g;
            if (i11 >= arrayList.size()) {
                break;
            }
            if (i11 != this.f50267n && ((z2) arrayList.get(i11)).b()) {
                arrayList2.add(Integer.valueOf(i11));
            }
            i11++;
        }
        if (arrayList2.isEmpty()) {
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                if (((z2) arrayList.get(i12)).b()) {
                    arrayList2.add(Integer.valueOf(i12));
                }
            }
            if (arrayList2.isEmpty()) {
                return this.h;
            }
        }
        int intValue = ((Integer) AndroidUtilities.randomOf(arrayList2)).intValue();
        this.f50267n = intValue;
        return (z2) arrayList.get(intValue);
    }

    public final void e() {
        this.f50258b = this.f50259c;
        this.f50259c = this.f50262i;
        this.d = null;
        int i10 = this.e + 1;
        this.e = i10;
        this.f50260f = i10 + 0.5f;
    }

    public final float f(float f7, boolean z10) {
        int i10;
        long j10;
        boolean z11;
        float f10;
        z2 z2Var;
        z2 d;
        int i11 = this.f50265l;
        int i12 = this.f50264k;
        if (i11 >= i12) {
            j10 = 450;
        } else {
            if (i12 == 3) {
                i10 = 4500;
            } else {
                i10 = 2500;
            }
            j10 = i10;
        }
        org.telegram.ui.Components.g6 g6Var = this.f50266m;
        g6Var.f25192g = j10;
        if (i11 >= i12) {
            z11 = true;
        } else {
            z11 = false;
        }
        float e = g6Var.e(z11);
        if (i12 == 3) {
            f10 = 0.75f;
        } else {
            f10 = 2.0f;
        }
        float lerp = (f7 * AndroidUtilities.lerp(f10, 7.5f, e) * this.f50263j) + this.f50260f;
        this.f50260f = lerp;
        int i13 = (lerp > 0.0f ? 1 : (lerp == 0.0f ? 0 : -1));
        z2 z2Var2 = this.f50262i;
        if (i13 >= 0) {
            double d10 = lerp;
            if (Math.floor(d10) + 1.0d > this.e && (z2Var = this.f50259c) != z2Var2) {
                this.f50258b = z2Var;
                z2 z2Var3 = this.d;
                this.f50259c = z2Var3;
                if (z2Var3 == z2Var2) {
                    d = null;
                } else {
                    d = d(z10);
                }
                this.d = d;
                this.e = ((int) Math.floor(d10)) + 1;
            }
        }
        if (this.f50259c == z2Var2) {
            return Math.min(lerp, this.e + 0.5f);
        }
        return lerp;
    }
}
