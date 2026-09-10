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
    public final TextView f36984a;
    public org.telegram.ui.Components.t01 f36985b;
    public final org.telegram.ui.Components.n5 f36986c;
    public final up0 d;

    public tp0(up0 up0Var, Context context) {
        super(context);
        int i10;
        int i11;
        this.d = up0Var;
        bq0 bq0Var = up0Var.f37324p0;
        setBackgroundColor(bq0Var.getThemedColor(org.telegram.ui.ActionBar.j6.f17928d6));
        TextView textView = new TextView(context);
        this.f36984a = textView;
        textView.setTextSize(1, 16.0f);
        boolean z10 = bq0Var.f31337a;
        textView.setTextColor(bq0Var.getThemedColor(org.telegram.ui.ActionBar.j6.G6));
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
        addView(textView, w7.a6.d(-1, -2.0f, 23, 20.0f, 0.0f, 20.0f, 0.0f));
        this.f36986c = new org.telegram.ui.Components.n5(AndroidUtilities.dp(24.0f), 13, this, false);
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
        up0 up0Var = this.d;
        bq0 bq0Var = up0Var.f37324p0;
        int i12 = up0Var.h;
        if (i12 < 0) {
            int i13 = org.telegram.ui.ActionBar.j6.f18201s8;
            if (AndroidUtilities.computePerceivedBrightness(bq0Var.getThemedColor(i13)) > 0.8f) {
                int i14 = org.telegram.ui.ActionBar.j6.f18110n6;
                f6Var4 = ((org.telegram.ui.ActionBar.p2) bq0Var).resourceProvider;
                return org.telegram.ui.ActionBar.j6.v0(i14, f6Var4);
            } else if (AndroidUtilities.computePerceivedBrightness(bq0Var.getThemedColor(i13)) < 0.2f) {
                int i15 = org.telegram.ui.ActionBar.j6.A8;
                f6Var3 = ((org.telegram.ui.ActionBar.p2) bq0Var).resourceProvider;
                return org.telegram.ui.ActionBar.j6.l1(0.5f, org.telegram.ui.ActionBar.j6.v0(i15, f6Var3));
            } else {
                int i16 = org.telegram.ui.ActionBar.j6.f17928d6;
                f6Var = ((org.telegram.ui.ActionBar.p2) bq0Var).resourceProvider;
                int v02 = org.telegram.ui.ActionBar.j6.v0(i16, f6Var);
                f6Var2 = ((org.telegram.ui.ActionBar.p2) bq0Var).resourceProvider;
                return org.telegram.ui.ActionBar.j6.v(v02, org.telegram.ui.ActionBar.j6.l1(0.7f, bq0.w0(org.telegram.ui.ActionBar.j6.v0(i13, f6Var2))));
            }
        } else if (i12 < 7) {
            return bq0Var.getThemedColor(org.telegram.ui.ActionBar.j6.f18182r8[i12]);
        } else {
            if (up0Var.m0 == 1) {
                i11 = ((org.telegram.ui.ActionBar.p2) bq0Var).currentAccount;
                peerColors = MessagesController.getInstance(i11).peerColors;
            } else {
                i10 = ((org.telegram.ui.ActionBar.p2) bq0Var).currentAccount;
                peerColors = MessagesController.getInstance(i10).profilePeerColors;
            }
            if (peerColors != null && (color = peerColors.getColor(up0Var.h)) != null) {
                return color.getColor1();
            }
            return bq0Var.getThemedColor(org.telegram.ui.ActionBar.j6.f18182r8[0]);
        }
    }

    public final void b(boolean z10) {
        int i10;
        up0 up0Var = this.d;
        long j3 = up0Var.f37321n;
        org.telegram.ui.Components.n5 n5Var = this.f36986c;
        if (j3 != 0) {
            n5Var.j(j3, z10);
            this.f36985b = null;
            return;
        }
        n5Var.g(null, z10);
        if (this.f36985b == null) {
            if (up0Var.f37324p0.f31337a) {
                i10 = R.string.ChannelReplyIconOff;
            } else {
                i10 = R.string.UserReplyIconOff;
            }
            this.f36985b = new org.telegram.ui.Components.t01(LocaleController.getString(i10), 16.0f, null);
        }
    }

    public final void c() {
        int width;
        int width2;
        boolean z10 = LocaleController.isRTL;
        org.telegram.ui.Components.n5 n5Var = this.f36986c;
        if (z10) {
            width = AndroidUtilities.dp(21.0f);
        } else {
            width = (getWidth() - n5Var.f25415s) - AndroidUtilities.dp(21.0f);
        }
        int height = (getHeight() - n5Var.f25415s) / 2;
        if (LocaleController.isRTL) {
            width2 = AndroidUtilities.dp(21.0f) + n5Var.f25415s;
        } else {
            width2 = getWidth() - AndroidUtilities.dp(21.0f);
        }
        n5Var.setBounds(width, height, width2, (getHeight() + n5Var.f25415s) / 2);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        c();
        Integer valueOf = Integer.valueOf(a());
        org.telegram.ui.Components.n5 n5Var = this.f36986c;
        n5Var.k(valueOf);
        org.telegram.ui.Components.t01 t01Var = this.f36985b;
        if (t01Var != null) {
            t01Var.c((getMeasuredWidth() - this.f36985b.l()) - AndroidUtilities.dp(19.0f), getMeasuredHeight() / 2.0f, 1.0f, this.d.f37324p0.getThemedColor(org.telegram.ui.ActionBar.j6.q6), canvas);
        } else {
            n5Var.draw(canvas);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f36986c.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f36986c.b();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824));
    }
}
