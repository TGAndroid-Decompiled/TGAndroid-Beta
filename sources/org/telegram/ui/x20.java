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
public final class x20 implements RequestDelegate {
    public final int f39836a = 3;
    public final int f39837b;
    public final Object f39838c;
    public final long d;
    public final Object e;
    public final Object f39839f;
    public final Object f39840g;
    public final Object h;

    public x20(int i10, org.telegram.ui.ActionBar.d2 d2Var, Context context, long j10, org.telegram.ui.ActionBar.f6 f6Var, org.telegram.ui.web.u uVar, dh.v vVar) {
        this.f39837b = i10;
        this.e = d2Var;
        this.f39839f = context;
        this.d = j10;
        this.f39840g = f6Var;
        this.h = uVar;
        this.f39838c = vVar;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f39836a;
        Object obj = this.f39838c;
        Object obj2 = this.h;
        Object obj3 = this.f39840g;
        Object obj4 = this.f39839f;
        Object obj5 = this.e;
        switch (i10) {
            case 0:
                String str = (String) obj;
                c60.v((c60) obj5, this.d, (HashSet) obj4, (AtomicInteger) obj3, this.f39837b, (ChatObject.Call) obj2, str, tLObject, tL_error);
                return;
            case 1:
                Pattern pattern = LaunchActivity.f31612y1;
                AndroidUtilities.runOnUIThread(new m90((LaunchActivity) obj5, tLObject, this.f39837b, (String) obj, (String) obj4, (TLRPC.User) obj3, (String) obj2, this.d));
                return;
            case 2:
                Activity activity = (Activity) obj5;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) obj4;
                byte[] bArr = (byte[]) obj3;
                xn xnVar = (xn) obj2;
                MessageObject messageObject = (MessageObject) obj;
                if (tLObject != null) {
                    if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) {
                        AndroidUtilities.runOnUIThread(new lf.g0(tLObject, activity, f6Var, this.d, bArr, xnVar, messageObject));
                        return;
                    } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultReported) {
                        AndroidUtilities.runOnUIThread(new v21(xnVar, activity, f6Var, messageObject, 0), 200L);
                        return;
                    } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultAdsHidden) {
                        AndroidUtilities.runOnUIThread(new uh(xnVar, this.f39837b, messageObject), 200L);
                        return;
                    } else {
                        return;
                    }
                } else if (tL_error != null && "AD_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                    AndroidUtilities.runOnUIThread(new v21(xnVar, activity, f6Var, messageObject, 1), 200L);
                    return;
                } else {
                    return;
                }
            default:
                AndroidUtilities.runOnUIThread(new m90(tLObject, this.f39837b, (org.telegram.ui.ActionBar.d2) obj5, (Context) obj4, this.d, (org.telegram.ui.ActionBar.f6) obj3, (org.telegram.ui.web.u) obj2, (dh.v) obj));
                return;
        }
    }

    public x20(Activity activity, org.telegram.ui.ActionBar.f6 f6Var, long j10, byte[] bArr, xn xnVar, MessageObject messageObject, int i10) {
        this.e = activity;
        this.f39839f = f6Var;
        this.d = j10;
        this.f39840g = bArr;
        this.h = xnVar;
        this.f39838c = messageObject;
        this.f39837b = i10;
    }

    public x20(c60 c60Var, long j10, HashSet hashSet, AtomicInteger atomicInteger, int i10, ChatObject.Call call, String str) {
        this.e = c60Var;
        this.d = j10;
        this.f39839f = hashSet;
        this.f39840g = atomicInteger;
        this.f39837b = i10;
        this.h = call;
        this.f39838c = str;
    }

    public x20(LaunchActivity launchActivity, int i10, String str, String str2, TLRPC.User user, String str3, long j10) {
        this.e = launchActivity;
        this.f39837b = i10;
        this.f39838c = str;
        this.f39839f = str2;
        this.f39840g = user;
        this.h = str3;
        this.d = j10;
    }
}
