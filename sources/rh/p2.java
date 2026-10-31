package rh;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.cd;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.f11;
public final class p2 implements View.OnClickListener {
    public final int f47305a;
    public final a3 f47306b;

    public p2(a3 a3Var, int i10) {
        this.f47305a = i10;
        this.f47306b = a3Var;
    }

    @Override
    public final void onClick(View view) {
        TL_stars.StarGift starGift;
        TL_stars.StarGift starGift2;
        TL_stars.StarGift starGift3;
        y2 y2Var;
        int i10 = this.f47305a;
        boolean z10 = true;
        a3 a3Var = this.f47306b;
        switch (i10) {
            case 0:
                if (a3Var.P.getAlpha() >= 1.0f) {
                    a3Var.f46617g0.run();
                    return;
                }
                return;
            case 1:
                if (a3Var.P.getAlpha() >= 1.0f) {
                    a3Var.f46617g0.run();
                    return;
                }
                return;
            case 2:
                a3Var.getClass();
                a3Var.b((q2) view);
                return;
            case 3:
                a3Var.getClass();
                a3Var.b((q2) view);
                return;
            case 4:
                a3 a3Var2 = this.f47306b;
                LinearLayout linearLayout = a3Var2.G;
                y2[] y2VarArr = a3Var2.f46623n;
                if (a3Var2.getAlpha() >= 1.0f && !a3Var2.f46618h0) {
                    if (a3Var2.f46620j0) {
                        a3Var2.a(a3Var2.W, a3Var2.f46608a0, a3Var2.f46610b0, a3Var2.f46612c0);
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    for (y2 y2Var2 : y2VarArr) {
                        if (y2Var2 != null) {
                            TL_stars.StarGift starGift4 = y2Var2.h;
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
                    if (!arrayList.isEmpty() && a3Var2.f46614e0 != null) {
                        TextView textView = a3Var2.K;
                        a3Var2.f46618h0 = true;
                        a3Var2.f46620j0 = false;
                        vh.p2 p2Var = a3Var2.T;
                        if (p2Var != null) {
                            p2Var.e(true);
                            a3Var2.T = null;
                        }
                        textView.setText("");
                        a3Var2.L.setText(cd.a0(null, null, 2131749785, xh.i.I0(a3Var2.getGiftsSuccessChance())));
                        for (int i11 = 0; i11 < y2VarArr.length; i11++) {
                            y2 y2Var3 = y2VarArr[i11];
                            if (y2Var3 != null) {
                                y2Var3.setClickable(false);
                                y2 y2Var4 = y2VarArr[i11];
                                TL_stars.StarGift starGift5 = y2Var4.h;
                                if (starGift5 == null) {
                                    starGift5 = null;
                                }
                                if (starGift5 == null) {
                                    y2Var4.animate().alpha(0.0f).start();
                                }
                            }
                        }
                        int i12 = 0;
                        while (true) {
                            if (i12 < y2VarArr.length) {
                                y2 y2Var5 = y2VarArr[i12];
                                if (y2Var5 != null) {
                                    TL_stars.StarGift starGift6 = y2Var5.h;
                                    if (starGift6 != null) {
                                        starGift2 = starGift6;
                                    } else {
                                        starGift2 = null;
                                    }
                                    if (starGift2 != null) {
                                        if (starGift6 == null) {
                                            starGift6 = null;
                                        }
                                        textView.setText(starGift6.title + " #" + cd.E(starGift6.num, ','));
                                    }
                                }
                                i12++;
                            }
                        }
                        a3Var2.Q.animate().alpha(0.0f).start();
                        linearLayout.animate().alpha(0.0f).start();
                        a3Var2.R.animate().alpha(1.0f).start();
                        a3Var2.P.animate().alpha(0.25f).start();
                        a3Var2.J.d();
                        ArrayList arrayList2 = new ArrayList();
                        for (y2 y2Var6 : y2VarArr) {
                            TL_stars.StarGift starGift7 = y2Var6.h;
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
                        a3Var2.f46614e0.a(arrayList2, new ih.s(29, a3Var2, arrayList2), new ph.x1(a3Var2, 16));
                        return;
                    }
                    org.telegram.messenger.i0.G3(linearLayout);
                    return;
                }
                return;
            default:
                y2 y2Var7 = (y2) view;
                TL_stars.StarGift starGift8 = y2Var7.h;
                if (starGift8 == null) {
                    starGift8 = null;
                }
                if (starGift8 != null && !y2Var7.f47715n) {
                    y2Var7.a(null, true);
                    a3Var.d(true);
                    return;
                }
                int i13 = 0;
                while (true) {
                    y2[] y2VarArr2 = a3Var.f46623n;
                    if (i13 < y2VarArr2.length && (y2Var = y2VarArr2[i13]) != view) {
                        if (y2Var != null) {
                            TL_stars.StarGift starGift9 = y2Var.h;
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
                a3Var.f46616f0.a(new f11(29, a3Var, y2Var7), Boolean.valueOf(z10));
                return;
        }
    }
}
