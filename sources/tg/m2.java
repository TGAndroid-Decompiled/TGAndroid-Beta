package tg;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Build;
import android.text.Editable;
import android.view.View;
import android.view.ViewGroup;
import bi.s5;
import c8.ma;
import java.util.Iterator;
import org.telegram.messenger.g6;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.messenger.n10;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Components.x5;
import org.telegram.ui.Components.yi0;
public final class m2 extends j {
    public boolean A0;
    public String B0;
    public final l2 f58027r0;
    public sg.h1 f58028s0;
    public int f58029t0;
    public int f58030u0;
    public int f58031v0;
    public sg.a0 f58032w0;
    public int f58033x0;
    public int f58034y0;
    public Runnable f58035z0;

    public m2(Context context, PointF pointF, int i7, CharSequence charSequence, sg.h1 h1Var, int i10) {
        super(context, pointF);
        this.f58032w0 = sg.a0.f57150e;
        this.f58030u0 = i7;
        l2 l2Var = new l2(this, context);
        this.f58027r0 = l2Var;
        ks.i(l2Var);
        l2Var.setGravity(19);
        l2Var.setBackgroundColor(0);
        l2Var.setPadding(org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(7.0f));
        l2Var.setClickable(false);
        l2Var.setEnabled(false);
        l2Var.setCursorColor(-1);
        l2Var.setTextSize(0, this.f58030u0);
        l2Var.setCursorSize(org.telegram.messenger.g0.L(this.f58030u0 * 0.4f));
        l2Var.setText(charSequence);
        s();
        l2Var.setTextColor(h1Var.f57218a);
        l2Var.setTypeface(null, 1);
        l2Var.setHorizontallyScrolling(false);
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 26) {
            l2Var.setImeOptions(285212672);
        } else {
            l2Var.setImeOptions(268435456);
        }
        l2Var.setFocusableInTouchMode(true);
        l2Var.setInputType(16384);
        l2Var.setSingleLine(false);
        addView(l2Var, ma.e(-2, -2, 51));
        if (i11 >= 29) {
            l2Var.setBreakStrategy(0);
        } else {
            l2Var.setBreakStrategy(0);
        }
        setSwatch(h1Var);
        setType(i10);
        k();
        l2Var.addTextChangedListener(new s5(3, this));
    }

    @Override
    public final i a() {
        return new j0(this, getContext());
    }

    public int getAlign() {
        return this.f58031v0;
    }

    public int getBaseFontSize() {
        return this.f58030u0;
    }

    public b getEditText() {
        return this.f58027r0;
    }

    public View getFocusedView() {
        return this.f58027r0;
    }

    public Paint.FontMetricsInt getFontMetricsInt() {
        return this.f58027r0.getPaint().getFontMetricsInt();
    }

    public float getFontSize() {
        return this.f58027r0.getTextSize();
    }

    @Override
    public yi0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new Object();
        }
        float scaleX = viewGroup.getScaleX();
        float L = (org.telegram.messenger.g0.L(64.0f) / scaleX) + (getScale() * getMeasuredWidth());
        float L2 = (org.telegram.messenger.g0.L(52.0f) / scaleX) + (getScale() * getMeasuredHeight());
        float y10 = n10.y(L, 2.0f, getPositionX(), scaleX);
        float positionY = getPositionY();
        l2 l2Var = this.f58027r0;
        return new yi0(y10, (positionY - (((L2 - l2Var.getExtendedPaddingTop()) - org.telegram.messenger.g0.N(4.0f)) / 2.0f)) * scaleX, ((L * scaleX) + y10) - y10, (L2 - l2Var.getExtendedPaddingBottom()) * scaleX);
    }

    @Override
    public float getStickyPaddingBottom() {
        RectF rectF = this.f58027r0.W1;
        if (rectF == null) {
            return 0.0f;
        }
        return rectF.bottom;
    }

    @Override
    public float getStickyPaddingLeft() {
        RectF rectF = this.f58027r0.W1;
        if (rectF == null) {
            return 0.0f;
        }
        return rectF.left;
    }

    @Override
    public float getStickyPaddingRight() {
        RectF rectF = this.f58027r0.W1;
        if (rectF == null) {
            return 0.0f;
        }
        return rectF.right;
    }

    @Override
    public float getStickyPaddingTop() {
        RectF rectF = this.f58027r0.W1;
        if (rectF == null) {
            return 0.0f;
        }
        return rectF.top;
    }

    public sg.h1 getSwatch() {
        return this.f58028s0;
    }

    public CharSequence getText() {
        return this.f58027r0.getText();
    }

    public int getTextSize() {
        return (int) this.f58027r0.getTextSize();
    }

    public int getType() {
        return this.f58029t0;
    }

    public sg.a0 getTypeface() {
        return this.f58032w0;
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
        l2 l2Var = this.f58027r0;
        l2Var.setEnabled(true);
        l2Var.setClickable(true);
        l2Var.requestFocus();
        l2Var.setSelection(l2Var.getText().length());
        org.telegram.messenger.g0.h3(new org.telegram.ui.web.z0(this, 21), 300L);
    }

    public final void r() {
        int i7;
        l2 l2Var = this.f58027r0;
        l2Var.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        int i10 = this.f58028s0.f57218a;
        int i11 = this.f58029t0;
        int i12 = -1;
        if (i11 == 0) {
            l2Var.setFrameColor(i10);
            i10 = org.telegram.messenger.g0.B(this.f58028s0.f57218a) >= 0.721f ? -16777216 : -1;
        } else if (i11 == 1) {
            if (org.telegram.messenger.g0.B(i10) >= 0.25f) {
                i7 = -1728053248;
            } else {
                i7 = -1711276033;
            }
            l2Var.setFrameColor(i7);
        } else if (i11 == 2) {
            if (org.telegram.messenger.g0.B(i10) >= 0.25f) {
                i12 = -16777216;
            }
            l2Var.setFrameColor(i12);
        } else {
            l2Var.setFrameColor(0);
        }
        l2Var.setTextColor(i10);
        l2Var.setCursorColor(i10);
        l2Var.setHandlesColor(i10);
        l2Var.setHighlightColor(n6.r1(0.4f, i10));
    }

    public final void s() {
        l2 l2Var = this.f58027r0;
        if (l2Var.getText().length() <= 0) {
            l2Var.setHint(gd.M0(2131743958, null));
            l2Var.setHintTextColor(1627389951);
            return;
        }
        l2Var.setHint((CharSequence) null);
    }

    public void setAlign(int i7) {
        this.f58031v0 = i7;
    }

    public void setBaseFontSize(int i7) {
        this.f58030u0 = i7;
        float f10 = i7;
        l2 l2Var = this.f58027r0;
        l2Var.setTextSize(0, f10);
        l2Var.setCursorSize(org.telegram.messenger.g0.L(f10 * 0.4f));
        if (l2Var.getText() != null) {
            Editable text = l2Var.getText();
            g6[] g6VarArr = (g6[]) text.getSpans(0, text.length(), g6.class);
            for (int i10 = 0; i10 < g6VarArr.length; i10++) {
                g6 g6Var = g6VarArr[i10];
                Paint.FontMetricsInt fontMetricsInt = getFontMetricsInt();
                g6Var.f24172a = fontMetricsInt;
                if (fontMetricsInt != null) {
                    int abs = Math.abs(g6Var.f24172a.ascent) + Math.abs(fontMetricsInt.descent);
                    g6Var.f24174c = abs;
                    if (abs == 0) {
                        g6Var.f24174c = org.telegram.messenger.g0.L(20.0f);
                    }
                }
                g6VarArr[i10].f24173b = 0.85f;
            }
            for (x5 x5Var : (x5[]) text.getSpans(0, text.length(), x5.class)) {
                x5Var.replaceFontMetrics(getFontMetricsInt());
            }
            l2Var.q();
        }
    }

    public void setMaxWidth(int i7) {
        this.f58027r0.setMaxWidth(i7);
    }

    public void setSwatch(sg.h1 h1Var) {
        this.f58028s0 = new sg.h1(h1Var.f57219b, h1Var.f57220c, h1Var.f57218a);
        r();
    }

    public void setText(CharSequence charSequence) {
        this.f58027r0.setText(charSequence);
        s();
    }

    public void setType(int i7) {
        this.f58029t0 = i7;
        r();
    }

    public void setTypeface(sg.a0 a0Var) {
        this.f58032w0 = a0Var;
        if (a0Var != null) {
            this.f58027r0.setTypeface(a0Var.d());
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
            if (a0Var.f57154a.equals(str)) {
                setTypeface(a0Var);
                str = null;
                break;
            }
        }
        this.B0 = str;
        m();
    }

    public m2(Context context, m2 m2Var, PointF pointF) {
        this(context, pointF, m2Var.f58030u0, m2Var.getText(), m2Var.getSwatch(), m2Var.f58029t0);
        setRotation(m2Var.getRotation());
        setScale(m2Var.getScale());
        setTypeface(m2Var.getTypeface());
        setAlign(m2Var.getAlign());
        int align = getAlign();
        int i7 = 2;
        this.f58027r0.setGravity(align != 1 ? align != 2 ? 19 : 21 : 17);
        int align2 = getAlign();
        if (align2 == 1) {
            i7 = 4;
        } else if (align2 == 2 ? !gd.f24213a0 : gd.f24213a0) {
            i7 = 3;
        }
        this.f58027r0.setTextAlignment(i7);
    }
}
