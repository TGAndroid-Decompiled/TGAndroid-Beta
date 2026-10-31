package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class vt0 extends FrameLayout {
    public boolean f42808a;
    public boolean f42809b;
    public final Paint f42810c;
    public final PremiumPreviewFragment d;

    public vt0(PremiumPreviewFragment premiumPreviewFragment, Context context) {
        super(context);
        this.d = premiumPreviewFragment;
        this.f42810c = new Paint(1);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        View view;
        int bottom;
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        org.telegram.ui.ActionBar.l lVar3;
        float f7;
        org.telegram.ui.ActionBar.l lVar4;
        float f10;
        kg.g2 g2Var;
        float f11;
        ?? r11;
        Canvas canvas2;
        org.telegram.ui.ActionBar.z4 z4Var;
        org.telegram.ui.ActionBar.z4 z4Var2;
        org.telegram.ui.ActionBar.l lVar5;
        org.telegram.ui.ActionBar.l lVar6;
        org.telegram.ui.ActionBar.l lVar7;
        PremiumPreviewFragment premiumPreviewFragment = this.d;
        boolean z10 = premiumPreviewFragment.f33700h0;
        kg.k1 k1Var = premiumPreviewFragment.m0;
        if (Build.VERSION.SDK_INT >= 31 && premiumPreviewFragment.f33718w0 != null) {
            premiumPreviewFragment.n0();
        }
        if (!premiumPreviewFragment.Z) {
            if (premiumPreviewFragment.f33690a0) {
                float f12 = premiumPreviewFragment.f33692b0 + 0.016f;
                premiumPreviewFragment.f33692b0 = f12;
                if (f12 > 3.0f) {
                    premiumPreviewFragment.f33690a0 = false;
                }
            } else {
                float f13 = premiumPreviewFragment.f33692b0 - 0.016f;
                premiumPreviewFragment.f33692b0 = f13;
                if (f13 < 1.0f) {
                    premiumPreviewFragment.f33690a0 = true;
                }
            }
        }
        if (premiumPreviewFragment.f33689a.getLayoutManager() != null) {
            view = premiumPreviewFragment.f33689a.getLayoutManager().m(0);
        } else {
            view = null;
        }
        if (view == null) {
            bottom = 0;
        } else {
            bottom = view.getBottom();
        }
        premiumPreviewFragment.f33694c0 = bottom;
        lVar = ((org.telegram.ui.ActionBar.k2) premiumPreviewFragment).actionBar;
        float f14 = 16.0f;
        int L = org.telegram.messenger.i0.L(16.0f) + lVar.getBottom();
        float f15 = 1.0f - ((premiumPreviewFragment.f33694c0 - L) / (premiumPreviewFragment.Y - L));
        premiumPreviewFragment.f33698f0 = f15;
        premiumPreviewFragment.f33698f0 = Utilities.i(f15, 1.0f, 0.0f);
        lVar2 = ((org.telegram.ui.ActionBar.k2) premiumPreviewFragment).actionBar;
        int L2 = org.telegram.messenger.i0.L(16.0f) + lVar2.getBottom();
        if (premiumPreviewFragment.f33694c0 < L2) {
            premiumPreviewFragment.f33694c0 = L2;
        }
        float f16 = premiumPreviewFragment.f33709q0;
        premiumPreviewFragment.f33709q0 = 0.0f;
        if (premiumPreviewFragment.f33694c0 < org.telegram.messenger.i0.L(30.0f) + L2) {
            premiumPreviewFragment.f33709q0 = ((org.telegram.messenger.i0.L(30.0f) + L2) - premiumPreviewFragment.f33694c0) / org.telegram.messenger.i0.L(30.0f);
        }
        if (premiumPreviewFragment.W) {
            premiumPreviewFragment.f33709q0 = 1.0f;
            premiumPreviewFragment.f33698f0 = 1.0f;
        }
        if (f16 != premiumPreviewFragment.f33709q0) {
            premiumPreviewFragment.f33689a.invalidate();
        }
        int i10 = premiumPreviewFragment.f33694c0;
        lVar3 = ((org.telegram.ui.ActionBar.k2) premiumPreviewFragment).actionBar;
        int measuredHeight = i10 - ((premiumPreviewFragment.U.getMeasuredHeight() + lVar3.getMeasuredHeight()) - premiumPreviewFragment.X);
        if (premiumPreviewFragment.U.e.getVisibility() == 0) {
            f7 = 24.0f;
        } else {
            f7 = 16.0f;
        }
        int L3 = org.telegram.messenger.i0.L(f7) + measuredHeight;
        lVar4 = ((org.telegram.ui.ActionBar.k2) premiumPreviewFragment).actionBar;
        float max = Math.max((((((lVar4.getMeasuredHeight() - premiumPreviewFragment.X) - premiumPreviewFragment.U.f36832a.getMeasuredHeight()) / 2.0f) + premiumPreviewFragment.X) - premiumPreviewFragment.U.getTop()) - premiumPreviewFragment.U.f36832a.getTop(), org.telegram.messenger.i0.L(24.0f) + L3);
        float L4 = ((-max) / 4.0f) + org.telegram.messenger.i0.L(16.0f);
        premiumPreviewFragment.U.setTranslationY(max);
        kg.h hVar = premiumPreviewFragment.U.d;
        if (premiumPreviewFragment.f33699g0 == 1) {
            f14 = 9.0f;
        }
        hVar.setTranslationY(L4 + org.telegram.messenger.i0.L(f14));
        float f17 = premiumPreviewFragment.f33698f0;
        float z11 = c3.i0.z(1.0f, f17, 0.4f, 0.6f);
        if (f17 > 0.5f) {
            f10 = (f17 - 0.5f) / 0.5f;
        } else {
            f10 = 0.0f;
        }
        float f18 = 1.0f - f10;
        premiumPreviewFragment.U.d.setScaleX(z11);
        premiumPreviewFragment.U.d.setScaleY(z11);
        premiumPreviewFragment.U.d.setAlpha(f18);
        premiumPreviewFragment.U.f36833b.setAlpha(f18);
        premiumPreviewFragment.U.e.setAlpha(f18);
        premiumPreviewFragment.V.setAlpha(1.0f - premiumPreviewFragment.f33698f0);
        premiumPreviewFragment.V.setTranslationY(premiumPreviewFragment.U.f36834c.getY() + premiumPreviewFragment.U.getY() + ((-(g2Var.getMeasuredHeight() - premiumPreviewFragment.U.d.getMeasuredWidth())) / 2.0f));
        float L5 = org.telegram.messenger.i0.L(72.0f) - premiumPreviewFragment.U.f36832a.getLeft();
        float f19 = premiumPreviewFragment.f33698f0;
        if (f19 > 0.3f) {
            f11 = (f19 - 0.3f) / 0.7f;
        } else {
            f11 = 0.0f;
        }
        premiumPreviewFragment.U.f36832a.setTranslationX((1.0f - org.telegram.ui.Components.gr.h.getInterpolation(1.0f - f11)) * L5);
        du0 du0Var = premiumPreviewFragment.U;
        du0Var.d.f11919b.f11891s = (((getMeasuredWidth() * 0.1f) * premiumPreviewFragment.f33692b0) + (premiumPreviewFragment.U.f36834c.getX() + du0Var.getX())) / getMeasuredWidth();
        du0 du0Var2 = premiumPreviewFragment.U;
        du0Var2.d.f11919b.f11892t = (premiumPreviewFragment.U.f36834c.getY() + du0Var2.getY()) / getMeasuredHeight();
        if (!premiumPreviewFragment.Z) {
            invalidate();
            premiumPreviewFragment.K.invalidate();
            premiumPreviewFragment.J.invalidate();
        }
        k1Var.d(0, (-getMeasuredWidth()) * 0.1f * premiumPreviewFragment.f33692b0, 0, getMeasuredWidth(), 0.0f, getMeasuredHeight());
        if (z10) {
            int i11 = org.telegram.ui.ActionBar.t6.f20872a7;
            int themedColor = premiumPreviewFragment.getThemedColor(i11);
            Paint paint = this.f42810c;
            paint.setColor(themedColor);
            boolean z12 = false;
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), paint);
            if (premiumPreviewFragment.f33709q0 > 0.0f) {
                lVar6 = ((org.telegram.ui.ActionBar.k2) premiumPreviewFragment).actionBar;
                if (lVar6 != null) {
                    paint.setColor(i0.b.f(premiumPreviewFragment.f33709q0, premiumPreviewFragment.getThemedColor(i11), premiumPreviewFragment.getThemedColor(org.telegram.ui.ActionBar.t6.f20929d6)));
                    float measuredWidth = getMeasuredWidth();
                    lVar7 = ((org.telegram.ui.ActionBar.k2) premiumPreviewFragment).actionBar;
                    float height = lVar7.getHeight();
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, measuredWidth, height, paint);
                    r11 = z12;
                }
            }
            canvas2 = canvas;
            r11 = z12;
        } else {
            r11 = 0;
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), k1Var.f11142f);
        }
        super.dispatchDraw(canvas);
        if (premiumPreviewFragment.J.getVisibility() != 0) {
            premiumPreviewFragment.f33716v0.b(premiumPreviewFragment.f33707o0.d, r11);
            premiumPreviewFragment.f33716v0.setBounds(r11, getHeight() - premiumPreviewFragment.f33707o0.d, getWidth(), getHeight());
            premiumPreviewFragment.f33716v0.draw(canvas2);
        }
        z4Var = ((org.telegram.ui.ActionBar.k2) premiumPreviewFragment).parentLayout;
        if (z4Var != null && z10) {
            z4Var2 = ((org.telegram.ui.ActionBar.k2) premiumPreviewFragment).parentLayout;
            int i12 = (int) (premiumPreviewFragment.f33709q0 * 255.0f);
            lVar5 = ((org.telegram.ui.ActionBar.k2) premiumPreviewFragment).actionBar;
            ((ActionBarLayout) z4Var2).p(canvas2, i12, lVar5.getBottom());
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int measuredWidth;
        int measuredHeight;
        PremiumPreviewFragment premiumPreviewFragment = this.d;
        float x10 = premiumPreviewFragment.U.f36834c.getX() + premiumPreviewFragment.U.getX();
        float y3 = premiumPreviewFragment.U.f36834c.getY() + premiumPreviewFragment.U.getY();
        RectF rectF = org.telegram.messenger.i0.P;
        kg.h hVar = premiumPreviewFragment.U.d;
        if (hVar == null) {
            measuredWidth = 0;
        } else {
            measuredWidth = hVar.getMeasuredWidth();
        }
        float f7 = measuredWidth + x10;
        kg.h hVar2 = premiumPreviewFragment.U.d;
        if (hVar2 == null) {
            measuredHeight = 0;
        } else {
            measuredHeight = hVar2.getMeasuredHeight();
        }
        rectF.set(x10, y3, f7, measuredHeight + y3);
        if ((rectF.contains(motionEvent.getX(), motionEvent.getY()) || this.f42808a) && !premiumPreviewFragment.f33689a.I1) {
            motionEvent.offsetLocation(-x10, -y3);
            if (motionEvent.getAction() != 0 && motionEvent.getAction() != 2) {
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    this.f42808a = false;
                }
            } else {
                this.f42808a = true;
            }
            premiumPreviewFragment.U.d.dispatchTouchEvent(motionEvent);
            return true;
        }
        float x11 = premiumPreviewFragment.U.e.getX() + premiumPreviewFragment.U.getX();
        float y10 = premiumPreviewFragment.U.e.getY() + premiumPreviewFragment.U.getY();
        rectF.set(x11, y10, premiumPreviewFragment.U.e.getWidth() + x11, premiumPreviewFragment.U.e.getHeight() + y10);
        if (premiumPreviewFragment.f33709q0 < 1.0f && ((rectF.contains(motionEvent.getX(), motionEvent.getY()) || this.f42809b) && !premiumPreviewFragment.f33689a.I1)) {
            motionEvent.offsetLocation(-x11, -y10);
            if (motionEvent.getAction() == 0) {
                this.f42809b = true;
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                this.f42809b = false;
            }
            premiumPreviewFragment.U.e.dispatchTouchEvent(motionEvent);
            if (this.f42809b) {
                return true;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        PremiumPreviewFragment premiumPreviewFragment = this.d;
        kg.h hVar = premiumPreviewFragment.U.d;
        hVar.f11919b.f11893u = hVar.getMeasuredWidth() / getMeasuredWidth();
        kg.h hVar2 = premiumPreviewFragment.U.d;
        hVar2.f11919b.v = hVar2.getMeasuredHeight() / getMeasuredHeight();
        du0 du0Var = premiumPreviewFragment.U;
        du0Var.d.f11919b.f11891s = (premiumPreviewFragment.U.d.getX() + du0Var.getX()) / getMeasuredWidth();
        du0 du0Var2 = premiumPreviewFragment.U;
        du0Var2.d.f11919b.f11892t = (premiumPreviewFragment.U.d.getY() + du0Var2.getY()) / getMeasuredHeight();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        boolean z10;
        int i12 = 0;
        if (View.MeasureSpec.getSize(i10) > View.MeasureSpec.getSize(i11)) {
            z10 = true;
        } else {
            z10 = false;
        }
        PremiumPreviewFragment premiumPreviewFragment = this.d;
        premiumPreviewFragment.W = z10;
        premiumPreviewFragment.X = org.telegram.messenger.i0.f16020m;
        premiumPreviewFragment.U.measure(i10, View.MeasureSpec.makeMeasureSpec(0, 0));
        premiumPreviewFragment.V.getLayoutParams().height = premiumPreviewFragment.U.getMeasuredHeight();
        FrameLayout frameLayout = premiumPreviewFragment.J;
        if (frameLayout != null && frameLayout.getVisibility() != 8) {
            i12 = org.telegram.messenger.i0.L(68.0f);
        }
        org.telegram.ui.Components.az azVar = premiumPreviewFragment.P;
        azVar.M = (premiumPreviewFragment.X + i12) - org.telegram.messenger.i0.L(16.0f);
        azVar.p1();
        premiumPreviewFragment.P.S = i12;
        super.onMeasure(i10, i11);
        if (((getMeasuredWidth() + getMeasuredHeight()) << 16) != 0) {
            premiumPreviewFragment.w0();
        }
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        PremiumPreviewFragment premiumPreviewFragment = this.d;
        ArrayList arrayList = premiumPreviewFragment.f33693c;
        ArrayList arrayList2 = premiumPreviewFragment.f33691b;
        int i14 = 0;
        for (int i15 = 0; i15 < arrayList2.size(); i15++) {
            premiumPreviewFragment.L.a((eu0) arrayList2.get(i15), false);
            premiumPreviewFragment.L.measure(View.MeasureSpec.makeMeasureSpec(i10, 1073741824), View.MeasureSpec.makeMeasureSpec(i11, Integer.MIN_VALUE));
            ((eu0) arrayList2.get(i15)).e = i14;
            i14 += premiumPreviewFragment.L.getMeasuredHeight();
        }
        for (int i16 = 0; i16 < arrayList.size(); i16++) {
            premiumPreviewFragment.L.a((eu0) arrayList.get(i16), false);
            premiumPreviewFragment.L.measure(View.MeasureSpec.makeMeasureSpec(i10, 1073741824), View.MeasureSpec.makeMeasureSpec(i11, Integer.MIN_VALUE));
            ((eu0) arrayList.get(i16)).e = i14;
            i14 += premiumPreviewFragment.L.getMeasuredHeight();
        }
        premiumPreviewFragment.N = i14;
    }
}
