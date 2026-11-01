package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class xb1 implements RequestDelegate {
    public final int f43335a = 0;
    public final boolean f43336b;
    public final boolean f43337c;
    public final Object d;
    public final Object e;

    public xb1(TwoStepVerificationActivity twoStepVerificationActivity, boolean z10, boolean z11, Runnable runnable) {
        this.d = twoStepVerificationActivity;
        this.f43336b = z10;
        this.f43337c = z11;
        this.e = runnable;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f43335a) {
            case 0:
                org.telegram.messenger.i0.g3(new org.telegram.ui.ActionBar.q((TwoStepVerificationActivity) this.d, tL_error, tLObject, this.f43336b, this.f43337c, (Runnable) this.e));
                return;
            default:
                org.telegram.messenger.i0.g3(new ig.k0((th.e5) this.d, this.f43336b, (TL_stories.TL_stories_getAllStories) this.e, tLObject, this.f43337c));
                return;
        }
    }

    public xb1(th.e5 e5Var, boolean z10, TL_stories.TL_stories_getAllStories tL_stories_getAllStories, boolean z11) {
        this.d = e5Var;
        this.f43336b = z10;
        this.e = tL_stories_getAllStories;
        this.f43337c = z11;
    }
}
