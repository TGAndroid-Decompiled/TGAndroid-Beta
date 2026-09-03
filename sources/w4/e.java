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
    public static final int f46493w = c(2, 2, 2, 0);
    public static final int f46494x;
    public static final int[] f46495y;
    public static final int[] f46496z;
    public final ArrayList f46497a = new ArrayList();
    public final SpannableStringBuilder f46498b = new SpannableStringBuilder();
    public boolean f46499c;
    public boolean d;
    public int e;
    public boolean f46500f;
    public int f46501g;
    public int h;
    public int f46502i;
    public int f46503j;
    public boolean f46504k;
    public int f46505l;
    public int f46506m;
    public int f46507n;
    public int f46508o;
    public int f46509p;
    public int f46510q;
    public int f46511r;
    public int f46512s;
    public int f46513t;
    public int f46514u;
    public int v;

    static {
        int c3 = c(0, 0, 0, 0);
        f46494x = c3;
        int c10 = c(0, 0, 0, 3);
        f46495y = new int[]{0, 0, 0, 0, 0, 2, 0};
        f46496z = new int[]{0, 0, 0, 0, 0, 0, 2};
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
        SpannableStringBuilder spannableStringBuilder = this.f46498b;
        if (c3 == '\n') {
            SpannableString b10 = b();
            ArrayList arrayList = this.f46497a;
            arrayList.add(b10);
            spannableStringBuilder.clear();
            if (this.f46509p != -1) {
                this.f46509p = 0;
            }
            if (this.f46510q != -1) {
                this.f46510q = 0;
            }
            if (this.f46511r != -1) {
                this.f46511r = 0;
            }
            if (this.f46513t != -1) {
                this.f46513t = 0;
            }
            while (true) {
                if ((this.f46504k && arrayList.size() >= this.f46503j) || arrayList.size() >= 15) {
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
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f46498b);
        int length = spannableStringBuilder.length();
        if (length > 0) {
            if (this.f46509p != -1) {
                spannableStringBuilder.setSpan(new StyleSpan(2), this.f46509p, length, 33);
            }
            if (this.f46510q != -1) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), this.f46510q, length, 33);
            }
            if (this.f46511r != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f46512s), this.f46511r, length, 33);
            }
            if (this.f46513t != -1) {
                spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f46514u), this.f46513t, length, 33);
            }
        }
        return new SpannableString(spannableStringBuilder);
    }

    public final void d() {
        this.f46497a.clear();
        this.f46498b.clear();
        this.f46509p = -1;
        this.f46510q = -1;
        this.f46511r = -1;
        this.f46513t = -1;
        this.v = 0;
        this.f46499c = false;
        this.d = false;
        this.e = 4;
        this.f46500f = false;
        this.f46501g = 0;
        this.h = 0;
        this.f46502i = 0;
        this.f46503j = 15;
        this.f46504k = true;
        this.f46505l = 0;
        this.f46506m = 0;
        this.f46507n = 0;
        int i10 = f46494x;
        this.f46508o = i10;
        this.f46512s = f46493w;
        this.f46514u = i10;
    }

    public final void e(boolean z4, boolean z10) {
        int i10 = this.f46509p;
        SpannableStringBuilder spannableStringBuilder = this.f46498b;
        if (i10 != -1) {
            if (!z4) {
                spannableStringBuilder.setSpan(new StyleSpan(2), this.f46509p, spannableStringBuilder.length(), 33);
                this.f46509p = -1;
            }
        } else if (z4) {
            this.f46509p = spannableStringBuilder.length();
        }
        if (this.f46510q != -1) {
            if (!z10) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), this.f46510q, spannableStringBuilder.length(), 33);
                this.f46510q = -1;
            }
        } else if (z10) {
            this.f46510q = spannableStringBuilder.length();
        }
    }

    public final void f(int i10, int i11) {
        int i12 = this.f46511r;
        SpannableStringBuilder spannableStringBuilder = this.f46498b;
        if (i12 != -1 && this.f46512s != i10) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f46512s), this.f46511r, spannableStringBuilder.length(), 33);
        }
        if (i10 != f46493w) {
            this.f46511r = spannableStringBuilder.length();
            this.f46512s = i10;
        }
        if (this.f46513t != -1 && this.f46514u != i11) {
            spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f46514u), this.f46513t, spannableStringBuilder.length(), 33);
        }
        if (i11 != f46494x) {
            this.f46513t = spannableStringBuilder.length();
            this.f46514u = i11;
        }
    }
}
