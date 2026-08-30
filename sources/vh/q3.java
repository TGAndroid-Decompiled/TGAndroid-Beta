package vh;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
public final class q3 {
    public final d1 f46087a;
    public final int f46088b;
    public final int f46089c;
    public final e4 d;
    public final TL_iv.RichText e;
    public final r3 f46090f;

    public q3(r3 r3Var, d1 d1Var, int i10, int i11, e4 e4Var) {
        TL_iv.textButton textbutton;
        this.f46090f = r3Var;
        this.f46087a = d1Var;
        this.f46088b = i10;
        this.f46089c = i11;
        this.d = e4Var;
        if (e4Var != null && (textbutton = e4Var.f45878a) != null) {
            this.e = textbutton.text;
        } else {
            this.e = x5.f(new SpannableStringBuilder(d1Var.getText().subSequence(i10, i11)));
        }
    }

    public final void a(TL_keyboard.InlineButtonType inlineButtonType) {
        d1 d1Var;
        Editable text;
        int i10;
        TL_iv.textButton textbutton;
        if (e4.c(inlineButtonType) && (text = (d1Var = this.f46087a).getText()) != null && (i10 = this.f46088b) >= 0) {
            int length = text.length();
            int i11 = this.f46089c;
            if (i11 <= length && i10 < i11) {
                r3 r3Var = this.f46090f;
                c2 c2Var = r3Var.G3;
                if (c2Var != null) {
                    c2Var.d();
                }
                f3 f3Var = r3Var.f46124k3;
                if (f3Var != null) {
                    f3Var.f(false);
                }
                d1Var.setLocked(false);
                for (e4 e4Var : (e4[]) text.getSpans(i10, i11, e4.class)) {
                    text.removeSpan(e4Var);
                }
                x5.n(text, i10, i11);
                x5.m(text, i10, i11);
                e4 e4Var2 = this.d;
                if (e4Var2 == null || (textbutton = e4Var2.f45878a) == null) {
                    textbutton = new TL_iv.textButton();
                }
                textbutton.text = this.e;
                textbutton.type = inlineButtonType;
                if (textbutton.style == null) {
                    textbutton.style = new TL_keyboard.RichButtonStyle();
                }
                e4 e4Var3 = new e4(textbutton);
                e4Var3.a(r3Var.c3, d1Var, r3Var.f46110d3);
                text.setSpan(e4Var3, i10, i11, 33);
                e4Var3.d(text);
                d1Var.setSelection(Math.min(i11, d1Var.length()));
                r3Var.F3 = true;
                try {
                    d1Var.notifySpansChanged();
                    d1Var.requestLayout();
                    d1Var.invalidateEffects();
                    r3Var.F3 = false;
                    c2 c2Var2 = r3Var.G3;
                    if (c2Var2 != null) {
                        c2Var2.h();
                    }
                    r3Var.f46112e3.onContentChanged();
                } catch (Throwable th2) {
                    r3Var.F3 = false;
                    throw th2;
                }
            }
        }
    }
}
