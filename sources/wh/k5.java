package wh;

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
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.pr;
public final class k5 extends ViewGroup {
    public final RectF B;
    public final Path C;
    public final org.telegram.ui.Components.z5 D;
    public int E;
    public boolean F;
    public boolean G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public z5 f49871a;
    public final g6 f49872b;
    public int[] f49873c;
    public int[] d;
    public int[] f49874e;
    public int[] f49875f;
    public j5 h;
    public final Paint f49876n;
    public final Paint f49877r;
    public final Paint f49878s;
    public final Paint v;
    public final Paint f49879w;
    public final Paint f49880x;
    public final RectF f49881y;

    public k5(Context context, g6 g6Var) {
        super(context);
        this.f49873c = new int[0];
        this.d = new int[0];
        this.f49874e = new int[0];
        this.f49875f = new int[0];
        Paint paint = new Paint(1);
        this.f49876n = paint;
        this.f49877r = new Paint(1);
        this.f49878s = new Paint(1);
        Paint paint2 = new Paint(1);
        this.v = paint2;
        this.f49879w = new Paint(1);
        this.f49880x = new Paint(1);
        this.f49881y = new RectF();
        this.B = new RectF();
        this.C = new Path();
        this.f49872b = g6Var;
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
        this.D = new org.telegram.ui.Components.z5(this, 0L, 220L, pr.h);
        b();
    }

