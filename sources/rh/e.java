package rh;

import android.app.Activity;
import org.telegram.messenger.ch;
import org.telegram.messenger.r20;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.hf;
import org.telegram.ui.TwoStepVerificationActivity;
public final class e implements RequestDelegate {
    public final int f46782a = 0;
    public final boolean f46783b;
    public final long f46784c;
    public final Object d;
    public final Object e;
    public final Object f46785f;

    public e(i iVar, TwoStepVerificationActivity twoStepVerificationActivity, Activity activity, boolean z10, long j10) {
        this.d = iVar;
        this.e = twoStepVerificationActivity;
        this.f46785f = activity;
        this.f46783b = z10;
        this.f46784c = j10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f46782a) {
            case 0:
                org.telegram.messenger.i0.g3(new ch((i) this.d, tL_error, (TwoStepVerificationActivity) this.e, (Activity) this.f46785f, this.f46783b, this.f46784c, tLObject, 4));
                return;
            default:
                org.telegram.messenger.i0.g3(new hf((th.e5) this.d, tL_error, this.f46783b, this.f46784c, (r20) this.e, (org.telegram.ui.ActionBar.p6) this.f46785f));
                return;
        }
    }

    public e(th.e5 e5Var, boolean z10, long j10, r20 r20Var, org.telegram.ui.ActionBar.p6 p6Var) {
        this.d = e5Var;
        this.f46783b = z10;
        this.f46784c = j10;
        this.e = r20Var;
        this.f46785f = p6Var;
    }
}
