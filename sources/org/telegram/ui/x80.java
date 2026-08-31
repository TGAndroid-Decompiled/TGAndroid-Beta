package org.telegram.ui;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.tgnet.tl.TL_stories;
public final class x80 implements h5.d {
    public final int f42995a = 0;
    public final LaunchActivity f42996b;
    public final af.f f42997c;
    public final Runnable d;
    public final Long f42998e;
    public final org.telegram.ui.Cells.t1 f42999f;
    public final Object f43000g;

    public x80(LaunchActivity launchActivity, af.f fVar, Long l10, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, org.telegram.ui.Cells.t1 t1Var, Runnable runnable) {
        this.f42996b = launchActivity;
        this.f42997c = fVar;
        this.f42998e = l10;
        this.f43000g = tL_premium_boostsStatus;
        this.f42999f = t1Var;
        this.d = runnable;
    }

    @Override
    public final void accept(java.lang.Object r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.x80.accept(java.lang.Object):void");
    }

    public x80(LaunchActivity launchActivity, af.f fVar, Runnable runnable, ChannelBoostsController channelBoostsController, Long l10, org.telegram.ui.Cells.t1 t1Var) {
        this.f42996b = launchActivity;
        this.f42997c = fVar;
        this.d = runnable;
        this.f43000g = channelBoostsController;
        this.f42998e = l10;
        this.f42999f = t1Var;
    }
}
