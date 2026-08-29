package org.telegram.ui;

import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
public final class ul extends pt0 {
    public final MessageObject f43282a;
    public final MediaController.PhotoEntry f43283b;
    public final vl f43284c;

    public ul(vl vlVar, MessageObject messageObject, MediaController.PhotoEntry photoEntry) {
        this.f43284c = vlVar;
        this.f43282a = messageObject;
        this.f43283b = photoEntry;
    }

    @Override
    public final zt0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        return this.f43284c.f43618a.M.Ba.E(this.f43282a, fileLocation, i10, z10, false);
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        em emVar = this.f43284c.f43618a;
        MessageObject messageObject = this.f43282a;
        messageObject.settingAvatar = true;
        MediaController.PhotoEntry photoEntry = this.f43283b;
        if (photoEntry.imagePath == null && !photoEntry.isVideo) {
            TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
            TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
            tL_photos_updateProfilePhoto.f22524id = tL_inputPhoto;
            TLRPC.Photo photo = messageObject.messageOwner.action.photo;
            tL_inputPhoto.f22411id = photo.f22416id;
            tL_inputPhoto.access_hash = photo.access_hash;
            tL_inputPhoto.file_reference = photo.file_reference;
            emVar.M.getConnectionsManager().sendRequest(tL_photos_updateProfilePhoto, new zg(2, this, messageObject));
            return;
        }
        tn tnVar = emVar.M;
        ui uiVar = new ui(messageObject, 4);
        org.telegram.ui.ActionBar.b5 parentLayout = tnVar.getParentLayout();
        int currentAccount = tnVar.getCurrentAccount();
        org.telegram.ui.Components.s40 s40Var = new org.telegram.ui.Components.s40(0, true, true);
        s40Var.f32469a = tnVar;
        s40Var.t(photoEntry);
        s40Var.f32470b = new eg.b0(currentAccount, uiVar, parentLayout, s40Var);
    }
}
