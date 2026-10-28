package sg;

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
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.c6;
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.vd0;
public final class w2 extends j {
    public String A0;
    public final v2 f48588q0;
    public rg.q1 f48589r0;
    public int f48590s0;
    public int f48591t0;
    public int f48592u0;
    public rg.j0 f48593v0;
    public int f48594w0;
    public int f48595x0;
    public Runnable f48596y0;
    public boolean f48597z0;

    public w2(Context context, PointF pointF, int i10, CharSequence charSequence, rg.q1 q1Var, int i11) {
        super(context, pointF);
        this.f48593v0 = rg.j0.e;
        this.f48591t0 = i10;
        v2 v2Var = new v2(this, context);
        this.f48588q0 = v2Var;
        NotificationCenter.listenEmojiLoading(v2Var);
        v2Var.setGravity(19);
        v2Var.setBackgroundColor(0);
        v2Var.setPadding(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f));
        v2Var.setClickable(false);
        v2Var.setEnabled(false);
        v2Var.setCursorColor(-1);
        v2Var.setTextSize(0, this.f48591t0);
        v2Var.setCursorSize(AndroidUtilities.dp(this.f48591t0 * 0.4f));
        v2Var.setText(charSequence);
        s();
        v2Var.setTextColor(q1Var.f47560a);
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
        addView(v2Var, kb1.i(-2, -2, 51));
        if (i12 >= 29) {
            v2Var.setBreakStrategy(0);
        } else {
            v2Var.setBreakStrategy(0);
        }
        setSwatch(q1Var);
        setType(i11);
        k();
        v2Var.addTextChangedListener(new vd0(this));
    }

    @Override
    public final i a() {
        return new p0(this, getContext());
    }

    public int getAlign() {
        return this.f48592u0;
    }

    public int getBaseFontSize() {
        return this.f48591t0;
    }

    public b getEditText() {
        return this.f48588q0;
    }

    public View getFocusedView() {
        return this.f48588q0;
    }

    public Paint.FontMetricsInt getFontMetricsInt() {
        return this.f48588q0.getPaint().getFontMetricsInt();
    }

    public float getFontSize() {
        return this.f48588q0.getTextSize();
    }

    @Override
    public il0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new Object();
        }
        float scaleX = viewGroup.getScaleX();
        float dp = (AndroidUtilities.dp(64.0f) / scaleX) + (getScale() * getMeasuredWidth());
        float dp2 = (AndroidUtilities.dp(52.0f) / scaleX) + (getScale() * getMeasuredHeight());
        float y3 = wh.y(dp, 2.0f, getPositionX(), scaleX);
        float positionY = getPositionY();
        v2 v2Var = this.f48588q0;
        return new il0(y3, (positionY - (((dp2 - v2Var.getExtendedPaddingTop()) - AndroidUtilities.dpf2(4.0f)) / 2.0f)) * scaleX, ((dp * scaleX) + y3) - y3, (dp2 - v2Var.getExtendedPaddingBottom()) * scaleX);
    }

    @Override
    public float getStickyPaddingBottom() {
        RectF rectF = this.f48588q0.f48189w;
        if (rectF == null) {
            return 0.0f;
        }
        return rectF.bottom;
    }

    @Override
    public float getStickyPaddingLeft() {
        RectF rectF = this.f48588q0.f48189w;
        if (rectF == null) {
            return 0.0f;
        }
        return rectF.left;
    }

    @Override
    public float getStickyPaddingRight() {
        RectF rectF = this.f48588q0.f48189w;
        if (rectF == null) {
            return 0.0f;
        }
        return rectF.right;
    }

    @Override
    public float getStickyPaddingTop() {
        RectF rectF = this.f48588q0.f48189w;
        if (rectF == null) {
            return 0.0f;
        }
        return rectF.top;
    }

    public rg.q1 getSwatch() {
        return this.f48589r0;
    }

    public CharSequence getText() {
        return this.f48588q0.getText();
    }

    public int getTextSize() {
        return (int) this.f48588q0.getTextSize();
    }

    public int getType() {
        return this.f48590s0;
    }

    public rg.j0 getTypeface() {
        return this.f48593v0;
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
        v2 v2Var = this.f48588q0;
        v2Var.setEnabled(true);
        v2Var.setClickable(true);
        v2Var.requestFocus();
        v2Var.setSelection(v2Var.getText().length());
        AndroidUtilities.runOnUIThread(new org.telegram.ui.web.h1(this, 19), 300L);
    }

    public final void r() {
        int i10;
        v2 v2Var = this.f48588q0;
        v2Var.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        int i11 = this.f48589r0.f47560a;
        int i12 = this.f48590s0;
        int i13 = -1;
        if (i12 == 0) {
            v2Var.setFrameColor(i11);
            i11 = AndroidUtilities.computePerceivedBrightness(this.f48589r0.f47560a) >= 0.721f ? -16777216 : -1;
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
        v2Var.setHighlightColor(y6.o1(0.4f, i11));
    }

    public final void s() {
        v2 v2Var = this.f48588q0;
        if (v2Var.getText().length() <= 0) {
            v2Var.setHint(LocaleController.getString(R.string.TextPlaceholder));
            v2Var.setHintTextColor(1627389951);
            return;
        }
        v2Var.setHint((CharSequence) null);
    }

    public void setAlign(int i10) {
        this.f48592u0 = i10;
    }

    public void setBaseFontSize(int i10) {
        this.f48591t0 = i10;
        float f7 = i10;
        v2 v2Var = this.f48588q0;
        v2Var.setTextSize(0, f7);
        v2Var.setCursorSize(AndroidUtilities.dp(f7 * 0.4f));
        if (v2Var.getText() != null) {
            Editable text = v2Var.getText();
            Emoji.EmojiSpan[] emojiSpanArr = (Emoji.EmojiSpan[]) text.getSpans(0, text.length(), Emoji.EmojiSpan.class);
            for (int i11 = 0; i11 < emojiSpanArr.length; i11++) {
                emojiSpanArr[i11].replaceFontMetrics(getFontMetricsInt());
                emojiSpanArr[i11].scale = 0.85f;
            }
            for (c6 c6Var : (c6[]) text.getSpans(0, text.length(), c6.class)) {
                c6Var.replaceFontMetrics(getFontMetricsInt());
            }
            v2Var.invalidateForce();
        }
    }

    public void setMaxWidth(int i10) {
        this.f48588q0.setMaxWidth(i10);
    }

    public void setSwatch(rg.q1 q1Var) {
        this.f48589r0 = new rg.q1(q1Var.f47561b, q1Var.f47562c, q1Var.f47560a);
        r();
    }

    public void setText(CharSequence charSequence) {
        this.f48588q0.setText(charSequence);
        s();
    }

    public void setType(int i10) {
        this.f48590s0 = i10;
        r();
    }

    public void setTypeface(rg.j0 j0Var) {
        this.f48593v0 = j0Var;
        if (j0Var != null) {
            this.f48588q0.setTypeface(j0Var.d());
        }
        m();
    }

    public void setTypeface(String str) {
        Iterator it = rg.j0.c().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            rg.j0 j0Var = (rg.j0) it.next();
            if (j0Var.f47475a.equals(str)) {
                setTypeface(j0Var);
                str = null;
                break;
            }
        }
        this.A0 = str;
        m();
    }

    public w2(Context context, w2 w2Var, PointF pointF) {
        this(context, pointF, w2Var.f48591t0, w2Var.getText(), w2Var.getSwatch(), w2Var.f48590s0);
        setRotation(w2Var.getRotation());
        setScale(w2Var.getScale());
        setTypeface(w2Var.getTypeface());
        setAlign(w2Var.getAlign());
        int align = getAlign();
        int i10 = 2;
        this.f48588q0.setGravity(align != 1 ? align != 2 ? 19 : 21 : 17);
        int align2 = getAlign();
        if (align2 == 1) {
            i10 = 4;
        } else if (align2 == 2 ? !LocaleController.isRTL : LocaleController.isRTL) {
            i10 = 3;
        }
        this.f48588q0.setTextAlignment(i10);
    }
}
