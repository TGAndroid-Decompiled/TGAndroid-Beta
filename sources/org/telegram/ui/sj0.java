package org.telegram.ui;

import android.content.SharedPreferences;
import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
public final class sj0 implements org.telegram.ui.Components.io {
    public final long f42416a;
    public final boolean f42417b;
    public final bk0 f42418c;
    public final boolean d;
    public final int f42419e;
    public final ArrayList f42420f;
    public final NotificationsCustomSettingsActivity h;

    public sj0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, long j10, boolean z10, bk0 bk0Var, boolean z11, int i10, ArrayList arrayList) {
        this.h = notificationsCustomSettingsActivity;
        this.f42416a = j10;
        this.f42417b = z10;
        this.f42418c = bk0Var;
        this.d = z11;
        this.f42419e = i10;
        this.f42420f = arrayList;
    }

    public final void a() {
        org.telegram.ui.ActionBar.l lVar;
        int indexOf;
        if (this.d) {
            return;
        }
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        ArrayList arrayList = notificationsCustomSettingsActivity.f35618w;
        bk0 bk0Var = this.f42418c;
        ArrayList arrayList2 = this.f42420f;
        if (arrayList2 != arrayList && (indexOf = arrayList.indexOf(bk0Var)) >= 0) {
            notificationsCustomSettingsActivity.f35618w.remove(indexOf);
            notificationsCustomSettingsActivity.f35619x.remove(Long.valueOf(bk0Var.d));
        }
        arrayList2.remove(bk0Var);
        if (arrayList2 == notificationsCustomSettingsActivity.f35618w) {
            notificationsCustomSettingsActivity.l0(true);
            notificationsCustomSettingsActivity.d0();
        } else {
            notificationsCustomSettingsActivity.l0(true);
            notificationsCustomSettingsActivity.d.m(this.f42419e);
        }
        lVar = ((org.telegram.ui.ActionBar.o2) notificationsCustomSettingsActivity).actionBar;
        lVar.h(true);
    }

    public final void b() {
        org.telegram.ui.ActionBar.l lVar;
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        if (notificationsCustomSettingsActivity.getMessagesController().isDialogMuted(this.f42416a, 0) != this.f42417b) {
            a();
            return;
        }
        SharedPreferences notificationsSettings = notificationsCustomSettingsActivity.getNotificationsSettings();
        StringBuilder sb2 = new StringBuilder("custom_");
        bk0 bk0Var = this.f42418c;
        sb2.append(bk0Var.d);
        bk0Var.f36820b = notificationsSettings.getBoolean(sb2.toString(), false);
        int i10 = notificationsSettings.getInt("notify2_" + bk0Var.d, 0);
        bk0Var.f36821c = i10;
        if (i10 != 0) {
            int i11 = notificationsSettings.getInt("notifyuntil_" + bk0Var.d, -1);
            if (i11 != -1) {
                bk0Var.f36819a = i11;
            }
        }
        if (this.d) {
            notificationsCustomSettingsActivity.f35618w.add(bk0Var);
            notificationsCustomSettingsActivity.f35619x.put(Long.valueOf(bk0Var.d), bk0Var);
            notificationsCustomSettingsActivity.l0(true);
        } else {
            notificationsCustomSettingsActivity.f35610a.getAdapter().m(this.f42419e);
        }
        lVar = ((org.telegram.ui.ActionBar.o2) notificationsCustomSettingsActivity).actionBar;
        lVar.h(true);
    }

    @Override
    public final void k() {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        MessagesController messagesController = notificationsCustomSettingsActivity.getMessagesController();
        long j10 = 0;
        long j11 = this.f42416a;
        notificationsCustomSettingsActivity.getNotificationsController().muteDialog(this.f42416a, j10, !messagesController.isDialogMuted(j11, j10));
        org.telegram.ui.Components.tc.A(notificationsCustomSettingsActivity, notificationsCustomSettingsActivity.getMessagesController().isDialogMuted(j11, j10), null).j();
        b();
    }

    @Override
    public final void l() {
        long j10 = this.f42416a;
        if (j10 != 0) {
            t01 t01Var = new t01(j7.l1.g(j10, "dialog_id"), null);
            t01Var.f42517r = new h(this, 28);
            this.h.presentFragment(t01Var);
        }
    }

    @Override
    public final void u() {
        int i10;
        String sharedPrefKey = NotificationsController.getSharedPrefKey(this.f42416a, 0);
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        i10 = ((org.telegram.ui.ActionBar.o2) notificationsCustomSettingsActivity).currentAccount;
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i10);
        boolean z10 = notificationsSettings.getBoolean("sound_enabled_" + sharedPrefKey, true);
        boolean z11 = !z10 ? 1 : 0;
        SharedPreferences.Editor edit = notificationsSettings.edit();
        edit.putBoolean("sound_enabled_" + sharedPrefKey, z11).apply();
        if (org.telegram.ui.Components.tc.a(notificationsCustomSettingsActivity)) {
            org.telegram.ui.Components.tc.S(z10 ? 1 : 0, notificationsCustomSettingsActivity, notificationsCustomSettingsActivity.getResourceProvider()).j();
        }
    }

    @Override
    public final void w(int i10) {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        if (i10 == 0) {
            if (notificationsCustomSettingsActivity.getMessagesController().isDialogMuted(this.f42416a, 0)) {
                k();
            }
            if (org.telegram.ui.Components.tc.a(notificationsCustomSettingsActivity)) {
                org.telegram.ui.Components.tc.z(notificationsCustomSettingsActivity, 4, i10, notificationsCustomSettingsActivity.getResourceProvider()).j();
            }
        } else {
            notificationsCustomSettingsActivity.getNotificationsController().muteUntil(this.f42416a, 0, i10);
            if (org.telegram.ui.Components.tc.a(notificationsCustomSettingsActivity)) {
                org.telegram.ui.Components.tc.z(notificationsCustomSettingsActivity, 5, i10, notificationsCustomSettingsActivity.getResourceProvider()).j();
            }
        }
        b();
    }

    @Override
    public final void dismiss() {
    }

    @Override
    public final void j() {
    }
}
