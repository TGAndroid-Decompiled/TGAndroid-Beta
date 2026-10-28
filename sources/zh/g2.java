package zh;

import android.graphics.Point;
import android.view.View;
import android.widget.LinearLayout;
import bi.ca;
import bi.h7;
import bi.i6;
import bi.q9;
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
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.l80;
import org.telegram.ui.Components.t5;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.vb0;
import org.telegram.ui.Components.wc;
import org.telegram.ui.Components.ws0;
import org.telegram.ui.bh1;
import org.telegram.ui.dx;
public final class g2 implements Utilities.Callback5, Utilities.Callback5Return {
    public final m2 f53069a;

    public g2(m2 m2Var) {
        this.f53069a = m2Var;
    }

    @Override
    public void mo5run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        u61 u61Var = (u61) obj;
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        m2 m2Var = this.f53069a;
        ws0 ws0Var = m2Var.f53201a;
        int i10 = m2Var.f53202b;
        if (m2Var.e == null) {
            return;
        }
        Object obj6 = u61Var.G;
        if (obj6 instanceof TL_stars.SavedStarGift) {
            TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj6;
            if (m2Var.h) {
                if (!m2Var.d && (savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) {
                    boolean z10 = savedStarGift.pinned_to_top;
                    boolean z11 = !z10;
                    if (!z10 && savedStarGift.unsaved) {
                        savedStarGift.unsaved = false;
                        TL_stars.saveStarGift savestargift = new TL_stars.saveStarGift();
                        savestargift.stargift = m2Var.e.h(savedStarGift);
                        savestargift.unsave = savedStarGift.unsaved;
                        ConnectionsManager.getInstance(i10).sendRequest(savestargift, null, 64);
                    }
                    if (m2Var.e.o(savedStarGift, z11, true)) {
                        wc.b0(ws0Var.f53288a).R(R.raw.chats_infotip, 36, LocaleController.formatPluralStringComma("GiftsPinLimit", MessagesController.getInstance(i10).stargiftsPinnedToTopLimit)).j();
                    }
                    if (z10) {
                        return;
                    }
                    m2Var.f53204f.v0(0);
                    return;
                }
                return;
            }
            h7 h7Var = new h7(m2Var.getContext(), m2Var.f53202b, ws0Var.f53290c, m2Var.f53203c, null);
            h7Var.f4748k1 = new b2(m2Var, 2);
            h7Var.R0 = new bh1(29, m2Var, savedStarGift);
            h7Var.L2(savedStarGift, m2Var.e);
            h7Var.show();
        }
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean z10;
        ws0 ws0Var;
        m2 m2Var;
        g1 g1Var;
        String str;
        q9 q9Var;
        final m2 m2Var2;
        ws0 ws0Var2;
        g1 g1Var2;
        boolean z11;
        String str2;
        LinearLayout linearLayout;
        boolean z12;
        g1 g1Var3;
        Object obj6;
        u61 u61Var = (u61) obj;
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        m2 m2Var3 = this.f53069a;
        int i10 = m2Var3.f53202b;
        ws0 ws0Var3 = m2Var3.f53201a;
        boolean z13 = false;
        if (m2Var3.e != null) {
            if (view instanceof g1) {
                Object obj7 = u61Var.G;
                if (obj7 instanceof TL_stars.SavedStarGift) {
                    g1 g1Var4 = (g1) view;
                    final TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj7;
                    org.telegram.ui.ActionBar.r2 r2Var = ws0Var3.f53288a;
                    q9 q9Var2 = ws0Var3.e;
                    l80 I = l80.I(r2Var, view);
                    ws0Var3.I = I;
                    if (q9Var2.h()) {
                        if (!m2Var3.d) {
                            q9Var2.d().size();
                        }
                        l80 J = I.J();
                        J.c(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new li.h(I, 2), false);
                        J.k();
                        dx dxVar = new dx(m2Var3.getContext(), 4);
                        LinearLayout linearLayout2 = new LinearLayout(m2Var3.getContext());
                        dxVar.addView(linearLayout2);
                        linearLayout2.setOrientation(1);
                        boolean z14 = true;
                        J.r(dxVar, kb1.r(-1, -2));
                        if (q9Var2.d().size() + 1 < MessagesController.getInstance(i10).config.stargiftsCollectionsLimit.get()) {
                            org.telegram.ui.ActionBar.g1 g1Var5 = new org.telegram.ui.ActionBar.g1(0, m2Var3.getContext(), m2Var3.f53203c, false, false);
                            g1Var5.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
                            int i11 = y6.E8;
                            g1Var5.c(i11, y6.F8);
                            g1Var5.h(0.12f, i11);
                            g1Var5.j(LocaleController.getString(R.string.Gift2NewCollection), R.drawable.menu_folder_add, null);
                            g1Var5.setOnClickListener(new b51(m2Var3, I, savedStarGift, 8));
                            linearLayout2.addView(g1Var5, kb1.r(-1, -2));
                        }
                        ArrayList d = q9Var2.d();
                        int size = d.size();
                        int i12 = 0;
                        while (i12 < size) {
                            int i13 = i12 + 1;
                            TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) d.get(i12);
                            ArrayList arrayList = q9Var2.e(tL_starGiftCollection.collection_id).f5471l;
                            int size2 = arrayList.size();
                            ws0 ws0Var4 = ws0Var3;
                            int i14 = 0;
                            while (true) {
                                if (i14 >= size2) {
                                    linearLayout = linearLayout2;
                                    z12 = false;
                                    break;
                                }
                                Object obj8 = arrayList.get(i14);
                                int i15 = i14 + 1;
                                if (ca.k((TL_stars.SavedStarGift) obj8, savedStarGift)) {
                                    linearLayout = linearLayout2;
                                    z12 = z14;
                                    break;
                                }
                                i14 = i15;
                            }
                            org.telegram.ui.ActionBar.g1 g1Var6 = new org.telegram.ui.ActionBar.g1(2, m2Var3.getContext(), m2Var3.f53203c, false, false);
                            g1Var6.setChecked(z12);
                            LinearLayout linearLayout3 = linearLayout;
                            m2 m2Var4 = m2Var3;
                            g1Var6.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
                            int i16 = y6.E8;
                            g1Var6.c(i16, y6.F8);
                            g1Var6.h(0.12f, i16);
                            if (tL_starGiftCollection.icon != null) {
                                t5 t5Var = new t5(3, i10, tL_starGiftCollection.icon);
                                g1Var3 = g1Var4;
                                g1Var6.getImageView().addOnAttachStateChangeListener(new i6(t5Var, 5));
                                g1Var6.j(tL_starGiftCollection.title, 0, t5Var);
                                obj6 = null;
                            } else {
                                g1Var3 = g1Var4;
                                obj6 = null;
                                g1Var6.j(tL_starGiftCollection.title, R.drawable.msg_folders, null);
                            }
                            ArrayList arrayList2 = d;
                            g1Var6.setOnClickListener(new vb0(m2Var4, z12, tL_starGiftCollection, savedStarGift, I, 1));
                            linearLayout3.addView(g1Var6, kb1.r(-1, -2));
                            d = arrayList2;
                            size = size;
                            linearLayout2 = linearLayout3;
                            m2Var3 = m2Var4;
                            i12 = i13;
                            ws0Var3 = ws0Var4;
                            g1Var4 = g1Var3;
                            z14 = true;
                        }
                        ws0Var = ws0Var3;
                        m2Var = m2Var3;
                        g1Var = g1Var4;
                        str = null;
                        int i17 = R.drawable.msg_addfolder;
                        String string = LocaleController.getString(R.string.Gift2AddToCollection);
                        hi.o2 o2Var = new hi.o2(I, J, 11);
                        z10 = false;
                        I.c(i17, string, o2Var, false);
                        I.k();
                    } else {
                        ws0Var = ws0Var3;
                        m2Var = m2Var3;
                        g1Var = g1Var4;
                        z10 = false;
                        str = null;
                    }
                    if (savedStarGift.gift instanceof TL_stars.TL_starGiftUnique) {
                        if (ws0Var.c() && !m2Var.d && (!savedStarGift.unsaved || !savedStarGift.pinned_to_top)) {
                            boolean z15 = savedStarGift.pinned_to_top;
                            q9Var = q9Var2;
                            m2Var2 = m2Var;
                            ws0Var2 = ws0Var;
                            g1Var2 = g1Var;
                            I.c(z15 ? R.drawable.msg_unpin : R.drawable.msg_pin, LocaleController.getString(z15 ? R.string.Gift2Unpin : R.string.Gift2Pin), new sg.g2(m2Var2, savedStarGift, g1Var2, view, 5), z10);
                            I.l(R.drawable.tabs_reorder, LocaleController.getString(R.string.Gift2Reorder), new b2(m2Var2, 0), savedStarGift.pinned_to_top);
                        } else {
                            q9Var = q9Var2;
                            m2Var2 = m2Var;
                            ws0Var2 = ws0Var;
                            g1Var2 = g1Var;
                            if (ws0Var2.c() && m2Var2.d) {
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
                        if (h7.i2(i10, DialogObject.getPeerDialogId(tL_starGiftUnique.owner_id))) {
                            boolean j22 = h7.j2(i10, tL_starGiftUnique);
                            I.c(j22 ? R.drawable.menu_takeoff : R.drawable.menu_wear, LocaleController.getString(j22 ? R.string.Gift2Unwear : R.string.Gift2Wear), new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r3) {
                                        case 0:
                                            m2 m2Var5 = m2Var2;
                                            l2 l2Var = new l2(m2Var5, m2Var5.getContext(), m2Var5.f53202b, m2Var5.f53201a.f53290c, m2Var5.f53203c, 0);
                                            l2Var.L2(savedStarGift, null);
                                            l2Var.V2(false);
                                            return;
                                        case 1:
                                            m2 m2Var6 = m2Var2;
                                            l2 l2Var2 = new l2(m2Var6, m2Var6.getContext(), m2Var6.f53202b, m2Var6.f53201a.f53290c, m2Var6.f53203c, 1);
                                            l2Var2.L2(savedStarGift, null);
                                            l2Var2.m2();
                                            return;
                                        default:
                                            m2 m2Var7 = m2Var2;
                                            l2 l2Var3 = new l2(m2Var7, m2Var7.getContext(), m2Var7.f53202b, m2Var7.f53201a.f53290c, m2Var7.f53203c, 2);
                                            l2Var3.L2(savedStarGift, null);
                                            l2Var3.w2();
                                            return;
                                    }
                                }
                            }, z10);
                        }
                        I.l(R.drawable.msg_link2, LocaleController.getString(R.string.CopyLink), new vi.k0(12, m2Var2, str2), str2 != null ? true : z10);
                        I.l(R.drawable.msg_share, LocaleController.getString(R.string.ShareFile), new Runnable() {
                            @Override
                            public final void run() {
                                switch (r3) {
                                    case 0:
                                        m2 m2Var5 = m2Var2;
                                        l2 l2Var = new l2(m2Var5, m2Var5.getContext(), m2Var5.f53202b, m2Var5.f53201a.f53290c, m2Var5.f53203c, 0);
                                        l2Var.L2(savedStarGift, null);
                                        l2Var.V2(false);
                                        return;
                                    case 1:
                                        m2 m2Var6 = m2Var2;
                                        l2 l2Var2 = new l2(m2Var6, m2Var6.getContext(), m2Var6.f53202b, m2Var6.f53201a.f53290c, m2Var6.f53203c, 1);
                                        l2Var2.L2(savedStarGift, null);
                                        l2Var2.m2();
                                        return;
                                    default:
                                        m2 m2Var7 = m2Var2;
                                        l2 l2Var3 = new l2(m2Var7, m2Var7.getContext(), m2Var7.f53202b, m2Var7.f53201a.f53290c, m2Var7.f53203c, 2);
                                        l2Var3.L2(savedStarGift, null);
                                        l2Var3.w2();
                                        return;
                                }
                            }
                        }, str2 != null ? true : z10);
                    } else {
                        q9Var = q9Var2;
                        m2Var2 = m2Var;
                        ws0Var2 = ws0Var;
                        g1Var2 = g1Var;
                        if (ws0Var2.c() && m2Var2.d) {
                            I.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.Gift2Reorder), new b2(m2Var2, 3), z10);
                        }
                    }
                    if (h7.i2(i10, ws0Var2.f53290c)) {
                        boolean z16 = savedStarGift.unsaved;
                        I.c(z16 ? R.drawable.msg_message : R.drawable.menu_hide_gift, LocaleController.getString(z16 ? R.string.Gift2ShowGift : R.string.Gift2HideGift), new s1(m2Var2, savedStarGift, g1Var2, 2), z10);
                    }
                    TL_stars.StarGift starGift2 = savedStarGift.gift;
                    if (starGift2 instanceof TL_stars.TL_starGiftUnique) {
                        I.l(R.drawable.menu_transfer, LocaleController.getString(R.string.Gift2TransferOption), new Runnable() {
                            @Override
                            public final void run() {
                                switch (r3) {
                                    case 0:
                                        m2 m2Var5 = m2Var2;
                                        l2 l2Var = new l2(m2Var5, m2Var5.getContext(), m2Var5.f53202b, m2Var5.f53201a.f53290c, m2Var5.f53203c, 0);
                                        l2Var.L2(savedStarGift, null);
                                        l2Var.V2(false);
                                        return;
                                    case 1:
                                        m2 m2Var6 = m2Var2;
                                        l2 l2Var2 = new l2(m2Var6, m2Var6.getContext(), m2Var6.f53202b, m2Var6.f53201a.f53290c, m2Var6.f53203c, 1);
                                        l2Var2.L2(savedStarGift, null);
                                        l2Var2.m2();
                                        return;
                                    default:
                                        m2 m2Var7 = m2Var2;
                                        l2 l2Var3 = new l2(m2Var7, m2Var7.getContext(), m2Var7.f53202b, m2Var7.f53201a.f53290c, m2Var7.f53203c, 2);
                                        l2Var3.L2(savedStarGift, null);
                                        l2Var3.w2();
                                        return;
                                }
                            }
                        }, DialogObject.getPeerDialogId(((TL_stars.TL_starGiftUnique) starGift2).owner_id) == UserConfig.getInstance(i10).getClientUserId() ? true : z10);
                    }
                    if (q9Var.h() && m2Var2.d) {
                        int i18 = R.drawable.msg_removefolder;
                        String string2 = LocaleController.getString(R.string.Gift2RemoveFromCollection);
                        s1 s1Var = new s1(m2Var2, savedStarGift, I, 1);
                        z11 = true;
                        I.c(i18, string2, s1Var, true);
                        I.E();
                        I.t();
                    } else {
                        z11 = true;
                    }
                    if (I.x() > 0) {
                        I.V(5);
                        I.f30170u = z11;
                        I.v = z11;
                        I.L = z11;
                        Point point = AndroidUtilities.displaySize;
                        int min = Math.min(point.x, point.y);
                        I.N = min - AndroidUtilities.dp(32.0f);
                        I.O = (int) (min * 0.6f);
                        I.P = z11;
                        I.W = z11;
                        I.Z();
                        g1Var2.f53068y.getImageReceiver().startAnimation(z11);
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
