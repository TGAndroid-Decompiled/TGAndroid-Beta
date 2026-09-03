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
    public final org.telegram.ui.web.c1 B;
    public final ph.d f40007a;
    public final ph.d f40008b;
    public final TLRPC.TL_messages_requestUrlAuth f40009c;
    public final String[] d;
    public final org.telegram.ui.Cells.r8 e;
    public final boolean[] f40010f;
    public final int[] h;
    public final boolean[] f40011n;
    public final org.telegram.ui.ActionBar.g3 f40012r;
    public final String f40013s;
    public final org.telegram.ui.ActionBar.f6 v;
    public final boolean f40014w;
    public final String f40015x;
    public final TLRPC.TL_urlAuthResultRequest f40016y;

    public xk0(ph.d dVar, ph.d dVar2, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, String[] strArr, org.telegram.ui.Cells.r8 r8Var, boolean[] zArr, int[] iArr, boolean[] zArr2, org.telegram.ui.ActionBar.g3 g3Var, String str, org.telegram.ui.ActionBar.f6 f6Var, boolean z4, String str2, TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest, org.telegram.ui.web.c1 c1Var) {
        this.f40007a = dVar;
        this.f40008b = dVar2;
        this.f40009c = tL_messages_requestUrlAuth;
        this.d = strArr;
        this.e = r8Var;
        this.f40010f = zArr;
        this.h = iArr;
        this.f40011n = zArr2;
        this.f40012r = g3Var;
        this.f40013s = str;
        this.v = f6Var;
        this.f40014w = z4;
        this.f40015x = str2;
        this.f40016y = tL_urlAuthResultRequest;
        this.B = c1Var;
    }

    @Override
    public final void run() {
        ph.d dVar = this.f40007a;
        if (dVar.K || this.f40008b.K) {
            return;
        }
        boolean z4 = true;
        dVar.setLoading(true);
        final TLRPC.TL_messages_acceptUrlAuth tL_messages_acceptUrlAuth = new TLRPC.TL_messages_acceptUrlAuth();
        final TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = this.f40009c;
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
        org.telegram.ui.Cells.r8 r8Var = this.e;
        tL_messages_acceptUrlAuth.write_allowed = (r8Var == null || !r8Var.e.h) ? false : false;
        tL_messages_acceptUrlAuth.share_phone_number = this.f40010f[0];
        final int[] iArr = this.h;
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(iArr[0]);
        ?? obj = new Object();
        final boolean[] zArr = this.f40011n;
        final org.telegram.ui.ActionBar.g3 g3Var = this.f40012r;
        final String str2 = this.f40013s;
        final org.telegram.ui.ActionBar.f6 f6Var = this.v;
        final boolean z10 = this.f40014w;
        final String str3 = this.f40015x;
        final TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest = this.f40016y;
        final org.telegram.ui.web.c1 c1Var = this.B;
        connectionsManager.sendRequestTyped(tL_messages_acceptUrlAuth, obj, new Utilities.Callback2() {
            @Override
            public final void run(Object obj2, Object obj3) {
                CharSequence replaceSingleLinkBold;
                TLRPC.UrlAuthResult urlAuthResult = (TLRPC.UrlAuthResult) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                zArr[0] = true;
                g3Var.dismiss();
                if (tL_error != null) {
                    if ("URL_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                        org.telegram.ui.Components.qc a2 = zk0.a();
                        int i10 = R.raw.error;
                        String string = LocaleController.getString(R.string.BotAuthLoggedInFailTitle);
                        String str4 = str2;
                        if (TextUtils.isEmpty(str4)) {
                            replaceSingleLinkBold = LocaleController.getString(R.string.BotAuthLoggedInFailNoDomain);
                        } else {
                            replaceSingleLinkBold = AndroidUtilities.replaceSingleLinkBold(LocaleController.formatString(R.string.BotAuthLoggedInFail, str4), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Gi, f6Var));
                        }
                        a2.M(string, replaceSingleLinkBold, i10).j();
                        return;
                    }
                    zk0.a().d0(tL_error, false);
                    return;
                }
                zk0.b(z10, iArr[0], tL_messages_requestUrlAuth, urlAuthResult, str3, tL_urlAuthResultRequest, null, tL_messages_acceptUrlAuth.share_phone_number, c1Var);
            }
        });
    }
}
