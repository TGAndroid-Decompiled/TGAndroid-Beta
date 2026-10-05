package zg;

import android.text.SpannableStringBuilder;
import android.view.KeyEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Cells.w8;
import org.telegram.ui.Components.z5;
import org.telegram.ui.am0;
import yh.s5;
public final class i implements Utilities.Callback {
    public final int f53405a;
    public final o f53406b;

    public i(o oVar, int i10) {
        this.f53405a = i10;
        this.f53406b = oVar;
    }

    @Override
    public final void run(Object obj) {
        z5[] z5VarArr;
        w8 w8Var;
        long j3;
        switch (this.f53405a) {
            case 0:
                o oVar = this.f53406b;
                oVar.V = (TL_stories.TL_premium_boostsStatus) obj;
                if (!oVar.H.keySet().equals(oVar.J.keySet())) {
                    oVar.Y(false);
                    return;
                }
                return;
            case 1:
                Boolean bool = (Boolean) obj;
                o oVar2 = this.f53406b;
                h hVar = oVar2.Z;
                if (!oVar2.b0()) {
                    int editTextSelectionEnd = oVar2.h.getEditTextSelectionEnd();
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(oVar2.h.getText());
                    for (z5 z5Var : (z5[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), z5.class)) {
                        if (spannableStringBuilder.getSpanEnd(z5Var) == editTextSelectionEnd) {
                            oVar2.H.remove(Long.valueOf(z5Var.documentId));
                            oVar2.I.remove(Long.valueOf(z5Var.documentId));
                            oVar2.f53501b.A(Long.valueOf(z5Var.documentId));
                            if (z5Var.documentId == -1 && (w8Var = oVar2.f53506r) != null) {
                                w8Var.setChecked(false);
                                oVar2.h.setMaxLength(oVar2.M);
                            }
                            if (bool.booleanValue()) {
                                oVar2.h.dispatchKeyEvent(new KeyEvent(0, 67));
                                AndroidUtilities.cancelRunOnUIThread(hVar);
                                AndroidUtilities.runOnUIThread(hVar, 350L);
                                return;
                            }
                            z5Var.setRemoved(new am0(oVar2, z5Var, editTextSelectionEnd, 19));
                            oVar2.W(z5Var);
                            oVar2.Y(false);
                            return;
                        }
                    }
                    return;
                }
                return;
            case 2:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                o oVar3 = this.f53406b;
                if (!oVar3.isFinishing()) {
                    oVar3.f53507s.setLoading(false);
                    if (tL_error.text.equals("CHAT_NOT_MODIFIED")) {
                        oVar3.finishFragment();
                        return;
                    }
                    s5 s5Var = new s5(4, oVar3, tL_error);
                    if (oVar3.V == null) {
                        j3 = 200;
                    } else {
                        j3 = 0;
                    }
                    AndroidUtilities.runOnUIThread(s5Var, j3);
                    return;
                }
                return;
            default:
                o oVar4 = this.f53406b;
                oVar4.getClass();
                oVar4.T = ((Integer) obj).intValue();
                return;
        }
    }
}
