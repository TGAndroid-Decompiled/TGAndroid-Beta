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
public final class l implements ii {
    public final ki f46493a;
    public final p f46494b;

    public l(p pVar, ki kiVar) {
        this.f46494b = pVar;
        this.f46493a = kiVar;
    }

    @Override
    public final void L(int i9, boolean z10, boolean z11, int i10, int i11, long j10, boolean z12, boolean z13, long j11) {
        ki kiVar = this.f46493a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = kiVar.f30114f0;
        o3 o3Var = this.f46494b.f46606r;
        if (i9 == 7 || i9 == 8) {
            HashMap<Object, Object> selectedPhotos = chatAttachAlertPhotoLayout.getSelectedPhotos();
            ArrayList<Object> selectedPhotosOrder = chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
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
                        o3Var.T1(aVar, (MediaController.PhotoEntry) obj);
                    } else {
                        o3Var.f2((MediaController.PhotoEntry) obj);
                    }
                } else {
                    i12++;
                }
            }
        }
        o3Var.X3 = null;
        kiVar.dismiss(true);
    }

    @Override
    public final boolean j() {
        return false;
    }

    @Override
    public final void t(wg wgVar) {
        NotificationCenter.getInstance(this.f46494b.f46605n).doOnIdle(wgVar);
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
