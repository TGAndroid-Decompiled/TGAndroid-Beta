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
    public static final int f49380w = c(2, 2, 2, 0);
    public static final int f49381x;
    public static final int[] f49382y;
    public static final int[] f49383z;
    public final ArrayList f49384a = new ArrayList();
    public final SpannableStringBuilder f49385b = new SpannableStringBuilder();
    public boolean f49386c;
    public boolean d;
    public int f49387e;
    public boolean f49388f;
    public int f49389g;
    public int h;
    public int f49390i;
    public int f49391j;
    public boolean f49392k;
    public int f49393l;
    public int f49394m;
    public int f49395n;
    public int f49396o;
    public int f49397p;
    public int f49398q;
    public int f49399r;
    public int f49400s;
    public int f49401t;
    public int f49402u;
    public int v;

    static {
        int c3 = c(0, 0, 0, 0);
        f49381x = c3;
        int c10 = c(0, 0, 0, 3);
        f49382y = new int[]{0, 0, 0, 0, 0, 2, 0};
        f49383z = new int[]{0, 0, 0, 0, 0, 0, 2};
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
        SpannableStringBuilder spannableStringBuilder = this.f49385b;
        if (c3 == '\n') {
            SpannableString b10 = b();
            ArrayList arrayList = this.f49384a;
            arrayList.add(b10);
            spannableStringBuilder.clear();
            if (this.f49397p != -1) {
                this.f49397p = 0;
            }
            if (this.f49398q != -1) {
                this.f49398q = 0;
            }
            if (this.f49399r != -1) {
                this.f49399r = 0;
            }
            if (this.f49401t != -1) {
                this.f49401t = 0;
            }
            while (true) {
                if ((this.f49392k && arrayList.size() >= this.f49391j) || arrayList.size() >= 15) {
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
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f49385b);
        int length = spannableStringBuilder.length();
        if (length > 0) {
            if (this.f49397p != -1) {
                spannableStringBuilder.setSpan(new StyleSpan(2), this.f49397p, length, 33);
            }
            if (this.f49398q != -1) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), this.f49398q, length, 33);
            }
            if (this.f49399r != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f49400s), this.f49399r, length, 33);
            }
            if (this.f49401t != -1) {
                spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f49402u), this.f49401t, length, 33);
            }
        }
        return new SpannableString(spannableStringBuilder);
    }

    public final void d() {
        this.f49384a.clear();
        this.f49385b.clear();
        this.f49397p = -1;
        this.f49398q = -1;
        this.f49399r = -1;
        this.f49401t = -1;
        this.v = 0;
        this.f49386c = false;
        this.d = false;
        this.f49387e = 4;
        this.f49388f = false;
        this.f49389g = 0;
        this.h = 0;
        this.f49390i = 0;
        this.f49391j = 15;
        this.f49392k = true;
        this.f49393l = 0;
        this.f49394m = 0;
        this.f49395n = 0;
        int i10 = f49381x;
        this.f49396o = i10;
        this.f49400s = f49380w;
        this.f49402u = i10;
    }

    public final void e(boolean z4, boolean z10) {
        int i10 = this.f49397p;
        SpannableStringBuilder spannableStringBuilder = this.f49385b;
        if (i10 != -1) {
            if (!z4) {
                spannableStringBuilder.setSpan(new StyleSpan(2), this.f49397p, spannableStringBuilder.length(), 33);
                this.f49397p = -1;
            }
        } else if (z4) {
            this.f49397p = spannableStringBuilder.length();
        }
        if (this.f49398q != -1) {
            if (!z10) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), this.f49398q, spannableStringBuilder.length(), 33);
                this.f49398q = -1;
            }
        } else if (z10) {
            this.f49398q = spannableStringBuilder.length();
        }
    }

    public final void f(int i10, int i11) {
        int i12 = this.f49399r;
        SpannableStringBuilder spannableStringBuilder = this.f49385b;
        if (i12 != -1 && this.f49400s != i10) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f49400s), this.f49399r, spannableStringBuilder.length(), 33);
        }
        if (i10 != f49380w) {
            this.f49399r = spannableStringBuilder.length();
            this.f49400s = i10;
        }
        if (this.f49401t != -1 && this.f49402u != i11) {
            spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f49402u), this.f49401t, spannableStringBuilder.length(), 33);
        }
        if (i11 != f49381x) {
            this.f49401t = spannableStringBuilder.length();
            this.f49402u = i11;
        }
    }
}
