package rh;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.ei;
import org.telegram.ui.Components.gi;
import org.telegram.ui.Components.sg;

public final class n1 implements ei {

    public final gi f47289a;

    public final x1 f47290b;

    public n1(x1 x1Var, gi giVar) {
        this.f47290b = x1Var;
        this.f47289a = giVar;
    }

    @Override
    public final boolean N0() {
        return false;
    }

    @Override
    public final void n0(int i10, boolean z10, boolean z11, int i11, int i12, long j10, boolean z12, boolean z13, long j11) {
        gi giVar = this.f47289a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = giVar.f28650f0;
        x1 x1Var = this.f47290b;
        if (i10 == 7 || i10 == 8) {
            HashMap<Object, Object> selectedPhotos = chatAttachAlertPhotoLayout.getSelectedPhotos();
            ArrayList<Object> selectedPhotosOrder = chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
            p3 p3Var = x1Var.L;
            a aVar = p3Var.X3;
            p3Var.X3 = null;
            for (int i13 = 0; i13 < selectedPhotosOrder.size(); i13++) {
                Object obj = selectedPhotos.get(selectedPhotosOrder.get(i13));
                if (obj instanceof MediaController.PhotoEntry) {
                    if (aVar != null) {
                        x1Var.L.T1(aVar, (MediaController.PhotoEntry) obj);
                        break;
                    } else {
                        x1Var.L.f2((MediaController.PhotoEntry) obj);
                        break;
                    }
                }
            }
        }
        x1Var.L.X3 = null;
        giVar.dismiss(true);
    }

    @Override
    public final boolean s() {
        return false;
    }

    @Override
    public final void y(sg sgVar) {
        NotificationCenter.getInstance(this.f47290b.getCurrentAccount()).doOnIdle(sgVar);
    }

    @Override
    public final void F() {
    }

    @Override
    public final void w() {
    }

    @Override
    public final void I(Object obj) {
    }

    @Override
    public final void g0(TLRPC.User user) {
    }

    @Override
    public final void P0(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j10, boolean z11, long j11) {
    }
}
