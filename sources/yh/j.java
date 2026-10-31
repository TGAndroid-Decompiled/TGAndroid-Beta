package yh;

import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.jj;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.g9;
import org.telegram.ui.gs0;
import org.telegram.ui.yr0;
public final class j extends yr0 {
    public final l f54496a;

    public j(l lVar) {
        this.f54496a = lVar;
    }

    @Override
    public final gs0 E(jj jjVar, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        TLRPC.FileLocation fileLocation2;
        TLRPC.ChatPhoto chatPhoto;
        if (fileLocation != null) {
            l lVar = this.f54496a;
            TLRPC.Chat L0 = lVar.getMessagesController().L0(Long.valueOf(lVar.f54500c));
            if (L0 == null || (chatPhoto = L0.photo) == null || (fileLocation2 = chatPhoto.photo_big) == null) {
                fileLocation2 = null;
            }
            if (fileLocation2 != null && fileLocation2.local_id == fileLocation.local_id && fileLocation2.volume_id == fileLocation.volume_id && fileLocation2.dc_id == fileLocation.dc_id) {
                int[] iArr = new int[2];
                lVar.f54506x.getLocationInWindow(iArr);
                gs0 gs0Var = new gs0();
                gs0Var.f37628b = iArr[0];
                gs0Var.f37629c = iArr[1];
                g9 g9Var = lVar.f54506x;
                gs0Var.d = g9Var;
                ImageReceiver imageReceiver = g9Var.getImageReceiver();
                gs0Var.f37627a = imageReceiver;
                gs0Var.f37630f = -lVar.f54500c;
                gs0Var.e = imageReceiver.p();
                gs0Var.f37631g = -1L;
                gs0Var.h = lVar.f54506x.getImageReceiver().E();
                gs0Var.f37634k = 1.0f;
                gs0Var.f37639p = true;
                return gs0Var;
            }
        }
        return null;
    }

    @Override
    public final void G() {
        this.f54496a.f54506x.getImageReceiver().O0(true, true);
    }

    @Override
    public final boolean N() {
        return true;
    }

    @Override
    public final void f(String str, String str2, boolean z10) {
        this.f54496a.F.p(str, str2, z10);
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
