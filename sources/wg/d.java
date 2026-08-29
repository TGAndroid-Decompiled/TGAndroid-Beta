package wg;

import f2.n1;
import f2.p0;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.messenger.voip.GroupCallMessagesController;
import org.telegram.tgnet.TLRPC;
public abstract class d extends p0 implements GroupCallMessagesController.CallMessageListener {
    public List f49975c;
    public boolean d;
    public int f49976e;
    public TLRPC.InputGroupCall f49977f;

    @Override
    public final int h() {
        List list = this.f49975c;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override
    public final void onNewGroupCallMessage(long j10, GroupCallMessage groupCallMessage) {
        if (this.f49975c == null) {
            this.f49975c = new ArrayList();
        }
        this.f49975c.add(0, groupCallMessage);
        o(0);
    }

    @Override
    public final void onPopGroupCallMessage() {
        List list = this.f49975c;
        if (list != null && !list.isEmpty()) {
            int size = this.f49975c.size() - 1;
            this.f49975c.remove(size);
            u(size);
        }
    }

    @Override
    public final void v(n1 n1Var, int i10) {
        b bVar = (b) n1Var;
        List list = this.f49975c;
        if (list != null && list.size() > i10) {
            ((c) bVar.f6432a).set((GroupCallMessage) this.f49975c.get(i10));
        }
    }
}
