package rh;

import android.view.View;
import org.telegram.messenger.nl;
import org.telegram.messenger.r20;
import org.telegram.messenger.wp;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.dd;
import org.telegram.ui.Components.e30;
import org.telegram.ui.Components.uc0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.l10;
import org.telegram.ui.nf;
import org.telegram.ui.ox0;
import org.telegram.ui.zd;
public final class s implements View.OnClickListener {
    public final int f47438a;
    public final Object f47439b;

    public s(Object obj, int i10) {
        this.f47438a = i10;
        this.f47439b = obj;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.ActionBar.k2 Q;
        r20 r20Var;
        switch (this.f47438a) {
            case 0:
                ((e30) this.f47439b).dismiss();
                return;
            case 1:
                ((e0) this.f47439b).dismiss();
                return;
            case 2:
                i0 i0Var = (i0) this.f47439b;
                sf.b bVar = i0Var.f47088v1.f48265a;
                sf.b bVar2 = sf.b.f48268b;
                if (bVar == bVar2) {
                    bVar2 = sf.b.f48267a;
                }
                i0Var.J0(sf.a.i(0L, bVar2), true, false, true);
                i0Var.f47077j1.setText("");
                return;
            case 3:
                ((t0) this.f47439b).dismiss();
                return;
            case 4:
                ((t1) this.f47439b).run();
                return;
            case 5:
                ((t1) this.f47439b).run();
                return;
            case 6:
                g3 g3Var = (g3) this.f47439b;
                g3Var.getClass();
                new y7(g3Var.f46953b, g3Var.f46956g).show();
                return;
            case 7:
                ((a4) this.f47439b).dismiss();
                return;
            case 8:
                ((l6) this.f47439b).run();
                return;
            case 9:
                if (((w7) ((l10) this.f47439b).d).f47660f > 0 && (Q = LaunchActivity.Q()) != 0) {
                    ?? obj = new Object();
                    obj.f20390a = true;
                    Q.showAsSheet(new h8(), obj);
                    return;
                }
                return;
            case 10:
                sg.b0 b0Var = (sg.b0) this.f47439b;
                if (b0Var.f48293k) {
                    b0Var.d();
                    return;
                }
                return;
            case 11:
                th.p1 p1Var = (th.p1) this.f47439b;
                p1Var.q(!p1Var.f49102f0, true);
                return;
            case 12:
                ((th.o7) this.f47439b).b0();
                return;
            case 13:
                ((th.h4) this.f47439b).dismiss();
                org.telegram.ui.ActionBar.k2 Q2 = LaunchActivity.Q();
                if (Q2 != null) {
                    Q2.showDialog(new kg.i1(Q2, 14, false));
                    return;
                }
                return;
            case 14:
                th.s6 s6Var = (th.s6) this.f47439b;
                s6Var.onClick(s6Var.f49453b);
                return;
            case 15:
                th.x6 x6Var = (th.x6) this.f47439b;
                x6Var.f49668b.f49350u1.animate().alpha(0.0f).setDuration(150L).setListener(new th.h7(x6Var, 0)).start();
                return;
            case 16:
                ((sg.v) this.f47439b).run();
                return;
            case 17:
                vh.k kVar = (vh.k) this.f47439b;
                vh.f fVar = kVar.f51355f;
                fVar.d();
                fVar.k(true);
                vh.e eVar = kVar.f51352c0;
                org.telegram.messenger.i0.r(eVar);
                eVar.run();
                return;
            case 18:
                ((vh.e8) this.f47439b).B();
                return;
            case 19:
                vh.n0.a((vh.n0) this.f47439b);
                return;
            case 20:
                ((org.telegram.ui.Wallet.x0) this.f47439b).run();
                return;
            case 21:
                vh.f4 f4Var = ((vh.e4) this.f47439b).f51126y;
                if (f4Var.f51151r && (r20Var = f4Var.f51149f) != null) {
                    r20Var.a(5);
                    return;
                }
                return;
            case 22:
                vh.i6 i6Var = (vh.i6) ((uc0) this.f47439b).h;
                if (i6Var != null) {
                    i6Var.run();
                    return;
                }
                return;
            case 23:
                ((nf) this.f47439b).run();
                return;
            case 24:
                ((nf) this.f47439b).run();
                return;
            case 25:
                ChatActivityEnterView.e(((dd) ((xh.j0) this.f47439b).d).f25467a, (TL_keyboard.KeyboardButton) view.getTag());
                return;
            case 26:
                ((ox0) this.f47439b).run();
                return;
            case 27:
                yh.l lVar = (yh.l) this.f47439b;
                TLRPC.Chat chat = lVar.I;
                if (chat != null && !chat.title.equals(((zd) lVar.f54507r.f31555b).getText().toString())) {
                    lVar.getMessagesController().C(lVar.I.f19794id, ((zd) lVar.f54507r.f31555b).getText().toString(), new yh.g(lVar, 1));
                }
                TLRPC.Chat chat2 = lVar.I;
                if (chat2 != null && lVar.f54506n != lVar.h) {
                    if (chat2.default_banned_rights == null) {
                        chat2.default_banned_rights = new TLRPC.TL_chatBannedRights();
                    }
                    lVar.I.default_banned_rights.manage_linked_peers = !lVar.f54506n;
                    lVar.getMessagesController().E4(lVar.f54504c, lVar.I.default_banned_rights, false, lVar);
                }
                lVar.finishFragment();
                return;
            case 28:
                ((yh.u) this.f47439b).f54534n.f54545k1.E(0);
                return;
            default:
                yh.z zVar = ((yh.v) this.f47439b).f54536r;
                if (!org.telegram.messenger.w3.w(27, zVar.f54546m1)) {
                    zVar.dismiss();
                    return;
                }
                vh.d dVar = zVar.f54548o1;
                if (!dVar.Q) {
                    dVar.setLoading(true);
                    wp r12 = wp.r1(zVar.f21584a);
                    yh.q qVar = new yh.q(zVar, 2);
                    TLRPC.TL_channels_getAdminedPublicChannels tL_channels_getAdminedPublicChannels = new TLRPC.TL_channels_getAdminedPublicChannels();
                    tL_channels_getAdminedPublicChannels.for_community_peer = true;
                    r12.getConnectionsManager().sendRequestTyped(tL_channels_getAdminedPublicChannels, new a3.b(1), new nl(r12, qVar, 0));
                    return;
                }
                return;
        }
    }
}
