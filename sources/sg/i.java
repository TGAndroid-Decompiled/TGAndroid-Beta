package sg;

import android.text.SpannableStringBuilder;
import android.view.KeyEvent;
import org.telegram.messenger.r20;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Cells.t8;
import org.telegram.ui.Components.o5;
import org.telegram.ui.Wallet.x0;
public final class i implements r20 {
    public final int f48362a;
    public final o f48363b;

    public i(o oVar, int i10) {
        this.f48362a = i10;
        this.f48363b = oVar;
    }

    @Override
    public final void a(Object obj) {
        o5[] o5VarArr;
        t8 t8Var;
        long j10;
        switch (this.f48362a) {
            case 0:
                o oVar = this.f48363b;
                oVar.V = (TL_stories.TL_premium_boostsStatus) obj;
                if (!oVar.H.keySet().equals(oVar.J.keySet())) {
                    oVar.e0(false);
                    return;
                }
                return;
            case 1:
                Boolean bool = (Boolean) obj;
                o oVar2 = this.f48363b;
                h hVar = oVar2.Z;
                if (!oVar2.g0()) {
                    int editTextSelectionEnd = oVar2.h.getEditTextSelectionEnd();
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(oVar2.h.getText());
                    for (o5 o5Var : (o5[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), o5.class)) {
                        if (spannableStringBuilder.getSpanEnd(o5Var) == editTextSelectionEnd) {
                            oVar2.H.remove(Long.valueOf(o5Var.documentId));
                            oVar2.I.remove(Long.valueOf(o5Var.documentId));
                            oVar2.f48433b.A(Long.valueOf(o5Var.documentId));
                            if (o5Var.documentId == -1 && (t8Var = oVar2.f48437r) != null) {
                                t8Var.setChecked(false);
                                oVar2.h.setMaxLength(oVar2.M);
                            }
                            if (bool.booleanValue()) {
                                oVar2.h.dispatchKeyEvent(new KeyEvent(0, 67));
                                org.telegram.messenger.i0.r(hVar);
                                org.telegram.messenger.i0.h3(hVar, 350L);
                                return;
                            }
                            o5Var.setRemoved(new x0(oVar2, o5Var, editTextSelectionEnd, 15));
                            oVar2.c0(o5Var);
                            oVar2.e0(false);
                            return;
                        }
                    }
                    return;
                }
                return;
            case 2:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                o oVar3 = this.f48363b;
                if (!oVar3.isFinishing()) {
                    oVar3.f48438s.setLoading(false);
                    if (tL_error.text.equals("CHAT_NOT_MODIFIED")) {
                        oVar3.finishFragment();
                        return;
                    }
                    rh.n nVar = new rh.n(22, oVar3, tL_error);
                    if (oVar3.V == null) {
                        j10 = 200;
                    } else {
                        j10 = 0;
                    }
                    org.telegram.messenger.i0.h3(nVar, j10);
                    return;
                }
                return;
            default:
                o oVar4 = this.f48363b;
                oVar4.getClass();
                oVar4.T = ((Integer) obj).intValue();
                return;
        }
    }
}
