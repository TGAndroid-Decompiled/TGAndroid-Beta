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
public final class qp0 extends FrameLayout {
    public static final int f39761q0 = 0;
    public final vp0 E;
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
    public final up0 f39762a;
    public int f39763a0;
    public final hp0 f39764b;
    public int f39765b0;
    public final s4.s f39766c;
    public int f39767c0;
    public final jp0 d;
    public int f39768d0;
    public final n7.z0 f39769e;
    public int f39770e0;
    public tp0 f39771f;
    public int f39772f0;
    public int f39773g0;
    public int h;
    public int f39774h0;
    public int f39775i0;
    public int f39776j0;
    public int f39777k0;
    public final ArrayList f39778l0;
    public final int m0;
    public long f39779n;
    public int f39780n0;
    public np0 f39781o0;
    public final wp0 f39782p0;
    public TLRPC.TL_emojiStatusCollectible f39783r;
    public TLRPC.TL_peerColorCollectible f39784s;
    public final lp0 v;
    public final View f39785w;
    public final View f39786x;
    public pp0 f39787y;

    public qp0(wp0 wp0Var, Context context, int i10) {
        super(context);
        int i11;
        this.f39782p0 = wp0Var;
        this.f39769e = new n7.z0(7);
        this.h = -1;
        this.f39779n = 0L;
        this.f39783r = null;
        this.f39784s = null;
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
        this.f39763a0 = -1;
        this.f39765b0 = -1;
        this.f39767c0 = -1;
        this.f39768d0 = -1;
        this.f39770e0 = -1;
        this.f39772f0 = 0;
        this.f39773g0 = -1;
        this.f39774h0 = -1;
        this.f39775i0 = -1;
        this.f39776j0 = -1;
        this.f39778l0 = new ArrayList();
        this.m0 = i10;
        d();
        Context context2 = getContext();
        org.telegram.ui.ActionBar.d6 resourceProvider = wp0Var.getResourceProvider();
        ah.c cVar = wp0Var.G;
        hp0 hp0Var = new hp0(this, context2, resourceProvider, i10);
        this.f39764b = hp0Var;
        hp0Var.setClipToPadding(false);
        hp0Var.setSections(true);
        ((s4.j) hp0Var.getItemAnimator()).f46562m = false;
        getContext();
        s4.s sVar = new s4.s(3);
        this.f39766c = sVar;
        sVar.O = new ci.x1(this, 6);
        hp0Var.i(new ci.r1(this, 7));
        hp0Var.setLayoutManager(sVar);
        jp0 jp0Var = new jp0(this, context, i10);
        this.d = jp0Var;
        hp0Var.setAdapter(jp0Var);
        hp0Var.setOnItemClickListener(new org.telegram.ui.Components.hn0(this, i10, 1));
        hp0Var.j(new kp0(this, i10));
        addView(hp0Var, w7.z5.c(-1.0f, -1));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("l");
        spannableStringBuilder.setSpan(new org.telegram.ui.Components.rq(R.drawable.msg_mini_lock2, 0), 0, 1, 33);
        if (wp0Var.f42571a) {
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
        jVar.o(org.telegram.ui.Components.tr.h);
        jVar.C = false;
        jVar.f46562m = false;
        hp0Var.setItemAnimator(jVar);
        View view = new View(getContext());
        this.f39785w = view;
        ah.e eVar = new ah.e(cVar.c(view, null, false));
        eVar.b(-AndroidUtilities.dp(24.0f), true);
        eVar.f478q = 220;
        view.setBackground(eVar);
        addView(view, w7.z5.e(-1, 72, 55));
        if (i10 == 0) {
            this.f39762a = new up0(wp0.f0(wp0Var), 0L, getContext(), wp0.g0(wp0Var));
            j(false);
        } else {
            View view2 = new View(getContext());
            this.f39786x = view2;
            ah.e eVar2 = new ah.e(cVar.c(view2, null, false));
            eVar2.b(-AndroidUtilities.dp(16.0f), false);
            view2.setBackground(eVar2);
            addView(view2, w7.z5.e(-1, 16, 55));
            ?? iaVar = new org.telegram.ui.Cells.ia(getContext(), wp0.h0(wp0Var), 3, 0L, wp0.i0(wp0Var));
            this.v = iaVar;
            iaVar.setImportantForAccessibility(4);
            iaVar.f22284r = wp0Var;
            iaVar.setClipToOutline(true);
            ai.k2 k2Var = yf.f0.f50979a;
            iaVar.setOutlineProvider(new yf.d0(0, AndroidUtilities.dp(16.0f)));
            addView((View) iaVar, w7.z5.d(-1, -2.0f, 55, 12.0f, 0.0f, 12.0f, 0.0f));
        }
        vp0 vp0Var = new vp0(getContext(), wp0.j0(wp0Var));
        this.E = vp0Var;
        ch.d c10 = wp0Var.E.c(vp0Var, null, false);
        dh.e eVar3 = new dh.e(wp0.k0(wp0Var));
        eVar3.f8353e = new d2.c(9);
        eVar3.f(0, 0);
        eVar3.e(0, 0);
        eVar3.d(0, 0);
        c10.x(eVar3);
        c10.z(AndroidUtilities.dp(18.0f));
        c10.f4632l.f4616e = true;
        vp0Var.H = c10;
        vp0Var.G = c10;
        vp0Var.F = new gp0(this, 0);
        vp0Var.setVisibility(4);
        addView(vp0Var, w7.z5.d(-1, 36.0f, 55, 12.0f, 0.0f, 12.0f, 0.0f));
        up0 up0Var = this.f39762a;
        if (up0Var != null) {
            addView(up0Var, w7.z5.e(-1, -2, 55));
        }
        g();
        k();
        setWillNotDraw(false);
    }

    public static void a(qp0 qp0Var) {
        int i10;
        hp0 hp0Var = qp0Var.f39764b;
        boolean z10 = qp0Var.H;
        if (z10) {
            hp0Var.C0();
        }
        qp0Var.e();
        if (z10 && (i10 = qp0Var.f39774h0) >= 0) {
            qp0Var.f39766c.h1(i10, qp0Var.f39782p0.f42579f);
            hp0Var.post(new gp0(qp0Var, 1));
        }
    }

    public final boolean b() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qp0.b():boolean");
    }

