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
public final class w8 extends org.telegram.ui.Components.aw0 {
    public final int f37744w0;
    public final Object f37745x0;

    public w8(Object obj, Context context, int i10) {
        super(context, null);
        this.f37744w0 = i10;
        this.f37745x0 = obj;
    }

    @Override
    public void J(Canvas canvas, float f7, Rect rect, Paint paint, boolean z10) {
        switch (this.f37744w0) {
            case 0:
                k9 k9Var = (k9) this.f37745x0;
                if (Build.VERSION.SDK_INT >= 29 && SharedConfig.chatBlurEnabled() && k9Var.Z != null) {
                    canvas.save();
                    canvas.translate(0.0f, -f7);
                    k9Var.Z.u(canvas, rect.left, rect.top + f7, rect.right, rect.bottom + f7);
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
                ContactsActivity contactsActivity = (ContactsActivity) this.f37745x0;
                if (Build.VERSION.SDK_INT >= 29 && SharedConfig.chatBlurEnabled() && contactsActivity.f29873u0 != null) {
                    canvas.save();
                    canvas.translate(0.0f, -f7);
                    contactsActivity.f29873u0.u(canvas, rect.left, rect.top + f7, rect.right, rect.bottom + f7);
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
                k91 k91Var = (k91) this.f37745x0;
                if (Build.VERSION.SDK_INT >= 29 && SharedConfig.chatBlurEnabled() && k91Var.W != null) {
                    canvas.save();
                    canvas.translate(0.0f, -f7);
                    k91Var.W.u(canvas, rect.left, rect.top + f7, rect.right, rect.bottom + f7);
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
                fb1 fb1Var = (fb1) this.f37745x0;
                if (Build.VERSION.SDK_INT >= 29 && SharedConfig.chatBlurEnabled() && fb1Var.D0 != null) {
                    canvas.save();
                    canvas.translate(0.0f, -f7);
                    fb1Var.D0.u(canvas, rect.left, rect.top + f7, rect.right, rect.bottom + f7);
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
        switch (this.f37744w0) {
            case 2:
                return false;
            default:
                return super.P();
        }
    }

    @Override
    public boolean Q() {
        switch (this.f37744w0) {
            case 2:
                return false;
            default:
                return super.Q();
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f37744w0) {
            case 0:
                k9 k9Var = (k9) this.f37745x0;
                eh.d dVar = k9Var.f34272a0;
                eh.d dVar2 = k9Var.Z;
                zg.e eVar = k9Var.Y;
                if (Build.VERSION.SDK_INT >= 31 && eVar != null) {
                    k9Var.f0();
                    int measuredWidth = getMeasuredWidth();
                    int measuredHeight = getMeasuredHeight();
                    if (dVar2 != null && !dVar2.f7522n) {
                        RecordingCanvas a2 = dVar2.a(measuredWidth, measuredHeight);
                        a2.drawColor(k9Var.getThemedColor(org.telegram.ui.ActionBar.j6.f17872a7));
                        if (SharedConfig.chatBlurEnabled()) {
                            eVar.b(a2, -3);
                        }
                        dVar2.c();
                    }
                    if (dVar != null && !dVar.f7522n) {
                        RecordingCanvas a10 = dVar.a(measuredWidth, measuredHeight);
                        a10.drawColor(k9Var.getThemedColor(org.telegram.ui.ActionBar.j6.f17872a7));
                        if (SharedConfig.chatBlurEnabled()) {
                            eVar.b(a10, -2);
                        }
                        dVar.c();
                    }
                }
                super.dispatchDraw(canvas);
                return;
            case 3:
                ContactsActivity contactsActivity = (ContactsActivity) this.f37745x0;
                eh.d dVar3 = contactsActivity.f29874v0;
                eh.d dVar4 = contactsActivity.f29873u0;
                zg.e eVar2 = contactsActivity.f29872t0;
                if (Build.VERSION.SDK_INT >= 31 && eVar2 != null) {
                    contactsActivity.g0();
                    int measuredWidth2 = getMeasuredWidth();
                    int measuredHeight2 = getMeasuredHeight();
                    if (dVar4 != null && !dVar4.f7522n) {
                        RecordingCanvas a11 = dVar4.a(measuredWidth2, measuredHeight2);
                        a11.drawColor(contactsActivity.getThemedColor(org.telegram.ui.ActionBar.j6.f17928d6));
                        if (SharedConfig.chatBlurEnabled()) {
                            eVar2.b(a11, -3);
                        }
                        dVar4.c();
                    }
                    if (dVar3 != null && !dVar3.f7522n) {
                        RecordingCanvas a12 = dVar3.a(measuredWidth2, measuredHeight2);
                        a12.drawColor(contactsActivity.getThemedColor(org.telegram.ui.ActionBar.j6.f17928d6));
                        if (SharedConfig.chatBlurEnabled()) {
                            eVar2.b(a12, -2);
                        }
                        dVar3.c();
                    }
                }
                super.dispatchDraw(canvas);
                return;
            case 7:
                k91 k91Var = (k91) this.f37745x0;
                eh.d dVar5 = k91Var.X;
                eh.d dVar6 = k91Var.W;
                zg.e eVar3 = k91Var.V;
                if (Build.VERSION.SDK_INT >= 31 && eVar3 != null) {
                    k91Var.i0();
                    int measuredWidth3 = getMeasuredWidth();
                    int measuredHeight3 = getMeasuredHeight();
                    if (dVar6 != null && !dVar6.f7522n) {
                        RecordingCanvas a13 = dVar6.a(measuredWidth3, measuredHeight3);
                        a13.drawColor(k91Var.getThemedColor(org.telegram.ui.ActionBar.j6.f17928d6));
                        if (SharedConfig.chatBlurEnabled()) {
                            eVar3.b(a13, -3);
                        }
                        dVar6.c();
                    }
                    if (dVar5 != null && !dVar5.f7522n) {
                        RecordingCanvas a14 = dVar5.a(measuredWidth3, measuredHeight3);
                        a14.drawColor(k91Var.getThemedColor(org.telegram.ui.ActionBar.j6.f17928d6));
                        if (SharedConfig.chatBlurEnabled()) {
                            eVar3.b(a14, -2);
                        }
                        dVar5.c();
                    }
                }
                super.dispatchDraw(canvas);
                if (!k91Var.M) {
                    AndroidUtilities.drawNavigationBarProtection(canvas, this, k91Var.getThemedColor(org.telegram.ui.ActionBar.j6.f17928d6), k91Var.S);
                    return;
                }
                return;
            case 8:
                fb1 fb1Var = (fb1) this.f37745x0;
                eh.d dVar7 = fb1Var.E0;
                eh.d dVar8 = fb1Var.D0;
                zg.e eVar4 = fb1Var.C0;
                if (Build.VERSION.SDK_INT >= 31 && eVar4 != null) {
                    fb1.W(fb1Var);
                    int measuredWidth4 = getMeasuredWidth();
                    int measuredHeight4 = getMeasuredHeight();
                    if (dVar8 != null && !dVar8.f7522n) {
                        RecordingCanvas a15 = dVar8.a(measuredWidth4, measuredHeight4);
                        a15.drawColor(fb1Var.getThemedColor(org.telegram.ui.ActionBar.j6.f17928d6));
                        if (SharedConfig.chatBlurEnabled()) {
                            eVar4.b(a15, -3);
                        }
                        dVar8.c();
                    }
                    if (dVar7 != null && !dVar7.f7522n) {
                        RecordingCanvas a16 = dVar7.a(measuredWidth4, measuredHeight4);
                        a16.drawColor(fb1Var.getThemedColor(org.telegram.ui.ActionBar.j6.f17928d6));
                        if (SharedConfig.chatBlurEnabled()) {
                            eVar4.b(a16, -2);
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
        switch (this.f37744w0) {
            case 1:
                if (motionEvent.getY() < ((org.telegram.ui.Components.yb0) this.f37745x0).T) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public void e() {
        switch (this.f37744w0) {
            case 7:
                ((k91) this.f37745x0).p0();
                return;
            default:
                return;
        }
    }

    @Override
    public Drawable getNewDrawable() {
        switch (this.f37744w0) {
            case 1:
                Drawable d = ((bo) ((org.telegram.ui.Components.yb0) this.f37745x0).f29295c0.F).d();
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
        switch (this.f37744w0) {
            case 2:
                return ((org.telegram.ui.Components.n01) this.f37745x0).f25356c;
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
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        org.telegram.ui.ActionBar.l lVar3;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        switch (this.f37744w0) {
            case 0:
                k9 k9Var = (k9) this.f37745x0;
                measureChildWithMargins(k9.b0(k9Var), i10, 0, i11, 0);
                ((ViewGroup.MarginLayoutParams) k9Var.M.getLayoutParams()).topMargin = k9.c0(k9Var).getMeasuredHeight() - AndroidUtilities.dp(14.0f);
                ((ViewGroup.MarginLayoutParams) k9Var.f34273b.getLayoutParams()).topMargin = k9.d0(k9Var).getMeasuredHeight();
                ((ViewGroup.MarginLayoutParams) k9Var.f34282r.getLayoutParams()).topMargin = k9.a0(k9Var).getMeasuredHeight();
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
                setMeasuredDimension(View.MeasureSpec.getSize(i10), ((org.telegram.ui.Components.n01) this.f37745x0).d.getMeasuredHeight() + AndroidUtilities.dp(24.0f));
                return;
            case 3:
                ContactsActivity contactsActivity = (ContactsActivity) this.f37745x0;
                lVar = ((org.telegram.ui.ActionBar.p2) contactsActivity).actionBar;
                measureChildWithMargins(lVar, i10, 0, i11, 0);
                lVar2 = ((org.telegram.ui.ActionBar.p2) contactsActivity).actionBar;
                ((ViewGroup.MarginLayoutParams) contactsActivity.e.getLayoutParams()).topMargin = AndroidUtilities.dp(48.0f) + lVar2.getMeasuredHeight();
                lVar3 = ((org.telegram.ui.ActionBar.p2) contactsActivity).actionBar;
                ((ViewGroup.MarginLayoutParams) contactsActivity.Y.getLayoutParams()).topMargin = lVar3.getMeasuredHeight();
                contactsActivity.j0();
                super.onMeasure(i10, i11);
                return;
            case 4:
                xb0 xb0Var = (xb0) this.f37745x0;
                super.onMeasure(i10, i11);
                R();
                int i17 = this.f21630f;
                if (i17 != 0 && i17 < AndroidUtilities.dp(20.0f)) {
                    xb0Var.F.clearFocus();
                    xb0Var.K.clearFocus();
                }
                FrameLayout frameLayout = xb0Var.H;
                if (this.f21630f > AndroidUtilities.dp(20.0f)) {
                    i12 = 8;
                } else {
                    i12 = 0;
                }
                frameLayout.setVisibility(i12);
                return;
            case 5:
                xg0 xg0Var = (xg0) this.f37745x0;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) xg0Var.N.getLayoutParams();
                int i18 = 0;
                if (xg0Var.h1()) {
                    i13 = AndroidUtilities.dp(226.0f);
                } else {
                    i13 = 0;
                }
                if (xg0Var.h1() && R() > AndroidUtilities.dp(20.0f)) {
                    i13 -= R();
                }
                org.telegram.ui.Components.pc pcVar = org.telegram.ui.Components.pc.f26074w;
                if (pcVar != null && pcVar.f26083l) {
                    super.onMeasure(i10, i11);
                    marginLayoutParams.bottomMargin = org.telegram.messenger.em.D(10.0f, org.telegram.ui.Components.pc.f26074w.e.getMeasuredHeight() + AndroidUtilities.dp(14.0f), i13);
                } else {
                    marginLayoutParams.bottomMargin = AndroidUtilities.dp(14.0f) + i13;
                }
                if (!AndroidUtilities.isTablet()) {
                    i18 = AndroidUtilities.statusBarHeight;
                }
                ((ViewGroup.MarginLayoutParams) xg0Var.U.getLayoutParams()).topMargin = AndroidUtilities.dp(16.0f) + i18;
                ((ViewGroup.MarginLayoutParams) xg0Var.W.getLayoutParams()).topMargin = AndroidUtilities.dp(16.0f) + i18;
                ((ViewGroup.MarginLayoutParams) xg0Var.V.getLayoutParams()).topMargin = AndroidUtilities.dp(16.0f) + i18;
                TextView textView = xg0Var.f38726f0;
                if (textView != null) {
                    ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).topMargin = AndroidUtilities.dp(16.0f) + i18;
                }
                if (R() > AndroidUtilities.dp(20.0f) && xg0Var.f38721c.getVisibility() != 8 && !AndroidUtilities.isAccessibilityTouchExplorationEnabled() && !xg0Var.f38718a0) {
                    ValueAnimator valueAnimator = xg0Var.d;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    xg0Var.f38721c.setVisibility(8);
                }
                super.onMeasure(i10, i11);
                return;
            case 6:
                PopupNotificationActivity popupNotificationActivity = (PopupNotificationActivity) this.f37745x0;
                View.MeasureSpec.getMode(i10);
                View.MeasureSpec.getMode(i11);
                int size = View.MeasureSpec.getSize(i10);
                int size2 = View.MeasureSpec.getSize(i11);
                setMeasuredDimension(size, size2);
                if (R() <= AndroidUtilities.dp(20.0f)) {
                    size2 -= popupNotificationActivity.f30258b.getEmojiPadding();
                }
                int i19 = size2;
                int childCount = getChildCount();
                for (int i20 = 0; i20 < childCount; i20++) {
                    View childAt = getChildAt(i20);
                    if (childAt.getVisibility() != 8) {
                        if (popupNotificationActivity.f30258b.u0(childAt)) {
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, 1073741824));
                        } else if (childAt == popupNotificationActivity.f30258b.M1) {
                            measureChildWithMargins(childAt, i10, 0, i11, 0);
                        } else {
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(Math.max(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(2.0f) + i19), 1073741824));
                        }
                    }
                }
                return;
            case 9:
                wh.h4 h4Var = (wh.h4) this.f37745x0;
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) h4Var.f44145y.getLayoutParams();
                int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
                int i21 = 0;
                if (wh.h4.Z(h4Var).getOccupyStatusBar()) {
                    i14 = AndroidUtilities.statusBarHeight;
                } else {
                    i14 = 0;
                }
                layoutParams.topMargin = currentActionBarHeight + i14;
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) h4Var.h.getLayoutParams();
                int currentActionBarHeight2 = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
                if (wh.h4.a0(h4Var).getOccupyStatusBar()) {
                    i15 = AndroidUtilities.statusBarHeight;
                } else {
                    i15 = 0;
                }
                layoutParams2.topMargin = AndroidUtilities.dp(47.0f) + currentActionBarHeight2 + i15;
                FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) h4Var.f44140n.getLayoutParams();
                int currentActionBarHeight3 = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
                if (wh.h4.b0(h4Var).getOccupyStatusBar()) {
                    i16 = AndroidUtilities.statusBarHeight;
                } else {
                    i16 = 0;
                }
                layoutParams3.topMargin = currentActionBarHeight3 + i16;
                FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) h4Var.f44143w.getLayoutParams();
                int currentActionBarHeight4 = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
                if (wh.h4.c0(h4Var).getOccupyStatusBar()) {
                    i21 = AndroidUtilities.statusBarHeight;
                }
                layoutParams4.topMargin = currentActionBarHeight4 + i21;
                super.onMeasure(i10, i11);
                return;
        }
    }
}
