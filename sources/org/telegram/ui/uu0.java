package org.telegram.ui;

import android.app.Dialog;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class uu0 implements org.telegram.ui.ActionBar.u1 {
    public final int f42350a;
    public final PrivacySettingsActivity f42351b;

    public uu0(PrivacySettingsActivity privacySettingsActivity, int i10) {
        this.f42350a = i10;
        this.f42351b = privacySettingsActivity;
    }

    public void a() {
        int i10;
        switch (this.f42350a) {
            case 2:
                PrivacySettingsActivity privacySettingsActivity = this.f42351b;
                vu0 vu0Var = privacySettingsActivity.f33766a;
                if (vu0Var != null && (i10 = privacySettingsActivity.f33775s) >= 0) {
                    vu0Var.g(i10);
                    return;
                }
                return;
            default:
                PrivacySettingsActivity.Z(this.f42351b);
                return;
        }
    }

    @Override
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        String L0;
        int i11 = this.f42350a;
        PrivacySettingsActivity privacySettingsActivity = this.f42351b;
        switch (i11) {
            case 0:
                try {
                    Dialog dialog = privacySettingsActivity.visibleDialog;
                    if (dialog != null) {
                        dialog.dismiss();
                    }
                } catch (Exception e) {
                    org.telegram.messenger.f8.g(e, true);
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(privacySettingsActivity.getParentActivity());
                String L02 = org.telegram.messenger.dd.L0(2131746809, "PrivacyPaymentsClearAlertTitle");
                org.telegram.ui.ActionBar.x1 x1Var2 = alertDialog$Builder.f20135a;
                x1Var2.R = L02;
                x1Var2.T = org.telegram.messenger.dd.L0(2131746811, "PrivacyPaymentsClearAlert");
                alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131752099, "ClearButton"), new uu0(privacySettingsActivity, 1));
                alertDialog$Builder.h(org.telegram.messenger.dd.L0(2131752589, "Cancel"), null);
                privacySettingsActivity.showDialog(x1Var2);
                privacySettingsActivity.showDialog(x1Var2);
                TextView textView = (TextView) x1Var2.d(-1);
                if (textView != null) {
                    org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.f21171q7, null);
                    return;
                }
                return;
            case 1:
                TLRPC.TL_payments_clearSavedInfo tL_payments_clearSavedInfo = new TLRPC.TL_payments_clearSavedInfo();
                boolean[] zArr = privacySettingsActivity.Z;
                tL_payments_clearSavedInfo.credentials = zArr[1];
                tL_payments_clearSavedInfo.info = zArr[0];
                privacySettingsActivity.getUserConfig().f15534y = null;
                privacySettingsActivity.getUserConfig().v(false);
                privacySettingsActivity.getConnectionsManager().sendRequest(tL_payments_clearSavedInfo, new ag.c3(4));
                boolean z10 = zArr[0];
                if (z10 && zArr[1]) {
                    L0 = org.telegram.messenger.dd.L0(2131746807, "PrivacyPaymentsPaymentShippingCleared");
                } else if (z10) {
                    L0 = org.telegram.messenger.dd.L0(2131746806, "PrivacyPaymentsShippingInfoCleared");
                } else if (zArr[1]) {
                    L0 = org.telegram.messenger.dd.L0(2131746808, "PrivacyPaymentsPaymentInfoCleared");
                } else {
                    return;
                }
                org.telegram.ui.Components.cc.a0(privacySettingsActivity).Q(2131623981, 36, L0).j();
                return;
            case 2:
            case 3:
            default:
                org.telegram.ui.ActionBar.x1 p5 = new AlertDialog$Builder(3, privacySettingsActivity.getParentActivity(), null).p();
                privacySettingsActivity.f33770c = p5;
                p5.f21489i0 = false;
                if (privacySettingsActivity.S != privacySettingsActivity.T) {
                    org.telegram.messenger.e20 userConfig = privacySettingsActivity.getUserConfig();
                    boolean z11 = privacySettingsActivity.T;
                    userConfig.U = z11;
                    privacySettingsActivity.S = z11;
                    privacySettingsActivity.getUserConfig().v(false);
                }
                org.telegram.messenger.i5 contactsController = privacySettingsActivity.getContactsController();
                tu0 tu0Var = new tu0(privacySettingsActivity, 1);
                contactsController.K();
                TLRPC.TL_contacts_deleteContacts tL_contacts_deleteContacts = new TLRPC.TL_contacts_deleteContacts();
                int size = contactsController.f16218e0.size();
                for (int i12 = 0; i12 < size; i12++) {
                    tL_contacts_deleteContacts.f19838id.add(contactsController.getMessagesController().n1(((TLRPC.TL_contact) contactsController.f16218e0.get(i12)).user_id));
                }
                contactsController.getConnectionsManager().sendRequest(tL_contacts_deleteContacts, new org.telegram.messenger.v4(0, contactsController, tu0Var));
                return;
            case 4:
                gf0 gf0Var = new gf0();
                tu0 tu0Var2 = new tu0(privacySettingsActivity, 2);
                gf0Var.F = 3;
                gf0Var.f37471a = 12;
                gf0Var.f37477d0 = tu0Var2;
                privacySettingsActivity.presentFragment(gf0Var);
                return;
        }
    }
}
