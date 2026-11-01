package org.telegram.ui;

import android.app.Activity;
import android.graphics.RectF;
import android.view.View;
public final class rv0 implements View.OnClickListener {
    public final int f41158a;
    public final ProfileActivity f41159b;
    public final String f41160c;

    public rv0(ProfileActivity profileActivity, String str, int i10) {
        this.f41158a = i10;
        this.f41159b = profileActivity;
        this.f41160c = str;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f41158a;
        String str = this.f41160c;
        ProfileActivity profileActivity = this.f41159b;
        switch (i10) {
            case 0:
                RectF rectF = ProfileActivity.S6;
                Activity parentActivity = profileActivity.getParentActivity();
                gf.f.r(parentActivity, "https://" + profileActivity.getMessagesController().U2 + "/nft/" + str);
                return;
            default:
                RectF rectF2 = ProfileActivity.S6;
                Activity parentActivity2 = profileActivity.getParentActivity();
                gf.f.r(parentActivity2, "https://" + profileActivity.getMessagesController().U2 + "/nft/" + str);
                return;
        }
    }
}
