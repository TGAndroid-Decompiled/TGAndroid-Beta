package tg;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Build;
import android.text.Editable;
import android.view.View;
import android.view.ViewGroup;
import bi.l3;
import c8.ja;
import java.util.Iterator;
import org.telegram.messenger.g6;
import org.telegram.messenger.hd;
import org.telegram.messenger.i20;
import org.telegram.messenger.ns;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.p5;
import org.telegram.ui.Components.pi0;
public final class n2 extends j {
    public boolean A0;
    public String B0;
    public final m2 f57474r0;
    public sg.h1 f57475s0;
    public int f57476t0;
    public int f57477u0;
    public int f57478v0;
    public sg.a0 f57479w0;
    public int f57480x0;
    public int f57481y0;
    public Runnable f57482z0;

    public n2(Context context, PointF pointF, int i7, CharSequence charSequence, sg.h1 h1Var, int i10) {
        super(context, pointF);
        this.f57479w0 = sg.a0.f56576e;
        this.f57477u0 = i7;
        m2 m2Var = new m2(this, context);
        this.f57474r0 = m2Var;
        ns.i(m2Var);
        m2Var.setGravity(19);
        m2Var.setBackgroundColor(0);
        m2Var.setPadding(org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(7.0f));
        m2Var.setClickable(false);
        m2Var.setEnabled(false);
        m2Var.setCursorColor(-1);
        m2Var.setTextSize(0, this.f57477u0);
        m2Var.setCursorSize(org.telegram.messenger.g0.L(this.f57477u0 * 0.4f));
        m2Var.setText(charSequence);
        s();
        m2Var.setTextColor(h1Var.f56644a);
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
        addView(m2Var, ja.e(-2, -2, 51));
        if (i11 >= 29) {
            m2Var.setBreakStrategy(0);
        } else {
            m2Var.setBreakStrategy(0);
        }
        setSwatch(h1Var);
        setType(i10);
        k();
        m2Var.addTextChangedListener(new l3(3, this));
    }

    @Override
    public final i a() {
        return new j0(this, getContext());
    }

    public int getAlign() {
        return this.f57478v0;
    }

    public int getBaseFontSize() {
        return this.f57477u0;
    }

    public b getEditText() {
        return this.f57474r0;
    }

    public View getFocusedView() {
        return this.f57474r0;
    }

    public Paint.FontMetricsInt getFontMetricsInt() {
        return this.f57474r0.getPaint().getFontMetricsInt();
    }

    public float getFontSize() {
        return this.f57474r0.getTextSize();
    }

