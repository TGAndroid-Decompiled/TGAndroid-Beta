package org.telegram.ui;

import android.content.SharedPreferences;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
public final class sl implements sm {
    public final fo f39843a;
    public final fo f39844b;

    public sl(fo foVar, fo foVar2) {
        this.f39844b = foVar;
        this.f39843a = foVar2;
    }

    @Override
    public final void R0(int i10) {
        this.f39844b.j(i10, 0, true, 0, true, 0);
    }

    @Override
    public final void W(boolean z10, boolean z11) {
        int L8;
        ArrayList arrayList;
        org.telegram.ui.Components.ac acVar;
        int i10;
        fo foVar = this.f39844b;
        if (z10) {
            ArrayList arrayList2 = new ArrayList(foVar.H4);
            ArrayList arrayList3 = new ArrayList(foVar.J4.values());
            org.telegram.ui.Components.sc scVar = null;
            if (z11) {
                i10 = ((org.telegram.ui.ActionBar.m2) foVar).currentAccount;
                SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i10);
                if (foVar.H4.isEmpty()) {
                    SharedPreferences.Editor edit = notificationsSettings.edit();
                    edit.remove("pin_" + foVar.T5).commit();
                } else {
                    SharedPreferences.Editor edit2 = notificationsSettings.edit();
                    edit2.putInt("pin_" + foVar.T5, ((Integer) foVar.H4.get(0)).intValue()).commit();
                }
                foVar.Cc(0, true);
            } else {
                foVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didLoadPinnedMessages, Long.valueOf(foVar.T5), arrayList2, Boolean.FALSE, 0, 0, 0, 0, Boolean.TRUE);
            }
            org.telegram.ui.Components.sc scVar2 = foVar.A3;
            if (scVar2 != null) {
                scVar2.b();
            }
            foVar.B3 = true;
            int i11 = foVar.C3 + 1;
            foVar.C3 = i11;
            boolean z12 = foVar.f35665h4;
            fo foVar2 = this.f39843a;
            if (z12) {
                L8 = foVar2.L8();
            } else {
                L8 = foVar.L8();
            }
            int i12 = L8;
            if (foVar.f35665h4) {
                arrayList = foVar2.H4;
            } else {
                arrayList = foVar.H4;
            }
            ArrayList arrayList4 = new ArrayList(arrayList);
            org.telegram.messenger.y7 y7Var = new org.telegram.messenger.y7(this, z11, arrayList2, arrayList3, i12, i11);
            org.telegram.messenger.voip.m0 m0Var = new org.telegram.messenger.voip.m0(this, z11, arrayList4, i11);
            co coVar = foVar.f35633ea;
            if (foVar.getParentActivity() == null) {
                m0Var.run();
            } else {
                if (z11) {
                    org.telegram.ui.Components.pc pcVar = new org.telegram.ui.Components.pc(foVar.getParentActivity(), coVar);
                    pcVar.c(R.raw.ic_unpin, 28, 28, "Pin", "Line");
                    pcVar.f27960b.setText(LocaleController.getString(R.string.PinnedMessagesHidden));
                    pcVar.f27961c.setText(LocaleController.getString(R.string.PinnedMessagesHiddenInfo));
                    acVar = pcVar;
                } else {
                    org.telegram.ui.Components.ac acVar2 = new org.telegram.ui.Components.ac(foVar.getParentActivity(), coVar);
                    acVar2.c(R.raw.ic_unpin, 28, 28, "Pin", "Line");
                    acVar2.f23192b.setText(LocaleController.formatPluralString("MessagesUnpinned", i12, new Object[0]));
                    acVar = acVar2;
                }
                org.telegram.ui.Components.qc qcVar = new org.telegram.ui.Components.qc(foVar.getParentActivity(), coVar, true);
                qcVar.f28266a = y7Var;
                qcVar.f28267b = m0Var;
                acVar.setButton(qcVar);
                scVar = org.telegram.ui.Components.sc.g(foVar, acVar, 5000);
            }
            foVar.A3 = scVar;
            return;
        }
        MessageObject messageObject = (MessageObject) foVar.J4.get(Integer.valueOf(foVar.L4));
        if (messageObject == null) {
            messageObject = (MessageObject) foVar.f35753o6[0].get(foVar.L4);
        }
        foVar.gc(messageObject);
    }

    @Override
    public final void r0(String str) {
        this.f39844b.ia(str, false);
    }
}
