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
public final class up0 extends FrameLayout {
    public static final int f42509q0 = 0;
    public final zp0 E;
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
    public final yp0 f42510a;
    public int f42511a0;
    public final lp0 f42512b;
    public int f42513b0;
    public final s4.s f42514c;
    public int f42515c0;
    public final np0 d;
    public int f42516d0;
    public final n6.t f42517e;
    public int f42518e0;
    public xp0 f42519f;
    public int f42520f0;
    public int f42521g0;
    public int h;
    public int f42522h0;
    public int f42523i0;
    public int f42524j0;
    public int f42525k0;
    public final ArrayList f42526l0;
    public final int m0;
    public long f42527n;
    public int f42528n0;
    public rp0 f42529o0;
    public final aq0 f42530p0;
    public TLRPC.TL_emojiStatusCollectible f42531r;
    public TLRPC.TL_peerColorCollectible f42532s;
    public final pp0 v;
    public final View f42533w;
    public final View f42534x;
    public tp0 f42535y;

    public up0(aq0 aq0Var, Context context, int i10) {
        super(context);
        int i11;
        org.telegram.ui.ActionBar.d5 d5Var;
        org.telegram.ui.ActionBar.e6 e6Var;
        org.telegram.ui.ActionBar.e6 e6Var2;
        org.telegram.ui.ActionBar.e6 e6Var3;
        int i12;
        org.telegram.ui.ActionBar.e6 e6Var4;
        this.f42530p0 = aq0Var;
        this.f42517e = new n6.t(7);
        this.h = -1;
        this.f42527n = 0L;
        this.f42531r = null;
        this.f42532s = null;
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
        this.f42511a0 = -1;
        this.f42513b0 = -1;
        this.f42515c0 = -1;
        this.f42516d0 = -1;
        this.f42518e0 = -1;
        this.f42520f0 = 0;
        this.f42521g0 = -1;
        this.f42522h0 = -1;
        this.f42523i0 = -1;
        this.f42524j0 = -1;
        this.f42526l0 = new ArrayList();
        this.m0 = i10;
        d();
        Context context2 = getContext();
        org.telegram.ui.ActionBar.e6 resourceProvider = aq0Var.getResourceProvider();
        ah.c cVar = aq0Var.G;
        lp0 lp0Var = new lp0(this, context2, resourceProvider, i10);
        this.f42512b = lp0Var;
        lp0Var.setClipToPadding(false);
        lp0Var.setSections(true);
        ((s4.j) lp0Var.getItemAnimator()).f47696m = false;
        getContext();
        s4.s sVar = new s4.s(3);
        this.f42514c = sVar;
        sVar.O = new ci.w1(this, 6);
        lp0Var.i(new ci.q1(this, 7));
        lp0Var.setLayoutManager(sVar);
        np0 np0Var = new np0(this, context, i10);
        this.d = np0Var;
        lp0Var.setAdapter(np0Var);
        lp0Var.setOnItemClickListener(new org.telegram.ui.Components.vn0(this, i10, 1));
        lp0Var.j(new op0(this, i10));
        addView(lp0Var, w7.x5.d(-1.0f, -1));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("l");
        spannableStringBuilder.setSpan(new org.telegram.ui.Components.er(R.drawable.msg_mini_lock2, 0), 0, 1, 33);
        if (aq0Var.f35977a) {
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
        jVar.o(org.telegram.ui.Components.hs.h);
        jVar.C = false;
        jVar.f47696m = false;
        lp0Var.setItemAnimator(jVar);
        View view = new View(getContext());
        this.f42533w = view;
        ah.d dVar = new ah.d(cVar.c(view, null, false));
        dVar.b(-AndroidUtilities.dp(24.0f), true);
        dVar.f562q = 220;
        view.setBackground(dVar);
        addView(view, w7.x5.e(-1, 72, 55));
        if (i10 == 0) {
            Context context3 = getContext();
            i12 = ((org.telegram.ui.ActionBar.n2) aq0Var).currentAccount;
            e6Var4 = ((org.telegram.ui.ActionBar.n2) aq0Var).resourceProvider;
            this.f42510a = new yp0(i12, 0L, context3, e6Var4);
            j(false);
        } else {
            View view2 = new View(getContext());
            this.f42534x = view2;
            ah.d dVar2 = new ah.d(cVar.c(view2, null, false));
            dVar2.b(-AndroidUtilities.dp(16.0f), false);
            view2.setBackground(dVar2);
            addView(view2, w7.x5.e(-1, 16, 55));
            Context context4 = getContext();
            d5Var = ((org.telegram.ui.ActionBar.n2) aq0Var).parentLayout;
            e6Var = ((org.telegram.ui.ActionBar.n2) aq0Var).resourceProvider;
            ?? gaVar = new org.telegram.ui.Cells.ga(context4, d5Var, 3, 0L, e6Var);
            this.v = gaVar;
            gaVar.setImportantForAccessibility(4);
            gaVar.f22170r = aq0Var;
            gaVar.setClipToOutline(true);
            ai.l2 l2Var = yf.i0.f52169a;
            gaVar.setOutlineProvider(new yf.h0(0, AndroidUtilities.dp(16.0f)));
            addView((View) gaVar, w7.x5.a(-2.0f, 12.0f, 0.0f, 12.0f, 0.0f, -1, 55));
        }
        Context context5 = getContext();
        e6Var2 = ((org.telegram.ui.ActionBar.n2) aq0Var).resourceProvider;
        zp0 zp0Var = new zp0(aq0Var, context5, e6Var2);
        this.E = zp0Var;
        ch.d c10 = aq0Var.E.c(zp0Var, null, false);
        e6Var3 = ((org.telegram.ui.ActionBar.n2) aq0Var).resourceProvider;
        dh.e eVar = new dh.e(e6Var3);
        eVar.f8366e = new d2.c(8);
        eVar.e(0, 0);
        eVar.c(0, 0);
        eVar.b(0, 0);
        c10.o(eVar);
        c10.q(AndroidUtilities.dp(18.0f));
        c10.f4685j.f4668e = true;
        zp0Var.H = c10;
        zp0Var.G = c10;
        zp0Var.F = new kp0(this, 0);
        zp0Var.setVisibility(4);
        addView(zp0Var, w7.x5.a(36.0f, 12.0f, 0.0f, 12.0f, 0.0f, -1, 55));
        yp0 yp0Var = this.f42510a;
        if (yp0Var != null) {
            addView(yp0Var, w7.x5.e(-1, -2, 55));
        }
        g();
        k();
        setWillNotDraw(false);
    }

    public static void a(up0 up0Var) {
        int i10;
        lp0 lp0Var = up0Var.f42512b;
        boolean z10 = up0Var.H;
        if (z10) {
            lp0Var.B0();
        }
        up0Var.e();
        if (z10 && (i10 = up0Var.f42522h0) >= 0) {
            up0Var.f42514c.h1(i10, up0Var.f42530p0.f35986f);
            lp0Var.post(new kp0(up0Var, 1));
        }
    }

    public final boolean b() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.up0.b():boolean");
    }

