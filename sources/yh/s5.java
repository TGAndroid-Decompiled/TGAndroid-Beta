package yh;

import android.text.SpannableStringBuilder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.pk0;
import org.telegram.ui.Components.xc;
public final class s5 implements Runnable {
    public final int f48047a;
    public final Object f48048b;
    public final Object f48049c;

    public s5(int i10, Object obj, Object obj2) {
        this.f48047a = i10;
        this.f48048b = obj;
        this.f48049c = obj2;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.y5[] y5VarArr;
        org.telegram.ui.Components.y5[] y5VarArr2;
        switch (this.f48047a) {
            case 0:
                ((MessagesController) this.f48048b).processUpdates((TLRPC.Updates) ((TLObject) this.f48049c), false);
                return;
            case 1:
                new xc(((org.telegram.ui.ActionBar.f3[]) this.f48048b)[0].topBulletinContainer, (org.telegram.ui.ActionBar.f6) this.f48049c).Q(R.raw.copy, 36, LocaleController.getString(R.string.StarsTransactionIDCopied)).k(false);
                return;
            case 2:
                o8 o8Var = (o8) this.f48048b;
                o8Var.R = true;
                o8Var.o(new q5((t5) this.f48049c, 2));
                AndroidUtilities.runOnUIThread(new x7(o8Var, 1), 240L);
                return;
            case 3:
                zg.q qVar = (zg.q) this.f48048b;
                org.telegram.ui.Components.y5 y5Var = (org.telegram.ui.Components.y5) this.f48049c;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(qVar.f49456n.getText());
                for (org.telegram.ui.Components.y5 y5Var2 : (org.telegram.ui.Components.y5[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), org.telegram.ui.Components.y5.class)) {
                    if (y5Var2 == y5Var) {
                        int editTextSelectionEnd = qVar.f49456n.getEditTextSelectionEnd();
                        int spanEnd = spannableStringBuilder.getSpanEnd(y5Var2);
                        int spanStart = spannableStringBuilder.getSpanStart(y5Var2);
                        qVar.f49456n.getText().delete(spanStart, spanEnd);
                        int i10 = spanEnd - spanStart;
                        zg.o oVar = qVar.f49456n;
                        if (spanEnd <= editTextSelectionEnd) {
                            editTextSelectionEnd -= i10;
                        }
                        oVar.setSelection(editTextSelectionEnd);
                        return;
                    }
                }
                return;
            case 4:
                zg.q qVar2 = (zg.q) this.f48048b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f48049c;
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
            case 5:
                org.telegram.ui.Components.y5 y5Var3 = (org.telegram.ui.Components.y5) this.f48049c;
                zg.q qVar3 = ((zg.p) this.f48048b).f49426e2;
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(qVar3.f49456n.getText());
                for (org.telegram.ui.Components.y5 y5Var4 : (org.telegram.ui.Components.y5[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), org.telegram.ui.Components.y5.class)) {
                    if (y5Var4 == y5Var3) {
                        int editTextSelectionEnd2 = qVar3.f49456n.getEditTextSelectionEnd();
                        int spanEnd2 = spannableStringBuilder2.getSpanEnd(y5Var4);
                        int spanStart2 = spannableStringBuilder2.getSpanStart(y5Var4);
                        qVar3.f49456n.getText().delete(spanStart2, spanEnd2);
                        int i11 = spanEnd2 - spanStart2;
                        zg.o oVar2 = qVar3.f49456n;
                        if (spanEnd2 <= editTextSelectionEnd2) {
                            editTextSelectionEnd2 -= i11;
                        }
                        oVar2.setSelection(editTextSelectionEnd2);
                        return;
                    }
                }
                return;
            case 6:
                zg.b0 b0Var = (zg.b0) this.f48048b;
                pk0 pk0Var = (pk0) this.f48049c;
                b0Var.f49280l = true;
                b0Var.f49272a.invalidate();
                pk0Var.f27340b1 = false;
                pk0Var.invalidate();
                b0Var.c(true);
                return;
            case 7:
                zg.d0 d0Var = (zg.d0) this.f48048b;
                zg.b bVar = (zg.b) this.f48049c;
                d0Var.getText().delete(d0Var.getText().getSpanStart(bVar), d0Var.getText().getSpanEnd(bVar));
                d0Var.setCursorVisible(true);
                d0Var.setLongClickable(true);
                return;
            default:
                zg.p0 p0Var = (zg.p0) this.f48048b;
                zg.m0 m0Var = (zg.m0) this.f48049c;
                p0Var.getClass();
                TLRPC.ReactionCount reactionCount = m0Var.f49389a;
                org.telegram.ui.Cells.a0 a0Var = p0Var.f49451z;
                if (com.google.android.gms.internal.vision.e2.u(a0Var)) {
                    ((org.telegram.ui.Cells.p4) a0Var).f(reactionCount, true, 0.0f, 0.0f);
                }
                m0Var.Y.c(false);
                p0Var.S = null;
                p0Var.T = false;
                p0Var.U = null;
                return;
        }
    }
}
