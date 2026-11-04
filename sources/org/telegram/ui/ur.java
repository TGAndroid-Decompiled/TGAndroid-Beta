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
public final class ur implements yw, org.telegram.ui.Components.gj0, org.telegram.ui.Components.tt0, org.telegram.ui.Components.ve0, org.telegram.ui.ActionBar.p1, org.telegram.messenger.so, org.telegram.messenger.s10, org.telegram.ui.Components.xb0, org.telegram.ui.ActionBar.d1, org.telegram.ui.Components.cj0, kg.u1, org.telegram.ui.Components.hj0, r0.m, ns, qe.b, mg0 {
    public final int f50176a;
    public final Object f50177b;

    public ur(Object obj, int i3) {
        this.f50176a = i3;
        this.f50177b = obj;
    }

    @Override
    public a0.h C0() {
        switch (this.f50176a) {
            case 13:
                return null;
            default:
                return null;
        }
    }

    @Override
    public boolean J1(int i3) {
        switch (this.f50176a) {
            case 13:
                return true;
            default:
                return true;
        }
    }

    @Override
    public r0.k1 R0(View view, r0.k1 k1Var) {
        g80 g80Var = (g80) this.f50177b;
        i0.b I0 = org.telegram.messenger.g0.I0(k1Var, false);
        if (!g80Var.f45600a.equals(I0)) {
            g80Var.f45600a = I0;
            g80Var.requestLayout();
        }
        int childCount = g80Var.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            r0.i0.b(g80Var.getChildAt(i3), k1Var);
        }
        return k1Var;
    }

    @Override
    public void Y(int i3, float f10, float f11, qe.c cVar) {
        ge0 ge0Var = (ge0) this.f50177b;
        ge0Var.getClass();
        ge0Var.setScaleX(org.telegram.messenger.g0.T1(1.0f, 1.019f, f10));
        ge0Var.setScaleY(org.telegram.messenger.g0.T1(1.0f, 1.019f, f10));
    }

    @Override
    public boolean a(TLRPC.TL_error tL_error) {
        ((c3.f0) this.f50177b).run();
        return true;
    }

    @Override
    public void b(float f10, float f11, int i3, View view) {
        org.telegram.ui.Components.r31 G;
        Object obj;
        long j10;
        int i10;
        int Z;
        boolean[] zArr;
        int i11 = this.f50176a;
        Object obj2 = this.f50177b;
        switch (i11) {
            case 1:
                qs qsVar = (qs) obj2;
                HashSet hashSet = qsVar.U1;
                if (!qsVar.V1 && (G = qsVar.W1.G(i3 - 1)) != null && (obj = G.G) != null) {
                    if (obj instanceof TLRPC.User) {
                        j10 = ((TLRPC.User) obj).f27150id;
                    } else if (obj instanceof TLRPC.Chat) {
                        j10 = ((TLRPC.Chat) obj).f27001id;
                    } else {
                        return;
                    }
                    if (hashSet.contains(Long.valueOf(j10))) {
                        hashSet.remove(Long.valueOf(j10));
                    } else {
                        hashSet.add(Long.valueOf(j10));
                    }
                    if (view instanceof bh.p) {
                        ((bh.p) view).c(hashSet.contains(Long.valueOf(j10)), true);
                        return;
                    }
                    return;
                }
                return;
            case 2:
                DataAutoDownloadActivity.b0((DataAutoDownloadActivity) obj2, view, i3, f10);
                return;
            default:
                t90 t90Var = (t90) obj2;
                ArrayList arrayList = t90Var.f49748s;
                if (view != null && i3 >= 0 && i3 < arrayList.size()) {
                    o90 o90Var = (o90) arrayList.get(i3);
                    int i12 = o90Var.f54715a;
                    int i13 = o90Var.f48238e;
                    if (i12 != 3 && i12 != 4) {
                        if (i12 == 5 && o90Var.f48239f == 1) {
                            SharedPreferences e12 = org.telegram.messenger.hp.e1();
                            boolean z10 = e12.getBoolean("view_animations", true);
                            SharedPreferences.Editor edit = e12.edit();
                            boolean z11 = !z10;
                            edit.putBoolean("view_animations", z11);
                            org.telegram.messenger.az.C1 = Boolean.valueOf(z11);
                            edit.commit();
                            ((org.telegram.ui.Cells.l8) view).setChecked(z11);
                        }
                    } else {
                        boolean z12 = false;
                        if (org.telegram.messenger.lc.f()) {
                            t90Var.f49744e = org.telegram.ui.Components.fc.a0(t90Var).M(new org.telegram.ui.Components.m9(0.1f, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Y5, false)), org.telegram.messenger.bd.M0(2131748877, null)).j();
                            return;
                        } else if (o90Var.f54715a == 3 && Integer.bitCount(i13) > 1 && (!org.telegram.messenger.bd.f21784a0 ? f10 < view.getMeasuredWidth() - org.telegram.messenger.g0.L(75.0f) : f10 > org.telegram.messenger.g0.L(75.0f)) && (Z = t90Var.Z(i13)) != -1) {
                            t90Var.f49746n[Z] = !zArr[Z];
                            t90Var.d0();
                            t90Var.c0();
                            return;
                        } else {
                            if ((org.telegram.messenger.lc.d(true) & i13) > 0) {
                                z12 = true;
                            }
                            int d = org.telegram.messenger.lc.d(true);
                            if (!z12) {
                                i10 = d | i13;
                            } else {
                                i10 = d & (~i13);
                            }
                            org.telegram.messenger.lc.f23968i = i10;
                            org.telegram.messenger.lc.k();
                            t90Var.d0();
                        }
                    }
                    pi.q.f();
                    return;
                }
                return;
        }
    }

    @Override
    public boolean b1(View view) {
        switch (this.f50176a) {
            case 1:
                return false;
            case 2:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void b2(ArrayList arrayList) {
        int i3 = this.f50176a;
    }

    @Override
    public void c(ks ksVar) {
        wd0 wd0Var = (wd0) this.f50177b;
        wd0Var.L = true;
        String str = ksVar.f47006c;
        wd0Var.f50782a.setText(str);
        wd0Var.s(str, ksVar);
        wd0Var.G = ksVar;
        wd0Var.F = 0;
        wd0Var.L = false;
        SharedPreferences.Editor edit = org.telegram.messenger.hp.e1().edit();
        edit.putString("phone_code_last_matched_" + ksVar.f47006c, ksVar.d).apply();
        org.telegram.messenger.g0.i3(new nd0(wd0Var, 4), 300L);
        ud0 ud0Var = wd0Var.f50784b;
        ud0Var.requestFocus();
        ud0Var.setSelection(ud0Var.length());
    }

    @Override
    public void d(Canvas canvas) {
        ((Layout) this.f50177b).draw(canvas);
    }

    @Override
    public boolean f(int i3, View view) {
        int i10;
        int i11;
        int i12 = this.f50176a;
        Object obj = this.f50177b;
        switch (i12) {
            case 15:
                return LanguageSelectActivity.a0((LanguageSelectActivity) obj, view, i3);
            case 24:
                final dg0 dg0Var = (dg0) obj;
                if (i3 >= dg0Var.J && i3 < dg0Var.K) {
                    try {
                        view.performHapticFeedback(0, 2);
                    } catch (Exception unused) {
                    }
                    final org.telegram.messenger.zi ziVar = (org.telegram.messenger.zi) dg0Var.f44707y.get(i3 - dg0Var.J);
                    final long B0 = org.telegram.messenger.zi.B0(ziVar.f26868k);
                    final boolean E = org.telegram.messenger.m5.E(B0);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, dg0Var.getParentActivity(), dg0Var.getResourceProvider());
                    if (ziVar.y4()) {
                        if (E) {
                            i10 = 2131747794;
                        } else {
                            i10 = 2131747819;
                        }
                        arrayList.add(org.telegram.messenger.bd.M0(i10, null));
                        if (E) {
                            i11 = 2131232266;
                        } else {
                            i11 = 2131232088;
                        }
                        arrayList3.add(Integer.valueOf(i11));
                    } else {
                        org.telegram.ui.Cells.f1.x(null, 2131743560, arrayList, 2131232255, arrayList3);
                    }
                    arrayList2.add(0);
                    CharSequence[] charSequenceArr = (CharSequence[]) arrayList.toArray(new CharSequence[arrayList2.size()]);
                    Typeface typeface = org.telegram.messenger.g0.f22580a;
                    int size = arrayList3.size();
                    int[] iArr = new int[size];
                    for (int i13 = 0; i13 < size; i13++) {
                        iArr[i13] = ((Integer) arrayList3.get(i13)).intValue();
                    }
                    DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() {
                        @Override
                        public final void onClick(DialogInterface dialogInterface, int i14) {
                            org.telegram.ui.ActionBar.d2 ra2;
                            org.telegram.messenger.zi ziVar2 = ziVar;
                            boolean y42 = ziVar2.y4();
                            org.telegram.ui.ActionBar.d2 d2Var = dg0.this;
                            boolean z10 = E;
                            long j10 = B0;
                            if (y42) {
                                if (z10) {
                                    ra2 = ProfileActivity.A4(j10);
                                } else {
                                    ra2 = wm.ra(j10);
                                }
                                d2Var.presentFragment(ra2);
                                return;
                            }
                            Bundle bundle = new Bundle();
                            if (z10) {
                                bundle.putLong("user_id", j10);
                            } else {
                                bundle.putLong("chat_id", -j10);
                            }
                            bundle.putInt("message_id", ziVar2.f1());
                            bundle.putBoolean("need_remove_previous_same_chat_activity", false);
                            if (d2Var.getMessagesController().E(bundle, d2Var, null, null)) {
                                d2Var.presentFragment(new wm(bundle));
                            }
                        }
                    };
                    org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
                    s1Var.Q = charSequenceArr;
                    s1Var.R = iArr;
                    s1Var.N = onClickListener;
                    dg0Var.showDialog(s1Var);
                }
                return false;
            default:
                ph0 ph0Var = (ph0) obj;
                ph0Var.getClass();
                if (view instanceof oh0) {
                    oh0 oh0Var = (oh0) view;
                    ph0Var.e0(oh0Var.f48296e);
                    oh0Var.performHapticFeedback(0);
                }
                return false;
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        zf.d dVar;
        int i10 = this.f50176a;
        Object obj = this.f50177b;
        switch (i10) {
            case 5:
                ((ai.r1) obj).run();
                return;
            case 14:
                ((a50) obj).Z(true);
                return;
            case 16:
                String str = LaunchActivity.E1;
                org.telegram.messenger.g0.g((StringBuilder) obj);
                return;
            case 19:
                lb0 lb0Var = (lb0) obj;
                Bundle bundle = new Bundle();
                bundle.putString("phone", lb0Var.J);
                bundle.putString("ephone", lb0Var.K);
                bundle.putString("phoneFormated", lb0Var.M);
                TLRPC.TL_auth_resetLoginEmail tL_auth_resetLoginEmail = new TLRPC.TL_auth_resetLoginEmail();
                tL_auth_resetLoginEmail.phone_number = lb0Var.M;
                tL_auth_resetLoginEmail.phone_code_hash = lb0Var.N;
                lb0Var.f47284a0.getConnectionsManager().sendRequest(tL_auth_resetLoginEmail, new bb0(lb0Var, bundle, tL_auth_resetLoginEmail, 1), 10);
                return;
            case 20:
                vb0 vb0Var = (vb0) obj;
                xd0.s0(vb0Var.E, vb0Var.f50448s, vb0Var.f50449w, vb0Var.f50450x);
                return;
            case 21:
                oc0 oc0Var = (oc0) obj;
                xd0 xd0Var = oc0Var.H;
                xd0Var.w1(0, true);
                TL_account.deleteAccount deleteaccount = new TL_account.deleteAccount();
                deleteaccount.reason = "Forgot password";
                ConnectionsManager.getInstance(xd0.u0(xd0Var)).sendRequest(deleteaccount, new l(oc0Var, 13), 10);
                return;
            case 27:
                ((org.telegram.messenger.kw) obj).run();
                return;
            default:
                ph0 ph0Var = ((mh0) obj).f47675b;
                SparseArray sparseArray = ph0Var.J;
                ArrayList arrayList = new ArrayList();
                for (int i11 = 0; i11 < sparseArray.size(); i11++) {
                    nh0 nh0Var = (nh0) sparseArray.valueAt(i11);
                    TLRPC.Document document = nh0Var.f48006e;
                    if (document != null) {
                        arrayList.add(document);
                        zf.c cVar = ph0Var.getMediaDataController().A0;
                        TLRPC.Document document2 = nh0Var.f48006e;
                        ArrayList arrayList2 = cVar.f60456e;
                        if (document2 != null) {
                            if (!cVar.f60457f) {
                                cVar.f(true);
                                cVar.f60457f = true;
                            }
                            int i12 = 0;
                            while (true) {
                                if (i12 < arrayList2.size()) {
                                    if (((zf.b) arrayList2.get(i12)).f60448a != null && ((zf.b) arrayList2.get(i12)).f60448a.f27007id == document2.f27007id) {
                                        arrayList2.remove(i12);
                                    } else {
                                        i12++;
                                    }
                                }
                            }
                        }
                    }
                    if (nh0Var.f48008g != null && (dVar = (zf.d) ph0Var.getMediaDataController().f24009a0.get(nh0Var.f48008g)) != null) {
                        dVar.f60460c = true;
                        dVar.a();
                        int i13 = dVar.f60458a;
                        org.telegram.messenger.w7 G = org.telegram.messenger.w7.G(i13);
                        String str2 = dVar.f60459b;
                        G.b(str2, false);
                        org.telegram.messenger.li.b0(i13).i1(str2, null, true);
                    }
                    if (nh0Var == ph0Var.H) {
                        ph0Var.N = null;
                        ph0Var.H = (nh0) ph0Var.f48579b.get(0);
                        ph0Var.I = true;
                    }
                    ph0Var.f48578a.remove(nh0Var);
                    ph0Var.f48580c.remove(nh0Var);
                }
                ph0Var.getMediaDataController().A0.h();
                for (int i14 = 0; i14 < arrayList.size(); i14++) {
                    TLRPC.Document document3 = (TLRPC.Document) arrayList.get(i14);
                    TL_account.saveRingtone saveringtone = new TL_account.saveRingtone();
                    TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                    saveringtone.f27213id = tL_inputDocument;
                    tL_inputDocument.f27013id = document3.f27007id;
                    tL_inputDocument.access_hash = document3.access_hash;
                    byte[] bArr = document3.file_reference;
                    tL_inputDocument.file_reference = bArr;
                    if (bArr == null) {
                        tL_inputDocument.file_reference = new byte[0];
                    }
                    saveringtone.unsave = true;
                    ph0Var.getConnectionsManager().sendRequest(saveringtone, new ei.u5(9));
                }
                ph0.b0(ph0Var);
                ph0Var.i0();
                ph0Var.f48581e.f();
                s1Var.dismiss();
                return;
        }
    }

    @Override
    public void j(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        kx kxVar = (kx) this.f50177b;
        View view = (View) obj2;
        Integer num = (Integer) number;
        Float f10 = (Float) serializable;
        Float f11 = (Float) serializable2;
        if (((org.telegram.ui.Components.r31) obj).d == 1 && kxVar.f47044b != null) {
            boolean z10 = !kxVar.f47045c;
            kxVar.f47045c = z10;
            ei.d0 d0Var = kxVar.h;
            if (d0Var != null) {
                d0Var.a(Boolean.valueOf(z10), Boolean.valueOf(kxVar.d), Boolean.valueOf(kxVar.f47046e));
            }
            ((org.telegram.ui.Cells.q8) view).setChecked(kxVar.f47045c);
            kxVar.f47047f.f35594g3.O(true);
        }
    }

    @Override
    public void k(KeyEvent keyEvent) {
        zx zxVar = (zx) this.f50177b;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && zxVar.f50346y.isShowing()) {
            zxVar.f50346y.d(true);
        }
    }

    @Override
    public a0.h k1() {
        switch (this.f50176a) {
            case 13:
                return null;
            default:
                return null;
        }
    }

    @Override
    public void l(int i3) {
        DataAutoDownloadActivity dataAutoDownloadActivity = (DataAutoDownloadActivity) ((n4) this.f50177b).f47865e;
        org.telegram.messenger.y5 y5Var = (org.telegram.messenger.y5) dataAutoDownloadActivity.f41234c.get(i3);
        if (y5Var == dataAutoDownloadActivity.E) {
            dataAutoDownloadActivity.f41235e = 0;
        } else if (y5Var == dataAutoDownloadActivity.F) {
            dataAutoDownloadActivity.f41235e = 1;
        } else if (y5Var == dataAutoDownloadActivity.G) {
            dataAutoDownloadActivity.f41235e = 2;
        } else {
            dataAutoDownloadActivity.f41235e = 3;
        }
        int i10 = dataAutoDownloadActivity.f41236f;
        if (i10 == 0) {
            org.telegram.messenger.z5.q(DataAutoDownloadActivity.i0(dataAutoDownloadActivity)).Q = dataAutoDownloadActivity.f41235e;
        } else if (i10 == 1) {
            org.telegram.messenger.z5.q(DataAutoDownloadActivity.j0(dataAutoDownloadActivity)).R = dataAutoDownloadActivity.f41235e;
        } else {
            org.telegram.messenger.z5.q(DataAutoDownloadActivity.k0(dataAutoDownloadActivity)).S = dataAutoDownloadActivity.f41235e;
        }
        SharedPreferences.Editor edit = org.telegram.messenger.hp.s1(DataAutoDownloadActivity.l0(dataAutoDownloadActivity)).f22999e7.edit();
        edit.putInt(dataAutoDownloadActivity.L, dataAutoDownloadActivity.f41235e);
        edit.commit();
        org.telegram.messenger.z5.q(DataAutoDownloadActivity.m0(dataAutoDownloadActivity)).g();
        for (int i11 = 0; i11 < 4; i11++) {
            u4.d1 K = dataAutoDownloadActivity.f41233b.K(DataAutoDownloadActivity.n0(dataAutoDownloadActivity) + i11);
            if (K != null) {
                dataAutoDownloadActivity.f41232a.t(K, DataAutoDownloadActivity.n0(dataAutoDownloadActivity) + i11);
            }
        }
        dataAutoDownloadActivity.J = true;
    }

    @Override
    public void n() {
        ContactsWidgetConfigActivity contactsWidgetConfigActivity = (ContactsWidgetConfigActivity) this.f50177b;
        int i3 = ContactsWidgetConfigActivity.G;
        Intent intent = new Intent();
        intent.putExtra("appWidgetId", contactsWidgetConfigActivity.F);
        contactsWidgetConfigActivity.setResult(-1, intent);
        contactsWidgetConfigActivity.finish();
    }

    @Override
    public void q(org.telegram.ui.Components.zb0 zb0Var) {
        ExternalActionActivity externalActionActivity = (ExternalActionActivity) this.f50177b;
        ArrayList arrayList = ExternalActionActivity.f41254y;
        org.telegram.messenger.az.C = false;
        Intent intent = externalActionActivity.h;
        if (intent != null) {
            externalActionActivity.d(intent, externalActionActivity.f41260n, externalActionActivity.f41263w, true, externalActionActivity.f41261r, externalActionActivity.f41262s);
            externalActionActivity.h = null;
        }
        externalActionActivity.f41257c.f0();
        if (org.telegram.messenger.g0.Q1()) {
            externalActionActivity.d.f0();
        }
        org.telegram.messenger.hs.e().k(org.telegram.messenger.hs.f23274o0, zb0Var);
    }

    @Override
    public void r(int i3) {
        switch (this.f50176a) {
            case 13:
                p40 p40Var = (p40) this.f50177b;
                r40 r40Var = p40Var.J;
                r40Var.v0(p40Var.I);
                if (p40Var.h == null && !p40Var.f48456f.e() && p40Var.b() == 0) {
                    r40Var.f49055s.e(false, true);
                }
                p40Var.f();
                return;
            default:
                jh0 jh0Var = (jh0) this.f50177b;
                if (jh0Var.f46624f == null && !jh0Var.h.e()) {
                    jh0Var.f46625n.f41334c.c();
                }
                jh0Var.f();
                return;
        }
    }

    @Override
    public void r0(View view, float f10, float f11) {
        int i3 = this.f50176a;
    }

    @Override
    public int run() {
        return ((FiltersSetupActivity) this.f50177b).f41274x;
    }

    private final void m(ArrayList arrayList) {
    }

    private final void o(ArrayList arrayList) {
    }

    @Override
    public void p() {
    }

    @Override
    public void F(float f10, int i3) {
    }

    private final void e(View view, float f10, float f11) {
    }

    private final void h(View view, float f10, float f11) {
    }

    private final void i(View view, float f10, float f11) {
    }
}
