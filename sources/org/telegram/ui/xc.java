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
public class xc extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate {
    public TLRPC.WallPaper A;
    public TLRPC.WallPaper B;
    public TLRPC.WallPaper C;
    public Drawable D;
    public SpannableStringBuilder E;
    public boolean F;
    public org.telegram.ui.Components.mi0 G;
    public org.telegram.ui.ActionBar.w0 H;
    public org.telegram.ui.Components.wk0 I;
    public ic J;
    public FrameLayout K;
    public kh.d L;
    public fc M;
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
    public final long f44460a;
    public int f44461a0;
    public int f44462b;
    public int f44463b0;
    public TL_stories.TL_premium_boostsStatus f44464c;
    public int f44465c0;
    public boolean d;
    public int f44466d0;
    public int f44467e;
    public int f44468e0;
    public int f44469f;
    public int f44470f0;
    public int f44471g0;
    public long h;
    public org.telegram.ui.ActionBar.o2 f44472h0;
    public gc f44473i0;
    public float f44474j0;
    public ValueAnimator f44475k0;
    public boolean f44476l0;
    public org.telegram.ui.ActionBar.b6 m0;
    public long f44477n;
    public final SparseIntArray f44478n0;
    public final org.telegram.ui.ActionBar.d5 f44479o0;
    public final org.telegram.ui.ActionBar.d5 f44480p0;
    public final org.telegram.ui.ActionBar.d5 f44481q0;
    public int f44482r;
    public final org.telegram.ui.ActionBar.d5 f44483r0;
    public int f44484s;
    public final Drawable f44485s0;
    public final Drawable f44486t0;
    public final Paint f44487u0;
    public long v;
    public long f44488w;
    public TLRPC.EmojiStatus f44489x;
    public TLRPC.EmojiStatus f44490y;

