package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
public final class yg0 extends org.telegram.ui.Components.b6 {
    public static final float[] P = {12.0f, 12.0f, 10.0f};
    public static final int[] Q = {16, 8, 4};
    public int[] B;
    public int[] C;
    public int D;
    public final c10 E;
    public boolean F;
    public final Paint G;
    public final o1.j H;
    public final o1.j I;
    public float J;
    public float K;
    public View L;
    public final HashSet M;
    public final xd.a N;
    public final yd.b O;
    public final org.telegram.ui.ActionBar.g6 f43627s;
    public int v;
    public float[] f43628w;
    public float[] f43629x;
    public int[] f43630y;

    public yg0(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.E = new c10(this, 26);
        this.G = new Paint(1);
        new ArrayList();
        new ArrayList();
        o1.c cVar = o1.h.f16324s;
        o1.c cVar2 = o1.h.f16323r;
        o1.c cVar3 = o1.h.f16320o;
        o1.c cVar4 = o1.h.f16322q;
        new o1.k(1.0f);
        new ArrayList();
        new ArrayList();
        o1.c cVar5 = o1.h.f16321p;
        new o1.k(1.0f);
        o1.j jVar = new o1.j(this, new org.telegram.ui.Components.hb(1));
        this.H = jVar;
        o1.j jVar2 = new o1.j(this, new org.telegram.ui.Components.hb(2));
        this.I = jVar2;
        jVar.f16336u = yh.n(1.0f, 1500.0f, 0.75f);
        o1.k kVar = new o1.k(1.0f);
        kVar.b(250.0f);
        kVar.a(0.25f);
        o1.k kVar2 = new o1.k(1.0f);
        kVar2.b(250.0f);
        kVar2.a(0.25f);
        o1.k kVar3 = new o1.k(1.0f);
        kVar3.b(1500.0f);
        kVar3.a(0.75f);
        jVar2.f16336u = kVar3;
        this.M = new HashSet();
        this.N = new xd.a(0, new gu(this, 22), org.telegram.ui.Components.pr.h, 380L, false);
        this.O = new yd.b(new h(this, 25));
        this.f43627s = g6Var;
    }

    public static void k(yg0 yg0Var, View view, float f10, float f11) {
        float f12;
        float f13;
        float width = view.getWidth();
        float height = view.getHeight();
        if (width > 0.0f && height > 0.0f) {
            float f14 = width * 0.5f;
            float f15 = height * 0.5f;
            float f16 = f10 - f14;
            float f17 = f11 - f15;
            float f18 = f16 / f14;
            float f19 = f17 / f15;
            float sqrt = (float) Math.sqrt((f19 * f19) + (f18 * f18));
            if (sqrt > 1.0E-4f) {
                float f20 = ((1.5f * sqrt) / (0.5f + sqrt)) / sqrt;
                f12 = (f16 * f20) + f14;
                f13 = (f17 * f20) + f15;
            } else {
                f12 = f14;
                f13 = f15;
            }
            float lerp = AndroidUtilities.lerp(f14, f12, 1.0f);
            float lerp2 = AndroidUtilities.lerp(f15, f13, 3.0f);
            view.setPivotX(lerp);
            view.setPivotY(lerp2);
        }
    }

