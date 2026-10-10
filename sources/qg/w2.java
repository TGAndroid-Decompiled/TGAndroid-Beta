package qg;

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
import org.telegram.messenger.bi;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.b6;
import org.telegram.ui.Components.nl0;
import org.telegram.ui.ke0;
import w7.x5;
public final class w2 extends j {
    public String A0;
    public final v2 f46653q0;
    public pg.s1 f46654r0;
    public int f46655s0;
    public int f46656t0;
    public int f46657u0;
    public pg.k0 f46658v0;
    public int f46659w0;
    public int f46660x0;
    public Runnable f46661y0;
    public boolean f46662z0;

    public w2(Context context, PointF pointF, int i10, CharSequence charSequence, pg.s1 s1Var, int i11) {
        super(context, pointF);
        this.f46658v0 = pg.k0.f45714e;
        this.f46656t0 = i10;
        v2 v2Var = new v2(this, context);
        this.f46653q0 = v2Var;
        NotificationCenter.listenEmojiLoading(v2Var);
        v2Var.setGravity(19);
        v2Var.setBackgroundColor(0);
        v2Var.setPadding(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f));
        v2Var.setClickable(false);
        v2Var.setEnabled(false);
        v2Var.setCursorColor(-1);
        v2Var.setTextSize(0, this.f46656t0);
        v2Var.setCursorSize(AndroidUtilities.dp(this.f46656t0 * 0.4f));
        v2Var.setText(charSequence);
        s();
        v2Var.setTextColor(s1Var.f45822a);
        v2Var.setTypeface(null, 1);
        v2Var.setHorizontallyScrolling(false);
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 26) {
            v2Var.setImeOptions(285212672);
        } else {
            v2Var.setImeOptions(268435456);
        }
        v2Var.setFocusableInTouchMode(true);
        v2Var.setInputType(16384);
        v2Var.setSingleLine(false);
        addView(v2Var, x5.e(-2, -2, 51));
        if (i12 >= 29) {
            v2Var.setBreakStrategy(0);
        } else {
            v2Var.setBreakStrategy(0);
        }
        setSwatch(s1Var);
        setType(i11);
        k();
        v2Var.addTextChangedListener(new ke0(this));
    }

    @Override
    public final i a() {
        return new p0(this, getContext());
    }

    public int getAlign() {
        return this.f46657u0;
    }

    public int getBaseFontSize() {
        return this.f46656t0;
    }

    public b getEditText() {
        return this.f46653q0;
    }

    public View getFocusedView() {
        return this.f46653q0;
    }

    public Paint.FontMetricsInt getFontMetricsInt() {
        return this.f46653q0.getPaint().getFontMetricsInt();
    }

    public float getFontSize() {
        return this.f46653q0.getTextSize();
    }

    @Override
    public nl0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new Object();
        }
        float scaleX = viewGroup.getScaleX();
        float dp = (AndroidUtilities.dp(64.0f) / scaleX) + (getScale() * getMeasuredWidth());
        float dp2 = (AndroidUtilities.dp(52.0f) / scaleX) + (getScale() * getMeasuredHeight());
        float y3 = bi.y(dp, 2.0f, getPositionX(), scaleX);
        float positionY = getPositionY();
        v2 v2Var = this.f46653q0;
        return new nl0(y3, (positionY - (((dp2 - v2Var.getExtendedPaddingTop()) - AndroidUtilities.dpf2(4.0f)) / 2.0f)) * scaleX, ((dp * scaleX) + y3) - y3, (dp2 - v2Var.getExtendedPaddingBottom()) * scaleX);
    }

    @Override
    public float getStickyPaddingBottom() {
        RectF rectF = this.f46653q0.f46232w;
        if (rectF == null) {
            return 0.0f;
        }
        return rectF.bottom;
    }

    @Override
    public float getStickyPaddingLeft() {
        RectF rectF = this.f46653q0.f46232w;
        if (rectF == null) {
            return 0.0f;
        }
        return rectF.left;
    }

    @Override
    public float getStickyPaddingRight() {
        RectF rectF = this.f46653q0.f46232w;
        if (rectF == null) {
            return 0.0f;
        }
        return rectF.right;
    }

    @Override
    public float getStickyPaddingTop() {
        RectF rectF = this.f46653q0.f46232w;
        if (rectF == null) {
            return 0.0f;
        }
        return rectF.top;
    }

    public pg.s1 getSwatch() {
        return this.f46654r0;
    }

    public CharSequence getText() {
        return this.f46653q0.getText();
    }

    public int getTextSize() {
        return (int) this.f46653q0.getTextSize();
    }

    public int getType() {
        return this.f46655s0;
    }

    public pg.k0 getTypeface() {
        return this.f46658v0;
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
        v2 v2Var = this.f46653q0;
        v2Var.setEnabled(true);
        v2Var.setClickable(true);
        v2Var.requestFocus();
        v2Var.setSelection(v2Var.getText().length());
        AndroidUtilities.runOnUIThread(new org.telegram.ui.web.q0(this, 18), 300L);
    }

    public final void r() {
        int i10;
        v2 v2Var = this.f46653q0;
        v2Var.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        int i11 = this.f46654r0.f45822a;
        int i12 = this.f46655s0;
        int i13 = -1;
        if (i12 == 0) {
            v2Var.setFrameColor(i11);
            i11 = AndroidUtilities.computePerceivedBrightness(this.f46654r0.f45822a) >= 0.721f ? -16777216 : -1;
        } else if (i12 == 1) {
            if (AndroidUtilities.computePerceivedBrightness(i11) >= 0.25f) {
                i10 = -1728053248;
            } else {
                i10 = -1711276033;
            }
            v2Var.setFrameColor(i10);
        } else if (i12 == 2) {
            if (AndroidUtilities.computePerceivedBrightness(i11) >= 0.25f) {
                i13 = -16777216;
            }
            v2Var.setFrameColor(i13);
        } else {
            v2Var.setFrameColor(0);
        }
        v2Var.setTextColor(i11);
        v2Var.setCursorColor(i11);
        v2Var.setHandlesColor(i11);
        v2Var.setHighlightColor(i6.m1(0.4f, i11));
    }

    public final void s() {
        v2 v2Var = this.f46653q0;
        if (v2Var.getText().length() <= 0) {
            v2Var.setHint(LocaleController.getString(R.string.TextPlaceholder));
            v2Var.setHintTextColor(1627389951);
            return;
        }
        v2Var.setHint((CharSequence) null);
    }

    public void setAlign(int i10) {
        this.f46657u0 = i10;
    }

    public void setBaseFontSize(int i10) {
        this.f46656t0 = i10;
        float f7 = i10;
        v2 v2Var = this.f46653q0;
        v2Var.setTextSize(0, f7);
        v2Var.setCursorSize(AndroidUtilities.dp(f7 * 0.4f));
        if (v2Var.getText() != null) {
            Editable text = v2Var.getText();
            Emoji.EmojiSpan[] emojiSpanArr = (Emoji.EmojiSpan[]) text.getSpans(0, text.length(), Emoji.EmojiSpan.class);
            for (int i11 = 0; i11 < emojiSpanArr.length; i11++) {
                emojiSpanArr[i11].replaceFontMetrics(getFontMetricsInt());
                emojiSpanArr[i11].scale = 0.85f;
            }
            for (b6 b6Var : (b6[]) text.getSpans(0, text.length(), b6.class)) {
                b6Var.replaceFontMetrics(getFontMetricsInt());
            }
            v2Var.invalidateForce();
        }
    }

    public void setMaxWidth(int i10) {
        this.f46653q0.setMaxWidth(i10);
    }

    public void setSwatch(pg.s1 s1Var) {
        this.f46654r0 = new pg.s1(s1Var.f45823b, s1Var.f45824c, s1Var.f45822a);
        r();
    }

    public void setText(CharSequence charSequence) {
        this.f46653q0.setText(charSequence);
        s();
    }

    public void setType(int i10) {
        this.f46655s0 = i10;
        r();
    }

    public void setTypeface(pg.k0 k0Var) {
        this.f46658v0 = k0Var;
        if (k0Var != null) {
            this.f46653q0.setTypeface(k0Var.d());
        }
        m();
    }

    public void setTypeface(String str) {
        Iterator it = pg.k0.c().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            pg.k0 k0Var = (pg.k0) it.next();
            if (k0Var.f45718a.equals(str)) {
                setTypeface(k0Var);
                str = null;
                break;
            }
        }
        this.A0 = str;
        m();
    }

    public w2(Context context, w2 w2Var, PointF pointF) {
        this(context, pointF, w2Var.f46656t0, w2Var.getText(), w2Var.getSwatch(), w2Var.f46655s0);
        setRotation(w2Var.getRotation());
        setScale(w2Var.getScale());
        setTypeface(w2Var.getTypeface());
        setAlign(w2Var.getAlign());
        int align = getAlign();
        int i10 = 2;
        this.f46653q0.setGravity(align != 1 ? align != 2 ? 19 : 21 : 17);
        int align2 = getAlign();
        if (align2 == 1) {
            i10 = 4;
        } else if (align2 == 2 ? !LocaleController.isRTL : LocaleController.isRTL) {
            i10 = 3;
        }
        this.f46653q0.setTextAlignment(i10);
    }
}
