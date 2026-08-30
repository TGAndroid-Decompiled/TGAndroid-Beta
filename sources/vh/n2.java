package vh;

import android.text.Editable;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
public final class n2 implements f5, b1 {
    public final r3 f46025a;

    public n2(r3 r3Var) {
        this.f46025a = r3Var;
    }

    public void a(d1 d1Var, e4 e4Var, boolean z4) {
        int spanStart;
        int spanEnd;
        char c3;
        boolean z10;
        boolean z11;
        r3 r3Var = this.f46025a;
        p3 p3Var = r3Var.f46112e3;
        Editable text = d1Var.getText();
        if (text == null) {
            spanStart = -1;
        } else {
            spanStart = text.getSpanStart(e4Var);
        }
        if (text == null) {
            spanEnd = -1;
        } else {
            spanEnd = text.getSpanEnd(e4Var);
        }
        if (spanStart >= 0 && spanEnd > spanStart) {
            if (!z4) {
                TL_iv.textButton textbutton = e4Var.f45878a;
                if (textbutton != null) {
                    c2 c2Var = r3Var.G3;
                    if (c2Var != null) {
                        c2Var.d();
                    }
                    TL_keyboard.RichButtonStyle richButtonStyle = textbutton.style;
                    boolean z12 = true;
                    if (richButtonStyle != null && richButtonStyle.bg_primary) {
                        c3 = 2;
                    } else if (richButtonStyle != null && richButtonStyle.bg_danger) {
                        c3 = 3;
                    } else if (richButtonStyle != null && richButtonStyle.bg_success) {
                        c3 = 0;
                    } else {
                        c3 = 1;
                    }
                    if (richButtonStyle == null) {
                        richButtonStyle = new TL_keyboard.RichButtonStyle();
                    }
                    richButtonStyle.flags = 0;
                    if (c3 == 1) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    richButtonStyle.bg_primary = z10;
                    if (c3 == 2) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    richButtonStyle.bg_danger = z11;
                    if (c3 != 3) {
                        z12 = false;
                    }
                    richButtonStyle.bg_success = z12;
                    richButtonStyle.link = false;
                    textbutton.style = richButtonStyle;
                    Editable text2 = d1Var.getText();
                    if (text2 != null && text2.getSpanStart(e4Var) >= 0) {
                        RichMessageLayout.RichButtonSpan richButtonSpan = e4Var.f45879b;
                        if (richButtonSpan != null && e4Var.f45880c == d1Var) {
                            richButtonSpan.detach(d1Var);
                            e4Var.f45880c = null;
                        }
                        text2.removeSpan(e4Var);
                        e4 e4Var2 = new e4(textbutton);
                        e4Var2.a(r3Var.c3, d1Var, r3Var.f46110d3);
                        text2.setSpan(e4Var2, spanStart, spanEnd, 33);
                        d1Var.notifySpansChanged();
                        d1Var.requestLayout();
                        d1Var.invalidateEffects();
                        p3Var.onContentChanged();
                        return;
                    }
                    return;
                }
                return;
            }
            r3Var.o3(false);
            p3Var.w(new q3(r3Var, d1Var, spanStart, spanEnd, e4Var), d1Var);
        }
    }
}
