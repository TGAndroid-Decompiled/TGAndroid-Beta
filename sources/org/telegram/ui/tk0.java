package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class tk0 implements Utilities.Callback {
    public final int[] f42029a;
    public final ei.d f42030b;
    public final ei.d f42031c;
    public final TLRPC.TL_messages_requestUrlAuth d;
    public final org.telegram.ui.ActionBar.h3 e;
    public final boolean f42032f;
    public final String f42033g;
    public final TLRPC.UrlAuthResult h;
    public final String[] f42034i;
    public final boolean f42035j;
    public final org.telegram.ui.web.b1 f42036k;
    public final String f42037l;
    public final org.telegram.ui.ActionBar.g6 f42038m;

    public tk0(int[] iArr, ei.d dVar, ei.d dVar2, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, org.telegram.ui.ActionBar.h3 h3Var, boolean z10, String str, TLRPC.UrlAuthResult urlAuthResult, String[] strArr, boolean z11, org.telegram.ui.web.b1 b1Var, String str2, org.telegram.ui.ActionBar.g6 g6Var) {
        this.f42029a = iArr;
        this.f42030b = dVar;
        this.f42031c = dVar2;
        this.d = tL_messages_requestUrlAuth;
        this.e = h3Var;
        this.f42032f = z10;
        this.f42033g = str;
        this.h = urlAuthResult;
        this.f42034i = strArr;
        this.f42035j = z11;
        this.f42036k = b1Var;
        this.f42037l = str2;
        this.f42038m = g6Var;
    }

    @Override
    public final void run(Object obj) {
        int[] iArr = this.f42029a;
        ei.d dVar = this.f42030b;
        ei.d dVar2 = this.f42031c;
        final TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = this.d;
        final org.telegram.ui.ActionBar.h3 h3Var = this.e;
        final boolean z10 = this.f42032f;
        final String str = this.f42033g;
        final TLRPC.UrlAuthResult urlAuthResult = this.h;
        final String[] strArr = this.f42034i;
        final boolean z11 = this.f42035j;
        final org.telegram.ui.web.b1 b1Var = this.f42036k;
        final String str2 = this.f42037l;
        final org.telegram.ui.ActionBar.g6 g6Var = this.f42038m;
        final Integer num = (Integer) obj;
        if (iArr[0] != num.intValue() && !dVar.Q && !dVar2.Q) {
            final org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(ApplicationLoader.applicationContext, 3, null);
            c2Var.r(200L);
            ConnectionsManager.getInstance(num.intValue()).sendRequestTyped(tL_messages_requestUrlAuth, new Object(), new Utilities.Callback2() {
                @Override
                public final void run(Object obj2, Object obj3) {
                    CharSequence replaceSingleLinkBold;
                    TLRPC.UrlAuthResult urlAuthResult2 = (TLRPC.UrlAuthResult) obj2;
                    TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                    org.telegram.ui.ActionBar.c2.this.dismiss();
                    org.telegram.ui.ActionBar.h3 h3Var2 = h3Var;
                    if (urlAuthResult2 != null) {
                        h3Var2.dismiss();
                        xk0.b(z10, num.intValue(), tL_messages_requestUrlAuth, urlAuthResult2, str, urlAuthResult, strArr[0], z11, b1Var);
                    } else if (tL_error != null) {
                        if ("URL_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                            h3Var2.dismiss();
                            org.telegram.ui.Components.xc a2 = xk0.a();
                            int i10 = R.raw.error;
                            String string = LocaleController.getString(R.string.BotAuthLoggedInFailTitle);
                            String str3 = str2;
                            if (TextUtils.isEmpty(str3)) {
                                replaceSingleLinkBold = LocaleController.getString(R.string.BotAuthLoggedInFailNoDomain);
                            } else {
                                replaceSingleLinkBold = AndroidUtilities.replaceSingleLinkBold(LocaleController.formatString(R.string.BotAuthLoggedInFail, str3), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Gi, g6Var));
                            }
                            a2.M(string, replaceSingleLinkBold, i10).j();
                            return;
                        }
                        org.telegram.ui.Cells.b1.s(h3Var2.topBulletinContainer, h3Var2.getResourcesProvider(), tL_error, false);
                    }
                }
            });
        }
    }
}
