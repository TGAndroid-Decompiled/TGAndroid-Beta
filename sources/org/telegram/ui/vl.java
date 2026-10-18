package org.telegram.ui;

import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
public final class vl extends bu0 {
    public final MessageObject f42218a;
    public final MediaController.PhotoEntry f42219b;
    public final wl f42220c;

    public vl(wl wlVar, MessageObject messageObject, MediaController.PhotoEntry photoEntry) {
        this.f42220c = wlVar;
        this.f42218a = messageObject;
        this.f42219b = photoEntry;
    }

    @Override
    public final lu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        return this.f42220c.f42877a.Q.Ga.E(this.f42218a, fileLocation, i10, z10, false);
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        fm fmVar = this.f42220c.f42877a;
        MessageObject messageObject = this.f42218a;
        messageObject.settingAvatar = true;
        MediaController.PhotoEntry photoEntry = this.f42219b;
        if (photoEntry.imagePath == null && !photoEntry.isVideo) {
            TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
            TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
            tL_photos_updateProfilePhoto.f20404id = tL_inputPhoto;
            TLRPC.Photo photo = messageObject.messageOwner.action.photo;
            tL_inputPhoto.f20291id = photo.f20296id;
            tL_inputPhoto.access_hash = photo.access_hash;
            tL_inputPhoto.file_reference = photo.file_reference;
            fmVar.Q.getConnectionsManager().sendRequest(tL_photos_updateProfilePhoto, new xc(6, this, messageObject));
            return;
        }
        sn snVar = fmVar.Q;
        vi viVar = new vi(messageObject, 5);
        org.telegram.ui.ActionBar.d5 parentLayout = snVar.getParentLayout();
        int currentAccount = snVar.getCurrentAccount();
        org.telegram.ui.Components.e50 e50Var = new org.telegram.ui.Components.e50(0, true, true);
        e50Var.f25805a = snVar;
        e50Var.s(photoEntry);
        e50Var.f25806b = new ha(currentAccount, viVar, parentLayout, e50Var);
    }
}
