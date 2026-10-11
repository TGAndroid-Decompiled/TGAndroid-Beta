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
public final class tp0 extends FrameLayout {
    public static final int f42220q0 = 0;
    public final yp0 E;
    public View F;
    public boolean G;
    public boolean H;
    public TL_stars.TL_starGiftUnique I;
    public xh.v3 J;
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
    public final xp0 f42221a;
    public int f42222a0;
    public final kp0 f42223b;
    public int f42224b0;
    public final s4.s f42225c;
    public int f42226c0;
    public final mp0 d;
    public int f42227d0;
    public final n6.k f42228e;
    public int f42229e0;
    public wp0 f42230f;
    public int f42231f0;
    public int f42232g0;
    public int h;
    public int f42233h0;
    public int f42234i0;
    public int f42235j0;
    public int f42236k0;
    public final ArrayList f42237l0;
    public final int m0;
    public long f42238n;
    public int f42239n0;
    public qp0 f42240o0;
    public final zp0 f42241p0;
    public TLRPC.TL_emojiStatusCollectible f42242r;
    public TLRPC.TL_peerColorCollectible f42243s;
    public final op0 v;
    public final View f42244w;
    public final View f42245x;
    public sp0 f42246y;

    public tp0(zp0 zp0Var, Context context, int i10) {
        super(context);
        int i11;
        this.f42241p0 = zp0Var;
        this.f42228e = new n6.k(8);
        this.h = -1;
        this.f42238n = 0L;
        this.f42242r = null;
        this.f42243s = null;
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
        this.f42222a0 = -1;
        this.f42224b0 = -1;
        this.f42226c0 = -1;
        this.f42227d0 = -1;
        this.f42229e0 = -1;
        this.f42231f0 = 0;
        this.f42232g0 = -1;
        this.f42233h0 = -1;
        this.f42234i0 = -1;
        this.f42235j0 = -1;
        this.f42237l0 = new ArrayList();
        this.m0 = i10;
        d();
        Context context2 = getContext();
        org.telegram.ui.ActionBar.d6 resourceProvider = zp0Var.getResourceProvider();
        ah.c cVar = zp0Var.G;
        kp0 kp0Var = new kp0(this, context2, resourceProvider, i10);
        this.f42223b = kp0Var;
        kp0Var.setClipToPadding(false);
        kp0Var.setSections(true);
        ((s4.j) kp0Var.getItemAnimator()).f47788m = false;
        getContext();
        s4.s sVar = new s4.s(3);
        this.f42225c = sVar;
        sVar.O = new ci.w1(this, 6);
        kp0Var.i(new ci.q1(this, 7));
        kp0Var.setLayoutManager(sVar);
        mp0 mp0Var = new mp0(this, context, i10);
        this.d = mp0Var;
        kp0Var.setAdapter(mp0Var);
        kp0Var.setOnItemClickListener(new org.telegram.ui.Components.xn0(this, i10, 1));
        kp0Var.j(new np0(this, i10));
        addView(kp0Var, w7.x5.d(-1.0f, -1));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("l");
        spannableStringBuilder.setSpan(new org.telegram.ui.Components.er(R.drawable.msg_mini_lock2, 0), 0, 1, 33);
        if (zp0Var.f45036a) {
            i11 = R.string.ChannelColorApply;
        } else {
            i11 = R.string.UserColorApply;
        }
        String string = LocaleController.getString(i11);
        this.O = string;
        this.N = new SpannableStringBuilder(spannableStringBuilder).append((CharSequence) " ").append((CharSequence) string);
        this.P = LocaleController.getString(R.string.UserColorApplyCollectible);
        f(false);
        s4.j jVar = new s4.j();
        jVar.n(350L);
        jVar.o(org.telegram.ui.Components.is.h);
        jVar.C = false;
        jVar.f47788m = false;
        kp0Var.setItemAnimator(jVar);
        View view = new View(getContext());
        this.f42244w = view;
        ah.d dVar = new ah.d(cVar.c(view, null, false));
        dVar.b(-AndroidUtilities.dp(24.0f), true);
        dVar.f562q = 220;
        view.setBackground(dVar);
        addView(view, w7.x5.e(-1, 72, 55));
        if (i10 == 0) {
            this.f42221a = new xp0(zp0.f0(zp0Var), 0L, getContext(), zp0.g0(zp0Var));
            j(false);
        } else {
            View view2 = new View(getContext());
            this.f42245x = view2;
            ah.d dVar2 = new ah.d(cVar.c(view2, null, false));
            dVar2.b(-AndroidUtilities.dp(16.0f), false);
            view2.setBackground(dVar2);
            addView(view2, w7.x5.e(-1, 16, 55));
            ?? gaVar = new org.telegram.ui.Cells.ga(getContext(), zp0.h0(zp0Var), 3, 0L, zp0.i0(zp0Var));
            this.v = gaVar;
            gaVar.setImportantForAccessibility(4);
            gaVar.f22162r = zp0Var;
            gaVar.setClipToOutline(true);
            ai.l2 l2Var = yf.i0.f52258a;
            gaVar.setOutlineProvider(new yf.h0(0, AndroidUtilities.dp(16.0f)));
            addView((View) gaVar, w7.x5.a(-2.0f, 12.0f, 0.0f, 12.0f, 0.0f, -1, 55));
        }
        yp0 yp0Var = new yp0(zp0Var, getContext(), zp0.j0(zp0Var));
        this.E = yp0Var;
        ch.d c10 = zp0Var.E.c(yp0Var, null, false);
        dh.e eVar = new dh.e(zp0.k0(zp0Var));
        eVar.f8365e = new d2.c(8);
        eVar.e(0, 0);
        eVar.c(0, 0);
        eVar.b(0, 0);
        c10.o(eVar);
        c10.q(AndroidUtilities.dp(18.0f));
        c10.f4684j.f4667e = true;
        yp0Var.H = c10;
        yp0Var.G = c10;
        yp0Var.F = new jp0(this, 0);
        yp0Var.setVisibility(4);
        addView(yp0Var, w7.x5.a(36.0f, 12.0f, 0.0f, 12.0f, 0.0f, -1, 55));
        xp0 xp0Var = this.f42221a;
        if (xp0Var != null) {
            addView(xp0Var, w7.x5.e(-1, -2, 55));
        }
        g();
        k();
        setWillNotDraw(false);
    }

