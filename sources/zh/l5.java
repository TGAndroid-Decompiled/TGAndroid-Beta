package zh;

import j$.util.Objects;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class l5 {
    public final long f52213a;
    public final int f52214b;

    public l5(long j3, int i10) {
        this.f52213a = j3;
        this.f52214b = i10;
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
            if (l5Var.f52213a == this.f52213a && l5Var.f52214b == this.f52214b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f52213a), Integer.valueOf(this.f52214b));
    }
}
