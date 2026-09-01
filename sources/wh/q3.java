package wh;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
public final class q3 {
    public final e1 f49945a;
    public final int f49946b;
    public final int f49947c;
    public final e4 d;
    public final TL_iv.RichText f49948e;
    public final r3 f49949f;

    public q3(r3 r3Var, e1 e1Var, int i10, int i11, e4 e4Var) {
        TL_iv.textButton textbutton;
        this.f49949f = r3Var;
        this.f49945a = e1Var;
        this.f49946b = i10;
        this.f49947c = i11;
        this.d = e4Var;
        if (e4Var != null && (textbutton = e4Var.f49726a) != null) {
            this.f49948e = textbutton.text;
        } else {
            this.f49948e = x5.f(new SpannableStringBuilder(e1Var.getText().subSequence(i10, i11)));
        }
    }

    public final void a(TL_keyboard.InlineButtonType inlineButtonType) {
        e1 e1Var;
        Editable text;
        int i10;
        TL_iv.textButton textbutton;
        if (e4.c(inlineButtonType) && (text = (e1Var = this.f49945a).getText()) != null && (i10 = this.f49946b) >= 0) {
            int length = text.length();
            int i11 = this.f49947c;
            if (i11 <= length && i10 < i11) {
                r3 r3Var = this.f49949f;
                d2 d2Var = r3Var.G3;
                if (d2Var != null) {
                    d2Var.d();
                }
                f3 f3Var = r3Var.f49992k3;
                if (f3Var != null) {
                    f3Var.f(false);
                }
                e1Var.setLocked(false);
                for (e4 e4Var : (e4[]) text.getSpans(i10, i11, e4.class)) {
                    text.removeSpan(e4Var);
                }
                x5.n(text, i10, i11);
                x5.m(text, i10, i11);
                e4 e4Var2 = this.d;
                if (e4Var2 == null || (textbutton = e4Var2.f49726a) == null) {
                    textbutton = new TL_iv.textButton();
                }
                textbutton.text = this.f49948e;
                textbutton.type = inlineButtonType;
                if (textbutton.style == null) {
                    textbutton.style = new TL_keyboard.RichButtonStyle();
                }
                e4 e4Var3 = new e4(textbutton);
                e4Var3.a(r3Var.c3, e1Var, r3Var.f49978d3);
                text.setSpan(e4Var3, i10, i11, 33);
                e4Var3.d(text);
                e1Var.setSelection(Math.min(i11, e1Var.length()));
                r3Var.F3 = true;
                try {
                    e1Var.notifySpansChanged();
                    e1Var.requestLayout();
                    e1Var.invalidateEffects();
                    r3Var.F3 = false;
                    d2 d2Var2 = r3Var.G3;
                    if (d2Var2 != null) {
                        d2Var2.h();
                    }
                    r3Var.f49980e3.onContentChanged();
                } catch (Throwable th2) {
                    r3Var.F3 = false;
                    throw th2;
                }
            }
        }
    }
}
