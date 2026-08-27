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

public final class sg0 extends org.telegram.ui.Components.a6 {
    public static final float[] O = {12.0f, 12.0f, 10.0f};
    public static final int[] P = {16, 8, 4};
    public int[] A;
    public int[] B;
    public int C;
    public final r00 D;
    public boolean E;
    public final Paint F;
    public final o1.j G;
    public final o1.j H;
    public float I;
    public float J;
    public View K;
    public final HashSet L;
    public final ud.a M;
    public final vd.b N;

    public final org.telegram.ui.ActionBar.c6 f42634s;
    public int v;

    public float[] f42635w;

    public float[] f42636x;

    public int[] f42637y;

    public sg0(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.D = new r00(this, 26);
        this.F = new Paint(1);
        new ArrayList();
        new ArrayList();
        o1.c cVar = o1.h.f19135s;
        o1.c cVar2 = o1.h.f19134r;
        o1.c cVar3 = o1.h.f19131o;
        o1.c cVar4 = o1.h.f19133q;
        new o1.k(1.0f);
        new ArrayList();
        new ArrayList();
        o1.c cVar5 = o1.h.f19132p;
        new o1.k(1.0f);
        o1.j jVar = new o1.j(this, new org.telegram.ui.Components.fb(1));
        this.G = jVar;
        o1.j jVar2 = new o1.j(this, new org.telegram.ui.Components.fb(2));
        this.H = jVar2;
        jVar.f19147u = org.telegram.ui.Cells.pa.k(1.0f, 1500.0f, 0.75f);
        o1.k kVar = new o1.k(1.0f);
        kVar.b(250.0f);
        kVar.a(0.25f);
        o1.k kVar2 = new o1.k(1.0f);
        kVar2.b(250.0f);
        kVar2.a(0.25f);
        o1.k kVar3 = new o1.k(1.0f);
        kVar3.b(1500.0f);
        kVar3.a(0.75f);
        jVar2.f19147u = kVar3;
        this.L = new HashSet();
        this.M = new ud.a(0, new zt(this, 22), org.telegram.ui.Components.er.h, 380L, false);
        this.N = new vd.b(new g(this, 25));
        this.f42634s = c6Var;
    }

    public static void k(sg0 sg0Var, View view, float f10, float f11) {
        float f12;
        float f13;
        float width = view.getWidth();
        float height = view.getHeight();
        if (width <= 0.0f || height <= 0.0f) {
            return;
        }
        float f14 = width * 0.5f;
        float f15 = height * 0.5f;
        float f16 = f10 - f14;
        float f17 = f11 - f15;
        float f18 = f16 / f14;
        float f19 = f17 / f15;
        float fSqrt = (float) Math.sqrt((f19 * f19) + (f18 * f18));
        if (fSqrt > 1.0E-4f) {
            float f20 = ((1.5f * fSqrt) / (0.5f + fSqrt)) / fSqrt;
            f12 = (f16 * f20) + f14;
            f13 = (f17 * f20) + f15;
        } else {
            f12 = f14;
            f13 = f15;
        }
        float fLerp = AndroidUtilities.lerp(f14, f12, 1.0f);
        float fLerp2 = AndroidUtilities.lerp(f15, f13, 3.0f);
        view.setPivotX(fLerp);
        view.setPivotY(fLerp2);
    }

