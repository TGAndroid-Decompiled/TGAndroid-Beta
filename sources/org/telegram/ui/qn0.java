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
    public final int f36918a;
    public final wo0 f36919b;

    public qn0(wo0 wo0Var, int i10) {
        this.f36918a = i10;
        this.f36919b = wo0Var;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        int i10 = this.f36918a;
        wo0 wo0Var = this.f36919b;
        switch (i10) {
            case 0:
                if (wo0Var.getParentActivity() != null) {
                    wo0Var.G0(null);
                    return;
                }
                return;
            case 1:
                wo0 wo0Var2 = new wo0(wo0Var.f39311b1, wo0Var.C0, wo0Var.N0, wo0Var.O0, 0, wo0Var.E0, wo0Var.G0, wo0Var.H0, null, wo0Var.f39343x0, wo0Var.I0, wo0Var.U0, null, wo0Var.f39334r0, wo0Var.W0);
                wo0Var2.f39314c1 = wo0Var.f39314c1;
                wo0Var2.f39316d1 = wo0Var.f39316d1;
                wo0Var2.T = new bo0(wo0Var);
                wo0Var.presentFragment(wo0Var2);
                return;
            case 2:
                wo0 wo0Var3 = new wo0(wo0Var.f39311b1, wo0Var.C0, wo0Var.N0, wo0Var.O0, 0, wo0Var.E0, wo0Var.G0, wo0Var.H0, null, wo0Var.f39343x0, wo0Var.I0, wo0Var.U0, null, wo0Var.f39334r0, wo0Var.W0);
                wo0Var3.f39314c1 = wo0Var.f39314c1;
                wo0Var3.f39316d1 = wo0Var.f39316d1;
                wo0Var3.T = new co0(wo0Var);
                wo0Var.presentFragment(wo0Var3);
                return;
            case 3:
                wo0 wo0Var4 = new wo0(wo0Var.f39311b1, wo0Var.C0, wo0Var.N0, wo0Var.O0, 0, wo0Var.E0, wo0Var.G0, wo0Var.H0, null, wo0Var.f39343x0, wo0Var.I0, wo0Var.U0, null, wo0Var.f39334r0, wo0Var.W0);
                wo0Var4.f39314c1 = wo0Var.f39314c1;
                wo0Var4.f39316d1 = wo0Var.f39316d1;
                wo0Var4.T = new do0(wo0Var);
                wo0Var.presentFragment(wo0Var4);
                return;
            case 4:
                wo0 wo0Var5 = new wo0(wo0Var.f39311b1, wo0Var.C0, wo0Var.N0, wo0Var.O0, 0, wo0Var.E0, wo0Var.G0, wo0Var.H0, null, wo0Var.f39343x0, wo0Var.I0, wo0Var.U0, null, wo0Var.f39334r0, wo0Var.W0);
                wo0Var5.f39314c1 = wo0Var.f39314c1;
                wo0Var5.f39316d1 = wo0Var.f39316d1;
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
                if (wo0Var.f39307a0.has_secure_values) {
                    string = org.telegram.messenger.w1.h(R.string.TurnPasswordOffPassport, w.f.g(string, "\n\n"));
                }
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f18437a;
                b2Var.T = string;
                b2Var.R = LocaleController.getString(R.string.TurnPasswordOffQuestionTitle);
                alertDialog$Builder.k(LocaleController.getString(R.string.Disable), new un0(wo0Var, 3));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                wo0Var.showDialog(b2Var);
                TextView textView = (TextView) b2Var.d(-1);
                if (textView != null) {
                    textView.setTextColor(wo0Var.getThemedColor(org.telegram.ui.ActionBar.i6.f19074q7));
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
                    org.telegram.ui.Cells.j6[] j6VarArr = wo0Var.h;
                    if (i11 < j6VarArr.length) {
                        org.telegram.ui.Cells.j6 j6Var = j6VarArr[i11];
                        if (intValue == i11) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        j6Var.a(z10, true);
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
                    put.put("merchantInfo", new JSONObject().put("merchantName", wo0Var.f39331p0));
                    String jSONObject2 = put.toString();
                    ?? obj = new Object();
                    obj.f44243r = true;
                    n6.l.i(jSONObject2, "paymentDataRequestJson cannot be null!");
                    obj.f44244s = jSONObject2;
                    com.google.android.gms.internal.clearcut.v0 v0Var = wo0Var.e;
                    v0Var.getClass();
                    com.google.android.gms.common.api.internal.v e = com.google.android.gms.common.api.internal.w.e();
                    e.f6178c = new org.telegram.ui.Cells.ia((Object) obj, 18);
                    e.d = new k6.c[]{v8.p.f44255b};
                    e.f6177b = true;
                    e.f6176a = 23707;
                    v8.a.a(v0Var.e(1, e.a()), wo0Var.getParentActivity());
                    return;
                } catch (JSONException e7) {
                    FileLog.e(e7);
                    return;
                }
            case 13:
                wo0Var.f39339v0 = false;
                wo0Var.t0();
                return;
            default:
                wo0Var.f39319f[0].requestFocus();
                AndroidUtilities.showKeyboard(wo0Var.f39319f[0]);
                return;
        }
    }
}