    public final boolean c() {
        lp0 lp0Var = this.f42512b;
        if (lp0Var != null) {
            for (int i10 = 0; i10 < lp0Var.getChildCount(); i10++) {
                if (lp0Var.getChildAt(i10) instanceof org.telegram.ui.Components.j10) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void d() {
        TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible;
        int i10 = this.m0;
        aq0 aq0Var = this.f42530p0;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible = null;
        if (i10 == 0) {
            TLRPC.User currentUser = aq0Var.getUserConfig().getCurrentUser();
            this.h = UserObject.getProfileColorId(currentUser);
            this.f42527n = UserObject.getProfileEmojiId(currentUser);
            if (currentUser != null) {
                TLRPC.EmojiStatus emojiStatus = currentUser.emoji_status;
                if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                    tL_emojiStatusCollectible = (TLRPC.TL_emojiStatusCollectible) emojiStatus;
                    this.f42531r = tL_emojiStatusCollectible;
                    this.f42532s = null;
                }
            }
            tL_emojiStatusCollectible = null;
            this.f42531r = tL_emojiStatusCollectible;
            this.f42532s = null;
        } else {
            TLRPC.User currentUser2 = aq0Var.getUserConfig().getCurrentUser();
            this.h = UserObject.getColorId(currentUser2);
            this.f42527n = UserObject.getEmojiId(currentUser2);
            this.f42531r = null;
            if (currentUser2 != null) {
                TLRPC.PeerColor peerColor = currentUser2.color;
                if (peerColor instanceof TLRPC.TL_peerColorCollectible) {
                    tL_peerColorCollectible = (TLRPC.TL_peerColorCollectible) peerColor;
                }
            }
            this.f42532s = tL_peerColorCollectible;
        }
        if (this.f42531r == null && this.f42532s == null) {
            return;
        }
        this.h = -1;
        this.f42527n = 0L;
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
        aq0 aq0Var = this.f42530p0;
        n6.t tVar = this.f42517e;
        if (tL_starGiftUnique != null) {
            zf.a resellAmount = tL_starGiftUnique.getResellAmount(zf.b.f54441a);
            if (tL_starGiftUnique.resale_ton_only) {
                tVar.f16717b = yh.p7.T0(LocaleController.formatString(R.string.ResellGiftBuyTON, tL_starGiftUnique.getResellAmount(zf.b.f54442b).d()), true);
                tVar.f16718c = yh.p7.R0(LocaleController.formatPluralStringComma("ResellGiftBuyEq", (int) resellAmount.a()));
            } else {
                tVar.f16717b = yh.p7.R0(LocaleController.formatPluralStringComma("ResellGiftBuy", (int) resellAmount.a()));
                tVar.f16718c = null;
            }
        } else {
            if (!aq0Var.getUserConfig().isPremium() && !aq0Var.f35977a) {
                obj = this.N;
            } else if (this.f42531r != null) {
                obj = this.P;
            } else {
                obj = this.O;
            }
            tVar.f16717b = obj;
            tVar.f16718c = null;
        }
        if (aq0Var.C0() == this) {
            aq0Var.R = this;
            aq0Var.Q.g((CharSequence) tVar.f16717b, z10, true);
            aq0Var.Q.f((SpannableStringBuilder) tVar.f16718c, z10);
        }
    }

    public final void g() {
        ci.d dVar = this.f42530p0.Q;
        if (dVar != null) {
            dVar.j();
        }
        pp0 pp0Var = this.v;
        if (pp0Var != null) {
            pp0Var.invalidate();
        }
        j(true);
        AndroidUtilities.forEachViews((RecyclerView) this.f42512b, (Utilities.Callback<View>) new t3(this, 14));
        zp0 zp0Var = this.E;
        if (zp0Var != null) {
            l(zp0Var);
        }
    }

    public final void h() {
        int i10;
        boolean z10;
        int i11 = this.f42530p0.f35986f;
        float f7 = 0.0f;
        View view = this.f42533w;
        zp0 zp0Var = this.E;
        if (zp0Var != null && (i10 = this.f42522h0) >= 0) {
            s4.s sVar = this.f42514c;
            this.F = sVar.m(i10);
            lp0 lp0Var = this.f42512b;
            int paddingTop = lp0Var.getPaddingTop() + i11;
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
                zp0Var.setVisibility(0);
                zp0Var.setTranslationY((Math.max(this.F.getTop(), paddingTop) + lp0Var.getTop()) - zp0Var.getTop());
            } else if (L0 != -1 && L0 > this.f42522h0) {
                this.H = true;
                this.G = false;
                zp0Var.setVisibility(0);
                zp0Var.setTranslationY((lp0Var.getTop() + paddingTop) - zp0Var.getTop());
            } else {
                this.H = false;
                this.G = false;
                zp0Var.setVisibility(0);
                zp0Var.setTranslationY((AndroidUtilities.dp(1.0f) + getHeight()) - zp0Var.getTop());
            }
            boolean z11 = this.G;
            if (zp0Var.I != z11) {
                zp0Var.I = z11;
                zp0Var.L.D0(2);
                zp0Var.invalidate();
            }
            if (this.H) {
                f7 = AndroidUtilities.dp(36.0f) + i11;
            }
            view.setTranslationY(f7);
            lp0Var.invalidate();
            invalidate();
            return;
        }
        this.G = false;
        this.H = false;
        if (view != null) {
            view.setTranslationY(0.0f);
        }
        if (zp0Var != null) {
            zp0Var.setVisibility(4);
            boolean z12 = this.G;
            if (zp0Var.I != z12) {
                zp0Var.I = z12;
                zp0Var.L.D0(2);
                zp0Var.invalidate();
            }
        }
    }

    public final void i() {
        MessageObject messageObject;
        pp0 pp0Var = this.v;
        if (pp0Var != null) {
            org.telegram.ui.Cells.u1[] cells = pp0Var.getCells();
            for (int i10 = 0; i10 < cells.length; i10++) {
                org.telegram.ui.Cells.u1 u1Var = cells[i10];
                if (u1Var != null && (messageObject = u1Var.getMessageObject()) != null) {
                    messageObject.notime = true;
                    xp0 xp0Var = this.f42519f;
                    if (xp0Var != null) {
                        messageObject.overrideLinkColor = xp0Var.getColorId();
                    }
                    messageObject.overrideLinkEmoji = this.f42527n;
                    messageObject.overrideLinkPeerColor = this.f42532s;
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
        aq0 aq0Var;
        cp0 cp0Var;
        int i11;
        xp0 xp0Var = this.f42519f;
        if (xp0Var != null) {
            xp0Var.a(this.h, z10);
        }
        yp0 yp0Var = this.f42510a;
        if (yp0Var != null) {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = this.f42531r;
            if (tL_emojiStatusCollectible != null) {
                yp0Var.e(tL_emojiStatusCollectible.document_id, true, z10);
                yp0Var.c(MessagesController.PeerColor.fromCollectible(this.f42531r), z10);
                yp0Var.d(this.f42531r.pattern_document_id, true, z10);
            } else {
                if (DialogObject.isEmojiStatusCollectible(0L)) {
                    yp0Var.e(0L, false, z10);
                } else {
                    yp0Var.e(DialogObject.getEmojiStatusDocumentId(0L), DialogObject.isEmojiStatusCollectible(0L), z10);
                }
                yp0Var.b(this.h, z10);
                yp0Var.d(this.f42527n, false, z10);
            }
        }
        int i12 = this.m0;
        if (i12 == 0 && (cp0Var = (aq0Var = this.f42530p0).f35984e) != null) {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2 = this.f42531r;
            if (tL_emojiStatusCollectible2 == null) {
                i11 = ((org.telegram.ui.ActionBar.n2) aq0Var).currentAccount;
                cp0Var.b(i11, this.h, z10);
            } else {
                cp0Var.c(MessagesController.PeerColor.fromCollectible(tL_emojiStatusCollectible2), z10);
            }
        }
        if (i12 == 0) {
            int i13 = this.V;
            k();
            np0 np0Var = this.d;
            if (i13 >= 0 && this.V < 0) {
                np0Var.t(i13, 2);
            } else if (i13 < 0 && (i10 = this.V) >= 0) {
                np0Var.s(i10, 2);
            }
        }
        int i14 = 0;
        while (true) {
            lp0 lp0Var = this.f42512b;
            if (i14 < lp0Var.getChildCount()) {
                View childAt = lp0Var.getChildAt(i14);
                if (childAt instanceof ip0) {
                    ip0 ip0Var = (ip0) childAt;
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible3 = this.f42531r;
                    if ((tL_emojiStatusCollectible3 != null && tL_emojiStatusCollectible3.collectible_id == ip0Var.getGiftId()) || ((tL_peerColorCollectible2 = this.f42532s) != null && tL_peerColorCollectible2.collectible_id == ip0Var.getGiftId())) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    ip0Var.b(z12, true);
                } else if (childAt instanceof xh.j1) {
                    xh.j1 j1Var = (xh.j1) childAt;
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible4 = this.f42531r;
                    if ((tL_emojiStatusCollectible4 != null && tL_emojiStatusCollectible4.collectible_id == j1Var.getGiftId()) || ((tL_peerColorCollectible = this.f42532s) != null && tL_peerColorCollectible.collectible_id == j1Var.getGiftId())) {
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
        yh.e5 e5Var;
        int i10;
        aq0 aq0Var = this.f42530p0;
        yh.e5 e5Var2 = aq0Var.f35979b;
        this.V = -1;
        this.W = -1;
        this.f42511a0 = -1;
        this.f42513b0 = -1;
        this.f42516d0 = -1;
        this.f42518e0 = -1;
        this.f42515c0 = -1;
        this.f42521g0 = -1;
        this.f42522h0 = -1;
        this.f42523i0 = -1;
        this.f42524j0 = -1;
        this.f42520f0 = 0;
        ArrayList arrayList = this.f42526l0;
        arrayList.clear();
        this.Q = 0;
        this.S = 1;
        int i11 = 3;
        this.f42525k0 = 3;
        this.R = 2;
        int i12 = this.m0;
        if (i12 == 0 && (this.h >= 0 || this.f42531r != null || this.f42532s != null)) {
            this.V = 3;
            this.f42525k0 = 5;
            this.W = 4;
        }
        if (i12 == 1) {
            e5Var = aq0Var.f35981c;
        } else {
            e5Var = e5Var2;
        }
        if ((i12 == 0 || i12 == 1) && e5Var != null) {
            ArrayList arrayList2 = e5Var.f52440l;
            int i13 = this.f42525k0;
            this.f42525k0 = i13 + 1;
            this.f42522h0 = i13;
            if (this.K == null) {
                for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                    TL_stars.StarGift starGift = ((TL_stars.SavedStarGift) arrayList2.get(i14)).gift;
                    if (starGift instanceof TL_stars.TL_starGiftUnique) {
                        arrayList.add((TL_stars.TL_starGiftUnique) starGift);
                    }
                }
                int i15 = this.f42525k0;
                this.f42513b0 = i15;
                this.f42525k0 = arrayList.size() + i15;
                int size = arrayList.size() + this.f42520f0;
                this.f42520f0 = size;
                int i16 = this.f42525k0;
                this.f42515c0 = i16;
                if (!e5Var2.f52437i && e5Var2.f52438j) {
                    if (arrayList.isEmpty()) {
                        int i17 = this.f42525k0;
                        this.f42524j0 = i17;
                        this.f42525k0 = i17 + 2;
                        this.f42523i0 = i17 + 1;
                    }
                } else {
                    this.f42516d0 = i16;
                    int i18 = 3 - (size % 3);
                    if (size <= 0) {
                        i11 = 9;
                    } else if (i18 > 0) {
                        i11 = i18;
                    }
                    int i19 = i16 + i11;
                    this.f42525k0 = i19;
                    this.f42520f0 = size + i11;
                    this.f42518e0 = i19;
                }
                if (c()) {
                    e5Var.a();
                }
            } else if (this.J != null) {
                i10 = ((org.telegram.ui.ActionBar.n2) aq0Var).currentAccount;
                long clientUserId = UserConfig.getInstance(i10).getClientUserId();
                for (int i20 = 0; i20 < this.J.d.size(); i20++) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.J.d.get(i20);
                    if (DialogObject.getPeerDialogId(tL_starGiftUnique.owner_id) != clientUserId && DialogObject.getPeerDialogId(tL_starGiftUnique.host_id) != clientUserId) {
                        arrayList.add(tL_starGiftUnique);
                    }
                }
                int i21 = this.f42525k0;
                this.f42513b0 = i21;
                this.f42525k0 = arrayList.size() + i21;
                int size2 = arrayList.size() + this.f42520f0;
                this.f42520f0 = size2;
                int i22 = this.f42525k0;
                this.f42515c0 = i22;
                xh.v3 v3Var = this.J;
                if (v3Var.f51567t || !v3Var.f51568u) {
                    this.f42516d0 = i22;
                    int i23 = 3 - (size2 % 3);
                    if (size2 <= 0) {
                        i11 = 9;
                    } else if (i23 > 0) {
                        i11 = i23;
                    }
                    int i24 = i22 + i11;
                    this.f42525k0 = i24;
                    this.f42520f0 = size2 + i11;
                    this.f42518e0 = i24;
                }
                if (c()) {
                    this.J.g(false);
                }
            }
            int i25 = this.f42525k0;
            this.f42525k0 = i25 + 1;
            this.f42521g0 = i25;
        }
        int i26 = this.f42525k0;
        this.f42525k0 = i26 + 1;
        this.U = i26;
        zp0 zp0Var = this.E;
        if (zp0Var != null) {
            zp0Var.post(new kp0(this, 1));
        }
    }

    public final void l(zp0 zp0Var) {
        int i10;
        int i11 = org.telegram.ui.ActionBar.i6.f20797d6;
        aq0 aq0Var = this.f42530p0;
        int themedColor = aq0Var.getThemedColor(i11);
        aq0Var.getThemedColor(org.telegram.ui.ActionBar.i6.f20741a7);
        int themedColor2 = aq0Var.getThemedColor(org.telegram.ui.ActionBar.i6.f21199z6);
        int themedColor3 = aq0Var.getThemedColor(org.telegram.ui.ActionBar.i6.G6);
        zp0Var.v.setColor(themedColor);
        zp0Var.f45040x = org.telegram.ui.ActionBar.i6.m1(0.06f, themedColor3);
        zp0Var.f45041y = themedColor2;
        zp0Var.E = themedColor3;
        o60 o60Var = zp0Var.f45031a;
        for (int i12 = 0; i12 < o60Var.getChildCount(); i12++) {
            View childAt = o60Var.getChildAt(i12);
            int R = RecyclerView.R(childAt);
            if (R != -1 && (childAt instanceof TextView)) {
                TextView textView = (TextView) childAt;
                if (R == zp0Var.d) {
                    i10 = zp0Var.E;
                } else {
                    i10 = zp0Var.f45041y;
                }
                textView.setTextColor(i10);
                childAt.invalidate();
            }
        }
        o60Var.invalidate();
        zp0Var.invalidate();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12 = this.m0;
        View view = this.f42533w;
        lp0 lp0Var = this.f42512b;
        if (i12 == 1) {
            super.onMeasure(i10, i11);
            pp0 pp0Var = this.v;
            this.f42528n0 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + pp0Var.getMeasuredHeight() + AndroidUtilities.statusBarHeight;
            ((ViewGroup.MarginLayoutParams) pp0Var.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
            ((ViewGroup.MarginLayoutParams) lp0Var.getLayoutParams()).topMargin = this.f42528n0 - AndroidUtilities.dp(16.0f);
            ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).topMargin = this.f42528n0 - AndroidUtilities.dp(64.0f);
            ((ViewGroup.MarginLayoutParams) this.f42534x.getLayoutParams()).topMargin = this.f42528n0 - AndroidUtilities.dp(16.0f);
            lp0Var.setPadding(lp0Var.getPaddingLeft(), AndroidUtilities.dp(16.0f), lp0Var.getPaddingRight(), lp0Var.getPaddingBottom());
        } else {
            this.f42528n0 = AndroidUtilities.dp(230.0f) + AndroidUtilities.statusBarHeight;
            ((ViewGroup.MarginLayoutParams) lp0Var.getLayoutParams()).topMargin = this.f42528n0;
            ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).topMargin = this.f42528n0 - AndroidUtilities.dp(64.0f);
            ((ViewGroup.MarginLayoutParams) this.f42510a.getLayoutParams()).height = this.f42528n0;
        }
        super.onMeasure(i10, i11);
    }
}
