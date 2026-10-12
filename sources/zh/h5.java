package zh;

import j$.util.Objects;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class h5 {
    public final long f50628a;
    public final int f50629b;

    public h5(long j10, int i10) {
        this.f50628a = j10;
        this.f50629b = i10;
    }

    public static h5 a(int i10, long j10) {
        return new h5(j10, i10);
    }

    public static h5 b(MessageObject messageObject) {
        if (messageObject == null) {
            return null;
        }
        TLRPC.Message message = messageObject.messageOwner;
        if (message != null && ((message.isThreadMessage || messageObject.isForwardedChannelPost()) && messageObject.messageOwner.fwd_from != null)) {
            return new h5(messageObject.getFromChatId(), messageObject.messageOwner.fwd_from.saved_from_msg_id);
        }
        return new h5(messageObject.getDialogId(), messageObject.getId());
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h5) {
            h5 h5Var = (h5) obj;
            if (h5Var.f50628a == this.f50628a && h5Var.f50629b == this.f50629b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f50628a), Integer.valueOf(this.f50629b));
    }
}
