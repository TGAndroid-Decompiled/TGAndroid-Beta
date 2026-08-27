package rh;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;

public final class o3 {

    public final d1 f47311a;

    public final int f47312b;

    public final int f47313c;
    public final c4 d;

    public final TL_iv.RichText f47314e;

    public final p3 f47315f;

    public o3(p3 p3Var, d1 d1Var, int i10, int i11, c4 c4Var) {
        TL_iv.textButton textbutton;
        this.f47315f = p3Var;
        this.f47311a = d1Var;
        this.f47312b = i10;
        this.f47313c = i11;
        this.d = c4Var;
        if (c4Var == null || (textbutton = c4Var.f47088a) == null) {
            this.f47314e = v5.f(new SpannableStringBuilder(d1Var.getText().subSequence(i10, i11)));
        } else {
            this.f47314e = textbutton.text;
        }
    }

    public final void a(TL_keyboard.InlineButtonType inlineButtonType) {
        d1 d1Var;
        Editable text;
        int i10;
        TL_iv.textButton textbutton;
        if (c4.c(inlineButtonType) && (text = (d1Var = this.f47311a).getText()) != null && (i10 = this.f47312b) >= 0) {
            int length = text.length();
            int i11 = this.f47313c;
            if (i11 > length || i10 >= i11) {
                return;
            }
            p3 p3Var = this.f47315f;
            b2 b2Var = p3Var.F3;
            if (b2Var != null) {
                b2Var.d();
            }
            d3 d3Var = p3Var.f47352j3;
            if (d3Var != null) {
                d3Var.f(false);
            }
            d1Var.setLocked(false);
            for (c4 c4Var : (c4[]) text.getSpans(i10, i11, c4.class)) {
                text.removeSpan(c4Var);
            }
            v5.n(text, i10, i11);
            v5.m(text, i10, i11);
            c4 c4Var2 = this.d;
            if (c4Var2 == null || (textbutton = c4Var2.f47088a) == null) {
                textbutton = new TL_iv.textButton();
            }
            textbutton.text = this.f47314e;
            textbutton.type = inlineButtonType;
            if (textbutton.style == null) {
                textbutton.style = new TL_keyboard.RichButtonStyle();
            }
            c4 c4Var3 = new c4(textbutton);
            c4Var3.a(p3Var.f47336b3, d1Var, p3Var.f47338c3);
            text.setSpan(c4Var3, i10, i11, 33);
            c4Var3.d(text);
            d1Var.setSelection(Math.min(i11, d1Var.length()));
            p3Var.E3 = true;
            try {
                d1Var.notifySpansChanged();
                d1Var.requestLayout();
                d1Var.invalidateEffects();
                p3Var.E3 = false;
                b2 b2Var2 = p3Var.F3;
                if (b2Var2 != null) {
                    b2Var2.h();
                }
                p3Var.f47340d3.onContentChanged();
            } catch (Throwable th) {
                p3Var.E3 = false;
                throw th;
            }
        }
    }
}
