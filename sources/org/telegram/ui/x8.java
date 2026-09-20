package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RecordingCanvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
public final class x8 extends org.telegram.ui.Components.aw0 {
    public final int f39366w0;
    public final Object f39367x0;

    public x8(Object obj, Context context, int i10) {
        super(context, null);
        this.f39366w0 = i10;
        this.f39367x0 = obj;
    }

    @Override
    public void J(Canvas canvas, float f7, Rect rect, Paint paint, boolean z10) {
        switch (this.f39366w0) {
            case 0:
                l9 l9Var = (l9) this.f39367x0;
                if (Build.VERSION.SDK_INT >= 29 && SharedConfig.chatBlurEnabled() && l9Var.Z != null) {
                    canvas.save();
                    canvas.translate(0.0f, -f7);
                    l9Var.Z.y(canvas, rect.left, rect.top + f7, rect.right, rect.bottom + f7);
                    canvas.restore();
                    int alpha = paint.getAlpha();
                    paint.setAlpha(178);
                    canvas.drawRect(rect, paint);
                    paint.setAlpha(alpha);
                    return;
                }
                canvas.drawRect(rect, paint);
                return;
            case 3:
                ContactsActivity contactsActivity = (ContactsActivity) this.f39367x0;
                if (Build.VERSION.SDK_INT >= 29 && SharedConfig.chatBlurEnabled() && contactsActivity.f31044u0 != null) {
                    canvas.save();
                    canvas.translate(0.0f, -f7);
                    contactsActivity.f31044u0.y(canvas, rect.left, rect.top + f7, rect.right, rect.bottom + f7);
                    canvas.restore();
                    int alpha2 = paint.getAlpha();
                    paint.setAlpha(178);
                    canvas.drawRect(rect, paint);
                    paint.setAlpha(alpha2);
                    return;
                }
                canvas.drawRect(rect, paint);
                return;
            case 7:
                i91 i91Var = (i91) this.f39367x0;
                if (Build.VERSION.SDK_INT >= 29 && SharedConfig.chatBlurEnabled() && i91Var.W != null) {
                    canvas.save();
                    canvas.translate(0.0f, -f7);
                    i91Var.W.y(canvas, rect.left, rect.top + f7, rect.right, rect.bottom + f7);
                    canvas.restore();
                    int alpha3 = paint.getAlpha();
                    paint.setAlpha(178);
                    canvas.drawRect(rect, paint);
                    paint.setAlpha(alpha3);
                    return;
                }
                canvas.drawRect(rect, paint);
                return;
            case 8:
                bb1 bb1Var = (bb1) this.f39367x0;
                if (Build.VERSION.SDK_INT >= 29 && SharedConfig.chatBlurEnabled() && bb1Var.D0 != null) {
                    canvas.save();
                    canvas.translate(0.0f, -f7);
                    bb1Var.D0.y(canvas, rect.left, rect.top + f7, rect.right, rect.bottom + f7);
                    canvas.restore();
                    int alpha4 = paint.getAlpha();
                    paint.setAlpha(178);
                    canvas.drawRect(rect, paint);
                    paint.setAlpha(alpha4);
                    return;
                }
                canvas.drawRect(rect, paint);
                return;
            default:
                super.J(canvas, f7, rect, paint, z10);
                return;
        }
    }

    @Override
    public boolean P() {
        switch (this.f39366w0) {
            case 2:
                return false;
            default:
                return super.P();
        }
    }

