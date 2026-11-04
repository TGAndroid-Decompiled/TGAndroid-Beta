package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class zk extends eq0 {
    public final org.telegram.messenger.zi f52690a;
    public final org.telegram.messenger.ye f52691b;
    public final al f52692c;

    public zk(al alVar, org.telegram.messenger.zi ziVar, org.telegram.messenger.ye yeVar) {
        this.f52692c = alVar;
        this.f52690a = ziVar;
        this.f52691b = yeVar;
    }

    @Override
    public final mq0 E(org.telegram.messenger.zi ziVar, TLRPC.FileLocation fileLocation, int i3, boolean z10, boolean z11) {
        return this.f52692c.f43794a.R.f51248ab.E(this.f52690a, fileLocation, i3, z10, false);
    }

    @Override
    public final void o(int i3, org.telegram.messenger.b20 b20Var, boolean z10, int i10, int i11, boolean z11) {
        fl flVar = this.f52692c.f43794a;
        org.telegram.messenger.zi ziVar = this.f52690a;
        ziVar.f26889q = true;
        org.telegram.messenger.ye yeVar = this.f52691b;
        if (yeVar.h == null && !yeVar.f25310b) {
            TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
            TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
            tL_photos_updateProfilePhoto.f27135id = tL_inputPhoto;
            TLRPC.Photo photo = ziVar.f26868k.action.photo;
            tL_inputPhoto.f27020id = photo.f27025id;
            tL_inputPhoto.access_hash = photo.access_hash;
            tL_inputPhoto.file_reference = photo.file_reference;
            flVar.R.getConnectionsManager().sendRequest(tL_photos_updateProfilePhoto, new org.telegram.ui.ActionBar.h6(8, this, ziVar));
            return;
        }
        wm wmVar = flVar.R;
        xg xgVar = new xg(ziVar, 5);
        org.telegram.ui.ActionBar.q4 parentLayout = wmVar.getParentLayout();
        int currentAccount = wmVar.getCurrentAccount();
        org.telegram.ui.Components.f30 f30Var = new org.telegram.ui.Components.f30(0, true, true);
        f30Var.f33681a = wmVar;
        f30Var.s(yeVar);
        f30Var.f33682b = new cg.e0(currentAccount, xgVar, parentLayout, f30Var);
    }
}
