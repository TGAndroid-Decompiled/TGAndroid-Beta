package zh;

import android.content.Context;
import org.telegram.messenger.hd;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.mo0;
import org.telegram.ui.Components.up0;
public final class n1 extends mo0 {
    public final org.telegram.ui.ActionBar.f2 R2;
    public final up0 S2;

    public n1(up0 up0Var, Context context, String str, String str2, f6 f6Var, org.telegram.ui.ActionBar.f2 f2Var) {
        super(context, null, str, false, str2, false, f6Var);
        this.S2 = up0Var;
        this.R2 = f2Var;
    }

    @Override
    public final void R0(a0.h hVar, int i7, TLRPC.TL_forumTopic tL_forumTopic, boolean z9) {
        hc a02;
        String str;
        if (z9 && (a02 = hc.a0(this.R2)) != null) {
            if (hVar.m() == 1) {
                long j3 = hVar.j(0);
                if (j3 == p10.i(this.f28613a).f24486n) {
                    cc G = a02.G(2131624190, 5000, org.telegram.messenger.g0.X2(hd.a0(null, null, 2131749801, new Object[0])));
                    G.f32522r = false;
                    G.j();
                } else if (j3 < 0) {
                    TLRPC.Chat M0 = qp.s1(this.f28613a).M0(Long.valueOf(-j3));
                    if (tL_forumTopic != null) {
                        str = tL_forumTopic.title;
                    } else {
                        str = M0.title;
                    }
                    cc G2 = a02.G(2131624028, 5000, org.telegram.messenger.g0.X2(hd.a0(null, null, 2131749805, str)));
                    G2.f32522r = false;
                    G2.j();
                } else {
                    cc G3 = a02.G(2131624028, 5000, org.telegram.messenger.g0.X2(hd.a0(null, null, 2131749805, qp.s1(this.f28613a).a2(Long.valueOf(j3)).first_name)));
                    G3.f32522r = false;
                    G3.j();
                }
            } else {
                cc Q = a02.Q(2131624028, 36, org.telegram.messenger.g0.X2(hd.G(hVar.m(), "GiftCollectionSharedToManyChats", Integer.valueOf(hVar.m()))));
                Q.f32522r = false;
                Q.j();
            }
            try {
                this.S2.performHapticFeedback(3);
            } catch (Exception unused) {
            }
        }
    }
}
