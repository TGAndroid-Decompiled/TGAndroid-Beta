package zg;

import android.text.SpannableStringBuilder;
import com.google.android.gms.internal.vision.e2;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.o4;
import org.telegram.ui.Components.sk0;
import org.telegram.ui.Components.xc;
import org.telegram.ui.Components.z5;
public final class k implements Runnable {
    public final int f49370a;
    public final Object f49371b;
    public final Object f49372c;

    public k(int i10, Object obj, Object obj2) {
        this.f49370a = i10;
        this.f49371b = obj;
        this.f49372c = obj2;
    }

    @Override
    public final void run() {
        z5[] z5VarArr;
        z5[] z5VarArr2;
        switch (this.f49370a) {
            case 0:
                r rVar = (r) this.f49371b;
                z5 z5Var = (z5) this.f49372c;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(rVar.f49477n.getText());
                for (z5 z5Var2 : (z5[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), z5.class)) {
                    if (z5Var2 == z5Var) {
                        int editTextSelectionEnd = rVar.f49477n.getEditTextSelectionEnd();
                        int spanEnd = spannableStringBuilder.getSpanEnd(z5Var2);
                        int spanStart = spannableStringBuilder.getSpanStart(z5Var2);
                        rVar.f49477n.getText().delete(spanStart, spanEnd);
                        int i10 = spanEnd - spanStart;
                        p pVar = rVar.f49477n;
                        if (spanEnd <= editTextSelectionEnd) {
                            editTextSelectionEnd -= i10;
                        }
                        pVar.setSelection(editTextSelectionEnd);
                        return;
                    }
                }
                return;
            case 1:
                r rVar2 = (r) this.f49371b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f49372c;
                if (rVar2.Q != null && tL_error.text.equals("BOOSTS_REQUIRED")) {
                    r0.f(-rVar2.M, rVar2.R, rVar2.Q);
                    return;
                }
                String str = tL_error.text;
                if (str.equals("REACTIONS_TOO_MANY")) {
                    str = LocaleController.formatPluralString("ReactionMaxCountError", rVar2.J, new Object[0]);
                }
                xc.a0(rVar2).t(str, null).j();
                return;
            case 2:
                z5 z5Var3 = (z5) this.f49372c;
                r rVar3 = ((q) this.f49371b).f49447e2;
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(rVar3.f49477n.getText());
                for (z5 z5Var4 : (z5[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), z5.class)) {
                    if (z5Var4 == z5Var3) {
                        int editTextSelectionEnd2 = rVar3.f49477n.getEditTextSelectionEnd();
                        int spanEnd2 = spannableStringBuilder2.getSpanEnd(z5Var4);
                        int spanStart2 = spannableStringBuilder2.getSpanStart(z5Var4);
                        rVar3.f49477n.getText().delete(spanStart2, spanEnd2);
                        int i11 = spanEnd2 - spanStart2;
                        p pVar2 = rVar3.f49477n;
                        if (spanEnd2 <= editTextSelectionEnd2) {
                            editTextSelectionEnd2 -= i11;
                        }
                        pVar2.setSelection(editTextSelectionEnd2);
                        return;
                    }
                }
                return;
            case 3:
                c0 c0Var = (c0) this.f49371b;
                sk0 sk0Var = (sk0) this.f49372c;
                c0Var.f49307l = true;
                c0Var.f49299a.invalidate();
                sk0Var.f28287b1 = false;
                sk0Var.invalidate();
                c0Var.c(true);
                return;
            case 4:
                e0 e0Var = (e0) this.f49371b;
                b bVar = (b) this.f49372c;
                e0Var.getText().delete(e0Var.getText().getSpanStart(bVar), e0Var.getText().getSpanEnd(bVar));
                e0Var.setCursorVisible(true);
                e0Var.setLongClickable(true);
                return;
            default:
                q0 q0Var = (q0) this.f49371b;
                n0 n0Var = (n0) this.f49372c;
                q0Var.getClass();
                TLRPC.ReactionCount reactionCount = n0Var.f49410a;
                org.telegram.ui.Cells.a0 a0Var = q0Var.f49472z;
                if (e2.u(a0Var)) {
                    ((o4) a0Var).f(reactionCount, true, 0.0f, 0.0f);
                }
                n0Var.Y.c(false);
                q0Var.S = null;
                q0Var.T = false;
                q0Var.U = null;
                return;
        }
    }
}
