package org.telegram.ui;

import android.content.SharedPreferences;
import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
public final class uj0 implements org.telegram.ui.Components.yo {
    public final long f42003a;
    public final boolean f42004b;
    public final ek0 f42005c;
    public final boolean d;
    public final int e;
    public final ArrayList f42006f;
    public final NotificationsCustomSettingsActivity h;

    public uj0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, long j10, boolean z10, ek0 ek0Var, boolean z11, int i10, ArrayList arrayList) {
        this.h = notificationsCustomSettingsActivity;
        this.f42003a = j10;
        this.f42004b = z10;
        this.f42005c = ek0Var;
        this.d = z11;
        this.e = i10;
        this.f42006f = arrayList;
    }

    public final void a() {
        org.telegram.ui.ActionBar.k kVar;
        int indexOf;
        if (this.d) {
            return;
        }
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        ArrayList arrayList = notificationsCustomSettingsActivity.f33212w;
        ek0 ek0Var = this.f42005c;
        ArrayList arrayList2 = this.f42006f;
        if (arrayList2 != arrayList && (indexOf = arrayList.indexOf(ek0Var)) >= 0) {
            notificationsCustomSettingsActivity.f33212w.remove(indexOf);
            notificationsCustomSettingsActivity.f33213x.remove(Long.valueOf(ek0Var.d));
        }
        arrayList2.remove(ek0Var);
        if (arrayList2 == notificationsCustomSettingsActivity.f33212w) {
            notificationsCustomSettingsActivity.l0(true);
            notificationsCustomSettingsActivity.d0();
        } else {
            notificationsCustomSettingsActivity.l0(true);
            notificationsCustomSettingsActivity.d.m(this.e);
        }
        kVar = ((org.telegram.ui.ActionBar.n2) notificationsCustomSettingsActivity).actionBar;
        kVar.h(true);
    }

    public final void b() {
        org.telegram.ui.ActionBar.k kVar;
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        if (notificationsCustomSettingsActivity.getMessagesController().isDialogMuted(this.f42003a, 0) != this.f42004b) {
            a();
            return;
        }
        SharedPreferences notificationsSettings = notificationsCustomSettingsActivity.getNotificationsSettings();
        StringBuilder sb2 = new StringBuilder("custom_");
        ek0 ek0Var = this.f42005c;
        sb2.append(ek0Var.d);
        ek0Var.f36682b = notificationsSettings.getBoolean(sb2.toString(), false);
        int i10 = notificationsSettings.getInt("notify2_" + ek0Var.d, 0);
        ek0Var.f36683c = i10;
        if (i10 != 0) {
            int i11 = notificationsSettings.getInt("notifyuntil_" + ek0Var.d, -1);
            if (i11 != -1) {
                ek0Var.f36681a = i11;
            }
        }
        if (this.d) {
            notificationsCustomSettingsActivity.f33212w.add(ek0Var);
            notificationsCustomSettingsActivity.f33213x.put(Long.valueOf(ek0Var.d), ek0Var);
            notificationsCustomSettingsActivity.l0(true);
        } else {
            notificationsCustomSettingsActivity.f33205a.getAdapter().m(this.e);
        }
        kVar = ((org.telegram.ui.ActionBar.n2) notificationsCustomSettingsActivity).actionBar;
        kVar.h(true);
    }

    @Override
    public final void n() {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        MessagesController messagesController = notificationsCustomSettingsActivity.getMessagesController();
        long j10 = 0;
        long j11 = this.f42003a;
        notificationsCustomSettingsActivity.getNotificationsController().muteDialog(this.f42003a, j10, !messagesController.isDialogMuted(j11, j10));
        org.telegram.ui.Components.xc.A(notificationsCustomSettingsActivity, notificationsCustomSettingsActivity.getMessagesController().isDialogMuted(j11, j10), null).j();
        b();
    }

    @Override
    public final void o() {
        long j10 = this.f42003a;
        if (j10 != 0) {
            z01 z01Var = new z01(zf.d0.b(j10, "dialog_id"), null);
            z01Var.f43592r = new g(this, 28);
            this.h.presentFragment(z01Var);
        }
    }

    @Override
    public final void t() {
        int i10;
        String sharedPrefKey = NotificationsController.getSharedPrefKey(this.f42003a, 0);
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        i10 = ((org.telegram.ui.ActionBar.n2) notificationsCustomSettingsActivity).currentAccount;
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i10);
        boolean z10 = notificationsSettings.getBoolean("sound_enabled_" + sharedPrefKey, true);
        boolean z11 = !z10 ? 1 : 0;
        SharedPreferences.Editor edit = notificationsSettings.edit();
        edit.putBoolean("sound_enabled_" + sharedPrefKey, z11).apply();
        if (org.telegram.ui.Components.xc.a(notificationsCustomSettingsActivity)) {
            org.telegram.ui.Components.xc.S(z10 ? 1 : 0, notificationsCustomSettingsActivity, notificationsCustomSettingsActivity.getResourceProvider()).j();
        }
    }

    @Override
    public final void x(int i10) {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        if (i10 == 0) {
            if (notificationsCustomSettingsActivity.getMessagesController().isDialogMuted(this.f42003a, 0)) {
                n();
            }
            if (org.telegram.ui.Components.xc.a(notificationsCustomSettingsActivity)) {
                org.telegram.ui.Components.xc.z(notificationsCustomSettingsActivity, 4, i10, notificationsCustomSettingsActivity.getResourceProvider()).j();
            }
        } else {
            notificationsCustomSettingsActivity.getNotificationsController().muteUntil(this.f42003a, 0, i10);
            if (org.telegram.ui.Components.xc.a(notificationsCustomSettingsActivity)) {
                org.telegram.ui.Components.xc.z(notificationsCustomSettingsActivity, 5, i10, notificationsCustomSettingsActivity.getResourceProvider()).j();
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