    @Override
    public pi0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new Object();
        }
        float scaleX = viewGroup.getScaleX();
        float L = (org.telegram.messenger.g0.L(64.0f) / scaleX) + (getScale() * getMeasuredWidth());
        float L2 = (org.telegram.messenger.g0.L(52.0f) / scaleX) + (getScale() * getMeasuredHeight());
        float x10 = i20.x(L, 2.0f, getPositionX(), scaleX);
        float positionY = getPositionY();
        m2 m2Var = this.f57474r0;
        return new pi0(x10, (positionY - (((L2 - m2Var.getExtendedPaddingTop()) - org.telegram.messenger.g0.N(4.0f)) / 2.0f)) * scaleX, ((L * scaleX) + x10) - x10, (L2 - m2Var.getExtendedPaddingBottom()) * scaleX);
    }

    @Override
    public float getStickyPaddingBottom() {
        RectF rectF = this.f57474r0.W1;
        if (rectF == null) {
            return 0.0f;
        }
        return rectF.bottom;
    }

    @Override
    public float getStickyPaddingLeft() {
        RectF rectF = this.f57474r0.W1;
        if (rectF == null) {
            return 0.0f;
        }
        return rectF.left;
    }

    @Override
    public float getStickyPaddingRight() {
        RectF rectF = this.f57474r0.W1;
        if (rectF == null) {
            return 0.0f;
        }
        return rectF.right;
    }

    @Override
    public float getStickyPaddingTop() {
        RectF rectF = this.f57474r0.W1;
        if (rectF == null) {
            return 0.0f;
        }
        return rectF.top;
    }

    public sg.h1 getSwatch() {
        return this.f57475s0;
    }

    public CharSequence getText() {
        return this.f57474r0.getText();
    }

    public int getTextSize() {
        return (int) this.f57474r0.getTextSize();
    }

    public int getType() {
        return this.f57476t0;
    }

    public sg.a0 getTypeface() {
        return this.f57479w0;
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
        m2 m2Var = this.f57474r0;
        m2Var.setEnabled(true);
        m2Var.setClickable(true);
        m2Var.requestFocus();
        m2Var.setSelection(m2Var.getText().length());
        org.telegram.messenger.g0.i3(new q2.d(this, 18), 300L);
    }

    public final void r() {
        int i7;
        m2 m2Var = this.f57474r0;
        m2Var.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        int i10 = this.f57475s0.f56644a;
        int i11 = this.f57476t0;
        int i12 = -1;
        if (i11 == 0) {
            m2Var.setFrameColor(i10);
            i10 = org.telegram.messenger.g0.B(this.f57475s0.f56644a) >= 0.721f ? -16777216 : -1;
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
        m2Var.setHighlightColor(j6.r1(0.4f, i10));
    }

    public final void s() {
        m2 m2Var = this.f57474r0;
        if (m2Var.getText().length() <= 0) {
            m2Var.setHint(hd.M0(2131744193, null));
            m2Var.setHintTextColor(1627389951);
            return;
        }
        m2Var.setHint((CharSequence) null);
    }

    public void setAlign(int i7) {
        this.f57478v0 = i7;
    }

    public void setBaseFontSize(int i7) {
        this.f57477u0 = i7;
        float f10 = i7;
        m2 m2Var = this.f57474r0;
        m2Var.setTextSize(0, f10);
        m2Var.setCursorSize(org.telegram.messenger.g0.L(f10 * 0.4f));
        if (m2Var.getText() != null) {
            Editable text = m2Var.getText();
            g6[] g6VarArr = (g6[]) text.getSpans(0, text.length(), g6.class);
            for (int i10 = 0; i10 < g6VarArr.length; i10++) {
                g6 g6Var = g6VarArr[i10];
                Paint.FontMetricsInt fontMetricsInt = getFontMetricsInt();
                g6Var.f23695a = fontMetricsInt;
                if (fontMetricsInt != null) {
                    int abs = Math.abs(g6Var.f23695a.ascent) + Math.abs(fontMetricsInt.descent);
                    g6Var.f23697c = abs;
                    if (abs == 0) {
                        g6Var.f23697c = org.telegram.messenger.g0.L(20.0f);
                    }
                }
                g6VarArr[i10].f23696b = 0.85f;
            }
            for (p5 p5Var : (p5[]) text.getSpans(0, text.length(), p5.class)) {
                p5Var.replaceFontMetrics(getFontMetricsInt());
            }
            m2Var.q();
        }
    }

    public void setMaxWidth(int i7) {
        this.f57474r0.setMaxWidth(i7);
    }

    public void setSwatch(sg.h1 h1Var) {
        this.f57475s0 = new sg.h1(h1Var.f56645b, h1Var.f56646c, h1Var.f56644a);
        r();
    }

    public void setText(CharSequence charSequence) {
        this.f57474r0.setText(charSequence);
        s();
    }

    public void setType(int i7) {
        this.f57476t0 = i7;
        r();
    }

    public void setTypeface(sg.a0 a0Var) {
        this.f57479w0 = a0Var;
        if (a0Var != null) {
            this.f57474r0.setTypeface(a0Var.d());
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
            if (a0Var.f56580a.equals(str)) {
                setTypeface(a0Var);
                str = null;
                break;
            }
        }
        this.B0 = str;
        m();
    }

    public n2(Context context, n2 n2Var, PointF pointF) {
        this(context, pointF, n2Var.f57477u0, n2Var.getText(), n2Var.getSwatch(), n2Var.f57476t0);
        setRotation(n2Var.getRotation());
        setScale(n2Var.getScale());
        setTypeface(n2Var.getTypeface());
        setAlign(n2Var.getAlign());
        int align = getAlign();
        int i7 = 2;
        this.f57474r0.setGravity(align != 1 ? align != 2 ? 19 : 21 : 17);
        int align2 = getAlign();
        if (align2 == 1) {
            i7 = 4;
        } else if (align2 == 2 ? !hd.f24104a0 : hd.f24104a0) {
            i7 = 3;
        }
        this.f57474r0.setTextAlignment(i7);
    }
}
