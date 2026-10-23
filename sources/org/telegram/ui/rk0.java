package org.telegram.ui;

import android.text.TextUtils;
import java.util.Arrays;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
public final class rk0 implements Runnable {
    public final boolean E;
    public final String F;
    public final org.telegram.ui.web.a1 G;
    public final ei.d f41235a;
    public final ei.d f41236b;
    public final TLRPC.TL_urlAuthResultRequest f41237c;
    public final TL_wallet.inputTonConnectOauthSession[] d;
    public final TLRPC.TL_messages_requestUrlAuth e;
    public final String[] f41238f;
    public final org.telegram.ui.Cells.v8 h;
    public final boolean[] f41239n;
    public final boolean[] f41240r;
    public final int[] f41241s;
    public final boolean[] v;
    public final org.telegram.ui.ActionBar.f3 f41242w;
    public final String f41243x;
    public final org.telegram.ui.ActionBar.d6 f41244y;

    public rk0(ei.d dVar, ei.d dVar2, TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest, TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, String[] strArr, org.telegram.ui.Cells.v8 v8Var, boolean[] zArr, boolean[] zArr2, int[] iArr, boolean[] zArr3, org.telegram.ui.ActionBar.f3 f3Var, String str, org.telegram.ui.ActionBar.d6 d6Var, boolean z10, String str2, org.telegram.ui.web.a1 a1Var) {
        this.f41235a = dVar;
        this.f41236b = dVar2;
        this.f41237c = tL_urlAuthResultRequest;
        this.d = inputtonconnectoauthsessionArr;
        this.e = tL_messages_requestUrlAuth;
        this.f41238f = strArr;
        this.h = v8Var;
        this.f41239n = zArr;
        this.f41240r = zArr2;
        this.f41241s = iArr;
        this.v = zArr3;
        this.f41242w = f3Var;
        this.f41243x = str;
        this.f41244y = d6Var;
        this.E = z10;
        this.F = str2;
        this.G = a1Var;
    }

    @Override
    public final void run() {
        final ei.d dVar = this.f41235a;
        if (!dVar.N && !this.f41236b.N) {
            final TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest = this.f41237c;
            boolean z10 = tL_urlAuthResultRequest.request_wallet;
            TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr = this.d;
            if (!z10 || inputtonconnectoauthsessionArr[0] != null) {
                boolean z11 = true;
                dVar.setLoading(true);
                final TLRPC.TL_messages_acceptUrlAuth tL_messages_acceptUrlAuth = new TLRPC.TL_messages_acceptUrlAuth();
                final TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = this.e;
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
                String str = this.f41238f[0];
                if (str != null) {
                    tL_messages_acceptUrlAuth.match_code = str;
                }
                org.telegram.ui.Cells.v8 v8Var = this.h;
                if (v8Var == null || !v8Var.e.h) {
                    z11 = false;
                }
                tL_messages_acceptUrlAuth.write_allowed = z11;
                tL_messages_acceptUrlAuth.share_phone_number = this.f41239n[0];
                TL_wallet.inputTonConnectOauthSession inputtonconnectoauthsession = inputtonconnectoauthsessionArr[0];
                tL_messages_acceptUrlAuth.tonconnect_session = inputtonconnectoauthsession;
                inputtonconnectoauthsessionArr[0] = null;
                if (this.f41240r[0]) {
                    if (inputtonconnectoauthsession != null) {
                        Arrays.fill(inputtonconnectoauthsession.challenge_answer, (byte) 0);
                        return;
                    }
                    return;
                }
                final int[] iArr = this.f41241s;
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(iArr[0]);
                ?? obj = new Object();
                final boolean[] zArr = this.v;
                final org.telegram.ui.ActionBar.f3 f3Var = this.f41242w;
                final String str2 = this.f41243x;
                final org.telegram.ui.ActionBar.d6 d6Var = this.f41244y;
                final boolean z12 = this.E;
                final String str3 = this.F;
                final org.telegram.ui.web.a1 a1Var = this.G;
                connectionsManager.sendRequestTyped(tL_messages_acceptUrlAuth, obj, new Utilities.Callback2() {
                    @Override
                    public final void run(Object obj2, Object obj3) {
                        CharSequence replaceSingleLinkBold;
                        TLRPC.UrlAuthResult urlAuthResult = (TLRPC.UrlAuthResult) obj2;
                        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                        ei.d.this.setLoading(false);
                        TLRPC.TL_messages_acceptUrlAuth tL_messages_acceptUrlAuth2 = tL_messages_acceptUrlAuth;
                        TL_wallet.inputTonConnectOauthSession inputtonconnectoauthsession2 = tL_messages_acceptUrlAuth2.tonconnect_session;
                        if (inputtonconnectoauthsession2 != null) {
                            Arrays.fill(inputtonconnectoauthsession2.challenge_answer, (byte) 0);
                        }
                        zArr[0] = true;
                        f3Var.dismiss();
                        if (tL_error != null) {
                            if ("URL_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                                org.telegram.ui.Components.xc a2 = uk0.a();
                                int i10 = R.raw.error;
                                String string = LocaleController.getString(R.string.BotAuthLoggedInFailTitle);
                                String str4 = str2;
                                if (TextUtils.isEmpty(str4)) {
                                    replaceSingleLinkBold = LocaleController.getString(R.string.BotAuthLoggedInFailNoDomain);
                                } else {
                                    replaceSingleLinkBold = AndroidUtilities.replaceSingleLinkBold(LocaleController.formatString(R.string.BotAuthLoggedInFail, str4), org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Gi, d6Var));
                                }
                                a2.M(string, replaceSingleLinkBold, i10).j();
                                return;
                            }
                            uk0.a().f0(tL_error, false);
                            return;
                        }
                        uk0.b(z12, iArr[0], tL_messages_requestUrlAuth, urlAuthResult, str3, tL_urlAuthResultRequest, null, tL_messages_acceptUrlAuth2.share_phone_number, a1Var);
                    }
                });
            }
        }
    }
}
