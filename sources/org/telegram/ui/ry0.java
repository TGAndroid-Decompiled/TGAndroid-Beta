package org.telegram.ui;

import android.app.Activity;
import android.view.View;
public final class ry0 implements View.OnClickListener {
    public final int f37248a;
    public final ProfileActivity f37249b;
    public final String f37250c;

    public ry0(ProfileActivity profileActivity, String str, int i10) {
        this.f37248a = i10;
        this.f37249b = profileActivity;
        this.f37250c = str;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f37248a) {
            case 0:
                ProfileActivity profileActivity = this.f37249b;
                Activity parentActivity = profileActivity.getParentActivity();
                nf.f.s(parentActivity, "https://" + profileActivity.getMessagesController().linkPrefix + "/nft/" + this.f37250c);
                return;
            default:
                ProfileActivity profileActivity2 = this.f37249b;
                Activity parentActivity2 = profileActivity2.getParentActivity();
                nf.f.s(parentActivity2, "https://" + profileActivity2.getMessagesController().linkPrefix + "/nft/" + this.f37250c);
                return;
        }
    }
}
