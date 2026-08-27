package zf;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Build;
import android.text.Editable;
import android.view.View;
import android.view.ViewGroup;
import h7.z5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.rl;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.t5;
import org.telegram.ui.Components.yj0;
import org.telegram.ui.xd0;

public final class v2 extends j {
    public final u2 m0;

    public yf.p1 f50734n0;

    public int f50735o0;

    public int f50736p0;

    public int f50737q0;

    public yf.i0 f50738r0;

    public int f50739s0;

    public int f50740t0;

    public Runnable f50741u0;

    public boolean f50742v0;

    public String f50743w0;

    public v2(Context context, PointF pointF, int i10, CharSequence charSequence, yf.p1 p1Var, int i11) {
        super(context, pointF);
        this.f50738r0 = yf.i0.f49944e;
        this.f50736p0 = i10;
        u2 u2Var = new u2(this, context);
        this.m0 = u2Var;
        NotificationCenter.listenEmojiLoading(u2Var);
        u2Var.setGravity(19);
        u2Var.setBackgroundColor(0);
        u2Var.setPadding(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f));
        u2Var.setClickable(false);
        u2Var.setEnabled(false);
        u2Var.setCursorColor(-1);
        u2Var.setTextSize(0, this.f50736p0);
        u2Var.setCursorSize(AndroidUtilities.dp(this.f50736p0 * 0.4f));
        u2Var.setText(charSequence);
        s();
        u2Var.setTextColor(p1Var.f50034a);
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
        if (i12 >= 29 || i12 >= 23) {
            u2Var.setBreakStrategy(0);
        }
        setSwatch(p1Var);
        setType(i11);
        k();
        u2Var.addTextChangedListener(new xd0(this));
    }

    @Override
    public final i a() {
        return new o0(this, getContext());
    }

    public int getAlign() {
        return this.f50737q0;
    }

    public int getBaseFontSize() {
        return this.f50736p0;
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
    public yj0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new yj0();
        }
        float scaleX = viewGroup.getScaleX();
        float fDp = (AndroidUtilities.dp(64.0f) / scaleX) + (getScale() * getMeasuredWidth());
        float fDp2 = (AndroidUtilities.dp(52.0f) / scaleX) + (getScale() * getMeasuredHeight());
        float fT = rl.t(fDp, 2.0f, getPositionX(), scaleX);
        float positionY = getPositionY();
        u2 u2Var = this.m0;
        return new yj0(fT, (positionY - (((fDp2 - u2Var.getExtendedPaddingTop()) - AndroidUtilities.dpf2(4.0f)) / 2.0f)) * scaleX, ((fDp * scaleX) + fT) - fT, (fDp2 - u2Var.getExtendedPaddingBottom()) * scaleX);
    }

    @Override
    public float getStickyPaddingBottom() {
        RectF rectF = this.m0.f50345w;
        if (rectF == null) {
            return 0.0f;
        }
        return rectF.bottom;
    }

    @Override
    public float getStickyPaddingLeft() {
        RectF rectF = this.m0.f50345w;
        if (rectF == null) {
            return 0.0f;
        }
        return rectF.left;
    }

    @Override
    public float getStickyPaddingRight() {
        RectF rectF = this.m0.f50345w;
        if (rectF == null) {
            return 0.0f;
        }
        return rectF.right;
    }

    @Override
    public float getStickyPaddingTop() {
        RectF rectF = this.m0.f50345w;
        if (rectF == null) {
            return 0.0f;
        }
        return rectF.top;
    }

    public yf.p1 getSwatch() {
        return this.f50734n0;
    }

    public CharSequence getText() {
        return this.m0.getText();
    }

    public int getTextSize() {
        return (int) this.m0.getTextSize();
    }

    public int getType() {
        return this.f50735o0;
    }

    public yf.i0 getTypeface() {
        return this.f50738r0;
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
        u2 u2Var = this.m0;
        u2Var.setEnabled(true);
        u2Var.setClickable(true);
        u2Var.requestFocus();
        u2Var.setSelection(u2Var.getText().length());
        AndroidUtilities.runOnUIThread(new qf.b(this, 27), 300L);
    }

    public final void r() {
        u2 u2Var = this.m0;
        u2Var.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        int i10 = this.f50734n0.f50034a;
        int i11 = this.f50735o0;
        if (i11 == 0) {
            u2Var.setFrameColor(i10);
            i10 = AndroidUtilities.computePerceivedBrightness(this.f50734n0.f50034a) >= 0.721f ? -16777216 : -1;
        } else if (i11 == 1) {
            u2Var.setFrameColor(AndroidUtilities.computePerceivedBrightness(i10) >= 0.25f ? -1728053248 : -1711276033);
        } else if (i11 == 2) {
            u2Var.setFrameColor(AndroidUtilities.computePerceivedBrightness(i10) >= 0.25f ? -16777216 : -1);
        } else {
            u2Var.setFrameColor(0);
        }
        u2Var.setTextColor(i10);
        u2Var.setCursorColor(i10);
        u2Var.setHandlesColor(i10);
        u2Var.setHighlightColor(g6.l1(0.4f, i10));
    }

    public final void s() {
        u2 u2Var = this.m0;
        if (u2Var.getText().length() > 0) {
            u2Var.setHint((CharSequence) null);
        } else {
            u2Var.setHint(LocaleController.getString(R.string.TextPlaceholder));
            u2Var.setHintTextColor(1627389951);
        }
    }

    public void setAlign(int i10) {
        this.f50737q0 = i10;
    }

    public void setBaseFontSize(int i10) {
        this.f50736p0 = i10;
        float f10 = i10;
        u2 u2Var = this.m0;
        u2Var.setTextSize(0, f10);
        u2Var.setCursorSize(AndroidUtilities.dp(f10 * 0.4f));
        if (u2Var.getText() != null) {
            Editable text = u2Var.getText();
            Emoji.EmojiSpan[] emojiSpanArr = (Emoji.EmojiSpan[]) text.getSpans(0, text.length(), Emoji.EmojiSpan.class);
            for (int i11 = 0; i11 < emojiSpanArr.length; i11++) {
                emojiSpanArr[i11].replaceFontMetrics(getFontMetricsInt());
                emojiSpanArr[i11].scale = 0.85f;
            }
            for (t5 t5Var : (t5[]) text.getSpans(0, text.length(), t5.class)) {
                t5Var.replaceFontMetrics(getFontMetricsInt());
            }
            u2Var.invalidateForce();
        }
    }

    public void setMaxWidth(int i10) {
        this.m0.setMaxWidth(i10);
    }

    public void setSwatch(yf.p1 p1Var) {
        this.f50734n0 = new yf.p1(p1Var.f50035b, p1Var.f50036c, p1Var.f50034a);
        r();
    }

    public void setText(CharSequence charSequence) {
        this.m0.setText(charSequence);
        s();
    }

    public void setType(int i10) {
        this.f50735o0 = i10;
        r();
    }

    public void setTypeface(yf.i0 i0Var) {
        this.f50738r0 = i0Var;
        if (i0Var != null) {
            this.m0.setTypeface(i0Var.d());
        }
        m();
    }

    public void setTypeface(String str) {
        for (yf.i0 i0Var : yf.i0.c()) {
            if (i0Var.f49948a.equals(str)) {
                setTypeface(i0Var);
                str = null;
                break;
            }
        }
        this.f50743w0 = str;
        m();
    }

    public v2(Context context, v2 v2Var, PointF pointF) {
        this(context, pointF, v2Var.f50736p0, v2Var.getText(), v2Var.getSwatch(), v2Var.f50735o0);
        setRotation(v2Var.getRotation());
        setScale(v2Var.getScale());
        setTypeface(v2Var.getTypeface());
        setAlign(v2Var.getAlign());
        int align = getAlign();
        int i10 = 2;
        this.m0.setGravity(align != 1 ? align != 2 ? 19 : 21 : 17);
        int align2 = getAlign();
        if (align2 == 1) {
            i10 = 4;
        } else if (align2 == 2 ? !LocaleController.isRTL : LocaleController.isRTL) {
            i10 = 3;
        }
        this.m0.setTextAlignment(i10);
    }
}
