package org.telegram.ui;

import android.content.SharedPreferences;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class xj0 implements iy, org.telegram.ui.ActionBar.c2, d11 {
    public final NotificationsCustomSettingsActivity f39929a;

    public xj0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity) {
        this.f39929a = notificationsCustomSettingsActivity;
    }

    @Override
    public boolean C() {
        return false;
    }

    @Override
    public boolean K(oy oyVar) {
        return false;
    }

    @Override
    public void i(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f39929a;
        SharedPreferences.Editor edit = notificationsCustomSettingsActivity.getNotificationsSettings().edit();
        int size = notificationsCustomSettingsActivity.f31669w.size();
        for (int i11 = 0; i11 < size; i11++) {
            jk0 jk0Var = (jk0) notificationsCustomSettingsActivity.f31669w.get(i11);
            if (notificationsCustomSettingsActivity.f31668s == 3) {
                edit.remove("stories_" + jk0Var.d);
            } else {
                SharedPreferences.Editor remove = edit.remove("notify2_" + jk0Var.d);
                remove.remove("custom_" + jk0Var.d);
            }
            notificationsCustomSettingsActivity.getMessagesStorage().setDialogFlags(jk0Var.d, 0L);
            TLRPC.Dialog dialog = (TLRPC.Dialog) notificationsCustomSettingsActivity.getMessagesController().dialogs_dict.f(jk0Var.d);
            if (dialog != null) {
                dialog.notify_settings = new TLRPC.TL_peerNotifySettings();
            }
        }
        edit.commit();
        int size2 = notificationsCustomSettingsActivity.f31669w.size();
        for (int i12 = 0; i12 < size2; i12++) {
            notificationsCustomSettingsActivity.getNotificationsController().updateServerNotificationsSettings(((jk0) notificationsCustomSettingsActivity.f31669w.get(i12)).d, 0, false);
        }
        notificationsCustomSettingsActivity.f31669w.clear();
        notificationsCustomSettingsActivity.f31670x.clear();
        notificationsCustomSettingsActivity.l0(true);
        notificationsCustomSettingsActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.notificationsSettingsUpdated, new Object[0]);
    }

    @Override
    public void v(jk0 jk0Var) {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f39929a;
        notificationsCustomSettingsActivity.f31669w.add(0, jk0Var);
        notificationsCustomSettingsActivity.l0(true);
    }

    @Override
    public boolean w(oy oyVar, ArrayList arrayList, CharSequence charSequence, boolean z4, boolean z10, int i10, int i11, kf1 kf1Var) {
        int i12 = 0;
        long j10 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f39929a;
        if (notificationsCustomSettingsActivity.f31668s == 3) {
            ArrayList arrayList2 = notificationsCustomSettingsActivity.v;
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    if (((jk0) it.next()).d == j10) {
                        it.remove();
                    }
                }
            }
            ArrayList arrayList3 = notificationsCustomSettingsActivity.f31669w;
            if (arrayList3 != null) {
                Iterator it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    if (((jk0) it2.next()).d == j10) {
                        it2.remove();
                    }
                }
            }
            ?? obj = new Object();
            obj.d = j10;
            obj.e = true;
            Boolean bool = notificationsCustomSettingsActivity.f31666n;
            if (bool != null && bool.booleanValue()) {
                i12 = Integer.MAX_VALUE;
            }
            obj.f35370c = i12;
            if (notificationsCustomSettingsActivity.f31669w == null) {
                notificationsCustomSettingsActivity.f31669w = new ArrayList();
            }
            notificationsCustomSettingsActivity.f31669w.add(obj);
            notificationsCustomSettingsActivity.l0(true);
            return true;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", j10);
        bundle.putBoolean("exception", true);
        e11 e11Var = new e11(bundle, notificationsCustomSettingsActivity.getResourceProvider());
        e11Var.f33856r = new xj0(notificationsCustomSettingsActivity);
        notificationsCustomSettingsActivity.presentFragment(e11Var, true);
        return true;
    }

    @Override
    public void b0() {
    }
}
