package org.telegram.ui;

import android.app.Activity;
import android.content.SharedPreferences;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Pattern;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class wq implements Utilities.Callback {
    public final int f42594a = 1;
    public final int f42595b;
    public final long f42596c;
    public final Object d;
    public final Object f42597e;
    public final Object f42598f;
    public final Object f42599g;
    public final Serializable h;

    public wq(int i10, long j3, Activity activity, ArrayList arrayList, HashMap hashMap, Utilities.Callback callback, org.telegram.ui.ActionBar.d6 d6Var) {
        this.f42595b = i10;
        this.d = arrayList;
        this.f42596c = j3;
        this.f42597e = activity;
        this.f42598f = d6Var;
        this.f42599g = callback;
        this.h = hashMap;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f42594a;
        boolean z10 = false;
        Serializable serializable = this.h;
        Object obj2 = this.f42599g;
        Object obj3 = this.f42598f;
        Object obj4 = this.f42597e;
        Object obj5 = this.d;
        switch (i10) {
            case 0:
                rr rrVar = (rr) obj5;
                TLObject tLObject = (TLObject) obj4;
                TLRPC.TL_chatAdminRights tL_chatAdminRights = (TLRPC.TL_chatAdminRights) obj3;
                TLRPC.TL_chatBannedRights tL_chatBannedRights = (TLRPC.TL_chatBannedRights) obj2;
                String str = (String) serializable;
                int intValue = ((Integer) obj).intValue();
                boolean[] zArr = new boolean[1];
                z10 = ((tLObject instanceof TLRPC.TL_channelParticipantAdmin) || (tLObject instanceof TLRPC.TL_chatParticipantAdmin)) ? true : true;
                long j3 = rrVar.N;
                TLRPC.TL_chatBannedRights tL_chatBannedRights2 = rrVar.E;
                long j10 = this.f42596c;
                zq zqVar = new zq(rrVar, j10, j3, tL_chatAdminRights, tL_chatBannedRights2, tL_chatBannedRights, str, intValue, zArr, j10);
                zqVar.X0 = new ar(rrVar, intValue, j10, this.f42595b, z10, zArr);
                rrVar.presentFragment(zqVar);
                return;
            case 1:
                final ArrayList arrayList = (ArrayList) obj5;
                final Activity activity = (Activity) obj4;
                final org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) obj3;
                final Utilities.Callback callback = (Utilities.Callback) obj2;
                final HashMap hashMap = (HashMap) serializable;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                final int i11 = this.f42595b;
                if (booleanValue) {
                    SharedPreferences.Editor edit = MessagesController.getInstance(i11).getMainSettings().edit();
                    int size = arrayList.size();
                    int i12 = 0;
                    while (i12 < size) {
                        Object obj6 = arrayList.get(i12);
                        i12++;
                        Long l4 = (Long) obj6;
                        long longValue = l4.longValue();
                        long sendPaidMessagesStars = MessagesController.getInstance(i11).getSendPaidMessagesStars(longValue);
                        if (sendPaidMessagesStars <= 0 && longValue > 0) {
                            sendPaidMessagesStars = DialogObject.getMessagesStarsPrice(MessagesController.getInstance(i11).isUserContactBlocked(longValue));
                        }
                        edit.putLong(org.telegram.ui.Cells.c1.j(longValue, "ask_paid_message_", "_price"), sendPaidMessagesStars);
                        yh.t5.y(i11, false).O.put(l4, Long.valueOf(System.currentTimeMillis()));
                    }
                    edit.apply();
                }
                final long j11 = this.f42596c;
                Runnable runnable = new Runnable() {
                    @Override
                    public final void run() {
                        int i13 = i11;
                        long j12 = yh.t5.y(i13, false).p().amount;
                        long j13 = j11;
                        Utilities.Callback callback2 = callback;
                        HashMap hashMap2 = hashMap;
                        if (j12 < j13) {
                            Activity activity2 = activity;
                            if (activity2 == null) {
                                return;
                            }
                            long longValue2 = ((Long) arrayList.get(0)).longValue();
                            new yh.m7(activity2, d6Var, j13, 13, DialogObject.getShortName(i13, longValue2), new b2(callback2, hashMap2, 0), longValue2).show();
                            return;
                        }
                        callback2.run(hashMap2);
                    }
                };
                if (!yh.t5.y(i11, false).f52019e) {
                    yh.t5 y3 = yh.t5.y(i11, false);
                    y3.f52019e = false;
                    y3.q(false, true, runnable);
                    y3.f52019e = true;
                    return;
                }
                runnable.run();
                return;
            default:
                Boolean bool = (Boolean) obj;
                Pattern pattern = LaunchActivity.B1;
                TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
                int i13 = this.f42595b;
                tL_messages_toggleBotInAttachMenu.bot = MessagesController.getInstance(i13).getInputUser(this.f42596c);
                tL_messages_toggleBotInAttachMenu.enabled = true;
                tL_messages_toggleBotInAttachMenu.write_allowed = true;
                ConnectionsManager.getInstance(i13).sendRequest(tL_messages_toggleBotInAttachMenu, new org.telegram.messenger.ii((LaunchActivity) obj5, i13, (uy) obj4, (org.telegram.ui.ActionBar.n2) obj3, (TLRPC.User) obj2, (String) serializable), 66);
                return;
        }
    }

    public wq(rr rrVar, long j3, int i10, TLObject tLObject, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z10) {
        this.d = rrVar;
        this.f42596c = j3;
        this.f42595b = i10;
        this.f42597e = tLObject;
        this.f42598f = tL_chatAdminRights;
        this.f42599g = tL_chatBannedRights;
        this.h = str;
    }

    public wq(LaunchActivity launchActivity, int i10, long j3, uy uyVar, org.telegram.ui.ActionBar.n2 n2Var, TLRPC.User user, String str) {
        this.d = launchActivity;
        this.f42595b = i10;
        this.f42596c = j3;
        this.f42597e = uyVar;
        this.f42598f = n2Var;
        this.f42599g = user;
        this.h = str;
    }
}
