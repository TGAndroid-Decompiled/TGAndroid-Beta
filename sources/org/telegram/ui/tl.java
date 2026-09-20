package org.telegram.ui;

import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
public final class tl extends tu0 {
    public final MessageObject f37843a;
    public final MediaController.PhotoEntry f37844b;
    public final zn f37845c;

    public tl(zn znVar, MessageObject messageObject, MediaController.PhotoEntry photoEntry) {
        this.f37845c = znVar;
        this.f37843a = messageObject;
        this.f37844b = photoEntry;
    }

    @Override
    public final dv0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        return zn.A1(this.f37845c, this.f37843a, null, i10, z10, true);
    }

    @Override
    public final boolean O() {
        zn znVar = this.f37845c;
        if (znVar.Y != null && znVar.x9()) {
            znVar.Y.P();
            return true;
        }
        return false;
    }

    @Override
    public final MessageObject U() {
        MessageObject messageObject = this.f37845c.p5;
        MessageObject messageObject2 = this.f37843a;
        if (messageObject == messageObject2) {
            return messageObject2;
        }
        return null;
    }

    @Override
    public final void e(CharSequence charSequence) {
        this.f37845c.Y.e1(charSequence, false);
    }

    @Override
    public final boolean g() {
        return false;
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        zn znVar = this.f37845c;
        if (znVar.p5 != this.f37843a) {
            return;
        }
        MediaController.PhotoEntry photoEntry = this.f37844b;
        if (!photoEntry.isCropped && !photoEntry.isPainted && !photoEntry.isFiltered && videoEditedInfo == null) {
            znVar.Y.d0();
        } else {
            znVar.q(photoEntry, videoEditedInfo, z10, i11, 0, z11, 0L);
        }
    }
}
