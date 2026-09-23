package yh;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ad;
public final class p6 implements Utilities.Callback {
    public final int f47563a;
    public final Object f47564b;
    public final Object f47565c;

    public p6(int i10, Object obj, Object obj2) {
        this.f47563a = i10;
        this.f47564b = obj;
        this.f47565c = obj2;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f47563a) {
            case 0:
                ((Utilities.Callback2) this.f47564b).run((zf.a) obj, new w2((i0[]) this.f47565c, 4));
                return;
            default:
                ad adVar = (ad) this.f47564b;
                TLRPC.Chat chat = (TLRPC.Chat) this.f47565c;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                adVar.f31742c = tL_premium_boostsStatus;
                if (tL_premium_boostsStatus != null) {
                    int i10 = tL_premium_boostsStatus.level;
                    adVar.f31740b = i10;
                    if (chat != null) {
                        chat.flags |= 1024;
                        chat.level = i10;
                    }
                }
                adVar.X0(true);
                ci.d dVar = adVar.P;
                if (dVar != null) {
                    dVar.setLoading(false);
                    return;
                }
                return;
        }
    }
}
