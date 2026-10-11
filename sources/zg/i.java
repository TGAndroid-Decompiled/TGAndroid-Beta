package zg;

import android.text.SpannableStringBuilder;
import android.view.KeyEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Cells.w8;
import org.telegram.ui.Components.b6;
import org.telegram.ui.ai0;
import yh.e5;
public final class i implements Utilities.Callback {
    public final int f54625a;
    public final q f54626b;

    public i(q qVar, int i10) {
        this.f54625a = i10;
        this.f54626b = qVar;
    }

    @Override
    public final void run(Object obj) {
        b6[] b6VarArr;
        w8 w8Var;
        long j3;
        switch (this.f54625a) {
            case 0:
                q qVar = this.f54626b;
                qVar.Q = (TL_stories.TL_premium_boostsStatus) obj;
                if (!qVar.E.keySet().equals(qVar.G.keySet())) {
                    qVar.Y(false);
                    return;
                }
                return;
            case 1:
                Boolean bool = (Boolean) obj;
                q qVar2 = this.f54626b;
                h hVar = qVar2.U;
                if (!qVar2.a0()) {
                    int editTextSelectionEnd = qVar2.f54739n.getEditTextSelectionEnd();
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(qVar2.f54739n.getText());
                    for (b6 b6Var : (b6[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), b6.class)) {
                        if (spannableStringBuilder.getSpanEnd(b6Var) == editTextSelectionEnd) {
                            qVar2.E.remove(Long.valueOf(b6Var.documentId));
                            qVar2.F.remove(Long.valueOf(b6Var.documentId));
                            qVar2.f54735b.A(Long.valueOf(b6Var.documentId));
                            if (b6Var.documentId == -1 && (w8Var = qVar2.f54741s) != null) {
                                w8Var.setChecked(false);
                                qVar2.f54739n.setMaxLength(qVar2.J);
                            }
                            if (bool.booleanValue()) {
                                qVar2.f54739n.dispatchKeyEvent(new KeyEvent(0, 67));
                                AndroidUtilities.cancelRunOnUIThread(hVar);
                                AndroidUtilities.runOnUIThread(hVar, 350L);
                                return;
                            }
                            b6Var.setRemoved(new ai0(qVar2, b6Var, editTextSelectionEnd, 25));
                            qVar2.W(b6Var);
                            qVar2.Y(false);
                            return;
                        }
                    }
                    return;
                }
                return;
            case 2:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                q qVar3 = this.f54626b;
                if (!qVar3.isFinishing()) {
                    qVar3.v.setLoading(false);
                    if (tL_error.text.equals("CHAT_NOT_MODIFIED")) {
                        qVar3.finishFragment();
                        return;
                    }
                    e5 e5Var = new e5(5, qVar3, tL_error);
                    if (qVar3.Q == null) {
                        j3 = 200;
                    } else {
                        j3 = 0;
                    }
                    AndroidUtilities.runOnUIThread(e5Var, j3);
                    return;
                }
                return;
            default:
                q qVar4 = this.f54626b;
                qVar4.getClass();
                qVar4.O = ((Integer) obj).intValue();
                return;
        }
    }
}
