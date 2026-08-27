package org.telegram.ui;

import android.content.SharedPreferences;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;

public final class tj0 implements zx, org.telegram.ui.ActionBar.a2, s01 {

    public final NotificationsCustomSettingsActivity f42954a;

    public tj0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity) {
        this.f42954a = notificationsCustomSettingsActivity;
    }

    @Override
    public boolean D() {
        return false;
    }

    @Override
    public boolean K(gy gyVar) {
        return false;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f42954a;
        SharedPreferences.Editor editorEdit = notificationsCustomSettingsActivity.getNotificationsSettings().edit();
        int size = notificationsCustomSettingsActivity.f35554w.size();
        for (int i11 = 0; i11 < size; i11++) {
            fk0 fk0Var = (fk0) notificationsCustomSettingsActivity.f35554w.get(i11);
            if (notificationsCustomSettingsActivity.f35553s == 3) {
                editorEdit.remove("stories_" + fk0Var.d);
            } else {
                editorEdit.remove("notify2_" + fk0Var.d).remove("custom_" + fk0Var.d);
            }
            notificationsCustomSettingsActivity.getMessagesStorage().setDialogFlags(fk0Var.d, 0L);
            TLRPC.Dialog dialog = (TLRPC.Dialog) notificationsCustomSettingsActivity.getMessagesController().dialogs_dict.f(fk0Var.d);
            if (dialog != null) {
                dialog.notify_settings = new TLRPC.TL_peerNotifySettings();
            }
        }
        editorEdit.commit();
        int size2 = notificationsCustomSettingsActivity.f35554w.size();
        for (int i12 = 0; i12 < size2; i12++) {
            notificationsCustomSettingsActivity.getNotificationsController().updateServerNotificationsSettings(((fk0) notificationsCustomSettingsActivity.f35554w.get(i12)).d, 0, false);
        }
        notificationsCustomSettingsActivity.f35554w.clear();
        notificationsCustomSettingsActivity.f35555x.clear();
        notificationsCustomSettingsActivity.l0(true);
        notificationsCustomSettingsActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.notificationsSettingsUpdated, new Object[0]);
    }

    @Override
    public void l(fk0 fk0Var) {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f42954a;
        notificationsCustomSettingsActivity.f35554w.add(0, fk0Var);
        notificationsCustomSettingsActivity.l0(true);
    }

    @Override
    public boolean w(gy gyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, we1 we1Var) {
        int i12 = 0;
        long j10 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f42954a;
        if (notificationsCustomSettingsActivity.f35553s != 3) {
            Bundle bundle = new Bundle();
            bundle.putLong("dialog_id", j10);
            bundle.putBoolean("exception", true);
            t01 t01Var = new t01(bundle, notificationsCustomSettingsActivity.getResourceProvider());
            t01Var.f42745r = new tj0(notificationsCustomSettingsActivity);
            notificationsCustomSettingsActivity.presentFragment(t01Var, true);
            return true;
        }
        ArrayList arrayList2 = notificationsCustomSettingsActivity.v;
        if (arrayList2 != null) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                if (((fk0) it.next()).d == j10) {
                    it.remove();
                }
            }
        }
        ArrayList arrayList3 = notificationsCustomSettingsActivity.f35554w;
        if (arrayList3 != null) {
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                if (((fk0) it2.next()).d == j10) {
                    it2.remove();
                }
            }
        }
        fk0 fk0Var = new fk0();
        fk0Var.d = j10;
        fk0Var.f38154e = true;
        Boolean bool = notificationsCustomSettingsActivity.f35551n;
        if (bool != null && bool.booleanValue()) {
            i12 = Integer.MAX_VALUE;
        }
        fk0Var.f38153c = i12;
        if (notificationsCustomSettingsActivity.f35554w == null) {
            notificationsCustomSettingsActivity.f35554w = new ArrayList();
        }
        notificationsCustomSettingsActivity.f35554w.add(fk0Var);
        notificationsCustomSettingsActivity.l0(true);
        return true;
    }

    @Override
    public void G() {
    }
}
