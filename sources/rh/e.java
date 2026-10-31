package rh;

import android.app.Activity;
import org.telegram.messenger.bh;
import org.telegram.messenger.q20;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.hf;
import org.telegram.ui.TwoStepVerificationActivity;
public final class e implements RequestDelegate {
    public final int f46768a = 0;
    public final boolean f46769b;
    public final long f46770c;
    public final Object d;
    public final Object e;
    public final Object f46771f;

    public e(i iVar, TwoStepVerificationActivity twoStepVerificationActivity, Activity activity, boolean z10, long j10) {
        this.d = iVar;
        this.e = twoStepVerificationActivity;
        this.f46771f = activity;
        this.f46769b = z10;
        this.f46770c = j10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f46768a) {
            case 0:
                org.telegram.messenger.i0.g3(new bh((i) this.d, tL_error, (TwoStepVerificationActivity) this.e, (Activity) this.f46771f, this.f46769b, this.f46770c, tLObject, 4));
                return;
            default:
                org.telegram.messenger.i0.g3(new hf((th.e5) this.d, tL_error, this.f46769b, this.f46770c, (q20) this.e, (org.telegram.ui.ActionBar.p6) this.f46771f));
                return;
        }
    }

    public e(th.e5 e5Var, boolean z10, long j10, q20 q20Var, org.telegram.ui.ActionBar.p6 p6Var) {
        this.d = e5Var;
        this.f46769b = z10;
        this.f46770c = j10;
        this.e = q20Var;
        this.f46771f = p6Var;
    }
}
