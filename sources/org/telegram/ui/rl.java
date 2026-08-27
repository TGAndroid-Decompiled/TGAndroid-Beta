package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;

public final class rl extends st0 {

    public final rn f41961a;

    public rl(rn rnVar) {
        this.f41961a = rnVar;
    }

    @Override
    public final cu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        vj vjVar;
        ImageReceiver photoImage;
        if (i10 >= 0) {
            rn rnVar = this.f41961a;
            if (i10 < rnVar.Da.size() && (vjVar = rnVar.E1) != null && vjVar.getListView() != null) {
                int childCount = rnVar.E1.getListView().getChildCount();
                Object obj = rnVar.Da.get(i10);
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = rnVar.E1.getListView().getChildAt(i11);
                    if (childAt instanceof org.telegram.ui.Cells.d2) {
                        org.telegram.ui.Cells.d2 d2Var = (org.telegram.ui.Cells.d2) childAt;
                        if (d2Var.getResult() == obj) {
                            photoImage = d2Var.getPhotoImage();
                        } else {
                            photoImage = null;
                        }
                    } else {
                        photoImage = null;
                    }
                    if (photoImage != null) {
                        int[] iArr = new int[2];
                        childAt.getLocationInWindow(iArr);
                        cu0 cu0Var = new cu0();
                        cu0Var.f37154b = iArr[0];
                        cu0Var.f37155c = iArr[1];
                        cu0Var.d = rnVar.E1.getListView();
                        cu0Var.f37153a = photoImage;
                        cu0Var.f37156e = photoImage.getBitmapSafe();
                        cu0Var.h = photoImage.getRoundRadius(true);
                        return cu0Var;
                    }
                }
            }
        }
        return null;
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        if (i10 >= 0) {
            rn rnVar = this.f41961a;
            if (i10 >= rnVar.Da.size()) {
                return;
            }
            rnVar.cb((TLRPC.BotInlineResult) rnVar.Da.get(i10), z10, i11, 0L);
        }
    }
}
