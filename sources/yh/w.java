package yh;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.cd0;
import org.telegram.ui.pj0;
public final class w implements View.OnClickListener {
    public final int f48201a;
    public final Object f48202b;
    public final Object f48203c;

    public w(int i10, Object obj, Object obj2) {
        this.f48201a = i10;
        this.f48202b = obj;
        this.f48203c = obj2;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f48201a;
        o0 o0Var = null;
        Object obj = this.f48202b;
        Object obj2 = this.f48203c;
        switch (i10) {
            case 0:
                a0 a0Var = (a0) obj;
                Context context = (Context) obj2;
                String[] strArr = new String[6];
                int i11 = 0;
                int i12 = 0;
                while (true) {
                    int[] iArr = a0.f47198w0;
                    if (i11 < 6) {
                        strArr[i11] = LocaleController.formatPluralString("GiftOfferHours", iArr[i11] / 3600, new Object[0]);
                        if (iArr[i11] == a0Var.f47211n0) {
                            i12 = i11;
                        }
                        i11++;
                    } else {
                        String string = LocaleController.getString(R.string.GiftOfferDuration);
                        org.telegram.ui.web.b1 b1Var = new org.telegram.ui.web.b1(a0Var, 21);
                        Pattern pattern = org.telegram.ui.Components.d5.f23492a;
                        hg.f2 b10 = hg.f2.b(UserConfig.selectedAccount);
                        b10.g();
                        if (!b10.d.isEmpty()) {
                            int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19201j5, false);
                            int w03 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19165h5, false);
                            org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Ji, false);
                            org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Ni, false);
                            org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.E8, false);
                            org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G8, false);
                            org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19184i6, false);
                            org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Sh, false);
                            org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Oh, false);
                            org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Qh, false);
                            org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(1, context, (org.telegram.ui.ActionBar.f6) null, false);
                            f3Var.fixNavigationBar();
                            f3Var.applyBottomPadding = false;
                            LinearLayout linearLayout = new LinearLayout(context);
                            linearLayout.setOrientation(0);
                            linearLayout.setWeightSum(1.0f);
                            cd0 cd0Var = new cd0(context, null);
                            cd0Var.setAllItemsCount(6);
                            cd0Var.setItemCount(Math.min(6, 8));
                            cd0Var.setTextColor(w02);
                            cd0Var.setGravity(17);
                            cd0Var.setMinValue(0);
                            cd0Var.setMaxValue(5);
                            cd0Var.setValue(i12);
                            linearLayout.addView(cd0Var, w7.y5.l(1.0f, 0, 432));
                            cd0Var.setFormatter(new org.telegram.ui.Components.s(strArr, 7));
                            org.telegram.ui.Components.v4 v4Var = new org.telegram.ui.Components.v4(context, cd0Var);
                            v4Var.setOrientation(1);
                            FrameLayout frameLayout = new FrameLayout(context);
                            TextView textView = new TextView(context);
                            textView.setText(string);
                            textView.setTextColor(w02);
                            textView.setTextSize(1, 20.0f);
                            textView.setTypeface(AndroidUtilities.bold());
                            frameLayout.addView(textView, w7.y5.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                            textView.setOnTouchListener(new bi.d(10));
                            v4Var.addView(frameLayout, w7.y5.t(-1, -2, 51, 22, 0, 0, 4));
                            v4Var.addView(linearLayout, w7.y5.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
                            ci.d dVar = new ci.d(context, null, true);
                            dVar.g(LocaleController.getString(R.string.Select), false, true);
                            dVar.setOnClickListener(new org.telegram.ui.Components.k2(r3, 1));
                            v4Var.addView(dVar, w7.y5.t(-1, 48, 0, 16, 12, 16, 12));
                            f3Var.customView = v4Var;
                            f3Var.show();
                            f3Var.setOnDismissListener(new ei.e0(7, b1Var, cd0Var));
                            f3Var.setBackgroundColor(w03);
                            f3Var.fixNavigationBar(w03);
                            org.telegram.ui.ActionBar.f3[] f3VarArr = {f3Var};
                            return;
                        }
                        return;
                    }
                }
            case 1:
                i0 i0Var = (i0) obj;
                pj0 pj0Var = (pj0) obj2;
                ci.d dVar2 = i0Var.f47542f;
                if (dVar2.W && !dVar2.N) {
                    AndroidUtilities.hideKeyboard(i0Var.f47541c);
                    dVar2.setLoading(true);
                    pj0Var.run(i0Var.E);
                    return;
                }
                return;
            case 2:
                s0 s0Var = (s0) obj;
                ArrayList<TL_stars.StarGiftAttribute> arrayList = (ArrayList) obj2;
                m0 m0Var = s0Var.f48020o0;
                int i13 = s0Var.C0;
                if (i13 == 2) {
                    m0Var.setPreviewingAttributes(arrayList);
                    s0Var.S(1);
                    return;
                } else if (i13 == 1) {
                    o0 o0Var2 = new o0(m0Var.getUpgradeBackdropAttribute(), m0Var.getUpgradePatternAttribute(), m0Var.getUpgradeImageViewAttribute());
                    s0Var.f48027v0 = o0Var2;
                    m0Var.setPreviewAttributes(o0Var2);
                    s0Var.S(2);
                    return;
                } else {
                    return;
                }
            case 3:
                o0 o0Var3 = (o0) obj2;
                s0 s0Var2 = ((n0) obj).N;
                int i14 = s0Var2.C0;
                m0 m0Var2 = s0Var2.f48020o0;
                if (i14 == 1) {
                    s0Var2.f48027v0 = new o0(m0Var2.getUpgradeBackdropAttribute(), m0Var2.getUpgradePatternAttribute(), m0Var2.getUpgradeImageViewAttribute());
                    s0Var2.S(2);
                }
                int i15 = s0Var2.f48016j0.f47983r;
                o0 o0Var4 = s0Var2.f48027v0;
                if (o0Var4 != null) {
                    TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = o0Var4.f47836a;
                    TL_stars.starGiftAttributeModel stargiftattributemodel = o0Var4.f47838c;
                    TL_stars.starGiftAttributePattern stargiftattributepattern = o0Var4.f47837b;
                    if (i15 == 1) {
                        o0Var = new o0(o0Var3.f47836a, stargiftattributepattern, stargiftattributemodel);
                    } else if (i15 == 2) {
                        o0Var = new o0(stargiftattributebackdrop, o0Var3.f47837b, stargiftattributemodel);
                    } else if (i15 == 0) {
                        o0Var = new o0(stargiftattributebackdrop, stargiftattributepattern, o0Var3.f47838c);
                    }
                }
                s0Var2.f48027v0 = o0Var;
                m0Var2.setPreviewAttributes(o0Var);
                s0Var2.U();
                return;
            case 4:
                nf.f.u(((y3) obj).getContext(), ((TL_stars.UniqueStarGiftValueInfo) obj2).fragment_listed_url);
                return;
            case 5:
                ((y3) obj).n2((CharSequence) obj2);
                return;
            case 6:
                y2 y2Var = (y2) obj;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) obj2;
                if (y2Var.E.getAlpha() >= 1.0f && !y2Var.f48287h0 && !y2Var.f48289j0 && y2Var.f48282d0 != null) {
                    new s0(y2Var.getContext(), f6Var, y2Var.W, y2Var.f48281c0, y2Var.f48282d0, true).show();
                    return;
                }
                return;
            default:
                nf.f.s((Context) obj2, ((TL_stars.StarsTransaction) obj).transaction_url);
                return;
        }
    }

    public w(Context context, TL_stars.StarsTransaction starsTransaction) {
        this.f48201a = 7;
        this.f48203c = context;
        this.f48202b = starsTransaction;
    }
}
