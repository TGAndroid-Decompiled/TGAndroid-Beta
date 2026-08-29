package th;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.Layout;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.d6;
import org.telegram.ui.Components.jr;
public final class i5 extends ViewGroup {
    public final RectF A;
    public final Path B;
    public final d6 C;
    public int D;
    public boolean E;
    public boolean F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public x5 f48498a;
    public final c6 f48499b;
    public int[] f48500c;
    public int[] d;
    public int[] f48501e;
    public int[] f48502f;
    public h5 h;
    public final Paint f48503n;
    public final Paint f48504r;
    public final Paint f48505s;
    public final Paint v;
    public final Paint f48506w;
    public final Paint f48507x;
    public final RectF f48508y;

    public i5(Context context, c6 c6Var) {
        super(context);
        this.f48500c = new int[0];
        this.d = new int[0];
        this.f48501e = new int[0];
        this.f48502f = new int[0];
        Paint paint = new Paint(1);
        this.f48503n = paint;
        this.f48504r = new Paint(1);
        this.f48505s = new Paint(1);
        Paint paint2 = new Paint(1);
        this.v = paint2;
        this.f48506w = new Paint(1);
        this.f48507x = new Paint(1);
        this.f48508y = new RectF();
        this.A = new RectF();
        this.B = new Path();
        this.f48499b = c6Var;
        setClipChildren(false);
        setClipToPadding(false);
        setWillNotDraw(false);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setStrokeWidth(AndroidUtilities.dpf2(0.66f));
        paint2.setStyle(style);
        paint2.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint2.setStrokeJoin(Paint.Join.ROUND);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        this.C = new d6(this, 0L, 220L, jr.h);
        b();
    }

    public final TL_iv.pageTableCell a() {
        ViewParent parent;
        TL_iv.pageTableCell pagetablecell;
        x5 x5Var = this.f48498a;
        TL_iv.pageTableCell pagetablecell2 = null;
        if (x5Var != null && x5Var.f48887b != 0 && x5Var.f48888c != 0) {
            View findFocus = findFocus();
            if (findFocus == null) {
                parent = null;
            } else {
                parent = findFocus.getParent();
            }
            while (parent != null && parent != this) {
                if (parent instanceof j5) {
                    pagetablecell = ((j5) parent).f48527b;
                    break;
                }
                parent = parent.getParent();
            }
            pagetablecell = null;
            if (pagetablecell != null) {
                return pagetablecell;
            }
            if (this.h == null) {
                return null;
            }
            ArrayList arrayList = this.f48498a.f48891g;
            int size = arrayList.size();
            int i10 = Integer.MAX_VALUE;
            int i11 = Integer.MAX_VALUE;
            int i12 = 0;
            while (i12 < size) {
                Object obj = arrayList.get(i12);
                i12++;
                TL_iv.pageTableCell pagetablecell3 = (TL_iv.pageTableCell) obj;
                if (((LinkedHashSet) ((sf.f1) this.h).f47804b).contains(pagetablecell3)) {
                    int b10 = this.f48498a.b(pagetablecell3);
                    int a2 = this.f48498a.a(pagetablecell3);
                    if (b10 < i10 || (b10 == i10 && a2 < i11)) {
                        pagetablecell2 = pagetablecell3;
                        i10 = b10;
                        i11 = a2;
                    }
                }
            }
        }
        return pagetablecell2;
    }

    public final void b() {
        int i10 = g6.f23303qh;
        c6 c6Var = this.f48499b;
        this.f48503n.setColor(g6.v0(i10, c6Var));
        int v02 = g6.v0(g6.M6, c6Var);
        int red = Color.red(v02);
        int green = Color.green(v02);
        int blue = Color.blue(v02);
        this.f48504r.setColor(g6.v0(g6.f23287ph, c6Var));
        this.f48505s.setColor(Color.argb(20, red, green, blue));
        this.D = 255;
        int i11 = g6.Oh;
        this.v.setColor(g6.v0(i11, c6Var));
        Paint.Style style = Paint.Style.FILL;
        Paint paint = this.f48506w;
        paint.setStyle(style);
        this.K = g6.v0(g6.E6, c6Var);
        this.L = g6.v0(g6.Sh, c6Var);
        paint.setColor(this.K);
        Paint paint2 = this.f48507x;
        paint2.setStyle(style);
        paint2.setColor(g6.v0(i11, c6Var));
        invalidate();
    }