    public final TL_iv.pageTableCell a() {
        ViewParent parent;
        TL_iv.pageTableCell pagetablecell;
        z5 z5Var = this.f49871a;
        TL_iv.pageTableCell pagetablecell2 = null;
        if (z5Var != null && z5Var.f50260b != 0 && z5Var.f50261c != 0) {
            View findFocus = findFocus();
            if (findFocus == null) {
                parent = null;
            } else {
                parent = findFocus.getParent();
            }
            while (parent != null && parent != this) {
                if (parent instanceof l5) {
                    pagetablecell = ((l5) parent).f49904b;
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
            ArrayList arrayList = this.f49871a.f50264g;
            int size = arrayList.size();
            int i10 = Integer.MAX_VALUE;
            int i11 = Integer.MAX_VALUE;
            int i12 = 0;
            while (i12 < size) {
                Object obj = arrayList.get(i12);
                i12++;
                TL_iv.pageTableCell pagetablecell3 = (TL_iv.pageTableCell) obj;
                if (((LinkedHashSet) ((sf.h) this.h).f47357b).contains(pagetablecell3)) {
                    int b10 = this.f49871a.b(pagetablecell3);
                    int a2 = this.f49871a.a(pagetablecell3);
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
        int i10 = k6.f21906qh;
        g6 g6Var = this.f49872b;
        this.f49876n.setColor(k6.v0(i10, g6Var));
        int v02 = k6.v0(k6.M6, g6Var);
        int red = Color.red(v02);
        int green = Color.green(v02);
        int blue = Color.blue(v02);
        this.f49877r.setColor(k6.v0(k6.f21888ph, g6Var));
        this.f49878s.setColor(Color.argb(20, red, green, blue));
        this.E = 255;
        int i11 = k6.Oh;
        this.v.setColor(k6.v0(i11, g6Var));
        Paint.Style style = Paint.Style.FILL;
        Paint paint = this.f49879w;
        paint.setStyle(style);
        this.L = k6.v0(k6.E6, g6Var);
        this.M = k6.v0(k6.Sh, g6Var);
        paint.setColor(this.L);
        Paint paint2 = this.f49880x;
        paint2.setStyle(style);
        paint2.setColor(k6.v0(i11, g6Var));
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
        throw new UnsupportedOperationException("Method not decompiled: wh.k5.dispatchDraw(android.graphics.Canvas):void");
    }

    public final boolean e(int i10) {
        if (i10 >= 0 && i10 < this.f49871a.f50261c) {
            for (int i11 = 0; i11 < this.f49871a.f50260b; i11++) {
                if (p(i11, i10)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final float f(int i10, int i11) {
        int i12;
        z5 z5Var = this.f49871a;
        int i13 = z5Var.f50261c;
        int i14 = z5Var.f50260b;
        int[] iArr = this.f49874e;
        int i15 = 0;
        if (i10 == iArr[0]) {
            i12 = 0;
        } else {
            if (i10 == iArr[i13]) {
                i12 = i13 - 1;
            }
            return 0.0f;
        }
        int[] iArr2 = this.f49875f;
        if (i11 != iArr2[0]) {
            if (i11 == iArr2[i14]) {
                i15 = i14 - 1;
            }
            return 0.0f;
        }
        if (i12 >= 0 && i15 >= 0 && p(i15, i12)) {
            return Math.min(AndroidUtilities.dpf2(10.0f), Math.min(this.f49873c[i12], this.d[i15]) / 2.0f);
        }
        return 0.0f;
    }

    public final void g(Canvas canvas, int i10, int i11) {
        float dpf2 = i10 - AndroidUtilities.dpf2(1.0f);
        float dpf22 = AndroidUtilities.dpf2(1.0f) + i11;
        float f10 = this.f49875f[this.f49871a.f50260b];
        float dp = AndroidUtilities.dp(16.0f) + f10;
        float min = Math.min(AndroidUtilities.dpf2(10.0f), (dpf22 - dpf2) / 2.0f);
        float f11 = f(i10, this.f49875f[this.f49871a.f50260b]);
        float f12 = f(i11, this.f49875f[this.f49871a.f50260b]);
        Path path = this.C;
        path.rewind();
        path.moveTo(dpf2, f10 - f11);
        path.lineTo(dpf2, dp - min);
        float f13 = min * 2.0f;
        float f14 = dp - f13;
        RectF rectF = this.B;
        rectF.set(dpf2, f14, dpf2 + f13, dp);
        path.arcTo(rectF, 180.0f, -90.0f);
        path.lineTo(dpf22 - min, dp);
        rectF.set(dpf22 - f13, f14, dpf22, dp);
        path.arcTo(rectF, 90.0f, -90.0f);
        path.lineTo(dpf22, f10 - f12);
        if (f12 > 0.0f) {
            float f15 = f12 * 2.0f;
            rectF.set(dpf22 - f15, f10 - f15, dpf22, f10);
            path.arcTo(rectF, 0.0f, 90.0f);
        } else {
            path.lineTo(dpf22, f10);
        }
        path.lineTo(dpf2 + f11, f10);
        if (f11 > 0.0f) {
            float f16 = f11 * 2.0f;
            rectF.set(dpf2, f10 - f16, f16 + dpf2, f10);
            path.arcTo(rectF, 90.0f, 90.0f);
        } else {
            path.lineTo(dpf2, f10);
        }
        path.close();
        canvas.drawPath(path, this.f49880x);
    }

    public z5 getModel() {
        return this.f49871a;
    }

    public final void h(Canvas canvas, int i10, int i11) {
        float dpf2 = i10 - AndroidUtilities.dpf2(1.0f);
        float dpf22 = AndroidUtilities.dpf2(1.0f) + i11;
        float dp = this.f49874e[0] - AndroidUtilities.dp(16.0f);
        float min = Math.min(AndroidUtilities.dpf2(10.0f), (dpf22 - dpf2) / 2.0f);
        float f10 = f(this.f49874e[0], i10);
        float f11 = f(this.f49874e[0], i11);
        Path path = this.C;
        path.rewind();
        path.moveTo(this.f49874e[0] + f10, dpf2);
        path.lineTo(dp + min, dpf2);
        float f12 = min * 2.0f;
        float f13 = dp + f12;
        RectF rectF = this.B;
        rectF.set(dp, dpf2, f13, dpf2 + f12);
        path.arcTo(rectF, 270.0f, -90.0f);
        path.lineTo(dp, dpf22 - min);
        rectF.set(dp, dpf22 - f12, f13, dpf22);
        path.arcTo(rectF, 180.0f, -90.0f);
        path.lineTo(this.f49874e[0] + f11, dpf22);
        if (f11 > 0.0f) {
            int i12 = this.f49874e[0];
            float f14 = f11 * 2.0f;
            rectF.set(i12, dpf22 - f14, i12 + f14, dpf22);
            path.arcTo(rectF, 90.0f, 90.0f);
        } else {
            path.lineTo(this.f49874e[0], dpf22);
        }
        path.lineTo(this.f49874e[0], dpf2 + f10);
        if (f10 > 0.0f) {
            int i13 = this.f49874e[0];
            float f15 = f10 * 2.0f;
            rectF.set(i13, dpf2, i13 + f15, f15 + dpf2);
            path.arcTo(rectF, 180.0f, 90.0f);
        } else {
            path.lineTo(this.f49874e[0], dpf2);
        }
        path.close();
        canvas.drawPath(path, this.f49880x);
    }

    public final void i(float f10, int i10, int i11, Canvas canvas) {
        float f11;
        float f12;
        float f13 = f(i10, i11);
        if (f13 <= 0.0f) {
            return;
        }
        if (i10 == this.f49874e[0]) {
            f11 = i10 + f13;
        } else {
            f11 = i10 - f13;
        }
        if (i11 == this.f49875f[0]) {
            f12 = i11 + f13;
        } else {
            f12 = i11 - f13;
        }
        RectF rectF = this.B;
        rectF.set(f11 - f13, f12 - f13, f11 + f13, f12 + f13);
        canvas.drawArc(rectF, f10, 90.0f, false, this.v);
    }

    public final int j() {
        for (int i10 = 0; i10 < this.f49871a.f50261c; i10++) {
            if (e(i10)) {
                return i10;
            }
        }
        return -1;
    }

    public final int k() {
        for (int i10 = 0; i10 < this.f49871a.f50260b; i10++) {
            if (t(i10)) {
                return i10;
            }
        }
        return -1;
    }

    public final boolean l() {
        z5 z5Var = this.f49871a;
        if (z5Var != null && this.h != null) {
            ArrayList arrayList = z5Var.f50264g;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                if (((LinkedHashSet) ((sf.h) this.h).f47357b).contains((TL_iv.pageTableCell) obj)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final l5 m(TL_iv.pageTableCell pagetablecell) {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof l5) {
                l5 l5Var = (l5) childAt;
                if (l5Var.f49904b == pagetablecell) {
                    return l5Var;
                }
            }
        }
        return null;
    }

    public final boolean n(int i10) {
        if (i10 < 0 || i10 >= this.f49871a.f50261c) {
            return false;
        }
        for (int i11 = 0; i11 < this.f49871a.f50260b; i11++) {
            if (!p(i11, i10)) {
                return false;
            }
        }
        return true;
    }

    public final boolean o(int i10) {
        if (i10 < 0 || i10 >= this.f49871a.f50260b) {
            return false;
        }
        for (int i11 = 0; i11 < this.f49871a.f50261c; i11++) {
            if (!p(i10, i11)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        if (this.f49871a != null) {
            for (int i14 = 0; i14 < getChildCount(); i14++) {
                View childAt = getChildAt(i14);
                if (childAt instanceof l5) {
                    l5 l5Var = (l5) childAt;
                    int b10 = this.f49871a.b(l5Var.f49904b);
                    int a2 = this.f49871a.a(l5Var.f49904b);
                    if (b10 >= 0 && a2 >= 0) {
                        int i15 = this.f49874e[a2];
                        int i16 = this.f49875f[b10];
                        l5Var.layout(i15, i16, l5Var.getMeasuredWidth() + i15, l5Var.getMeasuredHeight() + i16);
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
        float f10 = 20.0f;
        int dp = AndroidUtilities.dp(20.0f);
        int dp2 = AndroidUtilities.dp(4.0f);
        int dp3 = AndroidUtilities.dp(4.0f);
        int dp4 = AndroidUtilities.dp(10.0f);
        z5 z5Var = this.f49871a;
        if (z5Var != null && z5Var.f50260b != 0 && z5Var.f50261c != 0) {
            int size = (View.MeasureSpec.getSize(i10) - dp) - dp3;
            z5 z5Var2 = this.f49871a;
            int i19 = z5Var2.f50260b;
            int i20 = z5Var2.f50261c;
            this.f49873c = new int[i20];
            this.d = new int[i19];
            if (!z5Var2.f50259a.compact) {
                f10 = 50.0f;
            }
            int dp5 = AndroidUtilities.dp(f10);
            if (this.f49871a.f50259a.compact) {
                i12 = 5;
            } else {
                i12 = 12;
            }
            if (i20 == 2) {
                max = l.d.c(i12 * 4, size / 2, 0);
            } else {
                max = Math.max(0, Math.round(size / 1.5f));
            }
            float f11 = i12 * 2;
            int b10 = org.telegram.messenger.y3.b(f11, max, dp5);
            for (int i21 = 0; i21 < i20; i21++) {
                this.f49873c[i21] = dp5;
            }
            int i22 = 0;
            while (true) {
                i13 = 1;
                if (i22 >= getChildCount()) {
                    break;
                }
                View childAt = getChildAt(i22);
                if (childAt instanceof l5) {
                    l5 l5Var = (l5) childAt;
                    e1 e1Var = l5Var.f49903a;
                    if (z5.n(l5Var.f49904b) == 1 && (a2 = this.f49871a.a(l5Var.f49904b)) >= 0 && a2 < i20) {
                        int dp6 = AndroidUtilities.dp(f11) + Math.round(Layout.getDesiredWidth(e1Var.getText(), e1Var.getPaint()));
                        int[] iArr = this.f49873c;
                        iArr[a2] = Math.max(iArr[a2], Math.min(b10, dp6));
                    }
                }
                i22++;
            }
            int i23 = 0;
            while (i23 < getChildCount()) {
                View childAt2 = getChildAt(i23);
                if (childAt2 instanceof l5) {
                    l5 l5Var2 = (l5) childAt2;
                    e1 e1Var2 = l5Var2.f49903a;
                    int n10 = z5.n(l5Var2.f49904b);
                    if (n10 > i13) {
                        int a10 = this.f49871a.a(l5Var2.f49904b);
                        int min = Math.min(i20, n10 + a10);
                        if (a10 >= 0 && a10 < min) {
                            int i24 = 0;
                            for (int i25 = a10; i25 < min; i25++) {
                                i24 += this.f49873c[i25];
                            }
                            int min2 = Math.min((min - a10) * b10, AndroidUtilities.dp(f11) + Math.round(Layout.getDesiredWidth(e1Var2.getText(), e1Var2.getPaint()))) - i24;
                            while (a10 < min && min2 > 0) {
                                int i26 = ((min2 + i18) - 1) / (min - a10);
                                int[] iArr2 = this.f49873c;
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
            for (int i28 : this.f49873c) {
                i27 += i28;
            }
            if (i27 < size && i20 > 0) {
                int i29 = size - i27;
                for (int i30 = 0; i30 < i20; i30++) {
                    if (i30 == i20 - 1) {
                        round = i29;
                    } else {
                        round = Math.round((this.f49873c[i30] * i29) / i27);
                    }
                    int[] iArr3 = this.f49873c;
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
                if (!(childAt3 instanceof l5)) {
                    i17 = i32;
                } else {
                    l5 l5Var3 = (l5) childAt3;
                    int b11 = this.f49871a.b(l5Var3.f49904b);
                    int a11 = this.f49871a.a(l5Var3.f49904b);
                    int n11 = z5.n(l5Var3.f49904b);
                    i17 = i32;
                    int i33 = 0;
                    for (int i34 = a11; i34 < a11 + n11 && i34 < i20; i34++) {
                        i33 += this.f49873c[i34];
                    }
                    l5Var3.measure(View.MeasureSpec.makeMeasureSpec(i33, 1073741824), makeMeasureSpec);
                    if (z5.o(l5Var3.f49904b) == 1) {
                        int measuredHeight = l5Var3.getMeasuredHeight();
                        int[] iArr4 = this.d;
                        if (measuredHeight > iArr4[b11]) {
                            iArr4[b11] = l5Var3.getMeasuredHeight();
                        }
                    }
                }
                i32 = i17 + 1;
            }
            for (int i35 = 0; i35 < getChildCount(); i35++) {
                View childAt4 = getChildAt(i35);
                if (childAt4 instanceof l5) {
                    l5 l5Var4 = (l5) childAt4;
                    int b12 = this.f49871a.b(l5Var4.f49904b);
                    int o10 = z5.o(l5Var4.f49904b);
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
                        int measuredHeight2 = l5Var4.getMeasuredHeight();
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
                if (!(childAt5 instanceof l5)) {
                    i14 = i40;
                } else {
                    l5 l5Var5 = (l5) childAt5;
                    int b13 = this.f49871a.b(l5Var5.f49904b);
                    int a12 = this.f49871a.a(l5Var5.f49904b);
                    int n12 = z5.n(l5Var5.f49904b);
                    int o11 = z5.o(l5Var5.f49904b);
                    i14 = i40;
                    int i41 = 0;
                    for (int i42 = a12; i42 < a12 + n12 && i42 < i20; i42++) {
                        i41 += this.f49873c[i42];
                    }
                    int i43 = 0;
                    for (int i44 = b13; i44 < b13 + o11 && i44 < i19; i44++) {
                        i43 += this.d[i44];
                    }
                    l5Var5.measure(View.MeasureSpec.makeMeasureSpec(i41, 1073741824), View.MeasureSpec.makeMeasureSpec(i43, 1073741824));
                }
                i40 = i14 + 1;
            }
            int[] iArr6 = new int[i20 + 1];
            this.f49874e = iArr6;
            iArr6[0] = dp;
            int i45 = 0;
            while (i45 < i20) {
                int[] iArr7 = this.f49874e;
                int i46 = i45 + 1;
                iArr7[i46] = iArr7[i45] + this.f49873c[i45];
                i45 = i46;
            }
            int[] iArr8 = new int[i19 + 1];
            this.f49875f = iArr8;
            iArr8[0] = dp2;
            int i47 = 0;
            while (i47 < i19) {
                int[] iArr9 = this.f49875f;
                int i48 = i47 + 1;
                iArr9[i48] = iArr9[i47] + this.d[i47];
                i47 = i48;
            }
            setMeasuredDimension(Math.max(this.f49874e[i20] + dp3, size + dp + dp3), this.f49875f[i19] + dp4);
            return;
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i10), dp2 + dp4);
        this.f49873c = new int[0];
        this.d = new int[0];
        this.f49874e = new int[0];
        this.f49875f = new int[0];
    }

    public final boolean p(int i10, int i11) {
        j5 j5Var;
        z5 z5Var = this.f49871a;
        if (z5Var == null || (j5Var = this.h) == null || i10 < 0 || i10 >= z5Var.f50260b || i11 < 0 || i11 >= z5Var.f50261c) {
            return false;
        }
        return ((LinkedHashSet) ((sf.h) j5Var).f47357b).contains(z5Var.d[i10][i11]);
    }

    public final int q() {
        for (int i10 = this.f49871a.f50261c - 1; i10 >= 0; i10--) {
            if (e(i10)) {
                return i10;
            }
        }
        return -1;
    }

    public final int r() {
        for (int i10 = this.f49871a.f50260b - 1; i10 >= 0; i10--) {
            if (t(i10)) {
                return i10;
            }
        }
        return -1;
    }

    public final void s() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (getChildAt(childCount) instanceof l5) {
                removeViewAt(childCount);
            }
        }
        z5 z5Var = this.f49871a;
        if (z5Var != null) {
            int size = z5Var.f50264g.size();
            for (int i10 = 0; i10 < size; i10++) {
                l5 l5Var = new l5(getContext(), this.f49872b);
                l5Var.setCompact(this.f49871a.f50259a.compact);
                l5Var.b((TL_iv.pageTableCell) this.f49871a.f50264g.get(i10));
                addView(l5Var);
            }
        }
    }

    public void setModel(z5 z5Var) {
        this.f49871a = z5Var;
        s();
    }

    public void setSelectionProvider(j5 j5Var) {
        this.h = j5Var;
        invalidate();
    }

    public final boolean t(int i10) {
        if (i10 >= 0 && i10 < this.f49871a.f50260b) {
            for (int i11 = 0; i11 < this.f49871a.f50261c; i11++) {
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
