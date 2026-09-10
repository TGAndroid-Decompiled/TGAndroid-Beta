package zh;

import android.graphics.Paint;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.gk;
import org.telegram.ui.Components.ua0;
public final class w1 implements ua0 {
    public final a3 f48999a;

    public w1(a3 a3Var) {
        this.f48999a = a3Var;
    }

    @Override
    public final void K(String str) {
        t1 t1Var = this.f48999a.f48157b2;
        t1Var.U();
        t1Var.U0.h(str);
    }

    @Override
    public final void d(TLRPC.BotInlineResult botInlineResult, boolean z10, int i10) {
        a3 a3Var = this.f48999a;
        org.telegram.ui.Components.d5.a0(a3Var.C2, 1, a3Var.B1, new gk(i10, 1, this, botInlineResult, z10));
    }

    @Override
    public final Paint.FontMetricsInt o() {
        return this.f48999a.f48157b2.getEditField().getPaint().getFontMetricsInt();
    }

    @Override
    public final void v(TLRPC.TL_document tL_document, String str, Object obj) {
        a3 a3Var = this.f48999a;
        org.telegram.ui.Components.d5.a0(a3Var.C2, 1, a3Var.B1, new gg.u1(this, tL_document, str, obj, 16));
    }

    @Override
    public final void z(int i10, int i11, CharSequence charSequence, boolean z10) {
        this.f48999a.f48157b2.O0(i10, i11, charSequence, z10);
    }
}
