package th;

import android.text.Editable;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
public final class m2 implements d5, b1 {
    public final p3 f48568a;

    public m2(p3 p3Var) {
        this.f48568a = p3Var;
    }

    public void a(d1 d1Var, c4 c4Var, boolean z10) {
        int spanStart;
        int spanEnd;
        char c3;
        boolean z11;
        boolean z12;
        p3 p3Var = this.f48568a;
        n3 n3Var = p3Var.f48638d3;
        Editable text = d1Var.getText();
        if (text == null) {
            spanStart = -1;
        } else {
            spanStart = text.getSpanStart(c4Var);
        }
        if (text == null) {
            spanEnd = -1;
        } else {
            spanEnd = text.getSpanEnd(c4Var);
        }
        if (spanStart >= 0 && spanEnd > spanStart) {
            if (!z10) {
                TL_iv.textButton textbutton = c4Var.f48388a;
                if (textbutton != null) {
                    b2 b2Var = p3Var.F3;
                    if (b2Var != null) {
                        b2Var.d();
                    }
                    TL_keyboard.RichButtonStyle richButtonStyle = textbutton.style;
                    boolean z13 = true;
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
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    richButtonStyle.bg_primary = z11;
                    if (c3 == 2) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    richButtonStyle.bg_danger = z12;
                    if (c3 != 3) {
                        z13 = false;
                    }
                    richButtonStyle.bg_success = z13;
                    richButtonStyle.link = false;
                    textbutton.style = richButtonStyle;
                    Editable text2 = d1Var.getText();
                    if (text2 != null && text2.getSpanStart(c4Var) >= 0) {
                        RichMessageLayout.RichButtonSpan richButtonSpan = c4Var.f48389b;
                        if (richButtonSpan != null && c4Var.f48390c == d1Var) {
                            richButtonSpan.detach(d1Var);
                            c4Var.f48390c = null;
                        }
                        text2.removeSpan(c4Var);
                        c4 c4Var2 = new c4(textbutton);
                        c4Var2.a(p3Var.f48635b3, d1Var, p3Var.c3);
                        text2.setSpan(c4Var2, spanStart, spanEnd, 33);
                        d1Var.notifySpansChanged();
                        d1Var.requestLayout();
                        d1Var.invalidateEffects();
                        n3Var.onContentChanged();
                        return;
                    }
                    return;
                }
                return;
            }
            p3Var.o3(false);
            n3Var.U0(new o3(p3Var, d1Var, spanStart, spanEnd, c4Var), d1Var);
        }
    }
}
