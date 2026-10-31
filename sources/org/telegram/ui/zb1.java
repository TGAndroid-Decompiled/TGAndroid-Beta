package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class zb1 implements RequestDelegate {
    public final int f44083a = 0;
    public final boolean f44084b;
    public final boolean f44085c;
    public final Object d;
    public final Object e;

    public zb1(TwoStepVerificationActivity twoStepVerificationActivity, boolean z10, boolean z11, Runnable runnable) {
        this.d = twoStepVerificationActivity;
        this.f44084b = z10;
        this.f44085c = z11;
        this.e = runnable;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f44083a) {
            case 0:
                org.telegram.messenger.i0.g3(new org.telegram.ui.ActionBar.q((TwoStepVerificationActivity) this.d, tL_error, tLObject, this.f44084b, this.f44085c, (Runnable) this.e));
                return;
            default:
                org.telegram.messenger.i0.g3(new ig.k0((th.e5) this.d, this.f44084b, (TL_stories.TL_stories_getAllStories) this.e, tLObject, this.f44085c));
                return;
        }
    }

    public zb1(th.e5 e5Var, boolean z10, TL_stories.TL_stories_getAllStories tL_stories_getAllStories, boolean z11) {
        this.d = e5Var;
        this.f44084b = z10;
        this.e = tL_stories_getAllStories;
        this.f44085c = z11;
    }
}
