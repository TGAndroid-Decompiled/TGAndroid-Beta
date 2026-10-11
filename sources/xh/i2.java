package xh;

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
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.cc0;
import org.telegram.ui.Components.p80;
import org.telegram.ui.Components.q61;
import org.telegram.ui.Components.s5;
import org.telegram.ui.Components.ss0;
import org.telegram.ui.ds0;
import org.telegram.ui.ux;
import w7.x5;
import yh.d5;
import yh.n5;
public final class i2 implements Utilities.Callback5, Utilities.Callback5Return {
    public final o2 f51401a;

    public i2(o2 o2Var) {
        this.f51401a = o2Var;
    }

    @Override
    public void mo16run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        q61 q61Var = (q61) obj;
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        o2 o2Var = this.f51401a;
        ss0 ss0Var = o2Var.f51556a;
        int i10 = o2Var.f51557b;
        if (o2Var.f51559e == null) {
            return;
        }
        Object obj6 = q61Var.G;
        if (obj6 instanceof TL_stars.SavedStarGift) {
            TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj6;
            if (o2Var.f51561n) {
                if (!o2Var.d && (savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) {
                    boolean z10 = savedStarGift.pinned_to_top;
                    boolean z11 = !z10;
                    if (!z10 && savedStarGift.unsaved) {
                        savedStarGift.unsaved = false;
                        TL_stars.saveStarGift savestargift = new TL_stars.saveStarGift();
                        savestargift.stargift = o2Var.f51559e.g(savedStarGift);
                        savestargift.unsave = savedStarGift.unsaved;
                        ConnectionsManager.getInstance(i10).sendRequest(savestargift, null, 64);
                    }
                    if (o2Var.f51559e.m(savedStarGift, z11, true)) {
                        ad.a0(ss0Var.f51632a).Q(R.raw.chats_infotip, 36, LocaleController.formatPluralStringComma("GiftsPinLimit", MessagesController.getInstance(i10).stargiftsPinnedToTopLimit)).j();
                    }
                    if (z10) {
                        return;
                    }
                    o2Var.f51560f.u0(0);
                    return;
                }
                return;
            }
            yh.s3 s3Var = new yh.s3(o2Var.getContext(), o2Var.f51557b, ss0Var.f51634c, o2Var.f51558c, null);
            s3Var.f53289e1 = new d2(o2Var, 2);
            s3Var.P0 = new q9.p(18, o2Var, savedStarGift);
            s3Var.l2(savedStarGift, o2Var.f51559e);
            s3Var.show();
        }
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean z10;
        o2 o2Var;
        ss0 ss0Var;
        j1 j1Var;
        d5 d5Var;
        String str;
        final o2 o2Var2;
        ss0 ss0Var2;
        j1 j1Var2;
        boolean z11;
        String str2;
        LinearLayout linearLayout;
        boolean z12;
        d6 d6Var;
        Object obj6;
        q61 q61Var = (q61) obj;
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        o2 o2Var3 = this.f51401a;
        d6 d6Var2 = o2Var3.f51558c;
        int i10 = o2Var3.f51557b;
        ss0 ss0Var3 = o2Var3.f51556a;
        boolean z13 = false;
        if (o2Var3.f51559e != null) {
            if (view instanceof j1) {
                Object obj7 = q61Var.G;
                if (obj7 instanceof TL_stars.SavedStarGift) {
                    j1 j1Var3 = (j1) view;
                    final TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj7;
                    org.telegram.ui.ActionBar.m2 m2Var = ss0Var3.f51632a;
                    d5 d5Var2 = ss0Var3.f51635e;
                    p80 I = p80.I(m2Var, view);
                    ss0Var3.I = I;
                    if (d5Var2.h()) {
                        if (!o2Var3.d) {
                            d5Var2.d().size();
                        }
                        p80 J = I.J();
                        J.c(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new ii.h(I, 2), false);
                        J.k();
                        ux uxVar = new ux(o2Var3.getContext(), 4);
                        LinearLayout linearLayout2 = new LinearLayout(o2Var3.getContext());
                        uxVar.addView(linearLayout2);
                        linearLayout2.setOrientation(1);
                        boolean z14 = true;
                        J.r(uxVar, x5.n(-1, -2));
                        if (d5Var2.d().size() + 1 < MessagesController.getInstance(i10).config.stargiftsCollectionsLimit.get()) {
                            org.telegram.ui.ActionBar.e1 e1Var = new org.telegram.ui.ActionBar.e1(0, o2Var3.getContext(), o2Var3.f51558c, false, false);
                            e1Var.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
                            int i11 = h6.E8;
                            e1Var.c(h6.w0(i11, d6Var2), h6.w0(h6.F8, d6Var2));
                            e1Var.setSelectorColor(h6.m1(0.12f, h6.w0(i11, d6Var2)));
                            e1Var.g(LocaleController.getString(R.string.Gift2NewCollection), R.drawable.menu_folder_add, null);
                            e1Var.setOnClickListener(new xg.e(o2Var3, I, savedStarGift, 5));
                            linearLayout2.addView(e1Var, x5.n(-1, -2));
                        }
                        ArrayList d = d5Var2.d();
                        int size = d.size();
                        int i12 = 0;
                        while (i12 < size) {
                            int i13 = i12 + 1;
                            TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) d.get(i12);
                            ArrayList arrayList = d5Var2.e(tL_starGiftCollection.collection_id).f52640l;
                            ss0 ss0Var4 = ss0Var3;
                            int size2 = arrayList.size();
                            j1 j1Var4 = j1Var3;
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
                            org.telegram.ui.ActionBar.e1 e1Var2 = new org.telegram.ui.ActionBar.e1(2, o2Var3.getContext(), o2Var3.f51558c, false, false);
                            e1Var2.setChecked(z12);
                            o2 o2Var4 = o2Var3;
                            LinearLayout linearLayout3 = linearLayout;
                            e1Var2.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
                            int i16 = h6.E8;
                            e1Var2.c(h6.w0(i16, d6Var2), h6.w0(h6.F8, d6Var2));
                            e1Var2.setSelectorColor(h6.m1(0.12f, h6.w0(i16, d6Var2)));
                            if (tL_starGiftCollection.icon != null) {
                                s5 s5Var = new s5(3, i10, tL_starGiftCollection.icon);
                                d6Var = d6Var2;
                                e1Var2.getImageView().addOnAttachStateChangeListener(new ai.v2(s5Var, 4));
                                e1Var2.g(tL_starGiftCollection.title, 0, s5Var);
                                obj6 = null;
                            } else {
                                d6Var = d6Var2;
                                obj6 = null;
                                e1Var2.g(tL_starGiftCollection.title, R.drawable.msg_folders, null);
                            }
                            d5 d5Var3 = d5Var2;
                            e1Var2.setOnClickListener(new cc0(o2Var4, z12, tL_starGiftCollection, savedStarGift, I, 1));
                            linearLayout3.addView(e1Var2, x5.n(-1, -2));
                            linearLayout2 = linearLayout3;
                            o2Var3 = o2Var4;
                            ss0Var3 = ss0Var4;
                            i12 = i13;
                            j1Var3 = j1Var4;
                            d5Var2 = d5Var3;
                            z14 = true;
                            size = size;
                            d6Var2 = d6Var;
                        }
                        o2Var = o2Var3;
                        ss0Var = ss0Var3;
                        j1Var = j1Var3;
                        d5Var = d5Var2;
                        str = null;
                        z13 = false;
                        I.c(R.drawable.msg_addfolder, LocaleController.getString(R.string.Gift2AddToCollection), new ei.m2(I, J, 11), false);
                        I.k();
                    } else {
                        o2Var = o2Var3;
                        ss0Var = ss0Var3;
                        j1Var = j1Var3;
                        d5Var = d5Var2;
                        str = null;
                    }
                    if (savedStarGift.gift instanceof TL_stars.TL_starGiftUnique) {
                        if (ss0Var.c() && !o2Var.d && (!savedStarGift.unsaved || !savedStarGift.pinned_to_top)) {
                            boolean z15 = savedStarGift.pinned_to_top;
                            o2Var2 = o2Var;
                            ss0Var2 = ss0Var;
                            j1Var2 = j1Var;
                            z10 = z13;
                            I.c(z15 ? R.drawable.msg_unpin : R.drawable.msg_pin, LocaleController.getString(z15 ? R.string.Gift2Unpin : R.string.Gift2Pin), new ds0(o2Var2, savedStarGift, j1Var2, view, 27), z10);
                            I.l(R.drawable.tabs_reorder, LocaleController.getString(R.string.Gift2Reorder), new d2(o2Var2, 0), savedStarGift.pinned_to_top);
                        } else {
                            o2Var2 = o2Var;
                            ss0Var2 = ss0Var;
                            j1Var2 = j1Var;
                            z10 = z13;
                            if (ss0Var2.c() && o2Var2.d) {
                                I.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.Gift2Reorder), new d2(o2Var2, 1), z10);
                            }
                        }
                        TL_stars.StarGift starGift = savedStarGift.gift;
                        TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
                        if (starGift.slug != null) {
                            str2 = MessagesController.getInstance(i10).linkPrefix + "/nft/" + savedStarGift.gift.slug;
                        } else {
                            str2 = str;
                        }
                        if (yh.s3.P1(i10, DialogObject.getPeerDialogId(tL_starGiftUnique.owner_id))) {
                            boolean Q1 = yh.s3.Q1(i10, tL_starGiftUnique);
                            I.c(Q1 ? R.drawable.menu_takeoff : R.drawable.menu_wear, LocaleController.getString(Q1 ? R.string.Gift2Unwear : R.string.Gift2Wear), new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r3) {
                                        case 0:
                                            o2 o2Var5 = o2Var2;
                                            n2 n2Var = new n2(o2Var5, o2Var5.getContext(), o2Var5.f51557b, o2Var5.f51556a.f51634c, o2Var5.f51558c, 0);
                                            n2Var.l2(savedStarGift, null);
                                            n2Var.t2(false);
                                            return;
                                        case 1:
                                            o2 o2Var6 = o2Var2;
                                            n2 n2Var2 = new n2(o2Var6, o2Var6.getContext(), o2Var6.f51557b, o2Var6.f51556a.f51634c, o2Var6.f51558c, 1);
                                            n2Var2.l2(savedStarGift, null);
                                            n2Var2.T1();
                                            return;
                                        default:
                                            o2 o2Var7 = o2Var2;
                                            n2 n2Var3 = new n2(o2Var7, o2Var7.getContext(), o2Var7.f51557b, o2Var7.f51556a.f51634c, o2Var7.f51558c, 2);
                                            n2Var3.l2(savedStarGift, null);
                                            n2Var3.Z1();
                                            return;
                                    }
                                }
                            }, z10);
                        }
                        I.l(R.drawable.msg_link2, LocaleController.getString(R.string.CopyLink), new tg.c1(14, o2Var2, str2), str2 != null ? true : z10);
                        I.l(R.drawable.msg_share, LocaleController.getString(R.string.ShareFile), new Runnable() {
                            @Override
                            public final void run() {
                                switch (r3) {
                                    case 0:
                                        o2 o2Var5 = o2Var2;
                                        n2 n2Var = new n2(o2Var5, o2Var5.getContext(), o2Var5.f51557b, o2Var5.f51556a.f51634c, o2Var5.f51558c, 0);
                                        n2Var.l2(savedStarGift, null);
                                        n2Var.t2(false);
                                        return;
                                    case 1:
                                        o2 o2Var6 = o2Var2;
                                        n2 n2Var2 = new n2(o2Var6, o2Var6.getContext(), o2Var6.f51557b, o2Var6.f51556a.f51634c, o2Var6.f51558c, 1);
                                        n2Var2.l2(savedStarGift, null);
                                        n2Var2.T1();
                                        return;
                                    default:
                                        o2 o2Var7 = o2Var2;
                                        n2 n2Var3 = new n2(o2Var7, o2Var7.getContext(), o2Var7.f51557b, o2Var7.f51556a.f51634c, o2Var7.f51558c, 2);
                                        n2Var3.l2(savedStarGift, null);
                                        n2Var3.Z1();
                                        return;
                                }
                            }
                        }, str2 != null ? true : z10);
                    } else {
                        o2Var2 = o2Var;
                        ss0Var2 = ss0Var;
                        j1Var2 = j1Var;
                        z10 = z13;
                        if (ss0Var2.c() && o2Var2.d) {
                            I.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.Gift2Reorder), new d2(o2Var2, 3), z10);
                        }
                    }
                    if (yh.s3.P1(i10, ss0Var2.f51634c)) {
                        boolean z16 = savedStarGift.unsaved;
                        I.c(z16 ? R.drawable.msg_message : R.drawable.menu_hide_gift, LocaleController.getString(z16 ? R.string.Gift2ShowGift : R.string.Gift2HideGift), new pi.h(o2Var2, savedStarGift, j1Var2, 10), z10);
                    }
                    TL_stars.StarGift starGift2 = savedStarGift.gift;
                    if (starGift2 instanceof TL_stars.TL_starGiftUnique) {
                        I.l(R.drawable.menu_transfer, LocaleController.getString(R.string.Gift2TransferOption), new Runnable() {
                            @Override
                            public final void run() {
                                switch (r3) {
                                    case 0:
                                        o2 o2Var5 = o2Var2;
                                        n2 n2Var = new n2(o2Var5, o2Var5.getContext(), o2Var5.f51557b, o2Var5.f51556a.f51634c, o2Var5.f51558c, 0);
                                        n2Var.l2(savedStarGift, null);
                                        n2Var.t2(false);
                                        return;
                                    case 1:
                                        o2 o2Var6 = o2Var2;
                                        n2 n2Var2 = new n2(o2Var6, o2Var6.getContext(), o2Var6.f51557b, o2Var6.f51556a.f51634c, o2Var6.f51558c, 1);
                                        n2Var2.l2(savedStarGift, null);
                                        n2Var2.T1();
                                        return;
                                    default:
                                        o2 o2Var7 = o2Var2;
                                        n2 n2Var3 = new n2(o2Var7, o2Var7.getContext(), o2Var7.f51557b, o2Var7.f51556a.f51634c, o2Var7.f51558c, 2);
                                        n2Var3.l2(savedStarGift, null);
                                        n2Var3.Z1();
                                        return;
                                }
                            }
                        }, DialogObject.getPeerDialogId(((TL_stars.TL_starGiftUnique) starGift2).owner_id) == UserConfig.getInstance(i10).getClientUserId() ? true : z10);
                    }
                    if (d5Var.h() && o2Var2.d) {
                        z11 = true;
                        I.c(R.drawable.msg_removefolder, LocaleController.getString(R.string.Gift2RemoveFromCollection), new pi.h(o2Var2, savedStarGift, I, 9), true);
                        I.E();
                        I.t();
                    } else {
                        z11 = true;
                    }
                    if (I.x() > 0) {
                        I.V(5);
                        I.f29781u = z11;
                        I.v = z11;
                        I.L = z11;
                        Point point = AndroidUtilities.displaySize;
                        int min = Math.min(point.x, point.y);
                        I.N = min - AndroidUtilities.dp(32.0f);
                        I.O = (int) (min * 0.6f);
                        I.P = z11;
                        I.W = z11;
                        I.Z();
                        j1Var2.f51438y.getImageReceiver().startAnimation(z11);
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
