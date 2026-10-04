package org.telegram.ui;

import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
public final class zl extends ou0 {
    public final MessageObject f43846a;
    public final MediaController.PhotoEntry f43847b;
    public final am f43848c;

    public zl(am amVar, MessageObject messageObject, MediaController.PhotoEntry photoEntry) {
        this.f43848c = amVar;
        this.f43846a = messageObject;
        this.f43847b = photoEntry;
    }

    @Override
    public final yu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        return this.f43848c.f34861a.Q.Da.E(this.f43846a, fileLocation, i10, z10, false);
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        jm jmVar = this.f43848c.f34861a;
        MessageObject messageObject = this.f43846a;
        messageObject.settingAvatar = true;
        MediaController.PhotoEntry photoEntry = this.f43847b;
        if (photoEntry.imagePath == null && !photoEntry.isVideo) {
            TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
            TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
            tL_photos_updateProfilePhoto.f20169id = tL_inputPhoto;
            TLRPC.Photo photo = messageObject.messageOwner.action.photo;
            tL_inputPhoto.f20056id = photo.f20061id;
            tL_inputPhoto.access_hash = photo.access_hash;
            tL_inputPhoto.file_reference = photo.file_reference;
            jmVar.Q.getConnectionsManager().sendRequest(tL_photos_updateProfilePhoto, new ai.v1(29, this, messageObject));
            return;
        }
        yn ynVar = jmVar.Q;
        bj bjVar = new bj(messageObject, 4);
        org.telegram.ui.ActionBar.c5 parentLayout = ynVar.getParentLayout();
        int currentAccount = ynVar.getCurrentAccount();
        org.telegram.ui.Components.y40 y40Var = new org.telegram.ui.Components.y40(0, true, true);
        y40Var.f33041a = ynVar;
        y40Var.t(photoEntry);
        y40Var.f33042b = new fa(currentAccount, bjVar, parentLayout, y40Var);
    }
}
