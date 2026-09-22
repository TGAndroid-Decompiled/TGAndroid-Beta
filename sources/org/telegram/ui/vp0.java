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
public final class vp0 extends FrameLayout {
    public final TextView f38606a;
    public org.telegram.ui.Components.w01 f38607b;
    public final org.telegram.ui.Components.n5 f38608c;
    public final wp0 d;

    public vp0(wp0 wp0Var, Context context) {
        super(context);
        int i10;
        int i11;
        this.d = wp0Var;
        cq0 cq0Var = wp0Var.f39235p0;
        setBackgroundColor(cq0Var.getThemedColor(org.telegram.ui.ActionBar.j6.f19109d6));
        TextView textView = new TextView(context);
        this.f38606a = textView;
        textView.setTextSize(1, 16.0f);
        boolean z10 = cq0Var.f32829a;
        textView.setTextColor(cq0Var.getThemedColor(org.telegram.ui.ActionBar.j6.G6));
        if (wp0Var.m0 == 1) {
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
        addView(textView, w7.y5.d(-1, -2.0f, 23, 20.0f, 0.0f, 20.0f, 0.0f));
        this.f38608c = new org.telegram.ui.Components.n5(AndroidUtilities.dp(24.0f), 13, this, false);
    }

    public final int a() {
        int i10;
        MessagesController.PeerColors peerColors;
        MessagesController.PeerColor color;
        int i11;
        org.telegram.ui.ActionBar.f6 f6Var;
        org.telegram.ui.ActionBar.f6 f6Var2;
        org.telegram.ui.ActionBar.f6 f6Var3;
        org.telegram.ui.ActionBar.f6 f6Var4;
        wp0 wp0Var = this.d;
        cq0 cq0Var = wp0Var.f39235p0;
        int i12 = wp0Var.h;
        if (i12 < 0) {
            int i13 = org.telegram.ui.ActionBar.j6.f19387s8;
            if (AndroidUtilities.computePerceivedBrightness(cq0Var.getThemedColor(i13)) > 0.8f) {
                int i14 = org.telegram.ui.ActionBar.j6.f19294n6;
                f6Var4 = ((org.telegram.ui.ActionBar.n2) cq0Var).resourceProvider;
                return org.telegram.ui.ActionBar.j6.v0(i14, f6Var4);
            } else if (AndroidUtilities.computePerceivedBrightness(cq0Var.getThemedColor(i13)) < 0.2f) {
                int i15 = org.telegram.ui.ActionBar.j6.A8;
                f6Var3 = ((org.telegram.ui.ActionBar.n2) cq0Var).resourceProvider;
                return org.telegram.ui.ActionBar.j6.l1(0.5f, org.telegram.ui.ActionBar.j6.v0(i15, f6Var3));
            } else {
                int i16 = org.telegram.ui.ActionBar.j6.f19109d6;
                f6Var = ((org.telegram.ui.ActionBar.n2) cq0Var).resourceProvider;
                int v02 = org.telegram.ui.ActionBar.j6.v0(i16, f6Var);
                f6Var2 = ((org.telegram.ui.ActionBar.n2) cq0Var).resourceProvider;
                return org.telegram.ui.ActionBar.j6.v(v02, org.telegram.ui.ActionBar.j6.l1(0.7f, cq0.w0(org.telegram.ui.ActionBar.j6.v0(i13, f6Var2))));
            }
        } else if (i12 < 7) {
            return cq0Var.getThemedColor(org.telegram.ui.ActionBar.j6.f19368r8[i12]);
        } else {
            if (wp0Var.m0 == 1) {
                i11 = ((org.telegram.ui.ActionBar.n2) cq0Var).currentAccount;
                peerColors = MessagesController.getInstance(i11).peerColors;
            } else {
                i10 = ((org.telegram.ui.ActionBar.n2) cq0Var).currentAccount;
                peerColors = MessagesController.getInstance(i10).profilePeerColors;
            }
            if (peerColors != null && (color = peerColors.getColor(wp0Var.h)) != null) {
                return color.getColor1();
            }
            return cq0Var.getThemedColor(org.telegram.ui.ActionBar.j6.f19368r8[0]);
        }
    }

    public final void b(boolean z10) {
        int i10;
        wp0 wp0Var = this.d;
        long j3 = wp0Var.f39232n;
        org.telegram.ui.Components.n5 n5Var = this.f38608c;
        if (j3 != 0) {
            n5Var.j(j3, z10);
            this.f38607b = null;
            return;
        }
        n5Var.g(null, z10);
        if (this.f38607b == null) {
            if (wp0Var.f39235p0.f32829a) {
                i10 = R.string.ChannelReplyIconOff;
            } else {
                i10 = R.string.UserReplyIconOff;
            }
            this.f38607b = new org.telegram.ui.Components.w01(LocaleController.getString(i10), 16.0f, null);
        }
    }

    public final void c() {
        int width;
        int width2;
        boolean z10 = LocaleController.isRTL;
        org.telegram.ui.Components.n5 n5Var = this.f38608c;
        if (z10) {
            width = AndroidUtilities.dp(21.0f);
        } else {
            width = (getWidth() - n5Var.f26637s) - AndroidUtilities.dp(21.0f);
        }
        int height = (getHeight() - n5Var.f26637s) / 2;
        if (LocaleController.isRTL) {
            width2 = AndroidUtilities.dp(21.0f) + n5Var.f26637s;
        } else {
            width2 = getWidth() - AndroidUtilities.dp(21.0f);
        }
        n5Var.setBounds(width, height, width2, (getHeight() + n5Var.f26637s) / 2);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        c();
        Integer valueOf = Integer.valueOf(a());
        org.telegram.ui.Components.n5 n5Var = this.f38608c;
        n5Var.k(valueOf);
        org.telegram.ui.Components.w01 w01Var = this.f38607b;
        if (w01Var != null) {
            w01Var.c((getMeasuredWidth() - this.f38607b.l()) - AndroidUtilities.dp(19.0f), getMeasuredHeight() / 2.0f, 1.0f, this.d.f39235p0.getThemedColor(org.telegram.ui.ActionBar.j6.q6), canvas);
        } else {
            n5Var.draw(canvas);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f38608c.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f38608c.b();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824));
    }
}
