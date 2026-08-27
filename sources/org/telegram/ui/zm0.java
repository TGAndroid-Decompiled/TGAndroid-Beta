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

    public final int f45211a;

    public final do0 f45212b;

    public zm0(do0 do0Var, int i10) {
        this.f45211a = i10;
        this.f45212b = do0Var;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f45211a;
        do0 do0Var = this.f45212b;
        switch (i10) {
            case 0:
                if (do0Var.getParentActivity() != null) {
                    do0Var.G0(null);
                    break;
                }
                break;
            case 1:
                do0 do0Var2 = new do0(do0Var.X0, do0Var.f37487y0, do0Var.J0, do0Var.K0, 0, do0Var.A0, do0Var.C0, do0Var.D0, null, do0Var.f37479t0, do0Var.E0, do0Var.Q0, null, do0Var.f37471n0, do0Var.S0);
                do0Var2.Y0 = do0Var.Y0;
                do0Var2.Z0 = do0Var.Z0;
                do0Var2.P = new jn0(do0Var);
                do0Var.presentFragment(do0Var2);
                break;
            case 2:
                do0 do0Var3 = new do0(do0Var.X0, do0Var.f37487y0, do0Var.J0, do0Var.K0, 0, do0Var.A0, do0Var.C0, do0Var.D0, null, do0Var.f37479t0, do0Var.E0, do0Var.Q0, null, do0Var.f37471n0, do0Var.S0);
                do0Var3.Y0 = do0Var.Y0;
                do0Var3.Z0 = do0Var.Z0;
                do0Var3.P = new kn0(do0Var);
                do0Var.presentFragment(do0Var3);
                break;
            case 3:
                do0 do0Var4 = new do0(do0Var.X0, do0Var.f37487y0, do0Var.J0, do0Var.K0, 0, do0Var.A0, do0Var.C0, do0Var.D0, null, do0Var.f37479t0, do0Var.E0, do0Var.Q0, null, do0Var.f37471n0, do0Var.S0);
                do0Var4.Y0 = do0Var.Y0;
                do0Var4.Z0 = do0Var.Z0;
                do0Var4.P = new ln0(do0Var);
                do0Var.presentFragment(do0Var4);
                break;
            case 4:
                do0 do0Var5 = new do0(do0Var.X0, do0Var.f37487y0, do0Var.J0, do0Var.K0, 0, do0Var.A0, do0Var.C0, do0Var.D0, null, do0Var.f37479t0, do0Var.E0, do0Var.Q0, null, do0Var.f37471n0, do0Var.S0);
                do0Var5.Y0 = do0Var.Y0;
                do0Var5.Z0 = do0Var.Z0;
                do0Var5.P = new mn0(do0Var);
                do0Var.presentFragment(do0Var5);
                break;
            case 5:
                if (!do0Var.L0) {
                    boolean z10 = !do0Var.B;
                    do0Var.B = z10;
                    do0Var.R.setChecked(z10);
                    do0Var.S.a(do0Var.B, true);
                    break;
                }
                break;
            case 6:
                do0.Z(do0Var);
                break;
            case 7:
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(do0Var.getParentActivity());
                String string = LocaleController.getString(R.string.TurnPasswordOffQuestion);
                if (do0Var.W.has_secure_values) {
                    string = org.telegram.messenger.y1.i(R.string.TurnPasswordOffPassport, s3.c.f(string, "\n\n"));
                }
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
                b2Var.P = string;
                b2Var.N = LocaleController.getString(R.string.TurnPasswordOffQuestionTitle);
                alertDialog$Builder.k(LocaleController.getString(R.string.Disable), new dn0(do0Var, 3));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                do0Var.showDialog(b2Var);
                TextView textView = (TextView) b2Var.d(-1);
                if (textView != null) {
                    textView.setTextColor(do0Var.getThemedColor(org.telegram.ui.ActionBar.g6.f23284q7));
                }
                break;
            case 8:
                boolean z11 = !do0Var.P0;
                do0Var.P0 = z11;
                do0Var.H.setChecked(z11);
                break;
            case 9:
                boolean z12 = !do0Var.Q0;
                do0Var.Q0 = z12;
                do0Var.H.setChecked(z12);
                break;
            case 10:
                boolean z13 = !do0Var.Q0;
                do0Var.Q0 = z13;
                do0Var.H.setChecked(z13);
                break;
            case 11:
                do0Var.getClass();
                int iIntValue = ((Integer) view.getTag()).intValue();
                int i11 = 0;
                while (true) {
                    org.telegram.ui.Cells.g6[] g6VarArr = do0Var.h;
                    if (i11 < g6VarArr.length) {
                        g6VarArr[i11].a(iIntValue == i11, true);
                        i11++;
                    }
                    break;
                }
                break;
            case 12:
                do0Var.L.setClickable(false);
                try {
                    JSONObject jSONObjectPut = new JSONObject().put("apiVersion", 2).put("apiVersionMinor", 0);
                    JSONObject jSONObjectP0 = do0.p0();
                    if (do0Var.G0 == null || do0Var.I0 != null) {
                        jSONObjectP0.put("tokenizationSpecification", new g9.f(do0Var, 4));
                    } else {
                        jSONObjectP0.put("tokenizationSpecification", new g9.f(do0Var, 2));
                    }
                    jSONObjectPut.put("allowedPaymentMethods", new JSONArray().put(jSONObjectP0));
                    JSONObject jSONObject = new JSONObject();
                    ArrayList arrayList = new ArrayList(do0Var.f37487y0.invoice.prices);
                    TLRPC.TL_shippingOption tL_shippingOption = do0Var.C0;
                    if (tL_shippingOption != null) {
                        arrayList.addAll(tL_shippingOption.prices);
                    }
                    long j10 = 0;
                    for (int i12 = 0; i12 < arrayList.size(); i12++) {
                        j10 += ((TLRPC.TL_labeledPrice) arrayList.get(i12)).amount;
                    }
                    jSONObject.put("totalPrice", LocaleController.getInstance().formatCurrencyDecimalString(j10, do0Var.f37487y0.invoice.currency, false));
                    jSONObject.put("totalPriceStatus", "FINAL");
                    if (!TextUtils.isEmpty(do0Var.H0)) {
                        jSONObject.put("countryCode", do0Var.H0);
                    }
                    jSONObject.put("currencyCode", do0Var.f37487y0.invoice.currency);
                    jSONObject.put("checkoutOption", "COMPLETE_IMMEDIATE_PURCHASE");
                    jSONObjectPut.put("transactionInfo", jSONObject);
                    jSONObjectPut.put("merchantInfo", new JSONObject().put("merchantName", do0Var.f37469l0));
                    String string2 = jSONObjectPut.toString();
                    g8.j jVar = new g8.j();
                    jVar.f6757r = true;
                    y5.l.i(string2, "paymentDataRequestJson cannot be null!");
                    jVar.f6758s = string2;
                    com.google.android.gms.internal.clearcut.v0 v0Var = do0Var.f37460e;
                    v0Var.getClass();
                    com.google.android.gms.common.api.internal.v vVarB = com.google.android.gms.common.api.internal.w.b();
                    vVarB.f3359c = new ae.b(jVar, 17);
                    vVarB.d = new v5.c[]{g8.p.f6769b};
                    vVarB.f3358b = true;
                    vVarB.f3357a = 23707;
                    g8.a.a(v0Var.e(1, vVarB.b()), do0Var.getParentActivity());
                } catch (JSONException e9) {
                    FileLog.e(e9);
                    return;
                }
                break;
            case 13:
                do0Var.f37476r0 = false;
                do0Var.t0();
                break;
            default:
                do0Var.f37462f[0].requestFocus();
                AndroidUtilities.showKeyboard(do0Var.f37462f[0]);
                break;
        }
    }
}
