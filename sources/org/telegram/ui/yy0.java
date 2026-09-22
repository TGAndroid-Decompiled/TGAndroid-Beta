package org.telegram.ui;

import android.app.Activity;
import android.view.View;
public final class yy0 implements View.OnClickListener {
    public final int f39983a;
    public final ProfileActivity f39984b;
    public final String f39985c;

    public yy0(ProfileActivity profileActivity, String str, int i10) {
        this.f39983a = i10;
        this.f39984b = profileActivity;
        this.f39985c = str;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f39983a) {
            case 0:
                ProfileActivity profileActivity = this.f39984b;
                Activity parentActivity = profileActivity.getParentActivity();
                nf.f.s(parentActivity, "https://" + profileActivity.getMessagesController().linkPrefix + "/nft/" + this.f39985c);
                return;
            default:
                ProfileActivity profileActivity2 = this.f39984b;
                Activity parentActivity2 = profileActivity2.getParentActivity();
                nf.f.s(parentActivity2, "https://" + profileActivity2.getMessagesController().linkPrefix + "/nft/" + this.f39985c);
                return;
        }
    }
}
