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
public final class zr implements gx, org.telegram.ui.Components.pj0, org.telegram.ui.Components.du0, org.telegram.ui.Components.gf0, org.telegram.ui.ActionBar.r1, org.telegram.messenger.xo, org.telegram.messenger.v10, org.telegram.ui.Components.nc0, org.telegram.ui.ActionBar.f1, org.telegram.ui.Components.lj0, jg.y1, org.telegram.ui.Components.qj0, r0.m, te.b, xg0 {
    public final int f54578a;
    public final Object f54579b;

    public zr(Object obj, int i7) {
        this.f54578a = i7;
        this.f54579b = obj;
    }

    @Override
    public void H(int i7, float f10, float f11, te.c cVar) {
        oe0 oe0Var = (oe0) this.f54579b;
        oe0Var.getClass();
        oe0Var.setScaleX(org.telegram.messenger.g0.T1(1.0f, 1.019f, f10));
        oe0Var.setScaleY(org.telegram.messenger.g0.T1(1.0f, 1.019f, f10));
    }

    @Override
    public a0.h K0() {
        switch (this.f54578a) {
            case 13:
                return null;
            default:
                return null;
        }
    }

    @Override
    public r0.l1 P0(View view, r0.l1 l1Var) {
        y80 y80Var = (y80) this.f54579b;
        i0.b I0 = org.telegram.messenger.g0.I0(l1Var, false);
        if (!y80Var.f54030a.equals(I0)) {
            y80Var.f54030a = I0;
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
        int i7 = this.f54578a;
    }

    @Override
    public void a(Canvas canvas) {
        ((Layout) this.f54579b).draw(canvas);
    }

    @Override
    public void b() {
        ContactsWidgetConfigActivity contactsWidgetConfigActivity = (ContactsWidgetConfigActivity) this.f54579b;
        int i7 = ContactsWidgetConfigActivity.G;
        Intent intent = new Intent();
        intent.putExtra("appWidgetId", contactsWidgetConfigActivity.F);
        contactsWidgetConfigActivity.setResult(-1, intent);
        contactsWidgetConfigActivity.finish();
    }

    @Override
    public boolean b1(View view) {
        switch (this.f54578a) {
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
        int i12 = this.f54578a;
        Object obj = this.f54579b;
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
                    final org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) og0Var.f50567y.get(i7 - og0Var.J);
                    final long B0 = org.telegram.messenger.fj.B0(fjVar.f23965k);
                    final boolean E = org.telegram.messenger.n5.E(B0);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, og0Var.getParentActivity(), og0Var.getResourceProvider());
                    if (fjVar.x4()) {
                        if (E) {
                            i10 = 2131747593;
                        } else {
                            i10 = 2131747618;
                        }
                        arrayList.add(org.telegram.messenger.gd.M0(i10, null));
                        if (E) {
                            i11 = 2131232268;
                        } else {
                            i11 = 2131232090;
                        }
                        arrayList3.add(Integer.valueOf(i11));
                    } else {
                        org.telegram.ui.Cells.c0.v(null, 2131743313, arrayList, 2131232257, arrayList3);
                    }
                    arrayList2.add(0);
                    CharSequence[] charSequenceArr = (CharSequence[]) arrayList.toArray(new CharSequence[arrayList2.size()]);
                    Typeface typeface = org.telegram.messenger.g0.f24090a;
                    int size = arrayList3.size();
                    int[] iArr = new int[size];
                    for (int i13 = 0; i13 < size; i13++) {
                        iArr[i13] = ((Integer) arrayList3.get(i13)).intValue();
                    }
                    DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() {
                        @Override
                        public final void onClick(DialogInterface dialogInterface, int i14) {
                            org.telegram.ui.ActionBar.h2 ua2;
                            org.telegram.messenger.fj fjVar2 = fjVar;
                            boolean x42 = fjVar2.x4();
                            org.telegram.ui.ActionBar.h2 h2Var = og0.this;
                            boolean z10 = E;
                            long j3 = B0;
                            if (x42) {
                                if (z10) {
                                    ua2 = ProfileActivity.D4(j3);
                                } else {
                                    ua2 = bn.ua(j3);
                                }
                                h2Var.presentFragment(ua2);
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
                            if (h2Var.getMessagesController().E(bundle, h2Var, null, null)) {
                                h2Var.presentFragment(new bn(bundle));
                            }
                        }
                    };
                    org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28744a;
                    u1Var.Q = charSequenceArr;
                    u1Var.R = iArr;
                    u1Var.N = onClickListener;
                    og0Var.showDialog(u1Var);
                }
                return false;
            default:
                yh0 yh0Var = (yh0) obj;
                yh0Var.getClass();
                if (view instanceof xh0) {
                    xh0 xh0Var = (xh0) view;
                    yh0Var.e0(xh0Var.f53835e);
                    xh0Var.performHapticFeedback(0);
                }
                return false;
        }
    }

    @Override
    public a0.h d1() {
        switch (this.f54578a) {
            case 13:
                return null;
            default:
                return null;
        }
    }

    @Override
    public boolean e(TLRPC.TL_error tL_error) {
        ((d3.e0) this.f54579b).run();
        return true;
    }

    @Override
    public void f(float f10, float f11, int i7, View view) {
        org.telegram.ui.Components.l41 G;
        Object obj;
        long j3;
        int i10;
        int Z;
        boolean[] zArr;
        int i11 = this.f54578a;
        Object obj2 = this.f54579b;
        switch (i11) {
            case 1:
                ws wsVar = (ws) obj2;
                HashSet hashSet = wsVar.X1;
                if (!wsVar.Y1 && (G = wsVar.Z1.G(i7 - 1)) != null && (obj = G.H) != null) {
                    if (obj instanceof TLRPC.User) {
                        j3 = ((TLRPC.User) obj).f28552id;
                    } else if (obj instanceof TLRPC.Chat) {
                        j3 = ((TLRPC.Chat) obj).f28403id;
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
                ArrayList arrayList = z90Var.f54462s;
                if (view != null && i7 >= 0 && i7 < arrayList.size()) {
                    u90 u90Var = (u90) arrayList.get(i7);
                    int i12 = u90Var.f56589a;
                    int i13 = u90Var.f52466e;
                    if (i12 != 3 && i12 != 4) {
                        if (i12 == 5 && u90Var.f52467f == 1) {
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
                            z90Var.f54458e = org.telegram.ui.Components.lc.b0(z90Var).M(new org.telegram.ui.Components.s9(0.1f, org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Y5, false)), org.telegram.messenger.gd.M0(2131748677, null)).j();
                            return;
                        } else if (u90Var.f56589a == 3 && Integer.bitCount(i13) > 1 && (!org.telegram.messenger.gd.f24213a0 ? f10 < view.getMeasuredWidth() - org.telegram.messenger.g0.L(75.0f) : f10 > org.telegram.messenger.g0.L(75.0f)) && (Z = z90Var.Z(i13)) != -1) {
                            z90Var.f54460n[Z] = !zArr[Z];
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
                            org.telegram.messenger.pc.f26219i = i10;
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
    public void h(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        yf.e eVar;
        int i10 = this.f54578a;
        Object obj = this.f54579b;
        switch (i10) {
            case 5:
                ((bi.m2) obj).run();
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
                pb0Var.f50789a0.getConnectionsManager().sendRequest(tL_auth_resetLoginEmail, new gb0(pb0Var, bundle, tL_auth_resetLoginEmail, 1), 10);
                return;
            case 20:
                xb0 xb0Var = (xb0) obj;
                ee0.t0(xb0Var.E, xb0Var.f53773s, xb0Var.f53774w, xb0Var.f53775x);
                return;
            case 21:
                qc0 qc0Var = (qc0) obj;
                ee0 ee0Var = qc0Var.H;
                ee0Var.F1(0, true);
                TL_account.deleteAccount deleteaccount = new TL_account.deleteAccount();
                deleteaccount.reason = "Forgot password";
                ConnectionsManager.getInstance(ee0.v0(ee0Var)).sendRequest(deleteaccount, new l(qc0Var, 12), 10);
                return;
            case 26:
                ((bi.p4) obj).run();
                return;
            case 28:
                yh0 yh0Var = ((vh0) obj).f52789b;
                SparseArray sparseArray = yh0Var.J;
                ArrayList arrayList = new ArrayList();
                for (int i11 = 0; i11 < sparseArray.size(); i11++) {
                    wh0 wh0Var = (wh0) sparseArray.valueAt(i11);
                    TLRPC.Document document = wh0Var.f53393e;
                    if (document != null) {
                        arrayList.add(document);
                        yf.c cVar = yh0Var.getMediaDataController().A0;
                        TLRPC.Document document2 = wh0Var.f53393e;
                        ArrayList arrayList2 = cVar.f61193e;
                        if (document2 != null) {
                            if (!cVar.f61194f) {
                                cVar.f(true);
                                cVar.f61194f = true;
                            }
                            int i12 = 0;
                            while (true) {
                                if (i12 < arrayList2.size()) {
                                    if (((yf.b) arrayList2.get(i12)).f61185a != null && ((yf.b) arrayList2.get(i12)).f61185a.f28409id == document2.f28409id) {
                                        arrayList2.remove(i12);
                                    } else {
                                        i12++;
                                    }
                                }
                            }
                        }
                    }
                    if (wh0Var.f53395g != null && (eVar = (yf.e) yh0Var.getMediaDataController().f26597a0.get(wh0Var.f53395g)) != null) {
                        eVar.f61199c = true;
                        eVar.a();
                        int i13 = eVar.f61197a;
                        org.telegram.messenger.w7 G = org.telegram.messenger.w7.G(i13);
                        String str2 = eVar.f61198b;
                        G.b(str2, false);
                        org.telegram.messenger.ri.d0(i13).l1(str2, null, true);
                    }
                    if (wh0Var == yh0Var.H) {
                        yh0Var.N = null;
                        yh0Var.H = (wh0) yh0Var.f54162b.get(0);
                        yh0Var.I = true;
                    }
                    yh0Var.f54161a.remove(wh0Var);
                    yh0Var.f54163c.remove(wh0Var);
                }
                yh0Var.getMediaDataController().A0.h();
                for (int i14 = 0; i14 < arrayList.size(); i14++) {
                    TLRPC.Document document3 = (TLRPC.Document) arrayList.get(i14);
                    TL_account.saveRingtone saveringtone = new TL_account.saveRingtone();
                    TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                    saveringtone.f28615id = tL_inputDocument;
                    tL_inputDocument.f28415id = document3.f28409id;
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
                yh0Var.f54164e.f();
                u1Var.dismiss();
                return;
            default:
                PasscodeActivity passcodeActivity = (PasscodeActivity) obj;
                org.telegram.messenger.bz.f23194s = "";
                org.telegram.messenger.bz.f23208x = false;
                org.telegram.messenger.bz.y();
                passcodeActivity.getMediaDataController().o();
                int childCount = passcodeActivity.f43140c.getChildCount();
                int i15 = 0;
                while (true) {
                    if (i15 < childCount) {
                        View childAt = passcodeActivity.f43140c.getChildAt(i15);
                        if (childAt instanceof org.telegram.ui.Cells.x9) {
                            org.telegram.ui.ActionBar.u6.U(((org.telegram.ui.Cells.x9) childAt).getTextView(), org.telegram.ui.ActionBar.n6.E6, null);
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
        iy iyVar = (iy) this.f54579b;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && iyVar.f47009y.isShowing()) {
            iyVar.f47009y.d(true);
        }
    }

    @Override
    public void k(int i7) {
        DataAutoDownloadActivity dataAutoDownloadActivity = (DataAutoDownloadActivity) ((l4) this.f54579b).f49432e;
        org.telegram.messenger.z5 z5Var = (org.telegram.messenger.z5) dataAutoDownloadActivity.f43003c.get(i7);
        if (z5Var == dataAutoDownloadActivity.E) {
            dataAutoDownloadActivity.f43004e = 0;
        } else if (z5Var == dataAutoDownloadActivity.F) {
            dataAutoDownloadActivity.f43004e = 1;
        } else if (z5Var == dataAutoDownloadActivity.G) {
            dataAutoDownloadActivity.f43004e = 2;
        } else {
            dataAutoDownloadActivity.f43004e = 3;
        }
        int i10 = dataAutoDownloadActivity.f43005f;
        if (i10 == 0) {
            org.telegram.messenger.a6.q(DataAutoDownloadActivity.i0(dataAutoDownloadActivity)).Q = dataAutoDownloadActivity.f43004e;
        } else if (i10 == 1) {
            org.telegram.messenger.a6.q(DataAutoDownloadActivity.j0(dataAutoDownloadActivity)).R = dataAutoDownloadActivity.f43004e;
        } else {
            org.telegram.messenger.a6.q(DataAutoDownloadActivity.k0(dataAutoDownloadActivity)).S = dataAutoDownloadActivity.f43004e;
        }
        SharedPreferences.Editor edit = org.telegram.messenger.mp.u1(DataAutoDownloadActivity.l0(dataAutoDownloadActivity)).h7.edit();
        edit.putInt(dataAutoDownloadActivity.L, dataAutoDownloadActivity.f43004e);
        edit.commit();
        org.telegram.messenger.a6.q(DataAutoDownloadActivity.m0(dataAutoDownloadActivity)).g();
        for (int i11 = 0; i11 < 4; i11++) {
            v4.f1 K = dataAutoDownloadActivity.f43002b.K(DataAutoDownloadActivity.n0(dataAutoDownloadActivity) + i11);
            if (K != null) {
                dataAutoDownloadActivity.f43001a.t(K, DataAutoDownloadActivity.n0(dataAutoDownloadActivity) + i11);
            }
        }
        dataAutoDownloadActivity.J = true;
    }

    @Override
    public void l(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        rx rxVar = (rx) this.f54579b;
        View view = (View) obj2;
        Integer num = (Integer) number;
        Float f10 = (Float) serializable;
        Float f11 = (Float) serializable2;
        if (((org.telegram.ui.Components.l41) obj).d == 1 && rxVar.f51801b != null) {
            boolean z10 = !rxVar.f51802c;
            rxVar.f51802c = z10;
            fi.b0 b0Var = rxVar.h;
            if (b0Var != null) {
                b0Var.a(Boolean.valueOf(z10), Boolean.valueOf(rxVar.d), Boolean.valueOf(rxVar.f51803e));
            }
            ((org.telegram.ui.Cells.s8) view).setChecked(rxVar.f51802c);
            rxVar.f51804f.f34607g3.O(true);
        }
    }

    @Override
    public void p(org.telegram.ui.Components.pc0 pc0Var) {
        ExternalActionActivity externalActionActivity = (ExternalActionActivity) this.f54579b;
        ArrayList arrayList = ExternalActionActivity.f43038y;
        org.telegram.messenger.bz.C = false;
        Intent intent = externalActionActivity.h;
        if (intent != null) {
            externalActionActivity.e(intent, externalActionActivity.f43044n, externalActionActivity.f43047w, true, externalActionActivity.f43045r, externalActionActivity.f43046s);
            externalActionActivity.h = null;
        }
        externalActionActivity.f43041c.f0();
        if (org.telegram.messenger.g0.Q1()) {
            externalActionActivity.d.f0();
        }
        org.telegram.messenger.ks.e().k(org.telegram.messenger.ks.f25160o0, pc0Var);
    }

    @Override
    public void r(int i7) {
        switch (this.f54578a) {
            case 13:
                x40 x40Var = (x40) this.f54579b;
                z40 z40Var = x40Var.J;
                z40Var.v0(x40Var.I);
                if (x40Var.h == null && !x40Var.f53557f.e() && x40Var.b() == 0) {
                    z40Var.f54380s.e(false, true);
                }
                x40Var.f();
                return;
            default:
                sh0 sh0Var = (sh0) this.f54579b;
                if (sh0Var.f51998f == null && !sh0Var.h.e()) {
                    sh0Var.f51999n.f43118c.c();
                }
                sh0Var.f();
                return;
        }
    }

    @Override
    public int run() {
        return ((FiltersSetupActivity) this.f54579b).f43058x;
    }

    @Override
    public void s0(View view, float f10, float f11) {
        int i7 = this.f54578a;
    }

    @Override
    public boolean v1(int i7) {
        switch (this.f54578a) {
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
