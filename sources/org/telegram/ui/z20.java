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
public final class z20 implements RequestDelegate {
    public final int f40379a = 3;
    public final int f40380b;
    public final Object f40381c;
    public final long d;
    public final Object e;
    public final Object f40382f;
    public final Object f40383g;
    public final Object h;

    public z20(int i10, org.telegram.ui.ActionBar.d2 d2Var, Context context, long j10, org.telegram.ui.ActionBar.f6 f6Var, org.telegram.ui.web.t tVar, kh.a0 a0Var) {
        this.f40380b = i10;
        this.e = d2Var;
        this.f40382f = context;
        this.d = j10;
        this.f40383g = f6Var;
        this.h = tVar;
        this.f40381c = a0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f40379a;
        Object obj = this.f40381c;
        Object obj2 = this.h;
        Object obj3 = this.f40383g;
        Object obj4 = this.f40382f;
        Object obj5 = this.e;
        switch (i10) {
            case 0:
                String str = (String) obj;
                e60.v((e60) obj5, this.d, (HashSet) obj4, (AtomicInteger) obj3, this.f40380b, (ChatObject.Call) obj2, str, tLObject, tL_error);
                return;
            case 1:
                Pattern pattern = LaunchActivity.f31586y1;
                AndroidUtilities.runOnUIThread(new o90((LaunchActivity) obj5, tLObject, this.f40380b, (String) obj, (String) obj4, (TLRPC.User) obj3, (String) obj2, this.d));
                return;
            case 2:
                Activity activity = (Activity) obj5;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) obj4;
                byte[] bArr = (byte[]) obj3;
                zn znVar = (zn) obj2;
                MessageObject messageObject = (MessageObject) obj;
                if (tLObject != null) {
                    if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) {
                        AndroidUtilities.runOnUIThread(new kf.g0(tLObject, activity, f6Var, this.d, bArr, znVar, messageObject));
                        return;
                    } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultReported) {
                        AndroidUtilities.runOnUIThread(new c31(znVar, activity, f6Var, messageObject, 0), 200L);
                        return;
                    } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultAdsHidden) {
                        AndroidUtilities.runOnUIThread(new wh(znVar, this.f40380b, messageObject), 200L);
                        return;
                    } else {
                        return;
                    }
                } else if (tL_error != null && "AD_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                    AndroidUtilities.runOnUIThread(new c31(znVar, activity, f6Var, messageObject, 1), 200L);
                    return;
                } else {
                    return;
                }
            default:
                AndroidUtilities.runOnUIThread(new o90(tLObject, this.f40380b, (org.telegram.ui.ActionBar.d2) obj5, (Context) obj4, this.d, (org.telegram.ui.ActionBar.f6) obj3, (org.telegram.ui.web.t) obj2, (kh.a0) obj));
                return;
        }
    }

    public z20(Activity activity, org.telegram.ui.ActionBar.f6 f6Var, long j10, byte[] bArr, zn znVar, MessageObject messageObject, int i10) {
        this.e = activity;
        this.f40382f = f6Var;
        this.d = j10;
        this.f40383g = bArr;
        this.h = znVar;
        this.f40381c = messageObject;
        this.f40380b = i10;
    }

    public z20(e60 e60Var, long j10, HashSet hashSet, AtomicInteger atomicInteger, int i10, ChatObject.Call call, String str) {
        this.e = e60Var;
        this.d = j10;
        this.f40382f = hashSet;
        this.f40383g = atomicInteger;
        this.f40380b = i10;
        this.h = call;
        this.f40381c = str;
    }

    public z20(LaunchActivity launchActivity, int i10, String str, String str2, TLRPC.User user, String str3, long j10) {
        this.e = launchActivity;
        this.f40380b = i10;
        this.f40381c = str;
        this.f40382f = str2;
        this.f40383g = user;
        this.h = str3;
        this.d = j10;
    }
}
