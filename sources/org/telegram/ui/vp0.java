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
public final class vp0 extends FrameLayout {
    public static final int f41626q0 = 0;
    public final aq0 E;
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
    public final zp0 f41627a;
    public int f41628a0;
    public final mp0 f41629b;
    public int f41630b0;
    public final s4.s f41631c;
    public int f41632c0;
    public final op0 d;
    public int f41633d0;
    public final n7.z0 f41634e;
    public int f41635e0;
    public yp0 f41636f;
    public int f41637f0;
    public int f41638g0;
    public int h;
    public int f41639h0;
    public int f41640i0;
    public int f41641j0;
    public int f41642k0;
    public final ArrayList f41643l0;
    public final int m0;
    public long f41644n;
    public int f41645n0;
    public sp0 f41646o0;
    public final bq0 f41647p0;
    public TLRPC.TL_emojiStatusCollectible f41648r;
    public TLRPC.TL_peerColorCollectible f41649s;
    public final qp0 v;
    public final View f41650w;
    public final View f41651x;
    public up0 f41652y;

    public vp0(bq0 bq0Var, Context context, int i10) {
        super(context);
        int i11;
        org.telegram.ui.ActionBar.d5 d5Var;
        org.telegram.ui.ActionBar.f6 f6Var;
        org.telegram.ui.ActionBar.f6 f6Var2;
        org.telegram.ui.ActionBar.f6 f6Var3;
        int i12;
        org.telegram.ui.ActionBar.f6 f6Var4;
        this.f41647p0 = bq0Var;
        this.f41634e = new n7.z0(7, false);
        this.h = -1;
        this.f41644n = 0L;
        this.f41648r = null;
        this.f41649s = null;
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
        this.f41628a0 = -1;
        this.f41630b0 = -1;
        this.f41632c0 = -1;
        this.f41633d0 = -1;
        this.f41635e0 = -1;
        this.f41637f0 = 0;
        this.f41638g0 = -1;
        this.f41639h0 = -1;
        this.f41640i0 = -1;
        this.f41641j0 = -1;
        this.f41643l0 = new ArrayList();
        this.m0 = i10;
        d();
        Context context2 = getContext();
        org.telegram.ui.ActionBar.f6 resourceProvider = bq0Var.getResourceProvider();
        bh.b bVar = bq0Var.G;
        mp0 mp0Var = new mp0(this, context2, resourceProvider, i10);
        this.f41629b = mp0Var;
        mp0Var.setClipToPadding(false);
        mp0Var.setSections(true);
        ((s4.j) mp0Var.getItemAnimator()).f45806m = false;
        getContext();
        s4.s sVar = new s4.s(3);
        this.f41631c = sVar;
        sVar.O = new di.x1(this, 6);
        mp0Var.i(new di.r1(this, 7));
        mp0Var.setLayoutManager(sVar);
        op0 op0Var = new op0(this, context, i10);
        this.d = op0Var;
        mp0Var.setAdapter(op0Var);
        mp0Var.setOnItemClickListener(new org.telegram.ui.Components.pm0(this, i10, 1));
        mp0Var.j(new pp0(this, i10));
        addView(mp0Var, w7.x5.c(-1.0f, -1));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("l");
        spannableStringBuilder.setSpan(new org.telegram.ui.Components.nq(R.drawable.msg_mini_lock2, 0), 0, 1, 33);
        if (bq0Var.f34885a) {
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
        jVar.o(org.telegram.ui.Components.pr.h);
        jVar.C = false;
        jVar.f45806m = false;
        mp0Var.setItemAnimator(jVar);
        View view = new View(getContext());
        this.f41650w = view;
        bh.c cVar = new bh.c(bVar.c(view, null, false));
        cVar.b(-AndroidUtilities.dp(24.0f), true);
        cVar.f2696q = 220;
        view.setBackground(cVar);
        addView(view, w7.x5.e(-1, 72, 55));
        if (i10 == 0) {
            Context context3 = getContext();
            i12 = ((org.telegram.ui.ActionBar.n2) bq0Var).currentAccount;
            f6Var4 = ((org.telegram.ui.ActionBar.n2) bq0Var).resourceProvider;
            this.f41627a = new zp0(i12, 0L, context3, f6Var4);
            j(false);
        } else {
            View view2 = new View(getContext());
            this.f41651x = view2;
            bh.c cVar2 = new bh.c(bVar.c(view2, null, false));
            cVar2.b(-AndroidUtilities.dp(16.0f), false);
            view2.setBackground(cVar2);
            addView(view2, w7.x5.e(-1, 16, 55));
            Context context4 = getContext();
            d5Var = ((org.telegram.ui.ActionBar.n2) bq0Var).parentLayout;
            f6Var = ((org.telegram.ui.ActionBar.n2) bq0Var).resourceProvider;
            ?? iaVar = new org.telegram.ui.Cells.ia(context4, d5Var, 3, 0L, f6Var);
            this.v = iaVar;
            iaVar.setImportantForAccessibility(4);
            iaVar.f22162r = bq0Var;
            iaVar.setClipToOutline(true);
            bi.z1 z1Var = yf.j0.f50142a;
            iaVar.setOutlineProvider(new yf.i0(0, AndroidUtilities.dp(16.0f)));
            addView((View) iaVar, w7.x5.d(-1, -2.0f, 55, 12.0f, 0.0f, 12.0f, 0.0f));
        }
        Context context5 = getContext();
        f6Var2 = ((org.telegram.ui.ActionBar.n2) bq0Var).resourceProvider;
        aq0 aq0Var = new aq0(bq0Var, context5, f6Var2);
        this.E = aq0Var;
        dh.d c10 = bq0Var.E.c(aq0Var, null, false);
        f6Var3 = ((org.telegram.ui.ActionBar.n2) bq0Var).resourceProvider;
        eh.e eVar = new eh.e(f6Var3);
        eVar.f9141e = new di.w9(9);
        eVar.d(0, 0);
        eVar.c(0, 0);
        eVar.b(0, 0);
        c10.n(eVar);
        c10.p(AndroidUtilities.dp(18.0f));
        c10.h.f6849e = true;
        aq0Var.H = c10;
        aq0Var.G = c10;
        aq0Var.F = new lp0(this, 0);
        aq0Var.setVisibility(4);
        addView(aq0Var, w7.x5.d(-1, 36.0f, 55, 12.0f, 0.0f, 12.0f, 0.0f));
        zp0 zp0Var = this.f41627a;
        if (zp0Var != null) {
            addView(zp0Var, w7.x5.e(-1, -2, 55));
        }
        g();
        k();
        setWillNotDraw(false);
    }

    public static void a(vp0 vp0Var) {
        int i10;
        mp0 mp0Var = vp0Var.f41629b;
        boolean z10 = vp0Var.H;
        if (z10) {
            mp0Var.B0();
        }
        vp0Var.e();
        if (z10 && (i10 = vp0Var.f41639h0) >= 0) {
            vp0Var.f41631c.h1(i10, vp0Var.f41647p0.f34894f);
            mp0Var.post(new lp0(vp0Var, 1));
        }
    }

    public final boolean b() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.vp0.b():boolean");
    }

