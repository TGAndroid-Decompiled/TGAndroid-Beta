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
public final class xq implements Utilities.Callback {
    public final int f44196a = 1;
    public final int f44197b;
    public final long f44198c;
    public final Object d;
    public final Object f44199e;
    public final Object f44200f;
    public final Object f44201g;
    public final Serializable h;

    public xq(int i10, long j3, Activity activity, ArrayList arrayList, HashMap hashMap, Utilities.Callback callback, org.telegram.ui.ActionBar.d6 d6Var) {
        this.f44197b = i10;
        this.d = arrayList;
        this.f44198c = j3;
        this.f44199e = activity;
        this.f44200f = d6Var;
        this.f44201g = callback;
        this.h = hashMap;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f44196a;
        boolean z10 = false;
        Serializable serializable = this.h;
        Object obj2 = this.f44201g;
        Object obj3 = this.f44200f;
        Object obj4 = this.f44199e;
        Object obj5 = this.d;
        switch (i10) {
            case 0:
                sr srVar = (sr) obj5;
                TLObject tLObject = (TLObject) obj4;
                TLRPC.TL_chatAdminRights tL_chatAdminRights = (TLRPC.TL_chatAdminRights) obj3;
                TLRPC.TL_chatBannedRights tL_chatBannedRights = (TLRPC.TL_chatBannedRights) obj2;
                String str = (String) serializable;
                int intValue = ((Integer) obj).intValue();
                boolean[] zArr = new boolean[1];
                if ((tLObject instanceof TLRPC.TL_channelParticipantAdmin) || (tLObject instanceof TLRPC.TL_chatParticipantAdmin)) {
                    z10 = true;
                }
                long j3 = srVar.N;
                TLRPC.TL_chatBannedRights tL_chatBannedRights2 = srVar.E;
                long j10 = this.f44198c;
                ar arVar = new ar(srVar, j10, j3, tL_chatAdminRights, tL_chatBannedRights2, tL_chatBannedRights, str, intValue, zArr, j10);
                arVar.X0 = new br(srVar, intValue, j10, this.f44197b, z10, zArr);
                srVar.presentFragment(arVar);
                return;
            case 1:
                ArrayList arrayList = (ArrayList) obj5;
                Activity activity = (Activity) obj4;
                org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) obj3;
                Utilities.Callback callback = (Utilities.Callback) obj2;
                HashMap hashMap = (HashMap) serializable;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                int i11 = this.f44197b;
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
                        edit.putLong(org.telegram.ui.Cells.c1.h(longValue, "ask_paid_message_", "_price"), sendPaidMessagesStars);
                        yh.n5.y(i11, false).O.put(l4, Long.valueOf(System.currentTimeMillis()));
                    }
                    edit.apply();
                }
                org.telegram.ui.Components.m1 m1Var = new org.telegram.ui.Components.m1(i11, this.f44198c, activity, arrayList, hashMap, callback, d6Var);
                if (!yh.n5.y(i11, false).f53034e) {
                    yh.n5 y3 = yh.n5.y(i11, false);
                    y3.f53034e = false;
                    y3.q(false, true, m1Var);
                    y3.f53034e = true;
                    return;
                }
                m1Var.run();
                return;
            default:
                Boolean bool = (Boolean) obj;
                Pattern pattern = LaunchActivity.B1;
                TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
                int i13 = this.f44197b;
                tL_messages_toggleBotInAttachMenu.bot = MessagesController.getInstance(i13).getInputUser(this.f44198c);
                tL_messages_toggleBotInAttachMenu.enabled = true;
                tL_messages_toggleBotInAttachMenu.write_allowed = true;
                ConnectionsManager.getInstance(i13).sendRequest(tL_messages_toggleBotInAttachMenu, new org.telegram.messenger.ki((LaunchActivity) obj5, i13, (sy) obj4, (org.telegram.ui.ActionBar.m2) obj3, (TLRPC.User) obj2, (String) serializable), 66);
                return;
        }
    }

    public xq(sr srVar, long j3, int i10, TLObject tLObject, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z10) {
        this.d = srVar;
        this.f44198c = j3;
        this.f44197b = i10;
        this.f44199e = tLObject;
        this.f44200f = tL_chatAdminRights;
        this.f44201g = tL_chatBannedRights;
        this.h = str;
    }

    public xq(LaunchActivity launchActivity, int i10, long j3, sy syVar, org.telegram.ui.ActionBar.m2 m2Var, TLRPC.User user, String str) {
        this.d = launchActivity;
        this.f44197b = i10;
        this.f44198c = j3;
        this.f44199e = syVar;
        this.f44200f = m2Var;
        this.f44201g = user;
        this.h = str;
    }
}
