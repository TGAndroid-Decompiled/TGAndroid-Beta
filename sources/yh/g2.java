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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.cb0;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.n70;
import org.telegram.ui.Components.nr0;
import org.telegram.ui.Components.q5;
import org.telegram.ui.Components.yc;
import org.telegram.ui.es0;
import org.telegram.ui.wx;
import w7.x5;
import zh.i5;
import zh.s5;
public final class g2 implements Utilities.Callback5, Utilities.Callback5Return {
    public final m2 f50319a;

    public g2(m2 m2Var) {
        this.f50319a = m2Var;
    }

    @Override
    public void mo17run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        h51 h51Var = (h51) obj;
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        m2 m2Var = this.f50319a;
        nr0 nr0Var = m2Var.f50468a;
        int i10 = m2Var.f50469b;
        if (m2Var.f50471e == null) {
            return;
        }
        Object obj6 = h51Var.G;
        if (obj6 instanceof TL_stars.SavedStarGift) {
            TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj6;
            if (m2Var.f50473n) {
                if (!m2Var.d && (savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) {
                    boolean z10 = savedStarGift.pinned_to_top;
                    boolean z11 = !z10;
                    if (!z10 && savedStarGift.unsaved) {
                        savedStarGift.unsaved = false;
                        TL_stars.saveStarGift savestargift = new TL_stars.saveStarGift();
                        savestargift.stargift = m2Var.f50471e.g(savedStarGift);
                        savestargift.unsave = savedStarGift.unsaved;
                        ConnectionsManager.getInstance(i10).sendRequest(savestargift, null, 64);
                    }
                    if (m2Var.f50471e.m(savedStarGift, z11, true)) {
                        yc.a0(nr0Var.f50544a).Q(R.raw.chats_infotip, 36, LocaleController.formatPluralStringComma("GiftsPinLimit", MessagesController.getInstance(i10).stargiftsPinnedToTopLimit)).j();
                    }
                    if (z10) {
                        return;
                    }
                    m2Var.f50472f.u0(0);
                    return;
                }
                return;
            }
            zh.w3 w3Var = new zh.w3(m2Var.getContext(), m2Var.f50469b, nr0Var.f50546c, m2Var.f50470c, null);
            w3Var.f52793d1 = new b2(m2Var, 2);
            w3Var.O0 = new sg.x(12, m2Var, savedStarGift);
            w3Var.j2(savedStarGift, m2Var.f50471e);
            w3Var.show();
        }
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        m2 m2Var;
        nr0 nr0Var;
        h1 h1Var;
        i5 i5Var;
        String str;
        final m2 m2Var2;
        nr0 nr0Var2;
        h1 h1Var2;
        boolean z10;
        boolean z11;
        String str2;
        LinearLayout linearLayout;
        boolean z12;
        f6 f6Var;
        Object obj6;
        h51 h51Var = (h51) obj;
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        m2 m2Var3 = this.f50319a;
        f6 f6Var2 = m2Var3.f50470c;
        int i10 = m2Var3.f50469b;
        nr0 nr0Var3 = m2Var3.f50468a;
        boolean z13 = false;
        if (m2Var3.f50471e != null) {
            if (view instanceof h1) {
                Object obj7 = h51Var.G;
                if (obj7 instanceof TL_stars.SavedStarGift) {
                    h1 h1Var3 = (h1) view;
                    final TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj7;
                    org.telegram.ui.ActionBar.n2 n2Var = nr0Var3.f50544a;
                    i5 i5Var2 = nr0Var3.f50547e;
                    n70 I = n70.I(n2Var, view);
                    nr0Var3.I = I;
                    if (i5Var2.h()) {
                        if (!m2Var3.d) {
                            i5Var2.d().size();
                        }
                        n70 J = I.J();
                        J.c(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new ji.h(I, 2), false);
                        J.k();
                        wx wxVar = new wx(m2Var3.getContext(), 2);
                        LinearLayout linearLayout2 = new LinearLayout(m2Var3.getContext());
                        wxVar.addView(linearLayout2);
                        linearLayout2.setOrientation(1);
                        J.r(wxVar, x5.n(-1, -2));
                        if (i5Var2.d().size() + 1 < MessagesController.getInstance(i10).config.stargiftsCollectionsLimit.get()) {
                            org.telegram.ui.ActionBar.f1 f1Var = new org.telegram.ui.ActionBar.f1(0, m2Var3.getContext(), m2Var3.f50470c, false, false);
                            f1Var.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
                            int i11 = j6.E8;
                            f1Var.c(j6.v0(i11, f6Var2), j6.v0(j6.F8, f6Var2));
                            f1Var.setSelectorColor(j6.l1(0.12f, j6.v0(i11, f6Var2)));
                            f1Var.g(LocaleController.getString(R.string.Gift2NewCollection), R.drawable.menu_folder_add, null);
                            f1Var.setOnClickListener(new yg.e(m2Var3, I, savedStarGift, 5));
                            linearLayout2.addView(f1Var, x5.n(-1, -2));
                        }
                        ArrayList d = i5Var2.d();
                        int size = d.size();
                        int i12 = 0;
                        while (i12 < size) {
                            int i13 = i12 + 1;
                            TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) d.get(i12);
                            ArrayList arrayList = i5Var2.e(tL_starGiftCollection.collection_id).f52132l;
                            nr0 nr0Var4 = nr0Var3;
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
                                if (s5.k((TL_stars.SavedStarGift) obj8, savedStarGift)) {
                                    linearLayout = linearLayout2;
                                    z12 = true;
                                    break;
                                }
                                size2 = i15;
                            }
                            org.telegram.ui.ActionBar.f1 f1Var2 = new org.telegram.ui.ActionBar.f1(2, m2Var3.getContext(), m2Var3.f50470c, false, false);
                            f1Var2.setChecked(z12);
                            m2 m2Var4 = m2Var3;
                            LinearLayout linearLayout3 = linearLayout;
                            f1Var2.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
                            int i16 = j6.E8;
                            f1Var2.c(j6.v0(i16, f6Var2), j6.v0(j6.F8, f6Var2));
                            f1Var2.setSelectorColor(j6.l1(0.12f, j6.v0(i16, f6Var2)));
                            if (tL_starGiftCollection.icon != null) {
                                q5 q5Var = new q5(3, i10, tL_starGiftCollection.icon);
                                f6Var = f6Var2;
                                f1Var2.getImageView().addOnAttachStateChangeListener(new bi.i2(q5Var, 3));
                                f1Var2.g(tL_starGiftCollection.title, 0, q5Var);
                                obj6 = null;
                            } else {
                                f6Var = f6Var2;
                                obj6 = null;
                                f1Var2.g(tL_starGiftCollection.title, R.drawable.msg_folders, null);
                            }
                            i5 i5Var3 = i5Var2;
                            f1Var2.setOnClickListener(new cb0(m2Var4, z12, tL_starGiftCollection, savedStarGift, I, 1));
                            linearLayout3.addView(f1Var2, x5.n(-1, -2));
                            linearLayout2 = linearLayout3;
                            m2Var3 = m2Var4;
                            nr0Var3 = nr0Var4;
                            i12 = i13;
                            h1Var3 = h1Var4;
                            i5Var2 = i5Var3;
                            size = size;
                            f6Var2 = f6Var;
                        }
                        m2Var = m2Var3;
                        nr0Var = nr0Var3;
                        h1Var = h1Var3;
                        i5Var = i5Var2;
                        str = null;
                        I.c(R.drawable.msg_addfolder, LocaleController.getString(R.string.Gift2AddToCollection), new fi.m2(I, J, 11), false);
                        I.k();
                    } else {
                        m2Var = m2Var3;
                        nr0Var = nr0Var3;
                        h1Var = h1Var3;
                        i5Var = i5Var2;
                        str = null;
                    }
                    if (savedStarGift.gift instanceof TL_stars.TL_starGiftUnique) {
                        if (nr0Var.c() && !m2Var.d && (!savedStarGift.unsaved || !savedStarGift.pinned_to_top)) {
                            boolean z14 = savedStarGift.pinned_to_top;
                            m2Var2 = m2Var;
                            nr0Var2 = nr0Var;
                            h1Var2 = h1Var;
                            z10 = false;
                            I.c(z14 ? R.drawable.msg_unpin : R.drawable.msg_pin, LocaleController.getString(z14 ? R.string.Gift2Unpin : R.string.Gift2Pin), new es0(m2Var2, savedStarGift, h1Var2, view, 26), false);
                            I.l(R.drawable.tabs_reorder, LocaleController.getString(R.string.Gift2Reorder), new b2(m2Var2, 0), savedStarGift.pinned_to_top);
                        } else {
                            m2Var2 = m2Var;
                            nr0Var2 = nr0Var;
                            h1Var2 = h1Var;
                            z10 = false;
                            if (nr0Var2.c() && m2Var2.d) {
                                I.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.Gift2Reorder), new b2(m2Var2, 1), false);
                            }
                        }
                        TL_stars.StarGift starGift = savedStarGift.gift;
                        TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
                        if (starGift.slug != null) {
                            str2 = MessagesController.getInstance(i10).linkPrefix + "/nft/" + savedStarGift.gift.slug;
                        } else {
                            str2 = str;
                        }
                        if (zh.w3.O1(i10, DialogObject.getPeerDialogId(tL_starGiftUnique.owner_id))) {
                            boolean P1 = zh.w3.P1(i10, tL_starGiftUnique);
                            I.c(P1 ? R.drawable.menu_takeoff : R.drawable.menu_wear, LocaleController.getString(P1 ? R.string.Gift2Unwear : R.string.Gift2Wear), new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r3) {
                                        case 0:
                                            m2 m2Var5 = m2Var2;
                                            l2 l2Var = new l2(m2Var5, m2Var5.getContext(), m2Var5.f50469b, m2Var5.f50468a.f50546c, m2Var5.f50470c, 0);
                                            l2Var.j2(savedStarGift, null);
                                            l2Var.r2(false);
                                            return;
                                        case 1:
                                            m2 m2Var6 = m2Var2;
                                            l2 l2Var2 = new l2(m2Var6, m2Var6.getContext(), m2Var6.f50469b, m2Var6.f50468a.f50546c, m2Var6.f50470c, 1);
                                            l2Var2.j2(savedStarGift, null);
                                            l2Var2.S1();
                                            return;
                                        default:
                                            m2 m2Var7 = m2Var2;
                                            l2 l2Var3 = new l2(m2Var7, m2Var7.getContext(), m2Var7.f50469b, m2Var7.f50468a.f50546c, m2Var7.f50470c, 2);
                                            l2Var3.j2(savedStarGift, null);
                                            l2Var3.Y1();
                                            return;
                                    }
                                }
                            }, z10);
                        }
                        I.l(R.drawable.msg_link2, LocaleController.getString(R.string.CopyLink), new ug.r(13, m2Var2, str2), str2 != null);
                        I.l(R.drawable.msg_share, LocaleController.getString(R.string.ShareFile), new Runnable() {
                            @Override
                            public final void run() {
                                switch (r3) {
                                    case 0:
                                        m2 m2Var5 = m2Var2;
                                        l2 l2Var = new l2(m2Var5, m2Var5.getContext(), m2Var5.f50469b, m2Var5.f50468a.f50546c, m2Var5.f50470c, 0);
                                        l2Var.j2(savedStarGift, null);
                                        l2Var.r2(false);
                                        return;
                                    case 1:
                                        m2 m2Var6 = m2Var2;
                                        l2 l2Var2 = new l2(m2Var6, m2Var6.getContext(), m2Var6.f50469b, m2Var6.f50468a.f50546c, m2Var6.f50470c, 1);
                                        l2Var2.j2(savedStarGift, null);
                                        l2Var2.S1();
                                        return;
                                    default:
                                        m2 m2Var7 = m2Var2;
                                        l2 l2Var3 = new l2(m2Var7, m2Var7.getContext(), m2Var7.f50469b, m2Var7.f50468a.f50546c, m2Var7.f50470c, 2);
                                        l2Var3.j2(savedStarGift, null);
                                        l2Var3.Y1();
                                        return;
                                }
                            }
                        }, str2 != null);
                    } else {
                        m2Var2 = m2Var;
                        nr0Var2 = nr0Var;
                        h1Var2 = h1Var;
                        z10 = false;
                        if (nr0Var2.c() && m2Var2.d) {
                            I.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.Gift2Reorder), new b2(m2Var2, 3), false);
                        }
                    }
                    if (zh.w3.O1(i10, nr0Var2.f50546c)) {
                        boolean z15 = savedStarGift.unsaved;
                        I.c(z15 ? R.drawable.msg_message : R.drawable.menu_hide_gift, LocaleController.getString(z15 ? R.string.Gift2ShowGift : R.string.Gift2HideGift), new wh.n(m2Var2, savedStarGift, h1Var2, 3), z10);
                    }
                    TL_stars.StarGift starGift2 = savedStarGift.gift;
                    if (starGift2 instanceof TL_stars.TL_starGiftUnique) {
                        I.l(R.drawable.menu_transfer, LocaleController.getString(R.string.Gift2TransferOption), new Runnable() {
                            @Override
                            public final void run() {
                                switch (r3) {
                                    case 0:
                                        m2 m2Var5 = m2Var2;
                                        l2 l2Var = new l2(m2Var5, m2Var5.getContext(), m2Var5.f50469b, m2Var5.f50468a.f50546c, m2Var5.f50470c, 0);
                                        l2Var.j2(savedStarGift, null);
                                        l2Var.r2(false);
                                        return;
                                    case 1:
                                        m2 m2Var6 = m2Var2;
                                        l2 l2Var2 = new l2(m2Var6, m2Var6.getContext(), m2Var6.f50469b, m2Var6.f50468a.f50546c, m2Var6.f50470c, 1);
                                        l2Var2.j2(savedStarGift, null);
                                        l2Var2.S1();
                                        return;
                                    default:
                                        m2 m2Var7 = m2Var2;
                                        l2 l2Var3 = new l2(m2Var7, m2Var7.getContext(), m2Var7.f50469b, m2Var7.f50468a.f50546c, m2Var7.f50470c, 2);
                                        l2Var3.j2(savedStarGift, null);
                                        l2Var3.Y1();
                                        return;
                                }
                            }
                        }, DialogObject.getPeerDialogId(((TL_stars.TL_starGiftUnique) starGift2).owner_id) == UserConfig.getInstance(i10).getClientUserId());
                    }
                    if (i5Var.h() && m2Var2.d) {
                        z11 = true;
                        I.c(R.drawable.msg_removefolder, LocaleController.getString(R.string.Gift2RemoveFromCollection), new wh.n(m2Var2, savedStarGift, I, 2), true);
                        I.E();
                        I.t();
                    } else {
                        z11 = true;
                    }
                    if (I.x() > 0) {
                        I.V(5);
                        I.f28689u = z11;
                        I.v = z11;
                        I.L = z11;
                        Point point = AndroidUtilities.displaySize;
                        int min = Math.min(point.x, point.y);
                        I.N = min - AndroidUtilities.dp(32.0f);
                        I.O = (int) (min * 0.6f);
                        I.P = z11;
                        I.W = z11;
                        I.Z();
                        h1Var2.f50356y.getImageReceiver().startAnimation(z11);
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
