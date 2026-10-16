package org.telegram.ui;

import android.app.Activity;
public final class qr extends org.telegram.ui.Components.a30 {
    public final yr f39205b;

    public qr(yr yrVar, Activity activity, yr yrVar2) {
        super(activity, yrVar2);
        this.f39205b = yrVar;
    }

    @Override
    public final void o() {
        yr yrVar = this.f39205b;
        yrVar.getMessagesController().convertToGigaGroup(yrVar.getParentActivity(), yrVar.f41926r, yrVar, new b1(this, 24));
    }

    @Override
    public final void n() {
    }
}
