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
public final class rk0 extends org.telegram.ui.Components.qm0 {
    public final Context f41494c;
    public ArrayList d = new ArrayList();
    public ArrayList f41495e = new ArrayList();
    public qk0 f41496f;
    public final gg.b2 h;
    public final NotificationsCustomSettingsActivity f41497n;

    public rk0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, Context context) {
        this.f41497n = notificationsCustomSettingsActivity;
        this.f41494c = context;
        gg.b2 b2Var = new gg.b2(true);
        this.h = b2Var;
        b2Var.f10532a = new gu(this, 24);
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        return true;
    }

    public final Object E(int i10) {
        if (i10 >= 0 && i10 < this.d.size()) {
            return this.d.get(i10);
        }
        int f7 = com.google.android.gms.internal.vision.e2.f(1, i10, this.d);
        gg.b2 b2Var = this.h;
        ArrayList arrayList = b2Var.f10535e;
        if (f7 >= 0 && f7 < arrayList.size()) {
            return b2Var.f10535e.get(f7);
        }
        return null;
    }

    public final void F(String str) {
        if (this.f41496f != null) {
            Utilities.searchQueue.cancelRunnable(this.f41496f);
            this.f41496f = null;
        }
        if (str == null) {
            this.d.clear();
            this.f41495e.clear();
            this.h.f(null, null);
            gg.b2 b2Var = this.h;
            int i10 = this.f41497n.f33872s;
            boolean z10 = true;
            b2Var.g(null, true, (i10 == 1 || i10 == 3) ? false : false, true, false, 0L, false, 0, 0);
            l();
            return;
        }
        DispatchQueue dispatchQueue = Utilities.searchQueue;
        qk0 qk0Var = new qk0(this, str, 0);
        this.f41496f = qk0Var;
        dispatchQueue.postRunnable(qk0Var, 300L);
    }

    @Override
    public final int h() {
        int size = this.d.size();
        ArrayList arrayList = this.h.f10535e;
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
    public final void v(s4.d1 d1Var, int i10) {
        int i11 = d1Var.f47706f;
        View view = d1Var.f47702a;
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
            vk0 vk0Var = (vk0) this.d.get(i10);
            CharSequence charSequence = (CharSequence) this.f41495e.get(i10);
            if (i10 == this.d.size() - 1) {
                z10 = false;
            }
            xaVar.g(vk0Var, charSequence, z10);
            xaVar.setAddButtonVisible(false);
            return;
        }
        int f7 = com.google.android.gms.internal.vision.e2.f(1, i10, this.d);
        ArrayList arrayList = this.h.f10535e;
        TLObject tLObject = (TLObject) arrayList.get(f7);
        String string = LocaleController.getString("NotificationsOn", R.string.NotificationsOn);
        if (f7 != arrayList.size() - 1) {
            z11 = true;
        }
        xaVar.d(tLObject, null, string, z11);
        xaVar.setAddButtonVisible(true);
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        View xaVar;
        if (i10 != 0) {
            xaVar = new org.telegram.ui.Cells.v3(this.f41494c, null);
            xaVar.setBackgroundColor(0);
            xaVar.setTag(-33024);
        } else {
            xaVar = new org.telegram.ui.Cells.xa(4, 0, this.f41494c, null, false, true);
        }
        return new s4.d1(xaVar);
    }
}
