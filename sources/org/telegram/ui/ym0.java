package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLRPC;
public final class ym0 implements org.telegram.ui.Components.ti {
    public final un0 f42193a;

    public ym0(un0 un0Var) {
        this.f42193a = un0Var;
    }

    @Override
    public final void H() {
        AndroidUtilities.hideKeyboard(this.f42193a.fragmentView.findFocus());
    }

    @Override
    public final void g0(int i10, boolean z10, boolean z11, int i11, int i12, long j10, boolean z12, boolean z13, long j11) {
        org.telegram.ui.Components.vi viVar;
        un0 un0Var = this.f42193a;
        if (un0Var.getParentActivity() != null && (viVar = un0Var.R0) != null) {
            if (i10 != 8 && i10 != 7) {
                viVar.dismissWithButtonClick(i10);
                un0Var.E1(i10);
                return;
            }
            if (i10 != 8) {
                viVar.dismiss(true);
            }
            HashMap<Object, Object> selectedPhotos = un0Var.R0.f30013j0.getSelectedPhotos();
            ArrayList<Object> selectedPhotosOrder = un0Var.R0.f30013j0.getSelectedPhotosOrder();
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
                un0Var.F1(arrayList);
            }
        }
    }

    @Override
    public final boolean p0() {
        return false;
    }

    @Override
    public final void v(org.telegram.ui.Components.hh hhVar) {
        hhVar.run();
    }

    @Override
    public final boolean x() {
        return false;
    }

    @Override
    public final void U(Object obj) {
    }

    @Override
    public final void W(TLRPC.User user) {
    }

    @Override
    public final void z() {
    }

    @Override
    public final void r0(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j10, boolean z11, long j11) {
    }
}
