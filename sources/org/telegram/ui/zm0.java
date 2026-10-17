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
    public final int f43776a;
    public final fo0 f43777b;

    public zm0(fo0 fo0Var, int i10) {
        this.f43776a = i10;
        this.f43777b = fo0Var;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        int i10 = this.f43776a;
        fo0 fo0Var = this.f43777b;
        switch (i10) {
            case 0:
                if (fo0Var.getParentActivity() != null) {
                    fo0Var.G0(null);
                    return;
                }
                return;
            case 1:
                fo0 fo0Var2 = new fo0(fo0Var.f36975b1, fo0Var.C0, fo0Var.N0, fo0Var.O0, 0, fo0Var.E0, fo0Var.G0, fo0Var.H0, null, fo0Var.f37007x0, fo0Var.I0, fo0Var.U0, null, fo0Var.f36998r0, fo0Var.W0);
                fo0Var2.f36978c1 = fo0Var.f36978c1;
                fo0Var2.f36980d1 = fo0Var.f36980d1;
                fo0Var2.T = new kn0(fo0Var);
                fo0Var.presentFragment(fo0Var2);
                return;
            case 2:
                fo0 fo0Var3 = new fo0(fo0Var.f36975b1, fo0Var.C0, fo0Var.N0, fo0Var.O0, 0, fo0Var.E0, fo0Var.G0, fo0Var.H0, null, fo0Var.f37007x0, fo0Var.I0, fo0Var.U0, null, fo0Var.f36998r0, fo0Var.W0);
                fo0Var3.f36978c1 = fo0Var.f36978c1;
                fo0Var3.f36980d1 = fo0Var.f36980d1;
                fo0Var3.T = new ln0(fo0Var);
                fo0Var.presentFragment(fo0Var3);
                return;
            case 3:
                fo0 fo0Var4 = new fo0(fo0Var.f36975b1, fo0Var.C0, fo0Var.N0, fo0Var.O0, 0, fo0Var.E0, fo0Var.G0, fo0Var.H0, null, fo0Var.f37007x0, fo0Var.I0, fo0Var.U0, null, fo0Var.f36998r0, fo0Var.W0);
                fo0Var4.f36978c1 = fo0Var.f36978c1;
                fo0Var4.f36980d1 = fo0Var.f36980d1;
                fo0Var4.T = new mn0(fo0Var);
                fo0Var.presentFragment(fo0Var4);
                return;
            case 4:
                fo0 fo0Var5 = new fo0(fo0Var.f36975b1, fo0Var.C0, fo0Var.N0, fo0Var.O0, 0, fo0Var.E0, fo0Var.G0, fo0Var.H0, null, fo0Var.f37007x0, fo0Var.I0, fo0Var.U0, null, fo0Var.f36998r0, fo0Var.W0);
                fo0Var5.f36978c1 = fo0Var.f36978c1;
                fo0Var5.f36980d1 = fo0Var.f36980d1;
                fo0Var5.T = new nn0(fo0Var);
                fo0Var.presentFragment(fo0Var5);
                return;
            case 5:
                if (!fo0Var.P0) {
                    boolean z11 = !fo0Var.F;
                    fo0Var.F = z11;
                    fo0Var.V.setChecked(z11);
                    fo0Var.W.a(fo0Var.F, true);
                    return;
                }
                return;
            case 6:
                fo0.Z(fo0Var);
                return;
            case 7:
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(fo0Var.getParentActivity());
                String string = LocaleController.getString(R.string.TurnPasswordOffQuestion);
                if (fo0Var.f36971a0.has_secure_values) {
                    string = org.telegram.messenger.q.g(R.string.TurnPasswordOffPassport, r.c.i(string, "\n\n"));
                }
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20601a;
                b2Var.T = string;
                b2Var.R = LocaleController.getString(R.string.TurnPasswordOffQuestionTitle);
                alertDialog$Builder.k(LocaleController.getString(R.string.Disable), new dn0(fo0Var, 3));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                fo0Var.showDialog(b2Var);
                TextView textView = (TextView) b2Var.d(-1);
                if (textView != null) {
                    textView.setTextColor(fo0Var.getThemedColor(org.telegram.ui.ActionBar.h6.f21224q7));
                    return;
                }
                return;
            case 8:
                boolean z12 = !fo0Var.T0;
                fo0Var.T0 = z12;
                fo0Var.L.setChecked(z12);
                return;
            case 9:
                boolean z13 = !fo0Var.U0;
                fo0Var.U0 = z13;
                fo0Var.L.setChecked(z13);
                return;
            case 10:
                boolean z14 = !fo0Var.U0;
                fo0Var.U0 = z14;
                fo0Var.L.setChecked(z14);
                return;
            case 11:
                fo0Var.getClass();
                int intValue = ((Integer) view.getTag()).intValue();
                int i11 = 0;
                while (true) {
                    org.telegram.ui.Cells.j6[] j6VarArr = fo0Var.h;
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
                fo0Var.P.setClickable(false);
                try {
                    JSONObject put = new JSONObject().put("apiVersion", 2).put("apiVersionMinor", 0);
                    JSONObject p02 = fo0.p0();
                    if (fo0Var.K0 != null && fo0Var.M0 == null) {
                        p02.put("tokenizationSpecification", new sn0(fo0Var, 1));
                    } else {
                        p02.put("tokenizationSpecification", new sn0(fo0Var, 3));
                    }
                    put.put("allowedPaymentMethods", new JSONArray().put(p02));
                    JSONObject jSONObject = new JSONObject();
                    ArrayList arrayList = new ArrayList(fo0Var.C0.invoice.prices);
                    TLRPC.TL_shippingOption tL_shippingOption = fo0Var.G0;
                    if (tL_shippingOption != null) {
                        arrayList.addAll(tL_shippingOption.prices);
                    }
                    long j10 = 0;
                    for (int i12 = 0; i12 < arrayList.size(); i12++) {
                        j10 += ((TLRPC.TL_labeledPrice) arrayList.get(i12)).amount;
                    }
                    jSONObject.put("totalPrice", LocaleController.getInstance().formatCurrencyDecimalString(j10, fo0Var.C0.invoice.currency, false));
                    jSONObject.put("totalPriceStatus", "FINAL");
                    if (!TextUtils.isEmpty(fo0Var.L0)) {
                        jSONObject.put("countryCode", fo0Var.L0);
                    }
                    jSONObject.put("currencyCode", fo0Var.C0.invoice.currency);
                    jSONObject.put("checkoutOption", "COMPLETE_IMMEDIATE_PURCHASE");
                    put.put("transactionInfo", jSONObject);
                    put.put("merchantInfo", new JSONObject().put("merchantName", fo0Var.f36995p0));
                    String jSONObject2 = put.toString();
                    ?? obj = new Object();
                    obj.f48307r = true;
                    n6.l.i(jSONObject2, "paymentDataRequestJson cannot be null!");
                    obj.f48308s = jSONObject2;
                    com.google.android.gms.internal.clearcut.v0 v0Var = fo0Var.e;
                    v0Var.getClass();
                    com.google.android.gms.common.api.internal.u b10 = com.google.android.gms.common.api.internal.v.b();
                    b10.f6499c = new l2.f(obj, 24);
                    b10.d = new k6.c[]{v8.p.f48319b};
                    b10.f6498b = true;
                    b10.f6497a = 23707;
                    v8.a.a(v0Var.e(1, b10.a()), fo0Var.getParentActivity());
                    return;
                } catch (JSONException e) {
                    FileLog.e(e);
                    return;
                }
            case 13:
                fo0Var.f37003v0 = false;
                fo0Var.t0();
                return;
            default:
                fo0Var.f36983f[0].requestFocus();
                AndroidUtilities.showKeyboard(fo0Var.f36983f[0]);
                return;
        }
    }
}
