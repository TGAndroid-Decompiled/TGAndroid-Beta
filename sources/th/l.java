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
public final class l implements li {
    public final ni f48553a;
    public final p f48554b;

    public l(p pVar, ni niVar) {
        this.f48554b = pVar;
        this.f48553a = niVar;
    }

    @Override
    public final void B1(int i10, boolean z10, boolean z11, int i11, int i12, long j10, boolean z12, boolean z13, long j11) {
        ni niVar = this.f48553a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = niVar.f31005f0;
        p3 p3Var = this.f48554b.f48623r;
        if (i10 == 7 || i10 == 8) {
            HashMap<Object, Object> selectedPhotos = chatAttachAlertPhotoLayout.getSelectedPhotos();
            ArrayList<Object> selectedPhotosOrder = chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
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
                        p3Var.T1(aVar, (MediaController.PhotoEntry) obj);
                    } else {
                        p3Var.f2((MediaController.PhotoEntry) obj);
                    }
                } else {
                    i13++;
                }
            }
        }
        p3Var.X3 = null;
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
        NotificationCenter.getInstance(this.f48554b.f48622n).doOnIdle(zgVar);
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
