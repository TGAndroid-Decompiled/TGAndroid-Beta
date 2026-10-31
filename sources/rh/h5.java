package rh;

import org.telegram.messenger.q20;
import org.telegram.messenger.vp;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.px0;
public final class h5 implements RequestDelegate {
    public final int f47002a;
    public final Object f47003b;
    public final Object f47004c;

    public h5(int i10, Object obj, Object obj2) {
        this.f47002a = i10;
        this.f47003b = obj;
        this.f47004c = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f47002a) {
            case 0:
                org.telegram.messenger.i0.g3(new l5((e6) this.f47003b, tLObject, (Runnable) this.f47004c, 0));
                return;
            case 1:
                th.s0 s0Var = (th.s0) this.f47003b;
                TLRPC.Updates updates = (TLRPC.Updates) this.f47004c;
                if (tLObject instanceof TLRPC.Updates) {
                    vp.r1(s0Var.e).L3(updates, false);
                    return;
                }
                return;
            case 2:
                th.u2 u2Var = (th.u2) this.f47003b;
                vh.w6 w6Var = (vh.w6) this.f47004c;
                if (tLObject instanceof TLRPC.Updates) {
                    vp.r1(u2Var.f49512x.f49730l2).L3((TLRPC.Updates) tLObject, false);
                }
                org.telegram.messenger.i0.g3(new th.r2(w6Var, 0));
                return;
            case 3:
                org.telegram.messenger.i0.g3(new l5((th.q4) this.f47003b, tLObject, (Runnable) this.f47004c, 8));
                return;
            case 4:
                org.telegram.messenger.i0.g3(new px0((th.t4) this.f47003b, tLObject, (q20) this.f47004c, tL_error, 24));
                return;
            case 5:
                org.telegram.messenger.i0.g3(new l5((th.x7) this.f47003b, tLObject, (TL_stories.TL_stories_getStoriesViews) this.f47004c, 10));
                return;
            case 6:
                org.telegram.messenger.i0.g3(new l5((s4.g0) ((vh.k1) this.f47003b), (String) this.f47004c, tLObject, 11));
                return;
            case 7:
                org.telegram.messenger.i0.g3(new l5((vh.j2) this.f47003b, tLObject, (vp) this.f47004c, 14));
                return;
            case 8:
                org.telegram.messenger.i0.g3(new l5((vh.r6) this.f47003b, tLObject, (vp) this.f47004c, 17));
                return;
            case 9:
                org.telegram.messenger.i0.g3(new l5((boolean[]) this.f47003b, tLObject, (xh.h1) this.f47004c, 23));
                return;
            case 10:
                org.telegram.messenger.i0.g3(new l5((xh.z2) this.f47003b, tLObject, (org.telegram.ui.ActionBar.x1) this.f47004c, 26));
                return;
            case 11:
                org.telegram.messenger.i0.g3(new xh.p2((zf.c) this.f47003b, tL_error, (String) this.f47004c, tLObject, 3));
                return;
            case 12:
                org.telegram.messenger.i0.g3(new l5((s4.g0) ((zf.x0) this.f47003b), (String) this.f47004c, tLObject, 29));
                return;
            default:
                zf.n1 n1Var = (zf.n1) this.f47003b;
                TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets = (TLRPC.TL_messages_searchStickerSets) this.f47004c;
                if (tLObject instanceof TLRPC.TL_messages_foundStickerSets) {
                    org.telegram.messenger.i0.g3(new zf.k0(n1Var, tL_messages_searchStickerSets, (TLRPC.TL_messages_foundStickerSets) tLObject, 2));
                    return;
                }
                return;
        }
    }
}
