package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
public final class wk0 extends org.telegram.ui.Components.lm0 {
    public final Context f41612c;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public vk0 f41613f;
    public final hg.a2 h;
    public final NotificationsCustomSettingsActivity f41614n;

    public wk0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, Context context) {
        this.f41614n = notificationsCustomSettingsActivity;
        this.f41612c = context;
        hg.a2 a2Var = new hg.a2(true);
        this.h = a2Var;
        a2Var.f10484a = new mu(this, 24);
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        return true;
    }

    public final Object E(int i10) {
        if (i10 >= 0 && i10 < this.d.size()) {
            return this.d.get(i10);
        }
        int g10 = com.google.android.gms.internal.play_billing.k3.g(1, i10, this.d);
        hg.a2 a2Var = this.h;
        ArrayList arrayList = a2Var.e;
        if (g10 >= 0 && g10 < arrayList.size()) {
            return a2Var.e.get(g10);
        }
        return null;
    }

    public final void F(String str) {
        if (this.f41613f != null) {
            Utilities.searchQueue.cancelRunnable(this.f41613f);
            this.f41613f = null;
        }
        if (str == null) {
            this.d.clear();
            this.e.clear();
            this.h.f(null, null);
            hg.a2 a2Var = this.h;
            int i10 = this.f41614n.f32159s;
            boolean z10 = true;
            a2Var.g(null, true, (i10 == 1 || i10 == 3) ? false : false, true, false, 0L, false, 0, 0);
            l();
            return;
        }
        DispatchQueue dispatchQueue = Utilities.searchQueue;
        vk0 vk0Var = new vk0(this, str, 0);
        this.f41613f = vk0Var;
        dispatchQueue.postRunnable(vk0Var, 300L);
    }

    @Override
    public final int h() {
        int size = this.d.size();
        ArrayList arrayList = this.h.e;
        if (!arrayList.isEmpty()) {
            return arrayList.size() + 1 + size;
        }
        return size;
    }

    @Override
    public final int j(int i10) {
        if (i10 == this.d.size()) {
            return 1;
        }
        return 0;
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        int i11 = b1Var.f44841f;
        View view = b1Var.f44838a;
        boolean z10 = true;
        if (i11 != 0) {
            if (i11 != 1) {
                return;
            }
            ((org.telegram.ui.Cells.v3) view).setText(LocaleController.getString("AddToExceptions", R.string.AddToExceptions));
            return;
        }
        org.telegram.ui.Cells.xa xaVar = (org.telegram.ui.Cells.xa) view;
        boolean z11 = false;
        if (i10 < this.d.size()) {
            al0 al0Var = (al0) this.d.get(i10);
            CharSequence charSequence = (CharSequence) this.e.get(i10);
            if (i10 == this.d.size() - 1) {
                z10 = false;
            }
            xaVar.g(al0Var, charSequence, z10);
            xaVar.setAddButtonVisible(false);
            return;
        }
        int g10 = com.google.android.gms.internal.play_billing.k3.g(1, i10, this.d);
        ArrayList arrayList = this.h.e;
        TLObject tLObject = (TLObject) arrayList.get(g10);
        String string = LocaleController.getString("NotificationsOn", R.string.NotificationsOn);
        if (g10 != arrayList.size() - 1) {
            z11 = true;
        }
        xaVar.e(tLObject, null, string, z11);
        xaVar.setAddButtonVisible(true);
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View xaVar;
        if (i10 != 0) {
            xaVar = new org.telegram.ui.Cells.v3(this.f41612c, null);
            xaVar.setBackgroundColor(0);
            xaVar.setTag(-33024);
        } else {
            xaVar = new org.telegram.ui.Cells.xa(4, 0, this.f41612c, null, false, true);
        }
        return new s4.b1(xaVar);
    }
}
