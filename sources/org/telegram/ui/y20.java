package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class y20 implements RequestDelegate {
    public final int f43522a = 3;
    public final int f43523b;
    public final Object f43524c;
    public final long d;
    public final Object f43525e;
    public final Object f43526f;
    public final Object f43527g;
    public final Object h;

    public y20(int i10, org.telegram.ui.ActionBar.d2 d2Var, Context context, long j10, org.telegram.ui.ActionBar.g6 g6Var, org.telegram.ui.web.u uVar, eh.w wVar) {
        this.f43523b = i10;
        this.f43525e = d2Var;
        this.f43526f = context;
        this.d = j10;
        this.f43527g = g6Var;
        this.h = uVar;
        this.f43524c = wVar;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f43522a;
        Object obj = this.f43524c;
        Object obj2 = this.h;
        Object obj3 = this.f43527g;
        Object obj4 = this.f43526f;
        Object obj5 = this.f43525e;
        switch (i10) {
            case 0:
                String str = (String) obj;
                d60.v((d60) obj5, this.d, (HashSet) obj4, (AtomicInteger) obj3, this.f43523b, (ChatObject.Call) obj2, str, tLObject, tL_error);
                return;
            case 1:
                Pattern pattern = LaunchActivity.f34134y1;
                AndroidUtilities.runOnUIThread(new n90((LaunchActivity) obj5, tLObject, this.f43523b, (String) obj, (String) obj4, (TLRPC.User) obj3, (String) obj2, this.d));
                return;
            case 2:
                Activity activity = (Activity) obj5;
                org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) obj4;
                byte[] bArr = (byte[]) obj3;
                xn xnVar = (xn) obj2;
                MessageObject messageObject = (MessageObject) obj;
                if (tLObject != null) {
                    if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) {
                        AndroidUtilities.runOnUIThread(new lf.g0(tLObject, activity, g6Var, this.d, bArr, xnVar, messageObject));
                        return;
                    } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultReported) {
                        AndroidUtilities.runOnUIThread(new x21(xnVar, activity, g6Var, messageObject, 0), 200L);
                        return;
                    } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultAdsHidden) {
                        AndroidUtilities.runOnUIThread(new uh(xnVar, this.f43523b, messageObject), 200L);
                        return;
                    } else {
                        return;
                    }
                } else if (tL_error != null && "AD_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                    AndroidUtilities.runOnUIThread(new x21(xnVar, activity, g6Var, messageObject, 1), 200L);
                    return;
                } else {
                    return;
                }
            default:
                AndroidUtilities.runOnUIThread(new n90(tLObject, this.f43523b, (org.telegram.ui.ActionBar.d2) obj5, (Context) obj4, this.d, (org.telegram.ui.ActionBar.g6) obj3, (org.telegram.ui.web.u) obj2, (eh.w) obj));
                return;
        }
    }

    public y20(Activity activity, org.telegram.ui.ActionBar.g6 g6Var, long j10, byte[] bArr, xn xnVar, MessageObject messageObject, int i10) {
        this.f43525e = activity;
        this.f43526f = g6Var;
        this.d = j10;
        this.f43527g = bArr;
        this.h = xnVar;
        this.f43524c = messageObject;
        this.f43523b = i10;
    }

    public y20(d60 d60Var, long j10, HashSet hashSet, AtomicInteger atomicInteger, int i10, ChatObject.Call call, String str) {
        this.f43525e = d60Var;
        this.d = j10;
        this.f43526f = hashSet;
        this.f43527g = atomicInteger;
        this.f43523b = i10;
        this.h = call;
        this.f43524c = str;
    }

    public y20(LaunchActivity launchActivity, int i10, String str, String str2, TLRPC.User user, String str3, long j10) {
        this.f43525e = launchActivity;
        this.f43523b = i10;
        this.f43524c = str;
        this.f43526f = str2;
        this.f43527g = user;
        this.h = str3;
        this.d = j10;
    }
}
