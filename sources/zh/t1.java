package zh;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.RectF;
import android.text.Spannable;
import android.text.TextPaint;
import android.view.Menu;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.NumberTextView;
import org.telegram.ui.eo;
public final class t1 extends ChatActivityEnterView {
    public ValueAnimator f48888n5;
    public int f48889o5;
    public int p5;
    public int f48890q5;
    public final a3 f48891r5;

    public t1(a3 a3Var, Activity activity, a3 a3Var2, bi.n1 n1Var) {
        super(activity, a3Var2, null, true, n1Var);
        this.f48891r5 = a3Var;
    }

    @Override
    public final void C0(int i10, int i11) {
        a3 a3Var = this.f48891r5;
        if (a3Var.f48157b2 != null) {
            this.f20891m3 = true;
            this.p5 = this.E0.getMeasuredHeight();
            this.f48890q5 = this.E0.getScrollY();
            invalidate();
            a3Var.invalidate();
            this.f48889o5 = a3Var.f48157b2.getBackgroundTop();
        }
    }

    @Override
    public final void L1(int i10, boolean z10) {
        super.L1(i10, z10);
        T1();
    }

    @Override
    public final void P1(boolean z10) {
        boolean z11;
        a3 a3Var = this.f48891r5;
        if (!a3Var.F1 && !a3Var.G1) {
            z11 = false;
        } else {
            z11 = true;
        }
        Q1(z11, z10);
    }

    @Override
    public final boolean S0() {
        long messageMinPrice;
        int i10;
        int i11;
        if (this.f20959z1.getAlpha() < 0.5f) {
            H0();
            return false;
        }
        a3 a3Var = this.f48891r5;
        if (a3Var.O1.f49132f) {
            long j3 = a3Var.L3;
            messageMinPrice = a3Var.getMessageMinPrice();
            long max = Math.max(j3, messageMinPrice);
            TLRPC.TL_textWithEntities textWithEntities = getTextWithEntities();
            CharSequence formatTextWithEntities = MessageObject.formatTextWithEntities(textWithEntities, false, new TextPaint());
            int length = formatTextWithEntities.length();
            int[] iArr = MessagesController.getInstance(a3Var.C2).starsGroupcallMessageLimits;
            if (iArr != null && iArr.length > 2) {
                i10 = iArr[2];
            } else {
                i10 = 400;
            }
            if (length > i10) {
                NumberTextView numberTextView = this.f20824b0;
                if (numberTextView != null) {
                    AndroidUtilities.shakeViewSpring(numberTextView, 3.5f);
                    try {
                        this.f20824b0.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                }
                return false;
            }
            if (!a3Var.D0(true)) {
                if (formatTextWithEntities instanceof Spannable) {
                    Spannable spannable = (Spannable) formatTextWithEntities;
                    i11 = ((org.telegram.ui.Components.y5[]) spannable.getSpans(0, formatTextWithEntities.length(), org.telegram.ui.Components.y5.class)).length + ((Emoji.EmojiSpan[]) spannable.getSpans(0, formatTextWithEntities.length(), Emoji.EmojiSpan.class)).length;
                } else {
                    i11 = 0;
                }
                int i12 = (int) max;
                if (i11 > o.b(a3Var.C2, i12, 2) || formatTextWithEntities.length() > o.b(a3Var.C2, i12, 1)) {
                    a3Var.O0();
                    return false;
                }
            }
            a3Var.L0.o(textWithEntities, max);
            this.E0.setText("");
            AndroidUtilities.hideKeyboard(this);
            a3Var.L3 = 0L;
            a3Var.r0(true);
            K(true);
            return true;
        }
        return super.S0();
    }

    @Override
    public final boolean T0(int i10, boolean z10, int i11, boolean z11, long j3) {
        a3 a3Var = this.f48891r5;
        if (MessagesController.getInstance(a3Var.C2).isFrozen()) {
            org.telegram.ui.b.b(a3Var.C2);
            return false;
        }
        return super.T0(i10, z10, i11, z11, j3);
    }

    public final void T1() {
        throw new UnsupportedOperationException("Method not decompiled: zh.t1.T1():void");
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        float f7;
        TextView textView;
        TextView textView2;
        if (!isEnabled()) {
            RectF rectF = AndroidUtilities.rectTmp;
            float width = getWidth();
            a3 a3Var = this.f48891r5;
            if (a3Var.f48181i2 != null) {
                f7 = this.f20953y * 1.5f;
            } else {
                f7 = 0.0f;
            }
            rectF.set(0.0f, 0.0f, width + f7, getHeight());
            boolean contains = rectF.contains(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() == 0) {
                if (contains && (textView2 = a3Var.f48181i2) != null) {
                    textView2.setPressed(true);
                }
            } else if (motionEvent.getAction() == 1) {
                TextView textView3 = a3Var.f48181i2;
                if (textView3 != null) {
                    if (contains && textView3.isPressed()) {
                        a3.h0(a3Var);
                    }
                    a3Var.f48181i2.setPressed(false);
                }
            } else if (motionEvent.getAction() == 3 && (textView = a3Var.f48181i2) != null) {
                textView.setPressed(false);
            }
            TextView textView4 = a3Var.f48181i2;
            if (textView4 == null || !textView4.isPressed()) {
                return false;
            }
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final int getMessagesCount() {
        if (this.f48891r5.O1.f49132f) {
            return 1;
        }
        return super.getMessagesCount();
    }

    @Override
    public final long getStarsPrice() {
        long messageMinPrice;
        a3 a3Var = this.f48891r5;
        if (a3Var.O1.f49132f) {
            messageMinPrice = a3Var.getMessageMinPrice();
            return Math.max(messageMinPrice, a3Var.L3);
        }
        return super.getStarsPrice();
    }

    @Override
    public final void h0(Menu menu) {
        eo.k8(menu, null, false, !this.f48891r5.O1.f49132f, true, true);
    }

    @Override
    public final void h1(float f7, float f10, float f11, boolean z10) {
        LinearLayout linearLayout = this.f48891r5.f48175g2;
        if (linearLayout != null) {
            linearLayout.setTranslationX((1.0f - f11) * f7);
        }
        super.h1(f7, f10, f11, z10);
    }

    @Override
    public final boolean r1(Runnable runnable) {
        this.f48891r5.n0(runnable);
        return true;
    }

    @Override
    public final boolean t() {
        return this.f48891r5.D0(true);
    }

    @Override
    public final void x0() {
        T1();
    }
}
