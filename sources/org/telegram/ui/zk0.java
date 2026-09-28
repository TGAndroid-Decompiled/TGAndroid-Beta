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
public final class zk0 implements Utilities.Callback {
    public final int f40522a = 1;
    public final String f40523b;
    public final boolean f40524c;
    public final boolean d;
    public final Object e;
    public final Object f40525f;
    public final Object f40526g;
    public final Serializable h;
    public final Object f40527i;
    public final Object f40528j;
    public final Object f40529k;
    public final Object f40530l;

    public zk0(a71 a71Var, String str, boolean z10, ArrayList arrayList, HashMap hashMap, ArrayList arrayList2, LinkedHashSet linkedHashSet, LinkedHashSet linkedHashSet2, ArrayList arrayList3, ArrayList arrayList4, boolean z11) {
        this.e = a71Var;
        this.f40523b = str;
        this.f40524c = z10;
        this.f40525f = arrayList;
        this.f40526g = hashMap;
        this.h = arrayList2;
        this.f40527i = linkedHashSet;
        this.f40528j = linkedHashSet2;
        this.f40529k = arrayList3;
        this.f40530l = arrayList4;
        this.d = z11;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f40522a) {
            case 0:
                final TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = (TLRPC.TL_messages_requestUrlAuth) this.f40525f;
                final org.telegram.ui.ActionBar.e3 e3Var = (org.telegram.ui.ActionBar.e3) this.f40526g;
                final boolean z10 = this.f40524c;
                final String str = this.f40523b;
                final TLRPC.UrlAuthResult urlAuthResult = (TLRPC.UrlAuthResult) this.f40527i;
                final String[] strArr = (String[]) this.f40528j;
                final boolean z11 = this.d;
                final org.telegram.ui.web.b1 b1Var = (org.telegram.ui.web.b1) this.f40529k;
                final String str2 = (String) this.h;
                final org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) this.f40530l;
                final Integer num = (Integer) obj;
                if (((int[]) this.e)[0] != num.intValue()) {
                    final org.telegram.ui.ActionBar.a2 a2Var = new org.telegram.ui.ActionBar.a2(ApplicationLoader.applicationContext, 3, null);
                    a2Var.q(200L);
                    ConnectionsManager.getInstance(num.intValue()).sendRequestTyped(tL_messages_requestUrlAuth, new Object(), new Utilities.Callback2() {
                        @Override
                        public final void run(Object obj2, Object obj3) {
                            CharSequence replaceSingleLinkBold;
                            TLRPC.UrlAuthResult urlAuthResult2 = (TLRPC.UrlAuthResult) obj2;
                            TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                            org.telegram.ui.ActionBar.a2.this.dismiss();
                            org.telegram.ui.ActionBar.e3 e3Var2 = e3Var;
                            if (urlAuthResult2 != null) {
                                e3Var2.dismiss();
                                cl0.b(z10, num.intValue(), tL_messages_requestUrlAuth, urlAuthResult2, str, urlAuthResult, strArr[0], z11, b1Var);
                            } else if (tL_error != null) {
                                if ("URL_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                                    e3Var2.dismiss();
                                    org.telegram.ui.Components.xc a2 = cl0.a();
                                    int i10 = R.raw.error;
                                    String string = LocaleController.getString(R.string.BotAuthLoggedInFailTitle);
                                    String str3 = str2;
                                    if (TextUtils.isEmpty(str3)) {
                                        replaceSingleLinkBold = LocaleController.getString(R.string.BotAuthLoggedInFailNoDomain);
                                    } else {
                                        replaceSingleLinkBold = AndroidUtilities.replaceSingleLinkBold(LocaleController.formatString(R.string.BotAuthLoggedInFail, str3), org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Gi, d6Var));
                                    }
                                    a2.M(string, replaceSingleLinkBold, i10).j();
                                    return;
                                }
                                org.telegram.ui.Cells.c1.r(e3Var2.topBulletinContainer, e3Var2.getResourcesProvider(), tL_error, false);
                            }
                        }
                    });
                    return;
                }
                return;
            default:
                final a71 a71Var = (a71) this.e;
                final String str3 = this.f40523b;
                final boolean z12 = this.f40524c;
                final ArrayList arrayList = (ArrayList) this.f40525f;
                final HashMap hashMap = (HashMap) this.f40526g;
                final ArrayList arrayList2 = (ArrayList) this.h;
                final LinkedHashSet linkedHashSet = (LinkedHashSet) this.f40527i;
                final LinkedHashSet linkedHashSet2 = (LinkedHashSet) this.f40528j;
                final ArrayList arrayList3 = (ArrayList) this.f40529k;
                final ArrayList arrayList4 = (ArrayList) this.f40530l;
                final boolean z13 = this.d;
                Runnable runnable = (Runnable) obj;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        a71 a71Var2 = a71.this;
                        d51 d51Var = a71Var2.I1;
                        if (d51Var != null) {
                            AndroidUtilities.cancelRunOnUIThread(d51Var);
                            a71Var2.I1 = null;
                        }
                        String str4 = a71Var2.f32068z1;
                        String str5 = str3;
                        if (str5 != str4) {
                            return;
                        }
                        a71Var2.f32066y1 = true;
                        a71Var2.z(true, z12);
                        r51 r51Var = a71Var2.f32023f0;
                        if (r51Var != null) {
                            r51Var.d(true);
                        }
                        ArrayList arrayList5 = a71Var2.A1;
                        if (arrayList5 == null) {
                            a71Var2.A1 = new ArrayList();
                        } else {
                            arrayList5.clear();
                        }
                        ArrayList arrayList6 = a71Var2.D1;
                        if (arrayList6 == null) {
                            a71Var2.D1 = new ArrayList();
                        } else {
                            arrayList6.clear();
                        }
                        ArrayList arrayList7 = a71Var2.C1;
                        if (arrayList7 == null) {
                            a71Var2.C1 = new ArrayList();
                        } else {
                            arrayList7.clear();
                        }
                        ArrayList arrayList8 = a71Var2.B1;
                        if (arrayList8 == null) {
                            a71Var2.B1 = new ArrayList();
                        } else {
                            arrayList8.clear();
                        }
                        int i10 = 0;
                        a71Var2.f32029i0.u0(0);
                        int i11 = a71Var2.W;
                        if (i11 == 1 || i11 == 14 || i11 == 11 || i11 == 2) {
                            ArrayList arrayList9 = arrayList;
                            if (!arrayList9.isEmpty()) {
                                a71Var2.A1.addAll(arrayList9);
                            } else {
                                TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) hashMap.get(str5);
                                if (tL_availableReaction != null) {
                                    a71Var2.A1.add(zg.o0.c(tL_availableReaction));
                                }
                            }
                            ArrayList arrayList10 = arrayList2;
                            if (!arrayList10.isEmpty()) {
                                a71Var2.B1.addAll(arrayList10);
                            }
                        }
                        Iterator it = linkedHashSet.iterator();
                        while (it.hasNext()) {
                            Long l4 = (Long) it.next();
                            l4.getClass();
                            ArrayList arrayList11 = a71Var2.A1;
                            ?? obj2 = new Object();
                            long longValue = l4.longValue();
                            obj2.f49397g = longValue;
                            obj2.h = longValue;
                            arrayList11.add(obj2);
                        }
                        Iterator it2 = linkedHashSet2.iterator();
                        while (it2.hasNext()) {
                            a71Var2.A1.add(zg.o0.b((String) it2.next()));
                        }
                        a71Var2.D1.addAll(arrayList3);
                        ArrayList arrayList12 = arrayList4;
                        int size = arrayList12.size();
                        while (i10 < size) {
                            Object obj3 = arrayList12.get(i10);
                            i10++;
                            a71Var2.C1.addAll((ArrayList) obj3);
                        }
                        a71Var2.f32044q0.E(true ^ z13);
                    }
                });
                return;
        }
    }

    public zk0(int[] iArr, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, org.telegram.ui.ActionBar.e3 e3Var, boolean z10, String str, TLRPC.UrlAuthResult urlAuthResult, String[] strArr, boolean z11, org.telegram.ui.web.b1 b1Var, String str2, org.telegram.ui.ActionBar.d6 d6Var) {
        this.e = iArr;
        this.f40525f = tL_messages_requestUrlAuth;
        this.f40526g = e3Var;
        this.f40524c = z10;
        this.f40523b = str;
        this.f40527i = urlAuthResult;
        this.f40528j = strArr;
        this.d = z11;
        this.f40529k = b1Var;
        this.h = str2;
        this.f40530l = d6Var;
    }
}
