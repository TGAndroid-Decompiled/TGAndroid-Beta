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
import org.telegram.ui.Components.bb0;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.n70;
import org.telegram.ui.Components.nr0;
import org.telegram.ui.Components.o5;
import org.telegram.ui.Components.vc;
import org.telegram.ui.fs0;
import org.telegram.ui.wx;
import w7.x5;
import yh.m5;
import yh.v5;
public final class h2 implements Utilities.Callback5, Utilities.Callback5Return {
    public final n2 f45892a;

    public h2(n2 n2Var) {
        this.f45892a = n2Var;
    }

    @Override
    public void mo17run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        i51 i51Var = (i51) obj;
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        n2 n2Var = this.f45892a;
        nr0 nr0Var = n2Var.f46034a;
        int i10 = n2Var.f46035b;
        if (n2Var.e == null) {
            return;
        }
        Object obj6 = i51Var.G;
        if (obj6 instanceof TL_stars.SavedStarGift) {
            TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj6;
            if (n2Var.f46038n) {
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
                        vc.a0(nr0Var.f46105a).Q(R.raw.chats_infotip, 36, LocaleController.formatPluralStringComma("GiftsPinLimit", MessagesController.getInstance(i10).stargiftsPinnedToTopLimit)).j();
                    }
                    if (z10) {
                        return;
                    }
                    n2Var.f46037f.u0(0);
                    return;
                }
                return;
            }
            yh.a4 a4Var = new yh.a4(n2Var.getContext(), n2Var.f46035b, nr0Var.f46107c, n2Var.f46036c, null);
            a4Var.f46952d1 = new c2(n2Var, 2);
            a4Var.O0 = new tg.d(11, n2Var, savedStarGift);
            a4Var.j2(savedStarGift, n2Var.e);
            a4Var.show();
        }
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        n2 n2Var;
        nr0 nr0Var;
        i1 i1Var;
        m5 m5Var;
        String str;
        final n2 n2Var2;
        nr0 nr0Var2;
        i1 i1Var2;
        boolean z10;
        boolean z11;
        String str2;
        LinearLayout linearLayout;
        boolean z12;
        e6 e6Var;
        Object obj6;
        i51 i51Var = (i51) obj;
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        n2 n2Var3 = this.f45892a;
        e6 e6Var2 = n2Var3.f46036c;
        int i10 = n2Var3.f46035b;
        nr0 nr0Var3 = n2Var3.f46034a;
        boolean z13 = false;
        if (n2Var3.e != null) {
            if (view instanceof i1) {
                Object obj7 = i51Var.G;
                if (obj7 instanceof TL_stars.SavedStarGift) {
                    i1 i1Var3 = (i1) view;
                    final TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj7;
                    org.telegram.ui.ActionBar.n2 n2Var4 = nr0Var3.f46105a;
                    m5 m5Var2 = nr0Var3.e;
                    n70 I = n70.I(n2Var4, view);
                    nr0Var3.I = I;
                    if (m5Var2.h()) {
                        if (!n2Var3.d) {
                            m5Var2.d().size();
                        }
                        n70 J = I.J();
                        J.c(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new ii.h(I, 2), false);
                        J.k();
                        wx wxVar = new wx(n2Var3.getContext(), 2);
                        LinearLayout linearLayout2 = new LinearLayout(n2Var3.getContext());
                        wxVar.addView(linearLayout2);
                        linearLayout2.setOrientation(1);
                        J.r(wxVar, x5.n(-1, -2));
                        if (m5Var2.d().size() + 1 < MessagesController.getInstance(i10).config.stargiftsCollectionsLimit.get()) {
                            org.telegram.ui.ActionBar.f1 f1Var = new org.telegram.ui.ActionBar.f1(0, n2Var3.getContext(), n2Var3.f46036c, false, false);
                            f1Var.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
                            int i11 = i6.E8;
                            f1Var.c(i6.v0(i11, e6Var2), i6.v0(i6.F8, e6Var2));
                            f1Var.setSelectorColor(i6.l1(0.12f, i6.v0(i11, e6Var2)));
                            f1Var.g(LocaleController.getString(R.string.Gift2NewCollection), R.drawable.menu_folder_add, null);
                            f1Var.setOnClickListener(new xg.e(n2Var3, I, savedStarGift, 5));
                            linearLayout2.addView(f1Var, x5.n(-1, -2));
                        }
                        ArrayList d = m5Var2.d();
                        int size = d.size();
                        int i12 = 0;
                        while (i12 < size) {
                            int i13 = i12 + 1;
                            TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) d.get(i12);
                            ArrayList arrayList = m5Var2.e(tL_starGiftCollection.collection_id).f47498l;
                            nr0 nr0Var4 = nr0Var3;
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
                            org.telegram.ui.ActionBar.f1 f1Var2 = new org.telegram.ui.ActionBar.f1(2, n2Var3.getContext(), n2Var3.f46036c, false, false);
                            f1Var2.setChecked(z12);
                            n2 n2Var5 = n2Var3;
                            LinearLayout linearLayout3 = linearLayout;
                            f1Var2.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
                            int i16 = i6.E8;
                            f1Var2.c(i6.v0(i16, e6Var2), i6.v0(i6.F8, e6Var2));
                            f1Var2.setSelectorColor(i6.l1(0.12f, i6.v0(i16, e6Var2)));
                            if (tL_starGiftCollection.icon != null) {
                                o5 o5Var = new o5(3, i10, tL_starGiftCollection.icon);
                                e6Var = e6Var2;
                                f1Var2.getImageView().addOnAttachStateChangeListener(new ai.u2(o5Var, 3));
                                f1Var2.g(tL_starGiftCollection.title, 0, o5Var);
                                obj6 = null;
                            } else {
                                e6Var = e6Var2;
                                obj6 = null;
                                f1Var2.g(tL_starGiftCollection.title, R.drawable.msg_folders, null);
                            }
                            m5 m5Var3 = m5Var2;
                            f1Var2.setOnClickListener(new bb0(n2Var5, z12, tL_starGiftCollection, savedStarGift, I, 1));
                            linearLayout3.addView(f1Var2, x5.n(-1, -2));
                            linearLayout2 = linearLayout3;
                            n2Var3 = n2Var5;
                            nr0Var3 = nr0Var4;
                            i12 = i13;
                            i1Var3 = i1Var4;
                            m5Var2 = m5Var3;
                            size = size;
                            e6Var2 = e6Var;
                        }
                        n2Var = n2Var3;
                        nr0Var = nr0Var3;
                        i1Var = i1Var3;
                        m5Var = m5Var2;
                        str = null;
                        I.c(R.drawable.msg_addfolder, LocaleController.getString(R.string.Gift2AddToCollection), new ei.m2(I, J, 11), false);
                        I.k();
                    } else {
                        n2Var = n2Var3;
                        nr0Var = nr0Var3;
                        i1Var = i1Var3;
                        m5Var = m5Var2;
                        str = null;
                    }
                    if (savedStarGift.gift instanceof TL_stars.TL_starGiftUnique) {
                        if (nr0Var.c() && !n2Var.d && (!savedStarGift.unsaved || !savedStarGift.pinned_to_top)) {
                            boolean z14 = savedStarGift.pinned_to_top;
                            n2Var2 = n2Var;
                            nr0Var2 = nr0Var;
                            i1Var2 = i1Var;
                            z10 = false;
                            I.c(z14 ? R.drawable.msg_unpin : R.drawable.msg_pin, LocaleController.getString(z14 ? R.string.Gift2Unpin : R.string.Gift2Pin), new fs0(n2Var2, savedStarGift, i1Var2, view, 26), false);
                            I.l(R.drawable.tabs_reorder, LocaleController.getString(R.string.Gift2Reorder), new c2(n2Var2, 0), savedStarGift.pinned_to_top);
                        } else {
                            n2Var2 = n2Var;
                            nr0Var2 = nr0Var;
                            i1Var2 = i1Var;
                            z10 = false;
                            if (nr0Var2.c() && n2Var2.d) {
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
                                            n2 n2Var6 = n2Var2;
                                            m2 m2Var = new m2(n2Var6, n2Var6.getContext(), n2Var6.f46035b, n2Var6.f46034a.f46107c, n2Var6.f46036c, 0);
                                            m2Var.j2(savedStarGift, null);
                                            m2Var.r2(false);
                                            return;
                                        case 1:
                                            n2 n2Var7 = n2Var2;
                                            m2 m2Var2 = new m2(n2Var7, n2Var7.getContext(), n2Var7.f46035b, n2Var7.f46034a.f46107c, n2Var7.f46036c, 1);
                                            m2Var2.j2(savedStarGift, null);
                                            m2Var2.S1();
                                            return;
                                        default:
                                            n2 n2Var8 = n2Var2;
                                            m2 m2Var3 = new m2(n2Var8, n2Var8.getContext(), n2Var8.f46035b, n2Var8.f46034a.f46107c, n2Var8.f46036c, 2);
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
                                        n2 n2Var6 = n2Var2;
                                        m2 m2Var = new m2(n2Var6, n2Var6.getContext(), n2Var6.f46035b, n2Var6.f46034a.f46107c, n2Var6.f46036c, 0);
                                        m2Var.j2(savedStarGift, null);
                                        m2Var.r2(false);
                                        return;
                                    case 1:
                                        n2 n2Var7 = n2Var2;
                                        m2 m2Var2 = new m2(n2Var7, n2Var7.getContext(), n2Var7.f46035b, n2Var7.f46034a.f46107c, n2Var7.f46036c, 1);
                                        m2Var2.j2(savedStarGift, null);
                                        m2Var2.S1();
                                        return;
                                    default:
                                        n2 n2Var8 = n2Var2;
                                        m2 m2Var3 = new m2(n2Var8, n2Var8.getContext(), n2Var8.f46035b, n2Var8.f46034a.f46107c, n2Var8.f46036c, 2);
                                        m2Var3.j2(savedStarGift, null);
                                        m2Var3.Y1();
                                        return;
                                }
                            }
                        }, str2 != null);
                    } else {
                        n2Var2 = n2Var;
                        nr0Var2 = nr0Var;
                        i1Var2 = i1Var;
                        z10 = false;
                        if (nr0Var2.c() && n2Var2.d) {
                            I.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.Gift2Reorder), new c2(n2Var2, 3), false);
                        }
                    }
                    if (yh.a4.O1(i10, nr0Var2.f46107c)) {
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
                                        n2 n2Var6 = n2Var2;
                                        m2 m2Var = new m2(n2Var6, n2Var6.getContext(), n2Var6.f46035b, n2Var6.f46034a.f46107c, n2Var6.f46036c, 0);
                                        m2Var.j2(savedStarGift, null);
                                        m2Var.r2(false);
                                        return;
                                    case 1:
                                        n2 n2Var7 = n2Var2;
                                        m2 m2Var2 = new m2(n2Var7, n2Var7.getContext(), n2Var7.f46035b, n2Var7.f46034a.f46107c, n2Var7.f46036c, 1);
                                        m2Var2.j2(savedStarGift, null);
                                        m2Var2.S1();
                                        return;
                                    default:
                                        n2 n2Var8 = n2Var2;
                                        m2 m2Var3 = new m2(n2Var8, n2Var8.getContext(), n2Var8.f46035b, n2Var8.f46034a.f46107c, n2Var8.f46036c, 2);
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
                        I.f26370u = z11;
                        I.v = z11;
                        I.L = z11;
                        Point point = AndroidUtilities.displaySize;
                        int min = Math.min(point.x, point.y);
                        I.N = min - AndroidUtilities.dp(32.0f);
                        I.O = (int) (min * 0.6f);
                        I.P = z11;
                        I.W = z11;
                        I.Z();
                        i1Var2.f45925y.getImageReceiver().startAnimation(z11);
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
