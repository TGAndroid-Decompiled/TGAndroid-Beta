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

public final class uo0 extends FrameLayout {

    public final TextView f43266a;

    public org.telegram.ui.Components.pz0 f43267b;

    public final org.telegram.ui.Components.i5 f43268c;
    public final vo0 d;

    public uo0(vo0 vo0Var, Context context) {
        super(context);
        this.d = vo0Var;
        ap0 ap0Var = vo0Var.f43505f0;
        setBackgroundColor(ap0Var.getThemedColor(org.telegram.ui.ActionBar.g6.f23053d6));
        TextView textView = new TextView(context);
        this.f43266a = textView;
        textView.setTextSize(1, 16.0f);
        boolean z10 = ap0Var.f36585a;
        textView.setTextColor(ap0Var.getThemedColor(org.telegram.ui.ActionBar.g6.G6));
        if (vo0Var.f43500c0 == 1) {
            textView.setText(LocaleController.getString(z10 ? R.string.ChannelReplyIcon : R.string.UserReplyIcon));
        } else {
            textView.setText(LocaleController.getString(z10 ? R.string.ChannelProfileIcon : R.string.UserProfileIcon));
        }
        addView(textView, h7.z5.d(-1, -2.0f, 23, 20.0f, 0.0f, 20.0f, 0.0f));
        this.f43268c = new org.telegram.ui.Components.i5(AndroidUtilities.dp(24.0f), 13, this, false);
    }

    public final int a() {
        MessagesController.PeerColor color;
        vo0 vo0Var = this.d;
        ap0 ap0Var = vo0Var.f43505f0;
        int i10 = vo0Var.f43506n;
        if (i10 < 0) {
            int i11 = org.telegram.ui.ActionBar.g6.f23322s8;
            if (AndroidUtilities.computePerceivedBrightness(ap0Var.getThemedColor(i11)) > 0.8f) {
                return org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23234n6, ((org.telegram.ui.ActionBar.n2) ap0Var).resourceProvider);
            }
            return AndroidUtilities.computePerceivedBrightness(ap0Var.getThemedColor(i11)) < 0.2f ? org.telegram.ui.ActionBar.g6.l1(0.5f, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.A8, ((org.telegram.ui.ActionBar.n2) ap0Var).resourceProvider)) : org.telegram.ui.ActionBar.g6.v(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23053d6, ((org.telegram.ui.ActionBar.n2) ap0Var).resourceProvider), org.telegram.ui.ActionBar.g6.l1(0.7f, ap0.u0(org.telegram.ui.ActionBar.g6.v0(i11, ((org.telegram.ui.ActionBar.n2) ap0Var).resourceProvider))));
        }
        if (i10 < 7) {
            return ap0Var.getThemedColor(org.telegram.ui.ActionBar.g6.f23303r8[i10]);
        }
        MessagesController.PeerColors peerColors = vo0Var.f43500c0 == 1 ? MessagesController.getInstance(((org.telegram.ui.ActionBar.n2) ap0Var).currentAccount).peerColors : MessagesController.getInstance(((org.telegram.ui.ActionBar.n2) ap0Var).currentAccount).profilePeerColors;
        return (peerColors == null || (color = peerColors.getColor(vo0Var.f43506n)) == null) ? ap0Var.getThemedColor(org.telegram.ui.ActionBar.g6.f23303r8[0]) : color.getColor1();
    }

    public final void b(boolean z10) {
        vo0 vo0Var = this.d;
        long j10 = vo0Var.f43507r;
        org.telegram.ui.Components.i5 i5Var = this.f43268c;
        if (j10 != 0) {
            i5Var.j(j10, z10);
            this.f43267b = null;
        } else {
            i5Var.g(null, z10);
            if (this.f43267b == null) {
                this.f43267b = new org.telegram.ui.Components.pz0(LocaleController.getString(vo0Var.f43505f0.f36585a ? R.string.ChannelReplyIconOff : R.string.UserReplyIconOff), 16.0f, null);
            }
        }
    }

    public final void c() {
        boolean z10 = LocaleController.isRTL;
        org.telegram.ui.Components.i5 i5Var = this.f43268c;
        i5Var.setBounds(z10 ? AndroidUtilities.dp(21.0f) : (getWidth() - i5Var.f29232s) - AndroidUtilities.dp(21.0f), (getHeight() - i5Var.f29232s) / 2, LocaleController.isRTL ? AndroidUtilities.dp(21.0f) + i5Var.f29232s : getWidth() - AndroidUtilities.dp(21.0f), (getHeight() + i5Var.f29232s) / 2);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        c();
        Integer numValueOf = Integer.valueOf(a());
        org.telegram.ui.Components.i5 i5Var = this.f43268c;
        i5Var.k(numValueOf);
        org.telegram.ui.Components.pz0 pz0Var = this.f43267b;
        if (pz0Var != null) {
            pz0Var.c((getMeasuredWidth() - this.f43267b.l()) - AndroidUtilities.dp(19.0f), getMeasuredHeight() / 2.0f, 1.0f, this.d.f43505f0.getThemedColor(org.telegram.ui.ActionBar.g6.q6), canvas);
        } else {
            i5Var.draw(canvas);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f43268c.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f43268c.b();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824));
    }
}
