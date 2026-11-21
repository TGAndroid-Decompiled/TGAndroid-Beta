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
public final class zr implements gx, org.telegram.ui.Components.rj0, org.telegram.ui.Components.gu0, org.telegram.ui.Components.if0, org.telegram.ui.ActionBar.q1, org.telegram.messenger.xo, org.telegram.messenger.v10, org.telegram.ui.Components.oc0, org.telegram.ui.ActionBar.e1, org.telegram.ui.Components.nj0, jg.y1, org.telegram.ui.Components.sj0, r0.m, te.b, xg0 {
    public final int f54625a;
    public final Object f54626b;

    public zr(Object obj, int i7) {
        this.f54625a = i7;
        this.f54626b = obj;
    }

    @Override
    public void H(int i7, float f10, float f11, te.c cVar) {
        oe0 oe0Var = (oe0) this.f54626b;
        oe0Var.getClass();
        oe0Var.setScaleX(org.telegram.messenger.g0.T1(1.0f, 1.019f, f10));
        oe0Var.setScaleY(org.telegram.messenger.g0.T1(1.0f, 1.019f, f10));
    }

    @Override
    public a0.h K0() {
        switch (this.f54625a) {
            case 13:
                return null;
            default:
                return null;
        }
    }

    @Override
    public r0.l1 P0(View view, r0.l1 l1Var) {
        y80 y80Var = (y80) this.f54626b;
        i0.b I0 = org.telegram.messenger.g0.I0(l1Var, false);
        if (!y80Var.f54075a.equals(I0)) {
            y80Var.f54075a = I0;
            y80Var.requestLayout();
        }
        int childCount = y80Var.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            r0.i0.b(y80Var.getChildAt(i7), l1Var);
        }
        return l1Var;
    }

    @Override
    public void P1(ArrayList arrayList) {
        int i7 = this.f54625a;
    }

    @Override
    public void a(Canvas canvas) {
        ((Layout) this.f54626b).draw(canvas);
    }

    @Override
    public void b() {
        ContactsWidgetConfigActivity contactsWidgetConfigActivity = (ContactsWidgetConfigActivity) this.f54626b;
        int i7 = ContactsWidgetConfigActivity.G;
        Intent intent = new Intent();
        intent.putExtra("appWidgetId", contactsWidgetConfigActivity.F);
        contactsWidgetConfigActivity.setResult(-1, intent);
        contactsWidgetConfigActivity.finish();
    }

    @Override
    public boolean b1(View view) {
        switch (this.f54625a) {
            case 1:
                return false;
            case 2:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean c(int i7, View view) {
        int i10;
        int i11;
        int i12 = this.f54625a;
        Object obj = this.f54626b;
        switch (i12) {
            case 15:
                return LanguageSelectActivity.a0((LanguageSelectActivity) obj, view, i7);
            case 23:
                final og0 og0Var = (og0) obj;
                if (i7 >= og0Var.J && i7 < og0Var.K) {
                    try {
                        view.performHapticFeedback(0, 2);
                    } catch (Exception unused) {
                    }
                    final org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) og0Var.f50594y.get(i7 - og0Var.J);
                    final long B0 = org.telegram.messenger.fj.B0(fjVar.f23993k);
                    final boolean E = org.telegram.messenger.n5.E(B0);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, og0Var.getParentActivity(), og0Var.getResourceProvider());
                    if (fjVar.x4()) {
                        if (E) {
                            i10 = 2131747592;
                        } else {
                            i10 = 2131747617;
                        }
                        arrayList.add(org.telegram.messenger.gd.N0(i10, null));
                        if (E) {
                            i11 = 2131232268;
                        } else {
                            i11 = 2131232090;
                        }
                        arrayList3.add(Integer.valueOf(i11));
                    } else {
                        org.telegram.ui.Cells.c0.v(null, 2131743307, arrayList, 2131232257, arrayList3);
                    }
                    arrayList2.add(0);
                    CharSequence[] charSequenceArr = (CharSequence[]) arrayList.toArray(new CharSequence[arrayList2.size()]);
                    Typeface typeface = org.telegram.messenger.g0.f24118a;
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
                            org.telegram.ui.ActionBar.g2 g2Var = og0.this;
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
                    org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28774a;
                    t1Var.Q = charSequenceArr;
                    t1Var.R = iArr;
                    t1Var.N = onClickListener;
                    og0Var.showDialog(t1Var);
                }
                return false;
            default:
                yh0 yh0Var = (yh0) obj;
                yh0Var.getClass();
                if (view instanceof xh0) {
                    xh0 xh0Var = (xh0) view;
                    yh0Var.e0(xh0Var.f53884e);
                    xh0Var.performHapticFeedback(0);
                }
                return false;
        }
    }

    @Override
    public a0.h d1() {
        switch (this.f54625a) {
            case 13:
                return null;
            default:
                return null;
        }
    }

    @Override
    public boolean e(TLRPC.TL_error tL_error) {
        ((d3.e0) this.f54626b).run();
        return true;
    }

    @Override
    public void f(float f10, float f11, int i7, View view) {
        org.telegram.ui.Components.o41 G;
        Object obj;
        long j3;
        int i10;
        int Z;
        boolean[] zArr;
        int i11 = this.f54625a;
        Object obj2 = this.f54626b;
        switch (i11) {
            case 1:
                ws wsVar = (ws) obj2;
                HashSet hashSet = wsVar.X1;
                if (!wsVar.Y1 && (G = wsVar.Z1.G(i7 - 1)) != null && (obj = G.H) != null) {
                    if (obj instanceof TLRPC.User) {
                        j3 = ((TLRPC.User) obj).f28580id;
                    } else if (obj instanceof TLRPC.Chat) {
                        j3 = ((TLRPC.Chat) obj).f28431id;
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
                z90 z90Var = (z90) obj2;
                ArrayList arrayList = z90Var.f54506s;
                if (view != null && i7 >= 0 && i7 < arrayList.size()) {
                    u90 u90Var = (u90) arrayList.get(i7);
                    int i12 = u90Var.f56630a;
                    int i13 = u90Var.f52480e;
                    if (i12 != 3 && i12 != 4) {
                        if (i12 == 5 && u90Var.f52481f == 1) {
                            SharedPreferences g12 = org.telegram.messenger.mp.g1();
                            boolean z10 = g12.getBoolean("view_animations", true);
                            SharedPreferences.Editor edit = g12.edit();
                            boolean z11 = !z10;
                            edit.putBoolean("view_animations", z11);
                            org.telegram.messenger.bz.C1 = Boolean.valueOf(z11);
                            edit.commit();
                            ((org.telegram.ui.Cells.n8) view).setChecked(z11);
                        }
                    } else {
                        boolean z12 = false;
                        if (org.telegram.messenger.pc.f()) {
                            z90Var.f54502e = org.telegram.ui.Components.lc.b0(z90Var).M(new org.telegram.ui.Components.s9(0.1f, org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Y5, false)), org.telegram.messenger.gd.N0(2131748676, null)).j();
                            return;
                        } else if (u90Var.f56630a == 3 && Integer.bitCount(i13) > 1 && (!org.telegram.messenger.gd.f24241a0 ? f10 < view.getMeasuredWidth() - org.telegram.messenger.g0.L(75.0f) : f10 > org.telegram.messenger.g0.L(75.0f)) && (Z = z90Var.Z(i13)) != -1) {
                            z90Var.f54504n[Z] = !zArr[Z];
                            z90Var.d0();
                            z90Var.c0();
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
                            org.telegram.messenger.pc.f26247i = i10;
                            org.telegram.messenger.pc.k();
                            z90Var.d0();
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
        yf.e eVar;
        int i10 = this.f54625a;
        Object obj = this.f54626b;
        switch (i10) {
            case 5:
                ((bi.q2) obj).run();
                return;
            case 14:
                ((h50) obj).Z(true);
                return;
            case 16:
                String str = LaunchActivity.C1;
                org.telegram.messenger.g0.g((StringBuilder) obj);
                return;
            case 19:
                pb0 pb0Var = (pb0) obj;
                Bundle bundle = new Bundle();
                bundle.putString("phone", pb0Var.J);
                bundle.putString("ephone", pb0Var.K);
                bundle.putString("phoneFormated", pb0Var.M);
                TLRPC.TL_auth_resetLoginEmail tL_auth_resetLoginEmail = new TLRPC.TL_auth_resetLoginEmail();
                tL_auth_resetLoginEmail.phone_number = pb0Var.M;
                tL_auth_resetLoginEmail.phone_code_hash = pb0Var.N;
                pb0Var.f50830a0.getConnectionsManager().sendRequest(tL_auth_resetLoginEmail, new gb0(pb0Var, bundle, tL_auth_resetLoginEmail, 1), 10);
                return;
            case 20:
                xb0 xb0Var = (xb0) obj;
                de0.t0(xb0Var.E, xb0Var.f53816s, xb0Var.f53817w, xb0Var.f53818x);
                return;
            case 21:
                qc0 qc0Var = (qc0) obj;
                de0 de0Var = qc0Var.H;
                de0Var.F1(0, true);
                TL_account.deleteAccount deleteaccount = new TL_account.deleteAccount();
                deleteaccount.reason = "Forgot password";
                ConnectionsManager.getInstance(de0.v0(de0Var)).sendRequest(deleteaccount, new l(qc0Var, 12), 10);
                return;
            case 26:
                ((bi.t4) obj).run();
                return;
            case 28:
                yh0 yh0Var = ((vh0) obj).f52831b;
                SparseArray sparseArray = yh0Var.J;
                ArrayList arrayList = new ArrayList();
                for (int i11 = 0; i11 < sparseArray.size(); i11++) {
                    wh0 wh0Var = (wh0) sparseArray.valueAt(i11);
                    TLRPC.Document document = wh0Var.f53439e;
                    if (document != null) {
                        arrayList.add(document);
                        yf.c cVar = yh0Var.getMediaDataController().A0;
                        TLRPC.Document document2 = wh0Var.f53439e;
                        ArrayList arrayList2 = cVar.f61234e;
                        if (document2 != null) {
                            if (!cVar.f61235f) {
                                cVar.f(true);
                                cVar.f61235f = true;
                            }
                            int i12 = 0;
                            while (true) {
                                if (i12 < arrayList2.size()) {
                                    if (((yf.b) arrayList2.get(i12)).f61226a != null && ((yf.b) arrayList2.get(i12)).f61226a.f28437id == document2.f28437id) {
                                        arrayList2.remove(i12);
                                    } else {
                                        i12++;
                                    }
                                }
                            }
                        }
                    }
                    if (wh0Var.f53441g != null && (eVar = (yf.e) yh0Var.getMediaDataController().f26625a0.get(wh0Var.f53441g)) != null) {
                        eVar.f61240c = true;
                        eVar.a();
                        int i13 = eVar.f61238a;
                        org.telegram.messenger.w7 G = org.telegram.messenger.w7.G(i13);
                        String str2 = eVar.f61239b;
                        G.b(str2, false);
                        org.telegram.messenger.ri.d0(i13).l1(str2, null, true);
                    }
                    if (wh0Var == yh0Var.H) {
                        yh0Var.N = null;
                        yh0Var.H = (wh0) yh0Var.f54204b.get(0);
                        yh0Var.I = true;
                    }
                    yh0Var.f54203a.remove(wh0Var);
                    yh0Var.f54205c.remove(wh0Var);
                }
                yh0Var.getMediaDataController().A0.h();
                for (int i14 = 0; i14 < arrayList.size(); i14++) {
                    TLRPC.Document document3 = (TLRPC.Document) arrayList.get(i14);
                    TL_account.saveRingtone saveringtone = new TL_account.saveRingtone();
                    TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                    saveringtone.f28643id = tL_inputDocument;
                    tL_inputDocument.f28443id = document3.f28437id;
                    tL_inputDocument.access_hash = document3.access_hash;
                    byte[] bArr = document3.file_reference;
                    tL_inputDocument.file_reference = bArr;
                    if (bArr == null) {
                        tL_inputDocument.file_reference = new byte[0];
                    }
                    saveringtone.unsave = true;
                    yh0Var.getConnectionsManager().sendRequest(saveringtone, new fi.l5(9));
                }
                yh0.b0(yh0Var);
                yh0Var.i0();
                yh0Var.f54206e.f();
                t1Var.dismiss();
                return;
            default:
                PasscodeActivity passcodeActivity = (PasscodeActivity) obj;
                org.telegram.messenger.bz.f23222s = "";
                org.telegram.messenger.bz.f23236x = false;
                org.telegram.messenger.bz.y();
                passcodeActivity.getMediaDataController().o();
                int childCount = passcodeActivity.f43181c.getChildCount();
                int i15 = 0;
                while (true) {
                    if (i15 < childCount) {
                        View childAt = passcodeActivity.f43181c.getChildAt(i15);
                        if (childAt instanceof org.telegram.ui.Cells.x9) {
                            org.telegram.ui.ActionBar.t6.U(((org.telegram.ui.Cells.x9) childAt).getTextView(), org.telegram.ui.ActionBar.m6.E6, null);
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
    public void j(KeyEvent keyEvent) {
        iy iyVar = (iy) this.f54626b;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && iyVar.f47075y.isShowing()) {
            iyVar.f47075y.d(true);
        }
    }

    @Override
    public void k(int i7) {
        DataAutoDownloadActivity dataAutoDownloadActivity = (DataAutoDownloadActivity) ((l4) this.f54626b).f49470e;
        org.telegram.messenger.z5 z5Var = (org.telegram.messenger.z5) dataAutoDownloadActivity.f43044c.get(i7);
        if (z5Var == dataAutoDownloadActivity.E) {
            dataAutoDownloadActivity.f43045e = 0;
        } else if (z5Var == dataAutoDownloadActivity.F) {
            dataAutoDownloadActivity.f43045e = 1;
        } else if (z5Var == dataAutoDownloadActivity.G) {
            dataAutoDownloadActivity.f43045e = 2;
        } else {
            dataAutoDownloadActivity.f43045e = 3;
        }
        int i10 = dataAutoDownloadActivity.f43046f;
        if (i10 == 0) {
            org.telegram.messenger.a6.q(DataAutoDownloadActivity.i0(dataAutoDownloadActivity)).Q = dataAutoDownloadActivity.f43045e;
        } else if (i10 == 1) {
            org.telegram.messenger.a6.q(DataAutoDownloadActivity.j0(dataAutoDownloadActivity)).R = dataAutoDownloadActivity.f43045e;
        } else {
            org.telegram.messenger.a6.q(DataAutoDownloadActivity.k0(dataAutoDownloadActivity)).S = dataAutoDownloadActivity.f43045e;
        }
        SharedPreferences.Editor edit = org.telegram.messenger.mp.u1(DataAutoDownloadActivity.l0(dataAutoDownloadActivity)).h7.edit();
        edit.putInt(dataAutoDownloadActivity.L, dataAutoDownloadActivity.f43045e);
        edit.commit();
        org.telegram.messenger.a6.q(DataAutoDownloadActivity.m0(dataAutoDownloadActivity)).g();
        for (int i11 = 0; i11 < 4; i11++) {
            v4.f1 K = dataAutoDownloadActivity.f43043b.K(DataAutoDownloadActivity.n0(dataAutoDownloadActivity) + i11);
            if (K != null) {
                dataAutoDownloadActivity.f43042a.t(K, DataAutoDownloadActivity.n0(dataAutoDownloadActivity) + i11);
            }
        }
        dataAutoDownloadActivity.J = true;
    }

    @Override
    public void l(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        rx rxVar = (rx) this.f54626b;
        View view = (View) obj2;
        Integer num = (Integer) number;
        Float f10 = (Float) serializable;
        Float f11 = (Float) serializable2;
        if (((org.telegram.ui.Components.o41) obj).d == 1 && rxVar.f51776b != null) {
            boolean z10 = !rxVar.f51777c;
            rxVar.f51777c = z10;
            fi.b0 b0Var = rxVar.h;
            if (b0Var != null) {
                b0Var.a(Boolean.valueOf(z10), Boolean.valueOf(rxVar.d), Boolean.valueOf(rxVar.f51778e));
            }
            ((org.telegram.ui.Cells.s8) view).setChecked(rxVar.f51777c);
            rxVar.f51779f.f35796g3.O(true);
        }
    }

    @Override
    public void p(org.telegram.ui.Components.qc0 qc0Var) {
        ExternalActionActivity externalActionActivity = (ExternalActionActivity) this.f54626b;
        ArrayList arrayList = ExternalActionActivity.f43079y;
        org.telegram.messenger.bz.C = false;
        Intent intent = externalActionActivity.h;
        if (intent != null) {
            externalActionActivity.e(intent, externalActionActivity.f43085n, externalActionActivity.f43088w, true, externalActionActivity.f43086r, externalActionActivity.f43087s);
            externalActionActivity.h = null;
        }
        externalActionActivity.f43082c.f0();
        if (org.telegram.messenger.g0.Q1()) {
            externalActionActivity.d.f0();
        }
        org.telegram.messenger.ks.e().k(org.telegram.messenger.ks.f25188o0, qc0Var);
    }

    @Override
    public void r(int i7) {
        switch (this.f54625a) {
            case 13:
                x40 x40Var = (x40) this.f54626b;
                z40 z40Var = x40Var.J;
                z40Var.v0(x40Var.I);
                if (x40Var.h == null && !x40Var.f53598f.e() && x40Var.b() == 0) {
                    z40Var.f54424s.e(false, true);
                }
                x40Var.f();
                return;
            default:
                sh0 sh0Var = (sh0) this.f54626b;
                if (sh0Var.f52043f == null && !sh0Var.h.e()) {
                    sh0Var.f52044n.f43159c.c();
                }
                sh0Var.f();
                return;
        }
    }

    @Override
    public int run() {
        return ((FiltersSetupActivity) this.f54626b).f43099x;
    }

    @Override
    public void s0(View view, float f10, float f11) {
        int i7 = this.f54625a;
    }

    @Override
    public boolean v1(int i7) {
        switch (this.f54625a) {
            case 13:
                return true;
            default:
                return true;
        }
    }

    private final void m(ArrayList arrayList) {
    }

    private final void n(ArrayList arrayList) {
    }

    @Override
    public void o() {
    }

    @Override
    public void D(float f10, int i7) {
    }

    private final void d(View view, float f10, float f11) {
    }

    private final void g(View view, float f10, float f11) {
    }

    private final void i(View view, float f10, float f11) {
    }
}
