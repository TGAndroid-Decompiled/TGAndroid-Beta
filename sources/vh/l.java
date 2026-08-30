package vh;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.ji;
import org.telegram.ui.Components.li;
import org.telegram.ui.Components.wg;
public final class l implements ji {
    public final li f45995a;
    public final p f45996b;

    public l(p pVar, li liVar) {
        this.f45996b = pVar;
        this.f45995a = liVar;
    }

    @Override
    public final void H(int i10, boolean z4, boolean z10, int i11, int i12, long j10, boolean z11, boolean z12, long j11) {
        li liVar = this.f45995a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = liVar.f26702g0;
        r3 r3Var = this.f45996b.f46059r;
        if (i10 == 7 || i10 == 8) {
            HashMap<Object, Object> selectedPhotos = chatAttachAlertPhotoLayout.getSelectedPhotos();
            ArrayList<Object> selectedPhotosOrder = chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
            a aVar = r3Var.Y3;
            r3Var.Y3 = null;
            int i13 = 0;
            while (true) {
                if (i13 >= selectedPhotosOrder.size()) {
                    break;
                }
                Object obj = selectedPhotos.get(selectedPhotosOrder.get(i13));
                if (obj instanceof MediaController.PhotoEntry) {
                    if (aVar != null) {
                        r3Var.T1(aVar, (MediaController.PhotoEntry) obj);
                    } else {
                        r3Var.f2((MediaController.PhotoEntry) obj);
                    }
                } else {
                    i13++;
                }
            }
        }
        r3Var.Y3 = null;
        liVar.dismiss(true);
    }

    @Override
    public final boolean V() {
        return false;
    }

    @Override
    public final boolean k() {
        return false;
    }

    @Override
    public final void x(wg wgVar) {
        NotificationCenter.getInstance(this.f45996b.f46058n).doOnIdle(wgVar);
    }

    @Override
    public final void C() {
    }

    @Override
    public final void r() {
    }

    @Override
    public final void D(Object obj) {
    }

    @Override
    public final void G(TLRPC.User user) {
    }

    @Override
    public final void X(ArrayList arrayList, CharSequence charSequence, boolean z4, int i10, int i11, long j10, boolean z10, long j11) {
    }
}
