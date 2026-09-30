package org.telegram.ui;

import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
public final class sl extends lu0 {
    public final MessageObject f37915a;
    public final MediaController.PhotoEntry f37916b;
    public final wn f37917c;

    public sl(wn wnVar, MessageObject messageObject, MediaController.PhotoEntry photoEntry) {
        this.f37917c = wnVar;
        this.f37915a = messageObject;
        this.f37916b = photoEntry;
    }

    @Override
    public final vu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        return wn.A1(this.f37917c, this.f37915a, null, i10, z10, true);
    }

    @Override
    public final boolean O() {
        wn wnVar = this.f37917c;
        if (wnVar.Y != null && wnVar.x9()) {
            wnVar.Y.P();
            return true;
        }
        return false;
    }

    @Override
    public final MessageObject U() {
        MessageObject messageObject = this.f37917c.p5;
        MessageObject messageObject2 = this.f37915a;
        if (messageObject == messageObject2) {
            return messageObject2;
        }
        return null;
    }

    @Override
    public final void e(CharSequence charSequence) {
        this.f37917c.Y.f1(charSequence, false);
    }

    @Override
    public final boolean g() {
        return false;
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        wn wnVar = this.f37917c;
        if (wnVar.p5 != this.f37915a) {
            return;
        }
        MediaController.PhotoEntry photoEntry = this.f37916b;
        if (!photoEntry.isCropped && !photoEntry.isPainted && !photoEntry.isFiltered && videoEditedInfo == null) {
            wnVar.Y.d0();
        } else {
            wnVar.q(photoEntry, videoEditedInfo, z10, i11, 0, z11, 0L);
        }
    }
}
