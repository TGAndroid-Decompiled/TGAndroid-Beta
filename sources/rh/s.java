package rh;

import android.view.View;
import org.telegram.messenger.ml;
import org.telegram.messenger.q20;
import org.telegram.messenger.vp;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.dd;
import org.telegram.ui.Components.e30;
import org.telegram.ui.Components.uc0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.m10;
import org.telegram.ui.mf;
import org.telegram.ui.px0;
import org.telegram.ui.zd;
public final class s implements View.OnClickListener {
    public final int f47426a;
    public final Object f47427b;

    public s(Object obj, int i10) {
        this.f47426a = i10;
        this.f47427b = obj;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.ActionBar.k2 Q;
        q20 q20Var;
        switch (this.f47426a) {
            case 0:
                ((e30) this.f47427b).dismiss();
                return;
            case 1:
                ((e0) this.f47427b).dismiss();
                return;
            case 2:
                i0 i0Var = (i0) this.f47427b;
                sf.b bVar = i0Var.f47074v1.f48254a;
                sf.b bVar2 = sf.b.f48257b;
                if (bVar == bVar2) {
                    bVar2 = sf.b.f48256a;
                }
                i0Var.J0(sf.a.i(0L, bVar2), true, false, true);
                i0Var.f47063j1.setText("");
                return;
            case 3:
                ((t0) this.f47427b).dismiss();
                return;
            case 4:
                ((t1) this.f47427b).run();
                return;
            case 5:
                ((t1) this.f47427b).run();
                return;
            case 6:
                g3 g3Var = (g3) this.f47427b;
                g3Var.getClass();
                new y7(g3Var.f46939b, g3Var.f46942g).show();
                return;
            case 7:
                ((a4) this.f47427b).dismiss();
                return;
            case 8:
                ((l6) this.f47427b).run();
                return;
            case 9:
                if (((w7) ((m10) this.f47427b).d).f47650f > 0 && (Q = LaunchActivity.Q()) != 0) {
                    ?? obj = new Object();
                    obj.f20389a = true;
                    Q.showAsSheet(new h8(), obj);
                    return;
                }
                return;
            case 10:
                sg.b0 b0Var = (sg.b0) this.f47427b;
                if (b0Var.f48282k) {
                    b0Var.d();
                    return;
                }
                return;
            case 11:
                th.p1 p1Var = (th.p1) this.f47427b;
                p1Var.q(!p1Var.f49088f0, true);
                return;
            case 12:
                ((th.o7) this.f47427b).b0();
                return;
            case 13:
                ((th.h4) this.f47427b).dismiss();
                org.telegram.ui.ActionBar.k2 Q2 = LaunchActivity.Q();
                if (Q2 != null) {
                    Q2.showDialog(new kg.i1(Q2, 14, false));
                    return;
                }
                return;
            case 14:
                th.s6 s6Var = (th.s6) this.f47427b;
                s6Var.onClick(s6Var.f49439b);
                return;
            case 15:
                th.x6 x6Var = (th.x6) this.f47427b;
                x6Var.f49654b.f49336u1.animate().alpha(0.0f).setDuration(150L).setListener(new th.h7(x6Var, 0)).start();
                return;
            case 16:
                ((sg.v) this.f47427b).run();
                return;
            case 17:
                vh.k kVar = (vh.k) this.f47427b;
                vh.f fVar = kVar.f51340f;
                fVar.d();
                fVar.k(true);
                vh.e eVar = kVar.f51337c0;
                org.telegram.messenger.i0.r(eVar);
                eVar.run();
                return;
            case 18:
                ((vh.e8) this.f47427b).B();
                return;
            case 19:
                vh.n0.a((vh.n0) this.f47427b);
                return;
            case 20:
                ((org.telegram.ui.Wallet.x0) this.f47427b).run();
                return;
            case 21:
                vh.f4 f4Var = ((vh.e4) this.f47427b).f51111y;
                if (f4Var.f51136r && (q20Var = f4Var.f51134f) != null) {
                    q20Var.a(5);
                    return;
                }
                return;
            case 22:
                vh.i6 i6Var = (vh.i6) ((uc0) this.f47427b).h;
                if (i6Var != null) {
                    i6Var.run();
                    return;
                }
                return;
            case 23:
                ((mf) this.f47427b).run();
                return;
            case 24:
                ((mf) this.f47427b).run();
                return;
            case 25:
                ChatActivityEnterView.e(((dd) ((xh.j0) this.f47427b).d).f25392a, (TL_keyboard.KeyboardButton) view.getTag());
                return;
            case 26:
                ((px0) this.f47427b).run();
                return;
            case 27:
                yh.l lVar = (yh.l) this.f47427b;
                TLRPC.Chat chat = lVar.I;
                if (chat != null && !chat.title.equals(((zd) lVar.f54503r.f31475b).getText().toString())) {
                    lVar.getMessagesController().C(lVar.I.f19793id, ((zd) lVar.f54503r.f31475b).getText().toString(), new yh.g(lVar, 1));
                }
                TLRPC.Chat chat2 = lVar.I;
                if (chat2 != null && lVar.f54502n != lVar.h) {
                    if (chat2.default_banned_rights == null) {
                        chat2.default_banned_rights = new TLRPC.TL_chatBannedRights();
                    }
                    lVar.I.default_banned_rights.manage_linked_peers = !lVar.f54502n;
                    lVar.getMessagesController().E4(lVar.f54500c, lVar.I.default_banned_rights, false, lVar);
                }
                lVar.finishFragment();
                return;
            case 28:
                ((yh.v) this.f47427b).f54533n.f54443k1.E(0);
                return;
            default:
                yh.a0 a0Var = ((yh.w) this.f47427b).f54535r;
                if (!org.telegram.messenger.w3.w(27, a0Var.f54444m1)) {
                    a0Var.dismiss();
                    return;
                }
                vh.d dVar = a0Var.f54446o1;
                if (!dVar.Q) {
                    dVar.setLoading(true);
                    vp r12 = vp.r1(a0Var.f21583a);
                    yh.r rVar = new yh.r(a0Var, 2);
                    TLRPC.TL_channels_getAdminedPublicChannels tL_channels_getAdminedPublicChannels = new TLRPC.TL_channels_getAdminedPublicChannels();
                    tL_channels_getAdminedPublicChannels.for_community_peer = true;
                    r12.getConnectionsManager().sendRequestTyped(tL_channels_getAdminedPublicChannels, new a3.b(1), new ml(r12, rVar, 0));
                    return;
                }
                return;
        }
    }
}
