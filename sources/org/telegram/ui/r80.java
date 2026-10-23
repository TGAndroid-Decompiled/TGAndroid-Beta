package org.telegram.ui;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.Utilities;
public final class r80 implements Utilities.Callback {
    public final int f41045a;
    public final Object f41046b;
    public final Object f41047c;
    public final Object d;
    public final Object e;
    public final Object f41048f;
    public final Object f41049g;

    public r80(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        this.f41045a = i10;
        this.f41046b = obj;
        this.f41047c = obj2;
        this.e = obj3;
        this.f41049g = obj4;
        this.f41048f = obj5;
        this.d = obj6;
    }

    @Override
    public final void run(java.lang.Object r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.r80.run(java.lang.Object):void");
    }

    public r80(LaunchActivity launchActivity, pf.c cVar, Runnable runnable, ChannelBoostsController channelBoostsController, Long l4, org.telegram.ui.Cells.t1 t1Var) {
        this.f41045a = 1;
        this.f41046b = launchActivity;
        this.f41047c = cVar;
        this.d = runnable;
        this.f41049g = channelBoostsController;
        this.e = l4;
        this.f41048f = t1Var;
    }
}
