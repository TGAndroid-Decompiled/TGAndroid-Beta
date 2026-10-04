package yh;

import android.text.SpannableStringBuilder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.sk0;
import org.telegram.ui.Components.yc;
public final class r5 implements Runnable {
    public final int f51904a;
    public final Object f51905b;
    public final Object f51906c;

    public r5(int i10, Object obj, Object obj2) {
        this.f51904a = i10;
        this.f51905b = obj;
        this.f51906c = obj2;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.z5[] z5VarArr;
        org.telegram.ui.Components.z5[] z5VarArr2;
        switch (this.f51904a) {
            case 0:
                ((MessagesController) this.f51905b).processUpdates((TLRPC.Updates) ((TLObject) this.f51906c), false);
                return;
            case 1:
                new yc(((org.telegram.ui.ActionBar.f3[]) this.f51905b)[0].topBulletinContainer, (org.telegram.ui.ActionBar.d6) this.f51906c).Q(R.raw.copy, 36, LocaleController.getString(R.string.StarsTransactionIDCopied)).k(false);
                return;
            case 2:
                p8 p8Var = (p8) this.f51905b;
                p8Var.R = true;
                p8Var.o(new p5((s5) this.f51906c, 2));
                AndroidUtilities.runOnUIThread(new y7(p8Var, 1), 240L);
                return;
            case 3:
                zg.q qVar = (zg.q) this.f51905b;
                org.telegram.ui.Components.z5 z5Var = (org.telegram.ui.Components.z5) this.f51906c;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(qVar.f53520n.getText());
                for (org.telegram.ui.Components.z5 z5Var2 : (org.telegram.ui.Components.z5[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), org.telegram.ui.Components.z5.class)) {
                    if (z5Var2 == z5Var) {
                        int editTextSelectionEnd = qVar.f53520n.getEditTextSelectionEnd();
                        int spanEnd = spannableStringBuilder.getSpanEnd(z5Var2);
                        int spanStart = spannableStringBuilder.getSpanStart(z5Var2);
                        qVar.f53520n.getText().delete(spanStart, spanEnd);
                        int i10 = spanEnd - spanStart;
                        zg.o oVar = qVar.f53520n;
                        if (spanEnd <= editTextSelectionEnd) {
                            editTextSelectionEnd -= i10;
                        }
                        oVar.setSelection(editTextSelectionEnd);
                        return;
                    }
                }
                return;
            case 4:
                zg.q qVar2 = (zg.q) this.f51905b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f51906c;
                if (qVar2.Q != null && tL_error.text.equals("BOOSTS_REQUIRED")) {
                    zg.q0.f(-qVar2.M, qVar2.R, qVar2.Q);
                    return;
                }
                String str = tL_error.text;
                if (str.equals("REACTIONS_TOO_MANY")) {
                    str = LocaleController.formatPluralString("ReactionMaxCountError", qVar2.J, new Object[0]);
                }
                yc.a0(qVar2).t(str, null).j();
                return;
            case 5:
                org.telegram.ui.Components.z5 z5Var3 = (org.telegram.ui.Components.z5) this.f51906c;
                zg.q qVar3 = ((zg.p) this.f51905b).f53488e2;
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(qVar3.f53520n.getText());
                for (org.telegram.ui.Components.z5 z5Var4 : (org.telegram.ui.Components.z5[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), org.telegram.ui.Components.z5.class)) {
                    if (z5Var4 == z5Var3) {
                        int editTextSelectionEnd2 = qVar3.f53520n.getEditTextSelectionEnd();
                        int spanEnd2 = spannableStringBuilder2.getSpanEnd(z5Var4);
                        int spanStart2 = spannableStringBuilder2.getSpanStart(z5Var4);
                        qVar3.f53520n.getText().delete(spanStart2, spanEnd2);
                        int i11 = spanEnd2 - spanStart2;
                        zg.o oVar2 = qVar3.f53520n;
                        if (spanEnd2 <= editTextSelectionEnd2) {
                            editTextSelectionEnd2 -= i11;
                        }
                        oVar2.setSelection(editTextSelectionEnd2);
                        return;
                    }
                }
                return;
            case 6:
                zg.b0 b0Var = (zg.b0) this.f51905b;
                sk0 sk0Var = (sk0) this.f51906c;
                b0Var.f53331l = true;
                b0Var.f53322a.invalidate();
                sk0Var.f30765b1 = false;
                sk0Var.invalidate();
                b0Var.c(true);
                return;
            case 7:
                zg.d0 d0Var = (zg.d0) this.f51905b;
                zg.b bVar = (zg.b) this.f51906c;
                d0Var.getText().delete(d0Var.getText().getSpanStart(bVar), d0Var.getText().getSpanEnd(bVar));
                d0Var.setCursorVisible(true);
                d0Var.setLongClickable(true);
                return;
            default:
                zg.p0 p0Var = (zg.p0) this.f51905b;
                zg.m0 m0Var = (zg.m0) this.f51906c;
                p0Var.getClass();
                TLRPC.ReactionCount reactionCount = m0Var.f53449a;
                org.telegram.ui.Cells.a0 a0Var = p0Var.f53514z;
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
