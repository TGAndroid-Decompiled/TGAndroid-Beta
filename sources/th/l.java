package th;

import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.p9;
import org.telegram.ui.au0;
import org.telegram.ui.lu0;
public final class l extends au0 {
    public final n f48148a;

    public l(n nVar) {
        this.f48148a = nVar;
    }

    @Override
    public final lu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z4, boolean z10) {
        TLRPC.FileLocation fileLocation2;
        TLRPC.ChatPhoto chatPhoto;
        if (fileLocation != null) {
            n nVar = this.f48148a;
            TLRPC.Chat chat = nVar.getMessagesController().getChat(Long.valueOf(nVar.f48153b));
            if (chat == null || (chatPhoto = chat.photo) == null || (fileLocation2 = chatPhoto.photo_big) == null) {
                fileLocation2 = null;
            }
            if (fileLocation2 != null && fileLocation2.local_id == fileLocation.local_id && fileLocation2.volume_id == fileLocation.volume_id && fileLocation2.dc_id == fileLocation.dc_id) {
                int[] iArr = new int[2];
                nVar.v.getLocationInWindow(iArr);
                lu0 lu0Var = new lu0();
                lu0Var.f38865b = iArr[0];
                lu0Var.f38866c = iArr[1];
                p9 p9Var = nVar.v;
                lu0Var.d = p9Var;
                ImageReceiver imageReceiver = p9Var.getImageReceiver();
                lu0Var.f38864a = imageReceiver;
                lu0Var.f38868f = -nVar.f48153b;
                lu0Var.f38867e = imageReceiver.getBitmapSafe();
                lu0Var.f38869g = -1L;
                lu0Var.h = nVar.v.getImageReceiver().getRoundRadius(true);
                lu0Var.f38872k = 1.0f;
                lu0Var.f38877p = true;
                return lu0Var;
            }
        }
        return null;
    }

    @Override
    public final void G() {
        this.f48148a.v.getImageReceiver().setVisible(true, true);
    }

    @Override
    public final boolean M() {
        return true;
    }

    @Override
    public final void f(String str, String str2, boolean z4) {
        this.f48148a.B.q(str, str2, z4);
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
