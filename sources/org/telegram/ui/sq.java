package org.telegram.ui;

import android.app.Activity;
import android.content.SharedPreferences;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Pattern;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class sq implements org.telegram.messenger.r20 {
    public final int f41433a = 1;
    public final int f41434b;
    public final long f41435c;
    public final Object d;
    public final Object e;
    public final Object f41436f;
    public final Object f41437g;
    public final Serializable h;

    public sq(int i10, long j10, Activity activity, ArrayList arrayList, HashMap hashMap, org.telegram.messenger.r20 r20Var, org.telegram.ui.ActionBar.p6 p6Var) {
        this.f41434b = i10;
        this.d = arrayList;
        this.f41435c = j10;
        this.e = activity;
        this.f41436f = p6Var;
        this.f41437g = r20Var;
        this.h = hashMap;
    }

    @Override
    public final void a(Object obj) {
        int i10 = this.f41433a;
        boolean z10 = false;
        Serializable serializable = this.h;
        Object obj2 = this.f41437g;
        Object obj3 = this.f41436f;
        Object obj4 = this.e;
        Object obj5 = this.d;
        switch (i10) {
            case 0:
                pr prVar = (pr) obj5;
                TLObject tLObject = (TLObject) obj4;
                TLRPC.TL_chatAdminRights tL_chatAdminRights = (TLRPC.TL_chatAdminRights) obj3;
                TLRPC.TL_chatBannedRights tL_chatBannedRights = (TLRPC.TL_chatBannedRights) obj2;
                String str = (String) serializable;
                int intValue = ((Integer) obj).intValue();
                boolean[] zArr = new boolean[1];
                if ((tLObject instanceof TLRPC.TL_channelParticipantAdmin) || (tLObject instanceof TLRPC.TL_chatParticipantAdmin)) {
                    z10 = true;
                }
                long j10 = prVar.M;
                TLRPC.TL_chatBannedRights tL_chatBannedRights2 = prVar.D;
                long j11 = this.f41435c;
                vq vqVar = new vq(prVar, j11, j10, tL_chatAdminRights, tL_chatBannedRights2, tL_chatBannedRights, str, intValue, zArr, j11);
                vqVar.X0 = new wq(prVar, intValue, j11, this.f41434b, z10, zArr);
                prVar.presentFragment(vqVar);
                return;
            case 1:
                ArrayList arrayList = (ArrayList) obj5;
                Activity activity = (Activity) obj4;
                org.telegram.ui.ActionBar.p6 p6Var = (org.telegram.ui.ActionBar.p6) obj3;
                org.telegram.messenger.r20 r20Var = (org.telegram.messenger.r20) obj2;
                HashMap hashMap = (HashMap) serializable;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                int i11 = this.f41434b;
                if (booleanValue) {
                    SharedPreferences.Editor edit = org.telegram.messenger.wp.r1(i11).f7.edit();
                    int size = arrayList.size();
                    int i12 = 0;
                    while (i12 < size) {
                        Object obj6 = arrayList.get(i12);
                        i12++;
                        Long l4 = (Long) obj6;
                        long longValue = l4.longValue();
                        long M1 = org.telegram.messenger.wp.r1(i11).M1(longValue);
                        if (M1 <= 0 && longValue > 0) {
                            M1 = org.telegram.messenger.o5.k(org.telegram.messenger.wp.r1(i11).H2(longValue));
                        }
                        edit.putLong(org.telegram.ui.Cells.f1.n(longValue, "ask_paid_message_", "_price"), M1);
                        rh.e6.y(i11, false).O.put(l4, Long.valueOf(System.currentTimeMillis()));
                    }
                    edit.apply();
                }
                org.telegram.messenger.rb rbVar = new org.telegram.messenger.rb(i11, this.f41435c, activity, arrayList, hashMap, r20Var, p6Var);
                if (!rh.e6.y(i11, false).e) {
                    rh.e6 y3 = rh.e6.y(i11, false);
                    y3.e = false;
                    y3.q(rbVar, false, true);
                    y3.e = true;
                    return;
                }
                rbVar.run();
                return;
            default:
                Boolean bool = (Boolean) obj;
                Pattern pattern = LaunchActivity.D1;
                TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
                int i13 = this.f41434b;
                tL_messages_toggleBotInAttachMenu.bot = org.telegram.messenger.wp.r1(i13).n1(this.f41435c);
                tL_messages_toggleBotInAttachMenu.enabled = true;
                tL_messages_toggleBotInAttachMenu.write_allowed = true;
                ConnectionsManager.getInstance(i13).sendRequest(tL_messages_toggleBotInAttachMenu, new org.telegram.messenger.zx((LaunchActivity) obj5, i13, (zx) obj4, (org.telegram.ui.ActionBar.k2) obj3, (TLRPC.User) obj2, (String) serializable), 66);
                return;
        }
    }

    public sq(pr prVar, long j10, int i10, TLObject tLObject, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z10) {
        this.d = prVar;
        this.f41435c = j10;
        this.f41434b = i10;
        this.e = tLObject;
        this.f41436f = tL_chatAdminRights;
        this.f41437g = tL_chatBannedRights;
        this.h = str;
    }

    public sq(LaunchActivity launchActivity, int i10, long j10, zx zxVar, org.telegram.ui.ActionBar.k2 k2Var, TLRPC.User user, String str) {
        this.d = launchActivity;
        this.f41434b = i10;
        this.f41435c = j10;
        this.e = zxVar;
        this.f41436f = k2Var;
        this.f41437g = user;
        this.h = str;
    }
}
