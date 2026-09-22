package yh;

import j$.util.Objects;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class n5 {
    public final long f47833a;
    public final int f47834b;

    public n5(long j3, int i10) {
        this.f47833a = j3;
        this.f47834b = i10;
    }

    public static n5 a(int i10, long j3) {
        return new n5(j3, i10);
    }

    public static n5 b(MessageObject messageObject) {
        if (messageObject == null) {
            return null;
        }
        TLRPC.Message message = messageObject.messageOwner;
        if (message != null && ((message.isThreadMessage || messageObject.isForwardedChannelPost()) && messageObject.messageOwner.fwd_from != null)) {
            return new n5(messageObject.getFromChatId(), messageObject.messageOwner.fwd_from.saved_from_msg_id);
        }
        return new n5(messageObject.getDialogId(), messageObject.getId());
    }

    public final boolean equals(Object obj) {
        if (obj instanceof n5) {
            n5 n5Var = (n5) obj;
            if (n5Var.f47833a == this.f47833a && n5Var.f47834b == this.f47834b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f47833a), Integer.valueOf(this.f47834b));
    }
}
