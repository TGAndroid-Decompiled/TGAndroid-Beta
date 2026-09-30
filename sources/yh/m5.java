package yh;

import j$.util.Objects;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class m5 {
    public final long f47835a;
    public final int f47836b;

    public m5(long j3, int i10) {
        this.f47835a = j3;
        this.f47836b = i10;
    }

    public static m5 a(int i10, long j3) {
        return new m5(j3, i10);
    }

    public static m5 b(MessageObject messageObject) {
        if (messageObject == null) {
            return null;
        }
        TLRPC.Message message = messageObject.messageOwner;
        if (message != null && ((message.isThreadMessage || messageObject.isForwardedChannelPost()) && messageObject.messageOwner.fwd_from != null)) {
            return new m5(messageObject.getFromChatId(), messageObject.messageOwner.fwd_from.saved_from_msg_id);
        }
        return new m5(messageObject.getDialogId(), messageObject.getId());
    }

    public final boolean equals(Object obj) {
        if (obj instanceof m5) {
            m5 m5Var = (m5) obj;
            if (m5Var.f47835a == this.f47835a && m5Var.f47836b == this.f47836b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f47835a), Integer.valueOf(this.f47836b));
    }
}
