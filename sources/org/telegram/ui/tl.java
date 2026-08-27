package org.telegram.ui;

import java.io.FileNotFoundException;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;

public final class tl extends st0 {

    public final MessageObject f42960a;

    public final MediaController.PhotoEntry f42961b;

    public final ul f42962c;

    public tl(ul ulVar, MessageObject messageObject, MediaController.PhotoEntry photoEntry) {
        this.f42962c = ulVar;
        this.f42960a = messageObject;
        this.f42961b = photoEntry;
    }

    @Override
    public final cu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        return this.f42962c.f43247a.M.Ba.E(this.f42960a, fileLocation, i10, z10, false);
    }

    @Override
    public final void o(int i10, VideoEditedInfo videoEditedInfo, boolean z10, int i11, int i12, boolean z11) throws FileNotFoundException {
        dm dmVar = this.f42962c.f43247a;
        MessageObject messageObject = this.f42960a;
        messageObject.settingAvatar = true;
        MediaController.PhotoEntry photoEntry = this.f42961b;
        if (photoEntry.imagePath != null || photoEntry.isVideo) {
            rn rnVar = dmVar.M;
            ti tiVar = new ti(messageObject, 4);
            org.telegram.ui.ActionBar.b5 parentLayout = rnVar.getParentLayout();
            int currentAccount = rnVar.getCurrentAccount();
            org.telegram.ui.Components.j40 j40Var = new org.telegram.ui.Components.j40(0, true, true);
            j40Var.f29569a = rnVar;
            j40Var.t(photoEntry);
            j40Var.f29570b = new cg.a0(currentAccount, tiVar, parentLayout, j40Var);
            return;
        }
        TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
        TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
        tL_photos_updateProfilePhoto.f22512id = tL_inputPhoto;
        TLRPC.Photo photo = messageObject.messageOwner.action.photo;
        tL_inputPhoto.f22399id = photo.f22404id;
        tL_inputPhoto.access_hash = photo.access_hash;
        tL_inputPhoto.file_reference = photo.file_reference;
        dmVar.M.getConnectionsManager().sendRequest(tL_photos_updateProfilePhoto, new gg(3, this, messageObject));
    }
}