    public static void m(sg0 sg0Var, float f10, boolean z10, boolean z11) {
        View view;
        o1.j jVar = sg0Var.H;
        float f11 = Float.MAX_VALUE;
        if (sg0Var.getChildCount() != 0) {
            float f12 = -3.4028235E38f;
            boolean z12 = false;
            float f13 = Float.MAX_VALUE;
            for (int i10 = 0; i10 < sg0Var.getChildCount(); i10++) {
                View childAt = sg0Var.getChildAt(i10);
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
        if (sg0Var.getChildCount() == 0) {
            view = null;
        } else {
            view = null;
            for (int i11 = 0; i11 < sg0Var.getChildCount(); i11++) {
                View childAt2 = sg0Var.getChildAt(i11);
                if (childAt2 != null && childAt2.getVisibility() == 0) {
                    float fAbs = Math.abs(((childAt2.getWidth() * 0.5f) + childAt2.getX()) - f10);
                    if (fAbs < f11) {
                        view = childAt2;
                        f11 = fAbs;
                    }
                }
            }
        }
        if (z10) {
            int childCount = sg0Var.getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt3 = sg0Var.getChildAt(i12);
                if (childAt3.getVisibility() == 0 && (childAt3 instanceof xg.b) && ((xg.b) childAt3).h.f48498f) {
                    view2 = childAt3;
                    break;
                }
            }
            if (view2 != null) {
                float width2 = (view2.getWidth() / 2.0f) + view2.getX();
                sg0Var.I = width2;
                sg0Var.J = width2 - f10;
                o1.j jVar2 = sg0Var.G;
                if (jVar2.f19141f) {
                    jVar2.v = 0.0f;
                } else {
                    if (jVar2.f19147u == null) {
                        jVar2.f19147u = new o1.k(0.0f);
                    }
                    jVar2.f19147u.f19154i = 0.0f;
                    jVar2.f();
                }
                if (view2 != view && view != null) {
                    view.performClick();
                }
            }
            jVar.c();
        }
        if (!z11) {
            sg0Var.I = f10;
            sg0Var.invalidate();
        }
        if (view != null) {
            sg0Var.K = view;
            int childCount2 = sg0Var.getChildCount();
            for (int i13 = 0; i13 < childCount2; i13++) {
                View childAt4 = sg0Var.getChildAt(i13);
                if (childAt4 instanceof xg.b) {
                    ((xg.b) childAt4).e(childAt4 == view, true);
                }
            }
            if (z11) {
                float width3 = view.getWidth();
                float x8 = (width3 / 2.0f) + view.getX();
                if (0.0f == width3 && 0.0f == x8) {
                    return;
                }
                if (jVar.f19141f) {
                    jVar.v = x8;
                    return;
                }
                if (jVar.f19147u == null) {
                    jVar.f19147u = new o1.k(x8);
                }
                jVar.f19147u.f19154i = x8;
                jVar.f();
            }
        }
    }

    public static float p(View view) {
        return (view.getWidth() * 0.5f) + view.getX();
    }

    public void setSkipDrawSelector(boolean z10) {
        this.E = z10;
        if (z10) {
            this.F.setColor(org.telegram.ui.ActionBar.g6.l1(0.09f, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.al, this.f42634s)));
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() == 0 && (childAt instanceof xg.b)) {
                ((xg.b) childAt).setSkipDrawSelector(z10);
            }
        }
        invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        int width;
        if (this.E) {
            float f10 = this.I + this.J;
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
                        float fP = p(view);
                        float fP2 = p(view2);
                        width = (view == view2 || fP == fP2) ? view.getWidth() : AndroidUtilities.lerp(view.getWidth(), view2.getWidth(), (f10 - fP) / (fP2 - fP));
                    }
                    f11 = width;
                }
            }
            float height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            float f12 = f11 / 2.0f;
            float f13 = height / 2.0f;
            canvas2 = canvas;
            canvas2.drawRoundRect(f10 - f12, (getHeight() - height) / 2.0f, f10 + f12, (getHeight() + height) / 2.0f, f13, f13, this.F);
        } else {
            canvas2 = canvas;
        }
        super.dispatchDraw(canvas2);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        this.N.a(motionEvent, this);
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void e() {
        o();
    }

    @Override
    public final void f(View view, float f10) {
        float fLerp = AndroidUtilities.lerp(0.7f, 1.0f, f10);
        view.setAlpha(f10);
        view.setScaleX(fLerp);
        view.setScaleY(fLerp);
    }

    public final void n() {
        int i10 = (Math.abs(getScaleX() - 1.0f) >= 1.0E-4f || Math.abs(getScaleY() - 1.0f) >= 1.0E-4f) ? 2 : 0;
        if (getLayerType() != i10) {
            setLayerType(i10, null);
            invalidate();
        }
    }

    public final void o() {
        int entriesCount = getEntriesCount();
        for (int i10 = 0; i10 < entriesCount; i10++) {
            ud.e eVarN = this.f26638c.n(i10);
            ((xg.b) ((org.telegram.ui.Components.z5) eVarN.f48505a).f35151a).setVisualWidth(eVarN.b().width());
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
        float f10;
        float fMeasureText;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int paddingTop = (size2 - getPaddingTop()) - getPaddingBottom();
        int i13 = this.v;
        if (i13 > 0 && size > i13) {
            size = i13;
        }
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int iMin = Math.min(AndroidUtilities.dp(320.0f), paddingLeft);
        int i14 = 0;
        float f11 = -1.0f;
        while (true) {
            iArr = P;
            fArr = O;
            if (i14 >= 3) {
                i12 = 0;
                f10 = 0.0f;
                i14 = 2;
                break;
            }
            float f12 = fArr[i14];
            if (f12 != f11) {
                int childCount = getChildCount();
                float[] fArr2 = this.f42635w;
                if (fArr2 == null || fArr2.length < childCount) {
                    this.f42635w = new float[childCount];
                    this.f42636x = new float[childCount];
                    this.f42637y = new int[childCount];
                    this.B = new int[childCount];
                    this.A = new int[childCount];
                }
                int i15 = 0;
                float fMax = 0.0f;
                for (int i16 = 0; i16 < childCount; i16++) {
                    View childAt = getChildAt(i16);
                    if (d(childAt)) {
                        if (childAt instanceof rg0) {
                            xg.b bVar = (xg.b) ((rg0) childAt);
                            if (bVar.P == null) {
                                bVar.P = new TextPaint(bVar.B);
                            }
                            bVar.P.setTextSize(AndroidUtilities.dp(f12));
                            fMeasureText = bVar.P.measureText(bVar.f49427a.getText().toString());
                        } else {
                            fMeasureText = 0.0f;
                        }
                        this.f42635w[i16] = fMeasureText;
                        fMax = Math.max(fMax, fMeasureText);
                        i15++;
                    } else {
                        this.f42635w[i16] = -1.0f;
                    }
                }
                i12 = 0;
                f10 = 0.0f;
                Math.ceil(fMax);
                this.C = i15;
                f11 = fArr[i14];
            } else {
                i12 = 0;
                f10 = 0.0f;
            }
            int iDp = AndroidUtilities.dp(iArr[i14]);
            int childCount2 = getChildCount();
            float f13 = 0.0f;
            for (int i17 = 0; i17 < childCount2; i17++) {
                if (d(getChildAt(i17))) {
                    f13 += this.f42635w[i17] + (iDp * 2);
                }
            }
            if (f13 <= paddingLeft || i14 == 2) {
                break;
            } else {
                i14++;
            }
        }
        float f14 = fArr[i14];
        int childCount3 = getChildCount();
        for (int i18 = 0; i18 < childCount3; i18++) {
            View childAt2 = getChildAt(i18);
            if (childAt2 instanceof rg0) {
                ((xg.b) ((rg0) childAt2)).setTextSizeDp(f14);
            }
        }
        int iDp2 = AndroidUtilities.dp(iArr[i14]) * 2;
        int iMax = (paddingLeft / Math.max(1, this.C)) - iDp2;
        int childCount4 = getChildCount();
        int i19 = 0;
        float f15 = 0.0f;
        for (int i20 = 0; i20 < childCount4; i20++) {
            if (d(getChildAt(i20))) {
                float[] fArr3 = this.f42636x;
                float f16 = this.f42635w[i20] + iDp2;
                fArr3[i20] = f16;
                int[] iArr2 = this.f42637y;
                int i21 = f16 > ((float) (iMax + iDp2)) ? 0 : 1;
                iArr2[i20] = i21;
                f15 += f16;
                i19 += i21;
            } else {
                float[] fArr4 = this.f42635w;
                this.f42636x[i20] = f10;
                fArr4[i20] = f10;
                this.f42637y[i20] = i12;
            }
        }
        if (i19 == 0) {
            int childCount5 = getChildCount();
            for (int i22 = 0; i22 < childCount5; i22++) {
                this.f42637y[i22] = d(getChildAt(i22)) ? 1 : 0;
            }
            i19 = this.C;
        }
        float f17 = paddingLeft;
        if (f15 > f17) {
            float f18 = f17 / f15;
            int childCount6 = getChildCount();
            for (int i23 = 0; i23 < childCount6; i23++) {
                float[] fArr5 = this.f42636x;
                fArr5[i23] = fArr5[i23] * f18;
            }
        } else {
            float f19 = iMin;
            if (f15 < f19) {
                float f20 = (f19 - f15) / i19;
                int childCount7 = getChildCount();
                for (int i24 = 0; i24 < childCount7; i24++) {
                    float[] fArr6 = this.f42636x;
                    fArr6[i24] = (this.f42637y[i24] * f20) + fArr6[i24];
                }
            }
        }
        int childCount8 = getChildCount();
        int i25 = 0;
        for (int i26 = 0; i26 < childCount8; i26++) {
            if (d(getChildAt(i26))) {
                this.A[i26] = Math.round(this.f42636x[i26]);
                this.B[i26] = i25;
                i25 += this.A[i26];
            }
        }
        setMeasuredDimension(getPaddingRight() + getPaddingLeft() + i25, size2);
        int childCount9 = getChildCount();
        for (int i27 = 0; i27 < childCount9; i27++) {
            getChildAt(i27).measure(View.MeasureSpec.makeMeasureSpec(this.A[i27], 1073741824), View.MeasureSpec.makeMeasureSpec(paddingTop, 1073741824));
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
