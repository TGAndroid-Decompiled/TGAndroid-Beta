package ze;

import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import hi.h;
import hi.o;
import org.telegram.messenger.a8;
import org.telegram.messenger.j6;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.s90;
import ug.m0;
public final class b implements s90 {
    public final int f61955a = 0;
    public Object f61956b;

    public b() {
    }

    @Override
    public Paint.FontMetricsInt P() {
        return ((o) this.f61956b).f15148f.getEditText().getPaint().getFontMetricsInt();
    }

    @Override
    public void l0(int i7, int i10, CharSequence charSequence, boolean z10) {
        h hVar = ((o) this.f61956b).f15148f;
        if (hVar == null) {
            return;
        }
        try {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(hVar.getText());
            spannableStringBuilder.replace(i7, i10 + i7, charSequence);
            if (z10) {
                j6.l(spannableStringBuilder, hVar.getEditText().getPaint().getFontMetricsInt(), false);
            }
            hVar.setText(spannableStringBuilder);
            hVar.setSelection(i7 + charSequence.length());
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    public String toString() {
        switch (this.f61955a) {
            case 0:
                c cVar = c.f61957e;
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("method-execution".substring(7));
                stringBuffer.append("(");
                stringBuffer.append(((m0) this.f61956b).m());
                stringBuffer.append(")");
                return stringBuffer.toString();
            default:
                return super.toString();
        }
    }

    public b(o oVar) {
        this.f61956b = oVar;
    }

    @Override
    public void q0(String str) {
    }

    @Override
    public void Y(TLRPC.TL_document tL_document, String str, Object obj) {
    }

    @Override
    public void g(TLRPC.BotInlineResult botInlineResult, boolean z10, int i7) {
    }
}
