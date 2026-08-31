package wh;

import android.text.Editable;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
public final class o2 implements f5, c1 {
    public final r3 f49897a;

    public o2(r3 r3Var) {
        this.f49897a = r3Var;
    }

    public void a(e1 e1Var, e4 e4Var, boolean z4) {
        int spanStart;
        int spanEnd;
        char c3;
        boolean z10;
        boolean z11;
        r3 r3Var = this.f49897a;
        p3 p3Var = r3Var.f49979e3;
        Editable text = e1Var.getText();
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
                TL_iv.textButton textbutton = e4Var.f49725a;
                if (textbutton != null) {
                    d2 d2Var = r3Var.G3;
                    if (d2Var != null) {
                        d2Var.d();
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
                    Editable text2 = e1Var.getText();
                    if (text2 != null && text2.getSpanStart(e4Var) >= 0) {
                        RichMessageLayout.RichButtonSpan richButtonSpan = e4Var.f49726b;
                        if (richButtonSpan != null && e4Var.f49727c == e1Var) {
                            richButtonSpan.detach(e1Var);
                            e4Var.f49727c = null;
                        }
                        text2.removeSpan(e4Var);
                        e4 e4Var2 = new e4(textbutton);
                        e4Var2.a(r3Var.c3, e1Var, r3Var.f49977d3);
                        text2.setSpan(e4Var2, spanStart, spanEnd, 33);
                        e1Var.notifySpansChanged();
                        e1Var.requestLayout();
                        e1Var.invalidateEffects();
                        p3Var.onContentChanged();
                        return;
                    }
                    return;
                }
                return;
            }
            r3Var.o3(false);
            p3Var.x(new q3(r3Var, e1Var, spanStart, spanEnd, e4Var), e1Var);
        }
    }
}
