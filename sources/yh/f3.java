package yh;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.tr;
public final class f3 {
    public final Runnable f51267a;
    public e3 f51268b;
    public e3 f51269c;
    public e3 d;
    public int f51270e;
    public float f51271f;
    public final ArrayList f51272g;
    public final e3 h;
    public final e3 f51273i;
    public final float f51274j;
    public final int f51275k;
    public int f51276l;
    public final org.telegram.ui.Components.e6 f51277m;
    public int f51278n = -1;

    public f3(Runnable runnable, ArrayList arrayList, e3 e3Var, e3 e3Var2, float f7, int i10) {
        this.f51271f = 0.0f;
        this.f51267a = runnable;
        this.f51272g = arrayList;
        this.h = e3Var;
        this.f51273i = e3Var2;
        this.f51274j = f7;
        this.f51275k = i10;
        org.telegram.ui.Components.e6 e6Var = new org.telegram.ui.Components.e6(runnable, 300L, tr.h);
        this.f51277m = e6Var;
        e6Var.a(true);
        this.f51271f = -0.5f;
        this.f51270e = 1;
        this.f51276l = i10;
        this.f51268b = e3Var;
        this.f51269c = d(false);
        this.d = d(false);
    }

    public final void a() {
        e3 e3Var = this.h;
        if (e3Var != null) {
            e3Var.a();
        }
        e3 e3Var2 = this.f51273i;
        if (e3Var2 != null) {
            e3Var2.a();
        }
    }

    public final boolean b(float f7) {
        if (this.f51269c == this.f51273i && this.f51271f + f7 >= this.f51270e + 0.5f) {
            return true;
        }
        return false;
    }

    public final boolean c() {
        if (this.f51269c == this.f51273i && this.f51271f >= this.f51270e + 0.5f) {
            return true;
        }
        return false;
    }

    public final e3 d(boolean z10) {
        ArrayList arrayList;
        if (z10) {
            e3 e3Var = this.f51273i;
            if (e3Var.b()) {
                int i10 = this.f51276l;
                if (i10 <= 0) {
                    return e3Var;
                }
                this.f51276l = i10 - 1;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        int i11 = 0;
        while (true) {
            arrayList = this.f51272g;
            if (i11 >= arrayList.size()) {
                break;
            }
            if (i11 != this.f51278n && ((e3) arrayList.get(i11)).b()) {
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
        this.f51278n = intValue;
        return (e3) arrayList.get(intValue);
    }

    public final void e() {
        this.f51268b = this.f51269c;
        this.f51269c = this.f51273i;
        this.d = null;
        int i10 = this.f51270e + 1;
        this.f51270e = i10;
        this.f51271f = i10 + 0.5f;
    }

    public final float f(float f7, boolean z10) {
        int i10;
        long j3;
        boolean z11;
        float f10;
        e3 e3Var;
        e3 d;
        int i11 = this.f51276l;
        int i12 = this.f51275k;
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
        org.telegram.ui.Components.e6 e6Var = this.f51277m;
        e6Var.f25936g = j3;
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
        float lerp = (f7 * AndroidUtilities.lerp(f10, 7.5f, e7) * this.f51274j) + this.f51271f;
        this.f51271f = lerp;
        e3 e3Var2 = this.f51273i;
        if (lerp >= 0.0f) {
            double d10 = lerp;
            if (Math.floor(d10) + 1.0d > this.f51270e && (e3Var = this.f51269c) != e3Var2) {
                this.f51268b = e3Var;
                e3 e3Var3 = this.d;
                this.f51269c = e3Var3;
                if (e3Var3 == e3Var2) {
                    d = null;
                } else {
                    d = d(z10);
                }
                this.d = d;
                this.f51270e = ((int) Math.floor(d10)) + 1;
            }
        }
        if (this.f51269c == e3Var2) {
            return Math.min(lerp, this.f51270e + 0.5f);
        }
        return lerp;
    }
}
