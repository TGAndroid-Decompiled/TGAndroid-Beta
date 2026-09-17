package org.telegram.ui;

import android.app.Activity;
import android.view.View;
public final class yy0 implements View.OnClickListener {
    public final int f43239a;
    public final ProfileActivity f43240b;
    public final String f43241c;

    public yy0(ProfileActivity profileActivity, String str, int i10) {
        this.f43239a = i10;
        this.f43240b = profileActivity;
        this.f43241c = str;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f43239a) {
            case 0:
                ProfileActivity profileActivity = this.f43240b;
                Activity parentActivity = profileActivity.getParentActivity();
                of.f.s(parentActivity, "https://" + profileActivity.getMessagesController().linkPrefix + "/nft/" + this.f43241c);
                return;
            default:
                ProfileActivity profileActivity2 = this.f43240b;
                Activity parentActivity2 = profileActivity2.getParentActivity();
                of.f.s(parentActivity2, "https://" + profileActivity2.getMessagesController().linkPrefix + "/nft/" + this.f43241c);
                return;
        }
    }
}
