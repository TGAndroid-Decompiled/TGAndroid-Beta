package zh;

import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import bi.ea;
import java.util.ArrayList;
import org.telegram.messenger.id;
import org.telegram.messenger.p10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.cj0;
import org.telegram.ui.Components.x31;
import org.telegram.ui.jl0;
public final class i3 implements cj0, ni.p {
    public final Object f60392a;
    public final Object f60393b;

    public i3(Object obj, Object obj2) {
        this.f60392a = obj;
        this.f60393b = obj2;
    }

    @Override
    public void b(j2.n nVar) {
        org.telegram.messenger.g0.h3(new l2.z0((SpannableString) this.f60392a, nVar, (org.telegram.ui.ActionBar.p) this.f60393b, 11));
    }

    @Override
    public void f(float f10, float f11, int i7, View view) {
        TL_stars.SavedStarGift savedStarGift;
        cg.b bVar;
        k3 k3Var = (k3) this.f60392a;
        j3 j3Var = (j3) this.f60393b;
        x31 G = k3Var.f60417a2.G(i7 - 1);
        if (G != null) {
            Object obj = G.G;
            if (obj instanceof TL_stars.StarGift) {
                TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
                boolean z9 = G.f40186r;
                if (!TextUtils.isEmpty(starGift.gift_address) && k3Var.Z1) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, k3Var.getContext(), k3Var.I0);
                    String M0 = id.M0(2131749793, null);
                    org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27296a;
                    u1Var.R = M0;
                    u1Var.T = id.M0(2131749794, null);
                    jg.g.C(null, 2131747832, alertDialog$Builder, null);
                } else if (z9 && (starGift instanceof TL_stars.TL_starGiftUnique)) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) G.G;
                    org.telegram.ui.ActionBar.u1 u1Var2 = new org.telegram.ui.ActionBar.u1(3, k3Var.getContext(), null);
                    u1Var2.r(400L);
                    long e10 = p10.i(k3Var.f28616a).e();
                    if (tL_starGiftUnique.resale_ton_only) {
                        bVar = cg.b.f6163b;
                    } else {
                        bVar = cg.b.f6162a;
                    }
                    cg.b bVar2 = bVar;
                    ea.x(k3Var.f28616a, bVar2).H(tL_starGiftUnique, e10, null, true, new jl0(k3Var, u1Var2, bVar2, tL_starGiftUnique, e10));
                } else {
                    if (!z9) {
                        ArrayList arrayList = j3Var.f60406b.f4915l;
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
                        if (savedStarGift != null && savedStarGift.can_craft_at > 0 && savedStarGift.can_craft_at > ConnectionsManager.getInstance(k3Var.f28616a).getCurrentTime()) {
                            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(k3Var.getContext());
                            String M02 = id.M0(2131749756, null);
                            org.telegram.ui.ActionBar.u1 u1Var3 = alertDialog$Builder2.f27296a;
                            u1Var3.R = M02;
                            u1Var3.T = org.telegram.messenger.g0.X2(id.a0(null, null, 2131749757, id.x(savedStarGift.can_craft_at, true)));
                            jg.g.C(null, 2131747832, alertDialog$Builder2, null);
                            return;
                        }
                    }
                    k3Var.X1.a(starGift);
                    k3Var.dismiss();
                }
            }
        }
    }

    @Override
    public boolean f1(View view) {
        return false;
    }

    @Override
    public void r0(View view, float f10, float f11) {
    }
}
