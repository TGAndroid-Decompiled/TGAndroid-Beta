package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

public final class xx0 implements Utilities.Callback {

    public final int f44636a;

    public final ProfileActivity f44637b;

    public xx0(ProfileActivity profileActivity, int i10) {
        this.f44636a = i10;
        this.f44637b = profileActivity;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f44636a) {
            case 0:
                ProfileActivity profileActivity = this.f44637b;
                profileActivity.getClass();
                ArrayList arrayList = new ArrayList(1);
                arrayList.add((TLRPC.InputStickerSet) obj);
                profileActivity.showDialog(new org.telegram.ui.Components.cv(profileActivity, profileActivity.getParentActivity(), profileActivity.f36067v0, arrayList));
                break;
            default:
                ProfileActivity.e0(this.f44637b, (Boolean) obj);
                break;
        }
    }
}
