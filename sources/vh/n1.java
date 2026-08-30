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
public final class n1 implements ji {
    public final li f46023a;
    public final y1 f46024b;

    public n1(y1 y1Var, li liVar) {
        this.f46024b = y1Var;
        this.f46023a = liVar;
    }

    @Override
    public final void H(int i10, boolean z4, boolean z10, int i11, int i12, long j10, boolean z11, boolean z12, long j11) {
        li liVar = this.f46023a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = liVar.f26702g0;
        y1 y1Var = this.f46024b;
        if (i10 == 7 || i10 == 8) {
            HashMap<Object, Object> selectedPhotos = chatAttachAlertPhotoLayout.getSelectedPhotos();
            ArrayList<Object> selectedPhotosOrder = chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
            r3 r3Var = y1Var.M;
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
                        y1Var.M.T1(aVar, (MediaController.PhotoEntry) obj);
                    } else {
                        y1Var.M.f2((MediaController.PhotoEntry) obj);
                    }
                } else {
                    i13++;
                }
            }
        }
        y1Var.M.Y3 = null;
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
        NotificationCenter.getInstance(this.f46024b.getCurrentAccount()).doOnIdle(wgVar);
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
