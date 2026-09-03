package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class xk0 implements Runnable {
    public final org.telegram.ui.web.a1 B;
    public final qh.d f43065a;
    public final qh.d f43066b;
    public final TLRPC.TL_messages_requestUrlAuth f43067c;
    public final String[] d;
    public final org.telegram.ui.Cells.s8 f43068e;
    public final boolean[] f43069f;
    public final int[] h;
    public final boolean[] f43070n;
    public final org.telegram.ui.ActionBar.h3 f43071r;
    public final String f43072s;
    public final org.telegram.ui.ActionBar.g6 v;
    public final boolean f43073w;
    public final String f43074x;
    public final TLRPC.TL_urlAuthResultRequest f43075y;

    public xk0(qh.d dVar, qh.d dVar2, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, String[] strArr, org.telegram.ui.Cells.s8 s8Var, boolean[] zArr, int[] iArr, boolean[] zArr2, org.telegram.ui.ActionBar.h3 h3Var, String str, org.telegram.ui.ActionBar.g6 g6Var, boolean z4, String str2, TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest, org.telegram.ui.web.a1 a1Var) {
        this.f43065a = dVar;
        this.f43066b = dVar2;
        this.f43067c = tL_messages_requestUrlAuth;
        this.d = strArr;
        this.f43068e = s8Var;
        this.f43069f = zArr;
        this.h = iArr;
        this.f43070n = zArr2;
        this.f43071r = h3Var;
        this.f43072s = str;
        this.v = g6Var;
        this.f43073w = z4;
        this.f43074x = str2;
        this.f43075y = tL_urlAuthResultRequest;
        this.B = a1Var;
    }

    @Override
    public final void run() {
        qh.d dVar = this.f43065a;
        if (dVar.K || this.f43066b.K) {
            return;
        }
        boolean z4 = true;
        dVar.setLoading(true);
        final TLRPC.TL_messages_acceptUrlAuth tL_messages_acceptUrlAuth = new TLRPC.TL_messages_acceptUrlAuth();
        final TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = this.f43067c;
        if (TLObject.hasFlag(tL_messages_requestUrlAuth.flags, 2)) {
            tL_messages_acceptUrlAuth.flags |= 2;
            tL_messages_acceptUrlAuth.peer = tL_messages_requestUrlAuth.peer;
            tL_messages_acceptUrlAuth.msg_id = tL_messages_requestUrlAuth.msg_id;
            tL_messages_acceptUrlAuth.button_id = tL_messages_requestUrlAuth.button_id;
        }
        if (TLObject.hasFlag(tL_messages_requestUrlAuth.flags, 4)) {
            tL_messages_acceptUrlAuth.flags |= 4;
            tL_messages_acceptUrlAuth.url = tL_messages_requestUrlAuth.url;
        }
        String str = this.d[0];
        if (str != null) {
            tL_messages_acceptUrlAuth.match_code = str;
        }
        org.telegram.ui.Cells.s8 s8Var = this.f43068e;
        tL_messages_acceptUrlAuth.write_allowed = (s8Var == null || !s8Var.f23755e.h) ? false : false;
        tL_messages_acceptUrlAuth.share_phone_number = this.f43069f[0];
        final int[] iArr = this.h;
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(iArr[0]);
        ?? obj = new Object();
        final boolean[] zArr = this.f43070n;
        final org.telegram.ui.ActionBar.h3 h3Var = this.f43071r;
        final String str2 = this.f43072s;
        final org.telegram.ui.ActionBar.g6 g6Var = this.v;
        final boolean z10 = this.f43073w;
        final String str3 = this.f43074x;
        final TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest = this.f43075y;
        final org.telegram.ui.web.a1 a1Var = this.B;
        connectionsManager.sendRequestTyped(tL_messages_acceptUrlAuth, obj, new Utilities.Callback2() {
            @Override
            public final void run(Object obj2, Object obj3) {
                CharSequence replaceSingleLinkBold;
                TLRPC.UrlAuthResult urlAuthResult = (TLRPC.UrlAuthResult) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                zArr[0] = true;
                h3Var.dismiss();
                if (tL_error != null) {
                    if ("URL_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                        org.telegram.ui.Components.qc a2 = zk0.a();
                        int i10 = R.raw.error;
                        String string = LocaleController.getString(R.string.BotAuthLoggedInFailTitle);
                        String str4 = str2;
                        if (TextUtils.isEmpty(str4)) {
                            replaceSingleLinkBold = LocaleController.getString(R.string.BotAuthLoggedInFailNoDomain);
                        } else {
                            replaceSingleLinkBold = AndroidUtilities.replaceSingleLinkBold(LocaleController.formatString(R.string.BotAuthLoggedInFail, str4), org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Gi, g6Var));
                        }
                        a2.M(string, replaceSingleLinkBold, i10).j();
                        return;
                    }
                    zk0.a().d0(tL_error, false);
                    return;
                }
                zk0.b(z10, iArr[0], tL_messages_requestUrlAuth, urlAuthResult, str3, tL_urlAuthResultRequest, null, tL_messages_acceptUrlAuth.share_phone_number, a1Var);
            }
        });
    }
}
