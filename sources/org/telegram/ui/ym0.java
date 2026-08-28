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
public final class ym0 implements View.OnClickListener {
    public final int f44909a;
    public final co0 f44910b;

    public ym0(co0 co0Var, int i9) {
        this.f44909a = i9;
        this.f44910b = co0Var;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        int i9 = this.f44909a;
        co0 co0Var = this.f44910b;
        switch (i9) {
            case 0:
                if (co0Var.getParentActivity() != null) {
                    co0Var.F0(null);
                    return;
                }
                return;
            case 1:
                co0 co0Var2 = new co0(co0Var.X0, co0Var.f37281y0, co0Var.J0, co0Var.K0, 0, co0Var.A0, co0Var.C0, co0Var.D0, null, co0Var.f37273t0, co0Var.E0, co0Var.Q0, null, co0Var.f37265n0, co0Var.S0);
                co0Var2.Y0 = co0Var.Y0;
                co0Var2.Z0 = co0Var.Z0;
                co0Var2.P = new in0(co0Var);
                co0Var.presentFragment(co0Var2);
                return;
            case 2:
                co0 co0Var3 = new co0(co0Var.X0, co0Var.f37281y0, co0Var.J0, co0Var.K0, 0, co0Var.A0, co0Var.C0, co0Var.D0, null, co0Var.f37273t0, co0Var.E0, co0Var.Q0, null, co0Var.f37265n0, co0Var.S0);
                co0Var3.Y0 = co0Var.Y0;
                co0Var3.Z0 = co0Var.Z0;
                co0Var3.P = new jn0(co0Var);
                co0Var.presentFragment(co0Var3);
                return;
            case 3:
                co0 co0Var4 = new co0(co0Var.X0, co0Var.f37281y0, co0Var.J0, co0Var.K0, 0, co0Var.A0, co0Var.C0, co0Var.D0, null, co0Var.f37273t0, co0Var.E0, co0Var.Q0, null, co0Var.f37265n0, co0Var.S0);
                co0Var4.Y0 = co0Var.Y0;
                co0Var4.Z0 = co0Var.Z0;
                co0Var4.P = new kn0(co0Var);
                co0Var.presentFragment(co0Var4);
                return;
            case 4:
                co0 co0Var5 = new co0(co0Var.X0, co0Var.f37281y0, co0Var.J0, co0Var.K0, 0, co0Var.A0, co0Var.C0, co0Var.D0, null, co0Var.f37273t0, co0Var.E0, co0Var.Q0, null, co0Var.f37265n0, co0Var.S0);
                co0Var5.Y0 = co0Var.Y0;
                co0Var5.Z0 = co0Var.Z0;
                co0Var5.P = new ln0(co0Var);
                co0Var.presentFragment(co0Var5);
                return;
            case 5:
                if (!co0Var.L0) {
                    boolean z11 = !co0Var.B;
                    co0Var.B = z11;
                    co0Var.R.setChecked(z11);
                    co0Var.S.a(co0Var.B, true);
                    return;
                }
                return;
            case 6:
                co0.Y(co0Var);
                return;
            case 7:
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(co0Var.getParentActivity());
                String string = LocaleController.getString(R.string.TurnPasswordOffQuestion);
                if (co0Var.W.has_secure_values) {
                    string = org.telegram.messenger.l0.h(R.string.TurnPasswordOffPassport, ta.b.e(string, "\n\n"));
                }
                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22702a;
                c2Var.P = string;
                c2Var.N = LocaleController.getString(R.string.TurnPasswordOffQuestionTitle);
                alertDialog$Builder.k(LocaleController.getString(R.string.Disable), new cn0(co0Var, 3));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                co0Var.showDialog(c2Var);
                TextView textView = (TextView) c2Var.d(-1);
                if (textView != null) {
                    textView.setTextColor(co0Var.getThemedColor(org.telegram.ui.ActionBar.f6.f23230q7));
                    return;
                }
                return;
            case 8:
                boolean z12 = !co0Var.P0;
                co0Var.P0 = z12;
                co0Var.H.setChecked(z12);
                return;
            case 9:
                boolean z13 = !co0Var.Q0;
                co0Var.Q0 = z13;
                co0Var.H.setChecked(z13);
                return;
            case 10:
                boolean z14 = !co0Var.Q0;
                co0Var.Q0 = z14;
                co0Var.H.setChecked(z14);
                return;
            case 11:
                co0Var.getClass();
                int intValue = ((Integer) view.getTag()).intValue();
                int i10 = 0;
                while (true) {
                    org.telegram.ui.Cells.j6[] j6VarArr = co0Var.h;
                    if (i10 < j6VarArr.length) {
                        org.telegram.ui.Cells.j6 j6Var = j6VarArr[i10];
                        if (intValue == i10) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        j6Var.a(z10, true);
                        i10++;
                    } else {
                        return;
                    }
                }
            case 12:
                co0Var.L.setClickable(false);
                try {
                    JSONObject put = new JSONObject().put("apiVersion", 2).put("apiVersionMinor", 0);
                    JSONObject o02 = co0.o0();
                    if (co0Var.G0 != null && co0Var.I0 == null) {
                        o02.put("tokenizationSpecification", new f9.f(co0Var, 2));
                    } else {
                        o02.put("tokenizationSpecification", new f9.f(co0Var, 4));
                    }
                    put.put("allowedPaymentMethods", new JSONArray().put(o02));
                    JSONObject jSONObject = new JSONObject();
                    ArrayList arrayList = new ArrayList(co0Var.f37281y0.invoice.prices);
                    TLRPC.TL_shippingOption tL_shippingOption = co0Var.C0;
                    if (tL_shippingOption != null) {
                        arrayList.addAll(tL_shippingOption.prices);
                    }
                    long j10 = 0;
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        j10 += ((TLRPC.TL_labeledPrice) arrayList.get(i11)).amount;
                    }
                    jSONObject.put("totalPrice", LocaleController.getInstance().formatCurrencyDecimalString(j10, co0Var.f37281y0.invoice.currency, false));
                    jSONObject.put("totalPriceStatus", "FINAL");
                    if (!TextUtils.isEmpty(co0Var.H0)) {
                        jSONObject.put("countryCode", co0Var.H0);
                    }
                    jSONObject.put("currencyCode", co0Var.f37281y0.invoice.currency);
                    jSONObject.put("checkoutOption", "COMPLETE_IMMEDIATE_PURCHASE");
                    put.put("transactionInfo", jSONObject);
                    put.put("merchantInfo", new JSONObject().put("merchantName", co0Var.f37263l0));
                    String jSONObject2 = put.toString();
                    ?? obj = new Object();
                    obj.f5956r = true;
                    x5.l.i(jSONObject2, "paymentDataRequestJson cannot be null!");
                    obj.f5957s = jSONObject2;
                    com.google.android.gms.internal.clearcut.v0 v0Var = co0Var.f37254e;
                    v0Var.getClass();
                    com.google.android.gms.common.api.internal.v b10 = com.google.android.gms.common.api.internal.w.b();
                    b10.f2914c = new android.support.v4.media.c((Object) obj, 13);
                    b10.d = new u5.c[]{f8.p.f5968b};
                    b10.f2913b = true;
                    b10.f2912a = 23707;
                    f8.a.a(v0Var.e(1, b10.b()), co0Var.getParentActivity());
                    return;
                } catch (JSONException e10) {
                    FileLog.e(e10);
                    return;
                }
            case 13:
                co0Var.f37270r0 = false;
                co0Var.s0();
                return;
            default:
                co0Var.f37256f[0].requestFocus();
                AndroidUtilities.showKeyboard(co0Var.f37256f[0]);
                return;
        }
    }
}
