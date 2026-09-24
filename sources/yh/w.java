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
import org.telegram.ui.Components.ed0;
public final class w implements View.OnClickListener {
    public final int f48146a;
    public final Object f48147b;
    public final Object f48148c;

    public w(int i10, Object obj, Object obj2) {
        this.f48146a = i10;
        this.f48147b = obj;
        this.f48148c = obj2;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f48146a;
        o0 o0Var = null;
        Object obj = this.f48147b;
        Object obj2 = this.f48148c;
        switch (i10) {
            case 0:
                a0 a0Var = (a0) obj;
                Context context = (Context) obj2;
                String[] strArr = new String[6];
                int i11 = 0;
                int i12 = 0;
                while (true) {
                    int[] iArr = a0.f47161w0;
                    if (i11 < 6) {
                        strArr[i11] = LocaleController.formatPluralString("GiftOfferHours", iArr[i11] / 3600, new Object[0]);
                        if (iArr[i11] == a0Var.f47174n0) {
                            i12 = i11;
                        }
                        i11++;
                    } else {
                        String string = LocaleController.getString(R.string.GiftOfferDuration);
                        ii.q1 q1Var = new ii.q1(a0Var, 24);
                        Pattern pattern = org.telegram.ui.Components.e5.f23809a;
                        hg.g2 b10 = hg.g2.b(UserConfig.selectedAccount);
                        b10.g();
                        if (!b10.d.isEmpty()) {
                            int w02 = org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19151j5, false);
                            int w03 = org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19115h5, false);
                            org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.Ji, false);
                            org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.Ni, false);
                            org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.E8, false);
                            org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.G8, false);
                            org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19134i6, false);
                            org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.Sh, false);
                            org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.Oh, false);
                            org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.Qh, false);
                            org.telegram.ui.ActionBar.e3 e3Var = new org.telegram.ui.ActionBar.e3(1, context, (org.telegram.ui.ActionBar.d6) null, false);
                            e3Var.fixNavigationBar();
                            e3Var.applyBottomPadding = false;
                            LinearLayout linearLayout = new LinearLayout(context);
                            linearLayout.setOrientation(0);
                            linearLayout.setWeightSum(1.0f);
                            ed0 ed0Var = new ed0(context, null);
                            ed0Var.setAllItemsCount(6);
                            ed0Var.setItemCount(Math.min(6, 8));
                            ed0Var.setTextColor(w02);
                            ed0Var.setGravity(17);
                            ed0Var.setMinValue(0);
                            ed0Var.setMaxValue(5);
                            ed0Var.setValue(i12);
                            linearLayout.addView(ed0Var, w7.y5.l(1.0f, 0, 432));
                            ed0Var.setFormatter(new org.telegram.ui.Components.s(strArr, 7));
                            org.telegram.ui.Components.w4 w4Var = new org.telegram.ui.Components.w4(context, ed0Var);
                            w4Var.setOrientation(1);
                            FrameLayout frameLayout = new FrameLayout(context);
                            TextView textView = new TextView(context);
                            textView.setText(string);
                            textView.setTextColor(w02);
                            textView.setTextSize(1, 20.0f);
                            textView.setTypeface(AndroidUtilities.bold());
                            frameLayout.addView(textView, w7.y5.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                            textView.setOnTouchListener(new bi.d(10));
                            w4Var.addView(frameLayout, w7.y5.t(-1, -2, 51, 22, 0, 0, 4));
                            w4Var.addView(linearLayout, w7.y5.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
                            ci.d dVar = new ci.d(context, null, true);
                            dVar.g(LocaleController.getString(R.string.Select), false, true);
                            dVar.setOnClickListener(new org.telegram.ui.Components.k2(r3, 1));
                            w4Var.addView(dVar, w7.y5.t(-1, 48, 0, 16, 12, 16, 12));
                            e3Var.customView = w4Var;
                            e3Var.show();
                            e3Var.setOnDismissListener(new ei.e0(7, q1Var, ed0Var));
                            e3Var.setBackgroundColor(w03);
                            e3Var.fixNavigationBar(w03);
                            org.telegram.ui.ActionBar.e3[] e3VarArr = {e3Var};
                            return;
                        }
                        return;
                    }
                }
            case 1:
                i0 i0Var = (i0) obj;
                p6 p6Var = (p6) obj2;
                ci.d dVar2 = i0Var.f47484f;
                if (dVar2.W && !dVar2.N) {
                    AndroidUtilities.hideKeyboard(i0Var.f47483c);
                    dVar2.setLoading(true);
                    p6Var.run(i0Var.E);
                    return;
                }
                return;
            case 2:
                s0 s0Var = (s0) obj;
                ArrayList<TL_stars.StarGiftAttribute> arrayList = (ArrayList) obj2;
                m0 m0Var = s0Var.f47967o0;
                int i13 = s0Var.C0;
                if (i13 == 2) {
                    m0Var.setPreviewingAttributes(arrayList);
                    s0Var.S(1);
                    return;
                } else if (i13 == 1) {
                    o0 o0Var2 = new o0(m0Var.getUpgradeBackdropAttribute(), m0Var.getUpgradePatternAttribute(), m0Var.getUpgradeImageViewAttribute());
                    s0Var.f47974v0 = o0Var2;
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
                m0 m0Var2 = s0Var2.f47967o0;
                if (i14 == 1) {
                    s0Var2.f47974v0 = new o0(m0Var2.getUpgradeBackdropAttribute(), m0Var2.getUpgradePatternAttribute(), m0Var2.getUpgradeImageViewAttribute());
                    s0Var2.S(2);
                }
                int i15 = s0Var2.f47963j0.f47929r;
                o0 o0Var4 = s0Var2.f47974v0;
                if (o0Var4 != null) {
                    TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = o0Var4.f47782a;
                    TL_stars.starGiftAttributeModel stargiftattributemodel = o0Var4.f47784c;
                    TL_stars.starGiftAttributePattern stargiftattributepattern = o0Var4.f47783b;
                    if (i15 == 1) {
                        o0Var = new o0(o0Var3.f47782a, stargiftattributepattern, stargiftattributemodel);
                    } else if (i15 == 2) {
                        o0Var = new o0(stargiftattributebackdrop, o0Var3.f47783b, stargiftattributemodel);
                    } else if (i15 == 0) {
                        o0Var = new o0(stargiftattributebackdrop, stargiftattributepattern, o0Var3.f47784c);
                    }
                }
                s0Var2.f47974v0 = o0Var;
                m0Var2.setPreviewAttributes(o0Var);
                s0Var2.U();
                return;
            case 4:
                nf.f.u(((x3) obj).getContext(), ((TL_stars.UniqueStarGiftValueInfo) obj2).fragment_listed_url);
                return;
            case 5:
                ((x3) obj).n2((CharSequence) obj2);
                return;
            case 6:
                x2 x2Var = (x2) obj;
                org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) obj2;
                if (x2Var.E.getAlpha() >= 1.0f && !x2Var.f48205h0 && !x2Var.f48207j0 && x2Var.f48200d0 != null) {
                    new s0(x2Var.getContext(), d6Var, x2Var.W, x2Var.f48199c0, x2Var.f48200d0, true).show();
                    return;
                }
                return;
            default:
                nf.f.s((Context) obj2, ((TL_stars.StarsTransaction) obj).transaction_url);
                return;
        }
    }

    public w(Context context, TL_stars.StarsTransaction starsTransaction) {
        this.f48146a = 7;
        this.f48148c = context;
        this.f48147b = starsTransaction;
    }
}
