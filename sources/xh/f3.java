package xh;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.wr;
public final class f3 {
    public final Runnable f45400a;
    public e3 f45401b;
    public e3 f45402c;
    public e3 d;
    public int e;
    public float f45403f;
    public final ArrayList f45404g;
    public final e3 h;
    public final e3 f45405i;
    public final float f45406j;
    public final int f45407k;
    public int f45408l;
    public final org.telegram.ui.Components.d6 f45409m;
    public int f45410n = -1;

    public f3(Runnable runnable, ArrayList arrayList, e3 e3Var, e3 e3Var2, float f7, int i10) {
        this.f45403f = 0.0f;
        this.f45400a = runnable;
        this.f45404g = arrayList;
        this.h = e3Var;
        this.f45405i = e3Var2;
        this.f45406j = f7;
        this.f45407k = i10;
        org.telegram.ui.Components.d6 d6Var = new org.telegram.ui.Components.d6(runnable, 300L, wr.h);
        this.f45409m = d6Var;
        d6Var.a(true);
        this.f45403f = -0.5f;
        this.e = 1;
        this.f45408l = i10;
        this.f45401b = e3Var;
        this.f45402c = d(false);
        this.d = d(false);
    }

    public final void a() {
        e3 e3Var = this.h;
        if (e3Var != null) {
            e3Var.a();
        }
        e3 e3Var2 = this.f45405i;
        if (e3Var2 != null) {
            e3Var2.a();
        }
    }

    public final boolean b(float f7) {
        if (this.f45402c == this.f45405i && this.f45403f + f7 >= this.e + 0.5f) {
            return true;
        }
        return false;
    }

    public final boolean c() {
        if (this.f45402c == this.f45405i && this.f45403f >= this.e + 0.5f) {
            return true;
        }
        return false;
    }

    public final e3 d(boolean z10) {
        ArrayList arrayList;
        if (z10) {
            e3 e3Var = this.f45405i;
            if (e3Var.b()) {
                int i10 = this.f45408l;
                if (i10 <= 0) {
                    return e3Var;
                }
                this.f45408l = i10 - 1;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        int i11 = 0;
        while (true) {
            arrayList = this.f45404g;
            if (i11 >= arrayList.size()) {
                break;
            }
            if (i11 != this.f45410n && ((e3) arrayList.get(i11)).b()) {
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
        this.f45410n = intValue;
        return (e3) arrayList.get(intValue);
    }

    public final void e() {
        this.f45401b = this.f45402c;
        this.f45402c = this.f45405i;
        this.d = null;
        int i10 = this.e + 1;
        this.e = i10;
        this.f45403f = i10 + 0.5f;
    }

    public final float f(float f7, boolean z10) {
        int i10;
        long j3;
        boolean z11;
        float f10;
        e3 e3Var;
        e3 d;
        int i11 = this.f45408l;
        int i12 = this.f45407k;
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
        org.telegram.ui.Components.d6 d6Var = this.f45409m;
        d6Var.f22297g = j3;
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
        float lerp = (f7 * AndroidUtilities.lerp(f10, 7.5f, e) * this.f45406j) + this.f45403f;
        this.f45403f = lerp;
        e3 e3Var2 = this.f45405i;
        if (lerp >= 0.0f) {
            double d10 = lerp;
            if (Math.floor(d10) + 1.0d > this.e && (e3Var = this.f45402c) != e3Var2) {
                this.f45401b = e3Var;
                e3 e3Var3 = this.d;
                this.f45402c = e3Var3;
                if (e3Var3 == e3Var2) {
                    d = null;
                } else {
                    d = d(z10);
                }
                this.d = d;
                this.e = ((int) Math.floor(d10)) + 1;
            }
        }
        if (this.f45402c == e3Var2) {
            return Math.min(lerp, this.e + 0.5f);
        }
        return lerp;
    }
}
