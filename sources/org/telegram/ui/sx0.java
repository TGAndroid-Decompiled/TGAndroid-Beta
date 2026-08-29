package org.telegram.ui;

import android.app.Activity;
import android.view.View;
public final class sx0 implements View.OnClickListener {
    public final int f42478a;
    public final ProfileActivity f42479b;
    public final String f42480c;

    public sx0(ProfileActivity profileActivity, String str, int i10) {
        this.f42478a = i10;
        this.f42479b = profileActivity;
        this.f42480c = str;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f42478a) {
            case 0:
                ProfileActivity profileActivity = this.f42479b;
                Activity parentActivity = profileActivity.getParentActivity();
                ye.d.s(parentActivity, "https://" + profileActivity.getMessagesController().linkPrefix + "/nft/" + this.f42480c);
                return;
            default:
                ProfileActivity profileActivity2 = this.f42479b;
                Activity parentActivity2 = profileActivity2.getParentActivity();
                ye.d.s(parentActivity2, "https://" + profileActivity2.getMessagesController().linkPrefix + "/nft/" + this.f42480c);
                return;
        }
    }
}
