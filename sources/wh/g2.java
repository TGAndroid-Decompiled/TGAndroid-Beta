package wh;

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
import org.telegram.ui.Components.lb0;
import org.telegram.ui.Components.p5;
import org.telegram.ui.Components.sx0;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.w70;
import org.telegram.ui.Components.wc;
import org.telegram.ui.Components.wr0;
import org.telegram.ui.fy0;
import org.telegram.ui.yx;
import w7.a6;
import xh.l5;
import xh.v5;
public final class g2 implements Utilities.Callback5, Utilities.Callback5Return {
    public final m2 f44099a;

    public g2(m2 m2Var) {
        this.f44099a = m2Var;
    }

    @Override
    public void mo17run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        v51 v51Var = (v51) obj;
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        m2 m2Var = this.f44099a;
        wr0 wr0Var = m2Var.f44246a;
        int i10 = m2Var.f44247b;
        if (m2Var.e == null) {
            return;
        }
        Object obj6 = v51Var.G;
        if (obj6 instanceof TL_stars.SavedStarGift) {
            TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj6;
            if (m2Var.f44250n) {
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
                        wc.a0(wr0Var.f44317a).Q(R.raw.chats_infotip, 36, LocaleController.formatPluralStringComma("GiftsPinLimit", MessagesController.getInstance(i10).stargiftsPinnedToTopLimit)).j();
                    }
                    if (z10) {
                        return;
                    }
                    m2Var.f44249f.u0(0);
                    return;
                }
                return;
            }
            xh.x3 x3Var = new xh.x3(m2Var.getContext(), m2Var.f44247b, wr0Var.f44319c, m2Var.f44248c, null);
            x3Var.f46274d1 = new b2(m2Var, 2);
            x3Var.O0 = new sg.f0(6, m2Var, savedStarGift);
            x3Var.j2(savedStarGift, m2Var.e);
            x3Var.show();
        }
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        m2 m2Var;
        wr0 wr0Var;
        h1 h1Var;
        l5 l5Var;
        String str;
        final m2 m2Var2;
        wr0 wr0Var2;
        h1 h1Var2;
        boolean z10;
        boolean z11;
        String str2;
        LinearLayout linearLayout;
        boolean z12;
        f6 f6Var;
        Object obj6;
        v51 v51Var = (v51) obj;
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        m2 m2Var3 = this.f44099a;
        f6 f6Var2 = m2Var3.f44248c;
        int i10 = m2Var3.f44247b;
        wr0 wr0Var3 = m2Var3.f44246a;
        boolean z13 = false;
        if (m2Var3.e != null) {
            if (view instanceof h1) {
                Object obj7 = v51Var.G;
                if (obj7 instanceof TL_stars.SavedStarGift) {
                    h1 h1Var3 = (h1) view;
                    final TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj7;
                    org.telegram.ui.ActionBar.p2 p2Var = wr0Var3.f44317a;
                    l5 l5Var2 = wr0Var3.e;
                    w70 I = w70.I(p2Var, view);
                    wr0Var3.I = I;
                    if (l5Var2.h()) {
                        if (!m2Var3.d) {
                            l5Var2.d().size();
                        }
                        w70 J = I.J();
                        J.c(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new hi.i(I, 2), false);
                        J.k();
                        yx yxVar = new yx(m2Var3.getContext(), 2);
                        LinearLayout linearLayout2 = new LinearLayout(m2Var3.getContext());
                        yxVar.addView(linearLayout2);
                        linearLayout2.setOrientation(1);
                        J.r(yxVar, a6.n(-1, -2));
                        if (l5Var2.d().size() + 1 < MessagesController.getInstance(i10).config.stargiftsCollectionsLimit.get()) {
                            org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(0, m2Var3.getContext(), m2Var3.f44248c, false, false);
                            g1Var.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
                            int i11 = j6.E8;
                            g1Var.c(j6.v0(i11, f6Var2), j6.v0(j6.F8, f6Var2));
                            g1Var.setSelectorColor(j6.l1(0.12f, j6.v0(i11, f6Var2)));
                            g1Var.g(LocaleController.getString(R.string.Gift2NewCollection), R.drawable.menu_folder_add, null);
                            g1Var.setOnClickListener(new r(m2Var3, I, savedStarGift, 1));
                            linearLayout2.addView(g1Var, a6.n(-1, -2));
                        }
                        ArrayList d = l5Var2.d();
                        int size = d.size();
                        int i12 = 0;
                        while (i12 < size) {
                            int i13 = i12 + 1;
                            TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) d.get(i12);
                            ArrayList arrayList = l5Var2.e(tL_starGiftCollection.collection_id).f45761l;
                            wr0 wr0Var4 = wr0Var3;
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
                                if (v5.k((TL_stars.SavedStarGift) obj8, savedStarGift)) {
                                    linearLayout = linearLayout2;
                                    z12 = true;
                                    break;
                                }
                                size2 = i15;
                            }
                            org.telegram.ui.ActionBar.g1 g1Var2 = new org.telegram.ui.ActionBar.g1(2, m2Var3.getContext(), m2Var3.f44248c, false, false);
                            g1Var2.setChecked(z12);
                            m2 m2Var4 = m2Var3;
                            LinearLayout linearLayout3 = linearLayout;
                            g1Var2.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
                            int i16 = j6.E8;
                            g1Var2.c(j6.v0(i16, f6Var2), j6.v0(j6.F8, f6Var2));
                            g1Var2.setSelectorColor(j6.l1(0.12f, j6.v0(i16, f6Var2)));
                            if (tL_starGiftCollection.icon != null) {
                                p5 p5Var = new p5(3, i10, tL_starGiftCollection.icon);
                                f6Var = f6Var2;
                                g1Var2.getImageView().addOnAttachStateChangeListener(new l.d(p5Var, 2));
                                g1Var2.g(tL_starGiftCollection.title, 0, p5Var);
                                obj6 = null;
                            } else {
                                f6Var = f6Var2;
                                obj6 = null;
                                g1Var2.g(tL_starGiftCollection.title, R.drawable.msg_folders, null);
                            }
                            l5 l5Var3 = l5Var2;
                            g1Var2.setOnClickListener(new lb0(m2Var4, z12, tL_starGiftCollection, savedStarGift, I, 1));
                            linearLayout3.addView(g1Var2, a6.n(-1, -2));
                            linearLayout2 = linearLayout3;
                            m2Var3 = m2Var4;
                            wr0Var3 = wr0Var4;
                            i12 = i13;
                            h1Var3 = h1Var4;
                            l5Var2 = l5Var3;
                            size = size;
                            f6Var2 = f6Var;
                        }
                        m2Var = m2Var3;
                        wr0Var = wr0Var3;
                        h1Var = h1Var3;
                        l5Var = l5Var2;
                        str = null;
                        I.c(R.drawable.msg_addfolder, LocaleController.getString(R.string.Gift2AddToCollection), new di.p2(I, J, 11), false);
                        I.k();
                    } else {
                        m2Var = m2Var3;
                        wr0Var = wr0Var3;
                        h1Var = h1Var3;
                        l5Var = l5Var2;
                        str = null;
                    }
                    if (savedStarGift.gift instanceof TL_stars.TL_starGiftUnique) {
                        if (wr0Var.c() && !m2Var.d && (!savedStarGift.unsaved || !savedStarGift.pinned_to_top)) {
                            boolean z14 = savedStarGift.pinned_to_top;
                            m2Var2 = m2Var;
                            wr0Var2 = wr0Var;
                            h1Var2 = h1Var;
                            z10 = false;
                            I.c(z14 ? R.drawable.msg_unpin : R.drawable.msg_pin, LocaleController.getString(z14 ? R.string.Gift2Unpin : R.string.Gift2Pin), new fy0((Object) m2Var2, (Object) savedStarGift, (Object) h1Var2, (Object) view, 22), false);
                            I.l(R.drawable.tabs_reorder, LocaleController.getString(R.string.Gift2Reorder), new b2(m2Var2, 0), savedStarGift.pinned_to_top);
                        } else {
                            m2Var2 = m2Var;
                            wr0Var2 = wr0Var;
                            h1Var2 = h1Var;
                            z10 = false;
                            if (wr0Var2.c() && m2Var2.d) {
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
                        if (xh.x3.O1(i10, DialogObject.getPeerDialogId(tL_starGiftUnique.owner_id))) {
                            boolean P1 = xh.x3.P1(i10, tL_starGiftUnique);
                            I.c(P1 ? R.drawable.menu_takeoff : R.drawable.menu_wear, LocaleController.getString(P1 ? R.string.Gift2Unwear : R.string.Gift2Wear), new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r3) {
                                        case 0:
                                            m2 m2Var5 = m2Var2;
                                            l2 l2Var = new l2(m2Var5, m2Var5.getContext(), m2Var5.f44247b, m2Var5.f44246a.f44319c, m2Var5.f44248c, 0);
                                            l2Var.j2(savedStarGift, null);
                                            l2Var.r2(false);
                                            return;
                                        case 1:
                                            m2 m2Var6 = m2Var2;
                                            l2 l2Var2 = new l2(m2Var6, m2Var6.getContext(), m2Var6.f44247b, m2Var6.f44246a.f44319c, m2Var6.f44248c, 1);
                                            l2Var2.j2(savedStarGift, null);
                                            l2Var2.S1();
                                            return;
                                        default:
                                            m2 m2Var7 = m2Var2;
                                            l2 l2Var3 = new l2(m2Var7, m2Var7.getContext(), m2Var7.f44247b, m2Var7.f44246a.f44319c, m2Var7.f44248c, 2);
                                            l2Var3.j2(savedStarGift, null);
                                            l2Var3.Y1();
                                            return;
                                    }
                                }
                            }, z10);
                        }
                        I.l(R.drawable.msg_link2, LocaleController.getString(R.string.CopyLink), new u2.k0(8, m2Var2, str2), str2 != null);
                        I.l(R.drawable.msg_share, LocaleController.getString(R.string.ShareFile), new Runnable() {
                            @Override
                            public final void run() {
                                switch (r3) {
                                    case 0:
                                        m2 m2Var5 = m2Var2;
                                        l2 l2Var = new l2(m2Var5, m2Var5.getContext(), m2Var5.f44247b, m2Var5.f44246a.f44319c, m2Var5.f44248c, 0);
                                        l2Var.j2(savedStarGift, null);
                                        l2Var.r2(false);
                                        return;
                                    case 1:
                                        m2 m2Var6 = m2Var2;
                                        l2 l2Var2 = new l2(m2Var6, m2Var6.getContext(), m2Var6.f44247b, m2Var6.f44246a.f44319c, m2Var6.f44248c, 1);
                                        l2Var2.j2(savedStarGift, null);
                                        l2Var2.S1();
                                        return;
                                    default:
                                        m2 m2Var7 = m2Var2;
                                        l2 l2Var3 = new l2(m2Var7, m2Var7.getContext(), m2Var7.f44247b, m2Var7.f44246a.f44319c, m2Var7.f44248c, 2);
                                        l2Var3.j2(savedStarGift, null);
                                        l2Var3.Y1();
                                        return;
                                }
                            }
                        }, str2 != null);
                    } else {
                        m2Var2 = m2Var;
                        wr0Var2 = wr0Var;
                        h1Var2 = h1Var;
                        z10 = false;
                        if (wr0Var2.c() && m2Var2.d) {
                            I.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.Gift2Reorder), new b2(m2Var2, 3), false);
                        }
                    }
                    if (xh.x3.O1(i10, wr0Var2.f44319c)) {
                        boolean z15 = savedStarGift.unsaved;
                        I.c(z15 ? R.drawable.msg_message : R.drawable.menu_hide_gift, LocaleController.getString(z15 ? R.string.Gift2ShowGift : R.string.Gift2HideGift), new sx0((Object) m2Var2, (Object) savedStarGift, (Object) h1Var2, 25), z10);
                    }
                    TL_stars.StarGift starGift2 = savedStarGift.gift;
                    if (starGift2 instanceof TL_stars.TL_starGiftUnique) {
                        I.l(R.drawable.menu_transfer, LocaleController.getString(R.string.Gift2TransferOption), new Runnable() {
                            @Override
                            public final void run() {
                                switch (r3) {
                                    case 0:
                                        m2 m2Var5 = m2Var2;
                                        l2 l2Var = new l2(m2Var5, m2Var5.getContext(), m2Var5.f44247b, m2Var5.f44246a.f44319c, m2Var5.f44248c, 0);
                                        l2Var.j2(savedStarGift, null);
                                        l2Var.r2(false);
                                        return;
                                    case 1:
                                        m2 m2Var6 = m2Var2;
                                        l2 l2Var2 = new l2(m2Var6, m2Var6.getContext(), m2Var6.f44247b, m2Var6.f44246a.f44319c, m2Var6.f44248c, 1);
                                        l2Var2.j2(savedStarGift, null);
                                        l2Var2.S1();
                                        return;
                                    default:
                                        m2 m2Var7 = m2Var2;
                                        l2 l2Var3 = new l2(m2Var7, m2Var7.getContext(), m2Var7.f44247b, m2Var7.f44246a.f44319c, m2Var7.f44248c, 2);
                                        l2Var3.j2(savedStarGift, null);
                                        l2Var3.Y1();
                                        return;
                                }
                            }
                        }, DialogObject.getPeerDialogId(((TL_stars.TL_starGiftUnique) starGift2).owner_id) == UserConfig.getInstance(i10).getClientUserId());
                    }
                    if (l5Var.h() && m2Var2.d) {
                        z11 = true;
                        I.c(R.drawable.msg_removefolder, LocaleController.getString(R.string.Gift2RemoveFromCollection), new sx0((Object) m2Var2, (Object) savedStarGift, (Object) I, 24), true);
                        I.E();
                        I.t();
                    } else {
                        z11 = true;
                    }
                    if (I.x() > 0) {
                        I.V(5);
                        I.f28703u = z11;
                        I.v = z11;
                        I.L = z11;
                        Point point = AndroidUtilities.displaySize;
                        int min = Math.min(point.x, point.y);
                        I.N = min - AndroidUtilities.dp(32.0f);
                        I.O = (int) (min * 0.6f);
                        I.P = z11;
                        I.W = z11;
                        I.Z();
                        h1Var2.f44134y.getImageReceiver().startAnimation(z11);
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
