package yh;

import j$.util.Objects;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class o5 {
    public final long f47537a;
    public final int f47538b;

    public o5(long j3, int i10) {
        this.f47537a = j3;
        this.f47538b = i10;
    }

    public static o5 a(int i10, long j3) {
        return new o5(j3, i10);
    }

    public static o5 b(MessageObject messageObject) {
        if (messageObject == null) {
            return null;
        }
        TLRPC.Message message = messageObject.messageOwner;
        if (message != null && ((message.isThreadMessage || messageObject.isForwardedChannelPost()) && messageObject.messageOwner.fwd_from != null)) {
            return new o5(messageObject.getFromChatId(), messageObject.messageOwner.fwd_from.saved_from_msg_id);
        }
        return new o5(messageObject.getDialogId(), messageObject.getId());
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o5) {
            o5 o5Var = (o5) obj;
            if (o5Var.f47537a == this.f47537a && o5Var.f47538b == this.f47538b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f47537a), Integer.valueOf(this.f47538b));
    }
}
