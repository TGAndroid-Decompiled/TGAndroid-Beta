package org.telegram.ui;

import android.os.AsyncTask;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Locale;
import java.util.Scanner;
import org.json.JSONObject;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

public final class tn0 extends AsyncTask {

    public final dc.a f42981a;

    public final do0 f42982b;

    public tn0(do0 do0Var, dc.a aVar) {
        this.f42982b = do0Var;
        this.f42981a = aVar;
    }

    @Override
    public final Object doInBackground(Object[] objArr) throws Throwable {
        HttpURLConnection httpURLConnection;
        ?? r10;
        String string;
        URL url;
        do0 do0Var = this.f42982b;
        dc.a aVar = this.f42981a;
        try {
            try {
                try {
                    JSONObject jSONObject = new JSONObject();
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("number", aVar.f4895a);
                    jSONObject2.put("expiration_month", String.format(Locale.US, "%02d", aVar.f4897c));
                    jSONObject2.put("expiration_year", "" + aVar.d);
                    jSONObject2.put("security_code", "" + aVar.f4896b);
                    jSONObject.put("card", jSONObject2);
                    if (do0Var.f37487y0.native_params != null) {
                        try {
                            string = new JSONObject(do0Var.f37487y0.native_params.data).getString("tokenize_url");
                            if (string != null) {
                                try {
                                    if (!string.startsWith("https://") || !string.endsWith(".smart-glocal.com/cds/v1/tokenize/card")) {
                                        string = null;
                                    }
                                } catch (Exception unused) {
                                }
                            }
                        } catch (Exception unused2) {
                        }
                    } else {
                        string = null;
                    }
                    if (string != null) {
                        url = new URL(string);
                    } else {
                        url = do0Var.f37487y0.invoice.test ? new URL("https://tgb-playground.smart-glocal.com/cds/v1/tokenize/card") : new URL("https://tgb.smart-glocal.com/cds/v1/tokenize/card");
                    }
                    httpURLConnection = (HttpURLConnection) url.openConnection();
                    try {
                        httpURLConnection.setConnectTimeout(30000);
                        httpURLConnection.setReadTimeout(80000);
                        httpURLConnection.setUseCaches(false);
                        httpURLConnection.setDoOutput(true);
                        httpURLConnection.setRequestMethod("POST");
                        httpURLConnection.setRequestProperty("Content-Type", "application/json");
                        httpURLConnection.setRequestProperty("X-PUBLIC-TOKEN", do0Var.f37463f0);
                        OutputStream outputStream = httpURLConnection.getOutputStream();
                        try {
                            outputStream.write(jSONObject.toString().getBytes("UTF-8"));
                            outputStream.close();
                            int responseCode = httpURLConnection.getResponseCode();
                            if (responseCode < 200 || responseCode >= 300) {
                                if (BuildVars.DEBUG_VERSION) {
                                    StringBuilder sb2 = new StringBuilder("");
                                    InputStream errorStream = httpURLConnection.getErrorStream();
                                    String next = new Scanner(errorStream, "UTF-8").useDelimiter("\\A").next();
                                    errorStream.close();
                                    sb2.append(next);
                                    FileLog.e(sb2.toString());
                                }
                                httpURLConnection.disconnect();
                                return null;
                            }
                            JSONObject jSONObject3 = new JSONObject();
                            InputStream inputStream = httpURLConnection.getInputStream();
                            String next2 = new Scanner(inputStream, "UTF-8").useDelimiter("\\A").next();
                            inputStream.close();
                            jSONObject3.put("token", new JSONObject(next2).getJSONObject("data").getString("token"));
                            jSONObject3.put("type", "card");
                            String string2 = jSONObject3.toString();
                            httpURLConnection.disconnect();
                            return string2;
                        } catch (Throwable th) {
                            if (outputStream == null) {
                                throw th;
                            }
                            try {
                                outputStream.close();
                                throw th;
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                                throw th;
                            }
                        }
                    } catch (Exception e9) {
                        e = e9;
                        FileLog.e(e);
                        if (httpURLConnection != null) {
                        }
                        return null;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    r10 = aVar;
                    if (r10 != 0) {
                        r10.disconnect();
                    }
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                r10 = 0;
                if (r10 != 0) {
                    r10.disconnect();
                }
                throw th;
            }
        } catch (Exception e10) {
            e = e10;
            httpURLConnection = null;
        }
    }

    @Override
    public final void onPostExecute(Object obj) {
        String str = (String) obj;
        do0 do0Var = this.f42982b;
        if (do0Var.M0) {
            return;
        }
        if (str == null) {
            org.telegram.ui.Components.y4.w0(do0Var, LocaleController.getString(R.string.PaymentConnectionFailed));
        } else {
            do0Var.f37478s0 = str;
            do0Var.t0();
        }
        do0Var.H0(true, false);
        do0Var.D0(false);
    }
}
