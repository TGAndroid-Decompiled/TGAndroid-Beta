package yh;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stars;
public final class h2 implements View.OnClickListener {
    public final int f52617a;
    public final t2 f52618b;

    public h2(t2 t2Var, int i10) {
        this.f52617a = i10;
        this.f52618b = t2Var;
    }

    @Override
    public final void onClick(View view) {
        TL_stars.StarGift starGift;
        TL_stars.StarGift starGift2;
        TL_stars.StarGift starGift3;
        r2 r2Var;
        int i10 = this.f52617a;
        boolean z10 = false;
        t2 t2Var = this.f52618b;
        switch (i10) {
            case 0:
                if (t2Var.P.getAlpha() >= 1.0f) {
                    t2Var.f53229g0.run();
                    return;
                }
                return;
            case 1:
                if (t2Var.P.getAlpha() >= 1.0f) {
                    t2Var.f53229g0.run();
                    return;
                }
                return;
            case 2:
                t2Var.getClass();
                t2Var.b((i2) view);
                return;
            case 3:
                t2Var.getClass();
                t2Var.b((i2) view);
                return;
            case 4:
                t2 t2Var2 = this.f52618b;
                LinearLayout linearLayout = t2Var2.G;
                r2[] r2VarArr = t2Var2.f53235n;
                if (t2Var2.getAlpha() >= 1.0f && !t2Var2.f53230h0) {
                    if (t2Var2.f53232j0) {
                        t2Var2.a(t2Var2.W, t2Var2.f53219a0, t2Var2.f53221b0, t2Var2.f53223c0);
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    for (r2 r2Var2 : r2VarArr) {
                        if (r2Var2 != null) {
                            TL_stars.StarGift starGift4 = r2Var2.h;
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
                    if (!arrayList.isEmpty() && t2Var2.f53226e0 != null) {
                        TextView textView = t2Var2.K;
                        t2Var2.f53230h0 = true;
                        t2Var2.f53232j0 = false;
                        ci.d4 d4Var = t2Var2.T;
                        if (d4Var != null) {
                            d4Var.e(true);
                            t2Var2.T = null;
                        }
                        textView.setText("");
                        t2Var2.L.setText(LocaleController.formatString(R.string.GiftCraftProgressSuccessChance, ei.l.H0(t2Var2.getGiftsSuccessChance())));
                        for (int i11 = 0; i11 < r2VarArr.length; i11++) {
                            r2 r2Var3 = r2VarArr[i11];
                            if (r2Var3 != null) {
                                r2Var3.setClickable(false);
                                r2 r2Var4 = r2VarArr[i11];
                                TL_stars.StarGift starGift5 = r2Var4.h;
                                if (starGift5 == null) {
                                    starGift5 = null;
                                }
                                if (starGift5 == null) {
                                    r2Var4.animate().alpha(0.0f).start();
                                }
                            }
                        }
                        int i12 = 0;
                        while (true) {
                            if (i12 < r2VarArr.length) {
                                r2 r2Var5 = r2VarArr[i12];
                                if (r2Var5 != null) {
                                    TL_stars.StarGift starGift6 = r2Var5.h;
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
                        t2Var2.Q.animate().alpha(0.0f).start();
                        linearLayout.animate().alpha(0.0f).start();
                        t2Var2.R.animate().alpha(1.0f).start();
                        t2Var2.P.animate().alpha(0.25f).start();
                        t2Var2.J.d();
                        ArrayList arrayList2 = new ArrayList();
                        for (r2 r2Var6 : r2VarArr) {
                            TL_stars.StarGift starGift7 = r2Var6.h;
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
                        t2Var2.f53226e0.run(arrayList2, new qh.r(3, t2Var2, arrayList2), new f0(t2Var2, 1));
                        return;
                    }
                    AndroidUtilities.shakeViewSpring(linearLayout);
                    return;
                }
                return;
            default:
                r2 r2Var7 = (r2) view;
                TL_stars.StarGift starGift8 = r2Var7.h;
                if (starGift8 == null) {
                    starGift8 = null;
                }
                if (starGift8 != null && !r2Var7.f53124n) {
                    r2Var7.a(null, true);
                    t2Var.d(true);
                    return;
                }
                int i13 = 0;
                while (true) {
                    r2[] r2VarArr2 = t2Var.f53235n;
                    if (i13 < r2VarArr2.length && (r2Var = r2VarArr2[i13]) != view) {
                        if (r2Var != null) {
                            TL_stars.StarGift starGift9 = r2Var.h;
                            if (starGift9 == null) {
                                starGift9 = null;
                            }
                            if (starGift9 != null) {
                            }
                        }
                        i13++;
                    }
                }
                z10 = true;
                t2Var.f53228f0.run(new org.telegram.ui.Wallet.z6(14, t2Var, r2Var7), Boolean.valueOf(z10));
                return;
        }
    }
}
