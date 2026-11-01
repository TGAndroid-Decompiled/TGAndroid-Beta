package th;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.dd;
import org.telegram.messenger.e20;
import org.telegram.messenger.wp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.pp0;
import org.telegram.ui.Components.wb;
public final class z1 extends pp0 {
    public final z2 R2;

    public z1(z2 z2Var, Context context, String str, String str2, boolean z10, org.telegram.ui.web.a0 a0Var) {
        super(context, null, null, str, null, false, str2, null, false, false, z10, null, a0Var);
        this.R2 = z2Var;
    }

    @Override
    public final void L() {
        super.L();
        this.R2.I2 = null;
    }

    @Override
    public final void R0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        String str;
        if (!z10) {
            return;
        }
        z2 z2Var = this.R2;
        cc ccVar = new cc(z2Var.L0, this.I0);
        if (hVar.m() == 1) {
            long j10 = hVar.j(0);
            if (j10 == e20.i(this.f21584a).f15524n) {
                wb G = ccVar.G(2131624188, 5000, org.telegram.messenger.i0.W2(dd.a0(null, null, 2131744489, new Object[0])));
                G.f32209r = false;
                G.j();
            } else if (j10 < 0) {
                TLRPC.Chat L0 = wp.r1(this.f21584a).L0(Long.valueOf(-j10));
                if (tL_forumTopic != null) {
                    str = tL_forumTopic.title;
                } else {
                    str = L0.title;
                }
                wb G2 = ccVar.G(2131624027, 5000, org.telegram.messenger.i0.W2(dd.a0(null, null, 2131744502, str)));
                G2.f32209r = false;
                G2.j();
            } else {
                wb G3 = ccVar.G(2131624027, 5000, org.telegram.messenger.i0.W2(dd.a0(null, null, 2131744502, wp.r1(this.f21584a).Z1(Long.valueOf(j10)).first_name)));
                G3.f32209r = false;
                G3.j();
            }
        } else {
            wb Q = ccVar.Q(2131624027, 36, org.telegram.messenger.i0.W2(dd.G(hVar.m(), "StorySharedToManyChats", Integer.valueOf(hVar.m()))));
            Q.f32209r = false;
            Q.j();
        }
        try {
            z2Var.performHapticFeedback(3);
        } catch (Exception unused) {
        }
    }

    @Override
    public final void S0(View view) {
        this.R2.c1();
    }
}
