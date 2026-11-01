package ph;

import android.content.Context;
import org.telegram.messenger.dd;
import org.telegram.messenger.e20;
import org.telegram.messenger.wp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.pp0;
import org.telegram.ui.Components.wb;
import org.telegram.ui.Components.wq0;
public final class s1 extends pp0 {
    public final org.telegram.ui.ActionBar.k2 R2;
    public final wq0 S2;

    public s1(wq0 wq0Var, Context context, String str, String str2, p6 p6Var, org.telegram.ui.ActionBar.k2 k2Var) {
        super(context, null, str, false, str2, false, p6Var);
        this.S2 = wq0Var;
        this.R2 = k2Var;
    }

    @Override
    public final void R0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        cc a02;
        String str;
        if (z10 && (a02 = cc.a0(this.R2)) != null) {
            if (hVar.m() == 1) {
                long j10 = hVar.j(0);
                if (j10 == e20.i(this.f21584a).f15524n) {
                    wb G = a02.G(2131624188, 5000, org.telegram.messenger.i0.W2(dd.a0(null, null, 2131749811, new Object[0])));
                    G.f32209r = false;
                    G.j();
                } else if (j10 < 0) {
                    TLRPC.Chat L0 = wp.r1(this.f21584a).L0(Long.valueOf(-j10));
                    if (tL_forumTopic != null) {
                        str = tL_forumTopic.title;
                    } else {
                        str = L0.title;
                    }
                    wb G2 = a02.G(2131624027, 5000, org.telegram.messenger.i0.W2(dd.a0(null, null, 2131749815, str)));
                    G2.f32209r = false;
                    G2.j();
                } else {
                    wb G3 = a02.G(2131624027, 5000, org.telegram.messenger.i0.W2(dd.a0(null, null, 2131749815, wp.r1(this.f21584a).Z1(Long.valueOf(j10)).first_name)));
                    G3.f32209r = false;
                    G3.j();
                }
            } else {
                wb Q = a02.Q(2131624027, 36, org.telegram.messenger.i0.W2(dd.G(hVar.m(), "GiftCollectionSharedToManyChats", Integer.valueOf(hVar.m()))));
                Q.f32209r = false;
                Q.j();
            }
            try {
                this.S2.performHapticFeedback(3);
            } catch (Exception unused) {
            }
        }
    }
}
