package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class qo extends tu0 {
    public final uo f36864a;

    public qo(uo uoVar) {
        this.f36864a = uoVar;
    }

    @Override
    public final org.telegram.ui.dv0 E(org.telegram.messenger.MessageObject r9, org.telegram.tgnet.TLRPC.FileLocation r10, int r11, boolean r12, boolean r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qo.E(org.telegram.messenger.MessageObject, org.telegram.tgnet.TLRPC$FileLocation, int, boolean, boolean):org.telegram.ui.dv0");
    }

    @Override
    public final void G() {
        this.f36864a.e.getImageReceiver().setVisible(true, true);
    }

    @Override
    public final boolean M() {
        uo uoVar = this.f36864a;
        long j3 = uoVar.C0;
        if (j3 == 0) {
            return true;
        }
        TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
        tL_photos_updateProfilePhoto.bot = uoVar.getMessagesController().getInputUser(j3);
        tL_photos_updateProfilePhoto.flags |= 2;
        tL_photos_updateProfilePhoto.f18428id = new TLRPC.TL_inputPhotoEmpty();
        uoVar.getConnectionsManager().sendRequest(tL_photos_updateProfilePhoto, new m(this, 2));
        return false;
    }

    @Override
    public final void f(String str, String str2, boolean z10) {
        this.f36864a.f38057s.q(str, str2, z10);
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
