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
public final class tt implements org.telegram.ui.Components.hk0, org.telegram.ui.Components.xu0, org.telegram.ui.Components.wf0, org.telegram.ui.ActionBar.u1, org.telegram.messenger.gp, org.telegram.messenger.o20, org.telegram.ui.Components.xc0, org.telegram.ui.ActionBar.i1, org.telegram.ui.Components.dk0, zf.l1, org.telegram.ui.Components.ik0, r0.m, qt, fe.e, yh0 {
    public final int f41937a;
    public final Object f41938b;

    public tt(Object obj, int i10) {
        this.f41937a = i10;
        this.f41938b = obj;
    }

    @Override
    public a0.h M() {
        switch (this.f41937a) {
            case 12:
                return null;
            default:
                return null;
        }
    }

    @Override
    public r0.j1 R0(View view, r0.j1 j1Var) {
        n90 n90Var = (n90) this.f41938b;
        i0.c I0 = org.telegram.messenger.i0.I0(j1Var, false);
        if (!n90Var.f39880a.equals(I0)) {
            n90Var.f39880a = I0;
            n90Var.requestLayout();
        }
        int childCount = n90Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            r0.h0.b(n90Var.getChildAt(i10), j1Var);
        }
        return j1Var;
    }

    @Override
    public boolean Y(int i10) {
        switch (this.f41937a) {
            case 12:
                return true;
            default:
                return true;
        }
    }

    @Override
    public boolean a(TLRPC.TL_error tL_error) {
        ((a3.h0) this.f41938b).run();
        return true;
    }

    @Override
    public void b(float f7, float f10, int i10, View view) {
        org.telegram.ui.Components.a51 G;
        Object obj;
        long j10;
        int i11;
        int Y;
        boolean[] zArr;
        int i12 = this.f41937a;
        Object obj2 = this.f41938b;
        switch (i12) {
            case 0:
                ut utVar = (ut) obj2;
                HashSet hashSet = utVar.T1;
                if (!utVar.U1 && (G = utVar.V1.G(i10 - 1)) != null && (obj = G.G) != null) {
                    if (obj instanceof TLRPC.User) {
                        j10 = ((TLRPC.User) obj).f19942id;
                    } else if (obj instanceof TLRPC.Chat) {
                        j10 = ((TLRPC.Chat) obj).f19793id;
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
                DataAutoDownloadActivity.a0((DataAutoDownloadActivity) obj2, view, i10, f7);
                return;
            default:
                bb0 bb0Var = (bb0) obj2;
                ArrayList arrayList = bb0Var.f36162s;
                if (view != null && i10 >= 0 && i10 < arrayList.size()) {
                    wa0 wa0Var = (wa0) arrayList.get(i10);
                    int i13 = wa0Var.f7680a;
                    int i14 = wa0Var.e;
                    if (i13 != 3 && i13 != 4) {
                        if (i13 == 5 && wa0Var.f42913f == 1) {
                            SharedPreferences d12 = org.telegram.messenger.vp.d1();
                            boolean z10 = d12.getBoolean("view_animations", true);
                            SharedPreferences.Editor edit = d12.edit();
                            boolean z11 = !z10;
                            edit.putBoolean("view_animations", z11);
                            org.telegram.messenger.tz.C1 = Boolean.valueOf(z11);
                            edit.commit();
                            ((org.telegram.ui.Cells.p8) view).setChecked(z11);
                        }
                    } else {
                        boolean z12 = false;
                        if (org.telegram.messenger.sc.f()) {
                            bb0Var.e = org.telegram.ui.Components.cc.a0(bb0Var).M(new org.telegram.ui.Components.i9(0.1f, org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Y5, false)), org.telegram.messenger.cd.L0(2131748879, null)).j();
                            return;
                        } else if (wa0Var.f7680a == 3 && Integer.bitCount(i14) > 1 && (!org.telegram.messenger.cd.X ? f7 < view.getMeasuredWidth() - org.telegram.messenger.i0.L(75.0f) : f7 > org.telegram.messenger.i0.L(75.0f)) && (Y = bb0Var.Y(i14)) != -1) {
                            bb0Var.f36160n[Y] = !zArr[Y];
                            bb0Var.c0();
                            bb0Var.b0();
                            return;
                        } else {
                            if ((org.telegram.messenger.sc.d(true) & i14) > 0) {
                                z12 = true;
                            }
                            int d = org.telegram.messenger.sc.d(true);
                            if (!z12) {
                                i11 = d | i14;
                            } else {
                                i11 = d & (~i14);
                            }
                            org.telegram.messenger.sc.f17891i = i11;
                            org.telegram.messenger.sc.k();
                            bb0Var.c0();
                        }
                    }
                    ei.r.f();
                    return;
                }
                return;
        }
    }

    @Override
    public void c(nt ntVar) {
        gf0 gf0Var = (gf0) this.f41938b;
        gf0Var.K = true;
        String str = ntVar.f40049c;
        gf0Var.f37533a.setText(str);
        gf0Var.s(str, ntVar);
        gf0Var.F = ntVar;
        gf0Var.E = 0;
        gf0Var.K = false;
        SharedPreferences.Editor edit = org.telegram.messenger.vp.d1().edit();
        edit.putString("phone_code_last_matched_" + ntVar.f40049c, ntVar.d).apply();
        org.telegram.messenger.i0.h3(new xe0(gf0Var, 4), 300L);
        ef0 ef0Var = gf0Var.f37535b;
        ef0Var.requestFocus();
        ef0Var.setSelection(ef0Var.length());
    }

    @Override
    public void c0(ArrayList arrayList) {
        int i10 = this.f41937a;
    }

    @Override
    public void d(Canvas canvas) {
        ((Layout) this.f41938b).draw(canvas);
    }

    @Override
    public boolean f(int i10, View view) {
        int i11;
        int i12;
        int i13 = this.f41937a;
        Object obj = this.f41938b;
        switch (i13) {
            case 14:
                return LanguageSelectActivity.Z((LanguageSelectActivity) obj, view, i10);
            case 23:
                final sh0 sh0Var = (sh0) obj;
                if (i10 >= sh0Var.I && i10 < sh0Var.J) {
                    try {
                        view.performHapticFeedback(0, 2);
                    } catch (Exception unused) {
                    }
                    final org.telegram.messenger.jj jjVar = (org.telegram.messenger.jj) sh0Var.f41526y.get(i10 - sh0Var.I);
                    final long B0 = org.telegram.messenger.jj.B0(jjVar.f16337k);
                    final boolean E = org.telegram.messenger.o5.E(B0);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, sh0Var.getParentActivity(), sh0Var.getResourceProvider());
                    if (jjVar.x4()) {
                        if (E) {
                            i11 = 2131747802;
                        } else {
                            i11 = 2131747827;
                        }
                        arrayList.add(org.telegram.messenger.cd.L0(i11, null));
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
                    Typeface typeface = org.telegram.messenger.i0.f15999a;
                    int size = arrayList3.size();
                    int[] iArr = new int[size];
                    for (int i14 = 0; i14 < size; i14++) {
                        iArr[i14] = ((Integer) arrayList3.get(i14)).intValue();
                    }
                    DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() {
                        @Override
                        public final void onClick(DialogInterface dialogInterface, int i15) {
                            org.telegram.ui.ActionBar.k2 ha;
                            org.telegram.messenger.jj jjVar2 = jjVar;
                            boolean x42 = jjVar2.x4();
                            org.telegram.ui.ActionBar.k2 k2Var = sh0.this;
                            boolean z10 = E;
                            long j10 = B0;
                            if (x42) {
                                if (z10) {
                                    ha = ProfileActivity.z4(j10);
                                } else {
                                    ha = un.ha(j10);
                                }
                                k2Var.presentFragment(ha);
                                return;
                            }
                            Bundle bundle = new Bundle();
                            if (z10) {
                                bundle.putLong("user_id", j10);
                            } else {
                                bundle.putLong("chat_id", -j10);
                            }
                            bundle.putInt("message_id", jjVar2.f1());
                            bundle.putBoolean("need_remove_previous_same_chat_activity", false);
                            if (k2Var.getMessagesController().E(bundle, k2Var, null, null)) {
                                k2Var.presentFragment(new un(bundle));
                            }
                        }
                    };
                    org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
                    x1Var.P = charSequenceArr;
                    x1Var.Q = iArr;
                    x1Var.M = onClickListener;
                    sh0Var.showDialog(x1Var);
                }
                return false;
            default:
                yi0 yi0Var = (yi0) obj;
                yi0Var.getClass();
                if (view instanceof xi0) {
                    xi0 xi0Var = (xi0) view;
                    yi0Var.d0(xi0Var.e);
                    xi0Var.performHapticFeedback(0);
                }
                return false;
        }
    }

    @Override
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        of.d dVar;
        int i11 = this.f41937a;
        Object obj = this.f41938b;
        switch (i11) {
            case 4:
                ((a3.i0) obj).run();
                return;
            case 13:
                ((e60) obj).Y(true);
                return;
            case 15:
                Pattern pattern = LaunchActivity.D1;
                org.telegram.messenger.i0.g((StringBuilder) obj);
                return;
            case 18:
                wc0 wc0Var = (wc0) obj;
                Bundle bundle = new Bundle();
                bundle.putString("phone", wc0Var.I);
                bundle.putString("ephone", wc0Var.J);
                bundle.putString("phoneFormated", wc0Var.L);
                TLRPC.TL_auth_resetLoginEmail tL_auth_resetLoginEmail = new TLRPC.TL_auth_resetLoginEmail();
                tL_auth_resetLoginEmail.phone_number = wc0Var.L;
                tL_auth_resetLoginEmail.phone_code_hash = wc0Var.M;
                wc0Var.W.getConnectionsManager().sendRequest(tL_auth_resetLoginEmail, new oc0(wc0Var, bundle, tL_auth_resetLoginEmail, 1), 10);
                return;
            case 19:
                ed0 ed0Var = (ed0) obj;
                hf0.r0(ed0Var.D, ed0Var.f37029s, ed0Var.f37030w, ed0Var.f37031x);
                return;
            case 20:
                xd0 xd0Var = (xd0) obj;
                hf0 hf0Var = xd0Var.G;
                hf0Var.v1(0, true);
                TL_account.deleteAccount deleteaccount = new TL_account.deleteAccount();
                deleteaccount.reason = "Forgot password";
                ConnectionsManager.getInstance(hf0.t0(hf0Var)).sendRequest(deleteaccount, new k(xd0Var, 13), 10);
                return;
            case 26:
                ((org.telegram.messenger.dx) obj).run();
                return;
            case 28:
                yi0 yi0Var = ((vi0) obj).f42734b;
                SparseArray sparseArray = yi0Var.I;
                ArrayList arrayList = new ArrayList();
                for (int i12 = 0; i12 < sparseArray.size(); i12++) {
                    wi0 wi0Var = (wi0) sparseArray.valueAt(i12);
                    TLRPC.Document document = wi0Var.e;
                    if (document != null) {
                        arrayList.add(document);
                        of.c cVar = yi0Var.getMediaDataController().f18362z0;
                        TLRPC.Document document2 = wi0Var.e;
                        ArrayList arrayList2 = cVar.e;
                        if (document2 != null) {
                            if (!cVar.f14161f) {
                                cVar.f(true);
                                cVar.f14161f = true;
                            }
                            int i13 = 0;
                            while (true) {
                                if (i13 < arrayList2.size()) {
                                    if (((of.b) arrayList2.get(i13)).f14153a != null && ((of.b) arrayList2.get(i13)).f14153a.f19799id == document2.f19799id) {
                                        arrayList2.remove(i13);
                                    } else {
                                        i13++;
                                    }
                                }
                            }
                        }
                    }
                    if (wi0Var.f43322g != null && (dVar = (of.d) yi0Var.getMediaDataController().Z.get(wi0Var.f43322g)) != null) {
                        dVar.f14164c = true;
                        dVar.a();
                        int i14 = dVar.f14162a;
                        org.telegram.messenger.b8 G = org.telegram.messenger.b8.G(i14);
                        String str = dVar.f14163b;
                        G.b(str, false);
                        org.telegram.messenger.ui.b0(i14).i1(str, null, true);
                    }
                    if (wi0Var == yi0Var.G) {
                        yi0Var.M = null;
                        yi0Var.G = (wi0) yi0Var.f43847b.get(0);
                        yi0Var.H = true;
                    }
                    yi0Var.f43846a.remove(wi0Var);
                    yi0Var.f43848c.remove(wi0Var);
                }
                yi0Var.getMediaDataController().f18362z0.h();
                for (int i15 = 0; i15 < arrayList.size(); i15++) {
                    TLRPC.Document document3 = (TLRPC.Document) arrayList.get(i15);
                    TL_account.saveRingtone saveringtone = new TL_account.saveRingtone();
                    TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                    saveringtone.f20004id = tL_inputDocument;
                    tL_inputDocument.f19805id = document3.f19799id;
                    tL_inputDocument.access_hash = document3.access_hash;
                    byte[] bArr = document3.file_reference;
                    tL_inputDocument.file_reference = bArr;
                    if (bArr == null) {
                        tL_inputDocument.file_reference = new byte[0];
                    }
                    saveringtone.unsave = true;
                    yi0Var.getConnectionsManager().sendRequest(saveringtone, new ag.c3(4));
                }
                yi0.a0(yi0Var);
                yi0Var.h0();
                yi0Var.e.f();
                x1Var.dismiss();
                return;
            default:
                PasscodeActivity passcodeActivity = (PasscodeActivity) obj;
                org.telegram.messenger.tz.f18180s = "";
                org.telegram.messenger.tz.f18194x = false;
                org.telegram.messenger.tz.y();
                passcodeActivity.getMediaDataController().m();
                int childCount = passcodeActivity.f33419c.getChildCount();
                int i16 = 0;
                while (true) {
                    if (i16 < childCount) {
                        View childAt = passcodeActivity.f33419c.getChildAt(i16);
                        if (childAt instanceof org.telegram.ui.Cells.x9) {
                            org.telegram.ui.ActionBar.a7.V(((org.telegram.ui.Cells.x9) childAt).getTextView(), org.telegram.ui.ActionBar.t6.E6, null);
                        } else {
                            i16++;
                        }
                    }
                }
                org.telegram.messenger.zs.e().k(50, new Object[0]);
                passcodeActivity.finishFragment();
                return;
        }
    }

    @Override
    public boolean h1(View view) {
        switch (this.f41937a) {
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
        switch (this.f41937a) {
            case 12:
                t50 t50Var = (t50) this.f41938b;
                v50 v50Var = t50Var.I;
                v50Var.u0(t50Var.H);
                if (t50Var.h == null && !t50Var.f41731f.e() && t50Var.b() == 0) {
                    v50Var.f42628s.e(false, true);
                }
                t50Var.f();
                return;
            default:
                si0 si0Var = (si0) this.f41938b;
                if (si0Var.f41528f == null && !si0Var.h.e()) {
                    si0Var.f41529n.f33399c.c();
                }
                si0Var.f();
                return;
        }
    }

    @Override
    public void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        qy qyVar = (qy) this.f41938b;
        View view = (View) obj2;
        Integer num = (Integer) number;
        Float f7 = (Float) serializable;
        Float f10 = (Float) serializable2;
        if (((org.telegram.ui.Components.a51) obj).d == 1 && qyVar.f41087b != null) {
            boolean z10 = !qyVar.f41088c;
            qyVar.f41088c = z10;
            jo joVar = qyVar.h;
            if (joVar != null) {
                joVar.a(Boolean.valueOf(z10), Boolean.valueOf(qyVar.d), Boolean.valueOf(qyVar.e));
            }
            ((org.telegram.ui.Cells.t8) view).setChecked(qyVar.f41088c);
            qyVar.f41089f.f30819f3.O(true);
        }
    }

    @Override
    public void m(int i10) {
        DataAutoDownloadActivity dataAutoDownloadActivity = (DataAutoDownloadActivity) ((fg.j) this.f41938b).e;
        org.telegram.messenger.a6 a6Var = (org.telegram.messenger.a6) dataAutoDownloadActivity.f33303c.get(i10);
        if (a6Var == dataAutoDownloadActivity.D) {
            dataAutoDownloadActivity.e = 0;
        } else if (a6Var == dataAutoDownloadActivity.E) {
            dataAutoDownloadActivity.e = 1;
        } else if (a6Var == dataAutoDownloadActivity.F) {
            dataAutoDownloadActivity.e = 2;
        } else {
            dataAutoDownloadActivity.e = 3;
        }
        int i11 = dataAutoDownloadActivity.f33304f;
        if (i11 == 0) {
            org.telegram.messenger.b6.q(DataAutoDownloadActivity.h0(dataAutoDownloadActivity)).P = dataAutoDownloadActivity.e;
        } else if (i11 == 1) {
            org.telegram.messenger.b6.q(DataAutoDownloadActivity.i0(dataAutoDownloadActivity)).Q = dataAutoDownloadActivity.e;
        } else {
            org.telegram.messenger.b6.q(DataAutoDownloadActivity.j0(dataAutoDownloadActivity)).R = dataAutoDownloadActivity.e;
        }
        SharedPreferences.Editor edit = org.telegram.messenger.vp.r1(DataAutoDownloadActivity.k0(dataAutoDownloadActivity)).f7.edit();
        edit.putInt(dataAutoDownloadActivity.K, dataAutoDownloadActivity.e);
        edit.commit();
        org.telegram.messenger.b6.q(DataAutoDownloadActivity.l0(dataAutoDownloadActivity)).g();
        for (int i12 = 0; i12 < 4; i12++) {
            s4.c1 K = dataAutoDownloadActivity.f33302b.K(DataAutoDownloadActivity.m0(dataAutoDownloadActivity) + i12);
            if (K != null) {
                dataAutoDownloadActivity.f33301a.t(K, DataAutoDownloadActivity.m0(dataAutoDownloadActivity) + i12);
            }
        }
        dataAutoDownloadActivity.I = true;
    }

    @Override
    public void o(org.telegram.ui.Components.zc0 zc0Var) {
        ExternalActionActivity externalActionActivity = (ExternalActionActivity) this.f41938b;
        ArrayList arrayList = ExternalActionActivity.f33321y;
        org.telegram.messenger.tz.C = false;
        Intent intent = externalActionActivity.h;
        if (intent != null) {
            externalActionActivity.d(intent, externalActionActivity.f33326n, externalActionActivity.f33329w, true, externalActionActivity.f33327r, externalActionActivity.f33328s);
            externalActionActivity.h = null;
        }
        externalActionActivity.f33324c.e0();
        if (org.telegram.messenger.i0.Q1()) {
            externalActionActivity.d.e0();
        }
        org.telegram.messenger.zs.e().k(org.telegram.messenger.zs.f19659o0, zc0Var);
    }

    @Override
    public void q0(View view, float f7, float f10) {
        int i10 = this.f41937a;
    }

    @Override
    public void r(KeyEvent keyEvent) {
        gz gzVar = (gz) this.f41938b;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && gzVar.f36333y.isShowing()) {
            gzVar.f36333y.d(true);
        }
    }

    @Override
    public int run() {
        return ((FiltersSetupActivity) this.f41938b).f33339x;
    }

    @Override
    public void v(int i10, float f7, float f10, fe.f fVar) {
        rf0 rf0Var = (rf0) this.f41938b;
        rf0Var.getClass();
        rf0Var.setScaleX(org.telegram.messenger.i0.T1(1.0f, 1.019f, f7));
        rf0Var.setScaleY(org.telegram.messenger.i0.T1(1.0f, 1.019f, f7));
    }

    @Override
    public a0.h x() {
        switch (this.f41937a) {
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
    public void s() {
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
