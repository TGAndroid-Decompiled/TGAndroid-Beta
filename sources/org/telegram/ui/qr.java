package org.telegram.ui;

import android.app.Activity;
public final class qr extends org.telegram.ui.Components.a30 {
    public final yr f39526b;

    public qr(yr yrVar, Activity activity, yr yrVar2) {
        super(activity, yrVar2);
        this.f39526b = yrVar;
    }

    @Override
    public final void o() {
        yr yrVar = this.f39526b;
        yrVar.getMessagesController().convertToGigaGroup(yrVar.getParentActivity(), yrVar.f42249r, yrVar, new b1(this, 24));
    }

    @Override
    public final void n() {
    }
}
