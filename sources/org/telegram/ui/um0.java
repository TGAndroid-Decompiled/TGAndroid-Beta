package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLRPC;
public final class um0 implements org.telegram.ui.Components.ti {
    public final pn0 f41216a;

    public um0(pn0 pn0Var) {
        this.f41216a = pn0Var;
    }

    @Override
    public final void B(org.telegram.ui.Components.hh hhVar) {
        hhVar.run();
    }

    @Override
    public final boolean D0() {
        return false;
    }

    @Override
    public final void H() {
        AndroidUtilities.hideKeyboard(this.f41216a.fragmentView.findFocus());
    }

    @Override
    public final void l0(int i10, boolean z10, boolean z11, int i11, int i12, long j3, boolean z12, boolean z13, long j10) {
        org.telegram.ui.Components.vi viVar;
        pn0 pn0Var = this.f41216a;
        if (pn0Var.getParentActivity() != null && (viVar = pn0Var.R0) != null) {
            if (i10 != 8 && i10 != 7) {
                viVar.dismissWithButtonClick(i10);
                pn0Var.F1(i10);
                return;
            }
            if (i10 != 8) {
                viVar.dismiss(true);
            }
            HashMap<Object, Object> selectedPhotos = pn0Var.R0.f31318j0.getSelectedPhotos();
            ArrayList<Object> selectedPhotosOrder = pn0Var.R0.f31318j0.getSelectedPhotosOrder();
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
                pn0Var.G1(arrayList);
            }
        }
    }

    @Override
    public final boolean q() {
        return false;
    }

    @Override
    public final void K(Object obj) {
    }

    @Override
    public final void X(TLRPC.User user) {
    }

    @Override
    public final void x() {
    }

    @Override
    public final void E0(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j3, boolean z11, long j10) {
    }
}
