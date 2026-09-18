package org.telegram.ui;

import android.app.Activity;
import android.view.View;
public final class zy0 implements View.OnClickListener {
    public final int f40360a;
    public final ProfileActivity f40361b;
    public final String f40362c;

    public zy0(ProfileActivity profileActivity, String str, int i10) {
        this.f40360a = i10;
        this.f40361b = profileActivity;
        this.f40362c = str;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f40360a) {
            case 0:
                ProfileActivity profileActivity = this.f40361b;
                Activity parentActivity = profileActivity.getParentActivity();
                nf.f.s(parentActivity, "https://" + profileActivity.getMessagesController().linkPrefix + "/nft/" + this.f40362c);
                return;
            default:
                ProfileActivity profileActivity2 = this.f40361b;
                Activity parentActivity2 = profileActivity2.getParentActivity();
                nf.f.s(parentActivity2, "https://" + profileActivity2.getMessagesController().linkPrefix + "/nft/" + this.f40362c);
                return;
        }
    }
}
