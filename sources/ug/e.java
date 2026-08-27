package ug;

import f2.o1;
import f2.q0;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.messenger.voip.GroupCallMessagesController;
import org.telegram.tgnet.TLRPC;

public abstract class e extends q0 implements GroupCallMessagesController.CallMessageListener {

    public List f48654c;
    public boolean d;

    public int f48655e;

    public TLRPC.InputGroupCall f48656f;

    @Override
    public final int h() {
        List list = this.f48654c;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override
    public final void onNewGroupCallMessage(long j10, GroupCallMessage groupCallMessage) {
        if (this.f48654c == null) {
            this.f48654c = new ArrayList();
        }
        this.f48654c.add(0, groupCallMessage);
        o(0);
    }

    @Override
    public final void onPopGroupCallMessage() {
        List list = this.f48654c;
        if (list == null || list.isEmpty()) {
            return;
        }
        int size = this.f48654c.size() - 1;
        this.f48654c.remove(size);
        u(size);
    }

    @Override
    public final void v(o1 o1Var, int i10) {
        c cVar = (c) o1Var;
        List list = this.f48654c;
        if (list == null || list.size() <= i10) {
            return;
        }
        ((d) cVar.f5789a).set((GroupCallMessage) this.f48654c.get(i10));
    }
}
