package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class rk0 implements Runnable {
    public final org.telegram.ui.web.z0 A;

    public final lh.d f41950a;

    public final lh.d f41951b;

    public final TLRPC.TL_messages_requestUrlAuth f41952c;
    public final String[] d;

    public final org.telegram.ui.Cells.p8 f41953e;

    public final boolean[] f41954f;
    public final int[] h;

    public final boolean[] f41955n;

    public final org.telegram.ui.ActionBar.e3 f41956r;

    public final String f41957s;
    public final org.telegram.ui.ActionBar.c6 v;

    public final boolean f41958w;

    public final String f41959x;

    public final TLRPC.TL_urlAuthResultRequest f41960y;

    public rk0(lh.d dVar, lh.d dVar2, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, String[] strArr, org.telegram.ui.Cells.p8 p8Var, boolean[] zArr, int[] iArr, boolean[] zArr2, org.telegram.ui.ActionBar.e3 e3Var, String str, org.telegram.ui.ActionBar.c6 c6Var, boolean z10, String str2, TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest, org.telegram.ui.web.z0 z0Var) {
        this.f41950a = dVar;
        this.f41951b = dVar2;
        this.f41952c = tL_messages_requestUrlAuth;
        this.d = strArr;
        this.f41953e = p8Var;
        this.f41954f = zArr;
        this.h = iArr;
        this.f41955n = zArr2;
        this.f41956r = e3Var;
        this.f41957s = str;
        this.v = c6Var;
        this.f41958w = z10;
        this.f41959x = str2;
        this.f41960y = tL_urlAuthResultRequest;
        this.A = z0Var;
    }

    @Override
    public final void run() {
        lh.d dVar = this.f41950a;
        if (dVar.J || this.f41951b.J) {
            return;
        }
        dVar.setLoading(true);
        final TLRPC.TL_messages_acceptUrlAuth tL_messages_acceptUrlAuth = new TLRPC.TL_messages_acceptUrlAuth();
        final TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = this.f41952c;
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
        org.telegram.ui.Cells.p8 p8Var = this.f41953e;
        tL_messages_acceptUrlAuth.write_allowed = p8Var != null && p8Var.f25003e.h;
        tL_messages_acceptUrlAuth.share_phone_number = this.f41954f[0];
        final int[] iArr = this.h;
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(iArr[0]);
        org.telegram.messenger.a aVar = new org.telegram.messenger.a();
        final boolean[] zArr = this.f41955n;
        final org.telegram.ui.ActionBar.e3 e3Var = this.f41956r;
        final String str2 = this.f41957s;
        final org.telegram.ui.ActionBar.c6 c6Var = this.v;
        final boolean z10 = this.f41958w;
        final String str3 = this.f41959x;
        final TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest = this.f41960y;
        final org.telegram.ui.web.z0 z0Var = this.A;
        connectionsManager.sendRequestTyped(tL_messages_acceptUrlAuth, aVar, new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                TLRPC.UrlAuthResult urlAuthResult = (TLRPC.UrlAuthResult) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                zArr[0] = true;
                e3Var.dismiss();
                if (tL_error == null) {
                    tk0.b(z10, iArr[0], tL_messages_requestUrlAuth, urlAuthResult, str3, tL_urlAuthResultRequest, null, tL_messages_acceptUrlAuth.share_phone_number, z0Var);
                    return;
                }
                if (!"URL_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                    tk0.a().d0(tL_error, false);
                    return;
                }
                org.telegram.ui.Components.mc mcVarA = tk0.a();
                int i10 = R.raw.error;
                String string = LocaleController.getString(R.string.BotAuthLoggedInFailTitle);
                String str4 = str2;
                mcVarA.M(string, TextUtils.isEmpty(str4) ? LocaleController.getString(R.string.BotAuthLoggedInFailNoDomain) : AndroidUtilities.replaceSingleLinkBold(LocaleController.formatString(R.string.BotAuthLoggedInFail, str4), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Gi, c6Var)), i10).j();
            }
        });
    }
}
