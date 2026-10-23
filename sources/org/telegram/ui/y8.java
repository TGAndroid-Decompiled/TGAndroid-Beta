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
import org.telegram.messenger.FileLog;
import org.telegram.messenger.SharedConfig;
public final class y8 extends org.telegram.ui.Components.ow0 {
    public final int f43742w0;
    public final Object f43743x0;

    public y8(Object obj, Context context, int i10) {
        super(context, null);
        this.f43742w0 = i10;
        this.f43743x0 = obj;
    }

    @Override
    public void I(Canvas canvas, float f7, Rect rect, Paint paint, boolean z10) {
        switch (this.f43742w0) {
            case 0:
                m9 m9Var = (m9) this.f43743x0;
                if (Build.VERSION.SDK_INT >= 29 && SharedConfig.chatBlurEnabled() && m9Var.Z != null) {
                    canvas.save();
                    canvas.translate(0.0f, -f7);
                    m9Var.Z.y(canvas, rect.left, rect.top + f7, rect.right, rect.bottom + f7);
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
                ContactsActivity contactsActivity = (ContactsActivity) this.f43743x0;
                if (Build.VERSION.SDK_INT >= 29 && SharedConfig.chatBlurEnabled() && contactsActivity.f33403u0 != null) {
                    canvas.save();
                    canvas.translate(0.0f, -f7);
                    contactsActivity.f33403u0.y(canvas, rect.left, rect.top + f7, rect.right, rect.bottom + f7);
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
                c81 c81Var = (c81) this.f43743x0;
                if (Build.VERSION.SDK_INT >= 29 && SharedConfig.chatBlurEnabled() && c81Var.Y != null) {
                    canvas.save();
                    canvas.translate(0.0f, -f7);
                    c81Var.Y.y(canvas, rect.left, rect.top + f7, rect.right, rect.bottom + f7);
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
                u91 u91Var = (u91) this.f43743x0;
                if (Build.VERSION.SDK_INT >= 29 && SharedConfig.chatBlurEnabled() && u91Var.F0 != null) {
                    canvas.save();
                    canvas.translate(0.0f, -f7);
                    u91Var.F0.y(canvas, rect.left, rect.top + f7, rect.right, rect.bottom + f7);
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
                super.I(canvas, f7, rect, paint, z10);
                return;
        }
    }

    @Override
    public boolean O() {
        switch (this.f43742w0) {
            case 2:
                return false;
            default:
                return super.O();
        }
    }

    @Override
    public boolean P() {
        switch (this.f43742w0) {
            case 2:
                return false;
            default:
                return super.P();
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f43742w0) {
            case 0:
                m9 m9Var = (m9) this.f43743x0;
                gh.d dVar = m9Var.f39409a0;
                gh.d dVar2 = m9Var.Z;
                bh.f fVar = m9Var.Y;
                if (Build.VERSION.SDK_INT >= 31 && fVar != null) {
                    m9Var.e0();
                    int measuredWidth = getMeasuredWidth();
                    int measuredHeight = getMeasuredHeight();
                    if (dVar2 != null && !dVar2.f11079n) {
                        RecordingCanvas a2 = dVar2.a(measuredWidth, measuredHeight);
                        a2.drawColor(m9Var.getThemedColor(org.telegram.ui.ActionBar.k6.f21125a7));
                        if (SharedConfig.chatBlurEnabled()) {
                            fVar.b(a2, -3);
                        }
                        dVar2.c();
                    }
                    if (dVar != null && !dVar.f11079n) {
                        RecordingCanvas a10 = dVar.a(measuredWidth, measuredHeight);
                        a10.drawColor(m9Var.getThemedColor(org.telegram.ui.ActionBar.k6.f21125a7));
                        if (SharedConfig.chatBlurEnabled()) {
                            fVar.b(a10, -2);
                        }
                        dVar.c();
                    }
                }
                super.dispatchDraw(canvas);
                return;
            case 3:
                ContactsActivity contactsActivity = (ContactsActivity) this.f43743x0;
                gh.d dVar3 = contactsActivity.f33404v0;
                gh.d dVar4 = contactsActivity.f33403u0;
                bh.f fVar2 = contactsActivity.f33402t0;
                if (Build.VERSION.SDK_INT >= 31 && fVar2 != null) {
                    contactsActivity.f0();
                    int measuredWidth2 = getMeasuredWidth();
                    int measuredHeight2 = getMeasuredHeight();
                    if (dVar4 != null && !dVar4.f11079n) {
                        RecordingCanvas a11 = dVar4.a(measuredWidth2, measuredHeight2);
                        a11.drawColor(contactsActivity.getThemedColor(org.telegram.ui.ActionBar.k6.f21183d6));
                        if (SharedConfig.chatBlurEnabled()) {
                            fVar2.b(a11, -3);
                        }
                        dVar4.c();
                    }
                    if (dVar3 != null && !dVar3.f11079n) {
                        RecordingCanvas a12 = dVar3.a(measuredWidth2, measuredHeight2);
                        a12.drawColor(contactsActivity.getThemedColor(org.telegram.ui.ActionBar.k6.f21183d6));
                        if (SharedConfig.chatBlurEnabled()) {
                            fVar2.b(a12, -2);
                        }
                        dVar3.c();
                    }
                }
                super.dispatchDraw(canvas);
                return;
            case 7:
                c81 c81Var = (c81) this.f43743x0;
                gh.d dVar5 = c81Var.Z;
                gh.d dVar6 = c81Var.Y;
                bh.f fVar3 = c81Var.X;
                if (Build.VERSION.SDK_INT >= 31 && fVar3 != null) {
                    c81Var.k0();
                    int measuredWidth3 = getMeasuredWidth();
                    int measuredHeight3 = getMeasuredHeight();
                    if (dVar6 != null && !dVar6.f11079n) {
                        RecordingCanvas a13 = dVar6.a(measuredWidth3, measuredHeight3);
                        a13.drawColor(c81Var.getThemedColor(org.telegram.ui.ActionBar.k6.f21183d6));
                        if (SharedConfig.chatBlurEnabled()) {
                            fVar3.b(a13, -3);
                        }
                        dVar6.c();
                    }
                    if (dVar5 != null && !dVar5.f11079n) {
                        RecordingCanvas a14 = dVar5.a(measuredWidth3, measuredHeight3);
                        a14.drawColor(c81Var.getThemedColor(org.telegram.ui.ActionBar.k6.f21183d6));
                        if (SharedConfig.chatBlurEnabled()) {
                            fVar3.b(a14, -2);
                        }
                        dVar5.c();
                    }
                }
                super.dispatchDraw(canvas);
                if (!c81Var.M) {
                    AndroidUtilities.drawNavigationBarProtection(canvas, this, c81Var.getThemedColor(org.telegram.ui.ActionBar.k6.f21183d6), c81Var.T);
                    return;
                }
                return;
            case 8:
                u91 u91Var = (u91) this.f43743x0;
                gh.d dVar7 = u91Var.G0;
                gh.d dVar8 = u91Var.F0;
                bh.f fVar4 = u91Var.E0;
                if (Build.VERSION.SDK_INT >= 31 && fVar4 != null) {
                    u91.W(u91Var);
                    int measuredWidth4 = getMeasuredWidth();
                    int measuredHeight4 = getMeasuredHeight();
                    if (dVar8 != null && !dVar8.f11079n) {
                        RecordingCanvas a15 = dVar8.a(measuredWidth4, measuredHeight4);
                        a15.drawColor(u91Var.getThemedColor(org.telegram.ui.ActionBar.k6.f21183d6));
                        if (SharedConfig.chatBlurEnabled()) {
                            fVar4.b(a15, -3);
                        }
                        dVar8.c();
                    }
                    if (dVar7 != null && !dVar7.f11079n) {
                        RecordingCanvas a16 = dVar7.a(measuredWidth4, measuredHeight4);
                        a16.drawColor(u91Var.getThemedColor(org.telegram.ui.ActionBar.k6.f21183d6));
                        if (SharedConfig.chatBlurEnabled()) {
                            fVar4.b(a16, -2);
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
        switch (this.f43742w0) {
            case 1:
                if (motionEvent.getY() < ((org.telegram.ui.Components.lc0) this.f43743x0).T) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public Drawable getNewDrawable() {
        switch (this.f43742w0) {
            case 1:
                Drawable l4 = ((qn) ((org.telegram.ui.Components.lc0) this.f43743x0).f28340c0.F).l();
                if (l4 == null) {
                    return super.getNewDrawable();
                }
                return l4;
            default:
                return super.getNewDrawable();
        }
    }

    @Override
    public org.telegram.ui.ActionBar.g6 getResourceProvider() {
        switch (this.f43742w0) {
            case 2:
                return ((org.telegram.ui.Components.a11) this.f43743x0).f24596c;
            default:
                return super.getResourceProvider();
        }
    }

    @Override
    public void onLayout(boolean r11, int r12, int r13, int r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.y8.onLayout(boolean, int, int, int, int):void");
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
        switch (this.f43742w0) {
            case 0:
                m9 m9Var = (m9) this.f43743x0;
                measureChildWithMargins(m9.a0(m9Var), i10, 0, i11, 0);
                ((ViewGroup.MarginLayoutParams) m9Var.M.getLayoutParams()).topMargin = m9.b0(m9Var).getMeasuredHeight() - AndroidUtilities.dp(14.0f);
                ((ViewGroup.MarginLayoutParams) m9Var.f39410b.getLayoutParams()).topMargin = m9.c0(m9Var).getMeasuredHeight();
                ((ViewGroup.MarginLayoutParams) m9Var.f39420r.getLayoutParams()).topMargin = m9.Z(m9Var).getMeasuredHeight();
                m9Var.h0();
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
                setMeasuredDimension(View.MeasureSpec.getSize(i10), ((org.telegram.ui.Components.a11) this.f43743x0).d.getMeasuredHeight() + AndroidUtilities.dp(24.0f));
                return;
            case 3:
                ContactsActivity contactsActivity = (ContactsActivity) this.f43743x0;
                kVar = ((org.telegram.ui.ActionBar.o2) contactsActivity).actionBar;
                measureChildWithMargins(kVar, i10, 0, i11, 0);
                kVar2 = ((org.telegram.ui.ActionBar.o2) contactsActivity).actionBar;
                ((ViewGroup.MarginLayoutParams) contactsActivity.e.getLayoutParams()).topMargin = AndroidUtilities.dp(48.0f) + kVar2.getMeasuredHeight();
                kVar3 = ((org.telegram.ui.ActionBar.o2) contactsActivity).actionBar;
                ((ViewGroup.MarginLayoutParams) contactsActivity.Y.getLayoutParams()).topMargin = kVar3.getMeasuredHeight();
                contactsActivity.j0();
                super.onMeasure(i10, i11);
                return;
            case 4:
                gb0 gb0Var = (gb0) this.f43743x0;
                super.onMeasure(i10, i11);
                Q();
                int i17 = this.f29335f;
                if (i17 != 0 && i17 < AndroidUtilities.dp(20.0f)) {
                    gb0Var.F.clearFocus();
                    gb0Var.K.clearFocus();
                }
                FrameLayout frameLayout = gb0Var.H;
                if (this.f29335f > AndroidUtilities.dp(20.0f)) {
                    i12 = 8;
                } else {
                    i12 = 0;
                }
                frameLayout.setVisibility(i12);
                return;
            case 5:
                ig0 ig0Var = (ig0) this.f43743x0;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) ig0Var.N.getLayoutParams();
                int i18 = 0;
                if (ig0Var.l1()) {
                    i13 = AndroidUtilities.dp(226.0f);
                } else {
                    i13 = 0;
                }
                if (ig0Var.l1() && Q() > AndroidUtilities.dp(20.0f)) {
                    i13 -= Q();
                }
                org.telegram.ui.Components.qc qcVar = org.telegram.ui.Components.qc.f29825w;
                if (qcVar != null && qcVar.f29834l) {
                    super.onMeasure(i10, i11);
                    marginLayoutParams.bottomMargin = org.telegram.messenger.sl.D(10.0f, org.telegram.ui.Components.qc.f29825w.e.getMeasuredHeight() + AndroidUtilities.dp(14.0f), i13);
                } else {
                    marginLayoutParams.bottomMargin = AndroidUtilities.dp(14.0f) + i13;
                }
                if (!AndroidUtilities.isTablet()) {
                    i18 = AndroidUtilities.statusBarHeight;
                }
                ((ViewGroup.MarginLayoutParams) ig0Var.U.getLayoutParams()).topMargin = AndroidUtilities.dp(16.0f) + i18;
                ((ViewGroup.MarginLayoutParams) ig0Var.W.getLayoutParams()).topMargin = AndroidUtilities.dp(16.0f) + i18;
                ((ViewGroup.MarginLayoutParams) ig0Var.V.getLayoutParams()).topMargin = AndroidUtilities.dp(16.0f) + i18;
                TextView textView = ig0Var.f38201f0;
                if (textView != null) {
                    ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).topMargin = AndroidUtilities.dp(16.0f) + i18;
                }
                if (Q() > AndroidUtilities.dp(20.0f) && ig0Var.f38196c.getVisibility() != 8 && !AndroidUtilities.isAccessibilityTouchExplorationEnabled() && !ig0Var.f38193a0) {
                    ValueAnimator valueAnimator = ig0Var.d;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    ig0Var.f38196c.setVisibility(8);
                }
                super.onMeasure(i10, i11);
                return;
            case 6:
                PopupNotificationActivity popupNotificationActivity = (PopupNotificationActivity) this.f43743x0;
                View.MeasureSpec.getMode(i10);
                View.MeasureSpec.getMode(i11);
                int size = View.MeasureSpec.getSize(i10);
                int size2 = View.MeasureSpec.getSize(i11);
                setMeasuredDimension(size, size2);
                if (Q() <= AndroidUtilities.dp(20.0f)) {
                    size2 -= popupNotificationActivity.f33790b.getEmojiPadding();
                }
                int i19 = size2;
                int childCount = getChildCount();
                for (int i20 = 0; i20 < childCount; i20++) {
                    View childAt = getChildAt(i20);
                    if (childAt.getVisibility() != 8) {
                        if (popupNotificationActivity.f33790b.r0(childAt)) {
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, 1073741824));
                        } else if (childAt == popupNotificationActivity.f33790b.N1) {
                            measureChildWithMargins(childAt, i10, 0, i11, 0);
                        } else {
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(Math.max(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(2.0f) + i19), 1073741824));
                        }
                    }
                }
                return;
            case 9:
                yh.g4 g4Var = (yh.g4) this.f43743x0;
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) g4Var.f50743y.getLayoutParams();
                int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                int i21 = 0;
                if (yh.g4.Z(g4Var).getOccupyStatusBar()) {
                    i14 = AndroidUtilities.statusBarHeight;
                } else {
                    i14 = 0;
                }
                layoutParams.topMargin = currentActionBarHeight + i14;
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) g4Var.h.getLayoutParams();
                int currentActionBarHeight2 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                if (yh.g4.a0(g4Var).getOccupyStatusBar()) {
                    i15 = AndroidUtilities.statusBarHeight;
                } else {
                    i15 = 0;
                }
                layoutParams2.topMargin = AndroidUtilities.dp(47.0f) + currentActionBarHeight2 + i15;
                FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) g4Var.f50738n.getLayoutParams();
                int currentActionBarHeight3 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                if (yh.g4.b0(g4Var).getOccupyStatusBar()) {
                    i16 = AndroidUtilities.statusBarHeight;
                } else {
                    i16 = 0;
                }
                layoutParams3.topMargin = currentActionBarHeight3 + i16;
                FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) g4Var.f50741w.getLayoutParams();
                int currentActionBarHeight4 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                if (yh.g4.c0(g4Var).getOccupyStatusBar()) {
                    i21 = AndroidUtilities.statusBarHeight;
                }
                layoutParams4.topMargin = currentActionBarHeight4 + i21;
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public void updateColors() {
        switch (this.f43742w0) {
            case 7:
                try {
                    ((c81) this.f43743x0).r0();
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            default:
                return;
        }
    }
}
