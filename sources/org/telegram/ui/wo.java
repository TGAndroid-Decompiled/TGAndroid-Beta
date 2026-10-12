package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class wo extends av0 {
    public final zo f41625a;

    public wo(zo zoVar) {
        this.f41625a = zoVar;
    }

    @Override
    public final org.telegram.ui.kv0 E(org.telegram.messenger.MessageObject r8, org.telegram.tgnet.TLRPC.FileLocation r9, int r10, boolean r11, boolean r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wo.E(org.telegram.messenger.MessageObject, org.telegram.tgnet.TLRPC$FileLocation, int, boolean, boolean):org.telegram.ui.kv0");
    }

    @Override
    public final void G() {
        this.f41625a.e.getImageReceiver().setVisible(true, true);
    }

    @Override
    public final boolean M() {
        zo zoVar = this.f41625a;
        long j10 = zoVar.C0;
        if (j10 == 0) {
            return true;
        }
        TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
        tL_photos_updateProfilePhoto.bot = zoVar.getMessagesController().getInputUser(j10);
        tL_photos_updateProfilePhoto.flags |= 2;
        tL_photos_updateProfilePhoto.f19348id = new TLRPC.TL_inputPhotoEmpty();
        zoVar.getConnectionsManager().sendRequest(tL_photos_updateProfilePhoto, new m(this, 2));
        return false;
    }

    @Override
    public final void f(String str, String str2, boolean z10) {
        this.f41625a.f42677s.p(str, str2, z10);
    }

    @Override
    public final boolean t() {
        return false;
    }

    @Override
    public final int y() {
        return 1;
    }
}
