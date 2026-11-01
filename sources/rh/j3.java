package rh;

import android.graphics.Typeface;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.gr;
public final class j3 {
    public final Runnable f47128a;
    public i3 f47129b;
    public i3 f47130c;
    public i3 d;
    public int e;
    public float f47131f;
    public final ArrayList f47132g;
    public final i3 h;
    public final i3 f47133i;
    public final float f47134j;
    public final int f47135k;
    public int f47136l;
    public final org.telegram.ui.Components.t5 f47137m;
    public int f47138n = -1;

    public j3(Runnable runnable, ArrayList arrayList, i3 i3Var, i3 i3Var2, float f7, int i10) {
        this.f47131f = 0.0f;
        this.f47128a = runnable;
        this.f47132g = arrayList;
        this.h = i3Var;
        this.f47133i = i3Var2;
        this.f47134j = f7;
        this.f47135k = i10;
        org.telegram.ui.Components.t5 t5Var = new org.telegram.ui.Components.t5(runnable, 300L, gr.h);
        this.f47137m = t5Var;
        t5Var.a(true);
        this.f47131f = -0.5f;
        this.e = 1;
        this.f47136l = i10;
        this.f47129b = i3Var;
        this.f47130c = d(false);
        this.d = d(false);
    }

    public final void a() {
        i3 i3Var = this.h;
        if (i3Var != null) {
            i3Var.a();
        }
        i3 i3Var2 = this.f47133i;
        if (i3Var2 != null) {
            i3Var2.a();
        }
    }

    public final boolean b(float f7) {
        if (this.f47130c == this.f47133i && this.f47131f + f7 >= this.e + 0.5f) {
            return true;
        }
        return false;
    }

    public final boolean c() {
        if (this.f47130c == this.f47133i && this.f47131f >= this.e + 0.5f) {
            return true;
        }
        return false;
    }

    public final i3 d(boolean z10) {
        ArrayList arrayList;
        Object obj;
        if (z10) {
            i3 i3Var = this.f47133i;
            if (i3Var.b()) {
                int i10 = this.f47136l;
                if (i10 <= 0) {
                    return i3Var;
                }
                this.f47136l = i10 - 1;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        int i11 = 0;
        while (true) {
            arrayList = this.f47132g;
            if (i11 >= arrayList.size()) {
                break;
            }
            if (i11 != this.f47138n && ((i3) arrayList.get(i11)).b()) {
                arrayList2.add(Integer.valueOf(i11));
            }
            i11++;
        }
        if (arrayList2.isEmpty()) {
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                if (((i3) arrayList.get(i12)).b()) {
                    arrayList2.add(Integer.valueOf(i12));
                }
            }
            if (arrayList2.isEmpty()) {
                return this.h;
            }
        }
        Typeface typeface = org.telegram.messenger.i0.f16145a;
        if (arrayList2.isEmpty()) {
            obj = null;
        } else {
            obj = arrayList2.get(Math.abs(((int) Utilities.f14521c.nextLong()) % arrayList2.size()));
        }
        int intValue = ((Integer) obj).intValue();
        this.f47138n = intValue;
        return (i3) arrayList.get(intValue);
    }

    public final void e() {
        this.f47129b = this.f47130c;
        this.f47130c = this.f47133i;
        this.d = null;
        int i10 = this.e + 1;
        this.e = i10;
        this.f47131f = i10 + 0.5f;
    }

    public final float f(boolean z10, float f7) {
        int i10;
        long j10;
        boolean z11;
        float f10;
        i3 i3Var;
        i3 d;
        int i11 = this.f47136l;
        int i12 = this.f47135k;
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
        org.telegram.ui.Components.t5 t5Var = this.f47137m;
        t5Var.f30532g = j10;
        if (i11 >= i12) {
            z11 = true;
        } else {
            z11 = false;
        }
        float d10 = t5Var.d(z11);
        if (i12 == 3) {
            f10 = 0.75f;
        } else {
            f10 = 2.0f;
        }
        float T1 = (f7 * org.telegram.messenger.i0.T1(f10, 7.5f, d10) * this.f47134j) + this.f47131f;
        this.f47131f = T1;
        int i13 = (T1 > 0.0f ? 1 : (T1 == 0.0f ? 0 : -1));
        i3 i3Var2 = this.f47133i;
        if (i13 >= 0) {
            double d11 = T1;
            if (Math.floor(d11) + 1.0d > this.e && (i3Var = this.f47130c) != i3Var2) {
                this.f47129b = i3Var;
                i3 i3Var3 = this.d;
                this.f47130c = i3Var3;
                if (i3Var3 == i3Var2) {
                    d = null;
                } else {
                    d = d(z10);
                }
                this.d = d;
                this.e = ((int) Math.floor(d11)) + 1;
            }
        }
        if (this.f47130c == i3Var2) {
            return Math.min(T1, this.e + 0.5f);
        }
        return T1;
    }
}
