package org.telegram.ui;

import android.text.TextUtils;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class uk0 implements Utilities.Callback {
    public final int f38959a = 1;
    public final String f38960b;
    public final boolean f38961c;
    public final boolean d;
    public final Object e;
    public final Object f38962f;
    public final Object f38963g;
    public final Serializable h;
    public final Object f38964i;
    public final Object f38965j;
    public final Object f38966k;
    public final Object f38967l;

    public uk0(q61 q61Var, String str, boolean z4, ArrayList arrayList, HashMap hashMap, ArrayList arrayList2, LinkedHashSet linkedHashSet, LinkedHashSet linkedHashSet2, ArrayList arrayList3, ArrayList arrayList4, boolean z10) {
        this.e = q61Var;
        this.f38960b = str;
        this.f38961c = z4;
        this.f38962f = arrayList;
        this.f38963g = hashMap;
        this.h = arrayList2;
        this.f38964i = linkedHashSet;
        this.f38965j = linkedHashSet2;
        this.f38966k = arrayList3;
        this.f38967l = arrayList4;
        this.d = z10;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f38959a) {
            case 0:
                final TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = (TLRPC.TL_messages_requestUrlAuth) this.f38962f;
                final org.telegram.ui.ActionBar.g3 g3Var = (org.telegram.ui.ActionBar.g3) this.f38963g;
                final boolean z4 = this.f38961c;
                final String str = this.f38960b;
                final TLRPC.UrlAuthResult urlAuthResult = (TLRPC.UrlAuthResult) this.f38964i;
                final String[] strArr = (String[]) this.f38965j;
                final boolean z10 = this.d;
                final org.telegram.ui.web.a1 a1Var = (org.telegram.ui.web.a1) this.f38966k;
                final String str2 = (String) this.h;
                final org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) this.f38967l;
                final Integer num = (Integer) obj;
                if (((int[]) this.e)[0] != num.intValue()) {
                    final org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(ApplicationLoader.applicationContext, 3, null);
                    d2Var.q(200L);
                    ConnectionsManager.getInstance(num.intValue()).sendRequestTyped(tL_messages_requestUrlAuth, new Object(), new Utilities.Callback2() {
                        @Override
                        public final void run(Object obj2, Object obj3) {
                            CharSequence replaceSingleLinkBold;
                            TLRPC.UrlAuthResult urlAuthResult2 = (TLRPC.UrlAuthResult) obj2;
                            TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                            org.telegram.ui.ActionBar.d2.this.dismiss();
                            org.telegram.ui.ActionBar.g3 g3Var2 = g3Var;
                            if (urlAuthResult2 != null) {
                                g3Var2.dismiss();
                                xk0.b(z4, num.intValue(), tL_messages_requestUrlAuth, urlAuthResult2, str, urlAuthResult, strArr[0], z10, a1Var);
                            } else if (tL_error != null) {
                                if ("URL_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                                    g3Var2.dismiss();
                                    org.telegram.ui.Components.qc a2 = xk0.a();
                                    int i10 = R.raw.error;
                                    String string = LocaleController.getString(R.string.BotAuthLoggedInFailTitle);
                                    String str3 = str2;
                                    if (TextUtils.isEmpty(str3)) {
                                        replaceSingleLinkBold = LocaleController.getString(R.string.BotAuthLoggedInFailNoDomain);
                                    } else {
                                        replaceSingleLinkBold = AndroidUtilities.replaceSingleLinkBold(LocaleController.formatString(R.string.BotAuthLoggedInFail, str3), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Gi, f6Var));
                                    }
                                    a2.M(string, replaceSingleLinkBold, i10).j();
                                    return;
                                }
                                yh.u(g3Var2.topBulletinContainer, g3Var2.getResourcesProvider(), tL_error, false);
                            }
                        }
                    });
                    return;
                }
                return;
            default:
                final q61 q61Var = (q61) this.e;
                final String str3 = this.f38960b;
                final boolean z11 = this.f38961c;
                final ArrayList arrayList = (ArrayList) this.f38962f;
                final HashMap hashMap = (HashMap) this.f38963g;
                final ArrayList arrayList2 = (ArrayList) this.h;
                final LinkedHashSet linkedHashSet = (LinkedHashSet) this.f38964i;
                final LinkedHashSet linkedHashSet2 = (LinkedHashSet) this.f38965j;
                final ArrayList arrayList3 = (ArrayList) this.f38966k;
                final ArrayList arrayList4 = (ArrayList) this.f38967l;
                final boolean z12 = this.d;
                Runnable runnable = (Runnable) obj;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        q61 q61Var2 = q61.this;
                        r41 r41Var = q61Var2.F1;
                        if (r41Var != null) {
                            AndroidUtilities.cancelRunOnUIThread(r41Var);
                            q61Var2.F1 = null;
                        }
                        String str4 = q61Var2.f37645w1;
                        String str5 = str3;
                        if (str5 != str4) {
                            return;
                        }
                        q61Var2.f37642v1 = true;
                        q61Var2.z(true, z11);
                        g51 g51Var = q61Var2.f37601c0;
                        if (g51Var != null) {
                            g51Var.d(true);
                        }
                        ArrayList arrayList5 = q61Var2.f37648x1;
                        if (arrayList5 == null) {
                            q61Var2.f37648x1 = new ArrayList();
                        } else {
                            arrayList5.clear();
                        }
                        ArrayList arrayList6 = q61Var2.A1;
                        if (arrayList6 == null) {
                            q61Var2.A1 = new ArrayList();
                        } else {
                            arrayList6.clear();
                        }
                        ArrayList arrayList7 = q61Var2.f37653z1;
                        if (arrayList7 == null) {
                            q61Var2.f37653z1 = new ArrayList();
                        } else {
                            arrayList7.clear();
                        }
                        ArrayList arrayList8 = q61Var2.f37651y1;
                        if (arrayList8 == null) {
                            q61Var2.f37651y1 = new ArrayList();
                        } else {
                            arrayList8.clear();
                        }
                        int i10 = 0;
                        q61Var2.f37608f0.u0(0);
                        int i11 = q61Var2.T;
                        if (i11 == 1 || i11 == 14 || i11 == 11 || i11 == 2) {
                            ArrayList arrayList9 = arrayList;
                            if (!arrayList9.isEmpty()) {
                                q61Var2.f37648x1.addAll(arrayList9);
                            } else {
                                TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) hashMap.get(str5);
                                if (tL_availableReaction != null) {
                                    q61Var2.f37648x1.add(mg.q0.c(tL_availableReaction));
                                }
                            }
                            ArrayList arrayList10 = arrayList2;
                            if (!arrayList10.isEmpty()) {
                                q61Var2.f37651y1.addAll(arrayList10);
                            }
                        }
                        Iterator it = linkedHashSet.iterator();
                        while (it.hasNext()) {
                            Long l10 = (Long) it.next();
                            l10.getClass();
                            ArrayList arrayList11 = q61Var2.f37648x1;
                            ?? obj2 = new Object();
                            long longValue = l10.longValue();
                            obj2.f14108g = longValue;
                            obj2.h = longValue;
                            arrayList11.add(obj2);
                        }
                        Iterator it2 = linkedHashSet2.iterator();
                        while (it2.hasNext()) {
                            q61Var2.f37648x1.add(mg.q0.b((String) it2.next()));
                        }
                        q61Var2.A1.addAll(arrayList3);
                        ArrayList arrayList12 = arrayList4;
                        int size = arrayList12.size();
                        while (i10 < size) {
                            Object obj3 = arrayList12.get(i10);
                            i10++;
                            q61Var2.f37653z1.addAll((ArrayList) obj3);
                        }
                        q61Var2.f37623n0.E(true ^ z12);
                    }
                });
                return;
        }
    }

    public uk0(int[] iArr, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, org.telegram.ui.ActionBar.g3 g3Var, boolean z4, String str, TLRPC.UrlAuthResult urlAuthResult, String[] strArr, boolean z10, org.telegram.ui.web.a1 a1Var, String str2, org.telegram.ui.ActionBar.f6 f6Var) {
        this.e = iArr;
        this.f38962f = tL_messages_requestUrlAuth;
        this.f38963g = g3Var;
        this.f38961c = z4;
        this.f38960b = str;
        this.f38964i = urlAuthResult;
        this.f38965j = strArr;
        this.d = z10;
        this.f38966k = a1Var;
        this.h = str2;
        this.f38967l = f6Var;
    }
}
