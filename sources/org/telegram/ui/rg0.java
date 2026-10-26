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
public final class rg0 extends org.telegram.ui.Components.j6 {
    public static final float[] S = {12.0f, 12.0f, 10.0f};
    public static final int[] T = {16, 8, 4};
    public int[] E;
    public int[] F;
    public int G;
    public final p00 H;
    public boolean I;
    public final Paint J;
    public final o1.j K;
    public final o1.j L;
    public float M;
    public float N;
    public View O;
    public final HashSet P;
    public final oe.b Q;
    public final pe.b R;
    public final org.telegram.ui.ActionBar.u6 f43150s;
    public int v;
    public float[] f43151w;
    public float[] f43152x;
    public int[] f43153y;

    public rg0(Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        this.H = new p00(this, 28);
        this.J = new Paint(1);
        new ArrayList();
        new ArrayList();
        o1.c cVar = o1.h.f18958s;
        o1.c cVar2 = o1.h.f18957r;
        o1.c cVar3 = o1.h.f18954o;
        o1.c cVar4 = o1.h.f18956q;
        new o1.k(1.0f);
        new ArrayList();
        new ArrayList();
        o1.c cVar5 = o1.h.f18955p;
        new o1.k(1.0f);
        o1.j jVar = new o1.j(this, new org.telegram.ui.Components.qb(1));
        this.K = jVar;
        o1.j jVar2 = new o1.j(this, new org.telegram.ui.Components.qb(2));
        this.L = jVar2;
        jVar.f18969u = d3.l(1.0f, 1500.0f, 0.75f);
        o1.k kVar = new o1.k(1.0f);
        kVar.b(250.0f);
        kVar.a(0.25f);
        o1.k kVar2 = new o1.k(1.0f);
        kVar2.b(250.0f);
        kVar2.a(0.25f);
        o1.k kVar3 = new o1.k(1.0f);
        kVar3.b(1500.0f);
        kVar3.a(0.75f);
        jVar2.f18969u = kVar3;
        this.P = new HashSet();
        this.Q = new oe.b(0, new qt(this, 22), org.telegram.ui.Components.ds.h, 380L, false);
        this.R = new pe.b(new f(this, 25));
        this.f43150s = u6Var;
    }

    public static void k(rg0 rg0Var, View view, float f7, float f10) {
        float f11;
        float f12;
        float width = view.getWidth();
        float height = view.getHeight();
        if (width > 0.0f && height > 0.0f) {
            float f13 = width * 0.5f;
            float f14 = height * 0.5f;
            float f15 = f7 - f13;
            float f16 = f10 - f14;
            float f17 = f15 / f13;
            float f18 = f16 / f14;
            float sqrt = (float) Math.sqrt((f18 * f18) + (f17 * f17));
            if (sqrt > 1.0E-4f) {
                float f19 = ((1.5f * sqrt) / (0.5f + sqrt)) / sqrt;
                f11 = (f15 * f19) + f13;
                f12 = (f16 * f19) + f14;
            } else {
                f11 = f13;
                f12 = f14;
            }
            float lerp = AndroidUtilities.lerp(f13, f11, 1.0f);
            float lerp2 = AndroidUtilities.lerp(f14, f12, 3.0f);
            view.setPivotX(lerp);
            view.setPivotY(lerp2);
        }
    }

    public static void m(rg0 rg0Var, float f7, boolean z10, boolean z11) {
        View view;
        o1.j jVar = rg0Var.L;
        float f10 = Float.MAX_VALUE;
        int i10 = 0;
        if (rg0Var.getChildCount() != 0) {
            float f11 = -3.4028235E38f;
            float f12 = Float.MAX_VALUE;
            boolean z12 = false;
            for (int i11 = 0; i11 < rg0Var.getChildCount(); i11++) {
                View childAt = rg0Var.getChildAt(i11);
                if (childAt != null && childAt.getVisibility() == 0) {
                    float width = (childAt.getWidth() * 0.5f) + childAt.getX();
                    if (width < f12) {
                        f12 = width;
                    }
                    if (width > f11) {
                        f11 = width;
                    }
                    z12 = true;
                }
            }
            if (z12) {
                if (f7 < f12) {
                    f7 = f12;
                } else if (f7 > f11) {
                    f7 = f11;
                }
            }
        }
        View view2 = null;
        if (rg0Var.getChildCount() == 0) {
            view = null;
        } else {
            view = null;
            for (int i12 = 0; i12 < rg0Var.getChildCount(); i12++) {
                View childAt2 = rg0Var.getChildAt(i12);
                if (childAt2 != null && childAt2.getVisibility() == 0) {
                    float abs = Math.abs(((childAt2.getWidth() * 0.5f) + childAt2.getX()) - f7);
                    if (abs < f10) {
                        view = childAt2;
                        f10 = abs;
                    }
                }
            }
        }
        if (z10) {
            int childCount = rg0Var.getChildCount();
            while (true) {
                if (i10 >= childCount) {
                    break;
                }
                View childAt3 = rg0Var.getChildAt(i10);
                if (childAt3.getVisibility() == 0 && (childAt3 instanceof qh.b) && ((qh.b) childAt3).h.f19327f) {
                    view2 = childAt3;
                    break;
                }
                i10++;
            }
            if (view2 != null) {
                float width2 = (view2.getWidth() / 2.0f) + view2.getX();
                rg0Var.M = width2;
                rg0Var.N = width2 - f7;
                rg0Var.K.g(0.0f);
                if (view2 != view && view != null) {
                    view.performClick();
                }
            }
            jVar.c();
        }
        if (!z11) {
            rg0Var.M = f7;
            rg0Var.invalidate();
        }
        if (view != null) {
            rg0Var.O = view;
            rg0Var.q(view, true);
            if (z11) {
                float width3 = view.getWidth();
                float x9 = (width3 / 2.0f) + view.getX();
                if (0.0f != width3 || 0.0f != x9) {
                    jVar.g(x9);
                }
            }
        }
    }

