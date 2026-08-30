package vh;

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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.nr;
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
    public z5 f45985a;
    public final f6 f45986b;
    public int[] f45987c;
    public int[] d;
    public int[] e;
    public int[] f45988f;
    public j5 h;
    public final Paint f45989n;
    public final Paint f45990r;
    public final Paint f45991s;
    public final Paint v;
    public final Paint f45992w;
    public final Paint f45993x;
    public final RectF f45994y;

    public k5(Context context, f6 f6Var) {
        super(context);
        this.f45987c = new int[0];
        this.d = new int[0];
        this.e = new int[0];
        this.f45988f = new int[0];
        Paint paint = new Paint(1);
        this.f45989n = paint;
        this.f45990r = new Paint(1);
        this.f45991s = new Paint(1);
        Paint paint2 = new Paint(1);
        this.v = paint2;
        this.f45992w = new Paint(1);
        this.f45993x = new Paint(1);
        this.f45994y = new RectF();
        this.B = new RectF();
        this.C = new Path();
        this.f45986b = f6Var;
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
        this.D = new org.telegram.ui.Components.z5(this, 0L, 220L, nr.h);
        b();
    }

    public final TL_iv.pageTableCell a() {
        ViewParent parent;
        TL_iv.pageTableCell pagetablecell;
        z5 z5Var = this.f45985a;
        TL_iv.pageTableCell pagetablecell2 = null;
        if (z5Var != null && z5Var.f46340b != 0 && z5Var.f46341c != 0) {
            View findFocus = findFocus();
            if (findFocus == null) {
                parent = null;
            } else {
                parent = findFocus.getParent();
            }
            while (parent != null && parent != this) {
                if (parent instanceof l5) {
                    pagetablecell = ((l5) parent).f46007b;
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
            ArrayList arrayList = this.f45985a.f46343g;
            int size = arrayList.size();
            int i10 = Integer.MAX_VALUE;
            int i11 = Integer.MAX_VALUE;
            int i12 = 0;
            while (i12 < size) {
                Object obj = arrayList.get(i12);
                i12++;
                TL_iv.pageTableCell pagetablecell3 = (TL_iv.pageTableCell) obj;
                if (((LinkedHashSet) ((rh.e) this.h).f43495b).contains(pagetablecell3)) {
                    int b10 = this.f45985a.b(pagetablecell3);
                    int a2 = this.f45985a.a(pagetablecell3);
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
        int i10 = j6.f20150qh;
        f6 f6Var = this.f45986b;
        this.f45989n.setColor(j6.v0(i10, f6Var));
        int v02 = j6.v0(j6.M6, f6Var);
        int red = Color.red(v02);
        int green = Color.green(v02);
        int blue = Color.blue(v02);
        this.f45990r.setColor(j6.v0(j6.f20132ph, f6Var));
        this.f45991s.setColor(Color.argb(20, red, green, blue));
        this.E = 255;
        int i11 = j6.Oh;
        this.v.setColor(j6.v0(i11, f6Var));
        Paint.Style style = Paint.Style.FILL;
        Paint paint = this.f45992w;
        paint.setStyle(style);
        this.L = j6.v0(j6.E6, f6Var);
        this.M = j6.v0(j6.Sh, f6Var);
        paint.setColor(this.L);
        Paint paint2 = this.f45993x;
        paint2.setStyle(style);
        paint2.setColor(j6.v0(i11, f6Var));
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
        throw new UnsupportedOperationException("Method not decompiled: vh.k5.dispatchDraw(android.graphics.Canvas):void");
    }

    public final boolean e(int i10) {
        if (i10 >= 0 && i10 < this.f45985a.f46341c) {
            for (int i11 = 0; i11 < this.f45985a.f46340b; i11++) {
                if (p(i11, i10)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final float f(int i10, int i11) {
        int i12;
        z5 z5Var = this.f45985a;
        int i13 = z5Var.f46341c;
        int i14 = z5Var.f46340b;
        int[] iArr = this.e;
        int i15 = 0;
        if (i10 == iArr[0]) {
            i12 = 0;
        } else {
            if (i10 == iArr[i13]) {
                i12 = i13 - 1;
            }
            return 0.0f;
        }
        int[] iArr2 = this.f45988f;
        if (i11 != iArr2[0]) {
            if (i11 == iArr2[i14]) {
                i15 = i14 - 1;
            }
            return 0.0f;
        }
        if (i12 >= 0 && i15 >= 0 && p(i15, i12)) {
            return Math.min(AndroidUtilities.dpf2(10.0f), Math.min(this.f45987c[i12], this.d[i15]) / 2.0f);
        }
        return 0.0f;
    }

    public final void g(Canvas canvas, int i10, int i11) {
        float dpf2 = i10 - AndroidUtilities.dpf2(1.0f);
        float dpf22 = AndroidUtilities.dpf2(1.0f) + i11;
        float f10 = this.f45988f[this.f45985a.f46340b];
        float dp = AndroidUtilities.dp(16.0f) + f10;
        float min = Math.min(AndroidUtilities.dpf2(10.0f), (dpf22 - dpf2) / 2.0f);
        float f11 = f(i10, this.f45988f[this.f45985a.f46340b]);
        float f12 = f(i11, this.f45988f[this.f45985a.f46340b]);
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
        canvas.drawPath(path, this.f45993x);
    }

    public z5 getModel() {
        return this.f45985a;
    }

    public final void h(Canvas canvas, int i10, int i11) {
        float dpf2 = i10 - AndroidUtilities.dpf2(1.0f);
        float dpf22 = AndroidUtilities.dpf2(1.0f) + i11;
        float dp = this.e[0] - AndroidUtilities.dp(16.0f);
        float min = Math.min(AndroidUtilities.dpf2(10.0f), (dpf22 - dpf2) / 2.0f);
        float f10 = f(this.e[0], i10);
        float f11 = f(this.e[0], i11);
        Path path = this.C;
        path.rewind();
        path.moveTo(this.e[0] + f10, dpf2);
        path.lineTo(dp + min, dpf2);
        float f12 = min * 2.0f;
        float f13 = dp + f12;
        RectF rectF = this.B;
        rectF.set(dp, dpf2, f13, dpf2 + f12);
        path.arcTo(rectF, 270.0f, -90.0f);
        path.lineTo(dp, dpf22 - min);
        rectF.set(dp, dpf22 - f12, f13, dpf22);
        path.arcTo(rectF, 180.0f, -90.0f);
        path.lineTo(this.e[0] + f11, dpf22);
        if (f11 > 0.0f) {
            int i12 = this.e[0];
            float f14 = f11 * 2.0f;
            rectF.set(i12, dpf22 - f14, i12 + f14, dpf22);
            path.arcTo(rectF, 90.0f, 90.0f);
        } else {
            path.lineTo(this.e[0], dpf22);
        }
        path.lineTo(this.e[0], dpf2 + f10);
        if (f10 > 0.0f) {
            int i13 = this.e[0];
            float f15 = f10 * 2.0f;
            rectF.set(i13, dpf2, i13 + f15, f15 + dpf2);
            path.arcTo(rectF, 180.0f, 90.0f);
        } else {
            path.lineTo(this.e[0], dpf2);
        }
        path.close();
        canvas.drawPath(path, this.f45993x);
    }

    public final void i(Canvas canvas, int i10, int i11, float f10) {
        float f11;
        float f12;
        float f13 = f(i10, i11);
        if (f13 <= 0.0f) {
            return;
        }
        if (i10 == this.e[0]) {
            f11 = i10 + f13;
        } else {
            f11 = i10 - f13;
        }
        if (i11 == this.f45988f[0]) {
            f12 = i11 + f13;
        } else {
            f12 = i11 - f13;
        }
        RectF rectF = this.B;
        rectF.set(f11 - f13, f12 - f13, f11 + f13, f12 + f13);
        canvas.drawArc(rectF, f10, 90.0f, false, this.v);
    }

    public final int j() {
        for (int i10 = 0; i10 < this.f45985a.f46341c; i10++) {
            if (e(i10)) {
                return i10;
            }
        }
        return -1;
    }

    public final int k() {
        for (int i10 = 0; i10 < this.f45985a.f46340b; i10++) {
            if (t(i10)) {
                return i10;
            }
        }
        return -1;
    }

    public final boolean l() {
        z5 z5Var = this.f45985a;
        if (z5Var != null && this.h != null) {
            ArrayList arrayList = z5Var.f46343g;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                if (((LinkedHashSet) ((rh.e) this.h).f43495b).contains((TL_iv.pageTableCell) obj)) {
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
                if (l5Var.f46007b == pagetablecell) {
                    return l5Var;
                }
            }
        }
        return null;
    }

    public final boolean n(int i10) {
        if (i10 < 0 || i10 >= this.f45985a.f46341c) {
            return false;
        }
        for (int i11 = 0; i11 < this.f45985a.f46340b; i11++) {
            if (!p(i11, i10)) {
                return false;
            }
        }
        return true;
    }

    public final boolean o(int i10) {
        if (i10 < 0 || i10 >= this.f45985a.f46340b) {
            return false;
        }
        for (int i11 = 0; i11 < this.f45985a.f46341c; i11++) {
            if (!p(i10, i11)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        if (this.f45985a != null) {
            for (int i14 = 0; i14 < getChildCount(); i14++) {
                View childAt = getChildAt(i14);
                if (childAt instanceof l5) {
                    l5 l5Var = (l5) childAt;
                    int b10 = this.f45985a.b(l5Var.f46007b);
                    int a2 = this.f45985a.a(l5Var.f46007b);
                    if (b10 >= 0 && a2 >= 0) {
                        int i15 = this.e[a2];
                        int i16 = this.f45988f[b10];
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
        z5 z5Var = this.f45985a;
        if (z5Var != null && z5Var.f46340b != 0 && z5Var.f46341c != 0) {
            int size = (View.MeasureSpec.getSize(i10) - dp) - dp3;
            z5 z5Var2 = this.f45985a;
            int i19 = z5Var2.f46340b;
            int i20 = z5Var2.f46341c;
            this.f45987c = new int[i20];
            this.d = new int[i19];
            if (!z5Var2.f46339a.compact) {
                f10 = 50.0f;
            }
            int dp5 = AndroidUtilities.dp(f10);
            if (this.f45985a.f46339a.compact) {
                i12 = 5;
            } else {
                i12 = 12;
            }
            if (i20 == 2) {
                max = kh.a2.c(i12 * 4, size / 2, 0);
            } else {
                max = Math.max(0, Math.round(size / 1.5f));
            }
            float f11 = i12 * 2;
            int b10 = org.telegram.messenger.y3.b(f11, max, dp5);
            for (int i21 = 0; i21 < i20; i21++) {
                this.f45987c[i21] = dp5;
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
                    d1 d1Var = l5Var.f46006a;
                    if (z5.n(l5Var.f46007b) == 1 && (a2 = this.f45985a.a(l5Var.f46007b)) >= 0 && a2 < i20) {
                        int dp6 = AndroidUtilities.dp(f11) + Math.round(Layout.getDesiredWidth(d1Var.getText(), d1Var.getPaint()));
                        int[] iArr = this.f45987c;
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
                    d1 d1Var2 = l5Var2.f46006a;
                    int n10 = z5.n(l5Var2.f46007b);
                    if (n10 > i13) {
                        int a10 = this.f45985a.a(l5Var2.f46007b);
                        int min = Math.min(i20, n10 + a10);
                        if (a10 >= 0 && a10 < min) {
                            int i24 = 0;
                            for (int i25 = a10; i25 < min; i25++) {
                                i24 += this.f45987c[i25];
                            }
                            int min2 = Math.min((min - a10) * b10, AndroidUtilities.dp(f11) + Math.round(Layout.getDesiredWidth(d1Var2.getText(), d1Var2.getPaint()))) - i24;
                            while (a10 < min && min2 > 0) {
                                int i26 = ((min2 + i18) - 1) / (min - a10);
                                int[] iArr2 = this.f45987c;
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
            for (int i28 : this.f45987c) {
                i27 += i28;
            }
            if (i27 < size && i20 > 0) {
                int i29 = size - i27;
                for (int i30 = 0; i30 < i20; i30++) {
                    if (i30 == i20 - 1) {
                        round = i29;
                    } else {
                        round = Math.round((this.f45987c[i30] * i29) / i27);
                    }
                    int[] iArr3 = this.f45987c;
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
                    int b11 = this.f45985a.b(l5Var3.f46007b);
                    int a11 = this.f45985a.a(l5Var3.f46007b);
                    int n11 = z5.n(l5Var3.f46007b);
                    i17 = i32;
                    int i33 = 0;
                    for (int i34 = a11; i34 < a11 + n11 && i34 < i20; i34++) {
                        i33 += this.f45987c[i34];
                    }
                    l5Var3.measure(View.MeasureSpec.makeMeasureSpec(i33, 1073741824), makeMeasureSpec);
                    if (z5.o(l5Var3.f46007b) == 1) {
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
                    int b12 = this.f45985a.b(l5Var4.f46007b);
                    int o10 = z5.o(l5Var4.f46007b);
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
                    int b13 = this.f45985a.b(l5Var5.f46007b);
                    int a12 = this.f45985a.a(l5Var5.f46007b);
                    int n12 = z5.n(l5Var5.f46007b);
                    int o11 = z5.o(l5Var5.f46007b);
                    i14 = i40;
                    int i41 = 0;
                    for (int i42 = a12; i42 < a12 + n12 && i42 < i20; i42++) {
                        i41 += this.f45987c[i42];
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
            this.e = iArr6;
            iArr6[0] = dp;
            int i45 = 0;
            while (i45 < i20) {
                int[] iArr7 = this.e;
                int i46 = i45 + 1;
                iArr7[i46] = iArr7[i45] + this.f45987c[i45];
                i45 = i46;
            }
            int[] iArr8 = new int[i19 + 1];
            this.f45988f = iArr8;
            iArr8[0] = dp2;
            int i47 = 0;
            while (i47 < i19) {
                int[] iArr9 = this.f45988f;
                int i48 = i47 + 1;
                iArr9[i48] = iArr9[i47] + this.d[i47];
                i47 = i48;
            }
            setMeasuredDimension(Math.max(this.e[i20] + dp3, size + dp + dp3), this.f45988f[i19] + dp4);
            return;
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i10), dp2 + dp4);
        this.f45987c = new int[0];
        this.d = new int[0];
        this.e = new int[0];
        this.f45988f = new int[0];
    }

    public final boolean p(int i10, int i11) {
        j5 j5Var;
        z5 z5Var = this.f45985a;
        if (z5Var == null || (j5Var = this.h) == null || i10 < 0 || i10 >= z5Var.f46340b || i11 < 0 || i11 >= z5Var.f46341c) {
            return false;
        }
        return ((LinkedHashSet) ((rh.e) j5Var).f43495b).contains(z5Var.d[i10][i11]);
    }

    public final int q() {
        for (int i10 = this.f45985a.f46341c - 1; i10 >= 0; i10--) {
            if (e(i10)) {
                return i10;
            }
        }
        return -1;
    }

    public final int r() {
        for (int i10 = this.f45985a.f46340b - 1; i10 >= 0; i10--) {
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
        z5 z5Var = this.f45985a;
        if (z5Var != null) {
            int size = z5Var.f46343g.size();
            for (int i10 = 0; i10 < size; i10++) {
                l5 l5Var = new l5(getContext(), this.f45986b);
                l5Var.setCompact(this.f45985a.f46339a.compact);
                l5Var.b((TL_iv.pageTableCell) this.f45985a.f46343g.get(i10));
                addView(l5Var);
            }
        }
    }

    public void setModel(z5 z5Var) {
        this.f45985a = z5Var;
        s();
    }

    public void setSelectionProvider(j5 j5Var) {
        this.h = j5Var;
        invalidate();
    }

    public final boolean t(int i10) {
        if (i10 >= 0 && i10 < this.f45985a.f46340b) {
            for (int i11 = 0; i11 < this.f45985a.f46341c; i11++) {
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
