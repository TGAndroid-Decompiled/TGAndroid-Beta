package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public final class tr implements org.telegram.ui.Components.qj0, r0.m, org.telegram.ui.ActionBar.r1 {
    public final ContactsActivity f52341a;

    public tr(ContactsActivity contactsActivity) {
        this.f52341a = contactsActivity;
    }

    @Override
    public r0.l1 P0(View view, r0.l1 l1Var) {
        i0.b I0 = org.telegram.messenger.g0.I0(l1Var, false);
        int i7 = I0.d;
        ContactsActivity contactsActivity = this.f52341a;
        contactsActivity.f42992l0 = i7;
        ri.a.e(contactsActivity.d, I0.f15893b, i7, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), contactsActivity.f42989i0);
        contactsActivity.j0();
        contactsActivity.i0();
        return r0.l1.f56257b;
    }

    @Override
    public boolean c(int i7, View view) {
        ContactsActivity contactsActivity = this.f52341a;
        v4.i0 adapter = contactsActivity.d.getAdapter();
        vr vrVar = contactsActivity.f42978b;
        if (adapter == vrVar) {
            int S = vrVar.S(i7);
            int Q = contactsActivity.f42978b.Q(i7);
            org.telegram.ui.Components.gc gcVar = org.telegram.ui.Components.gc.f35453w;
            if (gcVar != null) {
                gcVar.b();
            }
            if (Q < 0 || S < 0) {
                return false;
            }
        }
        boolean z10 = contactsActivity.J;
        if (!z10 && !contactsActivity.K && (view instanceof org.telegram.ui.Cells.qa)) {
            contactsActivity.p0((org.telegram.ui.Cells.qa) view);
            return true;
        } else if (!z10 && !contactsActivity.K && (view instanceof org.telegram.ui.Cells.g6)) {
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
    public void h(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        ContactsActivity contactsActivity = this.f52341a;
        a0.h hVar = contactsActivity.f42977a0;
        ArrayList arrayList = new ArrayList(hVar.m());
        for (int i10 = 0; i10 < hVar.m(); i10++) {
            arrayList.add((TLRPC.User) hVar.f(hVar.j(i10)));
        }
        org.telegram.messenger.i5 contactsController = contactsActivity.getContactsController();
        Activity parentActivity = contactsActivity.getParentActivity();
        contactsController.getClass();
        if (!arrayList.isEmpty()) {
            HashMap hashMap = new HashMap();
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                TLRPC.User user = (TLRPC.User) arrayList.get(i11);
                TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) contactsController.f24571g0.get(Long.valueOf(user.f28554id));
                user.contact = false;
                contactsController.f24570f0.remove(tL_contact);
                contactsController.f24571g0.remove(Long.valueOf(user.f28554id));
                hashMap.put(user, tL_contact);
            }
            contactsController.d(false);
            org.telegram.messenger.ks notificationCenter = contactsController.getNotificationCenter();
            int i12 = org.telegram.messenger.mp.I8;
            notificationCenter.k(org.telegram.messenger.ks.f25179r, 1);
            contactsController.getNotificationCenter().k(org.telegram.messenger.ks.O, new Object[0]);
            org.telegram.ui.Components.yb ybVar = new org.telegram.ui.Components.yb(parentActivity, contactsActivity.getResourceProvider());
            ybVar.setTimer();
            ybVar.f42447b.setText(org.telegram.messenger.gd.G(hashMap.size(), "ContactsDeletedUndo", new Object[0]));
            org.telegram.ui.Components.ec ecVar = new org.telegram.ui.Components.ec(parentActivity, contactsActivity.getResourceProvider(), true, true);
            ecVar.f34666b = new org.telegram.messenger.w3(27, contactsController, hashMap);
            ecVar.f34667c = new org.telegram.messenger.y4(contactsController, arrayList, 1);
            ybVar.setButton(ecVar);
            org.telegram.ui.Components.gc.g(contactsActivity, ybVar, 5000).j();
        }
        contactsActivity.m0();
    }
}
