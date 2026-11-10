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
public final class qt0 extends org.telegram.ui.ActionBar.k {
    public final int f49149a;
    public final Object f49150b;

    public qt0(Object obj, int i7) {
        this.f49149a = i7;
        this.f49150b = obj;
    }

    @Override
    public final void b(int i7) {
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        int intValue;
        String str;
        String str2;
        String str3;
        int i10;
        String str4;
        org.telegram.messenger.ij ijVar;
        org.telegram.ui.ActionBar.l lVar3;
        org.telegram.ui.ActionBar.l lVar4;
        int i11 = this.f49149a;
        org.telegram.ui.ActionBar.k kVar = null;
        boolean z9 = true;
        Object obj = this.f49150b;
        switch (i11) {
            case 0:
                if (i7 == -1) {
                    ((PrivacySettingsActivity) obj).finishFragment();
                    return;
                }
                return;
            case 1:
                if (i7 == -1) {
                    ((vt0) obj).finishFragment();
                    return;
                }
                return;
            case 2:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                if (i7 != -1) {
                    lVar = ((org.telegram.ui.ActionBar.f2) profileActivity).actionBar;
                    if (lVar != null) {
                        lVar2 = ((org.telegram.ui.ActionBar.f2) profileActivity).actionBar;
                        kVar = lVar2.getActionBarMenuOnItemClick();
                    }
                    if (kVar != null) {
                        kVar.b(i7);
                        return;
                    }
                    return;
                }
                yv0 yv0Var = profileActivity.N;
                if (yv0Var == null || !yv0Var.V(true)) {
                    if (profileActivity.I0) {
                        Bundle bundle = new Bundle();
                        bundle.putLong("chat_id", profileActivity.f41721e1);
                        bundle.putLong("user_id", profileActivity.f41714d1);
                        profileActivity.presentFragment(new ai.s0(bundle));
                        return;
                    }
                    profileActivity.finishFragment();
                    return;
                }
                return;
            case 3:
                if (i7 == -1) {
                    ((ProxyListActivity) obj).finishFragment();
                    return;
                }
                return;
            case 4:
                zx0 zx0Var = (zx0) obj;
                boolean z10 = zx0Var.I;
                org.telegram.messenger.hz hzVar = zx0Var.J;
                if (i7 == -1) {
                    zx0Var.finishFragment();
                    return;
                } else if (i7 == 1 && zx0Var.getParentActivity() != null) {
                    n2.n0 a10 = ui.a.a();
                    a10.p(zx0Var.f52702w);
                    String obj2 = zx0Var.f52694a[0].getText().toString();
                    String str5 = "";
                    if (obj2 == null) {
                        obj2 = "";
                    }
                    a10.f20261c = obj2;
                    if (zx0Var.f52702w == 3) {
                        intValue = 0;
                    } else {
                        intValue = Utilities.z(zx0Var.f52694a[1].getText().toString()).intValue();
                    }
                    a10.f20260b = intValue;
                    if (zx0Var.f52702w != 1) {
                        str = "";
                    } else {
                        str = zx0Var.f52694a[2].getText().toString();
                    }
                    if (str == null) {
                        str = "";
                    }
                    a10.d = str;
                    if (zx0Var.f52702w != 1) {
                        str2 = "";
                    } else {
                        str2 = zx0Var.f52694a[3].getText().toString();
                    }
                    if (str2 == null) {
                        str2 = "";
                    }
                    a10.f20262e = str2;
                    if (zx0Var.f52702w == 1) {
                        str3 = "";
                    } else {
                        str3 = zx0Var.f52694a[4].getText().toString();
                    }
                    if (str3 != null) {
                        str5 = str3;
                    }
                    a10.f20263f = str5;
                    hzVar.f22998a = a10.d();
                    SharedPreferences e12 = org.telegram.messenger.qp.e1();
                    SharedPreferences.Editor edit = e12.edit();
                    if (z10) {
                        org.telegram.messenger.iz.a(hzVar);
                        org.telegram.messenger.iz.B1 = hzVar;
                        edit.putBoolean("proxy_enabled", true);
                    } else {
                        z9 = e12.getBoolean("proxy_enabled", false);
                        org.telegram.messenger.iz.z();
                    }
                    if (z10 || org.telegram.messenger.iz.B1 == hzVar) {
                        hzVar.f22998a.i(edit);
                        ConnectionsManager.setProxySettings(z9, hzVar.f22998a);
                    }
                    edit.commit();
                    org.telegram.messenger.qs.e().k(277, new Object[0]);
                    zx0Var.finishFragment();
                    return;
                } else {
                    return;
                }
            case 5:
                if (i7 == -1) {
                    ((fy0) obj).finishFragment();
                    return;
                }
                return;
            case 6:
                if (i7 == -1) {
                    ((uy0) obj).finishFragment();
                    return;
                }
                return;
            case 7:
                if (i7 == -1) {
                    ((bz0) obj).finishFragment();
                    return;
                }
                return;
            case 8:
                if (i7 == -1) {
                    ((SaveToGallerySettingsActivity) obj).finishFragment();
                    return;
                }
                return;
            case 9:
                if (i7 == -1) {
                    ((SecretMediaViewer) obj).e(true, false);
                    return;
                }
                return;
            case 10:
                if (i7 == -1) {
                    ((SessionsActivity) obj).finishFragment();
                    return;
                }
                return;
            case 11:
                o31 o31Var = (o31) obj;
                if (i7 == -1) {
                    if (o31Var.N) {
                        Bundle bundle2 = new Bundle();
                        bundle2.putLong("user_id", o31Var.getUserConfig().e());
                        bundle2.putBoolean("immediate", true);
                        o31Var.presentFragment(new ai.s0(bundle2));
                        return;
                    }
                    o31Var.finishFragment();
                    return;
                } else if (i7 == 2) {
                    o31Var.k0(new org.telegram.ui.ActionBar.f2(null));
                    return;
                } else {
                    return;
                }
            case 12:
                if (i7 == -1) {
                    ((e51) obj).finishFragment();
                    return;
                }
                return;
            case 13:
                StickersActivity stickersActivity = (StickersActivity) obj;
                if (i7 == -1) {
                    if (stickersActivity.onBackPressed(true)) {
                        stickersActivity.finishFragment();
                        return;
                    }
                    return;
                }
                StickersActivity.i0(stickersActivity, i7);
                return;
            case 14:
                a81 a81Var = (a81) obj;
                if (i7 == -1) {
                    a81Var.finishFragment();
                    return;
                } else if (i7 == 1) {
                    a81.d0(a81Var);
                    return;
                } else {
                    return;
                }
            case 15:
                if (i7 == -1) {
                    ((p81) obj).finishFragment();
                    return;
                }
                return;
            case 16:
                if (i7 == -1) {
                    ((fa1) obj).finishFragment();
                    return;
                }
                return;
            case 17:
                if (i7 == -1) {
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
            case 18:
                UserInfoActivity userInfoActivity = (UserInfoActivity) obj;
                if (i7 == -1) {
                    if (userInfoActivity.onBackPressed(true)) {
                        userInfoActivity.finishFragment();
                        return;
                    }
                    return;
                } else if (i7 == 1) {
                    userInfoActivity.h0(true);
                    return;
                } else {
                    return;
                }
            case 19:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) obj;
                if (i7 == -1) {
                    usersSelectActivity.finishFragment();
                    return;
                } else if (i7 == 1) {
                    usersSelectActivity.c0();
                    return;
                } else {
                    return;
                }
            case 20:
                org.telegram.ui.Wallet.o9 o9Var = (org.telegram.ui.Wallet.o9) obj;
                if (i7 == -1) {
                    o9Var.finishFragment();
                    return;
                } else if (i7 == 2) {
                    Activity parentActivity = o9Var.getParentActivity();
                    i10 = ((org.telegram.ui.ActionBar.f2) o9Var).currentAccount;
                    org.telegram.ui.Wallet.z5.J0(i10, parentActivity, o9Var.getResourceProvider());
                    return;
                } else if (i7 == 3) {
                    o9Var.u0();
                    return;
                } else {
                    return;
                }
            case 21:
                org.telegram.ui.web.l lVar5 = (org.telegram.ui.web.l) obj;
                HashSet hashSet = lVar5.f51164y;
                if (i7 == -1) {
                    if (org.telegram.ui.web.l.e0(lVar5).x()) {
                        org.telegram.ui.web.l.f0(lVar5).w();
                        hashSet.clear();
                        org.telegram.messenger.g0.d0(lVar5.f36518a, new di.e(28));
                        return;
                    }
                    lVar5.finishFragment();
                    return;
                } else if (i7 == 2131296494) {
                    HashSet hashSet2 = new HashSet();
                    ArrayList arrayList = new ArrayList();
                    HashSet hashSet3 = new HashSet();
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        int intValue2 = ((Integer) it.next()).intValue();
                        ArrayList arrayList2 = lVar5.f51157e.f51083a;
                        int size = arrayList2.size();
                        int i12 = 0;
                        while (true) {
                            if (i12 < size) {
                                Object obj3 = arrayList2.get(i12);
                                i12++;
                                ijVar = (org.telegram.messenger.ij) obj3;
                                if (ijVar == null || ijVar.e1() != intValue2) {
                                }
                            } else {
                                ijVar = null;
                            }
                        }
                        org.telegram.ui.web.h hVar = lVar5.f51158f;
                        if (hVar != null && ijVar == null) {
                            ArrayList arrayList3 = hVar.f51083a;
                            int size2 = arrayList3.size();
                            int i13 = 0;
                            while (true) {
                                if (i13 < size2) {
                                    Object obj4 = arrayList3.get(i13);
                                    i13++;
                                    org.telegram.messenger.ij ijVar2 = (org.telegram.messenger.ij) obj4;
                                    if (ijVar2 != null && ijVar2.e1() == intValue2) {
                                        ijVar = ijVar2;
                                    }
                                }
                            }
                        }
                        if (ijVar != null) {
                            arrayList.add(ijVar);
                            hashSet3.add(Integer.valueOf(ijVar.e1()));
                            hashSet2.add(org.telegram.ui.web.j.a(ijVar));
                        }
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, lVar5.getParentActivity(), lVar5.getResourceProvider());
                    String G = org.telegram.messenger.id.G(hashSet3.size(), "DeleteOptionsTitle", new Object[0]);
                    org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27300a;
                    u1Var.R = G;
                    if (hashSet3.size() == 1) {
                        str4 = "AreYouSureUnsaveSingleMessage";
                    } else {
                        str4 = "AreYouSureUnsaveFewMessages";
                    }
                    u1Var.T = org.telegram.messenger.id.N0(str4);
                    alertDialog$Builder.k(org.telegram.messenger.id.M0(2131751598, null), new ok0(29, lVar5, hashSet3));
                    alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
                    alertDialog$Builder.d(-1);
                    alertDialog$Builder.p();
                    return;
                } else if (i7 == 2131296498) {
                    lVar5.i0();
                    return;
                } else {
                    return;
                }
            case 22:
                org.telegram.ui.web.z0 z0Var = (org.telegram.ui.web.z0) obj;
                if (i7 == -1) {
                    lVar3 = ((org.telegram.ui.ActionBar.f2) z0Var).actionBar;
                    if (lVar3.x()) {
                        lVar4 = ((org.telegram.ui.ActionBar.f2) z0Var).actionBar;
                        lVar4.w();
                        z0Var.f51351w.clear();
                        org.telegram.messenger.g0.d0(z0Var.f36518a, new di.e(29));
                        return;
                    }
                    z0Var.finishFragment();
                    return;
                }
                return;
            case 23:
                if (i7 == -1) {
                    ((ug.w0) obj).dismiss();
                    return;
                }
                return;
            default:
                if (i7 == -1) {
                    ((zh.m3) obj).finishFragment();
                    return;
                }
                return;
        }
    }
}
