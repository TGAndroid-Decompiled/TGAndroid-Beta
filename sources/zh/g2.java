package zh;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stars;
public final class g2 implements View.OnClickListener {
    public final int f50570a;
    public final s2 f50571b;

    public g2(s2 s2Var, int i10) {
        this.f50570a = i10;
        this.f50571b = s2Var;
    }

    @Override
    public final void onClick(View view) {
        TL_stars.StarGift starGift;
        TL_stars.StarGift starGift2;
        TL_stars.StarGift starGift3;
        q2 q2Var;
        int i10 = this.f50570a;
        boolean z10 = true;
        s2 s2Var = this.f50571b;
        switch (i10) {
            case 0:
                if (s2Var.P.getAlpha() >= 1.0f) {
                    s2Var.f51144g0.run();
                    return;
                }
                return;
            case 1:
                if (s2Var.P.getAlpha() >= 1.0f) {
                    s2Var.f51144g0.run();
                    return;
                }
                return;
            case 2:
                s2Var.getClass();
                s2Var.b((h2) view);
                return;
            case 3:
                s2Var.getClass();
                s2Var.b((h2) view);
                return;
            case 4:
                s2 s2Var2 = this.f50571b;
                LinearLayout linearLayout = s2Var2.G;
                q2[] q2VarArr = s2Var2.f51150n;
                if (s2Var2.getAlpha() >= 1.0f && !s2Var2.f51145h0) {
                    if (s2Var2.f51147j0) {
                        s2Var2.a(s2Var2.W, s2Var2.f51135a0, s2Var2.f51137b0, s2Var2.f51139c0);
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    for (q2 q2Var2 : q2VarArr) {
                        if (q2Var2 != null) {
                            TL_stars.StarGift starGift4 = q2Var2.h;
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
                    if (!arrayList.isEmpty() && s2Var2.f51141e0 != null) {
                        TextView textView = s2Var2.K;
                        s2Var2.f51145h0 = true;
                        s2Var2.f51147j0 = false;
                        di.d4 d4Var = s2Var2.T;
                        if (d4Var != null) {
                            d4Var.e(true);
                            s2Var2.T = null;
                        }
                        textView.setText("");
                        s2Var2.L.setText(LocaleController.formatString(R.string.GiftCraftProgressSuccessChance, fi.l.H0(s2Var2.getGiftsSuccessChance())));
                        for (int i11 = 0; i11 < q2VarArr.length; i11++) {
                            q2 q2Var3 = q2VarArr[i11];
                            if (q2Var3 != null) {
                                q2Var3.setClickable(false);
                                q2 q2Var4 = q2VarArr[i11];
                                TL_stars.StarGift starGift5 = q2Var4.h;
                                if (starGift5 == null) {
                                    starGift5 = null;
                                }
                                if (starGift5 == null) {
                                    q2Var4.animate().alpha(0.0f).start();
                                }
                            }
                        }
                        int i12 = 0;
                        while (true) {
                            if (i12 < q2VarArr.length) {
                                q2 q2Var5 = q2VarArr[i12];
                                if (q2Var5 != null) {
                                    TL_stars.StarGift starGift6 = q2Var5.h;
                                    if (starGift6 != null) {
                                        starGift2 = starGift6;
                                    } else {
                                        starGift2 = null;
                                    }
                                    if (starGift2 != null) {
                                        if (starGift6 == null) {
                                            starGift6 = null;
                                        }
                                        textView.setText(starGift6.title + " #" + LocaleController.formatNumber(starGift6.num, ','));
                                    }
                                }
                                i12++;
                            }
                        }
                        s2Var2.Q.animate().alpha(0.0f).start();
                        linearLayout.animate().alpha(0.0f).start();
                        s2Var2.R.animate().alpha(1.0f).start();
                        s2Var2.P.animate().alpha(0.25f).start();
                        s2Var2.J.d();
                        ArrayList arrayList2 = new ArrayList();
                        for (q2 q2Var6 : q2VarArr) {
                            TL_stars.StarGift starGift7 = q2Var6.h;
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
                        s2Var2.f51141e0.run(arrayList2, new rh.r(3, s2Var2, arrayList2), new zf.c(s2Var2, 8));
                        return;
                    }
                    AndroidUtilities.shakeViewSpring(linearLayout);
                    return;
                }
                return;
            default:
                q2 q2Var7 = (q2) view;
                TL_stars.StarGift starGift8 = q2Var7.h;
                if (starGift8 == null) {
                    starGift8 = null;
                }
                if (starGift8 != null && !q2Var7.f51011n) {
                    q2Var7.a(null, true);
                    s2Var.d(true);
                    return;
                }
                int i13 = 0;
                while (true) {
                    q2[] q2VarArr2 = s2Var.f51150n;
                    if (i13 < q2VarArr2.length && (q2Var = q2VarArr2[i13]) != view) {
                        if (q2Var != null) {
                            TL_stars.StarGift starGift9 = q2Var.h;
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
                s2Var.f51143f0.run(new org.telegram.ui.Wallet.z6(14, s2Var, q2Var7), Boolean.valueOf(z10));
                return;
        }
    }
}
