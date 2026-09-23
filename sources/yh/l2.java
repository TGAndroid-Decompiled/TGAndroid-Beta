package yh;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.dt;
public final class l2 implements View.OnClickListener {
    public final int f47322a;
    public final y2 f47323b;

    public l2(y2 y2Var, int i10) {
        this.f47322a = i10;
        this.f47323b = y2Var;
    }

    @Override
    public final void onClick(View view) {
        TL_stars.StarGift starGift;
        TL_stars.StarGift starGift2;
        TL_stars.StarGift starGift3;
        v2 v2Var;
        int i10 = this.f47322a;
        boolean z10 = true;
        y2 y2Var = this.f47323b;
        switch (i10) {
            case 0:
                if (y2Var.P.getAlpha() >= 1.0f) {
                    y2Var.f47933g0.run();
                    return;
                }
                return;
            case 1:
                if (y2Var.P.getAlpha() >= 1.0f) {
                    y2Var.f47933g0.run();
                    return;
                }
                return;
            case 2:
                y2Var.getClass();
                y2Var.b((m2) view);
                return;
            case 3:
                y2Var.getClass();
                y2Var.b((m2) view);
                return;
            case 4:
                y2 y2Var2 = this.f47323b;
                LinearLayout linearLayout = y2Var2.G;
                v2[] v2VarArr = y2Var2.f47939n;
                if (y2Var2.getAlpha() >= 1.0f && !y2Var2.f47934h0) {
                    if (y2Var2.f47936j0) {
                        y2Var2.a(y2Var2.W, y2Var2.f47924a0, y2Var2.f47926b0, y2Var2.f47928c0);
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
                    if (!arrayList.isEmpty() && y2Var2.f47930e0 != null) {
                        TextView textView = y2Var2.K;
                        y2Var2.f47934h0 = true;
                        y2Var2.f47936j0 = false;
                        ci.e4 e4Var = y2Var2.T;
                        if (e4Var != null) {
                            e4Var.e(true);
                            y2Var2.T = null;
                        }
                        textView.setText("");
                        y2Var2.L.setText(LocaleController.formatString(R.string.GiftCraftProgressSuccessChance, ei.l.G0(y2Var2.getGiftsSuccessChance())));
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
                        y2Var2.Q.animate().alpha(0.0f).start();
                        linearLayout.animate().alpha(0.0f).start();
                        y2Var2.R.animate().alpha(1.0f).start();
                        y2Var2.P.animate().alpha(0.25f).start();
                        y2Var2.J.d();
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
                        y2Var2.f47930e0.run(arrayList2, new ai.m0(23, y2Var2, arrayList2), new rg.w1(y2Var2, 26));
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
                if (starGift8 != null && !v2Var7.f47801n) {
                    v2Var7.a(null, true);
                    y2Var.d(true);
                    return;
                }
                int i13 = 0;
                while (true) {
                    v2[] v2VarArr2 = y2Var.f47939n;
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
                y2Var.f47932f0.run(new dt(28, y2Var, v2Var7), Boolean.valueOf(z10));
                return;
        }
    }
}
