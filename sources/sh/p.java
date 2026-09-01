package sh;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.security.keystore.KeyGenParameterSpec;
import android.text.TextUtils;
import android.util.Pair;
import java.nio.charset.StandardCharsets;
import java.security.KeyStore;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.xk;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.dt;
public final class p {
    public static final WeakHashMap f47564k = new WeakHashMap();
    public static KeyStore f47565l;
    public final Context f47566a;
    public final int f47567b;
    public final long f47568c;
    public boolean d;
    public boolean f47569e;
    public boolean f47570f;
    public String f47571g;
    public String h;
    public y5.h f47572i;
    public eh.w f47573j;

    public p(Context context, int i10, long j10) {
        this.f47566a = context;
        this.f47567b = i10;
        this.f47568c = j10;
        h();
    }

    public static void b() {
        Context context = ApplicationLoader.applicationContext;
        if (context == null) {
            return;
        }
        for (int i10 = 0; i10 < 4; i10++) {
            context.getSharedPreferences("2botbiometry_" + i10, 0).edit().clear().apply();
        }
        f47564k.clear();
    }

    public static p c(Context context, int i10, long j10) {
        Pair pair = new Pair(Integer.valueOf(i10), Long.valueOf(j10));
        WeakHashMap weakHashMap = f47564k;
        p pVar = (p) weakHashMap.get(pair);
        if (pVar == null) {
            p pVar2 = new p(context, i10, j10);
            weakHashMap.put(pair, pVar2);
            return pVar2;
        }
        return pVar;
    }

