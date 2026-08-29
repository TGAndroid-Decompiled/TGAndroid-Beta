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
public final class to0 extends FrameLayout {
    public ih.b5 A;
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
    public final xo0 f43067a;
    public int f43068a0;
    public final lo0 f43069b;
    public final ArrayList f43070b0;
    public final no0 f43071c;
    public final int f43072c0;
    public final View d;
    public int f43073d0;
    public final FrameLayout f43074e;
    public qo0 f43075e0;
    public final nh.d f43076f;
    public final yo0 f43077f0;
    public wo0 h;
    public int f43078n;
    public long f43079r;
    public TLRPC.TL_emojiStatusCollectible f43080s;
    public TLRPC.TL_peerColorCollectible v;
    public final org.telegram.ui.Cells.ca f43081w;
    public so0 f43082x;
    public TL_stars.TL_starGiftUnique f43083y;

    public to0(yo0 yo0Var, Context context, int i10) {
        super(context);
        int i11;
        org.telegram.ui.ActionBar.b5 b5Var;
        org.telegram.ui.ActionBar.c6 c6Var;
        int i12;
        org.telegram.ui.ActionBar.c6 c6Var2;
        this.f43077f0 = yo0Var;
        this.f43078n = -1;
        this.f43079r = 0L;
        this.f43080s = null;
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
        this.f43070b0 = new ArrayList();
        this.f43072c0 = i10;
        d();
        lo0 lo0Var = new lo0(this, getContext(), yo0Var.getResourceProvider(), i10);
        this.f43069b = lo0Var;
        ((f2.l) lo0Var.getItemAnimator()).f6463m = false;
        getContext();
        f2.w wVar = new f2.w(3);
        wVar.O = new ih.n5(this, 8);
        lo0Var.i(new eg.f2(this, 8));
        lo0Var.setLayoutManager(wVar);
        no0 no0Var = new no0(this, context, i10);
        this.f43071c = no0Var;
        lo0Var.setAdapter(no0Var);
        lo0Var.setOnItemClickListener(new org.telegram.ui.Components.nm0(this, i10, 1));
        lo0Var.j(new oo0(this, i10));
        addView(lo0Var, i7.f6.c(-1.0f, -1));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f43074e = frameLayout;
        frameLayout.setBackgroundColor(yo0Var.getThemedColor(org.telegram.ui.ActionBar.g6.f23009a7));
        View view = new View(getContext());
        this.d = view;
        view.setBackgroundColor(yo0Var.getThemedColor(org.telegram.ui.ActionBar.g6.f23063d7));
        view.setAlpha(0.0f);
        frameLayout.addView(view, i7.f6.d(-1, 0.66f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("l");
        spannableStringBuilder.setSpan(new org.telegram.ui.Components.iq(R.drawable.msg_mini_lock2, 0), 0, 1, 33);
        boolean z10 = yo0Var.f44941a;
        if (z10) {
            i11 = R.string.ChannelColorApply;
        } else {
            i11 = R.string.UserColorApply;
        }
        String string = LocaleController.getString(i11);
        this.F = string;
        SpannableStringBuilder append = new SpannableStringBuilder(spannableStringBuilder).append((CharSequence) " ").append((CharSequence) string);
        this.E = append;
        String string2 = LocaleController.getString(R.string.UserColorApplyCollectible);
        this.G = string2;
        nh.d dVar = new nh.d(getContext(), yo0Var.getResourceProvider(), true);
        this.f43076f = dVar;
        dVar.e();
        dVar.d.o(true, true, false);
        if (!z10) {
            if (!yo0Var.getUserConfig().isPremium()) {
                string = append;
            } else if (this.f43080s != null) {
                string = string2;
            }
        }
        dVar.g(string, false, true);
        dVar.setOnClickListener(new t50(this, 17));
        frameLayout.addView(dVar, i7.f6.d(-1, 48.0f, 119, 14.0f, 14.66f, 14.0f, 14.0f));
        addView(frameLayout, i7.f6.e(-1, -2, 80));
        lo0Var.j(new m3(this, 23));
        f2.l lVar = new f2.l();
        lVar.n(350L);
        lVar.o(org.telegram.ui.Components.jr.h);
        lVar.C = false;
        lVar.f6463m = false;
        lo0Var.setItemAnimator(lVar);
        if (i10 == 0) {
            Context context2 = getContext();
            i12 = ((org.telegram.ui.ActionBar.o2) yo0Var).currentAccount;
            c6Var2 = ((org.telegram.ui.ActionBar.o2) yo0Var).resourceProvider;
            xo0 xo0Var = new xo0(i12, 0L, context2, c6Var2);
            this.f43067a = xo0Var;
            i(false);
            addView(xo0Var, i7.f6.e(-1, -2, 55));
        } else {
            Context context3 = getContext();
            b5Var = ((org.telegram.ui.ActionBar.o2) yo0Var).parentLayout;
            c6Var = ((org.telegram.ui.ActionBar.o2) yo0Var).resourceProvider;
            org.telegram.ui.Cells.ca caVar = new org.telegram.ui.Cells.ca(context3, b5Var, 3, 0L, c6Var);
            this.f43081w = caVar;
            caVar.setImportantForAccessibility(4);
            caVar.f24192r = yo0Var;
            addView(caVar, i7.f6.e(-1, -2, 55));
        }
        g();
        j();
        setWillNotDraw(false);
    }

    public static void a(to0 to0Var) {
        float f9;
        lo0 lo0Var = to0Var.f43069b;
        FrameLayout frameLayout = to0Var.f43074e;
        if (frameLayout == null) {
            return;
        }
        int i10 = to0Var.f43071c.f40855e.f43068a0 - 1;
        boolean z10 = false;
        int i11 = 0;
        for (int i12 = 0; i12 < lo0Var.getChildCount(); i12++) {
            View childAt = lo0Var.getChildAt(i12);
            int R = RecyclerView.R(childAt);
            if (R != -1 && R <= i10) {
                i11 = Math.max(i11, childAt.getTop());
                if (R == i10) {
                    z10 = true;
                }
            }
        }
        if (!z10) {
            i11 = lo0Var.getMeasuredHeight();
        }
        float max = Math.max(0, i11 - (lo0Var.getMeasuredHeight() - AndroidUtilities.dp(76.66f)));
        int i13 = to0Var.f43072c0;
        if (i13 == 0 || i13 == 1) {
            ViewPropertyAnimator animate = to0Var.d.animate();
            if (max > 0.0f) {
                f9 = 0.0f;
            } else {
                f9 = 1.0f;
            }
            animate.alpha(f9).start();
            max = 0.0f;
        }
        frameLayout.setTranslationY(max);
    }

    public final boolean b() {
        yo0 yo0Var = this.f43077f0;
        boolean z10 = yo0Var.f44941a;
        long j10 = 0;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible = null;
        int i10 = this.f43072c0;
        int i11 = -1;
        if (z10) {
            TLRPC.Chat chat = yo0Var.getMessagesController().getChat(0L);
            if (chat != null) {
                if (i10 == 1) {
                    if (this.f43078n == ChatObject.getColorId(chat) && this.f43079r == ChatObject.getEmojiId(chat)) {
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
                    int i12 = this.f43078n;
                    if (!(chat.emoji_status instanceof TLRPC.TL_emojiStatusCollectible)) {
                        i11 = ChatObject.getProfileColorId(chat);
                    }
                    if (i12 == i11) {
                        long j11 = this.f43079r;
                        if (!(chat.emoji_status instanceof TLRPC.TL_emojiStatusCollectible)) {
                            j10 = ChatObject.getOnlyProfileEmojiId(chat);
                        }
                        if (j11 == j10 && yo0.x0(chat.emoji_status, this.f43080s)) {
                            return false;
                        }
                    }
                }
            } else {
                return false;
            }
        } else {
            TLRPC.User currentUser = yo0Var.getUserConfig().getCurrentUser();
            if (currentUser != null) {
                if (i10 == 1) {
                    int i13 = this.f43078n;
                    if (!(currentUser.color instanceof TLRPC.TL_peerColorCollectible)) {
                        i11 = UserObject.getColorId(currentUser);
                    }
                    if (i13 == i11 && this.f43079r == UserObject.getEmojiId(currentUser)) {
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
                    int i14 = this.f43078n;
                    if (!(currentUser.emoji_status instanceof TLRPC.TL_emojiStatusCollectible)) {
                        i11 = UserObject.getProfileColorId(currentUser);
                    }
                    if (i14 == i11) {
                        long j12 = this.f43079r;
                        if (!(currentUser.emoji_status instanceof TLRPC.TL_emojiStatusCollectible)) {
                            j10 = UserObject.getOnlyProfileEmojiId(currentUser);
                        }
                        if (j12 == j10 && yo0.x0(currentUser.emoji_status, this.f43080s)) {
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
        lo0 lo0Var = this.f43069b;
        if (lo0Var != null) {
            for (int i10 = 0; i10 < lo0Var.getChildCount(); i10++) {
                if (lo0Var.getChildAt(i10) instanceof org.telegram.ui.Components.p00) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void d() {
        TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible;
        int i10 = this.f43072c0;
        yo0 yo0Var = this.f43077f0;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible = null;
        if (i10 == 0) {
            TLRPC.User currentUser = yo0Var.getUserConfig().getCurrentUser();
            this.f43078n = UserObject.getProfileColorId(currentUser);
            this.f43079r = UserObject.getProfileEmojiId(currentUser);
            if (currentUser != null) {
                TLRPC.EmojiStatus emojiStatus = currentUser.emoji_status;
                if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                    tL_emojiStatusCollectible = (TLRPC.TL_emojiStatusCollectible) emojiStatus;
                    this.f43080s = tL_emojiStatusCollectible;
                    this.v = null;
                }
            }
            tL_emojiStatusCollectible = null;
            this.f43080s = tL_emojiStatusCollectible;
            this.v = null;
        } else {
            TLRPC.User currentUser2 = yo0Var.getUserConfig().getCurrentUser();
            this.f43078n = UserObject.getColorId(currentUser2);
            this.f43079r = UserObject.getEmojiId(currentUser2);
            this.f43080s = null;
            if (currentUser2 != null) {
                TLRPC.PeerColor peerColor = currentUser2.color;
                if (peerColor instanceof TLRPC.TL_peerColorCollectible) {
                    tL_peerColorCollectible = (TLRPC.TL_peerColorCollectible) peerColor;
                }
            }
            this.v = tL_peerColorCollectible;
        }
        if (this.f43080s == null && this.v == null) {
            return;
        }
        this.f43078n = -1;
        this.f43079r = 0L;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        yo0 yo0Var = this.f43077f0;
        if (yo0Var.getParentLayout() != null) {
            ((ActionBarLayout) yo0Var.getParentLayout()).q(canvas, this.f43073d0);
        }
    }

    public final void e() {
        j();
        this.f43071c.l();
    }

    public final void f() {
        CharSequence charSequence;
        nh.d dVar = this.f43076f;
        if (dVar == null) {
            return;
        }
        TL_stars.TL_starGiftUnique tL_starGiftUnique = this.f43083y;
        if (tL_starGiftUnique != null) {
            kf.a resellAmount = tL_starGiftUnique.getResellAmount(kf.b.f13635a);
            if (tL_starGiftUnique.resale_ton_only) {
                dVar.g(jh.ia.S0(LocaleController.formatString(R.string.ResellGiftBuyTON, tL_starGiftUnique.getResellAmount(kf.b.f13636b).d()), true), true, true);
                dVar.f(jh.ia.Q0(LocaleController.formatPluralStringComma("ResellGiftBuyEq", (int) resellAmount.a())), true);
                return;
            }
            dVar.g(jh.ia.Q0(LocaleController.formatPluralStringComma("ResellGiftBuy", (int) resellAmount.a())), true, true);
            dVar.f(null, true);
            return;
        }
        yo0 yo0Var = this.f43077f0;
        if (!yo0Var.getUserConfig().isPremium() && !yo0Var.f44941a) {
            charSequence = this.E;
        } else if (this.f43080s != null) {
            charSequence = this.G;
        } else {
            charSequence = this.F;
        }
        dVar.g(charSequence, true, true);
        dVar.f(null, true);
    }

    public final void g() {
        int i10 = org.telegram.ui.ActionBar.g6.f23009a7;
        yo0 yo0Var = this.f43077f0;
        int themedColor = yo0Var.getThemedColor(i10);
        lo0 lo0Var = this.f43069b;
        lo0Var.setBackgroundColor(themedColor);
        nh.d dVar = this.f43076f;
        if (dVar != null) {
            dVar.j();
        }
        org.telegram.ui.Cells.ca caVar = this.f43081w;
        if (caVar != null) {
            caVar.invalidate();
        }
        i(true);
        this.f43074e.setBackgroundColor(yo0Var.getThemedColor(i10));
        this.d.setBackgroundColor(yo0Var.getThemedColor(org.telegram.ui.ActionBar.g6.f23063d7));
        AndroidUtilities.forEachViews((RecyclerView) lo0Var, (f5.d) new rb(this, 3));
    }

    public final void h() {
        MessageObject messageObject;
        org.telegram.ui.Cells.ca caVar = this.f43081w;
        if (caVar != null) {
            org.telegram.ui.Cells.s1[] cells = caVar.getCells();
            for (int i10 = 0; i10 < cells.length; i10++) {
                org.telegram.ui.Cells.s1 s1Var = cells[i10];
                if (s1Var != null && (messageObject = s1Var.getMessageObject()) != null) {
                    messageObject.notime = true;
                    wo0 wo0Var = this.h;
                    if (wo0Var != null) {
                        messageObject.overrideLinkColor = wo0Var.getColorId();
                    }
                    messageObject.overrideLinkEmoji = this.f43079r;
                    messageObject.overrideLinkPeerColor = this.v;
                    cells[i10].setAvatar(messageObject);
                    cells[i10].invalidate();
                }
            }
        }
    }

    public final void i(boolean z10) {
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible;
        boolean z11;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible2;
        boolean z12;
        int i10;
        yo0 yo0Var;
        eo0 eo0Var;
        int i11;
        wo0 wo0Var = this.h;
        if (wo0Var != null) {
            wo0Var.a(this.f43078n, z10);
        }
        xo0 xo0Var = this.f43067a;
        if (xo0Var != null) {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = this.f43080s;
            if (tL_emojiStatusCollectible != null) {
                xo0Var.e(tL_emojiStatusCollectible.document_id, true, z10);
                xo0Var.c(MessagesController.PeerColor.fromCollectible(this.f43080s), z10);
                xo0Var.d(this.f43080s.pattern_document_id, true, z10);
            } else {
                if (DialogObject.isEmojiStatusCollectible(0L)) {
                    xo0Var.e(0L, false, z10);
                } else {
                    xo0Var.e(DialogObject.getEmojiStatusDocumentId(0L), DialogObject.isEmojiStatusCollectible(0L), z10);
                }
                xo0Var.b(this.f43078n, z10);
                xo0Var.d(this.f43079r, false, z10);
            }
        }
        int i12 = this.f43072c0;
        if (i12 == 0 && (eo0Var = (yo0Var = this.f43077f0).f44944e) != null) {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2 = this.f43080s;
            if (tL_emojiStatusCollectible2 == null) {
                i11 = ((org.telegram.ui.ActionBar.o2) yo0Var).currentAccount;
                eo0Var.b(i11, this.f43078n, z10);
            } else {
                eo0Var.c(MessagesController.PeerColor.fromCollectible(tL_emojiStatusCollectible2), z10);
            }
        }
        if (i12 == 0) {
            int i13 = this.M;
            j();
            no0 no0Var = this.f43071c;
            if (i13 >= 0 && this.M < 0) {
                no0Var.t(i13, 2);
            } else if (i13 < 0 && (i10 = this.M) >= 0) {
                no0Var.s(i10, 2);
            }
        }
        int i14 = 0;
        while (true) {
            lo0 lo0Var = this.f43069b;
            if (i14 < lo0Var.getChildCount()) {
                View childAt = lo0Var.getChildAt(i14);
                if (childAt instanceof jo0) {
                    jo0 jo0Var = (jo0) childAt;
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible3 = this.f43080s;
                    if ((tL_emojiStatusCollectible3 != null && tL_emojiStatusCollectible3.collectible_id == jo0Var.getGiftId()) || ((tL_peerColorCollectible2 = this.v) != null && tL_peerColorCollectible2.collectible_id == jo0Var.getGiftId())) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    jo0Var.b(z12, true);
                } else if (childAt instanceof ih.y1) {
                    ih.y1 y1Var = (ih.y1) childAt;
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible4 = this.f43080s;
                    if ((tL_emojiStatusCollectible4 != null && tL_emojiStatusCollectible4.collectible_id == y1Var.getGiftId()) || ((tL_peerColorCollectible = this.v) != null && tL_peerColorCollectible.collectible_id == y1Var.getGiftId())) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    y1Var.e(z11, true);
                }
                i14++;
            } else {
                return;
            }
        }
    }

    public final void j() {
        jh.k7 k7Var;
        int i10;
        yo0 yo0Var = this.f43077f0;
        jh.k7 k7Var2 = yo0Var.f44942b;
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
        ArrayList arrayList = this.f43070b0;
        arrayList.clear();
        this.H = 0;
        this.J = 1;
        int i11 = 3;
        this.f43068a0 = 3;
        this.I = 2;
        int i12 = this.f43072c0;
        if (i12 == 0 && (this.f43078n >= 0 || this.f43080s != null || this.v != null)) {
            this.M = 3;
            this.f43068a0 = 5;
            this.N = 4;
        }
        if (i12 == 1) {
            k7Var = yo0Var.f44943c;
        } else {
            k7Var = k7Var2;
        }
        if ((i12 == 0 || i12 == 1) && k7Var != null) {
            ArrayList arrayList2 = k7Var.f12387l;
            int i13 = this.f43068a0;
            this.f43068a0 = i13 + 1;
            this.V = i13;
            if (this.B == null) {
                for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                    TL_stars.StarGift starGift = ((TL_stars.SavedStarGift) arrayList2.get(i14)).gift;
                    if (starGift instanceof TL_stars.TL_starGiftUnique) {
                        arrayList.add((TL_stars.TL_starGiftUnique) starGift);
                    }
                }
                int i15 = this.f43068a0;
                this.P = i15;
                this.f43068a0 = arrayList.size() + i15;
                int size = arrayList.size() + this.T;
                this.T = size;
                int i16 = this.f43068a0;
                this.Q = i16;
                if (!k7Var2.f12384i && k7Var2.f12385j) {
                    if (arrayList.isEmpty()) {
                        int i17 = this.f43068a0;
                        this.f43068a0 = i17 + 1;
                        this.W = i17;
                    }
                } else {
                    this.R = i16;
                    int i18 = 3 - (size % 3);
                    if (size <= 0) {
                        i11 = 9;
                    } else if (i18 > 0) {
                        i11 = i18;
                    }
                    int i19 = i16 + i11;
                    this.f43068a0 = i19;
                    this.T = size + i11;
                    this.S = i19;
                }
                if (c()) {
                    k7Var.a();
                }
            } else if (this.A != null) {
                i10 = ((org.telegram.ui.ActionBar.o2) yo0Var).currentAccount;
                long clientUserId = UserConfig.getInstance(i10).getClientUserId();
                for (int i20 = 0; i20 < this.A.d.size(); i20++) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.A.d.get(i20);
                    if (DialogObject.getPeerDialogId(tL_starGiftUnique.owner_id) != clientUserId && DialogObject.getPeerDialogId(tL_starGiftUnique.host_id) != clientUserId) {
                        arrayList.add(tL_starGiftUnique);
                    }
                }
                int i21 = this.f43068a0;
                this.P = i21;
                this.f43068a0 = arrayList.size() + i21;
                int size2 = arrayList.size() + this.T;
                this.T = size2;
                int i22 = this.f43068a0;
                this.Q = i22;
                ih.b5 b5Var = this.A;
                if (b5Var.f9060t || !b5Var.f9061u) {
                    this.R = i22;
                    int i23 = 3 - (size2 % 3);
                    if (size2 <= 0) {
                        i11 = 9;
                    } else if (i23 > 0) {
                        i11 = i23;
                    }
                    int i24 = i22 + i11;
                    this.f43068a0 = i24;
                    this.T = size2 + i11;
                    this.S = i24;
                }
                if (c()) {
                    this.A.g(false);
                }
            }
            int i25 = this.f43068a0;
            this.f43068a0 = i25 + 1;
            this.U = i25;
        }
        int i26 = this.f43068a0;
        this.f43068a0 = i26 + 1;
        this.L = i26;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12 = this.f43072c0;
        lo0 lo0Var = this.f43069b;
        if (i12 == 1) {
            super.onMeasure(i10, i11);
            org.telegram.ui.Cells.ca caVar = this.f43081w;
            this.f43073d0 = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + caVar.getMeasuredHeight() + AndroidUtilities.statusBarHeight;
            ((ViewGroup.MarginLayoutParams) caVar.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
            ((ViewGroup.MarginLayoutParams) lo0Var.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
            lo0Var.setPadding(0, caVar.getMeasuredHeight(), 0, 0);
        } else {
            this.f43073d0 = AndroidUtilities.dp(230.0f) + AndroidUtilities.statusBarHeight;
            ((ViewGroup.MarginLayoutParams) lo0Var.getLayoutParams()).topMargin = this.f43073d0;
            ((ViewGroup.MarginLayoutParams) this.f43067a.getLayoutParams()).height = this.f43073d0;
        }
        super.onMeasure(i10, i11);
    }
}
