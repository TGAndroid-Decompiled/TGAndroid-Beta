package yh;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.cd;
public final class o6 implements Utilities.Callback {
    public final int f47896a;
    public final Object f47897b;
    public final Object f47898c;

    public o6(int i10, Object obj, Object obj2) {
        this.f47896a = i10;
        this.f47897b = obj;
        this.f47898c = obj2;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f47896a) {
            case 0:
                ((Utilities.Callback2) this.f47897b).run((zf.a) obj, new r2((i0[]) this.f47898c, 5));
                return;
            default:
                cd cdVar = (cd) this.f47897b;
                TLRPC.Chat chat = (TLRPC.Chat) this.f47898c;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                cdVar.f32665c = tL_premium_boostsStatus;
                if (tL_premium_boostsStatus != null) {
                    int i10 = tL_premium_boostsStatus.level;
                    cdVar.f32663b = i10;
                    if (chat != null) {
                        chat.flags |= 1024;
                        chat.level = i10;
                    }
                }
                cdVar.X0(true);
                ci.d dVar = cdVar.P;
                if (dVar != null) {
                    dVar.setLoading(false);
                    return;
                }
                return;
        }
    }
}
