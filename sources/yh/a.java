package yh;

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
import org.telegram.messenger.ck;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.g5;
import org.telegram.ui.Components.ud0;
import org.telegram.ui.Wallet.y6;
import w7.a6;
import zh.d7;
import zh.f5;
import zh.p7;
public final class a implements View.OnClickListener {
    public final int f48784a;
    public final Object f48785b;
    public final Object f48786c;

    public a(int i10, Object obj, Object obj2) {
        this.f48784a = i10;
        this.f48785b = obj;
        this.f48786c = obj2;
    }

    @Override
    public final void onClick(View view) {
        TL_stars.SavedStarGift savedStarGift;
        int i10 = this.f48784a;
        zh.n0 n0Var = null;
        Object obj = this.f48786c;
        Object obj2 = this.f48785b;
        switch (i10) {
            case 0:
                d.Q((d) obj2, (TL_stars.TL_StarGiftAuctionAcquiredGift) obj);
                return;
            case 1:
                g4 g4Var = (g4) obj2;
                g4Var.getClass();
                if (((d7) obj).f50390f > 0) {
                    g4Var.presentFragment(new p7());
                    return;
                }
                return;
            case 2:
                f4.Q((f4) obj2, (e4) obj);
                return;
            case 3:
                k4 k4Var = (k4) obj2;
                fi.r4 r4Var = (fi.r4) obj;
                HashSet hashSet = k4Var.Z;
                if (!hashSet.isEmpty()) {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        long longValue = ((Long) it.next()).longValue();
                        ArrayList arrayList2 = k4Var.Y.f50509l;
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
                    r4Var.run(arrayList);
                    k4Var.dismiss();
                    return;
                }
                return;
            case 4:
                f5 f5Var = ((h4) obj2).f48916c.Y;
                f5Var.e = !f5Var.e;
                ((ck) obj).run();
                f5Var.i(true);
                return;
            case 5:
                zh.g.X((zh.g) obj2, (Context) obj, view);
                return;
            case 6:
                zh.z zVar = (zh.z) obj2;
                Context context = (Context) obj;
                String[] strArr = new String[6];
                int i13 = 0;
                int i14 = 0;
                while (true) {
                    int[] iArr = zh.z.f51342w0;
                    if (i13 < 6) {
                        strArr[i13] = LocaleController.formatPluralString("GiftOfferHours", iArr[i13] / 3600, new Object[0]);
                        if (iArr[i13] == zVar.f51355n0) {
                            i14 = i13;
                        }
                        i13++;
                    } else {
                        String string = LocaleController.getString(R.string.GiftOfferDuration);
                        ji.p1 p1Var = new ji.p1(zVar, 24);
                        Pattern pattern = g5.f25184a;
                        ig.f2 b10 = ig.f2.b(UserConfig.selectedAccount);
                        b10.g();
                        if (!b10.d.isEmpty()) {
                            int x02 = g6.x0(null, g6.f20007j5, false);
                            int x03 = g6.x0(null, g6.f19972h5, false);
                            g6.x0(null, g6.Ji, false);
                            g6.x0(null, g6.Ni, false);
                            g6.x0(null, g6.E8, false);
                            g6.x0(null, g6.G8, false);
                            g6.x0(null, g6.f19990i6, false);
                            g6.x0(null, g6.Sh, false);
                            g6.x0(null, g6.Oh, false);
                            g6.x0(null, g6.Qh, false);
                            org.telegram.ui.ActionBar.e3 e3Var = new org.telegram.ui.ActionBar.e3(1, context, (c6) null, false);
                            e3Var.fixNavigationBar();
                            e3Var.applyBottomPadding = false;
                            LinearLayout linearLayout = new LinearLayout(context);
                            linearLayout.setOrientation(0);
                            linearLayout.setWeightSum(1.0f);
                            ud0 ud0Var = new ud0(context, null);
                            ud0Var.setAllItemsCount(6);
                            ud0Var.setItemCount(Math.min(6, 8));
                            ud0Var.setTextColor(x02);
                            ud0Var.setGravity(17);
                            ud0Var.setMinValue(0);
                            ud0Var.setMaxValue(5);
                            ud0Var.setValue(i14);
                            linearLayout.addView(ud0Var, a6.l(1.0f, 0, 432));
                            ud0Var.setFormatter(new org.telegram.ui.Components.s(strArr, 7));
                            org.telegram.ui.Components.y4 y4Var = new org.telegram.ui.Components.y4(context, ud0Var);
                            y4Var.setOrientation(1);
                            FrameLayout frameLayout = new FrameLayout(context);
                            TextView textView = new TextView(context);
                            textView.setText(string);
                            textView.setTextColor(x02);
                            textView.setTextSize(1, 20.0f);
                            textView.setTypeface(AndroidUtilities.bold());
                            frameLayout.addView(textView, a6.a(-2.0f, 0.0f, 12.0f, 0.0f, 0.0f, -2, 51));
                            textView.setOnTouchListener(new ci.d(10));
                            y4Var.addView(frameLayout, a6.t(-1, -2, 51, 22, 0, 0, 4));
                            y4Var.addView(linearLayout, a6.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
                            di.d dVar = new di.d(context, null, true);
                            dVar.g(LocaleController.getString(R.string.Select), false, true);
                            dVar.setOnClickListener(new org.telegram.ui.Components.m2(r3, 1));
                            y4Var.addView(dVar, a6.t(-1, 48, 0, 16, 12, 16, 12));
                            e3Var.customView = y4Var;
                            e3Var.show();
                            e3Var.setOnDismissListener(new fi.d0(7, p1Var, ud0Var));
                            e3Var.setBackgroundColor(x03);
                            e3Var.fixNavigationBar(x03);
                            org.telegram.ui.ActionBar.e3[] e3VarArr = {e3Var};
                            return;
                        }
                        return;
                    }
                }
            case 7:
                zh.h0 h0Var = (zh.h0) obj2;
                y6 y6Var = (y6) obj;
                di.d dVar2 = h0Var.f50597f;
                if (dVar2.W && !dVar2.N) {
                    AndroidUtilities.hideKeyboard(h0Var.f50596c);
                    dVar2.setLoading(true);
                    y6Var.run(h0Var.E);
                    return;
                }
                return;
            case 8:
                zh.r0 r0Var = (zh.r0) obj2;
                ArrayList<TL_stars.StarGiftAttribute> arrayList3 = (ArrayList) obj;
                zh.l0 l0Var = r0Var.f51046o0;
                int i15 = r0Var.C0;
                if (i15 == 2) {
                    l0Var.setPreviewingAttributes(arrayList3);
                    r0Var.T(1);
                    return;
                } else if (i15 == 1) {
                    zh.n0 n0Var2 = new zh.n0(l0Var.getUpgradeBackdropAttribute(), l0Var.getUpgradePatternAttribute(), l0Var.getUpgradeImageViewAttribute());
                    r0Var.f51053v0 = n0Var2;
                    l0Var.setPreviewAttributes(n0Var2);
                    r0Var.T(2);
                    return;
                } else {
                    return;
                }
            case 9:
                zh.n0 n0Var3 = (zh.n0) obj;
                zh.r0 r0Var2 = ((zh.m0) obj2).N;
                int i16 = r0Var2.C0;
                zh.l0 l0Var2 = r0Var2.f51046o0;
                if (i16 == 1) {
                    r0Var2.f51053v0 = new zh.n0(l0Var2.getUpgradeBackdropAttribute(), l0Var2.getUpgradePatternAttribute(), l0Var2.getUpgradeImageViewAttribute());
                    r0Var2.T(2);
                }
                int i17 = r0Var2.f51042j0.f51002r;
                zh.n0 n0Var4 = r0Var2.f51053v0;
                if (n0Var4 != null) {
                    TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = n0Var4.f50850a;
                    TL_stars.starGiftAttributeModel stargiftattributemodel = n0Var4.f50852c;
                    TL_stars.starGiftAttributePattern stargiftattributepattern = n0Var4.f50851b;
                    if (i17 == 1) {
                        n0Var = new zh.n0(n0Var3.f50850a, stargiftattributepattern, stargiftattributemodel);
                    } else if (i17 == 2) {
                        n0Var = new zh.n0(stargiftattributebackdrop, n0Var3.f50851b, stargiftattributemodel);
                    } else if (i17 == 0) {
                        n0Var = new zh.n0(stargiftattributebackdrop, stargiftattributepattern, n0Var3.f50852c);
                    }
                }
                r0Var2.f51053v0 = n0Var;
                l0Var2.setPreviewAttributes(n0Var);
                r0Var2.V();
                return;
            case 10:
                pf.d.u(((zh.r3) obj2).getContext(), ((TL_stars.UniqueStarGiftValueInfo) obj).fragment_listed_url);
                return;
            case 11:
                ((zh.r3) obj2).p2((CharSequence) obj);
                return;
            case 12:
                zh.s2 s2Var = (zh.s2) obj2;
                c6 c6Var = (c6) obj;
                if (s2Var.E.getAlpha() >= 1.0f && !s2Var.f51144h0 && !s2Var.f51146j0 && s2Var.f51139d0 != null) {
                    new zh.r0(s2Var.getContext(), c6Var, s2Var.W, s2Var.f51138c0, s2Var.f51139d0, true).show();
                    return;
                }
                return;
            default:
                pf.d.s((Context) obj2, ((TL_stars.StarsTransaction) obj).transaction_url);
                return;
        }
    }
}
