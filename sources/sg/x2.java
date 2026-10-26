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
import org.telegram.messenger.vh;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.c6;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.hl0;
import org.telegram.ui.td0;
public final class x2 extends j {
    public String A0;
    public final w2 f48563q0;
    public rg.q1 f48564r0;
    public int f48565s0;
    public int f48566t0;
    public int f48567u0;
    public rg.j0 f48568v0;
    public int f48569w0;
    public int f48570x0;
    public Runnable f48571y0;
    public boolean f48572z0;

    public x2(Context context, PointF pointF, int i10, CharSequence charSequence, rg.q1 q1Var, int i11) {
        super(context, pointF);
        this.f48568v0 = rg.j0.e;
        this.f48566t0 = i10;
        w2 w2Var = new w2(this, context);
        this.f48563q0 = w2Var;
        NotificationCenter.listenEmojiLoading(w2Var);
        w2Var.setGravity(19);
        w2Var.setBackgroundColor(0);
        w2Var.setPadding(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f));
        w2Var.setClickable(false);
        w2Var.setEnabled(false);
        w2Var.setCursorColor(-1);
        w2Var.setTextSize(0, this.f48566t0);
        w2Var.setCursorSize(AndroidUtilities.dp(this.f48566t0 * 0.4f));
        w2Var.setText(charSequence);
        s();
        w2Var.setTextColor(q1Var.f47525a);
        w2Var.setTypeface(null, 1);
        w2Var.setHorizontallyScrolling(false);
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 26) {
            w2Var.setImeOptions(285212672);
        } else {
            w2Var.setImeOptions(268435456);
        }
        w2Var.setFocusableInTouchMode(true);
        w2Var.setInputType(16384);
        w2Var.setSingleLine(false);
        addView(w2Var, gb1.i(-2, -2, 51));
        if (i12 >= 29) {
            w2Var.setBreakStrategy(0);
        } else {
            w2Var.setBreakStrategy(0);
        }
        setSwatch(q1Var);
        setType(i11);
        k();
        w2Var.addTextChangedListener(new td0(this));
    }

    @Override
    public final i a() {
        return new q0(this, getContext());
    }

    public int getAlign() {
        return this.f48567u0;
    }

    public int getBaseFontSize() {
        return this.f48566t0;
    }

    public b getEditText() {
        return this.f48563q0;
    }

    public View getFocusedView() {
        return this.f48563q0;
    }

    public Paint.FontMetricsInt getFontMetricsInt() {
        return this.f48563q0.getPaint().getFontMetricsInt();
    }

    public float getFontSize() {
        return this.f48563q0.getTextSize();
    }

    @Override
    public hl0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new Object();
        }
        float scaleX = viewGroup.getScaleX();
        float dp = (AndroidUtilities.dp(64.0f) / scaleX) + (getScale() * getMeasuredWidth());
        float dp2 = (AndroidUtilities.dp(52.0f) / scaleX) + (getScale() * getMeasuredHeight());
        float y3 = vh.y(dp, 2.0f, getPositionX(), scaleX);
        float positionY = getPositionY();
        w2 w2Var = this.f48563q0;
        return new hl0(y3, (positionY - (((dp2 - w2Var.getExtendedPaddingTop()) - AndroidUtilities.dpf2(4.0f)) / 2.0f)) * scaleX, ((dp * scaleX) + y3) - y3, (dp2 - w2Var.getExtendedPaddingBottom()) * scaleX);
    }

    @Override
    public float getStickyPaddingBottom() {
        RectF rectF = this.f48563q0.f48155w;
        if (rectF == null) {
            return 0.0f;
        }
        return rectF.bottom;
    }

    @Override
    public float getStickyPaddingLeft() {
        RectF rectF = this.f48563q0.f48155w;
        if (rectF == null) {
            return 0.0f;
        }
        return rectF.left;
    }

    @Override
    public float getStickyPaddingRight() {
        RectF rectF = this.f48563q0.f48155w;
        if (rectF == null) {
            return 0.0f;
        }
        return rectF.right;
    }

    @Override
    public float getStickyPaddingTop() {
        RectF rectF = this.f48563q0.f48155w;
        if (rectF == null) {
            return 0.0f;
        }
        return rectF.top;
    }

    public rg.q1 getSwatch() {
        return this.f48564r0;
    }

    public CharSequence getText() {
        return this.f48563q0.getText();
    }

    public int getTextSize() {
        return (int) this.f48563q0.getTextSize();
    }

    public int getType() {
        return this.f48565s0;
    }

    public rg.j0 getTypeface() {
        return this.f48568v0;
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
        w2 w2Var = this.f48563q0;
        w2Var.setEnabled(true);
        w2Var.setClickable(true);
        w2Var.requestFocus();
        w2Var.setSelection(w2Var.getText().length());
        AndroidUtilities.runOnUIThread(new org.telegram.ui.web.h1(this, 19), 300L);
    }

    public final void r() {
        int i10;
        w2 w2Var = this.f48563q0;
        w2Var.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        int i11 = this.f48564r0.f47525a;
        int i12 = this.f48565s0;
        int i13 = -1;
        if (i12 == 0) {
            w2Var.setFrameColor(i11);
            i11 = AndroidUtilities.computePerceivedBrightness(this.f48564r0.f47525a) >= 0.721f ? -16777216 : -1;
        } else if (i12 == 1) {
            if (AndroidUtilities.computePerceivedBrightness(i11) >= 0.25f) {
                i10 = -1728053248;
            } else {
                i10 = -1711276033;
            }
            w2Var.setFrameColor(i10);
        } else if (i12 == 2) {
            if (AndroidUtilities.computePerceivedBrightness(i11) >= 0.25f) {
                i13 = -16777216;
            }
            w2Var.setFrameColor(i13);
        } else {
            w2Var.setFrameColor(0);
        }
        w2Var.setTextColor(i11);
        w2Var.setCursorColor(i11);
        w2Var.setHandlesColor(i11);
        w2Var.setHighlightColor(y6.o1(0.4f, i11));
    }

    public final void s() {
        w2 w2Var = this.f48563q0;
        if (w2Var.getText().length() <= 0) {
            w2Var.setHint(LocaleController.getString(R.string.TextPlaceholder));
            w2Var.setHintTextColor(1627389951);
            return;
        }
        w2Var.setHint((CharSequence) null);
    }

    public void setAlign(int i10) {
        this.f48567u0 = i10;
    }

    public void setBaseFontSize(int i10) {
        this.f48566t0 = i10;
        float f7 = i10;
        w2 w2Var = this.f48563q0;
        w2Var.setTextSize(0, f7);
        w2Var.setCursorSize(AndroidUtilities.dp(f7 * 0.4f));
        if (w2Var.getText() != null) {
            Editable text = w2Var.getText();
            Emoji.EmojiSpan[] emojiSpanArr = (Emoji.EmojiSpan[]) text.getSpans(0, text.length(), Emoji.EmojiSpan.class);
            for (int i11 = 0; i11 < emojiSpanArr.length; i11++) {
                emojiSpanArr[i11].replaceFontMetrics(getFontMetricsInt());
                emojiSpanArr[i11].scale = 0.85f;
            }
            for (c6 c6Var : (c6[]) text.getSpans(0, text.length(), c6.class)) {
                c6Var.replaceFontMetrics(getFontMetricsInt());
            }
            w2Var.invalidateForce();
        }
    }

    public void setMaxWidth(int i10) {
        this.f48563q0.setMaxWidth(i10);
    }

    public void setSwatch(rg.q1 q1Var) {
        this.f48564r0 = new rg.q1(q1Var.f47526b, q1Var.f47527c, q1Var.f47525a);
        r();
    }

    public void setText(CharSequence charSequence) {
        this.f48563q0.setText(charSequence);
        s();
    }

    public void setType(int i10) {
        this.f48565s0 = i10;
        r();
    }

    public void setTypeface(rg.j0 j0Var) {
        this.f48568v0 = j0Var;
        if (j0Var != null) {
            this.f48563q0.setTypeface(j0Var.d());
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
            if (j0Var.f47440a.equals(str)) {
                setTypeface(j0Var);
                str = null;
                break;
            }
        }
        this.A0 = str;
        m();
    }

    public x2(Context context, x2 x2Var, PointF pointF) {
        this(context, pointF, x2Var.f48566t0, x2Var.getText(), x2Var.getSwatch(), x2Var.f48565s0);
        setRotation(x2Var.getRotation());
        setScale(x2Var.getScale());
        setTypeface(x2Var.getTypeface());
        setAlign(x2Var.getAlign());
        int align = getAlign();
        int i10 = 2;
        this.f48563q0.setGravity(align != 1 ? align != 2 ? 19 : 21 : 17);
        int align2 = getAlign();
        if (align2 == 1) {
            i10 = 4;
        } else if (align2 == 2 ? !LocaleController.isRTL : LocaleController.isRTL) {
            i10 = 3;
        }
        this.f48563q0.setTextAlignment(i10);
    }
}
