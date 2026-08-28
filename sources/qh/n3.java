package qh;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
public final class n3 {
    public final d1 f46537a;
    public final int f46538b;
    public final int f46539c;
    public final b4 d;
    public final TL_iv.RichText f46540e;
    public final o3 f46541f;

    public n3(o3 o3Var, d1 d1Var, int i9, int i10, b4 b4Var) {
        TL_iv.textButton textbutton;
        this.f46541f = o3Var;
        this.f46537a = d1Var;
        this.f46538b = i9;
        this.f46539c = i10;
        this.d = b4Var;
        if (b4Var != null && (textbutton = b4Var.f46313a) != null) {
            this.f46540e = textbutton.text;
        } else {
            this.f46540e = u5.f(new SpannableStringBuilder(d1Var.getText().subSequence(i9, i10)));
        }
    }

    public final void a(TL_keyboard.InlineButtonType inlineButtonType) {
        d1 d1Var;
        Editable text;
        int i9;
        TL_iv.textButton textbutton;
        if (b4.c(inlineButtonType) && (text = (d1Var = this.f46537a).getText()) != null && (i9 = this.f46538b) >= 0) {
            int length = text.length();
            int i10 = this.f46539c;
            if (i10 <= length && i9 < i10) {
                o3 o3Var = this.f46541f;
                b2 b2Var = o3Var.F3;
                if (b2Var != null) {
                    b2Var.d();
                }
                c3 c3Var = o3Var.f46577j3;
                if (c3Var != null) {
                    c3Var.f(false);
                }
                d1Var.setLocked(false);
                for (b4 b4Var : (b4[]) text.getSpans(i9, i10, b4.class)) {
                    text.removeSpan(b4Var);
                }
                u5.n(text, i9, i10);
                u5.m(text, i9, i10);
                b4 b4Var2 = this.d;
                if (b4Var2 == null || (textbutton = b4Var2.f46313a) == null) {
                    textbutton = new TL_iv.textButton();
                }
                textbutton.text = this.f46540e;
                textbutton.type = inlineButtonType;
                if (textbutton.style == null) {
                    textbutton.style = new TL_keyboard.RichButtonStyle();
                }
                b4 b4Var3 = new b4(textbutton);
                b4Var3.a(o3Var.f46561b3, d1Var, o3Var.f46563c3);
                text.setSpan(b4Var3, i9, i10, 33);
                b4Var3.d(text);
                d1Var.setSelection(Math.min(i10, d1Var.length()));
                o3Var.E3 = true;
                try {
                    d1Var.notifySpansChanged();
                    d1Var.requestLayout();
                    d1Var.invalidateEffects();
                    o3Var.E3 = false;
                    b2 b2Var2 = o3Var.F3;
                    if (b2Var2 != null) {
                        b2Var2.h();
                    }
                    o3Var.f46565d3.onContentChanged();
                } catch (Throwable th) {
                    o3Var.E3 = false;
                    throw th;
                }
            }
        }
    }
}
