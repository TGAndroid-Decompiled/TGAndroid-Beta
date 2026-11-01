package yh;

import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.kj;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.g9;
import org.telegram.ui.fs0;
import org.telegram.ui.xr0;
public final class j extends xr0 {
    public final l f54500a;

    public j(l lVar) {
        this.f54500a = lVar;
    }

    @Override
    public final fs0 E(kj kjVar, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        TLRPC.FileLocation fileLocation2;
        TLRPC.ChatPhoto chatPhoto;
        if (fileLocation != null) {
            l lVar = this.f54500a;
            TLRPC.Chat L0 = lVar.getMessagesController().L0(Long.valueOf(lVar.f54504c));
            if (L0 == null || (chatPhoto = L0.photo) == null || (fileLocation2 = chatPhoto.photo_big) == null) {
                fileLocation2 = null;
            }
            if (fileLocation2 != null && fileLocation2.local_id == fileLocation.local_id && fileLocation2.volume_id == fileLocation.volume_id && fileLocation2.dc_id == fileLocation.dc_id) {
                int[] iArr = new int[2];
                lVar.f54510x.getLocationInWindow(iArr);
                fs0 fs0Var = new fs0();
                fs0Var.f37216b = iArr[0];
                fs0Var.f37217c = iArr[1];
                g9 g9Var = lVar.f54510x;
                fs0Var.d = g9Var;
                ImageReceiver imageReceiver = g9Var.getImageReceiver();
                fs0Var.f37215a = imageReceiver;
                fs0Var.f37218f = -lVar.f54504c;
                fs0Var.e = imageReceiver.p();
                fs0Var.f37219g = -1L;
                fs0Var.h = lVar.f54510x.getImageReceiver().E();
                fs0Var.f37222k = 1.0f;
                fs0Var.f37227p = true;
                return fs0Var;
            }
        }
        return null;
    }

    @Override
    public final void G() {
        this.f54500a.f54510x.getImageReceiver().O0(true, true);
    }

    @Override
    public final boolean N() {
        return true;
    }

    @Override
    public final void f(String str, String str2, boolean z10) {
        this.f54500a.F.p(str, str2, z10);
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
