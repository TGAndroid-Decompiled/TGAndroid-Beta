package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLRPC;
public final class um0 implements org.telegram.ui.Components.yi {
    public final pn0 f42537a;

    public um0(pn0 pn0Var) {
        this.f42537a = pn0Var;
    }

    @Override
    public final void I1(int i10, boolean z10, boolean z11, int i11, int i12, long j3, boolean z12, boolean z13, long j10) {
        org.telegram.ui.Components.aj ajVar;
        pn0 pn0Var = this.f42537a;
        if (pn0Var.getParentActivity() != null && (ajVar = pn0Var.R0) != null) {
            if (i10 != 8 && i10 != 7) {
                ajVar.dismissWithButtonClick(i10);
                pn0Var.E1(i10);
                return;
            }
            if (i10 != 8) {
                ajVar.dismiss(true);
            }
            HashMap<Object, Object> selectedPhotos = pn0Var.R0.f24354j0.getSelectedPhotos();
            ArrayList<Object> selectedPhotosOrder = pn0Var.R0.f24354j0.getSelectedPhotosOrder();
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
                pn0Var.F1(arrayList);
            }
        }
    }

    @Override
    public final void P0() {
        AndroidUtilities.hideKeyboard(this.f42537a.fragmentView.findFocus());
    }

    @Override
    public final boolean Y1() {
        return false;
    }

    @Override
    public final void d0(org.telegram.ui.Components.lh lhVar) {
        lhVar.run();
    }

    @Override
    public final boolean g0() {
        return false;
    }

    @Override
    public final void A0() {
    }

    @Override
    public final void Z0(Object obj) {
    }

    @Override
    public final void p1(TLRPC.User user) {
    }

    @Override
    public final void c2(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j3, boolean z11, long j10) {
    }
}
