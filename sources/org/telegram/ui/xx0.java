package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class xx0 implements Utilities.Callback {
    public final int f44650a;
    public final ProfileActivity f44651b;

    public xx0(ProfileActivity profileActivity, int i9) {
        this.f44650a = i9;
        this.f44651b = profileActivity;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f44650a) {
            case 0:
                ProfileActivity profileActivity = this.f44651b;
                profileActivity.getClass();
                ArrayList arrayList = new ArrayList(1);
                arrayList.add((TLRPC.InputStickerSet) obj);
                profileActivity.showDialog(new org.telegram.ui.Components.dv(profileActivity, profileActivity.getParentActivity(), profileActivity.f36064v0, arrayList));
                return;
            default:
                ProfileActivity.d0(this.f44651b, (Boolean) obj);
                return;
        }
    }
}
