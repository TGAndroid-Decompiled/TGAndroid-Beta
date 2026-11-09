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
public final class yr implements cx, org.telegram.ui.Components.dj0, org.telegram.ui.Components.wt0, org.telegram.ui.Components.ue0, org.telegram.ui.ActionBar.r1, org.telegram.messenger.bp, org.telegram.messenger.a20, org.telegram.ui.Components.dc0, org.telegram.ui.ActionBar.e1, org.telegram.ui.Components.zi0, jg.y1, org.telegram.ui.Components.ej0, r0.m, te.b, ug0 {
    public final int f52176a;
    public final Object f52177b;

    public yr(Object obj, int i7) {
        this.f52176a = i7;
        this.f52177b = obj;
    }

    @Override
    public r0.k1 S0(View view, r0.k1 k1Var) {
        x80 x80Var = (x80) this.f52177b;
        i0.b I0 = org.telegram.messenger.g0.I0(k1Var, false);
        if (!x80Var.f51591a.equals(I0)) {
            x80Var.f51591a = I0;
            x80Var.requestLayout();
        }
        int childCount = x80Var.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            r0.i0.b(x80Var.getChildAt(i7), k1Var);
        }
        return k1Var;
    }

    @Override
    public a0.h X0() {
        switch (this.f52176a) {
            case 13:
                return null;
            default:
                return null;
        }
    }

    @Override
    public void Y(int i7, float f10, float f11, te.c cVar) {
        ne0 ne0Var = (ne0) this.f52177b;
        ne0Var.getClass();
        ne0Var.setScaleX(org.telegram.messenger.g0.T1(1.0f, 1.019f, f10));
        ne0Var.setScaleY(org.telegram.messenger.g0.T1(1.0f, 1.019f, f10));
    }

    @Override
    public boolean a(TLRPC.TL_error tL_error) {
        ((bi.h4) this.f52177b).run();
        return true;
    }

    @Override
    public void b() {
        ContactsWidgetConfigActivity contactsWidgetConfigActivity = (ContactsWidgetConfigActivity) this.f52177b;
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
        int i12 = this.f52176a;
        Object obj = this.f52177b;
        switch (i12) {
            case 15:
                return LanguageSelectActivity.a0((LanguageSelectActivity) obj, view, i7);
            case 23:
                final lg0 lg0Var = (lg0) obj;
                if (i7 >= lg0Var.I && i7 < lg0Var.J) {
                    try {
                        view.performHapticFeedback(0, 2);
                    } catch (Exception unused) {
                    }
                    final org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) lg0Var.f47616y.get(i7 - lg0Var.I);
                    final long B0 = org.telegram.messenger.ij.B0(ijVar.f23262k);
                    final boolean E = org.telegram.messenger.m5.E(B0);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, lg0Var.getParentActivity(), lg0Var.getResourceProvider());
                    if (ijVar.x4()) {
                        if (E) {
                            i10 = 2131747786;
                        } else {
                            i10 = 2131747811;
                        }
                        arrayList.add(org.telegram.messenger.id.M0(i10, null));
                        if (E) {
                            i11 = 2131232266;
                        } else {
                            i11 = 2131232088;
                        }
                        arrayList3.add(Integer.valueOf(i11));
                    } else {
                        org.telegram.ui.Cells.f1.t(null, 2131743550, arrayList, 2131232255, arrayList3);
                    }
                    arrayList2.add(0);
                    CharSequence[] charSequenceArr = (CharSequence[]) arrayList.toArray(new CharSequence[arrayList2.size()]);
                    Typeface typeface = org.telegram.messenger.g0.f22535a;
                    int size = arrayList3.size();
                    int[] iArr = new int[size];
                    for (int i13 = 0; i13 < size; i13++) {
                        iArr[i13] = ((Integer) arrayList3.get(i13)).intValue();
                    }
                    DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() {
                        @Override
                        public final void onClick(DialogInterface dialogInterface, int i14) {
                            org.telegram.ui.ActionBar.f2 ta2;
                            org.telegram.messenger.ij ijVar2 = ijVar;
                            boolean x42 = ijVar2.x4();
                            org.telegram.ui.ActionBar.f2 f2Var = lg0.this;
                            boolean z9 = E;
                            long j3 = B0;
                            if (x42) {
                                if (z9) {
                                    ta2 = ProfileActivity.D4(j3);
                                } else {
                                    ta2 = cn.ta(j3);
                                }
                                f2Var.presentFragment(ta2);
                                return;
                            }
                            Bundle bundle = new Bundle();
                            if (z9) {
                                bundle.putLong("user_id", j3);
                            } else {
                                bundle.putLong("chat_id", -j3);
                            }
                            bundle.putInt("message_id", ijVar2.e1());
                            bundle.putBoolean("need_remove_previous_same_chat_activity", false);
                            if (f2Var.getMessagesController().E(bundle, f2Var, null, null)) {
                                f2Var.presentFragment(new cn(bundle));
                            }
                        }
                    };
                    org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27296a;
                    u1Var.P = charSequenceArr;
                    u1Var.Q = iArr;
                    u1Var.M = onClickListener;
                    lg0Var.showDialog(u1Var);
                }
                return false;
            default:
                uh0 uh0Var = (uh0) obj;
                uh0Var.getClass();
                if (view instanceof th0) {
                    th0 th0Var = (th0) view;
                    uh0Var.e0(th0Var.f50187e);
                    th0Var.performHapticFeedback(0);
                }
                return false;
        }
    }

    @Override
    public void d(Canvas canvas) {
        ((Layout) this.f52177b).draw(canvas);
    }

    @Override
    public void f(float f10, float f11, int i7, View view) {
        org.telegram.ui.Components.y31 G;
        Object obj;
        long j3;
        int i10;
        int Z;
        boolean[] zArr;
        int i11 = this.f52176a;
        Object obj2 = this.f52177b;
        switch (i11) {
            case 1:
                us usVar = (us) obj2;
                HashSet hashSet = usVar.T1;
                if (!usVar.U1 && (G = usVar.V1.G(i7 - 1)) != null && (obj = G.G) != null) {
                    if (obj instanceof TLRPC.User) {
                        j3 = ((TLRPC.User) obj).f27105id;
                    } else if (obj instanceof TLRPC.Chat) {
                        j3 = ((TLRPC.Chat) obj).f26956id;
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
                ArrayList arrayList = y90Var.f52011s;
                if (view != null && i7 >= 0 && i7 < arrayList.size()) {
                    t90 t90Var = (t90) arrayList.get(i7);
                    int i12 = t90Var.f54544a;
                    int i13 = t90Var.f50130e;
                    if (i12 != 3 && i12 != 4) {
                        if (i12 == 5 && t90Var.f50131f == 1) {
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
                        if (org.telegram.messenger.sc.f()) {
                            y90Var.f52007e = org.telegram.ui.Components.hc.a0(y90Var).M(new org.telegram.ui.Components.n9(0.1f, org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.Y5, false)), org.telegram.messenger.id.M0(2131748869, null)).j();
                            return;
                        } else if (t90Var.f54544a == 3 && Integer.bitCount(i13) > 1 && (!org.telegram.messenger.id.f23157a0 ? f10 < view.getMeasuredWidth() - org.telegram.messenger.g0.L(75.0f) : f10 > org.telegram.messenger.g0.L(75.0f)) && (Z = y90Var.Z(i13)) != -1) {
                            y90Var.f52009n[Z] = !zArr[Z];
                            y90Var.d0();
                            y90Var.c0();
                            return;
                        } else {
                            if ((org.telegram.messenger.sc.d(true) & i13) > 0) {
                                z11 = true;
                            }
                            int d = org.telegram.messenger.sc.d(true);
                            if (!z11) {
                                i10 = d | i13;
                            } else {
                                i10 = d & (~i13);
                            }
                            org.telegram.messenger.sc.f25449i = i10;
                            org.telegram.messenger.sc.k();
                            y90Var.d0();
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
        switch (this.f52176a) {
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
        yf.e eVar;
        int i10 = this.f52176a;
        Object obj = this.f52177b;
        switch (i10) {
            case 5:
                ((bi.d3) obj).run();
                return;
            case 14:
                ((h50) obj).Z(true);
                return;
            case 16:
                String str = LaunchActivity.B1;
                org.telegram.messenger.g0.g((StringBuilder) obj);
                return;
            case 19:
                qb0 qb0Var = (qb0) obj;
                Bundle bundle = new Bundle();
                bundle.putString("phone", qb0Var.I);
                bundle.putString("ephone", qb0Var.J);
                bundle.putString("phoneFormated", qb0Var.L);
                TLRPC.TL_auth_resetLoginEmail tL_auth_resetLoginEmail = new TLRPC.TL_auth_resetLoginEmail();
                tL_auth_resetLoginEmail.phone_number = qb0Var.L;
                tL_auth_resetLoginEmail.phone_code_hash = qb0Var.M;
                qb0Var.W.getConnectionsManager().sendRequest(tL_auth_resetLoginEmail, new hb0(qb0Var, bundle, tL_auth_resetLoginEmail, 1), 10);
                return;
            case 20:
                zb0 zb0Var = (zb0) obj;
                ee0.t0(zb0Var.D, zb0Var.f52491s, zb0Var.f52492w, zb0Var.f52493x);
                return;
            case 21:
                sc0 sc0Var = (sc0) obj;
                ee0 ee0Var = sc0Var.G;
                ee0Var.F1(0, true);
                TL_account.deleteAccount deleteaccount = new TL_account.deleteAccount();
                deleteaccount.reason = "Forgot password";
                ConnectionsManager.getInstance(ee0.v0(ee0Var)).sendRequest(deleteaccount, new l(sc0Var, 12), 10);
                return;
            case 26:
                ((org.telegram.messenger.rw) obj).run();
                return;
            case 28:
                uh0 uh0Var = ((rh0) obj).f49487b;
                SparseArray sparseArray = uh0Var.I;
                ArrayList arrayList = new ArrayList();
                for (int i11 = 0; i11 < sparseArray.size(); i11++) {
                    sh0 sh0Var = (sh0) sparseArray.valueAt(i11);
                    TLRPC.Document document = sh0Var.f49916e;
                    if (document != null) {
                        arrayList.add(document);
                        yf.d dVar = uh0Var.getMediaDataController().f25857z0;
                        TLRPC.Document document2 = sh0Var.f49916e;
                        ArrayList arrayList2 = dVar.f59425e;
                        if (document2 != null) {
                            if (!dVar.f59426f) {
                                dVar.f(true);
                                dVar.f59426f = true;
                            }
                            int i12 = 0;
                            while (true) {
                                if (i12 < arrayList2.size()) {
                                    if (((yf.c) arrayList2.get(i12)).f59417a != null && ((yf.c) arrayList2.get(i12)).f59417a.f26962id == document2.f26962id) {
                                        arrayList2.remove(i12);
                                    } else {
                                        i12++;
                                    }
                                }
                            }
                        }
                    }
                    if (sh0Var.f49918g != null && (eVar = (yf.e) uh0Var.getMediaDataController().Z.get(sh0Var.f49918g)) != null) {
                        eVar.f59429c = true;
                        eVar.a();
                        int i13 = eVar.f59427a;
                        org.telegram.messenger.w7 G = org.telegram.messenger.w7.G(i13);
                        String str2 = eVar.f59428b;
                        G.b(str2, false);
                        org.telegram.messenger.ui.b0(i13).i1(str2, null, true);
                    }
                    if (sh0Var == uh0Var.G) {
                        uh0Var.M = null;
                        uh0Var.G = (sh0) uh0Var.f50402b.get(0);
                        uh0Var.H = true;
                    }
                    uh0Var.f50401a.remove(sh0Var);
                    uh0Var.f50403c.remove(sh0Var);
                }
                uh0Var.getMediaDataController().f25857z0.h();
                for (int i14 = 0; i14 < arrayList.size(); i14++) {
                    TLRPC.Document document3 = (TLRPC.Document) arrayList.get(i14);
                    TL_account.saveRingtone saveringtone = new TL_account.saveRingtone();
                    TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                    saveringtone.f27168id = tL_inputDocument;
                    tL_inputDocument.f26968id = document3.f26962id;
                    tL_inputDocument.access_hash = document3.access_hash;
                    byte[] bArr = document3.file_reference;
                    tL_inputDocument.file_reference = bArr;
                    if (bArr == null) {
                        tL_inputDocument.file_reference = new byte[0];
                    }
                    saveringtone.unsave = true;
                    uh0Var.getConnectionsManager().sendRequest(saveringtone, new di.v5(9));
                }
                uh0.b0(uh0Var);
                uh0Var.i0();
                uh0Var.f50404e.f();
                u1Var.dismiss();
                return;
            default:
                PasscodeActivity passcodeActivity = (PasscodeActivity) obj;
                org.telegram.messenger.iz.f23434s = "";
                org.telegram.messenger.iz.f23448x = false;
                org.telegram.messenger.iz.y();
                passcodeActivity.getMediaDataController().m();
                int childCount = passcodeActivity.f41334c.getChildCount();
                int i15 = 0;
                while (true) {
                    if (i15 < childCount) {
                        View childAt = passcodeActivity.f41334c.getChildAt(i15);
                        if (childAt instanceof org.telegram.ui.Cells.w9) {
                            org.telegram.ui.ActionBar.s6.U(((org.telegram.ui.Cells.w9) childAt).getTextView(), org.telegram.ui.ActionBar.l6.E6, null);
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
        px pxVar = (px) this.f52177b;
        View view = (View) obj2;
        Integer num = (Integer) number;
        Float f10 = (Float) serializable;
        Float f11 = (Float) serializable2;
        if (((org.telegram.ui.Components.y31) obj).d == 1 && pxVar.f48825b != null) {
            boolean z9 = !pxVar.f48826c;
            pxVar.f48826c = z9;
            di.b0 b0Var = pxVar.h;
            if (b0Var != null) {
                b0Var.a(Boolean.valueOf(z9), Boolean.valueOf(pxVar.d), Boolean.valueOf(pxVar.f48827e));
            }
            ((org.telegram.ui.Cells.r8) view).setChecked(pxVar.f48826c);
            pxVar.f48828f.f37556f3.O(true);
        }
    }

    @Override
    public void j(KeyEvent keyEvent) {
        gy gyVar = (gy) this.f52177b;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && gyVar.f43826y.isShowing()) {
            gyVar.f43826y.d(true);
        }
    }

    @Override
    public boolean k1(int i7) {
        switch (this.f52176a) {
            case 13:
                return true;
            default:
                return true;
        }
    }

    @Override
    public void m(int i7) {
        DataAutoDownloadActivity dataAutoDownloadActivity = (DataAutoDownloadActivity) ((l4) this.f52177b).f47458e;
        org.telegram.messenger.y5 y5Var = (org.telegram.messenger.y5) dataAutoDownloadActivity.f41212c.get(i7);
        if (y5Var == dataAutoDownloadActivity.D) {
            dataAutoDownloadActivity.f41213e = 0;
        } else if (y5Var == dataAutoDownloadActivity.E) {
            dataAutoDownloadActivity.f41213e = 1;
        } else if (y5Var == dataAutoDownloadActivity.F) {
            dataAutoDownloadActivity.f41213e = 2;
        } else {
            dataAutoDownloadActivity.f41213e = 3;
        }
        int i10 = dataAutoDownloadActivity.f41214f;
        if (i10 == 0) {
            org.telegram.messenger.z5.q(DataAutoDownloadActivity.i0(dataAutoDownloadActivity)).P = dataAutoDownloadActivity.f41213e;
        } else if (i10 == 1) {
            org.telegram.messenger.z5.q(DataAutoDownloadActivity.j0(dataAutoDownloadActivity)).Q = dataAutoDownloadActivity.f41213e;
        } else {
            org.telegram.messenger.z5.q(DataAutoDownloadActivity.k0(dataAutoDownloadActivity)).R = dataAutoDownloadActivity.f41213e;
        }
        SharedPreferences.Editor edit = org.telegram.messenger.qp.s1(DataAutoDownloadActivity.l0(dataAutoDownloadActivity)).f24774e7.edit();
        edit.putInt(dataAutoDownloadActivity.K, dataAutoDownloadActivity.f41213e);
        edit.commit();
        org.telegram.messenger.z5.q(DataAutoDownloadActivity.m0(dataAutoDownloadActivity)).g();
        for (int i11 = 0; i11 < 4; i11++) {
            v4.d1 K = dataAutoDownloadActivity.f41211b.K(DataAutoDownloadActivity.n0(dataAutoDownloadActivity) + i11);
            if (K != null) {
                dataAutoDownloadActivity.f41210a.t(K, DataAutoDownloadActivity.n0(dataAutoDownloadActivity) + i11);
            }
        }
        dataAutoDownloadActivity.I = true;
    }

    @Override
    public void m1(ArrayList arrayList) {
        int i7 = this.f52176a;
    }

    @Override
    public void p(org.telegram.ui.Components.fc0 fc0Var) {
        ExternalActionActivity externalActionActivity = (ExternalActionActivity) this.f52177b;
        ArrayList arrayList = ExternalActionActivity.f41232y;
        org.telegram.messenger.iz.C = false;
        Intent intent = externalActionActivity.h;
        if (intent != null) {
            externalActionActivity.d(intent, externalActionActivity.f41238n, externalActionActivity.f41241w, true, externalActionActivity.f41239r, externalActionActivity.f41240s);
            externalActionActivity.h = null;
        }
        externalActionActivity.f41235c.f0();
        if (org.telegram.messenger.g0.Q1()) {
            externalActionActivity.d.f0();
        }
        org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.f25046o0, fc0Var);
    }

    @Override
    public void q(int i7) {
        switch (this.f52176a) {
            case 13:
                w40 w40Var = (w40) this.f52177b;
                y40 y40Var = w40Var.I;
                y40Var.v0(w40Var.H);
                if (w40Var.h == null && !w40Var.f50859f.e() && w40Var.b() == 0) {
                    y40Var.f51879s.e(false, true);
                }
                w40Var.f();
                return;
            default:
                oh0 oh0Var = (oh0) this.f52177b;
                if (oh0Var.f48451f == null && !oh0Var.h.e()) {
                    oh0Var.f48452n.f41312c.c();
                }
                oh0Var.f();
                return;
        }
    }

    @Override
    public void r0(View view, float f10, float f11) {
        int i7 = this.f52176a;
    }

    @Override
    public int run() {
        return ((FiltersSetupActivity) this.f52177b).f41252x;
    }

    @Override
    public a0.h v0() {
        switch (this.f52176a) {
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
