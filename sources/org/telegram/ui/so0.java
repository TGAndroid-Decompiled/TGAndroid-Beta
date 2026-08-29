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
public final class so0 extends FrameLayout {
    public final TextView f42437a;
    public org.telegram.ui.Components.zz0 f42438b;
    public final org.telegram.ui.Components.n5 f42439c;
    public final to0 d;

    public so0(to0 to0Var, Context context) {
        super(context);
        int i10;
        int i11;
        this.d = to0Var;
        yo0 yo0Var = to0Var.f43077f0;
        setBackgroundColor(yo0Var.getThemedColor(org.telegram.ui.ActionBar.g6.f23062d6));
        TextView textView = new TextView(context);
        this.f42437a = textView;
        textView.setTextSize(1, 16.0f);
        boolean z10 = yo0Var.f44941a;
        textView.setTextColor(yo0Var.getThemedColor(org.telegram.ui.ActionBar.g6.G6));
        if (to0Var.f43072c0 == 1) {
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
        addView(textView, i7.f6.d(-1, -2.0f, 23, 20.0f, 0.0f, 20.0f, 0.0f));
        this.f42439c = new org.telegram.ui.Components.n5(AndroidUtilities.dp(24.0f), 13, this, false);
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
        to0 to0Var = this.d;
        yo0 yo0Var = to0Var.f43077f0;
        int i12 = to0Var.f43078n;
        if (i12 < 0) {
            int i13 = org.telegram.ui.ActionBar.g6.f23329s8;
            if (AndroidUtilities.computePerceivedBrightness(yo0Var.getThemedColor(i13)) > 0.8f) {
                int i14 = org.telegram.ui.ActionBar.g6.f23241n6;
                c6Var4 = ((org.telegram.ui.ActionBar.o2) yo0Var).resourceProvider;
                return org.telegram.ui.ActionBar.g6.v0(i14, c6Var4);
            } else if (AndroidUtilities.computePerceivedBrightness(yo0Var.getThemedColor(i13)) < 0.2f) {
                int i15 = org.telegram.ui.ActionBar.g6.A8;
                c6Var3 = ((org.telegram.ui.ActionBar.o2) yo0Var).resourceProvider;
                return org.telegram.ui.ActionBar.g6.l1(0.5f, org.telegram.ui.ActionBar.g6.v0(i15, c6Var3));
            } else {
                int i16 = org.telegram.ui.ActionBar.g6.f23062d6;
                c6Var = ((org.telegram.ui.ActionBar.o2) yo0Var).resourceProvider;
                int v02 = org.telegram.ui.ActionBar.g6.v0(i16, c6Var);
                c6Var2 = ((org.telegram.ui.ActionBar.o2) yo0Var).resourceProvider;
                return org.telegram.ui.ActionBar.g6.v(v02, org.telegram.ui.ActionBar.g6.l1(0.7f, yo0.u0(org.telegram.ui.ActionBar.g6.v0(i13, c6Var2))));
            }
        } else if (i12 < 7) {
            return yo0Var.getThemedColor(org.telegram.ui.ActionBar.g6.f23312r8[i12]);
        } else {
            if (to0Var.f43072c0 == 1) {
                i11 = ((org.telegram.ui.ActionBar.o2) yo0Var).currentAccount;
                peerColors = MessagesController.getInstance(i11).peerColors;
            } else {
                i10 = ((org.telegram.ui.ActionBar.o2) yo0Var).currentAccount;
                peerColors = MessagesController.getInstance(i10).profilePeerColors;
            }
            if (peerColors != null && (color = peerColors.getColor(to0Var.f43078n)) != null) {
                return color.getColor1();
            }
            return yo0Var.getThemedColor(org.telegram.ui.ActionBar.g6.f23312r8[0]);
        }
    }

    public final void b(boolean z10) {
        int i10;
        to0 to0Var = this.d;
        long j10 = to0Var.f43079r;
        org.telegram.ui.Components.n5 n5Var = this.f42439c;
        if (j10 != 0) {
            n5Var.j(j10, z10);
            this.f42438b = null;
            return;
        }
        n5Var.g(null, z10);
        if (this.f42438b == null) {
            if (to0Var.f43077f0.f44941a) {
                i10 = R.string.ChannelReplyIconOff;
            } else {
                i10 = R.string.UserReplyIconOff;
            }
            this.f42438b = new org.telegram.ui.Components.zz0(LocaleController.getString(i10), 16.0f, null);
        }
    }

    public final void c() {
        int width;
        int width2;
        boolean z10 = LocaleController.isRTL;
        org.telegram.ui.Components.n5 n5Var = this.f42439c;
        if (z10) {
            width = AndroidUtilities.dp(21.0f);
        } else {
            width = (getWidth() - n5Var.f30852s) - AndroidUtilities.dp(21.0f);
        }
        int height = (getHeight() - n5Var.f30852s) / 2;
        if (LocaleController.isRTL) {
            width2 = AndroidUtilities.dp(21.0f) + n5Var.f30852s;
        } else {
            width2 = getWidth() - AndroidUtilities.dp(21.0f);
        }
        n5Var.setBounds(width, height, width2, (getHeight() + n5Var.f30852s) / 2);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        c();
        Integer valueOf = Integer.valueOf(a());
        org.telegram.ui.Components.n5 n5Var = this.f42439c;
        n5Var.k(valueOf);
        org.telegram.ui.Components.zz0 zz0Var = this.f42438b;
        if (zz0Var != null) {
            zz0Var.c((getMeasuredWidth() - this.f42438b.l()) - AndroidUtilities.dp(19.0f), getMeasuredHeight() / 2.0f, 1.0f, this.d.f43077f0.getThemedColor(org.telegram.ui.ActionBar.g6.q6), canvas);
        } else {
            n5Var.draw(canvas);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f42439c.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f42439c.b();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824));
    }
}
