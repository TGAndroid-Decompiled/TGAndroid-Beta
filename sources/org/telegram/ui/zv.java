package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class zv extends eq0 {
    public final boolean[] f52756a;
    public final uw f52757b;

    public zv(uw uwVar, boolean[] zArr) {
        this.f52757b = uwVar;
        this.f52756a = zArr;
    }

    @Override
    public final CharSequence C(int i3) {
        uw uwVar = this.f52757b;
        if (i3 >= 0 && i3 < uwVar.E2.size() && ((org.telegram.messenger.ye) uwVar.E2.get(i3)).f25310b) {
            return null;
        }
        return uw.w2(uwVar);
    }

    @Override
    public final void D() {
        int i3;
        uw uwVar = this.f52757b;
        org.telegram.ui.Components.ro0 ro0Var = uwVar.H2;
        if (ro0Var != null) {
            i3 = ((org.telegram.ui.ActionBar.d2) uwVar).currentAccount;
            ro0Var.i(i3, uwVar.E2);
        }
    }

    @Override
    public final mq0 E(org.telegram.messenger.zi ziVar, TLRPC.FileLocation fileLocation, int i3, boolean z10, boolean z11) {
        org.telegram.ui.Components.k9 k9Var;
        uw uwVar = this.f52757b;
        org.telegram.ui.Components.ro0 ro0Var = uwVar.H2;
        if (ro0Var != null) {
            k9Var = ro0Var.f(i3);
        } else {
            k9Var = null;
        }
        if (k9Var == null) {
            return null;
        }
        int[] iArr = new int[2];
        k9Var.getLocationInWindow(iArr);
        mq0 mq0Var = new mq0();
        mq0Var.f47752b = iArr[0];
        mq0Var.f47753c = iArr[1];
        mq0Var.d = uwVar.H2;
        ImageReceiver imageReceiver = k9Var.getImageReceiver();
        mq0Var.f47751a = imageReceiver;
        mq0Var.f47754e = imageReceiver.p();
        mq0Var.f47759k = k9Var.getScaleX();
        mq0Var.h = new int[]{org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f)};
        return mq0Var;
    }

    @Override
    public final int H() {
        ArrayList arrayList = this.f52757b.E2;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    @Override
    public final boolean I() {
        return this.f52757b.x3();
    }

    @Override
    public final long a() {
        uw uwVar = this.f52757b;
        if (uwVar.J2.isEmpty()) {
            return 0L;
        }
        return ((Long) uwVar.J2.get(0)).longValue();
    }

    @Override
    public final boolean b() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.zv.b():boolean");
    }

    @Override
    public final CharSequence c0(int i3) {
        int i10;
        uw uwVar = this.f52757b;
        ArrayList arrayList = uwVar.E2;
        if (arrayList == null || arrayList.isEmpty()) {
            return null;
        }
        int size = uwVar.E2.size();
        if (size == 1) {
            if (((org.telegram.messenger.ye) uwVar.E2.get(0)).f25310b) {
                i10 = 2131753933;
            } else {
                i10 = 2131753948;
            }
            return org.telegram.messenger.bd.M0(i10, null);
        }
        ArrayList arrayList2 = uwVar.E2;
        int size2 = arrayList2.size();
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i13 < size2) {
            Object obj = arrayList2.get(i13);
            i13++;
            if (((org.telegram.messenger.ye) obj).f25310b) {
                i11++;
            } else {
                i12++;
            }
        }
        if (i11 == 0) {
            return org.telegram.messenger.bd.G(size, "ShareSendPhotos", new Object[0]);
        }
        if (i12 == 0) {
            return org.telegram.messenger.bd.G(size, "ShareSendVideos", new Object[0]);
        }
        return org.telegram.messenger.bd.G(size, "ShareSendItems", new Object[0]);
    }

    @Override
    public final void e(CharSequence charSequence) {
        uw uwVar = this.f52757b;
        gv gvVar = uwVar.C1;
        if (gvVar != null) {
            gvVar.setFieldText(charSequence);
        }
        ArrayList arrayList = uwVar.E2;
        if (arrayList != null) {
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                ((org.telegram.messenger.ye) obj).f25309a = charSequence;
            }
        }
    }

    @Override
    public final boolean h() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.zv.h():boolean");
    }

    @Override
    public final org.telegram.messenger.cc j(int i3) {
        org.telegram.ui.Components.k9 k9Var;
        org.telegram.ui.Components.ro0 ro0Var = this.f52757b.H2;
        if (ro0Var != null) {
            k9Var = ro0Var.f(i3);
        } else {
            k9Var = null;
        }
        if (k9Var == null) {
            return null;
        }
        return k9Var.getImageReceiver().p();
    }

    @Override
    public final void o(int i3, org.telegram.messenger.b20 b20Var, boolean z10, int i10, int i11, boolean z11) {
        int i12;
        ArrayList arrayList;
        uw uwVar = this.f52757b;
        ArrayList arrayList2 = uwVar.J2;
        if (uwVar.C1 != null && (arrayList = uwVar.E2) != null && !arrayList.isEmpty()) {
            gv gvVar = uwVar.C1;
            CharSequence charSequence = ((org.telegram.messenger.ye) uwVar.E2.get(0)).f25309a;
            if (charSequence == null) {
                charSequence = "";
            }
            gvVar.setFieldText(charSequence);
        }
        org.telegram.ui.Components.ro0 ro0Var = uwVar.H2;
        if (ro0Var != null) {
            i12 = ((org.telegram.ui.ActionBar.d2) uwVar).currentAccount;
            ro0Var.i(i12, uwVar.E2);
        }
        if ((!z10 || i10 != 0 || z11) && uwVar.D2 != null && !arrayList2.isEmpty()) {
            uwVar.K2 = z10;
            uwVar.L2 = i10;
            uwVar.N2 = z11;
            ArrayList arrayList3 = new ArrayList();
            for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                arrayList3.add(org.telegram.messenger.pr.a(((Long) arrayList2.get(i13)).longValue(), 0L));
            }
            PhotoViewer.v1().H0(true, false);
            uwVar.D2.y(uwVar, arrayList3, uwVar.C1.getFieldText(), false, z10, i10, i11, null);
            return;
        }
        PhotoViewer.v1().H0(true, false);
    }

    @Override
    public final void s() {
        gv gvVar;
        org.telegram.ui.Components.sc h12;
        PhotoViewer v12 = PhotoViewer.v1();
        CharSequence charSequence = null;
        if (v12.U1() && (h12 = v12.h1()) != null) {
            charSequence = h12.getText();
        }
        uw uwVar = this.f52757b;
        if (charSequence != null && (gvVar = uwVar.C1) != null) {
            gvVar.setFieldText(charSequence);
        }
        ArrayList arrayList = uwVar.E2;
        if (arrayList != null) {
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                ((org.telegram.messenger.ye) obj).f25309a = charSequence;
            }
        }
    }

    @Override
    public final boolean x(int i3) {
        return this.f52756a[i3];
    }

    @Override
    public final int k(int i3, org.telegram.messenger.b20 b20Var) {
        return i3;
    }
}
