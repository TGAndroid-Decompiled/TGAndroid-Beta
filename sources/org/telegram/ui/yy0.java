package org.telegram.ui;

import android.app.Activity;
import android.view.View;
public final class yy0 implements View.OnClickListener {
    public final int f43265a;
    public final ProfileActivity f43266b;
    public final String f43267c;

    public yy0(ProfileActivity profileActivity, String str, int i10) {
        this.f43265a = i10;
        this.f43266b = profileActivity;
        this.f43267c = str;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f43265a) {
            case 0:
                ProfileActivity profileActivity = this.f43266b;
                Activity parentActivity = profileActivity.getParentActivity();
                of.f.s(parentActivity, "https://" + profileActivity.getMessagesController().linkPrefix + "/nft/" + this.f43267c);
                return;
            default:
                ProfileActivity profileActivity2 = this.f43266b;
                Activity parentActivity2 = profileActivity2.getParentActivity();
                of.f.s(parentActivity2, "https://" + profileActivity2.getMessagesController().linkPrefix + "/nft/" + this.f43267c);
                return;
        }
    }
}
