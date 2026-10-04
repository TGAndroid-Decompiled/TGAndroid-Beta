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
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.b80;
import org.telegram.ui.Components.fs0;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.ob0;
import org.telegram.ui.Components.q5;
import org.telegram.ui.Components.yc;
import org.telegram.ui.ux;
import org.telegram.ui.zr0;
import w7.z5;
import yh.j5;
import yh.t5;
public final class i2 implements Utilities.Callback5, Utilities.Callback5Return {
    public final o2 f50015a;

    public i2(o2 o2Var) {
        this.f50015a = o2Var;
    }

    @Override
    public void mo17run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        g61 g61Var = (g61) obj;
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        o2 o2Var = this.f50015a;
        fs0 fs0Var = o2Var.f50152a;
        int i10 = o2Var.f50153b;
        if (o2Var.f50155e == null) {
            return;
        }
        Object obj6 = g61Var.G;
        if (obj6 instanceof TL_stars.SavedStarGift) {
            TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj6;
            if (o2Var.f50157n) {
                if (!o2Var.d && (savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) {
                    boolean z10 = savedStarGift.pinned_to_top;
                    boolean z11 = !z10;
                    if (!z10 && savedStarGift.unsaved) {
                        savedStarGift.unsaved = false;
                        TL_stars.saveStarGift savestargift = new TL_stars.saveStarGift();
                        savestargift.stargift = o2Var.f50155e.g(savedStarGift);
                        savestargift.unsave = savedStarGift.unsaved;
                        ConnectionsManager.getInstance(i10).sendRequest(savestargift, null, 64);
                    }
                    if (o2Var.f50155e.m(savedStarGift, z11, true)) {
                        yc.a0(fs0Var.f50225a).Q(R.raw.chats_infotip, 36, LocaleController.formatPluralStringComma("GiftsPinLimit", MessagesController.getInstance(i10).stargiftsPinnedToTopLimit)).j();
                    }
                    if (z10) {
                        return;
                    }
                    o2Var.f50156f.v0(0);
                    return;
                }
                return;
            }
            yh.x3 x3Var = new yh.x3(o2Var.getContext(), o2Var.f50153b, fs0Var.f50227c, o2Var.f50154c, null);
            x3Var.f52219d1 = new d2(o2Var, 2);
            x3Var.O0 = new rg.x(14, o2Var, savedStarGift);
            x3Var.j2(savedStarGift, o2Var.f50155e);
            x3Var.show();
        }
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        o2 o2Var;
        fs0 fs0Var;
        i1 i1Var;
        j5 j5Var;
        String str;
        final o2 o2Var2;
        fs0 fs0Var2;
        i1 i1Var2;
        boolean z10;
        boolean z11;
        String str2;
        LinearLayout linearLayout;
        boolean z12;
        d6 d6Var;
        Object obj6;
        g61 g61Var = (g61) obj;
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        o2 o2Var3 = this.f50015a;
        d6 d6Var2 = o2Var3.f50154c;
        int i10 = o2Var3.f50153b;
        fs0 fs0Var3 = o2Var3.f50152a;
        boolean z13 = false;
        if (o2Var3.f50155e != null) {
            if (view instanceof i1) {
                Object obj7 = g61Var.G;
                if (obj7 instanceof TL_stars.SavedStarGift) {
                    i1 i1Var3 = (i1) view;
                    final TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj7;
                    org.telegram.ui.ActionBar.n2 n2Var = fs0Var3.f50225a;
                    j5 j5Var2 = fs0Var3.f50228e;
                    b80 I = b80.I(n2Var, view);
                    fs0Var3.I = I;
                    if (j5Var2.h()) {
                        if (!o2Var3.d) {
                            j5Var2.d().size();
                        }
                        b80 J = I.J();
                        J.c(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new ii.h(I, 2), false);
                        J.k();
                        ux uxVar = new ux(o2Var3.getContext(), 2);
                        LinearLayout linearLayout2 = new LinearLayout(o2Var3.getContext());
                        uxVar.addView(linearLayout2);
                        linearLayout2.setOrientation(1);
                        J.r(uxVar, z5.n(-1, -2));
                        if (j5Var2.d().size() + 1 < MessagesController.getInstance(i10).config.stargiftsCollectionsLimit.get()) {
                            org.telegram.ui.ActionBar.f1 f1Var = new org.telegram.ui.ActionBar.f1(0, o2Var3.getContext(), o2Var3.f50154c, false, false);
                            f1Var.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
                            int i11 = i6.E8;
                            f1Var.c(i6.v0(i11, d6Var2), i6.v0(i6.F8, d6Var2));
                            f1Var.setSelectorColor(i6.l1(0.12f, i6.v0(i11, d6Var2)));
                            f1Var.g(LocaleController.getString(R.string.Gift2NewCollection), R.drawable.menu_folder_add, null);
                            f1Var.setOnClickListener(new xg.e(o2Var3, I, savedStarGift, 5));
                            linearLayout2.addView(f1Var, z5.n(-1, -2));
                        }
                        ArrayList d = j5Var2.d();
                        int size = d.size();
                        int i12 = 0;
                        while (i12 < size) {
                            int i13 = i12 + 1;
                            TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) d.get(i12);
                            ArrayList arrayList = j5Var2.e(tL_starGiftCollection.collection_id).f51533l;
                            fs0 fs0Var4 = fs0Var3;
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
                                if (t5.k((TL_stars.SavedStarGift) obj8, savedStarGift)) {
                                    linearLayout = linearLayout2;
                                    z12 = true;
                                    break;
                                }
                                size2 = i15;
                            }
                            org.telegram.ui.ActionBar.f1 f1Var2 = new org.telegram.ui.ActionBar.f1(2, o2Var3.getContext(), o2Var3.f50154c, false, false);
                            f1Var2.setChecked(z12);
                            o2 o2Var4 = o2Var3;
                            LinearLayout linearLayout3 = linearLayout;
                            f1Var2.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
                            int i16 = i6.E8;
                            f1Var2.c(i6.v0(i16, d6Var2), i6.v0(i6.F8, d6Var2));
                            f1Var2.setSelectorColor(i6.l1(0.12f, i6.v0(i16, d6Var2)));
                            if (tL_starGiftCollection.icon != null) {
                                q5 q5Var = new q5(3, i10, tL_starGiftCollection.icon);
                                d6Var = d6Var2;
                                f1Var2.getImageView().addOnAttachStateChangeListener(new ai.u2(q5Var, 4));
                                f1Var2.g(tL_starGiftCollection.title, 0, q5Var);
                                obj6 = null;
                            } else {
                                d6Var = d6Var2;
                                obj6 = null;
                                f1Var2.g(tL_starGiftCollection.title, R.drawable.msg_folders, null);
                            }
                            j5 j5Var3 = j5Var2;
                            f1Var2.setOnClickListener(new ob0(o2Var4, z12, tL_starGiftCollection, savedStarGift, I, 1));
                            linearLayout3.addView(f1Var2, z5.n(-1, -2));
                            linearLayout2 = linearLayout3;
                            o2Var3 = o2Var4;
                            fs0Var3 = fs0Var4;
                            i12 = i13;
                            i1Var3 = i1Var4;
                            j5Var2 = j5Var3;
                            size = size;
                            d6Var2 = d6Var;
                        }
                        o2Var = o2Var3;
                        fs0Var = fs0Var3;
                        i1Var = i1Var3;
                        j5Var = j5Var2;
                        str = null;
                        I.c(R.drawable.msg_addfolder, LocaleController.getString(R.string.Gift2AddToCollection), new ei.n2(I, J, 11), false);
                        I.k();
                    } else {
                        o2Var = o2Var3;
                        fs0Var = fs0Var3;
                        i1Var = i1Var3;
                        j5Var = j5Var2;
                        str = null;
                    }
                    if (savedStarGift.gift instanceof TL_stars.TL_starGiftUnique) {
                        if (fs0Var.c() && !o2Var.d && (!savedStarGift.unsaved || !savedStarGift.pinned_to_top)) {
                            boolean z14 = savedStarGift.pinned_to_top;
                            o2Var2 = o2Var;
                            fs0Var2 = fs0Var;
                            i1Var2 = i1Var;
                            z10 = false;
                            I.c(z14 ? R.drawable.msg_unpin : R.drawable.msg_pin, LocaleController.getString(z14 ? R.string.Gift2Unpin : R.string.Gift2Pin), new zr0(o2Var2, savedStarGift, i1Var2, view, 27), false);
                            I.l(R.drawable.tabs_reorder, LocaleController.getString(R.string.Gift2Reorder), new d2(o2Var2, 0), savedStarGift.pinned_to_top);
                        } else {
                            o2Var2 = o2Var;
                            fs0Var2 = fs0Var;
                            i1Var2 = i1Var;
                            z10 = false;
                            if (fs0Var2.c() && o2Var2.d) {
                                I.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.Gift2Reorder), new d2(o2Var2, 1), false);
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
                                            o2 o2Var5 = o2Var2;
                                            n2 n2Var2 = new n2(o2Var5, o2Var5.getContext(), o2Var5.f50153b, o2Var5.f50152a.f50227c, o2Var5.f50154c, 0);
                                            n2Var2.j2(savedStarGift, null);
                                            n2Var2.r2(false);
                                            return;
                                        case 1:
                                            o2 o2Var6 = o2Var2;
                                            n2 n2Var3 = new n2(o2Var6, o2Var6.getContext(), o2Var6.f50153b, o2Var6.f50152a.f50227c, o2Var6.f50154c, 1);
                                            n2Var3.j2(savedStarGift, null);
                                            n2Var3.S1();
                                            return;
                                        default:
                                            o2 o2Var7 = o2Var2;
                                            n2 n2Var4 = new n2(o2Var7, o2Var7.getContext(), o2Var7.f50153b, o2Var7.f50152a.f50227c, o2Var7.f50154c, 2);
                                            n2Var4.j2(savedStarGift, null);
                                            n2Var4.Y1();
                                            return;
                                    }
                                }
                            }, z10);
                        }
                        I.l(R.drawable.msg_link2, LocaleController.getString(R.string.CopyLink), new u2.i0(13, o2Var2, str2), str2 != null);
                        I.l(R.drawable.msg_share, LocaleController.getString(R.string.ShareFile), new Runnable() {
                            @Override
                            public final void run() {
                                switch (r3) {
                                    case 0:
                                        o2 o2Var5 = o2Var2;
                                        n2 n2Var2 = new n2(o2Var5, o2Var5.getContext(), o2Var5.f50153b, o2Var5.f50152a.f50227c, o2Var5.f50154c, 0);
                                        n2Var2.j2(savedStarGift, null);
                                        n2Var2.r2(false);
                                        return;
                                    case 1:
                                        o2 o2Var6 = o2Var2;
                                        n2 n2Var3 = new n2(o2Var6, o2Var6.getContext(), o2Var6.f50153b, o2Var6.f50152a.f50227c, o2Var6.f50154c, 1);
                                        n2Var3.j2(savedStarGift, null);
                                        n2Var3.S1();
                                        return;
                                    default:
                                        o2 o2Var7 = o2Var2;
                                        n2 n2Var4 = new n2(o2Var7, o2Var7.getContext(), o2Var7.f50153b, o2Var7.f50152a.f50227c, o2Var7.f50154c, 2);
                                        n2Var4.j2(savedStarGift, null);
                                        n2Var4.Y1();
                                        return;
                                }
                            }
                        }, str2 != null);
                    } else {
                        o2Var2 = o2Var;
                        fs0Var2 = fs0Var;
                        i1Var2 = i1Var;
                        z10 = false;
                        if (fs0Var2.c() && o2Var2.d) {
                            I.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.Gift2Reorder), new d2(o2Var2, 3), false);
                        }
                    }
                    if (yh.x3.O1(i10, fs0Var2.f50227c)) {
                        boolean z15 = savedStarGift.unsaved;
                        I.c(z15 ? R.drawable.msg_message : R.drawable.menu_hide_gift, LocaleController.getString(z15 ? R.string.Gift2ShowGift : R.string.Gift2HideGift), new tg.q(o2Var2, savedStarGift, i1Var2, 7), z10);
                    }
                    TL_stars.StarGift starGift2 = savedStarGift.gift;
                    if (starGift2 instanceof TL_stars.TL_starGiftUnique) {
                        I.l(R.drawable.menu_transfer, LocaleController.getString(R.string.Gift2TransferOption), new Runnable() {
                            @Override
                            public final void run() {
                                switch (r3) {
                                    case 0:
                                        o2 o2Var5 = o2Var2;
                                        n2 n2Var2 = new n2(o2Var5, o2Var5.getContext(), o2Var5.f50153b, o2Var5.f50152a.f50227c, o2Var5.f50154c, 0);
                                        n2Var2.j2(savedStarGift, null);
                                        n2Var2.r2(false);
                                        return;
                                    case 1:
                                        o2 o2Var6 = o2Var2;
                                        n2 n2Var3 = new n2(o2Var6, o2Var6.getContext(), o2Var6.f50153b, o2Var6.f50152a.f50227c, o2Var6.f50154c, 1);
                                        n2Var3.j2(savedStarGift, null);
                                        n2Var3.S1();
                                        return;
                                    default:
                                        o2 o2Var7 = o2Var2;
                                        n2 n2Var4 = new n2(o2Var7, o2Var7.getContext(), o2Var7.f50153b, o2Var7.f50152a.f50227c, o2Var7.f50154c, 2);
                                        n2Var4.j2(savedStarGift, null);
                                        n2Var4.Y1();
                                        return;
                                }
                            }
                        }, DialogObject.getPeerDialogId(((TL_stars.TL_starGiftUnique) starGift2).owner_id) == UserConfig.getInstance(i10).getClientUserId());
                    }
                    if (j5Var.h() && o2Var2.d) {
                        z11 = true;
                        I.c(R.drawable.msg_removefolder, LocaleController.getString(R.string.Gift2RemoveFromCollection), new tg.q(o2Var2, savedStarGift, I, 6), true);
                        I.E();
                        I.t();
                    } else {
                        z11 = true;
                    }
                    if (I.x() > 0) {
                        I.V(5);
                        I.f24851u = z11;
                        I.v = z11;
                        I.L = z11;
                        Point point = AndroidUtilities.displaySize;
                        int min = Math.min(point.x, point.y);
                        I.N = min - AndroidUtilities.dp(32.0f);
                        I.O = (int) (min * 0.6f);
                        I.P = z11;
                        I.W = z11;
                        I.Z();
                        i1Var2.f50014y.getImageReceiver().startAnimation(z11);
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
