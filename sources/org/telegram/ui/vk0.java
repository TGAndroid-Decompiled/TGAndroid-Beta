package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class vk0 implements Runnable {
    public final org.telegram.ui.web.a1 B;
    public final ph.d f39197a;
    public final ph.d f39198b;
    public final TLRPC.TL_messages_requestUrlAuth f39199c;
    public final String[] d;
    public final org.telegram.ui.Cells.s8 e;
    public final boolean[] f39200f;
    public final int[] h;
    public final boolean[] f39201n;
    public final org.telegram.ui.ActionBar.g3 f39202r;
    public final String f39203s;
    public final org.telegram.ui.ActionBar.f6 v;
    public final boolean f39204w;
    public final String f39205x;
    public final TLRPC.TL_urlAuthResultRequest f39206y;

    public vk0(ph.d dVar, ph.d dVar2, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, String[] strArr, org.telegram.ui.Cells.s8 s8Var, boolean[] zArr, int[] iArr, boolean[] zArr2, org.telegram.ui.ActionBar.g3 g3Var, String str, org.telegram.ui.ActionBar.f6 f6Var, boolean z4, String str2, TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest, org.telegram.ui.web.a1 a1Var) {
        this.f39197a = dVar;
        this.f39198b = dVar2;
        this.f39199c = tL_messages_requestUrlAuth;
        this.d = strArr;
        this.e = s8Var;
        this.f39200f = zArr;
        this.h = iArr;
        this.f39201n = zArr2;
        this.f39202r = g3Var;
        this.f39203s = str;
        this.v = f6Var;
        this.f39204w = z4;
        this.f39205x = str2;
        this.f39206y = tL_urlAuthResultRequest;
        this.B = a1Var;
    }

    @Override
    public final void run() {
        ph.d dVar = this.f39197a;
        if (dVar.K || this.f39198b.K) {
            return;
        }
        boolean z4 = true;
        dVar.setLoading(true);
        final TLRPC.TL_messages_acceptUrlAuth tL_messages_acceptUrlAuth = new TLRPC.TL_messages_acceptUrlAuth();
        final TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = this.f39199c;
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
        org.telegram.ui.Cells.s8 s8Var = this.e;
        tL_messages_acceptUrlAuth.write_allowed = (s8Var == null || !s8Var.e.h) ? false : false;
        tL_messages_acceptUrlAuth.share_phone_number = this.f39200f[0];
        final int[] iArr = this.h;
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(iArr[0]);
        ?? obj = new Object();
        final boolean[] zArr = this.f39201n;
        final org.telegram.ui.ActionBar.g3 g3Var = this.f39202r;
        final String str2 = this.f39203s;
        final org.telegram.ui.ActionBar.f6 f6Var = this.v;
        final boolean z10 = this.f39204w;
        final String str3 = this.f39205x;
        final TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest = this.f39206y;
        final org.telegram.ui.web.a1 a1Var = this.B;
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
                        org.telegram.ui.Components.qc a2 = xk0.a();
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
                    xk0.a().d0(tL_error, false);
                    return;
                }
                xk0.b(z10, iArr[0], tL_messages_requestUrlAuth, urlAuthResult, str3, tL_urlAuthResultRequest, null, tL_messages_acceptUrlAuth.share_phone_number, a1Var);
            }
        });
    }
}
