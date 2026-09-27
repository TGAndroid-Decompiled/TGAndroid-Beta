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
public final class z8 extends org.telegram.ui.Components.cw0 {
    public final int f40425w0;
    public final Object f40426x0;

    public z8(Object obj, Context context, int i10) {
        super(context, null);
        this.f40425w0 = i10;
        this.f40426x0 = obj;
    }

    @Override
    public void J(Canvas canvas, float f7, Rect rect, Paint paint, boolean z10) {
        switch (this.f40425w0) {
            case 0:
                n9 n9Var = (n9) this.f40426x0;
                if (Build.VERSION.SDK_INT >= 29 && SharedConfig.chatBlurEnabled() && n9Var.Y != null) {
                    canvas.save();
                    canvas.translate(0.0f, -f7);
                    n9Var.Y.y(canvas, rect.left, rect.top + f7, rect.right, rect.bottom + f7);
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
                ContactsActivity contactsActivity = (ContactsActivity) this.f40426x0;
                if (Build.VERSION.SDK_INT >= 29 && SharedConfig.chatBlurEnabled() && contactsActivity.f31048u0 != null) {
                    canvas.save();
                    canvas.translate(0.0f, -f7);
                    contactsActivity.f31048u0.y(canvas, rect.left, rect.top + f7, rect.right, rect.bottom + f7);
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
                a91 a91Var = (a91) this.f40426x0;
                if (Build.VERSION.SDK_INT >= 29 && SharedConfig.chatBlurEnabled() && a91Var.W != null) {
                    canvas.save();
                    canvas.translate(0.0f, -f7);
                    a91Var.W.y(canvas, rect.left, rect.top + f7, rect.right, rect.bottom + f7);
                    canvas.restore();
                    int alpha3 = paint.getAlpha();
                    paint.setAlpha(178);
                    canvas.drawRect(rect, paint);
                    paint.setAlpha(alpha3);
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
        switch (this.f40425w0) {
            case 2:
                return false;
            default:
                return super.P();
        }
    }

    @Override
    public boolean Q() {
        switch (this.f40425w0) {
            case 2:
                return false;
            default:
                return super.Q();
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f40425w0) {
            case 0:
                n9.d0((n9) this.f40426x0).f();
                super.dispatchDraw(canvas);
                return;
            case 3:
                ContactsActivity contactsActivity = (ContactsActivity) this.f40426x0;
                fh.d dVar = contactsActivity.f31049v0;
                fh.d dVar2 = contactsActivity.f31048u0;
                ah.i iVar = contactsActivity.f31047t0;
                if (Build.VERSION.SDK_INT >= 31 && iVar != null) {
                    contactsActivity.g0();
                    int measuredWidth = getMeasuredWidth();
                    int measuredHeight = getMeasuredHeight();
                    if (dVar2 != null && !dVar2.f9065s) {
                        RecordingCanvas a2 = dVar2.a(measuredWidth, measuredHeight);
                        a2.drawColor(contactsActivity.getThemedColor(org.telegram.ui.ActionBar.i6.f19057d6));
                        if (SharedConfig.chatBlurEnabled()) {
                            iVar.b(a2, -3);
                        }
                        dVar2.c();
                    }
                    if (dVar != null && !dVar.f9065s) {
                        RecordingCanvas a10 = dVar.a(measuredWidth, measuredHeight);
                        a10.drawColor(contactsActivity.getThemedColor(org.telegram.ui.ActionBar.i6.f19057d6));
                        if (SharedConfig.chatBlurEnabled()) {
                            iVar.b(a10, -2);
                        }
                        dVar.c();
                    }
                }
                super.dispatchDraw(canvas);
                return;
            case 7:
                super.dispatchDraw(canvas);
                a91 a91Var = (a91) this.f40426x0;
                a91.h0(a91Var).f();
                if (!a91Var.M) {
                    AndroidUtilities.drawNavigationBarProtection(canvas, this, a91Var.getThemedColor(org.telegram.ui.ActionBar.i6.f19057d6), a91Var.S);
                    return;
                }
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f40425w0) {
            case 1:
                if (motionEvent.getY() < ((org.telegram.ui.Components.ac0) this.f40426x0).T) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public void e() {
        switch (this.f40425w0) {
            case 7:
                ((a91) this.f40426x0).q0();
                return;
            default:
                return;
        }
    }

    @Override
    public Drawable getNewDrawable() {
        switch (this.f40425w0) {
            case 1:
                Drawable d = ((vn) ((org.telegram.ui.Components.ac0) this.f40426x0).f22650c0.F).d();
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
        switch (this.f40425w0) {
            case 2:
                return ((org.telegram.ui.Components.n01) this.f40426x0).f26680c;
            default:
                return super.getResourceProvider();
        }
    }

    @Override
    public void onLayout(boolean r11, int r12, int r13, int r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.z8.onLayout(boolean, int, int, int, int):void");
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
        switch (this.f40425w0) {
            case 0:
                n9 n9Var = (n9) this.f40426x0;
                measureChildWithMargins(n9.e0(n9Var), i10, 0, i11, 0);
                ((ViewGroup.MarginLayoutParams) n9Var.L.getLayoutParams()).topMargin = n9.f0(n9Var).getMeasuredHeight() - AndroidUtilities.dp(14.0f);
                ((ViewGroup.MarginLayoutParams) n9Var.f35851a.getLayoutParams()).topMargin = n9.g0(n9Var).getMeasuredHeight();
                ((ViewGroup.MarginLayoutParams) n9Var.f35860n.getLayoutParams()).topMargin = n9.c0(n9Var).getMeasuredHeight();
                n9Var.j0();
                super.onMeasure(i10, i11);
                return;
            case 1:
            case 7:
            default:
                super.onMeasure(i10, i11);
                return;
            case 2:
                super.onMeasure(i10, i11);
                setMeasuredDimension(View.MeasureSpec.getSize(i10), ((org.telegram.ui.Components.n01) this.f40426x0).d.getMeasuredHeight() + AndroidUtilities.dp(24.0f));
                return;
            case 3:
                ContactsActivity contactsActivity = (ContactsActivity) this.f40426x0;
                lVar = ((org.telegram.ui.ActionBar.o2) contactsActivity).actionBar;
                measureChildWithMargins(lVar, i10, 0, i11, 0);
                lVar2 = ((org.telegram.ui.ActionBar.o2) contactsActivity).actionBar;
                ((ViewGroup.MarginLayoutParams) contactsActivity.e.getLayoutParams()).topMargin = AndroidUtilities.dp(48.0f) + lVar2.getMeasuredHeight();
                lVar3 = ((org.telegram.ui.ActionBar.o2) contactsActivity).actionBar;
                ((ViewGroup.MarginLayoutParams) contactsActivity.Y.getLayoutParams()).topMargin = lVar3.getMeasuredHeight();
                contactsActivity.j0();
                super.onMeasure(i10, i11);
                return;
            case 4:
                ub0 ub0Var = (ub0) this.f40426x0;
                super.onMeasure(i10, i11);
                R();
                int i17 = this.f23433f;
                if (i17 != 0 && i17 < AndroidUtilities.dp(20.0f)) {
                    ub0Var.F.clearFocus();
                    ub0Var.K.clearFocus();
                }
                FrameLayout frameLayout = ub0Var.H;
                if (this.f23433f > AndroidUtilities.dp(20.0f)) {
                    i12 = 8;
                } else {
                    i12 = 0;
                }
                frameLayout.setVisibility(i12);
                return;
            case 5:
                tg0 tg0Var = (tg0) this.f40426x0;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) tg0Var.N.getLayoutParams();
                int i18 = 0;
                if (tg0Var.h1()) {
                    i13 = AndroidUtilities.dp(226.0f);
                } else {
                    i13 = 0;
                }
                if (tg0Var.h1() && R() > AndroidUtilities.dp(20.0f)) {
                    i13 -= R();
                }
                org.telegram.ui.Components.qc qcVar = org.telegram.ui.Components.qc.f27684w;
                if (qcVar != null && qcVar.f27693l) {
                    super.onMeasure(i10, i11);
                    marginLayoutParams.bottomMargin = org.telegram.messenger.qk.D(10.0f, org.telegram.ui.Components.qc.f27684w.e.getMeasuredHeight() + AndroidUtilities.dp(14.0f), i13);
                } else {
                    marginLayoutParams.bottomMargin = AndroidUtilities.dp(14.0f) + i13;
                }
                if (!AndroidUtilities.isTablet()) {
                    i18 = AndroidUtilities.statusBarHeight;
                }
                ((ViewGroup.MarginLayoutParams) tg0Var.U.getLayoutParams()).topMargin = AndroidUtilities.dp(16.0f) + i18;
                ((ViewGroup.MarginLayoutParams) tg0Var.W.getLayoutParams()).topMargin = AndroidUtilities.dp(16.0f) + i18;
                ((ViewGroup.MarginLayoutParams) tg0Var.V.getLayoutParams()).topMargin = AndroidUtilities.dp(16.0f) + i18;
                TextView textView = tg0Var.f37793f0;
                if (textView != null) {
                    ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).topMargin = AndroidUtilities.dp(16.0f) + i18;
                }
                if (R() > AndroidUtilities.dp(20.0f) && tg0Var.f37788c.getVisibility() != 8 && !AndroidUtilities.isAccessibilityTouchExplorationEnabled() && !tg0Var.f37785a0) {
                    ValueAnimator valueAnimator = tg0Var.d;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    tg0Var.f37788c.setVisibility(8);
                }
                super.onMeasure(i10, i11);
                return;
            case 6:
                PopupNotificationActivity popupNotificationActivity = (PopupNotificationActivity) this.f40426x0;
                View.MeasureSpec.getMode(i10);
                View.MeasureSpec.getMode(i11);
                int size = View.MeasureSpec.getSize(i10);
                int size2 = View.MeasureSpec.getSize(i11);
                setMeasuredDimension(size, size2);
                if (R() <= AndroidUtilities.dp(20.0f)) {
                    size2 -= popupNotificationActivity.f31434b.getEmojiPadding();
                }
                int i19 = size2;
                int childCount = getChildCount();
                for (int i20 = 0; i20 < childCount; i20++) {
                    View childAt = getChildAt(i20);
                    if (childAt.getVisibility() != 8) {
                        if (popupNotificationActivity.f31434b.u0(childAt)) {
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, 1073741824));
                        } else if (childAt == popupNotificationActivity.f31434b.N1) {
                            measureChildWithMargins(childAt, i10, 0, i11, 0);
                        } else {
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(Math.max(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(2.0f) + i19), 1073741824));
                        }
                    }
                }
                return;
            case 8:
                xh.j4 j4Var = (xh.j4) this.f40426x0;
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) j4Var.f46294y.getLayoutParams();
                int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
                int i21 = 0;
                if (xh.j4.Z(j4Var).getOccupyStatusBar()) {
                    i14 = AndroidUtilities.statusBarHeight;
                } else {
                    i14 = 0;
                }
                layoutParams.topMargin = currentActionBarHeight + i14;
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) j4Var.h.getLayoutParams();
                int currentActionBarHeight2 = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
                if (xh.j4.a0(j4Var).getOccupyStatusBar()) {
                    i15 = AndroidUtilities.statusBarHeight;
                } else {
                    i15 = 0;
                }
                layoutParams2.topMargin = AndroidUtilities.dp(47.0f) + currentActionBarHeight2 + i15;
                FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) j4Var.f46289n.getLayoutParams();
                int currentActionBarHeight3 = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
                if (xh.j4.b0(j4Var).getOccupyStatusBar()) {
                    i16 = AndroidUtilities.statusBarHeight;
                } else {
                    i16 = 0;
                }
                layoutParams3.topMargin = currentActionBarHeight3 + i16;
                FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) j4Var.f46292w.getLayoutParams();
                int currentActionBarHeight4 = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
                if (xh.j4.c0(j4Var).getOccupyStatusBar()) {
                    i21 = AndroidUtilities.statusBarHeight;
                }
                layoutParams4.topMargin = currentActionBarHeight4 + i21;
                super.onMeasure(i10, i11);
                return;
        }
    }
}
