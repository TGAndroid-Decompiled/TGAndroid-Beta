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
import org.telegram.ui.Components.gd0;
public final class x implements View.OnClickListener {
    public final int f52208a;
    public final Object f52209b;
    public final Object f52210c;

    public x(int i10, Object obj, Object obj2) {
        this.f52208a = i10;
        this.f52209b = obj;
        this.f52210c = obj2;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f52208a;
        p0 p0Var = null;
        Object obj = this.f52209b;
        Object obj2 = this.f52210c;
        switch (i10) {
            case 0:
                b0 b0Var = (b0) obj;
                Context context = (Context) obj2;
                String[] strArr = new String[6];
                int i11 = 0;
                int i12 = 0;
                while (true) {
                    int[] iArr = b0.f51118w0;
                    if (i11 < 6) {
                        strArr[i11] = LocaleController.formatPluralString("GiftOfferHours", iArr[i11] / 3600, new Object[0]);
                        if (iArr[i11] == b0Var.f51131n0) {
                            i12 = i11;
                        }
                        i11++;
                    } else {
                        String string = LocaleController.getString(R.string.GiftOfferDuration);
                        ii.q1 q1Var = new ii.q1(b0Var, 24);
                        Pattern pattern = org.telegram.ui.Components.e5.f25971a;
                        hg.f2 b10 = hg.f2.b(UserConfig.selectedAccount);
                        b10.g();
                        if (!b10.d.isEmpty()) {
                            int w02 = org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f20935j5, false);
                            int w03 = org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f20899h5, false);
                            org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.Ji, false);
                            org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.Ni, false);
                            org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.E8, false);
                            org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.G8, false);
                            org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f20918i6, false);
                            org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.Sh, false);
                            org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.Oh, false);
                            org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.Qh, false);
                            org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(1, context, (org.telegram.ui.ActionBar.d6) null, false);
                            f3Var.fixNavigationBar();
                            f3Var.applyBottomPadding = false;
                            LinearLayout linearLayout = new LinearLayout(context);
                            linearLayout.setOrientation(0);
                            linearLayout.setWeightSum(1.0f);
                            gd0 gd0Var = new gd0(context, null);
                            gd0Var.setAllItemsCount(6);
                            gd0Var.setItemCount(Math.min(6, 8));
                            gd0Var.setTextColor(w02);
                            gd0Var.setGravity(17);
                            gd0Var.setMinValue(0);
                            gd0Var.setMaxValue(5);
                            gd0Var.setValue(i12);
                            linearLayout.addView(gd0Var, w7.z5.l(1.0f, 0, 432));
                            gd0Var.setFormatter(new org.telegram.ui.Components.s(strArr, 7));
                            org.telegram.ui.Components.w4 w4Var = new org.telegram.ui.Components.w4(context, gd0Var);
                            w4Var.setOrientation(1);
                            FrameLayout frameLayout = new FrameLayout(context);
                            TextView textView = new TextView(context);
                            textView.setText(string);
                            textView.setTextColor(w02);
                            textView.setTextSize(1, 20.0f);
                            textView.setTypeface(AndroidUtilities.bold());
                            frameLayout.addView(textView, w7.z5.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                            textView.setOnTouchListener(new bi.d(10));
                            w4Var.addView(frameLayout, w7.z5.t(-1, -2, 51, 22, 0, 0, 4));
                            w4Var.addView(linearLayout, w7.z5.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
                            ci.d dVar = new ci.d(context, null, true);
                            dVar.g(LocaleController.getString(R.string.Select), false, true);
                            dVar.setOnClickListener(new org.telegram.ui.Components.k2(r3, 1));
                            w4Var.addView(dVar, w7.z5.t(-1, 48, 0, 16, 12, 16, 12));
                            f3Var.customView = w4Var;
                            f3Var.show();
                            f3Var.setOnDismissListener(new ei.f0(7, q1Var, gd0Var));
                            f3Var.setBackgroundColor(w03);
                            f3Var.fixNavigationBar(w03);
                            org.telegram.ui.ActionBar.f3[] f3VarArr = {f3Var};
                            return;
                        }
                        return;
                    }
                }
            case 1:
                j0 j0Var = (j0) obj;
                r6 r6Var = (r6) obj2;
                ci.d dVar2 = j0Var.f51474f;
                if (dVar2.W && !dVar2.N) {
                    AndroidUtilities.hideKeyboard(j0Var.f51472c);
                    dVar2.setLoading(true);
                    r6Var.run(j0Var.E);
                    return;
                }
                return;
            case 2:
                t0 t0Var = (t0) obj;
                ArrayList<TL_stars.StarGiftAttribute> arrayList = (ArrayList) obj2;
                n0 n0Var = t0Var.f51999o0;
                int i13 = t0Var.f52009y0;
                if (i13 == 2) {
                    n0Var.setPreviewingAttributes(arrayList);
                    t0Var.Q(1);
                    return;
                } else if (i13 == 1) {
                    p0 p0Var2 = new p0(n0Var.getUpgradeBackdropAttribute(), n0Var.getUpgradePatternAttribute(), n0Var.getUpgradeImageViewAttribute());
                    t0Var.f52004t0 = p0Var2;
                    n0Var.setPreviewAttributes(p0Var2);
                    t0Var.Q(2);
                    return;
                } else {
                    return;
                }
            case 3:
                p0 p0Var3 = (p0) obj2;
                t0 t0Var2 = ((o0) obj).N;
                int i14 = t0Var2.f52009y0;
                n0 n0Var2 = t0Var2.f51999o0;
                if (i14 == 1) {
                    t0Var2.f52004t0 = new p0(n0Var2.getUpgradeBackdropAttribute(), n0Var2.getUpgradePatternAttribute(), n0Var2.getUpgradeImageViewAttribute());
                    t0Var2.Q(2);
                }
                int i15 = t0Var2.f51995j0.f51954r;
                p0 p0Var4 = t0Var2.f52004t0;
                if (p0Var4 != null) {
                    TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = p0Var4.f51778a;
                    TL_stars.starGiftAttributeModel stargiftattributemodel = p0Var4.f51780c;
                    TL_stars.starGiftAttributePattern stargiftattributepattern = p0Var4.f51779b;
                    if (i15 == 1) {
                        p0Var = new p0(p0Var3.f51778a, stargiftattributepattern, stargiftattributemodel);
                    } else if (i15 == 2) {
                        p0Var = new p0(stargiftattributebackdrop, p0Var3.f51779b, stargiftattributemodel);
                    } else if (i15 == 0) {
                        p0Var = new p0(stargiftattributebackdrop, stargiftattributepattern, p0Var3.f51780c);
                    }
                }
                t0Var2.f52004t0 = p0Var;
                n0Var2.setPreviewAttributes(p0Var);
                t0Var2.S();
                return;
            case 4:
                nf.f.u(((y3) obj).getContext(), ((TL_stars.UniqueStarGiftValueInfo) obj2).fragment_listed_url);
                return;
            case 5:
                ((y3) obj).n2((CharSequence) obj2);
                return;
            case 6:
                y2 y2Var = (y2) obj;
                org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) obj2;
                if (y2Var.E.getAlpha() >= 1.0f && !y2Var.f52268h0 && !y2Var.f52270j0 && y2Var.f52262d0 != null) {
                    new t0(y2Var.getContext(), d6Var, y2Var.W, y2Var.f52261c0, y2Var.f52262d0, true).show();
                    return;
                }
                return;
            default:
                nf.f.s((Context) obj2, ((TL_stars.StarsTransaction) obj).transaction_url);
                return;
        }
    }

    public x(Context context, TL_stars.StarsTransaction starsTransaction) {
        this.f52208a = 7;
        this.f52210c = context;
        this.f52209b = starsTransaction;
    }
}
