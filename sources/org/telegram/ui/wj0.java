package org.telegram.ui;

import android.content.SharedPreferences;
import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
public final class wj0 implements org.telegram.ui.Components.yo {
    public final long f42881a;
    public final boolean f42882b;
    public final gk0 f42883c;
    public final boolean d;
    public final int e;
    public final ArrayList f42884f;
    public final NotificationsCustomSettingsActivity h;

    public wj0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, long j10, boolean z10, gk0 gk0Var, boolean z11, int i10, ArrayList arrayList) {
        this.h = notificationsCustomSettingsActivity;
        this.f42881a = j10;
        this.f42882b = z10;
        this.f42883c = gk0Var;
        this.d = z11;
        this.e = i10;
        this.f42884f = arrayList;
    }

    public final void a() {
        org.telegram.ui.ActionBar.k kVar;
        int indexOf;
        if (this.d) {
            return;
        }
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        ArrayList arrayList = notificationsCustomSettingsActivity.f33200w;
        gk0 gk0Var = this.f42883c;
        ArrayList arrayList2 = this.f42884f;
        if (arrayList2 != arrayList && (indexOf = arrayList.indexOf(gk0Var)) >= 0) {
            notificationsCustomSettingsActivity.f33200w.remove(indexOf);
            notificationsCustomSettingsActivity.f33201x.remove(Long.valueOf(gk0Var.d));
        }
        arrayList2.remove(gk0Var);
        if (arrayList2 == notificationsCustomSettingsActivity.f33200w) {
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
        if (notificationsCustomSettingsActivity.getMessagesController().isDialogMuted(this.f42881a, 0) != this.f42882b) {
            a();
            return;
        }
        SharedPreferences notificationsSettings = notificationsCustomSettingsActivity.getNotificationsSettings();
        StringBuilder sb2 = new StringBuilder("custom_");
        gk0 gk0Var = this.f42883c;
        sb2.append(gk0Var.d);
        gk0Var.f37267b = notificationsSettings.getBoolean(sb2.toString(), false);
        int i10 = notificationsSettings.getInt("notify2_" + gk0Var.d, 0);
        gk0Var.f37268c = i10;
        if (i10 != 0) {
            int i11 = notificationsSettings.getInt("notifyuntil_" + gk0Var.d, -1);
            if (i11 != -1) {
                gk0Var.f37266a = i11;
            }
        }
        if (this.d) {
            notificationsCustomSettingsActivity.f33200w.add(gk0Var);
            notificationsCustomSettingsActivity.f33201x.put(Long.valueOf(gk0Var.d), gk0Var);
            notificationsCustomSettingsActivity.l0(true);
        } else {
            notificationsCustomSettingsActivity.f33193a.getAdapter().m(this.e);
        }
        kVar = ((org.telegram.ui.ActionBar.n2) notificationsCustomSettingsActivity).actionBar;
        kVar.h(true);
    }

    @Override
    public final void n() {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        MessagesController messagesController = notificationsCustomSettingsActivity.getMessagesController();
        long j10 = 0;
        long j11 = this.f42881a;
        notificationsCustomSettingsActivity.getNotificationsController().muteDialog(this.f42881a, j10, !messagesController.isDialogMuted(j11, j10));
        org.telegram.ui.Components.xc.A(notificationsCustomSettingsActivity, notificationsCustomSettingsActivity.getMessagesController().isDialogMuted(j11, j10), null).j();
        b();
    }

    @Override
    public final void p() {
        long j10 = this.f42881a;
        if (j10 != 0) {
            b11 b11Var = new b11(z7.g5.a(j10, "dialog_id"), null);
            b11Var.f35536r = new g(this, 28);
            this.h.presentFragment(b11Var);
        }
    }

    @Override
    public final void t() {
        int i10;
        String sharedPrefKey = NotificationsController.getSharedPrefKey(this.f42881a, 0);
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
    public final void y(int i10) {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        if (i10 == 0) {
            if (notificationsCustomSettingsActivity.getMessagesController().isDialogMuted(this.f42881a, 0)) {
                n();
            }
            if (org.telegram.ui.Components.xc.a(notificationsCustomSettingsActivity)) {
                org.telegram.ui.Components.xc.z(notificationsCustomSettingsActivity, 4, i10, notificationsCustomSettingsActivity.getResourceProvider()).j();
            }
        } else {
            notificationsCustomSettingsActivity.getNotificationsController().muteUntil(this.f42881a, 0, i10);
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
