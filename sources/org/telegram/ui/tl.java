package org.telegram.ui;

import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
public final class tl extends zt0 {
    public final MessageObject f41699a;
    public final MediaController.PhotoEntry f41700b;
    public final ul f41701c;

    public tl(ul ulVar, MessageObject messageObject, MediaController.PhotoEntry photoEntry) {
        this.f41701c = ulVar;
        this.f41699a = messageObject;
        this.f41700b = photoEntry;
    }

    @Override
    public final ju0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        return this.f41701c.f42015a.Q.Ga.E(this.f41699a, fileLocation, i10, z10, false);
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) {
        dm dmVar = this.f41701c.f42015a;
        MessageObject messageObject = this.f41699a;
        messageObject.settingAvatar = true;
        MediaController.PhotoEntry photoEntry = this.f41700b;
        if (photoEntry.imagePath == null && !photoEntry.isVideo) {
            TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
            TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
            tL_photos_updateProfilePhoto.f20412id = tL_inputPhoto;
            TLRPC.Photo photo = messageObject.messageOwner.action.photo;
            tL_inputPhoto.f20299id = photo.f20304id;
            tL_inputPhoto.access_hash = photo.access_hash;
            tL_inputPhoto.file_reference = photo.file_reference;
            dmVar.Q.getConnectionsManager().sendRequest(tL_photos_updateProfilePhoto, new vc(6, this, messageObject));
            return;
        }
        qn qnVar = dmVar.Q;
        ti tiVar = new ti(messageObject, 5);
        org.telegram.ui.ActionBar.d5 parentLayout = qnVar.getParentLayout();
        int currentAccount = qnVar.getCurrentAccount();
        org.telegram.ui.Components.e50 e50Var = new org.telegram.ui.Components.e50(0, true, true);
        e50Var.f25724a = qnVar;
        e50Var.s(photoEntry);
        e50Var.f25725b = new fa(currentAccount, tiVar, parentLayout, e50Var);
    }
}
