package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class uo extends su0 {
    public final xo f41193a;

    public uo(xo xoVar) {
        this.f41193a = xoVar;
    }

    @Override
    public final org.telegram.ui.cv0 E(org.telegram.messenger.MessageObject r9, org.telegram.tgnet.TLRPC.FileLocation r10, int r11, boolean r12, boolean r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.uo.E(org.telegram.messenger.MessageObject, org.telegram.tgnet.TLRPC$FileLocation, int, boolean, boolean):org.telegram.ui.cv0");
    }

    @Override
    public final void G() {
        this.f41193a.f42774e.getImageReceiver().setVisible(true, true);
    }

    @Override
    public final boolean M() {
        xo xoVar = this.f41193a;
        long j3 = xoVar.C0;
        if (j3 == 0) {
            return true;
        }
        TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
        tL_photos_updateProfilePhoto.bot = xoVar.getMessagesController().getInputUser(j3);
        tL_photos_updateProfilePhoto.flags |= 2;
        tL_photos_updateProfilePhoto.f20001id = new TLRPC.TL_inputPhotoEmpty();
        xoVar.getConnectionsManager().sendRequest(tL_photos_updateProfilePhoto, new m(this, 2));
        return false;
    }

    @Override
    public final void f(String str, String str2, boolean z10) {
        this.f41193a.f42791s.q(str, str2, z10);
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
