package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLRPC;
public final class vm0 implements org.telegram.ui.Components.ti {
    public final qn0 f38476a;

    public vm0(qn0 qn0Var) {
        this.f38476a = qn0Var;
    }

    @Override
    public final void B1(int i10, boolean z10, boolean z11, int i11, int i12, long j3, boolean z12, boolean z13, long j10) {
        org.telegram.ui.Components.vi viVar;
        qn0 qn0Var = this.f38476a;
        if (qn0Var.getParentActivity() != null && (viVar = qn0Var.R0) != null) {
            if (i10 != 8 && i10 != 7) {
                viVar.dismissWithButtonClick(i10);
                qn0Var.F1(i10);
                return;
            }
            if (i10 != 8) {
                viVar.dismiss(true);
            }
            HashMap<Object, Object> selectedPhotos = qn0Var.R0.f28754j0.getSelectedPhotos();
            ArrayList<Object> selectedPhotosOrder = qn0Var.R0.f28754j0.getSelectedPhotosOrder();
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
                qn0Var.G1(arrayList);
            }
        }
    }

    @Override
    public final void K0() {
        AndroidUtilities.hideKeyboard(this.f38476a.fragmentView.findFocus());
    }

    @Override
    public final boolean S1() {
        return false;
    }

    @Override
    public final boolean c0() {
        return false;
    }

    @Override
    public final void x0(org.telegram.ui.Components.fh fhVar) {
        fhVar.run();
    }

    @Override
    public final void U0(Object obj) {
    }

    @Override
    public final void j1(TLRPC.User user) {
    }

    @Override
    public final void u0() {
    }

    @Override
    public final void W1(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j3, boolean z11, long j10) {
    }
}
