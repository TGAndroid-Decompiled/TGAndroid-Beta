package org.telegram.ui;

import android.app.Activity;
import android.view.View;
public final class xy0 implements View.OnClickListener {
    public final int f44209a;
    public final ProfileActivity f44210b;
    public final String f44211c;

    public xy0(ProfileActivity profileActivity, String str, int i10) {
        this.f44209a = i10;
        this.f44210b = profileActivity;
        this.f44211c = str;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f44209a) {
            case 0:
                ProfileActivity profileActivity = this.f44210b;
                Activity parentActivity = profileActivity.getParentActivity();
                of.f.s(parentActivity, "https://" + profileActivity.getMessagesController().linkPrefix + "/nft/" + this.f44211c);
                return;
            default:
                ProfileActivity profileActivity2 = this.f44210b;
                Activity parentActivity2 = profileActivity2.getParentActivity();
                of.f.s(parentActivity2, "https://" + profileActivity2.getMessagesController().linkPrefix + "/nft/" + this.f44211c);
                return;
        }
    }
}
