package org.telegram.ui;

import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
public final class sl extends ou0 {
    public final MessageObject f40537a;
    public final MediaController.PhotoEntry f40538b;
    public final yn f40539c;

    public sl(yn ynVar, MessageObject messageObject, MediaController.PhotoEntry photoEntry) {
        this.f40539c = ynVar;
        this.f40537a = messageObject;
        this.f40538b = photoEntry;
    }

    @Override
    public final yu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        return yn.A1(this.f40539c, this.f40537a, null, i10, z10, true);
    }

    @Override
    public final boolean O() {
        yn ynVar = this.f40539c;
        if (ynVar.W != null && ynVar.w9()) {
            ynVar.W.N();
            return true;
        }
        return false;
    }

    @Override
    public final MessageObject U() {
        MessageObject messageObject = this.f40539c.f43431n5;
        MessageObject messageObject2 = this.f40537a;
        if (messageObject == messageObject2) {
            return messageObject2;
        }
        return null;
    }

    @Override
    public final void e(CharSequence charSequence) {
        this.f40539c.W.e1(charSequence, false);
    }

    @Override
    public final boolean g() {
        return false;
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        yn ynVar = this.f40539c;
        if (ynVar.f43431n5 != this.f40537a) {
            return;
        }
        MediaController.PhotoEntry photoEntry = this.f40538b;
        if (!photoEntry.isCropped && !photoEntry.isPainted && !photoEntry.isFiltered && videoEditedInfo == null) {
            ynVar.W.d0();
        } else {
            ynVar.q(photoEntry, videoEditedInfo, z10, i11, 0, z11, 0L);
        }
    }
}
