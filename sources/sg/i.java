package sg;

import android.text.SpannableStringBuilder;
import android.view.KeyEvent;
import org.telegram.messenger.q20;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Cells.t8;
import org.telegram.ui.Components.o5;
import org.telegram.ui.Wallet.x0;
public final class i implements q20 {
    public final int f48351a;
    public final o f48352b;

    public i(o oVar, int i10) {
        this.f48351a = i10;
        this.f48352b = oVar;
    }

    @Override
    public final void a(Object obj) {
        o5[] o5VarArr;
        t8 t8Var;
        long j10;
        switch (this.f48351a) {
            case 0:
                o oVar = this.f48352b;
                oVar.V = (TL_stories.TL_premium_boostsStatus) obj;
                if (!oVar.H.keySet().equals(oVar.J.keySet())) {
                    oVar.d0(false);
                    return;
                }
                return;
            case 1:
                Boolean bool = (Boolean) obj;
                o oVar2 = this.f48352b;
                h hVar = oVar2.Z;
                if (!oVar2.f0()) {
                    int editTextSelectionEnd = oVar2.h.getEditTextSelectionEnd();
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(oVar2.h.getText());
                    for (o5 o5Var : (o5[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), o5.class)) {
                        if (spannableStringBuilder.getSpanEnd(o5Var) == editTextSelectionEnd) {
                            oVar2.H.remove(Long.valueOf(o5Var.documentId));
                            oVar2.I.remove(Long.valueOf(o5Var.documentId));
                            oVar2.f48422b.A(Long.valueOf(o5Var.documentId));
                            if (o5Var.documentId == -1 && (t8Var = oVar2.f48426r) != null) {
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
                            oVar2.b0(o5Var);
                            oVar2.d0(false);
                            return;
                        }
                    }
                    return;
                }
                return;
            case 2:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                o oVar3 = this.f48352b;
                if (!oVar3.isFinishing()) {
                    oVar3.f48427s.setLoading(false);
                    if (tL_error.text.equals("CHAT_NOT_MODIFIED")) {
                        oVar3.finishFragment();
                        return;
                    }
                    rh.o oVar4 = new rh.o(21, oVar3, tL_error);
                    if (oVar3.V == null) {
                        j10 = 200;
                    } else {
                        j10 = 0;
                    }
                    org.telegram.messenger.i0.h3(oVar4, j10);
                    return;
                }
                return;
            default:
                o oVar5 = this.f48352b;
                oVar5.getClass();
                oVar5.T = ((Integer) obj).intValue();
                return;
        }
    }
}
