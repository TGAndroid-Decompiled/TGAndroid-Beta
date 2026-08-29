package qh;

import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.t9;
import org.telegram.ui.pt0;
import org.telegram.ui.zt0;
public final class l extends pt0 {
    public final n f46729a;

    public l(n nVar) {
        this.f46729a = nVar;
    }

    @Override
    public final zt0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        TLRPC.FileLocation fileLocation2;
        TLRPC.ChatPhoto chatPhoto;
        if (fileLocation != null) {
            n nVar = this.f46729a;
            TLRPC.Chat chat = nVar.getMessagesController().getChat(Long.valueOf(nVar.f46737b));
            if (chat == null || (chatPhoto = chat.photo) == null || (fileLocation2 = chatPhoto.photo_big) == null) {
                fileLocation2 = null;
            }
            if (fileLocation2 != null && fileLocation2.local_id == fileLocation.local_id && fileLocation2.volume_id == fileLocation.volume_id && fileLocation2.dc_id == fileLocation.dc_id) {
                int[] iArr = new int[2];
                nVar.v.getLocationInWindow(iArr);
                zt0 zt0Var = new zt0();
                zt0Var.f45317b = iArr[0];
                zt0Var.f45318c = iArr[1];
                t9 t9Var = nVar.v;
                zt0Var.d = t9Var;
                ImageReceiver imageReceiver = t9Var.getImageReceiver();
                zt0Var.f45316a = imageReceiver;
                zt0Var.f45320f = -nVar.f46737b;
                zt0Var.f45319e = imageReceiver.getBitmapSafe();
                zt0Var.f45321g = -1L;
                zt0Var.h = nVar.v.getImageReceiver().getRoundRadius(true);
                zt0Var.f45324k = 1.0f;
                zt0Var.f45329p = true;
                return zt0Var;
            }
        }
        return null;
    }

    @Override
    public final void G() {
        this.f46729a.v.getImageReceiver().setVisible(true, true);
    }

    @Override
    public final boolean M() {
        return true;
    }

    @Override
    public final void f(String str, String str2, boolean z10) {
        this.f46729a.A.q(str, str2, z10);
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
