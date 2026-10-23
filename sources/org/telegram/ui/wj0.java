package org.telegram.ui;

import android.content.SharedPreferences;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class wj0 implements xx, org.telegram.ui.ActionBar.z1, c11 {
    public final NotificationsCustomSettingsActivity f43383a;

    public wj0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity) {
        this.f43383a = notificationsCustomSettingsActivity;
    }

    @Override
    public boolean D() {
        return false;
    }

    @Override
    public boolean J(ey eyVar) {
        return false;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f43383a;
        SharedPreferences.Editor edit = notificationsCustomSettingsActivity.getNotificationsSettings().edit();
        int size = notificationsCustomSettingsActivity.f33514w.size();
        for (int i11 = 0; i11 < size; i11++) {
            ik0 ik0Var = (ik0) notificationsCustomSettingsActivity.f33514w.get(i11);
            if (notificationsCustomSettingsActivity.f33513s == 3) {
                edit.remove("stories_" + ik0Var.d);
            } else {
                edit.remove("notify2_" + ik0Var.d).remove("custom_" + ik0Var.d);
            }
            notificationsCustomSettingsActivity.getMessagesStorage().setDialogFlags(ik0Var.d, 0L);
            TLRPC.Dialog dialog = (TLRPC.Dialog) notificationsCustomSettingsActivity.getMessagesController().dialogs_dict.f(ik0Var.d);
            if (dialog != null) {
                dialog.notify_settings = new TLRPC.TL_peerNotifySettings();
            }
        }
        edit.commit();
        int size2 = notificationsCustomSettingsActivity.f33514w.size();
        for (int i12 = 0; i12 < size2; i12++) {
            notificationsCustomSettingsActivity.getNotificationsController().updateServerNotificationsSettings(((ik0) notificationsCustomSettingsActivity.f33514w.get(i12)).d, 0, false);
        }
        notificationsCustomSettingsActivity.f33514w.clear();
        notificationsCustomSettingsActivity.f33515x.clear();
        notificationsCustomSettingsActivity.l0(true);
        notificationsCustomSettingsActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.notificationsSettingsUpdated, new Object[0]);
    }

    @Override
    public void r(ik0 ik0Var) {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f43383a;
        notificationsCustomSettingsActivity.f33514w.add(0, ik0Var);
        notificationsCustomSettingsActivity.l0(true);
    }

    @Override
    public boolean w(ey eyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, ye1 ye1Var) {
        int i12 = 0;
        long j10 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f43383a;
        if (notificationsCustomSettingsActivity.f33513s == 3) {
            ArrayList arrayList2 = notificationsCustomSettingsActivity.v;
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    if (((ik0) it.next()).d == j10) {
                        it.remove();
                    }
                }
            }
            ArrayList arrayList3 = notificationsCustomSettingsActivity.f33514w;
            if (arrayList3 != null) {
                Iterator it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    if (((ik0) it2.next()).d == j10) {
                        it2.remove();
                    }
                }
            }
            ?? obj = new Object();
            obj.d = j10;
            obj.e = true;
            Boolean bool = notificationsCustomSettingsActivity.f33511n;
            if (bool != null && bool.booleanValue()) {
                i12 = Integer.MAX_VALUE;
            }
            obj.f38256c = i12;
            if (notificationsCustomSettingsActivity.f33514w == null) {
                notificationsCustomSettingsActivity.f33514w = new ArrayList();
            }
            notificationsCustomSettingsActivity.f33514w.add(obj);
            notificationsCustomSettingsActivity.l0(true);
            return true;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", j10);
        bundle.putBoolean("exception", true);
        d11 d11Var = new d11(bundle, notificationsCustomSettingsActivity.getResourceProvider());
        d11Var.f36476r = new wj0(notificationsCustomSettingsActivity);
        notificationsCustomSettingsActivity.presentFragment(d11Var, true);
        return true;
    }

    @Override
    public void O() {
    }
}
