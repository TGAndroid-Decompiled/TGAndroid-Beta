package ph;

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
import org.telegram.ui.Components.ql0;
import org.telegram.ui.Components.rc;
import org.telegram.ui.yd;
public final class f1 extends ql0 {
    public String e;
    public TLRPC.User f41644f;
    public String h;
    public boolean f41645n;
    public final h1 f41647s;
    public final org.telegram.ui.web.q0 f41643c = new org.telegram.ui.web.q0(this, 13);
    public int d = -1;
    public boolean f41646r = false;

    public f1(h1 h1Var) {
        this.f41647s = h1Var;
    }

    public static void E(f1 f1Var, boolean z4) {
        int i10;
        h1 h1Var = f1Var.f41647s;
        ArrayList arrayList = h1Var.h;
        arrayList.clear();
        i10 = ((org.telegram.ui.ActionBar.g3) h1Var.f41739r).currentAccount;
        arrayList.addAll(MediaDataController.getInstance(i10).getRecentGifs());
        if (z4) {
            f1Var.l();
        }
    }

    @Override
    public final boolean D(f2.l1 l1Var) {
        if (l1Var.f5777f == 2) {
            return true;
        }
        return false;
    }

    public final Object F(int i10) {
        int i11 = i10 - 1;
        h1 h1Var = this.f41647s;
        if (!h1Var.h.isEmpty() && TextUtils.isEmpty(this.e)) {
            if (i11 >= 0 && i11 < h1Var.h.size()) {
                return h1Var.h.get(i11);
            }
            i11 -= h1Var.h.size();
        }
        if (!h1Var.f41738n.isEmpty()) {
            if (!h1Var.h.isEmpty() && TextUtils.isEmpty(this.e)) {
                i11--;
            }
            if (i11 >= 0 && i11 < h1Var.f41738n.size()) {
                return h1Var.f41738n.get(i11);
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
        h1 h1Var = this.f41647s;
        y1 y1Var = h1Var.f41739r;
        if (!this.f41646r) {
            this.f41646r = true;
            h1Var.d.c(true);
            if (this.d >= 0) {
                i16 = ((org.telegram.ui.ActionBar.g3) y1Var).currentAccount;
                ConnectionsManager.getInstance(i16).cancelRequest(this.d, true);
                this.d = -1;
            }
            if (this.f41644f == null) {
                i14 = ((org.telegram.ui.ActionBar.g3) y1Var).currentAccount;
                MessagesController messagesController = MessagesController.getInstance(i14);
                i15 = ((org.telegram.ui.ActionBar.g3) y1Var).currentAccount;
                TLObject userOrChat = messagesController.getUserOrChat(MessagesController.getInstance(i15).gifSearchBot);
                if (userOrChat instanceof TLRPC.User) {
                    this.f41644f = (TLRPC.User) userOrChat;
                }
            }
            TLRPC.User user = this.f41644f;
            if (user == null && !this.f41645n) {
                TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                i12 = ((org.telegram.ui.ActionBar.g3) y1Var).currentAccount;
                tL_contacts_resolveUsername.username = MessagesController.getInstance(i12).gifSearchBot;
                i13 = ((org.telegram.ui.ActionBar.g3) y1Var).currentAccount;
                this.d = ConnectionsManager.getInstance(i13).sendRequest(tL_contacts_resolveUsername, new ff.a(this, 15));
            } else if (user == null) {
            } else {
                TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
                i10 = ((org.telegram.ui.ActionBar.g3) y1Var).currentAccount;
                tL_messages_getInlineBotResults.bot = MessagesController.getInstance(i10).getInputUser(this.f41644f);
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
                i11 = ((org.telegram.ui.ActionBar.g3) y1Var).currentAccount;
                MessagesStorage.getInstance(i11).getBotCache(str4, new yd(this, isEmpty, tL_messages_getInlineBotResults, str4));
            }
        }
    }

    public final void H(String str) {
        int i10;
        h1 h1Var = this.f41647s;
        r1 r1Var = h1Var.d;
        if (!TextUtils.equals(this.e, str)) {
            if (this.d != -1) {
                i10 = ((org.telegram.ui.ActionBar.g3) h1Var.f41739r).currentAccount;
                ConnectionsManager.getInstance(i10).cancelRequest(this.d, true);
                this.d = -1;
            }
            this.f41646r = false;
            this.h = "";
        }
        boolean isEmpty = TextUtils.isEmpty(this.e);
        this.e = str;
        org.telegram.ui.web.q0 q0Var = this.f41643c;
        AndroidUtilities.cancelRunOnUIThread(q0Var);
        if (TextUtils.isEmpty(str)) {
            h1Var.f41738n.clear();
            r1Var.c(false);
            l();
            return;
        }
        if (isEmpty) {
            l();
        }
        r1Var.c(true);
        AndroidUtilities.runOnUIThread(q0Var, 1500L);
    }

    @Override
    public final int h() {
        int i10;
        h1 h1Var = this.f41647s;
        int i11 = 0;
        if (!h1Var.h.isEmpty() && TextUtils.isEmpty(this.e)) {
            i10 = h1Var.h.size();
        } else {
            i10 = 0;
        }
        int i12 = i10 + 1;
        if (!h1Var.f41738n.isEmpty()) {
            if (!h1Var.h.isEmpty() && TextUtils.isEmpty(this.e)) {
                i11 = 1;
            }
            i11 += h1Var.f41738n.size();
        }
        return i12 + i11;
    }

    @Override
    public final int j(int i10) {
        if (i10 == 0) {
            return 0;
        }
        int i11 = i10 - 1;
        h1 h1Var = this.f41647s;
        if (!h1Var.h.isEmpty() && TextUtils.isEmpty(this.e)) {
            i11 -= h1Var.h.size();
        }
        if (!h1Var.f41738n.isEmpty() && !h1Var.h.isEmpty() && TextUtils.isEmpty(this.e) && i11 == 0) {
            return 1;
        }
        return 2;
    }

    @Override
    public final void v(f2.l1 l1Var, int i10) {
        int i11 = l1Var.f5777f;
        View view = l1Var.f5774a;
        if (i11 == 0) {
            view.setTag(34);
            view.setLayoutParams(new f2.w0(-1, (int) this.f41647s.f41739r.f42643n));
        } else if (i11 == 2) {
            org.telegram.ui.Cells.d2 d2Var = (org.telegram.ui.Cells.d2) view;
            Object F = F(i10);
            if (F instanceof TLRPC.Document) {
                TLRPC.Document document = (TLRPC.Document) F;
                d2Var.getClass();
                d2Var.d(0, document, "gif" + document);
            } else if (F instanceof TLRPC.BotInlineResult) {
                d2Var.e((TLRPC.BotInlineResult) F, this.f41644f, true, false, false, true);
            }
        }
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.ActionBar.f6 f6Var;
        org.telegram.ui.Cells.d2 d2Var;
        h1 h1Var = this.f41647s;
        if (i10 == 0) {
            d2Var = new View(h1Var.getContext());
        } else if (i10 == 1) {
            Context context = h1Var.getContext();
            f6Var = ((org.telegram.ui.ActionBar.g3) h1Var.f41739r).resourcesProvider;
            ?? l8Var = new org.telegram.ui.Cells.l8(context, false, false, f6Var, false);
            l8Var.b(0, LocaleController.getString(R.string.FeaturedGifs));
            f2.w0 w0Var = new f2.w0(-1, -2);
            ((ViewGroup.MarginLayoutParams) w0Var).topMargin = AndroidUtilities.dp(2.5f);
            ((ViewGroup.MarginLayoutParams) w0Var).bottomMargin = AndroidUtilities.dp(5.5f);
            l8Var.setLayoutParams(w0Var);
            d2Var = l8Var;
        } else {
            org.telegram.ui.Cells.d2 d2Var2 = new org.telegram.ui.Cells.d2(h1Var.getContext());
            d2Var2.getPhotoImage().setLayerNum(7);
            if (d2Var2.W == null) {
                rc rcVar = new rc(d2Var2, 1.0f, 3.0f);
                rcVar.e = 120L;
                d2Var2.W = rcVar;
            }
            d2Var2.setIsKeyboard(true);
            d2Var2.setCanPreviewGif(true);
            d2Var = d2Var2;
        }
        return new f2.l1(d2Var);
    }
}
