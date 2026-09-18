package zg;

import android.text.SpannableStringBuilder;
import android.view.KeyEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.w8;
import org.telegram.ui.Components.z5;
import org.telegram.ui.fm0;
import yh.x7;
public final class j implements Utilities.Callback {
    public final int f49304a;
    public final q f49305b;

    public j(q qVar, int i10) {
        this.f49304a = i10;
        this.f49305b = qVar;
    }

    @Override
    public final void run(Object obj) {
        z5[] z5VarArr;
        w8 w8Var;
        long j3;
        switch (this.f49304a) {
            case 0:
                Boolean bool = (Boolean) obj;
                q qVar = this.f49305b;
                h hVar = qVar.U;
                if (!qVar.a0()) {
                    int editTextSelectionEnd = qVar.f49410n.getEditTextSelectionEnd();
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(qVar.f49410n.getText());
                    for (z5 z5Var : (z5[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), z5.class)) {
                        if (spannableStringBuilder.getSpanEnd(z5Var) == editTextSelectionEnd) {
                            qVar.E.remove(Long.valueOf(z5Var.documentId));
                            qVar.F.remove(Long.valueOf(z5Var.documentId));
                            qVar.f49407b.A(Long.valueOf(z5Var.documentId));
                            if (z5Var.documentId == -1 && (w8Var = qVar.f49412s) != null) {
                                w8Var.setChecked(false);
                                qVar.f49410n.setMaxLength(qVar.J);
                            }
                            if (bool.booleanValue()) {
                                qVar.f49410n.dispatchKeyEvent(new KeyEvent(0, 67));
                                AndroidUtilities.cancelRunOnUIThread(hVar);
                                AndroidUtilities.runOnUIThread(hVar, 350L);
                                return;
                            }
                            z5Var.setRemoved(new fm0(qVar, z5Var, editTextSelectionEnd, 19));
                            qVar.W(z5Var);
                            qVar.Y(false);
                            return;
                        }
                    }
                    return;
                }
                return;
            case 1:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                q qVar2 = this.f49305b;
                if (!qVar2.isFinishing()) {
                    qVar2.v.setLoading(false);
                    if (tL_error.text.equals("CHAT_NOT_MODIFIED")) {
                        qVar2.finishFragment();
                        return;
                    }
                    x7 x7Var = new x7(2, qVar2, tL_error);
                    if (qVar2.Q == null) {
                        j3 = 200;
                    } else {
                        j3 = 0;
                    }
                    AndroidUtilities.runOnUIThread(x7Var, j3);
                    return;
                }
                return;
            default:
                q qVar3 = this.f49305b;
                qVar3.getClass();
                qVar3.O = ((Integer) obj).intValue();
                return;
        }
    }
}
