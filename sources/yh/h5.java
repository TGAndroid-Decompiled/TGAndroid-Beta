package yh;

import j$.util.Objects;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class h5 {
    public final long f52723a;
    public final int f52724b;

    public h5(long j3, int i10) {
        this.f52723a = j3;
        this.f52724b = i10;
    }

    public static h5 a(int i10, long j3) {
        return new h5(j3, i10);
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
            if (h5Var.f52723a == this.f52723a && h5Var.f52724b == this.f52724b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f52723a), Integer.valueOf(this.f52724b));
    }
}
