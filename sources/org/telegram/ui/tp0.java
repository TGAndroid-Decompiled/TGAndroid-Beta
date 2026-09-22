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
public final class tp0 extends FrameLayout {
    public final TextView f37710a;
    public org.telegram.ui.Components.g01 f37711b;
    public final org.telegram.ui.Components.m5 f37712c;
    public final up0 d;

    public tp0(up0 up0Var, Context context) {
        super(context);
        int i10;
        int i11;
        this.d = up0Var;
        aq0 aq0Var = up0Var.f38097p0;
        setBackgroundColor(aq0Var.getThemedColor(org.telegram.ui.ActionBar.i6.f18834d6));
        TextView textView = new TextView(context);
        this.f37710a = textView;
        textView.setTextSize(1, 16.0f);
        boolean z10 = aq0Var.f31870a;
        textView.setTextColor(aq0Var.getThemedColor(org.telegram.ui.ActionBar.i6.G6));
        if (up0Var.m0 == 1) {
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
        addView(textView, w7.x5.d(-1, -2.0f, 23, 20.0f, 0.0f, 20.0f, 0.0f));
        this.f37712c = new org.telegram.ui.Components.m5(AndroidUtilities.dp(24.0f), 13, this, false);
    }

    public final int a() {
        int i10;
        MessagesController.PeerColors peerColors;
        MessagesController.PeerColor color;
        int i11;
        org.telegram.ui.ActionBar.e6 e6Var;
        org.telegram.ui.ActionBar.e6 e6Var2;
        org.telegram.ui.ActionBar.e6 e6Var3;
        org.telegram.ui.ActionBar.e6 e6Var4;
        up0 up0Var = this.d;
        aq0 aq0Var = up0Var.f38097p0;
        int i12 = up0Var.h;
        if (i12 < 0) {
            int i13 = org.telegram.ui.ActionBar.i6.f19110s8;
            if (AndroidUtilities.computePerceivedBrightness(aq0Var.getThemedColor(i13)) > 0.8f) {
                int i14 = org.telegram.ui.ActionBar.i6.f19018n6;
                e6Var4 = ((org.telegram.ui.ActionBar.n2) aq0Var).resourceProvider;
                return org.telegram.ui.ActionBar.i6.v0(i14, e6Var4);
            } else if (AndroidUtilities.computePerceivedBrightness(aq0Var.getThemedColor(i13)) < 0.2f) {
                int i15 = org.telegram.ui.ActionBar.i6.A8;
                e6Var3 = ((org.telegram.ui.ActionBar.n2) aq0Var).resourceProvider;
                return org.telegram.ui.ActionBar.i6.l1(0.5f, org.telegram.ui.ActionBar.i6.v0(i15, e6Var3));
            } else {
                int i16 = org.telegram.ui.ActionBar.i6.f18834d6;
                e6Var = ((org.telegram.ui.ActionBar.n2) aq0Var).resourceProvider;
                int v02 = org.telegram.ui.ActionBar.i6.v0(i16, e6Var);
                e6Var2 = ((org.telegram.ui.ActionBar.n2) aq0Var).resourceProvider;
                return org.telegram.ui.ActionBar.i6.v(v02, org.telegram.ui.ActionBar.i6.l1(0.7f, aq0.w0(org.telegram.ui.ActionBar.i6.v0(i13, e6Var2))));
            }
        } else if (i12 < 7) {
            return aq0Var.getThemedColor(org.telegram.ui.ActionBar.i6.f19091r8[i12]);
        } else {
            if (up0Var.m0 == 1) {
                i11 = ((org.telegram.ui.ActionBar.n2) aq0Var).currentAccount;
                peerColors = MessagesController.getInstance(i11).peerColors;
            } else {
                i10 = ((org.telegram.ui.ActionBar.n2) aq0Var).currentAccount;
                peerColors = MessagesController.getInstance(i10).profilePeerColors;
            }
            if (peerColors != null && (color = peerColors.getColor(up0Var.h)) != null) {
                return color.getColor1();
            }
            return aq0Var.getThemedColor(org.telegram.ui.ActionBar.i6.f19091r8[0]);
        }
    }

    public final void b(boolean z10) {
        int i10;
        up0 up0Var = this.d;
        long j3 = up0Var.f38094n;
        org.telegram.ui.Components.m5 m5Var = this.f37712c;
        if (j3 != 0) {
            m5Var.j(j3, z10);
            this.f37711b = null;
            return;
        }
        m5Var.g(null, z10);
        if (this.f37711b == null) {
            if (up0Var.f38097p0.f31870a) {
                i10 = R.string.ChannelReplyIconOff;
            } else {
                i10 = R.string.UserReplyIconOff;
            }
            this.f37711b = new org.telegram.ui.Components.g01(LocaleController.getString(i10), 16.0f, null);
        }
    }

    public final void c() {
        int width;
        int width2;
        boolean z10 = LocaleController.isRTL;
        org.telegram.ui.Components.m5 m5Var = this.f37712c;
        if (z10) {
            width = AndroidUtilities.dp(21.0f);
        } else {
            width = (getWidth() - m5Var.f26075s) - AndroidUtilities.dp(21.0f);
        }
        int height = (getHeight() - m5Var.f26075s) / 2;
        if (LocaleController.isRTL) {
            width2 = AndroidUtilities.dp(21.0f) + m5Var.f26075s;
        } else {
            width2 = getWidth() - AndroidUtilities.dp(21.0f);
        }
        m5Var.setBounds(width, height, width2, (getHeight() + m5Var.f26075s) / 2);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        c();
        Integer valueOf = Integer.valueOf(a());
        org.telegram.ui.Components.m5 m5Var = this.f37712c;
        m5Var.k(valueOf);
        org.telegram.ui.Components.g01 g01Var = this.f37711b;
        if (g01Var != null) {
            g01Var.c((getMeasuredWidth() - this.f37711b.l()) - AndroidUtilities.dp(19.0f), getMeasuredHeight() / 2.0f, 1.0f, this.d.f38097p0.getThemedColor(org.telegram.ui.ActionBar.i6.q6), canvas);
        } else {
            m5Var.draw(canvas);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f37712c.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f37712c.b();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824));
    }
}
