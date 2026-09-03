package org.telegram.ui;

import android.content.SharedPreferences;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class zj0 implements ky, org.telegram.ui.ActionBar.c2, k11 {
    public final NotificationsCustomSettingsActivity f40495a;

    public zj0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity) {
        this.f40495a = notificationsCustomSettingsActivity;
    }

    @Override
    public boolean C() {
        return false;
    }

    @Override
    public boolean I(qy qyVar) {
        return false;
    }

    @Override
    public void l(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f40495a;
        SharedPreferences.Editor edit = notificationsCustomSettingsActivity.getNotificationsSettings().edit();
        int size = notificationsCustomSettingsActivity.f31643w.size();
        for (int i11 = 0; i11 < size; i11++) {
            lk0 lk0Var = (lk0) notificationsCustomSettingsActivity.f31643w.get(i11);
            if (notificationsCustomSettingsActivity.f31642s == 3) {
                edit.remove("stories_" + lk0Var.d);
            } else {
                SharedPreferences.Editor remove = edit.remove("notify2_" + lk0Var.d);
                remove.remove("custom_" + lk0Var.d);
            }
            notificationsCustomSettingsActivity.getMessagesStorage().setDialogFlags(lk0Var.d, 0L);
            TLRPC.Dialog dialog = (TLRPC.Dialog) notificationsCustomSettingsActivity.getMessagesController().dialogs_dict.f(lk0Var.d);
            if (dialog != null) {
                dialog.notify_settings = new TLRPC.TL_peerNotifySettings();
            }
        }
        edit.commit();
        int size2 = notificationsCustomSettingsActivity.f31643w.size();
        for (int i12 = 0; i12 < size2; i12++) {
            notificationsCustomSettingsActivity.getNotificationsController().updateServerNotificationsSettings(((lk0) notificationsCustomSettingsActivity.f31643w.get(i12)).d, 0, false);
        }
        notificationsCustomSettingsActivity.f31643w.clear();
        notificationsCustomSettingsActivity.f31644x.clear();
        notificationsCustomSettingsActivity.l0(true);
        notificationsCustomSettingsActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.notificationsSettingsUpdated, new Object[0]);
    }

    @Override
    public void v(lk0 lk0Var) {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f40495a;
        notificationsCustomSettingsActivity.f31643w.add(0, lk0Var);
        notificationsCustomSettingsActivity.l0(true);
    }

    @Override
    public boolean w(qy qyVar, ArrayList arrayList, CharSequence charSequence, boolean z4, boolean z10, int i10, int i11, sf1 sf1Var) {
        int i12 = 0;
        long j10 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f40495a;
        if (notificationsCustomSettingsActivity.f31642s == 3) {
            ArrayList arrayList2 = notificationsCustomSettingsActivity.v;
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    if (((lk0) it.next()).d == j10) {
                        it.remove();
                    }
                }
            }
            ArrayList arrayList3 = notificationsCustomSettingsActivity.f31643w;
            if (arrayList3 != null) {
                Iterator it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    if (((lk0) it2.next()).d == j10) {
                        it2.remove();
                    }
                }
            }
            ?? obj = new Object();
            obj.d = j10;
            obj.e = true;
            Boolean bool = notificationsCustomSettingsActivity.f31640n;
            if (bool != null && bool.booleanValue()) {
                i12 = Integer.MAX_VALUE;
            }
            obj.f35797c = i12;
            if (notificationsCustomSettingsActivity.f31643w == null) {
                notificationsCustomSettingsActivity.f31643w = new ArrayList();
            }
            notificationsCustomSettingsActivity.f31643w.add(obj);
            notificationsCustomSettingsActivity.l0(true);
            return true;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", j10);
        bundle.putBoolean("exception", true);
        l11 l11Var = new l11(bundle, notificationsCustomSettingsActivity.getResourceProvider());
        l11Var.f35623r = new zj0(notificationsCustomSettingsActivity);
        notificationsCustomSettingsActivity.presentFragment(l11Var, true);
        return true;
    }

    @Override
    public void b0() {
    }
}
