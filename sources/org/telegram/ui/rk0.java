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
    public final org.telegram.ui.web.y0 A;
    public final kh.d f42446a;
    public final kh.d f42447b;
    public final TLRPC.TL_messages_requestUrlAuth f42448c;
    public final String[] d;
    public final org.telegram.ui.Cells.t8 f42449e;
    public final boolean[] f42450f;
    public final int[] h;
    public final boolean[] f42451n;
    public final org.telegram.ui.ActionBar.f3 f42452r;
    public final String f42453s;
    public final org.telegram.ui.ActionBar.b6 v;
    public final boolean f42454w;
    public final String f42455x;
    public final TLRPC.TL_urlAuthResultRequest f42456y;

    public rk0(kh.d dVar, kh.d dVar2, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, String[] strArr, org.telegram.ui.Cells.t8 t8Var, boolean[] zArr, int[] iArr, boolean[] zArr2, org.telegram.ui.ActionBar.f3 f3Var, String str, org.telegram.ui.ActionBar.b6 b6Var, boolean z10, String str2, TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest, org.telegram.ui.web.y0 y0Var) {
        this.f42446a = dVar;
        this.f42447b = dVar2;
        this.f42448c = tL_messages_requestUrlAuth;
        this.d = strArr;
        this.f42449e = t8Var;
        this.f42450f = zArr;
        this.h = iArr;
        this.f42451n = zArr2;
        this.f42452r = f3Var;
        this.f42453s = str;
        this.v = b6Var;
        this.f42454w = z10;
        this.f42455x = str2;
        this.f42456y = tL_urlAuthResultRequest;
        this.A = y0Var;
    }

    @Override
    public final void run() {
        kh.d dVar = this.f42446a;
        if (dVar.J || this.f42447b.J) {
            return;
        }
        boolean z10 = true;
        dVar.setLoading(true);
        final TLRPC.TL_messages_acceptUrlAuth tL_messages_acceptUrlAuth = new TLRPC.TL_messages_acceptUrlAuth();
        final TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = this.f42448c;
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
        org.telegram.ui.Cells.t8 t8Var = this.f42449e;
        tL_messages_acceptUrlAuth.write_allowed = (t8Var == null || !t8Var.f25711e.h) ? false : false;
        tL_messages_acceptUrlAuth.share_phone_number = this.f42450f[0];
        final int[] iArr = this.h;
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(iArr[0]);
        ?? obj = new Object();
        final boolean[] zArr = this.f42451n;
        final org.telegram.ui.ActionBar.f3 f3Var = this.f42452r;
        final String str2 = this.f42453s;
        final org.telegram.ui.ActionBar.b6 b6Var = this.v;
        final boolean z11 = this.f42454w;
        final String str3 = this.f42455x;
        final TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest = this.f42456y;
        final org.telegram.ui.web.y0 y0Var = this.A;
        connectionsManager.sendRequestTyped(tL_messages_acceptUrlAuth, obj, new Utilities.Callback2() {
            @Override
            public final void run(Object obj2, Object obj3) {
                CharSequence replaceSingleLinkBold;
                TLRPC.UrlAuthResult urlAuthResult = (TLRPC.UrlAuthResult) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                zArr[0] = true;
                f3Var.dismiss();
                if (tL_error != null) {
                    if ("URL_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                        org.telegram.ui.Components.oc a2 = tk0.a();
                        int i9 = R.raw.error;
                        String string = LocaleController.getString(R.string.BotAuthLoggedInFailTitle);
                        String str4 = str2;
                        if (TextUtils.isEmpty(str4)) {
                            replaceSingleLinkBold = LocaleController.getString(R.string.BotAuthLoggedInFailNoDomain);
                        } else {
                            replaceSingleLinkBold = AndroidUtilities.replaceSingleLinkBold(LocaleController.formatString(R.string.BotAuthLoggedInFail, str4), org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Gi, b6Var));
                        }
                        a2.M(string, replaceSingleLinkBold, i9).j();
                        return;
                    }
                    tk0.a().d0(tL_error, false);
                    return;
                }
                tk0.b(z11, iArr[0], tL_messages_requestUrlAuth, urlAuthResult, str3, tL_urlAuthResultRequest, null, tL_messages_acceptUrlAuth.share_phone_number, y0Var);
            }
        });
    }
}
