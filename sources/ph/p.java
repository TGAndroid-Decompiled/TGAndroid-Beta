package ph;

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
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.vs;
import org.telegram.ui.yu0;
public final class p {
    public static final WeakHashMap f45939k = new WeakHashMap();
    public static KeyStore f45940l;
    public final Context f45941a;
    public final int f45942b;
    public final long f45943c;
    public boolean d;
    public boolean f45944e;
    public boolean f45945f;
    public String f45946g;
    public String h;
    public ha.c f45947i;
    public bh.v f45948j;

    public p(Context context, int i10, long j10) {
        this.f45941a = context;
        this.f45942b = i10;
        this.f45943c = j10;
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
        f45939k.clear();
    }

    public static p c(Context context, int i10, long j10) {
        Pair pair = new Pair(Integer.valueOf(i10), Long.valueOf(j10));
        WeakHashMap weakHashMap = f45939k;
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
                } catch (Exception e10) {
                    FileLog.e(e10);
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
            if (c3.f45944e && c3.f45945f) {
                hashMap.put(l10, Boolean.valueOf(!c3.d));
            }
        }
        if (arrayList.isEmpty()) {
            callback.run(new ArrayList());
        } else {
            MessagesStorage.getInstance(i10).getStorageQueue().postRunnable(new vs(i10, arrayList, hashMap, callback, 12));
        }
    }

    public final boolean a() {
        return this.f45945f;
    }

    public final SecretKey e() {
        if (f45940l == null) {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            f45940l = keyStore;
            keyStore.load(null);
        }
        KeyStore keyStore2 = f45940l;
        StringBuilder sb2 = new StringBuilder("9bot_");
        long j10 = this.f45943c;
        sb2.append(j10);
        if (keyStore2.containsAlias(sb2.toString())) {
            KeyStore keyStore3 = f45940l;
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
        throw new UnsupportedOperationException("Method not decompiled: ph.p.f():org.json.JSONObject");
    }

    public final boolean g() {
        return this.f45944e;
    }

    public final void h() {
        boolean z10;
        SharedPreferences sharedPreferences = this.f45941a.getSharedPreferences("2botbiometry_" + this.f45942b, 0);
        long j10 = this.f45943c;
        this.f45946g = sharedPreferences.getString(String.valueOf(j10), null);
        this.h = sharedPreferences.getString(String.valueOf(j10) + "_iv", null);
        boolean z11 = true;
        if (this.f45946g != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f45944e = z10;
        if (!z10) {
            if (!sharedPreferences.getBoolean(j10 + "_requested", false)) {
                z11 = false;
            }
        }
        this.f45945f = z11;
        this.d = sharedPreferences.getBoolean(j10 + "_disabled", false);
    }

    public final androidx.biometric.v i(boolean z10) {
        try {
            if (Build.VERSION.SDK_INT >= 23) {
                Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
                SecretKey e10 = e();
                if (z10) {
                    cipher.init(2, e10, new IvParameterSpec(Utilities.hexToBytes(this.h)));
                } else {
                    cipher.init(1, e10);
                }
                return new androidx.biometric.v(cipher);
            }
            return null;
        } catch (Exception e11) {
            FileLog.e(e11);
            return null;
        }
    }

    public final void j(String str, boolean z10, String str2, Utilities.Callback3 callback3) {
        androidx.biometric.v vVar;
        int i10;
        int i11;
        this.f45948j = null;
        try {
            if (this.f45947i == null) {
                this.f45947i = new ha.c(LaunchActivity.C1, f0.e.e(this.f45941a), new n(this));
            }
            androidx.biometric.v i12 = i(z10);
            TLRPC.User user = MessagesController.getInstance(this.f45942b).getUser(Long.valueOf(this.f45943c));
            f5.u uVar = new f5.u();
            uVar.f6632b = UserObject.getUserName(user);
            uVar.d = LocaleController.getString(R.string.Back);
            int i13 = 15;
            uVar.f6631a = 15;
            if (!TextUtils.isEmpty(str)) {
                uVar.f6633c = str;
            }
            v5.l e10 = uVar.e();
            if (i12 != null) {
                Cipher cipher = i12.f1057b;
                if (!z10 && (i11 = Build.VERSION.SDK_INT) >= 30) {
                    try {
                        if (TextUtils.isEmpty(str2)) {
                            this.f45946g = null;
                        } else if (i11 < 23) {
                            this.f45946g = str2;
                        } else {
                            this.f45946g = Utilities.bytesToHex(cipher.doFinal(str2.getBytes(StandardCharsets.UTF_8)));
                            this.h = Utilities.bytesToHex(cipher.getIV());
                        }
                        k();
                        callback3.run(Boolean.TRUE, null, null);
                        return;
                    } catch (Exception e11) {
                        FileLog.e(e11);
                        i12 = i(z10);
                    }
                }
            }
            if (i12 != null && Build.VERSION.SDK_INT < 30) {
                vVar = i12;
            } else {
                vVar = null;
            }
            this.f45948j = new bh.v(27, callback3, vVar);
            if (i12 != null && (i10 = Build.VERSION.SDK_INT) < 30) {
                ha.c cVar = this.f45947i;
                cVar.getClass();
                int i14 = e10.f49426a;
                if (i14 != 0) {
                    i13 = i14;
                }
                if ((i13 & 255) != 255) {
                    if (i10 < 30 && h7.u.a(i13)) {
                        throw new IllegalArgumentException("Crypto-based authentication is not supported for device credential prior to API 30.");
                    }
                    cVar.V(e10, i12);
                    return;
                }
                throw new IllegalArgumentException("Crypto-based authentication is not supported for Class 2 (Weak) biometrics.");
            }
            this.f45947i.V(e10, null);
        } catch (Exception e12) {
            FileLog.e(e12);
            callback3.run(Boolean.FALSE, null, null);
        }
    }

    public final void k() {
        SharedPreferences.Editor edit = this.f45941a.getSharedPreferences("2botbiometry_" + this.f45942b, 0).edit();
        boolean z10 = this.f45945f;
        long j10 = this.f45943c;
        if (z10) {
            edit.putBoolean(j10 + "_requested", true);
        } else {
            edit.remove(j10 + "_requested");
        }
        if (this.f45944e) {
            String valueOf = String.valueOf(j10);
            String str = this.f45946g;
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

    public final void l(String str, final String str2, final yu0 yu0Var) {
        j(str, false, str2, new Utilities.Callback3() {
            @Override
            public final void run(Object obj, Object obj2, Object obj3) {
                String str3 = str2;
                Boolean bool = (Boolean) obj;
                androidx.biometric.u uVar = (androidx.biometric.u) obj2;
                androidx.biometric.v vVar = (androidx.biometric.v) obj3;
                p pVar = p.this;
                pVar.getClass();
                if (uVar != null) {
                    try {
                        if (TextUtils.isEmpty(str3)) {
                            pVar.f45946g = null;
                            pVar.h = null;
                        } else {
                            int i10 = Build.VERSION.SDK_INT;
                            if (i10 < 23) {
                                pVar.f45946g = str3;
                                pVar.h = null;
                            } else {
                                if (i10 >= 30) {
                                    vVar = pVar.i(false);
                                }
                                if (vVar != null) {
                                    Cipher cipher = vVar.f1057b;
                                    pVar.f45946g = Utilities.bytesToHex(cipher.doFinal(str3.getBytes(StandardCharsets.UTF_8)));
                                    pVar.h = Utilities.bytesToHex(cipher.getIV());
                                } else {
                                    throw new RuntimeException("No cryptoObject found");
                                }
                            }
                        }
                        pVar.k();
                    } catch (Exception e10) {
                        FileLog.e(e10);
                        bool = Boolean.FALSE;
                    }
                }
                yu0Var.run(bool);
            }
        });
    }
}
