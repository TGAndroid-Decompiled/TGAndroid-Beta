package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class zl extends xr0 {
    public final org.telegram.messenger.kj f44018a;
    public final org.telegram.messenger.ff f44019b;
    public final am f44020c;

    public zl(am amVar, org.telegram.messenger.kj kjVar, org.telegram.messenger.ff ffVar) {
        this.f44020c = amVar;
        this.f44018a = kjVar;
        this.f44019b = ffVar;
    }

    @Override
    public final fs0 E(org.telegram.messenger.kj kjVar, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        return this.f44020c.f35805a.Q.Za.E(this.f44018a, fileLocation, i10, z10, false);
    }

    @Override
    public final void o(int i10, org.telegram.messenger.y20 y20Var, boolean z10, int i11, int i12, boolean z11) {
        fm fmVar = this.f44020c.f35805a;
        org.telegram.messenger.kj kjVar = this.f44018a;
        kjVar.f16712q = true;
        org.telegram.messenger.ff ffVar = this.f44019b;
        if (ffVar.h == null && !ffVar.f14603b) {
            TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
            TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
            tL_photos_updateProfilePhoto.f19928id = tL_inputPhoto;
            TLRPC.Photo photo = kjVar.f16690k.action.photo;
            tL_inputPhoto.f19813id = photo.f19818id;
            tL_inputPhoto.access_hash = photo.access_hash;
            tL_inputPhoto.file_reference = photo.file_reference;
            fmVar.Q.getConnectionsManager().sendRequest(tL_photos_updateProfilePhoto, new ag.k0(19, this, kjVar));
            return;
        }
        un unVar = fmVar.Q;
        rh rhVar = new rh(kjVar, 6);
        org.telegram.ui.ActionBar.z4 parentLayout = unVar.getParentLayout();
        int currentAccount = unVar.getCurrentAccount();
        org.telegram.ui.Components.b40 b40Var = new org.telegram.ui.Components.b40(0, true, true);
        b40Var.f24618a = unVar;
        b40Var.s(ffVar);
        b40Var.f24619b = new mg.i0(currentAccount, rhVar, parentLayout, b40Var);
    }
}
