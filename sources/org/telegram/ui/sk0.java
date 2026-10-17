package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class sk0 implements Utilities.Callback {
    public final int[] f41123a;
    public final ei.d f41124b;
    public final ei.d f41125c;
    public final TLRPC.TL_messages_requestUrlAuth d;
    public final org.telegram.ui.ActionBar.f3 e;
    public final boolean f41126f;
    public final String f41127g;
    public final TLRPC.UrlAuthResult h;
    public final String[] f41128i;
    public final boolean f41129j;
    public final org.telegram.ui.web.a1 f41130k;
    public final String f41131l;
    public final org.telegram.ui.ActionBar.d6 f41132m;

    public sk0(int[] iArr, ei.d dVar, ei.d dVar2, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, org.telegram.ui.ActionBar.f3 f3Var, boolean z10, String str, TLRPC.UrlAuthResult urlAuthResult, String[] strArr, boolean z11, org.telegram.ui.web.a1 a1Var, String str2, org.telegram.ui.ActionBar.d6 d6Var) {
        this.f41123a = iArr;
        this.f41124b = dVar;
        this.f41125c = dVar2;
        this.d = tL_messages_requestUrlAuth;
        this.e = f3Var;
        this.f41126f = z10;
        this.f41127g = str;
        this.h = urlAuthResult;
        this.f41128i = strArr;
        this.f41129j = z11;
        this.f41130k = a1Var;
        this.f41131l = str2;
        this.f41132m = d6Var;
    }

    @Override
    public final void run(Object obj) {
        int[] iArr = this.f41123a;
        ei.d dVar = this.f41124b;
        ei.d dVar2 = this.f41125c;
        final TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = this.d;
        final org.telegram.ui.ActionBar.f3 f3Var = this.e;
        final boolean z10 = this.f41126f;
        final String str = this.f41127g;
        final TLRPC.UrlAuthResult urlAuthResult = this.h;
        final String[] strArr = this.f41128i;
        final boolean z11 = this.f41129j;
        final org.telegram.ui.web.a1 a1Var = this.f41130k;
        final String str2 = this.f41131l;
        final org.telegram.ui.ActionBar.d6 d6Var = this.f41132m;
        final Integer num = (Integer) obj;
        if (iArr[0] != num.intValue() && !dVar.N && !dVar2.N) {
            final org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(ApplicationLoader.applicationContext, 3, null);
            b2Var.q(200L);
            ConnectionsManager.getInstance(num.intValue()).sendRequestTyped(tL_messages_requestUrlAuth, new Object(), new Utilities.Callback2() {
                @Override
                public final void run(Object obj2, Object obj3) {
                    CharSequence replaceSingleLinkBold;
                    TLRPC.UrlAuthResult urlAuthResult2 = (TLRPC.UrlAuthResult) obj2;
                    TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                    org.telegram.ui.ActionBar.b2.this.dismiss();
                    org.telegram.ui.ActionBar.f3 f3Var2 = f3Var;
                    if (urlAuthResult2 != null) {
                        f3Var2.dismiss();
                        wk0.b(z10, num.intValue(), tL_messages_requestUrlAuth, urlAuthResult2, str, urlAuthResult, strArr[0], z11, a1Var);
                    } else if (tL_error != null) {
                        if ("URL_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                            f3Var2.dismiss();
                            org.telegram.ui.Components.xc a2 = wk0.a();
                            int i10 = R.raw.error;
                            String string = LocaleController.getString(R.string.BotAuthLoggedInFailTitle);
                            String str3 = str2;
                            if (TextUtils.isEmpty(str3)) {
                                replaceSingleLinkBold = LocaleController.getString(R.string.BotAuthLoggedInFailNoDomain);
                            } else {
                                replaceSingleLinkBold = AndroidUtilities.replaceSingleLinkBold(LocaleController.formatString(R.string.BotAuthLoggedInFail, str3), org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Gi, d6Var));
                            }
                            a2.M(string, replaceSingleLinkBold, i10).j();
                            return;
                        }
                        org.telegram.ui.Cells.t0.t(f3Var2.topBulletinContainer, f3Var2.getResourcesProvider(), tL_error, false);
                    }
                }
            });
        }
    }
}
