package org.telegram.ui;

import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
public final class zl extends lu0 {
    public final MessageObject f40532a;
    public final MediaController.PhotoEntry f40533b;
    public final am f40534c;

    public zl(am amVar, MessageObject messageObject, MediaController.PhotoEntry photoEntry) {
        this.f40534c = amVar;
        this.f40532a = messageObject;
        this.f40533b = photoEntry;
    }

    @Override
    public final vu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        return this.f40534c.f32198a.Q.Fa.E(this.f40532a, fileLocation, i10, z10, false);
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        jm jmVar = this.f40534c.f32198a;
        MessageObject messageObject = this.f40532a;
        messageObject.settingAvatar = true;
        MediaController.PhotoEntry photoEntry = this.f40533b;
        if (photoEntry.imagePath == null && !photoEntry.isVideo) {
            TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
            TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
            tL_photos_updateProfilePhoto.f18468id = tL_inputPhoto;
            TLRPC.Photo photo = messageObject.messageOwner.action.photo;
            tL_inputPhoto.f18355id = photo.f18360id;
            tL_inputPhoto.access_hash = photo.access_hash;
            tL_inputPhoto.file_reference = photo.file_reference;
            jmVar.Q.getConnectionsManager().sendRequest(tL_photos_updateProfilePhoto, new ai.v1(29, this, messageObject));
            return;
        }
        wn wnVar = jmVar.Q;
        aj ajVar = new aj(messageObject, 4);
        org.telegram.ui.ActionBar.b5 parentLayout = wnVar.getParentLayout();
        int currentAccount = wnVar.getCurrentAccount();
        org.telegram.ui.Components.v40 v40Var = new org.telegram.ui.Components.v40(0, true, true);
        v40Var.f28992a = wnVar;
        v40Var.t(photoEntry);
        v40Var.f28993b = new da(currentAccount, ajVar, parentLayout, v40Var);
    }
}
