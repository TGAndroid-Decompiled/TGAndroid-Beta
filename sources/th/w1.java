package th;

import android.graphics.Paint;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.jj;
import org.telegram.ui.Components.v90;
public final class w1 implements v90 {
    public final z2 f49559a;

    public w1(z2 z2Var) {
        this.f49559a = z2Var;
    }

    @Override
    public final void L(TLRPC.TL_document tL_document, String str, Object obj) {
        z2 z2Var = this.f49559a;
        org.telegram.ui.Components.s4.Z(z2Var.f49730l2, 1, z2Var.f49726k1, new ag.m2(this, tL_document, str, obj, 17));
    }

    @Override
    public final void N(int i10, int i11, CharSequence charSequence, boolean z10) {
        this.f49559a.K1.M0(i10, i11, charSequence, z10);
    }

    @Override
    public final void X(String str) {
        t1 t1Var = this.f49559a.K1;
        t1Var.Q();
        t1Var.U0.h(str);
    }

    @Override
    public final void m(TLRPC.BotInlineResult botInlineResult, boolean z10, int i10) {
        z2 z2Var = this.f49559a;
        org.telegram.ui.Components.s4.Z(z2Var.f49730l2, 1, z2Var.f49726k1, new jj(i10, 1, this, botInlineResult, z10));
    }

    @Override
    public final Paint.FontMetricsInt w() {
        return this.f49559a.K1.getEditField().getPaint().getFontMetricsInt();
    }
}
