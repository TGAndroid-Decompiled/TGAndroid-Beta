package org.telegram.ui;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class y01 extends org.telegram.ui.ActionBar.k {
    public final int f43675a;
    public final Object f43676b;

    public y01(Object obj, int i10) {
        this.f43675a = i10;
        this.f43676b = obj;
    }

    @Override
    public final void b(int i10) {
        int i11;
        String str;
        org.telegram.messenger.jj jjVar;
        int i12 = this.f43675a;
        Object obj = this.f43676b;
        switch (i12) {
            case 0:
                if (i10 == -1) {
                    ((SecretMediaViewer) obj).e(true, false);
                    return;
                }
                return;
            case 1:
                if (i10 == -1) {
                    ((SessionsActivity) obj).finishFragment();
                    return;
                }
                return;
            case 2:
                e51 e51Var = (e51) obj;
                if (i10 == -1) {
                    if (e51Var.N) {
                        Bundle bundle = new Bundle();
                        bundle.putLong("user_id", e51Var.getUserConfig().e());
                        bundle.putBoolean("immediate", true);
                        e51Var.presentFragment(new qh.i0(bundle));
                        return;
                    }
                    e51Var.finishFragment();
                    return;
                } else if (i10 == 2) {
                    e51Var.j0(new org.telegram.ui.ActionBar.k2(null));
                    return;
                } else {
                    return;
                }
            case 3:
                if (i10 == -1) {
                    ((u61) obj).finishFragment();
                    return;
                }
                return;
            case 4:
                StickersActivity stickersActivity = (StickersActivity) obj;
                if (i10 == -1) {
                    if (stickersActivity.onBackPressed(true)) {
                        stickersActivity.finishFragment();
                        return;
                    }
                    return;
                }
                StickersActivity.h0(stickersActivity, i10);
                return;
            case 5:
                p91 p91Var = (p91) obj;
                if (i10 == -1) {
                    p91Var.finishFragment();
                    return;
                } else if (i10 == 1) {
                    p91.c0(p91Var);
                    return;
                } else {
                    return;
                }
            case 6:
                if (i10 == -1) {
                    ((ea1) obj).finishFragment();
                    return;
                }
                return;
            case 7:
                if (i10 == -1) {
                    ((vb1) obj).finishFragment();
                    return;
                }
                return;
            case 8:
                if (i10 == -1) {
                    TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) obj;
                    if (twoStepVerificationActivity.X >= 0) {
                        twoStepVerificationActivity.B0();
                        return;
                    } else {
                        twoStepVerificationActivity.finishFragment();
                        return;
                    }
                }
                return;
            case 9:
                UserInfoActivity userInfoActivity = (UserInfoActivity) obj;
                if (i10 == -1) {
                    if (userInfoActivity.onBackPressed(true)) {
                        userInfoActivity.finishFragment();
                        return;
                    }
                    return;
                } else if (i10 == 1) {
                    userInfoActivity.g0(true);
                    return;
                } else {
                    return;
                }
            case 10:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) obj;
                if (i10 == -1) {
                    usersSelectActivity.finishFragment();
                    return;
                } else if (i10 == 1) {
                    usersSelectActivity.b0();
                    return;
                } else {
                    return;
                }
            case 11:
                org.telegram.ui.Wallet.r9 r9Var = (org.telegram.ui.Wallet.r9) obj;
                if (i10 == -1) {
                    r9Var.finishFragment();
                    return;
                } else if (i10 == 2) {
                    Activity parentActivity = r9Var.getParentActivity();
                    i11 = ((org.telegram.ui.ActionBar.k2) r9Var).currentAccount;
                    org.telegram.ui.Wallet.b6.I0(i11, parentActivity, r9Var.getResourceProvider());
                    return;
                } else if (i10 == 3) {
                    r9Var.t0();
                    return;
                } else {
                    return;
                }
            case 12:
                org.telegram.ui.web.m mVar = (org.telegram.ui.web.m) obj;
                HashSet hashSet = mVar.f43133y;
                if (i10 == -1) {
                    if (org.telegram.ui.web.m.d0(mVar).u()) {
                        org.telegram.ui.web.m.e0(mVar).t();
                        hashSet.clear();
                        org.telegram.messenger.i0.d0(mVar.f29837a, new ag.z0(24));
                        return;
                    }
                    mVar.finishFragment();
                    return;
                } else if (i10 == 2131296494) {
                    HashSet hashSet2 = new HashSet();
                    ArrayList arrayList = new ArrayList();
                    HashSet hashSet3 = new HashSet();
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        int intValue = ((Integer) it.next()).intValue();
                        ArrayList arrayList2 = mVar.e.f43048a;
                        int size = arrayList2.size();
                        int i13 = 0;
                        while (true) {
                            if (i13 < size) {
                                Object obj2 = arrayList2.get(i13);
                                i13++;
                                jjVar = (org.telegram.messenger.jj) obj2;
                                if (jjVar == null || jjVar.f1() != intValue) {
                                }
                            } else {
                                jjVar = null;
                            }
                        }
                        org.telegram.ui.web.h hVar = mVar.f43127f;
                        if (hVar != null && jjVar == null) {
                            ArrayList arrayList3 = hVar.f43048a;
                            int size2 = arrayList3.size();
                            int i14 = 0;
                            while (true) {
                                if (i14 < size2) {
                                    Object obj3 = arrayList3.get(i14);
                                    i14++;
                                    org.telegram.messenger.jj jjVar2 = (org.telegram.messenger.jj) obj3;
                                    if (jjVar2 != null && jjVar2.f1() == intValue) {
                                        jjVar = jjVar2;
                                    }
                                }
                            }
                        }
                        if (jjVar != null) {
                            arrayList.add(jjVar);
                            hashSet3.add(Integer.valueOf(jjVar.f1()));
                            hashSet2.add(org.telegram.ui.web.j.a(jjVar));
                        }
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, mVar.getParentActivity(), mVar.getResourceProvider());
                    String G = org.telegram.messenger.cd.G(hashSet3.size(), "DeleteOptionsTitle", new Object[0]);
                    org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
                    x1Var.R = G;
                    if (hashSet3.size() == 1) {
                        str = "AreYouSureUnsaveSingleMessage";
                    } else {
                        str = "AreYouSureUnsaveFewMessages";
                    }
                    x1Var.T = org.telegram.messenger.cd.M0(str);
                    alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131751599, null), new ep0(28, mVar, hashSet3));
                    alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
                    alertDialog$Builder.d(-1);
                    alertDialog$Builder.p();
                    return;
                } else if (i10 == 2131296498) {
                    mVar.h0();
                    return;
                } else {
                    return;
                }
            case 13:
                org.telegram.ui.web.b1 b1Var = (org.telegram.ui.web.b1) obj;
                if (i10 == -1) {
                    if (org.telegram.ui.web.b1.c0(b1Var).u()) {
                        org.telegram.ui.web.b1.d0(b1Var).t();
                        b1Var.f42999w.clear();
                        org.telegram.messenger.i0.d0(b1Var.f29837a, new ag.z0(25));
                        return;
                    }
                    b1Var.finishFragment();
                    return;
                }
                return;
            case 14:
                if (i10 == -1) {
                    ((ph.r3) obj).finishFragment();
                    return;
                }
                return;
            case 15:
                if (i10 == -1) {
                    ((rh.i) obj).finishFragment();
                    return;
                }
                return;
            case 16:
                sg.o oVar = (sg.o) obj;
                if (i10 == -1 && !oVar.c0(true)) {
                    oVar.finishFragment();
                    return;
                }
                return;
            case 17:
                vh.k2 k2Var = (vh.k2) obj;
                if (i10 == -1) {
                    Runnable runnable = k2Var.V;
                    if (runnable != null) {
                        runnable.run();
                        return;
                    }
                    return;
                } else if (i10 >= 10) {
                    k2Var.e((org.telegram.messenger.we) k2Var.f51390g0.get(i10 - 10), false);
                    return;
                } else {
                    return;
                }
            case 18:
                if (i10 == -1) {
                    ((xh.o) obj).finishFragment();
                    return;
                }
                return;
            case 19:
                if (i10 == -1) {
                    ((xh.r3) obj).finishFragment();
                    return;
                }
                return;
            case 20:
                if (i10 == -1) {
                    ((yh.e) obj).finishFragment();
                    return;
                }
                return;
            case 21:
                if (i10 == -1) {
                    ((yh.l) obj).finishFragment();
                    return;
                }
                return;
            case 22:
                if (i10 == -1) {
                    ((yh.q) obj).finishFragment();
                    return;
                }
                return;
            case 23:
                yh.a0 a0Var = ((yh.v) obj).f54533n;
                if (i10 == -1) {
                    if (a0Var.E1) {
                        a0Var.dismiss();
                        return;
                    }
                    a0Var.f54449r1.d.f30819f3.O(false);
                    a0Var.f54443k1.E(0);
                    return;
                } else if (i10 == 3) {
                    a0Var.f54442j1.a(true, true);
                    a0Var.u0(false);
                    a0Var.J1 = null;
                    a0Var.f54455x1.f30819f3.O(true);
                    a0Var.f54453v1.f26588r.getText().clear();
                    a0Var.f54453v1.f26588r.requestFocus();
                    org.telegram.messenger.i0.J3(a0Var.f54453v1.f26588r);
                    return;
                } else {
                    return;
                }
            case 24:
                yh.a0 a0Var2 = ((yh.w) obj).f54535r;
                if (i10 == 2) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putLong("community_id", a0Var2.l1);
                    a0Var2.f54448q1.presentFragment(new yh.l(bundle2));
                    a0Var2.dismiss();
                    return;
                } else if (i10 == 3) {
                    a0Var2.f54441i1.a(true, true);
                    a0Var2.u0(false);
                    TextUtils.isEmpty(a0Var2.I1);
                    a0Var2.I1 = null;
                    a0Var2.f54454w1.h(0L, a0Var2.l1, 0L, 0L, null, false, null, true);
                    a0Var2.f54452u1.f26588r.getText().clear();
                    a0Var2.f54452u1.f26588r.requestFocus();
                    org.telegram.messenger.i0.J3(a0Var2.f54452u1.f26588r);
                    return;
                } else {
                    return;
                }
            default:
                yh.a0 a0Var3 = ((yh.v) obj).f54533n;
                if (i10 == -1) {
                    a0Var3.f54449r1.d.f30819f3.O(false);
                    a0Var3.f54443k1.E(0);
                    return;
                }
                return;
        }
    }
}
