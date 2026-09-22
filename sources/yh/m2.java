package yh;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.mj0;
public final class m2 implements View.OnClickListener {
    public final int f47391a;
    public final z2 f47392b;

    public m2(z2 z2Var, int i10) {
        this.f47391a = i10;
        this.f47392b = z2Var;
    }

    @Override
    public final void onClick(View view) {
        TL_stars.StarGift starGift;
        TL_stars.StarGift starGift2;
        TL_stars.StarGift starGift3;
        w2 w2Var;
        int i10 = this.f47391a;
        boolean z10 = true;
        z2 z2Var = this.f47392b;
        switch (i10) {
            case 0:
                if (z2Var.P.getAlpha() >= 1.0f) {
                    z2Var.f47998g0.run();
                    return;
                }
                return;
            case 1:
                if (z2Var.P.getAlpha() >= 1.0f) {
                    z2Var.f47998g0.run();
                    return;
                }
                return;
            case 2:
                z2Var.getClass();
                z2Var.b((n2) view);
                return;
            case 3:
                z2Var.getClass();
                z2Var.b((n2) view);
                return;
            case 4:
                z2 z2Var2 = this.f47392b;
                LinearLayout linearLayout = z2Var2.G;
                w2[] w2VarArr = z2Var2.f48004n;
                if (z2Var2.getAlpha() >= 1.0f && !z2Var2.f47999h0) {
                    if (z2Var2.f48001j0) {
                        z2Var2.a(z2Var2.W, z2Var2.f47989a0, z2Var2.f47991b0, z2Var2.f47993c0);
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
                    if (!arrayList.isEmpty() && z2Var2.f47995e0 != null) {
                        TextView textView = z2Var2.K;
                        z2Var2.f47999h0 = true;
                        z2Var2.f48001j0 = false;
                        ci.f4 f4Var = z2Var2.T;
                        if (f4Var != null) {
                            f4Var.e(true);
                            z2Var2.T = null;
                        }
                        textView.setText("");
                        z2Var2.L.setText(LocaleController.formatString(R.string.GiftCraftProgressSuccessChance, ei.l.G0(z2Var2.getGiftsSuccessChance())));
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
                        z2Var2.Q.animate().alpha(0.0f).start();
                        linearLayout.animate().alpha(0.0f).start();
                        z2Var2.R.animate().alpha(1.0f).start();
                        z2Var2.P.animate().alpha(0.25f).start();
                        z2Var2.J.d();
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
                        z2Var2.f47995e0.run(arrayList2, new ai.m0(23, z2Var2, arrayList2), new rg.w1(z2Var2, 26));
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
                if (starGift8 != null && !w2Var7.f47869n) {
                    w2Var7.a(null, true);
                    z2Var.d(true);
                    return;
                }
                int i13 = 0;
                while (true) {
                    w2[] w2VarArr2 = z2Var.f48004n;
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
                z2Var.f47997f0.run(new mj0(19, z2Var, w2Var7), Boolean.valueOf(z10));
                return;
        }
    }
}
