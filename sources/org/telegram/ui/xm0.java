package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLRPC;
public final class xm0 implements org.telegram.ui.Components.ti {
    public final sn0 f41600a;

    public xm0(sn0 sn0Var) {
        this.f41600a = sn0Var;
    }

    @Override
    public final void F() {
        AndroidUtilities.hideKeyboard(this.f41600a.fragmentView.findFocus());
    }

    @Override
    public final void b0(int i10, boolean z10, boolean z11, int i11, int i12, long j10, boolean z12, boolean z13, long j11) {
        org.telegram.ui.Components.vi viVar;
        sn0 sn0Var = this.f41600a;
        if (sn0Var.getParentActivity() != null && (viVar = sn0Var.R0) != null) {
            if (i10 != 8 && i10 != 7) {
                viVar.dismissWithButtonClick(i10);
                sn0Var.E1(i10);
                return;
            }
            if (i10 != 8) {
                viVar.dismiss(true);
            }
            HashMap<Object, Object> selectedPhotos = sn0Var.R0.f29684j0.getSelectedPhotos();
            ArrayList<Object> selectedPhotosOrder = sn0Var.R0.f29684j0.getSelectedPhotosOrder();
            if (!selectedPhotos.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                for (int i13 = 0; i13 < selectedPhotosOrder.size(); i13++) {
                    MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) selectedPhotos.get(selectedPhotosOrder.get(i13));
                    SendMessagesHelper.SendingMediaInfo sendingMediaInfo = new SendMessagesHelper.SendingMediaInfo();
                    String str = photoEntry.imagePath;
                    if (str != null) {
                        sendingMediaInfo.path = str;
                    } else {
                        sendingMediaInfo.path = photoEntry.path;
                    }
                    arrayList.add(sendingMediaInfo);
                    photoEntry.reset();
                }
                sn0Var.F1(arrayList);
            }
        }
    }

    @Override
    public final boolean r0() {
        return false;
    }

    @Override
    public final void v(org.telegram.ui.Components.hh hhVar) {
        hhVar.run();
    }

    @Override
    public final boolean w() {
        return false;
    }

    @Override
    public final void J(Object obj) {
    }

    @Override
    public final void U(TLRPC.User user) {
    }

    @Override
    public final void z() {
    }

    @Override
    public final void s0(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j10, boolean z11, long j11) {
    }
}
