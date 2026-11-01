package rh;

import org.telegram.messenger.r20;
import org.telegram.messenger.wp;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ox0;
public final class h5 implements RequestDelegate {
    public final int f47016a;
    public final Object f47017b;
    public final Object f47018c;

    public h5(int i10, Object obj, Object obj2) {
        this.f47016a = i10;
        this.f47017b = obj;
        this.f47018c = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f47016a) {
            case 0:
                org.telegram.messenger.i0.g3(new l5((e6) this.f47017b, tLObject, (Runnable) this.f47018c, 0));
                return;
            case 1:
                th.s0 s0Var = (th.s0) this.f47017b;
                TLRPC.Updates updates = (TLRPC.Updates) this.f47018c;
                if (tLObject instanceof TLRPC.Updates) {
                    wp.r1(s0Var.e).L3(updates, false);
                    return;
                }
                return;
            case 2:
                th.u2 u2Var = (th.u2) this.f47017b;
                vh.w6 w6Var = (vh.w6) this.f47018c;
                if (tLObject instanceof TLRPC.Updates) {
                    wp.r1(u2Var.f49526x.f49744l2).L3((TLRPC.Updates) tLObject, false);
                }
                org.telegram.messenger.i0.g3(new th.r2(w6Var, 0));
                return;
            case 3:
                org.telegram.messenger.i0.g3(new l5((th.q4) this.f47017b, tLObject, (Runnable) this.f47018c, 8));
                return;
            case 4:
                org.telegram.messenger.i0.g3(new ox0((th.t4) this.f47017b, tLObject, (r20) this.f47018c, tL_error, 24));
                return;
            case 5:
                org.telegram.messenger.i0.g3(new l5((th.x7) this.f47017b, tLObject, (TL_stories.TL_stories_getStoriesViews) this.f47018c, 10));
                return;
            case 6:
                org.telegram.messenger.i0.g3(new l5((s4.g0) ((vh.k1) this.f47017b), (String) this.f47018c, tLObject, 11));
                return;
            case 7:
                org.telegram.messenger.i0.g3(new l5((vh.j2) this.f47017b, tLObject, (wp) this.f47018c, 14));
                return;
            case 8:
                org.telegram.messenger.i0.g3(new l5((vh.r6) this.f47017b, tLObject, (wp) this.f47018c, 17));
                return;
            case 9:
                org.telegram.messenger.i0.g3(new l5((boolean[]) this.f47017b, tLObject, (xh.h1) this.f47018c, 23));
                return;
            case 10:
                org.telegram.messenger.i0.g3(new l5((xh.z2) this.f47017b, tLObject, (org.telegram.ui.ActionBar.x1) this.f47018c, 26));
                return;
            case 11:
                org.telegram.messenger.i0.g3(new xh.p2((zf.c) this.f47017b, tL_error, (String) this.f47018c, tLObject, 3));
                return;
            case 12:
                org.telegram.messenger.i0.g3(new l5((s4.g0) ((zf.x0) this.f47017b), (String) this.f47018c, tLObject, 29));
                return;
            default:
                zf.n1 n1Var = (zf.n1) this.f47017b;
                TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets = (TLRPC.TL_messages_searchStickerSets) this.f47018c;
                if (tLObject instanceof TLRPC.TL_messages_foundStickerSets) {
                    org.telegram.messenger.i0.g3(new zf.k0(n1Var, tL_messages_searchStickerSets, (TLRPC.TL_messages_foundStickerSets) tLObject, 2));
                    return;
                }
                return;
        }
    }
}
