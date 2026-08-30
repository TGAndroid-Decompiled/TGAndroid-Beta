package org.telegram.ui;

import org.telegram.messenger.ChannelBoostsController;
import org.telegram.tgnet.tl.TL_stories;
public final class w80 implements h5.d {
    public final int f39366a = 0;
    public final LaunchActivity f39367b;
    public final af.f f39368c;
    public final Runnable d;
    public final Long e;
    public final org.telegram.ui.Cells.t1 f39369f;
    public final Object f39370g;

    public w80(LaunchActivity launchActivity, af.f fVar, Long l10, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, org.telegram.ui.Cells.t1 t1Var, Runnable runnable) {
        this.f39367b = launchActivity;
        this.f39368c = fVar;
        this.e = l10;
        this.f39370g = tL_premium_boostsStatus;
        this.f39369f = t1Var;
        this.d = runnable;
    }

    @Override
    public final void accept(java.lang.Object r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.w80.accept(java.lang.Object):void");
    }

    public w80(LaunchActivity launchActivity, af.f fVar, Runnable runnable, ChannelBoostsController channelBoostsController, Long l10, org.telegram.ui.Cells.t1 t1Var) {
        this.f39367b = launchActivity;
        this.f39368c = fVar;
        this.d = runnable;
        this.f39370g = channelBoostsController;
        this.e = l10;
        this.f39369f = t1Var;
    }
}
