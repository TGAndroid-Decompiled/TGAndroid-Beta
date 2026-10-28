package org.telegram.ui;

import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
public final class rl extends iu0 {
    public final MessageObject f43080a;
    public final MediaController.PhotoEntry f43081b;
    public final wn f43082c;

    public rl(wn wnVar, MessageObject messageObject, MediaController.PhotoEntry photoEntry) {
        this.f43082c = wnVar;
        this.f43080a = messageObject;
        this.f43081b = photoEntry;
    }

    @Override
    public final su0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        return wn.H1(this.f43082c, this.f43080a, null, i10, z10, true);
    }

    @Override
    public final boolean P() {
        wn wnVar = this.f43082c;
        if (wnVar.Y != null && wnVar.I9()) {
            wnVar.Y.L();
            return true;
        }
        return false;
    }

    @Override
    public final MessageObject V() {
        MessageObject messageObject = this.f43082c.F5;
        MessageObject messageObject2 = this.f43080a;
        if (messageObject == messageObject2) {
            return messageObject2;
        }
        return null;
    }

    @Override
    public final void e(CharSequence charSequence) {
        this.f43082c.Y.b1(charSequence, false);
    }

    @Override
    public final boolean g() {
        return false;
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        wn wnVar = this.f43082c;
        if (wnVar.F5 != this.f43080a) {
            return;
        }
        MediaController.PhotoEntry photoEntry = this.f43081b;
        if (!photoEntry.isCropped && !photoEntry.isPainted && !photoEntry.isFiltered && videoEditedInfo == null) {
            wnVar.Y.Z();
        } else {
            wnVar.r(photoEntry, videoEditedInfo, z10, i11, 0, z11, 0L);
        }
    }
}
