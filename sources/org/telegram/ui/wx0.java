package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class wx0 implements Utilities.Callback {
    public final int f44396a;
    public final ProfileActivity f44397b;

    public wx0(ProfileActivity profileActivity, int i10) {
        this.f44396a = i10;
        this.f44397b = profileActivity;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f44396a) {
            case 0:
                ProfileActivity profileActivity = this.f44397b;
                profileActivity.getClass();
                ArrayList arrayList = new ArrayList(1);
                arrayList.add((TLRPC.InputStickerSet) obj);
                profileActivity.showDialog(new org.telegram.ui.Components.jv(profileActivity, profileActivity.getParentActivity(), profileActivity.f36129v0, arrayList));
                return;
            default:
                ProfileActivity.e0(this.f44397b, (Boolean) obj);
                return;
        }
    }
}
