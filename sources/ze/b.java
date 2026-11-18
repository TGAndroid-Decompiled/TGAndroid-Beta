package ze;

import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import hi.g;
import hi.n;
import org.telegram.messenger.a8;
import org.telegram.messenger.j6;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.q90;
import ug.n0;
public final class b implements q90 {
    public final int f61914a = 0;
    public Object f61915b;

    public b() {
    }

    @Override
    public Paint.FontMetricsInt P() {
        return ((n) this.f61915b).f15048f.getEditText().getPaint().getFontMetricsInt();
    }

    @Override
    public void l0(int i7, int i10, CharSequence charSequence, boolean z10) {
        g gVar = ((n) this.f61915b).f15048f;
        if (gVar == null) {
            return;
        }
        try {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(gVar.getText());
            spannableStringBuilder.replace(i7, i10 + i7, charSequence);
            if (z10) {
                j6.l(spannableStringBuilder, gVar.getEditText().getPaint().getFontMetricsInt(), false);
            }
            gVar.setText(spannableStringBuilder);
            gVar.setSelection(i7 + charSequence.length());
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    public String toString() {
        switch (this.f61914a) {
            case 0:
                c cVar = c.f61916e;
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("method-execution".substring(7));
                stringBuffer.append("(");
                stringBuffer.append(((n0) this.f61915b).m());
                stringBuffer.append(")");
                return stringBuffer.toString();
            default:
                return super.toString();
        }
    }

    public b(n nVar) {
        this.f61915b = nVar;
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
