package yh;

import j$.util.Objects;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class m5 {
    public final long f51631a;
    public final int f51632b;

    public m5(long j3, int i10) {
        this.f51631a = j3;
        this.f51632b = i10;
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
            if (m5Var.f51631a == this.f51631a && m5Var.f51632b == this.f51632b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f51631a), Integer.valueOf(this.f51632b));
    }
}
