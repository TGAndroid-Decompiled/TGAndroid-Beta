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
public final class wk0 implements Utilities.Callback {
    public final int f42799a = 1;
    public final String f42800b;
    public final boolean f42801c;
    public final boolean d;
    public final Object f42802e;
    public final Object f42803f;
    public final Object f42804g;
    public final Serializable h;
    public final Object f42805i;
    public final Object f42806j;
    public final Object f42807k;
    public final Object f42808l;

    public wk0(w61 w61Var, String str, boolean z4, ArrayList arrayList, HashMap hashMap, ArrayList arrayList2, LinkedHashSet linkedHashSet, LinkedHashSet linkedHashSet2, ArrayList arrayList3, ArrayList arrayList4, boolean z10) {
        this.f42802e = w61Var;
        this.f42800b = str;
        this.f42801c = z4;
        this.f42803f = arrayList;
        this.f42804g = hashMap;
        this.h = arrayList2;
        this.f42805i = linkedHashSet;
        this.f42806j = linkedHashSet2;
        this.f42807k = arrayList3;
        this.f42808l = arrayList4;
        this.d = z10;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f42799a) {
            case 0:
                final TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = (TLRPC.TL_messages_requestUrlAuth) this.f42803f;
                final org.telegram.ui.ActionBar.h3 h3Var = (org.telegram.ui.ActionBar.h3) this.f42804g;
                final boolean z4 = this.f42801c;
                final String str = this.f42800b;
                final TLRPC.UrlAuthResult urlAuthResult = (TLRPC.UrlAuthResult) this.f42805i;
                final String[] strArr = (String[]) this.f42806j;
                final boolean z10 = this.d;
                final org.telegram.ui.web.a1 a1Var = (org.telegram.ui.web.a1) this.f42807k;
                final String str2 = (String) this.h;
                final org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) this.f42808l;
                final Integer num = (Integer) obj;
                if (((int[]) this.f42802e)[0] != num.intValue()) {
                    final org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(ApplicationLoader.applicationContext, 3, null);
                    d2Var.q(200L);
                    ConnectionsManager.getInstance(num.intValue()).sendRequestTyped(tL_messages_requestUrlAuth, new Object(), new Utilities.Callback2() {
                        @Override
                        public final void run(Object obj2, Object obj3) {
                            CharSequence replaceSingleLinkBold;
                            TLRPC.UrlAuthResult urlAuthResult2 = (TLRPC.UrlAuthResult) obj2;
                            TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                            org.telegram.ui.ActionBar.d2.this.dismiss();
                            org.telegram.ui.ActionBar.h3 h3Var2 = h3Var;
                            if (urlAuthResult2 != null) {
                                h3Var2.dismiss();
                                zk0.b(z4, num.intValue(), tL_messages_requestUrlAuth, urlAuthResult2, str, urlAuthResult, strArr[0], z10, a1Var);
                            } else if (tL_error != null) {
                                if ("URL_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                                    h3Var2.dismiss();
                                    org.telegram.ui.Components.qc a2 = zk0.a();
                                    int i10 = R.raw.error;
                                    String string = LocaleController.getString(R.string.BotAuthLoggedInFailTitle);
                                    String str3 = str2;
                                    if (TextUtils.isEmpty(str3)) {
                                        replaceSingleLinkBold = LocaleController.getString(R.string.BotAuthLoggedInFailNoDomain);
                                    } else {
                                        replaceSingleLinkBold = AndroidUtilities.replaceSingleLinkBold(LocaleController.formatString(R.string.BotAuthLoggedInFail, str3), org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Gi, g6Var));
                                    }
                                    a2.M(string, replaceSingleLinkBold, i10).j();
                                    return;
                                }
                                yh.u(h3Var2.topBulletinContainer, h3Var2.getResourcesProvider(), tL_error, false);
                            }
                        }
                    });
                    return;
                }
                return;
            default:
                final w61 w61Var = (w61) this.f42802e;
                final String str3 = this.f42800b;
                final boolean z11 = this.f42801c;
                final ArrayList arrayList = (ArrayList) this.f42803f;
                final HashMap hashMap = (HashMap) this.f42804g;
                final ArrayList arrayList2 = (ArrayList) this.h;
                final LinkedHashSet linkedHashSet = (LinkedHashSet) this.f42805i;
                final LinkedHashSet linkedHashSet2 = (LinkedHashSet) this.f42806j;
                final ArrayList arrayList3 = (ArrayList) this.f42807k;
                final ArrayList arrayList4 = (ArrayList) this.f42808l;
                final boolean z12 = this.d;
                Runnable runnable = (Runnable) obj;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        w61 w61Var2 = w61.this;
                        y41 y41Var = w61Var2.F1;
                        if (y41Var != null) {
                            AndroidUtilities.cancelRunOnUIThread(y41Var);
                            w61Var2.F1 = null;
                        }
                        String str4 = w61Var2.f42354w1;
                        String str5 = str3;
                        if (str5 != str4) {
                            return;
                        }
                        w61Var2.f42351v1 = true;
                        w61Var2.z(true, z11);
                        n51 n51Var = w61Var2.f42309c0;
                        if (n51Var != null) {
                            n51Var.d(true);
                        }
                        ArrayList arrayList5 = w61Var2.f42357x1;
                        if (arrayList5 == null) {
                            w61Var2.f42357x1 = new ArrayList();
                        } else {
                            arrayList5.clear();
                        }
                        ArrayList arrayList6 = w61Var2.A1;
                        if (arrayList6 == null) {
                            w61Var2.A1 = new ArrayList();
                        } else {
                            arrayList6.clear();
                        }
                        ArrayList arrayList7 = w61Var2.f42362z1;
                        if (arrayList7 == null) {
                            w61Var2.f42362z1 = new ArrayList();
                        } else {
                            arrayList7.clear();
                        }
                        ArrayList arrayList8 = w61Var2.f42360y1;
                        if (arrayList8 == null) {
                            w61Var2.f42360y1 = new ArrayList();
                        } else {
                            arrayList8.clear();
                        }
                        int i10 = 0;
                        w61Var2.f42317f0.u0(0);
                        int i11 = w61Var2.T;
                        if (i11 == 1 || i11 == 14 || i11 == 11 || i11 == 2) {
                            ArrayList arrayList9 = arrayList;
                            if (!arrayList9.isEmpty()) {
                                w61Var2.f42357x1.addAll(arrayList9);
                            } else {
                                TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) hashMap.get(str5);
                                if (tL_availableReaction != null) {
                                    w61Var2.f42357x1.add(ng.q0.c(tL_availableReaction));
                                }
                            }
                            ArrayList arrayList10 = arrayList2;
                            if (!arrayList10.isEmpty()) {
                                w61Var2.f42360y1.addAll(arrayList10);
                            }
                        }
                        Iterator it = linkedHashSet.iterator();
                        while (it.hasNext()) {
                            Long l10 = (Long) it.next();
                            l10.getClass();
                            ArrayList arrayList11 = w61Var2.f42357x1;
                            ?? obj2 = new Object();
                            long longValue = l10.longValue();
                            obj2.f16181g = longValue;
                            obj2.h = longValue;
                            arrayList11.add(obj2);
                        }
                        Iterator it2 = linkedHashSet2.iterator();
                        while (it2.hasNext()) {
                            w61Var2.f42357x1.add(ng.q0.b((String) it2.next()));
                        }
                        w61Var2.A1.addAll(arrayList3);
                        ArrayList arrayList12 = arrayList4;
                        int size = arrayList12.size();
                        while (i10 < size) {
                            Object obj3 = arrayList12.get(i10);
                            i10++;
                            w61Var2.f42362z1.addAll((ArrayList) obj3);
                        }
                        w61Var2.f42332n0.E(true ^ z12);
                    }
                });
                return;
        }
    }

    public wk0(int[] iArr, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, org.telegram.ui.ActionBar.h3 h3Var, boolean z4, String str, TLRPC.UrlAuthResult urlAuthResult, String[] strArr, boolean z10, org.telegram.ui.web.a1 a1Var, String str2, org.telegram.ui.ActionBar.g6 g6Var) {
        this.f42802e = iArr;
        this.f42803f = tL_messages_requestUrlAuth;
        this.f42804g = h3Var;
        this.f42801c = z4;
        this.f42800b = str;
        this.f42805i = urlAuthResult;
        this.f42806j = strArr;
        this.d = z10;
        this.f42807k = a1Var;
        this.h = str2;
        this.f42808l = g6Var;
    }
}
