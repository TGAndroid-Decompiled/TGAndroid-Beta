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
public final class zr implements dx, org.telegram.ui.Components.cj0, org.telegram.ui.Components.vt0, org.telegram.ui.Components.te0, org.telegram.ui.ActionBar.r1, org.telegram.messenger.bp, org.telegram.messenger.a20, org.telegram.ui.Components.cc0, org.telegram.ui.ActionBar.e1, org.telegram.ui.Components.yi0, jg.y1, org.telegram.ui.Components.dj0, r0.m, te.b, vg0 {
    public final int f52520a;
    public final Object f52521b;

    public zr(Object obj, int i7) {
        this.f52520a = i7;
        this.f52521b = obj;
    }

    @Override
    public r0.k1 S0(View view, r0.k1 k1Var) {
        y80 y80Var = (y80) this.f52521b;
        i0.b I0 = org.telegram.messenger.g0.I0(k1Var, false);
        if (!y80Var.f51961a.equals(I0)) {
            y80Var.f51961a = I0;
            y80Var.requestLayout();
        }
        int childCount = y80Var.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            r0.i0.b(y80Var.getChildAt(i7), k1Var);
        }
        return k1Var;
    }

    @Override
    public a0.h X0() {
        switch (this.f52520a) {
            case 13:
                return null;
            default:
                return null;
        }
    }

    @Override
    public void Y(int i7, float f10, float f11, te.c cVar) {
        oe0 oe0Var = (oe0) this.f52521b;
        oe0Var.getClass();
        oe0Var.setScaleX(org.telegram.messenger.g0.T1(1.0f, 1.019f, f10));
        oe0Var.setScaleY(org.telegram.messenger.g0.T1(1.0f, 1.019f, f10));
    }

    @Override
    public boolean a(TLRPC.TL_error tL_error) {
        ((bi.h4) this.f52521b).run();
        return true;
    }

    @Override
    public void b() {
        ContactsWidgetConfigActivity contactsWidgetConfigActivity = (ContactsWidgetConfigActivity) this.f52521b;
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
        int i12 = this.f52520a;
        Object obj = this.f52521b;
        switch (i12) {
            case 15:
                return LanguageSelectActivity.a0((LanguageSelectActivity) obj, view, i7);
            case 23:
                final mg0 mg0Var = (mg0) obj;
                if (i7 >= mg0Var.I && i7 < mg0Var.J) {
                    try {
                        view.performHapticFeedback(0, 2);
                    } catch (Exception unused) {
                    }
                    final org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) mg0Var.f47968y.get(i7 - mg0Var.I);
                    final long B0 = org.telegram.messenger.ij.B0(ijVar.f23266k);
                    final boolean E = org.telegram.messenger.m5.E(B0);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, mg0Var.getParentActivity(), mg0Var.getResourceProvider());
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
                    Typeface typeface = org.telegram.messenger.g0.f22539a;
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
                            org.telegram.ui.ActionBar.f2 f2Var = mg0.this;
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
                    org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27300a;
                    u1Var.P = charSequenceArr;
                    u1Var.Q = iArr;
                    u1Var.M = onClickListener;
                    mg0Var.showDialog(u1Var);
                }
                return false;
            default:
                vh0 vh0Var = (vh0) obj;
                vh0Var.getClass();
                if (view instanceof uh0) {
                    uh0 uh0Var = (uh0) view;
                    vh0Var.e0(uh0Var.f50506e);
                    uh0Var.performHapticFeedback(0);
                }
                return false;
        }
    }

    @Override
    public void d(Canvas canvas) {
        ((Layout) this.f52521b).draw(canvas);
    }

    @Override
    public void f(float f10, float f11, int i7, View view) {
        org.telegram.ui.Components.x31 G;
        Object obj;
        long j3;
        int i10;
        int Z;
        boolean[] zArr;
        int i11 = this.f52520a;
        Object obj2 = this.f52521b;
        switch (i11) {
            case 1:
                vs vsVar = (vs) obj2;
                HashSet hashSet = vsVar.W1;
                if (!vsVar.X1 && (G = vsVar.Y1.G(i7 - 1)) != null && (obj = G.G) != null) {
                    if (obj instanceof TLRPC.User) {
                        j3 = ((TLRPC.User) obj).f27109id;
                    } else if (obj instanceof TLRPC.Chat) {
                        j3 = ((TLRPC.Chat) obj).f26960id;
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
                ArrayList arrayList = z90Var.f52341s;
                if (view != null && i7 >= 0 && i7 < arrayList.size()) {
                    u90 u90Var = (u90) arrayList.get(i7);
                    int i12 = u90Var.f54543a;
                    int i13 = u90Var.f50438e;
                    if (i12 != 3 && i12 != 4) {
                        if (i12 == 5 && u90Var.f50439f == 1) {
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
                            z90Var.f52337e = org.telegram.ui.Components.gc.a0(z90Var).M(new org.telegram.ui.Components.m9(0.1f, org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Y5, false)), org.telegram.messenger.id.M0(2131748869, null)).j();
                            return;
                        } else if (u90Var.f54543a == 3 && Integer.bitCount(i13) > 1 && (!org.telegram.messenger.id.f23161a0 ? f10 < view.getMeasuredWidth() - org.telegram.messenger.g0.L(75.0f) : f10 > org.telegram.messenger.g0.L(75.0f)) && (Z = z90Var.Z(i13)) != -1) {
                            z90Var.f52339n[Z] = !zArr[Z];
                            z90Var.d0();
                            z90Var.c0();
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
                            org.telegram.messenger.sc.f25453i = i10;
                            org.telegram.messenger.sc.k();
                            z90Var.d0();
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
        switch (this.f52520a) {
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
        int i10 = this.f52520a;
        Object obj = this.f52521b;
        switch (i10) {
            case 5:
                ((bi.d3) obj).run();
                return;
            case 14:
                ((i50) obj).Z(true);
                return;
            case 16:
                String str = LaunchActivity.B1;
                org.telegram.messenger.g0.g((StringBuilder) obj);
                return;
            case 19:
                rb0 rb0Var = (rb0) obj;
                Bundle bundle = new Bundle();
                bundle.putString("phone", rb0Var.I);
                bundle.putString("ephone", rb0Var.J);
                bundle.putString("phoneFormated", rb0Var.L);
                TLRPC.TL_auth_resetLoginEmail tL_auth_resetLoginEmail = new TLRPC.TL_auth_resetLoginEmail();
                tL_auth_resetLoginEmail.phone_number = rb0Var.L;
                tL_auth_resetLoginEmail.phone_code_hash = rb0Var.M;
                rb0Var.W.getConnectionsManager().sendRequest(tL_auth_resetLoginEmail, new ib0(rb0Var, bundle, tL_auth_resetLoginEmail, 1), 10);
                return;
            case 20:
                ac0 ac0Var = (ac0) obj;
                fe0.t0(ac0Var.D, ac0Var.f43641s, ac0Var.f43642w, ac0Var.f43643x);
                return;
            case 21:
                uc0 uc0Var = (uc0) obj;
                fe0 fe0Var = uc0Var.G;
                fe0Var.F1(0, true);
                TL_account.deleteAccount deleteaccount = new TL_account.deleteAccount();
                deleteaccount.reason = "Forgot password";
                ConnectionsManager.getInstance(fe0.v0(fe0Var)).sendRequest(deleteaccount, new l(uc0Var, 12), 10);
                return;
            case 26:
                ((org.telegram.messenger.rw) obj).run();
                return;
            case 28:
                vh0 vh0Var = ((sh0) obj).f49855b;
                SparseArray sparseArray = vh0Var.I;
                ArrayList arrayList = new ArrayList();
                for (int i11 = 0; i11 < sparseArray.size(); i11++) {
                    th0 th0Var = (th0) sparseArray.valueAt(i11);
                    TLRPC.Document document = th0Var.f50284e;
                    if (document != null) {
                        arrayList.add(document);
                        yf.d dVar = vh0Var.getMediaDataController().f25861z0;
                        TLRPC.Document document2 = th0Var.f50284e;
                        ArrayList arrayList2 = dVar.f59423e;
                        if (document2 != null) {
                            if (!dVar.f59424f) {
                                dVar.f(true);
                                dVar.f59424f = true;
                            }
                            int i12 = 0;
                            while (true) {
                                if (i12 < arrayList2.size()) {
                                    if (((yf.c) arrayList2.get(i12)).f59415a != null && ((yf.c) arrayList2.get(i12)).f59415a.f26966id == document2.f26966id) {
                                        arrayList2.remove(i12);
                                    } else {
                                        i12++;
                                    }
                                }
                            }
                        }
                    }
                    if (th0Var.f50286g != null && (eVar = (yf.e) vh0Var.getMediaDataController().Z.get(th0Var.f50286g)) != null) {
                        eVar.f59427c = true;
                        eVar.a();
                        int i13 = eVar.f59425a;
                        org.telegram.messenger.w7 G = org.telegram.messenger.w7.G(i13);
                        String str2 = eVar.f59426b;
                        G.b(str2, false);
                        org.telegram.messenger.ui.b0(i13).i1(str2, null, true);
                    }
                    if (th0Var == vh0Var.G) {
                        vh0Var.M = null;
                        vh0Var.G = (th0) vh0Var.f50728b.get(0);
                        vh0Var.H = true;
                    }
                    vh0Var.f50727a.remove(th0Var);
                    vh0Var.f50729c.remove(th0Var);
                }
                vh0Var.getMediaDataController().f25861z0.h();
                for (int i14 = 0; i14 < arrayList.size(); i14++) {
                    TLRPC.Document document3 = (TLRPC.Document) arrayList.get(i14);
                    TL_account.saveRingtone saveringtone = new TL_account.saveRingtone();
                    TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                    saveringtone.f27172id = tL_inputDocument;
                    tL_inputDocument.f26972id = document3.f26966id;
                    tL_inputDocument.access_hash = document3.access_hash;
                    byte[] bArr = document3.file_reference;
                    tL_inputDocument.file_reference = bArr;
                    if (bArr == null) {
                        tL_inputDocument.file_reference = new byte[0];
                    }
                    saveringtone.unsave = true;
                    vh0Var.getConnectionsManager().sendRequest(saveringtone, new di.v5(9));
                }
                vh0.b0(vh0Var);
                vh0Var.i0();
                vh0Var.f50730e.f();
                u1Var.dismiss();
                return;
            default:
                PasscodeActivity passcodeActivity = (PasscodeActivity) obj;
                org.telegram.messenger.iz.f23438s = "";
                org.telegram.messenger.iz.f23452x = false;
                org.telegram.messenger.iz.y();
                passcodeActivity.getMediaDataController().m();
                int childCount = passcodeActivity.f41325c.getChildCount();
                int i15 = 0;
                while (true) {
                    if (i15 < childCount) {
                        View childAt = passcodeActivity.f41325c.getChildAt(i15);
                        if (childAt instanceof org.telegram.ui.Cells.w9) {
                            org.telegram.ui.ActionBar.t6.U(((org.telegram.ui.Cells.w9) childAt).getTextView(), org.telegram.ui.ActionBar.m6.E6, null);
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
        qx qxVar = (qx) this.f52521b;
        View view = (View) obj2;
        Integer num = (Integer) number;
        Float f10 = (Float) serializable;
        Float f11 = (Float) serializable2;
        if (((org.telegram.ui.Components.x31) obj).d == 1 && qxVar.f49170b != null) {
            boolean z9 = !qxVar.f49171c;
            qxVar.f49171c = z9;
            di.b0 b0Var = qxVar.h;
            if (b0Var != null) {
                b0Var.a(Boolean.valueOf(z9), Boolean.valueOf(qxVar.d), Boolean.valueOf(qxVar.f49172e));
            }
            ((org.telegram.ui.Cells.r8) view).setChecked(qxVar.f49171c);
            qxVar.f49173f.f37496f3.O(true);
        }
    }

    @Override
    public void j(KeyEvent keyEvent) {
        hy hyVar = (hy) this.f52521b;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && hyVar.f44842y.isShowing()) {
            hyVar.f44842y.d(true);
        }
    }

    @Override
    public boolean k1(int i7) {
        switch (this.f52520a) {
            case 13:
                return true;
            default:
                return true;
        }
    }

    @Override
    public void m(int i7) {
        DataAutoDownloadActivity dataAutoDownloadActivity = (DataAutoDownloadActivity) ((l4) this.f52521b).f47512e;
        org.telegram.messenger.y5 y5Var = (org.telegram.messenger.y5) dataAutoDownloadActivity.f41203c.get(i7);
        if (y5Var == dataAutoDownloadActivity.D) {
            dataAutoDownloadActivity.f41204e = 0;
        } else if (y5Var == dataAutoDownloadActivity.E) {
            dataAutoDownloadActivity.f41204e = 1;
        } else if (y5Var == dataAutoDownloadActivity.F) {
            dataAutoDownloadActivity.f41204e = 2;
        } else {
            dataAutoDownloadActivity.f41204e = 3;
        }
        int i10 = dataAutoDownloadActivity.f41205f;
        if (i10 == 0) {
            org.telegram.messenger.z5.q(DataAutoDownloadActivity.i0(dataAutoDownloadActivity)).P = dataAutoDownloadActivity.f41204e;
        } else if (i10 == 1) {
            org.telegram.messenger.z5.q(DataAutoDownloadActivity.j0(dataAutoDownloadActivity)).Q = dataAutoDownloadActivity.f41204e;
        } else {
            org.telegram.messenger.z5.q(DataAutoDownloadActivity.k0(dataAutoDownloadActivity)).R = dataAutoDownloadActivity.f41204e;
        }
        SharedPreferences.Editor edit = org.telegram.messenger.qp.s1(DataAutoDownloadActivity.l0(dataAutoDownloadActivity)).f24778e7.edit();
        edit.putInt(dataAutoDownloadActivity.K, dataAutoDownloadActivity.f41204e);
        edit.commit();
        org.telegram.messenger.z5.q(DataAutoDownloadActivity.m0(dataAutoDownloadActivity)).g();
        for (int i11 = 0; i11 < 4; i11++) {
            v4.d1 K = dataAutoDownloadActivity.f41202b.K(DataAutoDownloadActivity.n0(dataAutoDownloadActivity) + i11);
            if (K != null) {
                dataAutoDownloadActivity.f41201a.t(K, DataAutoDownloadActivity.n0(dataAutoDownloadActivity) + i11);
            }
        }
        dataAutoDownloadActivity.I = true;
    }

    @Override
    public void m1(ArrayList arrayList) {
        int i7 = this.f52520a;
    }

    @Override
    public void p(org.telegram.ui.Components.ec0 ec0Var) {
        ExternalActionActivity externalActionActivity = (ExternalActionActivity) this.f52521b;
        ArrayList arrayList = ExternalActionActivity.f41223y;
        org.telegram.messenger.iz.C = false;
        Intent intent = externalActionActivity.h;
        if (intent != null) {
            externalActionActivity.d(intent, externalActionActivity.f41229n, externalActionActivity.f41232w, true, externalActionActivity.f41230r, externalActionActivity.f41231s);
            externalActionActivity.h = null;
        }
        externalActionActivity.f41226c.f0();
        if (org.telegram.messenger.g0.Q1()) {
            externalActionActivity.d.f0();
        }
        org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.f25050o0, ec0Var);
    }

    @Override
    public void q(int i7) {
        switch (this.f52520a) {
            case 13:
                x40 x40Var = (x40) this.f52521b;
                z40 z40Var = x40Var.I;
                z40Var.v0(x40Var.H);
                if (x40Var.h == null && !x40Var.f51513f.e() && x40Var.b() == 0) {
                    z40Var.f52234s.e(false, true);
                }
                x40Var.f();
                return;
            default:
                ph0 ph0Var = (ph0) this.f52521b;
                if (ph0Var.f48772f == null && !ph0Var.h.e()) {
                    ph0Var.f48773n.f41303c.c();
                }
                ph0Var.f();
                return;
        }
    }

    @Override
    public void r0(View view, float f10, float f11) {
        int i7 = this.f52520a;
    }

    @Override
    public int run() {
        return ((FiltersSetupActivity) this.f52521b).f41243x;
    }

    @Override
    public a0.h v0() {
        switch (this.f52520a) {
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
