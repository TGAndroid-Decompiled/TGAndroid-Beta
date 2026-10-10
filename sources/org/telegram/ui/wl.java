package org.telegram.ui;

import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
public final class wl extends uu0 {
    public final MessageObject f43747a;
    public final MediaController.PhotoEntry f43748b;
    public final zn f43749c;

    public wl(zn znVar, MessageObject messageObject, MediaController.PhotoEntry photoEntry) {
        this.f43749c = znVar;
        this.f43747a = messageObject;
        this.f43748b = photoEntry;
    }

    @Override
    public final ev0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        return zn.E1(this.f43749c, this.f43747a, null, i10, z10, true);
    }

    @Override
    public final boolean O() {
        zn znVar = this.f43749c;
        if (znVar.Y != null && znVar.C9()) {
            znVar.Y.N();
            return true;
        }
        return false;
    }

    @Override
    public final MessageObject U() {
        MessageObject messageObject = this.f43749c.p5;
        MessageObject messageObject2 = this.f43747a;
        if (messageObject == messageObject2) {
            return messageObject2;
        }
        return null;
    }

    @Override
    public final void e(CharSequence charSequence) {
        this.f43749c.Y.d1(charSequence, false);
    }

    @Override
    public final boolean g() {
        return false;
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        zn znVar = this.f43749c;
        if (znVar.p5 != this.f43747a) {
            return;
        }
        MediaController.PhotoEntry photoEntry = this.f43748b;
        if (!photoEntry.isCropped && !photoEntry.isPainted && !photoEntry.isFiltered && videoEditedInfo == null) {
            znVar.Y.b0();
        } else {
            znVar.r(photoEntry, videoEditedInfo, z10, i11, 0, z11, 0L);
        }
    }
}
