package org.telegram.ui;

import android.content.SharedPreferences;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class tj0 implements xx, org.telegram.ui.ActionBar.a2, a11 {
    public final NotificationsCustomSettingsActivity f41745a;

    public tj0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity) {
        this.f41745a = notificationsCustomSettingsActivity;
    }

    @Override
    public boolean D() {
        return false;
    }

    @Override
    public boolean K(ey eyVar) {
        return false;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f41745a;
        SharedPreferences.Editor edit = notificationsCustomSettingsActivity.getNotificationsSettings().edit();
        int size = notificationsCustomSettingsActivity.f33200w.size();
        for (int i11 = 0; i11 < size; i11++) {
            gk0 gk0Var = (gk0) notificationsCustomSettingsActivity.f33200w.get(i11);
            if (notificationsCustomSettingsActivity.f33199s == 3) {
                edit.remove("stories_" + gk0Var.d);
            } else {
                edit.remove("notify2_" + gk0Var.d).remove("custom_" + gk0Var.d);
            }
            notificationsCustomSettingsActivity.getMessagesStorage().setDialogFlags(gk0Var.d, 0L);
            TLRPC.Dialog dialog = (TLRPC.Dialog) notificationsCustomSettingsActivity.getMessagesController().dialogs_dict.f(gk0Var.d);
            if (dialog != null) {
                dialog.notify_settings = new TLRPC.TL_peerNotifySettings();
            }
        }
        edit.commit();
        int size2 = notificationsCustomSettingsActivity.f33200w.size();
        for (int i12 = 0; i12 < size2; i12++) {
            notificationsCustomSettingsActivity.getNotificationsController().updateServerNotificationsSettings(((gk0) notificationsCustomSettingsActivity.f33200w.get(i12)).d, 0, false);
        }
        notificationsCustomSettingsActivity.f33200w.clear();
        notificationsCustomSettingsActivity.f33201x.clear();
        notificationsCustomSettingsActivity.l0(true);
        notificationsCustomSettingsActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.notificationsSettingsUpdated, new Object[0]);
    }

    @Override
    public void r(gk0 gk0Var) {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f41745a;
        notificationsCustomSettingsActivity.f33200w.add(0, gk0Var);
        notificationsCustomSettingsActivity.l0(true);
    }

    @Override
    public boolean w(ey eyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, te1 te1Var) {
        int i12 = 0;
        long j10 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f41745a;
        if (notificationsCustomSettingsActivity.f33199s == 3) {
            ArrayList arrayList2 = notificationsCustomSettingsActivity.v;
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    if (((gk0) it.next()).d == j10) {
                        it.remove();
                    }
                }
            }
            ArrayList arrayList3 = notificationsCustomSettingsActivity.f33200w;
            if (arrayList3 != null) {
                Iterator it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    if (((gk0) it2.next()).d == j10) {
                        it2.remove();
                    }
                }
            }
            ?? obj = new Object();
            obj.d = j10;
            obj.e = true;
            Boolean bool = notificationsCustomSettingsActivity.f33197n;
            if (bool != null && bool.booleanValue()) {
                i12 = Integer.MAX_VALUE;
            }
            obj.f37200c = i12;
            if (notificationsCustomSettingsActivity.f33200w == null) {
                notificationsCustomSettingsActivity.f33200w = new ArrayList();
            }
            notificationsCustomSettingsActivity.f33200w.add(obj);
            notificationsCustomSettingsActivity.l0(true);
            return true;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", j10);
        bundle.putBoolean("exception", true);
        b11 b11Var = new b11(bundle, notificationsCustomSettingsActivity.getResourceProvider());
        b11Var.f35520r = new tj0(notificationsCustomSettingsActivity);
        notificationsCustomSettingsActivity.presentFragment(b11Var, true);
        return true;
    }

    @Override
    public void O() {
    }
}
