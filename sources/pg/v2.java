package pg;

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
import org.telegram.messenger.em;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.rk0;
import org.telegram.ui.Components.y5;
import org.telegram.ui.le0;
import w7.a6;
public final class v2 extends j {
    public String A0;
    public final u2 f40322q0;
    public og.v1 f40323r0;
    public int f40324s0;
    public int f40325t0;
    public int f40326u0;
    public og.m0 f40327v0;
    public int f40328w0;
    public int f40329x0;
    public Runnable f40330y0;
    public boolean f40331z0;

    public v2(Context context, PointF pointF, int i10, CharSequence charSequence, og.v1 v1Var, int i11) {
        super(context, pointF);
        this.f40327v0 = og.m0.e;
        this.f40325t0 = i10;
        u2 u2Var = new u2(this, context);
        this.f40322q0 = u2Var;
        NotificationCenter.listenEmojiLoading(u2Var);
        u2Var.setGravity(19);
        u2Var.setBackgroundColor(0);
        u2Var.setPadding(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f));
        u2Var.setClickable(false);
        u2Var.setEnabled(false);
        u2Var.setCursorColor(-1);
        u2Var.setTextSize(0, this.f40325t0);
        u2Var.setCursorSize(AndroidUtilities.dp(this.f40325t0 * 0.4f));
        u2Var.setText(charSequence);
        s();
        u2Var.setTextColor(v1Var.f14534a);
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
        addView(u2Var, a6.e(-2, -2, 51));
        if (i12 >= 29) {
            u2Var.setBreakStrategy(0);
        } else if (i12 >= 23) {
            u2Var.setBreakStrategy(0);
        }
        setSwatch(v1Var);
        setType(i11);
        k();
        u2Var.addTextChangedListener(new le0(this));
    }

    @Override
    public final i a() {
        return new p0(this, getContext());
    }

    public int getAlign() {
        return this.f40326u0;
    }

    public int getBaseFontSize() {
        return this.f40325t0;
    }

    public b getEditText() {
        return this.f40322q0;
    }

    public View getFocusedView() {
        return this.f40322q0;
    }

    public Paint.FontMetricsInt getFontMetricsInt() {
        return this.f40322q0.getPaint().getFontMetricsInt();
    }

    public float getFontSize() {
        return this.f40322q0.getTextSize();
    }

    @Override
    public rk0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new Object();
        }
        float scaleX = viewGroup.getScaleX();
        float dp = (AndroidUtilities.dp(64.0f) / scaleX) + (getScale() * getMeasuredWidth());
        float dp2 = (AndroidUtilities.dp(52.0f) / scaleX) + (getScale() * getMeasuredHeight());
        float u10 = em.u(dp, 2.0f, getPositionX(), scaleX);
        float positionY = getPositionY();
        u2 u2Var = this.f40322q0;
        return new rk0(u10, (positionY - (((dp2 - u2Var.getExtendedPaddingTop()) - AndroidUtilities.dpf2(4.0f)) / 2.0f)) * scaleX, ((dp * scaleX) + u10) - u10, (dp2 - u2Var.getExtendedPaddingBottom()) * scaleX);
    }

    @Override
    public float getStickyPaddingBottom() {
        RectF rectF = this.f40322q0.f39950w;
        if (rectF == null) {
            return 0.0f;
        }
        return rectF.bottom;
    }

    @Override
    public float getStickyPaddingLeft() {
        RectF rectF = this.f40322q0.f39950w;
        if (rectF == null) {
            return 0.0f;
        }
        return rectF.left;
    }

    @Override
    public float getStickyPaddingRight() {
        RectF rectF = this.f40322q0.f39950w;
        if (rectF == null) {
            return 0.0f;
        }
        return rectF.right;
    }

    @Override
    public float getStickyPaddingTop() {
        RectF rectF = this.f40322q0.f39950w;
        if (rectF == null) {
            return 0.0f;
        }
        return rectF.top;
    }

    public og.v1 getSwatch() {
        return this.f40323r0;
    }

    public CharSequence getText() {
        return this.f40322q0.getText();
    }

    public int getTextSize() {
        return (int) this.f40322q0.getTextSize();
    }

    public int getType() {
        return this.f40324s0;
    }

    public og.m0 getTypeface() {
        return this.f40327v0;
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
        u2 u2Var = this.f40322q0;
        u2Var.setEnabled(true);
        u2Var.setClickable(true);
        u2Var.requestFocus();
        u2Var.setSelection(u2Var.getText().length());
        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.voip.x(this, 24), 300L);
    }

    public final void r() {
        int i10;
        u2 u2Var = this.f40322q0;
        u2Var.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        int i11 = this.f40323r0.f14534a;
        int i12 = this.f40324s0;
        int i13 = -1;
        if (i12 == 0) {
            u2Var.setFrameColor(i11);
            i11 = AndroidUtilities.computePerceivedBrightness(this.f40323r0.f14534a) >= 0.721f ? -16777216 : -1;
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
        u2Var.setHighlightColor(j6.l1(0.4f, i11));
    }

    public final void s() {
        u2 u2Var = this.f40322q0;
        if (u2Var.getText().length() <= 0) {
            u2Var.setHint(LocaleController.getString(R.string.TextPlaceholder));
            u2Var.setHintTextColor(1627389951);
            return;
        }
        u2Var.setHint((CharSequence) null);
    }

    public void setAlign(int i10) {
        this.f40326u0 = i10;
    }

    public void setBaseFontSize(int i10) {
        this.f40325t0 = i10;
        float f7 = i10;
        u2 u2Var = this.f40322q0;
        u2Var.setTextSize(0, f7);
        u2Var.setCursorSize(AndroidUtilities.dp(f7 * 0.4f));
        if (u2Var.getText() != null) {
            Editable text = u2Var.getText();
            Emoji.EmojiSpan[] emojiSpanArr = (Emoji.EmojiSpan[]) text.getSpans(0, text.length(), Emoji.EmojiSpan.class);
            for (int i11 = 0; i11 < emojiSpanArr.length; i11++) {
                emojiSpanArr[i11].replaceFontMetrics(getFontMetricsInt());
                emojiSpanArr[i11].scale = 0.85f;
            }
            for (y5 y5Var : (y5[]) text.getSpans(0, text.length(), y5.class)) {
                y5Var.replaceFontMetrics(getFontMetricsInt());
            }
            u2Var.invalidateForce();
        }
    }

    public void setMaxWidth(int i10) {
        this.f40322q0.setMaxWidth(i10);
    }

    public void setSwatch(og.v1 v1Var) {
        this.f40323r0 = new og.v1(v1Var.f14535b, v1Var.f14536c, v1Var.f14534a);
        r();
    }

    public void setText(CharSequence charSequence) {
        this.f40322q0.setText(charSequence);
        s();
    }

    public void setType(int i10) {
        this.f40324s0 = i10;
        r();
    }

    public void setTypeface(og.m0 m0Var) {
        this.f40327v0 = m0Var;
        if (m0Var != null) {
            this.f40322q0.setTypeface(m0Var.d());
        }
        m();
    }

    public void setTypeface(String str) {
        Iterator it = og.m0.c().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            og.m0 m0Var = (og.m0) it.next();
            if (m0Var.f14424a.equals(str)) {
                setTypeface(m0Var);
                str = null;
                break;
            }
        }
        this.A0 = str;
        m();
    }

    public v2(Context context, v2 v2Var, PointF pointF) {
        this(context, pointF, v2Var.f40325t0, v2Var.getText(), v2Var.getSwatch(), v2Var.f40324s0);
        setRotation(v2Var.getRotation());
        setScale(v2Var.getScale());
        setTypeface(v2Var.getTypeface());
        setAlign(v2Var.getAlign());
        int align = getAlign();
        int i10 = 2;
        this.f40322q0.setGravity(align != 1 ? align != 2 ? 19 : 21 : 17);
        int align2 = getAlign();
        if (align2 == 1) {
            i10 = 4;
        } else if (align2 == 2 ? !LocaleController.isRTL : LocaleController.isRTL) {
            i10 = 3;
        }
        this.f40322q0.setTextAlignment(i10);
    }
}
