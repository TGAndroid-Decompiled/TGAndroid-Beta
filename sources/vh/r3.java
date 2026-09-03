package vh;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
public final class r3 {
    public final e1 f46187a;
    public final int f46188b;
    public final int f46189c;
    public final f4 d;
    public final TL_iv.RichText e;
    public final s3 f46190f;

    public r3(s3 s3Var, e1 e1Var, int i10, int i11, f4 f4Var) {
        TL_iv.textButton textbutton;
        this.f46190f = s3Var;
        this.f46187a = e1Var;
        this.f46188b = i10;
        this.f46189c = i11;
        this.d = f4Var;
        if (f4Var != null && (textbutton = f4Var.f45975a) != null) {
            this.e = textbutton.text;
        } else {
            this.e = y5.f(new SpannableStringBuilder(e1Var.getText().subSequence(i10, i11)));
        }
    }

    public final void a(TL_keyboard.InlineButtonType inlineButtonType) {
        e1 e1Var;
        Editable text;
        int i10;
        TL_iv.textButton textbutton;
        if (f4.c(inlineButtonType) && (text = (e1Var = this.f46187a).getText()) != null && (i10 = this.f46188b) >= 0) {
            int length = text.length();
            int i11 = this.f46189c;
            if (i11 <= length && i10 < i11) {
                s3 s3Var = this.f46190f;
                d2 d2Var = s3Var.G3;
                if (d2Var != null) {
                    d2Var.d();
                }
                g3 g3Var = s3Var.f46221k3;
                if (g3Var != null) {
                    g3Var.f(false);
                }
                e1Var.setLocked(false);
                for (f4 f4Var : (f4[]) text.getSpans(i10, i11, f4.class)) {
                    text.removeSpan(f4Var);
                }
                y5.n(text, i10, i11);
                y5.m(text, i10, i11);
                f4 f4Var2 = this.d;
                if (f4Var2 == null || (textbutton = f4Var2.f45975a) == null) {
                    textbutton = new TL_iv.textButton();
                }
                textbutton.text = this.e;
                textbutton.type = inlineButtonType;
                if (textbutton.style == null) {
                    textbutton.style = new TL_keyboard.RichButtonStyle();
                }
                f4 f4Var3 = new f4(textbutton);
                f4Var3.a(s3Var.c3, e1Var, s3Var.f46207d3);
                text.setSpan(f4Var3, i10, i11, 33);
                f4Var3.d(text);
                e1Var.setSelection(Math.min(i11, e1Var.length()));
                s3Var.F3 = true;
                try {
                    e1Var.notifySpansChanged();
                    e1Var.requestLayout();
                    e1Var.invalidateEffects();
                    s3Var.F3 = false;
                    d2 d2Var2 = s3Var.G3;
                    if (d2Var2 != null) {
                        d2Var2.h();
                    }
                    s3Var.f46209e3.onContentChanged();
                } catch (Throwable th2) {
                    s3Var.F3 = false;
                    throw th2;
                }
            }
        }
    }
}
