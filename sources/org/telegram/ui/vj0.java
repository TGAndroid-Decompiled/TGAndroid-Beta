package org.telegram.ui;

import android.content.SharedPreferences;
import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
public final class vj0 implements org.telegram.ui.Components.eo {
    public final long f43500a;
    public final boolean f43501b;
    public final ek0 f43502c;
    public final boolean d;
    public final int f43503e;
    public final ArrayList f43504f;
    public final NotificationsCustomSettingsActivity h;

    public vj0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, long j10, boolean z10, ek0 ek0Var, boolean z11, int i9, ArrayList arrayList) {
        this.h = notificationsCustomSettingsActivity;
        this.f43500a = j10;
        this.f43501b = z10;
        this.f43502c = ek0Var;
        this.d = z11;
        this.f43503e = i9;
        this.f43504f = arrayList;
    }

    @Override
    public final void A(int i9) {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        if (i9 == 0) {
            if (notificationsCustomSettingsActivity.getMessagesController().isDialogMuted(this.f43500a, 0)) {
                p();
            }
            if (org.telegram.ui.Components.oc.a(notificationsCustomSettingsActivity)) {
                org.telegram.ui.Components.oc.z(notificationsCustomSettingsActivity, 4, i9, notificationsCustomSettingsActivity.getResourceProvider()).j();
            }
        } else {
            notificationsCustomSettingsActivity.getNotificationsController().muteUntil(this.f43500a, 0, i9);
            if (org.telegram.ui.Components.oc.a(notificationsCustomSettingsActivity)) {
                org.telegram.ui.Components.oc.z(notificationsCustomSettingsActivity, 5, i9, notificationsCustomSettingsActivity.getResourceProvider()).j();
            }
        }
        b();
    }

    public final void a() {
        org.telegram.ui.ActionBar.k kVar;
        int indexOf;
        if (this.d) {
            return;
        }
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        ArrayList arrayList = notificationsCustomSettingsActivity.f35551w;
        ek0 ek0Var = this.f43502c;
        ArrayList arrayList2 = this.f43504f;
        if (arrayList2 != arrayList && (indexOf = arrayList.indexOf(ek0Var)) >= 0) {
            notificationsCustomSettingsActivity.f35551w.remove(indexOf);
            notificationsCustomSettingsActivity.f35552x.remove(Long.valueOf(ek0Var.d));
        }
        arrayList2.remove(ek0Var);
        if (arrayList2 == notificationsCustomSettingsActivity.f35551w) {
            notificationsCustomSettingsActivity.k0(true);
            notificationsCustomSettingsActivity.c0();
        } else {
            notificationsCustomSettingsActivity.k0(true);
            notificationsCustomSettingsActivity.d.m(this.f43503e);
        }
        kVar = ((org.telegram.ui.ActionBar.o2) notificationsCustomSettingsActivity).actionBar;
        kVar.h(true);
    }

    public final void b() {
        org.telegram.ui.ActionBar.k kVar;
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        if (notificationsCustomSettingsActivity.getMessagesController().isDialogMuted(this.f43500a, 0) != this.f43501b) {
            a();
            return;
        }
        SharedPreferences notificationsSettings = notificationsCustomSettingsActivity.getNotificationsSettings();
        StringBuilder sb2 = new StringBuilder("custom_");
        ek0 ek0Var = this.f43502c;
        sb2.append(ek0Var.d);
        ek0Var.f37982b = notificationsSettings.getBoolean(sb2.toString(), false);
        int i9 = notificationsSettings.getInt("notify2_" + ek0Var.d, 0);
        ek0Var.f37983c = i9;
        if (i9 != 0) {
            int i10 = notificationsSettings.getInt("notifyuntil_" + ek0Var.d, -1);
            if (i10 != -1) {
                ek0Var.f37981a = i10;
            }
        }
        if (this.d) {
            notificationsCustomSettingsActivity.f35551w.add(ek0Var);
            notificationsCustomSettingsActivity.f35552x.put(Long.valueOf(ek0Var.d), ek0Var);
            notificationsCustomSettingsActivity.k0(true);
        } else {
            notificationsCustomSettingsActivity.f35543a.getAdapter().m(this.f43503e);
        }
        kVar = ((org.telegram.ui.ActionBar.o2) notificationsCustomSettingsActivity).actionBar;
        kVar.h(true);
    }

    @Override
    public final void p() {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        MessagesController messagesController = notificationsCustomSettingsActivity.getMessagesController();
        long j10 = 0;
        long j11 = this.f43500a;
        notificationsCustomSettingsActivity.getNotificationsController().muteDialog(this.f43500a, j10, !messagesController.isDialogMuted(j11, j10));
        org.telegram.ui.Components.oc.A(notificationsCustomSettingsActivity, notificationsCustomSettingsActivity.getMessagesController().isDialogMuted(j11, j10), null).j();
        b();
    }

    @Override
    public final void s() {
        long j10 = this.f43500a;
        if (j10 != 0) {
            s01 s01Var = new s01(e2.c.g(j10, "dialog_id"), null);
            s01Var.f42525r = new g(this, 28);
            this.h.presentFragment(s01Var);
        }
    }

    @Override
    public final void w() {
        int i9;
        String sharedPrefKey = NotificationsController.getSharedPrefKey(this.f43500a, 0);
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        i9 = ((org.telegram.ui.ActionBar.o2) notificationsCustomSettingsActivity).currentAccount;
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i9);
        boolean z10 = notificationsSettings.getBoolean("sound_enabled_" + sharedPrefKey, true);
        boolean z11 = !z10 ? 1 : 0;
        SharedPreferences.Editor edit = notificationsSettings.edit();
        edit.putBoolean("sound_enabled_" + sharedPrefKey, z11).apply();
        if (org.telegram.ui.Components.oc.a(notificationsCustomSettingsActivity)) {
            org.telegram.ui.Components.oc.S(z10 ? 1 : 0, notificationsCustomSettingsActivity, notificationsCustomSettingsActivity.getResourceProvider()).j();
        }
    }

    @Override
    public final void dismiss() {
    }

    @Override
    public final void o() {
    }
}
