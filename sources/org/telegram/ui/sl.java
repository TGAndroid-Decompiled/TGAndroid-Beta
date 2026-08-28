package org.telegram.ui;

import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
public final class sl extends rt0 {
    public final MessageObject f42714a;
    public final MediaController.PhotoEntry f42715b;
    public final tl f42716c;

    public sl(tl tlVar, MessageObject messageObject, MediaController.PhotoEntry photoEntry) {
        this.f42716c = tlVar;
        this.f42714a = messageObject;
        this.f42715b = photoEntry;
    }

    @Override
    public final bu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i9, boolean z10, boolean z11) {
        return this.f42716c.f43027a.M.Ba.E(this.f42714a, fileLocation, i9, z10, false);
    }

    @Override
    public final void o(int i9, VideoEditedInfo videoEditedInfo, boolean z10, int i10, int i11, boolean z11) {
        bm bmVar = this.f42716c.f43027a;
        MessageObject messageObject = this.f42714a;
        messageObject.settingAvatar = true;
        MediaController.PhotoEntry photoEntry = this.f42715b;
        if (photoEntry.imagePath == null && !photoEntry.isVideo) {
            TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
            TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
            tL_photos_updateProfilePhoto.f22512id = tL_inputPhoto;
            TLRPC.Photo photo = messageObject.messageOwner.action.photo;
            tL_inputPhoto.f22399id = photo.f22404id;
            tL_inputPhoto.access_hash = photo.access_hash;
            tL_inputPhoto.file_reference = photo.file_reference;
            bmVar.M.getConnectionsManager().sendRequest(tL_photos_updateProfilePhoto, new rc(6, this, messageObject));
            return;
        }
        qn qnVar = bmVar.M;
        ri riVar = new ri(messageObject, 4);
        org.telegram.ui.ActionBar.b5 parentLayout = qnVar.getParentLayout();
        int currentAccount = qnVar.getCurrentAccount();
        org.telegram.ui.Components.e40 e40Var = new org.telegram.ui.Components.e40(0, true, true);
        e40Var.f27909a = qnVar;
        e40Var.t(photoEntry);
        e40Var.f27910b = new bg.d0(currentAccount, riVar, parentLayout, e40Var);
    }
}
