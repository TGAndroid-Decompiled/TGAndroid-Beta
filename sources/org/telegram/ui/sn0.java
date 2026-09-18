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
public final class sn0 implements View.OnClickListener {
    public final int f37535a;
    public final yo0 f37536b;

    public sn0(yo0 yo0Var, int i10) {
        this.f37535a = i10;
        this.f37536b = yo0Var;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        int i10 = this.f37535a;
        yo0 yo0Var = this.f37536b;
        switch (i10) {
            case 0:
                if (yo0Var.getParentActivity() != null) {
                    yo0Var.G0(null);
                    return;
                }
                return;
            case 1:
                yo0 yo0Var2 = new yo0(yo0Var.f39954b1, yo0Var.C0, yo0Var.N0, yo0Var.O0, 0, yo0Var.E0, yo0Var.G0, yo0Var.H0, null, yo0Var.f39986x0, yo0Var.I0, yo0Var.U0, null, yo0Var.f39977r0, yo0Var.W0);
                yo0Var2.f39957c1 = yo0Var.f39957c1;
                yo0Var2.f39959d1 = yo0Var.f39959d1;
                yo0Var2.T = new do0(yo0Var);
                yo0Var.presentFragment(yo0Var2);
                return;
            case 2:
                yo0 yo0Var3 = new yo0(yo0Var.f39954b1, yo0Var.C0, yo0Var.N0, yo0Var.O0, 0, yo0Var.E0, yo0Var.G0, yo0Var.H0, null, yo0Var.f39986x0, yo0Var.I0, yo0Var.U0, null, yo0Var.f39977r0, yo0Var.W0);
                yo0Var3.f39957c1 = yo0Var.f39957c1;
                yo0Var3.f39959d1 = yo0Var.f39959d1;
                yo0Var3.T = new eo0(yo0Var);
                yo0Var.presentFragment(yo0Var3);
                return;
            case 3:
                yo0 yo0Var4 = new yo0(yo0Var.f39954b1, yo0Var.C0, yo0Var.N0, yo0Var.O0, 0, yo0Var.E0, yo0Var.G0, yo0Var.H0, null, yo0Var.f39986x0, yo0Var.I0, yo0Var.U0, null, yo0Var.f39977r0, yo0Var.W0);
                yo0Var4.f39957c1 = yo0Var.f39957c1;
                yo0Var4.f39959d1 = yo0Var.f39959d1;
                yo0Var4.T = new fo0(yo0Var);
                yo0Var.presentFragment(yo0Var4);
                return;
            case 4:
                yo0 yo0Var5 = new yo0(yo0Var.f39954b1, yo0Var.C0, yo0Var.N0, yo0Var.O0, 0, yo0Var.E0, yo0Var.G0, yo0Var.H0, null, yo0Var.f39986x0, yo0Var.I0, yo0Var.U0, null, yo0Var.f39977r0, yo0Var.W0);
                yo0Var5.f39957c1 = yo0Var.f39957c1;
                yo0Var5.f39959d1 = yo0Var.f39959d1;
                yo0Var5.T = new go0(yo0Var);
                yo0Var.presentFragment(yo0Var5);
                return;
            case 5:
                if (!yo0Var.P0) {
                    boolean z11 = !yo0Var.F;
                    yo0Var.F = z11;
                    yo0Var.V.setChecked(z11);
                    yo0Var.W.a(yo0Var.F, true);
                    return;
                }
                return;
            case 6:
                yo0.Z(yo0Var);
                return;
            case 7:
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(yo0Var.getParentActivity());
                String string = LocaleController.getString(R.string.TurnPasswordOffQuestion);
                if (yo0Var.f39950a0.has_secure_values) {
                    string = org.telegram.messenger.w1.h(R.string.TurnPasswordOffPassport, w.f.g(string, "\n\n"));
                }
                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f18447a;
                c2Var.T = string;
                c2Var.R = LocaleController.getString(R.string.TurnPasswordOffQuestionTitle);
                alertDialog$Builder.k(LocaleController.getString(R.string.Disable), new wn0(yo0Var, 3));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                yo0Var.showDialog(c2Var);
                TextView textView = (TextView) c2Var.d(-1);
                if (textView != null) {
                    textView.setTextColor(yo0Var.getThemedColor(org.telegram.ui.ActionBar.j6.f19101q7));
                    return;
                }
                return;
            case 8:
                boolean z12 = !yo0Var.T0;
                yo0Var.T0 = z12;
                yo0Var.L.setChecked(z12);
                return;
            case 9:
                boolean z13 = !yo0Var.U0;
                yo0Var.U0 = z13;
                yo0Var.L.setChecked(z13);
                return;
            case 10:
                boolean z14 = !yo0Var.U0;
                yo0Var.U0 = z14;
                yo0Var.L.setChecked(z14);
                return;
            case 11:
                yo0Var.getClass();
                int intValue = ((Integer) view.getTag()).intValue();
                int i11 = 0;
                while (true) {
                    org.telegram.ui.Cells.j6[] j6VarArr = yo0Var.h;
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
                yo0Var.P.setClickable(false);
                try {
                    JSONObject put = new JSONObject().put("apiVersion", 2).put("apiVersionMinor", 0);
                    JSONObject p02 = yo0.p0();
                    if (yo0Var.K0 != null && yo0Var.M0 == null) {
                        p02.put("tokenizationSpecification", new lo0(yo0Var, 1));
                    } else {
                        p02.put("tokenizationSpecification", new lo0(yo0Var, 3));
                    }
                    put.put("allowedPaymentMethods", new JSONArray().put(p02));
                    JSONObject jSONObject = new JSONObject();
                    ArrayList arrayList = new ArrayList(yo0Var.C0.invoice.prices);
                    TLRPC.TL_shippingOption tL_shippingOption = yo0Var.G0;
                    if (tL_shippingOption != null) {
                        arrayList.addAll(tL_shippingOption.prices);
                    }
                    long j3 = 0;
                    for (int i12 = 0; i12 < arrayList.size(); i12++) {
                        j3 += ((TLRPC.TL_labeledPrice) arrayList.get(i12)).amount;
                    }
                    jSONObject.put("totalPrice", LocaleController.getInstance().formatCurrencyDecimalString(j3, yo0Var.C0.invoice.currency, false));
                    jSONObject.put("totalPriceStatus", "FINAL");
                    if (!TextUtils.isEmpty(yo0Var.L0)) {
                        jSONObject.put("countryCode", yo0Var.L0);
                    }
                    jSONObject.put("currencyCode", yo0Var.C0.invoice.currency);
                    jSONObject.put("checkoutOption", "COMPLETE_IMMEDIATE_PURCHASE");
                    put.put("transactionInfo", jSONObject);
                    put.put("merchantInfo", new JSONObject().put("merchantName", yo0Var.f39974p0));
                    String jSONObject2 = put.toString();
                    ?? obj = new Object();
                    obj.f44271r = true;
                    n6.l.i(jSONObject2, "paymentDataRequestJson cannot be null!");
                    obj.f44272s = jSONObject2;
                    com.google.android.gms.internal.clearcut.v0 v0Var = yo0Var.e;
                    v0Var.getClass();
                    com.google.android.gms.common.api.internal.v e = com.google.android.gms.common.api.internal.w.e();
                    e.f6183c = new org.telegram.ui.Cells.ia((Object) obj, 18);
                    e.d = new k6.c[]{v8.p.f44283b};
                    e.f6182b = true;
                    e.f6181a = 23707;
                    v8.a.a(v0Var.e(1, e.a()), yo0Var.getParentActivity());
                    return;
                } catch (JSONException e7) {
                    FileLog.e(e7);
                    return;
                }
            case 13:
                yo0Var.f39982v0 = false;
                yo0Var.t0();
                return;
            default:
                yo0Var.f39962f[0].requestFocus();
                AndroidUtilities.showKeyboard(yo0Var.f39962f[0]);
                return;
        }
    }
}
