package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public final class sr implements org.telegram.ui.Components.ij0, r0.m, org.telegram.ui.ActionBar.q1 {
    public final ContactsActivity f51262a;

    public sr(ContactsActivity contactsActivity) {
        this.f51262a = contactsActivity;
    }

    @Override
    public r0.k1 M0(View view, r0.k1 k1Var) {
        i0.c I0 = org.telegram.messenger.g0.I0(k1Var, false);
        int i7 = I0.d;
        ContactsActivity contactsActivity = this.f51262a;
        contactsActivity.f42548l0 = i7;
        ri.a.e(contactsActivity.d, I0.f15575b, i7, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), contactsActivity.f42545i0);
        contactsActivity.j0();
        contactsActivity.i0();
        return r0.k1.f55681b;
    }

    @Override
    public boolean b(int i7, View view) {
        ContactsActivity contactsActivity = this.f51262a;
        v4.h0 adapter = contactsActivity.d.getAdapter();
        vr vrVar = contactsActivity.f42534b;
        if (adapter == vrVar) {
            int S = vrVar.S(i7);
            int Q = contactsActivity.f42534b.Q(i7);
            org.telegram.ui.Components.xb xbVar = org.telegram.ui.Components.xb.f41635w;
            if (xbVar != null) {
                xbVar.b();
            }
            if (Q < 0 || S < 0) {
                return false;
            }
        }
        boolean z10 = contactsActivity.J;
        if (!z10 && !contactsActivity.K && (view instanceof org.telegram.ui.Cells.pa)) {
            contactsActivity.p0((org.telegram.ui.Cells.pa) view);
            return true;
        } else if (!z10 && !contactsActivity.K && (view instanceof org.telegram.ui.Cells.f6)) {
            org.telegram.ui.Cells.f6 f6Var = (org.telegram.ui.Cells.f6) view;
            if (f6Var.getUser() != null && f6Var.getUser().contact) {
                contactsActivity.p0(f6Var);
            }
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        ContactsActivity contactsActivity = this.f51262a;
        a0.h hVar = contactsActivity.f42533a0;
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
                TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) contactsController.f23680g0.get(Long.valueOf(user.f28200id));
                user.contact = false;
                contactsController.f23679f0.remove(tL_contact);
                contactsController.f23680g0.remove(Long.valueOf(user.f28200id));
                hashMap.put(user, tL_contact);
            }
            contactsController.d(false);
            org.telegram.messenger.ns notificationCenter = contactsController.getNotificationCenter();
            int i12 = org.telegram.messenger.np.D8;
            notificationCenter.k(org.telegram.messenger.ns.f25559r, 1);
            contactsController.getNotificationCenter().k(org.telegram.messenger.ns.O, new Object[0]);
            org.telegram.ui.Components.pb pbVar = new org.telegram.ui.Components.pb(parentActivity, contactsActivity.getResourceProvider());
            pbVar.setTimer();
            pbVar.f38262b.setText(org.telegram.messenger.hd.G(hashMap.size(), "ContactsDeletedUndo", new Object[0]));
            org.telegram.ui.Components.vb vbVar = new org.telegram.ui.Components.vb(parentActivity, contactsActivity.getResourceProvider(), true, true);
            vbVar.f40369b = new org.telegram.messenger.b4(27, contactsController, hashMap);
            vbVar.f40370c = new org.telegram.messenger.w4(contactsController, arrayList, 1);
            pbVar.setButton(vbVar);
            org.telegram.ui.Components.xb.g(contactsActivity, pbVar, 5000).j();
        }
        contactsActivity.m0();
    }
}
