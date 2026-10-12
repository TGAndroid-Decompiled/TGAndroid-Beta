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
public final class zp0 extends FrameLayout {
    public final TextView f42692a;
    public org.telegram.ui.Components.h11 f42693b;
    public final org.telegram.ui.Components.q5 f42694c;
    public final aq0 d;

    public zp0(aq0 aq0Var, Context context) {
        super(context);
        int i10;
        int i11;
        this.d = aq0Var;
        gq0 gq0Var = aq0Var.f34322p0;
        setBackgroundColor(gq0Var.getThemedColor(org.telegram.ui.ActionBar.g6.f19901d6));
        TextView textView = new TextView(context);
        this.f42692a = textView;
        textView.setTextSize(1, 16.0f);
        boolean z10 = gq0Var.f36448a;
        textView.setTextColor(gq0Var.getThemedColor(org.telegram.ui.ActionBar.g6.G6));
        if (aq0Var.m0 == 1) {
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
        addView(textView, w7.a6.a(-2.0f, 20.0f, 0.0f, 20.0f, 0.0f, -1, 23));
        this.f42694c = new org.telegram.ui.Components.q5(AndroidUtilities.dp(24.0f), 13, this, false);
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
        aq0 aq0Var = this.d;
        gq0 gq0Var = aq0Var.f34322p0;
        int i12 = aq0Var.h;
        if (i12 < 0) {
            int i13 = org.telegram.ui.ActionBar.g6.f20180s8;
            if (AndroidUtilities.computePerceivedBrightness(gq0Var.getThemedColor(i13)) > 0.8f) {
                int i14 = org.telegram.ui.ActionBar.g6.f20084n6;
                c6Var4 = ((org.telegram.ui.ActionBar.m2) gq0Var).resourceProvider;
                return org.telegram.ui.ActionBar.g6.w0(i14, c6Var4);
            } else if (AndroidUtilities.computePerceivedBrightness(gq0Var.getThemedColor(i13)) < 0.2f) {
                int i15 = org.telegram.ui.ActionBar.g6.A8;
                c6Var3 = ((org.telegram.ui.ActionBar.m2) gq0Var).resourceProvider;
                return org.telegram.ui.ActionBar.g6.m1(0.5f, org.telegram.ui.ActionBar.g6.w0(i15, c6Var3));
            } else {
                int i16 = org.telegram.ui.ActionBar.g6.f19901d6;
                c6Var = ((org.telegram.ui.ActionBar.m2) gq0Var).resourceProvider;
                int w02 = org.telegram.ui.ActionBar.g6.w0(i16, c6Var);
                c6Var2 = ((org.telegram.ui.ActionBar.m2) gq0Var).resourceProvider;
                return org.telegram.ui.ActionBar.g6.v(w02, org.telegram.ui.ActionBar.g6.m1(0.7f, gq0.w0(org.telegram.ui.ActionBar.g6.w0(i13, c6Var2))));
            }
        } else if (i12 < 7) {
            return gq0Var.getThemedColor(org.telegram.ui.ActionBar.g6.f20160r8[i12]);
        } else {
            if (aq0Var.m0 == 1) {
                i11 = ((org.telegram.ui.ActionBar.m2) gq0Var).currentAccount;
                peerColors = MessagesController.getInstance(i11).peerColors;
            } else {
                i10 = ((org.telegram.ui.ActionBar.m2) gq0Var).currentAccount;
                peerColors = MessagesController.getInstance(i10).profilePeerColors;
            }
            if (peerColors != null && (color = peerColors.getColor(aq0Var.h)) != null) {
                return color.getColor1();
            }
            return gq0Var.getThemedColor(org.telegram.ui.ActionBar.g6.f20160r8[0]);
        }
    }

    public final void b(boolean z10) {
        int i10;
        aq0 aq0Var = this.d;
        long j10 = aq0Var.f34319n;
        int i11 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        org.telegram.ui.Components.q5 q5Var = this.f42694c;
        if (i11 != 0) {
            q5Var.j(j10, z10);
            this.f42693b = null;
            return;
        }
        q5Var.g(null, z10);
        if (this.f42693b == null) {
            if (aq0Var.f34322p0.f36448a) {
                i10 = R.string.ChannelReplyIconOff;
            } else {
                i10 = R.string.UserReplyIconOff;
            }
            this.f42693b = new org.telegram.ui.Components.h11(LocaleController.getString(i10), 16.0f, null);
        }
    }

    public final void c() {
        int width;
        int width2;
        boolean z10 = LocaleController.isRTL;
        org.telegram.ui.Components.q5 q5Var = this.f42694c;
        if (z10) {
            width = AndroidUtilities.dp(21.0f);
        } else {
            width = (getWidth() - q5Var.f28519s) - AndroidUtilities.dp(21.0f);
        }
        int height = (getHeight() - q5Var.f28519s) / 2;
        if (LocaleController.isRTL) {
            width2 = AndroidUtilities.dp(21.0f) + q5Var.f28519s;
        } else {
            width2 = getWidth() - AndroidUtilities.dp(21.0f);
        }
        q5Var.setBounds(width, height, width2, (getHeight() + q5Var.f28519s) / 2);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        c();
        Integer valueOf = Integer.valueOf(a());
        org.telegram.ui.Components.q5 q5Var = this.f42694c;
        q5Var.k(valueOf);
        org.telegram.ui.Components.h11 h11Var = this.f42693b;
        if (h11Var != null) {
            h11Var.c((getMeasuredWidth() - this.f42693b.l()) - AndroidUtilities.dp(19.0f), getMeasuredHeight() / 2.0f, 1.0f, this.d.f34322p0.getThemedColor(org.telegram.ui.ActionBar.g6.q6), canvas);
        } else {
            q5Var.draw(canvas);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f42694c.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f42694c.b();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824));
    }
}
