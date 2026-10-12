package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class uo extends wu0 {
    public final xo f42544a;

    public uo(xo xoVar) {
        this.f42544a = xoVar;
    }

    @Override
    public final org.telegram.ui.gv0 E(org.telegram.messenger.MessageObject r8, org.telegram.tgnet.TLRPC.FileLocation r9, int r10, boolean r11, boolean r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.uo.E(org.telegram.messenger.MessageObject, org.telegram.tgnet.TLRPC$FileLocation, int, boolean, boolean):org.telegram.ui.gv0");
    }

    @Override
    public final void G() {
        this.f42544a.f44059e.getImageReceiver().setVisible(true, true);
    }

    @Override
    public final boolean M() {
        xo xoVar = this.f42544a;
        long j3 = xoVar.C0;
        if (j3 == 0) {
            return true;
        }
        TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
        tL_photos_updateProfilePhoto.bot = xoVar.getMessagesController().getInputUser(j3);
        tL_photos_updateProfilePhoto.flags |= 2;
        tL_photos_updateProfilePhoto.f19935id = new TLRPC.TL_inputPhotoEmpty();
        xoVar.getConnectionsManager().sendRequest(tL_photos_updateProfilePhoto, new m(this, 2));
        return false;
    }

    @Override
    public final void f(String str, String str2, boolean z10) {
        this.f42544a.f44076s.p(str, str2, z10);
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
