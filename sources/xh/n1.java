package xh;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.dd;
import org.telegram.messenger.k20;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.k6;
import org.telegram.ui.Components.an0;
import org.telegram.ui.Components.eb0;
import org.telegram.ui.Components.jg;
import org.telegram.ui.Components.q51;
import org.telegram.ui.Components.z60;
import org.telegram.ui.fp;
import org.telegram.ui.zx;
public final class n1 implements k20 {
    public final int f53943a;
    public final Object f53944b;

    public n1(Object obj, int i10) {
        this.f53943a = i10;
        this.f53944b = obj;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        int i10;
        int i11 = this.f53943a;
        Object obj3 = this.f53944b;
        switch (i11) {
            case 0:
                m2 m2Var = (m2) obj3;
                TLRPC.TL_webViewResultUrl tL_webViewResultUrl = (TLRPC.TL_webViewResultUrl) obj;
                if (((TLRPC.TL_error) obj2) != null) {
                    m2Var.getClass();
                    return;
                }
                t3 t3Var = m2Var.f53920w0;
                if (t3Var != null) {
                    t3Var.a(tL_webViewResultUrl);
                    m2Var.s();
                    return;
                }
                return;
            case 1:
                ((z2) obj3).I0((ArrayList) obj, (q51) obj2);
                return;
            case 2:
                ((s3) obj3).Z((ArrayList) obj, (q51) obj2);
                return;
            case 3:
                q51 q51Var = (q51) obj2;
                ((yh.p) obj3).f54524w.c((ArrayList) obj);
                return;
            default:
                TLRPC.TL_sponsoredPeer tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) obj2;
                an0 an0Var = (an0) ((zf.z) obj3);
                zx zxVar = an0Var.I0;
                org.telegram.messenger.i0.v1(zxVar.getParentActivity().getCurrentFocus());
                z60 I = z60.I(zxVar, (k6) obj);
                if (!TextUtils.isEmpty(tL_sponsoredPeer.sponsor_info) || !TextUtils.isEmpty(tL_sponsoredPeer.additional_info)) {
                    z60 J = I.J();
                    J.c(2131231241, dd.L0(2131753756, null), new eb0(I, 25), false);
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
                    I.c(2131232087, dd.L0(2131745266, null), new bi.k(I, J, 7), false);
                }
                I.c(2131232184, dd.L0(2131754943, null), new fp(an0Var, zxVar, an0Var.J0, I, 18), false);
                I.c(2131232067, dd.L0(2131746251, null), new fp(an0Var, zxVar, tL_sponsoredPeer, I, 19), false);
                I.k();
                I.c(2131232086, dd.L0(2131746335, null), new jg(an0Var, zxVar, I, 18), false);
                if (dd.X) {
                    i10 = 3;
                } else {
                    i10 = 5;
                }
                I.V(i10);
                I.Y = true;
                I.f33045t = false;
                I.Z();
                return;
        }
    }
}