    public static void m(yg0 yg0Var, float f10, boolean z4, boolean z10) {
        View view;
        boolean z11;
        o1.j jVar = yg0Var.I;
        float f11 = Float.MAX_VALUE;
        if (yg0Var.getChildCount() != 0) {
            float f12 = -3.4028235E38f;
            boolean z12 = false;
            float f13 = Float.MAX_VALUE;
            for (int i10 = 0; i10 < yg0Var.getChildCount(); i10++) {
                View childAt = yg0Var.getChildAt(i10);
                if (childAt != null && childAt.getVisibility() == 0) {
                    float width = (childAt.getWidth() * 0.5f) + childAt.getX();
                    if (width < f13) {
                        f13 = width;
                    }
                    if (width > f12) {
                        f12 = width;
                    }
                    z12 = true;
                }
            }
            if (z12) {
                if (f10 < f13) {
                    f10 = f13;
                } else if (f10 > f12) {
                    f10 = f12;
                }
            }
        }
        View view2 = null;
        if (yg0Var.getChildCount() == 0) {
            view = null;
        } else {
            view = null;
            for (int i11 = 0; i11 < yg0Var.getChildCount(); i11++) {
                View childAt2 = yg0Var.getChildAt(i11);
                if (childAt2 != null && childAt2.getVisibility() == 0) {
                    float abs = Math.abs(((childAt2.getWidth() * 0.5f) + childAt2.getX()) - f10);
                    if (abs < f11) {
                        view = childAt2;
                        f11 = abs;
                    }
                }
            }
        }
        if (z4) {
            int childCount = yg0Var.getChildCount();
            int i12 = 0;
            while (true) {
                if (i12 >= childCount) {
                    break;
                }
                View childAt3 = yg0Var.getChildAt(i12);
                if (childAt3.getVisibility() == 0 && (childAt3 instanceof ch.b) && ((ch.b) childAt3).h.f50505f) {
                    view2 = childAt3;
                    break;
                }
                i12++;
            }
            if (view2 != null) {
                float width2 = (view2.getWidth() / 2.0f) + view2.getX();
                yg0Var.J = width2;
                yg0Var.K = width2 - f10;
                o1.j jVar2 = yg0Var.H;
                if (jVar2.f16330f) {
                    jVar2.v = 0.0f;
                } else {
                    if (jVar2.f16336u == null) {
                        jVar2.f16336u = new o1.k(0.0f);
                    }
                    jVar2.f16336u.f16343i = 0.0f;
                    jVar2.f();
                }
                if (view2 != view && view != null) {
                    view.performClick();
                }
            }
            jVar.c();
        }
        if (!z10) {
            yg0Var.J = f10;
            yg0Var.invalidate();
        }
        if (view != null) {
            yg0Var.L = view;
            int childCount2 = yg0Var.getChildCount();
            for (int i13 = 0; i13 < childCount2; i13++) {
                View childAt4 = yg0Var.getChildAt(i13);
                if (childAt4 instanceof ch.b) {
                    ch.b bVar = (ch.b) childAt4;
                    if (childAt4 == view) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    bVar.e(z11, true);
                }
            }
            if (z10) {
                float width3 = view.getWidth();
                float x10 = (width3 / 2.0f) + view.getX();
                if (0.0f != width3 || 0.0f != x10) {
                    if (jVar.f16330f) {
                        jVar.v = x10;
                        return;
                    }
                    if (jVar.f16336u == null) {
                        jVar.f16336u = new o1.k(x10);
                    }
                    jVar.f16336u.f16343i = x10;
                    jVar.f();
                }
            }
        }
    }

    public static float p(View view) {
        return (view.getWidth() * 0.5f) + view.getX();
    }

