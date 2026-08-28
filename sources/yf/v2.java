package yf;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Build;
import android.text.Editable;
import android.view.View;
import android.view.ViewGroup;
import g7.e6;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.ll;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.t5;
import org.telegram.ui.Components.wj0;
import org.telegram.ui.ud0;
public final class v2 extends j {
    public final u2 m0;
    public xf.q1 f50139n0;
    public int f50140o0;
    public int f50141p0;
    public int f50142q0;
    public xf.i0 f50143r0;
    public int f50144s0;
    public int f50145t0;
    public Runnable f50146u0;
    public boolean f50147v0;
    public String f50148w0;

    public v2(Context context, PointF pointF, int i9, CharSequence charSequence, xf.q1 q1Var, int i10) {
        super(context, pointF);
        this.f50143r0 = xf.i0.f49236e;
        this.f50141p0 = i9;
        u2 u2Var = new u2(this, context);
        this.m0 = u2Var;
        NotificationCenter.listenEmojiLoading(u2Var);
        u2Var.setGravity(19);
        u2Var.setBackgroundColor(0);
        u2Var.setPadding(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f));
        u2Var.setClickable(false);
        u2Var.setEnabled(false);
        u2Var.setCursorColor(-1);
        u2Var.setTextSize(0, this.f50141p0);
        u2Var.setCursorSize(AndroidUtilities.dp(this.f50141p0 * 0.4f));
        u2Var.setText(charSequence);
        s();
        u2Var.setTextColor(q1Var.f49333a);
        u2Var.setTypeface(null, 1);
        u2Var.setHorizontallyScrolling(false);
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 26) {
            u2Var.setImeOptions(285212672);
        } else {
            u2Var.setImeOptions(268435456);
        }
        u2Var.setFocusableInTouchMode(true);
        u2Var.setInputType(16384);
        u2Var.setSingleLine(false);
        addView(u2Var, e6.e(-2, -2, 51));
        if (i11 >= 29) {
            u2Var.setBreakStrategy(0);
        } else if (i11 >= 23) {
            u2Var.setBreakStrategy(0);
        }
        setSwatch(q1Var);
        setType(i10);
        k();
        u2Var.addTextChangedListener(new ud0(this));
    }

    @Override
    public final i a() {
        return new o0(this, getContext());
    }

    public int getAlign() {
        return this.f50142q0;
    }

    public int getBaseFontSize() {
        return this.f50141p0;
    }

    public b getEditText() {
        return this.m0;
    }

    public View getFocusedView() {
        return this.m0;
    }

    public Paint.FontMetricsInt getFontMetricsInt() {
        return this.m0.getPaint().getFontMetricsInt();
    }

    public float getFontSize() {
        return this.m0.getTextSize();
    }

    @Override
    public wj0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new Object();
        }
        float scaleX = viewGroup.getScaleX();
        float dp = (AndroidUtilities.dp(64.0f) / scaleX) + (getScale() * getMeasuredWidth());
        float dp2 = (AndroidUtilities.dp(52.0f) / scaleX) + (getScale() * getMeasuredHeight());
        float v = ll.v(dp, 2.0f, getPositionX(), scaleX);
        float positionY = getPositionY();
        u2 u2Var = this.m0;
        return new wj0(v, (positionY - (((dp2 - u2Var.getExtendedPaddingTop()) - AndroidUtilities.dpf2(4.0f)) / 2.0f)) * scaleX, ((dp * scaleX) + v) - v, (dp2 - u2Var.getExtendedPaddingBottom()) * scaleX);
    }

    @Override
    public float getStickyPaddingBottom() {
        RectF rectF = this.m0.f49757w;
        if (rectF == null) {
            return 0.0f;
        }
        return rectF.bottom;
    }

    @Override
    public float getStickyPaddingLeft() {
        RectF rectF = this.m0.f49757w;
        if (rectF == null) {
            return 0.0f;
        }
        return rectF.left;
    }

    @Override
    public float getStickyPaddingRight() {
        RectF rectF = this.m0.f49757w;
        if (rectF == null) {
            return 0.0f;
        }
        return rectF.right;
    }

    @Override
    public float getStickyPaddingTop() {
        RectF rectF = this.m0.f49757w;
        if (rectF == null) {
            return 0.0f;
        }
        return rectF.top;
    }

    public xf.q1 getSwatch() {
        return this.f50139n0;
    }

    public CharSequence getText() {
        return this.m0.getText();
    }

    public int getTextSize() {
        return (int) this.m0.getTextSize();
    }

    public int getType() {
        return this.f50140o0;
    }

    public xf.i0 getTypeface() {
        return this.f50143r0;
    }

    @Override
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        super.onLayout(z10, i9, i10, i11, i12);
        k();
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(i9, i10);
        k();
    }

    public final void q() {
        u2 u2Var = this.m0;
        u2Var.setEnabled(true);
        u2Var.setClickable(true);
        u2Var.requestFocus();
        u2Var.setSelection(u2Var.getText().length());
        AndroidUtilities.runOnUIThread(new pf.o1(this, 20), 300L);
    }

    public final void r() {
        int i9;
        u2 u2Var = this.m0;
        u2Var.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        int i10 = this.f50139n0.f49333a;
        int i11 = this.f50140o0;
        int i12 = -1;
        if (i11 == 0) {
            u2Var.setFrameColor(i10);
            i10 = AndroidUtilities.computePerceivedBrightness(this.f50139n0.f49333a) >= 0.721f ? -16777216 : -1;
        } else if (i11 == 1) {
            if (AndroidUtilities.computePerceivedBrightness(i10) >= 0.25f) {
                i9 = -1728053248;
            } else {
                i9 = -1711276033;
            }
            u2Var.setFrameColor(i9);
        } else if (i11 == 2) {
            if (AndroidUtilities.computePerceivedBrightness(i10) >= 0.25f) {
                i12 = -16777216;
            }
            u2Var.setFrameColor(i12);
        } else {
            u2Var.setFrameColor(0);
        }
        u2Var.setTextColor(i10);
        u2Var.setCursorColor(i10);
        u2Var.setHandlesColor(i10);
        u2Var.setHighlightColor(f6.l1(0.4f, i10));
    }

    public final void s() {
        u2 u2Var = this.m0;
        if (u2Var.getText().length() <= 0) {
            u2Var.setHint(LocaleController.getString(R.string.TextPlaceholder));
            u2Var.setHintTextColor(1627389951);
            return;
        }
        u2Var.setHint((CharSequence) null);
    }

    public void setAlign(int i9) {
        this.f50142q0 = i9;
    }

    public void setBaseFontSize(int i9) {
        this.f50141p0 = i9;
        float f10 = i9;
        u2 u2Var = this.m0;
        u2Var.setTextSize(0, f10);
        u2Var.setCursorSize(AndroidUtilities.dp(f10 * 0.4f));
        if (u2Var.getText() != null) {
            Editable text = u2Var.getText();
            Emoji.EmojiSpan[] emojiSpanArr = (Emoji.EmojiSpan[]) text.getSpans(0, text.length(), Emoji.EmojiSpan.class);
            for (int i10 = 0; i10 < emojiSpanArr.length; i10++) {
                emojiSpanArr[i10].replaceFontMetrics(getFontMetricsInt());
                emojiSpanArr[i10].scale = 0.85f;
            }
            for (t5 t5Var : (t5[]) text.getSpans(0, text.length(), t5.class)) {
                t5Var.replaceFontMetrics(getFontMetricsInt());
            }
            u2Var.invalidateForce();
        }
    }

    public void setMaxWidth(int i9) {
        this.m0.setMaxWidth(i9);
    }

    public void setSwatch(xf.q1 q1Var) {
        this.f50139n0 = new xf.q1(q1Var.f49334b, q1Var.f49335c, q1Var.f49333a);
        r();
    }

    public void setText(CharSequence charSequence) {
        this.m0.setText(charSequence);
        s();
    }

    public void setType(int i9) {
        this.f50140o0 = i9;
        r();
    }

    public void setTypeface(xf.i0 i0Var) {
        this.f50143r0 = i0Var;
        if (i0Var != null) {
            this.m0.setTypeface(i0Var.d());
        }
        m();
    }

    public void setTypeface(String str) {
        Iterator it = xf.i0.c().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            xf.i0 i0Var = (xf.i0) it.next();
            if (i0Var.f49240a.equals(str)) {
                setTypeface(i0Var);
                str = null;
                break;
            }
        }
        this.f50148w0 = str;
        m();
    }

    public v2(Context context, v2 v2Var, PointF pointF) {
        this(context, pointF, v2Var.f50141p0, v2Var.getText(), v2Var.getSwatch(), v2Var.f50140o0);
        setRotation(v2Var.getRotation());
        setScale(v2Var.getScale());
        setTypeface(v2Var.getTypeface());
        setAlign(v2Var.getAlign());
        int align = getAlign();
        int i9 = 2;
        this.m0.setGravity(align != 1 ? align != 2 ? 19 : 21 : 17);
        int align2 = getAlign();
        if (align2 == 1) {
            i9 = 4;
        } else if (align2 == 2 ? !LocaleController.isRTL : LocaleController.isRTL) {
            i9 = 3;
        }
        this.m0.setTextAlignment(i9);
    }
}
