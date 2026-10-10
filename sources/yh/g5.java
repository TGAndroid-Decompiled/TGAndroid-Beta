package yh;

import j$.util.Objects;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class g5 {
    public final long f52628a;
    public final int f52629b;

    public g5(long j3, int i10) {
        this.f52628a = j3;
        this.f52629b = i10;
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
            if (g5Var.f52628a == this.f52628a && g5Var.f52629b == this.f52629b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f52628a), Integer.valueOf(this.f52629b));
    }
}
