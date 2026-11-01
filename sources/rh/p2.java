package rh;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.dd;
import org.telegram.tgnet.tl.TL_stars;
public final class p2 implements View.OnClickListener {
    public final int f47319a;
    public final b3 f47320b;

    public p2(b3 b3Var, int i10) {
        this.f47319a = i10;
        this.f47320b = b3Var;
    }

    @Override
    public final void onClick(View view) {
        TL_stars.StarGift starGift;
        TL_stars.StarGift starGift2;
        TL_stars.StarGift starGift3;
        z2 z2Var;
        int i10 = this.f47319a;
        boolean z10 = true;
        b3 b3Var = this.f47320b;
        switch (i10) {
            case 0:
                if (b3Var.P.getAlpha() >= 1.0f) {
                    b3Var.f46681g0.run();
                    return;
                }
                return;
            case 1:
                if (b3Var.P.getAlpha() >= 1.0f) {
                    b3Var.f46681g0.run();
                    return;
                }
                return;
            case 2:
                b3Var.getClass();
                b3Var.b((r2) view);
                return;
            case 3:
                b3Var.getClass();
                b3Var.b((r2) view);
                return;
            case 4:
                b3 b3Var2 = this.f47320b;
                LinearLayout linearLayout = b3Var2.G;
                z2[] z2VarArr = b3Var2.f46687n;
                if (b3Var2.getAlpha() >= 1.0f && !b3Var2.f46682h0) {
                    if (b3Var2.f46684j0) {
                        b3Var2.a(b3Var2.W, b3Var2.f46672a0, b3Var2.f46674b0, b3Var2.f46676c0);
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    for (z2 z2Var2 : z2VarArr) {
                        if (z2Var2 != null) {
                            TL_stars.StarGift starGift4 = z2Var2.h;
                            if (starGift4 != null) {
                                starGift3 = starGift4;
                            } else {
                                starGift3 = null;
                            }
                            if (starGift3 != null) {
                                if (starGift4 == null) {
                                    starGift4 = null;
                                }
                                arrayList.add(starGift4);
                            }
                        }
                    }
                    if (!arrayList.isEmpty() && b3Var2.f46678e0 != null) {
                        TextView textView = b3Var2.K;
                        b3Var2.f46682h0 = true;
                        b3Var2.f46684j0 = false;
                        vh.p2 p2Var = b3Var2.T;
                        if (p2Var != null) {
                            p2Var.e(true);
                            b3Var2.T = null;
                        }
                        textView.setText("");
                        b3Var2.L.setText(dd.a0(null, null, 2131749785, xh.i.J0(b3Var2.getGiftsSuccessChance())));
                        for (int i11 = 0; i11 < z2VarArr.length; i11++) {
                            z2 z2Var3 = z2VarArr[i11];
                            if (z2Var3 != null) {
                                z2Var3.setClickable(false);
                                z2 z2Var4 = z2VarArr[i11];
                                TL_stars.StarGift starGift5 = z2Var4.h;
                                if (starGift5 == null) {
                                    starGift5 = null;
                                }
                                if (starGift5 == null) {
                                    z2Var4.animate().alpha(0.0f).start();
                                }
                            }
                        }
                        int i12 = 0;
                        while (true) {
                            if (i12 < z2VarArr.length) {
                                z2 z2Var5 = z2VarArr[i12];
                                if (z2Var5 != null) {
                                    TL_stars.StarGift starGift6 = z2Var5.h;
                                    if (starGift6 != null) {
                                        starGift2 = starGift6;
                                    } else {
                                        starGift2 = null;
                                    }
                                    if (starGift2 != null) {
                                        if (starGift6 == null) {
                                            starGift6 = null;
                                        }
                                        textView.setText(starGift6.title + " #" + dd.E(starGift6.num, ','));
                                    }
                                }
                                i12++;
                            }
                        }
                        b3Var2.Q.animate().alpha(0.0f).start();
                        linearLayout.animate().alpha(0.0f).start();
                        b3Var2.R.animate().alpha(1.0f).start();
                        b3Var2.P.animate().alpha(0.25f).start();
                        b3Var2.J.d();
                        ArrayList arrayList2 = new ArrayList();
                        for (z2 z2Var6 : z2VarArr) {
                            TL_stars.StarGift starGift7 = z2Var6.h;
                            if (starGift7 != null) {
                                starGift = starGift7;
                            } else {
                                starGift = null;
                            }
                            if (starGift != null) {
                                if (starGift7 == null) {
                                    starGift7 = null;
                                }
                                arrayList2.add(starGift7);
                            }
                        }
                        b3Var2.f46678e0.a(arrayList2, new ih.s(29, b3Var2, arrayList2), new ph.x1(b3Var2, 16));
                        return;
                    }
                    org.telegram.messenger.i0.G3(linearLayout);
                    return;
                }
                return;
            default:
                z2 z2Var7 = (z2) view;
                TL_stars.StarGift starGift8 = z2Var7.h;
                if (starGift8 == null) {
                    starGift8 = null;
                }
                if (starGift8 != null && !z2Var7.f47807n) {
                    z2Var7.a(null, true);
                    b3Var.d(true);
                    return;
                }
                int i13 = 0;
                while (true) {
                    z2[] z2VarArr2 = b3Var.f46687n;
                    if (i13 < z2VarArr2.length && (z2Var = z2VarArr2[i13]) != view) {
                        if (z2Var != null) {
                            TL_stars.StarGift starGift9 = z2Var.h;
                            if (starGift9 == null) {
                                starGift9 = null;
                            }
                            if (starGift9 != null) {
                                z10 = false;
                            }
                        }
                        i13++;
                    }
                }
                b3Var.f46680f0.a(new q2(0, b3Var, z2Var7), Boolean.valueOf(z10));
                return;
        }
    }
}
