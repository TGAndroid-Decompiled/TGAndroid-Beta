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
    public final TextView f42821a;
    public org.telegram.ui.Components.r11 f42822b;
    public final org.telegram.ui.Components.q5 f42823c;
    public final wp0 d;

    public vp0(wp0 wp0Var, Context context) {
        super(context);
        int i10;
        int i11;
        this.d = wp0Var;
        cq0 cq0Var = wp0Var.f43597p0;
        setBackgroundColor(cq0Var.getThemedColor(org.telegram.ui.ActionBar.h6.f20559d6));
        TextView textView = new TextView(context);
        this.f42821a = textView;
        textView.setTextSize(1, 16.0f);
        boolean z10 = cq0Var.f36474a;
        textView.setTextColor(cq0Var.getThemedColor(org.telegram.ui.ActionBar.h6.G6));
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
        addView(textView, w7.w5.a(-2.0f, 20.0f, 0.0f, 20.0f, 0.0f, -1, 23));
        this.f42823c = new org.telegram.ui.Components.q5(AndroidUtilities.dp(24.0f), 13, this, false);
    }

    public final int a() {
        int i10;
        MessagesController.PeerColors peerColors;
        MessagesController.PeerColor color;
        int i11;
        org.telegram.ui.ActionBar.c6 c6Var;
        org.telegram.ui.ActionBar.c6 c6Var2;
        org.telegram.ui.ActionBar.c6 c6Var3;
        org.telegram.ui.ActionBar.c6 c6Var4;
        wp0 wp0Var = this.d;
        cq0 cq0Var = wp0Var.f43597p0;
        int i12 = wp0Var.h;
        if (i12 < 0) {
            int i13 = org.telegram.ui.ActionBar.h6.f20839s8;
            if (AndroidUtilities.computePerceivedBrightness(cq0Var.getThemedColor(i13)) > 0.8f) {
                int i14 = org.telegram.ui.ActionBar.h6.f20744n6;
                c6Var4 = ((org.telegram.ui.ActionBar.m2) cq0Var).resourceProvider;
                return org.telegram.ui.ActionBar.h6.w0(i14, c6Var4);
            } else if (AndroidUtilities.computePerceivedBrightness(cq0Var.getThemedColor(i13)) < 0.2f) {
                int i15 = org.telegram.ui.ActionBar.h6.A8;
                c6Var3 = ((org.telegram.ui.ActionBar.m2) cq0Var).resourceProvider;
                return org.telegram.ui.ActionBar.h6.m1(0.5f, org.telegram.ui.ActionBar.h6.w0(i15, c6Var3));
            } else {
                int i16 = org.telegram.ui.ActionBar.h6.f20559d6;
                c6Var = ((org.telegram.ui.ActionBar.m2) cq0Var).resourceProvider;
                int w02 = org.telegram.ui.ActionBar.h6.w0(i16, c6Var);
                c6Var2 = ((org.telegram.ui.ActionBar.m2) cq0Var).resourceProvider;
                return org.telegram.ui.ActionBar.h6.v(w02, org.telegram.ui.ActionBar.h6.m1(0.7f, cq0.w0(org.telegram.ui.ActionBar.h6.w0(i13, c6Var2))));
            }
        } else if (i12 < 7) {
            return cq0Var.getThemedColor(org.telegram.ui.ActionBar.h6.f20820r8[i12]);
        } else {
            if (wp0Var.m0 == 1) {
                i11 = ((org.telegram.ui.ActionBar.m2) cq0Var).currentAccount;
                peerColors = MessagesController.getInstance(i11).peerColors;
            } else {
                i10 = ((org.telegram.ui.ActionBar.m2) cq0Var).currentAccount;
                peerColors = MessagesController.getInstance(i10).profilePeerColors;
            }
            if (peerColors != null && (color = peerColors.getColor(wp0Var.h)) != null) {
                return color.getColor1();
            }
            return cq0Var.getThemedColor(org.telegram.ui.ActionBar.h6.f20820r8[0]);
        }
    }

    public final void b(boolean z10) {
        int i10;
        wp0 wp0Var = this.d;
        long j3 = wp0Var.f43594n;
        int i11 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        org.telegram.ui.Components.q5 q5Var = this.f42823c;
        if (i11 != 0) {
            q5Var.j(j3, z10);
            this.f42822b = null;
            return;
        }
        q5Var.g(null, z10);
        if (this.f42822b == null) {
            if (wp0Var.f43597p0.f36474a) {
                i10 = R.string.ChannelReplyIconOff;
            } else {
                i10 = R.string.UserReplyIconOff;
            }
            this.f42822b = new org.telegram.ui.Components.r11(LocaleController.getString(i10), 16.0f, null);
        }
    }

    public final void c() {
        int width;
        int width2;
        boolean z10 = LocaleController.isRTL;
        org.telegram.ui.Components.q5 q5Var = this.f42823c;
        if (z10) {
            width = AndroidUtilities.dp(21.0f);
        } else {
            width = (getWidth() - q5Var.f29694s) - AndroidUtilities.dp(21.0f);
        }
        int height = (getHeight() - q5Var.f29694s) / 2;
        if (LocaleController.isRTL) {
            width2 = AndroidUtilities.dp(21.0f) + q5Var.f29694s;
        } else {
            width2 = getWidth() - AndroidUtilities.dp(21.0f);
        }
        q5Var.setBounds(width, height, width2, (getHeight() + q5Var.f29694s) / 2);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        c();
        Integer valueOf = Integer.valueOf(a());
        org.telegram.ui.Components.q5 q5Var = this.f42823c;
        q5Var.k(valueOf);
        org.telegram.ui.Components.r11 r11Var = this.f42822b;
        if (r11Var != null) {
            r11Var.c((getMeasuredWidth() - this.f42822b.l()) - AndroidUtilities.dp(19.0f), getMeasuredHeight() / 2.0f, 1.0f, this.d.f43597p0.getThemedColor(org.telegram.ui.ActionBar.h6.q6), canvas);
        } else {
            q5Var.draw(canvas);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f42823c.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f42823c.b();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824));
    }
}
