package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
public final class sp0 extends FrameLayout {
    public final TextView f41808a;
    public org.telegram.ui.Components.m11 f41809b;
    public final org.telegram.ui.Components.q5 f41810c;
    public final tp0 d;

    public sp0(tp0 tp0Var, Context context) {
        super(context);
        int i10;
        int i11;
        this.d = tp0Var;
        zp0 zp0Var = tp0Var.f42275p0;
        setBackgroundColor(zp0Var.getThemedColor(org.telegram.ui.ActionBar.h6.f20822d6));
        TextView textView = new TextView(context);
        this.f41808a = textView;
        textView.setTextSize(1, 16.0f);
        boolean z10 = zp0Var.f45070a;
        textView.setTextColor(zp0Var.getThemedColor(org.telegram.ui.ActionBar.h6.G6));
        if (tp0Var.m0 == 1) {
            if (z10) {
                i11 = R.string.ChannelReplyIcon;
            } else {
                i11 = R.string.UserReplyIcon;
            }
            textView.setText(LocaleController.getString(i11));
        } else {
            if (z10) {
                i10 = R.string.ChannelProfileIcon;
            } else {
                i10 = R.string.UserProfileIcon;
            }
            textView.setText(LocaleController.getString(i10));
        }
        addView(textView, w7.x5.a(-2.0f, 20.0f, 0.0f, 20.0f, 0.0f, -1, 23));
        this.f41810c = new org.telegram.ui.Components.q5(AndroidUtilities.dp(24.0f), 13, this, false);
    }

    public final int a() {
        int i10;
        MessagesController.PeerColors peerColors;
        MessagesController.PeerColor color;
        int i11;
        org.telegram.ui.ActionBar.d6 d6Var;
        org.telegram.ui.ActionBar.d6 d6Var2;
        org.telegram.ui.ActionBar.d6 d6Var3;
        org.telegram.ui.ActionBar.d6 d6Var4;
        tp0 tp0Var = this.d;
        zp0 zp0Var = tp0Var.f42275p0;
        int i12 = tp0Var.h;
        if (i12 < 0) {
            int i13 = org.telegram.ui.ActionBar.h6.f21101s8;
            if (AndroidUtilities.computePerceivedBrightness(zp0Var.getThemedColor(i13)) > 0.8f) {
                int i14 = org.telegram.ui.ActionBar.h6.f21007n6;
                d6Var4 = ((org.telegram.ui.ActionBar.m2) zp0Var).resourceProvider;
                return org.telegram.ui.ActionBar.h6.w0(i14, d6Var4);
            } else if (AndroidUtilities.computePerceivedBrightness(zp0Var.getThemedColor(i13)) < 0.2f) {
                int i15 = org.telegram.ui.ActionBar.h6.A8;
                d6Var3 = ((org.telegram.ui.ActionBar.m2) zp0Var).resourceProvider;
                return org.telegram.ui.ActionBar.h6.m1(0.5f, org.telegram.ui.ActionBar.h6.w0(i15, d6Var3));
            } else {
                int i16 = org.telegram.ui.ActionBar.h6.f20822d6;
                d6Var = ((org.telegram.ui.ActionBar.m2) zp0Var).resourceProvider;
                int w02 = org.telegram.ui.ActionBar.h6.w0(i16, d6Var);
                d6Var2 = ((org.telegram.ui.ActionBar.m2) zp0Var).resourceProvider;
                return org.telegram.ui.ActionBar.h6.v(w02, org.telegram.ui.ActionBar.h6.m1(0.7f, zp0.w0(org.telegram.ui.ActionBar.h6.w0(i13, d6Var2))));
            }
        } else if (i12 < 7) {
            return zp0Var.getThemedColor(org.telegram.ui.ActionBar.h6.f21083r8[i12]);
        } else {
            if (tp0Var.m0 == 1) {
                i11 = ((org.telegram.ui.ActionBar.m2) zp0Var).currentAccount;
                peerColors = MessagesController.getInstance(i11).peerColors;
            } else {
                i10 = ((org.telegram.ui.ActionBar.m2) zp0Var).currentAccount;
                peerColors = MessagesController.getInstance(i10).profilePeerColors;
            }
            if (peerColors != null && (color = peerColors.getColor(tp0Var.h)) != null) {
                return color.getColor1();
            }
            return zp0Var.getThemedColor(org.telegram.ui.ActionBar.h6.f21083r8[0]);
        }
    }

    public final void b(boolean z10) {
        int i10;
        tp0 tp0Var = this.d;
        long j3 = tp0Var.f42272n;
        int i11 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        org.telegram.ui.Components.q5 q5Var = this.f41810c;
        if (i11 != 0) {
            q5Var.j(j3, z10);
            this.f41809b = null;
            return;
        }
        q5Var.g(null, z10);
        if (this.f41809b == null) {
            if (tp0Var.f42275p0.f45070a) {
                i10 = R.string.ChannelReplyIconOff;
            } else {
                i10 = R.string.UserReplyIconOff;
            }
            this.f41809b = new org.telegram.ui.Components.m11(LocaleController.getString(i10), 16.0f, null);
        }
    }

    public final void c() {
        int width;
        int width2;
        boolean z10 = LocaleController.isRTL;
        org.telegram.ui.Components.q5 q5Var = this.f41810c;
        if (z10) {
            width = AndroidUtilities.dp(21.0f);
        } else {
            width = (getWidth() - q5Var.f30117s) - AndroidUtilities.dp(21.0f);
        }
        int height = (getHeight() - q5Var.f30117s) / 2;
        if (LocaleController.isRTL) {
            width2 = AndroidUtilities.dp(21.0f) + q5Var.f30117s;
        } else {
            width2 = getWidth() - AndroidUtilities.dp(21.0f);
        }
        q5Var.setBounds(width, height, width2, (getHeight() + q5Var.f30117s) / 2);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        c();
        Integer valueOf = Integer.valueOf(a());
        org.telegram.ui.Components.q5 q5Var = this.f41810c;
        q5Var.k(valueOf);
        org.telegram.ui.Components.m11 m11Var = this.f41809b;
        if (m11Var != null) {
            m11Var.c((getMeasuredWidth() - this.f41809b.l()) - AndroidUtilities.dp(19.0f), getMeasuredHeight() / 2.0f, 1.0f, this.d.f42275p0.getThemedColor(org.telegram.ui.ActionBar.h6.q6), canvas);
        } else {
            q5Var.draw(canvas);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f41810c.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f41810c.b();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824));
    }
}
