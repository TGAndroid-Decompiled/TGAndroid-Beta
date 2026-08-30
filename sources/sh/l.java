package sh;

import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.p9;
import org.telegram.ui.ju0;
import org.telegram.ui.yt0;
public final class l extends yt0 {
    public final n f44366a;

    public l(n nVar) {
        this.f44366a = nVar;
    }

    @Override
    public final ju0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z4, boolean z10) {
        TLRPC.FileLocation fileLocation2;
        TLRPC.ChatPhoto chatPhoto;
        if (fileLocation != null) {
            n nVar = this.f44366a;
            TLRPC.Chat chat = nVar.getMessagesController().getChat(Long.valueOf(nVar.f44374b));
            if (chat == null || (chatPhoto = chat.photo) == null || (fileLocation2 = chatPhoto.photo_big) == null) {
                fileLocation2 = null;
            }
            if (fileLocation2 != null && fileLocation2.local_id == fileLocation.local_id && fileLocation2.volume_id == fileLocation.volume_id && fileLocation2.dc_id == fileLocation.dc_id) {
                int[] iArr = new int[2];
                nVar.v.getLocationInWindow(iArr);
                ju0 ju0Var = new ju0();
                ju0Var.f35496b = iArr[0];
                ju0Var.f35497c = iArr[1];
                p9 p9Var = nVar.v;
                ju0Var.d = p9Var;
                ImageReceiver imageReceiver = p9Var.getImageReceiver();
                ju0Var.f35495a = imageReceiver;
                ju0Var.f35498f = -nVar.f44374b;
                ju0Var.e = imageReceiver.getBitmapSafe();
                ju0Var.f35499g = -1L;
                ju0Var.h = nVar.v.getImageReceiver().getRoundRadius(true);
                ju0Var.f35502k = 1.0f;
                ju0Var.f35507p = true;
                return ju0Var;
            }
        }
        return null;
    }

    @Override
    public final void G() {
        this.f44366a.v.getImageReceiver().setVisible(true, true);
    }

    @Override
    public final boolean M() {
        return true;
    }

    @Override
    public final void f(String str, String str2, boolean z4) {
        this.f44366a.B.q(str, str2, z4);
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
