package org.telegram.ui;

import android.app.Activity;
import android.view.View;
public final class yy0 implements View.OnClickListener {
    public final int f43266a;
    public final ProfileActivity f43267b;
    public final String f43268c;

    public yy0(ProfileActivity profileActivity, String str, int i10) {
        this.f43266a = i10;
        this.f43267b = profileActivity;
        this.f43268c = str;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f43266a) {
            case 0:
                ProfileActivity profileActivity = this.f43267b;
                Activity parentActivity = profileActivity.getParentActivity();
                of.f.s(parentActivity, "https://" + profileActivity.getMessagesController().linkPrefix + "/nft/" + this.f43268c);
                return;
            default:
                ProfileActivity profileActivity2 = this.f43267b;
                Activity parentActivity2 = profileActivity2.getParentActivity();
                of.f.s(parentActivity2, "https://" + profileActivity2.getMessagesController().linkPrefix + "/nft/" + this.f43268c);
                return;
        }
    }
}
