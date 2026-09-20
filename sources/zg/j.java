package zg;

import android.text.SpannableStringBuilder;
import android.view.KeyEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.x8;
import org.telegram.ui.Components.y5;
import org.telegram.ui.fm0;
import yh.s5;
public final class j implements Utilities.Callback {
    public final int f49350a;
    public final q f49351b;

    public j(q qVar, int i10) {
        this.f49350a = i10;
        this.f49351b = qVar;
    }

    @Override
    public final void run(Object obj) {
        y5[] y5VarArr;
        x8 x8Var;
        long j3;
        switch (this.f49350a) {
            case 0:
                Boolean bool = (Boolean) obj;
                q qVar = this.f49351b;
                h hVar = qVar.U;
                if (!qVar.a0()) {
                    int editTextSelectionEnd = qVar.f49456n.getEditTextSelectionEnd();
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(qVar.f49456n.getText());
                    for (y5 y5Var : (y5[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), y5.class)) {
                        if (spannableStringBuilder.getSpanEnd(y5Var) == editTextSelectionEnd) {
                            qVar.E.remove(Long.valueOf(y5Var.documentId));
                            qVar.F.remove(Long.valueOf(y5Var.documentId));
                            qVar.f49453b.A(Long.valueOf(y5Var.documentId));
                            if (y5Var.documentId == -1 && (x8Var = qVar.f49458s) != null) {
                                x8Var.setChecked(false);
                                qVar.f49456n.setMaxLength(qVar.J);
                            }
                            if (bool.booleanValue()) {
                                qVar.f49456n.dispatchKeyEvent(new KeyEvent(0, 67));
                                AndroidUtilities.cancelRunOnUIThread(hVar);
                                AndroidUtilities.runOnUIThread(hVar, 350L);
                                return;
                            }
                            y5Var.setRemoved(new fm0(qVar, y5Var, editTextSelectionEnd, 19));
                            qVar.W(y5Var);
                            qVar.Y(false);
                            return;
                        }
                    }
                    return;
                }
                return;
            case 1:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                q qVar2 = this.f49351b;
                if (!qVar2.isFinishing()) {
                    qVar2.v.setLoading(false);
                    if (tL_error.text.equals("CHAT_NOT_MODIFIED")) {
                        qVar2.finishFragment();
                        return;
                    }
                    s5 s5Var = new s5(4, qVar2, tL_error);
                    if (qVar2.Q == null) {
                        j3 = 200;
                    } else {
                        j3 = 0;
                    }
                    AndroidUtilities.runOnUIThread(s5Var, j3);
                    return;
                }
                return;
            default:
                q qVar3 = this.f49351b;
                qVar3.getClass();
                qVar3.O = ((Integer) obj).intValue();
                return;
        }
    }
}
