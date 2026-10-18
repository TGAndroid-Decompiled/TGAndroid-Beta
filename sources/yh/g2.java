package yh;

import ai.ga;
import ai.k7;
import ai.m6;
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
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.i80;
import org.telegram.ui.Components.is0;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.r5;
import org.telegram.ui.Components.vb0;
import org.telegram.ui.Components.xc;
import org.telegram.ui.gx;
import w7.z5;
public final class g2 implements Utilities.Callback5, Utilities.Callback5Return {
    public final m2 f50291a;

    public g2(m2 m2Var) {
        this.f50291a = m2Var;
    }

    @Override
    public void mo0run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        f61 f61Var = (f61) obj;
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        m2 m2Var = this.f50291a;
        is0 is0Var = m2Var.f50419a;
        int i10 = m2Var.f50420b;
        if (m2Var.e == null) {
            return;
        }
        Object obj6 = f61Var.G;
        if (obj6 instanceof TL_stars.SavedStarGift) {
            TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj6;
            if (m2Var.f50423n) {
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
                    if (m2Var.e.n(savedStarGift, z11, true)) {
                        xc.a0(is0Var.f50517a).Q(R.raw.chats_infotip, 36, LocaleController.formatPluralStringComma("GiftsPinLimit", MessagesController.getInstance(i10).stargiftsPinnedToTopLimit)).j();
                    }
                    if (z10) {
                        return;
                    }
                    m2Var.f50422f.u0(0);
                    return;
                }
                return;
            }
            k7 k7Var = new k7(m2Var.getContext(), m2Var.f50420b, is0Var.f50519c, m2Var.f50421c, null);
            k7Var.f1672k1 = new b2(m2Var, 2);
            k7Var.R0 = new org.telegram.ui.web.m(23, m2Var, savedStarGift);
            k7Var.F2(savedStarGift, m2Var.e);
            k7Var.show();
        }
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean z10;
        m2 m2Var;
        is0 is0Var;
        h1 h1Var;
        v9 v9Var;
        String str;
        final m2 m2Var2;
        is0 is0Var2;
        h1 h1Var2;
        boolean z11;
        String str2;
        LinearLayout linearLayout;
        boolean z12;
        d6 d6Var;
        Object obj6;
        f61 f61Var = (f61) obj;
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        m2 m2Var3 = this.f50291a;
        d6 d6Var2 = m2Var3.f50421c;
        int i10 = m2Var3.f50420b;
        is0 is0Var3 = m2Var3.f50419a;
        boolean z13 = false;
        if (m2Var3.e != null) {
            if (view instanceof h1) {
                Object obj7 = f61Var.G;
                if (obj7 instanceof TL_stars.SavedStarGift) {
                    h1 h1Var3 = (h1) view;
                    final TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj7;
                    org.telegram.ui.ActionBar.n2 n2Var = is0Var3.f50517a;
                    v9 v9Var2 = is0Var3.e;
                    i80 I = i80.I(n2Var, view);
                    is0Var3.I = I;
                    if (v9Var2.h()) {
                        if (!m2Var3.d) {
                            v9Var2.d().size();
                        }
                        i80 J = I.J();
                        J.c(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new ki.h(I, 2), false);
                        J.k();
                        gx gxVar = new gx(m2Var3.getContext(), 4);
                        LinearLayout linearLayout2 = new LinearLayout(m2Var3.getContext());
                        gxVar.addView(linearLayout2);
                        linearLayout2.setOrientation(1);
                        boolean z14 = true;
                        J.r(gxVar, z5.n(-1, -2));
                        if (v9Var2.d().size() + 1 < MessagesController.getInstance(i10).config.stargiftsCollectionsLimit.get()) {
                            org.telegram.ui.ActionBar.e1 e1Var = new org.telegram.ui.ActionBar.e1(0, m2Var3.getContext(), m2Var3.f50421c, false, false);
                            e1Var.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
                            int i11 = h6.E8;
                            e1Var.c(h6.w0(i11, d6Var2), h6.w0(h6.F8, d6Var2));
                            e1Var.setSelectorColor(h6.m1(0.12f, h6.w0(i11, d6Var2)));
                            e1Var.g(LocaleController.getString(R.string.Gift2NewCollection), R.drawable.menu_folder_add, null);
                            e1Var.setOnClickListener(new m41(m2Var3, I, savedStarGift, 8));
                            linearLayout2.addView(e1Var, z5.n(-1, -2));
                        }
                        ArrayList d = v9Var2.d();
                        int size = d.size();
                        int i12 = 0;
                        while (i12 < size) {
                            int i13 = i12 + 1;
                            TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) d.get(i12);
                            ArrayList arrayList = v9Var2.e(tL_starGiftCollection.collection_id).f2498l;
                            is0 is0Var4 = is0Var3;
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
                                if (ga.k((TL_stars.SavedStarGift) obj8, savedStarGift)) {
                                    linearLayout = linearLayout2;
                                    z12 = z14;
                                    break;
                                }
                                size2 = i15;
                            }
                            org.telegram.ui.ActionBar.e1 e1Var2 = new org.telegram.ui.ActionBar.e1(2, m2Var3.getContext(), m2Var3.f50421c, false, false);
                            e1Var2.setChecked(z12);
                            m2 m2Var4 = m2Var3;
                            LinearLayout linearLayout3 = linearLayout;
                            e1Var2.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
                            int i16 = h6.E8;
                            e1Var2.c(h6.w0(i16, d6Var2), h6.w0(h6.F8, d6Var2));
                            e1Var2.setSelectorColor(h6.m1(0.12f, h6.w0(i16, d6Var2)));
                            if (tL_starGiftCollection.icon != null) {
                                r5 r5Var = new r5(3, i10, tL_starGiftCollection.icon);
                                d6Var = d6Var2;
                                e1Var2.getImageView().addOnAttachStateChangeListener(new m6(r5Var, 5));
                                e1Var2.g(tL_starGiftCollection.title, 0, r5Var);
                                obj6 = null;
                            } else {
                                d6Var = d6Var2;
                                obj6 = null;
                                e1Var2.g(tL_starGiftCollection.title, R.drawable.msg_folders, null);
                            }
                            v9 v9Var3 = v9Var2;
                            e1Var2.setOnClickListener(new vb0(m2Var4, z12, tL_starGiftCollection, savedStarGift, I, 1));
                            linearLayout3.addView(e1Var2, z5.n(-1, -2));
                            linearLayout2 = linearLayout3;
                            m2Var3 = m2Var4;
                            is0Var3 = is0Var4;
                            i12 = i13;
                            h1Var3 = h1Var4;
                            v9Var2 = v9Var3;
                            z14 = true;
                            size = size;
                            d6Var2 = d6Var;
                        }
                        m2Var = m2Var3;
                        is0Var = is0Var3;
                        h1Var = h1Var3;
                        v9Var = v9Var2;
                        str = null;
                        z13 = false;
                        I.c(R.drawable.msg_addfolder, LocaleController.getString(R.string.Gift2AddToCollection), new gi.g2(I, J, 11), false);
                        I.k();
                    } else {
                        m2Var = m2Var3;
                        is0Var = is0Var3;
                        h1Var = h1Var3;
                        v9Var = v9Var2;
                        str = null;
                    }
                    if (savedStarGift.gift instanceof TL_stars.TL_starGiftUnique) {
                        if (is0Var.c() && !m2Var.d && (!savedStarGift.unsaved || !savedStarGift.pinned_to_top)) {
                            boolean z15 = savedStarGift.pinned_to_top;
                            m2Var2 = m2Var;
                            is0Var2 = is0Var;
                            h1Var2 = h1Var;
                            z10 = z13;
                            I.c(z15 ? R.drawable.msg_unpin : R.drawable.msg_pin, LocaleController.getString(z15 ? R.string.Gift2Unpin : R.string.Gift2Pin), new si.p(m2Var2, savedStarGift, h1Var2, view, 2), z10);
                            I.l(R.drawable.tabs_reorder, LocaleController.getString(R.string.Gift2Reorder), new b2(m2Var2, 0), savedStarGift.pinned_to_top);
                        } else {
                            m2Var2 = m2Var;
                            is0Var2 = is0Var;
                            h1Var2 = h1Var;
                            z10 = z13;
                            if (is0Var2.c() && m2Var2.d) {
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
                        if (k7.c2(i10, DialogObject.getPeerDialogId(tL_starGiftUnique.owner_id))) {
                            boolean d22 = k7.d2(i10, tL_starGiftUnique);
                            I.c(d22 ? R.drawable.menu_takeoff : R.drawable.menu_wear, LocaleController.getString(d22 ? R.string.Gift2Unwear : R.string.Gift2Wear), new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r3) {
                                        case 0:
                                            m2 m2Var5 = m2Var2;
                                            l2 l2Var = new l2(m2Var5, m2Var5.getContext(), m2Var5.f50420b, m2Var5.f50419a.f50519c, m2Var5.f50421c, 0);
                                            l2Var.F2(savedStarGift, null);
                                            l2Var.P2(false);
                                            return;
                                        case 1:
                                            m2 m2Var6 = m2Var2;
                                            l2 l2Var2 = new l2(m2Var6, m2Var6.getContext(), m2Var6.f50420b, m2Var6.f50419a.f50519c, m2Var6.f50421c, 1);
                                            l2Var2.F2(savedStarGift, null);
                                            l2Var2.g2();
                                            return;
                                        default:
                                            m2 m2Var7 = m2Var2;
                                            l2 l2Var3 = new l2(m2Var7, m2Var7.getContext(), m2Var7.f50420b, m2Var7.f50419a.f50519c, m2Var7.f50421c, 2);
                                            l2Var3.F2(savedStarGift, null);
                                            l2Var3.q2();
                                            return;
                                    }
                                }
                            }, z10);
                        }
                        I.l(R.drawable.msg_link2, LocaleController.getString(R.string.CopyLink), new uf.c(19, m2Var2, str2), str2 != null ? true : z10);
                        I.l(R.drawable.msg_share, LocaleController.getString(R.string.ShareFile), new Runnable() {
                            @Override
                            public final void run() {
                                switch (r3) {
                                    case 0:
                                        m2 m2Var5 = m2Var2;
                                        l2 l2Var = new l2(m2Var5, m2Var5.getContext(), m2Var5.f50420b, m2Var5.f50419a.f50519c, m2Var5.f50421c, 0);
                                        l2Var.F2(savedStarGift, null);
                                        l2Var.P2(false);
                                        return;
                                    case 1:
                                        m2 m2Var6 = m2Var2;
                                        l2 l2Var2 = new l2(m2Var6, m2Var6.getContext(), m2Var6.f50420b, m2Var6.f50419a.f50519c, m2Var6.f50421c, 1);
                                        l2Var2.F2(savedStarGift, null);
                                        l2Var2.g2();
                                        return;
                                    default:
                                        m2 m2Var7 = m2Var2;
                                        l2 l2Var3 = new l2(m2Var7, m2Var7.getContext(), m2Var7.f50420b, m2Var7.f50419a.f50519c, m2Var7.f50421c, 2);
                                        l2Var3.F2(savedStarGift, null);
                                        l2Var3.q2();
                                        return;
                                }
                            }
                        }, str2 != null ? true : z10);
                    } else {
                        m2Var2 = m2Var;
                        is0Var2 = is0Var;
                        h1Var2 = h1Var;
                        z10 = z13;
                        if (is0Var2.c() && m2Var2.d) {
                            I.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.Gift2Reorder), new b2(m2Var2, 3), z10);
                        }
                    }
                    if (k7.c2(i10, is0Var2.f50519c)) {
                        boolean z16 = savedStarGift.unsaved;
                        I.c(z16 ? R.drawable.msg_message : R.drawable.menu_hide_gift, LocaleController.getString(z16 ? R.string.Gift2ShowGift : R.string.Gift2HideGift), new t1(m2Var2, savedStarGift, h1Var2, 2), z10);
                    }
                    TL_stars.StarGift starGift2 = savedStarGift.gift;
                    if (starGift2 instanceof TL_stars.TL_starGiftUnique) {
                        I.l(R.drawable.menu_transfer, LocaleController.getString(R.string.Gift2TransferOption), new Runnable() {
                            @Override
                            public final void run() {
                                switch (r3) {
                                    case 0:
                                        m2 m2Var5 = m2Var2;
                                        l2 l2Var = new l2(m2Var5, m2Var5.getContext(), m2Var5.f50420b, m2Var5.f50419a.f50519c, m2Var5.f50421c, 0);
                                        l2Var.F2(savedStarGift, null);
                                        l2Var.P2(false);
                                        return;
                                    case 1:
                                        m2 m2Var6 = m2Var2;
                                        l2 l2Var2 = new l2(m2Var6, m2Var6.getContext(), m2Var6.f50420b, m2Var6.f50419a.f50519c, m2Var6.f50421c, 1);
                                        l2Var2.F2(savedStarGift, null);
                                        l2Var2.g2();
                                        return;
                                    default:
                                        m2 m2Var7 = m2Var2;
                                        l2 l2Var3 = new l2(m2Var7, m2Var7.getContext(), m2Var7.f50420b, m2Var7.f50419a.f50519c, m2Var7.f50421c, 2);
                                        l2Var3.F2(savedStarGift, null);
                                        l2Var3.q2();
                                        return;
                                }
                            }
                        }, DialogObject.getPeerDialogId(((TL_stars.TL_starGiftUnique) starGift2).owner_id) == UserConfig.getInstance(i10).getClientUserId() ? true : z10);
                    }
                    if (v9Var.h() && m2Var2.d) {
                        z11 = true;
                        I.c(R.drawable.msg_removefolder, LocaleController.getString(R.string.Gift2RemoveFromCollection), new t1(m2Var2, savedStarGift, I, 1), true);
                        I.E();
                        I.t();
                    } else {
                        z11 = true;
                    }
                    if (I.x() > 0) {
                        I.V(5);
                        I.f27143u = z11;
                        I.v = z11;
                        I.L = z11;
                        Point point = AndroidUtilities.displaySize;
                        int min = Math.min(point.x, point.y);
                        I.N = min - AndroidUtilities.dp(32.0f);
                        I.O = (int) (min * 0.6f);
                        I.P = z11;
                        I.W = z11;
                        I.Z();
                        h1Var2.f50330y.getImageReceiver().startAnimation(z11);
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
