package zh;

import android.content.Context;
import org.telegram.messenger.id;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.bc;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.mo0;
import org.telegram.ui.Components.up0;
public final class m1 extends mo0 {
    public final org.telegram.ui.ActionBar.f2 U2;
    public final up0 V2;

    public m1(up0 up0Var, Context context, String str, String str2, h6 h6Var, org.telegram.ui.ActionBar.f2 f2Var) {
        super(context, null, str, false, str2, false, h6Var);
        this.V2 = up0Var;
        this.U2 = f2Var;
    }

    @Override
    public final void R0(a0.h hVar, int i7, TLRPC.TL_forumTopic tL_forumTopic, boolean z9) {
        gc a02;
        String str;
        if (z9 && (a02 = gc.a0(this.U2)) != null) {
            if (hVar.m() == 1) {
                long j3 = hVar.j(0);
                if (j3 == p10.i(this.f28669a).f24493n) {
                    bc G = a02.G(2131624190, 5000, org.telegram.messenger.g0.X2(id.a0(null, null, 2131749802, new Object[0])));
                    G.f32211r = false;
                    G.j();
                } else if (j3 < 0) {
                    TLRPC.Chat M0 = qp.s1(this.f28669a).M0(Long.valueOf(-j3));
                    if (tL_forumTopic != null) {
                        str = tL_forumTopic.title;
                    } else {
                        str = M0.title;
                    }
                    bc G2 = a02.G(2131624028, 5000, org.telegram.messenger.g0.X2(id.a0(null, null, 2131749806, str)));
                    G2.f32211r = false;
                    G2.j();
                } else {
                    bc G3 = a02.G(2131624028, 5000, org.telegram.messenger.g0.X2(id.a0(null, null, 2131749806, qp.s1(this.f28669a).a2(Long.valueOf(j3)).first_name)));
                    G3.f32211r = false;
                    G3.j();
                }
            } else {
                bc Q = a02.Q(2131624028, 36, org.telegram.messenger.g0.X2(id.G(hVar.m(), "GiftCollectionSharedToManyChats", Integer.valueOf(hVar.m()))));
                Q.f32211r = false;
                Q.j();
            }
            try {
                this.V2.performHapticFeedback(3);
            } catch (Exception unused) {
            }
        }
    }
}
