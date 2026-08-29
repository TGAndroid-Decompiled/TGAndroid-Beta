package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ChatThemeController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public class vc extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate {
    public TLRPC.WallPaper A;
    public TLRPC.WallPaper B;
    public TLRPC.WallPaper C;
    public Drawable D;
    public SpannableStringBuilder E;
    public boolean F;
    public org.telegram.ui.Components.xi0 G;
    public org.telegram.ui.ActionBar.w0 H;
    public org.telegram.ui.Components.jl0 I;
    public hc J;
    public FrameLayout K;
    public nh.d L;
    public ec M;
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
    public int X;
    public int Y;
    public int Z;
    public final long f43502a;
    public int f43503a0;
    public int f43504b;
    public int f43505b0;
    public TL_stories.TL_premium_boostsStatus f43506c;
    public int f43507c0;
    public boolean d;
    public int f43508d0;
    public int f43509e;
    public int f43510e0;
    public int f43511f;
    public int f43512f0;
    public int f43513g0;
    public long h;
    public org.telegram.ui.ActionBar.o2 f43514h0;
    public fc f43515i0;
    public float f43516j0;
    public ValueAnimator f43517k0;
    public boolean f43518l0;
    public org.telegram.ui.ActionBar.c6 m0;
    public long f43519n;
    public final SparseIntArray f43520n0;
    public final org.telegram.ui.ActionBar.d5 f43521o0;
    public final org.telegram.ui.ActionBar.d5 f43522p0;
    public final org.telegram.ui.ActionBar.d5 f43523q0;
    public int f43524r;
    public final org.telegram.ui.ActionBar.d5 f43525r0;
    public int f43526s;
    public final Drawable f43527s0;
    public final Drawable f43528t0;
    public final Paint f43529u0;
    public long v;
    public long f43530w;
    public TLRPC.EmojiStatus f43531x;
    public TLRPC.EmojiStatus f43532y;

    public vc(long j10) {
        super(null);
        boolean q6 = org.telegram.ui.ActionBar.g6.I.q();
        this.F = q6;
        this.N = 0;
        this.f43518l0 = q6;
        this.f43520n0 = new SparseIntArray();
        Paint paint = new Paint(1);
        this.f43529u0 = paint;
        paint.setStrokeWidth(1.0f);
        paint.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23063d7, this.resourceProvider));
        this.f43527s0 = ApplicationLoader.applicationContext.getDrawable(R.drawable.msg_check_s).mutate();
        this.f43528t0 = ApplicationLoader.applicationContext.getDrawable(R.drawable.msg_halfcheck).mutate();
        this.f43502a = j10;
        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-j10));
        if (chat != null) {
            this.f43504b = chat.level;
        }
        MessagesController.getInstance(this.currentAccount).getBoostsController().getBoostsStats(j10, new lh.y1(1, this, chat));
        this.resourceProvider = new uc(this);
        this.f43521o0 = new org.telegram.ui.ActionBar.d5(0, false, false, this.resourceProvider);
        this.f43522p0 = new org.telegram.ui.ActionBar.d5(0, false, true, this.resourceProvider);
        this.f43523q0 = new org.telegram.ui.ActionBar.d5(0, true, false, this.resourceProvider);
        this.f43525r0 = new org.telegram.ui.ActionBar.d5(0, true, true, this.resourceProvider);
    }

    public static void U(vc vcVar) {
        org.telegram.ui.ActionBar.c6 c6Var = vcVar.resourceProvider;
        if (c6Var instanceof uc) {
            vc vcVar2 = ((uc) c6Var).f43223a;
            vcVar2.F = !vcVar2.F;
            vcVar2.d1();
            vcVar2.Z0(false);
        } else {
            vcVar.F = !vcVar.F;
            vcVar.d1();
        }
        vcVar.U0(vcVar.F, true);
        vcVar.Z0(false);
    }

    public static void V(org.telegram.ui.vc r22, org.telegram.tgnet.TLRPC.ChatFull r23, android.view.View r24, int r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.vc.V(org.telegram.ui.vc, org.telegram.tgnet.TLRPC$ChatFull, android.view.View, int):void");
    }

    public static void W(org.telegram.ui.vc r13, org.telegram.messenger.ChannelBoostsController.CanApplyBoost r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.vc.W(org.telegram.ui.vc, org.telegram.messenger.ChannelBoostsController$CanApplyBoost):void");
    }

    public static void Y0(View view) {
        int i10;
        if (view instanceof ic) {
            ic icVar = (ic) view;
            icVar.f39200a.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G6, icVar.d));
        } else if (view instanceof org.telegram.ui.Cells.m8) {
            ((org.telegram.ui.Cells.m8) view).v();
        } else if (view instanceof mc) {
            mc mcVar = (mc) view;
            AndroidUtilities.forEachViews((RecyclerView) mcVar.f40520b, (f5.d) new lh.y1(2, mcVar, MessagesController.getInstance(mcVar.d).peerColors));
        } else if (view instanceof tc) {
            tc tcVar = (tc) view;
            ArrayList arrayList = tcVar.f42646c;
            org.telegram.ui.ActionBar.c6 c6Var = tcVar.f42645b;
            if (c6Var != null) {
                i10 = c6Var.a();
            } else {
                i10 = org.telegram.ui.ActionBar.g6.I.q();
            }
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                ((org.telegram.ui.Components.fp) arrayList.get(i11)).f28514c = i10;
            }
            AndroidUtilities.forEachViews((RecyclerView) tcVar.d, (f5.d) new pc(tcVar, 0));
            tcVar.h.l();
        }
    }

    public int A0() {
        return 0;
    }

    public int B0() {
        return 0;
    }

    public final TLRPC.Document C0(TLRPC.StickerSet stickerSet) {
        if (stickerSet != null && stickerSet.thumb_document_id == 0) {
            TLRPC.TL_messages_stickerSet groupStickerSetById = getMediaDataController().getGroupStickerSetById(stickerSet);
            if (!groupStickerSetById.documents.isEmpty()) {
                return groupStickerSetById.documents.get(0);
            }
        }
        return null;
    }

    public final long D0(TLRPC.StickerSet stickerSet) {
        if (stickerSet == null) {
            return 0L;
        }
        long j10 = stickerSet.thumb_document_id;
        if (j10 == 0) {
            TLRPC.TL_messages_stickerSet groupStickerSetById = getMediaDataController().getGroupStickerSetById(stickerSet);
            if (!groupStickerSetById.documents.isEmpty()) {
                return groupStickerSetById.documents.get(0).f22398id;
            }
        }
        return j10;
    }

    public int E0() {
        return R.string.ChannelEmojiStatusInfo;
    }

    public int F0() {
        return getMessagesController().channelEmojiStatusLevelMin;
    }

    public int G0() {
        return R.string.ChannelEmojiStatus;
    }

    public int H0() {
        return 0;
    }

    public int I0() {
        return 3;
    }

    public int J0() {
        return getMessagesController().channelProfileIconLevelMin;
    }

    public int K0() {
        return R.string.ChannelProfileInfo;
    }

    public int L0() {
        return 0;
    }

    public int M0() {
        return 0;
    }

    public int N0() {
        return R.string.ChannelWallpaper2Info;
    }

    public int O0() {
        return getMessagesController().channelWallpaperLevelMin;
    }

    public int P0() {
        return R.string.ChannelWallpaper;
    }

    public final boolean Q0() {
        if (this.f43509e == this.f43511f && this.h == this.f43519n && this.f43524r == this.f43526s && this.v == this.f43530w && DialogObject.emojiStatusesEqual(this.f43531x, this.f43532y) && ChatThemeController.wallpaperEquals(this.A, this.B)) {
            return false;
        }
        return true;
    }

    public boolean R0() {
        return false;
    }

    public final int S0() {
        MessagesController.PeerColor color;
        MessagesController.PeerColor peerColor = null;
        int i10 = 0;
        if (this.f43509e != this.f43511f) {
            MessagesController.PeerColors peerColors = getMessagesController().peerColors;
            if (peerColors == null) {
                color = null;
            } else {
                color = peerColors.getColor(this.f43511f);
            }
            if (color != null) {
                i10 = Math.max(0, color.getLvl(this.d));
            }
        }
        if (this.h != this.f43519n) {
            i10 = Math.max(i10, getMessagesController().channelBgIconLevelMin);
        }
        if (this.f43524r != this.f43526s) {
            MessagesController.PeerColors peerColors2 = getMessagesController().profilePeerColors;
            if (peerColors2 != null) {
                peerColor = peerColors2.getColor(this.f43526s);
            }
            if (peerColor != null) {
                i10 = Math.max(i10, peerColor.getLvl(this.d));
            }
        }
        if (this.v != this.f43530w) {
            i10 = Math.max(i10, J0());
        }
        if (!DialogObject.emojiStatusesEqual(this.f43531x, this.f43532y)) {
            i10 = Math.max(i10, F0());
        }
        if (!ChatThemeController.wallpaperEquals(this.A, this.B)) {
            return Math.max(i10, O0());
        }
        return i10;
    }

    public final void U0(boolean z10, boolean z11) {
        int i10;
        if (this.f43518l0 != z10) {
            this.f43518l0 = z10;
            int i11 = 0;
            if (z11) {
                org.telegram.ui.Components.xi0 xi0Var = this.G;
                if (z10) {
                    i11 = xi0Var.f34737e[0];
                }
                xi0Var.N(i11);
                org.telegram.ui.Components.xi0 xi0Var2 = this.G;
                if (xi0Var2 != null) {
                    xi0Var2.start();
                    return;
                }
                return;
            }
            if (z10) {
                i10 = this.G.f34737e[0] - 1;
            } else {
                i10 = 0;
            }
            this.G.L(i10, false, true);
            this.G.N(i10);
            org.telegram.ui.ActionBar.w0 w0Var = this.H;
            if (w0Var != null) {
                w0Var.invalidate();
            }
        }
    }

    public final void V0() {
        if (getVisibleDialog() != null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, getResourceProvider());
        alertDialog$Builder.f22714a.N = LocaleController.getString(R.string.ChannelColorUnsaved);
        alertDialog$Builder.f22714a.P = LocaleController.getString(R.string.ChannelColorUnsavedMessage);
        alertDialog$Builder.h(LocaleController.getString(R.string.Dismiss), new org.telegram.ui.ActionBar.b2(this) {
            public final vc f36761b;

            {
                this.f36761b = this;
            }

            @Override
            public final void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
                switch (r2) {
                    case 0:
                        this.f36761b.finishFragment();
                        return;
                    default:
                        this.f36761b.w0();
                        return;
                }
            }
        });
        alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new org.telegram.ui.ActionBar.b2(this) {
            public final vc f36761b;

            {
                this.f36761b = this;
            }

            @Override
            public final void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
                switch (r2) {
                    case 0:
                        this.f36761b.finishFragment();
                        return;
                    default:
                        this.f36761b.w0();
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22714a;
        showDialog(c2Var);
        ((TextView) c2Var.d(-2)).setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.f23295q7));
    }

    public final void W0(TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus) {
        if (tL_premium_boostsStatus != null) {
            TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-this.f43502a));
            this.f43506c = tL_premium_boostsStatus;
            int i10 = tL_premium_boostsStatus.level;
            this.f43504b = i10;
            if (chat != null) {
                chat.level = i10;
            }
            hc hcVar = this.J;
            if (hcVar != null) {
                hcVar.l();
            }
            X0(true);
        }
    }

    public void X0(boolean z10) {
        if (this.L != null && this.f43506c != null) {
            int S0 = S0();
            if (this.f43504b >= S0) {
                this.L.f(null, z10);
                return;
            }
            if (this.E == null) {
                this.E = new SpannableStringBuilder("l");
                org.telegram.ui.Components.iq iqVar = new org.telegram.ui.Components.iq(R.drawable.mini_switch_lock, 0);
                iqVar.setTopOffset(1);
                this.E.setSpan(iqVar, 0, 1, 33);
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) this.E).append((CharSequence) LocaleController.formatPluralString("BoostLevelRequired", S0, new Object[0]));
            this.L.f(spannableStringBuilder, z10);
        }
    }

    public void Z0(boolean z10) {
        int themedColor;
        this.actionBar.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.g6.f23329s8));
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        int i10 = -1;
        if (this.d && this.f43526s != -1) {
            themedColor = -1;
        } else {
            themedColor = getThemedColor(org.telegram.ui.ActionBar.g6.A8);
        }
        lVar.setTitleColor(themedColor);
        org.telegram.ui.ActionBar.l lVar2 = this.actionBar;
        if (!this.d || this.f43526s == -1) {
            i10 = getThemedColor(org.telegram.ui.ActionBar.g6.f23385v8);
        }
        lVar2.C(i10, false);
        this.actionBar.B(getThemedColor(org.telegram.ui.ActionBar.g6.f23348t8), false);
        if (!z10) {
            org.telegram.ui.Components.jl0 jl0Var = this.I;
            int i11 = org.telegram.ui.ActionBar.g6.f23009a7;
            jl0Var.setBackgroundColor(getThemedColor(i11));
            this.J.l();
            AndroidUtilities.forEachViews((RecyclerView) this.I, (f5.d) new l4.x0(this));
            this.K.setBackgroundColor(getThemedColor(i11));
            this.L.j();
            setNavigationBarColor(getNavigationBarColor());
        }
    }

    public final void a1(boolean z10) {
        MessageObject messageObject;
        View y02 = y0(this.O);
        View y03 = y0(this.P);
        View y04 = y0(this.Q);
        View y05 = y0(this.S);
        if (y02 instanceof org.telegram.ui.Cells.ca) {
            org.telegram.ui.Cells.ca caVar = (org.telegram.ui.Cells.ca) y02;
            org.telegram.ui.Cells.s1[] cells = caVar.getCells();
            for (int i10 = 0; i10 < cells.length; i10++) {
                org.telegram.ui.Cells.s1 s1Var = cells[i10];
                if (s1Var != null && (messageObject = s1Var.getMessageObject()) != null) {
                    messageObject.overrideLinkColor = this.f43511f;
                    messageObject.overrideLinkEmoji = this.f43519n;
                    cells[i10].setAvatar(messageObject);
                    cells[i10].invalidate();
                }
            }
            Drawable f9 = nh.f6.f(this.D, this.currentAccount, this.B, this.F);
            this.D = f9;
            caVar.setOverrideBackground(f9);
        }
        if (y03 instanceof wo0) {
            ((wo0) y03).a(this.f43511f, z10);
        } else if (y03 instanceof mc) {
            ((mc) y03).a(this.f43511f, z10);
        }
        if (y04 instanceof ic) {
            ic icVar = (ic) y04;
            icVar.a(this.currentAccount, this.f43511f, true);
            icVar.c(this.f43519n, false, z10);
        }
        if (y05 instanceof tc) {
            tc tcVar = (tc) y05;
            String wallpaperEmoticon = ChatThemeController.getWallpaperEmoticon(this.B);
            if (wallpaperEmoticon == null && this.B == null && this.C != null) {
                wallpaperEmoticon = "❌";
            }
            tcVar.a(wallpaperEmoticon, z10);
            tcVar.setGalleryWallpaper(this.C);
        }
    }

    public final void b1() {
        TLRPC.StickerSet stickerSet;
        TLRPC.StickerSet stickerSet2;
        View y02 = y0(this.V);
        View y03 = y0(this.X);
        View y04 = y0(this.Y);
        View y05 = y0(this.f43505b0);
        View y06 = y0(this.f43508d0);
        View y07 = y0(this.f43512f0);
        if (y02 instanceof oc) {
            TLRPC.EmojiStatus emojiStatus = this.f43532y;
            if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                oc ocVar = (oc) y02;
                nc ncVar = ocVar.f41085b;
                MessagesController.PeerColor fromCollectible = MessagesController.PeerColor.fromCollectible(emojiStatus);
                ncVar.c(fromCollectible, true);
                ocVar.f41084a.c(fromCollectible, true);
                ncVar.d(((TLRPC.TL_emojiStatusCollectible) this.f43532y).pattern_document_id, true, true);
            } else {
                oc ocVar2 = (oc) y02;
                nc ncVar2 = ocVar2.f41085b;
                int i10 = this.f43526s;
                ncVar2.b(i10, true);
                ocVar2.f41084a.b(ocVar2.h.currentAccount, i10, true);
                ncVar2.d(this.f43530w, false, true);
            }
            oc ocVar3 = (oc) y02;
            nc ncVar3 = ocVar3.f41085b;
            ncVar3.e(DialogObject.getEmojiStatusDocumentId(this.f43532y), false, true);
            ncVar3.a(this.f43511f);
            ocVar3.e();
        }
        if (y03 instanceof wo0) {
            ((wo0) y03).a(this.f43526s, true);
        } else if (y03 instanceof mc) {
            ((mc) y03).a(this.f43511f, true);
        }
        if (y04 instanceof ic) {
            ic icVar = (ic) y04;
            icVar.a(this.currentAccount, this.f43526s, false);
            icVar.c(this.f43530w, false, true);
        }
        if (y05 instanceof ic) {
            TLRPC.EmojiStatus emojiStatus2 = this.f43532y;
            if (emojiStatus2 instanceof TLRPC.TL_emojiStatusCollectible) {
                ((ic) y05).b(MessagesController.PeerColor.fromCollectible(emojiStatus2));
            } else {
                ((ic) y05).a(this.currentAccount, this.f43526s, false);
            }
            ((ic) y05).c(DialogObject.getEmojiStatusDocumentId(this.f43532y), DialogObject.isEmojiStatusCollectible(this.f43532y), true);
        }
        boolean z10 = y06 instanceof ic;
        long j10 = this.f43502a;
        if (z10) {
            ic icVar2 = (ic) y06;
            icVar2.a(this.currentAccount, this.f43526s, false);
            TLRPC.ChatFull chatFull = getMessagesController().getChatFull(-j10);
            if (chatFull != null && (stickerSet2 = chatFull.emojiset) != null) {
                icVar2.c(D0(stickerSet2), false, false);
            } else {
                icVar2.c(0L, false, false);
            }
        }
        if (y07 instanceof ic) {
            TLRPC.ChatFull chatFull2 = getMessagesController().getChatFull(-j10);
            if (chatFull2 != null && (stickerSet = chatFull2.stickerset) != null) {
                ((ic) y07).d(C0(stickerSet));
            } else {
                ((ic) y07).c(0L, false, false);
            }
        }
        c1();
    }

    public void c1() {
        hc hcVar;
        hc hcVar2;
        boolean z10 = false;
        this.O = 0;
        int i10 = 1 + 1;
        this.P = 1;
        this.Q = i10;
        this.R = i10 + 1;
        this.S = i10 + 2;
        this.T = i10 + 3;
        this.U = i10 + 4;
        this.V = i10 + 5;
        this.X = i10 + 6;
        int i11 = i10 + 8;
        this.N = i11;
        this.Y = i10 + 7;
        if (this.f43530w == 0 && this.f43526s < 0 && !(this.f43532y instanceof TLRPC.TL_emojiStatusCollectible)) {
            int i12 = this.f43503a0;
            this.f43503a0 = -1;
            if (i12 >= 0 && (hcVar2 = this.J) != null) {
                hcVar2.u(i12);
                this.J.m(this.Y);
            }
        } else {
            if (this.f43503a0 >= 0) {
                z10 = true;
            }
            this.N = i10 + 9;
            this.f43503a0 = i11;
            if (!z10 && (hcVar = this.J) != null) {
                hcVar.o(i11);
                this.J.m(this.Y);
            }
        }
        int i13 = this.N;
        this.Z = i13;
        this.f43505b0 = i13 + 1;
        this.N = i13 + 3;
        this.f43507c0 = i13 + 2;
    }

    @Override
    public View createView(Context context) {
        MessagesController messagesController = getMessagesController();
        long j10 = -this.f43502a;
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j10));
        if (chat != null) {
            int colorId = ChatObject.getColorId(chat);
            this.f43511f = colorId;
            this.f43509e = colorId;
            long emojiId = ChatObject.getEmojiId(chat);
            this.f43519n = emojiId;
            this.h = emojiId;
            int profileColorId = ChatObject.getProfileColorId(chat);
            this.f43526s = profileColorId;
            this.f43524r = profileColorId;
            long profileEmojiId = ChatObject.getProfileEmojiId(chat);
            this.f43530w = profileEmojiId;
            this.v = profileEmojiId;
            TLRPC.EmojiStatus emojiStatus = chat.emoji_status;
            this.f43532y = emojiStatus;
            this.f43531x = emojiStatus;
        }
        TLRPC.ChatFull chatFull = getMessagesController().getChatFull(j10);
        if (chatFull != null) {
            TLRPC.WallPaper wallPaper = chatFull.wallpaper;
            this.B = wallPaper;
            this.A = wallPaper;
            if (ChatThemeController.isNotEmoticonWallpaper(wallPaper)) {
                this.C = this.A;
            }
        }
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setTitle(LocaleController.getString(R.string.ChannelColorTitle2));
        this.actionBar.setActionBarMenuOnItemClick(new cg.n1(this, 16));
        int i10 = R.raw.sun;
        org.telegram.ui.Components.xi0 xi0Var = new org.telegram.ui.Components.xi0(i10, "" + R.raw.sun, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
        this.G = xi0Var;
        xi0Var.h = true;
        if (!this.F) {
            xi0Var.N(0);
            this.G.K(0);
        } else {
            xi0Var.K(35);
            this.G.N(36);
        }
        this.G.W = true;
        int v02 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.J9, this.resourceProvider);
        this.G.O(v02, "Sunny");
        this.G.O(v02, "Path 6");
        this.G.O(v02, "Path");
        this.G.O(v02, "Path 5");
        this.H = this.actionBar.n().d(1, this.G);
        FrameLayout frameLayout = new FrameLayout(context);
        c1();
        x0();
        if (!this.d) {
            this.actionBar.setAdaptiveBackground(this.I);
        }
        org.telegram.ui.Components.jl0 jl0Var = this.I;
        hc hcVar = new hc(this);
        this.J = hcVar;
        jl0Var.setAdapter(hcVar);
        new f2.w(3);
        this.I.setLayoutManager(new f2.j0());
        org.telegram.ui.Components.jl0 jl0Var2 = this.I;
        int i11 = org.telegram.ui.ActionBar.g6.f23009a7;
        jl0Var2.setBackgroundColor(getThemedColor(i11));
        frameLayout.addView(this.I, i7.f6.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 68.0f));
        this.I.setOnItemClickListener(new eg.w0(5, this, chatFull));
        f2.l lVar = new f2.l();
        lVar.n(350L);
        lVar.o(org.telegram.ui.Components.jr.h);
        lVar.C = false;
        lVar.f6463m = false;
        this.I.setItemAnimator(lVar);
        nh.d dVar = new nh.d(context, this.resourceProvider, true);
        dVar.setRoundRadius(24);
        this.L = dVar;
        dVar.g(LocaleController.getString(R.string.ApplyChanges), false, true);
        this.L.setOnClickListener(new a(this, 12));
        X0(false);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.K = frameLayout2;
        frameLayout2.setBackgroundColor(getThemedColor(i11));
        this.K.addView(this.L, i7.f6.d(-1, 48.0f, 80, 10.0f, 10.0f, 10.0f, 10.0f));
        frameLayout.addView(this.K, i7.f6.e(-1, 68, 80));
        setBulletinDelegate(new w8(this, 1));
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    public final void d1() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.vc.d1():void");
    }

    public void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.chatWasBoostedByUser;
        long j10 = this.f43502a;
        if (i10 == i12) {
            if (j10 == ((Long) objArr[2]).longValue()) {
                W0((TL_stories.TL_premium_boostsStatus) objArr[0]);
            }
        } else if (i10 == NotificationCenter.boostByChannelCreated) {
            if (!((Boolean) objArr[1]).booleanValue()) {
                getMessagesController().getBoostsController().getBoostsStats(j10, new ac(this, 1));
            }
        } else if (i10 == NotificationCenter.dialogDeleted && j10 == ((Long) objArr[0]).longValue()) {
            org.telegram.ui.ActionBar.b5 b5Var = this.parentLayout;
            if (b5Var != null && b5Var.getLastFragment() == this) {
                finishFragment();
            } else {
                removeSelfFromStack();
            }
        }
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        if (Q0() && this.f43504b >= S0()) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (this.f43504b >= S0() && Q0()) {
            if (z10) {
                V0();
                return false;
            }
            return false;
        }
        return super.onBackPressed(z10);
    }

    @Override
    public boolean onFragmentCreate() {
        getMediaDataController().loadRestrictedStatusEmojis();
        getNotificationCenter().addObserver(this, NotificationCenter.boostByChannelCreated);
        getNotificationCenter().addObserver(this, NotificationCenter.chatWasBoostedByUser);
        getNotificationCenter().addObserver(this, NotificationCenter.dialogDeleted);
        return super.onFragmentCreate();
    }

    @Override
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().removeObserver(this, NotificationCenter.boostByChannelCreated);
        getNotificationCenter().removeObserver(this, NotificationCenter.chatWasBoostedByUser);
        getNotificationCenter().removeObserver(this, NotificationCenter.dialogDeleted);
    }

    @Override
    public final void setResourceProvider(org.telegram.ui.ActionBar.c6 c6Var) {
        this.m0 = c6Var;
    }

    public final void w0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.vc.w0():void");
    }

    public void x0() {
        org.telegram.ui.Components.jl0 jl0Var = new org.telegram.ui.Components.jl0(getParentActivity(), this.resourceProvider);
        this.I = jl0Var;
        jl0Var.setSections(false);
    }

    public final View y0(int i10) {
        for (int i11 = 0; i11 < this.I.getChildCount(); i11++) {
            View childAt = this.I.getChildAt(i11);
            this.I.getClass();
            if (RecyclerView.R(childAt) == i10) {
                return childAt;
            }
        }
        return null;
    }

    public int z0() {
        return getMessagesController().channelCustomWallpaperLevelMin;
    }

    public void T0(int i10) {
    }
}
