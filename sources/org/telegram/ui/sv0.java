package org.telegram.ui;

import android.app.Activity;
import android.graphics.RectF;
import android.view.View;
public final class sv0 implements View.OnClickListener {
    public final int f41653a;
    public final ProfileActivity f41654b;
    public final String f41655c;

    public sv0(ProfileActivity profileActivity, String str, int i10) {
        this.f41653a = i10;
        this.f41654b = profileActivity;
        this.f41655c = str;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f41653a;
        String str = this.f41655c;
        ProfileActivity profileActivity = this.f41654b;
        switch (i10) {
            case 0:
                RectF rectF = ProfileActivity.R6;
                Activity parentActivity = profileActivity.getParentActivity();
                gf.f.r(parentActivity, "https://" + profileActivity.getMessagesController().U2 + "/nft/" + str);
                return;
            default:
                RectF rectF2 = ProfileActivity.R6;
                Activity parentActivity2 = profileActivity.getParentActivity();
                gf.f.r(parentActivity2, "https://" + profileActivity.getMessagesController().U2 + "/nft/" + str);
                return;
        }
    }
}
