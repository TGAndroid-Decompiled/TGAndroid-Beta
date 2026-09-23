package org.telegram.ui;

import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
public final class tl extends mu0 {
    public final MessageObject f37709a;
    public final MediaController.PhotoEntry f37710b;
    public final xn f37711c;

    public tl(xn xnVar, MessageObject messageObject, MediaController.PhotoEntry photoEntry) {
        this.f37711c = xnVar;
        this.f37709a = messageObject;
        this.f37710b = photoEntry;
    }

    @Override
    public final wu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        return xn.A1(this.f37711c, this.f37709a, null, i10, z10, true);
    }

    @Override
    public final boolean O() {
        xn xnVar = this.f37711c;
        if (xnVar.Y != null && xnVar.x9()) {
            xnVar.Y.Q();
            return true;
        }
        return false;
    }

    @Override
    public final MessageObject U() {
        MessageObject messageObject = this.f37711c.p5;
        MessageObject messageObject2 = this.f37709a;
        if (messageObject == messageObject2) {
            return messageObject2;
        }
        return null;
    }

    @Override
    public final void e(CharSequence charSequence) {
        this.f37711c.Y.g1(charSequence, false);
    }

    @Override
    public final boolean g() {
        return false;
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        xn xnVar = this.f37711c;
        if (xnVar.p5 != this.f37709a) {
            return;
        }
        MediaController.PhotoEntry photoEntry = this.f37710b;
        if (!photoEntry.isCropped && !photoEntry.isPainted && !photoEntry.isFiltered && videoEditedInfo == null) {
            xnVar.Y.e0();
        } else {
            xnVar.q(photoEntry, videoEditedInfo, z10, i11, 0, z11, 0L);
        }
    }
}
