package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class so extends tu0 {
    public final wo f37417a;

    public so(wo woVar) {
        this.f37417a = woVar;
    }

    @Override
    public final org.telegram.ui.dv0 E(org.telegram.messenger.MessageObject r9, org.telegram.tgnet.TLRPC.FileLocation r10, int r11, boolean r12, boolean r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.so.E(org.telegram.messenger.MessageObject, org.telegram.tgnet.TLRPC$FileLocation, int, boolean, boolean):org.telegram.ui.dv0");
    }

    @Override
    public final void G() {
        this.f37417a.e.getImageReceiver().setVisible(true, true);
    }

    @Override
    public final boolean M() {
        wo woVar = this.f37417a;
        long j3 = woVar.C0;
        if (j3 == 0) {
            return true;
        }
        TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
        tL_photos_updateProfilePhoto.bot = woVar.getMessagesController().getInputUser(j3);
        tL_photos_updateProfilePhoto.flags |= 2;
        tL_photos_updateProfilePhoto.f18244id = new TLRPC.TL_inputPhotoEmpty();
        woVar.getConnectionsManager().sendRequest(tL_photos_updateProfilePhoto, new m(this, 2));
        return false;
    }

    @Override
    public final void f(String str, String str2, boolean z10) {
        this.f37417a.f39292s.q(str, str2, z10);
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
