package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLRPC;
public final class tm0 implements org.telegram.ui.Components.wi {
    public final on0 f36966a;

    public tm0(on0 on0Var) {
        this.f36966a = on0Var;
    }

    @Override
    public final void A1(int i10, boolean z10, boolean z11, int i11, int i12, long j3, boolean z12, boolean z13, long j10) {
        org.telegram.ui.Components.yi yiVar;
        on0 on0Var = this.f36966a;
        if (on0Var.getParentActivity() != null && (yiVar = on0Var.R0) != null) {
            if (i10 != 8 && i10 != 7) {
                yiVar.dismissWithButtonClick(i10);
                on0Var.F1(i10);
                return;
            }
            if (i10 != 8) {
                yiVar.dismiss(true);
            }
            HashMap<Object, Object> selectedPhotos = on0Var.R0.f29378j0.getSelectedPhotos();
            ArrayList<Object> selectedPhotosOrder = on0Var.R0.f29378j0.getSelectedPhotosOrder();
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
                on0Var.G1(arrayList);
            }
        }
    }

    @Override
    public final void K0() {
        AndroidUtilities.hideKeyboard(this.f36966a.fragmentView.findFocus());
    }

    @Override
    public final boolean R1() {
        return false;
    }

    @Override
    public final boolean e0() {
        return false;
    }

    @Override
    public final void y0(org.telegram.ui.Components.jh jhVar) {
        jhVar.run();
    }

    @Override
    public final void U0(Object obj) {
    }

    @Override
    public final void i1(TLRPC.User user) {
    }

    @Override
    public final void v0() {
    }

    @Override
    public final void W1(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j3, boolean z11, long j10) {
    }
}
