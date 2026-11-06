package zh;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import bi.ea;
import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.messenger.a20;
import org.telegram.messenger.hd;
import org.telegram.messenger.p10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.cj0;
import org.telegram.ui.Components.x31;
import org.telegram.ui.jl0;
import org.telegram.ui.ql0;
public final class c2 implements a20, cj0 {
    public final org.telegram.ui.ActionBar.v2 f60152a;
    public final Object f60153b;

    public c2(org.telegram.ui.ActionBar.v2 v2Var, Object obj) {
        this.f60152a = v2Var;
        this.f60153b = obj;
    }

    @Override
    public void f(float f10, float f11, int i7, View view) {
        TL_stars.SavedStarGift savedStarGift;
        cg.b bVar;
        l3 l3Var = (l3) this.f60152a;
        k3 k3Var = (k3) this.f60153b;
        x31 G = l3Var.f60339a2.G(i7 - 1);
        if (G != null) {
            Object obj = G.G;
            if (obj instanceof TL_stars.StarGift) {
                TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
                boolean z9 = G.f40165r;
                if (!TextUtils.isEmpty(starGift.gift_address) && l3Var.Z1) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, l3Var.getContext(), l3Var.I0);
                    String M0 = hd.M0(2131749791, null);
                    org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27293a;
                    u1Var.R = M0;
                    u1Var.T = hd.M0(2131749792, null);
                    jg.g.C(null, 2131747830, alertDialog$Builder, null);
                } else if (z9 && (starGift instanceof TL_stars.TL_starGiftUnique)) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) G.G;
                    org.telegram.ui.ActionBar.u1 u1Var2 = new org.telegram.ui.ActionBar.u1(3, l3Var.getContext(), null);
                    u1Var2.r(400L);
                    long e10 = p10.i(l3Var.f28613a).e();
                    if (tL_starGiftUnique.resale_ton_only) {
                        bVar = cg.b.f6163b;
                    } else {
                        bVar = cg.b.f6162a;
                    }
                    cg.b bVar2 = bVar;
                    ea.x(l3Var.f28613a, bVar2).H(tL_starGiftUnique, e10, null, true, new jl0(l3Var, u1Var2, bVar2, tL_starGiftUnique, e10));
                } else {
                    if (!z9) {
                        ArrayList arrayList = k3Var.f60323b.f4915l;
                        int size = arrayList.size();
                        int i10 = 0;
                        while (true) {
                            if (i10 < size) {
                                Object obj2 = arrayList.get(i10);
                                i10++;
                                savedStarGift = (TL_stars.SavedStarGift) obj2;
                                if (savedStarGift.gift == starGift) {
                                    break;
                                }
                            } else {
                                savedStarGift = null;
                                break;
                            }
                        }
                        if (savedStarGift != null && savedStarGift.can_craft_at > 0 && savedStarGift.can_craft_at > ConnectionsManager.getInstance(l3Var.f28613a).getCurrentTime()) {
                            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(l3Var.getContext());
                            String M02 = hd.M0(2131749754, null);
                            org.telegram.ui.ActionBar.u1 u1Var3 = alertDialog$Builder2.f27293a;
                            u1Var3.R = M02;
                            u1Var3.T = org.telegram.messenger.g0.X2(hd.a0(null, null, 2131749755, hd.x(savedStarGift.can_craft_at, true)));
                            jg.g.C(null, 2131747830, alertDialog$Builder2, null);
                            return;
                        }
                    }
                    l3Var.X1.a(starGift);
                    l3Var.dismiss();
                }
            }
        }
    }

    @Override
    public boolean f1(View view) {
        return false;
    }

    @Override
    public void i(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        boolean z9;
        boolean z10;
        e2 e2Var = (e2) this.f60152a;
        fi.d dVar = (fi.d) this.f60153b;
        View view = (View) obj2;
        Integer num = (Integer) number;
        Float f10 = (Float) serializable;
        Float f11 = (Float) serializable2;
        long j3 = ((TL_stars.SavedStarGift) ((x31) obj).G).gift.f27182id;
        if (e2Var.f60205i1 == j3) {
            e2Var.f60205i1 = 0L;
        } else {
            e2Var.f60205i1 = j3;
        }
        if (e2Var.f60205i1 != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        dVar.setEnabled(z9);
        if (view.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            for (int i7 = 0; i7 < viewGroup.getChildCount(); i7++) {
                View childAt = viewGroup.getChildAt(i7);
                if (childAt instanceof ql0) {
                    ql0 ql0Var = (ql0) childAt;
                    if (e2Var.f60205i1 == ql0Var.getGiftId()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    ql0Var.b(z10, true);
                }
            }
        }
    }

    @Override
    public void r0(View view, float f10, float f11) {
    }
}