    public void setSkipDrawSelector(boolean z4) {
        this.F = z4;
        if (z4) {
            this.G.setColor(org.telegram.ui.ActionBar.k6.l1(0.09f, org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.al, this.f43627s)));
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() == 0 && (childAt instanceof ch.b)) {
                ((ch.b) childAt).setSkipDrawSelector(z4);
            }
        }
        invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        int width;
        if (this.F) {
            float f10 = this.J + this.K;
            float f11 = 0.0f;
            if (getChildCount() != 0) {
                View view = null;
                View view2 = null;
                for (int i10 = 0; i10 < getChildCount(); i10++) {
                    View childAt = getChildAt(i10);
                    if (childAt != null && childAt.getVisibility() == 0) {
                        float width2 = (childAt.getWidth() * 0.5f) + childAt.getX();
                        if (width2 <= f10 && (view == null || width2 > p(view))) {
                            view = childAt;
                        }
                        if (width2 >= f10 && (view2 == null || width2 < p(view2))) {
                            view2 = childAt;
                        }
                    }
                }
                if (view != null || view2 != null) {
                    if (view == null) {
                        width = view2.getWidth();
                    } else if (view2 == null) {
                        width = view.getWidth();
                    } else {
                        float p10 = p(view);
                        float p11 = p(view2);
                        if (view != view2 && p10 != p11) {
                            width = AndroidUtilities.lerp(view.getWidth(), view2.getWidth(), (f10 - p10) / (p11 - p10));
                        } else {
                            width = view.getWidth();
                        }
                    }
                    f11 = width;
                }
            }
            float height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            float f12 = f11 / 2.0f;
            float f13 = height / 2.0f;
            canvas2 = canvas;
            canvas2.drawRoundRect(f10 - f12, (getHeight() - height) / 2.0f, f10 + f12, (getHeight() + height) / 2.0f, f13, f13, this.G);
        } else {
            canvas2 = canvas;
        }
        super.dispatchDraw(canvas2);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        this.O.a(motionEvent, this);
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void e() {
        o();
    }

    @Override
    public final void f(View view, float f10) {
        float lerp = AndroidUtilities.lerp(0.7f, 1.0f, f10);
        view.setAlpha(f10);
        view.setScaleX(lerp);
        view.setScaleY(lerp);
    }

    public final void n() {
        int i10;
        if (Math.abs(getScaleX() - 1.0f) < 1.0E-4f && Math.abs(getScaleY() - 1.0f) < 1.0E-4f) {
            i10 = 0;
        } else {
            i10 = 2;
        }
        if (getLayerType() != i10) {
            setLayerType(i10, null);
            invalidate();
        }
    }

    public final void o() {
        int entriesCount = getEntriesCount();
        for (int i10 = 0; i10 < entriesCount; i10++) {
            xd.e n10 = this.f25499c.n(i10);
            ((ch.b) ((org.telegram.ui.Components.a6) n10.f50512a).f25164a).setVisualWidth(n10.b().width());
        }
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        o();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int[] iArr;
        float[] fArr;
        int i12;
        float f10;
        int i13;
        float f11;
        float f12;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int paddingTop = (size2 - getPaddingTop()) - getPaddingBottom();
        int i14 = this.v;
        if (i14 > 0 && size > i14) {
            size = i14;
        }
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int min = Math.min(AndroidUtilities.dp(320.0f), paddingLeft);
        int i15 = 0;
        float f13 = -1.0f;
        while (true) {
            iArr = Q;
            fArr = P;
            if (i15 < 3) {
                if (fArr[i15] != f13) {
                    int childCount = getChildCount();
                    float[] fArr2 = this.f43628w;
                    if (fArr2 == null || fArr2.length < childCount) {
                        this.f43628w = new float[childCount];
                        this.f43629x = new float[childCount];
                        this.f43630y = new int[childCount];
                        this.C = new int[childCount];
                        this.B = new int[childCount];
                    }
                    float f14 = 0.0f;
                    int i16 = 0;
                    for (int i17 = 0; i17 < childCount; i17++) {
                        View childAt = getChildAt(i17);
                        if (!d(childAt)) {
                            this.f43628w[i17] = -1.0f;
                        } else {
                            if (childAt instanceof xg0) {
                                ch.b bVar = (ch.b) ((xg0) childAt);
                                if (bVar.Q == null) {
                                    bVar.Q = new TextPaint(bVar.C);
                                }
                                bVar.Q.setTextSize(AndroidUtilities.dp(f11));
                                f12 = bVar.Q.measureText(bVar.f2519a.getText().toString());
                            } else {
                                f12 = 0.0f;
                            }
                            this.f43628w[i17] = f12;
                            f14 = Math.max(f14, f12);
                            i16++;
                        }
                    }
                    i12 = 0;
                    f10 = 0.0f;
                    Math.ceil(f14);
                    this.D = i16;
                    f13 = fArr[i15];
                } else {
                    i12 = 0;
                    f10 = 0.0f;
                }
                int dp = AndroidUtilities.dp(iArr[i15]);
                int childCount2 = getChildCount();
                float f15 = 0.0f;
                for (int i18 = 0; i18 < childCount2; i18++) {
                    if (d(getChildAt(i18))) {
                        f15 += this.f43628w[i18] + (dp * 2);
                    }
                }
                if (f15 <= paddingLeft || i15 == 2) {
                    break;
                }
                i15++;
            } else {
                i12 = 0;
                f10 = 0.0f;
                i15 = 2;
                break;
            }
        }
        float f16 = fArr[i15];
        int childCount3 = getChildCount();
        for (int i19 = 0; i19 < childCount3; i19++) {
            View childAt2 = getChildAt(i19);
            if (childAt2 instanceof xg0) {
                ((ch.b) ((xg0) childAt2)).setTextSizeDp(f16);
            }
        }
        int dp2 = AndroidUtilities.dp(iArr[i15]) * 2;
        int max = (paddingLeft / Math.max(1, this.D)) - dp2;
        int childCount4 = getChildCount();
        int i20 = 0;
        float f17 = 0.0f;
        for (int i21 = 0; i21 < childCount4; i21++) {
            if (!d(getChildAt(i21))) {
                float[] fArr3 = this.f43628w;
                this.f43629x[i21] = f10;
                fArr3[i21] = f10;
                this.f43630y[i21] = i12;
            } else {
                float[] fArr4 = this.f43629x;
                float f18 = this.f43628w[i21] + dp2;
                fArr4[i21] = f18;
                int[] iArr2 = this.f43630y;
                if (f18 > max + dp2) {
                    i13 = 0;
                } else {
                    i13 = 1;
                }
                iArr2[i21] = i13;
                f17 += f18;
                i20 += i13;
            }
        }
        if (i20 == 0) {
            int childCount5 = getChildCount();
            for (int i22 = 0; i22 < childCount5; i22++) {
                this.f43630y[i22] = d(getChildAt(i22)) ? 1 : 0;
            }
            i20 = this.D;
        }
        float f19 = paddingLeft;
        if (f17 > f19) {
            float f20 = f19 / f17;
            int childCount6 = getChildCount();
            for (int i23 = 0; i23 < childCount6; i23++) {
                float[] fArr5 = this.f43629x;
                fArr5[i23] = fArr5[i23] * f20;
            }
        } else {
            float f21 = min;
            if (f17 < f21) {
                float f22 = (f21 - f17) / i20;
                int childCount7 = getChildCount();
                for (int i24 = 0; i24 < childCount7; i24++) {
                    float[] fArr6 = this.f43629x;
                    fArr6[i24] = (this.f43630y[i24] * f22) + fArr6[i24];
                }
            }
        }
        int childCount8 = getChildCount();
        int i25 = 0;
        for (int i26 = 0; i26 < childCount8; i26++) {
            if (d(getChildAt(i26))) {
                this.B[i26] = Math.round(this.f43629x[i26]);
                this.C[i26] = i25;
                i25 += this.B[i26];
            }
        }
        setMeasuredDimension(getPaddingRight() + getPaddingLeft() + i25, size2);
        int childCount9 = getChildCount();
        for (int i27 = 0; i27 < childCount9; i27++) {
            getChildAt(i27).measure(View.MeasureSpec.makeMeasureSpec(this.B[i27], 1073741824), View.MeasureSpec.makeMeasureSpec(paddingTop, 1073741824));
        }
        a();
    }

    public void setMaxWidth(int i10) {
        if (this.v != i10) {
            this.v = i10;
            requestLayout();
        }
    }

    @Override
    public void setScaleX(float f10) {
        super.setScaleX(f10);
        n();
    }

    @Override
    public void setScaleY(float f10) {
        super.setScaleY(f10);
        n();
    }
}
