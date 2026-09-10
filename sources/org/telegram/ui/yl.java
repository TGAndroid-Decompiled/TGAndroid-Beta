package org.telegram.ui;

import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
public final class yl extends tu0 {
    public final MessageObject f39023a;
    public final MediaController.PhotoEntry f39024b;
    public final eo f39025c;

    public yl(eo eoVar, MessageObject messageObject, MediaController.PhotoEntry photoEntry) {
        this.f39025c = eoVar;
        this.f39023a = messageObject;
        this.f39024b = photoEntry;
    }

    @Override
    public final ev0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        return eo.A1(this.f39025c, this.f39023a, null, i10, z10, true);
    }

    @Override
    public final boolean O() {
        eo eoVar = this.f39025c;
        if (eoVar.Y != null && eoVar.x9()) {
            eoVar.Y.P();
            return true;
        }
        return false;
    }

    @Override
    public final MessageObject U() {
        MessageObject messageObject = this.f39025c.p5;
        MessageObject messageObject2 = this.f39023a;
        if (messageObject == messageObject2) {
            return messageObject2;
        }
        return null;
    }

    @Override
    public final void e(CharSequence charSequence) {
        this.f39025c.Y.f1(charSequence, false);
    }

    @Override
    public final boolean g() {
        return false;
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        eo eoVar = this.f39025c;
        if (eoVar.p5 != this.f39023a) {
            return;
        }
        MediaController.PhotoEntry photoEntry = this.f39024b;
        if (!photoEntry.isCropped && !photoEntry.isPainted && !photoEntry.isFiltered && videoEditedInfo == null) {
            eoVar.Y.d0();
        } else {
            eoVar.q(photoEntry, videoEditedInfo, z10, i11, 0, z11, 0L);
        }
    }
}
