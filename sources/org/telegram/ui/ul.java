package org.telegram.ui;

import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
public final class ul extends cu0 {
    public final MessageObject f42469a;
    public final MediaController.PhotoEntry f42470b;
    public final vl f42471c;

    public ul(vl vlVar, MessageObject messageObject, MediaController.PhotoEntry photoEntry) {
        this.f42471c = vlVar;
        this.f42469a = messageObject;
        this.f42470b = photoEntry;
    }

    @Override
    public final mu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        return this.f42471c.f42787a.Q.Sa.E(this.f42469a, fileLocation, i10, z10, false);
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        em emVar = this.f42471c.f42787a;
        MessageObject messageObject = this.f42469a;
        messageObject.settingAvatar = true;
        MediaController.PhotoEntry photoEntry = this.f42470b;
        if (photoEntry.imagePath == null && !photoEntry.isVideo) {
            TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
            TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
            tL_photos_updateProfilePhoto.f20475id = tL_inputPhoto;
            TLRPC.Photo photo = messageObject.messageOwner.action.photo;
            tL_inputPhoto.f20362id = photo.f20367id;
            tL_inputPhoto.access_hash = photo.access_hash;
            tL_inputPhoto.file_reference = photo.file_reference;
            emVar.Q.getConnectionsManager().sendRequest(tL_photos_updateProfilePhoto, new vc(6, this, messageObject));
            return;
        }
        sn snVar = emVar.Q;
        ti tiVar = new ti(messageObject, 5);
        org.telegram.ui.ActionBar.h5 parentLayout = snVar.getParentLayout();
        int currentAccount = snVar.getCurrentAccount();
        org.telegram.ui.Components.e50 e50Var = new org.telegram.ui.Components.e50(0, true, true);
        e50Var.f25852a = snVar;
        e50Var.s(photoEntry);
        e50Var.f25853b = new fa(currentAccount, tiVar, parentLayout, e50Var);
    }
}
