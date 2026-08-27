package org.telegram.ui;

import android.content.SharedPreferences;
import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;

public final class wj0 implements org.telegram.ui.Components.bo {

    public final long f44134a;

    public final boolean f44135b;

    public final fk0 f44136c;
    public final boolean d;

    public final int f44137e;

    public final ArrayList f44138f;
    public final NotificationsCustomSettingsActivity h;

    public wj0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, long j10, boolean z10, fk0 fk0Var, boolean z11, int i10, ArrayList arrayList) {
        this.h = notificationsCustomSettingsActivity;
        this.f44134a = j10;
        this.f44135b = z10;
        this.f44136c = fk0Var;
        this.d = z11;
        this.f44137e = i10;
        this.f44138f = arrayList;
    }

    public final void a() {
        int iIndexOf;
        if (this.d) {
            return;
        }
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        ArrayList arrayList = notificationsCustomSettingsActivity.f35554w;
        fk0 fk0Var = this.f44136c;
        ArrayList arrayList2 = this.f44138f;
        if (arrayList2 != arrayList && (iIndexOf = arrayList.indexOf(fk0Var)) >= 0) {
            notificationsCustomSettingsActivity.f35554w.remove(iIndexOf);
            notificationsCustomSettingsActivity.f35555x.remove(Long.valueOf(fk0Var.d));
        }
        arrayList2.remove(fk0Var);
        if (arrayList2 == notificationsCustomSettingsActivity.f35554w) {
            notificationsCustomSettingsActivity.l0(true);
            notificationsCustomSettingsActivity.d0();
        } else {
            notificationsCustomSettingsActivity.l0(true);
            notificationsCustomSettingsActivity.d.m(this.f44137e);
        }
        ((org.telegram.ui.ActionBar.n2) notificationsCustomSettingsActivity).actionBar.h(true);
    }

    public final void b() {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        if (notificationsCustomSettingsActivity.getMessagesController().isDialogMuted(this.f44134a, 0) != this.f44135b) {
            a();
            return;
        }
        SharedPreferences notificationsSettings = notificationsCustomSettingsActivity.getNotificationsSettings();
        StringBuilder sb2 = new StringBuilder("custom_");
        fk0 fk0Var = this.f44136c;
        sb2.append(fk0Var.d);
        fk0Var.f38152b = notificationsSettings.getBoolean(sb2.toString(), false);
        int i10 = notificationsSettings.getInt("notify2_" + fk0Var.d, 0);
        fk0Var.f38153c = i10;
        if (i10 != 0) {
            int i11 = notificationsSettings.getInt("notifyuntil_" + fk0Var.d, -1);
            if (i11 != -1) {
                fk0Var.f38151a = i11;
            }
        }
        if (this.d) {
            notificationsCustomSettingsActivity.f35554w.add(fk0Var);
            notificationsCustomSettingsActivity.f35555x.put(Long.valueOf(fk0Var.d), fk0Var);
            notificationsCustomSettingsActivity.l0(true);
        } else {
            notificationsCustomSettingsActivity.f35546a.getAdapter().m(this.f44137e);
        }
        ((org.telegram.ui.ActionBar.n2) notificationsCustomSettingsActivity).actionBar.h(true);
    }

    @Override
    public final void m() {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        MessagesController messagesController = notificationsCustomSettingsActivity.getMessagesController();
        long j10 = 0;
        long j11 = this.f44134a;
        notificationsCustomSettingsActivity.getNotificationsController().muteDialog(this.f44134a, j10, !messagesController.isDialogMuted(j11, j10));
        org.telegram.ui.Components.mc.A(notificationsCustomSettingsActivity, notificationsCustomSettingsActivity.getMessagesController().isDialogMuted(j11, j10), null).j();
        b();
    }

    @Override
    public final void o() {
        long j10 = this.f44134a;
        if (j10 != 0) {
            t01 t01Var = new t01(com.google.android.recaptcha.internal.a.h(j10, "dialog_id"), null);
            t01Var.f42745r = new g(this, 28);
            this.h.presentFragment(t01Var);
        }
    }

    @Override
    public final void u() {
        String sharedPrefKey = NotificationsController.getSharedPrefKey(this.f44134a, 0);
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(((org.telegram.ui.ActionBar.n2) notificationsCustomSettingsActivity).currentAccount);
        boolean z10 = notificationsSettings.getBoolean("sound_enabled_" + sharedPrefKey, true);
        boolean z11 = !z10;
        notificationsSettings.edit().putBoolean("sound_enabled_" + sharedPrefKey, z11).apply();
        if (org.telegram.ui.Components.mc.a(notificationsCustomSettingsActivity)) {
            org.telegram.ui.Components.mc.S(z10 ? 1 : 0, notificationsCustomSettingsActivity, notificationsCustomSettingsActivity.getResourceProvider()).j();
        }
    }

    @Override
    public final void v(int i10) {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.h;
        if (i10 == 0) {
            if (notificationsCustomSettingsActivity.getMessagesController().isDialogMuted(this.f44134a, 0)) {
                m();
            }
            if (org.telegram.ui.Components.mc.a(notificationsCustomSettingsActivity)) {
                org.telegram.ui.Components.mc.z(notificationsCustomSettingsActivity, 4, i10, notificationsCustomSettingsActivity.getResourceProvider()).j();
            }
        } else {
            notificationsCustomSettingsActivity.getNotificationsController().muteUntil(this.f44134a, 0, i10);
            if (org.telegram.ui.Components.mc.a(notificationsCustomSettingsActivity)) {
                org.telegram.ui.Components.mc.z(notificationsCustomSettingsActivity, 5, i10, notificationsCustomSettingsActivity.getResourceProvider()).j();
            }
        }
        b();
    }

    @Override
    public final void dismiss() {
    }

    @Override
    public final void k() {
    }
}
