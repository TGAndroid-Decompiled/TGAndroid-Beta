package vh;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.cd;
import org.telegram.messenger.hs;
import org.telegram.messenger.ui;
import org.telegram.messenger.vp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.dc;
import org.telegram.ui.Components.sk0;
public final class e1 extends sk0 {
    public String e;
    public TLRPC.User f51094f;
    public String h;
    public boolean f51095n;
    public final g1 f51097s;
    public final d0 f51093c = new d0(this, 3);
    public int d = -1;
    public boolean f51096r = false;

    public e1(g1 g1Var) {
        this.f51097s = g1Var;
    }

    public static void E(e1 e1Var, boolean z10) {
        g1 g1Var = e1Var.f51097s;
        ArrayList arrayList = g1Var.h;
        arrayList.clear();
        u1 u1Var = g1Var.f51188r;
        int i10 = u1.f51993y1;
        arrayList.addAll(new ArrayList(ui.b0(u1Var.f21583a).f18324i0));
        if (z10) {
            e1Var.f();
        }
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f47901f == 2) {
            return true;
        }
        return false;
    }

    public final Object F(int i10) {
        int i11 = i10 - 1;
        g1 g1Var = this.f51097s;
        if (!g1Var.h.isEmpty() && TextUtils.isEmpty(this.e)) {
            if (i11 >= 0 && i11 < g1Var.h.size()) {
                return g1Var.h.get(i11);
            }
            i11 -= g1Var.h.size();
        }
        if (!g1Var.f51187n.isEmpty()) {
            if (!g1Var.h.isEmpty() && TextUtils.isEmpty(this.e)) {
                i11--;
            }
            if (i11 >= 0 && i11 < g1Var.f51187n.size()) {
                return g1Var.f51187n.get(i11);
            }
            return null;
        }
        return null;
    }

    public final void G() {
        g1 g1Var = this.f51097s;
        u1 u1Var = g1Var.f51188r;
        if (!this.f51096r) {
            this.f51096r = true;
            g1Var.d.c(true);
            if (this.d >= 0) {
                int i10 = u1.f51993y1;
                ConnectionsManager.getInstance(u1Var.f21583a).cancelRequest(this.d, true);
                this.d = -1;
            }
            if (this.f51094f == null) {
                int i11 = u1.f51993y1;
                TLObject e22 = vp.r1(u1Var.f21583a).e2(vp.r1(u1Var.f21583a).M3);
                if (e22 instanceof TLRPC.User) {
                    this.f51094f = (TLRPC.User) e22;
                }
            }
            TLRPC.User user = this.f51094f;
            if (user == null && !this.f51095n) {
                TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                int i12 = u1.f51993y1;
                tL_contacts_resolveUsername.username = vp.r1(u1Var.f21583a).M3;
                this.d = ConnectionsManager.getInstance(u1Var.f21583a).sendRequest(tL_contacts_resolveUsername, new ag.c(this, 22));
            } else if (user == null) {
            } else {
                TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
                int i13 = u1.f51993y1;
                tL_messages_getInlineBotResults.bot = vp.r1(u1Var.f21583a).p1(this.f51094f);
                String str = this.e;
                String str2 = "";
                if (str == null) {
                    str = "";
                }
                tL_messages_getInlineBotResults.query = str;
                boolean isEmpty = TextUtils.isEmpty(this.h);
                String str3 = this.h;
                if (str3 != null) {
                    str2 = str3;
                }
                tL_messages_getInlineBotResults.offset = str2;
                tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
                String str4 = "gif_search_" + tL_messages_getInlineBotResults.query + "_" + tL_messages_getInlineBotResults.offset;
                hs.a0(u1Var.f21583a).M(str4, new org.telegram.messenger.s6(this, isEmpty, tL_messages_getInlineBotResults, str4));
            }
        }
    }

    public final void H(String str) {
        g1 g1Var = this.f51097s;
        p1 p1Var = g1Var.d;
        if (!TextUtils.equals(this.e, str)) {
            if (this.d != -1) {
                u1 u1Var = g1Var.f51188r;
                int i10 = u1.f51993y1;
                ConnectionsManager.getInstance(u1Var.f21583a).cancelRequest(this.d, true);
                this.d = -1;
            }
            this.f51096r = false;
            this.h = "";
        }
        boolean isEmpty = TextUtils.isEmpty(this.e);
        this.e = str;
        d0 d0Var = this.f51093c;
        org.telegram.messenger.i0.r(d0Var);
        if (TextUtils.isEmpty(str)) {
            g1Var.f51187n.clear();
            p1Var.c(false);
            f();
            return;
        }
        if (isEmpty) {
            f();
        }
        p1Var.c(true);
        org.telegram.messenger.i0.h3(d0Var, 1500L);
    }

    @Override
    public final int b() {
        int i10;
        g1 g1Var = this.f51097s;
        int i11 = 0;
        if (!g1Var.h.isEmpty() && TextUtils.isEmpty(this.e)) {
            i10 = g1Var.h.size();
        } else {
            i10 = 0;
        }
        int i12 = i10 + 1;
        if (!g1Var.f51187n.isEmpty()) {
            if (!g1Var.h.isEmpty() && TextUtils.isEmpty(this.e)) {
                i11 = 1;
            }
            i11 += g1Var.f51187n.size();
        }
        return i12 + i11;
    }

    @Override
    public final int d(int i10) {
        if (i10 == 0) {
            return 0;
        }
        int i11 = i10 - 1;
        g1 g1Var = this.f51097s;
        if (!g1Var.h.isEmpty() && TextUtils.isEmpty(this.e)) {
            i11 -= g1Var.h.size();
        }
        if (!g1Var.f51187n.isEmpty() && !g1Var.h.isEmpty() && TextUtils.isEmpty(this.e) && i11 == 0) {
            return 1;
        }
        return 2;
    }

    @Override
    public final void t(s4.c1 c1Var, int i10) {
        int i11 = c1Var.f47901f;
        View view = c1Var.f47898a;
        if (i11 == 0) {
            view.setTag(34);
            view.setLayoutParams(new s4.o0(-1, (int) this.f51097s.f51188r.f51999o1));
        } else if (i11 == 2) {
            org.telegram.ui.Cells.h2 h2Var = (org.telegram.ui.Cells.h2) view;
            Object F = F(i10);
            if (F instanceof TLRPC.Document) {
                TLRPC.Document document = (TLRPC.Document) F;
                h2Var.getClass();
                h2Var.d(0, "gif" + document, document);
            } else if (F instanceof TLRPC.BotInlineResult) {
                h2Var.e((TLRPC.BotInlineResult) F, this.f51094f, true, false, false, true);
            }
        }
    }

    @Override
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.h2 h2Var;
        g1 g1Var = this.f51097s;
        if (i10 == 0) {
            h2Var = new View(g1Var.getContext());
        } else if (i10 == 1) {
            Context context = g1Var.getContext();
            u1 u1Var = g1Var.f51188r;
            int i11 = u1.f51993y1;
            ?? n8Var = new org.telegram.ui.Cells.n8(context, false, false, u1Var.I0, false);
            n8Var.a(0, cd.L0(2131750835, null));
            s4.o0 o0Var = new s4.o0(-1, -2);
            ((ViewGroup.MarginLayoutParams) o0Var).topMargin = org.telegram.messenger.i0.L(2.5f);
            ((ViewGroup.MarginLayoutParams) o0Var).bottomMargin = org.telegram.messenger.i0.L(5.5f);
            n8Var.setLayoutParams(o0Var);
            h2Var = n8Var;
        } else {
            org.telegram.ui.Cells.h2 h2Var2 = new org.telegram.ui.Cells.h2(g1Var.getContext());
            h2Var2.getPhotoImage().E0(7);
            if (h2Var2.f21958d0 == null) {
                dc dcVar = new dc(h2Var2, 1.0f, 3.0f);
                dcVar.e = 120L;
                h2Var2.f21958d0 = dcVar;
            }
            h2Var2.setIsKeyboard(true);
            h2Var2.setCanPreviewGif(true);
            h2Var = h2Var2;
        }
        return new s4.c1(h2Var);
    }
}
