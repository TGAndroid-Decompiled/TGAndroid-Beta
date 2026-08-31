package org.telegram.ui;

import android.app.Activity;
import java.io.Serializable;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class wd implements RequestDelegate {
    public final int f42443a;
    public final boolean f42444b;
    public final Object f42445c;
    public final Object d;
    public final Object f42446e;

    public wd(Object obj, Object obj2, Object obj3, boolean z4, int i10) {
        this.f42443a = i10;
        this.f42445c = obj;
        this.d = obj2;
        this.f42446e = obj3;
        this.f42444b = z4;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f42443a) {
            case 0:
                AndroidUtilities.runOnUIThread(new j3.n1((ke) this.f42445c, tL_error, (TwoStepVerificationActivity) this.d, (Activity) this.f42446e, this.f42444b, tLObject, 7));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new hg.j((Object) ((xn) this.f42445c), (Object) ((af.f) this.d), (Object) tLObject, (Object) ((fg) this.f42446e), this.f42444b, 11));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new j3.n1((ap) this.f42445c, (TLRPC.TL_channels_toggleUsername) this.d, tLObject, (TLRPC.TL_username) this.f42446e, this.f42444b, tL_error, 9));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new hg.j((org.telegram.ui.Components.ty) this.f42445c, (String) this.d, this.f42444b, (String) this.f42446e, tLObject, 14));
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new j3.n1((bu) this.f42445c, tLObject, (qh.d) this.d, this.f42444b, (HashSet) this.f42446e, tL_error, 11));
                return;
            default:
                AndroidUtilities.runOnUIThread(new hg.j((Object) ((qh.g1) this.f42445c), tLObject, this.f42444b, (TLObject) ((TLRPC.TL_messages_getInlineBotResults) this.d), (String) this.f42446e, 20));
                return;
        }
    }

    public wd(Object obj, Object obj2, boolean z4, Serializable serializable, int i10) {
        this.f42443a = i10;
        this.f42445c = obj;
        this.d = obj2;
        this.f42444b = z4;
        this.f42446e = serializable;
    }

    public wd(qh.g1 g1Var, boolean z4, TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults, String str) {
        this.f42443a = 5;
        this.f42445c = g1Var;
        this.f42444b = z4;
        this.d = tL_messages_getInlineBotResults;
        this.f42446e = str;
    }
}
