package org.telegram.ui;

import android.app.Activity;
import android.view.View;
public final class xy0 implements View.OnClickListener {
    public final int f44163a;
    public final ProfileActivity f44164b;
    public final String f44165c;

    public xy0(ProfileActivity profileActivity, String str, int i10) {
        this.f44163a = i10;
        this.f44164b = profileActivity;
        this.f44165c = str;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f44163a) {
            case 0:
                ProfileActivity profileActivity = this.f44164b;
                Activity parentActivity = profileActivity.getParentActivity();
                of.f.s(parentActivity, "https://" + profileActivity.getMessagesController().linkPrefix + "/nft/" + this.f44165c);
                return;
            default:
                ProfileActivity profileActivity2 = this.f44164b;
                Activity parentActivity2 = profileActivity2.getParentActivity();
                of.f.s(parentActivity2, "https://" + profileActivity2.getMessagesController().linkPrefix + "/nft/" + this.f44165c);
                return;
        }
    }
}
