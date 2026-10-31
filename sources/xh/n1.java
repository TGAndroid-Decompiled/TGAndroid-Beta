package xh;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.cd;
import org.telegram.messenger.j20;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.k6;
import org.telegram.ui.Components.eb0;
import org.telegram.ui.Components.jg;
import org.telegram.ui.Components.p51;
import org.telegram.ui.Components.z60;
import org.telegram.ui.Components.zm0;
import org.telegram.ui.ay;
import org.telegram.ui.fp;
public final class n1 implements j20 {
    public final int f53922a;
    public final Object f53923b;

    public n1(Object obj, int i10) {
        this.f53922a = i10;
        this.f53923b = obj;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        int i10;
        int i11 = this.f53922a;
        Object obj3 = this.f53923b;
        switch (i11) {
            case 0:
                m2 m2Var = (m2) obj3;
                TLRPC.TL_webViewResultUrl tL_webViewResultUrl = (TLRPC.TL_webViewResultUrl) obj;
                if (((TLRPC.TL_error) obj2) != null) {
                    m2Var.getClass();
                    return;
                }
                s3 s3Var = m2Var.f53903w0;
                if (s3Var != null) {
                    s3Var.a(tL_webViewResultUrl);
                    m2Var.s();
                    return;
                }
                return;
            case 1:
                ((z2) obj3).H0((ArrayList) obj, (p51) obj2);
                return;
            case 2:
                ((r3) obj3).Y((ArrayList) obj, (p51) obj2);
                return;
            case 3:
                p51 p51Var = (p51) obj2;
                ((yh.q) obj3).f54523w.c((ArrayList) obj);
                return;
            default:
                TLRPC.TL_sponsoredPeer tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) obj2;
                zm0 zm0Var = (zm0) ((zf.z) obj3);
                ay ayVar = zm0Var.I0;
                org.telegram.messenger.i0.v1(ayVar.getParentActivity().getCurrentFocus());
                z60 I = z60.I(ayVar, (k6) obj);
                if (!TextUtils.isEmpty(tL_sponsoredPeer.sponsor_info) || !TextUtils.isEmpty(tL_sponsoredPeer.additional_info)) {
                    z60 J = I.J();
                    J.c(2131231241, cd.L0(2131753756, null), new eb0(I, 25), false);
                    J.k();
                    if (!TextUtils.isEmpty(tL_sponsoredPeer.sponsor_info)) {
                        J.p(13, -1, tL_sponsoredPeer.sponsor_info);
                    }
                    if (!TextUtils.isEmpty(tL_sponsoredPeer.additional_info)) {
                        if (!TextUtils.isEmpty(tL_sponsoredPeer.sponsor_info)) {
                            J.k();
                        }
                        J.p(13, -1, tL_sponsoredPeer.additional_info);
                    }
                    I.c(2131232087, cd.L0(2131745266, null), new bi.k(I, J, 7), false);
                }
                I.c(2131232184, cd.L0(2131754943, null), new fp(zm0Var, ayVar, zm0Var.J0, I, 18), false);
                I.c(2131232067, cd.L0(2131746251, null), new fp(zm0Var, ayVar, tL_sponsoredPeer, I, 19), false);
                I.k();
                I.c(2131232086, cd.L0(2131746335, null), new jg(zm0Var, ayVar, I, 18), false);
                if (cd.X) {
                    i10 = 3;
                } else {
                    i10 = 5;
                }
                I.V(i10);
                I.Y = true;
                I.f32942t = false;
                I.Z();
                return;
        }
    }
}
