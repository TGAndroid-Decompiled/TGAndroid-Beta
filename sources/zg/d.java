package zg;

import f2.m1;
import f2.p0;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.messenger.voip.GroupCallMessagesController;
import org.telegram.tgnet.TLRPC;
public abstract class d extends p0 implements GroupCallMessagesController.CallMessageListener {
    public List f51187c;
    public boolean d;
    public int f51188e;
    public TLRPC.InputGroupCall f51189f;

    @Override
    public final int h() {
        List list = this.f51187c;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override
    public final void onNewGroupCallMessage(long j10, GroupCallMessage groupCallMessage) {
        if (this.f51187c == null) {
            this.f51187c = new ArrayList();
        }
        this.f51187c.add(0, groupCallMessage);
        o(0);
    }

    @Override
    public final void onPopGroupCallMessage() {
        List list = this.f51187c;
        if (list != null && !list.isEmpty()) {
            int size = this.f51187c.size() - 1;
            this.f51187c.remove(size);
            u(size);
        }
    }

    @Override
    public final void v(m1 m1Var, int i10) {
        b bVar = (b) m1Var;
        List list = this.f51187c;
        if (list != null && list.size() > i10) {
            ((c) bVar.f5875a).set((GroupCallMessage) this.f51187c.get(i10));
        }
    }
}
