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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.bb0;
import org.telegram.ui.Components.j51;
import org.telegram.ui.Components.n70;
import org.telegram.ui.Components.o5;
import org.telegram.ui.Components.or0;
import org.telegram.ui.Components.vc;
import org.telegram.ui.hs0;
import org.telegram.ui.yx;
import w7.x5;
import yh.m5;
import yh.v5;
public final class h2 implements Utilities.Callback5, Utilities.Callback5Return {
    public final n2 f45915a;

    public h2(n2 n2Var) {
        this.f45915a = n2Var;
    }

    @Override
    public void mo17run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        j51 j51Var = (j51) obj;
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        n2 n2Var = this.f45915a;
        or0 or0Var = n2Var.f46057a;
        int i10 = n2Var.f46058b;
        if (n2Var.e == null) {
            return;
        }
        Object obj6 = j51Var.G;
        if (obj6 instanceof TL_stars.SavedStarGift) {
            TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj6;
            if (n2Var.f46061n) {
                if (!n2Var.d && (savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) {
                    boolean z10 = savedStarGift.pinned_to_top;
                    boolean z11 = !z10;
                    if (!z10 && savedStarGift.unsaved) {
                        savedStarGift.unsaved = false;
                        TL_stars.saveStarGift savestargift = new TL_stars.saveStarGift();
                        savestargift.stargift = n2Var.e.g(savedStarGift);
                        savestargift.unsave = savedStarGift.unsaved;
                        ConnectionsManager.getInstance(i10).sendRequest(savestargift, null, 64);
                    }
                    if (n2Var.e.m(savedStarGift, z11, true)) {
                        vc.a0(or0Var.f46128a).Q(R.raw.chats_infotip, 36, LocaleController.formatPluralStringComma("GiftsPinLimit", MessagesController.getInstance(i10).stargiftsPinnedToTopLimit)).j();
                    }
                    if (z10) {
                        return;
                    }
                    n2Var.f46060f.v0(0);
                    return;
                }
                return;
            }
            yh.a4 a4Var = new yh.a4(n2Var.getContext(), n2Var.f46058b, or0Var.f46130c, n2Var.f46059c, null);
            a4Var.f46975d1 = new c2(n2Var, 2);
            a4Var.O0 = new tg.d(11, n2Var, savedStarGift);
            a4Var.j2(savedStarGift, n2Var.e);
            a4Var.show();
        }
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        n2 n2Var;
        or0 or0Var;
        i1 i1Var;
        m5 m5Var;
        String str;
        final n2 n2Var2;
        or0 or0Var2;
        i1 i1Var2;
        boolean z10;
        boolean z11;
        String str2;
        LinearLayout linearLayout;
        boolean z12;
        f6 f6Var;
        Object obj6;
        j51 j51Var = (j51) obj;
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        n2 n2Var3 = this.f45915a;
        f6 f6Var2 = n2Var3.f46059c;
        int i10 = n2Var3.f46058b;
        or0 or0Var3 = n2Var3.f46057a;
        boolean z13 = false;
        if (n2Var3.e != null) {
            if (view instanceof i1) {
                Object obj7 = j51Var.G;
                if (obj7 instanceof TL_stars.SavedStarGift) {
                    i1 i1Var3 = (i1) view;
                    final TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj7;
                    org.telegram.ui.ActionBar.o2 o2Var = or0Var3.f46128a;
                    m5 m5Var2 = or0Var3.e;
                    n70 I = n70.I(o2Var, view);
                    or0Var3.I = I;
                    if (m5Var2.h()) {
                        if (!n2Var3.d) {
                            m5Var2.d().size();
                        }
                        n70 J = I.J();
                        J.c(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new ii.h(I, 2), false);
                        J.k();
                        yx yxVar = new yx(n2Var3.getContext(), 2);
                        LinearLayout linearLayout2 = new LinearLayout(n2Var3.getContext());
                        yxVar.addView(linearLayout2);
                        linearLayout2.setOrientation(1);
                        J.r(yxVar, x5.n(-1, -2));
                        if (m5Var2.d().size() + 1 < MessagesController.getInstance(i10).config.stargiftsCollectionsLimit.get()) {
                            org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(0, n2Var3.getContext(), n2Var3.f46059c, false, false);
                            g1Var.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
                            int i11 = j6.E8;
                            g1Var.c(j6.v0(i11, f6Var2), j6.v0(j6.F8, f6Var2));
                            g1Var.setSelectorColor(j6.l1(0.12f, j6.v0(i11, f6Var2)));
                            g1Var.g(LocaleController.getString(R.string.Gift2NewCollection), R.drawable.menu_folder_add, null);
                            g1Var.setOnClickListener(new xg.e(n2Var3, I, savedStarGift, 5));
                            linearLayout2.addView(g1Var, x5.n(-1, -2));
                        }
                        ArrayList d = m5Var2.d();
                        int size = d.size();
                        int i12 = 0;
                        while (i12 < size) {
                            int i13 = i12 + 1;
                            TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) d.get(i12);
                            ArrayList arrayList = m5Var2.e(tL_starGiftCollection.collection_id).f47521l;
                            or0 or0Var4 = or0Var3;
                            int size2 = arrayList.size();
                            i1 i1Var4 = i1Var3;
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
                                if (v5.k((TL_stars.SavedStarGift) obj8, savedStarGift)) {
                                    linearLayout = linearLayout2;
                                    z12 = true;
                                    break;
                                }
                                size2 = i15;
                            }
                            org.telegram.ui.ActionBar.g1 g1Var2 = new org.telegram.ui.ActionBar.g1(2, n2Var3.getContext(), n2Var3.f46059c, false, false);
                            g1Var2.setChecked(z12);
                            n2 n2Var4 = n2Var3;
                            LinearLayout linearLayout3 = linearLayout;
                            g1Var2.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
                            int i16 = j6.E8;
                            g1Var2.c(j6.v0(i16, f6Var2), j6.v0(j6.F8, f6Var2));
                            g1Var2.setSelectorColor(j6.l1(0.12f, j6.v0(i16, f6Var2)));
                            if (tL_starGiftCollection.icon != null) {
                                o5 o5Var = new o5(3, i10, tL_starGiftCollection.icon);
                                f6Var = f6Var2;
                                g1Var2.getImageView().addOnAttachStateChangeListener(new ai.u2(o5Var, 4));
                                g1Var2.g(tL_starGiftCollection.title, 0, o5Var);
                                obj6 = null;
                            } else {
                                f6Var = f6Var2;
                                obj6 = null;
                                g1Var2.g(tL_starGiftCollection.title, R.drawable.msg_folders, null);
                            }
                            m5 m5Var3 = m5Var2;
                            g1Var2.setOnClickListener(new bb0(n2Var4, z12, tL_starGiftCollection, savedStarGift, I, 1));
                            linearLayout3.addView(g1Var2, x5.n(-1, -2));
                            linearLayout2 = linearLayout3;
                            n2Var3 = n2Var4;
                            or0Var3 = or0Var4;
                            i12 = i13;
                            i1Var3 = i1Var4;
                            m5Var2 = m5Var3;
                            size = size;
                            f6Var2 = f6Var;
                        }
                        n2Var = n2Var3;
                        or0Var = or0Var3;
                        i1Var = i1Var3;
                        m5Var = m5Var2;
                        str = null;
                        I.c(R.drawable.msg_addfolder, LocaleController.getString(R.string.Gift2AddToCollection), new ei.m2(I, J, 11), false);
                        I.k();
                    } else {
                        n2Var = n2Var3;
                        or0Var = or0Var3;
                        i1Var = i1Var3;
                        m5Var = m5Var2;
                        str = null;
                    }
                    if (savedStarGift.gift instanceof TL_stars.TL_starGiftUnique) {
                        if (or0Var.c() && !n2Var.d && (!savedStarGift.unsaved || !savedStarGift.pinned_to_top)) {
                            boolean z14 = savedStarGift.pinned_to_top;
                            n2Var2 = n2Var;
                            or0Var2 = or0Var;
                            i1Var2 = i1Var;
                            z10 = false;
                            I.c(z14 ? R.drawable.msg_unpin : R.drawable.msg_pin, LocaleController.getString(z14 ? R.string.Gift2Unpin : R.string.Gift2Pin), new hs0(n2Var2, savedStarGift, i1Var2, view, 26), false);
                            I.l(R.drawable.tabs_reorder, LocaleController.getString(R.string.Gift2Reorder), new c2(n2Var2, 0), savedStarGift.pinned_to_top);
                        } else {
                            n2Var2 = n2Var;
                            or0Var2 = or0Var;
                            i1Var2 = i1Var;
                            z10 = false;
                            if (or0Var2.c() && n2Var2.d) {
                                I.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.Gift2Reorder), new c2(n2Var2, 1), false);
                            }
                        }
                        TL_stars.StarGift starGift = savedStarGift.gift;
                        TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
                        if (starGift.slug != null) {
                            str2 = MessagesController.getInstance(i10).linkPrefix + "/nft/" + savedStarGift.gift.slug;
                        } else {
                            str2 = str;
                        }
                        if (yh.a4.O1(i10, DialogObject.getPeerDialogId(tL_starGiftUnique.owner_id))) {
                            boolean P1 = yh.a4.P1(i10, tL_starGiftUnique);
                            I.c(P1 ? R.drawable.menu_takeoff : R.drawable.menu_wear, LocaleController.getString(P1 ? R.string.Gift2Unwear : R.string.Gift2Wear), new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r3) {
                                        case 0:
                                            n2 n2Var5 = n2Var2;
                                            m2 m2Var = new m2(n2Var5, n2Var5.getContext(), n2Var5.f46058b, n2Var5.f46057a.f46130c, n2Var5.f46059c, 0);
                                            m2Var.j2(savedStarGift, null);
                                            m2Var.r2(false);
                                            return;
                                        case 1:
                                            n2 n2Var6 = n2Var2;
                                            m2 m2Var2 = new m2(n2Var6, n2Var6.getContext(), n2Var6.f46058b, n2Var6.f46057a.f46130c, n2Var6.f46059c, 1);
                                            m2Var2.j2(savedStarGift, null);
                                            m2Var2.S1();
                                            return;
                                        default:
                                            n2 n2Var7 = n2Var2;
                                            m2 m2Var3 = new m2(n2Var7, n2Var7.getContext(), n2Var7.f46058b, n2Var7.f46057a.f46130c, n2Var7.f46059c, 2);
                                            m2Var3.j2(savedStarGift, null);
                                            m2Var3.Y1();
                                            return;
                                    }
                                }
                            }, z10);
                        }
                        I.l(R.drawable.msg_link2, LocaleController.getString(R.string.CopyLink), new uh.i(7, n2Var2, str2), str2 != null);
                        I.l(R.drawable.msg_share, LocaleController.getString(R.string.ShareFile), new Runnable() {
                            @Override
                            public final void run() {
                                switch (r3) {
                                    case 0:
                                        n2 n2Var5 = n2Var2;
                                        m2 m2Var = new m2(n2Var5, n2Var5.getContext(), n2Var5.f46058b, n2Var5.f46057a.f46130c, n2Var5.f46059c, 0);
                                        m2Var.j2(savedStarGift, null);
                                        m2Var.r2(false);
                                        return;
                                    case 1:
                                        n2 n2Var6 = n2Var2;
                                        m2 m2Var2 = new m2(n2Var6, n2Var6.getContext(), n2Var6.f46058b, n2Var6.f46057a.f46130c, n2Var6.f46059c, 1);
                                        m2Var2.j2(savedStarGift, null);
                                        m2Var2.S1();
                                        return;
                                    default:
                                        n2 n2Var7 = n2Var2;
                                        m2 m2Var3 = new m2(n2Var7, n2Var7.getContext(), n2Var7.f46058b, n2Var7.f46057a.f46130c, n2Var7.f46059c, 2);
                                        m2Var3.j2(savedStarGift, null);
                                        m2Var3.Y1();
                                        return;
                                }
                            }
                        }, str2 != null);
                    } else {
                        n2Var2 = n2Var;
                        or0Var2 = or0Var;
                        i1Var2 = i1Var;
                        z10 = false;
                        if (or0Var2.c() && n2Var2.d) {
                            I.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.Gift2Reorder), new c2(n2Var2, 3), false);
                        }
                    }
                    if (yh.a4.O1(i10, or0Var2.f46130c)) {
                        boolean z15 = savedStarGift.unsaved;
                        I.c(z15 ? R.drawable.msg_message : R.drawable.menu_hide_gift, LocaleController.getString(z15 ? R.string.Gift2ShowGift : R.string.Gift2HideGift), new w9.v(n2Var2, savedStarGift, i1Var2, 3), z10);
                    }
                    TL_stars.StarGift starGift2 = savedStarGift.gift;
                    if (starGift2 instanceof TL_stars.TL_starGiftUnique) {
                        I.l(R.drawable.menu_transfer, LocaleController.getString(R.string.Gift2TransferOption), new Runnable() {
                            @Override
                            public final void run() {
                                switch (r3) {
                                    case 0:
                                        n2 n2Var5 = n2Var2;
                                        m2 m2Var = new m2(n2Var5, n2Var5.getContext(), n2Var5.f46058b, n2Var5.f46057a.f46130c, n2Var5.f46059c, 0);
                                        m2Var.j2(savedStarGift, null);
                                        m2Var.r2(false);
                                        return;
                                    case 1:
                                        n2 n2Var6 = n2Var2;
                                        m2 m2Var2 = new m2(n2Var6, n2Var6.getContext(), n2Var6.f46058b, n2Var6.f46057a.f46130c, n2Var6.f46059c, 1);
                                        m2Var2.j2(savedStarGift, null);
                                        m2Var2.S1();
                                        return;
                                    default:
                                        n2 n2Var7 = n2Var2;
                                        m2 m2Var3 = new m2(n2Var7, n2Var7.getContext(), n2Var7.f46058b, n2Var7.f46057a.f46130c, n2Var7.f46059c, 2);
                                        m2Var3.j2(savedStarGift, null);
                                        m2Var3.Y1();
                                        return;
                                }
                            }
                        }, DialogObject.getPeerDialogId(((TL_stars.TL_starGiftUnique) starGift2).owner_id) == UserConfig.getInstance(i10).getClientUserId());
                    }
                    if (m5Var.h() && n2Var2.d) {
                        z11 = true;
                        I.c(R.drawable.msg_removefolder, LocaleController.getString(R.string.Gift2RemoveFromCollection), new w9.v(n2Var2, savedStarGift, I, 2), true);
                        I.E();
                        I.t();
                    } else {
                        z11 = true;
                    }
                    if (I.x() > 0) {
                        I.V(5);
                        I.f26386u = z11;
                        I.v = z11;
                        I.L = z11;
                        Point point = AndroidUtilities.displaySize;
                        int min = Math.min(point.x, point.y);
                        I.N = min - AndroidUtilities.dp(32.0f);
                        I.O = (int) (min * 0.6f);
                        I.P = z11;
                        I.W = z11;
                        I.Z();
                        i1Var2.f45948y.getImageReceiver().startAnimation(z11);
                        z13 = true;
                    }
                    z13 = false;
                }
            }
            z13 = false;
        }
        return Boolean.valueOf(z13);
    }
}
