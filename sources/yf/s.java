package yf;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.AbstractMap;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_ephemeral;
import org.telegram.tgnet.tl.TL_update;
public final class s {
    public final q f50128a = new q();
    public final q f50129b = new q();
    public final r f50130c = new q();
    public final r d = new q();
    public final r f50131e = new q();

    public static void a(TL_update.TL_updateDeleteEphemeralMessages tL_updateDeleteEphemeralMessages) {
        DialogObject.getPeerDialogId(tL_updateDeleteEphemeralMessages.peer);
    }

    public final void b(TL_update.TL_updateEditEphemeralMessage tL_updateEditEphemeralMessage, int i10, ConcurrentHashMap concurrentHashMap, ConcurrentHashMap concurrentHashMap2) {
        TL_ephemeral.EphemeralMessage ephemeralMessage = tL_updateEditEphemeralMessage.message;
        if (ephemeralMessage.anchor_msg_id != 0) {
            this.f50131e.f50125a.add(ephemeralMessage);
        } else if (ephemeralMessage.welcome) {
            TLRPC.TL_message b10 = u.b(ephemeralMessage);
            MessageObject messageObject = new MessageObject(i10, (TLRPC.Message) b10, (AbstractMap<Long, TLRPC.User>) concurrentHashMap, (AbstractMap<Long, TLRPC.Chat>) concurrentHashMap2, true, true);
            b10.edit_date = ConnectionsManager.getInstance(i10).getCurrentTime();
            b10.flags |= 32768;
            q.a(this.f50129b, ephemeralMessage, b10, messageObject);
        } else {
            this.d.f50125a.add(ephemeralMessage);
        }
    }

    public final void c(TL_update.TL_updateNewEphemeralMessage tL_updateNewEphemeralMessage, int i10, ConcurrentHashMap concurrentHashMap, ConcurrentHashMap concurrentHashMap2) {
        TL_ephemeral.EphemeralMessage ephemeralMessage = tL_updateNewEphemeralMessage.message;
        if (ephemeralMessage.anchor_msg_id != 0) {
            this.f50131e.f50125a.add(ephemeralMessage);
        } else if (ephemeralMessage.welcome) {
            TLRPC.TL_message b10 = u.b(ephemeralMessage);
            q.a(this.f50128a, ephemeralMessage, b10, new MessageObject(i10, (TLRPC.Message) b10, (AbstractMap<Long, TLRPC.User>) concurrentHashMap, (AbstractMap<Long, TLRPC.Chat>) concurrentHashMap2, true, true));
        } else {
            this.f50130c.f50125a.add(ephemeralMessage);
        }
    }
}
