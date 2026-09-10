package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class uo extends tu0 {
    public final yo f37301a;

    public uo(yo yoVar) {
        this.f37301a = yoVar;
    }

    @Override
    public final org.telegram.ui.ev0 E(org.telegram.messenger.MessageObject r9, org.telegram.tgnet.TLRPC.FileLocation r10, int r11, boolean r12, boolean r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.uo.E(org.telegram.messenger.MessageObject, org.telegram.tgnet.TLRPC$FileLocation, int, boolean, boolean):org.telegram.ui.ev0");
    }

    @Override
    public final void G() {
        this.f37301a.e.getImageReceiver().setVisible(true, true);
    }

    @Override
    public final boolean M() {
        yo yoVar = this.f37301a;
        long j3 = yoVar.C0;
        if (j3 == 0) {
            return true;
        }
        TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
        tL_photos_updateProfilePhoto.bot = yoVar.getMessagesController().getInputUser(j3);
        tL_photos_updateProfilePhoto.flags |= 2;
        tL_photos_updateProfilePhoto.f17327id = new TLRPC.TL_inputPhotoEmpty();
        yoVar.getConnectionsManager().sendRequest(tL_photos_updateProfilePhoto, new m(this, 2));
        return false;
    }

    @Override
    public final void f(String str, String str2, boolean z10) {
        this.f37301a.f39062s.q(str, str2, z10);
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
