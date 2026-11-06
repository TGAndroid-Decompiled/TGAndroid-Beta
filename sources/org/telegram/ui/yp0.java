package org.telegram.ui;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class yp0 extends nq0 {
    public final org.telegram.messenger.jc f52301a;
    public final uq0 f52302b;
    public final org.telegram.messenger.ij f52303c;
    public final org.telegram.messenger.gf d;
    public final boolean f52304e;
    public final boolean f52305f;
    public final PhotoViewer f52306g;

    public yp0(PhotoViewer photoViewer, uq0 uq0Var, org.telegram.messenger.ij ijVar, org.telegram.messenger.gf gfVar, boolean z9, boolean z10) {
        this.f52306g = photoViewer;
        this.f52302b = uq0Var;
        this.f52303c = ijVar;
        this.d = gfVar;
        this.f52304e = z9;
        this.f52305f = z10;
        this.f52301a = photoViewer.B4.p();
    }

    @Override
    public final wq0 E(org.telegram.messenger.ij ijVar, TLRPC.FileLocation fileLocation, int i7, boolean z9, boolean z10) {
        uq0 uq0Var = this.f52302b;
        if (uq0Var != null) {
            return uq0Var.E(this.f52303c, null, 0, z9, false);
        }
        return null;
    }

    @Override
    public final void M(org.telegram.messenger.j20 j20Var) {
        org.telegram.messenger.gf gfVar = this.d;
        if (!gfVar.f26842w && !gfVar.v && !gfVar.f26841u && j20Var == null && TextUtils.isEmpty(gfVar.f26823a)) {
            return;
        }
        d0(j20Var, false, 0, true, false);
    }

    @Override
    public final org.telegram.messenger.ij V() {
        return this.f52303c;
    }

    public final void d0(org.telegram.messenger.j20 j20Var, boolean z9, int i7, boolean z10, boolean z11) {
        org.telegram.messenger.ij ijVar;
        PhotoViewer photoViewer = this.f52306g;
        if (photoViewer.f41437k4 != null) {
            qm qmVar = null;
            org.telegram.messenger.ij ijVar2 = this.f52303c;
            if (z10) {
                ijVar = ijVar2;
            } else {
                ijVar = null;
            }
            org.telegram.messenger.gf gfVar = this.d;
            if (ijVar != null && !TextUtils.isEmpty(gfVar.f26823a)) {
                ijVar.f23283w1 = gfVar.f26823a;
                ijVar.f23287x1 = gfVar.f26834n;
            }
            if (z10 || ijVar2 == null) {
                an anVar = photoViewer.f41437k4;
                ijVar2 = anVar.D5;
                qmVar = anVar.B5;
            }
            qm qmVar2 = qmVar;
            org.telegram.messenger.ij ijVar3 = ijVar2;
            if (gfVar.f26824b) {
                if (j20Var != null) {
                    org.telegram.messenger.c accountInstance = photoViewer.f41437k4.getAccountInstance();
                    String str = gfVar.I;
                    long a10 = photoViewer.f41437k4.a();
                    an anVar2 = photoViewer.f41437k4;
                    org.telegram.messenger.ij ijVar4 = anVar2.f43865l4;
                    ArrayList arrayList = gfVar.f26834n;
                    org.telegram.messenger.ij ijVar5 = ijVar;
                    org.telegram.messenger.gz.b0(gfVar.f26843x, i7, 0, a10, 0L, 0L, photoViewer.f41437k4.h9(), gfVar.f26823a, str, null, arrayList, accountInstance, ijVar3, ijVar4, ijVar5, photoViewer.f41437k4.f44005w5, anVar2.W8(), j20Var, null, null, qmVar2, z9, z11, gfVar.M);
                    return;
                }
                org.telegram.messenger.ij ijVar6 = ijVar;
                org.telegram.messenger.c accountInstance2 = photoViewer.f41437k4.getAccountInstance();
                String str2 = gfVar.I;
                long a11 = photoViewer.f41437k4.a();
                an anVar3 = photoViewer.f41437k4;
                org.telegram.messenger.ij ijVar7 = anVar3.f43865l4;
                ArrayList arrayList2 = gfVar.f26834n;
                org.telegram.messenger.gz.b0(gfVar.f26843x, i7, 0, a11, 0L, 0L, photoViewer.f41437k4.h9(), gfVar.f26823a, str2, null, arrayList2, accountInstance2, ijVar3, ijVar7, ijVar6, photoViewer.f41437k4.f44005w5, anVar3.W8(), null, null, null, qmVar2, z9, z11, gfVar.M);
                return;
            }
            org.telegram.messenger.ij ijVar8 = ijVar;
            if (gfVar.h != null) {
                org.telegram.messenger.c accountInstance3 = photoViewer.f41437k4.getAccountInstance();
                String str3 = gfVar.h;
                String str4 = gfVar.f26825c;
                long a12 = photoViewer.f41437k4.a();
                an anVar4 = photoViewer.f41437k4;
                org.telegram.messenger.gz.Z(accountInstance3, str3, str4, null, a12, ijVar3, anVar4.f43865l4, qmVar2, gfVar.f26834n, gfVar.f26838r, null, gfVar.f26843x, ijVar8, j20Var, z9, i7, z11, gfVar.f26823a, anVar4.W8(), 0L, 0L, photoViewer.f41437k4.h9(), photoViewer.f41437k4.f44005w5);
            } else if (gfVar.I != null) {
                org.telegram.messenger.c accountInstance4 = photoViewer.f41437k4.getAccountInstance();
                String str5 = gfVar.I;
                String str6 = gfVar.f26825c;
                long a13 = photoViewer.f41437k4.a();
                an anVar5 = photoViewer.f41437k4;
                org.telegram.messenger.gz.Z(accountInstance4, str5, str6, null, a13, ijVar3, anVar5.f43865l4, qmVar2, gfVar.f26834n, gfVar.f26838r, null, gfVar.f26843x, ijVar8, j20Var, z9, i7, z11, gfVar.f26823a, anVar5.W8(), 0L, 0L, photoViewer.f41437k4.h9(), photoViewer.f41437k4.f44005w5);
            }
        }
    }

    @Override
    public final boolean g() {
        return false;
    }

    @Override
    public final org.telegram.messenger.jc j(int i7) {
        return this.f52301a;
    }

    @Override
    public final void o(int i7, org.telegram.messenger.j20 j20Var, boolean z9, int i10, int i11, boolean z10) {
        d0(j20Var, z9, i10, false, z10);
    }

    @Override
    public final boolean p() {
        if (this.f52302b != null && this.f52304e) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean r() {
        if (this.f52302b != null && this.f52305f) {
            return true;
        }
        return false;
    }
}
