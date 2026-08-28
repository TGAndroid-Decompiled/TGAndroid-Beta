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
public final class to0 extends FrameLayout {
    public final TextView f43046a;
    public org.telegram.ui.Components.nz0 f43047b;
    public final org.telegram.ui.Components.i5 f43048c;
    public final uo0 d;

    public to0(uo0 uo0Var, Context context) {
        super(context);
        int i9;
        int i10;
        this.d = uo0Var;
        zo0 zo0Var = uo0Var.f43287f0;
        setBackgroundColor(zo0Var.getThemedColor(org.telegram.ui.ActionBar.f6.f23001d6));
        TextView textView = new TextView(context);
        this.f43046a = textView;
        textView.setTextSize(1, 16.0f);
        boolean z10 = zo0Var.f45192a;
        textView.setTextColor(zo0Var.getThemedColor(org.telegram.ui.ActionBar.f6.G6));
        if (uo0Var.f43282c0 == 1) {
            if (z10) {
                i10 = R.string.ChannelReplyIcon;
            } else {
                i10 = R.string.UserReplyIcon;
            }
            textView.setText(LocaleController.getString(i10));
        } else {
            if (z10) {
                i9 = R.string.ChannelProfileIcon;
            } else {
                i9 = R.string.UserProfileIcon;
            }
            textView.setText(LocaleController.getString(i9));
        }
        addView(textView, g7.e6.d(-1, -2.0f, 23, 20.0f, 0.0f, 20.0f, 0.0f));
        this.f43048c = new org.telegram.ui.Components.i5(AndroidUtilities.dp(24.0f), 13, this, false);
    }

    public final int a() {
        int i9;
        MessagesController.PeerColors peerColors;
        MessagesController.PeerColor color;
        int i10;
        org.telegram.ui.ActionBar.b6 b6Var;
        org.telegram.ui.ActionBar.b6 b6Var2;
        org.telegram.ui.ActionBar.b6 b6Var3;
        org.telegram.ui.ActionBar.b6 b6Var4;
        uo0 uo0Var = this.d;
        zo0 zo0Var = uo0Var.f43287f0;
        int i11 = uo0Var.f43288n;
        if (i11 < 0) {
            int i12 = org.telegram.ui.ActionBar.f6.f23269s8;
            if (AndroidUtilities.computePerceivedBrightness(zo0Var.getThemedColor(i12)) > 0.8f) {
                int i13 = org.telegram.ui.ActionBar.f6.f23179n6;
                b6Var4 = ((org.telegram.ui.ActionBar.o2) zo0Var).resourceProvider;
                return org.telegram.ui.ActionBar.f6.v0(i13, b6Var4);
            } else if (AndroidUtilities.computePerceivedBrightness(zo0Var.getThemedColor(i12)) < 0.2f) {
                int i14 = org.telegram.ui.ActionBar.f6.A8;
                b6Var3 = ((org.telegram.ui.ActionBar.o2) zo0Var).resourceProvider;
                return org.telegram.ui.ActionBar.f6.l1(0.5f, org.telegram.ui.ActionBar.f6.v0(i14, b6Var3));
            } else {
                int i15 = org.telegram.ui.ActionBar.f6.f23001d6;
                b6Var = ((org.telegram.ui.ActionBar.o2) zo0Var).resourceProvider;
                int v02 = org.telegram.ui.ActionBar.f6.v0(i15, b6Var);
                b6Var2 = ((org.telegram.ui.ActionBar.o2) zo0Var).resourceProvider;
                return org.telegram.ui.ActionBar.f6.v(v02, org.telegram.ui.ActionBar.f6.l1(0.7f, zo0.t0(org.telegram.ui.ActionBar.f6.v0(i12, b6Var2))));
            }
        } else if (i11 < 7) {
            return zo0Var.getThemedColor(org.telegram.ui.ActionBar.f6.f23250r8[i11]);
        } else {
            if (uo0Var.f43282c0 == 1) {
                i10 = ((org.telegram.ui.ActionBar.o2) zo0Var).currentAccount;
                peerColors = MessagesController.getInstance(i10).peerColors;
            } else {
                i9 = ((org.telegram.ui.ActionBar.o2) zo0Var).currentAccount;
                peerColors = MessagesController.getInstance(i9).profilePeerColors;
            }
            if (peerColors != null && (color = peerColors.getColor(uo0Var.f43288n)) != null) {
                return color.getColor1();
            }
            return zo0Var.getThemedColor(org.telegram.ui.ActionBar.f6.f23250r8[0]);
        }
    }

    public final void b(boolean z10) {
        int i9;
        uo0 uo0Var = this.d;
        long j10 = uo0Var.f43289r;
        org.telegram.ui.Components.i5 i5Var = this.f43048c;
        if (j10 != 0) {
            i5Var.j(j10, z10);
            this.f43047b = null;
            return;
        }
        i5Var.g(null, z10);
        if (this.f43047b == null) {
            if (uo0Var.f43287f0.f45192a) {
                i9 = R.string.ChannelReplyIconOff;
            } else {
                i9 = R.string.UserReplyIconOff;
            }
            this.f43047b = new org.telegram.ui.Components.nz0(LocaleController.getString(i9), 16.0f, null);
        }
    }

    public final void c() {
        int width;
        int width2;
        boolean z10 = LocaleController.isRTL;
        org.telegram.ui.Components.i5 i5Var = this.f43048c;
        if (z10) {
            width = AndroidUtilities.dp(21.0f);
        } else {
            width = (getWidth() - i5Var.f29322s) - AndroidUtilities.dp(21.0f);
        }
        int height = (getHeight() - i5Var.f29322s) / 2;
        if (LocaleController.isRTL) {
            width2 = AndroidUtilities.dp(21.0f) + i5Var.f29322s;
        } else {
            width2 = getWidth() - AndroidUtilities.dp(21.0f);
        }
        i5Var.setBounds(width, height, width2, (getHeight() + i5Var.f29322s) / 2);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        c();
        Integer valueOf = Integer.valueOf(a());
        org.telegram.ui.Components.i5 i5Var = this.f43048c;
        i5Var.k(valueOf);
        org.telegram.ui.Components.nz0 nz0Var = this.f43047b;
        if (nz0Var != null) {
            nz0Var.c((getMeasuredWidth() - this.f43047b.l()) - AndroidUtilities.dp(19.0f), getMeasuredHeight() / 2.0f, 1.0f, this.d.f43287f0.getThemedColor(org.telegram.ui.ActionBar.f6.f23229q6), canvas);
        } else {
            i5Var.draw(canvas);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f43048c.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f43048c.b();
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824));
    }
}
