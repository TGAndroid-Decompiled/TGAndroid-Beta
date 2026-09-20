package org.telegram.ui;

import android.app.Activity;
import android.view.View;
public final class xy0 implements View.OnClickListener {
    public final int f39746a;
    public final ProfileActivity f39747b;
    public final String f39748c;

    public xy0(ProfileActivity profileActivity, String str, int i10) {
        this.f39746a = i10;
        this.f39747b = profileActivity;
        this.f39748c = str;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f39746a) {
            case 0:
                ProfileActivity profileActivity = this.f39747b;
                Activity parentActivity = profileActivity.getParentActivity();
                nf.f.s(parentActivity, "https://" + profileActivity.getMessagesController().linkPrefix + "/nft/" + this.f39748c);
                return;
            default:
                ProfileActivity profileActivity2 = this.f39747b;
                Activity parentActivity2 = profileActivity2.getParentActivity();
                nf.f.s(parentActivity2, "https://" + profileActivity2.getMessagesController().linkPrefix + "/nft/" + this.f39748c);
                return;
        }
    }
}
