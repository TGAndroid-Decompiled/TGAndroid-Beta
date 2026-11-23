package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public final class tr implements org.telegram.ui.Components.sj0, r0.m, org.telegram.ui.ActionBar.q1 {
    public final ContactsActivity f52333a;

    public tr(ContactsActivity contactsActivity) {
        this.f52333a = contactsActivity;
    }

    @Override
    public r0.l1 P0(View view, r0.l1 l1Var) {
        i0.b I0 = org.telegram.messenger.g0.I0(l1Var, false);
        int i7 = I0.d;
        ContactsActivity contactsActivity = this.f52333a;
        contactsActivity.f43002l0 = i7;
        ri.a.e(contactsActivity.d, I0.f15884b, i7, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), contactsActivity.f42999i0);
        contactsActivity.j0();
        contactsActivity.i0();
        return r0.l1.f56267b;
    }

    @Override
    public boolean c(int i7, View view) {
        ContactsActivity contactsActivity = this.f52333a;
        v4.h0 adapter = contactsActivity.d.getAdapter();
        vr vrVar = contactsActivity.f42988b;
        if (adapter == vrVar) {
            int S = vrVar.S(i7);
            int Q = contactsActivity.f42988b.Q(i7);
            org.telegram.ui.Components.gc gcVar = org.telegram.ui.Components.gc.f35481w;
            if (gcVar != null) {
                gcVar.b();
            }
            if (Q < 0 || S < 0) {
                return false;
            }
        }
        boolean z10 = contactsActivity.J;
        if (!z10 && !contactsActivity.K && (view instanceof org.telegram.ui.Cells.ra)) {
            contactsActivity.p0((org.telegram.ui.Cells.ra) view);
            return true;
        } else if (!z10 && !contactsActivity.K && (view instanceof org.telegram.ui.Cells.h6)) {
            org.telegram.ui.Cells.h6 h6Var = (org.telegram.ui.Cells.h6) view;
            if (h6Var.getUser() != null && h6Var.getUser().contact) {
                contactsActivity.p0(h6Var);
            }
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        ContactsActivity contactsActivity = this.f52333a;
        a0.h hVar = contactsActivity.f42987a0;
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
                TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) contactsController.f24570g0.get(Long.valueOf(user.f28547id));
                user.contact = false;
                contactsController.f24569f0.remove(tL_contact);
                contactsController.f24570g0.remove(Long.valueOf(user.f28547id));
                hashMap.put(user, tL_contact);
            }
            contactsController.d(false);
            org.telegram.messenger.ls notificationCenter = contactsController.getNotificationCenter();
            int i12 = org.telegram.messenger.np.I8;
            notificationCenter.k(org.telegram.messenger.ls.f25335r, 1);
            contactsController.getNotificationCenter().k(org.telegram.messenger.ls.O, new Object[0]);
            org.telegram.ui.Components.yb ybVar = new org.telegram.ui.Components.yb(parentActivity, contactsActivity.getResourceProvider());
            ybVar.setTimer();
            ybVar.f42352b.setText(org.telegram.messenger.hd.G(hashMap.size(), "ContactsDeletedUndo", new Object[0]));
            org.telegram.ui.Components.ec ecVar = new org.telegram.ui.Components.ec(parentActivity, contactsActivity.getResourceProvider(), true, true);
            ecVar.f34715b = new org.telegram.messenger.w3(27, contactsController, hashMap);
            ecVar.f34716c = new org.telegram.messenger.y4(contactsController, arrayList, 1);
            ybVar.setButton(ecVar);
            org.telegram.ui.Components.gc.g(contactsActivity, ybVar, 5000).j();
        }
        contactsActivity.m0();
    }
}
