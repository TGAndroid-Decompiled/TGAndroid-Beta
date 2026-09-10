package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class sg1 implements RequestDelegate {
    public final int f36679a = 0;
    public final boolean f36680b;
    public final boolean f36681c;
    public final Object d;
    public final Object e;

    public sg1(TwoStepVerificationActivity twoStepVerificationActivity, boolean z10, boolean z11, Runnable runnable) {
        this.d = twoStepVerificationActivity;
        this.f36680b = z10;
        this.f36681c = z11;
        this.e = runnable;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f36679a) {
            case 0:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.be((TwoStepVerificationActivity) this.d, tL_error, tLObject, this.f36680b, this.f36681c, (Runnable) this.e, 3));
                return;
            default:
                AndroidUtilities.runOnUIThread(new og.p0((zh.i5) this.d, this.f36680b, (TL_stories.TL_stories_getAllStories) this.e, tLObject, this.f36681c));
                return;
        }
    }

    public sg1(zh.i5 i5Var, boolean z10, TL_stories.TL_stories_getAllStories tL_stories_getAllStories, boolean z11) {
        this.d = i5Var;
        this.f36680b = z10;
        this.e = tL_stories_getAllStories;
        this.f36681c = z11;
    }
}
