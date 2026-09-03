package org.telegram.ui;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.tgnet.tl.TL_stories;
public final class x80 implements h5.d {
    public final int f42956a = 0;
    public final LaunchActivity f42957b;
    public final af.f f42958c;
    public final Runnable d;
    public final Long f42959e;
    public final org.telegram.ui.Cells.t1 f42960f;
    public final Object f42961g;

    public x80(LaunchActivity launchActivity, af.f fVar, Long l10, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, org.telegram.ui.Cells.t1 t1Var, Runnable runnable) {
        this.f42957b = launchActivity;
        this.f42958c = fVar;
        this.f42959e = l10;
        this.f42961g = tL_premium_boostsStatus;
        this.f42960f = t1Var;
        this.d = runnable;
    }

    @Override
    public final void accept(java.lang.Object r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.x80.accept(java.lang.Object):void");
    }

    public x80(LaunchActivity launchActivity, af.f fVar, Runnable runnable, ChannelBoostsController channelBoostsController, Long l10, org.telegram.ui.Cells.t1 t1Var) {
        this.f42957b = launchActivity;
        this.f42958c = fVar;
        this.d = runnable;
        this.f42961g = channelBoostsController;
        this.f42959e = l10;
        this.f42960f = t1Var;
    }
}
