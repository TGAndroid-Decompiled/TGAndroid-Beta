package org.telegram.ui;

import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
public final class vl extends gu0 {
    public final MessageObject f44857a;
    public final MediaController.PhotoEntry f44858b;
    public final wl f44859c;

    public vl(wl wlVar, MessageObject messageObject, MediaController.PhotoEntry photoEntry) {
        this.f44859c = wlVar;
        this.f44857a = messageObject;
        this.f44858b = photoEntry;
    }

    @Override
    public final qu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        return this.f44859c.f45518a.Q.Sa.E(this.f44857a, fileLocation, i10, z10, false);
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        fm fmVar = this.f44859c.f45518a;
        MessageObject messageObject = this.f44857a;
        messageObject.settingAvatar = true;
        MediaController.PhotoEntry photoEntry = this.f44858b;
        if (photoEntry.imagePath == null && !photoEntry.isVideo) {
            TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
            TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
            tL_photos_updateProfilePhoto.f22161id = tL_inputPhoto;
            TLRPC.Photo photo = messageObject.messageOwner.action.photo;
            tL_inputPhoto.f22046id = photo.f22051id;
            tL_inputPhoto.access_hash = photo.access_hash;
            tL_inputPhoto.file_reference = photo.file_reference;
            fmVar.Q.getConnectionsManager().sendRequest(tL_photos_updateProfilePhoto, new z7(7, this, messageObject));
            return;
        }
        un unVar = fmVar.Q;
        ui uiVar = new ui(messageObject, 5);
        org.telegram.ui.ActionBar.j5 parentLayout = unVar.getParentLayout();
        int currentAccount = unVar.getCurrentAccount();
        org.telegram.ui.Components.g50 g50Var = new org.telegram.ui.Components.g50(0, true, true);
        g50Var.f28421a = unVar;
        g50Var.s(photoEntry);
        g50Var.f28422b = new ag.k0(currentAccount, uiVar, parentLayout, g50Var);
    }
}
