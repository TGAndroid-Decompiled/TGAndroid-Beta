package org.telegram.ui;

import android.app.Activity;
import android.view.View;
public final class xy0 implements View.OnClickListener {
    public final int f39693a;
    public final ProfileActivity f39694b;
    public final String f39695c;

    public xy0(ProfileActivity profileActivity, String str, int i10) {
        this.f39693a = i10;
        this.f39694b = profileActivity;
        this.f39695c = str;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f39693a) {
            case 0:
                ProfileActivity profileActivity = this.f39694b;
                Activity parentActivity = profileActivity.getParentActivity();
                nf.f.s(parentActivity, "https://" + profileActivity.getMessagesController().linkPrefix + "/nft/" + this.f39695c);
                return;
            default:
                ProfileActivity profileActivity2 = this.f39694b;
                Activity parentActivity2 = profileActivity2.getParentActivity();
                nf.f.s(parentActivity2, "https://" + profileActivity2.getMessagesController().linkPrefix + "/nft/" + this.f39695c);
                return;
        }
    }
}
