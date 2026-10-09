package yh;

import android.text.SpannableStringBuilder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.kl0;
public final class t5 implements Runnable {
    public final int f53247a;
    public final Object f53248b;
    public final Object f53249c;

    public t5(int i10, Object obj, Object obj2) {
        this.f53247a = i10;
        this.f53248b = obj;
        this.f53249c = obj2;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.b6[] b6VarArr;
        org.telegram.ui.Components.b6[] b6VarArr2;
        switch (this.f53247a) {
            case 0:
                new ad(((org.telegram.ui.ActionBar.f3[]) this.f53248b)[0].topBulletinContainer, (org.telegram.ui.ActionBar.e6) this.f53249c).Q(R.raw.copy, 36, LocaleController.getString(R.string.StarsTransactionIDCopied)).k(false);
                return;
            case 1:
                h8 h8Var = (h8) this.f53248b;
                h8Var.S = true;
                h8Var.q(new j5((l5) this.f53249c, 2));
                AndroidUtilities.runOnUIThread(new q7(h8Var, 1), 240L);
                return;
            case 2:
                zg.q qVar = (zg.q) this.f53248b;
                org.telegram.ui.Components.b6 b6Var = (org.telegram.ui.Components.b6) this.f53249c;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(qVar.f54652n.getText());
                for (org.telegram.ui.Components.b6 b6Var2 : (org.telegram.ui.Components.b6[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), org.telegram.ui.Components.b6.class)) {
                    if (b6Var2 == b6Var) {
                        int editTextSelectionEnd = qVar.f54652n.getEditTextSelectionEnd();
                        int spanEnd = spannableStringBuilder.getSpanEnd(b6Var2);
                        int spanStart = spannableStringBuilder.getSpanStart(b6Var2);
                        qVar.f54652n.getText().delete(spanStart, spanEnd);
                        int i10 = spanEnd - spanStart;
                        zg.o oVar = qVar.f54652n;
                        if (spanEnd <= editTextSelectionEnd) {
                            editTextSelectionEnd -= i10;
                        }
                        oVar.setSelection(editTextSelectionEnd);
                        return;
                    }
                }
                return;
            case 3:
                zg.q qVar2 = (zg.q) this.f53248b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f53249c;
                if (qVar2.Q != null && tL_error.text.equals("BOOSTS_REQUIRED")) {
                    zg.p0.f(-qVar2.M, qVar2.R, qVar2.Q);
                    return;
                }
                String str = tL_error.text;
                if (str.equals("REACTIONS_TOO_MANY")) {
                    str = LocaleController.formatPluralString("ReactionMaxCountError", qVar2.J, new Object[0]);
                }
                ad.a0(qVar2).t(str, null).j();
                return;
            case 4:
                org.telegram.ui.Components.b6 b6Var3 = (org.telegram.ui.Components.b6) this.f53249c;
                zg.q qVar3 = ((zg.p) this.f53248b).f54646e2;
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(qVar3.f54652n.getText());
                for (org.telegram.ui.Components.b6 b6Var4 : (org.telegram.ui.Components.b6[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), org.telegram.ui.Components.b6.class)) {
                    if (b6Var4 == b6Var3) {
                        int editTextSelectionEnd2 = qVar3.f54652n.getEditTextSelectionEnd();
                        int spanEnd2 = spannableStringBuilder2.getSpanEnd(b6Var4);
                        int spanStart2 = spannableStringBuilder2.getSpanStart(b6Var4);
                        qVar3.f54652n.getText().delete(spanStart2, spanEnd2);
                        int i11 = spanEnd2 - spanStart2;
                        zg.o oVar2 = qVar3.f54652n;
                        if (spanEnd2 <= editTextSelectionEnd2) {
                            editTextSelectionEnd2 -= i11;
                        }
                        oVar2.setSelection(editTextSelectionEnd2);
                        return;
                    }
                }
                return;
            case 5:
                zg.a0 a0Var = (zg.a0) this.f53248b;
                kl0 kl0Var = (kl0) this.f53249c;
                a0Var.f54458l = true;
                a0Var.f54449a.invalidate();
                kl0Var.f28069b1 = false;
                kl0Var.invalidate();
                a0Var.c(true);
                return;
            case 6:
                zg.c0 c0Var = (zg.c0) this.f53248b;
                zg.b bVar = (zg.b) this.f53249c;
                c0Var.getText().delete(c0Var.getText().getSpanStart(bVar), c0Var.getText().getSpanEnd(bVar));
                c0Var.setCursorVisible(true);
                c0Var.setLongClickable(true);
                return;
            default:
                zg.o0 o0Var = (zg.o0) this.f53248b;
                zg.l0 l0Var = (zg.l0) this.f53249c;
                o0Var.getClass();
                TLRPC.ReactionCount reactionCount = l0Var.f54580a;
                org.telegram.ui.Cells.a0 a0Var2 = o0Var.f54644z;
                if (com.google.android.gms.internal.vision.e2.t(a0Var2)) {
                    ((org.telegram.ui.Cells.o4) a0Var2).f(reactionCount, true, 0.0f, 0.0f);
                }
                l0Var.Y.c(false);
                o0Var.S = null;
                o0Var.T = false;
                o0Var.U = null;
                return;
        }
    }
}
