package org.telegram.ui;

import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
public final class tl extends yt0 {
    public final MessageObject f38683a;
    public final MediaController.PhotoEntry f38684b;
    public final xn f38685c;

    public tl(xn xnVar, MessageObject messageObject, MediaController.PhotoEntry photoEntry) {
        this.f38685c = xnVar;
        this.f38683a = messageObject;
        this.f38684b = photoEntry;
    }

    @Override
    public final ju0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z4, boolean z10) {
        return xn.A1(this.f38685c, this.f38683a, null, i10, z4, true);
    }

    @Override
    public final boolean O() {
        xn xnVar = this.f38685c;
        if (xnVar.V != null && xnVar.x9()) {
            xnVar.V.P();
            return true;
        }
        return false;
    }

    @Override
    public final MessageObject U() {
        MessageObject messageObject = this.f38685c.f40100m5;
        MessageObject messageObject2 = this.f38683a;
        if (messageObject == messageObject2) {
            return messageObject2;
        }
        return null;
    }

    @Override
    public final void e(CharSequence charSequence) {
        this.f38685c.V.f1(charSequence, false);
    }

    @Override
    public final boolean g() {
        return false;
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z4, int i11, int i12, boolean z10) {
        xn xnVar = this.f38685c;
        if (xnVar.f40100m5 != this.f38683a) {
            return;
        }
        MediaController.PhotoEntry photoEntry = this.f38684b;
        if (!photoEntry.isCropped && !photoEntry.isPainted && !photoEntry.isFiltered && videoEditedInfo == null) {
            xnVar.V.d0();
        } else {
            xnVar.r(photoEntry, videoEditedInfo, z4, i11, 0, z10, 0L);
        }
    }
}
