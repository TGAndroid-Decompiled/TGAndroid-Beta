package org.telegram.ui;

import android.app.Activity;
import android.content.SharedPreferences;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class vp implements org.telegram.messenger.z10 {
    public final int f52259a = 1;
    public final int f52260b;
    public final long f52261c;
    public final Object d;
    public final Object f52262e;
    public final Object f52263f;
    public final Object f52264g;
    public final Serializable h;

    public vp(int i7, long j3, Activity activity, ArrayList arrayList, HashMap hashMap, org.telegram.messenger.z10 z10Var, org.telegram.ui.ActionBar.e6 e6Var) {
        this.f52260b = i7;
        this.d = arrayList;
        this.f52261c = j3;
        this.f52262e = activity;
        this.f52263f = e6Var;
        this.f52264g = z10Var;
        this.h = hashMap;
    }

    @Override
    public final void a(Object obj) {
        int i7 = this.f52259a;
        boolean z10 = false;
        Serializable serializable = this.h;
        Object obj2 = this.f52264g;
        Object obj3 = this.f52263f;
        Object obj4 = this.f52262e;
        Object obj5 = this.d;
        switch (i7) {
            case 0:
                qq qqVar = (qq) obj5;
                TLObject tLObject = (TLObject) obj4;
                TLRPC.TL_chatAdminRights tL_chatAdminRights = (TLRPC.TL_chatAdminRights) obj3;
                TLRPC.TL_chatBannedRights tL_chatBannedRights = (TLRPC.TL_chatBannedRights) obj2;
                String str = (String) serializable;
                int intValue = ((Integer) obj).intValue();
                boolean[] zArr = new boolean[1];
                if ((tLObject instanceof TLRPC.TL_channelParticipantAdmin) || (tLObject instanceof TLRPC.TL_chatParticipantAdmin)) {
                    z10 = true;
                }
                long j3 = qqVar.N;
                TLRPC.TL_chatBannedRights tL_chatBannedRights2 = qqVar.E;
                long j10 = this.f52261c;
                yp ypVar = new yp(qqVar, j10, j3, tL_chatAdminRights, tL_chatBannedRights2, tL_chatBannedRights, str, intValue, zArr, j10);
                ypVar.Y0 = new zp(qqVar, intValue, j10, this.f52260b, z10, zArr);
                qqVar.presentFragment(ypVar);
                return;
            case 1:
                ArrayList arrayList = (ArrayList) obj5;
                Activity activity = (Activity) obj4;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) obj3;
                org.telegram.messenger.z10 z10Var = (org.telegram.messenger.z10) obj2;
                HashMap hashMap = (HashMap) serializable;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                int i10 = this.f52260b;
                if (booleanValue) {
                    SharedPreferences.Editor edit = org.telegram.messenger.np.s1(i10).f25283f7.edit();
                    int size = arrayList.size();
                    int i11 = 0;
                    while (i11 < size) {
                        Object obj6 = arrayList.get(i11);
                        i11++;
                        Long l10 = (Long) obj6;
                        long longValue = l10.longValue();
                        long N1 = org.telegram.messenger.np.s1(i10).N1(longValue);
                        if (N1 <= 0 && longValue > 0) {
                            N1 = org.telegram.messenger.m5.k(org.telegram.messenger.np.s1(i10).J2(longValue));
                        }
                        edit.putLong(r.b.j(longValue, "ask_paid_message_", "_price"), N1);
                        di.u8.y(i10, false).O.put(l10, Long.valueOf(System.currentTimeMillis()));
                    }
                    edit.apply();
                }
                org.telegram.messenger.ob obVar = new org.telegram.messenger.ob(i10, this.f52261c, activity, arrayList, hashMap, z10Var, e6Var);
                if (!di.u8.y(i10, false).f9532e) {
                    di.u8 y10 = di.u8.y(i10, false);
                    y10.f9532e = false;
                    y10.q(obVar, false, true);
                    y10.f9532e = true;
                    return;
                }
                obVar.run();
                return;
            default:
                Boolean bool = (Boolean) obj;
                String str2 = LaunchActivity.C1;
                TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
                int i12 = this.f52260b;
                tL_messages_toggleBotInAttachMenu.bot = org.telegram.messenger.np.s1(i12).o1(this.f52261c);
                tL_messages_toggleBotInAttachMenu.enabled = true;
                tL_messages_toggleBotInAttachMenu.write_allowed = true;
                ConnectionsManager.getInstance(i12).sendRequest(tL_messages_toggleBotInAttachMenu, new org.telegram.messenger.lx((LaunchActivity) obj5, i12, (yw) obj4, (org.telegram.ui.ActionBar.e2) obj3, (TLRPC.User) obj2, (String) serializable), 66);
                return;
        }
    }

    public vp(qq qqVar, long j3, int i7, TLObject tLObject, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z10) {
        this.d = qqVar;
        this.f52261c = j3;
        this.f52260b = i7;
        this.f52262e = tLObject;
        this.f52263f = tL_chatAdminRights;
        this.f52264g = tL_chatBannedRights;
        this.h = str;
    }

    public vp(LaunchActivity launchActivity, int i7, long j3, yw ywVar, org.telegram.ui.ActionBar.e2 e2Var, TLRPC.User user, String str) {
        this.d = launchActivity;
        this.f52260b = i7;
        this.f52261c = j3;
        this.f52262e = ywVar;
        this.f52263f = e2Var;
        this.f52264g = user;
        this.h = str;
    }
}
