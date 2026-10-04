package yh;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.cd;
public final class q6 implements Utilities.Callback {
    public final int f51873a;
    public final Object f51874b;
    public final Object f51875c;

    public q6(int i10, Object obj, Object obj2) {
        this.f51873a = i10;
        this.f51874b = obj;
        this.f51875c = obj2;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f51873a) {
            case 0:
                ((Utilities.Callback2) this.f51874b).run((zf.a) obj, new n2((i0[]) this.f51875c, 7));
                return;
            default:
                cd cdVar = (cd) this.f51874b;
                TLRPC.Chat chat = (TLRPC.Chat) this.f51875c;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                cdVar.f35418c = tL_premium_boostsStatus;
                if (tL_premium_boostsStatus != null) {
                    int i10 = tL_premium_boostsStatus.level;
                    cdVar.f35416b = i10;
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
