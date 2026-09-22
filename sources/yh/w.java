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
import org.telegram.ui.Components.uc0;
import org.telegram.ui.mj0;
public final class w implements View.OnClickListener {
    public final int f47857a;
    public final Object f47858b;
    public final Object f47859c;

    public w(int i10, Object obj, Object obj2) {
        this.f47857a = i10;
        this.f47858b = obj;
        this.f47859c = obj2;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f47857a;
        o0 o0Var = null;
        Object obj = this.f47858b;
        Object obj2 = this.f47859c;
        switch (i10) {
            case 0:
                a0 a0Var = (a0) obj;
                Context context = (Context) obj2;
                String[] strArr = new String[6];
                int i11 = 0;
                int i12 = 0;
                while (true) {
                    int[] iArr = a0.f46889w0;
                    if (i11 < 6) {
                        strArr[i11] = LocaleController.formatPluralString("GiftOfferHours", iArr[i11] / 3600, new Object[0]);
                        if (iArr[i11] == a0Var.f46902n0) {
                            i12 = i11;
                        }
                        i11++;
                    } else {
                        String string = LocaleController.getString(R.string.GiftOfferDuration);
                        org.telegram.ui.web.b1 b1Var = new org.telegram.ui.web.b1(a0Var, 21);
                        Pattern pattern = org.telegram.ui.Components.c5.f22944a;
                        hg.g2 b10 = hg.g2.b(UserConfig.selectedAccount);
                        b10.g();
                        if (!b10.d.isEmpty()) {
                            int w02 = org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f18940j5, false);
                            int w03 = org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f18904h5, false);
                            org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.Ji, false);
                            org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.Ni, false);
                            org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.E8, false);
                            org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.G8, false);
                            org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f18923i6, false);
                            org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.Sh, false);
                            org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.Oh, false);
                            org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.Qh, false);
                            org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(1, context, (org.telegram.ui.ActionBar.e6) null, false);
                            f3Var.fixNavigationBar();
                            f3Var.applyBottomPadding = false;
                            LinearLayout linearLayout = new LinearLayout(context);
                            linearLayout.setOrientation(0);
                            linearLayout.setWeightSum(1.0f);
                            uc0 uc0Var = new uc0(context, null);
                            uc0Var.setAllItemsCount(6);
                            uc0Var.setItemCount(Math.min(6, 8));
                            uc0Var.setTextColor(w02);
                            uc0Var.setGravity(17);
                            uc0Var.setMinValue(0);
                            uc0Var.setMaxValue(5);
                            uc0Var.setValue(i12);
                            linearLayout.addView(uc0Var, w7.x5.l(1.0f, 0, 432));
                            uc0Var.setFormatter(new org.telegram.ui.Components.s(strArr, 7));
                            org.telegram.ui.Components.u4 u4Var = new org.telegram.ui.Components.u4(context, uc0Var);
                            u4Var.setOrientation(1);
                            FrameLayout frameLayout = new FrameLayout(context);
                            TextView textView = new TextView(context);
                            textView.setText(string);
                            textView.setTextColor(w02);
                            textView.setTextSize(1, 20.0f);
                            textView.setTypeface(AndroidUtilities.bold());
                            frameLayout.addView(textView, w7.x5.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                            textView.setOnTouchListener(new bi.d(10));
                            u4Var.addView(frameLayout, w7.x5.t(-1, -2, 51, 22, 0, 0, 4));
                            u4Var.addView(linearLayout, w7.x5.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
                            ci.d dVar = new ci.d(context, null, true);
                            dVar.g(LocaleController.getString(R.string.Select), false, true);
                            dVar.setOnClickListener(new org.telegram.ui.Components.j2(r3, 1));
                            u4Var.addView(dVar, w7.x5.t(-1, 48, 0, 16, 12, 16, 12));
                            f3Var.customView = u4Var;
                            f3Var.show();
                            f3Var.setOnDismissListener(new ei.e0(7, b1Var, uc0Var));
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
                mj0 mj0Var = (mj0) obj2;
                ci.d dVar2 = i0Var.f47214f;
                if (dVar2.W && !dVar2.N) {
                    AndroidUtilities.hideKeyboard(i0Var.f47213c);
                    dVar2.setLoading(true);
                    mj0Var.run(i0Var.E);
                    return;
                }
                return;
            case 2:
                s0 s0Var = (s0) obj;
                ArrayList<TL_stars.StarGiftAttribute> arrayList = (ArrayList) obj2;
                m0 m0Var = s0Var.f47707o0;
                int i13 = s0Var.C0;
                if (i13 == 2) {
                    m0Var.setPreviewingAttributes(arrayList);
                    s0Var.S(1);
                    return;
                } else if (i13 == 1) {
                    o0 o0Var2 = new o0(m0Var.getUpgradeBackdropAttribute(), m0Var.getUpgradePatternAttribute(), m0Var.getUpgradeImageViewAttribute());
                    s0Var.f47714v0 = o0Var2;
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
                m0 m0Var2 = s0Var2.f47707o0;
                if (i14 == 1) {
                    s0Var2.f47714v0 = new o0(m0Var2.getUpgradeBackdropAttribute(), m0Var2.getUpgradePatternAttribute(), m0Var2.getUpgradeImageViewAttribute());
                    s0Var2.S(2);
                }
                int i15 = s0Var2.f47703j0.f47647r;
                o0 o0Var4 = s0Var2.f47714v0;
                if (o0Var4 != null) {
                    TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = o0Var4.f47509a;
                    TL_stars.starGiftAttributeModel stargiftattributemodel = o0Var4.f47511c;
                    TL_stars.starGiftAttributePattern stargiftattributepattern = o0Var4.f47510b;
                    if (i15 == 1) {
                        o0Var = new o0(o0Var3.f47509a, stargiftattributepattern, stargiftattributemodel);
                    } else if (i15 == 2) {
                        o0Var = new o0(stargiftattributebackdrop, o0Var3.f47510b, stargiftattributemodel);
                    } else if (i15 == 0) {
                        o0Var = new o0(stargiftattributebackdrop, stargiftattributepattern, o0Var3.f47511c);
                    }
                }
                s0Var2.f47714v0 = o0Var;
                m0Var2.setPreviewAttributes(o0Var);
                s0Var2.U();
                return;
            case 4:
                nf.f.u(((z3) obj).getContext(), ((TL_stars.UniqueStarGiftValueInfo) obj2).fragment_listed_url);
                return;
            case 5:
                ((z3) obj).n2((CharSequence) obj2);
                return;
            case 6:
                z2 z2Var = (z2) obj;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) obj2;
                if (z2Var.E.getAlpha() >= 1.0f && !z2Var.f47999h0 && !z2Var.f48001j0 && z2Var.f47994d0 != null) {
                    new s0(z2Var.getContext(), e6Var, z2Var.W, z2Var.f47993c0, z2Var.f47994d0, true).show();
                    return;
                }
                return;
            default:
                nf.f.s((Context) obj2, ((TL_stars.StarsTransaction) obj).transaction_url);
                return;
        }
    }

    public w(Context context, TL_stars.StarsTransaction starsTransaction) {
        this.f47857a = 7;
        this.f47859c = context;
        this.f47858b = starsTransaction;
    }
}
