package org.telegram.ui;

import android.app.Activity;
import java.io.Serializable;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class wd implements RequestDelegate {
    public final int f39397a;
    public final boolean f39398b;
    public final Object f39399c;
    public final Object d;
    public final Object e;

    public wd(Object obj, Object obj2, Object obj3, boolean z4, int i10) {
        this.f39397a = i10;
        this.f39399c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f39398b = z4;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f39397a) {
            case 0:
                AndroidUtilities.runOnUIThread(new j3.n1((ke) this.f39399c, tL_error, (TwoStepVerificationActivity) this.d, (Activity) this.e, this.f39398b, tLObject, 7));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new gg.j((Object) ((xn) this.f39399c), (Object) ((af.f) this.d), (Object) tLObject, (Object) ((fg) this.e), this.f39398b, 11));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new j3.n1((ap) this.f39399c, (TLRPC.TL_channels_toggleUsername) this.d, tLObject, (TLRPC.TL_username) this.e, this.f39398b, tL_error, 9));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new gg.j((org.telegram.ui.Components.ry) this.f39399c, (String) this.d, this.f39398b, (String) this.e, tLObject, 14));
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new j3.n1((au) this.f39399c, tLObject, (ph.d) this.d, this.f39398b, (HashSet) this.e, tL_error, 11));
                return;
            default:
                AndroidUtilities.runOnUIThread(new gg.j((Object) ((ph.g1) this.f39399c), tLObject, this.f39398b, (TLObject) ((TLRPC.TL_messages_getInlineBotResults) this.d), (String) this.e, 20));
                return;
        }
    }

    public wd(Object obj, Object obj2, boolean z4, Serializable serializable, int i10) {
        this.f39397a = i10;
        this.f39399c = obj;
        this.d = obj2;
        this.f39398b = z4;
        this.e = serializable;
    }

    public wd(ph.g1 g1Var, boolean z4, TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults, String str) {
        this.f39397a = 5;
        this.f39399c = g1Var;
        this.f39398b = z4;
        this.d = tL_messages_getInlineBotResults;
        this.e = str;
    }
}
