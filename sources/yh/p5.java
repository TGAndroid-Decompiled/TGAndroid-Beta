package yh;

import j$.util.Objects;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class p5 {
    public final long f47656a;
    public final int f47657b;

    public p5(long j3, int i10) {
        this.f47656a = j3;
        this.f47657b = i10;
    }

    public static p5 a(int i10, long j3) {
        return new p5(j3, i10);
    }

    public static p5 b(MessageObject messageObject) {
        if (messageObject == null) {
            return null;
        }
        TLRPC.Message message = messageObject.messageOwner;
        if (message != null && ((message.isThreadMessage || messageObject.isForwardedChannelPost()) && messageObject.messageOwner.fwd_from != null)) {
            return new p5(messageObject.getFromChatId(), messageObject.messageOwner.fwd_from.saved_from_msg_id);
        }
        return new p5(messageObject.getDialogId(), messageObject.getId());
    }

    public final boolean equals(Object obj) {
        if (obj instanceof p5) {
            p5 p5Var = (p5) obj;
            if (p5Var.f47656a == this.f47656a && p5Var.f47657b == this.f47657b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f47656a), Integer.valueOf(this.f47657b));
    }
}
