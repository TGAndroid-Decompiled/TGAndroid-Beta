package org.telegram.ui;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class vs0 extends org.telegram.ui.ActionBar.j {
    public final int f50609a;
    public final Object f50610b;

    public vs0(Object obj, int i3) {
        this.f50609a = i3;
        this.f50610b = obj;
    }

    @Override
    public final void b(int i3) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        int intValue;
        String str;
        String str2;
        String str3;
        int i10;
        String str4;
        org.telegram.messenger.zi ziVar;
        org.telegram.ui.ActionBar.k kVar3;
        org.telegram.ui.ActionBar.k kVar4;
        int i11 = this.f50609a;
        org.telegram.ui.ActionBar.j jVar = null;
        boolean z10 = true;
        Object obj = this.f50610b;
        switch (i11) {
            case 0:
                PrivacyControlActivity privacyControlActivity = (PrivacyControlActivity) obj;
                if (i3 == -1) {
                    if (privacyControlActivity.G0(true)) {
                        privacyControlActivity.finishFragment();
                        return;
                    }
                    return;
                } else if (i3 == 1) {
                    privacyControlActivity.K0();
                    return;
                } else {
                    return;
                }
            case 1:
                if (i3 == -1) {
                    ((PrivacySettingsActivity) obj).finishFragment();
                    return;
                }
                return;
            case 2:
                if (i3 == -1) {
                    ((it0) obj).finishFragment();
                    return;
                }
                return;
            case 3:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                if (i3 != -1) {
                    kVar = ((org.telegram.ui.ActionBar.d2) profileActivity).actionBar;
                    if (kVar != null) {
                        kVar2 = ((org.telegram.ui.ActionBar.d2) profileActivity).actionBar;
                        jVar = kVar2.getActionBarMenuOnItemClick();
                    }
                    if (jVar != null) {
                        jVar.b(i3);
                        return;
                    }
                    return;
                }
                mv0 mv0Var = profileActivity.O;
                if (mv0Var == null || !mv0Var.V(true)) {
                    if (profileActivity.J0) {
                        Bundle bundle = new Bundle();
                        bundle.putLong("chat_id", profileActivity.f41759f1);
                        bundle.putLong("user_id", profileActivity.f41751e1);
                        profileActivity.presentFragment(new bi.j0(bundle));
                        return;
                    }
                    profileActivity.finishFragment();
                    return;
                }
                return;
            case 4:
                if (i3 == -1) {
                    ((ProxyListActivity) obj).finishFragment();
                    return;
                }
                return;
            case 5:
                mx0 mx0Var = (mx0) obj;
                boolean z11 = mx0Var.J;
                org.telegram.messenger.zy zyVar = mx0Var.K;
                if (i3 == -1) {
                    mx0Var.finishFragment();
                    return;
                } else if (i3 == 1 && mx0Var.getParentActivity() != null) {
                    m2.p0 a10 = ui.a.a();
                    a10.p(mx0Var.f47818w);
                    String obj2 = mx0Var.f47810a[0].getText().toString();
                    String str5 = "";
                    if (obj2 == null) {
                        obj2 = "";
                    }
                    a10.f18961c = obj2;
                    if (mx0Var.f47818w == 3) {
                        intValue = 0;
                    } else {
                        intValue = Utilities.z(mx0Var.f47810a[1].getText().toString()).intValue();
                    }
                    a10.f18960b = intValue;
                    if (mx0Var.f47818w != 1) {
                        str = "";
                    } else {
                        str = mx0Var.f47810a[2].getText().toString();
                    }
                    if (str == null) {
                        str = "";
                    }
                    a10.d = str;
                    if (mx0Var.f47818w != 1) {
                        str2 = "";
                    } else {
                        str2 = mx0Var.f47810a[3].getText().toString();
                    }
                    if (str2 == null) {
                        str2 = "";
                    }
                    a10.f18962e = str2;
                    if (mx0Var.f47818w == 1) {
                        str3 = "";
                    } else {
                        str3 = mx0Var.f47810a[4].getText().toString();
                    }
                    if (str3 != null) {
                        str5 = str3;
                    }
                    a10.f18963f = str5;
                    zyVar.f26993a = a10.d();
                    SharedPreferences e12 = org.telegram.messenger.hp.e1();
                    SharedPreferences.Editor edit = e12.edit();
                    if (z11) {
                        org.telegram.messenger.az.a(zyVar);
                        org.telegram.messenger.az.B1 = zyVar;
                        edit.putBoolean("proxy_enabled", true);
                    } else {
                        z10 = e12.getBoolean("proxy_enabled", false);
                        org.telegram.messenger.az.z();
                    }
                    if (z11 || org.telegram.messenger.az.B1 == zyVar) {
                        zyVar.f26993a.i(edit);
                        ConnectionsManager.setProxySettings(z10, zyVar.f26993a);
                    }
                    edit.commit();
                    org.telegram.messenger.hs.e().k(277, new Object[0]);
                    mx0Var.finishFragment();
                    return;
                } else {
                    return;
                }
            case 6:
                if (i3 == -1) {
                    ((sx0) obj).finishFragment();
                    return;
                }
                return;
            case 7:
                if (i3 == -1) {
                    ((gy0) obj).finishFragment();
                    return;
                }
                return;
            case 8:
                if (i3 == -1) {
                    ((ny0) obj).finishFragment();
                    return;
                }
                return;
            case 9:
                if (i3 == -1) {
                    ((SaveToGallerySettingsActivity) obj).finishFragment();
                    return;
                }
                return;
            case 10:
                if (i3 == -1) {
                    ((SecretMediaViewer) obj).e(true, false);
                    return;
                }
                return;
            case 11:
                if (i3 == -1) {
                    ((SessionsActivity) obj).finishFragment();
                    return;
                }
                return;
            case 12:
                c31 c31Var = (c31) obj;
                if (i3 == -1) {
                    if (c31Var.O) {
                        Bundle bundle2 = new Bundle();
                        bundle2.putLong("user_id", c31Var.getUserConfig().e());
                        bundle2.putBoolean("immediate", true);
                        c31Var.presentFragment(new bi.j0(bundle2));
                        return;
                    }
                    c31Var.finishFragment();
                    return;
                } else if (i3 == 2) {
                    c31Var.k0(new org.telegram.ui.ActionBar.d2(null));
                    return;
                } else {
                    return;
                }
            case 13:
                if (i3 == -1) {
                    ((r41) obj).finishFragment();
                    return;
                }
                return;
            case 14:
                StickersActivity stickersActivity = (StickersActivity) obj;
                if (i3 == -1) {
                    if (stickersActivity.onBackPressed(true)) {
                        stickersActivity.finishFragment();
                        return;
                    }
                    return;
                }
                StickersActivity.i0(stickersActivity, i3);
                return;
            case 15:
                o71 o71Var = (o71) obj;
                if (i3 == -1) {
                    o71Var.finishFragment();
                    return;
                } else if (i3 == 1) {
                    o71.d0(o71Var);
                    return;
                } else {
                    return;
                }
            case 16:
                if (i3 == -1) {
                    ((d81) obj).finishFragment();
                    return;
                }
                return;
            case 17:
                if (i3 == -1) {
                    ((s91) obj).finishFragment();
                    return;
                }
                return;
            case 18:
                if (i3 == -1) {
                    TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) obj;
                    if (twoStepVerificationActivity.Y >= 0) {
                        twoStepVerificationActivity.C0();
                        return;
                    } else {
                        twoStepVerificationActivity.finishFragment();
                        return;
                    }
                }
                return;
            case 19:
                UserInfoActivity userInfoActivity = (UserInfoActivity) obj;
                if (i3 == -1) {
                    if (userInfoActivity.onBackPressed(true)) {
                        userInfoActivity.finishFragment();
                        return;
                    }
                    return;
                } else if (i3 == 1) {
                    userInfoActivity.h0(true);
                    return;
                } else {
                    return;
                }
            case 20:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) obj;
                if (i3 == -1) {
                    usersSelectActivity.finishFragment();
                    return;
                } else if (i3 == 1) {
                    usersSelectActivity.c0();
                    return;
                } else {
                    return;
                }
            case 21:
                org.telegram.ui.Wallet.m9 m9Var = (org.telegram.ui.Wallet.m9) obj;
                if (i3 == -1) {
                    m9Var.finishFragment();
                    return;
                } else if (i3 == 2) {
                    Activity parentActivity = m9Var.getParentActivity();
                    i10 = ((org.telegram.ui.ActionBar.d2) m9Var).currentAccount;
                    org.telegram.ui.Wallet.w5.J0(i10, parentActivity, m9Var.getResourceProvider());
                    return;
                } else if (i3 == 3) {
                    m9Var.u0();
                    return;
                } else {
                    return;
                }
            case 22:
                org.telegram.ui.web.n nVar = (org.telegram.ui.web.n) obj;
                HashSet hashSet = nVar.f50962y;
                if (i3 == -1) {
                    if (org.telegram.ui.web.n.e0(nVar).v()) {
                        org.telegram.ui.web.n.f0(nVar).u();
                        hashSet.clear();
                        org.telegram.messenger.g0.d0(nVar.f34298a, new ei.e(25));
                        return;
                    }
                    nVar.finishFragment();
                    return;
                } else if (i3 == 2131296494) {
                    HashSet hashSet2 = new HashSet();
                    ArrayList arrayList = new ArrayList();
                    HashSet hashSet3 = new HashSet();
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        int intValue2 = ((Integer) it.next()).intValue();
                        ArrayList arrayList2 = nVar.f50955e.f50906a;
                        int size = arrayList2.size();
                        int i12 = 0;
                        while (true) {
                            if (i12 < size) {
                                Object obj3 = arrayList2.get(i12);
                                i12++;
                                ziVar = (org.telegram.messenger.zi) obj3;
                                if (ziVar == null || ziVar.f1() != intValue2) {
                                }
                            } else {
                                ziVar = null;
                            }
                        }
                        org.telegram.ui.web.j jVar2 = nVar.f50956f;
                        if (jVar2 != null && ziVar == null) {
                            ArrayList arrayList3 = jVar2.f50906a;
                            int size2 = arrayList3.size();
                            int i13 = 0;
                            while (true) {
                                if (i13 < size2) {
                                    Object obj4 = arrayList3.get(i13);
                                    i13++;
                                    org.telegram.messenger.zi ziVar2 = (org.telegram.messenger.zi) obj4;
                                    if (ziVar2 != null && ziVar2.f1() == intValue2) {
                                        ziVar = ziVar2;
                                    }
                                }
                            }
                        }
                        if (ziVar != null) {
                            arrayList.add(ziVar);
                            hashSet3.add(Integer.valueOf(ziVar.f1()));
                            hashSet2.add(org.telegram.ui.web.l.a(ziVar));
                        }
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, nVar.getParentActivity(), nVar.getResourceProvider());
                    String G = org.telegram.messenger.bd.G(hashSet3.size(), "DeleteOptionsTitle", new Object[0]);
                    org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
                    s1Var.S = G;
                    if (hashSet3.size() == 1) {
                        str4 = "AreYouSureUnsaveSingleMessage";
                    } else {
                        str4 = "AreYouSureUnsaveFewMessages";
                    }
                    s1Var.U = org.telegram.messenger.bd.N0(str4);
                    alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131751599, null), new na1(7, nVar, hashSet3));
                    alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
                    alertDialog$Builder.d(-1);
                    alertDialog$Builder.p();
                    return;
                } else if (i3 == 2131296498) {
                    nVar.i0();
                    return;
                } else {
                    return;
                }
            case 23:
                org.telegram.ui.web.y0 y0Var = (org.telegram.ui.web.y0) obj;
                if (i3 == -1) {
                    kVar3 = ((org.telegram.ui.ActionBar.d2) y0Var).actionBar;
                    if (kVar3.v()) {
                        kVar4 = ((org.telegram.ui.ActionBar.d2) y0Var).actionBar;
                        kVar4.u();
                        y0Var.f51116w.clear();
                        org.telegram.messenger.g0.d0(y0Var.f34298a, new ei.e(26));
                        return;
                    }
                    y0Var.finishFragment();
                    return;
                }
                return;
            default:
                if (i3 == -1) {
                    ((vg.v0) obj).dismiss();
                    return;
                }
                return;
        }
    }
}
