package yh;

import android.text.SpannableStringBuilder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.qk0;
import org.telegram.ui.Components.xc;
public final class x7 implements Runnable {
    public final int f48223a;
    public final Object f48224b;
    public final Object f48225c;

    public x7(int i10, Object obj, Object obj2) {
        this.f48223a = i10;
        this.f48224b = obj;
        this.f48225c = obj2;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.z5[] z5VarArr;
        org.telegram.ui.Components.z5[] z5VarArr2;
        switch (this.f48223a) {
            case 0:
                o8 o8Var = (o8) this.f48224b;
                o8Var.R = true;
                o8Var.o(new q5((s5) this.f48225c, 2));
                AndroidUtilities.runOnUIThread(new w7(o8Var, 1), 240L);
                return;
            case 1:
                zg.q qVar = (zg.q) this.f48224b;
                org.telegram.ui.Components.z5 z5Var = (org.telegram.ui.Components.z5) this.f48225c;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(qVar.f49410n.getText());
                for (org.telegram.ui.Components.z5 z5Var2 : (org.telegram.ui.Components.z5[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), org.telegram.ui.Components.z5.class)) {
                    if (z5Var2 == z5Var) {
                        int editTextSelectionEnd = qVar.f49410n.getEditTextSelectionEnd();
                        int spanEnd = spannableStringBuilder.getSpanEnd(z5Var2);
                        int spanStart = spannableStringBuilder.getSpanStart(z5Var2);
                        qVar.f49410n.getText().delete(spanStart, spanEnd);
                        int i10 = spanEnd - spanStart;
                        zg.o oVar = qVar.f49410n;
                        if (spanEnd <= editTextSelectionEnd) {
                            editTextSelectionEnd -= i10;
                        }
                        oVar.setSelection(editTextSelectionEnd);
                        return;
                    }
                }
                return;
            case 2:
                zg.q qVar2 = (zg.q) this.f48224b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f48225c;
                if (qVar2.Q != null && tL_error.text.equals("BOOSTS_REQUIRED")) {
                    zg.q0.f(-qVar2.M, qVar2.R, qVar2.Q);
                    return;
                }
                String str = tL_error.text;
                if (str.equals("REACTIONS_TOO_MANY")) {
                    str = LocaleController.formatPluralString("ReactionMaxCountError", qVar2.J, new Object[0]);
                }
                xc.a0(qVar2).t(str, null).j();
                return;
            case 3:
                org.telegram.ui.Components.z5 z5Var3 = (org.telegram.ui.Components.z5) this.f48225c;
                zg.q qVar3 = ((zg.p) this.f48224b).f49380e2;
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(qVar3.f49410n.getText());
                for (org.telegram.ui.Components.z5 z5Var4 : (org.telegram.ui.Components.z5[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), org.telegram.ui.Components.z5.class)) {
                    if (z5Var4 == z5Var3) {
                        int editTextSelectionEnd2 = qVar3.f49410n.getEditTextSelectionEnd();
                        int spanEnd2 = spannableStringBuilder2.getSpanEnd(z5Var4);
                        int spanStart2 = spannableStringBuilder2.getSpanStart(z5Var4);
                        qVar3.f49410n.getText().delete(spanStart2, spanEnd2);
                        int i11 = spanEnd2 - spanStart2;
                        zg.o oVar2 = qVar3.f49410n;
                        if (spanEnd2 <= editTextSelectionEnd2) {
                            editTextSelectionEnd2 -= i11;
                        }
                        oVar2.setSelection(editTextSelectionEnd2);
                        return;
                    }
                }
                return;
            case 4:
                zg.b0 b0Var = (zg.b0) this.f48224b;
                qk0 qk0Var = (qk0) this.f48225c;
                b0Var.f49234l = true;
                b0Var.f49226a.invalidate();
                qk0Var.f27639b1 = false;
                qk0Var.invalidate();
                b0Var.c(true);
                return;
            case 5:
                zg.d0 d0Var = (zg.d0) this.f48224b;
                zg.b bVar = (zg.b) this.f48225c;
                d0Var.getText().delete(d0Var.getText().getSpanStart(bVar), d0Var.getText().getSpanEnd(bVar));
                d0Var.setCursorVisible(true);
                d0Var.setLongClickable(true);
                return;
            default:
                zg.p0 p0Var = (zg.p0) this.f48224b;
                zg.m0 m0Var = (zg.m0) this.f48225c;
                p0Var.getClass();
                TLRPC.ReactionCount reactionCount = m0Var.f49343a;
                org.telegram.ui.Cells.a0 a0Var = p0Var.f49405z;
                if (com.google.android.gms.internal.vision.e2.u(a0Var)) {
                    ((org.telegram.ui.Cells.o4) a0Var).f(reactionCount, true, 0.0f, 0.0f);
                }
                m0Var.Y.c(false);
                p0Var.S = null;
                p0Var.T = false;
                p0Var.U = null;
                return;
        }
    }
}
