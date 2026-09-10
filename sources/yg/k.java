package yg;

import android.text.SpannableStringBuilder;
import android.view.KeyEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.x8;
import org.telegram.ui.Components.y5;
import org.telegram.ui.uu0;
public final class k implements Utilities.Callback {
    public final int f47028a;
    public final s f47029b;

    public k(s sVar, int i10) {
        this.f47028a = i10;
        this.f47029b = sVar;
    }

    @Override
    public final void run(Object obj) {
        y5[] y5VarArr;
        x8 x8Var;
        long j3;
        switch (this.f47028a) {
            case 0:
                Boolean bool = (Boolean) obj;
                s sVar = this.f47029b;
                i iVar = sVar.U;
                if (!sVar.a0()) {
                    int editTextSelectionEnd = sVar.f47137n.getEditTextSelectionEnd();
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(sVar.f47137n.getText());
                    for (y5 y5Var : (y5[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), y5.class)) {
                        if (spannableStringBuilder.getSpanEnd(y5Var) == editTextSelectionEnd) {
                            sVar.E.remove(Long.valueOf(y5Var.documentId));
                            sVar.F.remove(Long.valueOf(y5Var.documentId));
                            sVar.f47134b.A(Long.valueOf(y5Var.documentId));
                            if (y5Var.documentId == -1 && (x8Var = sVar.f47139s) != null) {
                                x8Var.setChecked(false);
                                sVar.f47137n.setMaxLength(sVar.J);
                            }
                            if (bool.booleanValue()) {
                                sVar.f47137n.dispatchKeyEvent(new KeyEvent(0, 67));
                                AndroidUtilities.cancelRunOnUIThread(iVar);
                                AndroidUtilities.runOnUIThread(iVar, 350L);
                                return;
                            }
                            y5Var.setRemoved(new uu0(sVar, y5Var, editTextSelectionEnd, 16));
                            sVar.W(y5Var);
                            sVar.Y(false);
                            return;
                        }
                    }
                    return;
                }
                return;
            case 1:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                s sVar2 = this.f47029b;
                if (!sVar2.isFinishing()) {
                    sVar2.v.setLoading(false);
                    if (tL_error.text.equals("CHAT_NOT_MODIFIED")) {
                        sVar2.finishFragment();
                        return;
                    }
                    u2.k0 k0Var = new u2.k0(29, sVar2, tL_error);
                    if (sVar2.Q == null) {
                        j3 = 200;
                    } else {
                        j3 = 0;
                    }
                    AndroidUtilities.runOnUIThread(k0Var, j3);
                    return;
                }
                return;
            default:
                s sVar3 = this.f47029b;
                sVar3.getClass();
                sVar3.O = ((Integer) obj).intValue();
                return;
        }
    }
}
