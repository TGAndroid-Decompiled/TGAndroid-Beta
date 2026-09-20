package yh;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.pj0;
public final class l2 implements View.OnClickListener {
    public final int f47675a;
    public final y2 f47676b;

    public l2(y2 y2Var, int i10) {
        this.f47675a = i10;
        this.f47676b = y2Var;
    }

    @Override
    public final void onClick(View view) {
        TL_stars.StarGift starGift;
        TL_stars.StarGift starGift2;
        TL_stars.StarGift starGift3;
        w2 w2Var;
        int i10 = this.f47675a;
        boolean z10 = true;
        y2 y2Var = this.f47676b;
        switch (i10) {
            case 0:
                if (y2Var.P.getAlpha() >= 1.0f) {
                    y2Var.f48286g0.run();
                    return;
                }
                return;
            case 1:
                if (y2Var.P.getAlpha() >= 1.0f) {
                    y2Var.f48286g0.run();
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
                y2 y2Var2 = this.f47676b;
                LinearLayout linearLayout = y2Var2.G;
                w2[] w2VarArr = y2Var2.f48292n;
                if (y2Var2.getAlpha() >= 1.0f && !y2Var2.f48287h0) {
                    if (y2Var2.f48289j0) {
                        y2Var2.a(y2Var2.W, y2Var2.f48277a0, y2Var2.f48279b0, y2Var2.f48281c0);
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    for (w2 w2Var2 : w2VarArr) {
                        if (w2Var2 != null) {
                            TL_stars.StarGift starGift4 = w2Var2.h;
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
                    if (!arrayList.isEmpty() && y2Var2.f48283e0 != null) {
                        TextView textView = y2Var2.K;
                        y2Var2.f48287h0 = true;
                        y2Var2.f48289j0 = false;
                        ci.f4 f4Var = y2Var2.T;
                        if (f4Var != null) {
                            f4Var.e(true);
                            y2Var2.T = null;
                        }
                        textView.setText("");
                        y2Var2.L.setText(LocaleController.formatString(R.string.GiftCraftProgressSuccessChance, ei.l.G0(y2Var2.getGiftsSuccessChance())));
                        for (int i11 = 0; i11 < w2VarArr.length; i11++) {
                            w2 w2Var3 = w2VarArr[i11];
                            if (w2Var3 != null) {
                                w2Var3.setClickable(false);
                                w2 w2Var4 = w2VarArr[i11];
                                TL_stars.StarGift starGift5 = w2Var4.h;
                                if (starGift5 == null) {
                                    starGift5 = null;
                                }
                                if (starGift5 == null) {
                                    w2Var4.animate().alpha(0.0f).start();
                                }
                            }
                        }
                        int i12 = 0;
                        while (true) {
                            if (i12 < w2VarArr.length) {
                                w2 w2Var5 = w2VarArr[i12];
                                if (w2Var5 != null) {
                                    TL_stars.StarGift starGift6 = w2Var5.h;
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
                        for (w2 w2Var6 : w2VarArr) {
                            TL_stars.StarGift starGift7 = w2Var6.h;
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
                        y2Var2.f48283e0.run(arrayList2, new ai.m0(23, y2Var2, arrayList2), new rg.q1(y2Var2, 27));
                        return;
                    }
                    AndroidUtilities.shakeViewSpring(linearLayout);
                    return;
                }
                return;
            default:
                w2 w2Var7 = (w2) view;
                TL_stars.StarGift starGift8 = w2Var7.h;
                if (starGift8 == null) {
                    starGift8 = null;
                }
                if (starGift8 != null && !w2Var7.f48213n) {
                    w2Var7.a(null, true);
                    y2Var.d(true);
                    return;
                }
                int i13 = 0;
                while (true) {
                    w2[] w2VarArr2 = y2Var.f48292n;
                    if (i13 < w2VarArr2.length && (w2Var = w2VarArr2[i13]) != view) {
                        if (w2Var != null) {
                            TL_stars.StarGift starGift9 = w2Var.h;
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
                y2Var.f48285f0.run(new pj0(19, y2Var, w2Var7), Boolean.valueOf(z10));
                return;
        }
    }
}
