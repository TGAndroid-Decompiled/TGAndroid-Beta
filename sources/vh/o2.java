package vh;

import android.text.Editable;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
public final class o2 implements g5, c1 {
    public final s3 f46122a;

    public o2(s3 s3Var) {
        this.f46122a = s3Var;
    }

    public void a(e1 e1Var, f4 f4Var, boolean z4) {
        int spanStart;
        int spanEnd;
        char c3;
        boolean z10;
        boolean z11;
        s3 s3Var = this.f46122a;
        q3 q3Var = s3Var.f46209e3;
        Editable text = e1Var.getText();
        if (text == null) {
            spanStart = -1;
        } else {
            spanStart = text.getSpanStart(f4Var);
        }
        if (text == null) {
            spanEnd = -1;
        } else {
            spanEnd = text.getSpanEnd(f4Var);
        }
        if (spanStart >= 0 && spanEnd > spanStart) {
            if (!z4) {
                TL_iv.textButton textbutton = f4Var.f45975a;
                if (textbutton != null) {
                    d2 d2Var = s3Var.G3;
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
                    if (text2 != null && text2.getSpanStart(f4Var) >= 0) {
                        RichMessageLayout.RichButtonSpan richButtonSpan = f4Var.f45976b;
                        if (richButtonSpan != null && f4Var.f45977c == e1Var) {
                            richButtonSpan.detach(e1Var);
                            f4Var.f45977c = null;
                        }
                        text2.removeSpan(f4Var);
                        f4 f4Var2 = new f4(textbutton);
                        f4Var2.a(s3Var.c3, e1Var, s3Var.f46207d3);
                        text2.setSpan(f4Var2, spanStart, spanEnd, 33);
                        e1Var.notifySpansChanged();
                        e1Var.requestLayout();
                        e1Var.invalidateEffects();
                        q3Var.onContentChanged();
                        return;
                    }
                    return;
                }
                return;
            }
            s3Var.n3(false);
            q3Var.w(new r3(s3Var, e1Var, spanStart, spanEnd, f4Var), e1Var);
        }
    }
}