    public static void a(tp0 tp0Var) {
        int i10;
        kp0 kp0Var = tp0Var.f42223b;
        boolean z10 = tp0Var.H;
        if (z10) {
            kp0Var.B0();
        }
        tp0Var.e();
        if (z10 && (i10 = tp0Var.f42233h0) >= 0) {
            tp0Var.f42225c.h1(i10, tp0Var.f42241p0.f45045f);
            kp0Var.post(new jp0(tp0Var, 1));
        }
    }

    public final boolean b() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.tp0.b():boolean");
    }

    public final boolean c() {
        kp0 kp0Var = this.f42223b;
        if (kp0Var != null) {
            for (int i10 = 0; i10 < kp0Var.getChildCount(); i10++) {
                if (kp0Var.getChildAt(i10) instanceof org.telegram.ui.Components.k10) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void d() {
        TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible;
        int i10 = this.m0;
        zp0 zp0Var = this.f42241p0;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible = null;
        if (i10 == 0) {
            TLRPC.User currentUser = zp0Var.getUserConfig().getCurrentUser();
            this.h = UserObject.getProfileColorId(currentUser);
            this.f42238n = UserObject.getProfileEmojiId(currentUser);
            if (currentUser != null) {
                TLRPC.EmojiStatus emojiStatus = currentUser.emoji_status;
                if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                    tL_emojiStatusCollectible = (TLRPC.TL_emojiStatusCollectible) emojiStatus;
                    this.f42242r = tL_emojiStatusCollectible;
                    this.f42243s = null;
                }
            }
            tL_emojiStatusCollectible = null;
            this.f42242r = tL_emojiStatusCollectible;
            this.f42243s = null;
        } else {
            TLRPC.User currentUser2 = zp0Var.getUserConfig().getCurrentUser();
            this.h = UserObject.getColorId(currentUser2);
            this.f42238n = UserObject.getEmojiId(currentUser2);
            this.f42242r = null;
            if (currentUser2 != null) {
                TLRPC.PeerColor peerColor = currentUser2.color;
                if (peerColor instanceof TLRPC.TL_peerColorCollectible) {
                    tL_peerColorCollectible = (TLRPC.TL_peerColorCollectible) peerColor;
                }
            }
            this.f42243s = tL_peerColorCollectible;
        }
        if (this.f42242r == null && this.f42243s == null) {
            return;
        }
        this.h = -1;
        this.f42238n = 0L;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view == this.E && !this.H) {
            return false;
        }
        return super.drawChild(canvas, view, j3);
    }

    public final void e() {
        k();
        this.d.l();
    }

    public final void f(boolean z10) {
        Object obj;
        TL_stars.TL_starGiftUnique tL_starGiftUnique = this.I;
        zp0 zp0Var = this.f42241p0;
        n6.k kVar = this.f42228e;
        if (tL_starGiftUnique != null) {
            zf.a resellAmount = tL_starGiftUnique.getResellAmount(zf.b.f54530a);
            if (tL_starGiftUnique.resale_ton_only) {
                kVar.f16729b = yh.p7.T0(LocaleController.formatString(R.string.ResellGiftBuyTON, tL_starGiftUnique.getResellAmount(zf.b.f54531b).d()), true);
                kVar.f16730c = yh.p7.R0(LocaleController.formatPluralStringComma("ResellGiftBuyEq", (int) resellAmount.a()));
            } else {
                kVar.f16729b = yh.p7.R0(LocaleController.formatPluralStringComma("ResellGiftBuy", (int) resellAmount.a()));
                kVar.f16730c = null;
            }
        } else {
            if (!zp0Var.getUserConfig().isPremium() && !zp0Var.f45036a) {
                obj = this.N;
            } else if (this.f42242r != null) {
                obj = this.P;
            } else {
                obj = this.O;
            }
            kVar.f16729b = obj;
            kVar.f16730c = null;
        }
        if (zp0Var.C0() == this) {
            zp0Var.R = this;
            zp0Var.Q.g((CharSequence) kVar.f16729b, z10, true);
            zp0Var.Q.f((SpannableStringBuilder) kVar.f16730c, z10);
        }
    }

    public final void g() {
        ci.d dVar = this.f42241p0.Q;
        if (dVar != null) {
            dVar.j();
        }
        op0 op0Var = this.v;
        if (op0Var != null) {
            op0Var.invalidate();
        }
        j(true);
        AndroidUtilities.forEachViews((RecyclerView) this.f42223b, (Utilities.Callback<View>) new s3(this, 14));
        yp0 yp0Var = this.E;
        if (yp0Var != null) {
            l(yp0Var);
        }
    }

    public final void h() {
        int i10;
        boolean z10;
        int i11 = this.f42241p0.f45045f;
        float f7 = 0.0f;
        View view = this.f42244w;
        yp0 yp0Var = this.E;
        if (yp0Var != null && (i10 = this.f42233h0) >= 0) {
            s4.s sVar = this.f42225c;
            this.F = sVar.m(i10);
            kp0 kp0Var = this.f42223b;
            int paddingTop = kp0Var.getPaddingTop() + i11;
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
                yp0Var.setVisibility(0);
                yp0Var.setTranslationY((Math.max(this.F.getTop(), paddingTop) + kp0Var.getTop()) - yp0Var.getTop());
            } else if (L0 != -1 && L0 > this.f42233h0) {
                this.H = true;
                this.G = false;
                yp0Var.setVisibility(0);
                yp0Var.setTranslationY((kp0Var.getTop() + paddingTop) - yp0Var.getTop());
            } else {
                this.H = false;
                this.G = false;
                yp0Var.setVisibility(0);
                yp0Var.setTranslationY((AndroidUtilities.dp(1.0f) + getHeight()) - yp0Var.getTop());
            }
            boolean z11 = this.G;
            if (yp0Var.I != z11) {
                yp0Var.I = z11;
                yp0Var.L.D0(2);
                yp0Var.invalidate();
            }
            if (this.H) {
                f7 = AndroidUtilities.dp(36.0f) + i11;
            }
            view.setTranslationY(f7);
            kp0Var.invalidate();
            invalidate();
            return;
        }
        this.G = false;
        this.H = false;
        if (view != null) {
            view.setTranslationY(0.0f);
        }
        if (yp0Var != null) {
            yp0Var.setVisibility(4);
            boolean z12 = this.G;
            if (yp0Var.I != z12) {
                yp0Var.I = z12;
                yp0Var.L.D0(2);
                yp0Var.invalidate();
            }
        }
    }

    public final void i() {
        MessageObject messageObject;
        op0 op0Var = this.v;
        if (op0Var != null) {
            org.telegram.ui.Cells.u1[] cells = op0Var.getCells();
            for (int i10 = 0; i10 < cells.length; i10++) {
                org.telegram.ui.Cells.u1 u1Var = cells[i10];
                if (u1Var != null && (messageObject = u1Var.getMessageObject()) != null) {
                    messageObject.notime = true;
                    wp0 wp0Var = this.f42230f;
                    if (wp0Var != null) {
                        messageObject.overrideLinkColor = wp0Var.getColorId();
                    }
                    messageObject.overrideLinkEmoji = this.f42238n;
                    messageObject.overrideLinkPeerColor = this.f42243s;
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
        zp0 zp0Var;
        bp0 bp0Var;
        wp0 wp0Var = this.f42230f;
        if (wp0Var != null) {
            wp0Var.a(this.h, z10);
        }
        xp0 xp0Var = this.f42221a;
        if (xp0Var != null) {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = this.f42242r;
            if (tL_emojiStatusCollectible != null) {
                xp0Var.e(tL_emojiStatusCollectible.document_id, true, z10);
                xp0Var.c(MessagesController.PeerColor.fromCollectible(this.f42242r), z10);
                xp0Var.d(this.f42242r.pattern_document_id, true, z10);
            } else {
                if (DialogObject.isEmojiStatusCollectible(0L)) {
                    xp0Var.e(0L, false, z10);
                } else {
                    xp0Var.e(DialogObject.getEmojiStatusDocumentId(0L), DialogObject.isEmojiStatusCollectible(0L), z10);
                }
                xp0Var.b(this.h, z10);
                xp0Var.d(this.f42238n, false, z10);
            }
        }
        int i11 = this.m0;
        if (i11 == 0 && (bp0Var = (zp0Var = this.f42241p0).f45043e) != null) {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2 = this.f42242r;
            if (tL_emojiStatusCollectible2 != null) {
                bp0Var.c(MessagesController.PeerColor.fromCollectible(tL_emojiStatusCollectible2), z10);
            } else {
                bp0Var.b(zp0.v0(zp0Var), this.h, z10);
            }
        }
        if (i11 == 0) {
            int i12 = this.V;
            k();
            mp0 mp0Var = this.d;
            if (i12 >= 0 && this.V < 0) {
                mp0Var.t(i12, 2);
            } else if (i12 < 0 && (i10 = this.V) >= 0) {
                mp0Var.s(i10, 2);
            }
        }
        int i13 = 0;
        while (true) {
            kp0 kp0Var = this.f42223b;
            if (i13 < kp0Var.getChildCount()) {
                View childAt = kp0Var.getChildAt(i13);
                if (childAt instanceof hp0) {
                    hp0 hp0Var = (hp0) childAt;
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible3 = this.f42242r;
                    if ((tL_emojiStatusCollectible3 != null && tL_emojiStatusCollectible3.collectible_id == hp0Var.getGiftId()) || ((tL_peerColorCollectible2 = this.f42243s) != null && tL_peerColorCollectible2.collectible_id == hp0Var.getGiftId())) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    hp0Var.b(z12, true);
                } else if (childAt instanceof xh.j1) {
                    xh.j1 j1Var = (xh.j1) childAt;
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible4 = this.f42242r;
                    if ((tL_emojiStatusCollectible4 != null && tL_emojiStatusCollectible4.collectible_id == j1Var.getGiftId()) || ((tL_peerColorCollectible = this.f42243s) != null && tL_peerColorCollectible.collectible_id == j1Var.getGiftId())) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    j1Var.e(z11, true);
                }
                i13++;
            } else {
                return;
            }
        }
    }

    public final void k() {
        yh.f5 f5Var;
        zp0 zp0Var = this.f42241p0;
        yh.f5 f5Var2 = zp0Var.f45038b;
        this.V = -1;
        this.W = -1;
        this.f42222a0 = -1;
        this.f42224b0 = -1;
        this.f42227d0 = -1;
        this.f42229e0 = -1;
        this.f42226c0 = -1;
        this.f42232g0 = -1;
        this.f42233h0 = -1;
        this.f42234i0 = -1;
        this.f42235j0 = -1;
        this.f42231f0 = 0;
        ArrayList arrayList = this.f42237l0;
        arrayList.clear();
        this.Q = 0;
        this.S = 1;
        int i10 = 3;
        this.f42236k0 = 3;
        this.R = 2;
        int i11 = this.m0;
        if (i11 == 0 && (this.h >= 0 || this.f42242r != null || this.f42243s != null)) {
            this.V = 3;
            this.f42236k0 = 5;
            this.W = 4;
        }
        if (i11 == 1) {
            f5Var = zp0Var.f45040c;
        } else {
            f5Var = f5Var2;
        }
        if ((i11 == 0 || i11 == 1) && f5Var != null) {
            ArrayList arrayList2 = f5Var.f52606l;
            int i12 = this.f42236k0;
            this.f42236k0 = i12 + 1;
            this.f42233h0 = i12;
            if (this.K == null) {
                for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                    TL_stars.StarGift starGift = ((TL_stars.SavedStarGift) arrayList2.get(i13)).gift;
                    if (starGift instanceof TL_stars.TL_starGiftUnique) {
                        arrayList.add((TL_stars.TL_starGiftUnique) starGift);
                    }
                }
                int i14 = this.f42236k0;
                this.f42224b0 = i14;
                this.f42236k0 = arrayList.size() + i14;
                int size = arrayList.size() + this.f42231f0;
                this.f42231f0 = size;
                int i15 = this.f42236k0;
                this.f42226c0 = i15;
                if (!f5Var2.f52603i && f5Var2.f52604j) {
                    if (arrayList.isEmpty()) {
                        int i16 = this.f42236k0;
                        this.f42235j0 = i16;
                        this.f42236k0 = i16 + 2;
                        this.f42234i0 = i16 + 1;
                    }
                } else {
                    this.f42227d0 = i15;
                    int i17 = 3 - (size % 3);
                    if (size <= 0) {
                        i10 = 9;
                    } else if (i17 > 0) {
                        i10 = i17;
                    }
                    int i18 = i15 + i10;
                    this.f42236k0 = i18;
                    this.f42231f0 = size + i10;
                    this.f42229e0 = i18;
                }
                if (c()) {
                    f5Var.a();
                }
            } else if (this.J != null) {
                long clientUserId = UserConfig.getInstance(zp0.u0(zp0Var)).getClientUserId();
                for (int i19 = 0; i19 < this.J.d.size(); i19++) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.J.d.get(i19);
                    if (DialogObject.getPeerDialogId(tL_starGiftUnique.owner_id) != clientUserId && DialogObject.getPeerDialogId(tL_starGiftUnique.host_id) != clientUserId) {
                        arrayList.add(tL_starGiftUnique);
                    }
                }
                int i20 = this.f42236k0;
                this.f42224b0 = i20;
                this.f42236k0 = arrayList.size() + i20;
                int size2 = arrayList.size() + this.f42231f0;
                this.f42231f0 = size2;
                int i21 = this.f42236k0;
                this.f42226c0 = i21;
                xh.v3 v3Var = this.J;
                if (v3Var.f51656t || !v3Var.f51657u) {
                    this.f42227d0 = i21;
                    int i22 = 3 - (size2 % 3);
                    if (size2 <= 0) {
                        i10 = 9;
                    } else if (i22 > 0) {
                        i10 = i22;
                    }
                    int i23 = i21 + i10;
                    this.f42236k0 = i23;
                    this.f42231f0 = size2 + i10;
                    this.f42229e0 = i23;
                }
                if (c()) {
                    this.J.g(false);
                }
            }
            int i24 = this.f42236k0;
            this.f42236k0 = i24 + 1;
            this.f42232g0 = i24;
        }
        int i25 = this.f42236k0;
        this.f42236k0 = i25 + 1;
        this.U = i25;
        yp0 yp0Var = this.E;
        if (yp0Var != null) {
            yp0Var.post(new jp0(this, 1));
        }
    }

    public final void l(yp0 yp0Var) {
        int i10;
        int i11 = org.telegram.ui.ActionBar.h6.f20786d6;
        zp0 zp0Var = this.f42241p0;
        int themedColor = zp0Var.getThemedColor(i11);
        zp0Var.getThemedColor(org.telegram.ui.ActionBar.h6.f20730a7);
        int themedColor2 = zp0Var.getThemedColor(org.telegram.ui.ActionBar.h6.f21189z6);
        int themedColor3 = zp0Var.getThemedColor(org.telegram.ui.ActionBar.h6.G6);
        yp0Var.v.setColor(themedColor);
        yp0Var.f44476x = org.telegram.ui.ActionBar.h6.m1(0.06f, themedColor3);
        yp0Var.f44477y = themedColor2;
        yp0Var.E = themedColor3;
        o60 o60Var = yp0Var.f44467a;
        for (int i12 = 0; i12 < o60Var.getChildCount(); i12++) {
            View childAt = o60Var.getChildAt(i12);
            int R = RecyclerView.R(childAt);
            if (R != -1 && (childAt instanceof TextView)) {
                TextView textView = (TextView) childAt;
                if (R == yp0Var.d) {
                    i10 = yp0Var.E;
                } else {
                    i10 = yp0Var.f44477y;
                }
                textView.setTextColor(i10);
                childAt.invalidate();
            }
        }
        o60Var.invalidate();
        yp0Var.invalidate();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12 = this.m0;
        View view = this.f42244w;
        kp0 kp0Var = this.f42223b;
        if (i12 == 1) {
            super.onMeasure(i10, i11);
            op0 op0Var = this.v;
            this.f42239n0 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + op0Var.getMeasuredHeight() + AndroidUtilities.statusBarHeight;
            ((ViewGroup.MarginLayoutParams) op0Var.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
            ((ViewGroup.MarginLayoutParams) kp0Var.getLayoutParams()).topMargin = this.f42239n0 - AndroidUtilities.dp(16.0f);
            ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).topMargin = this.f42239n0 - AndroidUtilities.dp(64.0f);
            ((ViewGroup.MarginLayoutParams) this.f42245x.getLayoutParams()).topMargin = this.f42239n0 - AndroidUtilities.dp(16.0f);
            kp0Var.setPadding(kp0Var.getPaddingLeft(), AndroidUtilities.dp(16.0f), kp0Var.getPaddingRight(), kp0Var.getPaddingBottom());
        } else {
            this.f42239n0 = AndroidUtilities.dp(230.0f) + AndroidUtilities.statusBarHeight;
            ((ViewGroup.MarginLayoutParams) kp0Var.getLayoutParams()).topMargin = this.f42239n0;
            ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).topMargin = this.f42239n0 - AndroidUtilities.dp(64.0f);
            ((ViewGroup.MarginLayoutParams) this.f42221a.getLayoutParams()).height = this.f42239n0;
        }
        super.onMeasure(i10, i11);
    }
}
