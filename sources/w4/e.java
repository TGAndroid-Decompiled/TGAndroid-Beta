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
    public static final int f49381w = c(2, 2, 2, 0);
    public static final int f49382x;
    public static final int[] f49383y;
    public static final int[] f49384z;
    public final ArrayList f49385a = new ArrayList();
    public final SpannableStringBuilder f49386b = new SpannableStringBuilder();
    public boolean f49387c;
    public boolean d;
    public int f49388e;
    public boolean f49389f;
    public int f49390g;
    public int h;
    public int f49391i;
    public int f49392j;
    public boolean f49393k;
    public int f49394l;
    public int f49395m;
    public int f49396n;
    public int f49397o;
    public int f49398p;
    public int f49399q;
    public int f49400r;
    public int f49401s;
    public int f49402t;
    public int f49403u;
    public int v;

    static {
        int c3 = c(0, 0, 0, 0);
        f49382x = c3;
        int c10 = c(0, 0, 0, 3);
        f49383y = new int[]{0, 0, 0, 0, 0, 2, 0};
        f49384z = new int[]{0, 0, 0, 0, 0, 0, 2};
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
        SpannableStringBuilder spannableStringBuilder = this.f49386b;
        if (c3 == '\n') {
            SpannableString b10 = b();
            ArrayList arrayList = this.f49385a;
            arrayList.add(b10);
            spannableStringBuilder.clear();
            if (this.f49398p != -1) {
                this.f49398p = 0;
            }
            if (this.f49399q != -1) {
                this.f49399q = 0;
            }
            if (this.f49400r != -1) {
                this.f49400r = 0;
            }
            if (this.f49402t != -1) {
                this.f49402t = 0;
            }
            while (true) {
                if ((this.f49393k && arrayList.size() >= this.f49392j) || arrayList.size() >= 15) {
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
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f49386b);
        int length = spannableStringBuilder.length();
        if (length > 0) {
            if (this.f49398p != -1) {
                spannableStringBuilder.setSpan(new StyleSpan(2), this.f49398p, length, 33);
            }
            if (this.f49399q != -1) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), this.f49399q, length, 33);
            }
            if (this.f49400r != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f49401s), this.f49400r, length, 33);
            }
            if (this.f49402t != -1) {
                spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f49403u), this.f49402t, length, 33);
            }
        }
        return new SpannableString(spannableStringBuilder);
    }

    public final void d() {
        this.f49385a.clear();
        this.f49386b.clear();
        this.f49398p = -1;
        this.f49399q = -1;
        this.f49400r = -1;
        this.f49402t = -1;
        this.v = 0;
        this.f49387c = false;
        this.d = false;
        this.f49388e = 4;
        this.f49389f = false;
        this.f49390g = 0;
        this.h = 0;
        this.f49391i = 0;
        this.f49392j = 15;
        this.f49393k = true;
        this.f49394l = 0;
        this.f49395m = 0;
        this.f49396n = 0;
        int i10 = f49382x;
        this.f49397o = i10;
        this.f49401s = f49381w;
        this.f49403u = i10;
    }

    public final void e(boolean z4, boolean z10) {
        int i10 = this.f49398p;
        SpannableStringBuilder spannableStringBuilder = this.f49386b;
        if (i10 != -1) {
            if (!z4) {
                spannableStringBuilder.setSpan(new StyleSpan(2), this.f49398p, spannableStringBuilder.length(), 33);
                this.f49398p = -1;
            }
        } else if (z4) {
            this.f49398p = spannableStringBuilder.length();
        }
        if (this.f49399q != -1) {
            if (!z10) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), this.f49399q, spannableStringBuilder.length(), 33);
                this.f49399q = -1;
            }
        } else if (z10) {
            this.f49399q = spannableStringBuilder.length();
        }
    }

    public final void f(int i10, int i11) {
        int i12 = this.f49400r;
        SpannableStringBuilder spannableStringBuilder = this.f49386b;
        if (i12 != -1 && this.f49401s != i10) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f49401s), this.f49400r, spannableStringBuilder.length(), 33);
        }
        if (i10 != f49381w) {
            this.f49400r = spannableStringBuilder.length();
            this.f49401s = i10;
        }
        if (this.f49402t != -1 && this.f49403u != i11) {
            spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f49403u), this.f49402t, spannableStringBuilder.length(), 33);
        }
        if (i11 != f49382x) {
            this.f49402t = spannableStringBuilder.length();
            this.f49403u = i11;
        }
    }
}
