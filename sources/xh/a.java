package xh;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.fk;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.g5;
import org.telegram.ui.Components.yd0;
import org.telegram.ui.Wallet.b7;
import w7.w5;
import yh.d7;
import yh.f5;
import yh.p7;
public final class a implements View.OnClickListener {
    public final int f51389a;
    public final Object f51390b;
    public final Object f51391c;

    public a(int i10, Object obj, Object obj2) {
        this.f51389a = i10;
        this.f51390b = obj;
        this.f51391c = obj2;
    }

    @Override
    public final void onClick(View view) {
        TL_stars.SavedStarGift savedStarGift;
        int i10 = this.f51389a;
        yh.n0 n0Var = null;
        Object obj = this.f51391c;
        Object obj2 = this.f51390b;
        switch (i10) {
            case 0:
                d.Q((d) obj2, (TL_stars.TL_StarGiftAuctionAcquiredGift) obj);
                return;
            case 1:
                h4 h4Var = (h4) obj2;
                h4Var.getClass();
                if (((d7) obj).f52627f > 0) {
                    h4Var.presentFragment(new p7());
                    return;
                }
                return;
            case 2:
                g4.Q((g4) obj2, (f4) obj);
                return;
            case 3:
                l4 l4Var = (l4) obj2;
                ei.q4 q4Var = (ei.q4) obj;
                HashSet hashSet = l4Var.Z;
                if (!hashSet.isEmpty()) {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        long longValue = ((Long) it.next()).longValue();
                        ArrayList arrayList2 = l4Var.Y.f52743l;
                        int size = arrayList2.size();
                        int i11 = 0;
                        while (true) {
                            if (i11 < size) {
                                Object obj3 = arrayList2.get(i11);
                                i11++;
                                savedStarGift = (TL_stars.SavedStarGift) obj3;
                                int i12 = savedStarGift.msg_id;
                                if (i12 != 0) {
                                    if (i12 == longValue) {
                                    }
                                }
                                if (savedStarGift.saved_id == longValue) {
                                }
                            } else {
                                savedStarGift = null;
                            }
                        }
                        if (savedStarGift != null) {
                            arrayList.add(savedStarGift);
                        }
                    }
                    q4Var.run(arrayList);
                    l4Var.dismiss();
                    return;
                }
                return;
            case 4:
                f5 f5Var = ((i4) obj2).f51534c.Y;
                f5Var.f52737e = !f5Var.f52737e;
                ((fk) obj).run();
                f5Var.i(true);
                return;
            case 5:
                yh.g.X((yh.g) obj2, (Context) obj, view);
                return;
            case 6:
                yh.y yVar = (yh.y) obj2;
                Context context = (Context) obj;
                String[] strArr = new String[6];
                int i13 = 0;
                int i14 = 0;
                while (true) {
                    int[] iArr = yh.y.f53606w0;
                    if (i13 < 6) {
                        strArr[i13] = LocaleController.formatPluralString("GiftOfferHours", iArr[i13] / 3600, new Object[0]);
                        if (iArr[i13] == yVar.f53619n0) {
                            i14 = i13;
                        }
                        i13++;
                    } else {
                        String string = LocaleController.getString(R.string.GiftOfferDuration);
                        ii.q1 q1Var = new ii.q1(yVar, 24);
                        Pattern pattern = g5.f26280a;
                        hg.g2 b10 = hg.g2.b(UserConfig.selectedAccount);
                        b10.g();
                        if (!b10.d.isEmpty()) {
                            int x02 = h6.x0(null, h6.f20667j5, false);
                            int x03 = h6.x0(null, h6.f20630h5, false);
                            h6.x0(null, h6.Ji, false);
                            h6.x0(null, h6.Ni, false);
                            h6.x0(null, h6.E8, false);
                            h6.x0(null, h6.G8, false);
                            h6.x0(null, h6.f20650i6, false);
                            h6.x0(null, h6.Sh, false);
                            h6.x0(null, h6.Oh, false);
                            h6.x0(null, h6.Qh, false);
                            org.telegram.ui.ActionBar.e3 e3Var = new org.telegram.ui.ActionBar.e3(1, context, (c6) null, false);
                            e3Var.fixNavigationBar();
                            e3Var.applyBottomPadding = false;
                            LinearLayout linearLayout = new LinearLayout(context);
                            linearLayout.setOrientation(0);
                            linearLayout.setWeightSum(1.0f);
                            yd0 yd0Var = new yd0(context, null);
                            yd0Var.setAllItemsCount(6);
                            yd0Var.setItemCount(Math.min(6, 8));
                            yd0Var.setTextColor(x02);
                            yd0Var.setGravity(17);
                            yd0Var.setMinValue(0);
                            yd0Var.setMaxValue(5);
                            yd0Var.setValue(i14);
                            linearLayout.addView(yd0Var, w5.l(1.0f, 0, 432));
                            yd0Var.setFormatter(new org.telegram.ui.Components.s(strArr, 7));
                            org.telegram.ui.Components.y4 y4Var = new org.telegram.ui.Components.y4(context, yd0Var);
                            y4Var.setOrientation(1);
                            FrameLayout frameLayout = new FrameLayout(context);
                            TextView textView = new TextView(context);
                            textView.setText(string);
                            textView.setTextColor(x02);
                            textView.setTextSize(1, 20.0f);
                            textView.setTypeface(AndroidUtilities.bold());
                            frameLayout.addView(textView, w5.a(-2.0f, 0.0f, 12.0f, 0.0f, 0.0f, -2, 51));
                            textView.setOnTouchListener(new bi.d(10));
                            y4Var.addView(frameLayout, w5.t(-1, -2, 51, 22, 0, 0, 4));
                            y4Var.addView(linearLayout, w5.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
                            ci.d dVar = new ci.d(context, null, true);
                            dVar.g(LocaleController.getString(R.string.Select), false, true);
                            dVar.setOnClickListener(new org.telegram.ui.Components.m2(r3, 1));
                            y4Var.addView(dVar, w5.t(-1, 48, 0, 16, 12, 16, 12));
                            e3Var.customView = y4Var;
                            e3Var.show();
                            e3Var.setOnDismissListener(new ei.e0(7, q1Var, yd0Var));
                            e3Var.setBackgroundColor(x03);
                            e3Var.fixNavigationBar(x03);
                            org.telegram.ui.ActionBar.e3[] e3VarArr = {e3Var};
                            return;
                        }
                        return;
                    }
                }
            case 7:
                yh.h0 h0Var = (yh.h0) obj2;
                b7 b7Var = (b7) obj;
                ci.d dVar2 = h0Var.f52830f;
                if (dVar2.W && !dVar2.N) {
                    AndroidUtilities.hideKeyboard(h0Var.f52828c);
                    dVar2.setLoading(true);
                    b7Var.run(h0Var.E);
                    return;
                }
                return;
            case 8:
                yh.r0 r0Var = (yh.r0) obj2;
                ArrayList<TL_stars.StarGiftAttribute> arrayList3 = (ArrayList) obj;
                yh.l0 l0Var = r0Var.f53328o0;
                int i15 = r0Var.C0;
                if (i15 == 2) {
                    l0Var.setPreviewingAttributes(arrayList3);
                    r0Var.T(1);
                    return;
                } else if (i15 == 1) {
                    yh.n0 n0Var2 = new yh.n0(l0Var.getUpgradeBackdropAttribute(), l0Var.getUpgradePatternAttribute(), l0Var.getUpgradeImageViewAttribute());
                    r0Var.f53335v0 = n0Var2;
                    l0Var.setPreviewAttributes(n0Var2);
                    r0Var.T(2);
                    return;
                } else {
                    return;
                }
            case 9:
                yh.n0 n0Var3 = (yh.n0) obj;
                yh.r0 r0Var2 = ((yh.m0) obj2).N;
                int i16 = r0Var2.C0;
                yh.l0 l0Var2 = r0Var2.f53328o0;
                if (i16 == 1) {
                    r0Var2.f53335v0 = new yh.n0(l0Var2.getUpgradeBackdropAttribute(), l0Var2.getUpgradePatternAttribute(), l0Var2.getUpgradeImageViewAttribute());
                    r0Var2.T(2);
                }
                int i17 = r0Var2.f53324j0.f53280r;
                yh.n0 n0Var4 = r0Var2.f53335v0;
                if (n0Var4 != null) {
                    TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = n0Var4.f53118a;
                    TL_stars.starGiftAttributeModel stargiftattributemodel = n0Var4.f53120c;
                    TL_stars.starGiftAttributePattern stargiftattributepattern = n0Var4.f53119b;
                    if (i17 == 1) {
                        n0Var = new yh.n0(n0Var3.f53118a, stargiftattributepattern, stargiftattributemodel);
                    } else if (i17 == 2) {
                        n0Var = new yh.n0(stargiftattributebackdrop, n0Var3.f53119b, stargiftattributemodel);
                    } else if (i17 == 0) {
                        n0Var = new yh.n0(stargiftattributebackdrop, stargiftattributepattern, n0Var3.f53120c);
                    }
                }
                r0Var2.f53335v0 = n0Var;
                l0Var2.setPreviewAttributes(n0Var);
                r0Var2.V();
                return;
            case 10:
                of.f.u(((yh.s3) obj2).getContext(), ((TL_stars.UniqueStarGiftValueInfo) obj).fragment_listed_url);
                return;
            case 11:
                ((yh.s3) obj2).p2((CharSequence) obj);
                return;
            case 12:
                yh.t2 t2Var = (yh.t2) obj2;
                c6 c6Var = (c6) obj;
                if (t2Var.E.getAlpha() >= 1.0f && !t2Var.f53453h0 && !t2Var.f53455j0 && t2Var.f53447d0 != null) {
                    new yh.r0(t2Var.getContext(), c6Var, t2Var.W, t2Var.f53446c0, t2Var.f53447d0, true).show();
                    return;
                }
                return;
            default:
                of.f.s((Context) obj2, ((TL_stars.StarsTransaction) obj).transaction_url);
                return;
        }
    }
}
