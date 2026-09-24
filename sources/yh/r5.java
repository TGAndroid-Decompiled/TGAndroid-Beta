package yh;

import android.text.SpannableStringBuilder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.qk0;
import org.telegram.ui.Components.yc;
public final class r5 implements Runnable {
    public final int f47945a;
    public final Object f47946b;
    public final Object f47947c;

    public r5(int i10, Object obj, Object obj2) {
        this.f47945a = i10;
        this.f47946b = obj;
        this.f47947c = obj2;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.z5[] z5VarArr;
        org.telegram.ui.Components.z5[] z5VarArr2;
        switch (this.f47945a) {
            case 0:
                ((MessagesController) this.f47946b).processUpdates((TLRPC.Updates) ((TLObject) this.f47947c), false);
                return;
            case 1:
                new yc(((org.telegram.ui.ActionBar.e3[]) this.f47946b)[0].topBulletinContainer, (org.telegram.ui.ActionBar.d6) this.f47947c).Q(R.raw.copy, 36, LocaleController.getString(R.string.StarsTransactionIDCopied)).k(false);
                return;
            case 2:
                o8 o8Var = (o8) this.f47946b;
                o8Var.R = true;
                o8Var.o(new p5((s5) this.f47947c, 2));
                AndroidUtilities.runOnUIThread(new x7(o8Var, 1), 240L);
                return;
            case 3:
                zg.q qVar = (zg.q) this.f47946b;
                org.telegram.ui.Components.z5 z5Var = (org.telegram.ui.Components.z5) this.f47947c;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(qVar.f49418n.getText());
                for (org.telegram.ui.Components.z5 z5Var2 : (org.telegram.ui.Components.z5[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), org.telegram.ui.Components.z5.class)) {
                    if (z5Var2 == z5Var) {
                        int editTextSelectionEnd = qVar.f49418n.getEditTextSelectionEnd();
                        int spanEnd = spannableStringBuilder.getSpanEnd(z5Var2);
                        int spanStart = spannableStringBuilder.getSpanStart(z5Var2);
                        qVar.f49418n.getText().delete(spanStart, spanEnd);
                        int i10 = spanEnd - spanStart;
                        zg.o oVar = qVar.f49418n;
                        if (spanEnd <= editTextSelectionEnd) {
                            editTextSelectionEnd -= i10;
                        }
                        oVar.setSelection(editTextSelectionEnd);
                        return;
                    }
                }
                return;
            case 4:
                zg.q qVar2 = (zg.q) this.f47946b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f47947c;
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
                org.telegram.ui.Components.z5 z5Var3 = (org.telegram.ui.Components.z5) this.f47947c;
                zg.q qVar3 = ((zg.p) this.f47946b).f49388e2;
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(qVar3.f49418n.getText());
                for (org.telegram.ui.Components.z5 z5Var4 : (org.telegram.ui.Components.z5[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), org.telegram.ui.Components.z5.class)) {
                    if (z5Var4 == z5Var3) {
                        int editTextSelectionEnd2 = qVar3.f49418n.getEditTextSelectionEnd();
                        int spanEnd2 = spannableStringBuilder2.getSpanEnd(z5Var4);
                        int spanStart2 = spannableStringBuilder2.getSpanStart(z5Var4);
                        qVar3.f49418n.getText().delete(spanStart2, spanEnd2);
                        int i11 = spanEnd2 - spanStart2;
                        zg.o oVar2 = qVar3.f49418n;
                        if (spanEnd2 <= editTextSelectionEnd2) {
                            editTextSelectionEnd2 -= i11;
                        }
                        oVar2.setSelection(editTextSelectionEnd2);
                        return;
                    }
                }
                return;
            case 6:
                zg.b0 b0Var = (zg.b0) this.f47946b;
                qk0 qk0Var = (qk0) this.f47947c;
                b0Var.f49242l = true;
                b0Var.f49234a.invalidate();
                qk0Var.f27651b1 = false;
                qk0Var.invalidate();
                b0Var.c(true);
                return;
            case 7:
                zg.d0 d0Var = (zg.d0) this.f47946b;
                zg.b bVar = (zg.b) this.f47947c;
                d0Var.getText().delete(d0Var.getText().getSpanStart(bVar), d0Var.getText().getSpanEnd(bVar));
                d0Var.setCursorVisible(true);
                d0Var.setLongClickable(true);
                return;
            default:
                zg.p0 p0Var = (zg.p0) this.f47946b;
                zg.m0 m0Var = (zg.m0) this.f47947c;
                p0Var.getClass();
                TLRPC.ReactionCount reactionCount = m0Var.f49351a;
                org.telegram.ui.Cells.a0 a0Var = p0Var.f49413z;
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
