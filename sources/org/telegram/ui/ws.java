package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class ws implements org.telegram.ui.ActionBar.c2, org.telegram.ui.Components.xk0, org.telegram.ui.Components.ll0, r0.n {
    public final ContactsActivity f38384a;

    public ws(ContactsActivity contactsActivity) {
        this.f38384a = contactsActivity;
    }

    @Override
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        int i10 = AndroidUtilities.getDefaultWindowInsets(l1Var, false).d;
        ContactsActivity contactsActivity = this.f38384a;
        contactsActivity.f29867q0 = i10;
        contactsActivity.j0();
        contactsActivity.i0();
        contactsActivity.h0();
        return r0.l1.f41073b;
    }

    @Override
    public void a() {
        this.f38384a.g0();
    }

    @Override
    public boolean d(int i10, View view) {
        ContactsActivity contactsActivity = this.f38384a;
        s4.h0 adapter = contactsActivity.f29855f.getAdapter();
        bt btVar = contactsActivity.d;
        if (adapter == btVar) {
            int S = btVar.S(i10);
            int Q = contactsActivity.d.Q(i10);
            org.telegram.ui.Components.pc pcVar = org.telegram.ui.Components.pc.f26074w;
            if (pcVar != null) {
                pcVar.b();
            }
            if (Q < 0 || S < 0) {
                return false;
            }
        }
        boolean z10 = contactsActivity.K;
        if (!z10 && !contactsActivity.L && (view instanceof org.telegram.ui.Cells.bb)) {
            contactsActivity.r0((org.telegram.ui.Cells.bb) view);
            return true;
        } else if (!z10 && !contactsActivity.L && (view instanceof org.telegram.ui.Cells.j6)) {
            org.telegram.ui.Cells.j6 j6Var = (org.telegram.ui.Cells.j6) view;
            if (j6Var.getUser() != null && j6Var.getUser().contact) {
                contactsActivity.r0(j6Var);
            }
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void f(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        ContactsActivity contactsActivity = this.f38384a;
        contactsActivity.getClass();
        a0.i iVar = contactsActivity.f29853d0;
        ArrayList arrayList = new ArrayList(iVar.m());
        for (int i11 = 0; i11 < iVar.m(); i11++) {
            arrayList.add((TLRPC.User) iVar.f(iVar.j(i11)));
        }
        contactsActivity.getContactsController().deleteContactsUndoable(contactsActivity.getParentActivity(), contactsActivity, arrayList);
        contactsActivity.o0();
    }
}
