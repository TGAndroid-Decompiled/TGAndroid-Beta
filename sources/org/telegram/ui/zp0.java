package org.telegram.ui;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class zp0 extends oq0 {
    public final org.telegram.messenger.ic f54619a;
    public final uq0 f54620b;
    public final org.telegram.messenger.gj f54621c;
    public final org.telegram.messenger.ff d;
    public final boolean f54622e;
    public final boolean f54623f;
    public final PhotoViewer f54624g;

    public zp0(PhotoViewer photoViewer, uq0 uq0Var, org.telegram.messenger.gj gjVar, org.telegram.messenger.ff ffVar, boolean z10, boolean z11) {
        this.f54624g = photoViewer;
        this.f54620b = uq0Var;
        this.f54621c = gjVar;
        this.d = ffVar;
        this.f54622e = z10;
        this.f54623f = z11;
        this.f54619a = photoViewer.C4.p();
    }

    @Override
    public final wq0 E(org.telegram.messenger.gj gjVar, TLRPC.FileLocation fileLocation, int i7, boolean z10, boolean z11) {
        uq0 uq0Var = this.f54620b;
        if (uq0Var != null) {
            return uq0Var.E(this.f54621c, null, 0, z10, false);
        }
        return null;
    }

    @Override
    public final void M(org.telegram.messenger.f20 f20Var) {
        org.telegram.messenger.ff ffVar = this.d;
        if (!ffVar.f28077w && !ffVar.v && !ffVar.f28076u && f20Var == null && TextUtils.isEmpty(ffVar.f28058a)) {
            return;
        }
        d0(f20Var, false, 0, true, false);
    }

    @Override
    public final org.telegram.messenger.gj V() {
        return this.f54621c;
    }

    public final void d0(org.telegram.messenger.f20 f20Var, boolean z10, int i7, boolean z11, boolean z12) {
        org.telegram.messenger.gj gjVar;
        PhotoViewer photoViewer = this.f54624g;
        if (photoViewer.f43307l4 != null) {
            rm rmVar = null;
            org.telegram.messenger.gj gjVar2 = this.f54621c;
            if (z11) {
                gjVar = gjVar2;
            } else {
                gjVar = null;
            }
            org.telegram.messenger.ff ffVar = this.d;
            if (gjVar != null && !TextUtils.isEmpty(ffVar.f28058a)) {
                gjVar.f24269y1 = ffVar.f28058a;
                gjVar.f24273z1 = ffVar.f28069n;
            }
            if (z11 || gjVar2 == null) {
                bn bnVar = photoViewer.f43307l4;
                gjVar2 = bnVar.F5;
                rmVar = bnVar.D5;
            }
            rm rmVar2 = rmVar;
            org.telegram.messenger.gj gjVar3 = gjVar2;
            if (ffVar.f28059b) {
                if (f20Var != null) {
                    org.telegram.messenger.c accountInstance = photoViewer.f43307l4.getAccountInstance();
                    String str = ffVar.I;
                    long a10 = photoViewer.f43307l4.a();
                    bn bnVar2 = photoViewer.f43307l4;
                    org.telegram.messenger.gj gjVar4 = bnVar2.f46114m4;
                    ArrayList arrayList = ffVar.f28069n;
                    org.telegram.messenger.gj gjVar5 = gjVar;
                    org.telegram.messenger.az.b0(ffVar.f28078x, i7, 0, a10, 0L, 0L, photoViewer.f43307l4.j9(), ffVar.f28058a, str, null, arrayList, accountInstance, gjVar3, gjVar4, gjVar5, photoViewer.f43307l4.f46268y5, bnVar2.Y8(), f20Var, null, null, rmVar2, z10, z12, ffVar.M);
                    return;
                }
                org.telegram.messenger.gj gjVar6 = gjVar;
                org.telegram.messenger.c accountInstance2 = photoViewer.f43307l4.getAccountInstance();
                String str2 = ffVar.I;
                long a11 = photoViewer.f43307l4.a();
                bn bnVar3 = photoViewer.f43307l4;
                org.telegram.messenger.gj gjVar7 = bnVar3.f46114m4;
                ArrayList arrayList2 = ffVar.f28069n;
                org.telegram.messenger.az.b0(ffVar.f28078x, i7, 0, a11, 0L, 0L, photoViewer.f43307l4.j9(), ffVar.f28058a, str2, null, arrayList2, accountInstance2, gjVar3, gjVar7, gjVar6, photoViewer.f43307l4.f46268y5, bnVar3.Y8(), null, null, null, rmVar2, z10, z12, ffVar.M);
                return;
            }
            org.telegram.messenger.gj gjVar8 = gjVar;
            if (ffVar.h != null) {
                org.telegram.messenger.c accountInstance3 = photoViewer.f43307l4.getAccountInstance();
                String str3 = ffVar.h;
                String str4 = ffVar.f28060c;
                long a12 = photoViewer.f43307l4.a();
                bn bnVar4 = photoViewer.f43307l4;
                org.telegram.messenger.az.Z(accountInstance3, str3, str4, null, a12, gjVar3, bnVar4.f46114m4, rmVar2, ffVar.f28069n, ffVar.f28073r, null, ffVar.f28078x, gjVar8, f20Var, z10, i7, z12, ffVar.f28058a, bnVar4.Y8(), 0L, 0L, photoViewer.f43307l4.j9(), photoViewer.f43307l4.f46268y5);
            } else if (ffVar.I != null) {
                org.telegram.messenger.c accountInstance4 = photoViewer.f43307l4.getAccountInstance();
                String str5 = ffVar.I;
                String str6 = ffVar.f28060c;
                long a13 = photoViewer.f43307l4.a();
                bn bnVar5 = photoViewer.f43307l4;
                org.telegram.messenger.az.Z(accountInstance4, str5, str6, null, a13, gjVar3, bnVar5.f46114m4, rmVar2, ffVar.f28069n, ffVar.f28073r, null, ffVar.f28078x, gjVar8, f20Var, z10, i7, z12, ffVar.f28058a, bnVar5.Y8(), 0L, 0L, photoViewer.f43307l4.j9(), photoViewer.f43307l4.f46268y5);
            }
        }
    }

    @Override
    public final boolean g() {
        return false;
    }

    @Override
    public final org.telegram.messenger.ic j(int i7) {
        return this.f54619a;
    }

    @Override
    public final void o(int i7, org.telegram.messenger.f20 f20Var, boolean z10, int i10, int i11, boolean z11) {
        d0(f20Var, z10, i10, false, z11);
    }

    @Override
    public final boolean p() {
        if (this.f54620b != null && this.f54622e) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean r() {
        if (this.f54620b != null && this.f54623f) {
            return true;
        }
        return false;
    }
}
