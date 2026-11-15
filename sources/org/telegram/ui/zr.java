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
public final class zr implements cx, org.telegram.ui.Components.hj0, org.telegram.ui.Components.vt0, org.telegram.ui.Components.we0, org.telegram.ui.ActionBar.q1, org.telegram.messenger.yo, org.telegram.messenger.x10, org.telegram.ui.Components.dc0, org.telegram.ui.ActionBar.e1, org.telegram.ui.Components.dj0, jg.y1, org.telegram.ui.Components.ij0, r0.m, te.b, sg0 {
    public final int f54014a;
    public final Object f54015b;

    public zr(Object obj, int i7) {
        this.f54014a = i7;
        this.f54015b = obj;
    }

    @Override
    public void G(int i7, float f10, float f11, te.c cVar) {
        le0 le0Var = (le0) this.f54015b;
        le0Var.getClass();
        le0Var.setScaleX(org.telegram.messenger.g0.T1(1.0f, 1.019f, f10));
        le0Var.setScaleY(org.telegram.messenger.g0.T1(1.0f, 1.019f, f10));
    }

    @Override
    public a0.h K() {
        switch (this.f54014a) {
            case 13:
                return null;
            default:
                return null;
        }
    }

    @Override
    public r0.k1 M0(View view, r0.k1 k1Var) {
        v80 v80Var = (v80) this.f54015b;
        i0.c I0 = org.telegram.messenger.g0.I0(k1Var, false);
        if (!v80Var.f52162a.equals(I0)) {
            v80Var.f52162a = I0;
            v80Var.requestLayout();
        }
        int childCount = v80Var.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            r0.i0.b(v80Var.getChildAt(i7), k1Var);
        }
        return k1Var;
    }

    @Override
    public a0.h U() {
        switch (this.f54014a) {
            case 13:
                return null;
            default:
                return null;
        }
    }

    @Override
    public void a(Canvas canvas) {
        ((Layout) this.f54015b).draw(canvas);
    }

    @Override
    public boolean b(int i7, View view) {
        int i10;
        int i11;
        int i12 = this.f54014a;
        Object obj = this.f54015b;
        switch (i12) {
            case 15:
                return LanguageSelectActivity.a0((LanguageSelectActivity) obj, view, i7);
            case 23:
                final jg0 jg0Var = (jg0) obj;
                if (i7 >= jg0Var.J && i7 < jg0Var.K) {
                    try {
                        view.performHapticFeedback(0, 2);
                    } catch (Exception unused) {
                    }
                    final org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) jg0Var.f48348y.get(i7 - jg0Var.J);
                    final long B0 = org.telegram.messenger.gj.B0(gjVar.f23817k);
                    final boolean E = org.telegram.messenger.m5.E(B0);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, jg0Var.getParentActivity(), jg0Var.getResourceProvider());
                    if (gjVar.x4()) {
                        if (E) {
                            i10 = 2131747786;
                        } else {
                            i10 = 2131747811;
                        }
                        arrayList.add(org.telegram.messenger.hd.M0(i10, null));
                        if (E) {
                            i11 = 2131232267;
                        } else {
                            i11 = 2131232089;
                        }
                        arrayList3.add(Integer.valueOf(i11));
                    } else {
                        org.telegram.ui.Cells.y0.s(null, 2131743550, arrayList, 2131232256, arrayList3);
                    }
                    arrayList2.add(0);
                    CharSequence[] charSequenceArr = (CharSequence[]) arrayList.toArray(new CharSequence[arrayList2.size()]);
                    Typeface typeface = org.telegram.messenger.g0.f23581a;
                    int size = arrayList3.size();
                    int[] iArr = new int[size];
                    for (int i13 = 0; i13 < size; i13++) {
                        iArr[i13] = ((Integer) arrayList3.get(i13)).intValue();
                    }
                    DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() {
                        @Override
                        public final void onClick(DialogInterface dialogInterface, int i14) {
                            org.telegram.ui.ActionBar.e2 ua2;
                            org.telegram.messenger.gj gjVar2 = gjVar;
                            boolean x42 = gjVar2.x4();
                            org.telegram.ui.ActionBar.e2 e2Var = jg0.this;
                            boolean z10 = E;
                            long j3 = B0;
                            if (x42) {
                                if (z10) {
                                    ua2 = ProfileActivity.C4(j3);
                                } else {
                                    ua2 = an.ua(j3);
                                }
                                e2Var.presentFragment(ua2);
                                return;
                            }
                            Bundle bundle = new Bundle();
                            if (z10) {
                                bundle.putLong("user_id", j3);
                            } else {
                                bundle.putLong("chat_id", -j3);
                            }
                            bundle.putInt("message_id", gjVar2.e1());
                            bundle.putBoolean("need_remove_previous_same_chat_activity", false);
                            if (e2Var.getMessagesController().E(bundle, e2Var, null, null)) {
                                e2Var.presentFragment(new an(bundle));
                            }
                        }
                    };
                    org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
                    t1Var.Q = charSequenceArr;
                    t1Var.R = iArr;
                    t1Var.N = onClickListener;
                    jg0Var.showDialog(t1Var);
                }
                return false;
            default:
                uh0 uh0Var = (uh0) obj;
                uh0Var.getClass();
                if (view instanceof th0) {
                    th0 th0Var = (th0) view;
                    uh0Var.e0(th0Var.f51590e);
                    th0Var.performHapticFeedback(0);
                }
                return false;
        }
    }

    @Override
    public void c() {
        ContactsWidgetConfigActivity contactsWidgetConfigActivity = (ContactsWidgetConfigActivity) this.f54015b;
        int i7 = ContactsWidgetConfigActivity.G;
        Intent intent = new Intent();
        intent.putExtra("appWidgetId", contactsWidgetConfigActivity.F);
        contactsWidgetConfigActivity.setResult(-1, intent);
        contactsWidgetConfigActivity.finish();
    }

    @Override
    public boolean c1(View view) {
        switch (this.f54014a) {
            case 1:
                return false;
            case 2:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean d(TLRPC.TL_error tL_error) {
        ((d3.e0) this.f54015b).run();
        return true;
    }

    @Override
    public boolean e0(int i7) {
        switch (this.f54014a) {
            case 13:
                return true;
            default:
                return true;
        }
    }

    @Override
    public void f(float f10, float f11, int i7, View view) {
        org.telegram.ui.Components.b41 G;
        Object obj;
        long j3;
        int i10;
        int Z;
        boolean[] zArr;
        int i11 = this.f54014a;
        Object obj2 = this.f54015b;
        switch (i11) {
            case 1:
                vs vsVar = (vs) obj2;
                HashSet hashSet = vsVar.X1;
                if (!vsVar.Y1 && (G = vsVar.Z1.G(i7 - 1)) != null && (obj = G.G) != null) {
                    if (obj instanceof TLRPC.User) {
                        j3 = ((TLRPC.User) obj).f28200id;
                    } else if (obj instanceof TLRPC.Chat) {
                        j3 = ((TLRPC.Chat) obj).f28051id;
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
                x90 x90Var = (x90) obj2;
                ArrayList arrayList = x90Var.f53132s;
                if (view != null && i7 >= 0 && i7 < arrayList.size()) {
                    s90 s90Var = (s90) arrayList.get(i7);
                    int i12 = s90Var.f56015a;
                    int i13 = s90Var.f51162e;
                    if (i12 != 3 && i12 != 4) {
                        if (i12 == 5 && s90Var.f51163f == 1) {
                            SharedPreferences e12 = org.telegram.messenger.np.e1();
                            boolean z10 = e12.getBoolean("view_animations", true);
                            SharedPreferences.Editor edit = e12.edit();
                            boolean z11 = !z10;
                            edit.putBoolean("view_animations", z11);
                            org.telegram.messenger.gz.C1 = Boolean.valueOf(z11);
                            edit.commit();
                            ((org.telegram.ui.Cells.l8) view).setChecked(z11);
                        }
                    } else {
                        boolean z12 = false;
                        if (org.telegram.messenger.qc.f()) {
                            x90Var.f53128e = org.telegram.ui.Components.cc.a0(x90Var).M(new org.telegram.ui.Components.k9(0.1f, org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Y5, false)), org.telegram.messenger.hd.M0(2131748869, null)).j();
                            return;
                        } else if (s90Var.f56015a == 3 && Integer.bitCount(i13) > 1 && (!org.telegram.messenger.hd.f24101a0 ? f10 < view.getMeasuredWidth() - org.telegram.messenger.g0.L(75.0f) : f10 > org.telegram.messenger.g0.L(75.0f)) && (Z = x90Var.Z(i13)) != -1) {
                            x90Var.f53130n[Z] = !zArr[Z];
                            x90Var.d0();
                            x90Var.c0();
                            return;
                        } else {
                            if ((org.telegram.messenger.qc.d(true) & i13) > 0) {
                                z12 = true;
                            }
                            int d = org.telegram.messenger.qc.d(true);
                            if (!z12) {
                                i10 = d | i13;
                            } else {
                                i10 = d & (~i13);
                            }
                            org.telegram.messenger.qc.f26072i = i10;
                            org.telegram.messenger.qc.k();
                            x90Var.d0();
                        }
                    }
                    ri.q.f();
                    return;
                }
                return;
        }
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        yf.d dVar;
        int i10 = this.f54014a;
        Object obj = this.f54015b;
        switch (i10) {
            case 5:
                ((bi.m1) obj).run();
                return;
            case 14:
                ((e50) obj).Z(true);
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
                ob0Var.f49891a0.getConnectionsManager().sendRequest(tL_auth_resetLoginEmail, new fb0(ob0Var, bundle, tL_auth_resetLoginEmail, 1), 10);
                return;
            case 20:
                wb0 wb0Var = (wb0) obj;
                ce0.t0(wb0Var.E, wb0Var.f52534s, wb0Var.f52535w, wb0Var.f52536x);
                return;
            case 21:
                pc0 pc0Var = (pc0) obj;
                ce0 ce0Var = pc0Var.H;
                ce0Var.F1(0, true);
                TL_account.deleteAccount deleteaccount = new TL_account.deleteAccount();
                deleteaccount.reason = "Forgot password";
                ConnectionsManager.getInstance(ce0.v0(ce0Var)).sendRequest(deleteaccount, new l(pc0Var, 12), 10);
                return;
            case 26:
                ((org.telegram.messenger.pw) obj).run();
                return;
            case 28:
                uh0 uh0Var = ((rh0) obj).f50956b;
                SparseArray sparseArray = uh0Var.J;
                ArrayList arrayList = new ArrayList();
                for (int i11 = 0; i11 < sparseArray.size(); i11++) {
                    sh0 sh0Var = (sh0) sparseArray.valueAt(i11);
                    TLRPC.Document document = sh0Var.f51224e;
                    if (document != null) {
                        arrayList.add(document);
                        yf.c cVar = uh0Var.getMediaDataController().A0;
                        TLRPC.Document document2 = sh0Var.f51224e;
                        ArrayList arrayList2 = cVar.f60627e;
                        if (document2 != null) {
                            if (!cVar.f60628f) {
                                cVar.f(true);
                                cVar.f60628f = true;
                            }
                            int i12 = 0;
                            while (true) {
                                if (i12 < arrayList2.size()) {
                                    if (((yf.b) arrayList2.get(i12)).f60619a != null && ((yf.b) arrayList2.get(i12)).f60619a.f28057id == document2.f28057id) {
                                        arrayList2.remove(i12);
                                    } else {
                                        i12++;
                                    }
                                }
                            }
                        }
                    }
                    if (sh0Var.f51226g != null && (dVar = (yf.d) uh0Var.getMediaDataController().f26459a0.get(sh0Var.f51226g)) != null) {
                        dVar.f60631c = true;
                        dVar.a();
                        int i13 = dVar.f60629a;
                        org.telegram.messenger.w7 G = org.telegram.messenger.w7.G(i13);
                        String str2 = dVar.f60630b;
                        G.b(str2, false);
                        org.telegram.messenger.si.b0(i13).i1(str2, null, true);
                    }
                    if (sh0Var == uh0Var.H) {
                        uh0Var.N = null;
                        uh0Var.H = (sh0) uh0Var.f51948b.get(0);
                        uh0Var.I = true;
                    }
                    uh0Var.f51947a.remove(sh0Var);
                    uh0Var.f51949c.remove(sh0Var);
                }
                uh0Var.getMediaDataController().A0.h();
                for (int i14 = 0; i14 < arrayList.size(); i14++) {
                    TLRPC.Document document3 = (TLRPC.Document) arrayList.get(i14);
                    TL_account.saveRingtone saveringtone = new TL_account.saveRingtone();
                    TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                    saveringtone.f28263id = tL_inputDocument;
                    tL_inputDocument.f28063id = document3.f28057id;
                    tL_inputDocument.access_hash = document3.access_hash;
                    byte[] bArr = document3.file_reference;
                    tL_inputDocument.file_reference = bArr;
                    if (bArr == null) {
                        tL_inputDocument.file_reference = new byte[0];
                    }
                    saveringtone.unsave = true;
                    uh0Var.getConnectionsManager().sendRequest(saveringtone, new fi.m5(9));
                }
                uh0.b0(uh0Var);
                uh0Var.i0();
                uh0Var.f51950e.f();
                t1Var.dismiss();
                return;
            default:
                PasscodeActivity passcodeActivity = (PasscodeActivity) obj;
                org.telegram.messenger.gz.f23978s = "";
                org.telegram.messenger.gz.f23992x = false;
                org.telegram.messenger.gz.y();
                passcodeActivity.getMediaDataController().m();
                int childCount = passcodeActivity.f42695c.getChildCount();
                int i15 = 0;
                while (true) {
                    if (i15 < childCount) {
                        View childAt = passcodeActivity.f42695c.getChildAt(i15);
                        if (childAt instanceof org.telegram.ui.Cells.v9) {
                            org.telegram.ui.ActionBar.q6.U(((org.telegram.ui.Cells.v9) childAt).getTextView(), org.telegram.ui.ActionBar.j6.E6, null);
                        } else {
                            i15++;
                        }
                    }
                }
                org.telegram.messenger.ns.e().k(50, new Object[0]);
                passcodeActivity.finishFragment();
                return;
        }
    }

    @Override
    public void i(int i7) {
        switch (this.f54014a) {
            case 13:
                u40 u40Var = (u40) this.f54015b;
                w40 w40Var = u40Var.J;
                w40Var.v0(u40Var.I);
                if (u40Var.h == null && !u40Var.f51735f.e() && u40Var.b() == 0) {
                    w40Var.f52422s.e(false, true);
                }
                u40Var.f();
                return;
            default:
                oh0 oh0Var = (oh0) this.f54015b;
                if (oh0Var.f49972f == null && !oh0Var.h.e()) {
                    oh0Var.f49973n.f42673c.c();
                }
                oh0Var.f();
                return;
        }
    }

    @Override
    public void j(KeyEvent keyEvent) {
        fy fyVar = (fy) this.f54015b;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && fyVar.f54053y.isShowing()) {
            fyVar.f54053y.d(true);
        }
    }

    @Override
    public void l(int i7) {
        DataAutoDownloadActivity dataAutoDownloadActivity = (DataAutoDownloadActivity) ((l4) this.f54015b).f48827e;
        org.telegram.messenger.y5 y5Var = (org.telegram.messenger.y5) dataAutoDownloadActivity.f42559c.get(i7);
        if (y5Var == dataAutoDownloadActivity.E) {
            dataAutoDownloadActivity.f42560e = 0;
        } else if (y5Var == dataAutoDownloadActivity.F) {
            dataAutoDownloadActivity.f42560e = 1;
        } else if (y5Var == dataAutoDownloadActivity.G) {
            dataAutoDownloadActivity.f42560e = 2;
        } else {
            dataAutoDownloadActivity.f42560e = 3;
        }
        int i10 = dataAutoDownloadActivity.f42561f;
        if (i10 == 0) {
            org.telegram.messenger.z5.q(DataAutoDownloadActivity.i0(dataAutoDownloadActivity)).Q = dataAutoDownloadActivity.f42560e;
        } else if (i10 == 1) {
            org.telegram.messenger.z5.q(DataAutoDownloadActivity.j0(dataAutoDownloadActivity)).R = dataAutoDownloadActivity.f42560e;
        } else {
            org.telegram.messenger.z5.q(DataAutoDownloadActivity.k0(dataAutoDownloadActivity)).S = dataAutoDownloadActivity.f42560e;
        }
        SharedPreferences.Editor edit = org.telegram.messenger.np.s1(DataAutoDownloadActivity.l0(dataAutoDownloadActivity)).f25280f7.edit();
        edit.putInt(dataAutoDownloadActivity.L, dataAutoDownloadActivity.f42560e);
        edit.commit();
        org.telegram.messenger.z5.q(DataAutoDownloadActivity.m0(dataAutoDownloadActivity)).g();
        for (int i11 = 0; i11 < 4; i11++) {
            v4.e1 K = dataAutoDownloadActivity.f42558b.K(DataAutoDownloadActivity.n0(dataAutoDownloadActivity) + i11);
            if (K != null) {
                dataAutoDownloadActivity.f42557a.t(K, DataAutoDownloadActivity.n0(dataAutoDownloadActivity) + i11);
            }
        }
        dataAutoDownloadActivity.J = true;
    }

    @Override
    public void l0(ArrayList arrayList) {
        int i7 = this.f54014a;
    }

    @Override
    public void m(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        ox oxVar = (ox) this.f54015b;
        View view = (View) obj2;
        Integer num = (Integer) number;
        Float f10 = (Float) serializable;
        Float f11 = (Float) serializable2;
        if (((org.telegram.ui.Components.b41) obj).d == 1 && oxVar.f50074b != null) {
            boolean z10 = !oxVar.f50075c;
            oxVar.f50075c = z10;
            fi.b0 b0Var = oxVar.h;
            if (b0Var != null) {
                b0Var.a(Boolean.valueOf(z10), Boolean.valueOf(oxVar.d), Boolean.valueOf(oxVar.f50076e));
            }
            ((org.telegram.ui.Cells.q8) view).setChecked(oxVar.f50075c);
            oxVar.f50077f.f39895g3.O(true);
        }
    }

    @Override
    public void q(org.telegram.ui.Components.fc0 fc0Var) {
        ExternalActionActivity externalActionActivity = (ExternalActionActivity) this.f54015b;
        ArrayList arrayList = ExternalActionActivity.f42593y;
        org.telegram.messenger.gz.C = false;
        Intent intent = externalActionActivity.h;
        if (intent != null) {
            externalActionActivity.d(intent, externalActionActivity.f42599n, externalActionActivity.f42602w, true, externalActionActivity.f42600r, externalActionActivity.f42601s);
            externalActionActivity.h = null;
        }
        externalActionActivity.f42596c.f0();
        if (org.telegram.messenger.g0.Q1()) {
            externalActionActivity.d.f0();
        }
        org.telegram.messenger.ns.e().k(org.telegram.messenger.ns.f25542o0, fc0Var);
    }

    @Override
    public void r0(View view, float f10, float f11) {
        int i7 = this.f54014a;
    }

    @Override
    public int run() {
        return ((FiltersSetupActivity) this.f54015b).f42613x;
    }

    private final void n(ArrayList arrayList) {
    }

    private final void o(ArrayList arrayList) {
    }

    @Override
    public void p() {
    }

    @Override
    public void E(float f10, int i7) {
    }

    private final void e(View view, float f10, float f11) {
    }

    private final void g(View view, float f10, float f11) {
    }

    private final void k(View view, float f10, float f11) {
    }
}
