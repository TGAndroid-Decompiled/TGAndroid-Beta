package org.telegram.ui;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.Utilities;
public final class r80 implements Utilities.Callback {
    public final int f41054a;
    public final Object f41055b;
    public final Object f41056c;
    public final Object d;
    public final Object e;
    public final Object f41057f;
    public final Object f41058g;

    public r80(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        this.f41054a = i10;
        this.f41055b = obj;
        this.f41056c = obj2;
        this.e = obj3;
        this.f41058g = obj4;
        this.f41057f = obj5;
        this.d = obj6;
    }

    @Override
    public final void run(java.lang.Object r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.r80.run(java.lang.Object):void");
    }

    public r80(LaunchActivity launchActivity, pf.c cVar, Runnable runnable, ChannelBoostsController channelBoostsController, Long l4, org.telegram.ui.Cells.t1 t1Var) {
        this.f41054a = 1;
        this.f41055b = launchActivity;
        this.f41056c = cVar;
        this.d = runnable;
        this.f41058g = channelBoostsController;
        this.e = l4;
        this.f41057f = t1Var;
    }
}
