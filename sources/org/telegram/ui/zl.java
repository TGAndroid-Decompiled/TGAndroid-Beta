package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class zl extends yr0 {
    public final org.telegram.messenger.jj f44177a;
    public final org.telegram.messenger.ef f44178b;
    public final am f44179c;

    public zl(am amVar, org.telegram.messenger.jj jjVar, org.telegram.messenger.ef efVar) {
        this.f44179c = amVar;
        this.f44177a = jjVar;
        this.f44178b = efVar;
    }

    @Override
    public final gs0 E(org.telegram.messenger.jj jjVar, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        return this.f44179c.f35671a.Q.Za.E(this.f44177a, fileLocation, i10, z10, false);
    }

    @Override
    public final void o(int i10, org.telegram.messenger.x20 x20Var, boolean z10, int i11, int i12, boolean z11) {
        fm fmVar = this.f44179c.f35671a;
        org.telegram.messenger.jj jjVar = this.f44177a;
        jjVar.f16359q = true;
        org.telegram.messenger.ef efVar = this.f44178b;
        if (efVar.h == null && !efVar.f19507b) {
            TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
            TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
            tL_photos_updateProfilePhoto.f19927id = tL_inputPhoto;
            TLRPC.Photo photo = jjVar.f16337k.action.photo;
            tL_inputPhoto.f19812id = photo.f19817id;
            tL_inputPhoto.access_hash = photo.access_hash;
            tL_inputPhoto.file_reference = photo.file_reference;
            fmVar.Q.getConnectionsManager().sendRequest(tL_photos_updateProfilePhoto, new ag.k0(19, this, jjVar));
            return;
        }
        un unVar = fmVar.Q;
        rh rhVar = new rh(jjVar, 6);
        org.telegram.ui.ActionBar.z4 parentLayout = unVar.getParentLayout();
        int currentAccount = unVar.getCurrentAccount();
        org.telegram.ui.Components.b40 b40Var = new org.telegram.ui.Components.b40(0, true, true);
        b40Var.f24523a = unVar;
        b40Var.s(efVar);
        b40Var.f24524b = new mg.i0(currentAccount, rhVar, parentLayout, b40Var);
    }
}