    public xc(long j10) {
        super(null);
        boolean q10 = org.telegram.ui.ActionBar.f6.I.q();
        this.F = q10;
        this.N = 0;
        this.f44476l0 = q10;
        this.f44478n0 = new SparseIntArray();
        Paint paint = new Paint(1);
        this.f44487u0 = paint;
        paint.setStrokeWidth(1.0f);
        paint.setColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23002d7, this.resourceProvider));
        this.f44485s0 = ApplicationLoader.applicationContext.getDrawable(R.drawable.msg_check_s).mutate();
        this.f44486t0 = ApplicationLoader.applicationContext.getDrawable(R.drawable.msg_halfcheck).mutate();
        this.f44460a = j10;
        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-j10));
        if (chat != null) {
            this.f44462b = chat.level;
        }
        MessagesController.getInstance(this.currentAccount).getBoostsController().getBoostsStats(j10, new ih.a2(1, this, chat));
        this.resourceProvider = new wc(this);
        this.f44479o0 = new org.telegram.ui.ActionBar.d5(0, false, false, this.resourceProvider);
        this.f44480p0 = new org.telegram.ui.ActionBar.d5(0, false, true, this.resourceProvider);
        this.f44481q0 = new org.telegram.ui.ActionBar.d5(0, true, false, this.resourceProvider);
        this.f44483r0 = new org.telegram.ui.ActionBar.d5(0, true, true, this.resourceProvider);
    }

    public static void T(xc xcVar) {
        org.telegram.ui.ActionBar.b6 b6Var = xcVar.resourceProvider;
        if (b6Var instanceof wc) {
            xc xcVar2 = ((wc) b6Var).f43726a;
            xcVar2.F = !xcVar2.F;
            xcVar2.d1();
            xcVar2.Z0(false);
        } else {
            xcVar.F = !xcVar.F;
            xcVar.d1();
        }
        xcVar.U0(xcVar.F, true);
        xcVar.Z0(false);
    }

    public static void U(org.telegram.ui.xc r22, org.telegram.tgnet.TLRPC.ChatFull r23, android.view.View r24, int r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.xc.U(org.telegram.ui.xc, org.telegram.tgnet.TLRPC$ChatFull, android.view.View, int):void");
    }

    public static void V(org.telegram.ui.xc r13, org.telegram.messenger.ChannelBoostsController.CanApplyBoost r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.xc.V(org.telegram.ui.xc, org.telegram.messenger.ChannelBoostsController$CanApplyBoost):void");
    }

    public static void Y0(View view) {
        int i9;
        if (view instanceof jc) {
            jc jcVar = (jc) view;
            jcVar.f39431a.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.G6, jcVar.d));
        } else if (view instanceof org.telegram.ui.Cells.p8) {
            ((org.telegram.ui.Cells.p8) view).v();
        } else if (view instanceof nc) {
            nc ncVar = (nc) view;
            AndroidUtilities.forEachViews((RecyclerView) ncVar.f40693b, (d5.d) new ih.a2(2, ncVar, MessagesController.getInstance(ncVar.d).peerColors));
        } else if (view instanceof vc) {
            vc vcVar = (vc) view;
            ArrayList arrayList = vcVar.f43430c;
            org.telegram.ui.ActionBar.b6 b6Var = vcVar.f43429b;
            if (b6Var != null) {
                i9 = b6Var.a();
            } else {
                i9 = org.telegram.ui.ActionBar.f6.I.q();
            }
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                ((org.telegram.ui.Components.bp) arrayList.get(i10)).f27263c = i9;
            }
            AndroidUtilities.forEachViews((RecyclerView) vcVar.d, (d5.d) new qc(vcVar, 0));
            vcVar.h.l();
        }
    }

    public int A0() {
        return 0;
    }

    public final TLRPC.Document B0(TLRPC.StickerSet stickerSet) {
        if (stickerSet != null && stickerSet.thumb_document_id == 0) {
            TLRPC.TL_messages_stickerSet groupStickerSetById = getMediaDataController().getGroupStickerSetById(stickerSet);
            if (!groupStickerSetById.documents.isEmpty()) {
                return groupStickerSetById.documents.get(0);
            }
        }
        return null;
    }

    public final long C0(TLRPC.StickerSet stickerSet) {
        if (stickerSet == null) {
            return 0L;
        }
        long j10 = stickerSet.thumb_document_id;
        if (j10 == 0) {
            TLRPC.TL_messages_stickerSet groupStickerSetById = getMediaDataController().getGroupStickerSetById(stickerSet);
            if (!groupStickerSetById.documents.isEmpty()) {
                return groupStickerSetById.documents.get(0).f22386id;
            }
        }
        return j10;
    }

    public int D0() {
        return R.string.ChannelEmojiStatusInfo;
    }

    public int E0() {
        return getMessagesController().channelEmojiStatusLevelMin;
    }

    public int F0() {
        return R.string.ChannelEmojiStatus;
    }

    public int G0() {
        return 0;
    }

    public int H0() {
        return 3;
    }

    public int I0() {
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
        if (this.f44467e == this.f44469f && this.h == this.f44477n && this.f44482r == this.f44484s && this.v == this.f44488w && DialogObject.emojiStatusesEqual(this.f44489x, this.f44490y) && ChatThemeController.wallpaperEquals(this.A, this.B)) {
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
        int i9 = 0;
        if (this.f44467e != this.f44469f) {
            MessagesController.PeerColors peerColors = getMessagesController().peerColors;
            if (peerColors == null) {
                color = null;
            } else {
                color = peerColors.getColor(this.f44469f);
            }
            if (color != null) {
                i9 = Math.max(0, color.getLvl(this.d));
            }
        }
        if (this.h != this.f44477n) {
            i9 = Math.max(i9, getMessagesController().channelBgIconLevelMin);
        }
        if (this.f44482r != this.f44484s) {
            MessagesController.PeerColors peerColors2 = getMessagesController().profilePeerColors;
            if (peerColors2 != null) {
                peerColor = peerColors2.getColor(this.f44484s);
            }
            if (peerColor != null) {
                i9 = Math.max(i9, peerColor.getLvl(this.d));
            }
        }
        if (this.v != this.f44488w) {
            i9 = Math.max(i9, I0());
        }
        if (!DialogObject.emojiStatusesEqual(this.f44489x, this.f44490y)) {
            i9 = Math.max(i9, E0());
        }
        if (!ChatThemeController.wallpaperEquals(this.A, this.B)) {
            return Math.max(i9, O0());
        }
        return i9;
    }

    public final void U0(boolean z10, boolean z11) {
        int i9;
        if (this.f44476l0 != z10) {
            this.f44476l0 = z10;
            int i10 = 0;
            if (z11) {
                org.telegram.ui.Components.mi0 mi0Var = this.G;
                if (z10) {
                    i10 = mi0Var.f30847e[0];
                }
                mi0Var.N(i10);
                org.telegram.ui.Components.mi0 mi0Var2 = this.G;
                if (mi0Var2 != null) {
                    mi0Var2.start();
                    return;
                }
                return;
            }
            if (z10) {
                i9 = this.G.f30847e[0] - 1;
            } else {
                i9 = 0;
            }
            this.G.L(i9, false, true);
            this.G.N(i9);
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
        alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.ChannelColorUnsaved);
        alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.ChannelColorUnsavedMessage);
        alertDialog$Builder.h(LocaleController.getString(R.string.Dismiss), new org.telegram.ui.ActionBar.b2(this) {
            public final xc f37165b;

            {
                this.f37165b = this;
            }

            @Override
            public final void f(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
                switch (r2) {
                    case 0:
                        this.f37165b.finishFragment();
                        return;
                    default:
                        this.f37165b.v0();
                        return;
                }
            }
        });
        alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new org.telegram.ui.ActionBar.b2(this) {
            public final xc f37165b;

            {
                this.f37165b = this;
            }

            @Override
            public final void f(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
                switch (r2) {
                    case 0:
                        this.f37165b.finishFragment();
                        return;
                    default:
                        this.f37165b.v0();
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22702a;
        showDialog(c2Var);
        ((TextView) c2Var.d(-2)).setTextColor(getThemedColor(org.telegram.ui.ActionBar.f6.f23230q7));
    }

    public final void W0(TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus) {
        if (tL_premium_boostsStatus != null) {
            TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-this.f44460a));
            this.f44464c = tL_premium_boostsStatus;
            int i9 = tL_premium_boostsStatus.level;
            this.f44462b = i9;
            if (chat != null) {
                chat.level = i9;
            }
            ic icVar = this.J;
            if (icVar != null) {
                icVar.l();
            }
            X0(true);
        }
    }

    public void X0(boolean z10) {
        if (this.L != null && this.f44464c != null) {
            int S0 = S0();
            if (this.f44462b >= S0) {
                this.L.f(null, z10);
                return;
            }
            if (this.E == null) {
                this.E = new SpannableStringBuilder("l");
                org.telegram.ui.Components.eq eqVar = new org.telegram.ui.Components.eq(R.drawable.mini_switch_lock, 0);
                eqVar.setTopOffset(1);
                this.E.setSpan(eqVar, 0, 1, 33);
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) this.E).append((CharSequence) LocaleController.formatPluralString("BoostLevelRequired", S0, new Object[0]));
            this.L.f(spannableStringBuilder, z10);
        }
    }

    public void Z0(boolean z10) {
        int themedColor;
        this.actionBar.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.f6.f23269s8));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i9 = -1;
        if (this.d && this.f44484s != -1) {
            themedColor = -1;
        } else {
            themedColor = getThemedColor(org.telegram.ui.ActionBar.f6.A8);
        }
        kVar.setTitleColor(themedColor);
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        if (!this.d || this.f44484s == -1) {
            i9 = getThemedColor(org.telegram.ui.ActionBar.f6.f23321v8);
        }
        kVar2.C(i9, false);
        this.actionBar.A(getThemedColor(org.telegram.ui.ActionBar.f6.f23287t8), false);
        if (!z10) {
            org.telegram.ui.Components.wk0 wk0Var = this.I;
            int i10 = org.telegram.ui.ActionBar.f6.f22947a7;
            wk0Var.setBackgroundColor(getThemedColor(i10));
            this.J.l();
            AndroidUtilities.forEachViews((RecyclerView) this.I, (d5.d) new ih.e(this));
            this.K.setBackgroundColor(getThemedColor(i10));
            this.L.j();
            setNavigationBarColor(getNavigationBarColor());
        }
    }

    public final void a1(boolean z10) {
        MessageObject messageObject;
        View x02 = x0(this.O);
        View x03 = x0(this.P);
        View x04 = x0(this.Q);
        View x05 = x0(this.S);
        if (x02 instanceof org.telegram.ui.Cells.fa) {
            org.telegram.ui.Cells.fa faVar = (org.telegram.ui.Cells.fa) x02;
            org.telegram.ui.Cells.t1[] cells = faVar.getCells();
            for (int i9 = 0; i9 < cells.length; i9++) {
                org.telegram.ui.Cells.t1 t1Var = cells[i9];
                if (t1Var != null && (messageObject = t1Var.getMessageObject()) != null) {
                    messageObject.overrideLinkColor = this.f44469f;
                    messageObject.overrideLinkEmoji = this.f44477n;
                    cells[i9].setAvatar(messageObject);
                    cells[i9].invalidate();
                }
            }
            Drawable f10 = kh.r6.f(this.D, this.currentAccount, this.B, this.F);
            this.D = f10;
            faVar.setOverrideBackground(f10);
        }
        if (x03 instanceof xo0) {
            ((xo0) x03).a(this.f44469f, z10);
        } else if (x03 instanceof nc) {
            ((nc) x03).a(this.f44469f, z10);
        }
        if (x04 instanceof jc) {
            jc jcVar = (jc) x04;
            jcVar.a(this.currentAccount, this.f44469f, true);
            jcVar.c(this.f44477n, false, z10);
        }
        if (x05 instanceof vc) {
            vc vcVar = (vc) x05;
            String wallpaperEmoticon = ChatThemeController.getWallpaperEmoticon(this.B);
            if (wallpaperEmoticon == null && this.B == null && this.C != null) {
                wallpaperEmoticon = "❌";
            }
            vcVar.a(wallpaperEmoticon, z10);
            vcVar.setGalleryWallpaper(this.C);
        }
    }

    public final void b1() {
        TLRPC.StickerSet stickerSet;
        TLRPC.StickerSet stickerSet2;
        View x02 = x0(this.V);
        View x03 = x0(this.X);
        View x04 = x0(this.Y);
        View x05 = x0(this.f44463b0);
        View x06 = x0(this.f44466d0);
        View x07 = x0(this.f44470f0);
        if (x02 instanceof pc) {
            TLRPC.EmojiStatus emojiStatus = this.f44490y;
            if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                pc pcVar = (pc) x02;
                oc ocVar = pcVar.f41437b;
                MessagesController.PeerColor fromCollectible = MessagesController.PeerColor.fromCollectible(emojiStatus);
                ocVar.c(fromCollectible, true);
                pcVar.f41436a.c(fromCollectible, true);
                ocVar.d(((TLRPC.TL_emojiStatusCollectible) this.f44490y).pattern_document_id, true, true);
            } else {
                pc pcVar2 = (pc) x02;
                oc ocVar2 = pcVar2.f41437b;
                int i9 = this.f44484s;
                ocVar2.b(i9, true);
                pcVar2.f41436a.b(pcVar2.h.currentAccount, i9, true);
                ocVar2.d(this.f44488w, false, true);
            }
            pc pcVar3 = (pc) x02;
            oc ocVar3 = pcVar3.f41437b;
            ocVar3.e(DialogObject.getEmojiStatusDocumentId(this.f44490y), false, true);
            ocVar3.a(this.f44469f);
            pcVar3.d();
        }
        if (x03 instanceof xo0) {
            ((xo0) x03).a(this.f44484s, true);
        } else if (x03 instanceof nc) {
            ((nc) x03).a(this.f44469f, true);
        }
        if (x04 instanceof jc) {
            jc jcVar = (jc) x04;
            jcVar.a(this.currentAccount, this.f44484s, false);
            jcVar.c(this.f44488w, false, true);
        }
        if (x05 instanceof jc) {
            TLRPC.EmojiStatus emojiStatus2 = this.f44490y;
            if (emojiStatus2 instanceof TLRPC.TL_emojiStatusCollectible) {
                ((jc) x05).b(MessagesController.PeerColor.fromCollectible(emojiStatus2));
            } else {
                ((jc) x05).a(this.currentAccount, this.f44484s, false);
            }
            ((jc) x05).c(DialogObject.getEmojiStatusDocumentId(this.f44490y), DialogObject.isEmojiStatusCollectible(this.f44490y), true);
        }
        boolean z10 = x06 instanceof jc;
        long j10 = this.f44460a;
        if (z10) {
            jc jcVar2 = (jc) x06;
            jcVar2.a(this.currentAccount, this.f44484s, false);
            TLRPC.ChatFull chatFull = getMessagesController().getChatFull(-j10);
            if (chatFull != null && (stickerSet2 = chatFull.emojiset) != null) {
                jcVar2.c(C0(stickerSet2), false, false);
            } else {
                jcVar2.c(0L, false, false);
            }
        }
        if (x07 instanceof jc) {
            TLRPC.ChatFull chatFull2 = getMessagesController().getChatFull(-j10);
            if (chatFull2 != null && (stickerSet = chatFull2.stickerset) != null) {
                ((jc) x07).d(B0(stickerSet));
            } else {
                ((jc) x07).c(0L, false, false);
            }
        }
        c1();
    }

    public void c1() {
        ic icVar;
        ic icVar2;
        boolean z10 = false;
        this.O = 0;
        int i9 = 1 + 1;
        this.P = 1;
        this.Q = i9;
        this.R = i9 + 1;
        this.S = i9 + 2;
        this.T = i9 + 3;
        this.U = i9 + 4;
        this.V = i9 + 5;
        this.X = i9 + 6;
        int i10 = i9 + 8;
        this.N = i10;
        this.Y = i9 + 7;
        if (this.f44488w == 0 && this.f44484s < 0 && !(this.f44490y instanceof TLRPC.TL_emojiStatusCollectible)) {
            int i11 = this.f44461a0;
            this.f44461a0 = -1;
            if (i11 >= 0 && (icVar2 = this.J) != null) {
                icVar2.u(i11);
                this.J.m(this.Y);
            }
        } else {
            if (this.f44461a0 >= 0) {
                z10 = true;
            }
            this.N = i9 + 9;
            this.f44461a0 = i10;
            if (!z10 && (icVar = this.J) != null) {
                icVar.o(i10);
                this.J.m(this.Y);
            }
        }
        int i12 = this.N;
        this.Z = i12;
        this.f44463b0 = i12 + 1;
        this.N = i12 + 3;
        this.f44465c0 = i12 + 2;
    }

    @Override
    public View createView(Context context) {
        MessagesController messagesController = getMessagesController();
        long j10 = -this.f44460a;
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j10));
        if (chat != null) {
            int colorId = ChatObject.getColorId(chat);
            this.f44469f = colorId;
            this.f44467e = colorId;
            long emojiId = ChatObject.getEmojiId(chat);
            this.f44477n = emojiId;
            this.h = emojiId;
            int profileColorId = ChatObject.getProfileColorId(chat);
            this.f44484s = profileColorId;
            this.f44482r = profileColorId;
            long profileEmojiId = ChatObject.getProfileEmojiId(chat);
            this.f44488w = profileEmojiId;
            this.v = profileEmojiId;
            TLRPC.EmojiStatus emojiStatus = chat.emoji_status;
            this.f44490y = emojiStatus;
            this.f44489x = emojiStatus;
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
        this.actionBar.setActionBarMenuOnItemClick(new fh.w4(this, 24));
        int i9 = R.raw.sun;
        org.telegram.ui.Components.mi0 mi0Var = new org.telegram.ui.Components.mi0(i9, "" + R.raw.sun, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
        this.G = mi0Var;
        mi0Var.h = true;
        if (!this.F) {
            mi0Var.N(0);
            this.G.K(0);
        } else {
            mi0Var.K(35);
            this.G.N(36);
        }
        this.G.W = true;
        int v02 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.J9, this.resourceProvider);
        this.G.O(v02, "Sunny");
        this.G.O(v02, "Path 6");
        this.G.O(v02, "Path");
        this.G.O(v02, "Path 5");
        this.H = this.actionBar.n().d(1, this.G);
        FrameLayout frameLayout = new FrameLayout(context);
        c1();
        w0();
        if (!this.d) {
            this.actionBar.setAdaptiveBackground(this.I);
        }
        org.telegram.ui.Components.wk0 wk0Var = this.I;
        ic icVar = new ic(this);
        this.J = icVar;
        wk0Var.setAdapter(icVar);
        new f2.y(3);
        this.I.setLayoutManager(new f2.m0());
        org.telegram.ui.Components.wk0 wk0Var2 = this.I;
        int i10 = org.telegram.ui.ActionBar.f6.f22947a7;
        wk0Var2.setBackgroundColor(getThemedColor(i10));
        frameLayout.addView(this.I, g7.e6.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, 68.0f));
        this.I.setOnItemClickListener(new bg.b1(6, this, chatFull));
        f2.n nVar = new f2.n();
        nVar.n(350L);
        nVar.o(org.telegram.ui.Components.gr.h);
        nVar.C = false;
        nVar.f5532m = false;
        this.I.setItemAnimator(nVar);
        kh.d dVar = new kh.d(context, this.resourceProvider, true);
        dVar.setRoundRadius(24);
        this.L = dVar;
        dVar.g(LocaleController.getString(R.string.ApplyChanges), false, true);
        this.L.setOnClickListener(new a(this, 12));
        X0(false);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.K = frameLayout2;
        frameLayout2.setBackgroundColor(getThemedColor(i10));
        this.K.addView(this.L, g7.e6.d(-1, 48.0f, 80, 10.0f, 10.0f, 10.0f, 10.0f));
        frameLayout.addView(this.K, g7.e6.e(-1, 68, 80));
        setBulletinDelegate(new x8(this, 1));
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    public final void d1() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.xc.d1():void");
    }

    @Override
    public void didReceivedNotification(int i9, int i10, Object... objArr) {
        int i11 = NotificationCenter.chatWasBoostedByUser;
        long j10 = this.f44460a;
        if (i9 == i11) {
            if (j10 == ((Long) objArr[2]).longValue()) {
                W0((TL_stories.TL_premium_boostsStatus) objArr[0]);
            }
        } else if (i9 == NotificationCenter.boostByChannelCreated) {
            if (!((Boolean) objArr[1]).booleanValue()) {
                getMessagesController().getBoostsController().getBoostsStats(j10, new bc(this, 1));
            }
        } else if (i9 == NotificationCenter.dialogDeleted && j10 == ((Long) objArr[0]).longValue()) {
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
        if (Q0() && this.f44462b >= S0()) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (this.f44462b >= S0() && Q0()) {
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
    public final void setResourceProvider(org.telegram.ui.ActionBar.b6 b6Var) {
        this.m0 = b6Var;
    }

    public final void v0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.xc.v0():void");
    }

    public void w0() {
        org.telegram.ui.Components.wk0 wk0Var = new org.telegram.ui.Components.wk0(getParentActivity(), this.resourceProvider);
        this.I = wk0Var;
        wk0Var.setSections(false);
    }

    public final View x0(int i9) {
        for (int i10 = 0; i10 < this.I.getChildCount(); i10++) {
            View childAt = this.I.getChildAt(i10);
            this.I.getClass();
            if (RecyclerView.R(childAt) == i9) {
                return childAt;
            }
        }
        return null;
    }

    public int y0() {
        return getMessagesController().channelCustomWallpaperLevelMin;
    }

    public int z0() {
        return 0;
    }

    public void T0(int i9) {
    }
}
