package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class un0 implements View.OnClickListener {
    public final int f40454a;
    public final ap0 f40455b;

    public un0(ap0 ap0Var, int i10) {
        this.f40454a = i10;
        this.f40455b = ap0Var;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        int i10 = this.f40454a;
        ap0 ap0Var = this.f40455b;
        switch (i10) {
            case 0:
                if (ap0Var.getParentActivity() != null) {
                    ap0Var.G0(null);
                    return;
                }
                return;
            case 1:
                ap0 ap0Var2 = new ap0(ap0Var.f34012b1, ap0Var.C0, ap0Var.N0, ap0Var.O0, 0, ap0Var.E0, ap0Var.G0, ap0Var.H0, null, ap0Var.f34044x0, ap0Var.I0, ap0Var.U0, null, ap0Var.f34035r0, ap0Var.W0);
                ap0Var2.f34015c1 = ap0Var.f34015c1;
                ap0Var2.f34017d1 = ap0Var.f34017d1;
                ap0Var2.T = new fo0(ap0Var);
                ap0Var.presentFragment(ap0Var2);
                return;
            case 2:
                ap0 ap0Var3 = new ap0(ap0Var.f34012b1, ap0Var.C0, ap0Var.N0, ap0Var.O0, 0, ap0Var.E0, ap0Var.G0, ap0Var.H0, null, ap0Var.f34044x0, ap0Var.I0, ap0Var.U0, null, ap0Var.f34035r0, ap0Var.W0);
                ap0Var3.f34015c1 = ap0Var.f34015c1;
                ap0Var3.f34017d1 = ap0Var.f34017d1;
                ap0Var3.T = new go0(ap0Var);
                ap0Var.presentFragment(ap0Var3);
                return;
            case 3:
                ap0 ap0Var4 = new ap0(ap0Var.f34012b1, ap0Var.C0, ap0Var.N0, ap0Var.O0, 0, ap0Var.E0, ap0Var.G0, ap0Var.H0, null, ap0Var.f34044x0, ap0Var.I0, ap0Var.U0, null, ap0Var.f34035r0, ap0Var.W0);
                ap0Var4.f34015c1 = ap0Var.f34015c1;
                ap0Var4.f34017d1 = ap0Var.f34017d1;
                ap0Var4.T = new ho0(ap0Var);
                ap0Var.presentFragment(ap0Var4);
                return;
            case 4:
                ap0 ap0Var5 = new ap0(ap0Var.f34012b1, ap0Var.C0, ap0Var.N0, ap0Var.O0, 0, ap0Var.E0, ap0Var.G0, ap0Var.H0, null, ap0Var.f34044x0, ap0Var.I0, ap0Var.U0, null, ap0Var.f34035r0, ap0Var.W0);
                ap0Var5.f34015c1 = ap0Var.f34015c1;
                ap0Var5.f34017d1 = ap0Var.f34017d1;
                ap0Var5.T = new io0(ap0Var);
                ap0Var.presentFragment(ap0Var5);
                return;
            case 5:
                if (!ap0Var.P0) {
                    boolean z11 = !ap0Var.F;
                    ap0Var.F = z11;
                    ap0Var.V.setChecked(z11);
                    ap0Var.W.a(ap0Var.F, true);
                    return;
                }
                return;
            case 6:
                ap0.Z(ap0Var);
                return;
            case 7:
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ap0Var.getParentActivity());
                String string = LocaleController.getString(R.string.TurnPasswordOffQuestion);
                if (ap0Var.f34008a0.has_secure_values) {
                    string = org.telegram.messenger.g0.g(R.string.TurnPasswordOffPassport, t8.b.i(string, "\n\n"));
                }
                org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f19248a;
                a2Var.T = string;
                a2Var.R = LocaleController.getString(R.string.TurnPasswordOffQuestionTitle);
                alertDialog$Builder.k(LocaleController.getString(R.string.Disable), new yn0(ap0Var, 3));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                ap0Var.showDialog(a2Var);
                TextView textView = (TextView) a2Var.d(-1);
                if (textView != null) {
                    textView.setTextColor(ap0Var.getThemedColor(org.telegram.ui.ActionBar.g6.f19839q7));
                    return;
                }
                return;
            case 8:
                boolean z12 = !ap0Var.T0;
                ap0Var.T0 = z12;
                ap0Var.L.setChecked(z12);
                return;
            case 9:
                boolean z13 = !ap0Var.U0;
                ap0Var.U0 = z13;
                ap0Var.L.setChecked(z13);
                return;
            case 10:
                boolean z14 = !ap0Var.U0;
                ap0Var.U0 = z14;
                ap0Var.L.setChecked(z14);
                return;
            case 11:
                ap0Var.getClass();
                int intValue = ((Integer) view.getTag()).intValue();
                int i11 = 0;
                while (true) {
                    org.telegram.ui.Cells.k6[] k6VarArr = ap0Var.h;
                    if (i11 < k6VarArr.length) {
                        org.telegram.ui.Cells.k6 k6Var = k6VarArr[i11];
                        if (intValue == i11) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        k6Var.a(z10, true);
                        i11++;
                    } else {
                        return;
                    }
                }
            case 12:
                ap0Var.P.setClickable(false);
                try {
                    JSONObject put = new JSONObject().put("apiVersion", 2).put("apiVersionMinor", 0);
                    JSONObject p02 = ap0.p0();
                    if (ap0Var.K0 != null && ap0Var.M0 == null) {
                        p02.put("tokenizationSpecification", new no0(ap0Var, 1));
                    } else {
                        p02.put("tokenizationSpecification", new no0(ap0Var, 3));
                    }
                    put.put("allowedPaymentMethods", new JSONArray().put(p02));
                    JSONObject jSONObject = new JSONObject();
                    ArrayList arrayList = new ArrayList(ap0Var.C0.invoice.prices);
                    TLRPC.TL_shippingOption tL_shippingOption = ap0Var.G0;
                    if (tL_shippingOption != null) {
                        arrayList.addAll(tL_shippingOption.prices);
                    }
                    long j10 = 0;
                    for (int i12 = 0; i12 < arrayList.size(); i12++) {
                        j10 += ((TLRPC.TL_labeledPrice) arrayList.get(i12)).amount;
                    }
                    jSONObject.put("totalPrice", LocaleController.getInstance().formatCurrencyDecimalString(j10, ap0Var.C0.invoice.currency, false));
                    jSONObject.put("totalPriceStatus", "FINAL");
                    if (!TextUtils.isEmpty(ap0Var.L0)) {
                        jSONObject.put("countryCode", ap0Var.L0);
                    }
                    jSONObject.put("currencyCode", ap0Var.C0.invoice.currency);
                    jSONObject.put("checkoutOption", "COMPLETE_IMMEDIATE_PURCHASE");
                    put.put("transactionInfo", jSONObject);
                    put.put("merchantInfo", new JSONObject().put("merchantName", ap0Var.f34032p0));
                    String jSONObject2 = put.toString();
                    ?? obj = new Object();
                    obj.f46900r = true;
                    n6.l.i(jSONObject2, "paymentDataRequestJson cannot be null!");
                    obj.f46901s = jSONObject2;
                    com.google.android.gms.internal.clearcut.u0 u0Var = ap0Var.e;
                    u0Var.getClass();
                    com.google.android.gms.common.api.internal.v b10 = com.google.android.gms.common.api.internal.w.b();
                    b10.f5049c = new m.h((Object) obj, 22);
                    b10.d = new k6.c[]{v8.p.f46912b};
                    b10.f5048b = true;
                    b10.f5047a = 23707;
                    v8.a.a(u0Var.e(1, b10.a()), ap0Var.getParentActivity());
                    return;
                } catch (JSONException e) {
                    FileLog.e(e);
                    return;
                }
            case 13:
                ap0Var.f34040v0 = false;
                ap0Var.t0();
                return;
            default:
                ap0Var.f34020f[0].requestFocus();
                AndroidUtilities.showKeyboard(ap0Var.f34020f[0]);
                return;
        }
    }
}
