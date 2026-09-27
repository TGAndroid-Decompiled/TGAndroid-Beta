package zg;

import android.text.SpannableStringBuilder;
import android.view.KeyEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Cells.w8;
import org.telegram.ui.Components.z5;
import org.telegram.ui.zl0;
public final class i implements Utilities.Callback {
    public final int f49357a;
    public final r f49358b;

    public i(r rVar, int i10) {
        this.f49357a = i10;
        this.f49358b = rVar;
    }

    @Override
    public final void run(Object obj) {
        z5[] z5VarArr;
        w8 w8Var;
        long j3;
        switch (this.f49357a) {
            case 0:
                r rVar = this.f49358b;
                rVar.Q = (TL_stories.TL_premium_boostsStatus) obj;
                if (!rVar.E.keySet().equals(rVar.G.keySet())) {
                    rVar.Y(false);
                    return;
                }
                return;
            case 1:
                Boolean bool = (Boolean) obj;
                r rVar2 = this.f49358b;
                h hVar = rVar2.U;
                if (!rVar2.a0()) {
                    int editTextSelectionEnd = rVar2.f49477n.getEditTextSelectionEnd();
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(rVar2.f49477n.getText());
                    for (z5 z5Var : (z5[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), z5.class)) {
                        if (spannableStringBuilder.getSpanEnd(z5Var) == editTextSelectionEnd) {
                            rVar2.E.remove(Long.valueOf(z5Var.documentId));
                            rVar2.F.remove(Long.valueOf(z5Var.documentId));
                            rVar2.f49474b.A(Long.valueOf(z5Var.documentId));
                            if (z5Var.documentId == -1 && (w8Var = rVar2.f49479s) != null) {
                                w8Var.setChecked(false);
                                rVar2.f49477n.setMaxLength(rVar2.J);
                            }
                            if (bool.booleanValue()) {
                                rVar2.f49477n.dispatchKeyEvent(new KeyEvent(0, 67));
                                AndroidUtilities.cancelRunOnUIThread(hVar);
                                AndroidUtilities.runOnUIThread(hVar, 350L);
                                return;
                            }
                            z5Var.setRemoved(new zl0(rVar2, z5Var, editTextSelectionEnd, 19));
                            rVar2.W(z5Var);
                            rVar2.Y(false);
                            return;
                        }
                    }
                    return;
                }
                return;
            case 2:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                r rVar3 = this.f49358b;
                if (!rVar3.isFinishing()) {
                    rVar3.v.setLoading(false);
                    if (tL_error.text.equals("CHAT_NOT_MODIFIED")) {
                        rVar3.finishFragment();
                        return;
                    }
                    k kVar = new k(1, rVar3, tL_error);
                    if (rVar3.Q == null) {
                        j3 = 200;
                    } else {
                        j3 = 0;
                    }
                    AndroidUtilities.runOnUIThread(kVar, j3);
                    return;
                }
                return;
            default:
                r rVar4 = this.f49358b;
                rVar4.getClass();
                rVar4.O = ((Integer) obj).intValue();
                return;
        }
    }
}
