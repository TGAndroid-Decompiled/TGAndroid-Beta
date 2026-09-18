package yh;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.qr;
public final class i3 {
    public final Runnable f47310a;
    public h3 f47311b;
    public h3 f47312c;
    public h3 d;
    public int e;
    public float f47313f;
    public final ArrayList f47314g;
    public final h3 h;
    public final h3 f47315i;
    public final float f47316j;
    public final int f47317k;
    public int f47318l;
    public final org.telegram.ui.Components.c6 f47319m;
    public int f47320n = -1;

    public i3(Runnable runnable, ArrayList arrayList, h3 h3Var, h3 h3Var2, float f7, int i10) {
        this.f47313f = 0.0f;
        this.f47310a = runnable;
        this.f47314g = arrayList;
        this.h = h3Var;
        this.f47315i = h3Var2;
        this.f47316j = f7;
        this.f47317k = i10;
        org.telegram.ui.Components.c6 c6Var = new org.telegram.ui.Components.c6(runnable, 300L, qr.h);
        this.f47319m = c6Var;
        c6Var.a(true);
        this.f47313f = -0.5f;
        this.e = 1;
        this.f47318l = i10;
        this.f47311b = h3Var;
        this.f47312c = d(false);
        this.d = d(false);
    }

    public final void a() {
        h3 h3Var = this.h;
        if (h3Var != null) {
            h3Var.a();
        }
        h3 h3Var2 = this.f47315i;
        if (h3Var2 != null) {
            h3Var2.a();
        }
    }

    public final boolean b(float f7) {
        if (this.f47312c == this.f47315i && this.f47313f + f7 >= this.e + 0.5f) {
            return true;
        }
        return false;
    }

    public final boolean c() {
        if (this.f47312c == this.f47315i && this.f47313f >= this.e + 0.5f) {
            return true;
        }
        return false;
    }

    public final h3 d(boolean z10) {
        ArrayList arrayList;
        if (z10) {
            h3 h3Var = this.f47315i;
            if (h3Var.b()) {
                int i10 = this.f47318l;
                if (i10 <= 0) {
                    return h3Var;
                }
                this.f47318l = i10 - 1;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        int i11 = 0;
        while (true) {
            arrayList = this.f47314g;
            if (i11 >= arrayList.size()) {
                break;
            }
            if (i11 != this.f47320n && ((h3) arrayList.get(i11)).b()) {
                arrayList2.add(Integer.valueOf(i11));
            }
            i11++;
        }
        if (arrayList2.isEmpty()) {
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                if (((h3) arrayList.get(i12)).b()) {
                    arrayList2.add(Integer.valueOf(i12));
                }
            }
            if (arrayList2.isEmpty()) {
                return this.h;
            }
        }
        int intValue = ((Integer) AndroidUtilities.randomOf(arrayList2)).intValue();
        this.f47320n = intValue;
        return (h3) arrayList.get(intValue);
    }

    public final void e() {
        this.f47311b = this.f47312c;
        this.f47312c = this.f47315i;
        this.d = null;
        int i10 = this.e + 1;
        this.e = i10;
        this.f47313f = i10 + 0.5f;
    }

    public final float f(float f7, boolean z10) {
        int i10;
        long j3;
        boolean z11;
        float f10;
        h3 h3Var;
        h3 d;
        int i11 = this.f47318l;
        int i12 = this.f47317k;
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
        org.telegram.ui.Components.c6 c6Var = this.f47319m;
        c6Var.f22942g = j3;
        if (i11 >= i12) {
            z11 = true;
        } else {
            z11 = false;
        }
        float e = c6Var.e(z11);
        if (i12 == 3) {
            f10 = 0.75f;
        } else {
            f10 = 2.0f;
        }
        float lerp = (f7 * AndroidUtilities.lerp(f10, 7.5f, e) * this.f47316j) + this.f47313f;
        this.f47313f = lerp;
        h3 h3Var2 = this.f47315i;
        if (lerp >= 0.0f) {
            double d10 = lerp;
            if (Math.floor(d10) + 1.0d > this.e && (h3Var = this.f47312c) != h3Var2) {
                this.f47311b = h3Var;
                h3 h3Var3 = this.d;
                this.f47312c = h3Var3;
                if (h3Var3 == h3Var2) {
                    d = null;
                } else {
                    d = d(z10);
                }
                this.d = d;
                this.e = ((int) Math.floor(d10)) + 1;
            }
        }
        if (this.f47312c == h3Var2) {
            return Math.min(lerp, this.e + 0.5f);
        }
        return lerp;
    }
}
