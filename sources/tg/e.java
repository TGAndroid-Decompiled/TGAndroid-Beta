package tg;

import f2.q1;
import f2.r0;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.messenger.voip.GroupCallMessagesController;
import org.telegram.tgnet.TLRPC;
public abstract class e extends r0 implements GroupCallMessagesController.CallMessageListener {
    public List f47932c;
    public boolean d;
    public int f47933e;
    public TLRPC.InputGroupCall f47934f;

    @Override
    public final int h() {
        List list = this.f47932c;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override
    public final void onNewGroupCallMessage(long j10, GroupCallMessage groupCallMessage) {
        if (this.f47932c == null) {
            this.f47932c = new ArrayList();
        }
        this.f47932c.add(0, groupCallMessage);
        o(0);
    }

    @Override
    public final void onPopGroupCallMessage() {
        List list = this.f47932c;
        if (list != null && !list.isEmpty()) {
            int size = this.f47932c.size() - 1;
            this.f47932c.remove(size);
            u(size);
        }
    }

    @Override
    public final void v(q1 q1Var, int i9) {
        c cVar = (c) q1Var;
        List list = this.f47932c;
        if (list != null && list.size() > i9) {
            ((d) cVar.f5501a).set((GroupCallMessage) this.f47932c.get(i9));
        }
    }
}
