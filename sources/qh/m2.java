package qh;

import android.text.Editable;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
public final class m2 implements c5, b1 {
    public final o3 f46522a;

    public m2(o3 o3Var) {
        this.f46522a = o3Var;
    }

    public void a(d1 d1Var, b4 b4Var, boolean z10) {
        int spanStart;
        int spanEnd;
        char c10;
        boolean z11;
        boolean z12;
        o3 o3Var = this.f46522a;
        m3 m3Var = o3Var.f46565d3;
        Editable text = d1Var.getText();
        if (text == null) {
            spanStart = -1;
        } else {
            spanStart = text.getSpanStart(b4Var);
        }
        if (text == null) {
            spanEnd = -1;
        } else {
            spanEnd = text.getSpanEnd(b4Var);
        }
        if (spanStart >= 0 && spanEnd > spanStart) {
            if (!z10) {
                TL_iv.textButton textbutton = b4Var.f46313a;
                if (textbutton != null) {
                    b2 b2Var = o3Var.F3;
                    if (b2Var != null) {
                        b2Var.d();
                    }
                    TL_keyboard.RichButtonStyle richButtonStyle = textbutton.style;
                    boolean z13 = true;
                    if (richButtonStyle != null && richButtonStyle.bg_primary) {
                        c10 = 2;
                    } else if (richButtonStyle != null && richButtonStyle.bg_danger) {
                        c10 = 3;
                    } else if (richButtonStyle != null && richButtonStyle.bg_success) {
                        c10 = 0;
                    } else {
                        c10 = 1;
                    }
                    if (richButtonStyle == null) {
                        richButtonStyle = new TL_keyboard.RichButtonStyle();
                    }
                    richButtonStyle.flags = 0;
                    if (c10 == 1) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    richButtonStyle.bg_primary = z11;
                    if (c10 == 2) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    richButtonStyle.bg_danger = z12;
                    if (c10 != 3) {
                        z13 = false;
                    }
                    richButtonStyle.bg_success = z13;
                    richButtonStyle.link = false;
                    textbutton.style = richButtonStyle;
                    Editable text2 = d1Var.getText();
                    if (text2 != null && text2.getSpanStart(b4Var) >= 0) {
                        RichMessageLayout.RichButtonSpan richButtonSpan = b4Var.f46314b;
                        if (richButtonSpan != null && b4Var.f46315c == d1Var) {
                            richButtonSpan.detach(d1Var);
                            b4Var.f46315c = null;
                        }
                        text2.removeSpan(b4Var);
                        b4 b4Var2 = new b4(textbutton);
                        b4Var2.a(o3Var.f46561b3, d1Var, o3Var.f46563c3);
                        text2.setSpan(b4Var2, spanStart, spanEnd, 33);
                        d1Var.notifySpansChanged();
                        d1Var.requestLayout();
                        d1Var.invalidateEffects();
                        m3Var.onContentChanged();
                        return;
                    }
                    return;
                }
                return;
            }
            o3Var.o3(false);
            m3Var.X1(new n3(o3Var, d1Var, spanStart, spanEnd, b4Var), d1Var);
        }
    }
}
