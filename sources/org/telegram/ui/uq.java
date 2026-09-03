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
public final class uq implements Utilities.Callback {
    public final int f41902a = 1;
    public final int f41903b;
    public final long f41904c;
    public final Object d;
    public final Object f41905e;
    public final Object f41906f;
    public final Object f41907g;
    public final Serializable h;

    public uq(int i10, long j10, Activity activity, ArrayList arrayList, HashMap hashMap, Utilities.Callback callback, org.telegram.ui.ActionBar.g6 g6Var) {
        this.f41903b = i10;
        this.d = arrayList;
        this.f41904c = j10;
        this.f41905e = activity;
        this.f41906f = g6Var;
        this.f41907g = callback;
        this.h = hashMap;
    }

    @Override
    public final void run(Object obj) {
        boolean z4;
        switch (this.f41902a) {
            case 0:
                qr qrVar = (qr) this.d;
                TLObject tLObject = (TLObject) this.f41905e;
                TLRPC.TL_chatAdminRights tL_chatAdminRights = (TLRPC.TL_chatAdminRights) this.f41906f;
                TLRPC.TL_chatBannedRights tL_chatBannedRights = (TLRPC.TL_chatBannedRights) this.f41907g;
                String str = (String) this.h;
                int intValue = ((Integer) obj).intValue();
                boolean[] zArr = new boolean[1];
                if (!(tLObject instanceof TLRPC.TL_channelParticipantAdmin) && !(tLObject instanceof TLRPC.TL_chatParticipantAdmin)) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                long j10 = qrVar.K;
                TLRPC.TL_chatBannedRights tL_chatBannedRights2 = qrVar.B;
                long j11 = this.f41904c;
                xq xqVar = new xq(qrVar, j11, j10, tL_chatAdminRights, tL_chatBannedRights2, tL_chatBannedRights, str, intValue, zArr, j11);
                xqVar.U0 = new yq(qrVar, intValue, j11, this.f41903b, z4, zArr);
                qrVar.presentFragment(xqVar);
                return;
            default:
                final ArrayList arrayList = (ArrayList) this.d;
                final Activity activity = (Activity) this.f41905e;
                final org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) this.f41906f;
                final Utilities.Callback callback = (Utilities.Callback) this.f41907g;
                final HashMap hashMap = (HashMap) this.h;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                final int i10 = this.f41903b;
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
                        mh.t7.y(i10, false).O.put(l10, Long.valueOf(System.currentTimeMillis()));
                    }
                    edit.apply();
                }
                final long j12 = this.f41904c;
                Runnable runnable = new Runnable() {
                    @Override
                    public final void run() {
                        int i12 = i10;
                        long j13 = mh.t7.y(i12, false).p().amount;
                        long j14 = j12;
                        Utilities.Callback callback2 = callback;
                        HashMap hashMap2 = hashMap;
                        if (j13 < j14) {
                            Activity activity2 = activity;
                            if (activity2 == null) {
                                return;
                            }
                            long longValue2 = ((Long) arrayList.get(0)).longValue();
                            new mh.z9(activity2, g6Var, j14, 13, DialogObject.getShortName(i12, longValue2), new hg.b0(callback2, hashMap2, 1), longValue2).show();
                            return;
                        }
                        callback2.run(hashMap2);
                    }
                };
                if (!mh.t7.y(i10, false).f14833e) {
                    mh.t7 y10 = mh.t7.y(i10, false);
                    y10.f14833e = false;
                    y10.q(false, true, runnable);
                    y10.f14833e = true;
                    return;
                }
                runnable.run();
                return;
        }
    }

    public uq(qr qrVar, long j10, int i10, TLObject tLObject, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z4) {
        this.d = qrVar;
        this.f41904c = j10;
        this.f41903b = i10;
        this.f41905e = tLObject;
        this.f41906f = tL_chatAdminRights;
        this.f41907g = tL_chatBannedRights;
        this.h = str;
    }
}
