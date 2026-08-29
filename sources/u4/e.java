package u4;

import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayList;
public final class e {
    public static final int[] A;
    public static final boolean[] B;
    public static final int[] C;
    public static final int[] D;
    public static final int[] E;
    public static final int[] F;
    public static final int f49056w = c(2, 2, 2, 0);
    public static final int f49057x;
    public static final int[] f49058y;
    public static final int[] f49059z;
    public final ArrayList f49060a = new ArrayList();
    public final SpannableStringBuilder f49061b = new SpannableStringBuilder();
    public boolean f49062c;
    public boolean d;
    public int f49063e;
    public boolean f49064f;
    public int f49065g;
    public int h;
    public int f49066i;
    public int f49067j;
    public boolean f49068k;
    public int f49069l;
    public int f49070m;
    public int f49071n;
    public int f49072o;
    public int f49073p;
    public int f49074q;
    public int f49075r;
    public int f49076s;
    public int f49077t;
    public int f49078u;
    public int v;

    static {
        int c3 = c(0, 0, 0, 0);
        f49057x = c3;
        int c6 = c(0, 0, 0, 3);
        f49058y = new int[]{0, 0, 0, 0, 0, 2, 0};
        f49059z = new int[]{0, 0, 0, 0, 0, 0, 2};
        A = new int[]{3, 3, 3, 3, 3, 3, 1};
        B = new boolean[]{false, false, false, true, true, true, false};
        C = new int[]{c3, c6, c3, c3, c6, c3, c3};
        D = new int[]{0, 1, 2, 3, 4, 3, 4};
        E = new int[]{0, 0, 0, 0, 0, 3, 3};
        F = new int[]{c3, c3, c3, c3, c3, c6, c6};
    }

    public e() {
        d();
    }

    public static int c(int r4, int r5, int r6, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: u4.e.c(int, int, int, int):int");
    }

    public final void a(char c3) {
        SpannableStringBuilder spannableStringBuilder = this.f49061b;
        if (c3 == '\n') {
            SpannableString b10 = b();
            ArrayList arrayList = this.f49060a;
            arrayList.add(b10);
            spannableStringBuilder.clear();
            if (this.f49073p != -1) {
                this.f49073p = 0;
            }
            if (this.f49074q != -1) {
                this.f49074q = 0;
            }
            if (this.f49075r != -1) {
                this.f49075r = 0;
            }
            if (this.f49077t != -1) {
                this.f49077t = 0;
            }
            while (true) {
                if ((this.f49068k && arrayList.size() >= this.f49067j) || arrayList.size() >= 15) {
                    arrayList.remove(0);
                } else {
                    return;
                }
            }
        } else {
            spannableStringBuilder.append(c3);
        }
    }

    public final SpannableString b() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f49061b);
        int length = spannableStringBuilder.length();
        if (length > 0) {
            if (this.f49073p != -1) {
                spannableStringBuilder.setSpan(new StyleSpan(2), this.f49073p, length, 33);
            }
            if (this.f49074q != -1) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), this.f49074q, length, 33);
            }
            if (this.f49075r != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f49076s), this.f49075r, length, 33);
            }
            if (this.f49077t != -1) {
                spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f49078u), this.f49077t, length, 33);
            }
        }
        return new SpannableString(spannableStringBuilder);
    }

    public final void d() {
        this.f49060a.clear();
        this.f49061b.clear();
        this.f49073p = -1;
        this.f49074q = -1;
        this.f49075r = -1;
        this.f49077t = -1;
        this.v = 0;
        this.f49062c = false;
        this.d = false;
        this.f49063e = 4;
        this.f49064f = false;
        this.f49065g = 0;
        this.h = 0;
        this.f49066i = 0;
        this.f49067j = 15;
        this.f49068k = true;
        this.f49069l = 0;
        this.f49070m = 0;
        this.f49071n = 0;
        int i10 = f49057x;
        this.f49072o = i10;
        this.f49076s = f49056w;
        this.f49078u = i10;
    }

    public final void e(boolean z10, boolean z11) {
        int i10 = this.f49073p;
        SpannableStringBuilder spannableStringBuilder = this.f49061b;
        if (i10 != -1) {
            if (!z10) {
                spannableStringBuilder.setSpan(new StyleSpan(2), this.f49073p, spannableStringBuilder.length(), 33);
                this.f49073p = -1;
            }
        } else if (z10) {
            this.f49073p = spannableStringBuilder.length();
        }
        if (this.f49074q != -1) {
            if (!z11) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), this.f49074q, spannableStringBuilder.length(), 33);
                this.f49074q = -1;
            }
        } else if (z11) {
            this.f49074q = spannableStringBuilder.length();
        }
    }

    public final void f(int i10, int i11) {
        int i12 = this.f49075r;
        SpannableStringBuilder spannableStringBuilder = this.f49061b;
        if (i12 != -1 && this.f49076s != i10) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f49076s), this.f49075r, spannableStringBuilder.length(), 33);
        }
        if (i10 != f49056w) {
            this.f49075r = spannableStringBuilder.length();
            this.f49076s = i10;
        }
        if (this.f49077t != -1 && this.f49078u != i11) {
            spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f49078u), this.f49077t, spannableStringBuilder.length(), 33);
        }
        if (i11 != f49057x) {
            this.f49077t = spannableStringBuilder.length();
            this.f49078u = i11;
        }
    }
}
