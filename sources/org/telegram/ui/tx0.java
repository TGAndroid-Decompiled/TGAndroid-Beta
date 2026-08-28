package org.telegram.ui;

import android.app.Activity;
import android.view.View;
public final class tx0 implements View.OnClickListener {
    public final int f43081a;
    public final ProfileActivity f43082b;
    public final String f43083c;

    public tx0(ProfileActivity profileActivity, String str, int i9) {
        this.f43081a = i9;
        this.f43082b = profileActivity;
        this.f43083c = str;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f43081a) {
            case 0:
                ProfileActivity profileActivity = this.f43082b;
                Activity parentActivity = profileActivity.getParentActivity();
                ve.e.s(parentActivity, "https://" + profileActivity.getMessagesController().linkPrefix + "/nft/" + this.f43083c);
                return;
            default:
                ProfileActivity profileActivity2 = this.f43082b;
                Activity parentActivity2 = profileActivity2.getParentActivity();
                ve.e.s(parentActivity2, "https://" + profileActivity2.getMessagesController().linkPrefix + "/nft/" + this.f43083c);
                return;
        }
    }
}
