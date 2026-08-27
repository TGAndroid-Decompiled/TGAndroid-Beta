package s4;

import android.graphics.Color;
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

    public static final int f47756w = c(2, 2, 2, 0);

    public static final int f47757x;

    public static final int[] f47758y;

    public static final int[] f47759z;

    public final ArrayList f47760a = new ArrayList();

    public final SpannableStringBuilder f47761b = new SpannableStringBuilder();

    public boolean f47762c;
    public boolean d;

    public int f47763e;

    public boolean f47764f;

    public int f47765g;
    public int h;

    public int f47766i;

    public int f47767j;

    public boolean f47768k;

    public int f47769l;

    public int f47770m;

    public int f47771n;

    public int f47772o;

    public int f47773p;

    public int f47774q;

    public int f47775r;

    public int f47776s;

    public int f47777t;

    public int f47778u;
    public int v;

    static {
        int iC = c(0, 0, 0, 0);
        f47757x = iC;
        int iC2 = c(0, 0, 0, 3);
        f47758y = new int[]{0, 0, 0, 0, 0, 2, 0};
        f47759z = new int[]{0, 0, 0, 0, 0, 0, 2};
        A = new int[]{3, 3, 3, 3, 3, 3, 1};
        B = new boolean[]{false, false, false, true, true, true, false};
        C = new int[]{iC, iC2, iC, iC, iC2, iC, iC};
        D = new int[]{0, 1, 2, 3, 4, 3, 4};
        E = new int[]{0, 0, 0, 0, 0, 3, 3};
        F = new int[]{iC, iC, iC, iC, iC, iC2, iC2};
    }

    public e() {
        d();
    }

    public static int c(int i10, int i11, int i12, int i13) {
        int i14;
        d5.a.h(i10, 4);
        d5.a.h(i11, 4);
        d5.a.h(i12, 4);
        d5.a.h(i13, 4);
        if (i13 == 0 || i13 == 1) {
            i14 = 255;
        } else if (i13 == 2) {
            i14 = 127;
        } else if (i13 != 3) {
            i14 = 255;
        } else {
            i14 = 0;
        }
        return Color.argb(i14, i10 > 1 ? 255 : 0, i11 > 1 ? 255 : 0, i12 <= 1 ? 0 : 255);
    }

    public final void a(char c10) {
        SpannableStringBuilder spannableStringBuilder = this.f47761b;
        if (c10 != '\n') {
            spannableStringBuilder.append(c10);
            return;
        }
        SpannableString spannableStringB = b();
        ArrayList arrayList = this.f47760a;
        arrayList.add(spannableStringB);
        spannableStringBuilder.clear();
        if (this.f47773p != -1) {
            this.f47773p = 0;
        }
        if (this.f47774q != -1) {
            this.f47774q = 0;
        }
        if (this.f47775r != -1) {
            this.f47775r = 0;
        }
        if (this.f47777t != -1) {
            this.f47777t = 0;
        }
        while (true) {
            if ((!this.f47768k || arrayList.size() < this.f47767j) && arrayList.size() < 15) {
                return;
            } else {
                arrayList.remove(0);
            }
        }
    }

    public final SpannableString b() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f47761b);
        int length = spannableStringBuilder.length();
        if (length > 0) {
            if (this.f47773p != -1) {
                spannableStringBuilder.setSpan(new StyleSpan(2), this.f47773p, length, 33);
            }
            if (this.f47774q != -1) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), this.f47774q, length, 33);
            }
            if (this.f47775r != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f47776s), this.f47775r, length, 33);
            }
            if (this.f47777t != -1) {
                spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f47778u), this.f47777t, length, 33);
            }
        }
        return new SpannableString(spannableStringBuilder);
    }

    public final void d() {
        this.f47760a.clear();
        this.f47761b.clear();
        this.f47773p = -1;
        this.f47774q = -1;
        this.f47775r = -1;
        this.f47777t = -1;
        this.v = 0;
        this.f47762c = false;
        this.d = false;
        this.f47763e = 4;
        this.f47764f = false;
        this.f47765g = 0;
        this.h = 0;
        this.f47766i = 0;
        this.f47767j = 15;
        this.f47768k = true;
        this.f47769l = 0;
        this.f47770m = 0;
        this.f47771n = 0;
        int i10 = f47757x;
        this.f47772o = i10;
        this.f47776s = f47756w;
        this.f47778u = i10;
    }

    public final void e(boolean z10, boolean z11) {
        int i10 = this.f47773p;
        SpannableStringBuilder spannableStringBuilder = this.f47761b;
        if (i10 != -1) {
            if (!z10) {
                spannableStringBuilder.setSpan(new StyleSpan(2), this.f47773p, spannableStringBuilder.length(), 33);
                this.f47773p = -1;
            }
        } else if (z10) {
            this.f47773p = spannableStringBuilder.length();
        }
        if (this.f47774q == -1) {
            if (z11) {
                this.f47774q = spannableStringBuilder.length();
            }
        } else {
            if (z11) {
                return;
            }
            spannableStringBuilder.setSpan(new UnderlineSpan(), this.f47774q, spannableStringBuilder.length(), 33);
            this.f47774q = -1;
        }
    }

    public final void f(int i10, int i11) {
        int i12 = this.f47775r;
        SpannableStringBuilder spannableStringBuilder = this.f47761b;
        if (i12 != -1 && this.f47776s != i10) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f47776s), this.f47775r, spannableStringBuilder.length(), 33);
        }
        if (i10 != f47756w) {
            this.f47775r = spannableStringBuilder.length();
            this.f47776s = i10;
        }
        if (this.f47777t != -1 && this.f47778u != i11) {
            spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f47778u), this.f47777t, spannableStringBuilder.length(), 33);
        }
        if (i11 != f47757x) {
            this.f47777t = spannableStringBuilder.length();
            this.f47778u = i11;
        }
    }
}
