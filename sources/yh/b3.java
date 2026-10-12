package yh;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.js;
public final class b3 {
    public final Runnable f52505a;
    public a3 f52506b;
    public a3 f52507c;
    public a3 d;
    public int f52508e;
    public float f52509f;
    public final ArrayList f52510g;
    public final a3 h;
    public final a3 f52511i;
    public final float f52512j;
    public final int f52513k;
    public int f52514l;
    public final org.telegram.ui.Components.g6 f52515m;
    public int f52516n = -1;

    public b3(Runnable runnable, ArrayList arrayList, a3 a3Var, a3 a3Var2, float f7, int i10) {
        this.f52509f = 0.0f;
        this.f52505a = runnable;
        this.f52510g = arrayList;
        this.h = a3Var;
        this.f52511i = a3Var2;
        this.f52512j = f7;
        this.f52513k = i10;
        org.telegram.ui.Components.g6 g6Var = new org.telegram.ui.Components.g6(runnable, 300L, js.h);
        this.f52515m = g6Var;
        g6Var.a(true);
        this.f52509f = -0.5f;
        this.f52508e = 1;
        this.f52514l = i10;
        this.f52506b = a3Var;
        this.f52507c = d(false);
        this.d = d(false);
    }

    public final void a() {
        a3 a3Var = this.h;
        if (a3Var != null) {
            a3Var.a();
        }
        a3 a3Var2 = this.f52511i;
        if (a3Var2 != null) {
            a3Var2.a();
        }
    }

    public final boolean b(float f7) {
        if (this.f52507c == this.f52511i && this.f52509f + f7 >= this.f52508e + 0.5f) {
            return true;
        }
        return false;
    }

    public final boolean c() {
        if (this.f52507c == this.f52511i && this.f52509f >= this.f52508e + 0.5f) {
            return true;
        }
        return false;
    }

    public final a3 d(boolean z10) {
        ArrayList arrayList;
        if (z10) {
            a3 a3Var = this.f52511i;
            if (a3Var.b()) {
                int i10 = this.f52514l;
                if (i10 <= 0) {
                    return a3Var;
                }
                this.f52514l = i10 - 1;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        int i11 = 0;
        while (true) {
            arrayList = this.f52510g;
            if (i11 >= arrayList.size()) {
                break;
            }
            if (i11 != this.f52516n && ((a3) arrayList.get(i11)).b()) {
                arrayList2.add(Integer.valueOf(i11));
            }
            i11++;
        }
        if (arrayList2.isEmpty()) {
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                if (((a3) arrayList.get(i12)).b()) {
                    arrayList2.add(Integer.valueOf(i12));
                }
            }
            if (arrayList2.isEmpty()) {
                return this.h;
            }
        }
        int intValue = ((Integer) AndroidUtilities.randomOf(arrayList2)).intValue();
        this.f52516n = intValue;
        return (a3) arrayList.get(intValue);
    }

    public final void e() {
        this.f52506b = this.f52507c;
        this.f52507c = this.f52511i;
        this.d = null;
        int i10 = this.f52508e + 1;
        this.f52508e = i10;
        this.f52509f = i10 + 0.5f;
    }

    public final float f(float f7, boolean z10) {
        int i10;
        long j3;
        boolean z11;
        float f10;
        a3 a3Var;
        a3 d;
        int i11 = this.f52514l;
        int i12 = this.f52513k;
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
        org.telegram.ui.Components.g6 g6Var = this.f52515m;
        g6Var.f26306g = j3;
        if (i11 >= i12) {
            z11 = true;
        } else {
            z11 = false;
        }
        float e7 = g6Var.e(z11);
        if (i12 == 3) {
            f10 = 0.75f;
        } else {
            f10 = 2.0f;
        }
        float lerp = (f7 * AndroidUtilities.lerp(f10, 7.5f, e7) * this.f52512j) + this.f52509f;
        this.f52509f = lerp;
        int i13 = (lerp > 0.0f ? 1 : (lerp == 0.0f ? 0 : -1));
        a3 a3Var2 = this.f52511i;
        if (i13 >= 0) {
            double d10 = lerp;
            if (Math.floor(d10) + 1.0d > this.f52508e && (a3Var = this.f52507c) != a3Var2) {
                this.f52506b = a3Var;
                a3 a3Var3 = this.d;
                this.f52507c = a3Var3;
                if (a3Var3 == a3Var2) {
                    d = null;
                } else {
                    d = d(z10);
                }
                this.d = d;
                this.f52508e = ((int) Math.floor(d10)) + 1;
            }
        }
        if (this.f52507c == a3Var2) {
            return Math.min(lerp, this.f52508e + 0.5f);
        }
        return lerp;
    }
}
