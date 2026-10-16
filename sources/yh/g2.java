package yh;

import android.graphics.Point;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.bc0;
import org.telegram.ui.Components.l80;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.ns0;
import org.telegram.ui.Components.s5;
import org.telegram.ui.Components.zc;
import org.telegram.ui.ay;
import org.telegram.ui.yw0;
import w7.z5;
import zh.e5;
import zh.n5;
public final class g2 implements Utilities.Callback5, Utilities.Callback5Return {
    public final m2 f48875a;

    public g2(m2 m2Var) {
        this.f48875a = m2Var;
    }

    @Override
    public void mo16run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        m61 m61Var = (m61) obj;
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        m2 m2Var = this.f48875a;
        ns0 ns0Var = m2Var.f48993a;
        int i10 = m2Var.f48994b;
        if (m2Var.e == null) {
            return;
        }
        Object obj6 = m61Var.G;
        if (obj6 instanceof TL_stars.SavedStarGift) {
            TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj6;
            if (m2Var.f48997n) {
                if (!m2Var.d && (savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) {
                    boolean z10 = savedStarGift.pinned_to_top;
                    boolean z11 = !z10;
                    if (!z10 && savedStarGift.unsaved) {
                        savedStarGift.unsaved = false;
                        TL_stars.saveStarGift savestargift = new TL_stars.saveStarGift();
                        savestargift.stargift = m2Var.e.g(savedStarGift);
                        savestargift.unsave = savedStarGift.unsaved;
                        ConnectionsManager.getInstance(i10).sendRequest(savestargift, null, 64);
                    }
                    if (m2Var.e.m(savedStarGift, z11, true)) {
                        zc.a0(ns0Var.f49088a).Q(R.raw.chats_infotip, 36, LocaleController.formatPluralStringComma("GiftsPinLimit", MessagesController.getInstance(i10).stargiftsPinnedToTopLimit)).j();
                    }
                    if (z10) {
                        return;
                    }
                    m2Var.f48996f.u0(0);
                    return;
                }
                return;
            }
            zh.r3 r3Var = new zh.r3(m2Var.getContext(), m2Var.f48994b, ns0Var.f49090c, m2Var.f48995c, null);
            r3Var.f51078e1 = new b2(m2Var, 2);
            r3Var.P0 = new org.telegram.ui.web.o0(21, m2Var, savedStarGift);
            r3Var.l2(savedStarGift, m2Var.e);
            r3Var.show();
        }
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean z10;
        m2 m2Var;
        ns0 ns0Var;
        h1 h1Var;
        e5 e5Var;
        String str;
        final m2 m2Var2;
        ns0 ns0Var2;
        h1 h1Var2;
        boolean z11;
        String str2;
        LinearLayout linearLayout;
        boolean z12;
        c6 c6Var;
        Object obj6;
        m61 m61Var = (m61) obj;
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        m2 m2Var3 = this.f48875a;
        c6 c6Var2 = m2Var3.f48995c;
        int i10 = m2Var3.f48994b;
        ns0 ns0Var3 = m2Var3.f48993a;
        boolean z13 = false;
        if (m2Var3.e != null) {
            if (view instanceof h1) {
                Object obj7 = m61Var.G;
                if (obj7 instanceof TL_stars.SavedStarGift) {
                    h1 h1Var3 = (h1) view;
                    final TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj7;
                    org.telegram.ui.ActionBar.m2 m2Var4 = ns0Var3.f49088a;
                    e5 e5Var2 = ns0Var3.e;
                    l80 I = l80.I(m2Var4, view);
                    ns0Var3.I = I;
                    if (e5Var2.h()) {
                        if (!m2Var3.d) {
                            e5Var2.d().size();
                        }
                        l80 J = I.J();
                        J.c(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new ji.h(I, 2), false);
                        J.k();
                        ay ayVar = new ay(m2Var3.getContext(), 4);
                        LinearLayout linearLayout2 = new LinearLayout(m2Var3.getContext());
                        ayVar.addView(linearLayout2);
                        linearLayout2.setOrientation(1);
                        boolean z14 = true;
                        J.r(ayVar, z5.n(-1, -2));
                        if (e5Var2.d().size() + 1 < MessagesController.getInstance(i10).config.stargiftsCollectionsLimit.get()) {
                            org.telegram.ui.ActionBar.e1 e1Var = new org.telegram.ui.ActionBar.e1(0, m2Var3.getContext(), m2Var3.f48995c, false, false);
                            e1Var.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
                            int i11 = g6.E8;
                            e1Var.c(g6.w0(i11, c6Var2), g6.w0(g6.F8, c6Var2));
                            e1Var.setSelectorColor(g6.m1(0.12f, g6.w0(i11, c6Var2)));
                            e1Var.g(LocaleController.getString(R.string.Gift2NewCollection), R.drawable.menu_folder_add, null);
                            e1Var.setOnClickListener(new yg.e(m2Var3, I, savedStarGift, 5));
                            linearLayout2.addView(e1Var, z5.n(-1, -2));
                        }
                        ArrayList d = e5Var2.d();
                        int size = d.size();
                        int i12 = 0;
                        while (i12 < size) {
                            int i13 = i12 + 1;
                            TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) d.get(i12);
                            ArrayList arrayList = e5Var2.e(tL_starGiftCollection.collection_id).f50510l;
                            ns0 ns0Var4 = ns0Var3;
                            int size2 = arrayList.size();
                            h1 h1Var4 = h1Var3;
                            int i14 = 0;
                            while (true) {
                                if (i14 >= size2) {
                                    linearLayout = linearLayout2;
                                    z12 = false;
                                    break;
                                }
                                Object obj8 = arrayList.get(i14);
                                i14++;
                                int i15 = size2;
                                if (n5.k((TL_stars.SavedStarGift) obj8, savedStarGift)) {
                                    linearLayout = linearLayout2;
                                    z12 = z14;
                                    break;
                                }
                                size2 = i15;
                            }
                            org.telegram.ui.ActionBar.e1 e1Var2 = new org.telegram.ui.ActionBar.e1(2, m2Var3.getContext(), m2Var3.f48995c, false, false);
                            e1Var2.setChecked(z12);
                            m2 m2Var5 = m2Var3;
                            LinearLayout linearLayout3 = linearLayout;
                            e1Var2.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
                            int i16 = g6.E8;
                            e1Var2.c(g6.w0(i16, c6Var2), g6.w0(g6.F8, c6Var2));
                            e1Var2.setSelectorColor(g6.m1(0.12f, g6.w0(i16, c6Var2)));
                            if (tL_starGiftCollection.icon != null) {
                                s5 s5Var = new s5(3, i10, tL_starGiftCollection.icon);
                                c6Var = c6Var2;
                                e1Var2.getImageView().addOnAttachStateChangeListener(new bi.j2(s5Var, 4));
                                e1Var2.g(tL_starGiftCollection.title, 0, s5Var);
                                obj6 = null;
                            } else {
                                c6Var = c6Var2;
                                obj6 = null;
                                e1Var2.g(tL_starGiftCollection.title, R.drawable.msg_folders, null);
                            }
                            e5 e5Var3 = e5Var2;
                            e1Var2.setOnClickListener(new bc0(m2Var5, z12, tL_starGiftCollection, savedStarGift, I, 1));
                            linearLayout3.addView(e1Var2, z5.n(-1, -2));
                            linearLayout2 = linearLayout3;
                            m2Var3 = m2Var5;
                            ns0Var3 = ns0Var4;
                            i12 = i13;
                            h1Var3 = h1Var4;
                            e5Var2 = e5Var3;
                            z14 = true;
                            size = size;
                            c6Var2 = c6Var;
                        }
                        m2Var = m2Var3;
                        ns0Var = ns0Var3;
                        h1Var = h1Var3;
                        e5Var = e5Var2;
                        str = null;
                        z13 = false;
                        I.c(R.drawable.msg_addfolder, LocaleController.getString(R.string.Gift2AddToCollection), new fi.m2(I, J, 11), false);
                        I.k();
                    } else {
                        m2Var = m2Var3;
                        ns0Var = ns0Var3;
                        h1Var = h1Var3;
                        e5Var = e5Var2;
                        str = null;
                    }
                    if (savedStarGift.gift instanceof TL_stars.TL_starGiftUnique) {
                        if (ns0Var.c() && !m2Var.d && (!savedStarGift.unsaved || !savedStarGift.pinned_to_top)) {
                            boolean z15 = savedStarGift.pinned_to_top;
                            m2Var2 = m2Var;
                            ns0Var2 = ns0Var;
                            h1Var2 = h1Var;
                            z10 = z13;
                            I.c(z15 ? R.drawable.msg_unpin : R.drawable.msg_pin, LocaleController.getString(z15 ? R.string.Gift2Unpin : R.string.Gift2Pin), new yw0(m2Var2, savedStarGift, h1Var2, view, 26), z10);
                            I.l(R.drawable.tabs_reorder, LocaleController.getString(R.string.Gift2Reorder), new b2(m2Var2, 0), savedStarGift.pinned_to_top);
                        } else {
                            m2Var2 = m2Var;
                            ns0Var2 = ns0Var;
                            h1Var2 = h1Var;
                            z10 = z13;
                            if (ns0Var2.c() && m2Var2.d) {
                                I.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.Gift2Reorder), new b2(m2Var2, 1), z10);
                            }
                        }
                        TL_stars.StarGift starGift = savedStarGift.gift;
                        TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
                        if (starGift.slug != null) {
                            str2 = MessagesController.getInstance(i10).linkPrefix + "/nft/" + savedStarGift.gift.slug;
                        } else {
                            str2 = str;
                        }
                        if (zh.r3.P1(i10, DialogObject.getPeerDialogId(tL_starGiftUnique.owner_id))) {
                            boolean Q1 = zh.r3.Q1(i10, tL_starGiftUnique);
                            I.c(Q1 ? R.drawable.menu_takeoff : R.drawable.menu_wear, LocaleController.getString(Q1 ? R.string.Gift2Unwear : R.string.Gift2Wear), new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r3) {
                                        case 0:
                                            m2 m2Var6 = m2Var2;
                                            l2 l2Var = new l2(m2Var6, m2Var6.getContext(), m2Var6.f48994b, m2Var6.f48993a.f49090c, m2Var6.f48995c, 0);
                                            l2Var.l2(savedStarGift, null);
                                            l2Var.t2(false);
                                            return;
                                        case 1:
                                            m2 m2Var7 = m2Var2;
                                            l2 l2Var2 = new l2(m2Var7, m2Var7.getContext(), m2Var7.f48994b, m2Var7.f48993a.f49090c, m2Var7.f48995c, 1);
                                            l2Var2.l2(savedStarGift, null);
                                            l2Var2.T1();
                                            return;
                                        default:
                                            m2 m2Var8 = m2Var2;
                                            l2 l2Var3 = new l2(m2Var8, m2Var8.getContext(), m2Var8.f48994b, m2Var8.f48993a.f49090c, m2Var8.f48995c, 2);
                                            l2Var3.l2(savedStarGift, null);
                                            l2Var3.Z1();
                                            return;
                                    }
                                }
                            }, z10);
                        }
                        I.l(R.drawable.msg_link2, LocaleController.getString(R.string.CopyLink), new s9.b(28, m2Var2, str2), str2 != null ? true : z10);
                        I.l(R.drawable.msg_share, LocaleController.getString(R.string.ShareFile), new Runnable() {
                            @Override
                            public final void run() {
                                switch (r3) {
                                    case 0:
                                        m2 m2Var6 = m2Var2;
                                        l2 l2Var = new l2(m2Var6, m2Var6.getContext(), m2Var6.f48994b, m2Var6.f48993a.f49090c, m2Var6.f48995c, 0);
                                        l2Var.l2(savedStarGift, null);
                                        l2Var.t2(false);
                                        return;
                                    case 1:
                                        m2 m2Var7 = m2Var2;
                                        l2 l2Var2 = new l2(m2Var7, m2Var7.getContext(), m2Var7.f48994b, m2Var7.f48993a.f49090c, m2Var7.f48995c, 1);
                                        l2Var2.l2(savedStarGift, null);
                                        l2Var2.T1();
                                        return;
                                    default:
                                        m2 m2Var8 = m2Var2;
                                        l2 l2Var3 = new l2(m2Var8, m2Var8.getContext(), m2Var8.f48994b, m2Var8.f48993a.f49090c, m2Var8.f48995c, 2);
                                        l2Var3.l2(savedStarGift, null);
                                        l2Var3.Z1();
                                        return;
                                }
                            }
                        }, str2 != null ? true : z10);
                    } else {
                        m2Var2 = m2Var;
                        ns0Var2 = ns0Var;
                        h1Var2 = h1Var;
                        z10 = z13;
                        if (ns0Var2.c() && m2Var2.d) {
                            I.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.Gift2Reorder), new b2(m2Var2, 3), z10);
                        }
                    }
                    if (zh.r3.P1(i10, ns0Var2.f49090c)) {
                        boolean z16 = savedStarGift.unsaved;
                        I.c(z16 ? R.drawable.msg_message : R.drawable.menu_hide_gift, LocaleController.getString(z16 ? R.string.Gift2ShowGift : R.string.Gift2HideGift), new pi.g(m2Var2, savedStarGift, h1Var2, 17), z10);
                    }
                    TL_stars.StarGift starGift2 = savedStarGift.gift;
                    if (starGift2 instanceof TL_stars.TL_starGiftUnique) {
                        I.l(R.drawable.menu_transfer, LocaleController.getString(R.string.Gift2TransferOption), new Runnable() {
                            @Override
                            public final void run() {
                                switch (r3) {
                                    case 0:
                                        m2 m2Var6 = m2Var2;
                                        l2 l2Var = new l2(m2Var6, m2Var6.getContext(), m2Var6.f48994b, m2Var6.f48993a.f49090c, m2Var6.f48995c, 0);
                                        l2Var.l2(savedStarGift, null);
                                        l2Var.t2(false);
                                        return;
                                    case 1:
                                        m2 m2Var7 = m2Var2;
                                        l2 l2Var2 = new l2(m2Var7, m2Var7.getContext(), m2Var7.f48994b, m2Var7.f48993a.f49090c, m2Var7.f48995c, 1);
                                        l2Var2.l2(savedStarGift, null);
                                        l2Var2.T1();
                                        return;
                                    default:
                                        m2 m2Var8 = m2Var2;
                                        l2 l2Var3 = new l2(m2Var8, m2Var8.getContext(), m2Var8.f48994b, m2Var8.f48993a.f49090c, m2Var8.f48995c, 2);
                                        l2Var3.l2(savedStarGift, null);
                                        l2Var3.Z1();
                                        return;
                                }
                            }
                        }, DialogObject.getPeerDialogId(((TL_stars.TL_starGiftUnique) starGift2).owner_id) == UserConfig.getInstance(i10).getClientUserId() ? true : z10);
                    }
                    if (e5Var.h() && m2Var2.d) {
                        z11 = true;
                        I.c(R.drawable.msg_removefolder, LocaleController.getString(R.string.Gift2RemoveFromCollection), new pi.g(m2Var2, savedStarGift, I, 16), true);
                        I.E();
                        I.t();
                    } else {
                        z11 = true;
                    }
                    if (I.x() > 0) {
                        I.V(5);
                        I.f26670u = z11;
                        I.v = z11;
                        I.L = z11;
                        Point point = AndroidUtilities.displaySize;
                        int min = Math.min(point.x, point.y);
                        I.N = min - AndroidUtilities.dp(32.0f);
                        I.O = (int) (min * 0.6f);
                        I.P = z11;
                        I.W = z11;
                        I.Z();
                        h1Var2.f48911y.getImageReceiver().startAnimation(z11);
                        z13 = z11;
                    }
                    z13 = z10;
                }
            }
            z10 = false;
            z13 = z10;
        }
        return Boolean.valueOf(z13);
    }
}
