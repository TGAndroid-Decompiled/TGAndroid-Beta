package org.telegram.ui;

import android.content.SharedPreferences;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
public final class sl implements rm {
    public final eo f41950a;
    public final eo f41951b;

    public sl(eo eoVar, eo eoVar2) {
        this.f41951b = eoVar;
        this.f41950a = eoVar2;
    }

    @Override
    public final void O0(int i10) {
        this.f41951b.F(i10, 0, 0, 0, true, true);
    }

    @Override
    public final void W(boolean z10, boolean z11) {
        int L8;
        ArrayList arrayList;
        org.telegram.ui.Components.ac acVar;
        int i10;
        eo eoVar = this.f41951b;
        if (z10) {
            ArrayList arrayList2 = new ArrayList(eoVar.H4);
            ArrayList arrayList3 = new ArrayList(eoVar.J4.values());
            org.telegram.ui.Components.sc scVar = null;
            if (z11) {
                i10 = ((org.telegram.ui.ActionBar.m2) eoVar).currentAccount;
                SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i10);
                if (eoVar.H4.isEmpty()) {
                    SharedPreferences.Editor edit = notificationsSettings.edit();
                    edit.remove("pin_" + eoVar.T5).commit();
                } else {
                    SharedPreferences.Editor edit2 = notificationsSettings.edit();
                    edit2.putInt("pin_" + eoVar.T5, ((Integer) eoVar.H4.get(0)).intValue()).commit();
                }
                eoVar.Cc(0, true);
            } else {
                eoVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didLoadPinnedMessages, Long.valueOf(eoVar.T5), arrayList2, Boolean.FALSE, 0, 0, 0, 0, Boolean.TRUE);
            }
            org.telegram.ui.Components.sc scVar2 = eoVar.A3;
            if (scVar2 != null) {
                scVar2.b();
            }
            eoVar.B3 = true;
            int i11 = eoVar.C3 + 1;
            eoVar.C3 = i11;
            boolean z12 = eoVar.f37281h4;
            eo eoVar2 = this.f41950a;
            if (z12) {
                L8 = eoVar2.L8();
            } else {
                L8 = eoVar.L8();
            }
            int i12 = L8;
            if (eoVar.f37281h4) {
                arrayList = eoVar2.H4;
            } else {
                arrayList = eoVar.H4;
            }
            ArrayList arrayList4 = new ArrayList(arrayList);
            org.telegram.messenger.y7 y7Var = new org.telegram.messenger.y7(this, z11, arrayList2, arrayList3, i12, i11);
            org.telegram.messenger.voip.m0 m0Var = new org.telegram.messenger.voip.m0(this, z11, arrayList4, i11);
            bo boVar = eoVar.f37251ea;
            if (eoVar.getParentActivity() == null) {
                m0Var.run();
            } else {
                if (z11) {
                    org.telegram.ui.Components.pc pcVar = new org.telegram.ui.Components.pc(eoVar.getParentActivity(), boVar);
                    pcVar.c(R.raw.ic_unpin, 28, 28, "Pin", "Line");
                    pcVar.f29481b.setText(LocaleController.getString(R.string.PinnedMessagesHidden));
                    pcVar.f29482c.setText(LocaleController.getString(R.string.PinnedMessagesHiddenInfo));
                    acVar = pcVar;
                } else {
                    org.telegram.ui.Components.ac acVar2 = new org.telegram.ui.Components.ac(eoVar.getParentActivity(), boVar);
                    acVar2.c(R.raw.ic_unpin, 28, 28, "Pin", "Line");
                    acVar2.f24276b.setText(LocaleController.formatPluralString("MessagesUnpinned", i12, new Object[0]));
                    acVar = acVar2;
                }
                org.telegram.ui.Components.qc qcVar = new org.telegram.ui.Components.qc(eoVar.getParentActivity(), boVar, true);
                qcVar.f29816a = y7Var;
                qcVar.f29817b = m0Var;
                acVar.setButton(qcVar);
                scVar = org.telegram.ui.Components.sc.g(eoVar, acVar, 5000);
            }
            eoVar.A3 = scVar;
            return;
        }
        MessageObject messageObject = (MessageObject) eoVar.J4.get(Integer.valueOf(eoVar.L4));
        if (messageObject == null) {
            messageObject = (MessageObject) eoVar.f37368o6[0].get(eoVar.L4);
        }
        eoVar.gc(messageObject);
    }

    @Override
    public final void p0(String str) {
        this.f41951b.ia(str, false);
    }
}
