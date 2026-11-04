package org.telegram.ui;

import android.app.Activity;
import android.graphics.RectF;
import android.view.View;
public final class zt0 implements View.OnClickListener {
    public final int f52750a;
    public final ProfileActivity f52751b;
    public final String f52752c;

    public zt0(ProfileActivity profileActivity, String str, int i3) {
        this.f52750a = i3;
        this.f52751b = profileActivity;
        this.f52752c = str;
    }

    @Override
    public final void onClick(View view) {
        int i3 = this.f52750a;
        String str = this.f52752c;
        ProfileActivity profileActivity = this.f52751b;
        switch (i3) {
            case 0:
                RectF rectF = ProfileActivity.T6;
                Activity parentActivity = profileActivity.getParentActivity();
                sf.c.t(parentActivity, "https://" + profileActivity.getMessagesController().V2 + "/nft/" + str);
                return;
            default:
                RectF rectF2 = ProfileActivity.T6;
                Activity parentActivity2 = profileActivity.getParentActivity();
                sf.c.t(parentActivity2, "https://" + profileActivity.getMessagesController().V2 + "/nft/" + str);
                return;
        }
    }
}
