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
public final class m implements ki {
    public final mi f49868a;
    public final q f49869b;

    public m(q qVar, mi miVar) {
        this.f49869b = qVar;
        this.f49868a = miVar;
    }

    @Override
    public final void B0(wg wgVar) {
        NotificationCenter.getInstance(this.f49869b.f49928n).doOnIdle(wgVar);
    }

    @Override
    public final void I1(int i10, boolean z4, boolean z10, int i11, int i12, long j10, boolean z11, boolean z12, long j11) {
        mi miVar = this.f49868a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = miVar.f29054g0;
        r3 r3Var = this.f49869b.f49929r;
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
