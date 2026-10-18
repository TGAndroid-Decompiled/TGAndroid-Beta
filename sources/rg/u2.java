package rg;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Build;
import android.text.Editable;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.lk;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.a6;
import org.telegram.ui.Components.el0;
import org.telegram.ui.td0;
import w7.z5;
public final class u2 extends j {
    public String A0;
    public final t2 f45658q0;
    public qg.s1 f45659r0;
    public int f45660s0;
    public int f45661t0;
    public int f45662u0;
    public qg.l0 f45663v0;
    public int f45664w0;
    public int f45665x0;
    public Runnable f45666y0;
    public boolean f45667z0;

    public u2(Context context, PointF pointF, int i10, CharSequence charSequence, qg.s1 s1Var, int i11) {
        super(context, pointF);
        this.f45663v0 = qg.l0.e;
        this.f45661t0 = i10;
        t2 t2Var = new t2(this, context);
        this.f45658q0 = t2Var;
        NotificationCenter.listenEmojiLoading(t2Var);
        t2Var.setGravity(19);
        t2Var.setBackgroundColor(0);
        t2Var.setPadding(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f));
        t2Var.setClickable(false);
        t2Var.setEnabled(false);
        t2Var.setCursorColor(-1);
        t2Var.setTextSize(0, this.f45661t0);
        t2Var.setCursorSize(AndroidUtilities.dp(this.f45661t0 * 0.4f));
        t2Var.setText(charSequence);
        s();
        t2Var.setTextColor(s1Var.f44645a);
        t2Var.setTypeface(null, 1);
        t2Var.setHorizontallyScrolling(false);
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 26) {
            t2Var.setImeOptions(285212672);
        } else {
            t2Var.setImeOptions(268435456);
        }
        t2Var.setFocusableInTouchMode(true);
        t2Var.setInputType(16384);
        t2Var.setSingleLine(false);
        addView(t2Var, z5.e(-2, -2, 51));
        if (i12 >= 29) {
            t2Var.setBreakStrategy(0);
        } else {
            t2Var.setBreakStrategy(0);
        }
        setSwatch(s1Var);
        setType(i11);
        k();
        t2Var.addTextChangedListener(new td0(this));
    }

    @Override
    public final i a() {
        return new p0(this, getContext());
    }

    public int getAlign() {
        return this.f45662u0;
    }

    public int getBaseFontSize() {
        return this.f45661t0;
    }

    public b getEditText() {
        return this.f45658q0;
    }

    public View getFocusedView() {
        return this.f45658q0;
    }

    public Paint.FontMetricsInt getFontMetricsInt() {
        return this.f45658q0.getPaint().getFontMetricsInt();
    }

    public float getFontSize() {
        return this.f45658q0.getTextSize();
    }

    @Override
    public el0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new Object();
        }
        float scaleX = viewGroup.getScaleX();
        float dp = (AndroidUtilities.dp(64.0f) / scaleX) + (getScale() * getMeasuredWidth());
        float dp2 = (AndroidUtilities.dp(52.0f) / scaleX) + (getScale() * getMeasuredHeight());
        float z10 = lk.z(dp, 2.0f, getPositionX(), scaleX);
        float positionY = getPositionY();
        t2 t2Var = this.f45658q0;
        return new el0(z10, (positionY - (((dp2 - t2Var.getExtendedPaddingTop()) - AndroidUtilities.dpf2(4.0f)) / 2.0f)) * scaleX, ((dp * scaleX) + z10) - z10, (dp2 - t2Var.getExtendedPaddingBottom()) * scaleX);
    }

    @Override
    public float getStickyPaddingBottom() {
        RectF rectF = this.f45658q0.f45293w;
        if (rectF == null) {
            return 0.0f;
        }
        return rectF.bottom;
    }

    @Override
    public float getStickyPaddingLeft() {
        RectF rectF = this.f45658q0.f45293w;
        if (rectF == null) {
            return 0.0f;
        }
        return rectF.left;
    }

    @Override
    public float getStickyPaddingRight() {
        RectF rectF = this.f45658q0.f45293w;
        if (rectF == null) {
            return 0.0f;
        }
        return rectF.right;
    }

    @Override
    public float getStickyPaddingTop() {
        RectF rectF = this.f45658q0.f45293w;
        if (rectF == null) {
            return 0.0f;
        }
        return rectF.top;
    }

    public qg.s1 getSwatch() {
        return this.f45659r0;
    }

    public CharSequence getText() {
        return this.f45658q0.getText();
    }

    public int getTextSize() {
        return (int) this.f45658q0.getTextSize();
    }

    public int getType() {
        return this.f45660s0;
    }

    public qg.l0 getTypeface() {
        return this.f45663v0;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        k();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        k();
    }

    public final void q() {
        t2 t2Var = this.f45658q0;
        t2Var.setEnabled(true);
        t2Var.setClickable(true);
        t2Var.requestFocus();
        t2Var.setSelection(t2Var.getText().length());
        AndroidUtilities.runOnUIThread(new org.telegram.ui.web.a2(this, 15), 300L);
    }

    public final void r() {
        int i10;
        t2 t2Var = this.f45658q0;
        t2Var.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        int i11 = this.f45659r0.f44645a;
        int i12 = this.f45660s0;
        int i13 = -1;
        if (i12 == 0) {
            t2Var.setFrameColor(i11);
            i11 = AndroidUtilities.computePerceivedBrightness(this.f45659r0.f44645a) >= 0.721f ? -16777216 : -1;
        } else if (i12 == 1) {
            if (AndroidUtilities.computePerceivedBrightness(i11) >= 0.25f) {
                i10 = -1728053248;
            } else {
                i10 = -1711276033;
            }
            t2Var.setFrameColor(i10);
        } else if (i12 == 2) {
            if (AndroidUtilities.computePerceivedBrightness(i11) >= 0.25f) {
                i13 = -16777216;
            }
            t2Var.setFrameColor(i13);
        } else {
            t2Var.setFrameColor(0);
        }
        t2Var.setTextColor(i11);
        t2Var.setCursorColor(i11);
        t2Var.setHandlesColor(i11);
        t2Var.setHighlightColor(h6.m1(0.4f, i11));
    }

    public final void s() {
        t2 t2Var = this.f45658q0;
        if (t2Var.getText().length() <= 0) {
            t2Var.setHint(LocaleController.getString(R.string.TextPlaceholder));
            t2Var.setHintTextColor(1627389951);
            return;
        }
        t2Var.setHint((CharSequence) null);
    }

    public void setAlign(int i10) {
        this.f45662u0 = i10;
    }

    public void setBaseFontSize(int i10) {
        this.f45661t0 = i10;
        float f7 = i10;
        t2 t2Var = this.f45658q0;
        t2Var.setTextSize(0, f7);
        t2Var.setCursorSize(AndroidUtilities.dp(f7 * 0.4f));
        if (t2Var.getText() != null) {
            Editable text = t2Var.getText();
            Emoji.EmojiSpan[] emojiSpanArr = (Emoji.EmojiSpan[]) text.getSpans(0, text.length(), Emoji.EmojiSpan.class);
            for (int i11 = 0; i11 < emojiSpanArr.length; i11++) {
                emojiSpanArr[i11].replaceFontMetrics(getFontMetricsInt());
                emojiSpanArr[i11].scale = 0.85f;
            }
            for (a6 a6Var : (a6[]) text.getSpans(0, text.length(), a6.class)) {
                a6Var.replaceFontMetrics(getFontMetricsInt());
            }
            t2Var.invalidateForce();
        }
    }

    public void setMaxWidth(int i10) {
        this.f45658q0.setMaxWidth(i10);
    }

    public void setSwatch(qg.s1 s1Var) {
        this.f45659r0 = new qg.s1(s1Var.f44646b, s1Var.f44647c, s1Var.f44645a);
        r();
    }

    public void setText(CharSequence charSequence) {
        this.f45658q0.setText(charSequence);
        s();
    }

    public void setType(int i10) {
        this.f45660s0 = i10;
        r();
    }

    public void setTypeface(qg.l0 l0Var) {
        this.f45663v0 = l0Var;
        if (l0Var != null) {
            this.f45658q0.setTypeface(l0Var.d());
        }
        m();
    }

    public void setTypeface(String str) {
        Iterator it = qg.l0.c().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            qg.l0 l0Var = (qg.l0) it.next();
            if (l0Var.f44555a.equals(str)) {
                setTypeface(l0Var);
                str = null;
                break;
            }
        }
        this.A0 = str;
        m();
    }

    public u2(Context context, u2 u2Var, PointF pointF) {
        this(context, pointF, u2Var.f45661t0, u2Var.getText(), u2Var.getSwatch(), u2Var.f45660s0);
        setRotation(u2Var.getRotation());
        setScale(u2Var.getScale());
        setTypeface(u2Var.getTypeface());
        setAlign(u2Var.getAlign());
        int align = getAlign();
        int i10 = 2;
        this.f45658q0.setGravity(align != 1 ? align != 2 ? 19 : 21 : 17);
        int align2 = getAlign();
        if (align2 == 1) {
            i10 = 4;
        } else if (align2 == 2 ? !LocaleController.isRTL : LocaleController.isRTL) {
            i10 = 3;
        }
        this.f45658q0.setTextAlignment(i10);
    }
}
