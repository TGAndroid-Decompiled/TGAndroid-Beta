package th;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.li;
import org.telegram.ui.Components.ni;
import org.telegram.ui.Components.zg;
public final class n1 implements li {
    public final ni f48589a;
    public final x1 f48590b;

    public n1(x1 x1Var, ni niVar) {
        this.f48590b = x1Var;
        this.f48589a = niVar;
    }

    @Override
    public final void B1(int i10, boolean z10, boolean z11, int i11, int i12, long j10, boolean z12, boolean z13, long j11) {
        ni niVar = this.f48589a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = niVar.f31005f0;
        x1 x1Var = this.f48590b;
        if (i10 == 7 || i10 == 8) {
            HashMap<Object, Object> selectedPhotos = chatAttachAlertPhotoLayout.getSelectedPhotos();
            ArrayList<Object> selectedPhotosOrder = chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
            p3 p3Var = x1Var.L;
            a aVar = p3Var.X3;
            p3Var.X3 = null;
            int i13 = 0;
            while (true) {
                if (i13 >= selectedPhotosOrder.size()) {
                    break;
                }
                Object obj = selectedPhotos.get(selectedPhotosOrder.get(i13));
                if (obj instanceof MediaController.PhotoEntry) {
                    if (aVar != null) {
                        x1Var.L.T1(aVar, (MediaController.PhotoEntry) obj);
                    } else {
                        x1Var.L.f2((MediaController.PhotoEntry) obj);
                    }
                } else {
                    i13++;
                }
            }
        }
        x1Var.L.X3 = null;
        niVar.dismiss(true);
    }

    @Override
    public final boolean T1() {
        return false;
    }

    @Override
    public final boolean a0() {
        return false;
    }

    @Override
    public final void x0(zg zgVar) {
        NotificationCenter.getInstance(this.f48590b.getCurrentAccount()).doOnIdle(zgVar);
    }

    @Override
    public final void L0() {
    }

    @Override
    public final void u0() {
    }

    @Override
    public final void U0(Object obj) {
    }

    @Override
    public final void j1(TLRPC.User user) {
    }

    @Override
    public final void X1(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j10, boolean z11, long j11) {
    }
}
