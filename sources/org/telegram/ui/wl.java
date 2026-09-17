package org.telegram.ui;

import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
public final class wl extends su0 {
    public final MessageObject f42458a;
    public final MediaController.PhotoEntry f42459b;
    public final co f42460c;

    public wl(co coVar, MessageObject messageObject, MediaController.PhotoEntry photoEntry) {
        this.f42460c = coVar;
        this.f42458a = messageObject;
        this.f42459b = photoEntry;
    }

    @Override
    public final cv0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        return co.A1(this.f42460c, this.f42458a, null, i10, z10, true);
    }

    @Override
    public final boolean O() {
        co coVar = this.f42460c;
        if (coVar.Y != null && coVar.x9()) {
            coVar.Y.P();
            return true;
        }
        return false;
    }

    @Override
    public final MessageObject U() {
        MessageObject messageObject = this.f42460c.p5;
        MessageObject messageObject2 = this.f42458a;
        if (messageObject == messageObject2) {
            return messageObject2;
        }
        return null;
    }

    @Override
    public final void e(CharSequence charSequence) {
        this.f42460c.Y.f1(charSequence, false);
    }

    @Override
    public final boolean g() {
        return false;
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        co coVar = this.f42460c;
        if (coVar.p5 != this.f42458a) {
            return;
        }
        MediaController.PhotoEntry photoEntry = this.f42459b;
        if (!photoEntry.isCropped && !photoEntry.isPainted && !photoEntry.isFiltered && videoEditedInfo == null) {
            coVar.Y.d0();
        } else {
            coVar.q(photoEntry, videoEditedInfo, z10, i11, 0, z11, 0L);
        }
    }
}