    public static void d(Activity activity, int i10, Utilities.Callback callback) {
        int i11 = 0;
        SharedPreferences sharedPreferences = activity.getSharedPreferences("2botbiometry_" + i10, 0);
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, ?> entry : sharedPreferences.getAll().entrySet()) {
            String key = entry.getKey();
            if (key.endsWith("_requested")) {
                try {
                    arrayList.add(Long.valueOf(Long.parseLong(key.substring(0, key.length() - 10))));
                } catch (Exception e6) {
                    FileLog.e(e6);
                }
            }
        }
        HashMap hashMap = new HashMap();
        int size = arrayList.size();
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            Long l10 = (Long) obj;
            p c3 = c(activity, i10, l10.longValue());
            if (c3.f47569e && c3.f47570f) {
                hashMap.put(l10, Boolean.valueOf(!c3.d));
            }
        }
        if (arrayList.isEmpty()) {
            callback.run(new ArrayList());
        } else {
            MessagesStorage.getInstance(i10).getStorageQueue().postRunnable(new dt(i10, arrayList, hashMap, callback, 12));
        }
    }

    public final boolean a() {
        return this.f47570f;
    }

    public final SecretKey e() {
        if (f47565l == null) {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            f47565l = keyStore;
            keyStore.load(null);
        }
        KeyStore keyStore2 = f47565l;
        StringBuilder sb = new StringBuilder("9bot_");
        long j10 = this.f47568c;
        sb.append(j10);
        if (keyStore2.containsAlias(sb.toString())) {
            KeyStore keyStore3 = f47565l;
            return (SecretKey) keyStore3.getKey("9bot_" + j10, null);
        }
        KeyGenParameterSpec.Builder builder = new KeyGenParameterSpec.Builder("9bot_" + j10, 3);
        builder.setBlockModes("CBC");
        builder.setEncryptionPaddings("PKCS7Padding");
        builder.setUserAuthenticationRequired(true);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            builder.setUserAuthenticationParameters(60, 2);
        }
        if (i10 >= 24) {
            builder.setInvalidatedByBiometricEnrollment(true);
        }
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
        keyGenerator.init(builder.build());
        return keyGenerator.generateKey();
    }

    public final org.json.JSONObject f() {
        throw new UnsupportedOperationException("Method not decompiled: sh.p.f():org.json.JSONObject");
    }

    public final boolean g() {
        return this.f47569e;
    }

    public final void h() {
        boolean z4;
        SharedPreferences sharedPreferences = this.f47566a.getSharedPreferences("2botbiometry_" + this.f47567b, 0);
        long j10 = this.f47568c;
        this.f47571g = sharedPreferences.getString(String.valueOf(j10), null);
        this.h = sharedPreferences.getString(String.valueOf(j10) + "_iv", null);
        boolean z10 = true;
        if (this.f47571g != null) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.f47569e = z4;
        if (!z4) {
            if (!sharedPreferences.getBoolean(j10 + "_requested", false)) {
                z10 = false;
            }
        }
        this.f47570f = z10;
        this.d = sharedPreferences.getBoolean(j10 + "_disabled", false);
    }

    public final androidx.biometric.w i(boolean z4) {
        try {
            if (Build.VERSION.SDK_INT >= 23) {
                Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
                SecretKey e6 = e();
                if (z4) {
                    cipher.init(2, e6, new IvParameterSpec(Utilities.hexToBytes(this.h)));
                } else {
                    cipher.init(1, e6);
                }
                return new androidx.biometric.w(cipher);
            }
            return null;
        } catch (Exception e10) {
            FileLog.e(e10);
            return null;
        }
    }

    public final void j(String str, boolean z4, String str2, Utilities.Callback3 callback3) {
        androidx.biometric.w wVar;
        int i10;
        int i11;
        this.f47573j = null;
        try {
            if (this.f47572i == null) {
                this.f47572i = new y5.h(LaunchActivity.D1, f0.e.e(this.f47566a), new n(this));
            }
            androidx.biometric.w i12 = i(z4);
            TLRPC.User user = MessagesController.getInstance(this.f47567b).getUser(Long.valueOf(this.f47568c));
            h5.u uVar = new h5.u(1);
            uVar.f7300b = UserObject.getUserName(user);
            uVar.d = LocaleController.getString(R.string.Back);
            int i13 = 15;
            uVar.f7299a = 15;
            if (!TextUtils.isEmpty(str)) {
                uVar.f7301c = str;
            }
            x5.k c3 = uVar.c();
            if (i12 != null) {
                Cipher cipher = i12.f558b;
                if (!z4 && (i11 = Build.VERSION.SDK_INT) >= 30) {
                    try {
                        if (TextUtils.isEmpty(str2)) {
                            this.f47571g = null;
                        } else if (i11 < 23) {
                            this.f47571g = str2;
                        } else {
                            this.f47571g = Utilities.bytesToHex(cipher.doFinal(str2.getBytes(StandardCharsets.UTF_8)));
                            this.h = Utilities.bytesToHex(cipher.getIV());
                        }
                        k();
                        callback3.run(Boolean.TRUE, null, null);
                        return;
                    } catch (Exception e6) {
                        FileLog.e(e6);
                        i12 = i(z4);
                    }
                }
            }
            if (i12 != null && Build.VERSION.SDK_INT < 30) {
                wVar = i12;
            } else {
                wVar = null;
            }
            this.f47573j = new eh.w(27, callback3, wVar);
            if (i12 != null && (i10 = Build.VERSION.SDK_INT) < 30) {
                y5.h hVar = this.f47572i;
                hVar.getClass();
                int i14 = c3.f50429a;
                if (i14 != 0) {
                    i13 = i14;
                }
                if ((i13 & 255) != 255) {
                    if (i10 < 30 && com.google.android.gms.internal.play_billing.s1.a(i13)) {
                        throw new IllegalArgumentException("Crypto-based authentication is not supported for device credential prior to API 30.");
                    }
                    hVar.g(c3, i12);
                    return;
                }
                throw new IllegalArgumentException("Crypto-based authentication is not supported for Class 2 (Weak) biometrics.");
            }
            this.f47572i.g(c3, null);
        } catch (Exception e10) {
            FileLog.e(e10);
            callback3.run(Boolean.FALSE, null, null);
        }
    }

    public final void k() {
        SharedPreferences.Editor edit = this.f47566a.getSharedPreferences("2botbiometry_" + this.f47567b, 0).edit();
        boolean z4 = this.f47570f;
        long j10 = this.f47568c;
        if (z4) {
            edit.putBoolean(j10 + "_requested", true);
        } else {
            edit.remove(j10 + "_requested");
        }
        if (this.f47569e) {
            String valueOf = String.valueOf(j10);
            String str = this.f47571g;
            String str2 = "";
            if (str == null) {
                str = "";
            }
            edit.putString(valueOf, str);
            String str3 = String.valueOf(j10) + "_iv";
            String str4 = this.h;
            if (str4 != null) {
                str2 = str4;
            }
            edit.putString(str3, str2);
        } else {
            edit.remove(String.valueOf(j10));
            edit.remove(String.valueOf(j10) + "_iv");
        }
        if (this.d) {
            edit.putBoolean(j10 + "_disabled", true);
        } else {
            edit.remove(j10 + "_disabled");
        }
        edit.apply();
    }

    public final void l(String str, final String str2, final xk xkVar) {
        j(str, false, str2, new Utilities.Callback3() {
            @Override
            public final void run(Object obj, Object obj2, Object obj3) {
                String str3 = str2;
                Boolean bool = (Boolean) obj;
                androidx.biometric.v vVar = (androidx.biometric.v) obj2;
                androidx.biometric.w wVar = (androidx.biometric.w) obj3;
                p pVar = p.this;
                pVar.getClass();
                if (vVar != null) {
                    try {
                        if (TextUtils.isEmpty(str3)) {
                            pVar.f47571g = null;
                            pVar.h = null;
                        } else {
                            int i10 = Build.VERSION.SDK_INT;
                            if (i10 < 23) {
                                pVar.f47571g = str3;
                                pVar.h = null;
                            } else {
                                if (i10 >= 30) {
                                    wVar = pVar.i(false);
                                }
                                if (wVar != null) {
                                    Cipher cipher = wVar.f558b;
                                    pVar.f47571g = Utilities.bytesToHex(cipher.doFinal(str3.getBytes(StandardCharsets.UTF_8)));
                                    pVar.h = Utilities.bytesToHex(cipher.getIV());
                                } else {
                                    throw new RuntimeException("No cryptoObject found");
                                }
                            }
                        }
                        pVar.k();
                    } catch (Exception e6) {
                        FileLog.e(e6);
                        bool = Boolean.FALSE;
                    }
                }
                xkVar.run(bool);
            }
        });
    }
}