    public final boolean c() {
        hp0 hp0Var = this.f39764b;
        if (hp0Var != null) {
            for (int i10 = 0; i10 < hp0Var.getChildCount(); i10++) {
                if (hp0Var.getChildAt(i10) instanceof org.telegram.ui.Components.w00) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void d() {
        TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible;
        int i10 = this.m0;
        wp0 wp0Var = this.f39782p0;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible = null;
        if (i10 == 0) {
            TLRPC.User currentUser = wp0Var.getUserConfig().getCurrentUser();
            this.h = UserObject.getProfileColorId(currentUser);
            this.f39779n = UserObject.getProfileEmojiId(currentUser);
            if (currentUser != null) {
                TLRPC.EmojiStatus emojiStatus = currentUser.emoji_status;
                if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                    tL_emojiStatusCollectible = (TLRPC.TL_emojiStatusCollectible) emojiStatus;
                    this.f39783r = tL_emojiStatusCollectible;
                    this.f39784s = null;
                }
            }
            tL_emojiStatusCollectible = null;
            this.f39783r = tL_emojiStatusCollectible;
            this.f39784s = null;
        } else {
            TLRPC.User currentUser2 = wp0Var.getUserConfig().getCurrentUser();
            this.h = UserObject.getColorId(currentUser2);
            this.f39779n = UserObject.getEmojiId(currentUser2);
            this.f39783r = null;
            if (currentUser2 != null) {
                TLRPC.PeerColor peerColor = currentUser2.color;
                if (peerColor instanceof TLRPC.TL_peerColorCollectible) {
                    tL_peerColorCollectible = (TLRPC.TL_peerColorCollectible) peerColor;
                }
            }
            this.f39784s = tL_peerColorCollectible;
        }
        if (this.f39783r == null && this.f39784s == null) {
            return;
        }
        this.h = -1;
        this.f39779n = 0L;
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
        wp0 wp0Var = this.f39782p0;
        n7.z0 z0Var = this.f39769e;
        if (tL_starGiftUnique != null) {
            zf.a resellAmount = tL_starGiftUnique.getResellAmount(zf.b.f53296a);
            if (tL_starGiftUnique.resale_ton_only) {
                z0Var.f16846b = yh.x7.Y0(LocaleController.formatString(R.string.ResellGiftBuyTON, tL_starGiftUnique.getResellAmount(zf.b.f53297b).d()), true);
                z0Var.f16847c = yh.x7.W0(LocaleController.formatPluralStringComma("ResellGiftBuyEq", (int) resellAmount.a()));
            } else {
                z0Var.f16846b = yh.x7.W0(LocaleController.formatPluralStringComma("ResellGiftBuy", (int) resellAmount.a()));
                z0Var.f16847c = null;
            }
        } else {
            if (!wp0Var.getUserConfig().isPremium() && !wp0Var.f42571a) {
                obj = this.N;
            } else if (this.f39783r != null) {
                obj = this.P;
            } else {
                obj = this.O;
            }
            z0Var.f16846b = obj;
            z0Var.f16847c = null;
        }
        if (wp0Var.C0() == this) {
            wp0Var.R = this;
            wp0Var.Q.g((CharSequence) z0Var.f16846b, z10, true);
            wp0Var.Q.f((SpannableStringBuilder) z0Var.f16847c, z10);
        }
    }

    public final void g() {
        ci.d dVar = this.f39782p0.Q;
        if (dVar != null) {
            dVar.j();
        }
        lp0 lp0Var = this.v;
        if (lp0Var != null) {
            lp0Var.invalidate();
        }
        j(true);
        AndroidUtilities.forEachViews((RecyclerView) this.f39764b, (Utilities.Callback<View>) new t3(this, 14));
        vp0 vp0Var = this.E;
        if (vp0Var != null) {
            l(vp0Var);
        }
    }

    public final void h() {
        int i10;
        boolean z10;
        int i11 = this.f39782p0.f42579f;
        float f7 = 0.0f;
        View view = this.f39785w;
        vp0 vp0Var = this.E;
        if (vp0Var != null && (i10 = this.f39774h0) >= 0) {
            s4.s sVar = this.f39766c;
            this.F = sVar.m(i10);
            hp0 hp0Var = this.f39764b;
            int paddingTop = hp0Var.getPaddingTop() + i11;
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
                vp0Var.setVisibility(0);
                vp0Var.setTranslationY((Math.max(this.F.getTop(), paddingTop) + hp0Var.getTop()) - vp0Var.getTop());
            } else if (L0 != -1 && L0 > this.f39774h0) {
                this.H = true;
                this.G = false;
                vp0Var.setVisibility(0);
                vp0Var.setTranslationY((hp0Var.getTop() + paddingTop) - vp0Var.getTop());
            } else {
                this.H = false;
                this.G = false;
                vp0Var.setVisibility(0);
                vp0Var.setTranslationY((AndroidUtilities.dp(1.0f) + getHeight()) - vp0Var.getTop());
            }
            boolean z11 = this.G;
            if (vp0Var.I != z11) {
                vp0Var.I = z11;
                vp0Var.invalidate();
            }
            if (this.H) {
                f7 = AndroidUtilities.dp(36.0f) + i11;
            }
            view.setTranslationY(f7);
            hp0Var.invalidate();
            invalidate();
            return;
        }
        this.G = false;
        this.H = false;
        if (view != null) {
            view.setTranslationY(0.0f);
        }
        if (vp0Var != null) {
            vp0Var.setVisibility(4);
            boolean z12 = this.G;
            if (vp0Var.I != z12) {
                vp0Var.I = z12;
                vp0Var.invalidate();
            }
        }
    }

    public final void i() {
        MessageObject messageObject;
        lp0 lp0Var = this.v;
        if (lp0Var != null) {
            org.telegram.ui.Cells.u1[] cells = lp0Var.getCells();
            for (int i10 = 0; i10 < cells.length; i10++) {
                org.telegram.ui.Cells.u1 u1Var = cells[i10];
                if (u1Var != null && (messageObject = u1Var.getMessageObject()) != null) {
                    messageObject.notime = true;
                    tp0 tp0Var = this.f39771f;
                    if (tp0Var != null) {
                        messageObject.overrideLinkColor = tp0Var.getColorId();
                    }
                    messageObject.overrideLinkEmoji = this.f39779n;
                    messageObject.overrideLinkPeerColor = this.f39784s;
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
        wp0 wp0Var;
        yo0 yo0Var;
        tp0 tp0Var = this.f39771f;
        if (tp0Var != null) {
            tp0Var.a(this.h, z10);
        }
        up0 up0Var = this.f39762a;
        if (up0Var != null) {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = this.f39783r;
            if (tL_emojiStatusCollectible != null) {
                up0Var.e(tL_emojiStatusCollectible.document_id, true, z10);
                up0Var.c(MessagesController.PeerColor.fromCollectible(this.f39783r), z10);
                up0Var.d(this.f39783r.pattern_document_id, true, z10);
            } else {
                if (DialogObject.isEmojiStatusCollectible(0L)) {
                    up0Var.e(0L, false, z10);
                } else {
                    up0Var.e(DialogObject.getEmojiStatusDocumentId(0L), DialogObject.isEmojiStatusCollectible(0L), z10);
                }
                up0Var.b(this.h, z10);
                up0Var.d(this.f39779n, false, z10);
            }
        }
        int i11 = this.m0;
        if (i11 == 0 && (yo0Var = (wp0Var = this.f39782p0).f42578e) != null) {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2 = this.f39783r;
            if (tL_emojiStatusCollectible2 != null) {
                yo0Var.c(MessagesController.PeerColor.fromCollectible(tL_emojiStatusCollectible2), z10);
            } else {
                yo0Var.b(wp0.v0(wp0Var), this.h, z10);
            }
        }
        if (i11 == 0) {
            int i12 = this.V;
            k();
            jp0 jp0Var = this.d;
            if (i12 >= 0 && this.V < 0) {
                jp0Var.t(i12, 2);
            } else if (i12 < 0 && (i10 = this.V) >= 0) {
                jp0Var.s(i10, 2);
            }
        }
        int i13 = 0;
        while (true) {
            hp0 hp0Var = this.f39764b;
            if (i13 < hp0Var.getChildCount()) {
                View childAt = hp0Var.getChildAt(i13);
                if (childAt instanceof ep0) {
                    ep0 ep0Var = (ep0) childAt;
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible3 = this.f39783r;
                    if ((tL_emojiStatusCollectible3 != null && tL_emojiStatusCollectible3.collectible_id == ep0Var.getGiftId()) || ((tL_peerColorCollectible2 = this.f39784s) != null && tL_peerColorCollectible2.collectible_id == ep0Var.getGiftId())) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    ep0Var.b(z12, true);
                } else if (childAt instanceof xh.i1) {
                    xh.i1 i1Var = (xh.i1) childAt;
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible4 = this.f39783r;
                    if ((tL_emojiStatusCollectible4 != null && tL_emojiStatusCollectible4.collectible_id == i1Var.getGiftId()) || ((tL_peerColorCollectible = this.f39784s) != null && tL_peerColorCollectible.collectible_id == i1Var.getGiftId())) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    i1Var.e(z11, true);
                }
                i13++;
            } else {
                return;
            }
        }
    }

    public final void k() {
        yh.k5 k5Var;
        wp0 wp0Var = this.f39782p0;
        yh.k5 k5Var2 = wp0Var.f42573b;
        this.V = -1;
        this.W = -1;
        this.f39763a0 = -1;
        this.f39765b0 = -1;
        this.f39768d0 = -1;
        this.f39770e0 = -1;
        this.f39767c0 = -1;
        this.f39773g0 = -1;
        this.f39774h0 = -1;
        this.f39775i0 = -1;
        this.f39776j0 = -1;
        this.f39772f0 = 0;
        ArrayList arrayList = this.f39778l0;
        arrayList.clear();
        this.Q = 0;
        this.S = 1;
        int i10 = 3;
        this.f39777k0 = 3;
        this.R = 2;
        int i11 = this.m0;
        if (i11 == 0 && (this.h >= 0 || this.f39783r != null || this.f39784s != null)) {
            this.V = 3;
            this.f39777k0 = 5;
            this.W = 4;
        }
        if (i11 == 1) {
            k5Var = wp0Var.f42575c;
        } else {
            k5Var = k5Var2;
        }
        if ((i11 == 0 || i11 == 1) && k5Var != null) {
            ArrayList arrayList2 = k5Var.f51527l;
            int i12 = this.f39777k0;
            this.f39777k0 = i12 + 1;
            this.f39774h0 = i12;
            if (this.K == null) {
                for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                    TL_stars.StarGift starGift = ((TL_stars.SavedStarGift) arrayList2.get(i13)).gift;
                    if (starGift instanceof TL_stars.TL_starGiftUnique) {
                        arrayList.add((TL_stars.TL_starGiftUnique) starGift);
                    }
                }
                int i14 = this.f39777k0;
                this.f39765b0 = i14;
                this.f39777k0 = arrayList.size() + i14;
                int size = arrayList.size() + this.f39772f0;
                this.f39772f0 = size;
                int i15 = this.f39777k0;
                this.f39767c0 = i15;
                if (!k5Var2.f51524i && k5Var2.f51525j) {
                    if (arrayList.isEmpty()) {
                        int i16 = this.f39777k0;
                        this.f39776j0 = i16;
                        this.f39777k0 = i16 + 2;
                        this.f39775i0 = i16 + 1;
                    }
                } else {
                    this.f39768d0 = i15;
                    int i17 = 3 - (size % 3);
                    if (size <= 0) {
                        i10 = 9;
                    } else if (i17 > 0) {
                        i10 = i17;
                    }
                    int i18 = i15 + i10;
                    this.f39777k0 = i18;
                    this.f39772f0 = size + i10;
                    this.f39770e0 = i18;
                }
                if (c()) {
                    k5Var.a();
                }
            } else if (this.J != null) {
                long clientUserId = UserConfig.getInstance(wp0.u0(wp0Var)).getClientUserId();
                for (int i19 = 0; i19 < this.J.d.size(); i19++) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.J.d.get(i19);
                    if (DialogObject.getPeerDialogId(tL_starGiftUnique.owner_id) != clientUserId && DialogObject.getPeerDialogId(tL_starGiftUnique.host_id) != clientUserId) {
                        arrayList.add(tL_starGiftUnique);
                    }
                }
                int i20 = this.f39777k0;
                this.f39765b0 = i20;
                this.f39777k0 = arrayList.size() + i20;
                int size2 = arrayList.size() + this.f39772f0;
                this.f39772f0 = size2;
                int i21 = this.f39777k0;
                this.f39767c0 = i21;
                xh.v3 v3Var = this.J;
                if (v3Var.f50289t || !v3Var.f50290u) {
                    this.f39768d0 = i21;
                    int i22 = 3 - (size2 % 3);
                    if (size2 <= 0) {
                        i10 = 9;
                    } else if (i22 > 0) {
                        i10 = i22;
                    }
                    int i23 = i21 + i10;
                    this.f39777k0 = i23;
                    this.f39772f0 = size2 + i10;
                    this.f39770e0 = i23;
                }
                if (c()) {
                    this.J.g(false);
                }
            }
            int i24 = this.f39777k0;
            this.f39777k0 = i24 + 1;
            this.f39773g0 = i24;
        }
        int i25 = this.f39777k0;
        this.f39777k0 = i25 + 1;
        this.U = i25;
        vp0 vp0Var = this.E;
        if (vp0Var != null) {
            vp0Var.post(new gp0(this, 1));
        }
    }

    public final void l(vp0 vp0Var) {
        int i10;
        int i11 = org.telegram.ui.ActionBar.i6.f20817d6;
        wp0 wp0Var = this.f39782p0;
        int themedColor = wp0Var.getThemedColor(i11);
        wp0Var.getThemedColor(org.telegram.ui.ActionBar.i6.f20761a7);
        int themedColor2 = wp0Var.getThemedColor(org.telegram.ui.ActionBar.i6.f21223z6);
        int themedColor3 = wp0Var.getThemedColor(org.telegram.ui.ActionBar.i6.G6);
        vp0Var.v.setColor(themedColor);
        vp0Var.f41798x = org.telegram.ui.ActionBar.i6.l1(0.06f, themedColor3);
        vp0Var.f41799y = themedColor2;
        vp0Var.E = themedColor3;
        p60 p60Var = vp0Var.f41789a;
        for (int i12 = 0; i12 < p60Var.getChildCount(); i12++) {
            View childAt = p60Var.getChildAt(i12);
            int R = RecyclerView.R(childAt);
            if (R != -1 && (childAt instanceof TextView)) {
                TextView textView = (TextView) childAt;
                if (R == vp0Var.d) {
                    i10 = vp0Var.E;
                } else {
                    i10 = vp0Var.f41799y;
                }
                textView.setTextColor(i10);
                childAt.invalidate();
            }
        }
        p60Var.invalidate();
        vp0Var.invalidate();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12 = this.m0;
        View view = this.f39785w;
        hp0 hp0Var = this.f39764b;
        if (i12 == 1) {
            super.onMeasure(i10, i11);
            lp0 lp0Var = this.v;
            this.f39780n0 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + lp0Var.getMeasuredHeight() + AndroidUtilities.statusBarHeight;
            ((ViewGroup.MarginLayoutParams) lp0Var.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
            ((ViewGroup.MarginLayoutParams) hp0Var.getLayoutParams()).topMargin = this.f39780n0 - AndroidUtilities.dp(16.0f);
            ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).topMargin = this.f39780n0 - AndroidUtilities.dp(64.0f);
            ((ViewGroup.MarginLayoutParams) this.f39786x.getLayoutParams()).topMargin = this.f39780n0 - AndroidUtilities.dp(16.0f);
            hp0Var.setPadding(hp0Var.getPaddingLeft(), AndroidUtilities.dp(16.0f), hp0Var.getPaddingRight(), hp0Var.getPaddingBottom());
        } else {
            this.f39780n0 = AndroidUtilities.dp(230.0f) + AndroidUtilities.statusBarHeight;
            ((ViewGroup.MarginLayoutParams) hp0Var.getLayoutParams()).topMargin = this.f39780n0;
            ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).topMargin = this.f39780n0 - AndroidUtilities.dp(64.0f);
            ((ViewGroup.MarginLayoutParams) this.f39762a.getLayoutParams()).height = this.f39780n0;
        }
        super.onMeasure(i10, i11);
    }
}
