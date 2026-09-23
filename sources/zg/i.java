package zg;

import android.text.SpannableStringBuilder;
import android.view.KeyEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Cells.x8;
import org.telegram.ui.Components.z5;
import org.telegram.ui.yl0;
public final class i implements Utilities.Callback {
    public final int f48985a;
    public final q f48986b;

    public i(q qVar, int i10) {
        this.f48985a = i10;
        this.f48986b = qVar;
    }

    @Override
    public final void run(Object obj) {
        z5[] z5VarArr;
        x8 x8Var;
        long j3;
        switch (this.f48985a) {
            case 0:
                q qVar = this.f48986b;
                qVar.Q = (TL_stories.TL_premium_boostsStatus) obj;
                if (!qVar.E.keySet().equals(qVar.G.keySet())) {
                    qVar.Y(false);
                    return;
                }
                return;
            case 1:
                Boolean bool = (Boolean) obj;
                q qVar2 = this.f48986b;
                h hVar = qVar2.U;
                if (!qVar2.a0()) {
                    int editTextSelectionEnd = qVar2.f49077n.getEditTextSelectionEnd();
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(qVar2.f49077n.getText());
                    for (z5 z5Var : (z5[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), z5.class)) {
                        if (spannableStringBuilder.getSpanEnd(z5Var) == editTextSelectionEnd) {
                            qVar2.E.remove(Long.valueOf(z5Var.documentId));
                            qVar2.F.remove(Long.valueOf(z5Var.documentId));
                            qVar2.f49074b.A(Long.valueOf(z5Var.documentId));
                            if (z5Var.documentId == -1 && (x8Var = qVar2.f49079s) != null) {
                                x8Var.setChecked(false);
                                qVar2.f49077n.setMaxLength(qVar2.J);
                            }
                            if (bool.booleanValue()) {
                                qVar2.f49077n.dispatchKeyEvent(new KeyEvent(0, 67));
                                AndroidUtilities.cancelRunOnUIThread(hVar);
                                AndroidUtilities.runOnUIThread(hVar, 350L);
                                return;
                            }
                            z5Var.setRemoved(new yl0(qVar2, z5Var, editTextSelectionEnd, 19));
                            qVar2.W(z5Var);
                            qVar2.Y(false);
                            return;
                        }
                    }
                    return;
                }
                return;
            case 2:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                q qVar3 = this.f48986b;
                if (!qVar3.isFinishing()) {
                    qVar3.v.setLoading(false);
                    if (tL_error.text.equals("CHAT_NOT_MODIFIED")) {
                        qVar3.finishFragment();
                        return;
                    }
                    uh.i iVar = new uh.i(28, qVar3, tL_error);
                    if (qVar3.Q == null) {
                        j3 = 200;
                    } else {
                        j3 = 0;
                    }
                    AndroidUtilities.runOnUIThread(iVar, j3);
                    return;
                }
                return;
            default:
                q qVar4 = this.f48986b;
                qVar4.getClass();
                qVar4.O = ((Integer) obj).intValue();
                return;
        }
    }
}
