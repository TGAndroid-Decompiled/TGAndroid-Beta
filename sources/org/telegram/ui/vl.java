package org.telegram.ui;

import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
public final class vl extends fu0 {
    public final MessageObject f39129a;
    public final MediaController.PhotoEntry f39130b;
    public final zn f39131c;

    public vl(zn znVar, MessageObject messageObject, MediaController.PhotoEntry photoEntry) {
        this.f39131c = znVar;
        this.f39129a = messageObject;
        this.f39130b = photoEntry;
    }

    @Override
    public final qu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z4, boolean z10) {
        return zn.A1(this.f39131c, this.f39129a, null, i10, z4, true);
    }

    @Override
    public final boolean O() {
        zn znVar = this.f39131c;
        if (znVar.V != null && znVar.x9()) {
            znVar.V.P();
            return true;
        }
        return false;
    }

    @Override
    public final MessageObject U() {
        MessageObject messageObject = this.f39131c.f40666m5;
        MessageObject messageObject2 = this.f39129a;
        if (messageObject == messageObject2) {
            return messageObject2;
        }
        return null;
    }

    @Override
    public final void e(CharSequence charSequence) {
        this.f39131c.V.f1(charSequence, false);
    }

    @Override
    public final boolean g() {
        return false;
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z4, int i11, int i12, boolean z10) {
        zn znVar = this.f39131c;
        if (znVar.f40666m5 != this.f39129a) {
            return;
        }
        MediaController.PhotoEntry photoEntry = this.f39130b;
        if (!photoEntry.isCropped && !photoEntry.isPainted && !photoEntry.isFiltered && videoEditedInfo == null) {
            znVar.V.d0();
        } else {
            znVar.r(photoEntry, videoEditedInfo, z4, i11, 0, z10, 0L);
        }
    }
}
