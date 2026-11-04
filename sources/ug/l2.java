package ug;

import ai.w3;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Build;
import android.text.Editable;
import android.view.View;
import android.view.ViewGroup;
import b8.mf;
import java.util.Iterator;
import org.telegram.messenger.bd;
import org.telegram.messenger.f6;
import org.telegram.messenger.hs;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.ni0;
import org.telegram.ui.Components.p5;
public final class l2 extends j {
    public boolean A0;
    public String B0;
    public final k2 f56141r0;
    public tg.h1 f56142s0;
    public int f56143t0;
    public int f56144u0;
    public int f56145v0;
    public tg.b0 f56146w0;
    public int f56147x0;
    public int f56148y0;
    public Runnable f56149z0;

    public l2(Context context, PointF pointF, int i3, CharSequence charSequence, tg.h1 h1Var, int i10) {
        super(context, pointF);
        this.f56146w0 = tg.b0.f55124e;
        this.f56144u0 = i3;
        k2 k2Var = new k2(this, context);
        this.f56141r0 = k2Var;
        hs.i(k2Var);
        k2Var.setGravity(19);
        k2Var.setBackgroundColor(0);
        k2Var.setPadding(org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(7.0f));
        k2Var.setClickable(false);
        k2Var.setEnabled(false);
        k2Var.setCursorColor(-1);
        k2Var.setTextSize(0, this.f56144u0);
        k2Var.setCursorSize(org.telegram.messenger.g0.L(this.f56144u0 * 0.4f));
        k2Var.setText(charSequence);
        s();
        k2Var.setTextColor(h1Var.f55186a);
        k2Var.setTypeface(null, 1);
        k2Var.setHorizontallyScrolling(false);
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 26) {
            k2Var.setImeOptions(285212672);
        } else {
            k2Var.setImeOptions(268435456);
        }
        k2Var.setFocusableInTouchMode(true);
        k2Var.setInputType(16384);
        k2Var.setSingleLine(false);
        addView(k2Var, mf.e(-2, -2, 51));
        if (i11 >= 29) {
            k2Var.setBreakStrategy(0);
        } else {
            k2Var.setBreakStrategy(0);
        }
        setSwatch(h1Var);
        setType(i10);
        k();
        k2Var.addTextChangedListener(new w3(3, this));
    }

    @Override
    public final i a() {
        return new i0(this, getContext());
    }

    public int getAlign() {
        return this.f56145v0;
    }

    public int getBaseFontSize() {
        return this.f56144u0;
    }

    public b getEditText() {
        return this.f56141r0;
    }

    public View getFocusedView() {
        return this.f56141r0;
    }

    public Paint.FontMetricsInt getFontMetricsInt() {
        return this.f56141r0.getPaint().getFontMetricsInt();
    }

    public float getFontSize() {
        return this.f56141r0.getTextSize();
    }

    @Override
    public ni0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new Object();
        }
        float scaleX = viewGroup.getScaleX();
        float L = (org.telegram.messenger.g0.L(64.0f) / scaleX) + (getScale() * getMeasuredWidth());
        float L2 = (org.telegram.messenger.g0.L(52.0f) / scaleX) + (getScale() * getMeasuredHeight());
        float x10 = org.telegram.messenger.camera.q.x(L, 2.0f, getPositionX(), scaleX);
        float positionY = getPositionY();
        k2 k2Var = this.f56141r0;
        return new ni0(x10, (positionY - (((L2 - k2Var.getExtendedPaddingTop()) - org.telegram.messenger.g0.N(4.0f)) / 2.0f)) * scaleX, ((L * scaleX) + x10) - x10, (L2 - k2Var.getExtendedPaddingBottom()) * scaleX);
    }

    @Override
    public float getStickyPaddingBottom() {
        RectF rectF = this.f56141r0.R1;
        if (rectF == null) {
            return 0.0f;
        }
        return rectF.bottom;
    }

    @Override
    public float getStickyPaddingLeft() {
        RectF rectF = this.f56141r0.R1;
        if (rectF == null) {
            return 0.0f;
        }
        return rectF.left;
    }

    @Override
    public float getStickyPaddingRight() {
        RectF rectF = this.f56141r0.R1;
        if (rectF == null) {
            return 0.0f;
        }
        return rectF.right;
    }

    @Override
    public float getStickyPaddingTop() {
        RectF rectF = this.f56141r0.R1;
        if (rectF == null) {
            return 0.0f;
        }
        return rectF.top;
    }

    public tg.h1 getSwatch() {
        return this.f56142s0;
    }

    public CharSequence getText() {
        return this.f56141r0.getText();
    }

    public int getTextSize() {
        return (int) this.f56141r0.getTextSize();
    }

    public int getType() {
        return this.f56143t0;
    }

    public tg.b0 getTypeface() {
        return this.f56146w0;
    }

    @Override
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        super.onLayout(z10, i3, i10, i11, i12);
        k();
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(i3, i10);
        k();
    }

    public final void q() {
        k2 k2Var = this.f56141r0;
        k2Var.setEnabled(true);
        k2Var.setClickable(true);
        k2Var.requestFocus();
        k2Var.setSelection(k2Var.getText().length());
        org.telegram.messenger.g0.i3(new r4.u(this, 16), 300L);
    }

    public final void r() {
        int i3;
        k2 k2Var = this.f56141r0;
        k2Var.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        int i10 = this.f56142s0.f55186a;
        int i11 = this.f56143t0;
        int i12 = -1;
        if (i11 == 0) {
            k2Var.setFrameColor(i10);
            i10 = org.telegram.messenger.g0.B(this.f56142s0.f55186a) >= 0.721f ? -16777216 : -1;
        } else if (i11 == 1) {
            if (org.telegram.messenger.g0.B(i10) >= 0.25f) {
                i3 = -1728053248;
            } else {
                i3 = -1711276033;
            }
            k2Var.setFrameColor(i3);
        } else if (i11 == 2) {
            if (org.telegram.messenger.g0.B(i10) >= 0.25f) {
                i12 = -16777216;
            }
            k2Var.setFrameColor(i12);
        } else {
            k2Var.setFrameColor(0);
        }
        k2Var.setTextColor(i10);
        k2Var.setCursorColor(i10);
        k2Var.setHandlesColor(i10);
        k2Var.setHighlightColor(k6.r1(0.4f, i10));
    }

    public final void s() {
        k2 k2Var = this.f56141r0;
        if (k2Var.getText().length() <= 0) {
            k2Var.setHint(bd.M0(2131744203, null));
            k2Var.setHintTextColor(1627389951);
            return;
        }
        k2Var.setHint((CharSequence) null);
    }

    public void setAlign(int i3) {
        this.f56145v0 = i3;
    }

    public void setBaseFontSize(int i3) {
        this.f56144u0 = i3;
        float f10 = i3;
        k2 k2Var = this.f56141r0;
        k2Var.setTextSize(0, f10);
        k2Var.setCursorSize(org.telegram.messenger.g0.L(f10 * 0.4f));
        if (k2Var.getText() != null) {
            Editable text = k2Var.getText();
            f6[] f6VarArr = (f6[]) text.getSpans(0, text.length(), f6.class);
            for (int i10 = 0; i10 < f6VarArr.length; i10++) {
                f6 f6Var = f6VarArr[i10];
                Paint.FontMetricsInt fontMetricsInt = getFontMetricsInt();
                f6Var.f22452a = fontMetricsInt;
                if (fontMetricsInt != null) {
                    int abs = Math.abs(f6Var.f22452a.ascent) + Math.abs(fontMetricsInt.descent);
                    f6Var.f22454c = abs;
                    if (abs == 0) {
                        f6Var.f22454c = org.telegram.messenger.g0.L(20.0f);
                    }
                }
                f6VarArr[i10].f22453b = 0.85f;
            }
            for (p5 p5Var : (p5[]) text.getSpans(0, text.length(), p5.class)) {
                p5Var.replaceFontMetrics(getFontMetricsInt());
            }
            k2Var.q();
        }
    }

    public void setMaxWidth(int i3) {
        this.f56141r0.setMaxWidth(i3);
    }

    public void setSwatch(tg.h1 h1Var) {
        this.f56142s0 = new tg.h1(h1Var.f55187b, h1Var.f55188c, h1Var.f55186a);
        r();
    }

    public void setText(CharSequence charSequence) {
        this.f56141r0.setText(charSequence);
        s();
    }

    public void setType(int i3) {
        this.f56143t0 = i3;
        r();
    }

    public void setTypeface(tg.b0 b0Var) {
        this.f56146w0 = b0Var;
        if (b0Var != null) {
            this.f56141r0.setTypeface(b0Var.d());
        }
        m();
    }

    public void setTypeface(String str) {
        Iterator it = tg.b0.c().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            tg.b0 b0Var = (tg.b0) it.next();
            if (b0Var.f55128a.equals(str)) {
                setTypeface(b0Var);
                str = null;
                break;
            }
        }
        this.B0 = str;
        m();
    }

    public l2(Context context, l2 l2Var, PointF pointF) {
        this(context, pointF, l2Var.f56144u0, l2Var.getText(), l2Var.getSwatch(), l2Var.f56143t0);
        setRotation(l2Var.getRotation());
        setScale(l2Var.getScale());
        setTypeface(l2Var.getTypeface());
        setAlign(l2Var.getAlign());
        int align = getAlign();
        int i3 = 2;
        this.f56141r0.setGravity(align != 1 ? align != 2 ? 19 : 21 : 17);
        int align2 = getAlign();
        if (align2 == 1) {
            i3 = 4;
        } else if (align2 == 2 ? !bd.f21784a0 : bd.f21784a0) {
            i3 = 3;
        }
        this.f56141r0.setTextAlignment(i3);
    }
}
