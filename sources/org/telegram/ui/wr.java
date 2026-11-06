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
public final class wr implements ax, org.telegram.ui.Components.cj0, org.telegram.ui.Components.ut0, org.telegram.ui.Components.te0, org.telegram.ui.ActionBar.r1, org.telegram.messenger.bp, org.telegram.messenger.a20, org.telegram.ui.Components.cc0, org.telegram.ui.ActionBar.e1, org.telegram.ui.Components.yi0, jg.y1, org.telegram.ui.Components.dj0, r0.m, te.b, sg0 {
    public final int f51479a;
    public final Object f51480b;

    public wr(Object obj, int i7) {
        this.f51479a = i7;
        this.f51480b = obj;
    }

    @Override
    public r0.k1 S0(View view, r0.k1 k1Var) {
        v80 v80Var = (v80) this.f51480b;
        i0.b I0 = org.telegram.messenger.g0.I0(k1Var, false);
        if (!v80Var.f50600a.equals(I0)) {
            v80Var.f50600a = I0;
            v80Var.requestLayout();
        }
        int childCount = v80Var.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            r0.i0.b(v80Var.getChildAt(i7), k1Var);
        }
        return k1Var;
    }

    @Override
    public a0.h X0() {
        switch (this.f51479a) {
            case 13:
                return null;
            default:
                return null;
        }
    }

    @Override
    public void Y(int i7, float f10, float f11, te.c cVar) {
        le0 le0Var = (le0) this.f51480b;
        le0Var.getClass();
        le0Var.setScaleX(org.telegram.messenger.g0.T1(1.0f, 1.019f, f10));
        le0Var.setScaleY(org.telegram.messenger.g0.T1(1.0f, 1.019f, f10));
    }

    @Override
    public boolean a(TLRPC.TL_error tL_error) {
        ((bi.h4) this.f51480b).run();
        return true;
    }

    @Override
    public void b() {
        ContactsWidgetConfigActivity contactsWidgetConfigActivity = (ContactsWidgetConfigActivity) this.f51480b;
        int i7 = ContactsWidgetConfigActivity.F;
        Intent intent = new Intent();
        intent.putExtra("appWidgetId", contactsWidgetConfigActivity.E);
        contactsWidgetConfigActivity.setResult(-1, intent);
        contactsWidgetConfigActivity.finish();
    }

    @Override
    public boolean c(int i7, View view) {
        int i10;
        int i11;
        int i12 = this.f51479a;
        Object obj = this.f51480b;
        switch (i12) {
            case 15:
                return LanguageSelectActivity.a0((LanguageSelectActivity) obj, view, i7);
            case 23:
                final jg0 jg0Var = (jg0) obj;
                if (i7 >= jg0Var.I && i7 < jg0Var.J) {
                    try {
                        view.performHapticFeedback(0, 2);
                    } catch (Exception unused) {
                    }
                    final org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) jg0Var.f46952y.get(i7 - jg0Var.I);
                    final long B0 = org.telegram.messenger.ij.B0(ijVar.f23237k);
                    final boolean E = org.telegram.messenger.m5.E(B0);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, jg0Var.getParentActivity(), jg0Var.getResourceProvider());
                    if (ijVar.y4()) {
                        if (E) {
                            i10 = 2131747785;
                        } else {
                            i10 = 2131747810;
                        }
                        arrayList.add(org.telegram.messenger.hd.M0(i10, null));
                        if (E) {
                            i11 = 2131232266;
                        } else {
                            i11 = 2131232088;
                        }
                        arrayList3.add(Integer.valueOf(i11));
                    } else {
                        org.telegram.ui.Cells.f1.t(null, 2131743551, arrayList, 2131232255, arrayList3);
                    }
                    arrayList2.add(0);
                    CharSequence[] charSequenceArr = (CharSequence[]) arrayList.toArray(new CharSequence[arrayList2.size()]);
                    Typeface typeface = org.telegram.messenger.g0.f22509a;
                    int size = arrayList3.size();
                    int[] iArr = new int[size];
                    for (int i13 = 0; i13 < size; i13++) {
                        iArr[i13] = ((Integer) arrayList3.get(i13)).intValue();
                    }
                    DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() {
                        @Override
                        public final void onClick(DialogInterface dialogInterface, int i14) {
                            org.telegram.ui.ActionBar.f2 ra2;
                            org.telegram.messenger.ij ijVar2 = ijVar;
                            boolean y42 = ijVar2.y4();
                            org.telegram.ui.ActionBar.f2 f2Var = jg0.this;
                            boolean z9 = E;
                            long j3 = B0;
                            if (y42) {
                                if (z9) {
                                    ra2 = ProfileActivity.A4(j3);
                                } else {
                                    ra2 = an.ra(j3);
                                }
                                f2Var.presentFragment(ra2);
                                return;
                            }
                            Bundle bundle = new Bundle();
                            if (z9) {
                                bundle.putLong("user_id", j3);
                            } else {
                                bundle.putLong("chat_id", -j3);
                            }
                            bundle.putInt("message_id", ijVar2.f1());
                            bundle.putBoolean("need_remove_previous_same_chat_activity", false);
                            if (f2Var.getMessagesController().E(bundle, f2Var, null, null)) {
                                f2Var.presentFragment(new an(bundle));
                            }
                        }
                    };
                    org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27292a;
                    u1Var.P = charSequenceArr;
                    u1Var.Q = iArr;
                    u1Var.M = onClickListener;
                    jg0Var.showDialog(u1Var);
                }
                return false;
            default:
                sh0 sh0Var = (sh0) obj;
                sh0Var.getClass();
                if (view instanceof rh0) {
                    rh0 rh0Var = (rh0) view;
                    sh0Var.e0(rh0Var.f49499e);
                    rh0Var.performHapticFeedback(0);
                }
                return false;
        }
    }

    @Override
    public void d(Canvas canvas) {
        ((Layout) this.f51480b).draw(canvas);
    }

    @Override
    public void f(float f10, float f11, int i7, View view) {
        org.telegram.ui.Components.r31 G;
        Object obj;
        long j3;
        int i10;
        int Z;
        boolean[] zArr;
        int i11 = this.f51479a;
        Object obj2 = this.f51480b;
        switch (i11) {
            case 1:
                ss ssVar = (ss) obj2;
                HashSet hashSet = ssVar.T1;
                if (!ssVar.U1 && (G = ssVar.V1.G(i7 - 1)) != null && (obj = G.G) != null) {
                    if (obj instanceof TLRPC.User) {
                        j3 = ((TLRPC.User) obj).f27101id;
                    } else if (obj instanceof TLRPC.Chat) {
                        j3 = ((TLRPC.Chat) obj).f26952id;
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
                w90 w90Var = (w90) obj2;
                ArrayList arrayList = w90Var.f51031s;
                if (view != null && i7 >= 0 && i7 < arrayList.size()) {
                    r90 r90Var = (r90) arrayList.get(i7);
                    int i12 = r90Var.f54415a;
                    int i13 = r90Var.f49393e;
                    if (i12 != 3 && i12 != 4) {
                        if (i12 == 5 && r90Var.f49394f == 1) {
                            SharedPreferences e12 = org.telegram.messenger.qp.e1();
                            boolean z9 = e12.getBoolean("view_animations", true);
                            SharedPreferences.Editor edit = e12.edit();
                            boolean z10 = !z9;
                            edit.putBoolean("view_animations", z10);
                            org.telegram.messenger.iz.C1 = Boolean.valueOf(z10);
                            edit.commit();
                            ((org.telegram.ui.Cells.m8) view).setChecked(z10);
                        }
                    } else {
                        boolean z11 = false;
                        if (org.telegram.messenger.rc.f()) {
                            w90Var.f51027e = org.telegram.ui.Components.hc.a0(w90Var).M(new org.telegram.ui.Components.n9(0.1f, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Y5, false)), org.telegram.messenger.hd.M0(2131748868, null)).j();
                            return;
                        } else if (r90Var.f54415a == 3 && Integer.bitCount(i13) > 1 && (!org.telegram.messenger.hd.f22871a0 ? f10 < view.getMeasuredWidth() - org.telegram.messenger.g0.L(75.0f) : f10 > org.telegram.messenger.g0.L(75.0f)) && (Z = w90Var.Z(i13)) != -1) {
                            w90Var.f51029n[Z] = !zArr[Z];
                            w90Var.d0();
                            w90Var.c0();
                            return;
                        } else {
                            if ((org.telegram.messenger.rc.d(true) & i13) > 0) {
                                z11 = true;
                            }
                            int d = org.telegram.messenger.rc.d(true);
                            if (!z11) {
                                i10 = d | i13;
                            } else {
                                i10 = d & (~i13);
                            }
                            org.telegram.messenger.rc.f25259i = i10;
                            org.telegram.messenger.rc.k();
                            w90Var.d0();
                        }
                    }
                    oi.q.f();
                    return;
                }
                return;
        }
    }

    @Override
    public boolean f1(View view) {
        switch (this.f51479a) {
            case 1:
                return false;
            case 2:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        yf.d dVar;
        int i10 = this.f51479a;
        Object obj = this.f51480b;
        switch (i10) {
            case 5:
                ((bi.d3) obj).run();
                return;
            case 14:
                ((f50) obj).Z(true);
                return;
            case 16:
                String str = LaunchActivity.B1;
                org.telegram.messenger.g0.g((StringBuilder) obj);
                return;
            case 19:
                ob0 ob0Var = (ob0) obj;
                Bundle bundle = new Bundle();
                bundle.putString("phone", ob0Var.I);
                bundle.putString("ephone", ob0Var.J);
                bundle.putString("phoneFormated", ob0Var.L);
                TLRPC.TL_auth_resetLoginEmail tL_auth_resetLoginEmail = new TLRPC.TL_auth_resetLoginEmail();
                tL_auth_resetLoginEmail.phone_number = ob0Var.L;
                tL_auth_resetLoginEmail.phone_code_hash = ob0Var.M;
                ob0Var.W.getConnectionsManager().sendRequest(tL_auth_resetLoginEmail, new fb0(ob0Var, bundle, tL_auth_resetLoginEmail, 1), 10);
                return;
            case 20:
                xb0 xb0Var = (xb0) obj;
                ce0.t0(xb0Var.D, xb0Var.f51808s, xb0Var.f51809w, xb0Var.f51810x);
                return;
            case 21:
                qc0 qc0Var = (qc0) obj;
                ce0 ce0Var = qc0Var.G;
                ce0Var.F1(0, true);
                TL_account.deleteAccount deleteaccount = new TL_account.deleteAccount();
                deleteaccount.reason = "Forgot password";
                ConnectionsManager.getInstance(ce0.v0(ce0Var)).sendRequest(deleteaccount, new l(qc0Var, 12), 10);
                return;
            case 26:
                ((org.telegram.messenger.sw) obj).run();
                return;
            case 28:
                sh0 sh0Var = ((ph0) obj).f48840b;
                SparseArray sparseArray = sh0Var.I;
                ArrayList arrayList = new ArrayList();
                for (int i11 = 0; i11 < sparseArray.size(); i11++) {
                    qh0 qh0Var = (qh0) sparseArray.valueAt(i11);
                    TLRPC.Document document = qh0Var.f49209e;
                    if (document != null) {
                        arrayList.add(document);
                        yf.c cVar = sh0Var.getMediaDataController().f25846z0;
                        TLRPC.Document document2 = qh0Var.f49209e;
                        ArrayList arrayList2 = cVar.f59293e;
                        if (document2 != null) {
                            if (!cVar.f59294f) {
                                cVar.f(true);
                                cVar.f59294f = true;
                            }
                            int i12 = 0;
                            while (true) {
                                if (i12 < arrayList2.size()) {
                                    if (((yf.b) arrayList2.get(i12)).f59285a != null && ((yf.b) arrayList2.get(i12)).f59285a.f26958id == document2.f26958id) {
                                        arrayList2.remove(i12);
                                    } else {
                                        i12++;
                                    }
                                }
                            }
                        }
                    }
                    if (qh0Var.f49211g != null && (dVar = (yf.d) sh0Var.getMediaDataController().Z.get(qh0Var.f49211g)) != null) {
                        dVar.f59297c = true;
                        dVar.a();
                        int i13 = dVar.f59295a;
                        org.telegram.messenger.w7 G = org.telegram.messenger.w7.G(i13);
                        String str2 = dVar.f59296b;
                        G.b(str2, false);
                        org.telegram.messenger.ui.b0(i13).i1(str2, null, true);
                    }
                    if (qh0Var == sh0Var.G) {
                        sh0Var.M = null;
                        sh0Var.G = (qh0) sh0Var.f49747b.get(0);
                        sh0Var.H = true;
                    }
                    sh0Var.f49746a.remove(qh0Var);
                    sh0Var.f49748c.remove(qh0Var);
                }
                sh0Var.getMediaDataController().f25846z0.h();
                for (int i14 = 0; i14 < arrayList.size(); i14++) {
                    TLRPC.Document document3 = (TLRPC.Document) arrayList.get(i14);
                    TL_account.saveRingtone saveringtone = new TL_account.saveRingtone();
                    TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                    saveringtone.f27164id = tL_inputDocument;
                    tL_inputDocument.f26964id = document3.f26958id;
                    tL_inputDocument.access_hash = document3.access_hash;
                    byte[] bArr = document3.file_reference;
                    tL_inputDocument.file_reference = bArr;
                    if (bArr == null) {
                        tL_inputDocument.file_reference = new byte[0];
                    }
                    saveringtone.unsave = true;
                    sh0Var.getConnectionsManager().sendRequest(saveringtone, new di.u5(9));
                }
                sh0.b0(sh0Var);
                sh0Var.i0();
                sh0Var.f49749e.f();
                u1Var.dismiss();
                return;
            default:
                PasscodeActivity passcodeActivity = (PasscodeActivity) obj;
                org.telegram.messenger.iz.f23406s = "";
                org.telegram.messenger.iz.f23420x = false;
                org.telegram.messenger.iz.y();
                passcodeActivity.getMediaDataController().m();
                int childCount = passcodeActivity.f41299c.getChildCount();
                int i15 = 0;
                while (true) {
                    if (i15 < childCount) {
                        View childAt = passcodeActivity.f41299c.getChildAt(i15);
                        if (childAt instanceof org.telegram.ui.Cells.w9) {
                            org.telegram.ui.ActionBar.r6.V(((org.telegram.ui.Cells.w9) childAt).getTextView(), org.telegram.ui.ActionBar.k6.E6, null);
                        } else {
                            i15++;
                        }
                    }
                }
                org.telegram.messenger.qs.e().k(50, new Object[0]);
                passcodeActivity.finishFragment();
                return;
        }
    }

    @Override
    public void i(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        nx nxVar = (nx) this.f51480b;
        View view = (View) obj2;
        Integer num = (Integer) number;
        Float f10 = (Float) serializable;
        Float f11 = (Float) serializable2;
        if (((org.telegram.ui.Components.r31) obj).d == 1 && nxVar.f48126b != null) {
            boolean z9 = !nxVar.f48127c;
            nxVar.f48127c = z9;
            di.b0 b0Var = nxVar.h;
            if (b0Var != null) {
                b0Var.a(Boolean.valueOf(z9), Boolean.valueOf(nxVar.d), Boolean.valueOf(nxVar.f48128e));
            }
            ((org.telegram.ui.Cells.r8) view).setChecked(nxVar.f48127c);
            nxVar.f48129f.f35167f3.O(true);
        }
    }

    @Override
    public void j(KeyEvent keyEvent) {
        ey eyVar = (ey) this.f51480b;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && eyVar.f52360y.isShowing()) {
            eyVar.f52360y.d(true);
        }
    }

    @Override
    public boolean k1(int i7) {
        switch (this.f51479a) {
            case 13:
                return true;
            default:
                return true;
        }
    }

    @Override
    public void m(int i7) {
        DataAutoDownloadActivity dataAutoDownloadActivity = (DataAutoDownloadActivity) ((l4) this.f51480b).f47379e;
        org.telegram.messenger.y5 y5Var = (org.telegram.messenger.y5) dataAutoDownloadActivity.f41177c.get(i7);
        if (y5Var == dataAutoDownloadActivity.D) {
            dataAutoDownloadActivity.f41178e = 0;
        } else if (y5Var == dataAutoDownloadActivity.E) {
            dataAutoDownloadActivity.f41178e = 1;
        } else if (y5Var == dataAutoDownloadActivity.F) {
            dataAutoDownloadActivity.f41178e = 2;
        } else {
            dataAutoDownloadActivity.f41178e = 3;
        }
        int i10 = dataAutoDownloadActivity.f41179f;
        if (i10 == 0) {
            org.telegram.messenger.z5.q(DataAutoDownloadActivity.i0(dataAutoDownloadActivity)).P = dataAutoDownloadActivity.f41178e;
        } else if (i10 == 1) {
            org.telegram.messenger.z5.q(DataAutoDownloadActivity.j0(dataAutoDownloadActivity)).Q = dataAutoDownloadActivity.f41178e;
        } else {
            org.telegram.messenger.z5.q(DataAutoDownloadActivity.k0(dataAutoDownloadActivity)).R = dataAutoDownloadActivity.f41178e;
        }
        SharedPreferences.Editor edit = org.telegram.messenger.qp.s1(DataAutoDownloadActivity.l0(dataAutoDownloadActivity)).f24759e7.edit();
        edit.putInt(dataAutoDownloadActivity.K, dataAutoDownloadActivity.f41178e);
        edit.commit();
        org.telegram.messenger.z5.q(DataAutoDownloadActivity.m0(dataAutoDownloadActivity)).g();
        for (int i11 = 0; i11 < 4; i11++) {
            v4.d1 K = dataAutoDownloadActivity.f41176b.K(DataAutoDownloadActivity.n0(dataAutoDownloadActivity) + i11);
            if (K != null) {
                dataAutoDownloadActivity.f41175a.t(K, DataAutoDownloadActivity.n0(dataAutoDownloadActivity) + i11);
            }
        }
        dataAutoDownloadActivity.I = true;
    }

    @Override
    public void m1(ArrayList arrayList) {
        int i7 = this.f51479a;
    }

    @Override
    public void p(org.telegram.ui.Components.ec0 ec0Var) {
        ExternalActionActivity externalActionActivity = (ExternalActionActivity) this.f51480b;
        ArrayList arrayList = ExternalActionActivity.f41197y;
        org.telegram.messenger.iz.C = false;
        Intent intent = externalActionActivity.h;
        if (intent != null) {
            externalActionActivity.d(intent, externalActionActivity.f41203n, externalActionActivity.f41206w, true, externalActionActivity.f41204r, externalActionActivity.f41205s);
            externalActionActivity.h = null;
        }
        externalActionActivity.f41200c.f0();
        if (org.telegram.messenger.g0.Q1()) {
            externalActionActivity.d.f0();
        }
        org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.f25029o0, ec0Var);
    }

    @Override
    public void q(int i7) {
        switch (this.f51479a) {
            case 13:
                u40 u40Var = (u40) this.f51480b;
                w40 w40Var = u40Var.I;
                w40Var.v0(u40Var.H);
                if (u40Var.h == null && !u40Var.f50193f.e() && u40Var.b() == 0) {
                    w40Var.f50942s.e(false, true);
                }
                u40Var.f();
                return;
            default:
                mh0 mh0Var = (mh0) this.f51480b;
                if (mh0Var.f47784f == null && !mh0Var.h.e()) {
                    mh0Var.f47785n.f41277c.c();
                }
                mh0Var.f();
                return;
        }
    }

    @Override
    public void r0(View view, float f10, float f11) {
        int i7 = this.f51479a;
    }

    @Override
    public int run() {
        return ((FiltersSetupActivity) this.f51480b).f41217x;
    }

    @Override
    public a0.h v0() {
        switch (this.f51479a) {
            case 13:
                return null;
            default:
                return null;
        }
    }

    private final void l(ArrayList arrayList) {
    }

    private final void o(ArrayList arrayList) {
    }

    @Override
    public void n() {
    }

    @Override
    public void F(float f10, int i7) {
    }

    private final void e(View view, float f10, float f11) {
    }

    private final void h(View view, float f10, float f11) {
    }

    private final void k(View view, float f10, float f11) {
    }
}
