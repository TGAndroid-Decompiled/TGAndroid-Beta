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
import org.telegram.messenger.ok;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.sk0;
import org.telegram.ui.Components.z5;
import org.telegram.ui.fe0;
import w7.y5;
public final class v2 extends j {
    public String A0;
    public final u2 f41963q0;
    public pg.t1 f41964r0;
    public int f41965s0;
    public int f41966t0;
    public int f41967u0;
    public pg.k0 f41968v0;
    public int f41969w0;
    public int f41970x0;
    public Runnable f41971y0;
    public boolean f41972z0;

    public v2(Context context, PointF pointF, int i10, CharSequence charSequence, pg.t1 t1Var, int i11) {
        super(context, pointF);
        this.f41968v0 = pg.k0.e;
        this.f41966t0 = i10;
        u2 u2Var = new u2(this, context);
        this.f41963q0 = u2Var;
        NotificationCenter.listenEmojiLoading(u2Var);
        u2Var.setGravity(19);
        u2Var.setBackgroundColor(0);
        u2Var.setPadding(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f));
        u2Var.setClickable(false);
        u2Var.setEnabled(false);
        u2Var.setCursorColor(-1);
        u2Var.setTextSize(0, this.f41966t0);
        u2Var.setCursorSize(AndroidUtilities.dp(this.f41966t0 * 0.4f));
        u2Var.setText(charSequence);
        s();
        u2Var.setTextColor(t1Var.f41265a);
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
        addView(u2Var, y5.e(-2, -2, 51));
        if (i12 >= 29) {
            u2Var.setBreakStrategy(0);
        } else if (i12 >= 23) {
            u2Var.setBreakStrategy(0);
        }
        setSwatch(t1Var);
        setType(i11);
        k();
        u2Var.addTextChangedListener(new fe0(this));
    }

    @Override
    public final i a() {
        return new q0(this, getContext());
    }

    public int getAlign() {
        return this.f41967u0;
    }

    public int getBaseFontSize() {
        return this.f41966t0;
    }

    public b getEditText() {
        return this.f41963q0;
    }

    public View getFocusedView() {
        return this.f41963q0;
    }

    public Paint.FontMetricsInt getFontMetricsInt() {
        return this.f41963q0.getPaint().getFontMetricsInt();
    }

    public float getFontSize() {
        return this.f41963q0.getTextSize();
    }

    @Override
    public sk0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new Object();
        }
        float scaleX = viewGroup.getScaleX();
        float dp = (AndroidUtilities.dp(64.0f) / scaleX) + (getScale() * getMeasuredWidth());
        float dp2 = (AndroidUtilities.dp(52.0f) / scaleX) + (getScale() * getMeasuredHeight());
        float x10 = ok.x(dp, 2.0f, getPositionX(), scaleX);
        float positionY = getPositionY();
        u2 u2Var = this.f41963q0;
        return new sk0(x10, (positionY - (((dp2 - u2Var.getExtendedPaddingTop()) - AndroidUtilities.dpf2(4.0f)) / 2.0f)) * scaleX, ((dp * scaleX) + x10) - x10, (dp2 - u2Var.getExtendedPaddingBottom()) * scaleX);
    }

    @Override
    public float getStickyPaddingBottom() {
        RectF rectF = this.f41963q0.f41581w;
        if (rectF == null) {
            return 0.0f;
        }
        return rectF.bottom;
    }

    @Override
    public float getStickyPaddingLeft() {
        RectF rectF = this.f41963q0.f41581w;
        if (rectF == null) {
            return 0.0f;
        }
        return rectF.left;
    }

    @Override
    public float getStickyPaddingRight() {
        RectF rectF = this.f41963q0.f41581w;
        if (rectF == null) {
            return 0.0f;
        }
        return rectF.right;
    }

    @Override
    public float getStickyPaddingTop() {
        RectF rectF = this.f41963q0.f41581w;
        if (rectF == null) {
            return 0.0f;
        }
        return rectF.top;
    }

    public pg.t1 getSwatch() {
        return this.f41964r0;
    }

    public CharSequence getText() {
        return this.f41963q0.getText();
    }

    public int getTextSize() {
        return (int) this.f41963q0.getTextSize();
    }

    public int getType() {
        return this.f41965s0;
    }

    public pg.k0 getTypeface() {
        return this.f41968v0;
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
        u2 u2Var = this.f41963q0;
        u2Var.setEnabled(true);
        u2Var.setClickable(true);
        u2Var.requestFocus();
        u2Var.setSelection(u2Var.getText().length());
        AndroidUtilities.runOnUIThread(new org.telegram.ui.web.q0(this, 18), 300L);
    }

    public final void r() {
        int i10;
        u2 u2Var = this.f41963q0;
        u2Var.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        int i11 = this.f41964r0.f41265a;
        int i12 = this.f41965s0;
        int i13 = -1;
        if (i12 == 0) {
            u2Var.setFrameColor(i11);
            i11 = AndroidUtilities.computePerceivedBrightness(this.f41964r0.f41265a) >= 0.721f ? -16777216 : -1;
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
        u2Var.setHighlightColor(h6.l1(0.4f, i11));
    }

    public final void s() {
        u2 u2Var = this.f41963q0;
        if (u2Var.getText().length() <= 0) {
            u2Var.setHint(LocaleController.getString(R.string.TextPlaceholder));
            u2Var.setHintTextColor(1627389951);
            return;
        }
        u2Var.setHint((CharSequence) null);
    }

    public void setAlign(int i10) {
        this.f41967u0 = i10;
    }

    public void setBaseFontSize(int i10) {
        this.f41966t0 = i10;
        float f7 = i10;
        u2 u2Var = this.f41963q0;
        u2Var.setTextSize(0, f7);
        u2Var.setCursorSize(AndroidUtilities.dp(f7 * 0.4f));
        if (u2Var.getText() != null) {
            Editable text = u2Var.getText();
            Emoji.EmojiSpan[] emojiSpanArr = (Emoji.EmojiSpan[]) text.getSpans(0, text.length(), Emoji.EmojiSpan.class);
            for (int i11 = 0; i11 < emojiSpanArr.length; i11++) {
                emojiSpanArr[i11].replaceFontMetrics(getFontMetricsInt());
                emojiSpanArr[i11].scale = 0.85f;
            }
            for (z5 z5Var : (z5[]) text.getSpans(0, text.length(), z5.class)) {
                z5Var.replaceFontMetrics(getFontMetricsInt());
            }
            u2Var.invalidateForce();
        }
    }

    public void setMaxWidth(int i10) {
        this.f41963q0.setMaxWidth(i10);
    }

    public void setSwatch(pg.t1 t1Var) {
        this.f41964r0 = new pg.t1(t1Var.f41266b, t1Var.f41267c, t1Var.f41265a);
        r();
    }

    public void setText(CharSequence charSequence) {
        this.f41963q0.setText(charSequence);
        s();
    }

    public void setType(int i10) {
        this.f41965s0 = i10;
        r();
    }

    public void setTypeface(pg.k0 k0Var) {
        this.f41968v0 = k0Var;
        if (k0Var != null) {
            this.f41963q0.setTypeface(k0Var.d());
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
            if (k0Var.f41157a.equals(str)) {
                setTypeface(k0Var);
                str = null;
                break;
            }
        }
        this.A0 = str;
        m();
    }

    public v2(Context context, v2 v2Var, PointF pointF) {
        this(context, pointF, v2Var.f41966t0, v2Var.getText(), v2Var.getSwatch(), v2Var.f41965s0);
        setRotation(v2Var.getRotation());
        setScale(v2Var.getScale());
        setTypeface(v2Var.getTypeface());
        setAlign(v2Var.getAlign());
        int align = getAlign();
        int i10 = 2;
        this.f41963q0.setGravity(align != 1 ? align != 2 ? 19 : 21 : 17);
        int align2 = getAlign();
        if (align2 == 1) {
            i10 = 4;
        } else if (align2 == 2 ? !LocaleController.isRTL : LocaleController.isRTL) {
            i10 = 3;
        }
        this.f41963q0.setTextAlignment(i10);
    }
}
