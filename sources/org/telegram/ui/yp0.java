package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class yp0 extends FrameLayout {
    public static final int f41860q0 = 0;
    public final dq0 E;
    public View F;
    public boolean G;
    public boolean H;
    public TL_stars.TL_starGiftUnique I;
    public yh.t3 J;
    public TL_stars.StarGift K;
    public final ArrayList L;
    public final HashMap M;
    public final SpannableStringBuilder N;
    public final String O;
    public final String P;
    public int Q;
    public int R;
    public int S;
    public final int T;
    public int U;
    public int V;
    public int W;
    public final cq0 f41861a;
    public int f41862a0;
    public final pp0 f41863b;
    public int f41864b0;
    public final s4.s f41865c;
    public int f41866c0;
    public final rp0 d;
    public int f41867d0;
    public final n3.b e;
    public int f41868e0;
    public bq0 f41869f;
    public int f41870f0;
    public int f41871g0;
    public int h;
    public int f41872h0;
    public int f41873i0;
    public int f41874j0;
    public int f41875k0;
    public final ArrayList f41876l0;
    public final int m0;
    public long f41877n;
    public int f41878n0;
    public vp0 f41879o0;
    public final eq0 f41880p0;
    public TLRPC.TL_emojiStatusCollectible f41881r;
    public TLRPC.TL_peerColorCollectible f41882s;
    public final tp0 v;
    public final View f41883w;
    public final View f41884x;
    public xp0 f41885y;

    public yp0(eq0 eq0Var, Context context, int i10) {
        super(context);
        int i11;
        org.telegram.ui.ActionBar.b5 b5Var;
        org.telegram.ui.ActionBar.c6 c6Var;
        org.telegram.ui.ActionBar.c6 c6Var2;
        org.telegram.ui.ActionBar.c6 c6Var3;
        int i12;
        org.telegram.ui.ActionBar.c6 c6Var4;
        this.f41880p0 = eq0Var;
        this.e = new n3.b(9, false);
        this.h = -1;
        this.f41877n = 0L;
        this.f41881r = null;
        this.f41882s = null;
        this.K = null;
        this.L = new ArrayList();
        this.M = new HashMap();
        this.Q = -1;
        this.R = -1;
        this.S = -1;
        this.T = -1;
        this.U = -1;
        this.V = -1;
        this.W = -1;
        this.f41862a0 = -1;
        this.f41864b0 = -1;
        this.f41866c0 = -1;
        this.f41867d0 = -1;
        this.f41868e0 = -1;
        this.f41870f0 = 0;
        this.f41871g0 = -1;
        this.f41872h0 = -1;
        this.f41873i0 = -1;
        this.f41874j0 = -1;
        this.f41876l0 = new ArrayList();
        this.m0 = i10;
        d();
        Context context2 = getContext();
        org.telegram.ui.ActionBar.c6 resourceProvider = eq0Var.getResourceProvider();
        bh.b bVar = eq0Var.G;
        pp0 pp0Var = new pp0(this, context2, resourceProvider, i10);
        this.f41863b = pp0Var;
        pp0Var.setClipToPadding(false);
        pp0Var.setSections(true);
        ((s4.k) pp0Var.getItemAnimator()).f44872m = false;
        getContext();
        s4.s sVar = new s4.s(3);
        this.f41865c = sVar;
        sVar.O = new di.w1(this, 6);
        pp0Var.i(new di.q1(this, 7));
        pp0Var.setLayoutManager(sVar);
        rp0 rp0Var = new rp0(this, context, i10);
        this.d = rp0Var;
        pp0Var.setAdapter(rp0Var);
        pp0Var.setOnItemClickListener(new org.telegram.ui.Components.rn0(this, i10, 1));
        pp0Var.j(new sp0(this, i10));
        addView(pp0Var, w7.z5.d(-1.0f, -1));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("l");
        spannableStringBuilder.setSpan(new org.telegram.ui.Components.br(R.drawable.msg_mini_lock2, 0), 0, 1, 33);
        if (eq0Var.f35347a) {
            i11 = R.string.ChannelColorApply;
        } else {
            i11 = R.string.UserColorApply;
        }
        String string = LocaleController.getString(i11);
        this.O = string;
        this.N = new SpannableStringBuilder(spannableStringBuilder).append((CharSequence) " ").append((CharSequence) string);
        this.P = LocaleController.getString(R.string.UserColorApplyCollectible);
        f(false);
        s4.k kVar = new s4.k();
        kVar.n(350L);
        kVar.o(org.telegram.ui.Components.es.h);
        kVar.C = false;
        kVar.f44872m = false;
        pp0Var.setItemAnimator(kVar);
        View view = new View(getContext());
        this.f41883w = view;
        bh.c cVar = new bh.c(bVar.c(view, null, false));
        cVar.b(-AndroidUtilities.dp(24.0f), true);
        cVar.f2765q = 220;
        view.setBackground(cVar);
        addView(view, w7.z5.e(-1, 72, 55));
        if (i10 == 0) {
            Context context3 = getContext();
            i12 = ((org.telegram.ui.ActionBar.m2) eq0Var).currentAccount;
            c6Var4 = ((org.telegram.ui.ActionBar.m2) eq0Var).resourceProvider;
            this.f41861a = new cq0(i12, 0L, context3, c6Var4);
            j(false);
        } else {
            View view2 = new View(getContext());
            this.f41884x = view2;
            bh.c cVar2 = new bh.c(bVar.c(view2, null, false));
            cVar2.b(-AndroidUtilities.dp(16.0f), false);
            view2.setBackground(cVar2);
            addView(view2, w7.z5.e(-1, 16, 55));
            Context context4 = getContext();
            b5Var = ((org.telegram.ui.ActionBar.m2) eq0Var).parentLayout;
            c6Var = ((org.telegram.ui.ActionBar.m2) eq0Var).resourceProvider;
            ?? gaVar = new org.telegram.ui.Cells.ga(context4, b5Var, 3, 0L, c6Var);
            this.v = gaVar;
            gaVar.setImportantForAccessibility(4);
            gaVar.f20948r = eq0Var;
            gaVar.setClipToOutline(true);
            bi.a2 a2Var = zf.j0.f50192a;
            gaVar.setOutlineProvider(new zf.i0(0, AndroidUtilities.dp(16.0f)));
            addView((View) gaVar, w7.z5.a(-2.0f, 12.0f, 0.0f, 12.0f, 0.0f, -1, 55));
        }
        Context context5 = getContext();
        c6Var2 = ((org.telegram.ui.ActionBar.m2) eq0Var).resourceProvider;
        dq0 dq0Var = new dq0(eq0Var, context5, c6Var2);
        this.E = dq0Var;
        dh.d c10 = eq0Var.E.c(dq0Var, null, false);
        c6Var3 = ((org.telegram.ui.ActionBar.m2) eq0Var).resourceProvider;
        eh.e eVar = new eh.e(c6Var3);
        eVar.e = new bi.w2(22);
        eVar.d(0, 0);
        eVar.c(0, 0);
        eVar.b(0, 0);
        c10.o(eVar);
        c10.q(AndroidUtilities.dp(18.0f));
        c10.f6561j.e = true;
        dq0Var.H = c10;
        dq0Var.G = c10;
        dq0Var.F = new op0(this, 0);
        dq0Var.setVisibility(4);
        addView(dq0Var, w7.z5.a(36.0f, 12.0f, 0.0f, 12.0f, 0.0f, -1, 55));
        cq0 cq0Var = this.f41861a;
        if (cq0Var != null) {
            addView(cq0Var, w7.z5.e(-1, -2, 55));
        }
        g();
        k();
        setWillNotDraw(false);
    }

    public static void a(yp0 yp0Var) {
        int i10;
        pp0 pp0Var = yp0Var.f41863b;
        boolean z10 = yp0Var.H;
        if (z10) {
            pp0Var.B0();
        }
        yp0Var.e();
        if (z10 && (i10 = yp0Var.f41872h0) >= 0) {
            yp0Var.f41865c.h1(i10, yp0Var.f41880p0.f35355f);
            pp0Var.post(new op0(yp0Var, 1));
        }
    }

    public final boolean b() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yp0.b():boolean");
    }

    public final boolean c() {
        pp0 pp0Var = this.f41863b;
        if (pp0Var != null) {
            for (int i10 = 0; i10 < pp0Var.getChildCount(); i10++) {
                if (pp0Var.getChildAt(i10) instanceof org.telegram.ui.Components.f10) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void d() {
        TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible;
        int i10 = this.m0;
        eq0 eq0Var = this.f41880p0;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible = null;
        if (i10 == 0) {
            TLRPC.User currentUser = eq0Var.getUserConfig().getCurrentUser();
            this.h = UserObject.getProfileColorId(currentUser);
            this.f41877n = UserObject.getProfileEmojiId(currentUser);
            if (currentUser != null) {
                TLRPC.EmojiStatus emojiStatus = currentUser.emoji_status;
                if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                    tL_emojiStatusCollectible = (TLRPC.TL_emojiStatusCollectible) emojiStatus;
                    this.f41881r = tL_emojiStatusCollectible;
                    this.f41882s = null;
                }
            }
            tL_emojiStatusCollectible = null;
            this.f41881r = tL_emojiStatusCollectible;
            this.f41882s = null;
        } else {
            TLRPC.User currentUser2 = eq0Var.getUserConfig().getCurrentUser();
            this.h = UserObject.getColorId(currentUser2);
            this.f41877n = UserObject.getEmojiId(currentUser2);
            this.f41881r = null;
            if (currentUser2 != null) {
                TLRPC.PeerColor peerColor = currentUser2.color;
                if (peerColor instanceof TLRPC.TL_peerColorCollectible) {
                    tL_peerColorCollectible = (TLRPC.TL_peerColorCollectible) peerColor;
                }
            }
            this.f41882s = tL_peerColorCollectible;
        }
        if (this.f41881r == null && this.f41882s == null) {
            return;
        }
        this.h = -1;
        this.f41877n = 0L;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.E && !this.H) {
            return false;
        }
        return super.drawChild(canvas, view, j10);
    }

    public final void e() {
        k();
        this.d.l();
    }

    public final void f(boolean z10) {
        Object obj;
        TL_stars.TL_starGiftUnique tL_starGiftUnique = this.I;
        eq0 eq0Var = this.f41880p0;
        n3.b bVar = this.e;
        if (tL_starGiftUnique != null) {
            ag.a resellAmount = tL_starGiftUnique.getResellAmount(ag.b.f633a);
            if (tL_starGiftUnique.resale_ton_only) {
                bVar.f15703b = zh.p7.T0(LocaleController.formatString(R.string.ResellGiftBuyTON, tL_starGiftUnique.getResellAmount(ag.b.f634b).d()), true);
                bVar.f15704c = zh.p7.R0(LocaleController.formatPluralStringComma("ResellGiftBuyEq", (int) resellAmount.a()));
            } else {
                bVar.f15703b = zh.p7.R0(LocaleController.formatPluralStringComma("ResellGiftBuy", (int) resellAmount.a()));
                bVar.f15704c = null;
            }
        } else {
            if (!eq0Var.getUserConfig().isPremium() && !eq0Var.f35347a) {
                obj = this.N;
            } else if (this.f41881r != null) {
                obj = this.P;
            } else {
                obj = this.O;
            }
            bVar.f15703b = obj;
            bVar.f15704c = null;
        }
        if (eq0Var.C0() == this) {
            eq0Var.R = this;
            eq0Var.Q.g((CharSequence) bVar.f15703b, z10, true);
            eq0Var.Q.f((SpannableStringBuilder) bVar.f15704c, z10);
        }
    }

    public final void g() {
        di.d dVar = this.f41880p0.Q;
        if (dVar != null) {
            dVar.j();
        }
        tp0 tp0Var = this.v;
        if (tp0Var != null) {
            tp0Var.invalidate();
        }
        j(true);
        AndroidUtilities.forEachViews((RecyclerView) this.f41863b, (Utilities.Callback<View>) new v3(this, 14));
        dq0 dq0Var = this.E;
        if (dq0Var != null) {
            l(dq0Var);
        }
    }

    public final void h() {
        int i10;
        boolean z10;
        int i11 = this.f41880p0.f35355f;
        float f7 = 0.0f;
        View view = this.f41883w;
        dq0 dq0Var = this.E;
        if (dq0Var != null && (i10 = this.f41872h0) >= 0) {
            s4.s sVar = this.f41865c;
            this.F = sVar.m(i10);
            pp0 pp0Var = this.f41863b;
            int paddingTop = pp0Var.getPaddingTop() + i11;
            int L0 = sVar.L0();
            View view2 = this.F;
            if (view2 != null) {
                if (view2.getTop() <= paddingTop) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.H = z10;
                this.G = !z10;
                dq0Var.setVisibility(0);
                dq0Var.setTranslationY((Math.max(this.F.getTop(), paddingTop) + pp0Var.getTop()) - dq0Var.getTop());
            } else if (L0 != -1 && L0 > this.f41872h0) {
                this.H = true;
                this.G = false;
                dq0Var.setVisibility(0);
                dq0Var.setTranslationY((pp0Var.getTop() + paddingTop) - dq0Var.getTop());
            } else {
                this.H = false;
                this.G = false;
                dq0Var.setVisibility(0);
                dq0Var.setTranslationY((AndroidUtilities.dp(1.0f) + getHeight()) - dq0Var.getTop());
            }
            boolean z11 = this.G;
            if (dq0Var.I != z11) {
                dq0Var.I = z11;
                dq0Var.L.D0(2);
                dq0Var.invalidate();
            }
            if (this.H) {
                f7 = AndroidUtilities.dp(36.0f) + i11;
            }
            view.setTranslationY(f7);
            pp0Var.invalidate();
            invalidate();
            return;
        }
        this.G = false;
        this.H = false;
        if (view != null) {
            view.setTranslationY(0.0f);
        }
        if (dq0Var != null) {
            dq0Var.setVisibility(4);
            boolean z12 = this.G;
            if (dq0Var.I != z12) {
                dq0Var.I = z12;
                dq0Var.L.D0(2);
                dq0Var.invalidate();
            }
        }
    }

    public final void i() {
        MessageObject messageObject;
        tp0 tp0Var = this.v;
        if (tp0Var != null) {
            org.telegram.ui.Cells.u1[] cells = tp0Var.getCells();
            for (int i10 = 0; i10 < cells.length; i10++) {
                org.telegram.ui.Cells.u1 u1Var = cells[i10];
                if (u1Var != null && (messageObject = u1Var.getMessageObject()) != null) {
                    messageObject.notime = true;
                    bq0 bq0Var = this.f41869f;
                    if (bq0Var != null) {
                        messageObject.overrideLinkColor = bq0Var.getColorId();
                    }
                    messageObject.overrideLinkEmoji = this.f41877n;
                    messageObject.overrideLinkPeerColor = this.f41882s;
                    cells[i10].setAvatar(messageObject);
                    cells[i10].invalidate();
                }
            }
        }
    }

    public final void j(boolean z10) {
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible;
        boolean z11;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible2;
        boolean z12;
        int i10;
        eq0 eq0Var;
        hp0 hp0Var;
        int i11;
        bq0 bq0Var = this.f41869f;
        if (bq0Var != null) {
            bq0Var.a(this.h, z10);
        }
        cq0 cq0Var = this.f41861a;
        if (cq0Var != null) {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = this.f41881r;
            if (tL_emojiStatusCollectible != null) {
                cq0Var.e(tL_emojiStatusCollectible.document_id, true, z10);
                cq0Var.c(MessagesController.PeerColor.fromCollectible(this.f41881r), z10);
                cq0Var.d(this.f41881r.pattern_document_id, true, z10);
            } else {
                if (DialogObject.isEmojiStatusCollectible(0L)) {
                    cq0Var.e(0L, false, z10);
                } else {
                    cq0Var.e(DialogObject.getEmojiStatusDocumentId(0L), DialogObject.isEmojiStatusCollectible(0L), z10);
                }
                cq0Var.b(this.h, z10);
                cq0Var.d(this.f41877n, false, z10);
            }
        }
        int i12 = this.m0;
        if (i12 == 0 && (hp0Var = (eq0Var = this.f41880p0).e) != null) {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2 = this.f41881r;
            if (tL_emojiStatusCollectible2 == null) {
                i11 = ((org.telegram.ui.ActionBar.m2) eq0Var).currentAccount;
                hp0Var.b(i11, this.h, z10);
            } else {
                hp0Var.c(MessagesController.PeerColor.fromCollectible(tL_emojiStatusCollectible2), z10);
            }
        }
        if (i12 == 0) {
            int i13 = this.V;
            k();
            rp0 rp0Var = this.d;
            if (i13 >= 0 && this.V < 0) {
                rp0Var.t(i13, 2);
            } else if (i13 < 0 && (i10 = this.V) >= 0) {
                rp0Var.s(i10, 2);
            }
        }
        int i14 = 0;
        while (true) {
            pp0 pp0Var = this.f41863b;
            if (i14 < pp0Var.getChildCount()) {
                View childAt = pp0Var.getChildAt(i14);
                if (childAt instanceof mp0) {
                    mp0 mp0Var = (mp0) childAt;
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible3 = this.f41881r;
                    if ((tL_emojiStatusCollectible3 != null && tL_emojiStatusCollectible3.collectible_id == mp0Var.getGiftId()) || ((tL_peerColorCollectible2 = this.f41882s) != null && tL_peerColorCollectible2.collectible_id == mp0Var.getGiftId())) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    mp0Var.b(z12, true);
                } else if (childAt instanceof yh.h1) {
                    yh.h1 h1Var = (yh.h1) childAt;
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible4 = this.f41881r;
                    if ((tL_emojiStatusCollectible4 != null && tL_emojiStatusCollectible4.collectible_id == h1Var.getGiftId()) || ((tL_peerColorCollectible = this.f41882s) != null && tL_peerColorCollectible.collectible_id == h1Var.getGiftId())) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    h1Var.e(z11, true);
                }
                i14++;
            } else {
                return;
            }
        }
    }

    public final void k() {
        zh.f5 f5Var;
        int i10;
        eq0 eq0Var = this.f41880p0;
        zh.f5 f5Var2 = eq0Var.f35349b;
        this.V = -1;
        this.W = -1;
        this.f41862a0 = -1;
        this.f41864b0 = -1;
        this.f41867d0 = -1;
        this.f41868e0 = -1;
        this.f41866c0 = -1;
        this.f41871g0 = -1;
        this.f41872h0 = -1;
        this.f41873i0 = -1;
        this.f41874j0 = -1;
        this.f41870f0 = 0;
        ArrayList arrayList = this.f41876l0;
        arrayList.clear();
        this.Q = 0;
        this.S = 1;
        int i11 = 3;
        this.f41875k0 = 3;
        this.R = 2;
        int i12 = this.m0;
        if (i12 == 0 && (this.h >= 0 || this.f41881r != null || this.f41882s != null)) {
            this.V = 3;
            this.f41875k0 = 5;
            this.W = 4;
        }
        if (i12 == 1) {
            f5Var = eq0Var.f35351c;
        } else {
            f5Var = f5Var2;
        }
        if ((i12 == 0 || i12 == 1) && f5Var != null) {
            ArrayList arrayList2 = f5Var.f50510l;
            int i13 = this.f41875k0;
            this.f41875k0 = i13 + 1;
            this.f41872h0 = i13;
            if (this.K == null) {
                for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                    TL_stars.StarGift starGift = ((TL_stars.SavedStarGift) arrayList2.get(i14)).gift;
                    if (starGift instanceof TL_stars.TL_starGiftUnique) {
                        arrayList.add((TL_stars.TL_starGiftUnique) starGift);
                    }
                }
                int i15 = this.f41875k0;
                this.f41864b0 = i15;
                this.f41875k0 = arrayList.size() + i15;
                int size = arrayList.size() + this.f41870f0;
                this.f41870f0 = size;
                int i16 = this.f41875k0;
                this.f41866c0 = i16;
                if (!f5Var2.f50507i && f5Var2.f50508j) {
                    if (arrayList.isEmpty()) {
                        int i17 = this.f41875k0;
                        this.f41874j0 = i17;
                        this.f41875k0 = i17 + 2;
                        this.f41873i0 = i17 + 1;
                    }
                } else {
                    this.f41867d0 = i16;
                    int i18 = 3 - (size % 3);
                    if (size <= 0) {
                        i11 = 9;
                    } else if (i18 > 0) {
                        i11 = i18;
                    }
                    int i19 = i16 + i11;
                    this.f41875k0 = i19;
                    this.f41870f0 = size + i11;
                    this.f41868e0 = i19;
                }
                if (c()) {
                    f5Var.a();
                }
            } else if (this.J != null) {
                i10 = ((org.telegram.ui.ActionBar.m2) eq0Var).currentAccount;
                long clientUserId = UserConfig.getInstance(i10).getClientUserId();
                for (int i20 = 0; i20 < this.J.d.size(); i20++) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.J.d.get(i20);
                    if (DialogObject.getPeerDialogId(tL_starGiftUnique.owner_id) != clientUserId && DialogObject.getPeerDialogId(tL_starGiftUnique.host_id) != clientUserId) {
                        arrayList.add(tL_starGiftUnique);
                    }
                }
                int i21 = this.f41875k0;
                this.f41864b0 = i21;
                this.f41875k0 = arrayList.size() + i21;
                int size2 = arrayList.size() + this.f41870f0;
                this.f41870f0 = size2;
                int i22 = this.f41875k0;
                this.f41866c0 = i22;
                yh.t3 t3Var = this.J;
                if (t3Var.f49144t || !t3Var.f49145u) {
                    this.f41867d0 = i22;
                    int i23 = 3 - (size2 % 3);
                    if (size2 <= 0) {
                        i11 = 9;
                    } else if (i23 > 0) {
                        i11 = i23;
                    }
                    int i24 = i22 + i11;
                    this.f41875k0 = i24;
                    this.f41870f0 = size2 + i11;
                    this.f41868e0 = i24;
                }
                if (c()) {
                    this.J.g(false);
                }
            }
            int i25 = this.f41875k0;
            this.f41875k0 = i25 + 1;
            this.f41871g0 = i25;
        }
        int i26 = this.f41875k0;
        this.f41875k0 = i26 + 1;
        this.U = i26;
        dq0 dq0Var = this.E;
        if (dq0Var != null) {
            dq0Var.post(new op0(this, 1));
        }
    }

    public final void l(dq0 dq0Var) {
        int i10;
        int i11 = org.telegram.ui.ActionBar.g6.f19601d6;
        eq0 eq0Var = this.f41880p0;
        int themedColor = eq0Var.getThemedColor(i11);
        eq0Var.getThemedColor(org.telegram.ui.ActionBar.g6.f19543a7);
        int themedColor2 = eq0Var.getThemedColor(org.telegram.ui.ActionBar.g6.f20005z6);
        int themedColor3 = eq0Var.getThemedColor(org.telegram.ui.ActionBar.g6.G6);
        dq0Var.v.setColor(themedColor);
        dq0Var.f35126x = org.telegram.ui.ActionBar.g6.m1(0.06f, themedColor3);
        dq0Var.f35127y = themedColor2;
        dq0Var.E = themedColor3;
        v60 v60Var = dq0Var.f35118a;
        for (int i12 = 0; i12 < v60Var.getChildCount(); i12++) {
            View childAt = v60Var.getChildAt(i12);
            int R = RecyclerView.R(childAt);
            if (R != -1 && (childAt instanceof TextView)) {
                TextView textView = (TextView) childAt;
                if (R == dq0Var.d) {
                    i10 = dq0Var.E;
                } else {
                    i10 = dq0Var.f35127y;
                }
                textView.setTextColor(i10);
                childAt.invalidate();
            }
        }
        v60Var.invalidate();
        dq0Var.invalidate();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12 = this.m0;
        View view = this.f41883w;
        pp0 pp0Var = this.f41863b;
        if (i12 == 1) {
            super.onMeasure(i10, i11);
            tp0 tp0Var = this.v;
            this.f41878n0 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + tp0Var.getMeasuredHeight() + AndroidUtilities.statusBarHeight;
            ((ViewGroup.MarginLayoutParams) tp0Var.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
            ((ViewGroup.MarginLayoutParams) pp0Var.getLayoutParams()).topMargin = this.f41878n0 - AndroidUtilities.dp(16.0f);
            ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).topMargin = this.f41878n0 - AndroidUtilities.dp(64.0f);
            ((ViewGroup.MarginLayoutParams) this.f41884x.getLayoutParams()).topMargin = this.f41878n0 - AndroidUtilities.dp(16.0f);
            pp0Var.setPadding(pp0Var.getPaddingLeft(), AndroidUtilities.dp(16.0f), pp0Var.getPaddingRight(), pp0Var.getPaddingBottom());
        } else {
            this.f41878n0 = AndroidUtilities.dp(230.0f) + AndroidUtilities.statusBarHeight;
            ((ViewGroup.MarginLayoutParams) pp0Var.getLayoutParams()).topMargin = this.f41878n0;
            ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).topMargin = this.f41878n0 - AndroidUtilities.dp(64.0f);
            ((ViewGroup.MarginLayoutParams) this.f41861a.getLayoutParams()).height = this.f41878n0;
        }
        super.onMeasure(i10, i11);
    }
}
