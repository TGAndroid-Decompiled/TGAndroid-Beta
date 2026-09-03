package qh;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.rc;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.wd;
public final class f1 extends rl0 {
    public String f45332e;
    public TLRPC.User f45333f;
    public String h;
    public boolean f45334n;
    public final h1 f45336s;
    public final org.telegram.ui.web.s0 f45331c = new org.telegram.ui.web.s0(this, 14);
    public int d = -1;
    public boolean f45335r = false;

    public f1(h1 h1Var) {
        this.f45336s = h1Var;
    }

    public static void E(f1 f1Var, boolean z4) {
        int i10;
        h1 h1Var = f1Var.f45336s;
        ArrayList arrayList = h1Var.h;
        arrayList.clear();
        i10 = ((org.telegram.ui.ActionBar.h3) h1Var.f45388r).currentAccount;
        arrayList.addAll(MediaDataController.getInstance(i10).getRecentGifs());
        if (z4) {
            f1Var.l();
        }
    }

    @Override
    public final boolean D(f2.m1 m1Var) {
        if (m1Var.f5879f == 2) {
            return true;
        }
        return false;
    }

    public final Object F(int i10) {
        int i11 = i10 - 1;
        h1 h1Var = this.f45336s;
        if (!h1Var.h.isEmpty() && TextUtils.isEmpty(this.f45332e)) {
            if (i11 >= 0 && i11 < h1Var.h.size()) {
                return h1Var.h.get(i11);
            }
            i11 -= h1Var.h.size();
        }
        if (!h1Var.f45387n.isEmpty()) {
            if (!h1Var.h.isEmpty() && TextUtils.isEmpty(this.f45332e)) {
                i11--;
            }
            if (i11 >= 0 && i11 < h1Var.f45387n.size()) {
                return h1Var.f45387n.get(i11);
            }
            return null;
        }
        return null;
    }

