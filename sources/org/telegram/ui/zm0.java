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
public final class zm0 implements View.OnClickListener {
    public final int f43762a;
    public final go0 f43763b;

    public zm0(go0 go0Var, int i10) {
        this.f43762a = i10;
        this.f43763b = go0Var;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        int i10 = this.f43762a;
        go0 go0Var = this.f43763b;
        switch (i10) {
            case 0:
                if (go0Var.getParentActivity() != null) {
                    go0Var.G0(null);
                    return;
                }
                return;
            case 1:
                go0 go0Var2 = new go0(go0Var.f37220b1, go0Var.C0, go0Var.N0, go0Var.O0, 0, go0Var.E0, go0Var.G0, go0Var.H0, null, go0Var.f37252x0, go0Var.I0, go0Var.U0, null, go0Var.f37243r0, go0Var.W0);
                go0Var2.f37223c1 = go0Var.f37223c1;
                go0Var2.f37225d1 = go0Var.f37225d1;
                go0Var2.T = new ln0(go0Var);
                go0Var.presentFragment(go0Var2);
                return;
            case 2:
                go0 go0Var3 = new go0(go0Var.f37220b1, go0Var.C0, go0Var.N0, go0Var.O0, 0, go0Var.E0, go0Var.G0, go0Var.H0, null, go0Var.f37252x0, go0Var.I0, go0Var.U0, null, go0Var.f37243r0, go0Var.W0);
                go0Var3.f37223c1 = go0Var.f37223c1;
                go0Var3.f37225d1 = go0Var.f37225d1;
                go0Var3.T = new mn0(go0Var);
                go0Var.presentFragment(go0Var3);
                return;
            case 3:
                go0 go0Var4 = new go0(go0Var.f37220b1, go0Var.C0, go0Var.N0, go0Var.O0, 0, go0Var.E0, go0Var.G0, go0Var.H0, null, go0Var.f37252x0, go0Var.I0, go0Var.U0, null, go0Var.f37243r0, go0Var.W0);
                go0Var4.f37223c1 = go0Var.f37223c1;
                go0Var4.f37225d1 = go0Var.f37225d1;
                go0Var4.T = new nn0(go0Var);
                go0Var.presentFragment(go0Var4);
                return;
            case 4:
                go0 go0Var5 = new go0(go0Var.f37220b1, go0Var.C0, go0Var.N0, go0Var.O0, 0, go0Var.E0, go0Var.G0, go0Var.H0, null, go0Var.f37252x0, go0Var.I0, go0Var.U0, null, go0Var.f37243r0, go0Var.W0);
                go0Var5.f37223c1 = go0Var.f37223c1;
                go0Var5.f37225d1 = go0Var.f37225d1;
                go0Var5.T = new on0(go0Var);
                go0Var.presentFragment(go0Var5);
                return;
            case 5:
                if (!go0Var.P0) {
                    boolean z11 = !go0Var.F;
                    go0Var.F = z11;
                    go0Var.V.setChecked(z11);
                    go0Var.W.a(go0Var.F, true);
                    return;
                }
                return;
            case 6:
                go0.Z(go0Var);
                return;
            case 7:
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(go0Var.getParentActivity());
                String string = LocaleController.getString(R.string.TurnPasswordOffQuestion);
                if (go0Var.f37216a0.has_secure_values) {
                    string = org.telegram.messenger.g0.g(R.string.TurnPasswordOffPassport, r4.c.i(string, "\n\n"));
                }
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20601a;
                b2Var.T = string;
                b2Var.R = LocaleController.getString(R.string.TurnPasswordOffQuestionTitle);
                alertDialog$Builder.k(LocaleController.getString(R.string.Disable), new dn0(go0Var, 3));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                go0Var.showDialog(b2Var);
                TextView textView = (TextView) b2Var.d(-1);
                if (textView != null) {
                    textView.setTextColor(go0Var.getThemedColor(org.telegram.ui.ActionBar.h6.f21224q7));
                    return;
                }
                return;
            case 8:
                boolean z12 = !go0Var.T0;
                go0Var.T0 = z12;
                go0Var.L.setChecked(z12);
                return;
            case 9:
                boolean z13 = !go0Var.U0;
                go0Var.U0 = z13;
                go0Var.L.setChecked(z13);
                return;
            case 10:
                boolean z14 = !go0Var.U0;
                go0Var.U0 = z14;
                go0Var.L.setChecked(z14);
                return;
            case 11:
                go0Var.getClass();
                int intValue = ((Integer) view.getTag()).intValue();
                int i11 = 0;
                while (true) {
                    org.telegram.ui.Cells.j6[] j6VarArr = go0Var.h;
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
                go0Var.P.setClickable(false);
                try {
                    JSONObject put = new JSONObject().put("apiVersion", 2).put("apiVersionMinor", 0);
                    JSONObject p02 = go0.p0();
                    if (go0Var.K0 != null && go0Var.M0 == null) {
                        p02.put("tokenizationSpecification", new tn0(go0Var, 1));
                    } else {
                        p02.put("tokenizationSpecification", new tn0(go0Var, 3));
                    }
                    put.put("allowedPaymentMethods", new JSONArray().put(p02));
                    JSONObject jSONObject = new JSONObject();
                    ArrayList arrayList = new ArrayList(go0Var.C0.invoice.prices);
                    TLRPC.TL_shippingOption tL_shippingOption = go0Var.G0;
                    if (tL_shippingOption != null) {
                        arrayList.addAll(tL_shippingOption.prices);
                    }
                    long j10 = 0;
                    for (int i12 = 0; i12 < arrayList.size(); i12++) {
                        j10 += ((TLRPC.TL_labeledPrice) arrayList.get(i12)).amount;
                    }
                    jSONObject.put("totalPrice", LocaleController.getInstance().formatCurrencyDecimalString(j10, go0Var.C0.invoice.currency, false));
                    jSONObject.put("totalPriceStatus", "FINAL");
                    if (!TextUtils.isEmpty(go0Var.L0)) {
                        jSONObject.put("countryCode", go0Var.L0);
                    }
                    jSONObject.put("currencyCode", go0Var.C0.invoice.currency);
                    jSONObject.put("checkoutOption", "COMPLETE_IMMEDIATE_PURCHASE");
                    put.put("transactionInfo", jSONObject);
                    put.put("merchantInfo", new JSONObject().put("merchantName", go0Var.f37240p0));
                    String jSONObject2 = put.toString();
                    ?? obj = new Object();
                    obj.f48285r = true;
                    n6.l.i(jSONObject2, "paymentDataRequestJson cannot be null!");
                    obj.f48286s = jSONObject2;
                    com.google.android.gms.internal.clearcut.v0 v0Var = go0Var.e;
                    v0Var.getClass();
                    com.google.android.gms.common.api.internal.u b10 = com.google.android.gms.common.api.internal.v.b();
                    b10.f6498c = new l2.f(obj, 24);
                    b10.d = new k6.c[]{v8.p.f48297b};
                    b10.f6497b = true;
                    b10.f6496a = 23707;
                    v8.a.a(v0Var.e(1, b10.a()), go0Var.getParentActivity());
                    return;
                } catch (JSONException e) {
                    FileLog.e(e);
                    return;
                }
            case 13:
                go0Var.f37248v0 = false;
                go0Var.t0();
                return;
            default:
                go0Var.f37228f[0].requestFocus();
                AndroidUtilities.showKeyboard(go0Var.f37228f[0]);
                return;
        }
    }
}
