package org.telegram.ui;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.Layout;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.regex.Pattern;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class st implements org.telegram.ui.Components.ik0, org.telegram.ui.Components.yu0, org.telegram.ui.Components.wf0, org.telegram.ui.ActionBar.u1, org.telegram.messenger.hp, org.telegram.messenger.p20, org.telegram.ui.Components.xc0, org.telegram.ui.ActionBar.i1, org.telegram.ui.Components.ek0, zf.l1, org.telegram.ui.Components.jk0, r0.m, pt, fe.e, wh0 {
    public final int f41457a;
    public final Object f41458b;

    public st(Object obj, int i10) {
        this.f41457a = i10;
        this.f41458b = obj;
    }

    @Override
    public a0.h M() {
        switch (this.f41457a) {
            case 12:
                return null;
            default:
                return null;
        }
    }

    @Override
    public r0.j1 R0(View view, r0.j1 j1Var) {
        m90 m90Var = (m90) this.f41458b;
        i0.c I0 = org.telegram.messenger.i0.I0(j1Var, false);
        if (!m90Var.f39483a.equals(I0)) {
            m90Var.f39483a = I0;
            m90Var.requestLayout();
        }
        int childCount = m90Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            r0.h0.b(m90Var.getChildAt(i10), j1Var);
        }
        return j1Var;
    }

    @Override
    public boolean Y(int i10) {
        switch (this.f41457a) {
            case 12:
                return true;
            default:
                return true;
        }
    }

    @Override
    public boolean a(TLRPC.TL_error tL_error) {
        ((a3.h0) this.f41458b).run();
        return true;
    }

    @Override
    public void b(float f7, float f10, int i10, View view) {
        org.telegram.ui.Components.b51 G;
        Object obj;
        long j10;
        int i11;
        int Z;
        boolean[] zArr;
        int i12 = this.f41457a;
        Object obj2 = this.f41458b;
        switch (i12) {
            case 0:
                tt ttVar = (tt) obj2;
                HashSet hashSet = ttVar.T1;
                if (!ttVar.U1 && (G = ttVar.V1.G(i10 - 1)) != null && (obj = G.G) != null) {
                    if (obj instanceof TLRPC.User) {
                        j10 = ((TLRPC.User) obj).f19943id;
                    } else if (obj instanceof TLRPC.Chat) {
                        j10 = ((TLRPC.Chat) obj).f19794id;
                    } else {
                        return;
                    }
                    if (hashSet.contains(Long.valueOf(j10))) {
                        hashSet.remove(Long.valueOf(j10));
                    } else {
                        hashSet.add(Long.valueOf(j10));
                    }
                    if (view instanceof qg.k) {
                        ((qg.k) view).c(hashSet.contains(Long.valueOf(j10)), true);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                DataAutoDownloadActivity.b0((DataAutoDownloadActivity) obj2, view, i10, f7);
                return;
            default:
                ab0 ab0Var = (ab0) obj2;
                ArrayList arrayList = ab0Var.f35741s;
                if (view != null && i10 >= 0 && i10 < arrayList.size()) {
                    va0 va0Var = (va0) arrayList.get(i10);
                    int i13 = va0Var.f7681a;
                    int i14 = va0Var.e;
                    if (i13 != 3 && i13 != 4) {
                        if (i13 == 5 && va0Var.f42465f == 1) {
                            SharedPreferences d12 = org.telegram.messenger.wp.d1();
                            boolean z10 = d12.getBoolean("view_animations", true);
                            SharedPreferences.Editor edit = d12.edit();
                            boolean z11 = !z10;
                            edit.putBoolean("view_animations", z11);
                            org.telegram.messenger.uz.C1 = Boolean.valueOf(z11);
                            edit.commit();
                            ((org.telegram.ui.Cells.p8) view).setChecked(z11);
                        }
                    } else {
                        boolean z12 = false;
                        if (org.telegram.messenger.tc.f()) {
                            ab0Var.e = org.telegram.ui.Components.cc.a0(ab0Var).M(new org.telegram.ui.Components.i9(0.1f, org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Y5, false)), org.telegram.messenger.dd.L0(2131748879, null)).j();
                            return;
                        } else if (va0Var.f7681a == 3 && Integer.bitCount(i14) > 1 && (!org.telegram.messenger.dd.X ? f7 < view.getMeasuredWidth() - org.telegram.messenger.i0.L(75.0f) : f7 > org.telegram.messenger.i0.L(75.0f)) && (Z = ab0Var.Z(i14)) != -1) {
                            ab0Var.f35739n[Z] = !zArr[Z];
                            ab0Var.d0();
                            ab0Var.c0();
                            return;
                        } else {
                            if ((org.telegram.messenger.tc.d(true) & i14) > 0) {
                                z12 = true;
                            }
                            int d = org.telegram.messenger.tc.d(true);
                            if (!z12) {
                                i11 = d | i14;
                            } else {
                                i11 = d & (~i14);
                            }
                            org.telegram.messenger.tc.f18242i = i11;
                            org.telegram.messenger.tc.k();
                            ab0Var.d0();
                        }
                    }
                    ei.r.f();
                    return;
                }
                return;
        }
    }

    @Override
    public void c(mt mtVar) {
        ff0 ff0Var = (ff0) this.f41458b;
        ff0Var.K = true;
        String str = mtVar.f39613c;
        ff0Var.f37123a.setText(str);
        ff0Var.s(str, mtVar);
        ff0Var.F = mtVar;
        ff0Var.E = 0;
        ff0Var.K = false;
        SharedPreferences.Editor edit = org.telegram.messenger.wp.d1().edit();
        edit.putString("phone_code_last_matched_" + mtVar.f39613c, mtVar.d).apply();
        org.telegram.messenger.i0.h3(new we0(ff0Var, 4), 300L);
        df0 df0Var = ff0Var.f37125b;
        df0Var.requestFocus();
        df0Var.setSelection(df0Var.length());
    }

    @Override
    public void c0(ArrayList arrayList) {
        int i10 = this.f41457a;
    }

    @Override
    public void d(Canvas canvas) {
        ((Layout) this.f41458b).draw(canvas);
    }

    @Override
    public boolean f(int i10, View view) {
        int i11;
        int i12;
        int i13 = this.f41457a;
        Object obj = this.f41458b;
        switch (i13) {
            case 14:
                return LanguageSelectActivity.a0((LanguageSelectActivity) obj, view, i10);
            case 23:
                final qh0 qh0Var = (qh0) obj;
                if (i10 >= qh0Var.I && i10 < qh0Var.J) {
                    try {
                        view.performHapticFeedback(0, 2);
                    } catch (Exception unused) {
                    }
                    final org.telegram.messenger.kj kjVar = (org.telegram.messenger.kj) qh0Var.f40794y.get(i10 - qh0Var.I);
                    final long B0 = org.telegram.messenger.kj.B0(kjVar.f16690k);
                    final boolean E = org.telegram.messenger.o5.E(B0);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, qh0Var.getParentActivity(), qh0Var.getResourceProvider());
                    if (kjVar.x4()) {
                        if (E) {
                            i11 = 2131747802;
                        } else {
                            i11 = 2131747827;
                        }
                        arrayList.add(org.telegram.messenger.dd.L0(i11, null));
                        if (E) {
                            i12 = 2131232265;
                        } else {
                            i12 = 2131232087;
                        }
                        arrayList3.add(Integer.valueOf(i12));
                    } else {
                        org.telegram.ui.Cells.f1.t(null, 2131743576, arrayList, 2131232254, arrayList3);
                    }
                    arrayList2.add(0);
                    CharSequence[] charSequenceArr = (CharSequence[]) arrayList.toArray(new CharSequence[arrayList2.size()]);
                    Typeface typeface = org.telegram.messenger.i0.f16145a;
                    int size = arrayList3.size();
                    int[] iArr = new int[size];
                    for (int i14 = 0; i14 < size; i14++) {
                        iArr[i14] = ((Integer) arrayList3.get(i14)).intValue();
                    }
                    DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() {
                        @Override
                        public final void onClick(DialogInterface dialogInterface, int i15) {
                            org.telegram.ui.ActionBar.k2 ma2;
                            org.telegram.messenger.kj kjVar2 = kjVar;
                            boolean x42 = kjVar2.x4();
                            org.telegram.ui.ActionBar.k2 k2Var = qh0.this;
                            boolean z10 = E;
                            long j10 = B0;
                            if (x42) {
                                if (z10) {
                                    ma2 = ProfileActivity.A4(j10);
                                } else {
                                    ma2 = un.ma(j10);
                                }
                                k2Var.presentFragment(ma2);
                                return;
                            }
                            Bundle bundle = new Bundle();
                            if (z10) {
                                bundle.putLong("user_id", j10);
                            } else {
                                bundle.putLong("chat_id", -j10);
                            }
                            bundle.putInt("message_id", kjVar2.f1());
                            bundle.putBoolean("need_remove_previous_same_chat_activity", false);
                            if (k2Var.getMessagesController().E(bundle, k2Var, null, null)) {
                                k2Var.presentFragment(new un(bundle));
                            }
                        }
                    };
                    org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20135a;
                    x1Var.P = charSequenceArr;
                    x1Var.Q = iArr;
                    x1Var.M = onClickListener;
                    qh0Var.showDialog(x1Var);
                }
                return false;
            default:
                wi0 wi0Var = (wi0) obj;
                wi0Var.getClass();
                if (view instanceof vi0) {
                    vi0 vi0Var = (vi0) view;
                    wi0Var.e0(vi0Var.e);
                    vi0Var.performHapticFeedback(0);
                }
                return false;
        }
    }

    @Override
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        of.d dVar;
        int i11 = this.f41457a;
        Object obj = this.f41458b;
        switch (i11) {
            case 4:
                ((a3.i0) obj).run();
                return;
            case 13:
                ((d60) obj).Z(true);
                return;
            case 15:
                Pattern pattern = LaunchActivity.D1;
                org.telegram.messenger.i0.g((StringBuilder) obj);
                return;
            case 18:
                vc0 vc0Var = (vc0) obj;
                Bundle bundle = new Bundle();
                bundle.putString("phone", vc0Var.I);
                bundle.putString("ephone", vc0Var.J);
                bundle.putString("phoneFormated", vc0Var.L);
                TLRPC.TL_auth_resetLoginEmail tL_auth_resetLoginEmail = new TLRPC.TL_auth_resetLoginEmail();
                tL_auth_resetLoginEmail.phone_number = vc0Var.L;
                tL_auth_resetLoginEmail.phone_code_hash = vc0Var.M;
                vc0Var.W.getConnectionsManager().sendRequest(tL_auth_resetLoginEmail, new nc0(vc0Var, bundle, tL_auth_resetLoginEmail, 1), 10);
                return;
            case 19:
                dd0 dd0Var = (dd0) obj;
                gf0.s0(dd0Var.D, dd0Var.f36567s, dd0Var.f36568w, dd0Var.f36569x);
                return;
            case 20:
                wd0 wd0Var = (wd0) obj;
                gf0 gf0Var = wd0Var.G;
                gf0Var.w1(0, true);
                TL_account.deleteAccount deleteaccount = new TL_account.deleteAccount();
                deleteaccount.reason = "Forgot password";
                ConnectionsManager.getInstance(gf0.u0(gf0Var)).sendRequest(deleteaccount, new k(wd0Var, 13), 10);
                return;
            case 26:
                ((org.telegram.messenger.ex) obj).run();
                return;
            case 28:
                wi0 wi0Var = ((ti0) obj).f41648b;
                SparseArray sparseArray = wi0Var.I;
                ArrayList arrayList = new ArrayList();
                for (int i12 = 0; i12 < sparseArray.size(); i12++) {
                    ui0 ui0Var = (ui0) sparseArray.valueAt(i12);
                    TLRPC.Document document = ui0Var.e;
                    if (document != null) {
                        arrayList.add(document);
                        of.c cVar = wi0Var.getMediaDataController().f18691z0;
                        TLRPC.Document document2 = ui0Var.e;
                        ArrayList arrayList2 = cVar.e;
                        if (document2 != null) {
                            if (!cVar.f14162f) {
                                cVar.f(true);
                                cVar.f14162f = true;
                            }
                            int i13 = 0;
                            while (true) {
                                if (i13 < arrayList2.size()) {
                                    if (((of.b) arrayList2.get(i13)).f14154a != null && ((of.b) arrayList2.get(i13)).f14154a.f19800id == document2.f19800id) {
                                        arrayList2.remove(i13);
                                    } else {
                                        i13++;
                                    }
                                }
                            }
                        }
                    }
                    if (ui0Var.f41959g != null && (dVar = (of.d) wi0Var.getMediaDataController().Z.get(ui0Var.f41959g)) != null) {
                        dVar.f14165c = true;
                        dVar.a();
                        int i14 = dVar.f14163a;
                        org.telegram.messenger.b8 G = org.telegram.messenger.b8.G(i14);
                        String str = dVar.f14164b;
                        G.b(str, false);
                        org.telegram.messenger.vi.b0(i14).i1(str, null, true);
                    }
                    if (ui0Var == wi0Var.G) {
                        wi0Var.M = null;
                        wi0Var.G = (ui0) wi0Var.f43112b.get(0);
                        wi0Var.H = true;
                    }
                    wi0Var.f43111a.remove(ui0Var);
                    wi0Var.f43113c.remove(ui0Var);
                }
                wi0Var.getMediaDataController().f18691z0.h();
                for (int i15 = 0; i15 < arrayList.size(); i15++) {
                    TLRPC.Document document3 = (TLRPC.Document) arrayList.get(i15);
                    TL_account.saveRingtone saveringtone = new TL_account.saveRingtone();
                    TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                    saveringtone.f20005id = tL_inputDocument;
                    tL_inputDocument.f19806id = document3.f19800id;
                    tL_inputDocument.access_hash = document3.access_hash;
                    byte[] bArr = document3.file_reference;
                    tL_inputDocument.file_reference = bArr;
                    if (bArr == null) {
                        tL_inputDocument.file_reference = new byte[0];
                    }
                    saveringtone.unsave = true;
                    wi0Var.getConnectionsManager().sendRequest(saveringtone, new ag.c3(4));
                }
                wi0.b0(wi0Var);
                wi0Var.i0();
                wi0Var.e.f();
                x1Var.dismiss();
                return;
            default:
                PasscodeActivity passcodeActivity = (PasscodeActivity) obj;
                org.telegram.messenger.uz.f18549s = "";
                org.telegram.messenger.uz.f18563x = false;
                org.telegram.messenger.uz.y();
                passcodeActivity.getMediaDataController().m();
                int childCount = passcodeActivity.f33426c.getChildCount();
                int i16 = 0;
                while (true) {
                    if (i16 < childCount) {
                        View childAt = passcodeActivity.f33426c.getChildAt(i16);
                        if (childAt instanceof org.telegram.ui.Cells.x9) {
                            org.telegram.ui.ActionBar.a7.V(((org.telegram.ui.Cells.x9) childAt).getTextView(), org.telegram.ui.ActionBar.t6.E6, null);
                        } else {
                            i16++;
                        }
                    }
                }
                org.telegram.messenger.at.e().k(50, new Object[0]);
                passcodeActivity.finishFragment();
                return;
        }
    }

    @Override
    public boolean h1(View view) {
        switch (this.f41457a) {
            case 0:
                return false;
            case 1:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void i(int i10) {
        switch (this.f41457a) {
            case 12:
                s50 s50Var = (s50) this.f41458b;
                u50 u50Var = s50Var.I;
                u50Var.v0(s50Var.H);
                if (s50Var.h == null && !s50Var.f41222f.e() && s50Var.b() == 0) {
                    u50Var.f41823s.e(false, true);
                }
                s50Var.f();
                return;
            default:
                qi0 qi0Var = (qi0) this.f41458b;
                if (qi0Var.f40799f == null && !qi0Var.h.e()) {
                    qi0Var.f40800n.f33406c.c();
                }
                qi0Var.f();
                return;
        }
    }

    @Override
    public void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        py pyVar = (py) this.f41458b;
        View view = (View) obj2;
        Integer num = (Integer) number;
        Float f7 = (Float) serializable;
        Float f10 = (Float) serializable2;
        if (((org.telegram.ui.Components.b51) obj).d == 1 && pyVar.f40634b != null) {
            boolean z10 = !pyVar.f40635c;
            pyVar.f40635c = z10;
            jo joVar = pyVar.h;
            if (joVar != null) {
                joVar.a(Boolean.valueOf(z10), Boolean.valueOf(pyVar.d), Boolean.valueOf(pyVar.e));
            }
            ((org.telegram.ui.Cells.t8) view).setChecked(pyVar.f40635c);
            pyVar.f40636f.f31183f3.O(true);
        }
    }

    @Override
    public void m(int i10) {
        DataAutoDownloadActivity dataAutoDownloadActivity = (DataAutoDownloadActivity) ((fg.j) this.f41458b).e;
        org.telegram.messenger.a6 a6Var = (org.telegram.messenger.a6) dataAutoDownloadActivity.f33310c.get(i10);
        if (a6Var == dataAutoDownloadActivity.D) {
            dataAutoDownloadActivity.e = 0;
        } else if (a6Var == dataAutoDownloadActivity.E) {
            dataAutoDownloadActivity.e = 1;
        } else if (a6Var == dataAutoDownloadActivity.F) {
            dataAutoDownloadActivity.e = 2;
        } else {
            dataAutoDownloadActivity.e = 3;
        }
        int i11 = dataAutoDownloadActivity.f33311f;
        if (i11 == 0) {
            org.telegram.messenger.b6.q(DataAutoDownloadActivity.i0(dataAutoDownloadActivity)).P = dataAutoDownloadActivity.e;
        } else if (i11 == 1) {
            org.telegram.messenger.b6.q(DataAutoDownloadActivity.j0(dataAutoDownloadActivity)).Q = dataAutoDownloadActivity.e;
        } else {
            org.telegram.messenger.b6.q(DataAutoDownloadActivity.k0(dataAutoDownloadActivity)).R = dataAutoDownloadActivity.e;
        }
        SharedPreferences.Editor edit = org.telegram.messenger.wp.r1(DataAutoDownloadActivity.l0(dataAutoDownloadActivity)).f7.edit();
        edit.putInt(dataAutoDownloadActivity.K, dataAutoDownloadActivity.e);
        edit.commit();
        org.telegram.messenger.b6.q(DataAutoDownloadActivity.m0(dataAutoDownloadActivity)).g();
        for (int i12 = 0; i12 < 4; i12++) {
            s4.c1 K = dataAutoDownloadActivity.f33309b.K(DataAutoDownloadActivity.n0(dataAutoDownloadActivity) + i12);
            if (K != null) {
                dataAutoDownloadActivity.f33308a.t(K, DataAutoDownloadActivity.n0(dataAutoDownloadActivity) + i12);
            }
        }
        dataAutoDownloadActivity.I = true;
    }

    @Override
    public void o(org.telegram.ui.Components.zc0 zc0Var) {
        ExternalActionActivity externalActionActivity = (ExternalActionActivity) this.f41458b;
        ArrayList arrayList = ExternalActionActivity.f33328y;
        org.telegram.messenger.uz.C = false;
        Intent intent = externalActionActivity.h;
        if (intent != null) {
            externalActionActivity.d(intent, externalActionActivity.f33333n, externalActionActivity.f33336w, true, externalActionActivity.f33334r, externalActionActivity.f33335s);
            externalActionActivity.h = null;
        }
        externalActionActivity.f33331c.e0();
        if (org.telegram.messenger.i0.Q1()) {
            externalActionActivity.d.e0();
        }
        org.telegram.messenger.at.e().k(org.telegram.messenger.at.f14755o0, zc0Var);
    }

    @Override
    public void p(KeyEvent keyEvent) {
        fz fzVar = (fz) this.f41458b;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && fzVar.f35869y.isShowing()) {
            fzVar.f35869y.d(true);
        }
    }

    @Override
    public void q0(View view, float f7, float f10) {
        int i10 = this.f41457a;
    }

    @Override
    public int run() {
        return ((FiltersSetupActivity) this.f41458b).f33346x;
    }

    @Override
    public void v(int i10, float f7, float f10, fe.f fVar) {
        qf0 qf0Var = (qf0) this.f41458b;
        qf0Var.getClass();
        qf0Var.setScaleX(org.telegram.messenger.i0.T1(1.0f, 1.019f, f7));
        qf0Var.setScaleY(org.telegram.messenger.i0.T1(1.0f, 1.019f, f7));
    }

    @Override
    public a0.h x() {
        switch (this.f41457a) {
            case 12:
                return null;
            default:
                return null;
        }
    }

    private final void l(ArrayList arrayList) {
    }

    private final void n(ArrayList arrayList) {
    }

    @Override
    public void r() {
    }

    @Override
    public void E(float f7, int i10) {
    }

    private final void e(View view, float f7, float f10) {
    }

    private final void g(View view, float f7, float f10) {
    }

    private final void j(View view, float f7, float f10) {
    }
}
