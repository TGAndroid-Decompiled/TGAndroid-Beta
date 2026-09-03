package yg;

import f2.l1;
import f2.o0;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.messenger.voip.GroupCallMessagesController;
import org.telegram.tgnet.TLRPC;
public abstract class d extends o0 implements GroupCallMessagesController.CallMessageListener {
    public List f47330c;
    public boolean d;
    public int e;
    public TLRPC.InputGroupCall f47331f;

    @Override
    public final int h() {
        List list = this.f47330c;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override
    public final void onNewGroupCallMessage(long j10, GroupCallMessage groupCallMessage) {
        if (this.f47330c == null) {
            this.f47330c = new ArrayList();
        }
        this.f47330c.add(0, groupCallMessage);
        o(0);
    }

    @Override
    public final void onPopGroupCallMessage() {
        List list = this.f47330c;
        if (list != null && !list.isEmpty()) {
            int size = this.f47330c.size() - 1;
            this.f47330c.remove(size);
            u(size);
        }
    }

    @Override
    public final void v(l1 l1Var, int i10) {
        b bVar = (b) l1Var;
        List list = this.f47330c;
        if (list != null && list.size() > i10) {
            ((c) bVar.f5774a).set((GroupCallMessage) this.f47330c.get(i10));
        }
    }
}
