package zh;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.oj0;
public final class k2 implements View.OnClickListener {
    public final int f52130a;
    public final x2 f52131b;

    public k2(x2 x2Var, int i10) {
        this.f52130a = i10;
        this.f52131b = x2Var;
    }

    @Override
    public final void onClick(View view) {
        TL_stars.StarGift starGift;
        TL_stars.StarGift starGift2;
        TL_stars.StarGift starGift3;
        v2 v2Var;
        int i10 = this.f52130a;
        boolean z10 = true;
        x2 x2Var = this.f52131b;
        switch (i10) {
            case 0:
                if (x2Var.P.getAlpha() >= 1.0f) {
                    x2Var.f52830g0.run();
                    return;
                }
                return;
            case 1:
                if (x2Var.P.getAlpha() >= 1.0f) {
                    x2Var.f52830g0.run();
                    return;
                }
                return;
            case 2:
                x2Var.getClass();
                x2Var.b((l2) view);
                return;
            case 3:
                x2Var.getClass();
                x2Var.b((l2) view);
                return;
            case 4:
                x2 x2Var2 = this.f52131b;
                LinearLayout linearLayout = x2Var2.G;
                v2[] v2VarArr = x2Var2.f52836n;
                if (x2Var2.getAlpha() >= 1.0f && !x2Var2.f52831h0) {
                    if (x2Var2.f52833j0) {
                        x2Var2.a(x2Var2.W, x2Var2.f52820a0, x2Var2.f52822b0, x2Var2.f52824c0);
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    for (v2 v2Var2 : v2VarArr) {
                        if (v2Var2 != null) {
                            TL_stars.StarGift starGift4 = v2Var2.h;
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
                    if (!arrayList.isEmpty() && x2Var2.f52827e0 != null) {
                        TextView textView = x2Var2.K;
                        x2Var2.f52831h0 = true;
                        x2Var2.f52833j0 = false;
                        di.f4 f4Var = x2Var2.T;
                        if (f4Var != null) {
                            f4Var.e(true);
                            x2Var2.T = null;
                        }
                        textView.setText("");
                        x2Var2.L.setText(LocaleController.formatString(R.string.GiftCraftProgressSuccessChance, fi.m.G0(x2Var2.getGiftsSuccessChance())));
                        for (int i11 = 0; i11 < v2VarArr.length; i11++) {
                            v2 v2Var3 = v2VarArr[i11];
                            if (v2Var3 != null) {
                                v2Var3.setClickable(false);
                                v2 v2Var4 = v2VarArr[i11];
                                TL_stars.StarGift starGift5 = v2Var4.h;
                                if (starGift5 == null) {
                                    starGift5 = null;
                                }
                                if (starGift5 == null) {
                                    v2Var4.animate().alpha(0.0f).start();
                                }
                            }
                        }
                        int i12 = 0;
                        while (true) {
                            if (i12 < v2VarArr.length) {
                                v2 v2Var5 = v2VarArr[i12];
                                if (v2Var5 != null) {
                                    TL_stars.StarGift starGift6 = v2Var5.h;
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
                        x2Var2.Q.animate().alpha(0.0f).start();
                        linearLayout.animate().alpha(0.0f).start();
                        x2Var2.R.animate().alpha(1.0f).start();
                        x2Var2.P.animate().alpha(0.25f).start();
                        x2Var2.J.d();
                        ArrayList arrayList2 = new ArrayList();
                        for (v2 v2Var6 : v2VarArr) {
                            TL_stars.StarGift starGift7 = v2Var6.h;
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
                        x2Var2.f52827e0.run(arrayList2, new bi.f0(23, x2Var2, arrayList2), new sg.p0(x2Var2, 29));
                        return;
                    }
                    AndroidUtilities.shakeViewSpring(linearLayout);
                    return;
                }
                return;
            default:
                v2 v2Var7 = (v2) view;
                TL_stars.StarGift starGift8 = v2Var7.h;
                if (starGift8 == null) {
                    starGift8 = null;
                }
                if (starGift8 != null && !v2Var7.f52711n) {
                    v2Var7.a(null, true);
                    x2Var.d(true);
                    return;
                }
                int i13 = 0;
                while (true) {
                    v2[] v2VarArr2 = x2Var.f52836n;
                    if (i13 < v2VarArr2.length && (v2Var = v2VarArr2[i13]) != view) {
                        if (v2Var != null) {
                            TL_stars.StarGift starGift9 = v2Var.h;
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
                x2Var.f52829f0.run(new oj0(19, x2Var, v2Var7), Boolean.valueOf(z10));
                return;
        }
    }
}
