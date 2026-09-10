package xh;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.gg;
import org.telegram.ui.Components.v21;
import org.telegram.ui.TwoStepVerificationActivity;
public final class d implements RequestDelegate {
    public final int f45322a = 0;
    public final boolean f45323b;
    public final long f45324c;
    public final Object d;
    public final Object e;
    public final Object f45325f;

    public d(h hVar, TwoStepVerificationActivity twoStepVerificationActivity, Activity activity, boolean z10, long j3) {
        this.d = hVar;
        this.e = twoStepVerificationActivity;
        this.f45325f = activity;
        this.f45323b = z10;
        this.f45324c = j3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f45322a) {
            case 0:
                AndroidUtilities.runOnUIThread(new v21((h) this.d, tL_error, (TwoStepVerificationActivity) this.e, (Activity) this.f45325f, this.f45323b, this.f45324c, tLObject));
                return;
            default:
                AndroidUtilities.runOnUIThread(new gg((zh.i5) this.d, tL_error, this.f45323b, this.f45324c, (e2.h) this.e, (org.telegram.ui.ActionBar.f6) this.f45325f));
                return;
        }
    }

    public d(zh.i5 i5Var, boolean z10, long j3, e2.h hVar, org.telegram.ui.ActionBar.f6 f6Var) {
        this.d = i5Var;
        this.f45323b = z10;
        this.f45324c = j3;
        this.e = hVar;
        this.f45325f = f6Var;
    }
}
