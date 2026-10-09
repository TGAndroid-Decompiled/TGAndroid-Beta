package yh;

import j$.util.Objects;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class g5 {
    public final long f52582a;
    public final int f52583b;

    public g5(long j3, int i10) {
        this.f52582a = j3;
        this.f52583b = i10;
    }

    public static g5 a(int i10, long j3) {
        return new g5(j3, i10);
    }

    public static g5 b(MessageObject messageObject) {
        if (messageObject == null) {
            return null;
        }
        TLRPC.Message message = messageObject.messageOwner;
        if (message != null && ((message.isThreadMessage || messageObject.isForwardedChannelPost()) && messageObject.messageOwner.fwd_from != null)) {
            return new g5(messageObject.getFromChatId(), messageObject.messageOwner.fwd_from.saved_from_msg_id);
        }
        return new g5(messageObject.getDialogId(), messageObject.getId());
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g5) {
            g5 g5Var = (g5) obj;
            if (g5Var.f52582a == this.f52582a && g5Var.f52583b == this.f52583b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f52582a), Integer.valueOf(this.f52583b));
    }
}
