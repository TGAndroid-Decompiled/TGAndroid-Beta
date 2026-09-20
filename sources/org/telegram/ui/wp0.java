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
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class wp0 extends FrameLayout {
    public static final int f39191q0 = 0;
    public final bq0 E;
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
    public final aq0 f39192a;
    public int f39193a0;
    public final np0 f39194b;
    public int f39195b0;
    public final s4.s f39196c;
    public int f39197c0;
    public final pp0 d;
    public int f39198d0;
    public final org.telegram.ui.Cells.f3 e;
    public int f39199e0;
    public zp0 f39200f;
    public int f39201f0;
    public int f39202g0;
    public int h;
    public int f39203h0;
    public int f39204i0;
    public int f39205j0;
    public int f39206k0;
    public final ArrayList f39207l0;
    public final int m0;
    public long f39208n;
    public int f39209n0;
    public tp0 f39210o0;
    public final cq0 f39211p0;
    public TLRPC.TL_emojiStatusCollectible f39212r;
    public TLRPC.TL_peerColorCollectible f39213s;
    public final rp0 v;
    public final View f39214w;
    public final View f39215x;
    public vp0 f39216y;

    public wp0(cq0 cq0Var, Context context, int i10) {
        super(context);
        int i11;
        org.telegram.ui.ActionBar.d5 d5Var;
        org.telegram.ui.ActionBar.f6 f6Var;
        org.telegram.ui.ActionBar.f6 f6Var2;
        org.telegram.ui.ActionBar.f6 f6Var3;
        int i12;
        org.telegram.ui.ActionBar.f6 f6Var4;
        this.f39211p0 = cq0Var;
        this.e = new org.telegram.ui.Cells.f3(4);
        this.h = -1;
        this.f39208n = 0L;
        this.f39212r = null;
        this.f39213s = null;
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
        this.f39193a0 = -1;
        this.f39195b0 = -1;
        this.f39197c0 = -1;
        this.f39198d0 = -1;
        this.f39199e0 = -1;
        this.f39201f0 = 0;
        this.f39202g0 = -1;
        this.f39203h0 = -1;
        this.f39204i0 = -1;
        this.f39205j0 = -1;
        this.f39207l0 = new ArrayList();
        this.m0 = i10;
        d();
        Context context2 = getContext();
        org.telegram.ui.ActionBar.f6 resourceProvider = cq0Var.getResourceProvider();
        ah.c cVar = cq0Var.G;
        np0 np0Var = new np0(this, context2, resourceProvider, i10);
        this.f39194b = np0Var;
        np0Var.setClipToPadding(false);
        np0Var.setSections(true);
        ((s4.j) np0Var.getItemAnimator()).f43009m = false;
        getContext();
        s4.s sVar = new s4.s(3);
        this.f39196c = sVar;
        sVar.O = new ci.x1(this, 6);
        np0Var.i(new ci.r1(this, 7));
        np0Var.setLayoutManager(sVar);
        pp0 pp0Var = new pp0(this, context, i10);
        this.d = pp0Var;
        np0Var.setAdapter(pp0Var);
        np0Var.setOnItemClickListener(new org.telegram.ui.Components.bn0(this, i10, 1));
        np0Var.j(new qp0(this, i10));
        addView(np0Var, w7.y5.c(-1.0f, -1));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("l");
        spannableStringBuilder.setSpan(new org.telegram.ui.Components.oq(R.drawable.msg_mini_lock2, 0), 0, 1, 33);
        if (cq0Var.f32808a) {
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
        jVar.o(org.telegram.ui.Components.qr.h);
        jVar.C = false;
        jVar.f43009m = false;
        np0Var.setItemAnimator(jVar);
        View view = new View(getContext());
        this.f39214w = view;
        ah.e eVar = new ah.e(cVar.c(view, null, false));
        eVar.b(-AndroidUtilities.dp(24.0f), true);
        eVar.f443q = 220;
        view.setBackground(eVar);
        addView(view, w7.y5.e(-1, 72, 55));
        if (i10 == 0) {
            Context context3 = getContext();
            i12 = ((org.telegram.ui.ActionBar.n2) cq0Var).currentAccount;
            f6Var4 = ((org.telegram.ui.ActionBar.n2) cq0Var).resourceProvider;
            this.f39192a = new aq0(i12, 0L, context3, f6Var4);
            j(false);
        } else {
            View view2 = new View(getContext());
            this.f39215x = view2;
            ah.e eVar2 = new ah.e(cVar.c(view2, null, false));
            eVar2.b(-AndroidUtilities.dp(16.0f), false);
            view2.setBackground(eVar2);
            addView(view2, w7.y5.e(-1, 16, 55));
            Context context4 = getContext();
            d5Var = ((org.telegram.ui.ActionBar.n2) cq0Var).parentLayout;
            f6Var = ((org.telegram.ui.ActionBar.n2) cq0Var).resourceProvider;
            ?? jaVar = new org.telegram.ui.Cells.ja(context4, d5Var, 3, 0L, f6Var);
            this.v = jaVar;
            jaVar.setImportantForAccessibility(4);
            jaVar.f20512r = cq0Var;
            jaVar.setClipToOutline(true);
            ai.k2 k2Var = yf.j0.f47140a;
            jaVar.setOutlineProvider(new yf.h0(0, AndroidUtilities.dp(16.0f)));
            addView((View) jaVar, w7.y5.d(-1, -2.0f, 55, 12.0f, 0.0f, 12.0f, 0.0f));
        }
        Context context5 = getContext();
        f6Var2 = ((org.telegram.ui.ActionBar.n2) cq0Var).resourceProvider;
        bq0 bq0Var = new bq0(cq0Var, context5, f6Var2);
        this.E = bq0Var;
        ch.d c10 = cq0Var.E.c(bq0Var, null, false);
        f6Var3 = ((org.telegram.ui.ActionBar.n2) cq0Var).resourceProvider;
        dh.e eVar3 = new dh.e(f6Var3);
        eVar3.e = new d2.c(9);
        eVar3.f(0, 0);
        eVar3.e(0, 0);
        eVar3.c(0, 0);
        c10.o(eVar3);
        c10.q(AndroidUtilities.dp(18.0f));
        c10.f4289j.e = true;
        bq0Var.H = c10;
        bq0Var.G = c10;
        bq0Var.F = new mp0(this, 0);
        bq0Var.setVisibility(4);
        addView(bq0Var, w7.y5.d(-1, 36.0f, 55, 12.0f, 0.0f, 12.0f, 0.0f));
        aq0 aq0Var = this.f39192a;
        if (aq0Var != null) {
            addView(aq0Var, w7.y5.e(-1, -2, 55));
        }
        g();
        k();
        setWillNotDraw(false);
    }

    public static void a(wp0 wp0Var) {
        int i10;
        np0 np0Var = wp0Var.f39194b;
        boolean z10 = wp0Var.H;
        if (z10) {
            np0Var.C0();
        }
        wp0Var.e();
        if (z10 && (i10 = wp0Var.f39203h0) >= 0) {
            wp0Var.f39196c.h1(i10, wp0Var.f39211p0.f32816f);
            np0Var.post(new mp0(wp0Var, 1));
        }
    }

    public final boolean b() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wp0.b():boolean");
    }

    public final boolean c() {
        np0 np0Var = this.f39194b;
        if (np0Var != null) {
            for (int i10 = 0; i10 < np0Var.getChildCount(); i10++) {
                if (np0Var.getChildAt(i10) instanceof org.telegram.ui.Components.t00) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void d() {
        TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible;
        int i10 = this.m0;
        cq0 cq0Var = this.f39211p0;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible = null;
        if (i10 == 0) {
            TLRPC.User currentUser = cq0Var.getUserConfig().getCurrentUser();
            this.h = UserObject.getProfileColorId(currentUser);
            this.f39208n = UserObject.getProfileEmojiId(currentUser);
            if (currentUser != null) {
                TLRPC.EmojiStatus emojiStatus = currentUser.emoji_status;
                if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                    tL_emojiStatusCollectible = (TLRPC.TL_emojiStatusCollectible) emojiStatus;
                    this.f39212r = tL_emojiStatusCollectible;
                    this.f39213s = null;
                }
            }
            tL_emojiStatusCollectible = null;
            this.f39212r = tL_emojiStatusCollectible;
            this.f39213s = null;
        } else {
            TLRPC.User currentUser2 = cq0Var.getUserConfig().getCurrentUser();
            this.h = UserObject.getColorId(currentUser2);
            this.f39208n = UserObject.getEmojiId(currentUser2);
            this.f39212r = null;
            if (currentUser2 != null) {
                TLRPC.PeerColor peerColor = currentUser2.color;
                if (peerColor instanceof TLRPC.TL_peerColorCollectible) {
                    tL_peerColorCollectible = (TLRPC.TL_peerColorCollectible) peerColor;
                }
            }
            this.f39213s = tL_peerColorCollectible;
        }
        if (this.f39212r == null && this.f39213s == null) {
            return;
        }
        this.h = -1;
        this.f39208n = 0L;
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
        cq0 cq0Var = this.f39211p0;
        org.telegram.ui.Cells.f3 f3Var = this.e;
        if (tL_starGiftUnique != null) {
            zf.a resellAmount = tL_starGiftUnique.getResellAmount(zf.b.f49254a);
            if (tL_starGiftUnique.resale_ton_only) {
                f3Var.f20269b = yh.w7.S0(LocaleController.formatString(R.string.ResellGiftBuyTON, tL_starGiftUnique.getResellAmount(zf.b.f49255b).d()), true);
                f3Var.f20270c = yh.w7.Q0(LocaleController.formatPluralStringComma("ResellGiftBuyEq", (int) resellAmount.a()));
            } else {
                f3Var.f20269b = yh.w7.Q0(LocaleController.formatPluralStringComma("ResellGiftBuy", (int) resellAmount.a()));
                f3Var.f20270c = null;
            }
        } else {
            if (!cq0Var.getUserConfig().isPremium() && !cq0Var.f32808a) {
                obj = this.N;
            } else if (this.f39212r != null) {
                obj = this.P;
            } else {
                obj = this.O;
            }
            f3Var.f20269b = obj;
            f3Var.f20270c = null;
        }
        if (cq0Var.C0() == this) {
            cq0Var.R = this;
            cq0Var.Q.g((CharSequence) f3Var.f20269b, z10, true);
            cq0Var.Q.f((SpannableStringBuilder) f3Var.f20270c, z10);
        }
    }

    public final void g() {
        ci.d dVar = this.f39211p0.Q;
        if (dVar != null) {
            dVar.j();
        }
        rp0 rp0Var = this.v;
        if (rp0Var != null) {
            rp0Var.invalidate();
        }
        j(true);
        AndroidUtilities.forEachViews((RecyclerView) this.f39194b, (e2.h) new yb(this, 3));
        bq0 bq0Var = this.E;
        if (bq0Var != null) {
            l(bq0Var);
        }
    }

    public final void h() {
        int i10;
        boolean z10;
        int i11 = this.f39211p0.f32816f;
        float f7 = 0.0f;
        View view = this.f39214w;
        bq0 bq0Var = this.E;
        if (bq0Var != null && (i10 = this.f39203h0) >= 0) {
            s4.s sVar = this.f39196c;
            this.F = sVar.m(i10);
            np0 np0Var = this.f39194b;
            int paddingTop = np0Var.getPaddingTop() + i11;
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
                bq0Var.setVisibility(0);
                bq0Var.setTranslationY((Math.max(this.F.getTop(), paddingTop) + np0Var.getTop()) - bq0Var.getTop());
            } else if (L0 != -1 && L0 > this.f39203h0) {
                this.H = true;
                this.G = false;
                bq0Var.setVisibility(0);
                bq0Var.setTranslationY((np0Var.getTop() + paddingTop) - bq0Var.getTop());
            } else {
                this.H = false;
                this.G = false;
                bq0Var.setVisibility(0);
                bq0Var.setTranslationY((AndroidUtilities.dp(1.0f) + getHeight()) - bq0Var.getTop());
            }
            boolean z11 = this.G;
            if (bq0Var.I != z11) {
                bq0Var.I = z11;
                bq0Var.L.D0(2);
                bq0Var.invalidate();
            }
            if (this.H) {
                f7 = AndroidUtilities.dp(36.0f) + i11;
            }
            view.setTranslationY(f7);
            np0Var.invalidate();
            invalidate();
            return;
        }
        this.G = false;
        this.H = false;
        if (view != null) {
            view.setTranslationY(0.0f);
        }
        if (bq0Var != null) {
            bq0Var.setVisibility(4);
            boolean z12 = this.G;
            if (bq0Var.I != z12) {
                bq0Var.I = z12;
                bq0Var.L.D0(2);
                bq0Var.invalidate();
            }
        }
    }

    public final void i() {
        MessageObject messageObject;
        rp0 rp0Var = this.v;
        if (rp0Var != null) {
            org.telegram.ui.Cells.u1[] cells = rp0Var.getCells();
            for (int i10 = 0; i10 < cells.length; i10++) {
                org.telegram.ui.Cells.u1 u1Var = cells[i10];
                if (u1Var != null && (messageObject = u1Var.getMessageObject()) != null) {
                    messageObject.notime = true;
                    zp0 zp0Var = this.f39200f;
                    if (zp0Var != null) {
                        messageObject.overrideLinkColor = zp0Var.getColorId();
                    }
                    messageObject.overrideLinkEmoji = this.f39208n;
                    messageObject.overrideLinkPeerColor = this.f39213s;
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
        cq0 cq0Var;
        ep0 ep0Var;
        int i11;
        zp0 zp0Var = this.f39200f;
        if (zp0Var != null) {
            zp0Var.a(this.h, z10);
        }
        aq0 aq0Var = this.f39192a;
        if (aq0Var != null) {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = this.f39212r;
            if (tL_emojiStatusCollectible != null) {
                aq0Var.e(tL_emojiStatusCollectible.document_id, true, z10);
                aq0Var.c(MessagesController.PeerColor.fromCollectible(this.f39212r), z10);
                aq0Var.d(this.f39212r.pattern_document_id, true, z10);
            } else {
                if (DialogObject.isEmojiStatusCollectible(0L)) {
                    aq0Var.e(0L, false, z10);
                } else {
                    aq0Var.e(DialogObject.getEmojiStatusDocumentId(0L), DialogObject.isEmojiStatusCollectible(0L), z10);
                }
                aq0Var.b(this.h, z10);
                aq0Var.d(this.f39208n, false, z10);
            }
        }
        int i12 = this.m0;
        if (i12 == 0 && (ep0Var = (cq0Var = this.f39211p0).e) != null) {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2 = this.f39212r;
            if (tL_emojiStatusCollectible2 == null) {
                i11 = ((org.telegram.ui.ActionBar.n2) cq0Var).currentAccount;
                ep0Var.b(i11, this.h, z10);
            } else {
                ep0Var.c(MessagesController.PeerColor.fromCollectible(tL_emojiStatusCollectible2), z10);
            }
        }
        if (i12 == 0) {
            int i13 = this.V;
            k();
            pp0 pp0Var = this.d;
            if (i13 >= 0 && this.V < 0) {
                pp0Var.t(i13, 2);
            } else if (i13 < 0 && (i10 = this.V) >= 0) {
                pp0Var.s(i10, 2);
            }
        }
        int i14 = 0;
        while (true) {
            np0 np0Var = this.f39194b;
            if (i14 < np0Var.getChildCount()) {
                View childAt = np0Var.getChildAt(i14);
                if (childAt instanceof kp0) {
                    kp0 kp0Var = (kp0) childAt;
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible3 = this.f39212r;
                    if ((tL_emojiStatusCollectible3 != null && tL_emojiStatusCollectible3.collectible_id == kp0Var.getGiftId()) || ((tL_peerColorCollectible2 = this.f39213s) != null && tL_peerColorCollectible2.collectible_id == kp0Var.getGiftId())) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    kp0Var.b(z12, true);
                } else if (childAt instanceof xh.j1) {
                    xh.j1 j1Var = (xh.j1) childAt;
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible4 = this.f39212r;
                    if ((tL_emojiStatusCollectible4 != null && tL_emojiStatusCollectible4.collectible_id == j1Var.getGiftId()) || ((tL_peerColorCollectible = this.f39213s) != null && tL_peerColorCollectible.collectible_id == j1Var.getGiftId())) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    j1Var.e(z11, true);
                }
                i14++;
            } else {
                return;
            }
        }
    }

    public final void k() {
        yh.l5 l5Var;
        int i10;
        cq0 cq0Var = this.f39211p0;
        yh.l5 l5Var2 = cq0Var.f32810b;
        this.V = -1;
        this.W = -1;
        this.f39193a0 = -1;
        this.f39195b0 = -1;
        this.f39198d0 = -1;
        this.f39199e0 = -1;
        this.f39197c0 = -1;
        this.f39202g0 = -1;
        this.f39203h0 = -1;
        this.f39204i0 = -1;
        this.f39205j0 = -1;
        this.f39201f0 = 0;
        ArrayList arrayList = this.f39207l0;
        arrayList.clear();
        this.Q = 0;
        this.S = 1;
        int i11 = 3;
        this.f39206k0 = 3;
        this.R = 2;
        int i12 = this.m0;
        if (i12 == 0 && (this.h >= 0 || this.f39212r != null || this.f39213s != null)) {
            this.V = 3;
            this.f39206k0 = 5;
            this.W = 4;
        }
        if (i12 == 1) {
            l5Var = cq0Var.f32812c;
        } else {
            l5Var = l5Var2;
        }
        if ((i12 == 0 || i12 == 1) && l5Var != null) {
            ArrayList arrayList2 = l5Var.f47690l;
            int i13 = this.f39206k0;
            this.f39206k0 = i13 + 1;
            this.f39203h0 = i13;
            if (this.K == null) {
                for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                    TL_stars.StarGift starGift = ((TL_stars.SavedStarGift) arrayList2.get(i14)).gift;
                    if (starGift instanceof TL_stars.TL_starGiftUnique) {
                        arrayList.add((TL_stars.TL_starGiftUnique) starGift);
                    }
                }
                int i15 = this.f39206k0;
                this.f39195b0 = i15;
                this.f39206k0 = arrayList.size() + i15;
                int size = arrayList.size() + this.f39201f0;
                this.f39201f0 = size;
                int i16 = this.f39206k0;
                this.f39197c0 = i16;
                if (!l5Var2.f47687i && l5Var2.f47688j) {
                    if (arrayList.isEmpty()) {
                        int i17 = this.f39206k0;
                        this.f39205j0 = i17;
                        this.f39206k0 = i17 + 2;
                        this.f39204i0 = i17 + 1;
                    }
                } else {
                    this.f39198d0 = i16;
                    int i18 = 3 - (size % 3);
                    if (size <= 0) {
                        i11 = 9;
                    } else if (i18 > 0) {
                        i11 = i18;
                    }
                    int i19 = i16 + i11;
                    this.f39206k0 = i19;
                    this.f39201f0 = size + i11;
                    this.f39199e0 = i19;
                }
                if (c()) {
                    l5Var.a();
                }
            } else if (this.J != null) {
                i10 = ((org.telegram.ui.ActionBar.n2) cq0Var).currentAccount;
                long clientUserId = UserConfig.getInstance(i10).getClientUserId();
                for (int i20 = 0; i20 < this.J.d.size(); i20++) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.J.d.get(i20);
                    if (DialogObject.getPeerDialogId(tL_starGiftUnique.owner_id) != clientUserId && DialogObject.getPeerDialogId(tL_starGiftUnique.host_id) != clientUserId) {
                        arrayList.add(tL_starGiftUnique);
                    }
                }
                int i21 = this.f39206k0;
                this.f39195b0 = i21;
                this.f39206k0 = arrayList.size() + i21;
                int size2 = arrayList.size() + this.f39201f0;
                this.f39201f0 = size2;
                int i22 = this.f39206k0;
                this.f39197c0 = i22;
                xh.v3 v3Var = this.J;
                if (v3Var.f46486t || !v3Var.f46487u) {
                    this.f39198d0 = i22;
                    int i23 = 3 - (size2 % 3);
                    if (size2 <= 0) {
                        i11 = 9;
                    } else if (i23 > 0) {
                        i11 = i23;
                    }
                    int i24 = i22 + i11;
                    this.f39206k0 = i24;
                    this.f39201f0 = size2 + i11;
                    this.f39199e0 = i24;
                }
                if (c()) {
                    this.J.g(false);
                }
            }
            int i25 = this.f39206k0;
            this.f39206k0 = i25 + 1;
            this.f39202g0 = i25;
        }
        int i26 = this.f39206k0;
        this.f39206k0 = i26 + 1;
        this.U = i26;
        bq0 bq0Var = this.E;
        if (bq0Var != null) {
            bq0Var.post(new mp0(this, 1));
        }
    }

    public final void l(bq0 bq0Var) {
        int i10;
        int i11 = org.telegram.ui.ActionBar.j6.f19094d6;
        cq0 cq0Var = this.f39211p0;
        int themedColor = cq0Var.getThemedColor(i11);
        cq0Var.getThemedColor(org.telegram.ui.ActionBar.j6.f19038a7);
        int themedColor2 = cq0Var.getThemedColor(org.telegram.ui.ActionBar.j6.f19496z6);
        int themedColor3 = cq0Var.getThemedColor(org.telegram.ui.ActionBar.j6.G6);
        bq0Var.v.setColor(themedColor);
        bq0Var.f32526x = org.telegram.ui.ActionBar.j6.l1(0.06f, themedColor3);
        bq0Var.f32527y = themedColor2;
        bq0Var.E = themedColor3;
        q60 q60Var = bq0Var.f32518a;
        for (int i12 = 0; i12 < q60Var.getChildCount(); i12++) {
            View childAt = q60Var.getChildAt(i12);
            int S = RecyclerView.S(childAt);
            if (S != -1 && (childAt instanceof TextView)) {
                TextView textView = (TextView) childAt;
                if (S == bq0Var.d) {
                    i10 = bq0Var.E;
                } else {
                    i10 = bq0Var.f32527y;
                }
                textView.setTextColor(i10);
                childAt.invalidate();
            }
        }
        q60Var.invalidate();
        bq0Var.invalidate();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12 = this.m0;
        View view = this.f39214w;
        np0 np0Var = this.f39194b;
        if (i12 == 1) {
            super.onMeasure(i10, i11);
            rp0 rp0Var = this.v;
            this.f39209n0 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + rp0Var.getMeasuredHeight() + AndroidUtilities.statusBarHeight;
            ((ViewGroup.MarginLayoutParams) rp0Var.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
            ((ViewGroup.MarginLayoutParams) np0Var.getLayoutParams()).topMargin = this.f39209n0 - AndroidUtilities.dp(16.0f);
            ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).topMargin = this.f39209n0 - AndroidUtilities.dp(64.0f);
            ((ViewGroup.MarginLayoutParams) this.f39215x.getLayoutParams()).topMargin = this.f39209n0 - AndroidUtilities.dp(16.0f);
            np0Var.setPadding(np0Var.getPaddingLeft(), AndroidUtilities.dp(16.0f), np0Var.getPaddingRight(), np0Var.getPaddingBottom());
        } else {
            this.f39209n0 = AndroidUtilities.dp(230.0f) + AndroidUtilities.statusBarHeight;
            ((ViewGroup.MarginLayoutParams) np0Var.getLayoutParams()).topMargin = this.f39209n0;
            ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).topMargin = this.f39209n0 - AndroidUtilities.dp(64.0f);
            ((ViewGroup.MarginLayoutParams) this.f39192a.getLayoutParams()).height = this.f39209n0;
        }
        super.onMeasure(i10, i11);
    }
}
