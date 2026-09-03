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
public final class o1 implements ji {
    public final li f46120a;
    public final y1 f46121b;

    public o1(y1 y1Var, li liVar) {
        this.f46121b = y1Var;
        this.f46120a = liVar;
    }

    @Override
    public final void C0(wg wgVar) {
        NotificationCenter.getInstance(this.f46121b.getCurrentAccount()).doOnIdle(wgVar);
    }

    @Override
    public final void G1(int i10, boolean z4, boolean z10, int i11, int i12, long j10, boolean z11, boolean z12, long j11) {
        li liVar = this.f46120a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = liVar.f26698g0;
        y1 y1Var = this.f46121b;
        if (i10 == 7 || i10 == 8) {
            HashMap<Object, Object> selectedPhotos = chatAttachAlertPhotoLayout.getSelectedPhotos();
            ArrayList<Object> selectedPhotosOrder = chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
            s3 s3Var = y1Var.M;
            a aVar = s3Var.Y3;
            s3Var.Y3 = null;
            int i13 = 0;
            while (true) {
                if (i13 >= selectedPhotosOrder.size()) {
                    break;
                }
                Object obj = selectedPhotos.get(selectedPhotosOrder.get(i13));
                if (obj instanceof MediaController.PhotoEntry) {
                    if (aVar != null) {
                        y1Var.M.S1(aVar, (MediaController.PhotoEntry) obj);
                    } else {
                        y1Var.M.e2((MediaController.PhotoEntry) obj);
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
    public final boolean X1() {
        return false;
    }

    @Override
    public final boolean h0() {
        return false;
    }

    @Override
    public final void Q0() {
    }

    @Override
    public final void z0() {
    }

    @Override
    public final void Z0(Object obj) {
    }

    @Override
    public final void o1(TLRPC.User user) {
    }

    @Override
    public final void b2(ArrayList arrayList, CharSequence charSequence, boolean z4, int i10, int i11, long j10, boolean z10, long j11) {
    }
}
