package org.telegram.ui;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class xp0 extends mq0 {
    public final org.telegram.messenger.ic f53282a;
    public final sq0 f53283b;
    public final org.telegram.messenger.gj f53284c;
    public final org.telegram.messenger.ff d;
    public final boolean f53285e;
    public final boolean f53286f;
    public final PhotoViewer f53287g;

    public xp0(PhotoViewer photoViewer, sq0 sq0Var, org.telegram.messenger.gj gjVar, org.telegram.messenger.ff ffVar, boolean z10, boolean z11) {
        this.f53287g = photoViewer;
        this.f53283b = sq0Var;
        this.f53284c = gjVar;
        this.d = ffVar;
        this.f53285e = z10;
        this.f53286f = z11;
        this.f53282a = photoViewer.C4.p();
    }

    @Override
    public final uq0 E(org.telegram.messenger.gj gjVar, TLRPC.FileLocation fileLocation, int i7, boolean z10, boolean z11) {
        sq0 sq0Var = this.f53283b;
        if (sq0Var != null) {
            return sq0Var.E(this.f53284c, null, 0, z10, false);
        }
        return null;
    }

    @Override
    public final void M(org.telegram.messenger.g20 g20Var) {
        org.telegram.messenger.ff ffVar = this.d;
        if (!ffVar.f27728w && !ffVar.v && !ffVar.f27727u && g20Var == null && TextUtils.isEmpty(ffVar.f27709a)) {
            return;
        }
        d0(g20Var, false, 0, true, false);
    }

    @Override
    public final org.telegram.messenger.gj V() {
        return this.f53284c;
    }

    public final void d0(org.telegram.messenger.g20 g20Var, boolean z10, int i7, boolean z11, boolean z12) {
        org.telegram.messenger.gj gjVar;
        PhotoViewer photoViewer = this.f53287g;
        if (photoViewer.f42817l4 != null) {
            qm qmVar = null;
            org.telegram.messenger.gj gjVar2 = this.f53284c;
            if (z11) {
                gjVar = gjVar2;
            } else {
                gjVar = null;
            }
            org.telegram.messenger.ff ffVar = this.d;
            if (gjVar != null && !TextUtils.isEmpty(ffVar.f27709a)) {
                gjVar.f23875y1 = ffVar.f27709a;
                gjVar.f23879z1 = ffVar.f27720n;
            }
            if (z11 || gjVar2 == null) {
                an anVar = photoViewer.f42817l4;
                gjVar2 = anVar.E5;
                qmVar = anVar.C5;
            }
            qm qmVar2 = qmVar;
            org.telegram.messenger.gj gjVar3 = gjVar2;
            if (ffVar.f27710b) {
                if (g20Var != null) {
                    org.telegram.messenger.c accountInstance = photoViewer.f42817l4.getAccountInstance();
                    String str = ffVar.I;
                    long a10 = photoViewer.f42817l4.a();
                    an anVar2 = photoViewer.f42817l4;
                    org.telegram.messenger.gj gjVar4 = anVar2.f45280m4;
                    ArrayList arrayList = ffVar.f27720n;
                    org.telegram.messenger.gj gjVar5 = gjVar;
                    org.telegram.messenger.ez.b0(ffVar.f27729x, i7, 0, a10, 0L, 0L, photoViewer.f42817l4.j9(), ffVar.f27709a, str, null, arrayList, accountInstance, gjVar3, gjVar4, gjVar5, photoViewer.f42817l4.f45421x5, anVar2.Y8(), g20Var, null, null, qmVar2, z10, z12, ffVar.M);
                    return;
                }
                org.telegram.messenger.gj gjVar6 = gjVar;
                org.telegram.messenger.c accountInstance2 = photoViewer.f42817l4.getAccountInstance();
                String str2 = ffVar.I;
                long a11 = photoViewer.f42817l4.a();
                an anVar3 = photoViewer.f42817l4;
                org.telegram.messenger.gj gjVar7 = anVar3.f45280m4;
                ArrayList arrayList2 = ffVar.f27720n;
                org.telegram.messenger.ez.b0(ffVar.f27729x, i7, 0, a11, 0L, 0L, photoViewer.f42817l4.j9(), ffVar.f27709a, str2, null, arrayList2, accountInstance2, gjVar3, gjVar7, gjVar6, photoViewer.f42817l4.f45421x5, anVar3.Y8(), null, null, null, qmVar2, z10, z12, ffVar.M);
                return;
            }
            org.telegram.messenger.gj gjVar8 = gjVar;
            if (ffVar.h != null) {
                org.telegram.messenger.c accountInstance3 = photoViewer.f42817l4.getAccountInstance();
                String str3 = ffVar.h;
                String str4 = ffVar.f27711c;
                long a12 = photoViewer.f42817l4.a();
                an anVar4 = photoViewer.f42817l4;
                org.telegram.messenger.ez.Z(accountInstance3, str3, str4, null, a12, gjVar3, anVar4.f45280m4, qmVar2, ffVar.f27720n, ffVar.f27724r, null, ffVar.f27729x, gjVar8, g20Var, z10, i7, z12, ffVar.f27709a, anVar4.Y8(), 0L, 0L, photoViewer.f42817l4.j9(), photoViewer.f42817l4.f45421x5);
            } else if (ffVar.I != null) {
                org.telegram.messenger.c accountInstance4 = photoViewer.f42817l4.getAccountInstance();
                String str5 = ffVar.I;
                String str6 = ffVar.f27711c;
                long a13 = photoViewer.f42817l4.a();
                an anVar5 = photoViewer.f42817l4;
                org.telegram.messenger.ez.Z(accountInstance4, str5, str6, null, a13, gjVar3, anVar5.f45280m4, qmVar2, ffVar.f27720n, ffVar.f27724r, null, ffVar.f27729x, gjVar8, g20Var, z10, i7, z12, ffVar.f27709a, anVar5.Y8(), 0L, 0L, photoViewer.f42817l4.j9(), photoViewer.f42817l4.f45421x5);
            }
        }
    }

    @Override
    public final boolean g() {
        return false;
    }

    @Override
    public final org.telegram.messenger.ic j(int i7) {
        return this.f53282a;
    }

    @Override
    public final void o(int i7, org.telegram.messenger.g20 g20Var, boolean z10, int i10, int i11, boolean z11) {
        d0(g20Var, z10, i10, false, z11);
    }

    @Override
    public final boolean p() {
        if (this.f53283b != null && this.f53285e) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean r() {
        if (this.f53283b != null && this.f53286f) {
            return true;
        }
        return false;
    }
}
