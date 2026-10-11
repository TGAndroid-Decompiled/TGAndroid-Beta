package org.telegram.ui;

import android.app.Activity;
import android.view.View;
public final class wy0 implements View.OnClickListener {
    public final int f43924a;
    public final ProfileActivity f43925b;
    public final String f43926c;

    public wy0(ProfileActivity profileActivity, String str, int i10) {
        this.f43924a = i10;
        this.f43925b = profileActivity;
        this.f43926c = str;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f43924a) {
            case 0:
                ProfileActivity profileActivity = this.f43925b;
                Activity parentActivity = profileActivity.getParentActivity();
                of.f.s(parentActivity, "https://" + profileActivity.getMessagesController().linkPrefix + "/nft/" + this.f43926c);
                return;
            default:
                ProfileActivity profileActivity2 = this.f43925b;
                Activity parentActivity2 = profileActivity2.getParentActivity();
                of.f.s(parentActivity2, "https://" + profileActivity2.getMessagesController().linkPrefix + "/nft/" + this.f43926c);
                return;
        }
    }
}
