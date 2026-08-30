package w4;

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
    public static final int f46411w = c(2, 2, 2, 0);
    public static final int f46412x;
    public static final int[] f46413y;
    public static final int[] f46414z;
    public final ArrayList f46415a = new ArrayList();
    public final SpannableStringBuilder f46416b = new SpannableStringBuilder();
    public boolean f46417c;
    public boolean d;
    public int e;
    public boolean f46418f;
    public int f46419g;
    public int h;
    public int f46420i;
    public int f46421j;
    public boolean f46422k;
    public int f46423l;
    public int f46424m;
    public int f46425n;
    public int f46426o;
    public int f46427p;
    public int f46428q;
    public int f46429r;
    public int f46430s;
    public int f46431t;
    public int f46432u;
    public int v;

    static {
        int c3 = c(0, 0, 0, 0);
        f46412x = c3;
        int c10 = c(0, 0, 0, 3);
        f46413y = new int[]{0, 0, 0, 0, 0, 2, 0};
        f46414z = new int[]{0, 0, 0, 0, 0, 0, 2};
        A = new int[]{3, 3, 3, 3, 3, 3, 1};
        B = new boolean[]{false, false, false, true, true, true, false};
        C = new int[]{c3, c10, c3, c3, c10, c3, c3};
        D = new int[]{0, 1, 2, 3, 4, 3, 4};
        E = new int[]{0, 0, 0, 0, 0, 3, 3};
        F = new int[]{c3, c3, c3, c3, c3, c10, c10};
    }

    public e() {
        d();
    }

    public static int c(int r4, int r5, int r6, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: w4.e.c(int, int, int, int):int");
    }

    public final void a(char c3) {
        SpannableStringBuilder spannableStringBuilder = this.f46416b;
        if (c3 == '\n') {
            SpannableString b10 = b();
            ArrayList arrayList = this.f46415a;
            arrayList.add(b10);
            spannableStringBuilder.clear();
            if (this.f46427p != -1) {
                this.f46427p = 0;
            }
            if (this.f46428q != -1) {
                this.f46428q = 0;
            }
            if (this.f46429r != -1) {
                this.f46429r = 0;
            }
            if (this.f46431t != -1) {
                this.f46431t = 0;
            }
            while (true) {
                if ((this.f46422k && arrayList.size() >= this.f46421j) || arrayList.size() >= 15) {
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
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f46416b);
        int length = spannableStringBuilder.length();
        if (length > 0) {
            if (this.f46427p != -1) {
                spannableStringBuilder.setSpan(new StyleSpan(2), this.f46427p, length, 33);
            }
            if (this.f46428q != -1) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), this.f46428q, length, 33);
            }
            if (this.f46429r != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f46430s), this.f46429r, length, 33);
            }
            if (this.f46431t != -1) {
                spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f46432u), this.f46431t, length, 33);
            }
        }
        return new SpannableString(spannableStringBuilder);
    }

    public final void d() {
        this.f46415a.clear();
        this.f46416b.clear();
        this.f46427p = -1;
        this.f46428q = -1;
        this.f46429r = -1;
        this.f46431t = -1;
        this.v = 0;
        this.f46417c = false;
        this.d = false;
        this.e = 4;
        this.f46418f = false;
        this.f46419g = 0;
        this.h = 0;
        this.f46420i = 0;
        this.f46421j = 15;
        this.f46422k = true;
        this.f46423l = 0;
        this.f46424m = 0;
        this.f46425n = 0;
        int i10 = f46412x;
        this.f46426o = i10;
        this.f46430s = f46411w;
        this.f46432u = i10;
    }

    public final void e(boolean z4, boolean z10) {
        int i10 = this.f46427p;
        SpannableStringBuilder spannableStringBuilder = this.f46416b;
        if (i10 != -1) {
            if (!z4) {
                spannableStringBuilder.setSpan(new StyleSpan(2), this.f46427p, spannableStringBuilder.length(), 33);
                this.f46427p = -1;
            }
        } else if (z4) {
            this.f46427p = spannableStringBuilder.length();
        }
        if (this.f46428q != -1) {
            if (!z10) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), this.f46428q, spannableStringBuilder.length(), 33);
                this.f46428q = -1;
            }
        } else if (z10) {
            this.f46428q = spannableStringBuilder.length();
        }
    }

    public final void f(int i10, int i11) {
        int i12 = this.f46429r;
        SpannableStringBuilder spannableStringBuilder = this.f46416b;
        if (i12 != -1 && this.f46430s != i10) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f46430s), this.f46429r, spannableStringBuilder.length(), 33);
        }
        if (i10 != f46411w) {
            this.f46429r = spannableStringBuilder.length();
            this.f46430s = i10;
        }
        if (this.f46431t != -1 && this.f46432u != i11) {
            spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f46432u), this.f46431t, spannableStringBuilder.length(), 33);
        }
        if (i11 != f46412x) {
            this.f46431t = spannableStringBuilder.length();
            this.f46432u = i11;
        }
    }
}
