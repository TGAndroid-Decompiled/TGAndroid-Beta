package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
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
public final class uo0 extends FrameLayout {
    public fh.p5 A;
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
    public final yo0 f43277a;
    public int f43278a0;
    public final mo0 f43279b;
    public final ArrayList f43280b0;
    public final oo0 f43281c;
    public final int f43282c0;
    public final View d;
    public int f43283d0;
    public final FrameLayout f43284e;
    public ro0 f43285e0;
    public final kh.d f43286f;
    public final zo0 f43287f0;
    public xo0 h;
    public int f43288n;
    public long f43289r;
    public TLRPC.TL_emojiStatusCollectible f43290s;
    public TLRPC.TL_peerColorCollectible v;
    public final org.telegram.ui.Cells.fa f43291w;
    public to0 f43292x;
    public TL_stars.TL_starGiftUnique f43293y;

    public uo0(zo0 zo0Var, Context context, int i9) {
        super(context);
        int i10;
        org.telegram.ui.ActionBar.b5 b5Var;
        org.telegram.ui.ActionBar.b6 b6Var;
        int i11;
        org.telegram.ui.ActionBar.b6 b6Var2;
        this.f43287f0 = zo0Var;
        this.f43288n = -1;
        this.f43289r = 0L;
        this.f43290s = null;
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
        this.f43280b0 = new ArrayList();
        this.f43282c0 = i9;
        d();
        mo0 mo0Var = new mo0(this, getContext(), zo0Var.getResourceProvider(), i9);
        this.f43279b = mo0Var;
        ((f2.n) mo0Var.getItemAnimator()).f5532m = false;
        getContext();
        f2.y yVar = new f2.y(3);
        yVar.O = new fh.c6(this, 8);
        mo0Var.i(new bg.p2(this, 8));
        mo0Var.setLayoutManager(yVar);
        oo0 oo0Var = new oo0(this, context, i9);
        this.f43281c = oo0Var;
        mo0Var.setAdapter(oo0Var);
        mo0Var.setOnItemClickListener(new org.telegram.ui.Components.am0(this, i9, 1));
        mo0Var.j(new po0(this, i9));
        addView(mo0Var, g7.e6.c(-1.0f, -1));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f43284e = frameLayout;
        frameLayout.setBackgroundColor(zo0Var.getThemedColor(org.telegram.ui.ActionBar.f6.f22947a7));
        View view = new View(getContext());
        this.d = view;
        view.setBackgroundColor(zo0Var.getThemedColor(org.telegram.ui.ActionBar.f6.f23002d7));
        view.setAlpha(0.0f);
        frameLayout.addView(view, g7.e6.d(-1, 0.66f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("l");
        spannableStringBuilder.setSpan(new org.telegram.ui.Components.eq(R.drawable.msg_mini_lock2, 0), 0, 1, 33);
        boolean z10 = zo0Var.f45192a;
        if (z10) {
            i10 = R.string.ChannelColorApply;
        } else {
            i10 = R.string.UserColorApply;
        }
        String string = LocaleController.getString(i10);
        this.F = string;
        SpannableStringBuilder append = new SpannableStringBuilder(spannableStringBuilder).append((CharSequence) " ").append((CharSequence) string);
        this.E = append;
        String string2 = LocaleController.getString(R.string.UserColorApplyCollectible);
        this.G = string2;
        kh.d dVar = new kh.d(getContext(), zo0Var.getResourceProvider(), true);
        this.f43286f = dVar;
        dVar.e();
        dVar.d.o(true, true, false);
        if (!z10) {
            if (!zo0Var.getUserConfig().isPremium()) {
                string = append;
            } else if (this.f43290s != null) {
                string = string2;
            }
        }
        dVar.g(string, false, true);
        dVar.setOnClickListener(new q50(this, 17));
        frameLayout.addView(dVar, g7.e6.d(-1, 48.0f, 119, 14.0f, 14.66f, 14.0f, 14.0f));
        addView(frameLayout, g7.e6.e(-1, -2, 80));
        mo0Var.j(new l3(this, 23));
        f2.n nVar = new f2.n();
        nVar.n(350L);
        nVar.o(org.telegram.ui.Components.gr.h);
        nVar.C = false;
        nVar.f5532m = false;
        mo0Var.setItemAnimator(nVar);
        if (i9 == 0) {
            Context context2 = getContext();
            i11 = ((org.telegram.ui.ActionBar.o2) zo0Var).currentAccount;
            b6Var2 = ((org.telegram.ui.ActionBar.o2) zo0Var).resourceProvider;
            yo0 yo0Var = new yo0(i11, 0L, context2, b6Var2);
            this.f43277a = yo0Var;
            i(false);
            addView(yo0Var, g7.e6.e(-1, -2, 55));
        } else {
            Context context3 = getContext();
            b5Var = ((org.telegram.ui.ActionBar.o2) zo0Var).parentLayout;
            b6Var = ((org.telegram.ui.ActionBar.o2) zo0Var).resourceProvider;
            org.telegram.ui.Cells.fa faVar = new org.telegram.ui.Cells.fa(context3, b5Var, 3, 0L, b6Var);
            this.f43291w = faVar;
            faVar.setImportantForAccessibility(4);
            faVar.f24356r = zo0Var;
            addView(faVar, g7.e6.e(-1, -2, 55));
        }
        g();
        j();
        setWillNotDraw(false);
    }

    public static void a(uo0 uo0Var) {
        float f10;
        mo0 mo0Var = uo0Var.f43279b;
        FrameLayout frameLayout = uo0Var.f43284e;
        if (frameLayout == null) {
            return;
        }
        int i9 = uo0Var.f43281c.f41216e.f43278a0 - 1;
        boolean z10 = false;
        int i10 = 0;
        for (int i11 = 0; i11 < mo0Var.getChildCount(); i11++) {
            View childAt = mo0Var.getChildAt(i11);
            int R = RecyclerView.R(childAt);
            if (R != -1 && R <= i9) {
                i10 = Math.max(i10, childAt.getTop());
                if (R == i9) {
                    z10 = true;
                }
            }
        }
        if (!z10) {
            i10 = mo0Var.getMeasuredHeight();
        }
        float max = Math.max(0, i10 - (mo0Var.getMeasuredHeight() - AndroidUtilities.dp(76.66f)));
        int i12 = uo0Var.f43282c0;
        if (i12 == 0 || i12 == 1) {
            ViewPropertyAnimator animate = uo0Var.d.animate();
            if (max > 0.0f) {
                f10 = 0.0f;
            } else {
                f10 = 1.0f;
            }
            animate.alpha(f10).start();
            max = 0.0f;
        }
        frameLayout.setTranslationY(max);
    }

    public final boolean b() {
        zo0 zo0Var = this.f43287f0;
        boolean z10 = zo0Var.f45192a;
        long j10 = 0;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible = null;
        int i9 = this.f43282c0;
        int i10 = -1;
        if (z10) {
            TLRPC.Chat chat = zo0Var.getMessagesController().getChat(0L);
            if (chat != null) {
                if (i9 == 1) {
                    if (this.f43288n == ChatObject.getColorId(chat) && this.f43289r == ChatObject.getEmojiId(chat)) {
                        TLRPC.PeerColor peerColor = chat.color;
                        if (peerColor instanceof TLRPC.TL_peerColorCollectible) {
                            tL_peerColorCollectible = (TLRPC.TL_peerColorCollectible) peerColor;
                        }
                        TLRPC.TL_peerColorCollectible tL_peerColorCollectible2 = this.v;
                        if (tL_peerColorCollectible != tL_peerColorCollectible2) {
                            if (tL_peerColorCollectible != null || tL_peerColorCollectible2 != null) {
                                if (tL_peerColorCollectible != null && tL_peerColorCollectible2 != null && tL_peerColorCollectible.collectible_id == tL_peerColorCollectible2.collectible_id) {
                                    return false;
                                }
                            } else {
                                return false;
                            }
                        } else {
                            return false;
                        }
                    }
                } else {
                    int i11 = this.f43288n;
                    if (!(chat.emoji_status instanceof TLRPC.TL_emojiStatusCollectible)) {
                        i10 = ChatObject.getProfileColorId(chat);
                    }
                    if (i11 == i10) {
                        long j11 = this.f43289r;
                        if (!(chat.emoji_status instanceof TLRPC.TL_emojiStatusCollectible)) {
                            j10 = ChatObject.getOnlyProfileEmojiId(chat);
                        }
                        if (j11 == j10 && zo0.w0(chat.emoji_status, this.f43290s)) {
                            return false;
                        }
                    }
                }
            } else {
                return false;
            }
        } else {
            TLRPC.User currentUser = zo0Var.getUserConfig().getCurrentUser();
            if (currentUser != null) {
                if (i9 == 1) {
                    int i12 = this.f43288n;
                    if (!(currentUser.color instanceof TLRPC.TL_peerColorCollectible)) {
                        i10 = UserObject.getColorId(currentUser);
                    }
                    if (i12 == i10 && this.f43289r == UserObject.getEmojiId(currentUser)) {
                        TLRPC.PeerColor peerColor2 = currentUser.color;
                        if (peerColor2 instanceof TLRPC.TL_peerColorCollectible) {
                            tL_peerColorCollectible = (TLRPC.TL_peerColorCollectible) peerColor2;
                        }
                        TLRPC.TL_peerColorCollectible tL_peerColorCollectible3 = this.v;
                        if (tL_peerColorCollectible != tL_peerColorCollectible3) {
                            if (tL_peerColorCollectible != null || tL_peerColorCollectible3 != null) {
                                if (tL_peerColorCollectible != null && tL_peerColorCollectible3 != null && tL_peerColorCollectible.collectible_id == tL_peerColorCollectible3.collectible_id) {
                                    return false;
                                }
                            } else {
                                return false;
                            }
                        } else {
                            return false;
                        }
                    }
                } else {
                    int i13 = this.f43288n;
                    if (!(currentUser.emoji_status instanceof TLRPC.TL_emojiStatusCollectible)) {
                        i10 = UserObject.getProfileColorId(currentUser);
                    }
                    if (i13 == i10) {
                        long j12 = this.f43289r;
                        if (!(currentUser.emoji_status instanceof TLRPC.TL_emojiStatusCollectible)) {
                            j10 = UserObject.getOnlyProfileEmojiId(currentUser);
                        }
                        if (j12 == j10 && zo0.w0(currentUser.emoji_status, this.f43290s)) {
                            return false;
                        }
                    }
                }
            } else {
                return false;
            }
        }
        return true;
    }

    public final boolean c() {
        mo0 mo0Var = this.f43279b;
        if (mo0Var != null) {
            for (int i9 = 0; i9 < mo0Var.getChildCount(); i9++) {
                if (mo0Var.getChildAt(i9) instanceof org.telegram.ui.Components.e00) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void d() {
        TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible;
        int i9 = this.f43282c0;
        zo0 zo0Var = this.f43287f0;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible = null;
        if (i9 == 0) {
            TLRPC.User currentUser = zo0Var.getUserConfig().getCurrentUser();
            this.f43288n = UserObject.getProfileColorId(currentUser);
            this.f43289r = UserObject.getProfileEmojiId(currentUser);
            if (currentUser != null) {
                TLRPC.EmojiStatus emojiStatus = currentUser.emoji_status;
                if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                    tL_emojiStatusCollectible = (TLRPC.TL_emojiStatusCollectible) emojiStatus;
                    this.f43290s = tL_emojiStatusCollectible;
                    this.v = null;
                }
            }
            tL_emojiStatusCollectible = null;
            this.f43290s = tL_emojiStatusCollectible;
            this.v = null;
        } else {
            TLRPC.User currentUser2 = zo0Var.getUserConfig().getCurrentUser();
            this.f43288n = UserObject.getColorId(currentUser2);
            this.f43289r = UserObject.getEmojiId(currentUser2);
            this.f43290s = null;
            if (currentUser2 != null) {
                TLRPC.PeerColor peerColor = currentUser2.color;
                if (peerColor instanceof TLRPC.TL_peerColorCollectible) {
                    tL_peerColorCollectible = (TLRPC.TL_peerColorCollectible) peerColor;
                }
            }
            this.v = tL_peerColorCollectible;
        }
        if (this.f43290s == null && this.v == null) {
            return;
        }
        this.f43288n = -1;
        this.f43289r = 0L;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        zo0 zo0Var = this.f43287f0;
        if (zo0Var.getParentLayout() != null) {
            ((ActionBarLayout) zo0Var.getParentLayout()).q(canvas, this.f43283d0);
        }
    }

    public final void e() {
        j();
        this.f43281c.l();
    }

    public final void f() {
        CharSequence charSequence;
        kh.d dVar = this.f43286f;
        if (dVar == null) {
            return;
        }
        TL_stars.TL_starGiftUnique tL_starGiftUnique = this.f43293y;
        if (tL_starGiftUnique != null) {
            gf.a resellAmount = tL_starGiftUnique.getResellAmount(gf.b.f7749a);
            if (tL_starGiftUnique.resale_ton_only) {
                dVar.g(gh.oa.S0(LocaleController.formatString(R.string.ResellGiftBuyTON, tL_starGiftUnique.getResellAmount(gf.b.f7750b).d()), true), true, true);
                dVar.f(gh.oa.Q0(LocaleController.formatPluralStringComma("ResellGiftBuyEq", (int) resellAmount.a())), true);
                return;
            }
            dVar.g(gh.oa.Q0(LocaleController.formatPluralStringComma("ResellGiftBuy", (int) resellAmount.a())), true, true);
            dVar.f(null, true);
            return;
        }
        zo0 zo0Var = this.f43287f0;
        if (!zo0Var.getUserConfig().isPremium() && !zo0Var.f45192a) {
            charSequence = this.E;
        } else if (this.f43290s != null) {
            charSequence = this.G;
        } else {
            charSequence = this.F;
        }
        dVar.g(charSequence, true, true);
        dVar.f(null, true);
    }

    public final void g() {
        int i9 = org.telegram.ui.ActionBar.f6.f22947a7;
        zo0 zo0Var = this.f43287f0;
        int themedColor = zo0Var.getThemedColor(i9);
        mo0 mo0Var = this.f43279b;
        mo0Var.setBackgroundColor(themedColor);
        kh.d dVar = this.f43286f;
        if (dVar != null) {
            dVar.j();
        }
        org.telegram.ui.Cells.fa faVar = this.f43291w;
        if (faVar != null) {
            faVar.invalidate();
        }
        i(true);
        this.f43284e.setBackgroundColor(zo0Var.getThemedColor(i9));
        this.d.setBackgroundColor(zo0Var.getThemedColor(org.telegram.ui.ActionBar.f6.f23002d7));
        AndroidUtilities.forEachViews((RecyclerView) mo0Var, (d5.d) new sb(this, 3));
    }

    public final void h() {
        MessageObject messageObject;
        org.telegram.ui.Cells.fa faVar = this.f43291w;
        if (faVar != null) {
            org.telegram.ui.Cells.t1[] cells = faVar.getCells();
            for (int i9 = 0; i9 < cells.length; i9++) {
                org.telegram.ui.Cells.t1 t1Var = cells[i9];
                if (t1Var != null && (messageObject = t1Var.getMessageObject()) != null) {
                    messageObject.notime = true;
                    xo0 xo0Var = this.h;
                    if (xo0Var != null) {
                        messageObject.overrideLinkColor = xo0Var.getColorId();
                    }
                    messageObject.overrideLinkEmoji = this.f43289r;
                    messageObject.overrideLinkPeerColor = this.v;
                    cells[i9].setAvatar(messageObject);
                    cells[i9].invalidate();
                }
            }
        }
    }

    public final void i(boolean z10) {
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible;
        boolean z11;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible2;
        boolean z12;
        int i9;
        zo0 zo0Var;
        fo0 fo0Var;
        int i10;
        xo0 xo0Var = this.h;
        if (xo0Var != null) {
            xo0Var.a(this.f43288n, z10);
        }
        yo0 yo0Var = this.f43277a;
        if (yo0Var != null) {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = this.f43290s;
            if (tL_emojiStatusCollectible != null) {
                yo0Var.e(tL_emojiStatusCollectible.document_id, true, z10);
                yo0Var.c(MessagesController.PeerColor.fromCollectible(this.f43290s), z10);
                yo0Var.d(this.f43290s.pattern_document_id, true, z10);
            } else {
                if (DialogObject.isEmojiStatusCollectible(0L)) {
                    yo0Var.e(0L, false, z10);
                } else {
                    yo0Var.e(DialogObject.getEmojiStatusDocumentId(0L), DialogObject.isEmojiStatusCollectible(0L), z10);
                }
                yo0Var.b(this.f43288n, z10);
                yo0Var.d(this.f43289r, false, z10);
            }
        }
        int i11 = this.f43282c0;
        if (i11 == 0 && (fo0Var = (zo0Var = this.f43287f0).f45195e) != null) {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2 = this.f43290s;
            if (tL_emojiStatusCollectible2 == null) {
                i10 = ((org.telegram.ui.ActionBar.o2) zo0Var).currentAccount;
                fo0Var.b(i10, this.f43288n, z10);
            } else {
                fo0Var.c(MessagesController.PeerColor.fromCollectible(tL_emojiStatusCollectible2), z10);
            }
        }
        if (i11 == 0) {
            int i12 = this.M;
            j();
            oo0 oo0Var = this.f43281c;
            if (i12 >= 0 && this.M < 0) {
                oo0Var.t(i12, 2);
            } else if (i12 < 0 && (i9 = this.M) >= 0) {
                oo0Var.s(i9, 2);
            }
        }
        int i13 = 0;
        while (true) {
            mo0 mo0Var = this.f43279b;
            if (i13 < mo0Var.getChildCount()) {
                View childAt = mo0Var.getChildAt(i13);
                if (childAt instanceof ko0) {
                    ko0 ko0Var = (ko0) childAt;
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible3 = this.f43290s;
                    if ((tL_emojiStatusCollectible3 != null && tL_emojiStatusCollectible3.collectible_id == ko0Var.getGiftId()) || ((tL_peerColorCollectible2 = this.v) != null && tL_peerColorCollectible2.collectible_id == ko0Var.getGiftId())) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    ko0Var.b(z12, true);
                } else if (childAt instanceof fh.f2) {
                    fh.f2 f2Var = (fh.f2) childAt;
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible4 = this.f43290s;
                    if ((tL_emojiStatusCollectible4 != null && tL_emojiStatusCollectible4.collectible_id == f2Var.getGiftId()) || ((tL_peerColorCollectible = this.v) != null && tL_peerColorCollectible.collectible_id == f2Var.getGiftId())) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    f2Var.e(z11, true);
                }
                i13++;
            } else {
                return;
            }
        }
    }

    public final void j() {
        gh.n7 n7Var;
        int i9;
        zo0 zo0Var = this.f43287f0;
        gh.n7 n7Var2 = zo0Var.f45193b;
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
        ArrayList arrayList = this.f43280b0;
        arrayList.clear();
        this.H = 0;
        this.J = 1;
        int i10 = 3;
        this.f43278a0 = 3;
        this.I = 2;
        int i11 = this.f43282c0;
        if (i11 == 0 && (this.f43288n >= 0 || this.f43290s != null || this.v != null)) {
            this.M = 3;
            this.f43278a0 = 5;
            this.N = 4;
        }
        if (i11 == 1) {
            n7Var = zo0Var.f45194c;
        } else {
            n7Var = n7Var2;
        }
        if ((i11 == 0 || i11 == 1) && n7Var != null) {
            ArrayList arrayList2 = n7Var.f8625l;
            int i12 = this.f43278a0;
            this.f43278a0 = i12 + 1;
            this.V = i12;
            if (this.B == null) {
                for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                    TL_stars.StarGift starGift = ((TL_stars.SavedStarGift) arrayList2.get(i13)).gift;
                    if (starGift instanceof TL_stars.TL_starGiftUnique) {
                        arrayList.add((TL_stars.TL_starGiftUnique) starGift);
                    }
                }
                int i14 = this.f43278a0;
                this.P = i14;
                this.f43278a0 = arrayList.size() + i14;
                int size = arrayList.size() + this.T;
                this.T = size;
                int i15 = this.f43278a0;
                this.Q = i15;
                if (!n7Var2.f8622i && n7Var2.f8623j) {
                    if (arrayList.isEmpty()) {
                        int i16 = this.f43278a0;
                        this.f43278a0 = i16 + 1;
                        this.W = i16;
                    }
                } else {
                    this.R = i15;
                    int i17 = 3 - (size % 3);
                    if (size <= 0) {
                        i10 = 9;
                    } else if (i17 > 0) {
                        i10 = i17;
                    }
                    int i18 = i15 + i10;
                    this.f43278a0 = i18;
                    this.T = size + i10;
                    this.S = i18;
                }
                if (c()) {
                    n7Var.a();
                }
            } else if (this.A != null) {
                i9 = ((org.telegram.ui.ActionBar.o2) zo0Var).currentAccount;
                long clientUserId = UserConfig.getInstance(i9).getClientUserId();
                for (int i19 = 0; i19 < this.A.d.size(); i19++) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.A.d.get(i19);
                    if (DialogObject.getPeerDialogId(tL_starGiftUnique.owner_id) != clientUserId && DialogObject.getPeerDialogId(tL_starGiftUnique.host_id) != clientUserId) {
                        arrayList.add(tL_starGiftUnique);
                    }
                }
                int i20 = this.f43278a0;
                this.P = i20;
                this.f43278a0 = arrayList.size() + i20;
                int size2 = arrayList.size() + this.T;
                this.T = size2;
                int i21 = this.f43278a0;
                this.Q = i21;
                fh.p5 p5Var = this.A;
                if (p5Var.f6718t || !p5Var.f6719u) {
                    this.R = i21;
                    int i22 = 3 - (size2 % 3);
                    if (size2 <= 0) {
                        i10 = 9;
                    } else if (i22 > 0) {
                        i10 = i22;
                    }
                    int i23 = i21 + i10;
                    this.f43278a0 = i23;
                    this.T = size2 + i10;
                    this.S = i23;
                }
                if (c()) {
                    this.A.g(false);
                }
            }
            int i24 = this.f43278a0;
            this.f43278a0 = i24 + 1;
            this.U = i24;
        }
        int i25 = this.f43278a0;
        this.f43278a0 = i25 + 1;
        this.L = i25;
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        int i11 = this.f43282c0;
        mo0 mo0Var = this.f43279b;
        if (i11 == 1) {
            super.onMeasure(i9, i10);
            org.telegram.ui.Cells.fa faVar = this.f43291w;
            this.f43283d0 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + faVar.getMeasuredHeight() + AndroidUtilities.statusBarHeight;
            ((ViewGroup.MarginLayoutParams) faVar.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
            ((ViewGroup.MarginLayoutParams) mo0Var.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
            mo0Var.setPadding(0, faVar.getMeasuredHeight(), 0, 0);
        } else {
            this.f43283d0 = AndroidUtilities.dp(230.0f) + AndroidUtilities.statusBarHeight;
            ((ViewGroup.MarginLayoutParams) mo0Var.getLayoutParams()).topMargin = this.f43283d0;
            ((ViewGroup.MarginLayoutParams) this.f43277a.getLayoutParams()).height = this.f43283d0;
        }
        super.onMeasure(i9, i10);
    }
}
