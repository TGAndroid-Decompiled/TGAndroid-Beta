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
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class zr implements fx, org.telegram.ui.Components.rj0, org.telegram.ui.Components.fu0, org.telegram.ui.Components.hf0, org.telegram.ui.ActionBar.q1, org.telegram.messenger.xo, org.telegram.messenger.u10, org.telegram.ui.Components.mc0, org.telegram.ui.ActionBar.e1, org.telegram.ui.Components.nj0, jg.y1, org.telegram.ui.Components.sj0, r0.m, te.b, vg0 {
    public final int f54691a;
    public final Object f54692b;

    public zr(Object obj, int i7) {
        this.f54691a = i7;
        this.f54692b = obj;
    }

    @Override
    public void K(int i7, float f10, float f11, te.c cVar) {
        ne0 ne0Var = (ne0) this.f54692b;
        ne0Var.getClass();
        ne0Var.setScaleX(org.telegram.messenger.g0.T1(1.0f, 1.019f, f10));
        ne0Var.setScaleY(org.telegram.messenger.g0.T1(1.0f, 1.019f, f10));
    }

    @Override
    public boolean U0(View view) {
        switch (this.f54691a) {
            case 1:
                return false;
            case 2:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean W1(int i7) {
        switch (this.f54691a) {
            case 13:
                return true;
            default:
                return true;
        }
    }

    @Override
    public a0.h Y0() {
        switch (this.f54691a) {
            case 13:
                return null;
            default:
                return null;
        }
    }

    @Override
    public void a(Canvas canvas) {
        ((Layout) this.f54692b).draw(canvas);
    }

    @Override
    public boolean b(int i7, View view) {
        int i10;
        int i11;
        int i12 = this.f54691a;
        Object obj = this.f54692b;
        switch (i12) {
            case 15:
                return LanguageSelectActivity.a0((LanguageSelectActivity) obj, view, i7);
            case 23:
                final mg0 mg0Var = (mg0) obj;
                if (i7 >= mg0Var.J && i7 < mg0Var.K) {
                    try {
                        view.performHapticFeedback(0, 2);
                    } catch (Exception unused) {
                    }
                    final org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) mg0Var.f50070y.get(i7 - mg0Var.J);
                    final long B0 = org.telegram.messenger.fj.B0(fjVar.f24073k);
                    final boolean E = org.telegram.messenger.n5.E(B0);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, mg0Var.getParentActivity(), mg0Var.getResourceProvider());
                    if (fjVar.x4()) {
                        if (E) {
                            i10 = 2131747592;
                        } else {
                            i10 = 2131747617;
                        }
                        arrayList.add(org.telegram.messenger.gd.N0(i10, null));
                        if (E) {
                            i11 = 2131232271;
                        } else {
                            i11 = 2131232093;
                        }
                        arrayList3.add(Integer.valueOf(i11));
                    } else {
                        org.telegram.ui.Cells.c0.v(null, 2131743300, arrayList, 2131232260, arrayList3);
                    }
                    arrayList2.add(0);
                    CharSequence[] charSequenceArr = (CharSequence[]) arrayList.toArray(new CharSequence[arrayList2.size()]);
                    Typeface typeface = org.telegram.messenger.g0.f24198a;
                    int size = arrayList3.size();
                    int[] iArr = new int[size];
                    for (int i13 = 0; i13 < size; i13++) {
                        iArr[i13] = ((Integer) arrayList3.get(i13)).intValue();
                    }
                    DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() {
                        @Override
                        public final void onClick(DialogInterface dialogInterface, int i14) {
                            org.telegram.ui.ActionBar.g2 ua2;
                            org.telegram.messenger.fj fjVar2 = fjVar;
                            boolean x42 = fjVar2.x4();
                            org.telegram.ui.ActionBar.g2 g2Var = mg0.this;
                            boolean z10 = E;
                            long j3 = B0;
                            if (x42) {
                                if (z10) {
                                    ua2 = ProfileActivity.D4(j3);
                                } else {
                                    ua2 = bn.ua(j3);
                                }
                                g2Var.presentFragment(ua2);
                                return;
                            }
                            Bundle bundle = new Bundle();
                            if (z10) {
                                bundle.putLong("user_id", j3);
                            } else {
                                bundle.putLong("chat_id", -j3);
                            }
                            bundle.putInt("message_id", fjVar2.e1());
                            bundle.putBoolean("need_remove_previous_same_chat_activity", false);
                            if (g2Var.getMessagesController().E(bundle, g2Var, null, null)) {
                                g2Var.presentFragment(new bn(bundle));
                            }
                        }
                    };
                    org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28835a;
                    t1Var.Q = charSequenceArr;
                    t1Var.R = iArr;
                    t1Var.N = onClickListener;
                    mg0Var.showDialog(t1Var);
                }
                return false;
            default:
                wh0 wh0Var = (wh0) obj;
                wh0Var.getClass();
                if (view instanceof vh0) {
                    vh0 vh0Var = (vh0) view;
                    wh0Var.e0(vh0Var.f52973e);
                    vh0Var.performHapticFeedback(0);
                }
                return false;
        }
    }

    @Override
    public void c() {
        ContactsWidgetConfigActivity contactsWidgetConfigActivity = (ContactsWidgetConfigActivity) this.f54692b;
        int i7 = ContactsWidgetConfigActivity.G;
        Intent intent = new Intent();
        intent.putExtra("appWidgetId", contactsWidgetConfigActivity.F);
        contactsWidgetConfigActivity.setResult(-1, intent);
        contactsWidgetConfigActivity.finish();
    }

    @Override
    public boolean d(TLRPC.TL_error tL_error) {
        ((d3.e0) this.f54692b).run();
        return true;
    }

    @Override
    public void f0(View view, float f10, float f11) {
        int i7 = this.f54691a;
    }

    @Override
    public void g(float f10, float f11, int i7, View view) {
        org.telegram.ui.Components.n41 G;
        Object obj;
        long j3;
        int i10;
        int Z;
        boolean[] zArr;
        int i11 = this.f54691a;
        Object obj2 = this.f54692b;
        switch (i11) {
            case 1:
                vs vsVar = (vs) obj2;
                HashSet hashSet = vsVar.X1;
                if (!vsVar.Y1 && (G = vsVar.Z1.G(i7 - 1)) != null && (obj = G.H) != null) {
                    if (obj instanceof TLRPC.User) {
                        j3 = ((TLRPC.User) obj).f28641id;
                    } else if (obj instanceof TLRPC.Chat) {
                        j3 = ((TLRPC.Chat) obj).f28492id;
                    } else {
                        return;
                    }
                    if (hashSet.contains(Long.valueOf(j3))) {
                        hashSet.remove(Long.valueOf(j3));
                    } else {
                        hashSet.add(Long.valueOf(j3));
                    }
                    if (view instanceof ah.r) {
                        ((ah.r) view).c(hashSet.contains(Long.valueOf(j3)), true);
                        return;
                    }
                    return;
                }
                return;
            case 2:
                DataAutoDownloadActivity.b0((DataAutoDownloadActivity) obj2, view, i7, f10);
                return;
            default:
                y90 y90Var = (y90) obj2;
                ArrayList arrayList = y90Var.f54325s;
                if (view != null && i7 >= 0 && i7 < arrayList.size()) {
                    t90 t90Var = (t90) arrayList.get(i7);
                    int i12 = t90Var.f56712a;
                    int i13 = t90Var.f52315e;
                    if (i12 != 3 && i12 != 4) {
                        if (i12 == 5 && t90Var.f52316f == 1) {
                            SharedPreferences g12 = org.telegram.messenger.mp.g1();
                            boolean z10 = g12.getBoolean("view_animations", true);
                            SharedPreferences.Editor edit = g12.edit();
                            boolean z11 = !z10;
                            edit.putBoolean("view_animations", z11);
                            org.telegram.messenger.bz.C1 = Boolean.valueOf(z11);
                            edit.commit();
                            ((org.telegram.ui.Cells.m8) view).setChecked(z11);
                        }
                    } else {
                        boolean z12 = false;
                        if (org.telegram.messenger.pc.f()) {
                            y90Var.f54321e = org.telegram.ui.Components.kc.b0(y90Var).M(new org.telegram.ui.Components.r9(0.1f, org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Y5, false)), org.telegram.messenger.gd.N0(2131748676, null)).j();
                            return;
                        } else if (t90Var.f56712a == 3 && Integer.bitCount(i13) > 1 && (!org.telegram.messenger.gd.f24314a0 ? f10 < view.getMeasuredWidth() - org.telegram.messenger.g0.L(75.0f) : f10 > org.telegram.messenger.g0.L(75.0f)) && (Z = y90Var.Z(i13)) != -1) {
                            y90Var.f54323n[Z] = !zArr[Z];
                            y90Var.d0();
                            y90Var.c0();
                            return;
                        } else {
                            if ((org.telegram.messenger.pc.d(true) & i13) > 0) {
                                z12 = true;
                            }
                            int d = org.telegram.messenger.pc.d(true);
                            if (!z12) {
                                i10 = d | i13;
                            } else {
                                i10 = d & (~i13);
                            }
                            org.telegram.messenger.pc.f26313i = i10;
                            org.telegram.messenger.pc.k();
                            y90Var.d0();
                        }
                    }
                    ri.q.f();
                    return;
                }
                return;
        }
    }

    @Override
    public void i(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        yf.e eVar;
        int i10 = this.f54691a;
        Object obj = this.f54692b;
        switch (i10) {
            case 5:
                ((bi.s2) obj).run();
                return;
            case 14:
                ((g50) obj).Z(true);
                return;
            case 16:
                String str = LaunchActivity.C1;
                org.telegram.messenger.g0.g((StringBuilder) obj);
                return;
            case 19:
                ob0 ob0Var = (ob0) obj;
                Bundle bundle = new Bundle();
                bundle.putString("phone", ob0Var.J);
                bundle.putString("ephone", ob0Var.K);
                bundle.putString("phoneFormated", ob0Var.M);
                TLRPC.TL_auth_resetLoginEmail tL_auth_resetLoginEmail = new TLRPC.TL_auth_resetLoginEmail();
                tL_auth_resetLoginEmail.phone_number = ob0Var.M;
                tL_auth_resetLoginEmail.phone_code_hash = ob0Var.N;
                ob0Var.f50621a0.getConnectionsManager().sendRequest(tL_auth_resetLoginEmail, new fb0(ob0Var, bundle, tL_auth_resetLoginEmail, 1), 10);
                return;
            case 20:
                wb0 wb0Var = (wb0) obj;
                de0.t0(wb0Var.E, wb0Var.f53285s, wb0Var.f53286w, wb0Var.f53287x);
                return;
            case 21:
                pc0 pc0Var = (pc0) obj;
                de0 de0Var = pc0Var.H;
                de0Var.F1(0, true);
                TL_account.deleteAccount deleteaccount = new TL_account.deleteAccount();
                deleteaccount.reason = "Forgot password";
                ConnectionsManager.getInstance(de0.v0(de0Var)).sendRequest(deleteaccount, new l(pc0Var, 12), 10);
                return;
            case 26:
                ((bi.w4) obj).run();
                return;
            case 28:
                wh0 wh0Var = ((th0) obj).f52408b;
                SparseArray sparseArray = wh0Var.J;
                ArrayList arrayList = new ArrayList();
                for (int i11 = 0; i11 < sparseArray.size(); i11++) {
                    uh0 uh0Var = (uh0) sparseArray.valueAt(i11);
                    TLRPC.Document document = uh0Var.f52664e;
                    if (document != null) {
                        arrayList.add(document);
                        yf.c cVar = wh0Var.getMediaDataController().A0;
                        TLRPC.Document document2 = uh0Var.f52664e;
                        ArrayList arrayList2 = cVar.f61322e;
                        if (document2 != null) {
                            if (!cVar.f61323f) {
                                cVar.f(true);
                                cVar.f61323f = true;
                            }
                            int i12 = 0;
                            while (true) {
                                if (i12 < arrayList2.size()) {
                                    if (((yf.b) arrayList2.get(i12)).f61314a != null && ((yf.b) arrayList2.get(i12)).f61314a.f28498id == document2.f28498id) {
                                        arrayList2.remove(i12);
                                    } else {
                                        i12++;
                                    }
                                }
                            }
                        }
                    }
                    if (uh0Var.f52666g != null && (eVar = (yf.e) wh0Var.getMediaDataController().f26698a0.get(uh0Var.f52666g)) != null) {
                        eVar.f61328c = true;
                        eVar.a();
                        int i13 = eVar.f61326a;
                        org.telegram.messenger.w7 G = org.telegram.messenger.w7.G(i13);
                        String str2 = eVar.f61327b;
                        G.b(str2, false);
                        org.telegram.messenger.ri.d0(i13).l1(str2, null, true);
                    }
                    if (uh0Var == wh0Var.H) {
                        wh0Var.N = null;
                        wh0Var.H = (uh0) wh0Var.f53683b.get(0);
                        wh0Var.I = true;
                    }
                    wh0Var.f53682a.remove(uh0Var);
                    wh0Var.f53684c.remove(uh0Var);
                }
                wh0Var.getMediaDataController().A0.h();
                for (int i14 = 0; i14 < arrayList.size(); i14++) {
                    TLRPC.Document document3 = (TLRPC.Document) arrayList.get(i14);
                    TL_account.saveRingtone saveringtone = new TL_account.saveRingtone();
                    TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                    saveringtone.f28704id = tL_inputDocument;
                    tL_inputDocument.f28504id = document3.f28498id;
                    tL_inputDocument.access_hash = document3.access_hash;
                    byte[] bArr = document3.file_reference;
                    tL_inputDocument.file_reference = bArr;
                    if (bArr == null) {
                        tL_inputDocument.file_reference = new byte[0];
                    }
                    saveringtone.unsave = true;
                    wh0Var.getConnectionsManager().sendRequest(saveringtone, new fi.l5(9));
                }
                wh0.b0(wh0Var);
                wh0Var.i0();
                wh0Var.f53685e.f();
                t1Var.dismiss();
                return;
            default:
                PasscodeActivity passcodeActivity = (PasscodeActivity) obj;
                org.telegram.messenger.bz.f23319s = "";
                org.telegram.messenger.bz.f23333x = false;
                org.telegram.messenger.bz.y();
                passcodeActivity.getMediaDataController().o();
                int childCount = passcodeActivity.f43260c.getChildCount();
                int i15 = 0;
                while (true) {
                    if (i15 < childCount) {
                        View childAt = passcodeActivity.f43260c.getChildAt(i15);
                        if (childAt instanceof org.telegram.ui.Cells.w9) {
                            org.telegram.ui.ActionBar.u6.U(((org.telegram.ui.Cells.w9) childAt).getTextView(), org.telegram.ui.ActionBar.n6.E6, null);
                        } else {
                            i15++;
                        }
                    }
                }
                org.telegram.messenger.ks.e().k(50, new Object[0]);
                passcodeActivity.finishFragment();
                return;
        }
    }

    @Override
    public void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        qx qxVar = (qx) this.f54692b;
        View view = (View) obj2;
        Integer num = (Integer) number;
        Float f10 = (Float) serializable;
        Float f11 = (Float) serializable2;
        if (((org.telegram.ui.Components.n41) obj).d == 1 && qxVar.f51551b != null) {
            boolean z10 = !qxVar.f51552c;
            qxVar.f51552c = z10;
            fi.b0 b0Var = qxVar.h;
            if (b0Var != null) {
                b0Var.a(Boolean.valueOf(z10), Boolean.valueOf(qxVar.d), Boolean.valueOf(qxVar.f51553e));
            }
            ((org.telegram.ui.Cells.r8) view).setChecked(qxVar.f51552c);
            qxVar.f51554f.f35323g3.O(true);
        }
    }

    @Override
    public r0.l1 l1(View view, r0.l1 l1Var) {
        x80 x80Var = (x80) this.f54692b;
        i0.b I0 = org.telegram.messenger.g0.I0(l1Var, false);
        if (!x80Var.f53882a.equals(I0)) {
            x80Var.f53882a = I0;
            x80Var.requestLayout();
        }
        int childCount = x80Var.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            r0.i0.b(x80Var.getChildAt(i7), l1Var);
        }
        return l1Var;
    }

    @Override
    public void m(KeyEvent keyEvent) {
        hy hyVar = (hy) this.f54692b;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && hyVar.f46906y.isShowing()) {
            hyVar.f46906y.d(true);
        }
    }

    @Override
    public void m2(ArrayList arrayList) {
        int i7 = this.f54691a;
    }

    @Override
    public void n(int i7) {
        DataAutoDownloadActivity dataAutoDownloadActivity = (DataAutoDownloadActivity) ((l4) this.f54692b).f49583e;
        org.telegram.messenger.z5 z5Var = (org.telegram.messenger.z5) dataAutoDownloadActivity.f43123c.get(i7);
        if (z5Var == dataAutoDownloadActivity.E) {
            dataAutoDownloadActivity.f43124e = 0;
        } else if (z5Var == dataAutoDownloadActivity.F) {
            dataAutoDownloadActivity.f43124e = 1;
        } else if (z5Var == dataAutoDownloadActivity.G) {
            dataAutoDownloadActivity.f43124e = 2;
        } else {
            dataAutoDownloadActivity.f43124e = 3;
        }
        int i10 = dataAutoDownloadActivity.f43125f;
        if (i10 == 0) {
            org.telegram.messenger.a6.q(DataAutoDownloadActivity.i0(dataAutoDownloadActivity)).Q = dataAutoDownloadActivity.f43124e;
        } else if (i10 == 1) {
            org.telegram.messenger.a6.q(DataAutoDownloadActivity.j0(dataAutoDownloadActivity)).R = dataAutoDownloadActivity.f43124e;
        } else {
            org.telegram.messenger.a6.q(DataAutoDownloadActivity.k0(dataAutoDownloadActivity)).S = dataAutoDownloadActivity.f43124e;
        }
        SharedPreferences.Editor edit = org.telegram.messenger.mp.u1(DataAutoDownloadActivity.l0(dataAutoDownloadActivity)).h7.edit();
        edit.putInt(dataAutoDownloadActivity.L, dataAutoDownloadActivity.f43124e);
        edit.commit();
        org.telegram.messenger.a6.q(DataAutoDownloadActivity.m0(dataAutoDownloadActivity)).g();
        for (int i11 = 0; i11 < 4; i11++) {
            v4.f1 K = dataAutoDownloadActivity.f43122b.K(DataAutoDownloadActivity.n0(dataAutoDownloadActivity) + i11);
            if (K != null) {
                dataAutoDownloadActivity.f43121a.t(K, DataAutoDownloadActivity.n0(dataAutoDownloadActivity) + i11);
            }
        }
        dataAutoDownloadActivity.J = true;
    }

    @Override
    public void p(org.telegram.ui.Components.oc0 oc0Var) {
        ExternalActionActivity externalActionActivity = (ExternalActionActivity) this.f54692b;
        ArrayList arrayList = ExternalActionActivity.f43158y;
        org.telegram.messenger.bz.C = false;
        Intent intent = externalActionActivity.h;
        if (intent != null) {
            externalActionActivity.e(intent, externalActionActivity.f43164n, externalActionActivity.f43167w, true, externalActionActivity.f43165r, externalActionActivity.f43166s);
            externalActionActivity.h = null;
        }
        externalActionActivity.f43161c.f0();
        if (org.telegram.messenger.g0.Q1()) {
            externalActionActivity.d.f0();
        }
        org.telegram.messenger.ks.e().k(org.telegram.messenger.ks.f25259o0, oc0Var);
    }

    @Override
    public int run() {
        return ((FiltersSetupActivity) this.f54692b).f43178x;
    }

    @Override
    public a0.h u1() {
        switch (this.f54691a) {
            case 13:
                return null;
            default:
                return null;
        }
    }

    @Override
    public void v(int i7) {
        switch (this.f54691a) {
            case 13:
                w40 w40Var = (w40) this.f54692b;
                y40 y40Var = w40Var.J;
                y40Var.v0(w40Var.I);
                if (w40Var.h == null && !w40Var.f53112f.e() && w40Var.b() == 0) {
                    y40Var.f54214s.e(false, true);
                }
                w40Var.f();
                return;
            default:
                qh0 qh0Var = (qh0) this.f54692b;
                if (qh0Var.f51460f == null && !qh0Var.h.e()) {
                    qh0Var.f51461n.f43238c.c();
                }
                qh0Var.f();
                return;
        }
    }

    private final void j(ArrayList arrayList) {
    }

    private final void l(ArrayList arrayList) {
    }

    @Override
    public void o() {
    }

    @Override
    public void G(float f10, int i7) {
    }

    private final void e(View view, float f10, float f11) {
    }

    private final void f(View view, float f10, float f11) {
    }

    private final void h(View view, float f10, float f11) {
    }
}
