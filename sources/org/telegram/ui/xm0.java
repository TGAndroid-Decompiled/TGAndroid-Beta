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
public final class xm0 implements View.OnClickListener {
    public final int f43237a;
    public final eo0 f43238b;

    public xm0(eo0 eo0Var, int i10) {
        this.f43237a = i10;
        this.f43238b = eo0Var;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        int i10 = this.f43237a;
        eo0 eo0Var = this.f43238b;
        switch (i10) {
            case 0:
                if (eo0Var.getParentActivity() != null) {
                    eo0Var.G0(null);
                    return;
                }
                return;
            case 1:
                eo0 eo0Var2 = new eo0(eo0Var.f36703b1, eo0Var.C0, eo0Var.N0, eo0Var.O0, 0, eo0Var.E0, eo0Var.G0, eo0Var.H0, null, eo0Var.f36735x0, eo0Var.I0, eo0Var.U0, null, eo0Var.f36726r0, eo0Var.W0);
                eo0Var2.f36706c1 = eo0Var.f36706c1;
                eo0Var2.f36708d1 = eo0Var.f36708d1;
                eo0Var2.T = new jn0(eo0Var);
                eo0Var.presentFragment(eo0Var2);
                return;
            case 2:
                eo0 eo0Var3 = new eo0(eo0Var.f36703b1, eo0Var.C0, eo0Var.N0, eo0Var.O0, 0, eo0Var.E0, eo0Var.G0, eo0Var.H0, null, eo0Var.f36735x0, eo0Var.I0, eo0Var.U0, null, eo0Var.f36726r0, eo0Var.W0);
                eo0Var3.f36706c1 = eo0Var.f36706c1;
                eo0Var3.f36708d1 = eo0Var.f36708d1;
                eo0Var3.T = new kn0(eo0Var);
                eo0Var.presentFragment(eo0Var3);
                return;
            case 3:
                eo0 eo0Var4 = new eo0(eo0Var.f36703b1, eo0Var.C0, eo0Var.N0, eo0Var.O0, 0, eo0Var.E0, eo0Var.G0, eo0Var.H0, null, eo0Var.f36735x0, eo0Var.I0, eo0Var.U0, null, eo0Var.f36726r0, eo0Var.W0);
                eo0Var4.f36706c1 = eo0Var.f36706c1;
                eo0Var4.f36708d1 = eo0Var.f36708d1;
                eo0Var4.T = new ln0(eo0Var);
                eo0Var.presentFragment(eo0Var4);
                return;
            case 4:
                eo0 eo0Var5 = new eo0(eo0Var.f36703b1, eo0Var.C0, eo0Var.N0, eo0Var.O0, 0, eo0Var.E0, eo0Var.G0, eo0Var.H0, null, eo0Var.f36735x0, eo0Var.I0, eo0Var.U0, null, eo0Var.f36726r0, eo0Var.W0);
                eo0Var5.f36706c1 = eo0Var.f36706c1;
                eo0Var5.f36708d1 = eo0Var.f36708d1;
                eo0Var5.T = new mn0(eo0Var);
                eo0Var.presentFragment(eo0Var5);
                return;
            case 5:
                if (!eo0Var.P0) {
                    boolean z11 = !eo0Var.F;
                    eo0Var.F = z11;
                    eo0Var.V.setChecked(z11);
                    eo0Var.W.a(eo0Var.F, true);
                    return;
                }
                return;
            case 6:
                eo0.Z(eo0Var);
                return;
            case 7:
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(eo0Var.getParentActivity());
                String string = LocaleController.getString(R.string.TurnPasswordOffQuestion);
                if (eo0Var.f36699a0.has_secure_values) {
                    string = org.telegram.messenger.g0.g(R.string.TurnPasswordOffPassport, r4.c.i(string, "\n\n"));
                }
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20604a;
                b2Var.T = string;
                b2Var.R = LocaleController.getString(R.string.TurnPasswordOffQuestionTitle);
                alertDialog$Builder.k(LocaleController.getString(R.string.Disable), new bn0(eo0Var, 3));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                eo0Var.showDialog(b2Var);
                TextView textView = (TextView) b2Var.d(-1);
                if (textView != null) {
                    textView.setTextColor(eo0Var.getThemedColor(org.telegram.ui.ActionBar.h6.f21227q7));
                    return;
                }
                return;
            case 8:
                boolean z12 = !eo0Var.T0;
                eo0Var.T0 = z12;
                eo0Var.L.setChecked(z12);
                return;
            case 9:
                boolean z13 = !eo0Var.U0;
                eo0Var.U0 = z13;
                eo0Var.L.setChecked(z13);
                return;
            case 10:
                boolean z14 = !eo0Var.U0;
                eo0Var.U0 = z14;
                eo0Var.L.setChecked(z14);
                return;
            case 11:
                eo0Var.getClass();
                int intValue = ((Integer) view.getTag()).intValue();
                int i11 = 0;
                while (true) {
                    org.telegram.ui.Cells.j6[] j6VarArr = eo0Var.h;
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
                eo0Var.P.setClickable(false);
                try {
                    JSONObject put = new JSONObject().put("apiVersion", 2).put("apiVersionMinor", 0);
                    JSONObject p02 = eo0.p0();
                    if (eo0Var.K0 != null && eo0Var.M0 == null) {
                        p02.put("tokenizationSpecification", new rn0(eo0Var, 1));
                    } else {
                        p02.put("tokenizationSpecification", new rn0(eo0Var, 3));
                    }
                    put.put("allowedPaymentMethods", new JSONArray().put(p02));
                    JSONObject jSONObject = new JSONObject();
                    ArrayList arrayList = new ArrayList(eo0Var.C0.invoice.prices);
                    TLRPC.TL_shippingOption tL_shippingOption = eo0Var.G0;
                    if (tL_shippingOption != null) {
                        arrayList.addAll(tL_shippingOption.prices);
                    }
                    long j10 = 0;
                    for (int i12 = 0; i12 < arrayList.size(); i12++) {
                        j10 += ((TLRPC.TL_labeledPrice) arrayList.get(i12)).amount;
                    }
                    jSONObject.put("totalPrice", LocaleController.getInstance().formatCurrencyDecimalString(j10, eo0Var.C0.invoice.currency, false));
                    jSONObject.put("totalPriceStatus", "FINAL");
                    if (!TextUtils.isEmpty(eo0Var.L0)) {
                        jSONObject.put("countryCode", eo0Var.L0);
                    }
                    jSONObject.put("currencyCode", eo0Var.C0.invoice.currency);
                    jSONObject.put("checkoutOption", "COMPLETE_IMMEDIATE_PURCHASE");
                    put.put("transactionInfo", jSONObject);
                    put.put("merchantInfo", new JSONObject().put("merchantName", eo0Var.f36723p0));
                    String jSONObject2 = put.toString();
                    ?? obj = new Object();
                    obj.f48285r = true;
                    n6.l.i(jSONObject2, "paymentDataRequestJson cannot be null!");
                    obj.f48286s = jSONObject2;
                    com.google.android.gms.internal.clearcut.v0 v0Var = eo0Var.e;
                    v0Var.getClass();
                    com.google.android.gms.common.api.internal.u b10 = com.google.android.gms.common.api.internal.v.b();
                    b10.f6499c = new k2.w0((Object) obj, 27);
                    b10.d = new k6.c[]{v8.p.f48297b};
                    b10.f6498b = true;
                    b10.f6497a = 23707;
                    v8.a.a(v0Var.e(1, b10.a()), eo0Var.getParentActivity());
                    return;
                } catch (JSONException e) {
                    FileLog.e(e);
                    return;
                }
            case 13:
                eo0Var.f36731v0 = false;
                eo0Var.t0();
                return;
            default:
                eo0Var.f36711f[0].requestFocus();
                AndroidUtilities.showKeyboard(eo0Var.f36711f[0]);
                return;
        }
    }
}