    public final boolean c(int i10, int i11) {
        if (i10 < 0 || i11 < i10) {
            return false;
        }
        while (i10 <= i11) {
            if (!n(i10)) {
                return false;
            }
            i10++;
        }
        return true;
    }

    public final boolean d(int i10, int i11) {
        if (i10 < 0 || i11 < i10) {
            return false;
        }
        while (i10 <= i11) {
            if (!o(i10)) {
                return false;
            }
            i10++;
        }
        return true;
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r19) {
        throw new UnsupportedOperationException("Method not decompiled: th.i5.dispatchDraw(android.graphics.Canvas):void");
    }

    public final boolean e(int i10) {
        if (i10 >= 0 && i10 < this.f48498a.f48888c) {
            for (int i11 = 0; i11 < this.f48498a.f48887b; i11++) {
                if (p(i11, i10)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final float f(int i10, int i11) {
        int i12;
        x5 x5Var = this.f48498a;
        int i13 = x5Var.f48888c;
        int i14 = x5Var.f48887b;
        int[] iArr = this.f48501e;
        int i15 = 0;
        if (i10 == iArr[0]) {
            i12 = 0;
        } else {
            if (i10 == iArr[i13]) {
                i12 = i13 - 1;
            }
            return 0.0f;
        }
        int[] iArr2 = this.f48502f;
        if (i11 != iArr2[0]) {
            if (i11 == iArr2[i14]) {
                i15 = i14 - 1;
            }
            return 0.0f;
        }
        if (i12 >= 0 && i15 >= 0 && p(i15, i12)) {
            return Math.min(AndroidUtilities.dpf2(10.0f), Math.min(this.f48500c[i12], this.d[i15]) / 2.0f);
        }
        return 0.0f;
    }

    public final void g(Canvas canvas, int i10, int i11) {
        float dpf2 = i10 - AndroidUtilities.dpf2(1.0f);
        float dpf22 = AndroidUtilities.dpf2(1.0f) + i11;
        float f9 = this.f48502f[this.f48498a.f48887b];
        float dp = AndroidUtilities.dp(16.0f) + f9;
        float min = Math.min(AndroidUtilities.dpf2(10.0f), (dpf22 - dpf2) / 2.0f);
        float f10 = f(i10, this.f48502f[this.f48498a.f48887b]);
        float f11 = f(i11, this.f48502f[this.f48498a.f48887b]);
        Path path = this.B;
        path.rewind();
        path.moveTo(dpf2, f9 - f10);
        path.lineTo(dpf2, dp - min);
        float f12 = min * 2.0f;
        float f13 = dp - f12;
        RectF rectF = this.A;
        rectF.set(dpf2, f13, dpf2 + f12, dp);
        path.arcTo(rectF, 180.0f, -90.0f);
        path.lineTo(dpf22 - min, dp);
        rectF.set(dpf22 - f12, f13, dpf22, dp);
        path.arcTo(rectF, 90.0f, -90.0f);
        path.lineTo(dpf22, f9 - f11);
        if (f11 > 0.0f) {
            float f14 = f11 * 2.0f;
            rectF.set(dpf22 - f14, f9 - f14, dpf22, f9);
            path.arcTo(rectF, 0.0f, 90.0f);
        } else {
            path.lineTo(dpf22, f9);
        }
        path.lineTo(dpf2 + f10, f9);
        if (f10 > 0.0f) {
            float f15 = f10 * 2.0f;
            rectF.set(dpf2, f9 - f15, f15 + dpf2, f9);
            path.arcTo(rectF, 90.0f, 90.0f);
        } else {
            path.lineTo(dpf2, f9);
        }
        path.close();
        canvas.drawPath(path, this.f48507x);
    }

    public x5 getModel() {
        return this.f48498a;
    }

    public final void h(Canvas canvas, int i10, int i11) {
        float dpf2 = i10 - AndroidUtilities.dpf2(1.0f);
        float dpf22 = AndroidUtilities.dpf2(1.0f) + i11;
        float dp = this.f48501e[0] - AndroidUtilities.dp(16.0f);
        float min = Math.min(AndroidUtilities.dpf2(10.0f), (dpf22 - dpf2) / 2.0f);
        float f9 = f(this.f48501e[0], i10);
        float f10 = f(this.f48501e[0], i11);
        Path path = this.B;
        path.rewind();
        path.moveTo(this.f48501e[0] + f9, dpf2);
        path.lineTo(dp + min, dpf2);
        float f11 = min * 2.0f;
        float f12 = dp + f11;
        RectF rectF = this.A;
        rectF.set(dp, dpf2, f12, dpf2 + f11);
        path.arcTo(rectF, 270.0f, -90.0f);
        path.lineTo(dp, dpf22 - min);
        rectF.set(dp, dpf22 - f11, f12, dpf22);
        path.arcTo(rectF, 180.0f, -90.0f);
        path.lineTo(this.f48501e[0] + f10, dpf22);
        if (f10 > 0.0f) {
            int i12 = this.f48501e[0];
            float f13 = f10 * 2.0f;
            rectF.set(i12, dpf22 - f13, i12 + f13, dpf22);
            path.arcTo(rectF, 90.0f, 90.0f);
        } else {
            path.lineTo(this.f48501e[0], dpf22);
        }
        path.lineTo(this.f48501e[0], dpf2 + f9);
        if (f9 > 0.0f) {
            int i13 = this.f48501e[0];
            float f14 = f9 * 2.0f;
            rectF.set(i13, dpf2, i13 + f14, f14 + dpf2);
            path.arcTo(rectF, 180.0f, 90.0f);
        } else {
            path.lineTo(this.f48501e[0], dpf2);
        }
        path.close();
        canvas.drawPath(path, this.f48507x);
    }

    public final void i(Canvas canvas, int i10, int i11, float f9) {
        float f10;
        float f11;
        float f12 = f(i10, i11);
        if (f12 <= 0.0f) {
            return;
        }
        if (i10 == this.f48501e[0]) {
            f10 = i10 + f12;
        } else {
            f10 = i10 - f12;
        }
        if (i11 == this.f48502f[0]) {
            f11 = i11 + f12;
        } else {
            f11 = i11 - f12;
        }
        RectF rectF = this.A;
        rectF.set(f10 - f12, f11 - f12, f10 + f12, f11 + f12);
        canvas.drawArc(rectF, f9, 90.0f, false, this.v);
    }

    public final int j() {
        for (int i10 = 0; i10 < this.f48498a.f48888c; i10++) {
            if (e(i10)) {
                return i10;
            }
        }
        return -1;
    }

    public final int k() {
        for (int i10 = 0; i10 < this.f48498a.f48887b; i10++) {
            if (t(i10)) {
                return i10;
            }
        }
        return -1;
    }

    public final boolean l() {
        x5 x5Var = this.f48498a;
        if (x5Var != null && this.h != null) {
            ArrayList arrayList = x5Var.f48891g;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                if (((LinkedHashSet) ((sf.f1) this.h).f47804b).contains((TL_iv.pageTableCell) obj)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final j5 m(TL_iv.pageTableCell pagetablecell) {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof j5) {
                j5 j5Var = (j5) childAt;
                if (j5Var.f48527b == pagetablecell) {
                    return j5Var;
                }
            }
        }
        return null;
    }

    public final boolean n(int i10) {
        if (i10 < 0 || i10 >= this.f48498a.f48888c) {
            return false;
        }
        for (int i11 = 0; i11 < this.f48498a.f48887b; i11++) {
            if (!p(i11, i10)) {
                return false;
            }
        }
        return true;
    }

    public final boolean o(int i10) {
        if (i10 < 0 || i10 >= this.f48498a.f48887b) {
            return false;
        }
        for (int i11 = 0; i11 < this.f48498a.f48888c; i11++) {
            if (!p(i10, i11)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        if (this.f48498a != null) {
            for (int i14 = 0; i14 < getChildCount(); i14++) {
                View childAt = getChildAt(i14);
                if (childAt instanceof j5) {
                    j5 j5Var = (j5) childAt;
                    int b10 = this.f48498a.b(j5Var.f48527b);
                    int a2 = this.f48498a.a(j5Var.f48527b);
                    if (b10 >= 0 && a2 >= 0) {
                        int i15 = this.f48501e[a2];
                        int i16 = this.f48502f[b10];
                        j5Var.layout(i15, i16, j5Var.getMeasuredWidth() + i15, j5Var.getMeasuredHeight() + i16);
                    }
                }
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int max;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int round;
        int i18;
        int a2;
        float f9 = 20.0f;
        int dp = AndroidUtilities.dp(20.0f);
        int dp2 = AndroidUtilities.dp(4.0f);
        int dp3 = AndroidUtilities.dp(4.0f);
        int dp4 = AndroidUtilities.dp(10.0f);
        x5 x5Var = this.f48498a;
        if (x5Var != null && x5Var.f48887b != 0 && x5Var.f48888c != 0) {
            int size = (View.MeasureSpec.getSize(i10) - dp) - dp3;
            x5 x5Var2 = this.f48498a;
            int i19 = x5Var2.f48887b;
            int i20 = x5Var2.f48888c;
            this.f48500c = new int[i20];
            this.d = new int[i19];
            if (!x5Var2.f48886a.compact) {
                f9 = 50.0f;
            }
            int dp5 = AndroidUtilities.dp(f9);
            if (this.f48498a.f48886a.compact) {
                i12 = 5;
            } else {
                i12 = 12;
            }
            if (i20 == 2) {
                max = j7.l1.d(i12 * 4, size / 2, 0);
            } else {
                max = Math.max(0, Math.round(size / 1.5f));
            }
            float f10 = i12 * 2;
            int b10 = org.telegram.messenger.x3.b(f10, max, dp5);
            for (int i21 = 0; i21 < i20; i21++) {
                this.f48500c[i21] = dp5;
            }
            int i22 = 0;
            while (true) {
                i13 = 1;
                if (i22 >= getChildCount()) {
                    break;
                }
                View childAt = getChildAt(i22);
                if (childAt instanceof j5) {
                    j5 j5Var = (j5) childAt;
                    d1 d1Var = j5Var.f48526a;
                    if (x5.n(j5Var.f48527b) == 1 && (a2 = this.f48498a.a(j5Var.f48527b)) >= 0 && a2 < i20) {
                        int dp6 = AndroidUtilities.dp(f10) + Math.round(Layout.getDesiredWidth(d1Var.getText(), d1Var.getPaint()));
                        int[] iArr = this.f48500c;
                        iArr[a2] = Math.max(iArr[a2], Math.min(b10, dp6));
                    }
                }
                i22++;
            }
            int i23 = 0;
            while (i23 < getChildCount()) {
                View childAt2 = getChildAt(i23);
                if (childAt2 instanceof j5) {
                    j5 j5Var2 = (j5) childAt2;
                    d1 d1Var2 = j5Var2.f48526a;
                    int n10 = x5.n(j5Var2.f48527b);
                    if (n10 > i13) {
                        int a10 = this.f48498a.a(j5Var2.f48527b);
                        int min = Math.min(i20, n10 + a10);
                        if (a10 >= 0 && a10 < min) {
                            int i24 = 0;
                            for (int i25 = a10; i25 < min; i25++) {
                                i24 += this.f48500c[i25];
                            }
                            int min2 = Math.min((min - a10) * b10, AndroidUtilities.dp(f10) + Math.round(Layout.getDesiredWidth(d1Var2.getText(), d1Var2.getPaint()))) - i24;
                            while (a10 < min && min2 > 0) {
                                int i26 = ((min2 + i18) - 1) / (min - a10);
                                int[] iArr2 = this.f48500c;
                                iArr2[a10] = iArr2[a10] + i26;
                                min2 -= i26;
                                a10++;
                            }
                        }
                        i23++;
                        i13 = 1;
                    }
                }
                i23++;
                i13 = 1;
            }
            int i27 = 0;
            for (int i28 : this.f48500c) {
                i27 += i28;
            }
            if (i27 < size && i20 > 0) {
                int i29 = size - i27;
                for (int i30 = 0; i30 < i20; i30++) {
                    if (i30 == i20 - 1) {
                        round = i29;
                    } else {
                        round = Math.round((this.f48500c[i30] * i29) / i27);
                    }
                    int[] iArr3 = this.f48500c;
                    int i31 = iArr3[i30] + round;
                    iArr3[i30] = i31;
                    i29 -= round;
                    i27 -= i31 - round;
                }
            }
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            int i32 = 0;
            while (i32 < getChildCount()) {
                View childAt3 = getChildAt(i32);
                if (!(childAt3 instanceof j5)) {
                    i17 = i32;
                } else {
                    j5 j5Var3 = (j5) childAt3;
                    int b11 = this.f48498a.b(j5Var3.f48527b);
                    int a11 = this.f48498a.a(j5Var3.f48527b);
                    int n11 = x5.n(j5Var3.f48527b);
                    i17 = i32;
                    int i33 = 0;
                    for (int i34 = a11; i34 < a11 + n11 && i34 < i20; i34++) {
                        i33 += this.f48500c[i34];
                    }
                    j5Var3.measure(View.MeasureSpec.makeMeasureSpec(i33, 1073741824), makeMeasureSpec);
                    if (x5.o(j5Var3.f48527b) == 1) {
                        int measuredHeight = j5Var3.getMeasuredHeight();
                        int[] iArr4 = this.d;
                        if (measuredHeight > iArr4[b11]) {
                            iArr4[b11] = j5Var3.getMeasuredHeight();
                        }
                    }
                }
                i32 = i17 + 1;
            }
            for (int i35 = 0; i35 < getChildCount(); i35++) {
                View childAt4 = getChildAt(i35);
                if (childAt4 instanceof j5) {
                    j5 j5Var4 = (j5) childAt4;
                    int b12 = this.f48498a.b(j5Var4.f48527b);
                    int o10 = x5.o(j5Var4.f48527b);
                    if (o10 > 1) {
                        int i36 = b12;
                        int i37 = 0;
                        while (true) {
                            i15 = b12 + o10;
                            if (i36 >= i15 || i36 >= i19) {
                                break;
                            }
                            i37 += this.d[i36];
                            i36++;
                        }
                        int measuredHeight2 = j5Var4.getMeasuredHeight();
                        if (measuredHeight2 > i37) {
                            int i38 = measuredHeight2 - i37;
                            int max2 = i38 / Math.max(o10, 1);
                            int max3 = i38 % Math.max(o10, 1);
                            while (b12 < i15 && b12 < i19) {
                                int[] iArr5 = this.d;
                                int i39 = iArr5[b12];
                                if (max3 > 0) {
                                    i16 = 1;
                                } else {
                                    i16 = 0;
                                }
                                iArr5[b12] = max2 + i16 + i39;
                                if (max3 > 0) {
                                    max3--;
                                }
                                b12++;
                            }
                        }
                    }
                }
            }
            int i40 = 0;
            while (i40 < getChildCount()) {
                View childAt5 = getChildAt(i40);
                if (!(childAt5 instanceof j5)) {
                    i14 = i40;
                } else {
                    j5 j5Var5 = (j5) childAt5;
                    int b13 = this.f48498a.b(j5Var5.f48527b);
                    int a12 = this.f48498a.a(j5Var5.f48527b);
                    int n12 = x5.n(j5Var5.f48527b);
                    int o11 = x5.o(j5Var5.f48527b);
                    i14 = i40;
                    int i41 = 0;
                    for (int i42 = a12; i42 < a12 + n12 && i42 < i20; i42++) {
                        i41 += this.f48500c[i42];
                    }
                    int i43 = 0;
                    for (int i44 = b13; i44 < b13 + o11 && i44 < i19; i44++) {
                        i43 += this.d[i44];
                    }
                    j5Var5.measure(View.MeasureSpec.makeMeasureSpec(i41, 1073741824), View.MeasureSpec.makeMeasureSpec(i43, 1073741824));
                }
                i40 = i14 + 1;
            }
            int[] iArr6 = new int[i20 + 1];
            this.f48501e = iArr6;
            iArr6[0] = dp;
            int i45 = 0;
            while (i45 < i20) {
                int[] iArr7 = this.f48501e;
                int i46 = i45 + 1;
                iArr7[i46] = iArr7[i45] + this.f48500c[i45];
                i45 = i46;
            }
            int[] iArr8 = new int[i19 + 1];
            this.f48502f = iArr8;
            iArr8[0] = dp2;
            int i47 = 0;
            while (i47 < i19) {
                int[] iArr9 = this.f48502f;
                int i48 = i47 + 1;
                iArr9[i48] = iArr9[i47] + this.d[i47];
                i47 = i48;
            }
            setMeasuredDimension(Math.max(this.f48501e[i20] + dp3, size + dp + dp3), this.f48502f[i19] + dp4);
            return;
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i10), dp2 + dp4);
        this.f48500c = new int[0];
        this.d = new int[0];
        this.f48501e = new int[0];
        this.f48502f = new int[0];
    }

    public final boolean p(int i10, int i11) {
        h5 h5Var;
        x5 x5Var = this.f48498a;
        if (x5Var == null || (h5Var = this.h) == null || i10 < 0 || i10 >= x5Var.f48887b || i11 < 0 || i11 >= x5Var.f48888c) {
            return false;
        }
        return ((LinkedHashSet) ((sf.f1) h5Var).f47804b).contains(x5Var.d[i10][i11]);
    }

    public final int q() {
        for (int i10 = this.f48498a.f48888c - 1; i10 >= 0; i10--) {
            if (e(i10)) {
                return i10;
            }
        }
        return -1;
    }

    public final int r() {
        for (int i10 = this.f48498a.f48887b - 1; i10 >= 0; i10--) {
            if (t(i10)) {
                return i10;
            }
        }
        return -1;
    }

    public final void s() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (getChildAt(childCount) instanceof j5) {
                removeViewAt(childCount);
            }
        }
        x5 x5Var = this.f48498a;
        if (x5Var != null) {
            int size = x5Var.f48891g.size();
            for (int i10 = 0; i10 < size; i10++) {
                j5 j5Var = new j5(getContext(), this.f48499b);
                j5Var.setCompact(this.f48498a.f48886a.compact);
                j5Var.b((TL_iv.pageTableCell) this.f48498a.f48891g.get(i10));
                addView(j5Var);
            }
        }
    }

    public void setModel(x5 x5Var) {
        this.f48498a = x5Var;
        s();
    }

    public void setSelectionProvider(h5 h5Var) {
        this.h = h5Var;
        invalidate();
    }

    public final boolean t(int i10) {
        if (i10 >= 0 && i10 < this.f48498a.f48887b) {
            for (int i11 = 0; i11 < this.f48498a.f48888c; i11++) {
                if (p(i10, i11)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean u() {
        if (!l()) {
            return false;
        }
        boolean d = d(k(), r());
        boolean c3 = c(j(), q());
        if (d && !c3) {
            return false;
        }
        return true;
    }

    public final boolean v() {
        if (!l()) {
            return false;
        }
        boolean d = d(k(), r());
        if (c(j(), q()) && !d) {
            return false;
        }
        return true;
    }
}
