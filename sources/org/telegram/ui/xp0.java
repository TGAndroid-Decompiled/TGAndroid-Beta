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
public final class xp0 extends FrameLayout {
    public final TextView f41607a;
    public org.telegram.ui.Components.i11 f41608b;
    public final org.telegram.ui.Components.q5 f41609c;
    public final yp0 d;

    public xp0(yp0 yp0Var, Context context) {
        super(context);
        int i10;
        int i11;
        this.d = yp0Var;
        eq0 eq0Var = yp0Var.f41880p0;
        setBackgroundColor(eq0Var.getThemedColor(org.telegram.ui.ActionBar.g6.f19601d6));
        TextView textView = new TextView(context);
        this.f41607a = textView;
        textView.setTextSize(1, 16.0f);
        boolean z10 = eq0Var.f35347a;
        textView.setTextColor(eq0Var.getThemedColor(org.telegram.ui.ActionBar.g6.G6));
        if (yp0Var.m0 == 1) {
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
        addView(textView, w7.z5.a(-2.0f, 20.0f, 0.0f, 20.0f, 0.0f, -1, 23));
        this.f41609c = new org.telegram.ui.Components.q5(AndroidUtilities.dp(24.0f), 13, this, false);
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
        yp0 yp0Var = this.d;
        eq0 eq0Var = yp0Var.f41880p0;
        int i12 = yp0Var.h;
        if (i12 < 0) {
            int i13 = org.telegram.ui.ActionBar.g6.f19880s8;
            if (AndroidUtilities.computePerceivedBrightness(eq0Var.getThemedColor(i13)) > 0.8f) {
                int i14 = org.telegram.ui.ActionBar.g6.f19784n6;
                c6Var4 = ((org.telegram.ui.ActionBar.m2) eq0Var).resourceProvider;
                return org.telegram.ui.ActionBar.g6.w0(i14, c6Var4);
            } else if (AndroidUtilities.computePerceivedBrightness(eq0Var.getThemedColor(i13)) < 0.2f) {
                int i15 = org.telegram.ui.ActionBar.g6.A8;
                c6Var3 = ((org.telegram.ui.ActionBar.m2) eq0Var).resourceProvider;
                return org.telegram.ui.ActionBar.g6.m1(0.5f, org.telegram.ui.ActionBar.g6.w0(i15, c6Var3));
            } else {
                int i16 = org.telegram.ui.ActionBar.g6.f19601d6;
                c6Var = ((org.telegram.ui.ActionBar.m2) eq0Var).resourceProvider;
                int w02 = org.telegram.ui.ActionBar.g6.w0(i16, c6Var);
                c6Var2 = ((org.telegram.ui.ActionBar.m2) eq0Var).resourceProvider;
                return org.telegram.ui.ActionBar.g6.v(w02, org.telegram.ui.ActionBar.g6.m1(0.7f, eq0.w0(org.telegram.ui.ActionBar.g6.w0(i13, c6Var2))));
            }
        } else if (i12 < 7) {
            return eq0Var.getThemedColor(org.telegram.ui.ActionBar.g6.f19860r8[i12]);
        } else {
            if (yp0Var.m0 == 1) {
                i11 = ((org.telegram.ui.ActionBar.m2) eq0Var).currentAccount;
                peerColors = MessagesController.getInstance(i11).peerColors;
            } else {
                i10 = ((org.telegram.ui.ActionBar.m2) eq0Var).currentAccount;
                peerColors = MessagesController.getInstance(i10).profilePeerColors;
            }
            if (peerColors != null && (color = peerColors.getColor(yp0Var.h)) != null) {
                return color.getColor1();
            }
            return eq0Var.getThemedColor(org.telegram.ui.ActionBar.g6.f19860r8[0]);
        }
    }

    public final void b(boolean z10) {
        int i10;
        yp0 yp0Var = this.d;
        long j10 = yp0Var.f41877n;
        int i11 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        org.telegram.ui.Components.q5 q5Var = this.f41609c;
        if (i11 != 0) {
            q5Var.j(j10, z10);
            this.f41608b = null;
            return;
        }
        q5Var.g(null, z10);
        if (this.f41608b == null) {
            if (yp0Var.f41880p0.f35347a) {
                i10 = R.string.ChannelReplyIconOff;
            } else {
                i10 = R.string.UserReplyIconOff;
            }
            this.f41608b = new org.telegram.ui.Components.i11(LocaleController.getString(i10), 16.0f, null);
        }
    }

    public final void c() {
        int width;
        int width2;
        boolean z10 = LocaleController.isRTL;
        org.telegram.ui.Components.q5 q5Var = this.f41609c;
        if (z10) {
            width = AndroidUtilities.dp(21.0f);
        } else {
            width = (getWidth() - q5Var.f28200s) - AndroidUtilities.dp(21.0f);
        }
        int height = (getHeight() - q5Var.f28200s) / 2;
        if (LocaleController.isRTL) {
            width2 = AndroidUtilities.dp(21.0f) + q5Var.f28200s;
        } else {
            width2 = getWidth() - AndroidUtilities.dp(21.0f);
        }
        q5Var.setBounds(width, height, width2, (getHeight() + q5Var.f28200s) / 2);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        c();
        Integer valueOf = Integer.valueOf(a());
        org.telegram.ui.Components.q5 q5Var = this.f41609c;
        q5Var.k(valueOf);
        org.telegram.ui.Components.i11 i11Var = this.f41608b;
        if (i11Var != null) {
            i11Var.c((getMeasuredWidth() - this.f41608b.l()) - AndroidUtilities.dp(19.0f), getMeasuredHeight() / 2.0f, 1.0f, this.d.f41880p0.getThemedColor(org.telegram.ui.ActionBar.g6.q6), canvas);
        } else {
            q5Var.draw(canvas);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f41609c.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f41609c.b();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824));
    }
}
