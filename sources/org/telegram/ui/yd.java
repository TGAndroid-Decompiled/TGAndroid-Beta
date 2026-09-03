package org.telegram.ui;

import android.app.Activity;
import java.io.Serializable;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class yd implements RequestDelegate {
    public final int f40231a;
    public final boolean f40232b;
    public final Object f40233c;
    public final Object d;
    public final Object e;

    public yd(Object obj, Object obj2, Object obj3, boolean z4, int i10) {
        this.f40231a = i10;
        this.f40233c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f40232b = z4;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f40231a) {
            case 0:
                AndroidUtilities.runOnUIThread(new j3.n1((me) this.f40233c, tL_error, (TwoStepVerificationActivity) this.d, (Activity) this.e, this.f40232b, tLObject, 7));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new gg.j((Object) ((zn) this.f40233c), (Object) ((ze.c) this.d), (Object) tLObject, (Object) ((hg) this.e), this.f40232b, 11));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new j3.n1((cp) this.f40233c, (TLRPC.TL_channels_toggleUsername) this.d, tLObject, (TLRPC.TL_username) this.e, this.f40232b, tL_error, 9));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new gg.j((org.telegram.ui.Components.ry) this.f40233c, (String) this.d, this.f40232b, (String) this.e, tLObject, 14));
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new j3.n1((cu) this.f40233c, tLObject, (ph.d) this.d, this.f40232b, (HashSet) this.e, tL_error, 11));
                return;
            default:
                AndroidUtilities.runOnUIThread(new gg.j((Object) ((ph.f1) this.f40233c), tLObject, this.f40232b, (TLObject) ((TLRPC.TL_messages_getInlineBotResults) this.d), (String) this.e, 20));
                return;
        }
    }

    public yd(Object obj, Object obj2, boolean z4, Serializable serializable, int i10) {
        this.f40231a = i10;
        this.f40233c = obj;
        this.d = obj2;
        this.f40232b = z4;
        this.e = serializable;
    }

    public yd(ph.f1 f1Var, boolean z4, TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults, String str) {
        this.f40231a = 5;
        this.f40233c = f1Var;
        this.f40232b = z4;
        this.d = tL_messages_getInlineBotResults;
        this.e = str;
    }
}
