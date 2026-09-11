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
public final class up0 extends FrameLayout {
    public final TextView f41196a;
    public org.telegram.ui.Components.f01 f41197b;
    public final org.telegram.ui.Components.o5 f41198c;
    public final vp0 d;

    public up0(vp0 vp0Var, Context context) {
        super(context);
        int i10;
        int i11;
        this.d = vp0Var;
        bq0 bq0Var = vp0Var.f41619p0;
        setBackgroundColor(bq0Var.getThemedColor(org.telegram.ui.ActionBar.j6.f20663d6));
        TextView textView = new TextView(context);
        this.f41196a = textView;
        textView.setTextSize(1, 16.0f);
        boolean z10 = bq0Var.f34857a;
        textView.setTextColor(bq0Var.getThemedColor(org.telegram.ui.ActionBar.j6.G6));
        if (vp0Var.m0 == 1) {
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
        this.f41198c = new org.telegram.ui.Components.o5(AndroidUtilities.dp(24.0f), 13, this, false);
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
        vp0 vp0Var = this.d;
        bq0 bq0Var = vp0Var.f41619p0;
        int i12 = vp0Var.h;
        if (i12 < 0) {
            int i13 = org.telegram.ui.ActionBar.j6.f20937s8;
            if (AndroidUtilities.computePerceivedBrightness(bq0Var.getThemedColor(i13)) > 0.8f) {
                int i14 = org.telegram.ui.ActionBar.j6.f20846n6;
                f6Var4 = ((org.telegram.ui.ActionBar.n2) bq0Var).resourceProvider;
                return org.telegram.ui.ActionBar.j6.v0(i14, f6Var4);
            } else if (AndroidUtilities.computePerceivedBrightness(bq0Var.getThemedColor(i13)) < 0.2f) {
                int i15 = org.telegram.ui.ActionBar.j6.A8;
                f6Var3 = ((org.telegram.ui.ActionBar.n2) bq0Var).resourceProvider;
                return org.telegram.ui.ActionBar.j6.l1(0.5f, org.telegram.ui.ActionBar.j6.v0(i15, f6Var3));
            } else {
                int i16 = org.telegram.ui.ActionBar.j6.f20663d6;
                f6Var = ((org.telegram.ui.ActionBar.n2) bq0Var).resourceProvider;
                int v02 = org.telegram.ui.ActionBar.j6.v0(i16, f6Var);
                f6Var2 = ((org.telegram.ui.ActionBar.n2) bq0Var).resourceProvider;
                return org.telegram.ui.ActionBar.j6.v(v02, org.telegram.ui.ActionBar.j6.l1(0.7f, bq0.w0(org.telegram.ui.ActionBar.j6.v0(i13, f6Var2))));
            }
        } else if (i12 < 7) {
            return bq0Var.getThemedColor(org.telegram.ui.ActionBar.j6.f20918r8[i12]);
        } else {
            if (vp0Var.m0 == 1) {
                i11 = ((org.telegram.ui.ActionBar.n2) bq0Var).currentAccount;
                peerColors = MessagesController.getInstance(i11).peerColors;
            } else {
                i10 = ((org.telegram.ui.ActionBar.n2) bq0Var).currentAccount;
                peerColors = MessagesController.getInstance(i10).profilePeerColors;
            }
            if (peerColors != null && (color = peerColors.getColor(vp0Var.h)) != null) {
                return color.getColor1();
            }
            return bq0Var.getThemedColor(org.telegram.ui.ActionBar.j6.f20918r8[0]);
        }
    }

    public final void b(boolean z10) {
        int i10;
        vp0 vp0Var = this.d;
        long j3 = vp0Var.f41616n;
        org.telegram.ui.Components.o5 o5Var = this.f41198c;
        if (j3 != 0) {
            o5Var.j(j3, z10);
            this.f41197b = null;
            return;
        }
        o5Var.g(null, z10);
        if (this.f41197b == null) {
            if (vp0Var.f41619p0.f34857a) {
                i10 = R.string.ChannelReplyIconOff;
            } else {
                i10 = R.string.UserReplyIconOff;
            }
            this.f41197b = new org.telegram.ui.Components.f01(LocaleController.getString(i10), 16.0f, null);
        }
    }

    public final void c() {
        int width;
        int width2;
        boolean z10 = LocaleController.isRTL;
        org.telegram.ui.Components.o5 o5Var = this.f41198c;
        if (z10) {
            width = AndroidUtilities.dp(21.0f);
        } else {
            width = (getWidth() - o5Var.f28964s) - AndroidUtilities.dp(21.0f);
        }
        int height = (getHeight() - o5Var.f28964s) / 2;
        if (LocaleController.isRTL) {
            width2 = AndroidUtilities.dp(21.0f) + o5Var.f28964s;
        } else {
            width2 = getWidth() - AndroidUtilities.dp(21.0f);
        }
        o5Var.setBounds(width, height, width2, (getHeight() + o5Var.f28964s) / 2);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        c();
        Integer valueOf = Integer.valueOf(a());
        org.telegram.ui.Components.o5 o5Var = this.f41198c;
        o5Var.k(valueOf);
        org.telegram.ui.Components.f01 f01Var = this.f41197b;
        if (f01Var != null) {
            f01Var.c((getMeasuredWidth() - this.f41197b.l()) - AndroidUtilities.dp(19.0f), getMeasuredHeight() / 2.0f, 1.0f, this.d.f41619p0.getThemedColor(org.telegram.ui.ActionBar.j6.q6), canvas);
        } else {
            o5Var.draw(canvas);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f41198c.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f41198c.b();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824));
    }
}
