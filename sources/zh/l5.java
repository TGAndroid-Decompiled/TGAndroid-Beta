package zh;

import j$.util.Objects;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class l5 {
    public final long f52245a;
    public final int f52246b;

    public l5(long j3, int i10) {
        this.f52245a = j3;
        this.f52246b = i10;
    }

    public static l5 a(int i10, long j3) {
        return new l5(j3, i10);
    }

    public static l5 b(MessageObject messageObject) {
        if (messageObject == null) {
            return null;
        }
        TLRPC.Message message = messageObject.messageOwner;
        if (message != null && ((message.isThreadMessage || messageObject.isForwardedChannelPost()) && messageObject.messageOwner.fwd_from != null)) {
            return new l5(messageObject.getFromChatId(), messageObject.messageOwner.fwd_from.saved_from_msg_id);
        }
        return new l5(messageObject.getDialogId(), messageObject.getId());
    }

    public final boolean equals(Object obj) {
        if (obj instanceof l5) {
            l5 l5Var = (l5) obj;
            if (l5Var.f52245a == this.f52245a && l5Var.f52246b == this.f52246b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f52245a), Integer.valueOf(this.f52246b));
    }
}
