package org.telegram.ui;

import android.app.Dialog;
import android.graphics.Bitmap;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
public final class x21 implements org.telegram.messenger.z10 {
    public final int f53074a;
    public final Object f53075b;
    public final Object f53076c;

    public x21(int i7, Object obj, Object obj2) {
        this.f53074a = i7;
        this.f53075b = obj;
        this.f53076c = obj2;
    }

    @Override
    public final void a(Object obj) {
        v4.e1 K;
        int i7 = this.f53074a;
        Object obj2 = this.f53076c;
        Object obj3 = this.f53075b;
        switch (i7) {
            case 0:
                Boolean bool = (Boolean) obj;
                k31.c0((k31) obj3, (TLRPC.TL_attachMenuBot) obj2);
                return;
            case 1:
                ThemeActivity themeActivity = (ThemeActivity) obj3;
                AtomicReference atomicReference = (AtomicReference) obj2;
                if (!((Boolean) obj).booleanValue()) {
                    org.telegram.messenger.gz.f23988u0 = false;
                    org.telegram.messenger.gz.y();
                    themeActivity.P0 = true;
                    ((Dialog) atomicReference.get()).dismiss();
                    org.telegram.ui.Components.uj0 uj0Var = themeActivity.f43386b;
                    if (uj0Var != null && uj0Var.H && (K = uj0Var.K(themeActivity.N)) != null) {
                        themeActivity.f43384a.t(K, themeActivity.N);
                        return;
                    }
                    return;
                }
                return;
            case 2:
                ThemeActivity themeActivity2 = (ThemeActivity) obj3;
                fy0 fy0Var = (fy0) obj2;
                if (((Boolean) obj).booleanValue()) {
                    fy0Var.run();
                    return;
                } else {
                    org.telegram.ui.Components.cc.a0(themeActivity2).I(2131624012, org.telegram.messenger.hd.M0(2131754311, null), org.telegram.messenger.hd.M0(2131754312, null)).j();
                    return;
                }
            case 3:
                org.telegram.ui.Wallet.l0 l0Var = (org.telegram.ui.Wallet.l0) obj3;
                org.telegram.ui.Wallet.l8 l8Var = (org.telegram.ui.Wallet.l8) obj2;
                String str = (String) obj;
                if (str != null) {
                    org.telegram.ui.Wallet.l0.j("disableBackupWithoutUpdatingPhrase: ".concat(str));
                    l8Var.a(str);
                    return;
                }
                org.telegram.ui.Wallet.l0.H("sending disableBackup to server");
                org.telegram.ui.Wallet.f3.a(l0Var.f44078a, new ci.x(11), null, null, null, new fi.b0(6, l0Var, l8Var), true, true, new bg.u0((Object) null, 2));
                return;
            case 4:
                org.telegram.ui.Wallet.i0 i0Var = (org.telegram.ui.Wallet.i0) obj3;
                try {
                    ((org.telegram.messenger.z10) obj2).a((String) obj);
                    if (i0Var != null) {
                        return;
                    }
                    return;
                } finally {
                    if (i0Var != null) {
                        i0Var.close();
                    }
                }
            case 5:
                ((org.telegram.ui.Wallet.i0) obj3).close();
                ((org.telegram.ui.Wallet.g8) obj2).a((String) obj);
                return;
            case 6:
                ((org.telegram.ui.Wallet.l0) obj3).f44092q.put((TL_wallet.walletTransaction) obj, (di.h3) obj2);
                return;
            case 7:
                org.telegram.ui.Wallet.g0 g0Var = (org.telegram.ui.Wallet.g0) obj3;
                org.telegram.ui.Wallet.h8 h8Var = (org.telegram.ui.Wallet.h8) obj2;
                String str2 = (String) obj;
                if (str2 != null) {
                    g0Var.close();
                    org.telegram.ui.Wallet.l0.j("prepare disable backup, failed to save secret phrase to local storage: ".concat(str2));
                    h8Var.a(null, str2);
                    return;
                }
                org.telegram.ui.Wallet.l0.H("prepare disable backup: done!");
                h8Var.a(g0Var, null);
                return;
            case 8:
                ((org.telegram.ui.Wallet.i0) obj3).close();
                ((x21) obj2).a((String) obj);
                return;
            case 9:
                org.telegram.messenger.g0.h3(new org.telegram.ui.Wallet.g((org.telegram.ui.Wallet.y1) obj3, (org.telegram.ui.Wallet.k) obj2, (String) obj, 2));
                return;
            case 10:
                ((org.telegram.ui.Wallet.d2) obj3).h = false;
                ((k60) obj2).a(null, (String) obj);
                return;
            case 11:
                ((org.telegram.ui.Wallet.i0) obj3).close();
                ((org.telegram.ui.Wallet.m) obj2).a((String) obj);
                return;
            case 12:
                ((org.telegram.ui.Wallet.i0) obj3).close();
                ((org.telegram.ui.Wallet.m) obj2).a((String) obj);
                return;
            case 13:
                org.telegram.ui.Wallet.y5 y5Var = (org.telegram.ui.Wallet.y5) obj3;
                org.telegram.ui.Wallet.l0 l0Var2 = (org.telegram.ui.Wallet.l0) obj2;
                String str3 = (String) obj;
                y5Var.D0.setLoading(false);
                if ("NO_LOCAL_BACKUP".equalsIgnoreCase(str3)) {
                    org.telegram.ui.Wallet.f8 f8Var = new org.telegram.ui.Wallet.f8();
                    f8Var.f43846s = l0Var2.y();
                    y5Var.presentFragment(f8Var);
                    return;
                } else if (str3 != null) {
                    org.telegram.ui.Components.cc.a0(y5Var).e0(str3, false);
                    return;
                } else {
                    y5Var.presentFragment(new org.telegram.ui.Wallet.z9());
                    return;
                }
            case 14:
                org.telegram.ui.Wallet.f8 f8Var2 = (org.telegram.ui.Wallet.f8) obj3;
                org.telegram.ui.Wallet.l0 l0Var3 = (org.telegram.ui.Wallet.l0) obj2;
                String str4 = (String) obj;
                f8Var2.d.setLoading(false);
                if (str4 != null) {
                    org.telegram.ui.Components.cc.a0(f8Var2).e0(str4, false);
                    return;
                }
                f8Var2.finishFragment();
                l0Var3.L();
                return;
            case 15:
                org.telegram.ui.Wallet.p8 p8Var = (org.telegram.ui.Wallet.p8) obj3;
                org.telegram.ui.ActionBar.e2 e2Var = (org.telegram.ui.ActionBar.e2) obj2;
                String str5 = (String) obj;
                if (str5 != null) {
                    org.telegram.ui.Components.cc.a0(p8Var).e0(str5, false);
                    return;
                }
                p8Var.finishFragment();
                if (e2Var instanceof org.telegram.ui.Wallet.y5) {
                    org.telegram.messenger.g0.i3(new org.telegram.ui.Wallet.l3(2, e2Var), 300L);
                    return;
                }
                return;
            case 16:
                org.telegram.ui.Wallet.z9 z9Var = (org.telegram.ui.Wallet.z9) obj3;
                String str6 = (String) obj;
                ((org.telegram.messenger.z10) obj2).a(str6);
                if (str6 == null && !z9Var.f44861r) {
                    if (z9Var.getParentLayout() != null) {
                        for (org.telegram.ui.ActionBar.e2 e2Var2 : z9Var.getParentLayout().getFragmentStack()) {
                            if (e2Var2 instanceof org.telegram.ui.Wallet.y5) {
                                ((org.telegram.ui.Wallet.y5) e2Var2).P0();
                            }
                        }
                    }
                    z9Var.finishFragment();
                    return;
                }
                return;
            case 17:
                org.telegram.ui.Wallet.ka.d0((org.telegram.ui.Wallet.ka) obj3, (TL_wallet.tonConnectSession) obj2, (org.telegram.messenger.z10) obj);
                return;
            case 18:
                org.telegram.ui.web.n1 n1Var = (org.telegram.ui.web.n1) obj3;
                org.telegram.ui.web.w0 w0Var = (org.telegram.ui.web.w0) obj;
                n1Var.getClass();
                ((org.telegram.ui.web.x0[]) obj2)[0].finishFragment();
                org.telegram.messenger.z10 z10Var = n1Var.f52729f;
                if (z10Var != null) {
                    n1Var.finishFragment();
                    z10Var.a(w0Var);
                    return;
                }
                vf.c.t(n1Var.getParentActivity(), w0Var.f52860c);
                return;
            default:
                org.telegram.ui.web.v1 v1Var = (org.telegram.ui.web.v1) obj3;
                v1Var.getClass();
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.lv0(v1Var, (org.telegram.ui.web.u1) obj2, (Bitmap) obj, 11));
                return;
        }
    }

    public x21(org.telegram.ui.Wallet.l0 l0Var, org.telegram.ui.Wallet.g0 g0Var, org.telegram.ui.Wallet.h8 h8Var) {
        this.f53074a = 7;
        this.f53075b = g0Var;
        this.f53076c = h8Var;
    }
}
