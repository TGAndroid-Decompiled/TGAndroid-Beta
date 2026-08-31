package wh;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.mi;
import org.telegram.ui.Components.wg;
public final class o1 implements ki {
    public final mi f49895a;
    public final z1 f49896b;

    public o1(z1 z1Var, mi miVar) {
        this.f49896b = z1Var;
        this.f49895a = miVar;
    }

    @Override
    public final void B0(wg wgVar) {
        NotificationCenter.getInstance(this.f49896b.getCurrentAccount()).doOnIdle(wgVar);
    }

    @Override
    public final void I1(int i10, boolean z4, boolean z10, int i11, int i12, long j10, boolean z11, boolean z12, long j11) {
        mi miVar = this.f49895a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = miVar.f29054g0;
        z1 z1Var = this.f49896b;
        if (i10 == 7 || i10 == 8) {
            HashMap<Object, Object> selectedPhotos = chatAttachAlertPhotoLayout.getSelectedPhotos();
            ArrayList<Object> selectedPhotosOrder = chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
            r3 r3Var = z1Var.M;
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
                        z1Var.M.T1(aVar, (MediaController.PhotoEntry) obj);
                    } else {
                        z1Var.M.f2((MediaController.PhotoEntry) obj);
                    }
                } else {
                    i13++;
                }
            }
        }
        z1Var.M.Y3 = null;
        miVar.dismiss(true);
    }

    @Override
    public final boolean b2() {
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
    public final void y0() {
    }

    @Override
    public final void Z0(Object obj) {
    }

    @Override
    public final void o1(TLRPC.User user) {
    }

    @Override
    public final void f2(ArrayList arrayList, CharSequence charSequence, boolean z4, int i10, int i11, long j10, boolean z10, long j11) {
    }
}
