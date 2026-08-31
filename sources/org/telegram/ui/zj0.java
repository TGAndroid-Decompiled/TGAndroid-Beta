package org.telegram.ui;

import android.content.SharedPreferences;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class zj0 implements jy, org.telegram.ui.ActionBar.c2, f11 {
    public final NotificationsCustomSettingsActivity f43948a;

    public zj0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity) {
        this.f43948a = notificationsCustomSettingsActivity;
    }

    @Override
    public boolean C() {
        return false;
    }

    @Override
    public boolean J(py pyVar) {
        return false;
    }

    @Override
    public void j(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f43948a;
        SharedPreferences.Editor edit = notificationsCustomSettingsActivity.getNotificationsSettings().edit();
        int size = notificationsCustomSettingsActivity.f34192w.size();
        for (int i11 = 0; i11 < size; i11++) {
            lk0 lk0Var = (lk0) notificationsCustomSettingsActivity.f34192w.get(i11);
            if (notificationsCustomSettingsActivity.f34191s == 3) {
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
        int size2 = notificationsCustomSettingsActivity.f34192w.size();
        for (int i12 = 0; i12 < size2; i12++) {
            notificationsCustomSettingsActivity.getNotificationsController().updateServerNotificationsSettings(((lk0) notificationsCustomSettingsActivity.f34192w.get(i12)).d, 0, false);
        }
        notificationsCustomSettingsActivity.f34192w.clear();
        notificationsCustomSettingsActivity.f34193x.clear();
        notificationsCustomSettingsActivity.l0(true);
        notificationsCustomSettingsActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.notificationsSettingsUpdated, new Object[0]);
    }

    @Override
    public void u(lk0 lk0Var) {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f43948a;
        notificationsCustomSettingsActivity.f34192w.add(0, lk0Var);
        notificationsCustomSettingsActivity.l0(true);
    }

    @Override
    public boolean v(py pyVar, ArrayList arrayList, CharSequence charSequence, boolean z4, boolean z10, int i10, int i11, mf1 mf1Var) {
        int i12 = 0;
        long j10 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f43948a;
        if (notificationsCustomSettingsActivity.f34191s == 3) {
            ArrayList arrayList2 = notificationsCustomSettingsActivity.v;
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    if (((lk0) it.next()).d == j10) {
                        it.remove();
                    }
                }
            }
            ArrayList arrayList3 = notificationsCustomSettingsActivity.f34192w;
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
            obj.f38777e = true;
            Boolean bool = notificationsCustomSettingsActivity.f34189n;
            if (bool != null && bool.booleanValue()) {
                i12 = Integer.MAX_VALUE;
            }
            obj.f38776c = i12;
            if (notificationsCustomSettingsActivity.f34192w == null) {
                notificationsCustomSettingsActivity.f34192w = new ArrayList();
            }
            notificationsCustomSettingsActivity.f34192w.add(obj);
            notificationsCustomSettingsActivity.l0(true);
            return true;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", j10);
        bundle.putBoolean("exception", true);
        g11 g11Var = new g11(bundle, notificationsCustomSettingsActivity.getResourceProvider());
        g11Var.f37062r = new zj0(notificationsCustomSettingsActivity);
        notificationsCustomSettingsActivity.presentFragment(g11Var, true);
        return true;
    }

    @Override
    public void d0() {
    }
}
