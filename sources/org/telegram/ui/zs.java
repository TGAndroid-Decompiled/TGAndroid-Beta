package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class zs implements org.telegram.ui.ActionBar.z1, org.telegram.ui.Components.ol0, org.telegram.ui.Components.cm0, r0.o {
    public final ContactsActivity f42708a;

    public zs(ContactsActivity contactsActivity) {
        this.f42708a = contactsActivity;
    }

    @Override
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        int i10 = AndroidUtilities.getDefaultWindowInsets(l1Var, false).d;
        ContactsActivity contactsActivity = this.f42708a;
        contactsActivity.f32043q0 = i10;
        contactsActivity.j0();
        contactsActivity.i0();
        contactsActivity.h0();
        return r0.l1.f43740b;
    }

    @Override
    public boolean a(int i10, View view) {
        ContactsActivity contactsActivity = this.f42708a;
        s4.g0 adapter = contactsActivity.f32031f.getAdapter();
        et etVar = contactsActivity.d;
        if (adapter == etVar) {
            int S = etVar.S(i10);
            int Q = contactsActivity.d.Q(i10);
            org.telegram.ui.Components.sc scVar = org.telegram.ui.Components.sc.f29095w;
            if (scVar != null) {
                scVar.b();
            }
            if (Q < 0 || S < 0) {
                return false;
            }
        }
        boolean z10 = contactsActivity.K;
        if (!z10 && !contactsActivity.L && (view instanceof org.telegram.ui.Cells.xa)) {
            contactsActivity.r0((org.telegram.ui.Cells.xa) view);
            return true;
        } else if (!z10 && !contactsActivity.L && (view instanceof org.telegram.ui.Cells.i6)) {
            org.telegram.ui.Cells.i6 i6Var = (org.telegram.ui.Cells.i6) view;
            if (i6Var.getUser() != null && i6Var.getUser().contact) {
                contactsActivity.r0(i6Var);
            }
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void c() {
        this.f42708a.g0();
    }

    @Override
    public void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        ContactsActivity contactsActivity = this.f42708a;
        contactsActivity.getClass();
        a0.h hVar = contactsActivity.f32029d0;
        ArrayList arrayList = new ArrayList(hVar.m());
        for (int i11 = 0; i11 < hVar.m(); i11++) {
            arrayList.add((TLRPC.User) hVar.f(hVar.j(i11)));
        }
        contactsActivity.getContactsController().deleteContactsUndoable(contactsActivity.getParentActivity(), contactsActivity, arrayList);
        contactsActivity.o0();
    }
}
