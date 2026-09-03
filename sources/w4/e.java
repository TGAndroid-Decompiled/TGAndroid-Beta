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
    public static final int f49417w = c(2, 2, 2, 0);
    public static final int f49418x;
    public static final int[] f49419y;
    public static final int[] f49420z;
    public final ArrayList f49421a = new ArrayList();
    public final SpannableStringBuilder f49422b = new SpannableStringBuilder();
    public boolean f49423c;
    public boolean d;
    public int f49424e;
    public boolean f49425f;
    public int f49426g;
    public int h;
    public int f49427i;
    public int f49428j;
    public boolean f49429k;
    public int f49430l;
    public int f49431m;
    public int f49432n;
    public int f49433o;
    public int f49434p;
    public int f49435q;
    public int f49436r;
    public int f49437s;
    public int f49438t;
    public int f49439u;
    public int v;

    static {
        int c3 = c(0, 0, 0, 0);
        f49418x = c3;
        int c10 = c(0, 0, 0, 3);
        f49419y = new int[]{0, 0, 0, 0, 0, 2, 0};
        f49420z = new int[]{0, 0, 0, 0, 0, 0, 2};
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
        SpannableStringBuilder spannableStringBuilder = this.f49422b;
        if (c3 == '\n') {
            SpannableString b10 = b();
            ArrayList arrayList = this.f49421a;
            arrayList.add(b10);
            spannableStringBuilder.clear();
            if (this.f49434p != -1) {
                this.f49434p = 0;
            }
            if (this.f49435q != -1) {
                this.f49435q = 0;
            }
            if (this.f49436r != -1) {
                this.f49436r = 0;
            }
            if (this.f49438t != -1) {
                this.f49438t = 0;
            }
            while (true) {
                if ((this.f49429k && arrayList.size() >= this.f49428j) || arrayList.size() >= 15) {
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
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f49422b);
        int length = spannableStringBuilder.length();
        if (length > 0) {
            if (this.f49434p != -1) {
                spannableStringBuilder.setSpan(new StyleSpan(2), this.f49434p, length, 33);
            }
            if (this.f49435q != -1) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), this.f49435q, length, 33);
            }
            if (this.f49436r != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f49437s), this.f49436r, length, 33);
            }
            if (this.f49438t != -1) {
                spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f49439u), this.f49438t, length, 33);
            }
        }
        return new SpannableString(spannableStringBuilder);
    }

    public final void d() {
        this.f49421a.clear();
        this.f49422b.clear();
        this.f49434p = -1;
        this.f49435q = -1;
        this.f49436r = -1;
        this.f49438t = -1;
        this.v = 0;
        this.f49423c = false;
        this.d = false;
        this.f49424e = 4;
        this.f49425f = false;
        this.f49426g = 0;
        this.h = 0;
        this.f49427i = 0;
        this.f49428j = 15;
        this.f49429k = true;
        this.f49430l = 0;
        this.f49431m = 0;
        this.f49432n = 0;
        int i10 = f49418x;
        this.f49433o = i10;
        this.f49437s = f49417w;
        this.f49439u = i10;
    }

    public final void e(boolean z4, boolean z10) {
        int i10 = this.f49434p;
        SpannableStringBuilder spannableStringBuilder = this.f49422b;
        if (i10 != -1) {
            if (!z4) {
                spannableStringBuilder.setSpan(new StyleSpan(2), this.f49434p, spannableStringBuilder.length(), 33);
                this.f49434p = -1;
            }
        } else if (z4) {
            this.f49434p = spannableStringBuilder.length();
        }
        if (this.f49435q != -1) {
            if (!z10) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), this.f49435q, spannableStringBuilder.length(), 33);
                this.f49435q = -1;
            }
        } else if (z10) {
            this.f49435q = spannableStringBuilder.length();
        }
    }

    public final void f(int i10, int i11) {
        int i12 = this.f49436r;
        SpannableStringBuilder spannableStringBuilder = this.f49422b;
        if (i12 != -1 && this.f49437s != i10) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f49437s), this.f49436r, spannableStringBuilder.length(), 33);
        }
        if (i10 != f49417w) {
            this.f49436r = spannableStringBuilder.length();
            this.f49437s = i10;
        }
        if (this.f49438t != -1 && this.f49439u != i11) {
            spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f49439u), this.f49438t, spannableStringBuilder.length(), 33);
        }
        if (i11 != f49418x) {
            this.f49438t = spannableStringBuilder.length();
            this.f49439u = i11;
        }
    }
}
