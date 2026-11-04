package org.telegram.ui;

import android.text.TextUtils;
import java.util.Arrays;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
public final class wh0 implements Runnable {
    public final org.telegram.ui.ActionBar.e6 E;
    public final boolean F;
    public final String G;
    public final org.telegram.ui.web.w0 H;
    public final gi.d f51151a;
    public final gi.d f51152b;
    public final TLRPC.TL_urlAuthResultRequest f51153c;
    public final TL_wallet.inputTonConnectOauthSession[] d;
    public final TLRPC.TL_messages_requestUrlAuth f51154e;
    public final String[] f51155f;
    public final org.telegram.ui.Cells.q8 h;
    public final boolean[] f51156n;
    public final boolean[] f51157r;
    public final int[] f51158s;
    public final boolean[] f51159w;
    public final org.telegram.ui.ActionBar.t2 f51160x;
    public final String f51161y;

    public wh0(gi.d dVar, gi.d dVar2, TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest, TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, String[] strArr, org.telegram.ui.Cells.q8 q8Var, boolean[] zArr, boolean[] zArr2, int[] iArr, boolean[] zArr3, org.telegram.ui.ActionBar.t2 t2Var, String str, org.telegram.ui.ActionBar.e6 e6Var, boolean z10, String str2, org.telegram.ui.web.w0 w0Var) {
        this.f51151a = dVar;
        this.f51152b = dVar2;
        this.f51153c = tL_urlAuthResultRequest;
        this.d = inputtonconnectoauthsessionArr;
        this.f51154e = tL_messages_requestUrlAuth;
        this.f51155f = strArr;
        this.h = q8Var;
        this.f51156n = zArr;
        this.f51157r = zArr2;
        this.f51158s = iArr;
        this.f51159w = zArr3;
        this.f51160x = t2Var;
        this.f51161y = str;
        this.E = e6Var;
        this.F = z10;
        this.G = str2;
        this.H = w0Var;
    }

    @Override
    public final void run() {
        final gi.d dVar = this.f51151a;
        if (!dVar.R && !this.f51152b.R) {
            final TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest = this.f51153c;
            boolean z10 = tL_urlAuthResultRequest.request_wallet;
            TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr = this.d;
            if (!z10 || inputtonconnectoauthsessionArr[0] != null) {
                boolean z11 = true;
                dVar.setLoading(true);
                final TLRPC.TL_messages_acceptUrlAuth tL_messages_acceptUrlAuth = new TLRPC.TL_messages_acceptUrlAuth();
                final TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = this.f51154e;
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
                String str = this.f51155f[0];
                if (str != null) {
                    tL_messages_acceptUrlAuth.match_code = str;
                }
                org.telegram.ui.Cells.q8 q8Var = this.h;
                if (q8Var == null || !q8Var.f30234e.h) {
                    z11 = false;
                }
                tL_messages_acceptUrlAuth.write_allowed = z11;
                tL_messages_acceptUrlAuth.share_phone_number = this.f51156n[0];
                TL_wallet.inputTonConnectOauthSession inputtonconnectoauthsession = inputtonconnectoauthsessionArr[0];
                tL_messages_acceptUrlAuth.tonconnect_session = inputtonconnectoauthsession;
                inputtonconnectoauthsessionArr[0] = null;
                if (this.f51157r[0]) {
                    if (inputtonconnectoauthsession != null) {
                        Arrays.fill(inputtonconnectoauthsession.challenge_answer, (byte) 0);
                        return;
                    }
                    return;
                }
                final int[] iArr = this.f51158s;
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(iArr[0]);
                c3.b bVar = new c3.b(1);
                final boolean[] zArr = this.f51159w;
                final org.telegram.ui.ActionBar.t2 t2Var = this.f51160x;
                final String str2 = this.f51161y;
                final org.telegram.ui.ActionBar.e6 e6Var = this.E;
                final boolean z12 = this.F;
                final String str3 = this.G;
                final org.telegram.ui.web.w0 w0Var = this.H;
                connectionsManager.sendRequestTyped(tL_messages_acceptUrlAuth, bVar, new org.telegram.messenger.n10() {
                    @Override
                    public final void a(Object obj, Object obj2) {
                        CharSequence P2;
                        TLRPC.UrlAuthResult urlAuthResult = (TLRPC.UrlAuthResult) obj;
                        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                        gi.d.this.setLoading(false);
                        TLRPC.TL_messages_acceptUrlAuth tL_messages_acceptUrlAuth2 = tL_messages_acceptUrlAuth;
                        TL_wallet.inputTonConnectOauthSession inputtonconnectoauthsession2 = tL_messages_acceptUrlAuth2.tonconnect_session;
                        if (inputtonconnectoauthsession2 != null) {
                            Arrays.fill(inputtonconnectoauthsession2.challenge_answer, (byte) 0);
                        }
                        zArr[0] = true;
                        t2Var.dismiss();
                        if (tL_error != null) {
                            if ("URL_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                                org.telegram.ui.Components.fc a10 = yh0.a();
                                String M0 = org.telegram.messenger.bd.M0(2131753128, null);
                                String str4 = str2;
                                if (TextUtils.isEmpty(str4)) {
                                    P2 = org.telegram.messenger.bd.M0(2131753129, null);
                                } else {
                                    P2 = org.telegram.messenger.g0.P2(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.uj, e6Var), org.telegram.messenger.bd.a0(null, null, 2131753130, str4));
                                }
                                a10.I(2131624011, M0, P2).j();
                                return;
                            }
                            yh0.a().f0(tL_error, false);
                            return;
                        }
                        yh0.b(z12, iArr[0], tL_messages_requestUrlAuth, urlAuthResult, str3, tL_urlAuthResultRequest, null, tL_messages_acceptUrlAuth2.share_phone_number, w0Var);
                    }
                });
            }
        }
    }
}
