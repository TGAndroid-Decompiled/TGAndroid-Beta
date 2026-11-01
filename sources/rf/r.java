package rf;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.AbstractMap;
import org.telegram.messenger.kj;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_ephemeral;
import org.telegram.tgnet.tl.TL_update;
public final class r {
    public final p f46562a = new p();
    public final p f46563b = new p();
    public final q f46564c = new p();
    public final q d = new p();
    public final q e = new p();

    public final void a(TL_update.TL_updateEditEphemeralMessage tL_updateEditEphemeralMessage, int i10, ConcurrentHashMap concurrentHashMap, ConcurrentHashMap concurrentHashMap2) {
        TL_ephemeral.EphemeralMessage ephemeralMessage = tL_updateEditEphemeralMessage.message;
        if (ephemeralMessage.anchor_msg_id != 0) {
            this.e.f46559a.add(ephemeralMessage);
        } else if (ephemeralMessage.welcome) {
            TLRPC.TL_message b10 = s.b(ephemeralMessage);
            kj kjVar = new kj(i10, (TLRPC.Message) b10, (AbstractMap) concurrentHashMap, (AbstractMap) concurrentHashMap2, true, true);
            b10.edit_date = ConnectionsManager.getInstance(i10).getCurrentTime();
            b10.flags |= 32768;
            p.a(this.f46563b, ephemeralMessage, b10, kjVar);
        } else {
            this.d.f46559a.add(ephemeralMessage);
        }
    }

    public final void b(TL_update.TL_updateNewEphemeralMessage tL_updateNewEphemeralMessage, int i10, ConcurrentHashMap concurrentHashMap, ConcurrentHashMap concurrentHashMap2) {
        TL_ephemeral.EphemeralMessage ephemeralMessage = tL_updateNewEphemeralMessage.message;
        if (ephemeralMessage.anchor_msg_id != 0) {
            this.e.f46559a.add(ephemeralMessage);
        } else if (ephemeralMessage.welcome) {
            TLRPC.TL_message b10 = s.b(ephemeralMessage);
            p.a(this.f46562a, ephemeralMessage, b10, new kj(i10, (TLRPC.Message) b10, (AbstractMap) concurrentHashMap, (AbstractMap) concurrentHashMap2, true, true));
        } else {
            this.f46564c.f46559a.add(ephemeralMessage);
        }
    }
}
