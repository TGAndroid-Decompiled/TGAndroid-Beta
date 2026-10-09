package org.telegram.ui;

import android.app.Activity;
import android.view.View;
public final class xy0 implements View.OnClickListener {
    public final int f44165a;
    public final ProfileActivity f44166b;
    public final String f44167c;

    public xy0(ProfileActivity profileActivity, String str, int i10) {
        this.f44165a = i10;
        this.f44166b = profileActivity;
        this.f44167c = str;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f44165a) {
            case 0:
                ProfileActivity profileActivity = this.f44166b;
                Activity parentActivity = profileActivity.getParentActivity();
                of.f.s(parentActivity, "https://" + profileActivity.getMessagesController().linkPrefix + "/nft/" + this.f44167c);
                return;
            default:
                ProfileActivity profileActivity2 = this.f44166b;
                Activity parentActivity2 = profileActivity2.getParentActivity();
                of.f.s(parentActivity2, "https://" + profileActivity2.getMessagesController().linkPrefix + "/nft/" + this.f44167c);
                return;
        }
    }
}
