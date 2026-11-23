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
public final class zr implements gx, org.telegram.ui.Components.rj0, org.telegram.ui.Components.gu0, org.telegram.ui.Components.if0, org.telegram.ui.ActionBar.q1, org.telegram.messenger.yo, org.telegram.messenger.w10, org.telegram.ui.Components.oc0, org.telegram.ui.ActionBar.e1, org.telegram.ui.Components.nj0, jg.y1, org.telegram.ui.Components.sj0, r0.m, te.b, xg0 {
    public final int f54587a;
    public final Object f54588b;

    public zr(Object obj, int i7) {
        this.f54587a = i7;
        this.f54588b = obj;
    }

    @Override
    public void H(int i7, float f10, float f11, te.c cVar) {
        ne0 ne0Var = (ne0) this.f54588b;
        ne0Var.getClass();
        ne0Var.setScaleX(org.telegram.messenger.g0.T1(1.0f, 1.019f, f10));
        ne0Var.setScaleY(org.telegram.messenger.g0.T1(1.0f, 1.019f, f10));
    }

    @Override
    public a0.h K0() {
        switch (this.f54587a) {
            case 13:
                return null;
            default:
                return null;
        }
    }

    @Override
    public r0.l1 P0(View view, r0.l1 l1Var) {
        y80 y80Var = (y80) this.f54588b;
        i0.b I0 = org.telegram.messenger.g0.I0(l1Var, false);
        if (!y80Var.f54055a.equals(I0)) {
            y80Var.f54055a = I0;
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
        int i7 = this.f54587a;
    }

    @Override
    public void a(Canvas canvas) {
        ((Layout) this.f54588b).draw(canvas);
    }

    @Override
    public void b() {
        ContactsWidgetConfigActivity contactsWidgetConfigActivity = (ContactsWidgetConfigActivity) this.f54588b;
        int i7 = ContactsWidgetConfigActivity.G;
        Intent intent = new Intent();
        intent.putExtra("appWidgetId", contactsWidgetConfigActivity.F);
        contactsWidgetConfigActivity.setResult(-1, intent);
        contactsWidgetConfigActivity.finish();
    }

    @Override
    public boolean b1(View view) {
        switch (this.f54587a) {
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
        int i12 = this.f54587a;
        Object obj = this.f54588b;
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
                    final org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) og0Var.f50581y.get(i7 - og0Var.J);
                    final long B0 = org.telegram.messenger.gj.B0(gjVar.f24177k);
                    final boolean E = org.telegram.messenger.n5.E(B0);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, og0Var.getParentActivity(), og0Var.getResourceProvider());
                    if (gjVar.x4()) {
                        if (E) {
                            i10 = 2131747592;
                        } else {
                            i10 = 2131747617;
                        }
                        arrayList.add(org.telegram.messenger.hd.N0(i10, null));
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
                    Typeface typeface = org.telegram.messenger.g0.f23982a;
                    int size = arrayList3.size();
                    int[] iArr = new int[size];
                    for (int i13 = 0; i13 < size; i13++) {
                        iArr[i13] = ((Integer) arrayList3.get(i13)).intValue();
                    }
                    DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() {
                        @Override
                        public final void onClick(DialogInterface dialogInterface, int i14) {
                            org.telegram.ui.ActionBar.g2 ua2;
                            org.telegram.messenger.gj gjVar2 = gjVar;
                            boolean x42 = gjVar2.x4();
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
                            bundle.putInt("message_id", gjVar2.e1());
                            bundle.putBoolean("need_remove_previous_same_chat_activity", false);
                            if (g2Var.getMessagesController().E(bundle, g2Var, null, null)) {
                                g2Var.presentFragment(new bn(bundle));
                            }
                        }
                    };
                    org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28743a;
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
                    yh0Var.e0(xh0Var.f53810e);
                    xh0Var.performHapticFeedback(0);
                }
                return false;
        }
    }

    @Override
    public a0.h d1() {
        switch (this.f54587a) {
            case 13:
                return null;
            default:
                return null;
        }
    }

    @Override
    public boolean e(TLRPC.TL_error tL_error) {
        ((d3.e0) this.f54588b).run();
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
        int i11 = this.f54587a;
        Object obj2 = this.f54588b;
        switch (i11) {
            case 1:
                ws wsVar = (ws) obj2;
                HashSet hashSet = wsVar.X1;
                if (!wsVar.Y1 && (G = wsVar.Z1.G(i7 - 1)) != null && (obj = G.H) != null) {
                    if (obj instanceof TLRPC.User) {
                        j3 = ((TLRPC.User) obj).f28547id;
                    } else if (obj instanceof TLRPC.Chat) {
                        j3 = ((TLRPC.Chat) obj).f28398id;
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
                ArrayList arrayList = z90Var.f54473s;
                if (view != null && i7 >= 0 && i7 < arrayList.size()) {
                    u90 u90Var = (u90) arrayList.get(i7);
                    int i12 = u90Var.f56599a;
                    int i13 = u90Var.f52472e;
                    if (i12 != 3 && i12 != 4) {
                        if (i12 == 5 && u90Var.f52473f == 1) {
                            SharedPreferences g12 = org.telegram.messenger.np.g1();
                            boolean z10 = g12.getBoolean("view_animations", true);
                            SharedPreferences.Editor edit = g12.edit();
                            boolean z11 = !z10;
                            edit.putBoolean("view_animations", z11);
                            org.telegram.messenger.cz.C1 = Boolean.valueOf(z11);
                            edit.commit();
                            ((org.telegram.ui.Cells.n8) view).setChecked(z11);
                        }
                    } else {
                        boolean z12 = false;
                        if (org.telegram.messenger.qc.f()) {
                            z90Var.f54469e = org.telegram.ui.Components.lc.b0(z90Var).M(new org.telegram.ui.Components.s9(0.1f, org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Y5, false)), org.telegram.messenger.hd.N0(2131748676, null)).j();
                            return;
                        } else if (u90Var.f56599a == 3 && Integer.bitCount(i13) > 1 && (!org.telegram.messenger.hd.f24408a0 ? f10 < view.getMeasuredWidth() - org.telegram.messenger.g0.L(75.0f) : f10 > org.telegram.messenger.g0.L(75.0f)) && (Z = z90Var.Z(i13)) != -1) {
                            z90Var.f54471n[Z] = !zArr[Z];
                            z90Var.d0();
                            z90Var.c0();
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
                            org.telegram.messenger.qc.f26392i = i10;
                            org.telegram.messenger.qc.k();
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
        int i10 = this.f54587a;
        Object obj = this.f54588b;
        switch (i10) {
            case 5:
                ((bi.s2) obj).run();
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
                pb0Var.f50807a0.getConnectionsManager().sendRequest(tL_auth_resetLoginEmail, new gb0(pb0Var, bundle, tL_auth_resetLoginEmail, 1), 10);
                return;
            case 20:
                xb0 xb0Var = (xb0) obj;
                de0.t0(xb0Var.E, xb0Var.f53740s, xb0Var.f53741w, xb0Var.f53742x);
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
                ((bi.w4) obj).run();
                return;
            case 28:
                yh0 yh0Var = ((vh0) obj).f52815b;
                SparseArray sparseArray = yh0Var.J;
                ArrayList arrayList = new ArrayList();
                for (int i11 = 0; i11 < sparseArray.size(); i11++) {
                    wh0 wh0Var = (wh0) sparseArray.valueAt(i11);
                    TLRPC.Document document = wh0Var.f53405e;
                    if (document != null) {
                        arrayList.add(document);
                        yf.c cVar = yh0Var.getMediaDataController().A0;
                        TLRPC.Document document2 = wh0Var.f53405e;
                        ArrayList arrayList2 = cVar.f61203e;
                        if (document2 != null) {
                            if (!cVar.f61204f) {
                                cVar.f(true);
                                cVar.f61204f = true;
                            }
                            int i12 = 0;
                            while (true) {
                                if (i12 < arrayList2.size()) {
                                    if (((yf.b) arrayList2.get(i12)).f61195a != null && ((yf.b) arrayList2.get(i12)).f61195a.f28404id == document2.f28404id) {
                                        arrayList2.remove(i12);
                                    } else {
                                        i12++;
                                    }
                                }
                            }
                        }
                    }
                    if (wh0Var.f53407g != null && (eVar = (yf.e) yh0Var.getMediaDataController().f26775a0.get(wh0Var.f53407g)) != null) {
                        eVar.f61209c = true;
                        eVar.a();
                        int i13 = eVar.f61207a;
                        org.telegram.messenger.w7 G = org.telegram.messenger.w7.G(i13);
                        String str2 = eVar.f61208b;
                        G.b(str2, false);
                        org.telegram.messenger.si.d0(i13).l1(str2, null, true);
                    }
                    if (wh0Var == yh0Var.H) {
                        yh0Var.N = null;
                        yh0Var.H = (wh0) yh0Var.f54182b.get(0);
                        yh0Var.I = true;
                    }
                    yh0Var.f54181a.remove(wh0Var);
                    yh0Var.f54183c.remove(wh0Var);
                }
                yh0Var.getMediaDataController().A0.h();
                for (int i14 = 0; i14 < arrayList.size(); i14++) {
                    TLRPC.Document document3 = (TLRPC.Document) arrayList.get(i14);
                    TL_account.saveRingtone saveringtone = new TL_account.saveRingtone();
                    TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                    saveringtone.f28610id = tL_inputDocument;
                    tL_inputDocument.f28410id = document3.f28404id;
                    tL_inputDocument.access_hash = document3.access_hash;
                    byte[] bArr = document3.file_reference;
                    tL_inputDocument.file_reference = bArr;
                    if (bArr == null) {
                        tL_inputDocument.file_reference = new byte[0];
                    }
                    saveringtone.unsave = true;
                    yh0Var.getConnectionsManager().sendRequest(saveringtone, new fi.k5(9));
                }
                yh0.b0(yh0Var);
                yh0Var.i0();
                yh0Var.f54184e.f();
                t1Var.dismiss();
                return;
            default:
                PasscodeActivity passcodeActivity = (PasscodeActivity) obj;
                org.telegram.messenger.cz.f23403s = "";
                org.telegram.messenger.cz.f23417x = false;
                org.telegram.messenger.cz.y();
                passcodeActivity.getMediaDataController().o();
                int childCount = passcodeActivity.f43150c.getChildCount();
                int i15 = 0;
                while (true) {
                    if (i15 < childCount) {
                        View childAt = passcodeActivity.f43150c.getChildAt(i15);
                        if (childAt instanceof org.telegram.ui.Cells.x9) {
                            org.telegram.ui.ActionBar.t6.U(((org.telegram.ui.Cells.x9) childAt).getTextView(), org.telegram.ui.ActionBar.m6.E6, null);
                        } else {
                            i15++;
                        }
                    }
                }
                org.telegram.messenger.ls.e().k(50, new Object[0]);
                passcodeActivity.finishFragment();
                return;
        }
    }

    @Override
    public void j(KeyEvent keyEvent) {
        iy iyVar = (iy) this.f54588b;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && iyVar.f47050y.isShowing()) {
            iyVar.f47050y.d(true);
        }
    }

    @Override
    public void k(int i7) {
        DataAutoDownloadActivity dataAutoDownloadActivity = (DataAutoDownloadActivity) ((l4) this.f54588b).f49452e;
        org.telegram.messenger.z5 z5Var = (org.telegram.messenger.z5) dataAutoDownloadActivity.f43013c.get(i7);
        if (z5Var == dataAutoDownloadActivity.E) {
            dataAutoDownloadActivity.f43014e = 0;
        } else if (z5Var == dataAutoDownloadActivity.F) {
            dataAutoDownloadActivity.f43014e = 1;
        } else if (z5Var == dataAutoDownloadActivity.G) {
            dataAutoDownloadActivity.f43014e = 2;
        } else {
            dataAutoDownloadActivity.f43014e = 3;
        }
        int i10 = dataAutoDownloadActivity.f43015f;
        if (i10 == 0) {
            org.telegram.messenger.a6.q(DataAutoDownloadActivity.i0(dataAutoDownloadActivity)).Q = dataAutoDownloadActivity.f43014e;
        } else if (i10 == 1) {
            org.telegram.messenger.a6.q(DataAutoDownloadActivity.j0(dataAutoDownloadActivity)).R = dataAutoDownloadActivity.f43014e;
        } else {
            org.telegram.messenger.a6.q(DataAutoDownloadActivity.k0(dataAutoDownloadActivity)).S = dataAutoDownloadActivity.f43014e;
        }
        SharedPreferences.Editor edit = org.telegram.messenger.np.u1(DataAutoDownloadActivity.l0(dataAutoDownloadActivity)).h7.edit();
        edit.putInt(dataAutoDownloadActivity.L, dataAutoDownloadActivity.f43014e);
        edit.commit();
        org.telegram.messenger.a6.q(DataAutoDownloadActivity.m0(dataAutoDownloadActivity)).g();
        for (int i11 = 0; i11 < 4; i11++) {
            v4.e1 K = dataAutoDownloadActivity.f43012b.K(DataAutoDownloadActivity.n0(dataAutoDownloadActivity) + i11);
            if (K != null) {
                dataAutoDownloadActivity.f43011a.t(K, DataAutoDownloadActivity.n0(dataAutoDownloadActivity) + i11);
            }
        }
        dataAutoDownloadActivity.J = true;
    }

    @Override
    public void l(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        rx rxVar = (rx) this.f54588b;
        View view = (View) obj2;
        Integer num = (Integer) number;
        Float f10 = (Float) serializable;
        Float f11 = (Float) serializable2;
        if (((org.telegram.ui.Components.o41) obj).d == 1 && rxVar.f51814b != null) {
            boolean z10 = !rxVar.f51815c;
            rxVar.f51815c = z10;
            fi.b0 b0Var = rxVar.h;
            if (b0Var != null) {
                b0Var.a(Boolean.valueOf(z10), Boolean.valueOf(rxVar.d), Boolean.valueOf(rxVar.f51816e));
            }
            ((org.telegram.ui.Cells.s8) view).setChecked(rxVar.f51815c);
            rxVar.f51817f.f35742g3.O(true);
        }
    }

    @Override
    public void p(org.telegram.ui.Components.qc0 qc0Var) {
        ExternalActionActivity externalActionActivity = (ExternalActionActivity) this.f54588b;
        ArrayList arrayList = ExternalActionActivity.f43048y;
        org.telegram.messenger.cz.C = false;
        Intent intent = externalActionActivity.h;
        if (intent != null) {
            externalActionActivity.e(intent, externalActionActivity.f43054n, externalActionActivity.f43057w, true, externalActionActivity.f43055r, externalActionActivity.f43056s);
            externalActionActivity.h = null;
        }
        externalActionActivity.f43051c.f0();
        if (org.telegram.messenger.g0.Q1()) {
            externalActionActivity.d.f0();
        }
        org.telegram.messenger.ls.e().k(org.telegram.messenger.ls.f25318o0, qc0Var);
    }

    @Override
    public void r(int i7) {
        switch (this.f54587a) {
            case 13:
                x40 x40Var = (x40) this.f54588b;
                z40 z40Var = x40Var.J;
                z40Var.v0(x40Var.I);
                if (x40Var.h == null && !x40Var.f53524f.e() && x40Var.b() == 0) {
                    z40Var.f54391s.e(false, true);
                }
                x40Var.f();
                return;
            default:
                sh0 sh0Var = (sh0) this.f54588b;
                if (sh0Var.f52016f == null && !sh0Var.h.e()) {
                    sh0Var.f52017n.f43128c.c();
                }
                sh0Var.f();
                return;
        }
    }

    @Override
    public int run() {
        return ((FiltersSetupActivity) this.f54588b).f43068x;
    }

    @Override
    public void s0(View view, float f10, float f11) {
        int i7 = this.f54587a;
    }

    @Override
    public boolean v1(int i7) {
        switch (this.f54587a) {
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
