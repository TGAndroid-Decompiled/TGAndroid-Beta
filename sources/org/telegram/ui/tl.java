package org.telegram.ui;

import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
public final class tl extends fu0 {
    public final MessageObject f41593a;
    public final MediaController.PhotoEntry f41594b;
    public final xn f41595c;

    public tl(xn xnVar, MessageObject messageObject, MediaController.PhotoEntry photoEntry) {
        this.f41595c = xnVar;
        this.f41593a = messageObject;
        this.f41594b = photoEntry;
    }

    @Override
    public final qu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z4, boolean z10) {
        return xn.A1(this.f41595c, this.f41593a, null, i10, z4, true);
    }

    @Override
    public final boolean O() {
        xn xnVar = this.f41595c;
        if (xnVar.V != null && xnVar.x9()) {
            xnVar.V.P();
            return true;
        }
        return false;
    }

    @Override
    public final MessageObject U() {
        MessageObject messageObject = this.f41595c.f43247m5;
        MessageObject messageObject2 = this.f41593a;
        if (messageObject == messageObject2) {
            return messageObject2;
        }
        return null;
    }

    @Override
    public final void e(CharSequence charSequence) {
        this.f41595c.V.f1(charSequence, false);
    }

    @Override
    public final boolean g() {
        return false;
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z4, int i11, int i12, boolean z10) {
        xn xnVar = this.f41595c;
        if (xnVar.f43247m5 != this.f41593a) {
            return;
        }
        MediaController.PhotoEntry photoEntry = this.f41594b;
        if (!photoEntry.isCropped && !photoEntry.isPainted && !photoEntry.isFiltered && videoEditedInfo == null) {
            xnVar.V.d0();
        } else {
            xnVar.r(photoEntry, videoEditedInfo, z4, i11, 0, z10, 0L);
        }
    }
}
