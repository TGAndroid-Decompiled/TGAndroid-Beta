package org.telegram.ui;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.Utilities;
public final class r80 implements Utilities.Callback {
    public final int f42884a;
    public final Object f42885b;
    public final Object f42886c;
    public final Object d;
    public final Object e;
    public final Object f42887f;
    public final Object f42888g;

    public r80(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        this.f42884a = i10;
        this.f42885b = obj;
        this.f42886c = obj2;
        this.e = obj3;
        this.f42888g = obj4;
        this.f42887f = obj5;
        this.d = obj6;
    }

    @Override
    public final void run(java.lang.Object r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.r80.run(java.lang.Object):void");
    }

    public r80(LaunchActivity launchActivity, qf.c cVar, Runnable runnable, ChannelBoostsController channelBoostsController, Long l4, org.telegram.ui.Cells.s1 s1Var) {
        this.f42884a = 1;
        this.f42885b = launchActivity;
        this.f42886c = cVar;
        this.d = runnable;
        this.f42888g = channelBoostsController;
        this.e = l4;
        this.f42887f = s1Var;
    }
}
