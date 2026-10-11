package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLRPC;
public final class rm0 implements org.telegram.ui.Components.wi {
    public final mn0 f41510a;

    public rm0(mn0 mn0Var) {
        this.f41510a = mn0Var;
    }

    @Override
    public final void I1(int i10, boolean z10, boolean z11, int i11, int i12, long j3, boolean z12, boolean z13, long j10) {
        org.telegram.ui.Components.yi yiVar;
        mn0 mn0Var = this.f41510a;
        if (mn0Var.getParentActivity() != null && (yiVar = mn0Var.R0) != null) {
            if (i10 != 8 && i10 != 7) {
                yiVar.dismissWithButtonClick(i10);
                mn0Var.E1(i10);
                return;
            }
            if (i10 != 8) {
                yiVar.dismiss(true);
            }
            HashMap<Object, Object> selectedPhotos = mn0Var.R0.f33301j0.getSelectedPhotos();
            ArrayList<Object> selectedPhotosOrder = mn0Var.R0.f33301j0.getSelectedPhotosOrder();
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
                mn0Var.F1(arrayList);
            }
        }
    }

    @Override
    public final void P0() {
        AndroidUtilities.hideKeyboard(this.f41510a.fragmentView.findFocus());
    }

    @Override
    public final boolean Y1() {
        return false;
    }

    @Override
    public final void f0(org.telegram.ui.Components.jh jhVar) {
        jhVar.run();
    }

    @Override
    public final boolean i0() {
        return false;
    }

    @Override
    public final void B0() {
    }

    @Override
    public final void a1(Object obj) {
    }

    @Override
    public final void p1(TLRPC.User user) {
    }

    @Override
    public final void c2(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j3, boolean z11, long j10) {
    }
}
