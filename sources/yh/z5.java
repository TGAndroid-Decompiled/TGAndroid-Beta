package yh;

import android.text.SpannableStringBuilder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.qk0;
import org.telegram.ui.Components.xc;
public final class z5 implements Runnable {
    public final int f48342a;
    public final Object f48343b;
    public final Object f48344c;

    public z5(int i10, Object obj, Object obj2) {
        this.f48342a = i10;
        this.f48343b = obj;
        this.f48344c = obj2;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.z5[] z5VarArr;
        org.telegram.ui.Components.z5[] z5VarArr2;
        switch (this.f48342a) {
            case 0:
                new xc(((org.telegram.ui.ActionBar.e3[]) this.f48343b)[0].topBulletinContainer, (org.telegram.ui.ActionBar.d6) this.f48344c).Q(R.raw.copy, 36, LocaleController.getString(R.string.StarsTransactionIDCopied)).k(false);
                return;
            case 1:
                o8 o8Var = (o8) this.f48343b;
                o8Var.R = true;
                o8Var.o(new p5((r5) this.f48344c, 2));
                AndroidUtilities.runOnUIThread(new x7(o8Var, 1), 240L);
                return;
            case 2:
                zg.q qVar = (zg.q) this.f48343b;
                org.telegram.ui.Components.z5 z5Var = (org.telegram.ui.Components.z5) this.f48344c;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(qVar.f49429n.getText());
                for (org.telegram.ui.Components.z5 z5Var2 : (org.telegram.ui.Components.z5[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), org.telegram.ui.Components.z5.class)) {
                    if (z5Var2 == z5Var) {
                        int editTextSelectionEnd = qVar.f49429n.getEditTextSelectionEnd();
                        int spanEnd = spannableStringBuilder.getSpanEnd(z5Var2);
                        int spanStart = spannableStringBuilder.getSpanStart(z5Var2);
                        qVar.f49429n.getText().delete(spanStart, spanEnd);
                        int i10 = spanEnd - spanStart;
                        zg.o oVar = qVar.f49429n;
                        if (spanEnd <= editTextSelectionEnd) {
                            editTextSelectionEnd -= i10;
                        }
                        oVar.setSelection(editTextSelectionEnd);
                        return;
                    }
                }
                return;
            case 3:
                zg.q qVar2 = (zg.q) this.f48343b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f48344c;
                if (qVar2.Q != null && tL_error.text.equals("BOOSTS_REQUIRED")) {
                    zg.q0.f(-qVar2.M, qVar2.R, qVar2.Q);
                    return;
                }
                String str = tL_error.text;
                if (str.equals("REACTIONS_TOO_MANY")) {
                    str = LocaleController.formatPluralString("ReactionMaxCountError", qVar2.J, new Object[0]);
                }
                xc.a0(qVar2).t(str, null).j();
                return;
            case 4:
                org.telegram.ui.Components.z5 z5Var3 = (org.telegram.ui.Components.z5) this.f48344c;
                zg.q qVar3 = ((zg.p) this.f48343b).f49399e2;
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(qVar3.f49429n.getText());
                for (org.telegram.ui.Components.z5 z5Var4 : (org.telegram.ui.Components.z5[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), org.telegram.ui.Components.z5.class)) {
                    if (z5Var4 == z5Var3) {
                        int editTextSelectionEnd2 = qVar3.f49429n.getEditTextSelectionEnd();
                        int spanEnd2 = spannableStringBuilder2.getSpanEnd(z5Var4);
                        int spanStart2 = spannableStringBuilder2.getSpanStart(z5Var4);
                        qVar3.f49429n.getText().delete(spanStart2, spanEnd2);
                        int i11 = spanEnd2 - spanStart2;
                        zg.o oVar2 = qVar3.f49429n;
                        if (spanEnd2 <= editTextSelectionEnd2) {
                            editTextSelectionEnd2 -= i11;
                        }
                        oVar2.setSelection(editTextSelectionEnd2);
                        return;
                    }
                }
                return;
            case 5:
                zg.b0 b0Var = (zg.b0) this.f48343b;
                qk0 qk0Var = (qk0) this.f48344c;
                b0Var.f49253l = true;
                b0Var.f49245a.invalidate();
                qk0Var.f27657b1 = false;
                qk0Var.invalidate();
                b0Var.c(true);
                return;
            case 6:
                zg.d0 d0Var = (zg.d0) this.f48343b;
                zg.b bVar = (zg.b) this.f48344c;
                d0Var.getText().delete(d0Var.getText().getSpanStart(bVar), d0Var.getText().getSpanEnd(bVar));
                d0Var.setCursorVisible(true);
                d0Var.setLongClickable(true);
                return;
            default:
                zg.p0 p0Var = (zg.p0) this.f48343b;
                zg.m0 m0Var = (zg.m0) this.f48344c;
                p0Var.getClass();
                TLRPC.ReactionCount reactionCount = m0Var.f49362a;
                org.telegram.ui.Cells.a0 a0Var = p0Var.f49424z;
                if (com.google.android.gms.internal.vision.e2.u(a0Var)) {
                    ((org.telegram.ui.Cells.o4) a0Var).f(reactionCount, true, 0.0f, 0.0f);
                }
                m0Var.Y.c(false);
                p0Var.S = null;
                p0Var.T = false;
                p0Var.U = null;
                return;
        }
    }
}
