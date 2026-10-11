package org.telegram.ui;

import android.app.Activity;
import android.view.View;
public final class wy0 implements View.OnClickListener {
    public final int f43890a;
    public final ProfileActivity f43891b;
    public final String f43892c;

    public wy0(ProfileActivity profileActivity, String str, int i10) {
        this.f43890a = i10;
        this.f43891b = profileActivity;
        this.f43892c = str;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f43890a) {
            case 0:
                ProfileActivity profileActivity = this.f43891b;
                Activity parentActivity = profileActivity.getParentActivity();
                of.f.s(parentActivity, "https://" + profileActivity.getMessagesController().linkPrefix + "/nft/" + this.f43892c);
                return;
            default:
                ProfileActivity profileActivity2 = this.f43891b;
                Activity parentActivity2 = profileActivity2.getParentActivity();
                of.f.s(parentActivity2, "https://" + profileActivity2.getMessagesController().linkPrefix + "/nft/" + this.f43892c);
                return;
        }
    }
}
