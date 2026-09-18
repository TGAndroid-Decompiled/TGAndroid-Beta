package org.telegram.ui;

import android.app.Activity;
import android.view.View;
public final class xy0 implements View.OnClickListener {
    public final int f39641a;
    public final ProfileActivity f39642b;
    public final String f39643c;

    public xy0(ProfileActivity profileActivity, String str, int i10) {
        this.f39641a = i10;
        this.f39642b = profileActivity;
        this.f39643c = str;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f39641a) {
            case 0:
                ProfileActivity profileActivity = this.f39642b;
                Activity parentActivity = profileActivity.getParentActivity();
                nf.f.s(parentActivity, "https://" + profileActivity.getMessagesController().linkPrefix + "/nft/" + this.f39643c);
                return;
            default:
                ProfileActivity profileActivity2 = this.f39642b;
                Activity parentActivity2 = profileActivity2.getParentActivity();
                nf.f.s(parentActivity2, "https://" + profileActivity2.getMessagesController().linkPrefix + "/nft/" + this.f39643c);
                return;
        }
    }
}
