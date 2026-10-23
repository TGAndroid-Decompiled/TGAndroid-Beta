package org.telegram.ui;

import android.content.SharedPreferences;
import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
public final class zj0 implements org.telegram.ui.Components.yo {
    public final long f44165a;
    public final boolean f44166b;
    public final ik0 f44167c;
    public final boolean d;
    public final int e;
    public final ArrayList f44168f;
    public final NotificationsCustomSettingsActivity h;

    public zj0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, long j10, boolean z10, ik0 ik0Var, boolean z11, int i10, ArrayList arrayList) {
        this.h = notificationsCustomSettingsActivity;
        this.f44165a = j10;
        this.f44166b = z10;
        this.f44167c = ik0Var;
        this.d = z11;
        this.e = i10;
        this.f44168f = arrayList;
    }

    public final void a() {
        org.telegram.ui.ActionBar.k kVar;
        int indexOf;
        if (this.d) {
            return;
        }
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        ArrayList arrayList = notificationsCustomSettingsActivity.f33514w;
        ik0 ik0Var = this.f44167c;
        ArrayList arrayList2 = this.f44168f;
        if (arrayList2 != arrayList && (indexOf = arrayList.indexOf(ik0Var)) >= 0) {
            notificationsCustomSettingsActivity.f33514w.remove(indexOf);
            notificationsCustomSettingsActivity.f33515x.remove(Long.valueOf(ik0Var.d));
        }
        arrayList2.remove(ik0Var);
        if (arrayList2 == notificationsCustomSettingsActivity.f33514w) {
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
        if (notificationsCustomSettingsActivity.getMessagesController().isDialogMuted(this.f44165a, 0) != this.f44166b) {
            a();
            return;
        }
        SharedPreferences notificationsSettings = notificationsCustomSettingsActivity.getNotificationsSettings();
        StringBuilder sb2 = new StringBuilder("custom_");
        ik0 ik0Var = this.f44167c;
        sb2.append(ik0Var.d);
        ik0Var.f38255b = notificationsSettings.getBoolean(sb2.toString(), false);
        int i10 = notificationsSettings.getInt("notify2_" + ik0Var.d, 0);
        ik0Var.f38256c = i10;
        if (i10 != 0) {
            int i11 = notificationsSettings.getInt("notifyuntil_" + ik0Var.d, -1);
            if (i11 != -1) {
                ik0Var.f38254a = i11;
            }
        }
        if (this.d) {
            notificationsCustomSettingsActivity.f33514w.add(ik0Var);
            notificationsCustomSettingsActivity.f33515x.put(Long.valueOf(ik0Var.d), ik0Var);
            notificationsCustomSettingsActivity.l0(true);
        } else {
            notificationsCustomSettingsActivity.f33507a.getAdapter().m(this.e);
        }
        kVar = ((org.telegram.ui.ActionBar.o2) notificationsCustomSettingsActivity).actionBar;
        kVar.g(true);
    }

    @Override
    public final void o() {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        MessagesController messagesController = notificationsCustomSettingsActivity.getMessagesController();
        long j10 = 0;
        long j11 = this.f44165a;
        notificationsCustomSettingsActivity.getNotificationsController().muteDialog(this.f44165a, j10, !messagesController.isDialogMuted(j11, j10));
        org.telegram.ui.Components.xc.A(notificationsCustomSettingsActivity, notificationsCustomSettingsActivity.getMessagesController().isDialogMuted(j11, j10), null).j();
        b();
    }

    @Override
    public final void p() {
        long j10 = this.f44165a;
        if (j10 != 0) {
            d11 d11Var = new d11(si.o0.e(j10, "dialog_id"), null);
            d11Var.f36476r = new f(this, 28);
            this.h.presentFragment(d11Var);
        }
    }

    @Override
    public final void t() {
        int i10;
        String sharedPrefKey = NotificationsController.getSharedPrefKey(this.f44165a, 0);
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        i10 = ((org.telegram.ui.ActionBar.o2) notificationsCustomSettingsActivity).currentAccount;
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
    public final void v(int i10) {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        if (i10 == 0) {
            if (notificationsCustomSettingsActivity.getMessagesController().isDialogMuted(this.f44165a, 0)) {
                o();
            }
            if (org.telegram.ui.Components.xc.a(notificationsCustomSettingsActivity)) {
                org.telegram.ui.Components.xc.z(notificationsCustomSettingsActivity, 4, i10, notificationsCustomSettingsActivity.getResourceProvider()).j();
            }
        } else {
            notificationsCustomSettingsActivity.getNotificationsController().muteUntil(this.f44165a, 0, i10);
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
