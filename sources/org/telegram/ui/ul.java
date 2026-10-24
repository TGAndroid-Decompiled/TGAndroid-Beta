package org.telegram.ui;

import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
public final class ul extends bu0 {
    public final MessageObject f42447a;
    public final MediaController.PhotoEntry f42448b;
    public final vl f42449c;

    public ul(vl vlVar, MessageObject messageObject, MediaController.PhotoEntry photoEntry) {
        this.f42449c = vlVar;
        this.f42447a = messageObject;
        this.f42448b = photoEntry;
    }

    @Override
    public final lu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        return this.f42449c.f42759a.Q.Sa.E(this.f42447a, fileLocation, i10, z10, false);
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        em emVar = this.f42449c.f42759a;
        MessageObject messageObject = this.f42447a;
        messageObject.settingAvatar = true;
        MediaController.PhotoEntry photoEntry = this.f42448b;
        if (photoEntry.imagePath == null && !photoEntry.isVideo) {
            TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
            TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
            tL_photos_updateProfilePhoto.f20476id = tL_inputPhoto;
            TLRPC.Photo photo = messageObject.messageOwner.action.photo;
            tL_inputPhoto.f20363id = photo.f20368id;
            tL_inputPhoto.access_hash = photo.access_hash;
            tL_inputPhoto.file_reference = photo.file_reference;
            emVar.Q.getConnectionsManager().sendRequest(tL_photos_updateProfilePhoto, new vc(6, this, messageObject));
            return;
        }
        sn snVar = emVar.Q;
        ti tiVar = new ti(messageObject, 5);
        org.telegram.ui.ActionBar.h5 parentLayout = snVar.getParentLayout();
        int currentAccount = snVar.getCurrentAccount();
        org.telegram.ui.Components.c50 c50Var = new org.telegram.ui.Components.c50(0, true, true);
        c50Var.f25185a = snVar;
        c50Var.s(photoEntry);
        c50Var.f25186b = new fa(currentAccount, tiVar, parentLayout, c50Var);
    }
}
