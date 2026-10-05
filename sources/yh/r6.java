package yh;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.cd;
public final class r6 implements Utilities.Callback {
    public final int f51927a;
    public final Object f51928b;
    public final Object f51929c;

    public r6(int i10, Object obj, Object obj2) {
        this.f51927a = i10;
        this.f51928b = obj;
        this.f51929c = obj2;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f51927a) {
            case 0:
                ((Utilities.Callback2) this.f51928b).run((zf.a) obj, new o2((j0[]) this.f51929c, 7));
                return;
            default:
                cd cdVar = (cd) this.f51928b;
                TLRPC.Chat chat = (TLRPC.Chat) this.f51929c;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                cdVar.f35402c = tL_premium_boostsStatus;
                if (tL_premium_boostsStatus != null) {
                    int i10 = tL_premium_boostsStatus.level;
                    cdVar.f35400b = i10;
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
