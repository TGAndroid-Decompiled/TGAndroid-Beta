package vh;

import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.jc;
import org.telegram.messenger.wp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.tk0;
public abstract class j2 extends tk0 {
    public boolean d;
    public String f51320f;
    public String h;
    public TLRPC.User f51321n;
    public boolean f51322r;
    public final k2 f51325x;
    public final ArrayList f51319c = new ArrayList();
    public int e = -1;
    public final ColorDrawable f51323s = new ColorDrawable(285212671);
    public final d0 f51324w = new d0(this, 9);

    public j2(k2 k2Var) {
        this.f51325x = k2Var;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    public final void E() {
        int i10 = this.f51325x.f51395a;
        if (!this.d) {
            this.d = true;
            F(true);
            wp r12 = wp.r1(i10);
            String str = r12.N3;
            if (this.f51321n == null) {
                TLObject e22 = r12.e2(str);
                if (e22 instanceof TLRPC.User) {
                    this.f51321n = (TLRPC.User) e22;
                }
            }
            TLRPC.User user = this.f51321n;
            if (user == null && !this.f51322r) {
                TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                tL_contacts_resolveUsername.username = str;
                this.e = ConnectionsManager.getInstance(i10).sendRequest(tL_contacts_resolveUsername, new rh.h5(7, this, r12));
            } else if (user == null) {
            } else {
                TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
                tL_messages_getInlineBotResults.bot = r12.p1(this.f51321n);
                String str2 = this.f51320f;
                String str3 = "";
                if (str2 == null) {
                    str2 = "";
                }
                tL_messages_getInlineBotResults.query = str2;
                tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
                String str4 = this.h;
                if (str4 != null) {
                    str3 = str4;
                }
                tL_messages_getInlineBotResults.offset = str3;
                this.e = ConnectionsManager.getInstance(i10).sendRequest(tL_messages_getInlineBotResults, new org.telegram.messenger.voip.u0(12, this, TextUtils.isEmpty(str3)));
            }
        }
    }

    public abstract void F(boolean z10);

    @Override
    public final int b() {
        return this.f51319c.size();
    }

    @Override
    public final void t(s4.c1 c1Var, int i10) {
        org.telegram.ui.Components.g9 g9Var = (org.telegram.ui.Components.g9) c1Var.f47909a;
        TLObject tLObject = (TLObject) this.f51319c.get(i10);
        boolean z10 = tLObject instanceof TLRPC.Document;
        ColorDrawable colorDrawable = this.f51323s;
        if (z10) {
            g9Var.j(jc.b((TLRPC.Document) tLObject), "200_200", colorDrawable, null);
        } else if (tLObject instanceof TLRPC.Photo) {
            TLRPC.Photo photo = (TLRPC.Photo) tLObject;
            g9Var.j(jc.i(org.telegram.messenger.b8.w(photo.sizes, 320, false, null, false), photo), "200_200", colorDrawable, null);
        } else if (tLObject instanceof TLRPC.BotInlineResult) {
            TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) tLObject;
            TLRPC.WebDocument webDocument = botInlineResult.thumb;
            if (webDocument != null) {
                g9Var.j(jc.g(webDocument.url), "200_200", colorDrawable, botInlineResult);
            } else {
                g9Var.b();
            }
        } else {
            g9Var.b();
        }
    }

    @Override
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        return new s4.c1(new rh.v3(this.f51325x.getContext(), 1));
    }
}
