package org.telegram.ui;

import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
public final class tl extends ou0 {
    public final MessageObject f37861a;
    public final MediaController.PhotoEntry f37862b;
    public final xn f37863c;

    public tl(xn xnVar, MessageObject messageObject, MediaController.PhotoEntry photoEntry) {
        this.f37863c = xnVar;
        this.f37861a = messageObject;
        this.f37862b = photoEntry;
    }

    @Override
    public final yu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        return xn.A1(this.f37863c, this.f37861a, null, i10, z10, true);
    }

    @Override
    public final boolean O() {
        xn xnVar = this.f37863c;
        if (xnVar.Y != null && xnVar.x9()) {
            xnVar.Y.P();
            return true;
        }
        return false;
    }

    @Override
    public final MessageObject U() {
        MessageObject messageObject = this.f37863c.p5;
        MessageObject messageObject2 = this.f37861a;
        if (messageObject == messageObject2) {
            return messageObject2;
        }
        return null;
    }

    @Override
    public final void e(CharSequence charSequence) {
        this.f37863c.Y.e1(charSequence, false);
    }

    @Override
    public final boolean g() {
        return false;
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        xn xnVar = this.f37863c;
        if (xnVar.p5 != this.f37861a) {
            return;
        }
        MediaController.PhotoEntry photoEntry = this.f37862b;
        if (!photoEntry.isCropped && !photoEntry.isPainted && !photoEntry.isFiltered && videoEditedInfo == null) {
            xnVar.Y.d0();
        } else {
            xnVar.q(photoEntry, videoEditedInfo, z10, i11, 0, z11, 0L);
        }
    }
}
