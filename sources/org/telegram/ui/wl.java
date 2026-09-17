package org.telegram.ui;

import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
public final class wl extends vu0 {
    public final MessageObject f39071a;
    public final MediaController.PhotoEntry f39072b;
    public final bo f39073c;

    public wl(bo boVar, MessageObject messageObject, MediaController.PhotoEntry photoEntry) {
        this.f39073c = boVar;
        this.f39071a = messageObject;
        this.f39072b = photoEntry;
    }

    @Override
    public final fv0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        return bo.A1(this.f39073c, this.f39071a, null, i10, z10, true);
    }

    @Override
    public final boolean O() {
        bo boVar = this.f39073c;
        if (boVar.Y != null && boVar.x9()) {
            boVar.Y.P();
            return true;
        }
        return false;
    }

    @Override
    public final MessageObject U() {
        MessageObject messageObject = this.f39073c.p5;
        MessageObject messageObject2 = this.f39071a;
        if (messageObject == messageObject2) {
            return messageObject2;
        }
        return null;
    }

    @Override
    public final void e(CharSequence charSequence) {
        this.f39073c.Y.e1(charSequence, false);
    }

    @Override
    public final boolean g() {
        return false;
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        bo boVar = this.f39073c;
        if (boVar.p5 != this.f39071a) {
            return;
        }
        MediaController.PhotoEntry photoEntry = this.f39072b;
        if (!photoEntry.isCropped && !photoEntry.isPainted && !photoEntry.isFiltered && videoEditedInfo == null) {
            boVar.Y.d0();
        } else {
            boVar.q(photoEntry, videoEditedInfo, z10, i11, 0, z11, 0L);
        }
    }
}
