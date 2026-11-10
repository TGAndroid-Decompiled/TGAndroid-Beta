package xa;

import ab.a0;
import android.content.Context;
import android.text.TextUtils;
import android.util.JsonReader;
import android.util.Log;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.ui.Cells.f1;
import q6.m;
public final class c {
    public static final Pattern d = Pattern.compile("[0-9]+s");
    public static final Charset f58682e = Charset.forName("UTF-8");
    public final Context f58683a;
    public final ua.b f58684b;
    public final d f58685c = new d();

    public c(Context context, ua.b bVar) {
        this.f58683a = context;
        this.f58684b = bVar;
    }

    public static URL a(String str) {
        try {
            return new URL("https://firebaseinstallations.googleapis.com/v1/" + str);
        } catch (MalformedURLException e10) {
            throw new a0(e10.getMessage());
        }
    }

    public static void b(HttpURLConnection httpURLConnection, String str, String str2, String str3) {
        String i7;
        InputStream errorStream = httpURLConnection.getErrorStream();
        String str4 = null;
        if (errorStream != null) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream, f58682e));
            try {
                StringBuilder sb2 = new StringBuilder();
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    sb2.append(readLine);
                    sb2.append('\n');
                }
                str4 = String.format("Error when communicating with the Firebase Installations server API. HTTP response: [%d %s: %s]", Integer.valueOf(httpURLConnection.getResponseCode()), httpURLConnection.getResponseMessage(), sb2);
            } catch (IOException unused) {
            } catch (Throwable th2) {
                try {
                    bufferedReader.close();
                } catch (IOException unused2) {
                }
                throw th2;
            }
            try {
                bufferedReader.close();
            } catch (IOException unused3) {
            }
        }
        if (!TextUtils.isEmpty(str4)) {
            Log.w("Firebase-Installations", str4);
            if (TextUtils.isEmpty(str)) {
                i7 = "";
            } else {
                i7 = rf.b.i(", ", str);
            }
            Log.w("Firebase-Installations", f1.m("Firebase options used while communicating with Firebase server APIs: ", str2, ", ", str3, i7));
        }
    }

    public static long d(String str) {
        m.a("Invalid Expiration Timestamp.", d.matcher(str).matches());
        if (str != null && str.length() != 0) {
            return Long.parseLong(str.substring(0, str.length() - 1));
        }
        return 0L;
    }

    public static a e(HttpURLConnection httpURLConnection) {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, f58682e));
        byte b10 = (byte) (0 | 1);
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        b bVar = null;
        long j3 = 0;
        String str3 = null;
        String str4 = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("name")) {
                str3 = jsonReader.nextString();
            } else if (nextName.equals("fid")) {
                str4 = jsonReader.nextString();
            } else if (nextName.equals("refreshToken")) {
                str2 = jsonReader.nextString();
            } else if (nextName.equals("authToken")) {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String nextName2 = jsonReader.nextName();
                    if (nextName2.equals("token")) {
                        str = jsonReader.nextString();
                    } else if (nextName2.equals("expiresIn")) {
                        b10 = (byte) (b10 | 1);
                        j3 = d(jsonReader.nextString());
                    } else {
                        jsonReader.skipValue();
                    }
                }
                if (b10 == 1) {
                    bVar = new b(str, j3, 0);
                    jsonReader.endObject();
                } else {
                    throw new IllegalStateException("Missing required properties: tokenExpirationTimestamp");
                }
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        return new a(str3, str4, str2, bVar, 1);
    }

    public static b f(HttpURLConnection httpURLConnection) {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, f58682e));
        byte b10 = (byte) (0 | 1);
        jsonReader.beginObject();
        String str = null;
        long j3 = 0;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("token")) {
                str = jsonReader.nextString();
            } else if (nextName.equals("expiresIn")) {
                j3 = d(jsonReader.nextString());
                b10 = (byte) (b10 | 1);
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        if (b10 == 1) {
            return new b(str, j3, 1);
        }
        throw new IllegalStateException("Missing required properties: tokenExpirationTimestamp");
    }

    public static void g(HttpURLConnection httpURLConnection, String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("fid", str);
            jSONObject.put("appId", str2);
            jSONObject.put("authVersion", "FIS_v2");
            jSONObject.put("sdkVersion", "a:19.1.2");
            i(httpURLConnection, jSONObject.toString().getBytes("UTF-8"));
        } catch (JSONException e10) {
            throw new IllegalStateException(e10);
        }
    }

    public static void h(HttpURLConnection httpURLConnection) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sdkVersion", "a:19.1.2");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("installation", jSONObject);
            i(httpURLConnection, jSONObject2.toString().getBytes("UTF-8"));
        } catch (JSONException e10) {
            throw new IllegalStateException(e10);
        }
    }

    public static void i(HttpURLConnection httpURLConnection, byte[] bArr) {
        OutputStream outputStream = httpURLConnection.getOutputStream();
        if (outputStream != null) {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
            try {
                gZIPOutputStream.write(bArr);
                try {
                    return;
                } catch (IOException unused) {
                    return;
                }
            } finally {
                try {
                    gZIPOutputStream.close();
                    outputStream.close();
                } catch (IOException unused2) {
                }
            }
        }
        throw new IOException("Cannot send request to FIS servers. No OutputStream available.");
    }

    public final java.net.HttpURLConnection c(java.net.URL r10, java.lang.String r11) {
        throw new UnsupportedOperationException("Method not decompiled: xa.c.c(java.net.URL, java.lang.String):java.net.HttpURLConnection");
    }
}