    @Override
    public boolean Q() {
        switch (this.f39366w0) {
            case 2:
                return false;
            default:
                return super.Q();
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f39366w0) {
            case 0:
                l9 l9Var = (l9) this.f39367x0;
                fh.d dVar = l9Var.f35359a0;
                fh.d dVar2 = l9Var.Z;
                ah.i iVar = l9Var.Y;
                if (Build.VERSION.SDK_INT >= 31 && iVar != null) {
                    l9Var.f0();
                    int measuredWidth = getMeasuredWidth();
                    int measuredHeight = getMeasuredHeight();
                    if (dVar2 != null && !dVar2.f9078n) {
                        RecordingCanvas a2 = dVar2.a(measuredWidth, measuredHeight);
                        a2.drawColor(l9Var.getThemedColor(org.telegram.ui.ActionBar.j6.f19038a7));
                        if (SharedConfig.chatBlurEnabled()) {
                            iVar.b(a2, -3);
                        }
                        dVar2.c();
                    }
                    if (dVar != null && !dVar.f9078n) {
                        RecordingCanvas a10 = dVar.a(measuredWidth, measuredHeight);
                        a10.drawColor(l9Var.getThemedColor(org.telegram.ui.ActionBar.j6.f19038a7));
                        if (SharedConfig.chatBlurEnabled()) {
                            iVar.b(a10, -2);
                        }
                        dVar.c();
                    }
                }
                super.dispatchDraw(canvas);
                return;
            case 3:
                ContactsActivity contactsActivity = (ContactsActivity) this.f39367x0;
                fh.d dVar3 = contactsActivity.f31045v0;
                fh.d dVar4 = contactsActivity.f31044u0;
                ah.i iVar2 = contactsActivity.f31043t0;
                if (Build.VERSION.SDK_INT >= 31 && iVar2 != null) {
                    contactsActivity.g0();
                    int measuredWidth2 = getMeasuredWidth();
                    int measuredHeight2 = getMeasuredHeight();
                    if (dVar4 != null && !dVar4.f9078n) {
                        RecordingCanvas a11 = dVar4.a(measuredWidth2, measuredHeight2);
                        a11.drawColor(contactsActivity.getThemedColor(org.telegram.ui.ActionBar.j6.f19094d6));
                        if (SharedConfig.chatBlurEnabled()) {
                            iVar2.b(a11, -3);
                        }
                        dVar4.c();
                    }
                    if (dVar3 != null && !dVar3.f9078n) {
                        RecordingCanvas a12 = dVar3.a(measuredWidth2, measuredHeight2);
                        a12.drawColor(contactsActivity.getThemedColor(org.telegram.ui.ActionBar.j6.f19094d6));
                        if (SharedConfig.chatBlurEnabled()) {
                            iVar2.b(a12, -2);
                        }
                        dVar3.c();
                    }
                }
                super.dispatchDraw(canvas);
                return;
            case 7:
                i91 i91Var = (i91) this.f39367x0;
                fh.d dVar5 = i91Var.X;
                fh.d dVar6 = i91Var.W;
                ah.i iVar3 = i91Var.V;
                if (Build.VERSION.SDK_INT >= 31 && iVar3 != null) {
                    i91Var.i0();
                    int measuredWidth3 = getMeasuredWidth();
                    int measuredHeight3 = getMeasuredHeight();
                    if (dVar6 != null && !dVar6.f9078n) {
                        RecordingCanvas a13 = dVar6.a(measuredWidth3, measuredHeight3);
                        a13.drawColor(i91Var.getThemedColor(org.telegram.ui.ActionBar.j6.f19094d6));
                        if (SharedConfig.chatBlurEnabled()) {
                            iVar3.b(a13, -3);
                        }
                        dVar6.c();
                    }
                    if (dVar5 != null && !dVar5.f9078n) {
                        RecordingCanvas a14 = dVar5.a(measuredWidth3, measuredHeight3);
                        a14.drawColor(i91Var.getThemedColor(org.telegram.ui.ActionBar.j6.f19094d6));
                        if (SharedConfig.chatBlurEnabled()) {
                            iVar3.b(a14, -2);
                        }
                        dVar5.c();
                    }
                }
                super.dispatchDraw(canvas);
                if (!i91Var.M) {
                    AndroidUtilities.drawNavigationBarProtection(canvas, this, i91Var.getThemedColor(org.telegram.ui.ActionBar.j6.f19094d6), i91Var.S);
                    return;
                }
                return;
            case 8:
                bb1 bb1Var = (bb1) this.f39367x0;
                fh.d dVar7 = bb1Var.E0;
                fh.d dVar8 = bb1Var.D0;
                ah.i iVar4 = bb1Var.C0;
                if (Build.VERSION.SDK_INT >= 31 && iVar4 != null) {
                    bb1.W(bb1Var);
                    int measuredWidth4 = getMeasuredWidth();
                    int measuredHeight4 = getMeasuredHeight();
                    if (dVar8 != null && !dVar8.f9078n) {
                        RecordingCanvas a15 = dVar8.a(measuredWidth4, measuredHeight4);
                        a15.drawColor(bb1Var.getThemedColor(org.telegram.ui.ActionBar.j6.f19094d6));
                        if (SharedConfig.chatBlurEnabled()) {
                            iVar4.b(a15, -3);
                        }
                        dVar8.c();
                    }
                    if (dVar7 != null && !dVar7.f9078n) {
                        RecordingCanvas a16 = dVar7.a(measuredWidth4, measuredHeight4);
                        a16.drawColor(bb1Var.getThemedColor(org.telegram.ui.ActionBar.j6.f19094d6));
                        if (SharedConfig.chatBlurEnabled()) {
                            iVar4.b(a16, -2);
                        }
                        dVar7.c();
                    }
                }
                super.dispatchDraw(canvas);
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f39366w0) {
            case 1:
                if (motionEvent.getY() < ((org.telegram.ui.Components.xb0) this.f39367x0).T) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public void e() {
        switch (this.f39366w0) {
            case 7:
                ((i91) this.f39367x0).p0();
                return;
            default:
                return;
        }
    }

    @Override
    public Drawable getNewDrawable() {
        switch (this.f39366w0) {
            case 1:
                Drawable d = ((xn) ((org.telegram.ui.Components.xb0) this.f39367x0).f30229c0.F).d();
                if (d == null) {
                    return super.getNewDrawable();
                }
                return d;
            default:
                return super.getNewDrawable();
        }
    }

    @Override
    public org.telegram.ui.ActionBar.f6 getResourceProvider() {
        switch (this.f39366w0) {
            case 2:
                return ((org.telegram.ui.Components.m01) this.f39367x0).f26284c;
            default:
                return super.getResourceProvider();
        }
    }

    @Override
    public void onLayout(boolean r11, int r12, int r13, int r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.x8.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public void onMeasure(int i10, int i11) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        switch (this.f39366w0) {
            case 0:
                l9 l9Var = (l9) this.f39367x0;
                measureChildWithMargins(l9.b0(l9Var), i10, 0, i11, 0);
                ((ViewGroup.MarginLayoutParams) l9Var.M.getLayoutParams()).topMargin = l9.c0(l9Var).getMeasuredHeight() - AndroidUtilities.dp(14.0f);
                ((ViewGroup.MarginLayoutParams) l9Var.f35360b.getLayoutParams()).topMargin = l9.d0(l9Var).getMeasuredHeight();
                ((ViewGroup.MarginLayoutParams) l9Var.f35369r.getLayoutParams()).topMargin = l9.a0(l9Var).getMeasuredHeight();
                l9Var.i0();
                super.onMeasure(i10, i11);
                return;
            case 1:
            case 7:
            case 8:
            default:
                super.onMeasure(i10, i11);
                return;
            case 2:
                super.onMeasure(i10, i11);
                setMeasuredDimension(View.MeasureSpec.getSize(i10), ((org.telegram.ui.Components.m01) this.f39367x0).d.getMeasuredHeight() + AndroidUtilities.dp(24.0f));
                return;
            case 3:
                ContactsActivity contactsActivity = (ContactsActivity) this.f39367x0;
                kVar = ((org.telegram.ui.ActionBar.n2) contactsActivity).actionBar;
                measureChildWithMargins(kVar, i10, 0, i11, 0);
                kVar2 = ((org.telegram.ui.ActionBar.n2) contactsActivity).actionBar;
                ((ViewGroup.MarginLayoutParams) contactsActivity.e.getLayoutParams()).topMargin = AndroidUtilities.dp(48.0f) + kVar2.getMeasuredHeight();
                kVar3 = ((org.telegram.ui.ActionBar.n2) contactsActivity).actionBar;
                ((ViewGroup.MarginLayoutParams) contactsActivity.Y.getLayoutParams()).topMargin = kVar3.getMeasuredHeight();
                contactsActivity.j0();
                super.onMeasure(i10, i11);
                return;
            case 4:
                zb0 zb0Var = (zb0) this.f39367x0;
                super.onMeasure(i10, i11);
                R();
                int i17 = this.f22789f;
                if (i17 != 0 && i17 < AndroidUtilities.dp(20.0f)) {
                    zb0Var.F.clearFocus();
                    zb0Var.K.clearFocus();
                }
                FrameLayout frameLayout = zb0Var.H;
                if (this.f22789f > AndroidUtilities.dp(20.0f)) {
                    i12 = 8;
                } else {
                    i12 = 0;
                }
                frameLayout.setVisibility(i12);
                return;
            case 5:
                yg0 yg0Var = (yg0) this.f39367x0;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) yg0Var.N.getLayoutParams();
                int i18 = 0;
                if (yg0Var.h1()) {
                    i13 = AndroidUtilities.dp(226.0f);
                } else {
                    i13 = 0;
                }
                if (yg0Var.h1() && R() > AndroidUtilities.dp(20.0f)) {
                    i13 -= R();
                }
                org.telegram.ui.Components.pc pcVar = org.telegram.ui.Components.pc.f27245w;
                if (pcVar != null && pcVar.f27254l) {
                    super.onMeasure(i10, i11);
                    marginLayoutParams.bottomMargin = org.telegram.messenger.rk.D(10.0f, org.telegram.ui.Components.pc.f27245w.e.getMeasuredHeight() + AndroidUtilities.dp(14.0f), i13);
                } else {
                    marginLayoutParams.bottomMargin = AndroidUtilities.dp(14.0f) + i13;
                }
                if (!AndroidUtilities.isTablet()) {
                    i18 = AndroidUtilities.statusBarHeight;
                }
                ((ViewGroup.MarginLayoutParams) yg0Var.U.getLayoutParams()).topMargin = AndroidUtilities.dp(16.0f) + i18;
                ((ViewGroup.MarginLayoutParams) yg0Var.W.getLayoutParams()).topMargin = AndroidUtilities.dp(16.0f) + i18;
                ((ViewGroup.MarginLayoutParams) yg0Var.V.getLayoutParams()).topMargin = AndroidUtilities.dp(16.0f) + i18;
                TextView textView = yg0Var.f39918f0;
                if (textView != null) {
                    ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).topMargin = AndroidUtilities.dp(16.0f) + i18;
                }
                if (R() > AndroidUtilities.dp(20.0f) && yg0Var.f39913c.getVisibility() != 8 && !AndroidUtilities.isAccessibilityTouchExplorationEnabled() && !yg0Var.f39910a0) {
                    ValueAnimator valueAnimator = yg0Var.d;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    yg0Var.f39913c.setVisibility(8);
                }
                super.onMeasure(i10, i11);
                return;
            case 6:
                PopupNotificationActivity popupNotificationActivity = (PopupNotificationActivity) this.f39367x0;
                View.MeasureSpec.getMode(i10);
                View.MeasureSpec.getMode(i11);
                int size = View.MeasureSpec.getSize(i10);
                int size2 = View.MeasureSpec.getSize(i11);
                setMeasuredDimension(size, size2);
                if (R() <= AndroidUtilities.dp(20.0f)) {
                    size2 -= popupNotificationActivity.f31430b.getEmojiPadding();
                }
                int i19 = size2;
                int childCount = getChildCount();
                for (int i20 = 0; i20 < childCount; i20++) {
                    View childAt = getChildAt(i20);
                    if (childAt.getVisibility() != 8) {
                        if (popupNotificationActivity.f31430b.u0(childAt)) {
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, 1073741824));
                        } else if (childAt == popupNotificationActivity.f31430b.M1) {
                            measureChildWithMargins(childAt, i10, 0, i11, 0);
                        } else {
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(Math.max(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(2.0f) + i19), 1073741824));
                        }
                    }
                }
                return;
            case 9:
                xh.i4 i4Var = (xh.i4) this.f39367x0;
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) i4Var.f46210y.getLayoutParams();
                int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                int i21 = 0;
                if (xh.i4.Z(i4Var).getOccupyStatusBar()) {
                    i14 = AndroidUtilities.statusBarHeight;
                } else {
                    i14 = 0;
                }
                layoutParams.topMargin = currentActionBarHeight + i14;
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) i4Var.h.getLayoutParams();
                int currentActionBarHeight2 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                if (xh.i4.a0(i4Var).getOccupyStatusBar()) {
                    i15 = AndroidUtilities.statusBarHeight;
                } else {
                    i15 = 0;
                }
                layoutParams2.topMargin = AndroidUtilities.dp(47.0f) + currentActionBarHeight2 + i15;
                FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) i4Var.f46205n.getLayoutParams();
                int currentActionBarHeight3 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                if (xh.i4.b0(i4Var).getOccupyStatusBar()) {
                    i16 = AndroidUtilities.statusBarHeight;
                } else {
                    i16 = 0;
                }
                layoutParams3.topMargin = currentActionBarHeight3 + i16;
                FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) i4Var.f46208w.getLayoutParams();
                int currentActionBarHeight4 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                if (xh.i4.c0(i4Var).getOccupyStatusBar()) {
                    i21 = AndroidUtilities.statusBarHeight;
                }
                layoutParams4.topMargin = currentActionBarHeight4 + i21;
                super.onMeasure(i10, i11);
                return;
        }
    }
}
