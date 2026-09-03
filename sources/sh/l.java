package sh;

import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.p9;
import org.telegram.ui.fu0;
import org.telegram.ui.qu0;
public final class l extends fu0 {
    public final n f44431a;

    public l(n nVar) {
        this.f44431a = nVar;
    }

    @Override
    public final qu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z4, boolean z10) {
        TLRPC.FileLocation fileLocation2;
        TLRPC.ChatPhoto chatPhoto;
        if (fileLocation != null) {
            n nVar = this.f44431a;
            TLRPC.Chat chat = nVar.getMessagesController().getChat(Long.valueOf(nVar.f44436b));
            if (chat == null || (chatPhoto = chat.photo) == null || (fileLocation2 = chatPhoto.photo_big) == null) {
                fileLocation2 = null;
            }
            if (fileLocation2 != null && fileLocation2.local_id == fileLocation.local_id && fileLocation2.volume_id == fileLocation.volume_id && fileLocation2.dc_id == fileLocation.dc_id) {
                int[] iArr = new int[2];
                nVar.v.getLocationInWindow(iArr);
                qu0 qu0Var = new qu0();
                qu0Var.f37488b = iArr[0];
                qu0Var.f37489c = iArr[1];
                p9 p9Var = nVar.v;
                qu0Var.d = p9Var;
                ImageReceiver imageReceiver = p9Var.getImageReceiver();
                qu0Var.f37487a = imageReceiver;
                qu0Var.f37490f = -nVar.f44436b;
                qu0Var.e = imageReceiver.getBitmapSafe();
                qu0Var.f37491g = -1L;
                qu0Var.h = nVar.v.getImageReceiver().getRoundRadius(true);
                qu0Var.f37494k = 1.0f;
                qu0Var.f37499p = true;
                return qu0Var;
            }
        }
        return null;
    }

    @Override
    public final void G() {
        this.f44431a.v.getImageReceiver().setVisible(true, true);
    }

    @Override
    public final boolean M() {
        return true;
    }

    @Override
    public final void f(String str, String str2, boolean z4) {
        this.f44431a.B.q(str, str2, z4);
    }

    @Override
    public final boolean t() {
        return false;
    }

    @Override
    public final int y() {
        return 1;
    }
}
