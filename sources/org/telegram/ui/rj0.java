package org.telegram.ui;

import android.content.SharedPreferences;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class rj0 implements vx, org.telegram.ui.ActionBar.a2, y01 {
    public final NotificationsCustomSettingsActivity f41225a;

    public rj0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity) {
        this.f41225a = notificationsCustomSettingsActivity;
    }

    @Override
    public boolean D() {
        return false;
    }

    @Override
    public boolean J(cy cyVar) {
        return false;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f41225a;
        SharedPreferences.Editor edit = notificationsCustomSettingsActivity.getNotificationsSettings().edit();
        int size = notificationsCustomSettingsActivity.f33206w.size();
        for (int i11 = 0; i11 < size; i11++) {
            ek0 ek0Var = (ek0) notificationsCustomSettingsActivity.f33206w.get(i11);
            if (notificationsCustomSettingsActivity.f33205s == 3) {
                edit.remove("stories_" + ek0Var.d);
            } else {
                edit.remove("notify2_" + ek0Var.d).remove("custom_" + ek0Var.d);
            }
            notificationsCustomSettingsActivity.getMessagesStorage().setDialogFlags(ek0Var.d, 0L);
            TLRPC.Dialog dialog = (TLRPC.Dialog) notificationsCustomSettingsActivity.getMessagesController().dialogs_dict.f(ek0Var.d);
            if (dialog != null) {
                dialog.notify_settings = new TLRPC.TL_peerNotifySettings();
            }
        }
        edit.commit();
        int size2 = notificationsCustomSettingsActivity.f33206w.size();
        for (int i12 = 0; i12 < size2; i12++) {
            notificationsCustomSettingsActivity.getNotificationsController().updateServerNotificationsSettings(((ek0) notificationsCustomSettingsActivity.f33206w.get(i12)).d, 0, false);
        }
        notificationsCustomSettingsActivity.f33206w.clear();
        notificationsCustomSettingsActivity.f33207x.clear();
        notificationsCustomSettingsActivity.l0(true);
        notificationsCustomSettingsActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.notificationsSettingsUpdated, new Object[0]);
    }

    @Override
    public void r(ek0 ek0Var) {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f41225a;
        notificationsCustomSettingsActivity.f33206w.add(0, ek0Var);
        notificationsCustomSettingsActivity.l0(true);
    }

    @Override
    public boolean w(cy cyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, re1 re1Var) {
        int i12 = 0;
        long j10 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f41225a;
        if (notificationsCustomSettingsActivity.f33205s == 3) {
            ArrayList arrayList2 = notificationsCustomSettingsActivity.v;
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    if (((ek0) it.next()).d == j10) {
                        it.remove();
                    }
                }
            }
            ArrayList arrayList3 = notificationsCustomSettingsActivity.f33206w;
            if (arrayList3 != null) {
                Iterator it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    if (((ek0) it2.next()).d == j10) {
                        it2.remove();
                    }
                }
            }
            ?? obj = new Object();
            obj.d = j10;
            obj.e = true;
            Boolean bool = notificationsCustomSettingsActivity.f33203n;
            if (bool != null && bool.booleanValue()) {
                i12 = Integer.MAX_VALUE;
            }
            obj.f36683c = i12;
            if (notificationsCustomSettingsActivity.f33206w == null) {
                notificationsCustomSettingsActivity.f33206w = new ArrayList();
            }
            notificationsCustomSettingsActivity.f33206w.add(obj);
            notificationsCustomSettingsActivity.l0(true);
            return true;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", j10);
        bundle.putBoolean("exception", true);
        z01 z01Var = new z01(bundle, notificationsCustomSettingsActivity.getResourceProvider());
        z01Var.f43591r = new rj0(notificationsCustomSettingsActivity);
        notificationsCustomSettingsActivity.presentFragment(z01Var, true);
        return true;
    }

    @Override
    public void O() {
    }
}
