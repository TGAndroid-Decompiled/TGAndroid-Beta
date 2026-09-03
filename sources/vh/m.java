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
public final class m implements ji {
    public final li f46092a;
    public final q f46093b;

    public m(q qVar, li liVar) {
        this.f46093b = qVar;
        this.f46092a = liVar;
    }

    @Override
    public final void C0(wg wgVar) {
        NotificationCenter.getInstance(this.f46093b.f46155n).doOnIdle(wgVar);
    }

    @Override
    public final void G1(int i10, boolean z4, boolean z10, int i11, int i12, long j10, boolean z11, boolean z12, long j11) {
        li liVar = this.f46092a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = liVar.f26698g0;
        s3 s3Var = this.f46093b.f46156r;
        if (i10 == 7 || i10 == 8) {
            HashMap<Object, Object> selectedPhotos = chatAttachAlertPhotoLayout.getSelectedPhotos();
            ArrayList<Object> selectedPhotosOrder = chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
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
                        s3Var.S1(aVar, (MediaController.PhotoEntry) obj);
                    } else {
                        s3Var.e2((MediaController.PhotoEntry) obj);
                    }
                } else {
                    i13++;
                }
            }
        }
        s3Var.Y3 = null;
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
