package yh;

import android.text.SpannableStringBuilder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.sk0;
import org.telegram.ui.Components.xc;
public final class s5 implements Runnable {
    public final int f48068a;
    public final Object f48069b;
    public final Object f48070c;

    public s5(int i10, Object obj, Object obj2) {
        this.f48068a = i10;
        this.f48069b = obj;
        this.f48070c = obj2;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.y5[] y5VarArr;
        org.telegram.ui.Components.y5[] y5VarArr2;
        switch (this.f48068a) {
            case 0:
                ((MessagesController) this.f48069b).processUpdates((TLRPC.Updates) ((TLObject) this.f48070c), false);
                return;
            case 1:
                new xc(((org.telegram.ui.ActionBar.f3[]) this.f48069b)[0].topBulletinContainer, (org.telegram.ui.ActionBar.f6) this.f48070c).Q(R.raw.copy, 36, LocaleController.getString(R.string.StarsTransactionIDCopied)).k(false);
                return;
            case 2:
                o8 o8Var = (o8) this.f48069b;
                o8Var.R = true;
                o8Var.o(new q5((t5) this.f48070c, 2));
                AndroidUtilities.runOnUIThread(new x7(o8Var, 1), 240L);
                return;
            case 3:
                zg.q qVar = (zg.q) this.f48069b;
                org.telegram.ui.Components.y5 y5Var = (org.telegram.ui.Components.y5) this.f48070c;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(qVar.f49453n.getText());
                for (org.telegram.ui.Components.y5 y5Var2 : (org.telegram.ui.Components.y5[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), org.telegram.ui.Components.y5.class)) {
                    if (y5Var2 == y5Var) {
                        int editTextSelectionEnd = qVar.f49453n.getEditTextSelectionEnd();
                        int spanEnd = spannableStringBuilder.getSpanEnd(y5Var2);
                        int spanStart = spannableStringBuilder.getSpanStart(y5Var2);
                        qVar.f49453n.getText().delete(spanStart, spanEnd);
                        int i10 = spanEnd - spanStart;
                        zg.o oVar = qVar.f49453n;
                        if (spanEnd <= editTextSelectionEnd) {
                            editTextSelectionEnd -= i10;
                        }
                        oVar.setSelection(editTextSelectionEnd);
                        return;
                    }
                }
                return;
            case 4:
                zg.q qVar2 = (zg.q) this.f48069b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f48070c;
                if (qVar2.Q != null && tL_error.text.equals("BOOSTS_REQUIRED")) {
                    zg.r0.f(-qVar2.M, qVar2.R, qVar2.Q);
                    return;
                }
                String str = tL_error.text;
                if (str.equals("REACTIONS_TOO_MANY")) {
                    str = LocaleController.formatPluralString("ReactionMaxCountError", qVar2.J, new Object[0]);
                }
                xc.a0(qVar2).t(str, null).j();
                return;
            case 5:
                org.telegram.ui.Components.y5 y5Var3 = (org.telegram.ui.Components.y5) this.f48070c;
                zg.q qVar3 = ((zg.p) this.f48069b).f49443e2;
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(qVar3.f49453n.getText());
                for (org.telegram.ui.Components.y5 y5Var4 : (org.telegram.ui.Components.y5[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), org.telegram.ui.Components.y5.class)) {
                    if (y5Var4 == y5Var3) {
                        int editTextSelectionEnd2 = qVar3.f49453n.getEditTextSelectionEnd();
                        int spanEnd2 = spannableStringBuilder2.getSpanEnd(y5Var4);
                        int spanStart2 = spannableStringBuilder2.getSpanStart(y5Var4);
                        qVar3.f49453n.getText().delete(spanStart2, spanEnd2);
                        int i11 = spanEnd2 - spanStart2;
                        zg.o oVar2 = qVar3.f49453n;
                        if (spanEnd2 <= editTextSelectionEnd2) {
                            editTextSelectionEnd2 -= i11;
                        }
                        oVar2.setSelection(editTextSelectionEnd2);
                        return;
                    }
                }
                return;
            case 6:
                zg.c0 c0Var = (zg.c0) this.f48069b;
                sk0 sk0Var = (sk0) this.f48070c;
                c0Var.f49311l = true;
                c0Var.f49303a.invalidate();
                sk0Var.f28231b1 = false;
                sk0Var.invalidate();
                c0Var.c(true);
                return;
            case 7:
                zg.e0 e0Var = (zg.e0) this.f48069b;
                zg.b bVar = (zg.b) this.f48070c;
                e0Var.getText().delete(e0Var.getText().getSpanStart(bVar), e0Var.getText().getSpanEnd(bVar));
                e0Var.setCursorVisible(true);
                e0Var.setLongClickable(true);
                return;
            default:
                zg.q0 q0Var = (zg.q0) this.f48069b;
                zg.n0 n0Var = (zg.n0) this.f48070c;
                q0Var.getClass();
                TLRPC.ReactionCount reactionCount = n0Var.f49412a;
                org.telegram.ui.Cells.a0 a0Var = q0Var.f49483z;
                if (com.google.android.gms.internal.vision.e2.u(a0Var)) {
                    ((org.telegram.ui.Cells.p4) a0Var).f(reactionCount, true, 0.0f, 0.0f);
                }
                n0Var.Y.c(false);
                q0Var.S = null;
                q0Var.T = false;
                q0Var.U = null;
                return;
        }
    }
}
