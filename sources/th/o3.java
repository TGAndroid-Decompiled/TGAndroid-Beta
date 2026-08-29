package th;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
public final class o3 {
    public final d1 f48610a;
    public final int f48611b;
    public final int f48612c;
    public final c4 d;
    public final TL_iv.RichText f48613e;
    public final p3 f48614f;

    public o3(p3 p3Var, d1 d1Var, int i10, int i11, c4 c4Var) {
        TL_iv.textButton textbutton;
        this.f48614f = p3Var;
        this.f48610a = d1Var;
        this.f48611b = i10;
        this.f48612c = i11;
        this.d = c4Var;
        if (c4Var != null && (textbutton = c4Var.f48388a) != null) {
            this.f48613e = textbutton.text;
        } else {
            this.f48613e = v5.f(new SpannableStringBuilder(d1Var.getText().subSequence(i10, i11)));
        }
    }

    public final void a(TL_keyboard.InlineButtonType inlineButtonType) {
        d1 d1Var;
        Editable text;
        int i10;
        TL_iv.textButton textbutton;
        if (c4.c(inlineButtonType) && (text = (d1Var = this.f48610a).getText()) != null && (i10 = this.f48611b) >= 0) {
            int length = text.length();
            int i11 = this.f48612c;
            if (i11 <= length && i10 < i11) {
                p3 p3Var = this.f48614f;
                b2 b2Var = p3Var.F3;
                if (b2Var != null) {
                    b2Var.d();
                }
                d3 d3Var = p3Var.f48650j3;
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
                if (c4Var2 == null || (textbutton = c4Var2.f48388a) == null) {
                    textbutton = new TL_iv.textButton();
                }
                textbutton.text = this.f48613e;
                textbutton.type = inlineButtonType;
                if (textbutton.style == null) {
                    textbutton.style = new TL_keyboard.RichButtonStyle();
                }
                c4 c4Var3 = new c4(textbutton);
                c4Var3.a(p3Var.f48635b3, d1Var, p3Var.c3);
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
                    p3Var.f48638d3.onContentChanged();
                } catch (Throwable th2) {
                    p3Var.E3 = false;
                    throw th2;
                }
            }
        }
    }
}
