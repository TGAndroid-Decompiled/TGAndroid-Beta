package org.telegram.ui;

import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
public final class sl extends ou0 {
    public final MessageObject f40518a;
    public final MediaController.PhotoEntry f40519b;
    public final yn f40520c;

    public sl(yn ynVar, MessageObject messageObject, MediaController.PhotoEntry photoEntry) {
        this.f40520c = ynVar;
        this.f40518a = messageObject;
        this.f40519b = photoEntry;
    }

    @Override
    public final yu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        return yn.A1(this.f40520c, this.f40518a, null, i10, z10, true);
    }

    @Override
    public final boolean O() {
        yn ynVar = this.f40520c;
        if (ynVar.W != null && ynVar.w9()) {
            ynVar.W.N();
            return true;
        }
        return false;
    }

    @Override
    public final MessageObject U() {
        MessageObject messageObject = this.f40520c.f43430n5;
        MessageObject messageObject2 = this.f40518a;
        if (messageObject == messageObject2) {
            return messageObject2;
        }
        return null;
    }

    @Override
    public final void e(CharSequence charSequence) {
        this.f40520c.W.e1(charSequence, false);
    }

    @Override
    public final boolean g() {
        return false;
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        yn ynVar = this.f40520c;
        if (ynVar.f43430n5 != this.f40518a) {
            return;
        }
        MediaController.PhotoEntry photoEntry = this.f40519b;
        if (!photoEntry.isCropped && !photoEntry.isPainted && !photoEntry.isFiltered && videoEditedInfo == null) {
            ynVar.W.d0();
        } else {
            ynVar.q(photoEntry, videoEditedInfo, z10, i11, 0, z11, 0L);
        }
    }
}
