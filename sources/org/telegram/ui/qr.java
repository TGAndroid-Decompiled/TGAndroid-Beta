package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public final class qr implements org.telegram.ui.Components.dj0, r0.m, org.telegram.ui.ActionBar.r1 {
    public final ContactsActivity f49300a;

    public qr(ContactsActivity contactsActivity) {
        this.f49300a = contactsActivity;
    }

    @Override
    public r0.k1 S0(View view, r0.k1 k1Var) {
        i0.b I0 = org.telegram.messenger.g0.I0(k1Var, false);
        int i7 = I0.d;
        ContactsActivity contactsActivity = this.f49300a;
        contactsActivity.f41194k0 = i7;
        oi.a.e(contactsActivity.d, I0.f15121b, i7, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), contactsActivity.f41191h0);
        contactsActivity.j0();
        contactsActivity.i0();
        return r0.k1.f54200b;
    }

    @Override
    public boolean c(int i7, View view) {
        ContactsActivity contactsActivity = this.f49300a;
        v4.g0 adapter = contactsActivity.d.getAdapter();
        sr srVar = contactsActivity.f41181b;
        if (adapter == srVar) {
            int S = srVar.S(i7);
            int Q = contactsActivity.f41181b.Q(i7);
            org.telegram.ui.Components.cc ccVar = org.telegram.ui.Components.cc.f32537w;
            if (ccVar != null) {
                ccVar.b();
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
        ContactsActivity contactsActivity = this.f49300a;
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
                TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) contactsController.f22610f0.get(Long.valueOf(user.f27105id));
                user.contact = false;
                contactsController.f22608e0.remove(tL_contact);
                contactsController.f22610f0.remove(Long.valueOf(user.f27105id));
                hashMap.put(user, tL_contact);
            }
            contactsController.d(false);
            org.telegram.messenger.qs notificationCenter = contactsController.getNotificationCenter();
            int i12 = org.telegram.messenger.qp.C8;
            notificationCenter.k(org.telegram.messenger.qs.f25063r, 1);
            contactsController.getNotificationCenter().k(org.telegram.messenger.qs.O, new Object[0]);
            org.telegram.ui.Components.ub ubVar = new org.telegram.ui.Components.ub(parentActivity, contactsActivity.getResourceProvider());
            ubVar.setTimer();
            ubVar.f38592b.setText(org.telegram.messenger.id.G(hashMap.size(), "ContactsDeletedUndo", new Object[0]));
            org.telegram.ui.Components.ac acVar = new org.telegram.ui.Components.ac(parentActivity, contactsActivity.getResourceProvider(), true, true);
            acVar.f31765b = new org.telegram.messenger.b4(27, contactsController, hashMap);
            acVar.f31766c = new org.telegram.messenger.w4(contactsController, arrayList, 1);
            ubVar.setButton(acVar);
            org.telegram.ui.Components.cc.g(contactsActivity, ubVar, 5000).j();
        }
        contactsActivity.m0();
    }
}
