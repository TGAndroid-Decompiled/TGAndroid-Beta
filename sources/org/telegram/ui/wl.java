package org.telegram.ui;

import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
public final class wl extends tu0 {
    public final MessageObject f39257a;
    public final MediaController.PhotoEntry f39258b;
    public final bo f39259c;

    public wl(bo boVar, MessageObject messageObject, MediaController.PhotoEntry photoEntry) {
        this.f39259c = boVar;
        this.f39257a = messageObject;
        this.f39258b = photoEntry;
    }

    @Override
    public final dv0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        return bo.A1(this.f39259c, this.f39257a, null, i10, z10, true);
    }

    @Override
    public final boolean O() {
        bo boVar = this.f39259c;
        if (boVar.Y != null && boVar.x9()) {
            boVar.Y.P();
            return true;
        }
        return false;
    }

    @Override
    public final MessageObject U() {
        MessageObject messageObject = this.f39259c.p5;
        MessageObject messageObject2 = this.f39257a;
        if (messageObject == messageObject2) {
            return messageObject2;
        }
        return null;
    }

    @Override
    public final void e(CharSequence charSequence) {
        this.f39259c.Y.e1(charSequence, false);
    }

    @Override
    public final boolean g() {
        return false;
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        bo boVar = this.f39259c;
        if (boVar.p5 != this.f39257a) {
            return;
        }
        MediaController.PhotoEntry photoEntry = this.f39258b;
        if (!photoEntry.isCropped && !photoEntry.isPainted && !photoEntry.isFiltered && videoEditedInfo == null) {
            boVar.Y.d0();
        } else {
            boVar.q(photoEntry, videoEditedInfo, z10, i11, 0, z11, 0L);
        }
    }
}
