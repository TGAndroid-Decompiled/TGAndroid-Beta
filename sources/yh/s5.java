package yh;

import android.text.SpannableStringBuilder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.sk0;
import org.telegram.ui.Components.yc;
public final class s5 implements Runnable {
    public final int f51972a;
    public final Object f51973b;
    public final Object f51974c;

    public s5(int i10, Object obj, Object obj2) {
        this.f51972a = i10;
        this.f51973b = obj;
        this.f51974c = obj2;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.z5[] z5VarArr;
        org.telegram.ui.Components.z5[] z5VarArr2;
        switch (this.f51972a) {
            case 0:
                ((MessagesController) this.f51973b).processUpdates((TLRPC.Updates) ((TLObject) this.f51974c), false);
                return;
            case 1:
                new yc(((org.telegram.ui.ActionBar.f3[]) this.f51973b)[0].topBulletinContainer, (org.telegram.ui.ActionBar.d6) this.f51974c).Q(R.raw.copy, 36, LocaleController.getString(R.string.StarsTransactionIDCopied)).k(false);
                return;
            case 2:
                r8 r8Var = (r8) this.f51973b;
                r8Var.R = true;
                r8Var.o(new q5((t5) this.f51974c, 2));
                AndroidUtilities.runOnUIThread(new a8(r8Var, 1), 240L);
                return;
            case 3:
                zg.o oVar = (zg.o) this.f51973b;
                org.telegram.ui.Components.z5 z5Var = (org.telegram.ui.Components.z5) this.f51974c;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(oVar.h.getText());
                for (org.telegram.ui.Components.z5 z5Var2 : (org.telegram.ui.Components.z5[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), org.telegram.ui.Components.z5.class)) {
                    if (z5Var2 == z5Var) {
                        int editTextSelectionEnd = oVar.h.getEditTextSelectionEnd();
                        int spanEnd = spannableStringBuilder.getSpanEnd(z5Var2);
                        int spanStart = spannableStringBuilder.getSpanStart(z5Var2);
                        oVar.h.getText().delete(spanStart, spanEnd);
                        int i10 = spanEnd - spanStart;
                        zg.l lVar = oVar.h;
                        if (spanEnd <= editTextSelectionEnd) {
                            editTextSelectionEnd -= i10;
                        }
                        lVar.setSelection(editTextSelectionEnd);
                        return;
                    }
                }
                return;
            case 4:
                zg.o oVar2 = (zg.o) this.f51973b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f51974c;
                if (oVar2.V != null && tL_error.text.equals("BOOSTS_REQUIRED")) {
                    zg.o0.f(-oVar2.R, oVar2.W, oVar2.V);
                    return;
                }
                String str = tL_error.text;
                if (str.equals("REACTIONS_TOO_MANY")) {
                    str = LocaleController.formatPluralString("ReactionMaxCountError", oVar2.M, new Object[0]);
                }
                yc.a0(oVar2).t(str, null).j();
                return;
            case 5:
                org.telegram.ui.Components.z5 z5Var3 = (org.telegram.ui.Components.z5) this.f51974c;
                zg.o oVar3 = ((zg.m) this.f51973b).f53466e2;
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(oVar3.h.getText());
                for (org.telegram.ui.Components.z5 z5Var4 : (org.telegram.ui.Components.z5[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), org.telegram.ui.Components.z5.class)) {
                    if (z5Var4 == z5Var3) {
                        int editTextSelectionEnd2 = oVar3.h.getEditTextSelectionEnd();
                        int spanEnd2 = spannableStringBuilder2.getSpanEnd(z5Var4);
                        int spanStart2 = spannableStringBuilder2.getSpanStart(z5Var4);
                        oVar3.h.getText().delete(spanStart2, spanEnd2);
                        int i11 = spanEnd2 - spanStart2;
                        zg.l lVar2 = oVar3.h;
                        if (spanEnd2 <= editTextSelectionEnd2) {
                            editTextSelectionEnd2 -= i11;
                        }
                        lVar2.setSelection(editTextSelectionEnd2);
                        return;
                    }
                }
                return;
            case 6:
                zg.z zVar = (zg.z) this.f51973b;
                sk0 sk0Var = (sk0) this.f51974c;
                zVar.f53559l = true;
                zVar.f53550a.invalidate();
                sk0Var.f30821b1 = false;
                sk0Var.invalidate();
                zVar.c(true);
                return;
            case 7:
                zg.b0 b0Var = (zg.b0) this.f51973b;
                zg.b bVar = (zg.b) this.f51974c;
                b0Var.getText().delete(b0Var.getText().getSpanStart(bVar), b0Var.getText().getSpanEnd(bVar));
                b0Var.setCursorVisible(true);
                b0Var.setLongClickable(true);
                return;
            default:
                zg.n0 n0Var = (zg.n0) this.f51973b;
                zg.k0 k0Var = (zg.k0) this.f51974c;
                n0Var.getClass();
                TLRPC.ReactionCount reactionCount = k0Var.f53434a;
                org.telegram.ui.Cells.a0 a0Var = n0Var.f53499z;
                if (com.google.android.gms.internal.vision.e2.u(a0Var)) {
                    ((org.telegram.ui.Cells.o4) a0Var).f(reactionCount, true, 0.0f, 0.0f);
                }
                k0Var.Y.c(false);
                n0Var.S = null;
                n0Var.T = false;
                n0Var.U = null;
                return;
        }
    }
}
