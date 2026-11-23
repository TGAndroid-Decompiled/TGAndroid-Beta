package tg;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Build;
import android.text.Editable;
import android.view.View;
import android.view.ViewGroup;
import bi.v5;
import c8.ma;
import java.util.Iterator;
import org.telegram.messenger.g6;
import org.telegram.messenger.hd;
import org.telegram.messenger.ls;
import org.telegram.messenger.o10;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Components.aj0;
import org.telegram.ui.Components.y5;
public final class n2 extends j {
    public boolean A0;
    public String B0;
    public final m2 f58087r0;
    public sg.h1 f58088s0;
    public int f58089t0;
    public int f58090u0;
    public int f58091v0;
    public sg.a0 f58092w0;
    public int f58093x0;
    public int f58094y0;
    public Runnable f58095z0;

    public n2(Context context, PointF pointF, int i7, CharSequence charSequence, sg.h1 h1Var, int i10) {
        super(context, pointF);
        this.f58092w0 = sg.a0.f57195e;
        this.f58090u0 = i7;
        m2 m2Var = new m2(this, context);
        this.f58087r0 = m2Var;
        ls.i(m2Var);
        m2Var.setGravity(19);
        m2Var.setBackgroundColor(0);
        m2Var.setPadding(org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(7.0f));
        m2Var.setClickable(false);
        m2Var.setEnabled(false);
        m2Var.setCursorColor(-1);
        m2Var.setTextSize(0, this.f58090u0);
        m2Var.setCursorSize(org.telegram.messenger.g0.L(this.f58090u0 * 0.4f));
        m2Var.setText(charSequence);
        s();
        m2Var.setTextColor(h1Var.f57263a);
        m2Var.setTypeface(null, 1);
        m2Var.setHorizontallyScrolling(false);
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 26) {
            m2Var.setImeOptions(285212672);
        } else {
            m2Var.setImeOptions(268435456);
        }
        m2Var.setFocusableInTouchMode(true);
        m2Var.setInputType(16384);
        m2Var.setSingleLine(false);
        addView(m2Var, ma.e(-2, -2, 51));
        if (i11 >= 29) {
            m2Var.setBreakStrategy(0);
        } else {
            m2Var.setBreakStrategy(0);
        }
        setSwatch(h1Var);
        setType(i10);
        k();
        m2Var.addTextChangedListener(new v5(3, this));
    }

    @Override
    public final i a() {
        return new k0(this, getContext());
    }

    public int getAlign() {
        return this.f58091v0;
    }

    public int getBaseFontSize() {
        return this.f58090u0;
    }

    public b getEditText() {
        return this.f58087r0;
    }

    public View getFocusedView() {
        return this.f58087r0;
    }

    public Paint.FontMetricsInt getFontMetricsInt() {
        return this.f58087r0.getPaint().getFontMetricsInt();
    }

    public float getFontSize() {
        return this.f58087r0.getTextSize();
    }

    @Override
    public aj0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new Object();
        }
        float scaleX = viewGroup.getScaleX();
        float L = (org.telegram.messenger.g0.L(64.0f) / scaleX) + (getScale() * getMeasuredWidth());
        float L2 = (org.telegram.messenger.g0.L(52.0f) / scaleX) + (getScale() * getMeasuredHeight());
        float y10 = o10.y(L, 2.0f, getPositionX(), scaleX);
        float positionY = getPositionY();
        m2 m2Var = this.f58087r0;
        return new aj0(y10, (positionY - (((L2 - m2Var.getExtendedPaddingTop()) - org.telegram.messenger.g0.N(4.0f)) / 2.0f)) * scaleX, ((L * scaleX) + y10) - y10, (L2 - m2Var.getExtendedPaddingBottom()) * scaleX);
    }

    @Override
    public float getStickyPaddingBottom() {
        RectF rectF = this.f58087r0.W1;
        if (rectF == null) {
            return 0.0f;
        }
        return rectF.bottom;
    }

    @Override
    public float getStickyPaddingLeft() {
        RectF rectF = this.f58087r0.W1;
        if (rectF == null) {
            return 0.0f;
        }
        return rectF.left;
    }

    @Override
    public float getStickyPaddingRight() {
        RectF rectF = this.f58087r0.W1;
        if (rectF == null) {
            return 0.0f;
        }
        return rectF.right;
    }

    @Override
    public float getStickyPaddingTop() {
        RectF rectF = this.f58087r0.W1;
        if (rectF == null) {
            return 0.0f;
        }
        return rectF.top;
    }

    public sg.h1 getSwatch() {
        return this.f58088s0;
    }

    public CharSequence getText() {
        return this.f58087r0.getText();
    }

    public int getTextSize() {
        return (int) this.f58087r0.getTextSize();
    }

    public int getType() {
        return this.f58089t0;
    }

    public sg.a0 getTypeface() {
        return this.f58092w0;
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        k();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        k();
    }

    public final void q() {
        m2 m2Var = this.f58087r0;
        m2Var.setEnabled(true);
        m2Var.setClickable(true);
        m2Var.requestFocus();
        m2Var.setSelection(m2Var.getText().length());
        org.telegram.messenger.g0.h3(new org.telegram.ui.web.z0(this, 21), 300L);
    }

    public final void r() {
        int i7;
        m2 m2Var = this.f58087r0;
        m2Var.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        int i10 = this.f58088s0.f57263a;
        int i11 = this.f58089t0;
        int i12 = -1;
        if (i11 == 0) {
            m2Var.setFrameColor(i10);
            i10 = org.telegram.messenger.g0.B(this.f58088s0.f57263a) >= 0.721f ? -16777216 : -1;
        } else if (i11 == 1) {
            if (org.telegram.messenger.g0.B(i10) >= 0.25f) {
                i7 = -1728053248;
            } else {
                i7 = -1711276033;
            }
            m2Var.setFrameColor(i7);
        } else if (i11 == 2) {
            if (org.telegram.messenger.g0.B(i10) >= 0.25f) {
                i12 = -16777216;
            }
            m2Var.setFrameColor(i12);
        } else {
            m2Var.setFrameColor(0);
        }
        m2Var.setTextColor(i10);
        m2Var.setCursorColor(i10);
        m2Var.setHandlesColor(i10);
        m2Var.setHighlightColor(m6.r1(0.4f, i10));
    }

    public final void s() {
        m2 m2Var = this.f58087r0;
        if (m2Var.getText().length() <= 0) {
            m2Var.setHint(hd.N0(2131743950, null));
            m2Var.setHintTextColor(1627389951);
            return;
        }
        m2Var.setHint((CharSequence) null);
    }

    public void setAlign(int i7) {
        this.f58091v0 = i7;
    }

    public void setBaseFontSize(int i7) {
        this.f58090u0 = i7;
        float f10 = i7;
        m2 m2Var = this.f58087r0;
        m2Var.setTextSize(0, f10);
        m2Var.setCursorSize(org.telegram.messenger.g0.L(f10 * 0.4f));
        if (m2Var.getText() != null) {
            Editable text = m2Var.getText();
            g6[] g6VarArr = (g6[]) text.getSpans(0, text.length(), g6.class);
            for (int i10 = 0; i10 < g6VarArr.length; i10++) {
                g6 g6Var = g6VarArr[i10];
                Paint.FontMetricsInt fontMetricsInt = getFontMetricsInt();
                g6Var.f24094a = fontMetricsInt;
                if (fontMetricsInt != null) {
                    int abs = Math.abs(g6Var.f24094a.ascent) + Math.abs(fontMetricsInt.descent);
                    g6Var.f24096c = abs;
                    if (abs == 0) {
                        g6Var.f24096c = org.telegram.messenger.g0.L(20.0f);
                    }
                }
                g6VarArr[i10].f24095b = 0.85f;
            }
            for (y5 y5Var : (y5[]) text.getSpans(0, text.length(), y5.class)) {
                y5Var.replaceFontMetrics(getFontMetricsInt());
            }
            m2Var.q();
        }
    }

    public void setMaxWidth(int i7) {
        this.f58087r0.setMaxWidth(i7);
    }

    public void setSwatch(sg.h1 h1Var) {
        this.f58088s0 = new sg.h1(h1Var.f57264b, h1Var.f57265c, h1Var.f57263a);
        r();
    }

    public void setText(CharSequence charSequence) {
        this.f58087r0.setText(charSequence);
        s();
    }

    public void setType(int i7) {
        this.f58089t0 = i7;
        r();
    }

    public void setTypeface(sg.a0 a0Var) {
        this.f58092w0 = a0Var;
        if (a0Var != null) {
            this.f58087r0.setTypeface(a0Var.d());
        }
        m();
    }

    public void setTypeface(String str) {
        Iterator it = sg.a0.c().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            sg.a0 a0Var = (sg.a0) it.next();
            if (a0Var.f57199a.equals(str)) {
                setTypeface(a0Var);
                str = null;
                break;
            }
        }
        this.B0 = str;
        m();
    }

    public n2(Context context, n2 n2Var, PointF pointF) {
        this(context, pointF, n2Var.f58090u0, n2Var.getText(), n2Var.getSwatch(), n2Var.f58089t0);
        setRotation(n2Var.getRotation());
        setScale(n2Var.getScale());
        setTypeface(n2Var.getTypeface());
        setAlign(n2Var.getAlign());
        int align = getAlign();
        int i7 = 2;
        this.f58087r0.setGravity(align != 1 ? align != 2 ? 19 : 21 : 17);
        int align2 = getAlign();
        if (align2 == 1) {
            i7 = 4;
        } else if (align2 == 2 ? !hd.f24444a0 : hd.f24444a0) {
            i7 = 3;
        }
        this.f58087r0.setTextAlignment(i7);
    }
}
