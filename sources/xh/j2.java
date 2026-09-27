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
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.a80;
import org.telegram.ui.Components.bs0;
import org.telegram.ui.Components.nb0;
import org.telegram.ui.Components.q5;
import org.telegram.ui.Components.x51;
import org.telegram.ui.Components.xc;
import org.telegram.ui.sx;
import org.telegram.ui.zr0;
import w7.y5;
import yh.j5;
import yh.s5;
public final class j2 implements Utilities.Callback5, Utilities.Callback5Return {
    public final p2 f46283a;

    public j2(p2 p2Var) {
        this.f46283a = p2Var;
    }

    @Override
    public void mo17run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        x51 x51Var = (x51) obj;
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        p2 p2Var = this.f46283a;
        bs0 bs0Var = p2Var.f46405a;
        int i10 = p2Var.f46406b;
        if (p2Var.e == null) {
            return;
        }
        Object obj6 = x51Var.G;
        if (obj6 instanceof TL_stars.SavedStarGift) {
            TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj6;
            if (p2Var.f46409n) {
                if (!p2Var.d && (savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) {
                    boolean z10 = savedStarGift.pinned_to_top;
                    boolean z11 = !z10;
                    if (!z10 && savedStarGift.unsaved) {
                        savedStarGift.unsaved = false;
                        TL_stars.saveStarGift savestargift = new TL_stars.saveStarGift();
                        savestargift.stargift = p2Var.e.g(savedStarGift);
                        savestargift.unsave = savedStarGift.unsaved;
                        ConnectionsManager.getInstance(i10).sendRequest(savestargift, null, 64);
                    }
                    if (p2Var.e.m(savedStarGift, z11, true)) {
                        xc.a0(bs0Var.f46469a).Q(R.raw.chats_infotip, 36, LocaleController.formatPluralStringComma("GiftsPinLimit", MessagesController.getInstance(i10).stargiftsPinnedToTopLimit)).j();
                    }
                    if (z10) {
                        return;
                    }
                    p2Var.f46408f.v0(0);
                    return;
                }
                return;
            }
            yh.x3 x3Var = new yh.x3(p2Var.getContext(), p2Var.f46406b, bs0Var.f46471c, p2Var.f46407c, null);
            x3Var.f48284d1 = new e2(p2Var, 2);
            x3Var.O0 = new s5.e(13, p2Var, savedStarGift);
            x3Var.j2(savedStarGift, p2Var.e);
            x3Var.show();
        }
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        p2 p2Var;
        bs0 bs0Var;
        j1 j1Var;
        j5 j5Var;
        String str;
        final p2 p2Var2;
        bs0 bs0Var2;
        j1 j1Var2;
        boolean z10;
        boolean z11;
        String str2;
        LinearLayout linearLayout;
        boolean z12;
        e6 e6Var;
        Object obj6;
        x51 x51Var = (x51) obj;
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        p2 p2Var3 = this.f46283a;
        e6 e6Var2 = p2Var3.f46407c;
        int i10 = p2Var3.f46406b;
        bs0 bs0Var3 = p2Var3.f46405a;
        boolean z13 = false;
        if (p2Var3.e != null) {
            if (view instanceof j1) {
                Object obj7 = x51Var.G;
                if (obj7 instanceof TL_stars.SavedStarGift) {
                    j1 j1Var3 = (j1) view;
                    final TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj7;
                    org.telegram.ui.ActionBar.o2 o2Var = bs0Var3.f46469a;
                    j5 j5Var2 = bs0Var3.e;
                    a80 I = a80.I(o2Var, view);
                    bs0Var3.I = I;
                    if (j5Var2.h()) {
                        if (!p2Var3.d) {
                            j5Var2.d().size();
                        }
                        a80 J = I.J();
                        J.c(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new ii.h(I, 2), false);
                        J.k();
                        sx sxVar = new sx(p2Var3.getContext(), 2);
                        LinearLayout linearLayout2 = new LinearLayout(p2Var3.getContext());
                        sxVar.addView(linearLayout2);
                        linearLayout2.setOrientation(1);
                        J.r(sxVar, y5.n(-1, -2));
                        if (j5Var2.d().size() + 1 < MessagesController.getInstance(i10).config.stargiftsCollectionsLimit.get()) {
                            org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(0, p2Var3.getContext(), p2Var3.f46407c, false, false);
                            g1Var.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
                            int i11 = i6.E8;
                            g1Var.c(i6.v0(i11, e6Var2), i6.v0(i6.F8, e6Var2));
                            g1Var.setSelectorColor(i6.l1(0.12f, i6.v0(i11, e6Var2)));
                            g1Var.g(LocaleController.getString(R.string.Gift2NewCollection), R.drawable.menu_folder_add, null);
                            g1Var.setOnClickListener(new xg.e(p2Var3, I, savedStarGift, 5));
                            linearLayout2.addView(g1Var, y5.n(-1, -2));
                        }
                        ArrayList d = j5Var2.d();
                        int size = d.size();
                        int i12 = 0;
                        while (i12 < size) {
                            int i13 = i12 + 1;
                            TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) d.get(i12);
                            ArrayList arrayList = j5Var2.e(tL_starGiftCollection.collection_id).f47666l;
                            bs0 bs0Var4 = bs0Var3;
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
                                if (s5.k((TL_stars.SavedStarGift) obj8, savedStarGift)) {
                                    linearLayout = linearLayout2;
                                    z12 = true;
                                    break;
                                }
                                size2 = i15;
                            }
                            org.telegram.ui.ActionBar.g1 g1Var2 = new org.telegram.ui.ActionBar.g1(2, p2Var3.getContext(), p2Var3.f46407c, false, false);
                            g1Var2.setChecked(z12);
                            p2 p2Var4 = p2Var3;
                            LinearLayout linearLayout3 = linearLayout;
                            g1Var2.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
                            int i16 = i6.E8;
                            g1Var2.c(i6.v0(i16, e6Var2), i6.v0(i6.F8, e6Var2));
                            g1Var2.setSelectorColor(i6.l1(0.12f, i6.v0(i16, e6Var2)));
                            if (tL_starGiftCollection.icon != null) {
                                q5 q5Var = new q5(3, i10, tL_starGiftCollection.icon);
                                e6Var = e6Var2;
                                g1Var2.getImageView().addOnAttachStateChangeListener(new ai.u2(q5Var, 4));
                                g1Var2.g(tL_starGiftCollection.title, 0, q5Var);
                                obj6 = null;
                            } else {
                                e6Var = e6Var2;
                                obj6 = null;
                                g1Var2.g(tL_starGiftCollection.title, R.drawable.msg_folders, null);
                            }
                            j5 j5Var3 = j5Var2;
                            g1Var2.setOnClickListener(new nb0(p2Var4, z12, tL_starGiftCollection, savedStarGift, I, 1));
                            linearLayout3.addView(g1Var2, y5.n(-1, -2));
                            linearLayout2 = linearLayout3;
                            p2Var3 = p2Var4;
                            bs0Var3 = bs0Var4;
                            i12 = i13;
                            j1Var3 = j1Var4;
                            j5Var2 = j5Var3;
                            size = size;
                            e6Var2 = e6Var;
                        }
                        p2Var = p2Var3;
                        bs0Var = bs0Var3;
                        j1Var = j1Var3;
                        j5Var = j5Var2;
                        str = null;
                        I.c(R.drawable.msg_addfolder, LocaleController.getString(R.string.Gift2AddToCollection), new ei.m2(I, J, 11), false);
                        I.k();
                    } else {
                        p2Var = p2Var3;
                        bs0Var = bs0Var3;
                        j1Var = j1Var3;
                        j5Var = j5Var2;
                        str = null;
                    }
                    if (savedStarGift.gift instanceof TL_stars.TL_starGiftUnique) {
                        if (bs0Var.c() && !p2Var.d && (!savedStarGift.unsaved || !savedStarGift.pinned_to_top)) {
                            boolean z14 = savedStarGift.pinned_to_top;
                            p2Var2 = p2Var;
                            bs0Var2 = bs0Var;
                            j1Var2 = j1Var;
                            z10 = false;
                            I.c(z14 ? R.drawable.msg_unpin : R.drawable.msg_pin, LocaleController.getString(z14 ? R.string.Gift2Unpin : R.string.Gift2Pin), new zr0(p2Var2, savedStarGift, j1Var2, view, 27), false);
                            I.l(R.drawable.tabs_reorder, LocaleController.getString(R.string.Gift2Reorder), new e2(p2Var2, 0), savedStarGift.pinned_to_top);
                        } else {
                            p2Var2 = p2Var;
                            bs0Var2 = bs0Var;
                            j1Var2 = j1Var;
                            z10 = false;
                            if (bs0Var2.c() && p2Var2.d) {
                                I.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.Gift2Reorder), new e2(p2Var2, 1), false);
                            }
                        }
                        TL_stars.StarGift starGift = savedStarGift.gift;
                        TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
                        if (starGift.slug != null) {
                            str2 = MessagesController.getInstance(i10).linkPrefix + "/nft/" + savedStarGift.gift.slug;
                        } else {
                            str2 = str;
                        }
                        if (yh.x3.O1(i10, DialogObject.getPeerDialogId(tL_starGiftUnique.owner_id))) {
                            boolean P1 = yh.x3.P1(i10, tL_starGiftUnique);
                            I.c(P1 ? R.drawable.menu_takeoff : R.drawable.menu_wear, LocaleController.getString(P1 ? R.string.Gift2Unwear : R.string.Gift2Wear), new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r3) {
                                        case 0:
                                            p2 p2Var5 = p2Var2;
                                            o2 o2Var2 = new o2(p2Var5, p2Var5.getContext(), p2Var5.f46406b, p2Var5.f46405a.f46471c, p2Var5.f46407c, 0);
                                            o2Var2.j2(savedStarGift, null);
                                            o2Var2.r2(false);
                                            return;
                                        case 1:
                                            p2 p2Var6 = p2Var2;
                                            o2 o2Var3 = new o2(p2Var6, p2Var6.getContext(), p2Var6.f46406b, p2Var6.f46405a.f46471c, p2Var6.f46407c, 1);
                                            o2Var3.j2(savedStarGift, null);
                                            o2Var3.S1();
                                            return;
                                        default:
                                            p2 p2Var7 = p2Var2;
                                            o2 o2Var4 = new o2(p2Var7, p2Var7.getContext(), p2Var7.f46406b, p2Var7.f46405a.f46471c, p2Var7.f46407c, 2);
                                            o2Var4.j2(savedStarGift, null);
                                            o2Var4.Y1();
                                            return;
                                    }
                                }
                            }, z10);
                        }
                        I.l(R.drawable.msg_link2, LocaleController.getString(R.string.CopyLink), new uf.b(10, p2Var2, str2), str2 != null);
                        I.l(R.drawable.msg_share, LocaleController.getString(R.string.ShareFile), new Runnable() {
                            @Override
                            public final void run() {
                                switch (r3) {
                                    case 0:
                                        p2 p2Var5 = p2Var2;
                                        o2 o2Var2 = new o2(p2Var5, p2Var5.getContext(), p2Var5.f46406b, p2Var5.f46405a.f46471c, p2Var5.f46407c, 0);
                                        o2Var2.j2(savedStarGift, null);
                                        o2Var2.r2(false);
                                        return;
                                    case 1:
                                        p2 p2Var6 = p2Var2;
                                        o2 o2Var3 = new o2(p2Var6, p2Var6.getContext(), p2Var6.f46406b, p2Var6.f46405a.f46471c, p2Var6.f46407c, 1);
                                        o2Var3.j2(savedStarGift, null);
                                        o2Var3.S1();
                                        return;
                                    default:
                                        p2 p2Var7 = p2Var2;
                                        o2 o2Var4 = new o2(p2Var7, p2Var7.getContext(), p2Var7.f46406b, p2Var7.f46405a.f46471c, p2Var7.f46407c, 2);
                                        o2Var4.j2(savedStarGift, null);
                                        o2Var4.Y1();
                                        return;
                                }
                            }
                        }, str2 != null);
                    } else {
                        p2Var2 = p2Var;
                        bs0Var2 = bs0Var;
                        j1Var2 = j1Var;
                        z10 = false;
                        if (bs0Var2.c() && p2Var2.d) {
                            I.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.Gift2Reorder), new e2(p2Var2, 3), false);
                        }
                    }
                    if (yh.x3.O1(i10, bs0Var2.f46471c)) {
                        boolean z15 = savedStarGift.unsaved;
                        I.c(z15 ? R.drawable.msg_message : R.drawable.menu_hide_gift, LocaleController.getString(z15 ? R.string.Gift2ShowGift : R.string.Gift2HideGift), new tg.r(p2Var2, savedStarGift, j1Var2, 6), z10);
                    }
                    TL_stars.StarGift starGift2 = savedStarGift.gift;
                    if (starGift2 instanceof TL_stars.TL_starGiftUnique) {
                        I.l(R.drawable.menu_transfer, LocaleController.getString(R.string.Gift2TransferOption), new Runnable() {
                            @Override
                            public final void run() {
                                switch (r3) {
                                    case 0:
                                        p2 p2Var5 = p2Var2;
                                        o2 o2Var2 = new o2(p2Var5, p2Var5.getContext(), p2Var5.f46406b, p2Var5.f46405a.f46471c, p2Var5.f46407c, 0);
                                        o2Var2.j2(savedStarGift, null);
                                        o2Var2.r2(false);
                                        return;
                                    case 1:
                                        p2 p2Var6 = p2Var2;
                                        o2 o2Var3 = new o2(p2Var6, p2Var6.getContext(), p2Var6.f46406b, p2Var6.f46405a.f46471c, p2Var6.f46407c, 1);
                                        o2Var3.j2(savedStarGift, null);
                                        o2Var3.S1();
                                        return;
                                    default:
                                        p2 p2Var7 = p2Var2;
                                        o2 o2Var4 = new o2(p2Var7, p2Var7.getContext(), p2Var7.f46406b, p2Var7.f46405a.f46471c, p2Var7.f46407c, 2);
                                        o2Var4.j2(savedStarGift, null);
                                        o2Var4.Y1();
                                        return;
                                }
                            }
                        }, DialogObject.getPeerDialogId(((TL_stars.TL_starGiftUnique) starGift2).owner_id) == UserConfig.getInstance(i10).getClientUserId());
                    }
                    if (j5Var.h() && p2Var2.d) {
                        z11 = true;
                        I.c(R.drawable.msg_removefolder, LocaleController.getString(R.string.Gift2RemoveFromCollection), new tg.r(p2Var2, savedStarGift, I, 5), true);
                        I.E();
                        I.t();
                    } else {
                        z11 = true;
                    }
                    if (I.x() > 0) {
                        I.V(5);
                        I.f22608u = z11;
                        I.v = z11;
                        I.L = z11;
                        Point point = AndroidUtilities.displaySize;
                        int min = Math.min(point.x, point.y);
                        I.N = min - AndroidUtilities.dp(32.0f);
                        I.O = (int) (min * 0.6f);
                        I.P = z11;
                        I.W = z11;
                        I.Z();
                        j1Var2.f46282y.getImageReceiver().startAnimation(z11);
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
