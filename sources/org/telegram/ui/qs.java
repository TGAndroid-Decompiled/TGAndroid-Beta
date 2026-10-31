package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public final class qs implements org.telegram.ui.Components.ik0, r0.m, org.telegram.ui.ActionBar.u1 {
    public final ContactsActivity f41042a;

    public qs(ContactsActivity contactsActivity) {
        this.f41042a = contactsActivity;
    }

    @Override
    public r0.j1 R0(View view, r0.j1 j1Var) {
        i0.c I0 = org.telegram.messenger.i0.I0(j1Var, false);
        int i10 = I0.d;
        ContactsActivity contactsActivity = this.f41042a;
        contactsActivity.f33292k0 = i10;
        ei.b.e(contactsActivity.d, I0.f7766b, i10, org.telegram.ui.ActionBar.l.getCurrentActionBarHeight(), contactsActivity.f33289h0);
        contactsActivity.i0();
        contactsActivity.h0();
        return r0.j1.f46131b;
    }

    @Override
    public boolean f(int i10, View view) {
        ContactsActivity contactsActivity = this.f41042a;
        s4.g0 adapter = contactsActivity.d.getAdapter();
        ss ssVar = contactsActivity.f33280b;
        if (adapter == ssVar) {
            int S = ssVar.S(i10);
            int Q = contactsActivity.f33280b.Q(i10);
            org.telegram.ui.Components.wb wbVar = org.telegram.ui.Components.wb.f32128w;
            if (wbVar != null) {
                wbVar.b();
            }
            if (Q < 0 || S < 0) {
                return false;
            }
        }
        boolean z10 = contactsActivity.I;
        if (!z10 && !contactsActivity.J && (view instanceof org.telegram.ui.Cells.pa)) {
            contactsActivity.o0((org.telegram.ui.Cells.pa) view);
            return true;
        } else if (!z10 && !contactsActivity.J && (view instanceof org.telegram.ui.Cells.k6)) {
            org.telegram.ui.Cells.k6 k6Var = (org.telegram.ui.Cells.k6) view;
            if (k6Var.getUser() != null && k6Var.getUser().contact) {
                contactsActivity.o0(k6Var);
            }
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        ContactsActivity contactsActivity = this.f41042a;
        a0.h hVar = contactsActivity.Z;
        ArrayList arrayList = new ArrayList(hVar.m());
        for (int i11 = 0; i11 < hVar.m(); i11++) {
            arrayList.add((TLRPC.User) hVar.f(hVar.j(i11)));
        }
        org.telegram.messenger.i5 contactsController = contactsActivity.getContactsController();
        Activity parentActivity = contactsActivity.getParentActivity();
        contactsController.getClass();
        if (!arrayList.isEmpty()) {
            HashMap hashMap = new HashMap();
            int size = arrayList.size();
            for (int i12 = 0; i12 < size; i12++) {
                TLRPC.User user = (TLRPC.User) arrayList.get(i12);
                TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) contactsController.f16067f0.get(Long.valueOf(user.f19942id));
                user.contact = false;
                contactsController.f16065e0.remove(tL_contact);
                contactsController.f16067f0.remove(Long.valueOf(user.f19942id));
                hashMap.put(user, tL_contact);
            }
            contactsController.d(false);
            org.telegram.messenger.zs notificationCenter = contactsController.getNotificationCenter();
            int i13 = org.telegram.messenger.vp.D8;
            notificationCenter.k(org.telegram.messenger.zs.f19676r, 1);
            contactsController.getNotificationCenter().k(org.telegram.messenger.zs.O, new Object[0]);
            org.telegram.ui.Components.ob obVar = new org.telegram.ui.Components.ob(parentActivity, contactsActivity.getResourceProvider());
            obVar.setTimer();
            obVar.f29023b.setText(org.telegram.messenger.cd.G(hashMap.size(), "ContactsDeletedUndo", new Object[0]));
            org.telegram.ui.Components.ub ubVar = new org.telegram.ui.Components.ub(parentActivity, contactsActivity.getResourceProvider(), true, true);
            ubVar.f30890b = new org.telegram.messenger.e4(25, contactsController, hashMap);
            ubVar.f30891c = new org.telegram.messenger.z4(contactsController, arrayList, 1);
            obVar.setButton(ubVar);
            org.telegram.ui.Components.wb.g(contactsActivity, obVar, 5000).j();
        }
        contactsActivity.l0();
    }
}