    public static float p(View view) {
        return (view.getWidth() * 0.5f) + view.getX();
    }

    public void setSkipDrawSelector(boolean z10) {
        this.I = z10;
        if (z10) {
            this.J.setColor(org.telegram.ui.ActionBar.y6.o1(0.09f, org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.al, this.f43150s)));
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() == 0 && (childAt instanceof qh.b)) {
                ((qh.b) childAt).setSkipDrawSelector(z10);
            }
        }
        invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        int width;
        if (this.I) {
            float f7 = this.M + this.N;
            float f10 = 0.0f;
            if (getChildCount() != 0) {
                View view = null;
                View view2 = null;
                for (int i10 = 0; i10 < getChildCount(); i10++) {
                    View childAt = getChildAt(i10);
                    if (childAt != null && childAt.getVisibility() == 0) {
                        float width2 = (childAt.getWidth() * 0.5f) + childAt.getX();
                        if (width2 <= f7 && (view == null || width2 > p(view))) {
                            view = childAt;
                        }
                        if (width2 >= f7 && (view2 == null || width2 < p(view2))) {
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
                            width = AndroidUtilities.lerp(view.getWidth(), view2.getWidth(), (f7 - p10) / (p11 - p10));
                        } else {
                            width = view.getWidth();
                        }
                    }
                    f10 = width;
                }
            }
            float height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            float f11 = f10 / 2.0f;
            float f12 = height / 2.0f;
            canvas2 = canvas;
            canvas2.drawRoundRect(f7 - f11, (getHeight() - height) / 2.0f, f7 + f11, (getHeight() + height) / 2.0f, f12, f12, this.J);
        } else {
            canvas2 = canvas;
        }
        super.dispatchDraw(canvas2);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        this.R.a(motionEvent, this);
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void e() {
        o();
    }

    @Override
    public final void f(View view, float f7) {
        float lerp = AndroidUtilities.lerp(0.7f, 1.0f, f7);
        view.setAlpha(f7);
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
            oe.g m10 = this.f29495c.m(i10);
            ((qh.b) ((org.telegram.ui.Components.i6) m10.f19337a).f29197a).setVisualWidth(m10.b().width());
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        o();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int[] iArr;
        float[] fArr;
        int i12;
        float f7;
        int i13;
        float f10;
        int i14;
        float f11;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int paddingTop = (size2 - getPaddingTop()) - getPaddingBottom();
        int i15 = this.v;
        if (i15 > 0 && size > i15) {
            size = i15;
        }
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int min = Math.min(AndroidUtilities.dp(320.0f), paddingLeft);
        int i16 = 0;
        float f12 = -1.0f;
        while (true) {
            iArr = T;
            fArr = S;
            if (i16 < 3) {
                if (fArr[i16] != f12) {
                    int childCount = getChildCount();
                    float[] fArr2 = this.f43151w;
                    if (fArr2 == null || fArr2.length < childCount) {
                        this.f43151w = new float[childCount];
                        this.f43152x = new float[childCount];
                        this.f43153y = new int[childCount];
                        this.F = new int[childCount];
                        this.E = new int[childCount];
                    }
                    float f13 = 0.0f;
                    int i17 = 0;
                    for (int i18 = 0; i18 < childCount; i18++) {
                        View childAt = getChildAt(i18);
                        if (!d(childAt)) {
                            this.f43151w[i18] = -1.0f;
                        } else {
                            if (childAt instanceof qg0) {
                                qh.b bVar = (qh.b) ((qg0) childAt);
                                if (bVar.T == null) {
                                    bVar.T = new TextPaint(bVar.F);
                                }
                                bVar.T.setTextSize(AndroidUtilities.dp(f10));
                                f11 = bVar.T.measureText(bVar.f47054a.getText().toString());
                            } else {
                                f11 = 0.0f;
                            }
                            this.f43151w[i18] = f11;
                            f13 = Math.max(f13, f11);
                            i17++;
                        }
                    }
                    i12 = 0;
                    f7 = 0.0f;
                    i14 = 2;
                    Math.ceil(f13);
                    this.G = i17;
                    f12 = fArr[i16];
                } else {
                    i12 = 0;
                    f7 = 0.0f;
                    i14 = 2;
                }
                int dp = AndroidUtilities.dp(iArr[i16]);
                int childCount2 = getChildCount();
                float f14 = f7;
                for (int i19 = i12; i19 < childCount2; i19++) {
                    if (d(getChildAt(i19))) {
                        f14 += this.f43151w[i19] + (dp * 2);
                    }
                }
                if (f14 <= paddingLeft || i16 == i14) {
                    break;
                }
                i16++;
            } else {
                i12 = 0;
                f7 = 0.0f;
                i16 = 2;
                break;
            }
        }
        float f15 = fArr[i16];
        int childCount3 = getChildCount();
        for (int i20 = i12; i20 < childCount3; i20++) {
            View childAt2 = getChildAt(i20);
            if (childAt2 instanceof qg0) {
                ((qh.b) ((qg0) childAt2)).setTextSizeDp(f15);
            }
        }
        int dp2 = AndroidUtilities.dp(iArr[i16]) * 2;
        int max = (paddingLeft / Math.max(1, this.G)) - dp2;
        int childCount4 = getChildCount();
        int i21 = i12;
        int i22 = i21;
        float f16 = f7;
        while (i21 < childCount4) {
            if (!d(getChildAt(i21))) {
                float[] fArr3 = this.f43151w;
                this.f43152x[i21] = f7;
                fArr3[i21] = f7;
                this.f43153y[i21] = i12;
            } else {
                float[] fArr4 = this.f43152x;
                float f17 = this.f43151w[i21] + dp2;
                fArr4[i21] = f17;
                int[] iArr2 = this.f43153y;
                if (f17 > max + dp2) {
                    i13 = i12;
                } else {
                    i13 = 1;
                }
                iArr2[i21] = i13;
                f16 += f17;
                i22 += i13;
            }
            i21++;
        }
        if (i22 == 0) {
            int childCount5 = getChildCount();
            for (int i23 = i12; i23 < childCount5; i23++) {
                this.f43153y[i23] = d(getChildAt(i23)) ? 1 : 0;
            }
            i22 = this.G;
        }
        float f18 = paddingLeft;
        if (f16 > f18) {
            float f19 = f18 / f16;
            int childCount6 = getChildCount();
            for (int i24 = i12; i24 < childCount6; i24++) {
                float[] fArr5 = this.f43152x;
                fArr5[i24] = fArr5[i24] * f19;
            }
        } else {
            float f20 = min;
            if (f16 < f20) {
                float f21 = (f20 - f16) / i22;
                int childCount7 = getChildCount();
                for (int i25 = i12; i25 < childCount7; i25++) {
                    float[] fArr6 = this.f43152x;
                    fArr6[i25] = (this.f43153y[i25] * f21) + fArr6[i25];
                }
            }
        }
        int childCount8 = getChildCount();
        int i26 = i12;
        int i27 = i26;
        while (i26 < childCount8) {
            if (d(getChildAt(i26))) {
                this.E[i26] = Math.round(this.f43152x[i26]);
                this.F[i26] = i27;
                i27 += this.E[i26];
            }
            i26++;
        }
        setMeasuredDimension(getPaddingRight() + getPaddingLeft() + i27, size2);
        int childCount9 = getChildCount();
        for (int i28 = i12; i28 < childCount9; i28++) {
            getChildAt(i28).measure(View.MeasureSpec.makeMeasureSpec(this.E[i28], 1073741824), View.MeasureSpec.makeMeasureSpec(paddingTop, 1073741824));
        }
        a();
    }

    public final void q(View view, boolean z10) {
        boolean z11;
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof qh.b) {
                qh.b bVar = (qh.b) childAt;
                if (childAt == view) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                bVar.f(z11, z10);
            }
        }
    }

    public void setMaxWidth(int i10) {
        if (this.v != i10) {
            this.v = i10;
            requestLayout();
        }
    }

    @Override
    public void setScaleX(float f7) {
        super.setScaleX(f7);
        n();
    }

    @Override
    public void setScaleY(float f7) {
        super.setScaleY(f7);
        n();
    }
}
