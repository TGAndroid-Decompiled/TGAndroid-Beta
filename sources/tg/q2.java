package tg;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Build;
import android.text.Editable;
import android.view.View;
import android.view.ViewGroup;
import bi.y5;
import c8.na;
import java.util.Iterator;
import org.telegram.messenger.g6;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.messenger.m10;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Components.aj0;
import org.telegram.ui.Components.x5;
public class q2 extends n {
    public Runnable A0;
    public boolean B0;
    public String C0;
    public final p2 f58178s0;
    public sg.g1 f58179t0;
    public int f58180u0;
    public int f58181v0;
    public int f58182w0;
    public sg.a0 f58183x0;
    public int f58184y0;
    public int f58185z0;

    public q2(Context context, PointF pointF, int i7, CharSequence charSequence, sg.g1 g1Var, int i10) {
        super(context, pointF);
        this.f58183x0 = sg.a0.f57274e;
        this.f58181v0 = i7;
        p2 p2Var = new p2(this, context);
        this.f58178s0 = p2Var;
        ks.i(p2Var);
        p2Var.setGravity(19);
        p2Var.setBackgroundColor(0);
        p2Var.setPadding(org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(7.0f));
        p2Var.setClickable(false);
        p2Var.setEnabled(false);
        p2Var.setCursorColor(-1);
        p2Var.setTextSize(0, this.f58181v0);
        p2Var.setCursorSize(org.telegram.messenger.g0.L(this.f58181v0 * 0.4f));
        p2Var.setText(charSequence);
        t();
        p2Var.setTextColor(g1Var.f57335a);
        p2Var.setTypeface(null, 1);
        p2Var.setHorizontallyScrolling(false);
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 26) {
            p2Var.setImeOptions(285212672);
        } else {
            p2Var.setImeOptions(268435456);
        }
        p2Var.setFocusableInTouchMode(true);
        p2Var.setInputType(16384);
        p2Var.setSingleLine(false);
        addView(p2Var, na.e(-2, -2, 51));
        if (i11 >= 29) {
            p2Var.setBreakStrategy(0);
        } else {
            p2Var.setBreakStrategy(0);
        }
        setSwatch(g1Var);
        setType(i10);
        k();
        p2Var.addTextChangedListener(new y5(3, this));
    }

    @Override
    public final m a() {
        return new o0(this, getContext());
    }

    public int getAlign() {
        return this.f58182w0;
    }

    public int getBaseFontSize() {
        return this.f58181v0;
    }

    public f getEditText() {
        return this.f58178s0;
    }

    public View getFocusedView() {
        return this.f58178s0;
    }

    public Paint.FontMetricsInt getFontMetricsInt() {
        return this.f58178s0.getPaint().getFontMetricsInt();
    }

    public float getFontSize() {
        return this.f58178s0.getTextSize();
    }

    @Override
    public aj0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new Object();
        }
        float scaleX = viewGroup.getScaleX();
        float L = (org.telegram.messenger.g0.L(64.0f) / scaleX) + (getScale() * getSelectionWidth());
        float L2 = (org.telegram.messenger.g0.L(52.0f) / scaleX) + (getScale() * getMeasuredHeight());
        float y10 = m10.y(L, 2.0f, getPositionX(), scaleX);
        float positionY = getPositionY();
        p2 p2Var = this.f58178s0;
        return new aj0(y10, (positionY - (((L2 - p2Var.getExtendedPaddingTop()) - org.telegram.messenger.g0.N(4.0f)) / 2.0f)) * scaleX, ((L * scaleX) + y10) - y10, (L2 - p2Var.getExtendedPaddingBottom()) * scaleX);
    }

    public float getSelectionWidth() {
        return getMeasuredWidth();
    }

    @Override
    public float getStickyPaddingBottom() {
        RectF rectF = this.f58178s0.W1;
        if (rectF == null) {
            return 0.0f;
        }
        return rectF.bottom;
    }

    @Override
    public float getStickyPaddingLeft() {
        RectF rectF = this.f58178s0.W1;
        if (rectF == null) {
            return 0.0f;
        }
        return rectF.left;
    }

    @Override
    public float getStickyPaddingRight() {
        RectF rectF = this.f58178s0.W1;
        if (rectF == null) {
            return 0.0f;
        }
        return rectF.right;
    }

    @Override
    public float getStickyPaddingTop() {
        RectF rectF = this.f58178s0.W1;
        if (rectF == null) {
            return 0.0f;
        }
        return rectF.top;
    }

    public sg.g1 getSwatch() {
        return this.f58179t0;
    }

    public CharSequence getText() {
        return this.f58178s0.getText();
    }

    public int getTextSize() {
        return (int) this.f58178s0.getTextSize();
    }

    public int getType() {
        return this.f58180u0;
    }

    public sg.a0 getTypeface() {
        return this.f58183x0;
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

    public void q() {
        p2 p2Var = this.f58178s0;
        p2Var.setEnabled(true);
        p2Var.setClickable(true);
        p2Var.requestFocus();
        p2Var.setSelection(p2Var.getText().length());
        org.telegram.messenger.g0.h3(new org.telegram.ui.web.z0(this, 22), 300L);
    }

    public void r() {
        p2 p2Var = this.f58178s0;
        p2Var.clearFocus();
        p2Var.setEnabled(false);
        p2Var.setClickable(false);
        m();
    }

    public void s() {
        int i7;
        p2 p2Var = this.f58178s0;
        p2Var.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        int i10 = this.f58179t0.f57335a;
        int i11 = this.f58180u0;
        int i12 = -1;
        if (i11 == 0) {
            p2Var.setFrameColor(i10);
            i10 = org.telegram.messenger.g0.B(this.f58179t0.f57335a) >= 0.721f ? -16777216 : -1;
        } else if (i11 == 1) {
            if (org.telegram.messenger.g0.B(i10) >= 0.25f) {
                i7 = -1728053248;
            } else {
                i7 = -1711276033;
            }
            p2Var.setFrameColor(i7);
        } else if (i11 == 2) {
            if (org.telegram.messenger.g0.B(i10) >= 0.25f) {
                i12 = -16777216;
            }
            p2Var.setFrameColor(i12);
        } else {
            p2Var.setFrameColor(0);
        }
        p2Var.setTextColor(i10);
        p2Var.setCursorColor(i10);
        p2Var.setHandlesColor(i10);
        p2Var.setHighlightColor(n6.r1(0.4f, i10));
    }

    public void setAlign(int i7) {
        this.f58182w0 = i7;
    }

    public void setBaseFontSize(int i7) {
        this.f58181v0 = i7;
        float f10 = i7;
        p2 p2Var = this.f58178s0;
        p2Var.setTextSize(0, f10);
        p2Var.setCursorSize(org.telegram.messenger.g0.L(f10 * 0.4f));
        if (p2Var.getText() != null) {
            Editable text = p2Var.getText();
            g6[] g6VarArr = (g6[]) text.getSpans(0, text.length(), g6.class);
            for (int i10 = 0; i10 < g6VarArr.length; i10++) {
                g6 g6Var = g6VarArr[i10];
                Paint.FontMetricsInt fontMetricsInt = getFontMetricsInt();
                g6Var.f24274a = fontMetricsInt;
                if (fontMetricsInt != null) {
                    int abs = Math.abs(g6Var.f24274a.ascent) + Math.abs(fontMetricsInt.descent);
                    g6Var.f24276c = abs;
                    if (abs == 0) {
                        g6Var.f24276c = org.telegram.messenger.g0.L(20.0f);
                    }
                }
                g6VarArr[i10].f24275b = 0.85f;
            }
            for (x5 x5Var : (x5[]) text.getSpans(0, text.length(), x5.class)) {
                x5Var.replaceFontMetrics(getFontMetricsInt());
            }
            p2Var.q();
        }
    }

    public void setMaxWidth(int i7) {
        this.f58178s0.setMaxWidth(i7);
    }

    public void setSwatch(sg.g1 g1Var) {
        this.f58179t0 = new sg.g1(g1Var.f57336b, g1Var.f57337c, g1Var.f57335a);
        s();
    }

    public void setText(CharSequence charSequence) {
        this.f58178s0.setText(charSequence);
        t();
    }

    public void setType(int i7) {
        this.f58180u0 = i7;
        s();
    }

    public void setTypeface(sg.a0 a0Var) {
        this.f58183x0 = a0Var;
        if (a0Var != null) {
            this.f58178s0.setTypeface(a0Var.d());
        }
        m();
    }

    public void t() {
        p2 p2Var = this.f58178s0;
        if (p2Var.getText().length() <= 0) {
            p2Var.setHint(gd.N0(2131743948, null));
            p2Var.setHintTextColor(1627389951);
            return;
        }
        p2Var.setHint((CharSequence) null);
    }

    public void setTypeface(String str) {
        Iterator it = sg.a0.c().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            sg.a0 a0Var = (sg.a0) it.next();
            if (a0Var.f57278a.equals(str)) {
                setTypeface(a0Var);
                str = null;
                break;
            }
        }
        this.C0 = str;
        m();
    }

    public q2(Context context, q2 q2Var, PointF pointF) {
        this(context, pointF, q2Var.f58181v0, q2Var.getText(), q2Var.getSwatch(), q2Var.f58180u0);
        setRotation(q2Var.getRotation());
        setScale(q2Var.getScale());
        setTypeface(q2Var.getTypeface());
        setAlign(q2Var.getAlign());
        int align = getAlign();
        int i7 = 2;
        this.f58178s0.setGravity(align != 1 ? align != 2 ? 19 : 21 : 17);
        int align2 = getAlign();
        if (align2 == 1) {
            i7 = 4;
        } else if (align2 == 2 ? !gd.f24314a0 : gd.f24314a0) {
            i7 = 3;
        }
        this.f58178s0.setTextAlignment(i7);
    }
}
