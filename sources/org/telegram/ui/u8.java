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
public final class u8 extends org.telegram.ui.Components.uw0 {
    public final int f42375w0;
    public final Object f42376x0;

    public u8(Object obj, Context context, int i10) {
        super(context, null);
        this.f42375w0 = i10;
        this.f42376x0 = obj;
    }

    @Override
    public void J(Canvas canvas, float f7, Rect rect, Paint paint, boolean z10) {
        switch (this.f42375w0) {
            case 0:
                i9 i9Var = (i9) this.f42376x0;
                if (Build.VERSION.SDK_INT >= 29 && SharedConfig.chatBlurEnabled() && i9Var.Z != null) {
                    canvas.save();
                    canvas.translate(0.0f, -f7);
                    i9Var.Z.v(canvas, rect.left, rect.top + f7, rect.right, rect.bottom + f7);
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
                ContactsActivity contactsActivity = (ContactsActivity) this.f42376x0;
                if (Build.VERSION.SDK_INT >= 29 && SharedConfig.chatBlurEnabled() && contactsActivity.f33746u0 != null) {
                    canvas.save();
                    canvas.translate(0.0f, -f7);
                    contactsActivity.f33746u0.v(canvas, rect.left, rect.top + f7, rect.right, rect.bottom + f7);
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
                h91 h91Var = (h91) this.f42376x0;
                if (Build.VERSION.SDK_INT >= 29 && SharedConfig.chatBlurEnabled() && h91Var.W != null) {
                    canvas.save();
                    canvas.translate(0.0f, -f7);
                    h91Var.W.v(canvas, rect.left, rect.top + f7, rect.right, rect.bottom + f7);
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
                ab1 ab1Var = (ab1) this.f42376x0;
                if (Build.VERSION.SDK_INT >= 29 && SharedConfig.chatBlurEnabled() && ab1Var.D0 != null) {
                    canvas.save();
                    canvas.translate(0.0f, -f7);
                    ab1Var.D0.v(canvas, rect.left, rect.top + f7, rect.right, rect.bottom + f7);
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
        switch (this.f42375w0) {
            case 2:
                return false;
            default:
                return super.P();
        }
    }

    @Override
    public boolean Q() {
        switch (this.f42375w0) {
            case 2:
                return false;
            default:
                return super.Q();
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f42375w0) {
            case 0:
                i9 i9Var = (i9) this.f42376x0;
                fh.d dVar = i9Var.f38613a0;
                fh.d dVar2 = i9Var.Z;
                ah.h hVar = i9Var.Y;
                if (Build.VERSION.SDK_INT >= 31 && hVar != null) {
                    i9Var.f0();
                    int measuredWidth = getMeasuredWidth();
                    int measuredHeight = getMeasuredHeight();
                    if (dVar2 != null && !dVar2.f9938n) {
                        RecordingCanvas a2 = dVar2.a(measuredWidth, measuredHeight);
                        a2.drawColor(i9Var.getThemedColor(org.telegram.ui.ActionBar.h6.f20730a7));
                        if (SharedConfig.chatBlurEnabled()) {
                            hVar.b(a2, -3);
                        }
                        dVar2.b();
                    }
                    if (dVar != null && !dVar.f9938n) {
                        RecordingCanvas a10 = dVar.a(measuredWidth, measuredHeight);
                        a10.drawColor(i9Var.getThemedColor(org.telegram.ui.ActionBar.h6.f20730a7));
                        if (SharedConfig.chatBlurEnabled()) {
                            hVar.b(a10, -2);
                        }
                        dVar.b();
                    }
                }
                super.dispatchDraw(canvas);
                return;
            case 3:
                ContactsActivity contactsActivity = (ContactsActivity) this.f42376x0;
                fh.d dVar3 = contactsActivity.f33747v0;
                fh.d dVar4 = contactsActivity.f33746u0;
                ah.h hVar2 = contactsActivity.f33745t0;
                if (Build.VERSION.SDK_INT >= 31 && hVar2 != null) {
                    contactsActivity.g0();
                    int measuredWidth2 = getMeasuredWidth();
                    int measuredHeight2 = getMeasuredHeight();
                    if (dVar4 != null && !dVar4.f9938n) {
                        RecordingCanvas a11 = dVar4.a(measuredWidth2, measuredHeight2);
                        a11.drawColor(contactsActivity.getThemedColor(org.telegram.ui.ActionBar.h6.f20786d6));
                        if (SharedConfig.chatBlurEnabled()) {
                            hVar2.b(a11, -3);
                        }
                        dVar4.b();
                    }
                    if (dVar3 != null && !dVar3.f9938n) {
                        RecordingCanvas a12 = dVar3.a(measuredWidth2, measuredHeight2);
                        a12.drawColor(contactsActivity.getThemedColor(org.telegram.ui.ActionBar.h6.f20786d6));
                        if (SharedConfig.chatBlurEnabled()) {
                            hVar2.b(a12, -2);
                        }
                        dVar3.b();
                    }
                }
                super.dispatchDraw(canvas);
                return;
            case 7:
                h91 h91Var = (h91) this.f42376x0;
                fh.d dVar5 = h91Var.X;
                fh.d dVar6 = h91Var.W;
                ah.h hVar3 = h91Var.V;
                if (Build.VERSION.SDK_INT >= 31 && hVar3 != null) {
                    h91Var.i0();
                    int measuredWidth3 = getMeasuredWidth();
                    int measuredHeight3 = getMeasuredHeight();
                    if (dVar6 != null && !dVar6.f9938n) {
                        RecordingCanvas a13 = dVar6.a(measuredWidth3, measuredHeight3);
                        a13.drawColor(h91Var.getThemedColor(org.telegram.ui.ActionBar.h6.f20786d6));
                        if (SharedConfig.chatBlurEnabled()) {
                            hVar3.b(a13, -3);
                        }
                        dVar6.b();
                    }
                    if (dVar5 != null && !dVar5.f9938n) {
                        RecordingCanvas a14 = dVar5.a(measuredWidth3, measuredHeight3);
                        a14.drawColor(h91Var.getThemedColor(org.telegram.ui.ActionBar.h6.f20786d6));
                        if (SharedConfig.chatBlurEnabled()) {
                            hVar3.b(a14, -2);
                        }
                        dVar5.b();
                    }
                }
                super.dispatchDraw(canvas);
                if (!h91Var.M) {
                    AndroidUtilities.drawNavigationBarProtection(canvas, this, h91Var.getThemedColor(org.telegram.ui.ActionBar.h6.f20786d6), h91Var.S);
                    return;
                }
                return;
            case 8:
                ab1 ab1Var = (ab1) this.f42376x0;
                fh.d dVar7 = ab1Var.E0;
                fh.d dVar8 = ab1Var.D0;
                ah.h hVar4 = ab1Var.C0;
                if (Build.VERSION.SDK_INT >= 31 && hVar4 != null) {
                    ab1.W(ab1Var);
                    int measuredWidth4 = getMeasuredWidth();
                    int measuredHeight4 = getMeasuredHeight();
                    if (dVar8 != null && !dVar8.f9938n) {
                        RecordingCanvas a15 = dVar8.a(measuredWidth4, measuredHeight4);
                        a15.drawColor(ab1Var.getThemedColor(org.telegram.ui.ActionBar.h6.f20786d6));
                        if (SharedConfig.chatBlurEnabled()) {
                            hVar4.b(a15, -3);
                        }
                        dVar8.b();
                    }
                    if (dVar7 != null && !dVar7.f9938n) {
                        RecordingCanvas a16 = dVar7.a(measuredWidth4, measuredHeight4);
                        a16.drawColor(ab1Var.getThemedColor(org.telegram.ui.ActionBar.h6.f20786d6));
                        if (SharedConfig.chatBlurEnabled()) {
                            hVar4.b(a16, -2);
                        }
                        dVar7.b();
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
        switch (this.f42375w0) {
            case 1:
                if (motionEvent.getY() < ((org.telegram.ui.Components.qc0) this.f42376x0).T) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public void e() {
        switch (this.f42375w0) {
            case 7:
                ((h91) this.f42376x0).p0();
                return;
            default:
                return;
        }
    }

    @Override
    public Drawable getNewDrawable() {
        switch (this.f42375w0) {
            case 1:
                Drawable d = ((xn) ((org.telegram.ui.Components.qc0) this.f42376x0).f30132c0.F).d();
                if (d == null) {
                    return super.getNewDrawable();
                }
                return d;
            default:
                return super.getNewDrawable();
        }
    }

    @Override
    public org.telegram.ui.ActionBar.d6 getResourceProvider() {
        switch (this.f42375w0) {
            case 2:
                return ((org.telegram.ui.Components.f11) this.f42376x0).f26190c;
            default:
                return super.getResourceProvider();
        }
    }

    @Override
    public void onLayout(boolean r11, int r12, int r13, int r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.u8.onLayout(boolean, int, int, int, int):void");
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
        switch (this.f42375w0) {
            case 0:
                i9 i9Var = (i9) this.f42376x0;
                measureChildWithMargins(i9.b0(i9Var), i10, 0, i11, 0);
                ((ViewGroup.MarginLayoutParams) i9Var.M.getLayoutParams()).topMargin = i9.c0(i9Var).getMeasuredHeight() - AndroidUtilities.dp(14.0f);
                ((ViewGroup.MarginLayoutParams) i9Var.f38614b.getLayoutParams()).topMargin = i9.d0(i9Var).getMeasuredHeight();
                ((ViewGroup.MarginLayoutParams) i9Var.f38624r.getLayoutParams()).topMargin = i9.a0(i9Var).getMeasuredHeight();
                i9Var.i0();
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
                setMeasuredDimension(View.MeasureSpec.getSize(i10), ((org.telegram.ui.Components.f11) this.f42376x0).d.getMeasuredHeight() + AndroidUtilities.dp(24.0f));
                return;
            case 3:
                ContactsActivity contactsActivity = (ContactsActivity) this.f42376x0;
                kVar = ((org.telegram.ui.ActionBar.m2) contactsActivity).actionBar;
                measureChildWithMargins(kVar, i10, 0, i11, 0);
                kVar2 = ((org.telegram.ui.ActionBar.m2) contactsActivity).actionBar;
                ((ViewGroup.MarginLayoutParams) contactsActivity.f33726e.getLayoutParams()).topMargin = AndroidUtilities.dp(48.0f) + kVar2.getMeasuredHeight();
                kVar3 = ((org.telegram.ui.ActionBar.m2) contactsActivity).actionBar;
                ((ViewGroup.MarginLayoutParams) contactsActivity.Y.getLayoutParams()).topMargin = kVar3.getMeasuredHeight();
                contactsActivity.j0();
                super.onMeasure(i10, i11);
                return;
            case 4:
                ub0 ub0Var = (ub0) this.f42376x0;
                super.onMeasure(i10, i11);
                R();
                int i17 = this.f31586f;
                if (i17 != 0 && i17 < AndroidUtilities.dp(20.0f)) {
                    ub0Var.F.clearFocus();
                    ub0Var.K.clearFocus();
                }
                FrameLayout frameLayout = ub0Var.H;
                if (this.f31586f > AndroidUtilities.dp(20.0f)) {
                    i12 = 8;
                } else {
                    i12 = 0;
                }
                frameLayout.setVisibility(i12);
                return;
            case 5:
                vg0 vg0Var = (vg0) this.f42376x0;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) vg0Var.N.getLayoutParams();
                int i18 = 0;
                if (vg0Var.h1()) {
                    i13 = AndroidUtilities.dp(226.0f);
                } else {
                    i13 = 0;
                }
                if (vg0Var.h1() && R() > AndroidUtilities.dp(20.0f)) {
                    i13 -= R();
                }
                org.telegram.ui.Components.sc scVar = org.telegram.ui.Components.sc.f30703w;
                if (scVar != null && scVar.f30713l) {
                    super.onMeasure(i10, i11);
                    marginLayoutParams.bottomMargin = org.telegram.messenger.ai.D(10.0f, org.telegram.ui.Components.sc.f30703w.f30707e.getMeasuredHeight() + AndroidUtilities.dp(14.0f), i13);
                } else {
                    marginLayoutParams.bottomMargin = AndroidUtilities.dp(14.0f) + i13;
                }
                if (!AndroidUtilities.isTablet()) {
                    i18 = AndroidUtilities.statusBarHeight;
                }
                ((ViewGroup.MarginLayoutParams) vg0Var.U.getLayoutParams()).topMargin = AndroidUtilities.dp(16.0f) + i18;
                ((ViewGroup.MarginLayoutParams) vg0Var.W.getLayoutParams()).topMargin = AndroidUtilities.dp(16.0f) + i18;
                ((ViewGroup.MarginLayoutParams) vg0Var.V.getLayoutParams()).topMargin = AndroidUtilities.dp(16.0f) + i18;
                TextView textView = vg0Var.f43021f0;
                if (textView != null) {
                    ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).topMargin = AndroidUtilities.dp(16.0f) + i18;
                }
                if (R() > AndroidUtilities.dp(20.0f) && vg0Var.f43015c.getVisibility() != 8 && !AndroidUtilities.isAccessibilityTouchExplorationEnabled() && !vg0Var.f43012a0) {
                    ValueAnimator valueAnimator = vg0Var.d;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    vg0Var.f43015c.setVisibility(8);
                }
                super.onMeasure(i10, i11);
                return;
            case 6:
                PopupNotificationActivity popupNotificationActivity = (PopupNotificationActivity) this.f42376x0;
                View.MeasureSpec.getMode(i10);
                View.MeasureSpec.getMode(i11);
                int size = View.MeasureSpec.getSize(i10);
                int size2 = View.MeasureSpec.getSize(i11);
                setMeasuredDimension(size, size2);
                if (R() <= AndroidUtilities.dp(20.0f)) {
                    size2 -= popupNotificationActivity.f34143b.getEmojiPadding();
                }
                int i19 = size2;
                int childCount = getChildCount();
                for (int i20 = 0; i20 < childCount; i20++) {
                    View childAt = getChildAt(i20);
                    if (childAt.getVisibility() != 8) {
                        if (popupNotificationActivity.f34143b.s0(childAt)) {
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, 1073741824));
                        } else if (childAt == popupNotificationActivity.f34143b.N1) {
                            measureChildWithMargins(childAt, i10, 0, i11, 0);
                        } else {
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(Math.max(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(2.0f) + i19), 1073741824));
                        }
                    }
                }
                return;
            case 9:
                xh.i4 i4Var = (xh.i4) this.f42376x0;
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) i4Var.f51379y.getLayoutParams();
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
                FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) i4Var.f51374n.getLayoutParams();
                int currentActionBarHeight3 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                if (xh.i4.b0(i4Var).getOccupyStatusBar()) {
                    i16 = AndroidUtilities.statusBarHeight;
                } else {
                    i16 = 0;
                }
                layoutParams3.topMargin = currentActionBarHeight3 + i16;
                FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) i4Var.f51377w.getLayoutParams();
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
