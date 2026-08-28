package qh;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.ii;
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.wg;
public final class n1 implements ii {
    public final ki f46527a;
    public final x1 f46528b;

    public n1(x1 x1Var, ki kiVar) {
        this.f46528b = x1Var;
        this.f46527a = kiVar;
    }

    @Override
    public final void L(int i9, boolean z10, boolean z11, int i10, int i11, long j10, boolean z12, boolean z13, long j11) {
        ki kiVar = this.f46527a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = kiVar.f30114f0;
        x1 x1Var = this.f46528b;
        if (i9 == 7 || i9 == 8) {
            HashMap<Object, Object> selectedPhotos = chatAttachAlertPhotoLayout.getSelectedPhotos();
            ArrayList<Object> selectedPhotosOrder = chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
            o3 o3Var = x1Var.L;
            a aVar = o3Var.X3;
            o3Var.X3 = null;
            int i12 = 0;
            while (true) {
                if (i12 >= selectedPhotosOrder.size()) {
                    break;
                }
                Object obj = selectedPhotos.get(selectedPhotosOrder.get(i12));
                if (obj instanceof MediaController.PhotoEntry) {
                    if (aVar != null) {
                        x1Var.L.T1(aVar, (MediaController.PhotoEntry) obj);
                    } else {
                        x1Var.L.f2((MediaController.PhotoEntry) obj);
                    }
                } else {
                    i12++;
                }
            }
        }
        x1Var.L.X3 = null;
        kiVar.dismiss(true);
    }

    @Override
    public final boolean j() {
        return false;
    }

    @Override
    public final void t(wg wgVar) {
        NotificationCenter.getInstance(this.f46528b.getCurrentAccount()).doOnIdle(wgVar);
    }

    @Override
    public final boolean t0() {
        return false;
    }

    @Override
    public final void o() {
    }

    @Override
    public final void u() {
    }

    @Override
    public final void A(Object obj) {
    }

    @Override
    public final void E(TLRPC.User user) {
    }

    @Override
    public final void v0(ArrayList arrayList, CharSequence charSequence, boolean z10, int i9, int i10, long j10, boolean z11, long j11) {
    }
}
