package qh;

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
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.y5;
public final class h5 extends ViewGroup {
    public final RectF A;
    public final Path B;
    public final y5 C;
    public int D;
    public boolean E;
    public boolean F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public w5 f46426a;
    public final b6 f46427b;
    public int[] f46428c;
    public int[] d;
    public int[] f46429e;
    public int[] f46430f;
    public g5 h;
    public final Paint f46431n;
    public final Paint f46432r;
    public final Paint f46433s;
    public final Paint v;
    public final Paint f46434w;
    public final Paint f46435x;
    public final RectF f46436y;

    public h5(Context context, b6 b6Var) {
        super(context);
        this.f46428c = new int[0];
        this.d = new int[0];
        this.f46429e = new int[0];
        this.f46430f = new int[0];
        Paint paint = new Paint(1);
        this.f46431n = paint;
        this.f46432r = new Paint(1);
        this.f46433s = new Paint(1);
        Paint paint2 = new Paint(1);
        this.v = paint2;
        this.f46434w = new Paint(1);
        this.f46435x = new Paint(1);
        this.f46436y = new RectF();
        this.A = new RectF();
        this.B = new Path();
        this.f46427b = b6Var;
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
        this.C = new y5(this, 0L, 220L, gr.h);
        b();
    }

    public final TL_iv.pageTableCell a() {
        ViewParent parent;
        TL_iv.pageTableCell pagetablecell;
        w5 w5Var = this.f46426a;
        TL_iv.pageTableCell pagetablecell2 = null;
        if (w5Var != null && w5Var.f46779b != 0 && w5Var.f46780c != 0) {
            View findFocus = findFocus();
            if (findFocus == null) {
                parent = null;
            } else {
                parent = findFocus.getParent();
            }
            while (parent != null && parent != this) {
                if (parent instanceof i5) {
                    pagetablecell = ((i5) parent).f46449b;
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
            ArrayList arrayList = this.f46426a.f46783g;
            int size = arrayList.size();
            int i9 = Integer.MAX_VALUE;
            int i10 = Integer.MAX_VALUE;
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                TL_iv.pageTableCell pagetablecell3 = (TL_iv.pageTableCell) obj;
                if (((LinkedHashSet) ((kh.p) this.h).f15813b).contains(pagetablecell3)) {
                    int b10 = this.f46426a.b(pagetablecell3);
                    int a2 = this.f46426a.a(pagetablecell3);
                    if (b10 < i9 || (b10 == i9 && a2 < i10)) {
                        pagetablecell2 = pagetablecell3;
                        i9 = b10;
                        i10 = a2;
                    }
                }
            }
        }
        return pagetablecell2;
    }

    public final void b() {
        int i9 = f6.f23240qh;
        b6 b6Var = this.f46427b;
        this.f46431n.setColor(f6.v0(i9, b6Var));
        int v02 = f6.v0(f6.M6, b6Var);
        int red = Color.red(v02);
        int green = Color.green(v02);
        int blue = Color.blue(v02);
        this.f46432r.setColor(f6.v0(f6.f23221ph, b6Var));
        this.f46433s.setColor(Color.argb(20, red, green, blue));
        this.D = 255;
        int i10 = f6.Oh;
        this.v.setColor(f6.v0(i10, b6Var));
        Paint.Style style = Paint.Style.FILL;
        Paint paint = this.f46434w;
        paint.setStyle(style);
        this.K = f6.v0(f6.E6, b6Var);
        this.L = f6.v0(f6.Sh, b6Var);
        paint.setColor(this.K);
        Paint paint2 = this.f46435x;
        paint2.setStyle(style);
        paint2.setColor(f6.v0(i10, b6Var));
        invalidate();
    }

    public final boolean c(int i9, int i10) {
        if (i9 < 0 || i10 < i9) {
            return false;
        }
        while (i9 <= i10) {
            if (!n(i9)) {
                return false;
            }
            i9++;
        }
        return true;
    }

    public final boolean d(int i9, int i10) {
        if (i9 < 0 || i10 < i9) {
            return false;
        }
        while (i9 <= i10) {
            if (!o(i9)) {
                return false;
            }
            i9++;
        }
        return true;
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r19) {
        throw new UnsupportedOperationException("Method not decompiled: qh.h5.dispatchDraw(android.graphics.Canvas):void");
    }

    public final boolean e(int i9) {
        if (i9 >= 0 && i9 < this.f46426a.f46780c) {
            for (int i10 = 0; i10 < this.f46426a.f46779b; i10++) {
                if (p(i10, i9)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final float f(int i9, int i10) {
        int i11;
        w5 w5Var = this.f46426a;
        int i12 = w5Var.f46780c;
        int i13 = w5Var.f46779b;
        int[] iArr = this.f46429e;
        int i14 = 0;
        if (i9 == iArr[0]) {
            i11 = 0;
        } else {
            if (i9 == iArr[i12]) {
                i11 = i12 - 1;
            }
            return 0.0f;
        }
        int[] iArr2 = this.f46430f;
        if (i10 != iArr2[0]) {
            if (i10 == iArr2[i13]) {
                i14 = i13 - 1;
            }
            return 0.0f;
        }
        if (i11 >= 0 && i14 >= 0 && p(i14, i11)) {
            return Math.min(AndroidUtilities.dpf2(10.0f), Math.min(this.f46428c[i11], this.d[i14]) / 2.0f);
        }
        return 0.0f;
    }

    public final void g(Canvas canvas, int i9, int i10) {
        float dpf2 = i9 - AndroidUtilities.dpf2(1.0f);
        float dpf22 = AndroidUtilities.dpf2(1.0f) + i10;
        float f10 = this.f46430f[this.f46426a.f46779b];
        float dp = AndroidUtilities.dp(16.0f) + f10;
        float min = Math.min(AndroidUtilities.dpf2(10.0f), (dpf22 - dpf2) / 2.0f);
        float f11 = f(i9, this.f46430f[this.f46426a.f46779b]);
        float f12 = f(i10, this.f46430f[this.f46426a.f46779b]);
        Path path = this.B;
        path.rewind();
        path.moveTo(dpf2, f10 - f11);
        path.lineTo(dpf2, dp - min);
        float f13 = min * 2.0f;
        float f14 = dp - f13;
        RectF rectF = this.A;
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
        canvas.drawPath(path, this.f46435x);
    }

    public w5 getModel() {
        return this.f46426a;
    }

    public final void h(Canvas canvas, int i9, int i10) {
        float dpf2 = i9 - AndroidUtilities.dpf2(1.0f);
        float dpf22 = AndroidUtilities.dpf2(1.0f) + i10;
        float dp = this.f46429e[0] - AndroidUtilities.dp(16.0f);
        float min = Math.min(AndroidUtilities.dpf2(10.0f), (dpf22 - dpf2) / 2.0f);
        float f10 = f(this.f46429e[0], i9);
        float f11 = f(this.f46429e[0], i10);
        Path path = this.B;
        path.rewind();
        path.moveTo(this.f46429e[0] + f10, dpf2);
        path.lineTo(dp + min, dpf2);
        float f12 = min * 2.0f;
        float f13 = dp + f12;
        RectF rectF = this.A;
        rectF.set(dp, dpf2, f13, dpf2 + f12);
        path.arcTo(rectF, 270.0f, -90.0f);
        path.lineTo(dp, dpf22 - min);
        rectF.set(dp, dpf22 - f12, f13, dpf22);
        path.arcTo(rectF, 180.0f, -90.0f);
        path.lineTo(this.f46429e[0] + f11, dpf22);
        if (f11 > 0.0f) {
            int i11 = this.f46429e[0];
            float f14 = f11 * 2.0f;
            rectF.set(i11, dpf22 - f14, i11 + f14, dpf22);
            path.arcTo(rectF, 90.0f, 90.0f);
        } else {
            path.lineTo(this.f46429e[0], dpf22);
        }
        path.lineTo(this.f46429e[0], dpf2 + f10);
        if (f10 > 0.0f) {
            int i12 = this.f46429e[0];
            float f15 = f10 * 2.0f;
            rectF.set(i12, dpf2, i12 + f15, f15 + dpf2);
            path.arcTo(rectF, 180.0f, 90.0f);
        } else {
            path.lineTo(this.f46429e[0], dpf2);
        }
        path.close();
        canvas.drawPath(path, this.f46435x);
    }

    public final void i(Canvas canvas, int i9, int i10, float f10) {
        float f11;
        float f12;
        float f13 = f(i9, i10);
        if (f13 <= 0.0f) {
            return;
        }
        if (i9 == this.f46429e[0]) {
            f11 = i9 + f13;
        } else {
            f11 = i9 - f13;
        }
        if (i10 == this.f46430f[0]) {
            f12 = i10 + f13;
        } else {
            f12 = i10 - f13;
        }
        RectF rectF = this.A;
        rectF.set(f11 - f13, f12 - f13, f11 + f13, f12 + f13);
        canvas.drawArc(rectF, f10, 90.0f, false, this.v);
    }

    public final int j() {
        for (int i9 = 0; i9 < this.f46426a.f46780c; i9++) {
            if (e(i9)) {
                return i9;
            }
        }
        return -1;
    }

    public final int k() {
        for (int i9 = 0; i9 < this.f46426a.f46779b; i9++) {
            if (t(i9)) {
                return i9;
            }
        }
        return -1;
    }

    public final boolean l() {
        w5 w5Var = this.f46426a;
        if (w5Var != null && this.h != null) {
            ArrayList arrayList = w5Var.f46783g;
            int size = arrayList.size();
            int i9 = 0;
            while (i9 < size) {
                Object obj = arrayList.get(i9);
                i9++;
                if (((LinkedHashSet) ((kh.p) this.h).f15813b).contains((TL_iv.pageTableCell) obj)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final i5 m(TL_iv.pageTableCell pagetablecell) {
        for (int i9 = 0; i9 < getChildCount(); i9++) {
            View childAt = getChildAt(i9);
            if (childAt instanceof i5) {
                i5 i5Var = (i5) childAt;
                if (i5Var.f46449b == pagetablecell) {
                    return i5Var;
                }
            }
        }
        return null;
    }

    public final boolean n(int i9) {
        if (i9 < 0 || i9 >= this.f46426a.f46780c) {
            return false;
        }
        for (int i10 = 0; i10 < this.f46426a.f46779b; i10++) {
            if (!p(i10, i9)) {
                return false;
            }
        }
        return true;
    }

    public final boolean o(int i9) {
        if (i9 < 0 || i9 >= this.f46426a.f46779b) {
            return false;
        }
        for (int i10 = 0; i10 < this.f46426a.f46780c; i10++) {
            if (!p(i9, i10)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        if (this.f46426a != null) {
            for (int i13 = 0; i13 < getChildCount(); i13++) {
                View childAt = getChildAt(i13);
                if (childAt instanceof i5) {
                    i5 i5Var = (i5) childAt;
                    int b10 = this.f46426a.b(i5Var.f46449b);
                    int a2 = this.f46426a.a(i5Var.f46449b);
                    if (b10 >= 0 && a2 >= 0) {
                        int i14 = this.f46429e[a2];
                        int i15 = this.f46430f[b10];
                        i5Var.layout(i14, i15, i5Var.getMeasuredWidth() + i14, i5Var.getMeasuredHeight() + i15);
                    }
                }
            }
        }
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        int i11;
        int max;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int round;
        int i17;
        int a2;
        float f10 = 20.0f;
        int dp = AndroidUtilities.dp(20.0f);
        int dp2 = AndroidUtilities.dp(4.0f);
        int dp3 = AndroidUtilities.dp(4.0f);
        int dp4 = AndroidUtilities.dp(10.0f);
        w5 w5Var = this.f46426a;
        if (w5Var != null && w5Var.f46779b != 0 && w5Var.f46780c != 0) {
            int size = (View.MeasureSpec.getSize(i9) - dp) - dp3;
            w5 w5Var2 = this.f46426a;
            int i18 = w5Var2.f46779b;
            int i19 = w5Var2.f46780c;
            this.f46428c = new int[i19];
            this.d = new int[i18];
            if (!w5Var2.f46778a.compact) {
                f10 = 50.0f;
            }
            int dp5 = AndroidUtilities.dp(f10);
            if (this.f46426a.f46778a.compact) {
                i11 = 5;
            } else {
                i11 = 12;
            }
            if (i19 == 2) {
                max = org.telegram.messenger.l0.b(i11 * 4, size / 2, 0);
            } else {
                max = Math.max(0, Math.round(size / 1.5f));
            }
            float f11 = i11 * 2;
            int z10 = org.telegram.messenger.l0.z(f11, max, dp5);
            for (int i20 = 0; i20 < i19; i20++) {
                this.f46428c[i20] = dp5;
            }
            int i21 = 0;
            while (true) {
                i12 = 1;
                if (i21 >= getChildCount()) {
                    break;
                }
                View childAt = getChildAt(i21);
                if (childAt instanceof i5) {
                    i5 i5Var = (i5) childAt;
                    d1 d1Var = i5Var.f46448a;
                    if (w5.n(i5Var.f46449b) == 1 && (a2 = this.f46426a.a(i5Var.f46449b)) >= 0 && a2 < i19) {
                        int dp6 = AndroidUtilities.dp(f11) + Math.round(Layout.getDesiredWidth(d1Var.getText(), d1Var.getPaint()));
                        int[] iArr = this.f46428c;
                        iArr[a2] = Math.max(iArr[a2], Math.min(z10, dp6));
                    }
                }
                i21++;
            }
            int i22 = 0;
            while (i22 < getChildCount()) {
                View childAt2 = getChildAt(i22);
                if (childAt2 instanceof i5) {
                    i5 i5Var2 = (i5) childAt2;
                    d1 d1Var2 = i5Var2.f46448a;
                    int n10 = w5.n(i5Var2.f46449b);
                    if (n10 > i12) {
                        int a3 = this.f46426a.a(i5Var2.f46449b);
                        int min = Math.min(i19, n10 + a3);
                        if (a3 >= 0 && a3 < min) {
                            int i23 = 0;
                            for (int i24 = a3; i24 < min; i24++) {
                                i23 += this.f46428c[i24];
                            }
                            int min2 = Math.min((min - a3) * z10, AndroidUtilities.dp(f11) + Math.round(Layout.getDesiredWidth(d1Var2.getText(), d1Var2.getPaint()))) - i23;
                            while (a3 < min && min2 > 0) {
                                int i25 = ((min2 + i17) - 1) / (min - a3);
                                int[] iArr2 = this.f46428c;
                                iArr2[a3] = iArr2[a3] + i25;
                                min2 -= i25;
                                a3++;
                            }
                        }
                        i22++;
                        i12 = 1;
                    }
                }
                i22++;
                i12 = 1;
            }
            int i26 = 0;
            for (int i27 : this.f46428c) {
                i26 += i27;
            }
            if (i26 < size && i19 > 0) {
                int i28 = size - i26;
                for (int i29 = 0; i29 < i19; i29++) {
                    if (i29 == i19 - 1) {
                        round = i28;
                    } else {
                        round = Math.round((this.f46428c[i29] * i28) / i26);
                    }
                    int[] iArr3 = this.f46428c;
                    int i30 = iArr3[i29] + round;
                    iArr3[i29] = i30;
                    i28 -= round;
                    i26 -= i30 - round;
                }
            }
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            int i31 = 0;
            while (i31 < getChildCount()) {
                View childAt3 = getChildAt(i31);
                if (!(childAt3 instanceof i5)) {
                    i16 = i31;
                } else {
                    i5 i5Var3 = (i5) childAt3;
                    int b10 = this.f46426a.b(i5Var3.f46449b);
                    int a10 = this.f46426a.a(i5Var3.f46449b);
                    int n11 = w5.n(i5Var3.f46449b);
                    i16 = i31;
                    int i32 = 0;
                    for (int i33 = a10; i33 < a10 + n11 && i33 < i19; i33++) {
                        i32 += this.f46428c[i33];
                    }
                    i5Var3.measure(View.MeasureSpec.makeMeasureSpec(i32, 1073741824), makeMeasureSpec);
                    if (w5.o(i5Var3.f46449b) == 1) {
                        int measuredHeight = i5Var3.getMeasuredHeight();
                        int[] iArr4 = this.d;
                        if (measuredHeight > iArr4[b10]) {
                            iArr4[b10] = i5Var3.getMeasuredHeight();
                        }
                    }
                }
                i31 = i16 + 1;
            }
            for (int i34 = 0; i34 < getChildCount(); i34++) {
                View childAt4 = getChildAt(i34);
                if (childAt4 instanceof i5) {
                    i5 i5Var4 = (i5) childAt4;
                    int b11 = this.f46426a.b(i5Var4.f46449b);
                    int o6 = w5.o(i5Var4.f46449b);
                    if (o6 > 1) {
                        int i35 = b11;
                        int i36 = 0;
                        while (true) {
                            i14 = b11 + o6;
                            if (i35 >= i14 || i35 >= i18) {
                                break;
                            }
                            i36 += this.d[i35];
                            i35++;
                        }
                        int measuredHeight2 = i5Var4.getMeasuredHeight();
                        if (measuredHeight2 > i36) {
                            int i37 = measuredHeight2 - i36;
                            int max2 = i37 / Math.max(o6, 1);
                            int max3 = i37 % Math.max(o6, 1);
                            while (b11 < i14 && b11 < i18) {
                                int[] iArr5 = this.d;
                                int i38 = iArr5[b11];
                                if (max3 > 0) {
                                    i15 = 1;
                                } else {
                                    i15 = 0;
                                }
                                iArr5[b11] = max2 + i15 + i38;
                                if (max3 > 0) {
                                    max3--;
                                }
                                b11++;
                            }
                        }
                    }
                }
            }
            int i39 = 0;
            while (i39 < getChildCount()) {
                View childAt5 = getChildAt(i39);
                if (!(childAt5 instanceof i5)) {
                    i13 = i39;
                } else {
                    i5 i5Var5 = (i5) childAt5;
                    int b12 = this.f46426a.b(i5Var5.f46449b);
                    int a11 = this.f46426a.a(i5Var5.f46449b);
                    int n12 = w5.n(i5Var5.f46449b);
                    int o9 = w5.o(i5Var5.f46449b);
                    i13 = i39;
                    int i40 = 0;
                    for (int i41 = a11; i41 < a11 + n12 && i41 < i19; i41++) {
                        i40 += this.f46428c[i41];
                    }
                    int i42 = 0;
                    for (int i43 = b12; i43 < b12 + o9 && i43 < i18; i43++) {
                        i42 += this.d[i43];
                    }
                    i5Var5.measure(View.MeasureSpec.makeMeasureSpec(i40, 1073741824), View.MeasureSpec.makeMeasureSpec(i42, 1073741824));
                }
                i39 = i13 + 1;
            }
            int[] iArr6 = new int[i19 + 1];
            this.f46429e = iArr6;
            iArr6[0] = dp;
            int i44 = 0;
            while (i44 < i19) {
                int[] iArr7 = this.f46429e;
                int i45 = i44 + 1;
                iArr7[i45] = iArr7[i44] + this.f46428c[i44];
                i44 = i45;
            }
            int[] iArr8 = new int[i18 + 1];
            this.f46430f = iArr8;
            iArr8[0] = dp2;
            int i46 = 0;
            while (i46 < i18) {
                int[] iArr9 = this.f46430f;
                int i47 = i46 + 1;
                iArr9[i47] = iArr9[i46] + this.d[i46];
                i46 = i47;
            }
            setMeasuredDimension(Math.max(this.f46429e[i19] + dp3, size + dp + dp3), this.f46430f[i18] + dp4);
            return;
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i9), dp2 + dp4);
        this.f46428c = new int[0];
        this.d = new int[0];
        this.f46429e = new int[0];
        this.f46430f = new int[0];
    }

    public final boolean p(int i9, int i10) {
        g5 g5Var;
        w5 w5Var = this.f46426a;
        if (w5Var == null || (g5Var = this.h) == null || i9 < 0 || i9 >= w5Var.f46779b || i10 < 0 || i10 >= w5Var.f46780c) {
            return false;
        }
        return ((LinkedHashSet) ((kh.p) g5Var).f15813b).contains(w5Var.d[i9][i10]);
    }

    public final int q() {
        for (int i9 = this.f46426a.f46780c - 1; i9 >= 0; i9--) {
            if (e(i9)) {
                return i9;
            }
        }
        return -1;
    }

    public final int r() {
        for (int i9 = this.f46426a.f46779b - 1; i9 >= 0; i9--) {
            if (t(i9)) {
                return i9;
            }
        }
        return -1;
    }

    public final void s() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (getChildAt(childCount) instanceof i5) {
                removeViewAt(childCount);
            }
        }
        w5 w5Var = this.f46426a;
        if (w5Var != null) {
            int size = w5Var.f46783g.size();
            for (int i9 = 0; i9 < size; i9++) {
                i5 i5Var = new i5(getContext(), this.f46427b);
                i5Var.setCompact(this.f46426a.f46778a.compact);
                i5Var.b((TL_iv.pageTableCell) this.f46426a.f46783g.get(i9));
                addView(i5Var);
            }
        }
    }

    public void setModel(w5 w5Var) {
        this.f46426a = w5Var;
        s();
    }

    public void setSelectionProvider(g5 g5Var) {
        this.h = g5Var;
        invalidate();
    }

    public final boolean t(int i9) {
        if (i9 >= 0 && i9 < this.f46426a.f46779b) {
            for (int i10 = 0; i10 < this.f46426a.f46780c; i10++) {
                if (p(i9, i10)) {
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
        boolean c10 = c(j(), q());
        if (d && !c10) {
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
