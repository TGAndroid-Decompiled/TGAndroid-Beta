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
public final class qn0 implements View.OnClickListener {
    public final int f36106a;
    public final wo0 f36107b;

    public qn0(wo0 wo0Var, int i10) {
        this.f36106a = i10;
        this.f36107b = wo0Var;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        int i10 = this.f36106a;
        wo0 wo0Var = this.f36107b;
        switch (i10) {
            case 0:
                if (wo0Var.getParentActivity() != null) {
                    wo0Var.G0(null);
                    return;
                }
                return;
            case 1:
                wo0 wo0Var2 = new wo0(wo0Var.f38259b1, wo0Var.C0, wo0Var.N0, wo0Var.O0, 0, wo0Var.E0, wo0Var.G0, wo0Var.H0, null, wo0Var.f38291x0, wo0Var.I0, wo0Var.U0, null, wo0Var.f38282r0, wo0Var.W0);
                wo0Var2.f38262c1 = wo0Var.f38262c1;
                wo0Var2.f38264d1 = wo0Var.f38264d1;
                wo0Var2.T = new bo0(wo0Var);
                wo0Var.presentFragment(wo0Var2);
                return;
            case 2:
                wo0 wo0Var3 = new wo0(wo0Var.f38259b1, wo0Var.C0, wo0Var.N0, wo0Var.O0, 0, wo0Var.E0, wo0Var.G0, wo0Var.H0, null, wo0Var.f38291x0, wo0Var.I0, wo0Var.U0, null, wo0Var.f38282r0, wo0Var.W0);
                wo0Var3.f38262c1 = wo0Var.f38262c1;
                wo0Var3.f38264d1 = wo0Var.f38264d1;
                wo0Var3.T = new co0(wo0Var);
                wo0Var.presentFragment(wo0Var3);
                return;
            case 3:
                wo0 wo0Var4 = new wo0(wo0Var.f38259b1, wo0Var.C0, wo0Var.N0, wo0Var.O0, 0, wo0Var.E0, wo0Var.G0, wo0Var.H0, null, wo0Var.f38291x0, wo0Var.I0, wo0Var.U0, null, wo0Var.f38282r0, wo0Var.W0);
                wo0Var4.f38262c1 = wo0Var.f38262c1;
                wo0Var4.f38264d1 = wo0Var.f38264d1;
                wo0Var4.T = new do0(wo0Var);
                wo0Var.presentFragment(wo0Var4);
                return;
            case 4:
                wo0 wo0Var5 = new wo0(wo0Var.f38259b1, wo0Var.C0, wo0Var.N0, wo0Var.O0, 0, wo0Var.E0, wo0Var.G0, wo0Var.H0, null, wo0Var.f38291x0, wo0Var.I0, wo0Var.U0, null, wo0Var.f38282r0, wo0Var.W0);
                wo0Var5.f38262c1 = wo0Var.f38262c1;
                wo0Var5.f38264d1 = wo0Var.f38264d1;
                wo0Var5.T = new eo0(wo0Var);
                wo0Var.presentFragment(wo0Var5);
                return;
            case 5:
                if (!wo0Var.P0) {
                    boolean z11 = !wo0Var.F;
                    wo0Var.F = z11;
                    wo0Var.V.setChecked(z11);
                    wo0Var.W.a(wo0Var.F, true);
                    return;
                }
                return;
            case 6:
                wo0.Z(wo0Var);
                return;
            case 7:
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wo0Var.getParentActivity());
                String string = LocaleController.getString(R.string.TurnPasswordOffQuestion);
                if (wo0Var.f38255a0.has_secure_values) {
                    string = org.telegram.messenger.a2.h(R.string.TurnPasswordOffPassport, w.f.g(string, "\n\n"));
                }
                org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f17528a;
                d2Var.T = string;
                d2Var.R = LocaleController.getString(R.string.TurnPasswordOffQuestionTitle);
                alertDialog$Builder.k(LocaleController.getString(R.string.Disable), new un0(wo0Var, 3));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                wo0Var.showDialog(d2Var);
                TextView textView = (TextView) d2Var.d(-1);
                if (textView != null) {
                    textView.setTextColor(wo0Var.getThemedColor(org.telegram.ui.ActionBar.j6.f18162q7));
                    return;
                }
                return;
            case 8:
                boolean z12 = !wo0Var.T0;
                wo0Var.T0 = z12;
                wo0Var.L.setChecked(z12);
                return;
            case 9:
                boolean z13 = !wo0Var.U0;
                wo0Var.U0 = z13;
                wo0Var.L.setChecked(z13);
                return;
            case 10:
                boolean z14 = !wo0Var.U0;
                wo0Var.U0 = z14;
                wo0Var.L.setChecked(z14);
                return;
            case 11:
                wo0Var.getClass();
                int intValue = ((Integer) view.getTag()).intValue();
                int i11 = 0;
                while (true) {
                    org.telegram.ui.Cells.l6[] l6VarArr = wo0Var.h;
                    if (i11 < l6VarArr.length) {
                        org.telegram.ui.Cells.l6 l6Var = l6VarArr[i11];
                        if (intValue == i11) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        l6Var.a(z10, true);
                        i11++;
                    } else {
                        return;
                    }
                }
            case 12:
                wo0Var.P.setClickable(false);
                try {
                    JSONObject put = new JSONObject().put("apiVersion", 2).put("apiVersionMinor", 0);
                    JSONObject p02 = wo0.p0();
                    if (wo0Var.K0 != null && wo0Var.M0 == null) {
                        p02.put("tokenizationSpecification", new jo0(wo0Var, 1));
                    } else {
                        p02.put("tokenizationSpecification", new jo0(wo0Var, 3));
                    }
                    put.put("allowedPaymentMethods", new JSONArray().put(p02));
                    JSONObject jSONObject = new JSONObject();
                    ArrayList arrayList = new ArrayList(wo0Var.C0.invoice.prices);
                    TLRPC.TL_shippingOption tL_shippingOption = wo0Var.G0;
                    if (tL_shippingOption != null) {
                        arrayList.addAll(tL_shippingOption.prices);
                    }
                    long j3 = 0;
                    for (int i12 = 0; i12 < arrayList.size(); i12++) {
                        j3 += ((TLRPC.TL_labeledPrice) arrayList.get(i12)).amount;
                    }
                    jSONObject.put("totalPrice", LocaleController.getInstance().formatCurrencyDecimalString(j3, wo0Var.C0.invoice.currency, false));
                    jSONObject.put("totalPriceStatus", "FINAL");
                    if (!TextUtils.isEmpty(wo0Var.L0)) {
                        jSONObject.put("countryCode", wo0Var.L0);
                    }
                    jSONObject.put("currencyCode", wo0Var.C0.invoice.currency);
                    jSONObject.put("checkoutOption", "COMPLETE_IMMEDIATE_PURCHASE");
                    put.put("transactionInfo", jSONObject);
                    put.put("merchantInfo", new JSONObject().put("merchantName", wo0Var.f38279p0));
                    String jSONObject2 = put.toString();
                    ?? obj = new Object();
                    obj.f43263r = true;
                    n6.l.i(jSONObject2, "paymentDataRequestJson cannot be null!");
                    obj.f43264s = jSONObject2;
                    com.google.android.gms.internal.clearcut.v0 v0Var = wo0Var.e;
                    v0Var.getClass();
                    com.google.android.gms.common.api.internal.v e = com.google.android.gms.common.api.internal.w.e();
                    e.f4957c = new o0.b(obj);
                    e.d = new k6.c[]{v8.p.f43275b};
                    e.f4956b = true;
                    e.f4955a = 23707;
                    v8.a.a(v0Var.e(1, e.a()), wo0Var.getParentActivity());
                    return;
                } catch (JSONException e7) {
                    FileLog.e(e7);
                    return;
                }
            case 13:
                wo0Var.f38287v0 = false;
                wo0Var.t0();
                return;
            default:
                wo0Var.f38267f[0].requestFocus();
                AndroidUtilities.showKeyboard(wo0Var.f38267f[0]);
                return;
        }
    }
}
