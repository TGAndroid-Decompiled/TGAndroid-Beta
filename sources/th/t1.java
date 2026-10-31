package th;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.RectF;
import android.text.Spannable;
import android.text.TextPaint;
import android.view.Menu;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.jj;
import org.telegram.messenger.vp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.NumberTextView;
import org.telegram.ui.un;
public final class t1 extends ChatActivityEnterView {
    public ValueAnimator f49453t5;
    public int f49454u5;
    public int f49455v5;
    public int f49456w5;
    public final z2 f49457x5;

    public t1(z2 z2Var, Activity activity, z2 z2Var2, org.telegram.ui.web.a0 a0Var) {
        super(activity, z2Var2, null, true, a0Var);
        this.f49457x5 = z2Var;
    }

    @Override
    public final void A0(int i10, int i11) {
        z2 z2Var = this.f49457x5;
        if (z2Var.K1 != null) {
            this.f23755n3 = true;
            this.f49455v5 = this.E0.getMeasuredHeight();
            this.f49456w5 = this.E0.getScrollY();
            invalidate();
            z2Var.invalidate();
            this.f49454u5 = z2Var.K1.getBackgroundTop();
        }
    }

    @Override
    public final void K1(int i10, boolean z10) {
        super.K1(i10, z10);
        S1();
    }

    @Override
    public final void O1(boolean z10) {
        boolean z11;
        z2 z2Var = this.f49457x5;
        if (!z2Var.f49740o1 && !z2Var.f49744p1) {
            z11 = false;
        } else {
            z11 = true;
        }
        P1(z11, z10);
    }

    @Override
    public final boolean Q0() {
        long messageMinPrice;
        int i10;
        if (this.A1.getAlpha() < 0.5f) {
            F0();
            return false;
        }
        z2 z2Var = this.f49457x5;
        if (z2Var.f49776x1.f49664f) {
            long j10 = z2Var.f49766u3;
            messageMinPrice = z2Var.getMessageMinPrice();
            long max = Math.max(j10, messageMinPrice);
            TLRPC.TL_textWithEntities textWithEntities = getTextWithEntities();
            Spannable j02 = jj.j0(textWithEntities, false, false, new TextPaint());
            int length = j02.length();
            int[] iArr = vp.r1(z2Var.f49730l2).Y6;
            if (iArr != null && iArr.length > 2) {
                i10 = iArr[2];
            } else {
                i10 = 400;
            }
            if (length > i10) {
                NumberTextView numberTextView = this.f23680b0;
                if (numberTextView != null) {
                    org.telegram.messenger.i0.F3(3.5f, numberTextView, null);
                    try {
                        this.f23680b0.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                }
                return false;
            }
            if (!z2Var.B0(true)) {
                int i11 = (int) max;
                if (((org.telegram.ui.Components.o5[]) j02.getSpans(0, j02.length(), org.telegram.ui.Components.o5.class)).length + ((org.telegram.messenger.h6[]) j02.getSpans(0, j02.length(), org.telegram.messenger.h6.class)).length > o.b(z2Var.f49730l2, i11, 2) || j02.length() > o.b(z2Var.f49730l2, i11, 1)) {
                    z2Var.M0();
                    return false;
                }
            }
            z2Var.f49763u0.o(textWithEntities, max);
            this.E0.setText("");
            org.telegram.messenger.i0.v1(this);
            z2Var.f49766u3 = 0L;
            z2Var.p0(true);
            F(true);
            return true;
        }
        return super.Q0();
    }

    @Override
    public final boolean R0(boolean z10, int i10, int i11, long j10, boolean z11) {
        z2 z2Var = this.f49457x5;
        if (vp.r1(z2Var.f49730l2).u2()) {
            org.telegram.ui.b.b(z2Var.f49730l2);
            return false;
        }
        return super.R0(z10, i10, i11, j10, z11);
    }

    public final void S1() {
        throw new UnsupportedOperationException("Method not decompiled: th.t1.S1():void");
    }

    @Override
    public final void d0(Menu menu) {
        un.t8(menu, null, false, !this.f49457x5.f49776x1.f49664f, true, true);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        float f7;
        TextView textView;
        TextView textView2;
        if (!isEnabled()) {
            RectF rectF = org.telegram.messenger.i0.P;
            float width = getWidth();
            z2 z2Var = this.f49457x5;
            if (z2Var.R1 != null) {
                f7 = this.D * 1.5f;
            } else {
                f7 = 0.0f;
            }
            rectF.set(0.0f, 0.0f, width + f7, getHeight());
            boolean contains = rectF.contains(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() == 0) {
                if (contains && (textView2 = z2Var.R1) != null) {
                    textView2.setPressed(true);
                }
            } else if (motionEvent.getAction() == 1) {
                TextView textView3 = z2Var.R1;
                if (textView3 != null) {
                    if (contains && textView3.isPressed()) {
                        z2.f0(z2Var);
                    }
                    z2Var.R1.setPressed(false);
                }
            } else if (motionEvent.getAction() == 3 && (textView = z2Var.R1) != null) {
                textView.setPressed(false);
            }
            TextView textView4 = z2Var.R1;
            if (textView4 == null || !textView4.isPressed()) {
                return false;
            }
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void f1(float f7, float f10, float f11, boolean z10) {
        LinearLayout linearLayout = this.f49457x5.P1;
        if (linearLayout != null) {
            linearLayout.setTranslationX((1.0f - f11) * f7);
        }
        super.f1(f7, f10, f11, z10);
    }

    @Override
    public final int getMessagesCount() {
        if (this.f49457x5.f49776x1.f49664f) {
            return 1;
        }
        return super.getMessagesCount();
    }

    @Override
    public final long getStarsPrice() {
        long messageMinPrice;
        z2 z2Var = this.f49457x5;
        if (z2Var.f49776x1.f49664f) {
            messageMinPrice = z2Var.getMessageMinPrice();
            return Math.max(messageMinPrice, z2Var.f49766u3);
        }
        return super.getStarsPrice();
    }

    @Override
    public final boolean p() {
        return this.f49457x5.B0(true);
    }

    @Override
    public final boolean p1(Runnable runnable) {
        this.f49457x5.l0(runnable);
        return true;
    }

    @Override
    public final void u0() {
        S1();
    }
}
