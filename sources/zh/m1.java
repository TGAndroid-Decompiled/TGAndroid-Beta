package zh;

import android.content.Context;
import org.telegram.messenger.id;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.no0;
import org.telegram.ui.Components.vp0;
public final class m1 extends no0 {
    public final org.telegram.ui.ActionBar.f2 R2;
    public final vp0 S2;

    public m1(vp0 vp0Var, Context context, String str, String str2, g6 g6Var, org.telegram.ui.ActionBar.f2 f2Var) {
        super(context, null, str, false, str2, false, g6Var);
        this.S2 = vp0Var;
        this.R2 = f2Var;
    }

    @Override
    public final void R0(a0.h hVar, int i7, TLRPC.TL_forumTopic tL_forumTopic, boolean z9) {
        hc a02;
        String str;
        if (z9 && (a02 = hc.a0(this.R2)) != null) {
            if (hVar.m() == 1) {
                long j3 = hVar.j(0);
                if (j3 == p10.i(this.f28621a).f24489n) {
                    cc G = a02.G(2131624190, 5000, org.telegram.messenger.g0.X2(id.a0(null, null, 2131749802, new Object[0])));
                    G.f32635r = false;
                    G.j();
                } else if (j3 < 0) {
                    TLRPC.Chat M0 = qp.s1(this.f28621a).M0(Long.valueOf(-j3));
                    if (tL_forumTopic != null) {
                        str = tL_forumTopic.title;
                    } else {
                        str = M0.title;
                    }
                    cc G2 = a02.G(2131624028, 5000, org.telegram.messenger.g0.X2(id.a0(null, null, 2131749806, str)));
                    G2.f32635r = false;
                    G2.j();
                } else {
                    cc G3 = a02.G(2131624028, 5000, org.telegram.messenger.g0.X2(id.a0(null, null, 2131749806, qp.s1(this.f28621a).a2(Long.valueOf(j3)).first_name)));
                    G3.f32635r = false;
                    G3.j();
                }
            } else {
                cc Q = a02.Q(2131624028, 36, org.telegram.messenger.g0.X2(id.G(hVar.m(), "GiftCollectionSharedToManyChats", Integer.valueOf(hVar.m()))));
                Q.f32635r = false;
                Q.j();
            }
            try {
                this.S2.performHapticFeedback(3);
            } catch (Exception unused) {
            }
        }
    }
}
