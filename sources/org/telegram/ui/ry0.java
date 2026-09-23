package org.telegram.ui;

import android.app.Activity;
import android.view.View;
public final class ry0 implements View.OnClickListener {
    public final int f37086a;
    public final ProfileActivity f37087b;
    public final String f37088c;

    public ry0(ProfileActivity profileActivity, String str, int i10) {
        this.f37086a = i10;
        this.f37087b = profileActivity;
        this.f37088c = str;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f37086a) {
            case 0:
                ProfileActivity profileActivity = this.f37087b;
                Activity parentActivity = profileActivity.getParentActivity();
                nf.f.s(parentActivity, "https://" + profileActivity.getMessagesController().linkPrefix + "/nft/" + this.f37088c);
                return;
            default:
                ProfileActivity profileActivity2 = this.f37087b;
                Activity parentActivity2 = profileActivity2.getParentActivity();
                nf.f.s(parentActivity2, "https://" + profileActivity2.getMessagesController().linkPrefix + "/nft/" + this.f37088c);
                return;
        }
    }
}
