package org.telegram.ui;

import android.app.Activity;
public final class zq extends org.telegram.ui.Components.w20 {
    public final hr f43792b;

    public zq(hr hrVar, Activity activity, hr hrVar2) {
        super(activity, hrVar2);
        this.f43792b = hrVar;
    }

    @Override
    public final void o() {
        hr hrVar = this.f43792b;
        hrVar.getMessagesController().convertToGigaGroup(hrVar.getParentActivity(), hrVar.f37753r, hrVar, new b1(this, 24));
    }

    @Override
    public final void n() {
    }
}
