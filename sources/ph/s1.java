package ph;

import android.content.Context;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.vp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.op0;
import org.telegram.ui.Components.vq0;
import org.telegram.ui.Components.wb;
public final class s1 extends op0 {
    public final org.telegram.ui.ActionBar.k2 R2;
    public final vq0 S2;

    public s1(vq0 vq0Var, Context context, String str, String str2, p6 p6Var, org.telegram.ui.ActionBar.k2 k2Var) {
        super(context, null, str, false, str2, false, p6Var);
        this.S2 = vq0Var;
        this.R2 = k2Var;
    }

    @Override
    public final void R0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        cc a02;
        String str;
        if (z10 && (a02 = cc.a0(this.R2)) != null) {
            if (hVar.m() == 1) {
                long j10 = hVar.j(0);
                if (j10 == d20.i(this.f21583a).f15165n) {
                    wb G = a02.G(2131624188, 5000, org.telegram.messenger.i0.W2(cd.a0(null, null, 2131749811, new Object[0])));
                    G.f32143r = false;
                    G.j();
                } else if (j10 < 0) {
                    TLRPC.Chat L0 = vp.r1(this.f21583a).L0(Long.valueOf(-j10));
                    if (tL_forumTopic != null) {
                        str = tL_forumTopic.title;
                    } else {
                        str = L0.title;
                    }
                    wb G2 = a02.G(2131624027, 5000, org.telegram.messenger.i0.W2(cd.a0(null, null, 2131749815, str)));
                    G2.f32143r = false;
                    G2.j();
                } else {
                    wb G3 = a02.G(2131624027, 5000, org.telegram.messenger.i0.W2(cd.a0(null, null, 2131749815, vp.r1(this.f21583a).Z1(Long.valueOf(j10)).first_name)));
                    G3.f32143r = false;
                    G3.j();
                }
            } else {
                wb Q = a02.Q(2131624027, 36, org.telegram.messenger.i0.W2(cd.G(hVar.m(), "GiftCollectionSharedToManyChats", Integer.valueOf(hVar.m()))));
                Q.f32143r = false;
                Q.j();
            }
            try {
                this.S2.performHapticFeedback(3);
            } catch (Exception unused) {
            }
        }
    }
}
