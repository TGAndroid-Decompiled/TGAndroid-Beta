package org.telegram.ui;

import android.view.View;

public final class tx0 implements View.OnClickListener {

    public final int f43027a;

    public final ProfileActivity f43028b;

    public final String f43029c;

    public tx0(ProfileActivity profileActivity, String str, int i10) {
        this.f43027a = i10;
        this.f43028b = profileActivity;
        this.f43029c = str;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f43027a) {
            case 0:
                ProfileActivity profileActivity = this.f43028b;
                we.e.s(profileActivity.getParentActivity(), "https://" + profileActivity.getMessagesController().linkPrefix + "/nft/" + this.f43029c);
                break;
            default:
                ProfileActivity profileActivity2 = this.f43028b;
                we.e.s(profileActivity2.getParentActivity(), "https://" + profileActivity2.getMessagesController().linkPrefix + "/nft/" + this.f43029c);
                break;
        }
    }
}
