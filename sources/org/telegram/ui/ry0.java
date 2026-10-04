package org.telegram.ui;

import android.app.Activity;
import android.view.View;
public final class ry0 implements View.OnClickListener {
    public final int f40308a;
    public final ProfileActivity f40309b;
    public final String f40310c;

    public ry0(ProfileActivity profileActivity, String str, int i10) {
        this.f40308a = i10;
        this.f40309b = profileActivity;
        this.f40310c = str;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f40308a) {
            case 0:
                ProfileActivity profileActivity = this.f40309b;
                Activity parentActivity = profileActivity.getParentActivity();
                nf.f.s(parentActivity, "https://" + profileActivity.getMessagesController().linkPrefix + "/nft/" + this.f40310c);
                return;
            default:
                ProfileActivity profileActivity2 = this.f40309b;
                Activity parentActivity2 = profileActivity2.getParentActivity();
                nf.f.s(parentActivity2, "https://" + profileActivity2.getMessagesController().linkPrefix + "/nft/" + this.f40310c);
                return;
        }
    }
}
