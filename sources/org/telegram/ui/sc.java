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
public final class sc extends FrameLayout {
    public org.telegram.ui.ActionBar.h5 f41893a;
    public org.telegram.ui.Components.r11 f41894b;
    public org.telegram.ui.Components.q5 f41895c;
    public org.telegram.ui.ActionBar.c6 d;
    public boolean f41896e;
    public int f41897f;

    public final void a(int i10, int i11, boolean z10) {
        MessagesController.PeerColors peerColors;
        MessagesController.PeerColor peerColor = null;
        if (i11 < 0) {
            b(null);
        } else if (i11 < 7) {
            this.f41897f = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20821r8[i11], this.d);
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
            int i10 = org.telegram.ui.ActionBar.h6.f20840s8;
            if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.h6.w0(i10, c6Var)) > 0.8f) {
                this.f41897f = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20745n6, c6Var);
                return;
            } else if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.h6.w0(i10, c6Var)) < 0.2f) {
                this.f41897f = org.telegram.ui.ActionBar.h6.m1(0.5f, org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.A8, c6Var));
                return;
            } else {
                this.f41897f = org.telegram.ui.ActionBar.h6.v(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20560d6, c6Var), org.telegram.ui.ActionBar.h6.m1(0.7f, cq0.w0(org.telegram.ui.ActionBar.h6.w0(i10, c6Var))));
                return;
            }
        }
        this.f41897f = peerColor.getColor(0, c6Var);
    }

    public final void c(long j3, boolean z10, boolean z11) {
        org.telegram.ui.Components.q5 q5Var = this.f41895c;
        if (j3 == 0) {
            q5Var.g(null, z11);
            if (this.f41894b == null) {
                this.f41894b = new org.telegram.ui.Components.r11(LocaleController.getString(R.string.ChannelReplyIconOff), 16.0f, null);
            }
        } else {
            q5Var.j(j3, z11);
            this.f41894b = null;
        }
        q5Var.m(z10, z11);
    }

    public final void d(TLRPC.Document document) {
        org.telegram.ui.Components.q5 q5Var = this.f41895c;
        if (document == null) {
            q5Var.g(null, false);
            if (this.f41894b == null) {
                this.f41894b = new org.telegram.ui.Components.r11(LocaleController.getString(R.string.ChannelReplyIconOff), 16.0f, null);
            }
        } else {
            q5Var.i(document, false);
            this.f41894b = null;
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
        org.telegram.ui.Components.q5 q5Var = this.f41895c;
        q5Var.k(Integer.valueOf(this.f41897f));
        org.telegram.ui.Components.r11 r11Var = this.f41894b;
        if (r11Var != null) {
            canvas2 = canvas;
            r11Var.c((getMeasuredWidth() - this.f41894b.l()) - AndroidUtilities.dp(19.0f), getMeasuredHeight() / 2.0f, 1.0f, org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.q6, c6Var), canvas2);
        } else {
            canvas2 = canvas;
            q5Var.draw(canvas2);
        }
        if (this.f41896e) {
            if (c6Var != null) {
                paint = c6Var.G("paintDivider");
            } else {
                paint = org.telegram.ui.ActionBar.h6.f20682k0;
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
        org.telegram.ui.ActionBar.h5 h5Var = this.f41893a;
        if (i10 <= 0) {
            h5Var.i(null);
            return;
        }
        h5Var.i(new lp0(i10, getContext(), this.d, false));
        h5Var.setDrawablePadding(AndroidUtilities.dp(6.0f));
    }

    public final void f() {
        org.telegram.ui.Components.q5 q5Var = this.f41895c;
        q5Var.setBounds((getWidth() - q5Var.f29672s) - AndroidUtilities.dp(21.0f), (getHeight() - q5Var.f29672s) / 2, getWidth() - AndroidUtilities.dp(21.0f), (getHeight() + q5Var.f29672s) / 2);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f41895c.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f41895c.b();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824));
    }
}
