package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public final class tr implements org.telegram.ui.Components.dj0, r0.m, org.telegram.ui.ActionBar.r1 {
    public final ContactsActivity f50327a;

    public tr(ContactsActivity contactsActivity) {
        this.f50327a = contactsActivity;
    }

    @Override
    public r0.k1 S0(View view, r0.k1 k1Var) {
        i0.b I0 = org.telegram.messenger.g0.I0(k1Var, false);
        int i7 = I0.d;
        ContactsActivity contactsActivity = this.f50327a;
        contactsActivity.f41192k0 = i7;
        oi.a.e(contactsActivity.d, I0.f15123b, i7, org.telegram.ui.ActionBar.l.getCurrentActionBarHeight(), contactsActivity.f41189h0);
        contactsActivity.j0();
        contactsActivity.i0();
        return r0.k1.f54212b;
    }

    @Override
    public boolean c(int i7, View view) {
        ContactsActivity contactsActivity = this.f50327a;
        v4.g0 adapter = contactsActivity.d.getAdapter();
        vr vrVar = contactsActivity.f41179b;
        if (adapter == vrVar) {
            int S = vrVar.S(i7);
            int Q = contactsActivity.f41179b.Q(i7);
            org.telegram.ui.Components.bc bcVar = org.telegram.ui.Components.bc.f32195w;
            if (bcVar != null) {
                bcVar.b();
            }
            if (Q < 0 || S < 0) {
                return false;
            }
        }
        boolean z9 = contactsActivity.I;
        if (!z9 && !contactsActivity.J && (view instanceof org.telegram.ui.Cells.pa)) {
            contactsActivity.p0((org.telegram.ui.Cells.pa) view);
            return true;
        } else if (!z9 && !contactsActivity.J && (view instanceof org.telegram.ui.Cells.g6)) {
            org.telegram.ui.Cells.g6 g6Var = (org.telegram.ui.Cells.g6) view;
            if (g6Var.getUser() != null && g6Var.getUser().contact) {
                contactsActivity.p0(g6Var);
            }
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        ContactsActivity contactsActivity = this.f50327a;
        a0.h hVar = contactsActivity.Z;
        ArrayList arrayList = new ArrayList(hVar.m());
        for (int i10 = 0; i10 < hVar.m(); i10++) {
            arrayList.add((TLRPC.User) hVar.f(hVar.j(i10)));
        }
        org.telegram.messenger.g5 contactsController = contactsActivity.getContactsController();
        Activity parentActivity = contactsActivity.getParentActivity();
        contactsController.getClass();
        if (!arrayList.isEmpty()) {
            HashMap hashMap = new HashMap();
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                TLRPC.User user = (TLRPC.User) arrayList.get(i11);
                TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) contactsController.f22614f0.get(Long.valueOf(user.f27109id));
                user.contact = false;
                contactsController.f22612e0.remove(tL_contact);
                contactsController.f22614f0.remove(Long.valueOf(user.f27109id));
                hashMap.put(user, tL_contact);
            }
            contactsController.d(false);
            org.telegram.messenger.qs notificationCenter = contactsController.getNotificationCenter();
            int i12 = org.telegram.messenger.qp.C8;
            notificationCenter.k(org.telegram.messenger.qs.f25067r, 1);
            contactsController.getNotificationCenter().k(org.telegram.messenger.qs.O, new Object[0]);
            org.telegram.ui.Components.tb tbVar = new org.telegram.ui.Components.tb(parentActivity, contactsActivity.getResourceProvider());
            tbVar.setTimer();
            tbVar.f38269b.setText(org.telegram.messenger.id.G(hashMap.size(), "ContactsDeletedUndo", new Object[0]));
            org.telegram.ui.Components.zb zbVar = new org.telegram.ui.Components.zb(parentActivity, contactsActivity.getResourceProvider(), true, true);
            zbVar.f40908b = new org.telegram.messenger.b4(27, contactsController, hashMap);
            zbVar.f40909c = new org.telegram.messenger.w4(contactsController, arrayList, 1);
            tbVar.setButton(zbVar);
            org.telegram.ui.Components.bc.g(contactsActivity, tbVar, 5000).j();
        }
        contactsActivity.m0();
    }
}
