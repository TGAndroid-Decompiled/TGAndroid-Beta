package s4;

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
    public static final int f47392w = c(2, 2, 2, 0);
    public static final int f47393x;
    public static final int[] f47394y;
    public static final int[] f47395z;
    public final ArrayList f47396a = new ArrayList();
    public final SpannableStringBuilder f47397b = new SpannableStringBuilder();
    public boolean f47398c;
    public boolean d;
    public int f47399e;
    public boolean f47400f;
    public int f47401g;
    public int h;
    public int f47402i;
    public int f47403j;
    public boolean f47404k;
    public int f47405l;
    public int f47406m;
    public int f47407n;
    public int f47408o;
    public int f47409p;
    public int f47410q;
    public int f47411r;
    public int f47412s;
    public int f47413t;
    public int f47414u;
    public int v;

    static {
        int c10 = c(0, 0, 0, 0);
        f47393x = c10;
        int c11 = c(0, 0, 0, 3);
        f47394y = new int[]{0, 0, 0, 0, 0, 2, 0};
        f47395z = new int[]{0, 0, 0, 0, 0, 0, 2};
        A = new int[]{3, 3, 3, 3, 3, 3, 1};
        B = new boolean[]{false, false, false, true, true, true, false};
        C = new int[]{c10, c11, c10, c10, c11, c10, c10};
        D = new int[]{0, 1, 2, 3, 4, 3, 4};
        E = new int[]{0, 0, 0, 0, 0, 3, 3};
        F = new int[]{c10, c10, c10, c10, c10, c11, c11};
    }

    public e() {
        d();
    }

    public static int c(int r4, int r5, int r6, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: s4.e.c(int, int, int, int):int");
    }

    public final void a(char c10) {
        SpannableStringBuilder spannableStringBuilder = this.f47397b;
        if (c10 == '\n') {
            SpannableString b10 = b();
            ArrayList arrayList = this.f47396a;
            arrayList.add(b10);
            spannableStringBuilder.clear();
            if (this.f47409p != -1) {
                this.f47409p = 0;
            }
            if (this.f47410q != -1) {
                this.f47410q = 0;
            }
            if (this.f47411r != -1) {
                this.f47411r = 0;
            }
            if (this.f47413t != -1) {
                this.f47413t = 0;
            }
            while (true) {
                if ((this.f47404k && arrayList.size() >= this.f47403j) || arrayList.size() >= 15) {
                    arrayList.remove(0);
                } else {
                    return;
                }
            }
        } else {
            spannableStringBuilder.append(c10);
        }
    }

    public final SpannableString b() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f47397b);
        int length = spannableStringBuilder.length();
        if (length > 0) {
            if (this.f47409p != -1) {
                spannableStringBuilder.setSpan(new StyleSpan(2), this.f47409p, length, 33);
            }
            if (this.f47410q != -1) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), this.f47410q, length, 33);
            }
            if (this.f47411r != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f47412s), this.f47411r, length, 33);
            }
            if (this.f47413t != -1) {
                spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f47414u), this.f47413t, length, 33);
            }
        }
        return new SpannableString(spannableStringBuilder);
    }

    public final void d() {
        this.f47396a.clear();
        this.f47397b.clear();
        this.f47409p = -1;
        this.f47410q = -1;
        this.f47411r = -1;
        this.f47413t = -1;
        this.v = 0;
        this.f47398c = false;
        this.d = false;
        this.f47399e = 4;
        this.f47400f = false;
        this.f47401g = 0;
        this.h = 0;
        this.f47402i = 0;
        this.f47403j = 15;
        this.f47404k = true;
        this.f47405l = 0;
        this.f47406m = 0;
        this.f47407n = 0;
        int i9 = f47393x;
        this.f47408o = i9;
        this.f47412s = f47392w;
        this.f47414u = i9;
    }

    public final void e(boolean z10, boolean z11) {
        int i9 = this.f47409p;
        SpannableStringBuilder spannableStringBuilder = this.f47397b;
        if (i9 != -1) {
            if (!z10) {
                spannableStringBuilder.setSpan(new StyleSpan(2), this.f47409p, spannableStringBuilder.length(), 33);
                this.f47409p = -1;
            }
        } else if (z10) {
            this.f47409p = spannableStringBuilder.length();
        }
        if (this.f47410q != -1) {
            if (!z11) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), this.f47410q, spannableStringBuilder.length(), 33);
                this.f47410q = -1;
            }
        } else if (z11) {
            this.f47410q = spannableStringBuilder.length();
        }
    }

    public final void f(int i9, int i10) {
        int i11 = this.f47411r;
        SpannableStringBuilder spannableStringBuilder = this.f47397b;
        if (i11 != -1 && this.f47412s != i9) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f47412s), this.f47411r, spannableStringBuilder.length(), 33);
        }
        if (i9 != f47392w) {
            this.f47411r = spannableStringBuilder.length();
            this.f47412s = i9;
        }
        if (this.f47413t != -1 && this.f47414u != i10) {
            spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f47414u), this.f47413t, spannableStringBuilder.length(), 33);
        }
        if (i10 != f47393x) {
            this.f47413t = spannableStringBuilder.length();
            this.f47414u = i10;
        }
    }
}
