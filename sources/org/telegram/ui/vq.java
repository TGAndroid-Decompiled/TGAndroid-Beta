package org.telegram.ui;

import android.app.Activity;
import android.content.SharedPreferences;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class vq implements Utilities.Callback {
    public final int f39162a = 1;
    public final int f39163b;
    public final long f39164c;
    public final Object d;
    public final Object e;
    public final Object f39165f;
    public final Object f39166g;
    public final Serializable h;

    public vq(int i10, long j10, Activity activity, ArrayList arrayList, HashMap hashMap, Utilities.Callback callback, org.telegram.ui.ActionBar.f6 f6Var) {
        this.f39163b = i10;
        this.d = arrayList;
        this.f39164c = j10;
        this.e = activity;
        this.f39165f = f6Var;
        this.f39166g = callback;
        this.h = hashMap;
    }

    @Override
    public final void run(Object obj) {
        boolean z4;
        switch (this.f39162a) {
            case 0:
                rr rrVar = (rr) this.d;
                TLObject tLObject = (TLObject) this.e;
                TLRPC.TL_chatAdminRights tL_chatAdminRights = (TLRPC.TL_chatAdminRights) this.f39165f;
                TLRPC.TL_chatBannedRights tL_chatBannedRights = (TLRPC.TL_chatBannedRights) this.f39166g;
                String str = (String) this.h;
                int intValue = ((Integer) obj).intValue();
                boolean[] zArr = new boolean[1];
                if (!(tLObject instanceof TLRPC.TL_channelParticipantAdmin) && !(tLObject instanceof TLRPC.TL_chatParticipantAdmin)) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                long j10 = rrVar.K;
                TLRPC.TL_chatBannedRights tL_chatBannedRights2 = rrVar.B;
                long j11 = this.f39164c;
                yq yqVar = new yq(rrVar, j11, j10, tL_chatAdminRights, tL_chatBannedRights2, tL_chatBannedRights, str, intValue, zArr, j11);
                yqVar.U0 = new zq(rrVar, intValue, j11, this.f39163b, z4, zArr);
                rrVar.presentFragment(yqVar);
                return;
            default:
                final ArrayList arrayList = (ArrayList) this.d;
                final Activity activity = (Activity) this.e;
                final org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) this.f39165f;
                final Utilities.Callback callback = (Utilities.Callback) this.f39166g;
                final HashMap hashMap = (HashMap) this.h;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                final int i10 = this.f39163b;
                if (booleanValue) {
                    SharedPreferences.Editor edit = MessagesController.getInstance(i10).getMainSettings().edit();
                    int i11 = 0;
                    for (int size = arrayList.size(); i11 < size; size = size) {
                        Object obj2 = arrayList.get(i11);
                        i11++;
                        Long l10 = (Long) obj2;
                        long longValue = l10.longValue();
                        long sendPaidMessagesStars = MessagesController.getInstance(i10).getSendPaidMessagesStars(longValue);
                        if (sendPaidMessagesStars <= 0 && longValue > 0) {
                            sendPaidMessagesStars = DialogObject.getMessagesStarsPrice(MessagesController.getInstance(i10).isUserContactBlocked(longValue));
                        }
                        edit.putLong(e2.c.i(longValue, "ask_paid_message_", "_price"), sendPaidMessagesStars);
                        lh.t7.y(i10, false).O.put(l10, Long.valueOf(System.currentTimeMillis()));
                    }
                    edit.apply();
                }
                final long j12 = this.f39164c;
                Runnable runnable = new Runnable() {
                    @Override
                    public final void run() {
                        int i12 = i10;
                        long j13 = lh.t7.y(i12, false).p().amount;
                        long j14 = j12;
                        Utilities.Callback callback2 = callback;
                        HashMap hashMap2 = hashMap;
                        if (j13 < j14) {
                            Activity activity2 = activity;
                            if (activity2 == null) {
                                return;
                            }
                            long longValue2 = ((Long) arrayList.get(0)).longValue();
                            new lh.z9(activity2, f6Var, j14, 13, DialogObject.getShortName(i12, longValue2), new gg.b0(callback2, hashMap2, 1), longValue2).show();
                            return;
                        }
                        callback2.run(hashMap2);
                    }
                };
                if (!lh.t7.y(i10, false).e) {
                    lh.t7 y10 = lh.t7.y(i10, false);
                    y10.e = false;
                    y10.q(false, true, runnable);
                    y10.e = true;
                    return;
                }
                runnable.run();
                return;
        }
    }

    public vq(rr rrVar, long j10, int i10, TLObject tLObject, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z4) {
        this.d = rrVar;
        this.f39164c = j10;
        this.f39163b = i10;
        this.e = tLObject;
        this.f39165f = tL_chatAdminRights;
        this.f39166g = tL_chatBannedRights;
        this.h = str;
    }
}