    public final void G() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        h1 h1Var = this.f45336s;
        x1 x1Var = h1Var.f45388r;
        if (!this.f45335r) {
            this.f45335r = true;
            h1Var.d.c(true);
            if (this.d >= 0) {
                i16 = ((org.telegram.ui.ActionBar.h3) x1Var).currentAccount;
                ConnectionsManager.getInstance(i16).cancelRequest(this.d, true);
                this.d = -1;
            }
            if (this.f45333f == null) {
                i14 = ((org.telegram.ui.ActionBar.h3) x1Var).currentAccount;
                MessagesController messagesController = MessagesController.getInstance(i14);
                i15 = ((org.telegram.ui.ActionBar.h3) x1Var).currentAccount;
                TLObject userOrChat = messagesController.getUserOrChat(MessagesController.getInstance(i15).gifSearchBot);
                if (userOrChat instanceof TLRPC.User) {
                    this.f45333f = (TLRPC.User) userOrChat;
                }
            }
            TLRPC.User user = this.f45333f;
            if (user == null && !this.f45334n) {
                TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                i12 = ((org.telegram.ui.ActionBar.h3) x1Var).currentAccount;
                tL_contacts_resolveUsername.username = MessagesController.getInstance(i12).gifSearchBot;
                i13 = ((org.telegram.ui.ActionBar.h3) x1Var).currentAccount;
                this.d = ConnectionsManager.getInstance(i13).sendRequest(tL_contacts_resolveUsername, new gf.a(this, 15));
            } else if (user == null) {
            } else {
                TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
                i10 = ((org.telegram.ui.ActionBar.h3) x1Var).currentAccount;
                tL_messages_getInlineBotResults.bot = MessagesController.getInstance(i10).getInputUser(this.f45333f);
                String str = this.f45332e;
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
                i11 = ((org.telegram.ui.ActionBar.h3) x1Var).currentAccount;
                MessagesStorage.getInstance(i11).getBotCache(str4, new wd(this, isEmpty, tL_messages_getInlineBotResults, str4));
            }
        }
    }

    public final void H(String str) {
        int i10;
        h1 h1Var = this.f45336s;
        r1 r1Var = h1Var.d;
        if (!TextUtils.equals(this.f45332e, str)) {
            if (this.d != -1) {
                i10 = ((org.telegram.ui.ActionBar.h3) h1Var.f45388r).currentAccount;
                ConnectionsManager.getInstance(i10).cancelRequest(this.d, true);
                this.d = -1;
            }
            this.f45335r = false;
            this.h = "";
        }
        boolean isEmpty = TextUtils.isEmpty(this.f45332e);
        this.f45332e = str;
        org.telegram.ui.web.s0 s0Var = this.f45331c;
        AndroidUtilities.cancelRunOnUIThread(s0Var);
        if (TextUtils.isEmpty(str)) {
            h1Var.f45387n.clear();
            r1Var.c(false);
            l();
            return;
        }
        if (isEmpty) {
            l();
        }
        r1Var.c(true);
        AndroidUtilities.runOnUIThread(s0Var, 1500L);
    }

    @Override
    public final int h() {
        int i10;
        h1 h1Var = this.f45336s;
        int i11 = 0;
        if (!h1Var.h.isEmpty() && TextUtils.isEmpty(this.f45332e)) {
            i10 = h1Var.h.size();
        } else {
            i10 = 0;
        }
        int i12 = i10 + 1;
        if (!h1Var.f45387n.isEmpty()) {
            if (!h1Var.h.isEmpty() && TextUtils.isEmpty(this.f45332e)) {
                i11 = 1;
            }
            i11 += h1Var.f45387n.size();
        }
        return i12 + i11;
    }

    @Override
    public final int j(int i10) {
        if (i10 == 0) {
            return 0;
        }
        int i11 = i10 - 1;
        h1 h1Var = this.f45336s;
        if (!h1Var.h.isEmpty() && TextUtils.isEmpty(this.f45332e)) {
            i11 -= h1Var.h.size();
        }
        if (!h1Var.f45387n.isEmpty() && !h1Var.h.isEmpty() && TextUtils.isEmpty(this.f45332e) && i11 == 0) {
            return 1;
        }
        return 2;
    }

    @Override
    public final void v(f2.m1 m1Var, int i10) {
        int i11 = m1Var.f5879f;
        View view = m1Var.f5875a;
        if (i11 == 0) {
            view.setTag(34);
            view.setLayoutParams(new f2.x0(-1, (int) this.f45336s.f45388r.f46302n));
        } else if (i11 == 2) {
            org.telegram.ui.Cells.e2 e2Var = (org.telegram.ui.Cells.e2) view;
            Object F = F(i10);
            if (F instanceof TLRPC.Document) {
                TLRPC.Document document = (TLRPC.Document) F;
                e2Var.getClass();
                e2Var.d(0, document, "gif" + document);
            } else if (F instanceof TLRPC.BotInlineResult) {
                e2Var.e((TLRPC.BotInlineResult) F, this.f45333f, true, false, false, true);
            }
        }
    }

    @Override
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.ActionBar.g6 g6Var;
        org.telegram.ui.Cells.e2 e2Var;
        h1 h1Var = this.f45336s;
        if (i10 == 0) {
            e2Var = new View(h1Var.getContext());
        } else if (i10 == 1) {
            Context context = h1Var.getContext();
            g6Var = ((org.telegram.ui.ActionBar.h3) h1Var.f45388r).resourcesProvider;
            ?? m8Var = new org.telegram.ui.Cells.m8(context, false, false, g6Var, false);
            m8Var.b(0, LocaleController.getString(R.string.FeaturedGifs));
            f2.x0 x0Var = new f2.x0(-1, -2);
            ((ViewGroup.MarginLayoutParams) x0Var).topMargin = AndroidUtilities.dp(2.5f);
            ((ViewGroup.MarginLayoutParams) x0Var).bottomMargin = AndroidUtilities.dp(5.5f);
            m8Var.setLayoutParams(x0Var);
            e2Var = m8Var;
        } else {
            org.telegram.ui.Cells.e2 e2Var2 = new org.telegram.ui.Cells.e2(h1Var.getContext());
            e2Var2.getPhotoImage().setLayerNum(7);
            if (e2Var2.W == null) {
                rc rcVar = new rc(e2Var2, 1.0f, 3.0f);
                rcVar.f30723e = 120L;
                e2Var2.W = rcVar;
            }
            e2Var2.setIsKeyboard(true);
            e2Var2.setCanPreviewGif(true);
            e2Var = e2Var2;
        }
        return new f2.m1(e2Var);
    }
}