    public final boolean c() {
        mp0 mp0Var = this.f41629b;
        if (mp0Var != null) {
            for (int i10 = 0; i10 < mp0Var.getChildCount(); i10++) {
                if (mp0Var.getChildAt(i10) instanceof org.telegram.ui.Components.t00) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void d() {
        TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible;
        int i10 = this.m0;
        bq0 bq0Var = this.f41647p0;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible = null;
        if (i10 == 0) {
            TLRPC.User currentUser = bq0Var.getUserConfig().getCurrentUser();
            this.h = UserObject.getProfileColorId(currentUser);
            this.f41644n = UserObject.getProfileEmojiId(currentUser);
            if (currentUser != null) {
                TLRPC.EmojiStatus emojiStatus = currentUser.emoji_status;
                if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                    tL_emojiStatusCollectible = (TLRPC.TL_emojiStatusCollectible) emojiStatus;
                    this.f41648r = tL_emojiStatusCollectible;
                    this.f41649s = null;
                }
            }
            tL_emojiStatusCollectible = null;
            this.f41648r = tL_emojiStatusCollectible;
            this.f41649s = null;
        } else {
            TLRPC.User currentUser2 = bq0Var.getUserConfig().getCurrentUser();
            this.h = UserObject.getColorId(currentUser2);
            this.f41644n = UserObject.getEmojiId(currentUser2);
            this.f41648r = null;
            if (currentUser2 != null) {
                TLRPC.PeerColor peerColor = currentUser2.color;
                if (peerColor instanceof TLRPC.TL_peerColorCollectible) {
                    tL_peerColorCollectible = (TLRPC.TL_peerColorCollectible) peerColor;
                }
            }
            this.f41649s = tL_peerColorCollectible;
        }
        if (this.f41648r == null && this.f41649s == null) {
            return;
        }
        this.h = -1;
        this.f41644n = 0L;
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
        bq0 bq0Var = this.f41647p0;
        n7.z0 z0Var = this.f41634e;
        if (tL_starGiftUnique != null) {
            zf.a resellAmount = tL_starGiftUnique.getResellAmount(zf.b.f51656a);
            if (tL_starGiftUnique.resale_ton_only) {
                z0Var.f16730b = zh.v7.S0(LocaleController.formatString(R.string.ResellGiftBuyTON, tL_starGiftUnique.getResellAmount(zf.b.f51657b).d()), true);
                z0Var.f16731c = zh.v7.Q0(LocaleController.formatPluralStringComma("ResellGiftBuyEq", (int) resellAmount.a()));
            } else {
                z0Var.f16730b = zh.v7.Q0(LocaleController.formatPluralStringComma("ResellGiftBuy", (int) resellAmount.a()));
                z0Var.f16731c = null;
            }
        } else {
            if (!bq0Var.getUserConfig().isPremium() && !bq0Var.f34885a) {
                obj = this.N;
            } else if (this.f41648r != null) {
                obj = this.P;
            } else {
                obj = this.O;
            }
            z0Var.f16730b = obj;
            z0Var.f16731c = null;
        }
        if (bq0Var.C0() == this) {
            bq0Var.R = this;
            bq0Var.Q.g((CharSequence) z0Var.f16730b, z10, true);
            bq0Var.Q.f((SpannableStringBuilder) z0Var.f16731c, z10);
        }
    }

    public final void g() {
        di.d dVar = this.f41647p0.Q;
        if (dVar != null) {
            dVar.j();
        }
        qp0 qp0Var = this.v;
        if (qp0Var != null) {
            qp0Var.invalidate();
        }
        j(true);
        AndroidUtilities.forEachViews((RecyclerView) this.f41629b, (e2.h) new xb(this, 3));
        aq0 aq0Var = this.E;
        if (aq0Var != null) {
            l(aq0Var);
        }
    }

    public final void h() {
        int i10;
        boolean z10;
        int i11 = this.f41647p0.f34894f;
        float f7 = 0.0f;
        View view = this.f41650w;
        aq0 aq0Var = this.E;
        if (aq0Var != null && (i10 = this.f41639h0) >= 0) {
            s4.s sVar = this.f41631c;
            this.F = sVar.m(i10);
            mp0 mp0Var = this.f41629b;
            int paddingTop = mp0Var.getPaddingTop() + i11;
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
                aq0Var.setVisibility(0);
                aq0Var.setTranslationY((Math.max(this.F.getTop(), paddingTop) + mp0Var.getTop()) - aq0Var.getTop());
            } else if (L0 != -1 && L0 > this.f41639h0) {
                this.H = true;
                this.G = false;
                aq0Var.setVisibility(0);
                aq0Var.setTranslationY((mp0Var.getTop() + paddingTop) - aq0Var.getTop());
            } else {
                this.H = false;
                this.G = false;
                aq0Var.setVisibility(0);
                aq0Var.setTranslationY((AndroidUtilities.dp(1.0f) + getHeight()) - aq0Var.getTop());
            }
            boolean z11 = this.G;
            if (aq0Var.I != z11) {
                aq0Var.I = z11;
                aq0Var.L.D0(2);
                aq0Var.invalidate();
            }
            if (this.H) {
                f7 = AndroidUtilities.dp(36.0f) + i11;
            }
            view.setTranslationY(f7);
            mp0Var.invalidate();
            invalidate();
            return;
        }
        this.G = false;
        this.H = false;
        if (view != null) {
            view.setTranslationY(0.0f);
        }
        if (aq0Var != null) {
            aq0Var.setVisibility(4);
            boolean z12 = this.G;
            if (aq0Var.I != z12) {
                aq0Var.I = z12;
                aq0Var.L.D0(2);
                aq0Var.invalidate();
            }
        }
    }

    public final void i() {
        MessageObject messageObject;
        qp0 qp0Var = this.v;
        if (qp0Var != null) {
            org.telegram.ui.Cells.t1[] cells = qp0Var.getCells();
            for (int i10 = 0; i10 < cells.length; i10++) {
                org.telegram.ui.Cells.t1 t1Var = cells[i10];
                if (t1Var != null && (messageObject = t1Var.getMessageObject()) != null) {
                    messageObject.notime = true;
                    yp0 yp0Var = this.f41636f;
                    if (yp0Var != null) {
                        messageObject.overrideLinkColor = yp0Var.getColorId();
                    }
                    messageObject.overrideLinkEmoji = this.f41644n;
                    messageObject.overrideLinkPeerColor = this.f41649s;
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
        bq0 bq0Var;
        ep0 ep0Var;
        int i11;
        yp0 yp0Var = this.f41636f;
        if (yp0Var != null) {
            yp0Var.a(this.h, z10);
        }
        zp0 zp0Var = this.f41627a;
        if (zp0Var != null) {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = this.f41648r;
            if (tL_emojiStatusCollectible != null) {
                zp0Var.e(tL_emojiStatusCollectible.document_id, true, z10);
                zp0Var.c(MessagesController.PeerColor.fromCollectible(this.f41648r), z10);
                zp0Var.d(this.f41648r.pattern_document_id, true, z10);
            } else {
                if (DialogObject.isEmojiStatusCollectible(0L)) {
                    zp0Var.e(0L, false, z10);
                } else {
                    zp0Var.e(DialogObject.getEmojiStatusDocumentId(0L), DialogObject.isEmojiStatusCollectible(0L), z10);
                }
                zp0Var.b(this.h, z10);
                zp0Var.d(this.f41644n, false, z10);
            }
        }
        int i12 = this.m0;
        if (i12 == 0 && (ep0Var = (bq0Var = this.f41647p0).f34892e) != null) {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2 = this.f41648r;
            if (tL_emojiStatusCollectible2 == null) {
                i11 = ((org.telegram.ui.ActionBar.n2) bq0Var).currentAccount;
                ep0Var.b(i11, this.h, z10);
            } else {
                ep0Var.c(MessagesController.PeerColor.fromCollectible(tL_emojiStatusCollectible2), z10);
            }
        }
        if (i12 == 0) {
            int i13 = this.V;
            k();
            op0 op0Var = this.d;
            if (i13 >= 0 && this.V < 0) {
                op0Var.t(i13, 2);
            } else if (i13 < 0 && (i10 = this.V) >= 0) {
                op0Var.s(i10, 2);
            }
        }
        int i14 = 0;
        while (true) {
            mp0 mp0Var = this.f41629b;
            if (i14 < mp0Var.getChildCount()) {
                View childAt = mp0Var.getChildAt(i14);
                if (childAt instanceof jp0) {
                    jp0 jp0Var = (jp0) childAt;
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible3 = this.f41648r;
                    if ((tL_emojiStatusCollectible3 != null && tL_emojiStatusCollectible3.collectible_id == jp0Var.getGiftId()) || ((tL_peerColorCollectible2 = this.f41649s) != null && tL_peerColorCollectible2.collectible_id == jp0Var.getGiftId())) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    jp0Var.b(z12, true);
                } else if (childAt instanceof yh.h1) {
                    yh.h1 h1Var = (yh.h1) childAt;
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible4 = this.f41648r;
                    if ((tL_emojiStatusCollectible4 != null && tL_emojiStatusCollectible4.collectible_id == h1Var.getGiftId()) || ((tL_peerColorCollectible = this.f41649s) != null && tL_peerColorCollectible.collectible_id == h1Var.getGiftId())) {
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
        zh.j5 j5Var;
        int i10;
        bq0 bq0Var = this.f41647p0;
        zh.j5 j5Var2 = bq0Var.f34887b;
        this.V = -1;
        this.W = -1;
        this.f41628a0 = -1;
        this.f41630b0 = -1;
        this.f41633d0 = -1;
        this.f41635e0 = -1;
        this.f41632c0 = -1;
        this.f41638g0 = -1;
        this.f41639h0 = -1;
        this.f41640i0 = -1;
        this.f41641j0 = -1;
        this.f41637f0 = 0;
        ArrayList arrayList = this.f41643l0;
        arrayList.clear();
        this.Q = 0;
        this.S = 1;
        int i11 = 3;
        this.f41642k0 = 3;
        this.R = 2;
        int i12 = this.m0;
        if (i12 == 0 && (this.h >= 0 || this.f41648r != null || this.f41649s != null)) {
            this.V = 3;
            this.f41642k0 = 5;
            this.W = 4;
        }
        if (i12 == 1) {
            j5Var = bq0Var.f34889c;
        } else {
            j5Var = j5Var2;
        }
        if ((i12 == 0 || i12 == 1) && j5Var != null) {
            ArrayList arrayList2 = j5Var.f52133l;
            int i13 = this.f41642k0;
            this.f41642k0 = i13 + 1;
            this.f41639h0 = i13;
            if (this.K == null) {
                for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                    TL_stars.StarGift starGift = ((TL_stars.SavedStarGift) arrayList2.get(i14)).gift;
                    if (starGift instanceof TL_stars.TL_starGiftUnique) {
                        arrayList.add((TL_stars.TL_starGiftUnique) starGift);
                    }
                }
                int i15 = this.f41642k0;
                this.f41630b0 = i15;
                this.f41642k0 = arrayList.size() + i15;
                int size = arrayList.size() + this.f41637f0;
                this.f41637f0 = size;
                int i16 = this.f41642k0;
                this.f41632c0 = i16;
                if (!j5Var2.f52130i && j5Var2.f52131j) {
                    if (arrayList.isEmpty()) {
                        int i17 = this.f41642k0;
                        this.f41641j0 = i17;
                        this.f41642k0 = i17 + 2;
                        this.f41640i0 = i17 + 1;
                    }
                } else {
                    this.f41633d0 = i16;
                    int i18 = 3 - (size % 3);
                    if (size <= 0) {
                        i11 = 9;
                    } else if (i18 > 0) {
                        i11 = i18;
                    }
                    int i19 = i16 + i11;
                    this.f41642k0 = i19;
                    this.f41637f0 = size + i11;
                    this.f41635e0 = i19;
                }
                if (c()) {
                    j5Var.a();
                }
            } else if (this.J != null) {
                i10 = ((org.telegram.ui.ActionBar.n2) bq0Var).currentAccount;
                long clientUserId = UserConfig.getInstance(i10).getClientUserId();
                for (int i20 = 0; i20 < this.J.d.size(); i20++) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.J.d.get(i20);
                    if (DialogObject.getPeerDialogId(tL_starGiftUnique.owner_id) != clientUserId && DialogObject.getPeerDialogId(tL_starGiftUnique.host_id) != clientUserId) {
                        arrayList.add(tL_starGiftUnique);
                    }
                }
                int i21 = this.f41642k0;
                this.f41630b0 = i21;
                this.f41642k0 = arrayList.size() + i21;
                int size2 = arrayList.size() + this.f41637f0;
                this.f41637f0 = size2;
                int i22 = this.f41642k0;
                this.f41632c0 = i22;
                yh.t3 t3Var = this.J;
                if (t3Var.f50603t || !t3Var.f50604u) {
                    this.f41633d0 = i22;
                    int i23 = 3 - (size2 % 3);
                    if (size2 <= 0) {
                        i11 = 9;
                    } else if (i23 > 0) {
                        i11 = i23;
                    }
                    int i24 = i22 + i11;
                    this.f41642k0 = i24;
                    this.f41637f0 = size2 + i11;
                    this.f41635e0 = i24;
                }
                if (c()) {
                    this.J.g(false);
                }
            }
            int i25 = this.f41642k0;
            this.f41642k0 = i25 + 1;
            this.f41638g0 = i25;
        }
        int i26 = this.f41642k0;
        this.f41642k0 = i26 + 1;
        this.U = i26;
        aq0 aq0Var = this.E;
        if (aq0Var != null) {
            aq0Var.post(new lp0(this, 1));
        }
    }

    public final void l(aq0 aq0Var) {
        int i10;
        int i11 = org.telegram.ui.ActionBar.j6.f20691d6;
        bq0 bq0Var = this.f41647p0;
        int themedColor = bq0Var.getThemedColor(i11);
        bq0Var.getThemedColor(org.telegram.ui.ActionBar.j6.f20635a7);
        int themedColor2 = bq0Var.getThemedColor(org.telegram.ui.ActionBar.j6.f21089z6);
        int themedColor3 = bq0Var.getThemedColor(org.telegram.ui.ActionBar.j6.G6);
        aq0Var.v.setColor(themedColor);
        aq0Var.f34563x = org.telegram.ui.ActionBar.j6.l1(0.06f, themedColor3);
        aq0Var.f34564y = themedColor2;
        aq0Var.E = themedColor3;
        r60 r60Var = aq0Var.f34554a;
        for (int i12 = 0; i12 < r60Var.getChildCount(); i12++) {
            View childAt = r60Var.getChildAt(i12);
            int R = RecyclerView.R(childAt);
            if (R != -1 && (childAt instanceof TextView)) {
                TextView textView = (TextView) childAt;
                if (R == aq0Var.d) {
                    i10 = aq0Var.E;
                } else {
                    i10 = aq0Var.f34564y;
                }
                textView.setTextColor(i10);
                childAt.invalidate();
            }
        }
        r60Var.invalidate();
        aq0Var.invalidate();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12 = this.m0;
        View view = this.f41650w;
        mp0 mp0Var = this.f41629b;
        if (i12 == 1) {
            super.onMeasure(i10, i11);
            qp0 qp0Var = this.v;
            this.f41645n0 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + qp0Var.getMeasuredHeight() + AndroidUtilities.statusBarHeight;
            ((ViewGroup.MarginLayoutParams) qp0Var.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
            ((ViewGroup.MarginLayoutParams) mp0Var.getLayoutParams()).topMargin = this.f41645n0 - AndroidUtilities.dp(16.0f);
            ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).topMargin = this.f41645n0 - AndroidUtilities.dp(64.0f);
            ((ViewGroup.MarginLayoutParams) this.f41651x.getLayoutParams()).topMargin = this.f41645n0 - AndroidUtilities.dp(16.0f);
            mp0Var.setPadding(mp0Var.getPaddingLeft(), AndroidUtilities.dp(16.0f), mp0Var.getPaddingRight(), mp0Var.getPaddingBottom());
        } else {
            this.f41645n0 = AndroidUtilities.dp(230.0f) + AndroidUtilities.statusBarHeight;
            ((ViewGroup.MarginLayoutParams) mp0Var.getLayoutParams()).topMargin = this.f41645n0;
            ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).topMargin = this.f41645n0 - AndroidUtilities.dp(64.0f);
            ((ViewGroup.MarginLayoutParams) this.f41627a.getLayoutParams()).height = this.f41645n0;
        }
        super.onMeasure(i10, i11);
    }
}
