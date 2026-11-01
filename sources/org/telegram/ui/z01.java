package org.telegram.ui;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class z01 extends org.telegram.ui.ActionBar.k {
    public final int f43771a;
    public final Object f43772b;

    public z01(Object obj, int i10) {
        this.f43771a = i10;
        this.f43772b = obj;
    }

    @Override
    public final void b(int i10) {
        int i11;
        String str;
        org.telegram.messenger.kj kjVar;
        int i12 = this.f43771a;
        Object obj = this.f43772b;
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
                c51 c51Var = (c51) obj;
                if (i10 == -1) {
                    if (c51Var.N) {
                        Bundle bundle = new Bundle();
                        bundle.putLong("user_id", c51Var.getUserConfig().e());
                        bundle.putBoolean("immediate", true);
                        c51Var.presentFragment(new qh.i0(bundle));
                        return;
                    }
                    c51Var.finishFragment();
                    return;
                } else if (i10 == 2) {
                    c51Var.k0(new org.telegram.ui.ActionBar.k2(null));
                    return;
                } else {
                    return;
                }
            case 3:
                if (i10 == -1) {
                    ((s61) obj).finishFragment();
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
                StickersActivity.i0(stickersActivity, i10);
                return;
            case 5:
                n91 n91Var = (n91) obj;
                if (i10 == -1) {
                    n91Var.finishFragment();
                    return;
                } else if (i10 == 1) {
                    n91.d0(n91Var);
                    return;
                } else {
                    return;
                }
            case 6:
                if (i10 == -1) {
                    ((ca1) obj).finishFragment();
                    return;
                }
                return;
            case 7:
                if (i10 == -1) {
                    ((tb1) obj).finishFragment();
                    return;
                }
                return;
            case 8:
                if (i10 == -1) {
                    TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) obj;
                    if (twoStepVerificationActivity.X >= 0) {
                        twoStepVerificationActivity.C0();
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
                    userInfoActivity.h0(true);
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
                    usersSelectActivity.c0();
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
                    org.telegram.ui.Wallet.b6.J0(i11, parentActivity, r9Var.getResourceProvider());
                    return;
                } else if (i10 == 3) {
                    r9Var.u0();
                    return;
                } else {
                    return;
                }
            case 12:
                org.telegram.ui.web.m mVar = (org.telegram.ui.web.m) obj;
                HashSet hashSet = mVar.f42935y;
                if (i10 == -1) {
                    if (org.telegram.ui.web.m.e0(mVar).u()) {
                        org.telegram.ui.web.m.f0(mVar).t();
                        hashSet.clear();
                        org.telegram.messenger.i0.d0(mVar.f30217a, new ag.z0(24));
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
                        ArrayList arrayList2 = mVar.e.f42850a;
                        int size = arrayList2.size();
                        int i13 = 0;
                        while (true) {
                            if (i13 < size) {
                                Object obj2 = arrayList2.get(i13);
                                i13++;
                                kjVar = (org.telegram.messenger.kj) obj2;
                                if (kjVar == null || kjVar.f1() != intValue) {
                                }
                            } else {
                                kjVar = null;
                            }
                        }
                        org.telegram.ui.web.h hVar = mVar.f42929f;
                        if (hVar != null && kjVar == null) {
                            ArrayList arrayList3 = hVar.f42850a;
                            int size2 = arrayList3.size();
                            int i14 = 0;
                            while (true) {
                                if (i14 < size2) {
                                    Object obj3 = arrayList3.get(i14);
                                    i14++;
                                    org.telegram.messenger.kj kjVar2 = (org.telegram.messenger.kj) obj3;
                                    if (kjVar2 != null && kjVar2.f1() == intValue) {
                                        kjVar = kjVar2;
                                    }
                                }
                            }
                        }
                        if (kjVar != null) {
                            arrayList.add(kjVar);
                            hashSet3.add(Integer.valueOf(kjVar.f1()));
                            hashSet2.add(org.telegram.ui.web.j.a(kjVar));
                        }
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, mVar.getParentActivity(), mVar.getResourceProvider());
                    String G = org.telegram.messenger.dd.G(hashSet3.size(), "DeleteOptionsTitle", new Object[0]);
                    org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20135a;
                    x1Var.R = G;
                    if (hashSet3.size() == 1) {
                        str = "AreYouSureUnsaveSingleMessage";
                    } else {
                        str = "AreYouSureUnsaveFewMessages";
                    }
                    x1Var.T = org.telegram.messenger.dd.M0(str);
                    alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131751599, null), new cp0(28, mVar, hashSet3));
                    alertDialog$Builder.h(org.telegram.messenger.dd.L0(2131752589, null), null);
                    alertDialog$Builder.d(-1);
                    alertDialog$Builder.p();
                    return;
                } else if (i10 == 2131296498) {
                    mVar.i0();
                    return;
                } else {
                    return;
                }
            case 13:
                org.telegram.ui.web.b1 b1Var = (org.telegram.ui.web.b1) obj;
                if (i10 == -1) {
                    if (org.telegram.ui.web.b1.d0(b1Var).u()) {
                        org.telegram.ui.web.b1.e0(b1Var).t();
                        b1Var.f42801w.clear();
                        org.telegram.messenger.i0.d0(b1Var.f30217a, new ag.z0(25));
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
                if (i10 == -1 && !oVar.d0(true)) {
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
                    k2Var.e((org.telegram.messenger.xe) k2Var.f51405g0.get(i10 - 10), false);
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
                    ((xh.s3) obj).finishFragment();
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
                    ((yh.p) obj).finishFragment();
                    return;
                }
                return;
            case 23:
                yh.z zVar = ((yh.u) obj).f54534n;
                if (i10 == -1) {
                    if (zVar.E1) {
                        zVar.dismiss();
                        return;
                    }
                    zVar.f54551r1.d.f31183f3.O(false);
                    zVar.f54545k1.E(0);
                    return;
                } else if (i10 == 3) {
                    zVar.f54544j1.a(true, true);
                    zVar.u0(false);
                    zVar.J1 = null;
                    zVar.f54557x1.f31183f3.O(true);
                    zVar.f54555v1.f26635r.getText().clear();
                    zVar.f54555v1.f26635r.requestFocus();
                    org.telegram.messenger.i0.J3(zVar.f54555v1.f26635r);
                    return;
                } else {
                    return;
                }
            case 24:
                yh.z zVar2 = ((yh.v) obj).f54536r;
                if (i10 == 2) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putLong("community_id", zVar2.l1);
                    zVar2.f54550q1.presentFragment(new yh.l(bundle2));
                    zVar2.dismiss();
                    return;
                } else if (i10 == 3) {
                    zVar2.f54543i1.a(true, true);
                    zVar2.u0(false);
                    TextUtils.isEmpty(zVar2.I1);
                    zVar2.I1 = null;
                    zVar2.f54556w1.h(0L, zVar2.l1, 0L, 0L, null, false, null, true);
                    zVar2.f54554u1.f26635r.getText().clear();
                    zVar2.f54554u1.f26635r.requestFocus();
                    org.telegram.messenger.i0.J3(zVar2.f54554u1.f26635r);
                    return;
                } else {
                    return;
                }
            default:
                yh.z zVar3 = ((yh.u) obj).f54534n;
                if (i10 == -1) {
                    zVar3.f54551r1.d.f31183f3.O(false);
                    zVar3.f54545k1.E(0);
                    return;
                }
                return;
        }
    }
}
