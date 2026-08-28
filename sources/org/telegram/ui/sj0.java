package org.telegram.ui;

import android.content.SharedPreferences;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class sj0 implements wx, org.telegram.ui.ActionBar.b2, r01 {
    public final NotificationsCustomSettingsActivity f42710a;

    public sj0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity) {
        this.f42710a = notificationsCustomSettingsActivity;
    }

    @Override
    public boolean C() {
        return false;
    }

    @Override
    public boolean I(dy dyVar) {
        return false;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f42710a;
        SharedPreferences.Editor edit = notificationsCustomSettingsActivity.getNotificationsSettings().edit();
        int size = notificationsCustomSettingsActivity.f35551w.size();
        for (int i10 = 0; i10 < size; i10++) {
            ek0 ek0Var = (ek0) notificationsCustomSettingsActivity.f35551w.get(i10);
            if (notificationsCustomSettingsActivity.f35550s == 3) {
                edit.remove("stories_" + ek0Var.d);
            } else {
                SharedPreferences.Editor remove = edit.remove("notify2_" + ek0Var.d);
                remove.remove("custom_" + ek0Var.d);
            }
            notificationsCustomSettingsActivity.getMessagesStorage().setDialogFlags(ek0Var.d, 0L);
            TLRPC.Dialog dialog = (TLRPC.Dialog) notificationsCustomSettingsActivity.getMessagesController().dialogs_dict.f(ek0Var.d);
            if (dialog != null) {
                dialog.notify_settings = new TLRPC.TL_peerNotifySettings();
            }
        }
        edit.commit();
        int size2 = notificationsCustomSettingsActivity.f35551w.size();
        for (int i11 = 0; i11 < size2; i11++) {
            notificationsCustomSettingsActivity.getNotificationsController().updateServerNotificationsSettings(((ek0) notificationsCustomSettingsActivity.f35551w.get(i11)).d, 0, false);
        }
        notificationsCustomSettingsActivity.f35551w.clear();
        notificationsCustomSettingsActivity.f35552x.clear();
        notificationsCustomSettingsActivity.k0(true);
        notificationsCustomSettingsActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.notificationsSettingsUpdated, new Object[0]);
    }

    @Override
    public void g(ek0 ek0Var) {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f42710a;
        notificationsCustomSettingsActivity.f35551w.add(0, ek0Var);
        notificationsCustomSettingsActivity.k0(true);
    }

    @Override
    public boolean v(dy dyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i9, int i10, we1 we1Var) {
        int i11 = 0;
        long j10 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f42710a;
        if (notificationsCustomSettingsActivity.f35550s == 3) {
            ArrayList arrayList2 = notificationsCustomSettingsActivity.v;
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    if (((ek0) it.next()).d == j10) {
                        it.remove();
                    }
                }
            }
            ArrayList arrayList3 = notificationsCustomSettingsActivity.f35551w;
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
            obj.f37984e = true;
            Boolean bool = notificationsCustomSettingsActivity.f35548n;
            if (bool != null && bool.booleanValue()) {
                i11 = Integer.MAX_VALUE;
            }
            obj.f37983c = i11;
            if (notificationsCustomSettingsActivity.f35551w == null) {
                notificationsCustomSettingsActivity.f35551w = new ArrayList();
            }
            notificationsCustomSettingsActivity.f35551w.add(obj);
            notificationsCustomSettingsActivity.k0(true);
            return true;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", j10);
        bundle.putBoolean("exception", true);
        s01 s01Var = new s01(bundle, notificationsCustomSettingsActivity.getResourceProvider());
        s01Var.f42525r = new sj0(notificationsCustomSettingsActivity);
        notificationsCustomSettingsActivity.presentFragment(s01Var, true);
        return true;
    }

    @Override
    public void E() {
    }
}
