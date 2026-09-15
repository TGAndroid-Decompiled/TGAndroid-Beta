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
public final class w8 extends org.telegram.ui.Components.pv0 {
    public final int f38794w0;
    public final Object f38795x0;

    public w8(Object obj, Context context, int i10) {
        super(context, null);
        this.f38794w0 = i10;
        this.f38795x0 = obj;
    }

    @Override
    public void J(Canvas canvas, float f7, Rect rect, Paint paint, boolean z10) {
        switch (this.f38794w0) {
            case 0:
                k9 k9Var = (k9) this.f38795x0;
                if (Build.VERSION.SDK_INT >= 29 && SharedConfig.chatBlurEnabled() && k9Var.Z != null) {
                    canvas.save();
                    canvas.translate(0.0f, -f7);
                    k9Var.Z.y(canvas, rect.left, rect.top + f7, rect.right, rect.bottom + f7);
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
                ContactsActivity contactsActivity = (ContactsActivity) this.f38795x0;
                if (Build.VERSION.SDK_INT >= 29 && SharedConfig.chatBlurEnabled() && contactsActivity.f30760u0 != null) {
                    canvas.save();
                    canvas.translate(0.0f, -f7);
                    contactsActivity.f30760u0.y(canvas, rect.left, rect.top + f7, rect.right, rect.bottom + f7);
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
                e91 e91Var = (e91) this.f38795x0;
                if (Build.VERSION.SDK_INT >= 29 && SharedConfig.chatBlurEnabled() && e91Var.W != null) {
                    canvas.save();
                    canvas.translate(0.0f, -f7);
                    e91Var.W.y(canvas, rect.left, rect.top + f7, rect.right, rect.bottom + f7);
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
                ya1 ya1Var = (ya1) this.f38795x0;
                if (Build.VERSION.SDK_INT >= 29 && SharedConfig.chatBlurEnabled() && ya1Var.D0 != null) {
                    canvas.save();
                    canvas.translate(0.0f, -f7);
                    ya1Var.D0.y(canvas, rect.left, rect.top + f7, rect.right, rect.bottom + f7);
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
        switch (this.f38794w0) {
            case 2:
                return false;
            default:
                return super.P();
        }
    }

    @Override
    public boolean Q() {
        switch (this.f38794w0) {
            case 2:
                return false;
            default:
                return super.Q();
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f38794w0) {
            case 0:
                k9 k9Var = (k9) this.f38795x0;
                fh.d dVar = k9Var.f35060a0;
                fh.d dVar2 = k9Var.Z;
                ah.h hVar = k9Var.Y;
                if (Build.VERSION.SDK_INT >= 31 && hVar != null) {
                    k9Var.f0();
                    int measuredWidth = getMeasuredWidth();
                    int measuredHeight = getMeasuredHeight();
                    if (dVar2 != null && !dVar2.f9073n) {
                        RecordingCanvas a2 = dVar2.a(measuredWidth, measuredHeight);
                        a2.drawColor(k9Var.getThemedColor(org.telegram.ui.ActionBar.i6.f18780a7));
                        if (SharedConfig.chatBlurEnabled()) {
                            hVar.b(a2, -3);
                        }
                        dVar2.b();
                    }
                    if (dVar != null && !dVar.f9073n) {
                        RecordingCanvas a10 = dVar.a(measuredWidth, measuredHeight);
                        a10.drawColor(k9Var.getThemedColor(org.telegram.ui.ActionBar.i6.f18780a7));
                        if (SharedConfig.chatBlurEnabled()) {
                            hVar.b(a10, -2);
                        }
                        dVar.b();
                    }
                }
                super.dispatchDraw(canvas);
                return;
            case 3:
                ContactsActivity contactsActivity = (ContactsActivity) this.f38795x0;
                fh.d dVar3 = contactsActivity.f30761v0;
                fh.d dVar4 = contactsActivity.f30760u0;
                ah.h hVar2 = contactsActivity.f30759t0;
                if (Build.VERSION.SDK_INT >= 31 && hVar2 != null) {
                    contactsActivity.g0();
                    int measuredWidth2 = getMeasuredWidth();
                    int measuredHeight2 = getMeasuredHeight();
                    if (dVar4 != null && !dVar4.f9073n) {
                        RecordingCanvas a11 = dVar4.a(measuredWidth2, measuredHeight2);
                        a11.drawColor(contactsActivity.getThemedColor(org.telegram.ui.ActionBar.i6.f18836d6));
                        if (SharedConfig.chatBlurEnabled()) {
                            hVar2.b(a11, -3);
                        }
                        dVar4.b();
                    }
                    if (dVar3 != null && !dVar3.f9073n) {
                        RecordingCanvas a12 = dVar3.a(measuredWidth2, measuredHeight2);
                        a12.drawColor(contactsActivity.getThemedColor(org.telegram.ui.ActionBar.i6.f18836d6));
                        if (SharedConfig.chatBlurEnabled()) {
                            hVar2.b(a12, -2);
                        }
                        dVar3.b();
                    }
                }
                super.dispatchDraw(canvas);
                return;
            case 7:
                e91 e91Var = (e91) this.f38795x0;
                fh.d dVar5 = e91Var.X;
                fh.d dVar6 = e91Var.W;
                ah.h hVar3 = e91Var.V;
                if (Build.VERSION.SDK_INT >= 31 && hVar3 != null) {
                    e91Var.i0();
                    int measuredWidth3 = getMeasuredWidth();
                    int measuredHeight3 = getMeasuredHeight();
                    if (dVar6 != null && !dVar6.f9073n) {
                        RecordingCanvas a13 = dVar6.a(measuredWidth3, measuredHeight3);
                        a13.drawColor(e91Var.getThemedColor(org.telegram.ui.ActionBar.i6.f18836d6));
                        if (SharedConfig.chatBlurEnabled()) {
                            hVar3.b(a13, -3);
                        }
                        dVar6.b();
                    }
                    if (dVar5 != null && !dVar5.f9073n) {
                        RecordingCanvas a14 = dVar5.a(measuredWidth3, measuredHeight3);
                        a14.drawColor(e91Var.getThemedColor(org.telegram.ui.ActionBar.i6.f18836d6));
                        if (SharedConfig.chatBlurEnabled()) {
                            hVar3.b(a14, -2);
                        }
                        dVar5.b();
                    }
                }
                super.dispatchDraw(canvas);
                if (!e91Var.M) {
                    AndroidUtilities.drawNavigationBarProtection(canvas, this, e91Var.getThemedColor(org.telegram.ui.ActionBar.i6.f18836d6), e91Var.S);
                    return;
                }
                return;
            case 8:
                ya1 ya1Var = (ya1) this.f38795x0;
                fh.d dVar7 = ya1Var.E0;
                fh.d dVar8 = ya1Var.D0;
                ah.h hVar4 = ya1Var.C0;
                if (Build.VERSION.SDK_INT >= 31 && hVar4 != null) {
                    ya1.W(ya1Var);
                    int measuredWidth4 = getMeasuredWidth();
                    int measuredHeight4 = getMeasuredHeight();
                    if (dVar8 != null && !dVar8.f9073n) {
                        RecordingCanvas a15 = dVar8.a(measuredWidth4, measuredHeight4);
                        a15.drawColor(ya1Var.getThemedColor(org.telegram.ui.ActionBar.i6.f18836d6));
                        if (SharedConfig.chatBlurEnabled()) {
                            hVar4.b(a15, -3);
                        }
                        dVar8.b();
                    }
                    if (dVar7 != null && !dVar7.f9073n) {
                        RecordingCanvas a16 = dVar7.a(measuredWidth4, measuredHeight4);
                        a16.drawColor(ya1Var.getThemedColor(org.telegram.ui.ActionBar.i6.f18836d6));
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
        switch (this.f38794w0) {
            case 1:
                if (motionEvent.getY() < ((org.telegram.ui.Components.pb0) this.f38795x0).T) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public void e() {
        switch (this.f38794w0) {
            case 7:
                ((e91) this.f38795x0).p0();
                return;
            default:
                return;
        }
    }

    @Override
    public Drawable getNewDrawable() {
        switch (this.f38794w0) {
            case 1:
                Drawable d = ((zn) ((org.telegram.ui.Components.pb0) this.f38795x0).f27001c0.F).d();
                if (d == null) {
                    return super.getNewDrawable();
                }
                return d;
            default:
                return super.getNewDrawable();
        }
    }

    @Override
    public org.telegram.ui.ActionBar.e6 getResourceProvider() {
        switch (this.f38794w0) {
            case 2:
                return ((org.telegram.ui.Components.b01) this.f38795x0).f22551c;
            default:
                return super.getResourceProvider();
        }
    }

    @Override
    public void onLayout(boolean r11, int r12, int r13, int r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.w8.onLayout(boolean, int, int, int, int):void");
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
        switch (this.f38794w0) {
            case 0:
                k9 k9Var = (k9) this.f38795x0;
                measureChildWithMargins(k9.b0(k9Var), i10, 0, i11, 0);
                ((ViewGroup.MarginLayoutParams) k9Var.M.getLayoutParams()).topMargin = k9.c0(k9Var).getMeasuredHeight() - AndroidUtilities.dp(14.0f);
                ((ViewGroup.MarginLayoutParams) k9Var.f35061b.getLayoutParams()).topMargin = k9.d0(k9Var).getMeasuredHeight();
                ((ViewGroup.MarginLayoutParams) k9Var.f35070r.getLayoutParams()).topMargin = k9.a0(k9Var).getMeasuredHeight();
                k9Var.i0();
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
                setMeasuredDimension(View.MeasureSpec.getSize(i10), ((org.telegram.ui.Components.b01) this.f38795x0).d.getMeasuredHeight() + AndroidUtilities.dp(24.0f));
                return;
            case 3:
                ContactsActivity contactsActivity = (ContactsActivity) this.f38795x0;
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
                xb0 xb0Var = (xb0) this.f38795x0;
                super.onMeasure(i10, i11);
                R();
                int i17 = this.f27166f;
                if (i17 != 0 && i17 < AndroidUtilities.dp(20.0f)) {
                    xb0Var.F.clearFocus();
                    xb0Var.K.clearFocus();
                }
                FrameLayout frameLayout = xb0Var.H;
                if (this.f27166f > AndroidUtilities.dp(20.0f)) {
                    i12 = 8;
                } else {
                    i12 = 0;
                }
                frameLayout.setVisibility(i12);
                return;
            case 5:
                wg0 wg0Var = (wg0) this.f38795x0;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) wg0Var.N.getLayoutParams();
                int i18 = 0;
                if (wg0Var.h1()) {
                    i13 = AndroidUtilities.dp(226.0f);
                } else {
                    i13 = 0;
                }
                if (wg0Var.h1() && R() > AndroidUtilities.dp(20.0f)) {
                    i13 -= R();
                }
                org.telegram.ui.Components.oc ocVar = org.telegram.ui.Components.oc.f26747w;
                if (ocVar != null && ocVar.f26756l) {
                    super.onMeasure(i10, i11);
                    marginLayoutParams.bottomMargin = org.telegram.messenger.wl.D(10.0f, org.telegram.ui.Components.oc.f26747w.e.getMeasuredHeight() + AndroidUtilities.dp(14.0f), i13);
                } else {
                    marginLayoutParams.bottomMargin = AndroidUtilities.dp(14.0f) + i13;
                }
                if (!AndroidUtilities.isTablet()) {
                    i18 = AndroidUtilities.statusBarHeight;
                }
                ((ViewGroup.MarginLayoutParams) wg0Var.U.getLayoutParams()).topMargin = AndroidUtilities.dp(16.0f) + i18;
                ((ViewGroup.MarginLayoutParams) wg0Var.W.getLayoutParams()).topMargin = AndroidUtilities.dp(16.0f) + i18;
                ((ViewGroup.MarginLayoutParams) wg0Var.V.getLayoutParams()).topMargin = AndroidUtilities.dp(16.0f) + i18;
                TextView textView = wg0Var.f39202f0;
                if (textView != null) {
                    ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).topMargin = AndroidUtilities.dp(16.0f) + i18;
                }
                if (R() > AndroidUtilities.dp(20.0f) && wg0Var.f39197c.getVisibility() != 8 && !AndroidUtilities.isAccessibilityTouchExplorationEnabled() && !wg0Var.f39194a0) {
                    ValueAnimator valueAnimator = wg0Var.d;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    wg0Var.f39197c.setVisibility(8);
                }
                super.onMeasure(i10, i11);
                return;
            case 6:
                PopupNotificationActivity popupNotificationActivity = (PopupNotificationActivity) this.f38795x0;
                View.MeasureSpec.getMode(i10);
                View.MeasureSpec.getMode(i11);
                int size = View.MeasureSpec.getSize(i10);
                int size2 = View.MeasureSpec.getSize(i11);
                setMeasuredDimension(size, size2);
                if (R() <= AndroidUtilities.dp(20.0f)) {
                    size2 -= popupNotificationActivity.f31145b.getEmojiPadding();
                }
                int i19 = size2;
                int childCount = getChildCount();
                for (int i20 = 0; i20 < childCount; i20++) {
                    View childAt = getChildAt(i20);
                    if (childAt.getVisibility() != 8) {
                        if (popupNotificationActivity.f31145b.u0(childAt)) {
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, 1073741824));
                        } else if (childAt == popupNotificationActivity.f31145b.M1) {
                            measureChildWithMargins(childAt, i10, 0, i11, 0);
                        } else {
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(Math.max(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(2.0f) + i19), 1073741824));
                        }
                    }
                }
                return;
            case 9:
                xh.h4 h4Var = (xh.h4) this.f38795x0;
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) h4Var.f45903y.getLayoutParams();
                int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                int i21 = 0;
                if (xh.h4.Z(h4Var).getOccupyStatusBar()) {
                    i14 = AndroidUtilities.statusBarHeight;
                } else {
                    i14 = 0;
                }
                layoutParams.topMargin = currentActionBarHeight + i14;
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) h4Var.h.getLayoutParams();
                int currentActionBarHeight2 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                if (xh.h4.a0(h4Var).getOccupyStatusBar()) {
                    i15 = AndroidUtilities.statusBarHeight;
                } else {
                    i15 = 0;
                }
                layoutParams2.topMargin = AndroidUtilities.dp(47.0f) + currentActionBarHeight2 + i15;
                FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) h4Var.f45898n.getLayoutParams();
                int currentActionBarHeight3 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                if (xh.h4.b0(h4Var).getOccupyStatusBar()) {
                    i16 = AndroidUtilities.statusBarHeight;
                } else {
                    i16 = 0;
                }
                layoutParams3.topMargin = currentActionBarHeight3 + i16;
                FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) h4Var.f45901w.getLayoutParams();
                int currentActionBarHeight4 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                if (xh.h4.c0(h4Var).getOccupyStatusBar()) {
                    i21 = AndroidUtilities.statusBarHeight;
                }
                layoutParams4.topMargin = currentActionBarHeight4 + i21;
                super.onMeasure(i10, i11);
                return;
        }
    }
}
