package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class zk0 implements Utilities.Callback {
    public final int[] f46310a;
    public final fi.d f46311b;
    public final fi.d f46312c;
    public final TLRPC.TL_messages_requestUrlAuth d;
    public final org.telegram.ui.ActionBar.k3 e;
    public final boolean f46313f;
    public final String f46314g;
    public final TLRPC.UrlAuthResult h;
    public final String[] f46315i;
    public final boolean f46316j;
    public final org.telegram.ui.web.a1 f46317k;
    public final String f46318l;
    public final org.telegram.ui.ActionBar.u6 f46319m;

    public zk0(int[] iArr, fi.d dVar, fi.d dVar2, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, org.telegram.ui.ActionBar.k3 k3Var, boolean z10, String str, TLRPC.UrlAuthResult urlAuthResult, String[] strArr, boolean z11, org.telegram.ui.web.a1 a1Var, String str2, org.telegram.ui.ActionBar.u6 u6Var) {
        this.f46310a = iArr;
        this.f46311b = dVar;
        this.f46312c = dVar2;
        this.d = tL_messages_requestUrlAuth;
        this.e = k3Var;
        this.f46313f = z10;
        this.f46314g = str;
        this.h = urlAuthResult;
        this.f46315i = strArr;
        this.f46316j = z11;
        this.f46317k = a1Var;
        this.f46318l = str2;
        this.f46319m = u6Var;
    }

    @Override
    public final void run(Object obj) {
        int[] iArr = this.f46310a;
        fi.d dVar = this.f46311b;
        fi.d dVar2 = this.f46312c;
        final TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = this.d;
        final org.telegram.ui.ActionBar.k3 k3Var = this.e;
        final boolean z10 = this.f46313f;
        final String str = this.f46314g;
        final TLRPC.UrlAuthResult urlAuthResult = this.h;
        final String[] strArr = this.f46315i;
        final boolean z11 = this.f46316j;
        final org.telegram.ui.web.a1 a1Var = this.f46317k;
        final String str2 = this.f46318l;
        final org.telegram.ui.ActionBar.u6 u6Var = this.f46319m;
        final Integer num = (Integer) obj;
        if (iArr[0] != num.intValue() && !dVar.Q && !dVar2.Q) {
            final org.telegram.ui.ActionBar.e2 e2Var = new org.telegram.ui.ActionBar.e2(ApplicationLoader.applicationContext, 3, null);
            e2Var.r(200L);
            ConnectionsManager.getInstance(num.intValue()).sendRequestTyped(tL_messages_requestUrlAuth, new Object(), new Utilities.Callback2() {
                @Override
                public final void run(Object obj2, Object obj3) {
                    CharSequence replaceSingleLinkBold;
                    TLRPC.UrlAuthResult urlAuthResult2 = (TLRPC.UrlAuthResult) obj2;
                    TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                    org.telegram.ui.ActionBar.e2.this.dismiss();
                    org.telegram.ui.ActionBar.k3 k3Var2 = k3Var;
                    if (urlAuthResult2 != null) {
                        k3Var2.dismiss();
                        dl0.b(z10, num.intValue(), tL_messages_requestUrlAuth, urlAuthResult2, str, urlAuthResult, strArr[0], z11, a1Var);
                    } else if (tL_error != null) {
                        if ("URL_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                            k3Var2.dismiss();
                            org.telegram.ui.Components.wc a2 = dl0.a();
                            int i10 = R.raw.error;
                            String string = LocaleController.getString(R.string.BotAuthLoggedInFailTitle);
                            String str3 = str2;
                            if (TextUtils.isEmpty(str3)) {
                                replaceSingleLinkBold = LocaleController.getString(R.string.BotAuthLoggedInFailNoDomain);
                            } else {
                                replaceSingleLinkBold = AndroidUtilities.replaceSingleLinkBold(LocaleController.formatString(R.string.BotAuthLoggedInFail, str3), org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Gi, u6Var));
                            }
                            a2.M(string, replaceSingleLinkBold, i10).j();
                            return;
                        }
                        d3.t(k3Var2.topBulletinContainer, k3Var2.getResourcesProvider(), tL_error, false);
                    }
                }
            });
        }
    }
}
