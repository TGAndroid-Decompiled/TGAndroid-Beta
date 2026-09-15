package zg;

import android.text.SpannableStringBuilder;
import android.view.KeyEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.w8;
import org.telegram.ui.Components.x5;
import org.telegram.ui.em0;
public final class j implements Utilities.Callback {
    public final int f49052a;
    public final q f49053b;

    public j(q qVar, int i10) {
        this.f49052a = i10;
        this.f49053b = qVar;
    }

    @Override
    public final void run(Object obj) {
        x5[] x5VarArr;
        w8 w8Var;
        long j3;
        switch (this.f49052a) {
            case 0:
                Boolean bool = (Boolean) obj;
                q qVar = this.f49053b;
                h hVar = qVar.U;
                if (!qVar.a0()) {
                    int editTextSelectionEnd = qVar.f49133n.getEditTextSelectionEnd();
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(qVar.f49133n.getText());
                    for (x5 x5Var : (x5[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), x5.class)) {
                        if (spannableStringBuilder.getSpanEnd(x5Var) == editTextSelectionEnd) {
                            qVar.E.remove(Long.valueOf(x5Var.documentId));
                            qVar.F.remove(Long.valueOf(x5Var.documentId));
                            qVar.f49130b.A(Long.valueOf(x5Var.documentId));
                            if (x5Var.documentId == -1 && (w8Var = qVar.f49135s) != null) {
                                w8Var.setChecked(false);
                                qVar.f49133n.setMaxLength(qVar.J);
                            }
                            if (bool.booleanValue()) {
                                qVar.f49133n.dispatchKeyEvent(new KeyEvent(0, 67));
                                AndroidUtilities.cancelRunOnUIThread(hVar);
                                AndroidUtilities.runOnUIThread(hVar, 350L);
                                return;
                            }
                            x5Var.setRemoved(new em0(qVar, x5Var, editTextSelectionEnd, 19));
                            qVar.W(x5Var);
                            qVar.Y(false);
                            return;
                        }
                    }
                    return;
                }
                return;
            case 1:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                q qVar2 = this.f49053b;
                if (!qVar2.isFinishing()) {
                    qVar2.v.setLoading(false);
                    if (tL_error.text.equals("CHAT_NOT_MODIFIED")) {
                        qVar2.finishFragment();
                        return;
                    }
                    uh.i iVar = new uh.i(28, qVar2, tL_error);
                    if (qVar2.Q == null) {
                        j3 = 200;
                    } else {
                        j3 = 0;
                    }
                    AndroidUtilities.runOnUIThread(iVar, j3);
                    return;
                }
                return;
            default:
                q qVar3 = this.f49053b;
                qVar3.getClass();
                qVar3.O = ((Integer) obj).intValue();
                return;
        }
    }
}
