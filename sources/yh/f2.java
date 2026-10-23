package yh;

import ai.ha;
import ai.l7;
import ai.n6;
import ai.v9;
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
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.j80;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.ns0;
import org.telegram.ui.Components.r5;
import org.telegram.ui.Components.t41;
import org.telegram.ui.Components.xb0;
import org.telegram.ui.Components.xc;
import org.telegram.ui.Wallet.e8;
import org.telegram.ui.gx;
import w7.z5;
public final class f2 implements Utilities.Callback5, Utilities.Callback5Return {
    public final l2 f50685a;

    public f2(l2 l2Var) {
        this.f50685a = l2Var;
    }

    @Override
    public void mo0run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        m61 m61Var = (m61) obj;
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        l2 l2Var = this.f50685a;
        ns0 ns0Var = l2Var.f50825a;
        int i10 = l2Var.f50826b;
        if (l2Var.e == null) {
            return;
        }
        Object obj6 = m61Var.G;
        if (obj6 instanceof TL_stars.SavedStarGift) {
            TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj6;
            if (l2Var.f50829n) {
                if (!l2Var.d && (savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) {
                    boolean z10 = savedStarGift.pinned_to_top;
                    boolean z11 = !z10;
                    if (!z10 && savedStarGift.unsaved) {
                        savedStarGift.unsaved = false;
                        TL_stars.saveStarGift savestargift = new TL_stars.saveStarGift();
                        savestargift.stargift = l2Var.e.h(savedStarGift);
                        savestargift.unsave = savedStarGift.unsaved;
                        ConnectionsManager.getInstance(i10).sendRequest(savestargift, null, 64);
                    }
                    if (l2Var.e.o(savedStarGift, z11, true)) {
                        xc.a0(ns0Var.f50924a).Q(R.raw.chats_infotip, 36, LocaleController.formatPluralStringComma("GiftsPinLimit", MessagesController.getInstance(i10).stargiftsPinnedToTopLimit)).j();
                    }
                    if (z10) {
                        return;
                    }
                    l2Var.f50828f.u0(0);
                    return;
                }
                return;
            }
            l7 l7Var = new l7(l2Var.getContext(), l2Var.f50826b, ns0Var.f50926c, l2Var.f50827c, null);
            l7Var.f1731k1 = new a2(l2Var, 2);
            l7Var.R0 = new e8(25, l2Var, savedStarGift);
            l7Var.L2(savedStarGift, l2Var.e);
            l7Var.show();
        }
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean z10;
        ns0 ns0Var;
        l2 l2Var;
        g1 g1Var;
        String str;
        v9 v9Var;
        final l2 l2Var2;
        ns0 ns0Var2;
        g1 g1Var2;
        boolean z11;
        String str2;
        LinearLayout linearLayout;
        boolean z12;
        g1 g1Var3;
        Object obj6;
        m61 m61Var = (m61) obj;
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        l2 l2Var3 = this.f50685a;
        int i10 = l2Var3.f50826b;
        ns0 ns0Var3 = l2Var3.f50825a;
        boolean z13 = false;
        if (l2Var3.e != null) {
            if (view instanceof g1) {
                Object obj7 = m61Var.G;
                if (obj7 instanceof TL_stars.SavedStarGift) {
                    g1 g1Var4 = (g1) view;
                    final TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj7;
                    org.telegram.ui.ActionBar.o2 o2Var = ns0Var3.f50924a;
                    v9 v9Var2 = ns0Var3.e;
                    j80 I = j80.I(o2Var, view);
                    ns0Var3.I = I;
                    if (v9Var2.h()) {
                        if (!l2Var3.d) {
                            v9Var2.d().size();
                        }
                        j80 J = I.J();
                        J.c(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new ki.h(I, 2), false);
                        J.k();
                        gx gxVar = new gx(l2Var3.getContext(), 4);
                        LinearLayout linearLayout2 = new LinearLayout(l2Var3.getContext());
                        gxVar.addView(linearLayout2);
                        linearLayout2.setOrientation(1);
                        boolean z14 = true;
                        J.r(gxVar, z5.n(-1, -2));
                        if (v9Var2.d().size() + 1 < MessagesController.getInstance(i10).config.stargiftsCollectionsLimit.get()) {
                            org.telegram.ui.ActionBar.e1 e1Var = new org.telegram.ui.ActionBar.e1(0, l2Var3.getContext(), l2Var3.f50827c, false, false);
                            e1Var.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
                            int i11 = k6.E8;
                            e1Var.c(i11, k6.F8);
                            e1Var.h(0.12f, i11);
                            e1Var.j(LocaleController.getString(R.string.Gift2NewCollection), R.drawable.menu_folder_add, null);
                            e1Var.setOnClickListener(new t41(l2Var3, I, savedStarGift, 8));
                            linearLayout2.addView(e1Var, z5.n(-1, -2));
                        }
                        ArrayList d = v9Var2.d();
                        int size = d.size();
                        int i12 = 0;
                        while (i12 < size) {
                            int i13 = i12 + 1;
                            TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) d.get(i12);
                            ArrayList arrayList = v9Var2.e(tL_starGiftCollection.collection_id).f2511l;
                            int size2 = arrayList.size();
                            ns0 ns0Var4 = ns0Var3;
                            int i14 = 0;
                            while (true) {
                                if (i14 >= size2) {
                                    linearLayout = linearLayout2;
                                    z12 = false;
                                    break;
                                }
                                Object obj8 = arrayList.get(i14);
                                int i15 = i14 + 1;
                                if (ha.k((TL_stars.SavedStarGift) obj8, savedStarGift)) {
                                    linearLayout = linearLayout2;
                                    z12 = z14;
                                    break;
                                }
                                i14 = i15;
                            }
                            org.telegram.ui.ActionBar.e1 e1Var2 = new org.telegram.ui.ActionBar.e1(2, l2Var3.getContext(), l2Var3.f50827c, false, false);
                            e1Var2.setChecked(z12);
                            LinearLayout linearLayout3 = linearLayout;
                            l2 l2Var4 = l2Var3;
                            e1Var2.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
                            int i16 = k6.E8;
                            e1Var2.c(i16, k6.F8);
                            e1Var2.h(0.12f, i16);
                            if (tL_starGiftCollection.icon != null) {
                                r5 r5Var = new r5(3, i10, tL_starGiftCollection.icon);
                                g1Var3 = g1Var4;
                                e1Var2.getImageView().addOnAttachStateChangeListener(new n6(r5Var, 5));
                                e1Var2.j(tL_starGiftCollection.title, 0, r5Var);
                                obj6 = null;
                            } else {
                                g1Var3 = g1Var4;
                                obj6 = null;
                                e1Var2.j(tL_starGiftCollection.title, R.drawable.msg_folders, null);
                            }
                            ArrayList arrayList2 = d;
                            e1Var2.setOnClickListener(new xb0(l2Var4, z12, tL_starGiftCollection, savedStarGift, I, 1));
                            linearLayout3.addView(e1Var2, z5.n(-1, -2));
                            d = arrayList2;
                            size = size;
                            linearLayout2 = linearLayout3;
                            l2Var3 = l2Var4;
                            i12 = i13;
                            ns0Var3 = ns0Var4;
                            g1Var4 = g1Var3;
                            z14 = true;
                        }
                        ns0Var = ns0Var3;
                        l2Var = l2Var3;
                        g1Var = g1Var4;
                        str = null;
                        int i17 = R.drawable.msg_addfolder;
                        String string = LocaleController.getString(R.string.Gift2AddToCollection);
                        gi.g2 g2Var = new gi.g2(I, J, 11);
                        z10 = false;
                        I.c(i17, string, g2Var, false);
                        I.k();
                    } else {
                        ns0Var = ns0Var3;
                        l2Var = l2Var3;
                        g1Var = g1Var4;
                        z10 = false;
                        str = null;
                    }
                    if (savedStarGift.gift instanceof TL_stars.TL_starGiftUnique) {
                        if (ns0Var.c() && !l2Var.d && (!savedStarGift.unsaved || !savedStarGift.pinned_to_top)) {
                            boolean z15 = savedStarGift.pinned_to_top;
                            v9Var = v9Var2;
                            l2Var2 = l2Var;
                            ns0Var2 = ns0Var;
                            g1Var2 = g1Var;
                            I.c(z15 ? R.drawable.msg_unpin : R.drawable.msg_pin, LocaleController.getString(z15 ? R.string.Gift2Unpin : R.string.Gift2Pin), new si.o(l2Var2, savedStarGift, g1Var2, view, 2), z10);
                            I.l(R.drawable.tabs_reorder, LocaleController.getString(R.string.Gift2Reorder), new a2(l2Var2, 0), savedStarGift.pinned_to_top);
                        } else {
                            v9Var = v9Var2;
                            l2Var2 = l2Var;
                            ns0Var2 = ns0Var;
                            g1Var2 = g1Var;
                            if (ns0Var2.c() && l2Var2.d) {
                                I.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.Gift2Reorder), new a2(l2Var2, 1), z10);
                            }
                        }
                        TL_stars.StarGift starGift = savedStarGift.gift;
                        TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
                        if (starGift.slug != null) {
                            str2 = MessagesController.getInstance(i10).linkPrefix + "/nft/" + savedStarGift.gift.slug;
                        } else {
                            str2 = str;
                        }
                        if (l7.i2(i10, DialogObject.getPeerDialogId(tL_starGiftUnique.owner_id))) {
                            boolean j22 = l7.j2(i10, tL_starGiftUnique);
                            I.c(j22 ? R.drawable.menu_takeoff : R.drawable.menu_wear, LocaleController.getString(j22 ? R.string.Gift2Unwear : R.string.Gift2Wear), new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r3) {
                                        case 0:
                                            l2 l2Var5 = l2Var2;
                                            k2 k2Var = new k2(l2Var5, l2Var5.getContext(), l2Var5.f50826b, l2Var5.f50825a.f50926c, l2Var5.f50827c, 0);
                                            k2Var.L2(savedStarGift, null);
                                            k2Var.V2(false);
                                            return;
                                        case 1:
                                            l2 l2Var6 = l2Var2;
                                            k2 k2Var2 = new k2(l2Var6, l2Var6.getContext(), l2Var6.f50826b, l2Var6.f50825a.f50926c, l2Var6.f50827c, 1);
                                            k2Var2.L2(savedStarGift, null);
                                            k2Var2.m2();
                                            return;
                                        default:
                                            l2 l2Var7 = l2Var2;
                                            k2 k2Var3 = new k2(l2Var7, l2Var7.getContext(), l2Var7.f50826b, l2Var7.f50825a.f50926c, l2Var7.f50827c, 2);
                                            k2Var3.L2(savedStarGift, null);
                                            k2Var3.w2();
                                            return;
                                    }
                                }
                            }, z10);
                        }
                        I.l(R.drawable.msg_link2, LocaleController.getString(R.string.CopyLink), new u2.k0(21, l2Var2, str2), str2 != null ? true : z10);
                        I.l(R.drawable.msg_share, LocaleController.getString(R.string.ShareFile), new Runnable() {
                            @Override
                            public final void run() {
                                switch (r3) {
                                    case 0:
                                        l2 l2Var5 = l2Var2;
                                        k2 k2Var = new k2(l2Var5, l2Var5.getContext(), l2Var5.f50826b, l2Var5.f50825a.f50926c, l2Var5.f50827c, 0);
                                        k2Var.L2(savedStarGift, null);
                                        k2Var.V2(false);
                                        return;
                                    case 1:
                                        l2 l2Var6 = l2Var2;
                                        k2 k2Var2 = new k2(l2Var6, l2Var6.getContext(), l2Var6.f50826b, l2Var6.f50825a.f50926c, l2Var6.f50827c, 1);
                                        k2Var2.L2(savedStarGift, null);
                                        k2Var2.m2();
                                        return;
                                    default:
                                        l2 l2Var7 = l2Var2;
                                        k2 k2Var3 = new k2(l2Var7, l2Var7.getContext(), l2Var7.f50826b, l2Var7.f50825a.f50926c, l2Var7.f50827c, 2);
                                        k2Var3.L2(savedStarGift, null);
                                        k2Var3.w2();
                                        return;
                                }
                            }
                        }, str2 != null ? true : z10);
                    } else {
                        v9Var = v9Var2;
                        l2Var2 = l2Var;
                        ns0Var2 = ns0Var;
                        g1Var2 = g1Var;
                        if (ns0Var2.c() && l2Var2.d) {
                            I.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.Gift2Reorder), new a2(l2Var2, 3), z10);
                        }
                    }
                    if (l7.i2(i10, ns0Var2.f50926c)) {
                        boolean z16 = savedStarGift.unsaved;
                        I.c(z16 ? R.drawable.msg_message : R.drawable.menu_hide_gift, LocaleController.getString(z16 ? R.string.Gift2ShowGift : R.string.Gift2HideGift), new s1(l2Var2, savedStarGift, g1Var2, 2), z10);
                    }
                    TL_stars.StarGift starGift2 = savedStarGift.gift;
                    if (starGift2 instanceof TL_stars.TL_starGiftUnique) {
                        I.l(R.drawable.menu_transfer, LocaleController.getString(R.string.Gift2TransferOption), new Runnable() {
                            @Override
                            public final void run() {
                                switch (r3) {
                                    case 0:
                                        l2 l2Var5 = l2Var2;
                                        k2 k2Var = new k2(l2Var5, l2Var5.getContext(), l2Var5.f50826b, l2Var5.f50825a.f50926c, l2Var5.f50827c, 0);
                                        k2Var.L2(savedStarGift, null);
                                        k2Var.V2(false);
                                        return;
                                    case 1:
                                        l2 l2Var6 = l2Var2;
                                        k2 k2Var2 = new k2(l2Var6, l2Var6.getContext(), l2Var6.f50826b, l2Var6.f50825a.f50926c, l2Var6.f50827c, 1);
                                        k2Var2.L2(savedStarGift, null);
                                        k2Var2.m2();
                                        return;
                                    default:
                                        l2 l2Var7 = l2Var2;
                                        k2 k2Var3 = new k2(l2Var7, l2Var7.getContext(), l2Var7.f50826b, l2Var7.f50825a.f50926c, l2Var7.f50827c, 2);
                                        k2Var3.L2(savedStarGift, null);
                                        k2Var3.w2();
                                        return;
                                }
                            }
                        }, DialogObject.getPeerDialogId(((TL_stars.TL_starGiftUnique) starGift2).owner_id) == UserConfig.getInstance(i10).getClientUserId() ? true : z10);
                    }
                    if (v9Var.h() && l2Var2.d) {
                        int i18 = R.drawable.msg_removefolder;
                        String string2 = LocaleController.getString(R.string.Gift2RemoveFromCollection);
                        s1 s1Var = new s1(l2Var2, savedStarGift, I, 1);
                        z11 = true;
                        I.c(i18, string2, s1Var, true);
                        I.E();
                        I.t();
                    } else {
                        z11 = true;
                    }
                    if (I.x() > 0) {
                        I.V(5);
                        I.f27582u = z11;
                        I.v = z11;
                        I.L = z11;
                        Point point = AndroidUtilities.displaySize;
                        int min = Math.min(point.x, point.y);
                        I.N = min - AndroidUtilities.dp(32.0f);
                        I.O = (int) (min * 0.6f);
                        I.P = z11;
                        I.W = z11;
                        I.Z();
                        g1Var2.f50732y.getImageReceiver().startAnimation(z11);
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
