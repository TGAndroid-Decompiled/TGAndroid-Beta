package zh;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.pr;
public final class f3 {
    public final Runnable f51892a;
    public e3 f51893b;
    public e3 f51894c;
    public e3 d;
    public int f51895e;
    public float f51896f;
    public final ArrayList f51897g;
    public final e3 h;
    public final e3 f51898i;
    public final float f51899j;
    public final int f51900k;
    public int f51901l;
    public final org.telegram.ui.Components.e6 f51902m;
    public int f51903n = -1;

    public f3(Runnable runnable, ArrayList arrayList, e3 e3Var, e3 e3Var2, float f7, int i10) {
        this.f51896f = 0.0f;
        this.f51892a = runnable;
        this.f51897g = arrayList;
        this.h = e3Var;
        this.f51898i = e3Var2;
        this.f51899j = f7;
        this.f51900k = i10;
        org.telegram.ui.Components.e6 e6Var = new org.telegram.ui.Components.e6(runnable, 300L, pr.h);
        this.f51902m = e6Var;
        e6Var.a(true);
        this.f51896f = -0.5f;
        this.f51895e = 1;
        this.f51901l = i10;
        this.f51893b = e3Var;
        this.f51894c = d(false);
        this.d = d(false);
    }

    public final void a() {
        e3 e3Var = this.h;
        if (e3Var != null) {
            e3Var.a();
        }
        e3 e3Var2 = this.f51898i;
        if (e3Var2 != null) {
            e3Var2.a();
        }
    }

    public final boolean b(float f7) {
        if (this.f51894c == this.f51898i && this.f51896f + f7 >= this.f51895e + 0.5f) {
            return true;
        }
        return false;
    }

    public final boolean c() {
        if (this.f51894c == this.f51898i && this.f51896f >= this.f51895e + 0.5f) {
            return true;
        }
        return false;
    }

    public final e3 d(boolean z10) {
        ArrayList arrayList;
        if (z10) {
            e3 e3Var = this.f51898i;
            if (e3Var.b()) {
                int i10 = this.f51901l;
                if (i10 <= 0) {
                    return e3Var;
                }
                this.f51901l = i10 - 1;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        int i11 = 0;
        while (true) {
            arrayList = this.f51897g;
            if (i11 >= arrayList.size()) {
                break;
            }
            if (i11 != this.f51903n && ((e3) arrayList.get(i11)).b()) {
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
        this.f51903n = intValue;
        return (e3) arrayList.get(intValue);
    }

    public final void e() {
        this.f51893b = this.f51894c;
        this.f51894c = this.f51898i;
        this.d = null;
        int i10 = this.f51895e + 1;
        this.f51895e = i10;
        this.f51896f = i10 + 0.5f;
    }

    public final float f(float f7, boolean z10) {
        int i10;
        long j3;
        boolean z11;
        float f10;
        e3 e3Var;
        e3 d;
        int i11 = this.f51901l;
        int i12 = this.f51900k;
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
        org.telegram.ui.Components.e6 e6Var = this.f51902m;
        e6Var.f25596g = j3;
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
        float lerp = (f7 * AndroidUtilities.lerp(f10, 7.5f, e7) * this.f51899j) + this.f51896f;
        this.f51896f = lerp;
        e3 e3Var2 = this.f51898i;
        if (lerp >= 0.0f) {
            double d10 = lerp;
            if (Math.floor(d10) + 1.0d > this.f51895e && (e3Var = this.f51894c) != e3Var2) {
                this.f51893b = e3Var;
                e3 e3Var3 = this.d;
                this.f51894c = e3Var3;
                if (e3Var3 == e3Var2) {
                    d = null;
                } else {
                    d = d(z10);
                }
                this.d = d;
                this.f51895e = ((int) Math.floor(d10)) + 1;
            }
        }
        if (this.f51894c == e3Var2) {
            return Math.min(lerp, this.f51895e + 0.5f);
        }
        return lerp;
    }
}
