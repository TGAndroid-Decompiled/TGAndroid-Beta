package org.telegram.ui;

import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
public final class xl extends iu0 {
    public final MessageObject f45732a;
    public final MediaController.PhotoEntry f45733b;
    public final yl f45734c;

    public xl(yl ylVar, MessageObject messageObject, MediaController.PhotoEntry photoEntry) {
        this.f45734c = ylVar;
        this.f45732a = messageObject;
        this.f45733b = photoEntry;
    }

    @Override
    public final su0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        return this.f45734c.f46046a.Q.Wa.E(this.f45732a, fileLocation, i10, z10, false);
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        hm hmVar = this.f45734c.f46046a;
        MessageObject messageObject = this.f45732a;
        messageObject.settingAvatar = true;
        MediaController.PhotoEntry photoEntry = this.f45733b;
        if (photoEntry.imagePath == null && !photoEntry.isVideo) {
            TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
            TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
            tL_photos_updateProfilePhoto.f22162id = tL_inputPhoto;
            TLRPC.Photo photo = messageObject.messageOwner.action.photo;
            tL_inputPhoto.f22047id = photo.f22052id;
            tL_inputPhoto.access_hash = photo.access_hash;
            tL_inputPhoto.file_reference = photo.file_reference;
            hmVar.Q.getConnectionsManager().sendRequest(tL_photos_updateProfilePhoto, new z7(7, this, messageObject));
            return;
        }
        wn wnVar = hmVar.Q;
        xi xiVar = new xi(messageObject, 5);
        org.telegram.ui.ActionBar.j5 parentLayout = wnVar.getParentLayout();
        int currentAccount = wnVar.getCurrentAccount();
        org.telegram.ui.Components.g50 g50Var = new org.telegram.ui.Components.g50(0, true, true);
        g50Var.f28388a = wnVar;
        g50Var.s(photoEntry);
        g50Var.f28389b = new ag.k0(currentAccount, xiVar, parentLayout, g50Var);
    }
}
