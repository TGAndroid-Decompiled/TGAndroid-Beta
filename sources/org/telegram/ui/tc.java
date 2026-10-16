package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class tc extends FrameLayout {
    public org.telegram.ui.ActionBar.h5 f40068a;
    public org.telegram.ui.Components.i11 f40069b;
    public org.telegram.ui.Components.q5 f40070c;
    public org.telegram.ui.ActionBar.c6 d;
    public boolean e;
    public int f40071f;

    public final void a(int i10, int i11, boolean z10) {
        MessagesController.PeerColors peerColors;
        MessagesController.PeerColor peerColor = null;
        if (i11 < 0) {
            b(null);
        } else if (i11 < 7) {
            this.f40071f = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19860r8[i11], this.d);
        } else {
            MessagesController messagesController = MessagesController.getInstance(i10);
            if (z10) {
                peerColors = messagesController.peerColors;
            } else {
                peerColors = messagesController.profilePeerColors;
            }
            if (peerColors != null) {
                peerColor = peerColors.getColor(i11);
            }
            b(peerColor);
        }
        invalidate();
    }

    public final void b(MessagesController.PeerColor peerColor) {
        org.telegram.ui.ActionBar.c6 c6Var = this.d;
        if (peerColor == null) {
            int i10 = org.telegram.ui.ActionBar.g6.f19880s8;
            if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.g6.w0(i10, c6Var)) > 0.8f) {
                this.f40071f = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19784n6, c6Var);
                return;
            } else if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.g6.w0(i10, c6Var)) < 0.2f) {
                this.f40071f = org.telegram.ui.ActionBar.g6.m1(0.5f, org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.A8, c6Var));
                return;
            } else {
                this.f40071f = org.telegram.ui.ActionBar.g6.v(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19601d6, c6Var), org.telegram.ui.ActionBar.g6.m1(0.7f, eq0.w0(org.telegram.ui.ActionBar.g6.w0(i10, c6Var))));
                return;
            }
        }
        this.f40071f = peerColor.getColor(0, c6Var);
    }

    public final void c(long j10, boolean z10, boolean z11) {
        org.telegram.ui.Components.q5 q5Var = this.f40070c;
        if (j10 == 0) {
            q5Var.g(null, z11);
            if (this.f40069b == null) {
                this.f40069b = new org.telegram.ui.Components.i11(LocaleController.getString(R.string.ChannelReplyIconOff), 16.0f, null);
            }
        } else {
            q5Var.j(j10, z11);
            this.f40069b = null;
        }
        q5Var.m(z10, z11);
    }

    public final void d(TLRPC.Document document) {
        org.telegram.ui.Components.q5 q5Var = this.f40070c;
        if (document == null) {
            q5Var.g(null, false);
            if (this.f40069b == null) {
                this.f40069b = new org.telegram.ui.Components.i11(LocaleController.getString(R.string.ChannelReplyIconOff), 16.0f, null);
            }
        } else {
            q5Var.i(document, false);
            this.f40069b = null;
        }
        q5Var.m(false, false);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        Paint paint;
        float dp;
        int i10;
        org.telegram.ui.ActionBar.c6 c6Var = this.d;
        super.dispatchDraw(canvas);
        f();
        org.telegram.ui.Components.q5 q5Var = this.f40070c;
        q5Var.k(Integer.valueOf(this.f40071f));
        org.telegram.ui.Components.i11 i11Var = this.f40069b;
        if (i11Var != null) {
            canvas2 = canvas;
            i11Var.c((getMeasuredWidth() - this.f40069b.l()) - AndroidUtilities.dp(19.0f), getMeasuredHeight() / 2.0f, 1.0f, org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.q6, c6Var), canvas2);
        } else {
            canvas2 = canvas;
            q5Var.draw(canvas2);
        }
        if (this.e) {
            if (c6Var != null) {
                paint = c6Var.F("paintDivider");
            } else {
                paint = org.telegram.ui.ActionBar.g6.f19722k0;
            }
            Paint paint2 = paint;
            if (paint2 != null) {
                if (LocaleController.isRTL) {
                    dp = 0.0f;
                } else {
                    dp = AndroidUtilities.dp(23.0f);
                }
                float f7 = dp;
                float measuredHeight = getMeasuredHeight() - 1;
                int measuredWidth = getMeasuredWidth();
                if (LocaleController.isRTL) {
                    i10 = AndroidUtilities.dp(23.0f);
                } else {
                    i10 = 0;
                }
                canvas2.drawLine(f7, measuredHeight, measuredWidth - i10, getMeasuredHeight() - 1, paint2);
            }
        }
    }

    public final void e(int i10) {
        org.telegram.ui.ActionBar.h5 h5Var = this.f40068a;
        if (i10 <= 0) {
            h5Var.i(null);
            return;
        }
        h5Var.i(new np0(i10, getContext(), this.d, false));
        h5Var.setDrawablePadding(AndroidUtilities.dp(6.0f));
    }

    public final void f() {
        org.telegram.ui.Components.q5 q5Var = this.f40070c;
        q5Var.setBounds((getWidth() - q5Var.f28200s) - AndroidUtilities.dp(21.0f), (getHeight() - q5Var.f28200s) / 2, getWidth() - AndroidUtilities.dp(21.0f), (getHeight() + q5Var.f28200s) / 2);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f40070c.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f40070c.b();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824));
    }
}
