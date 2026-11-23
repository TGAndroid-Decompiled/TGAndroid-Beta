package org.telegram.ui;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class zp0 extends oq0 {
    public final org.telegram.messenger.hc f54681a;
    public final uq0 f54682b;
    public final org.telegram.messenger.fj f54683c;
    public final org.telegram.messenger.ef d;
    public final boolean f54684e;
    public final boolean f54685f;
    public final PhotoViewer f54686g;

    public zp0(PhotoViewer photoViewer, uq0 uq0Var, org.telegram.messenger.fj fjVar, org.telegram.messenger.ef efVar, boolean z10, boolean z11) {
        this.f54686g = photoViewer;
        this.f54682b = uq0Var;
        this.f54683c = fjVar;
        this.d = efVar;
        this.f54684e = z10;
        this.f54685f = z11;
        this.f54681a = photoViewer.C4.p();
    }

    @Override
    public final wq0 E(org.telegram.messenger.fj fjVar, TLRPC.FileLocation fileLocation, int i7, boolean z10, boolean z11) {
        uq0 uq0Var = this.f54682b;
        if (uq0Var != null) {
            return uq0Var.E(this.f54683c, null, 0, z10, false);
        }
        return null;
    }

    @Override
    public final void M(org.telegram.messenger.d20 d20Var) {
        org.telegram.messenger.ef efVar = this.d;
        if (!efVar.f27981w && !efVar.v && !efVar.f27980u && d20Var == null && TextUtils.isEmpty(efVar.f27962a)) {
            return;
        }
        d0(d20Var, false, 0, true, false);
    }

    @Override
    public final org.telegram.messenger.fj V() {
        return this.f54683c;
    }

    public final void d0(org.telegram.messenger.d20 d20Var, boolean z10, int i7, boolean z11, boolean z12) {
        org.telegram.messenger.fj fjVar;
        PhotoViewer photoViewer = this.f54686g;
        if (photoViewer.f43388l4 != null) {
            rm rmVar = null;
            org.telegram.messenger.fj fjVar2 = this.f54683c;
            if (z11) {
                fjVar = fjVar2;
            } else {
                fjVar = null;
            }
            org.telegram.messenger.ef efVar = this.d;
            if (fjVar != null && !TextUtils.isEmpty(efVar.f27962a)) {
                fjVar.f24129y1 = efVar.f27962a;
                fjVar.f24133z1 = efVar.f27973n;
            }
            if (z11 || fjVar2 == null) {
                bn bnVar = photoViewer.f43388l4;
                fjVar2 = bnVar.F5;
                rmVar = bnVar.D5;
            }
            rm rmVar2 = rmVar;
            org.telegram.messenger.fj fjVar3 = fjVar2;
            if (efVar.f27963b) {
                if (d20Var != null) {
                    org.telegram.messenger.c accountInstance = photoViewer.f43388l4.getAccountInstance();
                    String str = efVar.I;
                    long a10 = photoViewer.f43388l4.a();
                    bn bnVar2 = photoViewer.f43388l4;
                    org.telegram.messenger.fj fjVar4 = bnVar2.f46282m4;
                    ArrayList arrayList = efVar.f27973n;
                    org.telegram.messenger.fj fjVar5 = fjVar;
                    org.telegram.messenger.zy.b0(efVar.f27982x, i7, 0, a10, 0L, 0L, photoViewer.f43388l4.j9(), efVar.f27962a, str, null, arrayList, accountInstance, fjVar3, fjVar4, fjVar5, photoViewer.f43388l4.f46436y5, bnVar2.Y8(), d20Var, null, null, rmVar2, z10, z12, efVar.M);
                    return;
                }
                org.telegram.messenger.fj fjVar6 = fjVar;
                org.telegram.messenger.c accountInstance2 = photoViewer.f43388l4.getAccountInstance();
                String str2 = efVar.I;
                long a11 = photoViewer.f43388l4.a();
                bn bnVar3 = photoViewer.f43388l4;
                org.telegram.messenger.fj fjVar7 = bnVar3.f46282m4;
                ArrayList arrayList2 = efVar.f27973n;
                org.telegram.messenger.zy.b0(efVar.f27982x, i7, 0, a11, 0L, 0L, photoViewer.f43388l4.j9(), efVar.f27962a, str2, null, arrayList2, accountInstance2, fjVar3, fjVar7, fjVar6, photoViewer.f43388l4.f46436y5, bnVar3.Y8(), null, null, null, rmVar2, z10, z12, efVar.M);
                return;
            }
            org.telegram.messenger.fj fjVar8 = fjVar;
            if (efVar.h != null) {
                org.telegram.messenger.c accountInstance3 = photoViewer.f43388l4.getAccountInstance();
                String str3 = efVar.h;
                String str4 = efVar.f27964c;
                long a12 = photoViewer.f43388l4.a();
                bn bnVar4 = photoViewer.f43388l4;
                org.telegram.messenger.zy.Z(accountInstance3, str3, str4, null, a12, fjVar3, bnVar4.f46282m4, rmVar2, efVar.f27973n, efVar.f27977r, null, efVar.f27982x, fjVar8, d20Var, z10, i7, z12, efVar.f27962a, bnVar4.Y8(), 0L, 0L, photoViewer.f43388l4.j9(), photoViewer.f43388l4.f46436y5);
            } else if (efVar.I != null) {
                org.telegram.messenger.c accountInstance4 = photoViewer.f43388l4.getAccountInstance();
                String str5 = efVar.I;
                String str6 = efVar.f27964c;
                long a13 = photoViewer.f43388l4.a();
                bn bnVar5 = photoViewer.f43388l4;
                org.telegram.messenger.zy.Z(accountInstance4, str5, str6, null, a13, fjVar3, bnVar5.f46282m4, rmVar2, efVar.f27973n, efVar.f27977r, null, efVar.f27982x, fjVar8, d20Var, z10, i7, z12, efVar.f27962a, bnVar5.Y8(), 0L, 0L, photoViewer.f43388l4.j9(), photoViewer.f43388l4.f46436y5);
            }
        }
    }

    @Override
    public final boolean g() {
        return false;
    }

    @Override
    public final org.telegram.messenger.hc j(int i7) {
        return this.f54681a;
    }

    @Override
    public final void o(int i7, org.telegram.messenger.d20 d20Var, boolean z10, int i10, int i11, boolean z11) {
        d0(d20Var, z10, i10, false, z11);
    }

    @Override
    public final boolean p() {
        if (this.f54682b != null && this.f54684e) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean r() {
        if (this.f54682b != null && this.f54685f) {
            return true;
        }
        return false;
    }
}
