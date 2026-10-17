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
import org.telegram.messenger.wh;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.a6;
import org.telegram.ui.Components.el0;
import org.telegram.ui.td0;
import w7.z5;
public final class v2 extends j {
    public String A0;
    public final u2 f45687q0;
    public qg.s1 f45688r0;
    public int f45689s0;
    public int f45690t0;
    public int f45691u0;
    public qg.l0 f45692v0;
    public int f45693w0;
    public int f45694x0;
    public Runnable f45695y0;
    public boolean f45696z0;

    public v2(Context context, PointF pointF, int i10, CharSequence charSequence, qg.s1 s1Var, int i11) {
        super(context, pointF);
        this.f45692v0 = qg.l0.e;
        this.f45690t0 = i10;
        u2 u2Var = new u2(this, context);
        this.f45687q0 = u2Var;
        NotificationCenter.listenEmojiLoading(u2Var);
        u2Var.setGravity(19);
        u2Var.setBackgroundColor(0);
        u2Var.setPadding(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f));
        u2Var.setClickable(false);
        u2Var.setEnabled(false);
        u2Var.setCursorColor(-1);
        u2Var.setTextSize(0, this.f45690t0);
        u2Var.setCursorSize(AndroidUtilities.dp(this.f45690t0 * 0.4f));
        u2Var.setText(charSequence);
        s();
        u2Var.setTextColor(s1Var.f44667a);
        u2Var.setTypeface(null, 1);
        u2Var.setHorizontallyScrolling(false);
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 26) {
            u2Var.setImeOptions(285212672);
        } else {
            u2Var.setImeOptions(268435456);
        }
        u2Var.setFocusableInTouchMode(true);
        u2Var.setInputType(16384);
        u2Var.setSingleLine(false);
        addView(u2Var, z5.e(-2, -2, 51));
        if (i12 >= 29) {
            u2Var.setBreakStrategy(0);
        } else {
            u2Var.setBreakStrategy(0);
        }
        setSwatch(s1Var);
        setType(i11);
        k();
        u2Var.addTextChangedListener(new td0(this));
    }

    @Override
    public final i a() {
        return new p0(this, getContext());
    }

    public int getAlign() {
        return this.f45691u0;
    }

    public int getBaseFontSize() {
        return this.f45690t0;
    }

    public b getEditText() {
        return this.f45687q0;
    }

    public View getFocusedView() {
        return this.f45687q0;
    }

    public Paint.FontMetricsInt getFontMetricsInt() {
        return this.f45687q0.getPaint().getFontMetricsInt();
    }

    public float getFontSize() {
        return this.f45687q0.getTextSize();
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
        float A = wh.A(dp, 2.0f, getPositionX(), scaleX);
        float positionY = getPositionY();
        u2 u2Var = this.f45687q0;
        return new el0(A, (positionY - (((dp2 - u2Var.getExtendedPaddingTop()) - AndroidUtilities.dpf2(4.0f)) / 2.0f)) * scaleX, ((dp * scaleX) + A) - A, (dp2 - u2Var.getExtendedPaddingBottom()) * scaleX);
    }

    @Override
    public float getStickyPaddingBottom() {
        RectF rectF = this.f45687q0.f45319w;
        if (rectF == null) {
            return 0.0f;
        }
        return rectF.bottom;
    }

    @Override
    public float getStickyPaddingLeft() {
        RectF rectF = this.f45687q0.f45319w;
        if (rectF == null) {
            return 0.0f;
        }
        return rectF.left;
    }

    @Override
    public float getStickyPaddingRight() {
        RectF rectF = this.f45687q0.f45319w;
        if (rectF == null) {
            return 0.0f;
        }
        return rectF.right;
    }

    @Override
    public float getStickyPaddingTop() {
        RectF rectF = this.f45687q0.f45319w;
        if (rectF == null) {
            return 0.0f;
        }
        return rectF.top;
    }

    public qg.s1 getSwatch() {
        return this.f45688r0;
    }

    public CharSequence getText() {
        return this.f45687q0.getText();
    }

    public int getTextSize() {
        return (int) this.f45687q0.getTextSize();
    }

    public int getType() {
        return this.f45689s0;
    }

    public qg.l0 getTypeface() {
        return this.f45692v0;
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
        u2 u2Var = this.f45687q0;
        u2Var.setEnabled(true);
        u2Var.setClickable(true);
        u2Var.requestFocus();
        u2Var.setSelection(u2Var.getText().length());
        AndroidUtilities.runOnUIThread(new org.telegram.ui.web.z1(this, 15), 300L);
    }

    public final void r() {
        int i10;
        u2 u2Var = this.f45687q0;
        u2Var.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        int i11 = this.f45688r0.f44667a;
        int i12 = this.f45689s0;
        int i13 = -1;
        if (i12 == 0) {
            u2Var.setFrameColor(i11);
            i11 = AndroidUtilities.computePerceivedBrightness(this.f45688r0.f44667a) >= 0.721f ? -16777216 : -1;
        } else if (i12 == 1) {
            if (AndroidUtilities.computePerceivedBrightness(i11) >= 0.25f) {
                i10 = -1728053248;
            } else {
                i10 = -1711276033;
            }
            u2Var.setFrameColor(i10);
        } else if (i12 == 2) {
            if (AndroidUtilities.computePerceivedBrightness(i11) >= 0.25f) {
                i13 = -16777216;
            }
            u2Var.setFrameColor(i13);
        } else {
            u2Var.setFrameColor(0);
        }
        u2Var.setTextColor(i11);
        u2Var.setCursorColor(i11);
        u2Var.setHandlesColor(i11);
        u2Var.setHighlightColor(h6.m1(0.4f, i11));
    }

    public final void s() {
        u2 u2Var = this.f45687q0;
        if (u2Var.getText().length() <= 0) {
            u2Var.setHint(LocaleController.getString(R.string.TextPlaceholder));
            u2Var.setHintTextColor(1627389951);
            return;
        }
        u2Var.setHint((CharSequence) null);
    }

    public void setAlign(int i10) {
        this.f45691u0 = i10;
    }

    public void setBaseFontSize(int i10) {
        this.f45690t0 = i10;
        float f7 = i10;
        u2 u2Var = this.f45687q0;
        u2Var.setTextSize(0, f7);
        u2Var.setCursorSize(AndroidUtilities.dp(f7 * 0.4f));
        if (u2Var.getText() != null) {
            Editable text = u2Var.getText();
            Emoji.EmojiSpan[] emojiSpanArr = (Emoji.EmojiSpan[]) text.getSpans(0, text.length(), Emoji.EmojiSpan.class);
            for (int i11 = 0; i11 < emojiSpanArr.length; i11++) {
                emojiSpanArr[i11].replaceFontMetrics(getFontMetricsInt());
                emojiSpanArr[i11].scale = 0.85f;
            }
            for (a6 a6Var : (a6[]) text.getSpans(0, text.length(), a6.class)) {
                a6Var.replaceFontMetrics(getFontMetricsInt());
            }
            u2Var.invalidateForce();
        }
    }

    public void setMaxWidth(int i10) {
        this.f45687q0.setMaxWidth(i10);
    }

    public void setSwatch(qg.s1 s1Var) {
        this.f45688r0 = new qg.s1(s1Var.f44668b, s1Var.f44669c, s1Var.f44667a);
        r();
    }

    public void setText(CharSequence charSequence) {
        this.f45687q0.setText(charSequence);
        s();
    }

    public void setType(int i10) {
        this.f45689s0 = i10;
        r();
    }

    public void setTypeface(qg.l0 l0Var) {
        this.f45692v0 = l0Var;
        if (l0Var != null) {
            this.f45687q0.setTypeface(l0Var.d());
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
            if (l0Var.f44579a.equals(str)) {
                setTypeface(l0Var);
                str = null;
                break;
            }
        }
        this.A0 = str;
        m();
    }

    public v2(Context context, v2 v2Var, PointF pointF) {
        this(context, pointF, v2Var.f45690t0, v2Var.getText(), v2Var.getSwatch(), v2Var.f45689s0);
        setRotation(v2Var.getRotation());
        setScale(v2Var.getScale());
        setTypeface(v2Var.getTypeface());
        setAlign(v2Var.getAlign());
        int align = getAlign();
        int i10 = 2;
        this.f45687q0.setGravity(align != 1 ? align != 2 ? 19 : 21 : 17);
        int align2 = getAlign();
        if (align2 == 1) {
            i10 = 4;
        } else if (align2 == 2 ? !LocaleController.isRTL : LocaleController.isRTL) {
            i10 = 3;
        }
        this.f45687q0.setTextAlignment(i10);
    }
}
