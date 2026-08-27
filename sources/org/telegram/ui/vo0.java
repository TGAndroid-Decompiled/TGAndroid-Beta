package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.ActionBarLayout;

public final class vo0 extends FrameLayout {
    public gh.i5 A;
    public TL_stars.StarGift B;
    public final ArrayList C;
    public final HashMap D;
    public final SpannableStringBuilder E;
    public final String F;
    public final String G;
    public int H;
    public int I;
    public int J;
    public final int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public int V;
    public int W;

    public final zo0 f43495a;

    public int f43496a0;

    public final no0 f43497b;

    public final ArrayList f43498b0;

    public final po0 f43499c;

    public final int f43500c0;
    public final View d;

    public int f43501d0;

    public final FrameLayout f43502e;

    public so0 f43503e0;

    public final lh.d f43504f;

    public final ap0 f43505f0;
    public yo0 h;

    public int f43506n;

    public long f43507r;

    public TLRPC.TL_emojiStatusCollectible f43508s;
    public TLRPC.TL_peerColorCollectible v;

    public final org.telegram.ui.Cells.ba f43509w;

    public uo0 f43510x;

    public TL_stars.TL_starGiftUnique f43511y;

    public vo0(ap0 ap0Var, Context context, int i10) {
        super(context);
        this.f43505f0 = ap0Var;
        this.f43506n = -1;
        this.f43507r = 0L;
        this.f43508s = null;
        this.v = null;
        this.B = null;
        this.C = new ArrayList();
        this.D = new HashMap();
        this.H = -1;
        this.I = -1;
        this.J = -1;
        this.K = -1;
        this.L = -1;
        this.M = -1;
        this.N = -1;
        this.O = -1;
        this.P = -1;
        this.Q = -1;
        this.R = -1;
        this.S = -1;
        this.T = 0;
        this.U = -1;
        this.V = -1;
        this.W = -1;
        this.f43498b0 = new ArrayList();
        this.f43500c0 = i10;
        d();
        no0 no0Var = new no0(this, getContext(), ap0Var.getResourceProvider(), i10);
        this.f43497b = no0Var;
        ((f2.l) no0Var.getItemAnimator()).f5819m = false;
        getContext();
        f2.x xVar = new f2.x(3);
        int i11 = 8;
        xVar.O = new gh.u5(this, i11);
        no0Var.i(new cg.h2(this, i11));
        no0Var.setLayoutManager(xVar);
        po0 po0Var = new po0(this, context, i10);
        this.f43499c = po0Var;
        no0Var.setAdapter(po0Var);
        no0Var.setOnItemClickListener(new org.telegram.ui.Components.dm0(this, i10, 1));
        no0Var.j(new qo0(this, i10));
        addView(no0Var, h7.z5.c(-1.0f, -1));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f43502e = frameLayout;
        frameLayout.setBackgroundColor(ap0Var.getThemedColor(org.telegram.ui.ActionBar.g6.f22999a7));
        View view = new View(getContext());
        this.d = view;
        view.setBackgroundColor(ap0Var.getThemedColor(org.telegram.ui.ActionBar.g6.f23054d7));
        view.setAlpha(0.0f);
        frameLayout.addView(view, h7.z5.d(-1, 0.66f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("l");
        spannableStringBuilder.setSpan(new org.telegram.ui.Components.cq(R.drawable.msg_mini_lock2, 0), 0, 1, 33);
        boolean z10 = ap0Var.f36585a;
        String string = LocaleController.getString(z10 ? R.string.ChannelColorApply : R.string.UserColorApply);
        this.F = string;
        SpannableStringBuilder spannableStringBuilderAppend = new SpannableStringBuilder(spannableStringBuilder).append((CharSequence) " ").append((CharSequence) string);
        this.E = spannableStringBuilderAppend;
        String string2 = LocaleController.getString(R.string.UserColorApplyCollectible);
        this.G = string2;
        lh.d dVar = new lh.d(getContext(), ap0Var.getResourceProvider(), true);
        this.f43504f = dVar;
        dVar.e();
        dVar.d.o(true, true, false);
        CharSequence charSequence = string;
        if (!z10) {
            if (!ap0Var.getUserConfig().isPremium()) {
                charSequence = spannableStringBuilderAppend;
            } else if (this.f43508s != null) {
                charSequence = string;
                charSequence = string2;
            }
        }
        charSequence = string;
        dVar.g(charSequence, false, true);
        dVar.setOnClickListener(new u50(this, 17));
        frameLayout.addView(dVar, h7.z5.d(-1, 48.0f, 119, 14.0f, 14.66f, 14.0f, 14.0f));
        addView(frameLayout, h7.z5.e(-1, -2, 80));
        no0Var.j(new m3(this, 23));
        f2.l lVar = new f2.l();
        lVar.n(350L);
        lVar.o(org.telegram.ui.Components.er.h);
        lVar.C = false;
        lVar.f5819m = false;
        no0Var.setItemAnimator(lVar);
        if (i10 == 0) {
            zo0 zo0Var = new zo0(((org.telegram.ui.ActionBar.n2) ap0Var).currentAccount, 0L, getContext(), ((org.telegram.ui.ActionBar.n2) ap0Var).resourceProvider);
            this.f43495a = zo0Var;
            i(false);
            addView(zo0Var, h7.z5.e(-1, -2, 55));
        } else {
            org.telegram.ui.Cells.ba baVar = new org.telegram.ui.Cells.ba(getContext(), ((org.telegram.ui.ActionBar.n2) ap0Var).parentLayout, 3, 0L, ((org.telegram.ui.ActionBar.n2) ap0Var).resourceProvider);
            this.f43509w = baVar;
            baVar.setImportantForAccessibility(4);
            baVar.f24135r = ap0Var;
            addView(baVar, h7.z5.e(-1, -2, 55));
        }
        g();
        j();
        setWillNotDraw(false);
    }

    public static void a(vo0 vo0Var) {
        no0 no0Var = vo0Var.f43497b;
        FrameLayout frameLayout = vo0Var.f43502e;
        if (frameLayout == null) {
            return;
        }
        int i10 = vo0Var.f43499c.f41405e.f43496a0 - 1;
        boolean z10 = false;
        int measuredHeight = 0;
        for (int i11 = 0; i11 < no0Var.getChildCount(); i11++) {
            View childAt = no0Var.getChildAt(i11);
            int iR = RecyclerView.R(childAt);
            if (iR != -1 && iR <= i10) {
                measuredHeight = Math.max(measuredHeight, childAt.getTop());
                if (iR == i10) {
                    z10 = true;
                }
            }
        }
        if (!z10) {
            measuredHeight = no0Var.getMeasuredHeight();
        }
        float fMax = Math.max(0, measuredHeight - (no0Var.getMeasuredHeight() - AndroidUtilities.dp(76.66f)));
        int i12 = vo0Var.f43500c0;
        if (i12 == 0 || i12 == 1) {
            vo0Var.d.animate().alpha(fMax > 0.0f ? 0.0f : 1.0f).start();
            fMax = 0.0f;
        }
        frameLayout.setTranslationY(fMax);
    }

    public final boolean b() {
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible;
        ap0 ap0Var = this.f43505f0;
        boolean z10 = ap0Var.f36585a;
        int i10 = this.f43500c0;
        if (z10) {
            TLRPC.Chat chat = ap0Var.getMessagesController().getChat(0L);
            if (chat == null) {
                return false;
            }
            if (i10 != 1) {
                if (this.f43506n == (chat.emoji_status instanceof TLRPC.TL_emojiStatusCollectible ? -1 : ChatObject.getProfileColorId(chat))) {
                    if (this.f43507r == (chat.emoji_status instanceof TLRPC.TL_emojiStatusCollectible ? 0L : ChatObject.getOnlyProfileEmojiId(chat)) && ap0.x0(chat.emoji_status, this.f43508s)) {
                        return false;
                    }
                }
            } else if (this.f43506n == ChatObject.getColorId(chat) && this.f43507r == ChatObject.getEmojiId(chat)) {
                TLRPC.PeerColor peerColor = chat.color;
                tL_peerColorCollectible = peerColor instanceof TLRPC.TL_peerColorCollectible ? (TLRPC.TL_peerColorCollectible) peerColor : null;
                TLRPC.TL_peerColorCollectible tL_peerColorCollectible2 = this.v;
                if (tL_peerColorCollectible == tL_peerColorCollectible2) {
                    return false;
                }
                if (tL_peerColorCollectible == null && tL_peerColorCollectible2 == null) {
                    return false;
                }
                if (tL_peerColorCollectible != null && tL_peerColorCollectible2 != null && tL_peerColorCollectible.collectible_id == tL_peerColorCollectible2.collectible_id) {
                    return false;
                }
            }
        } else {
            TLRPC.User currentUser = ap0Var.getUserConfig().getCurrentUser();
            if (currentUser == null) {
                return false;
            }
            if (i10 == 1) {
                if (this.f43506n == (currentUser.color instanceof TLRPC.TL_peerColorCollectible ? -1 : UserObject.getColorId(currentUser)) && this.f43507r == UserObject.getEmojiId(currentUser)) {
                    TLRPC.PeerColor peerColor2 = currentUser.color;
                    tL_peerColorCollectible = peerColor2 instanceof TLRPC.TL_peerColorCollectible ? (TLRPC.TL_peerColorCollectible) peerColor2 : null;
                    TLRPC.TL_peerColorCollectible tL_peerColorCollectible3 = this.v;
                    if (tL_peerColorCollectible == tL_peerColorCollectible3) {
                        return false;
                    }
                    if (tL_peerColorCollectible == null && tL_peerColorCollectible3 == null) {
                        return false;
                    }
                    if (tL_peerColorCollectible != null && tL_peerColorCollectible3 != null && tL_peerColorCollectible.collectible_id == tL_peerColorCollectible3.collectible_id) {
                        return false;
                    }
                }
            } else {
                if (this.f43506n == (currentUser.emoji_status instanceof TLRPC.TL_emojiStatusCollectible ? -1 : UserObject.getProfileColorId(currentUser))) {
                    if (this.f43507r == (currentUser.emoji_status instanceof TLRPC.TL_emojiStatusCollectible ? 0L : UserObject.getOnlyProfileEmojiId(currentUser)) && ap0.x0(currentUser.emoji_status, this.f43508s)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public final boolean c() {
        no0 no0Var = this.f43497b;
        if (no0Var != null) {
            for (int i10 = 0; i10 < no0Var.getChildCount(); i10++) {
                if (no0Var.getChildAt(i10) instanceof org.telegram.ui.Components.h00) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void d() {
        TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible;
        int i10 = this.f43500c0;
        ap0 ap0Var = this.f43505f0;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible = null;
        if (i10 == 0) {
            TLRPC.User currentUser = ap0Var.getUserConfig().getCurrentUser();
            this.f43506n = UserObject.getProfileColorId(currentUser);
            this.f43507r = UserObject.getProfileEmojiId(currentUser);
            if (currentUser != null) {
                TLRPC.EmojiStatus emojiStatus = currentUser.emoji_status;
                if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                    tL_emojiStatusCollectible = (TLRPC.TL_emojiStatusCollectible) emojiStatus;
                } else {
                    tL_emojiStatusCollectible = null;
                }
            } else {
                tL_emojiStatusCollectible = null;
            }
            this.f43508s = tL_emojiStatusCollectible;
            this.v = null;
        } else {
            TLRPC.User currentUser2 = ap0Var.getUserConfig().getCurrentUser();
            this.f43506n = UserObject.getColorId(currentUser2);
            this.f43507r = UserObject.getEmojiId(currentUser2);
            this.f43508s = null;
            if (currentUser2 != null) {
                TLRPC.PeerColor peerColor = currentUser2.color;
                if (peerColor instanceof TLRPC.TL_peerColorCollectible) {
                    tL_peerColorCollectible = (TLRPC.TL_peerColorCollectible) peerColor;
                }
            }
            this.v = tL_peerColorCollectible;
        }
        if (this.f43508s == null && this.v == null) {
            return;
        }
        this.f43506n = -1;
        this.f43507r = 0L;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        ap0 ap0Var = this.f43505f0;
        if (ap0Var.getParentLayout() != null) {
            ((ActionBarLayout) ap0Var.getParentLayout()).q(canvas, this.f43501d0);
        }
    }

    public final void e() {
        j();
        this.f43499c.l();
    }

    public final void f() {
        CharSequence charSequence;
        lh.d dVar = this.f43504f;
        if (dVar == null) {
            return;
        }
        TL_stars.TL_starGiftUnique tL_starGiftUnique = this.f43511y;
        if (tL_starGiftUnique != null) {
            hf.a resellAmount = tL_starGiftUnique.getResellAmount(hf.b.f8921a);
            if (tL_starGiftUnique.resale_ton_only) {
                dVar.g(hh.oa.S0(LocaleController.formatString(R.string.ResellGiftBuyTON, tL_starGiftUnique.getResellAmount(hf.b.f8922b).d()), true), true, true);
                dVar.f(hh.oa.Q0(LocaleController.formatPluralStringComma("ResellGiftBuyEq", (int) resellAmount.a())), true);
                return;
            } else {
                dVar.g(hh.oa.Q0(LocaleController.formatPluralStringComma("ResellGiftBuy", (int) resellAmount.a())), true, true);
                dVar.f(null, true);
                return;
            }
        }
        ap0 ap0Var = this.f43505f0;
        if (ap0Var.getUserConfig().isPremium() || ap0Var.f36585a) {
            charSequence = this.f43508s != null ? this.G : this.F;
        } else {
            charSequence = this.E;
        }
        dVar.g(charSequence, true, true);
        dVar.f(null, true);
    }

    public final void g() {
        int i10 = org.telegram.ui.ActionBar.g6.f22999a7;
        ap0 ap0Var = this.f43505f0;
        int themedColor = ap0Var.getThemedColor(i10);
        no0 no0Var = this.f43497b;
        no0Var.setBackgroundColor(themedColor);
        lh.d dVar = this.f43504f;
        if (dVar != null) {
            dVar.j();
        }
        org.telegram.ui.Cells.ba baVar = this.f43509w;
        if (baVar != null) {
            baVar.invalidate();
        }
        i(true);
        this.f43502e.setBackgroundColor(ap0Var.getThemedColor(i10));
        this.d.setBackgroundColor(ap0Var.getThemedColor(org.telegram.ui.ActionBar.g6.f23054d7));
        AndroidUtilities.forEachViews((RecyclerView) no0Var, (d5.d) new tb(this, 3));
    }

    public final void h() {
        MessageObject messageObject;
        org.telegram.ui.Cells.ba baVar = this.f43509w;
        if (baVar != null) {
            org.telegram.ui.Cells.s1[] cells = baVar.getCells();
            for (int i10 = 0; i10 < cells.length; i10++) {
                org.telegram.ui.Cells.s1 s1Var = cells[i10];
                if (s1Var != null && (messageObject = s1Var.getMessageObject()) != null) {
                    messageObject.notime = true;
                    yo0 yo0Var = this.h;
                    if (yo0Var != null) {
                        messageObject.overrideLinkColor = yo0Var.getColorId();
                    }
                    messageObject.overrideLinkEmoji = this.f43507r;
                    messageObject.overrideLinkPeerColor = this.v;
                    cells[i10].setAvatar(messageObject);
                    cells[i10].invalidate();
                }
            }
        }
    }

    public final void i(boolean z10) {
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible2;
        int i10;
        ap0 ap0Var;
        go0 go0Var;
        yo0 yo0Var = this.h;
        if (yo0Var != null) {
            yo0Var.a(this.f43506n, z10);
        }
        zo0 zo0Var = this.f43495a;
        if (zo0Var != null) {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = this.f43508s;
            if (tL_emojiStatusCollectible != null) {
                zo0Var.e(tL_emojiStatusCollectible.document_id, true, z10);
                zo0Var.c(MessagesController.PeerColor.fromCollectible(this.f43508s), z10);
                zo0Var.d(this.f43508s.pattern_document_id, true, z10);
            } else {
                if (DialogObject.isEmojiStatusCollectible(0L)) {
                    zo0Var.e(0L, false, z10);
                } else {
                    zo0Var.e(DialogObject.getEmojiStatusDocumentId(0L), DialogObject.isEmojiStatusCollectible(0L), z10);
                }
                zo0Var.b(this.f43506n, z10);
                zo0Var.d(this.f43507r, false, z10);
            }
        }
        int i11 = this.f43500c0;
        if (i11 == 0 && (go0Var = (ap0Var = this.f43505f0).f36588e) != null) {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2 = this.f43508s;
            if (tL_emojiStatusCollectible2 != null) {
                go0Var.c(MessagesController.PeerColor.fromCollectible(tL_emojiStatusCollectible2), z10);
            } else {
                go0Var.b(((org.telegram.ui.ActionBar.n2) ap0Var).currentAccount, this.f43506n, z10);
            }
        }
        if (i11 == 0) {
            int i12 = this.M;
            j();
            po0 po0Var = this.f43499c;
            if (i12 >= 0 && this.M < 0) {
                po0Var.t(i12, 2);
            } else if (i12 < 0 && (i10 = this.M) >= 0) {
                po0Var.s(i10, 2);
            }
        }
        int i13 = 0;
        while (true) {
            no0 no0Var = this.f43497b;
            if (i13 >= no0Var.getChildCount()) {
                return;
            }
            View childAt = no0Var.getChildAt(i13);
            if (childAt instanceof lo0) {
                lo0 lo0Var = (lo0) childAt;
                TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible3 = this.f43508s;
                lo0Var.b((tL_emojiStatusCollectible3 != null && tL_emojiStatusCollectible3.collectible_id == lo0Var.getGiftId()) || ((tL_peerColorCollectible2 = this.v) != null && tL_peerColorCollectible2.collectible_id == lo0Var.getGiftId()), true);
            } else if (childAt instanceof gh.b2) {
                gh.b2 b2Var = (gh.b2) childAt;
                TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible4 = this.f43508s;
                b2Var.e((tL_emojiStatusCollectible4 != null && tL_emojiStatusCollectible4.collectible_id == b2Var.getGiftId()) || ((tL_peerColorCollectible = this.v) != null && tL_peerColorCollectible.collectible_id == b2Var.getGiftId()), true);
            }
            i13++;
        }
    }

    public final void j() {
        ap0 ap0Var = this.f43505f0;
        hh.m7 m7Var = ap0Var.f36586b;
        this.M = -1;
        this.N = -1;
        this.O = -1;
        this.P = -1;
        this.R = -1;
        this.S = -1;
        this.Q = -1;
        this.U = -1;
        this.V = -1;
        this.W = -1;
        this.T = 0;
        ArrayList arrayList = this.f43498b0;
        arrayList.clear();
        this.H = 0;
        this.J = 1;
        int i10 = 3;
        this.f43496a0 = 3;
        this.I = 2;
        int i11 = this.f43500c0;
        if (i11 == 0 && (this.f43506n >= 0 || this.f43508s != null || this.v != null)) {
            this.M = 3;
            this.f43496a0 = 5;
            this.N = 4;
        }
        hh.m7 m7Var2 = i11 == 1 ? ap0Var.f36587c : m7Var;
        if ((i11 == 0 || i11 == 1) && m7Var2 != null) {
            ArrayList arrayList2 = m7Var2.f9753l;
            int i12 = this.f43496a0;
            this.f43496a0 = i12 + 1;
            this.V = i12;
            if (this.B == null) {
                for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                    TL_stars.StarGift starGift = ((TL_stars.SavedStarGift) arrayList2.get(i13)).gift;
                    if (starGift instanceof TL_stars.TL_starGiftUnique) {
                        arrayList.add((TL_stars.TL_starGiftUnique) starGift);
                    }
                }
                int i14 = this.f43496a0;
                this.P = i14;
                this.f43496a0 = arrayList.size() + i14;
                int size = arrayList.size() + this.T;
                this.T = size;
                int i15 = this.f43496a0;
                this.Q = i15;
                if (m7Var.f9750i || !m7Var.f9751j) {
                    this.R = i15;
                    int i16 = 3 - (size % 3);
                    if (size <= 0) {
                        i10 = 9;
                    } else if (i16 > 0) {
                        i10 = i16;
                    }
                    int i17 = i15 + i10;
                    this.f43496a0 = i17;
                    this.T = size + i10;
                    this.S = i17;
                } else if (arrayList.isEmpty()) {
                    int i18 = this.f43496a0;
                    this.f43496a0 = i18 + 1;
                    this.W = i18;
                }
                if (c()) {
                    m7Var2.a();
                }
            } else if (this.A != null) {
                long clientUserId = UserConfig.getInstance(((org.telegram.ui.ActionBar.n2) ap0Var).currentAccount).getClientUserId();
                for (int i19 = 0; i19 < this.A.d.size(); i19++) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.A.d.get(i19);
                    if (DialogObject.getPeerDialogId(tL_starGiftUnique.owner_id) != clientUserId && DialogObject.getPeerDialogId(tL_starGiftUnique.host_id) != clientUserId) {
                        arrayList.add(tL_starGiftUnique);
                    }
                }
                int i20 = this.f43496a0;
                this.P = i20;
                this.f43496a0 = arrayList.size() + i20;
                int size2 = arrayList.size() + this.T;
                this.T = size2;
                int i21 = this.f43496a0;
                this.Q = i21;
                gh.i5 i5Var = this.A;
                if (i5Var.f7340t || !i5Var.f7341u) {
                    this.R = i21;
                    int i22 = 3 - (size2 % 3);
                    if (size2 <= 0) {
                        i10 = 9;
                    } else if (i22 > 0) {
                        i10 = i22;
                    }
                    int i23 = i21 + i10;
                    this.f43496a0 = i23;
                    this.T = size2 + i10;
                    this.S = i23;
                }
                if (c()) {
                    this.A.g(false);
                }
            }
            int i24 = this.f43496a0;
            this.f43496a0 = i24 + 1;
            this.U = i24;
        }
        int i25 = this.f43496a0;
        this.f43496a0 = i25 + 1;
        this.L = i25;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12 = this.f43500c0;
        no0 no0Var = this.f43497b;
        if (i12 == 1) {
            super.onMeasure(i10, i11);
            org.telegram.ui.Cells.ba baVar = this.f43509w;
            this.f43501d0 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + baVar.getMeasuredHeight() + AndroidUtilities.statusBarHeight;
            ((ViewGroup.MarginLayoutParams) baVar.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
            ((ViewGroup.MarginLayoutParams) no0Var.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
            no0Var.setPadding(0, baVar.getMeasuredHeight(), 0, 0);
        } else {
            this.f43501d0 = AndroidUtilities.dp(230.0f) + AndroidUtilities.statusBarHeight;
            ((ViewGroup.MarginLayoutParams) no0Var.getLayoutParams()).topMargin = this.f43501d0;
            ((ViewGroup.MarginLayoutParams) this.f43495a.getLayoutParams()).height = this.f43501d0;
        }
        super.onMeasure(i10, i11);
    }
}
