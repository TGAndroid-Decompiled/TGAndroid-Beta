package org.telegram.ui;

import android.content.SharedPreferences;
import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
public final class yj0 implements org.telegram.ui.Components.wo {
    public final long f43876a;
    public final boolean f43877b;
    public final hk0 f43878c;
    public final boolean d;
    public final int e;
    public final ArrayList f43879f;
    public final NotificationsCustomSettingsActivity h;

    public yj0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, long j10, boolean z10, hk0 hk0Var, boolean z11, int i10, ArrayList arrayList) {
        this.h = notificationsCustomSettingsActivity;
        this.f43876a = j10;
        this.f43877b = z10;
        this.f43878c = hk0Var;
        this.d = z11;
        this.e = i10;
        this.f43879f = arrayList;
    }

    public final void a() {
        org.telegram.ui.ActionBar.k kVar;
        int indexOf;
        if (this.d) {
            return;
        }
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        ArrayList arrayList = notificationsCustomSettingsActivity.f33516w;
        hk0 hk0Var = this.f43878c;
        ArrayList arrayList2 = this.f43879f;
        if (arrayList2 != arrayList && (indexOf = arrayList.indexOf(hk0Var)) >= 0) {
            notificationsCustomSettingsActivity.f33516w.remove(indexOf);
            notificationsCustomSettingsActivity.f33517x.remove(Long.valueOf(hk0Var.d));
        }
        arrayList2.remove(hk0Var);
        if (arrayList2 == notificationsCustomSettingsActivity.f33516w) {
            notificationsCustomSettingsActivity.l0(true);
            notificationsCustomSettingsActivity.d0();
        } else {
            notificationsCustomSettingsActivity.l0(true);
            notificationsCustomSettingsActivity.d.m(this.e);
        }
        kVar = ((org.telegram.ui.ActionBar.o2) notificationsCustomSettingsActivity).actionBar;
        kVar.g(true);
    }

    public final void b() {
        org.telegram.ui.ActionBar.k kVar;
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        if (notificationsCustomSettingsActivity.getMessagesController().isDialogMuted(this.f43876a, 0) != this.f43877b) {
            a();
            return;
        }
        SharedPreferences notificationsSettings = notificationsCustomSettingsActivity.getNotificationsSettings();
        StringBuilder sb2 = new StringBuilder("custom_");
        hk0 hk0Var = this.f43878c;
        sb2.append(hk0Var.d);
        hk0Var.f37889b = notificationsSettings.getBoolean(sb2.toString(), false);
        int i10 = notificationsSettings.getInt("notify2_" + hk0Var.d, 0);
        hk0Var.f37890c = i10;
        if (i10 != 0) {
            int i11 = notificationsSettings.getInt("notifyuntil_" + hk0Var.d, -1);
            if (i11 != -1) {
                hk0Var.f37888a = i11;
            }
        }
        if (this.d) {
            notificationsCustomSettingsActivity.f33516w.add(hk0Var);
            notificationsCustomSettingsActivity.f33517x.put(Long.valueOf(hk0Var.d), hk0Var);
            notificationsCustomSettingsActivity.l0(true);
        } else {
            notificationsCustomSettingsActivity.f33509a.getAdapter().m(this.e);
        }
        kVar = ((org.telegram.ui.ActionBar.o2) notificationsCustomSettingsActivity).actionBar;
        kVar.g(true);
    }

    @Override
    public final void o() {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        MessagesController messagesController = notificationsCustomSettingsActivity.getMessagesController();
        long j10 = 0;
        long j11 = this.f43876a;
        notificationsCustomSettingsActivity.getNotificationsController().muteDialog(this.f43876a, j10, !messagesController.isDialogMuted(j11, j10));
        org.telegram.ui.Components.vc.A(notificationsCustomSettingsActivity, notificationsCustomSettingsActivity.getMessagesController().isDialogMuted(j11, j10), null).j();
        b();
    }

    @Override
    public final void p() {
        long j10 = this.f43876a;
        if (j10 != 0) {
            c11 c11Var = new c11(si.o0.e(j10, "dialog_id"), null);
            c11Var.f36181r = new f(this, 28);
            this.h.presentFragment(c11Var);
        }
    }

    @Override
    public final void t() {
        int i10;
        String sharedPrefKey = NotificationsController.getSharedPrefKey(this.f43876a, 0);
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        i10 = ((org.telegram.ui.ActionBar.o2) notificationsCustomSettingsActivity).currentAccount;
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i10);
        boolean z10 = notificationsSettings.getBoolean("sound_enabled_" + sharedPrefKey, true);
        boolean z11 = !z10 ? 1 : 0;
        SharedPreferences.Editor edit = notificationsSettings.edit();
        edit.putBoolean("sound_enabled_" + sharedPrefKey, z11).apply();
        if (org.telegram.ui.Components.vc.a(notificationsCustomSettingsActivity)) {
            org.telegram.ui.Components.vc.S(z10 ? 1 : 0, notificationsCustomSettingsActivity, notificationsCustomSettingsActivity.getResourceProvider()).j();
        }
    }

    @Override
    public final void v(int i10) {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        if (i10 == 0) {
            if (notificationsCustomSettingsActivity.getMessagesController().isDialogMuted(this.f43876a, 0)) {
                o();
            }
            if (org.telegram.ui.Components.vc.a(notificationsCustomSettingsActivity)) {
                org.telegram.ui.Components.vc.z(notificationsCustomSettingsActivity, 4, i10, notificationsCustomSettingsActivity.getResourceProvider()).j();
            }
        } else {
            notificationsCustomSettingsActivity.getNotificationsController().muteUntil(this.f43876a, 0, i10);
            if (org.telegram.ui.Components.vc.a(notificationsCustomSettingsActivity)) {
                org.telegram.ui.Components.vc.z(notificationsCustomSettingsActivity, 5, i10, notificationsCustomSettingsActivity.getResourceProvider()).j();
            }
        }
        b();
    }

    @Override
    public final void dismiss() {
    }

    @Override
    public final void m() {
    }
}
