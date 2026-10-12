package org.telegram.ui;

import android.app.Activity;
import android.view.View;
public final class zy0 implements View.OnClickListener {
    public final int f44934a;
    public final ProfileActivity f44935b;
    public final String f44936c;

    public zy0(ProfileActivity profileActivity, String str, int i10) {
        this.f44934a = i10;
        this.f44935b = profileActivity;
        this.f44936c = str;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f44934a) {
            case 0:
                ProfileActivity profileActivity = this.f44935b;
                Activity parentActivity = profileActivity.getParentActivity();
                of.f.s(parentActivity, "https://" + profileActivity.getMessagesController().linkPrefix + "/nft/" + this.f44936c);
                return;
            default:
                ProfileActivity profileActivity2 = this.f44935b;
                Activity parentActivity2 = profileActivity2.getParentActivity();
                of.f.s(parentActivity2, "https://" + profileActivity2.getMessagesController().linkPrefix + "/nft/" + this.f44936c);
                return;
        }
    }
}
