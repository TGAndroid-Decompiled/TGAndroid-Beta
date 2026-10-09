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
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.cc0;
import org.telegram.ui.Components.p61;
import org.telegram.ui.Components.p80;
import org.telegram.ui.Components.rs0;
import org.telegram.ui.Components.s5;
import org.telegram.ui.rr0;
import org.telegram.ui.vx;
import w7.x5;
import yh.d5;
import yh.m5;
public final class i2 implements Utilities.Callback5, Utilities.Callback5Return {
    public final o2 f51278a;

    public i2(o2 o2Var) {
        this.f51278a = o2Var;
    }

    @Override
    public void mo16run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        p61 p61Var = (p61) obj;
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        o2 o2Var = this.f51278a;
        rs0 rs0Var = o2Var.f51433a;
        int i10 = o2Var.f51434b;
        if (o2Var.f51436e == null) {
            return;
        }
        Object obj6 = p61Var.G;
        if (obj6 instanceof TL_stars.SavedStarGift) {
            TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj6;
            if (o2Var.f51438n) {
                if (!o2Var.d && (savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) {
                    boolean z10 = savedStarGift.pinned_to_top;
                    boolean z11 = !z10;
                    if (!z10 && savedStarGift.unsaved) {
                        savedStarGift.unsaved = false;
                        TL_stars.saveStarGift savestargift = new TL_stars.saveStarGift();
                        savestargift.stargift = o2Var.f51436e.g(savedStarGift);
                        savestargift.unsave = savedStarGift.unsaved;
                        ConnectionsManager.getInstance(i10).sendRequest(savestargift, null, 64);
                    }
                    if (o2Var.f51436e.m(savedStarGift, z11, true)) {
                        ad.a0(rs0Var.f51509a).Q(R.raw.chats_infotip, 36, LocaleController.formatPluralStringComma("GiftsPinLimit", MessagesController.getInstance(i10).stargiftsPinnedToTopLimit)).j();
                    }
                    if (z10) {
                        return;
                    }
                    o2Var.f51437f.u0(0);
                    return;
                }
                return;
            }
            yh.s3 s3Var = new yh.s3(o2Var.getContext(), o2Var.f51434b, rs0Var.f51511c, o2Var.f51435c, null);
            s3Var.f53166e1 = new d2(o2Var, 2);
            s3Var.P0 = new qg.x1(17, o2Var, savedStarGift);
            s3Var.l2(savedStarGift, o2Var.f51436e);
            s3Var.show();
        }
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean z10;
        o2 o2Var;
        rs0 rs0Var;
        j1 j1Var;
        d5 d5Var;
        String str;
        final o2 o2Var2;
        rs0 rs0Var2;
        j1 j1Var2;
        boolean z11;
        String str2;
        LinearLayout linearLayout;
        boolean z12;
        e6 e6Var;
        Object obj6;
        p61 p61Var = (p61) obj;
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        o2 o2Var3 = this.f51278a;
        e6 e6Var2 = o2Var3.f51435c;
        int i10 = o2Var3.f51434b;
        rs0 rs0Var3 = o2Var3.f51433a;
        boolean z13 = false;
        if (o2Var3.f51436e != null) {
            if (view instanceof j1) {
                Object obj7 = p61Var.G;
                if (obj7 instanceof TL_stars.SavedStarGift) {
                    j1 j1Var3 = (j1) view;
                    final TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj7;
                    org.telegram.ui.ActionBar.n2 n2Var = rs0Var3.f51509a;
                    d5 d5Var2 = rs0Var3.f51512e;
                    p80 I = p80.I(n2Var, view);
                    rs0Var3.I = I;
                    if (d5Var2.h()) {
                        if (!o2Var3.d) {
                            d5Var2.d().size();
                        }
                        p80 J = I.J();
                        J.c(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new ii.h(I, 2), false);
                        J.k();
                        vx vxVar = new vx(o2Var3.getContext(), 4);
                        LinearLayout linearLayout2 = new LinearLayout(o2Var3.getContext());
                        vxVar.addView(linearLayout2);
                        linearLayout2.setOrientation(1);
                        boolean z14 = true;
                        J.r(vxVar, x5.n(-1, -2));
                        if (d5Var2.d().size() + 1 < MessagesController.getInstance(i10).config.stargiftsCollectionsLimit.get()) {
                            org.telegram.ui.ActionBar.f1 f1Var = new org.telegram.ui.ActionBar.f1(0, o2Var3.getContext(), o2Var3.f51435c, false, false);
                            f1Var.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
                            int i11 = i6.E8;
                            f1Var.c(i6.w0(i11, e6Var2), i6.w0(i6.F8, e6Var2));
                            f1Var.setSelectorColor(i6.m1(0.12f, i6.w0(i11, e6Var2)));
                            f1Var.g(LocaleController.getString(R.string.Gift2NewCollection), R.drawable.menu_folder_add, null);
                            f1Var.setOnClickListener(new xg.e(o2Var3, I, savedStarGift, 5));
                            linearLayout2.addView(f1Var, x5.n(-1, -2));
                        }
                        ArrayList d = d5Var2.d();
                        int size = d.size();
                        int i12 = 0;
                        while (i12 < size) {
                            int i13 = i12 + 1;
                            TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) d.get(i12);
                            ArrayList arrayList = d5Var2.e(tL_starGiftCollection.collection_id).f52440l;
                            rs0 rs0Var4 = rs0Var3;
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
                                if (m5.k((TL_stars.SavedStarGift) obj8, savedStarGift)) {
                                    linearLayout = linearLayout2;
                                    z12 = z14;
                                    break;
                                }
                                size2 = i15;
                            }
                            org.telegram.ui.ActionBar.f1 f1Var2 = new org.telegram.ui.ActionBar.f1(2, o2Var3.getContext(), o2Var3.f51435c, false, false);
                            f1Var2.setChecked(z12);
                            o2 o2Var4 = o2Var3;
                            LinearLayout linearLayout3 = linearLayout;
                            f1Var2.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
                            int i16 = i6.E8;
                            f1Var2.c(i6.w0(i16, e6Var2), i6.w0(i6.F8, e6Var2));
                            f1Var2.setSelectorColor(i6.m1(0.12f, i6.w0(i16, e6Var2)));
                            if (tL_starGiftCollection.icon != null) {
                                s5 s5Var = new s5(3, i10, tL_starGiftCollection.icon);
                                e6Var = e6Var2;
                                f1Var2.getImageView().addOnAttachStateChangeListener(new ai.v2(s5Var, 4));
                                f1Var2.g(tL_starGiftCollection.title, 0, s5Var);
                                obj6 = null;
                            } else {
                                e6Var = e6Var2;
                                obj6 = null;
                                f1Var2.g(tL_starGiftCollection.title, R.drawable.msg_folders, null);
                            }
                            d5 d5Var3 = d5Var2;
                            f1Var2.setOnClickListener(new cc0(o2Var4, z12, tL_starGiftCollection, savedStarGift, I, 1));
                            linearLayout3.addView(f1Var2, x5.n(-1, -2));
                            linearLayout2 = linearLayout3;
                            o2Var3 = o2Var4;
                            rs0Var3 = rs0Var4;
                            i12 = i13;
                            j1Var3 = j1Var4;
                            d5Var2 = d5Var3;
                            z14 = true;
                            size = size;
                            e6Var2 = e6Var;
                        }
                        o2Var = o2Var3;
                        rs0Var = rs0Var3;
                        j1Var = j1Var3;
                        d5Var = d5Var2;
                        str = null;
                        z13 = false;
                        I.c(R.drawable.msg_addfolder, LocaleController.getString(R.string.Gift2AddToCollection), new ei.m2(I, J, 11), false);
                        I.k();
                    } else {
                        o2Var = o2Var3;
                        rs0Var = rs0Var3;
                        j1Var = j1Var3;
                        d5Var = d5Var2;
                        str = null;
                    }
                    if (savedStarGift.gift instanceof TL_stars.TL_starGiftUnique) {
                        if (rs0Var.c() && !o2Var.d && (!savedStarGift.unsaved || !savedStarGift.pinned_to_top)) {
                            boolean z15 = savedStarGift.pinned_to_top;
                            o2Var2 = o2Var;
                            rs0Var2 = rs0Var;
                            j1Var2 = j1Var;
                            z10 = z13;
                            I.c(z15 ? R.drawable.msg_unpin : R.drawable.msg_pin, LocaleController.getString(z15 ? R.string.Gift2Unpin : R.string.Gift2Pin), new rr0(o2Var2, savedStarGift, j1Var2, view, 27), z10);
                            I.l(R.drawable.tabs_reorder, LocaleController.getString(R.string.Gift2Reorder), new d2(o2Var2, 0), savedStarGift.pinned_to_top);
                        } else {
                            o2Var2 = o2Var;
                            rs0Var2 = rs0Var;
                            j1Var2 = j1Var;
                            z10 = z13;
                            if (rs0Var2.c() && o2Var2.d) {
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
                                            n2 n2Var2 = new n2(o2Var5, o2Var5.getContext(), o2Var5.f51434b, o2Var5.f51433a.f51511c, o2Var5.f51435c, 0);
                                            n2Var2.l2(savedStarGift, null);
                                            n2Var2.t2(false);
                                            return;
                                        case 1:
                                            o2 o2Var6 = o2Var2;
                                            n2 n2Var3 = new n2(o2Var6, o2Var6.getContext(), o2Var6.f51434b, o2Var6.f51433a.f51511c, o2Var6.f51435c, 1);
                                            n2Var3.l2(savedStarGift, null);
                                            n2Var3.T1();
                                            return;
                                        default:
                                            o2 o2Var7 = o2Var2;
                                            n2 n2Var4 = new n2(o2Var7, o2Var7.getContext(), o2Var7.f51434b, o2Var7.f51433a.f51511c, o2Var7.f51435c, 2);
                                            n2Var4.l2(savedStarGift, null);
                                            n2Var4.Z1();
                                            return;
                                    }
                                }
                            }, z10);
                        }
                        I.l(R.drawable.msg_link2, LocaleController.getString(R.string.CopyLink), new u2.p0(12, o2Var2, str2), str2 != null ? true : z10);
                        I.l(R.drawable.msg_share, LocaleController.getString(R.string.ShareFile), new Runnable() {
                            @Override
                            public final void run() {
                                switch (r3) {
                                    case 0:
                                        o2 o2Var5 = o2Var2;
                                        n2 n2Var2 = new n2(o2Var5, o2Var5.getContext(), o2Var5.f51434b, o2Var5.f51433a.f51511c, o2Var5.f51435c, 0);
                                        n2Var2.l2(savedStarGift, null);
                                        n2Var2.t2(false);
                                        return;
                                    case 1:
                                        o2 o2Var6 = o2Var2;
                                        n2 n2Var3 = new n2(o2Var6, o2Var6.getContext(), o2Var6.f51434b, o2Var6.f51433a.f51511c, o2Var6.f51435c, 1);
                                        n2Var3.l2(savedStarGift, null);
                                        n2Var3.T1();
                                        return;
                                    default:
                                        o2 o2Var7 = o2Var2;
                                        n2 n2Var4 = new n2(o2Var7, o2Var7.getContext(), o2Var7.f51434b, o2Var7.f51433a.f51511c, o2Var7.f51435c, 2);
                                        n2Var4.l2(savedStarGift, null);
                                        n2Var4.Z1();
                                        return;
                                }
                            }
                        }, str2 != null ? true : z10);
                    } else {
                        o2Var2 = o2Var;
                        rs0Var2 = rs0Var;
                        j1Var2 = j1Var;
                        z10 = z13;
                        if (rs0Var2.c() && o2Var2.d) {
                            I.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.Gift2Reorder), new d2(o2Var2, 3), z10);
                        }
                    }
                    if (yh.s3.P1(i10, rs0Var2.f51511c)) {
                        boolean z16 = savedStarGift.unsaved;
                        I.c(z16 ? R.drawable.msg_message : R.drawable.menu_hide_gift, LocaleController.getString(z16 ? R.string.Gift2ShowGift : R.string.Gift2HideGift), new tg.q((Object) o2Var2, (Object) savedStarGift, (Object) j1Var2, 8), z10);
                    }
                    TL_stars.StarGift starGift2 = savedStarGift.gift;
                    if (starGift2 instanceof TL_stars.TL_starGiftUnique) {
                        I.l(R.drawable.menu_transfer, LocaleController.getString(R.string.Gift2TransferOption), new Runnable() {
                            @Override
                            public final void run() {
                                switch (r3) {
                                    case 0:
                                        o2 o2Var5 = o2Var2;
                                        n2 n2Var2 = new n2(o2Var5, o2Var5.getContext(), o2Var5.f51434b, o2Var5.f51433a.f51511c, o2Var5.f51435c, 0);
                                        n2Var2.l2(savedStarGift, null);
                                        n2Var2.t2(false);
                                        return;
                                    case 1:
                                        o2 o2Var6 = o2Var2;
                                        n2 n2Var3 = new n2(o2Var6, o2Var6.getContext(), o2Var6.f51434b, o2Var6.f51433a.f51511c, o2Var6.f51435c, 1);
                                        n2Var3.l2(savedStarGift, null);
                                        n2Var3.T1();
                                        return;
                                    default:
                                        o2 o2Var7 = o2Var2;
                                        n2 n2Var4 = new n2(o2Var7, o2Var7.getContext(), o2Var7.f51434b, o2Var7.f51433a.f51511c, o2Var7.f51435c, 2);
                                        n2Var4.l2(savedStarGift, null);
                                        n2Var4.Z1();
                                        return;
                                }
                            }
                        }, DialogObject.getPeerDialogId(((TL_stars.TL_starGiftUnique) starGift2).owner_id) == UserConfig.getInstance(i10).getClientUserId() ? true : z10);
                    }
                    if (d5Var.h() && o2Var2.d) {
                        z11 = true;
                        I.c(R.drawable.msg_removefolder, LocaleController.getString(R.string.Gift2RemoveFromCollection), new tg.q((Object) o2Var2, (Object) savedStarGift, (Object) I, 7), true);
                        I.E();
                        I.t();
                    } else {
                        z11 = true;
                    }
                    if (I.x() > 0) {
                        I.V(5);
                        I.f29791u = z11;
                        I.v = z11;
                        I.L = z11;
                        Point point = AndroidUtilities.displaySize;
                        int min = Math.min(point.x, point.y);
                        I.N = min - AndroidUtilities.dp(32.0f);
                        I.O = (int) (min * 0.6f);
                        I.P = z11;
                        I.W = z11;
                        I.Z();
                        j1Var2.f51315y.getImageReceiver().startAnimation(z11);
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
