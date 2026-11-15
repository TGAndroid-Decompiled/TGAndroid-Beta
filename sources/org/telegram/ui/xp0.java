package org.telegram.ui;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class xp0 extends mq0 {
    public final org.telegram.messenger.ic f53278a;
    public final sq0 f53279b;
    public final org.telegram.messenger.gj f53280c;
    public final org.telegram.messenger.ff d;
    public final boolean f53281e;
    public final boolean f53282f;
    public final PhotoViewer f53283g;

    public xp0(PhotoViewer photoViewer, sq0 sq0Var, org.telegram.messenger.gj gjVar, org.telegram.messenger.ff ffVar, boolean z10, boolean z11) {
        this.f53283g = photoViewer;
        this.f53279b = sq0Var;
        this.f53280c = gjVar;
        this.d = ffVar;
        this.f53281e = z10;
        this.f53282f = z11;
        this.f53278a = photoViewer.C4.p();
    }

    @Override
    public final uq0 E(org.telegram.messenger.gj gjVar, TLRPC.FileLocation fileLocation, int i7, boolean z10, boolean z11) {
        sq0 sq0Var = this.f53279b;
        if (sq0Var != null) {
            return sq0Var.E(this.f53280c, null, 0, z10, false);
        }
        return null;
    }

    @Override
    public final void M(org.telegram.messenger.g20 g20Var) {
        org.telegram.messenger.ff ffVar = this.d;
        if (!ffVar.f27726w && !ffVar.v && !ffVar.f27725u && g20Var == null && TextUtils.isEmpty(ffVar.f27707a)) {
            return;
        }
        d0(g20Var, false, 0, true, false);
    }

    @Override
    public final org.telegram.messenger.gj V() {
        return this.f53280c;
    }

    public final void d0(org.telegram.messenger.g20 g20Var, boolean z10, int i7, boolean z11, boolean z12) {
        org.telegram.messenger.gj gjVar;
        PhotoViewer photoViewer = this.f53283g;
        if (photoViewer.f42817l4 != null) {
            qm qmVar = null;
            org.telegram.messenger.gj gjVar2 = this.f53280c;
            if (z11) {
                gjVar = gjVar2;
            } else {
                gjVar = null;
            }
            org.telegram.messenger.ff ffVar = this.d;
            if (gjVar != null && !TextUtils.isEmpty(ffVar.f27707a)) {
                gjVar.f23873y1 = ffVar.f27707a;
                gjVar.f23877z1 = ffVar.f27718n;
            }
            if (z11 || gjVar2 == null) {
                an anVar = photoViewer.f42817l4;
                gjVar2 = anVar.E5;
                qmVar = anVar.C5;
            }
            qm qmVar2 = qmVar;
            org.telegram.messenger.gj gjVar3 = gjVar2;
            if (ffVar.f27708b) {
                if (g20Var != null) {
                    org.telegram.messenger.c accountInstance = photoViewer.f42817l4.getAccountInstance();
                    String str = ffVar.I;
                    long a10 = photoViewer.f42817l4.a();
                    an anVar2 = photoViewer.f42817l4;
                    org.telegram.messenger.gj gjVar4 = anVar2.f45281m4;
                    ArrayList arrayList = ffVar.f27718n;
                    org.telegram.messenger.gj gjVar5 = gjVar;
                    org.telegram.messenger.ez.b0(ffVar.f27727x, i7, 0, a10, 0L, 0L, photoViewer.f42817l4.j9(), ffVar.f27707a, str, null, arrayList, accountInstance, gjVar3, gjVar4, gjVar5, photoViewer.f42817l4.f45422x5, anVar2.Y8(), g20Var, null, null, qmVar2, z10, z12, ffVar.M);
                    return;
                }
                org.telegram.messenger.gj gjVar6 = gjVar;
                org.telegram.messenger.c accountInstance2 = photoViewer.f42817l4.getAccountInstance();
                String str2 = ffVar.I;
                long a11 = photoViewer.f42817l4.a();
                an anVar3 = photoViewer.f42817l4;
                org.telegram.messenger.gj gjVar7 = anVar3.f45281m4;
                ArrayList arrayList2 = ffVar.f27718n;
                org.telegram.messenger.ez.b0(ffVar.f27727x, i7, 0, a11, 0L, 0L, photoViewer.f42817l4.j9(), ffVar.f27707a, str2, null, arrayList2, accountInstance2, gjVar3, gjVar7, gjVar6, photoViewer.f42817l4.f45422x5, anVar3.Y8(), null, null, null, qmVar2, z10, z12, ffVar.M);
                return;
            }
            org.telegram.messenger.gj gjVar8 = gjVar;
            if (ffVar.h != null) {
                org.telegram.messenger.c accountInstance3 = photoViewer.f42817l4.getAccountInstance();
                String str3 = ffVar.h;
                String str4 = ffVar.f27709c;
                long a12 = photoViewer.f42817l4.a();
                an anVar4 = photoViewer.f42817l4;
                org.telegram.messenger.ez.Z(accountInstance3, str3, str4, null, a12, gjVar3, anVar4.f45281m4, qmVar2, ffVar.f27718n, ffVar.f27722r, null, ffVar.f27727x, gjVar8, g20Var, z10, i7, z12, ffVar.f27707a, anVar4.Y8(), 0L, 0L, photoViewer.f42817l4.j9(), photoViewer.f42817l4.f45422x5);
            } else if (ffVar.I != null) {
                org.telegram.messenger.c accountInstance4 = photoViewer.f42817l4.getAccountInstance();
                String str5 = ffVar.I;
                String str6 = ffVar.f27709c;
                long a13 = photoViewer.f42817l4.a();
                an anVar5 = photoViewer.f42817l4;
                org.telegram.messenger.ez.Z(accountInstance4, str5, str6, null, a13, gjVar3, anVar5.f45281m4, qmVar2, ffVar.f27718n, ffVar.f27722r, null, ffVar.f27727x, gjVar8, g20Var, z10, i7, z12, ffVar.f27707a, anVar5.Y8(), 0L, 0L, photoViewer.f42817l4.j9(), photoViewer.f42817l4.f45422x5);
            }
        }
    }

    @Override
    public final boolean g() {
        return false;
    }

    @Override
    public final org.telegram.messenger.ic j(int i7) {
        return this.f53278a;
    }

    @Override
    public final void o(int i7, org.telegram.messenger.g20 g20Var, boolean z10, int i10, int i11, boolean z11) {
        d0(g20Var, z10, i10, false, z11);
    }

    @Override
    public final boolean p() {
        if (this.f53279b != null && this.f53281e) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean r() {
        if (this.f53279b != null && this.f53282f) {
            return true;
        }
        return false;
    }
}
