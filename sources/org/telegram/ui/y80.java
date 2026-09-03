package org.telegram.ui;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.tgnet.tl.TL_stories;
public final class y80 implements h5.d {
    public final int f40180a = 0;
    public final LaunchActivity f40181b;
    public final ze.c f40182c;
    public final Runnable d;
    public final Long e;
    public final org.telegram.ui.Cells.s1 f40183f;
    public final Object f40184g;

    public y80(LaunchActivity launchActivity, ze.c cVar, Long l10, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, org.telegram.ui.Cells.s1 s1Var, Runnable runnable) {
        this.f40181b = launchActivity;
        this.f40182c = cVar;
        this.e = l10;
        this.f40184g = tL_premium_boostsStatus;
        this.f40183f = s1Var;
        this.d = runnable;
    }

    @Override
    public final void accept(java.lang.Object r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.y80.accept(java.lang.Object):void");
    }

    public y80(LaunchActivity launchActivity, ze.c cVar, Runnable runnable, ChannelBoostsController channelBoostsController, Long l10, org.telegram.ui.Cells.s1 s1Var) {
        this.f40181b = launchActivity;
        this.f40182c = cVar;
        this.d = runnable;
        this.f40184g = channelBoostsController;
        this.e = l10;
        this.f40183f = s1Var;
    }
}
