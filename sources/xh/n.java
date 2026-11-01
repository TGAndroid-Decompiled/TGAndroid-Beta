package xh;

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
import org.telegram.messenger.Utilities;
import org.telegram.messenger.dd;
import org.telegram.messenger.f8;
import org.telegram.messenger.i20;
import org.telegram.messenger.is;
import org.telegram.messenger.m20;
import org.telegram.messenger.r20;
import org.telegram.messenger.wp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.d11;
import org.telegram.ui.Components.pc0;
import org.telegram.ui.LaunchActivity;
import rh.s6;
public final class n {
    public static final WeakHashMap f53930k = new WeakHashMap();
    public static KeyStore f53931l;
    public final Context f53932a;
    public final int f53933b;
    public final long f53934c;
    public boolean d;
    public boolean e;
    public boolean f53935f;
    public String f53936g;
    public String h;
    public k6.h f53937i;
    public s6 f53938j;

    public n(Context context, int i10, long j10) {
        this.f53932a = context;
        this.f53933b = i10;
        this.f53934c = j10;
        h();
    }

    public static void b() {
        Context context = org.telegram.messenger.w0.f18945b;
        if (context == null) {
            return;
        }
        for (int i10 = 0; i10 < 4; i10++) {
            context.getSharedPreferences("2botbiometry_" + i10, 0).edit().clear().apply();
        }
        f53930k.clear();
    }

    public static n c(Context context, int i10, long j10) {
        Pair pair = new Pair(Integer.valueOf(i10), Long.valueOf(j10));
        WeakHashMap weakHashMap = f53930k;
        n nVar = (n) weakHashMap.get(pair);
        if (nVar == null) {
            n nVar2 = new n(context, i10, j10);
            weakHashMap.put(pair, nVar2);
            return nVar2;
        }
        return nVar;
    }

    public static void d(Activity activity, int i10, r20 r20Var) {
        int i11 = 0;
        SharedPreferences sharedPreferences = activity.getSharedPreferences("2botbiometry_" + i10, 0);
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, ?> entry : sharedPreferences.getAll().entrySet()) {
            String key = entry.getKey();
            if (key.endsWith("_requested")) {
                try {
                    arrayList.add(Long.valueOf(Long.parseLong(key.substring(0, key.length() - 10))));
                } catch (Exception e) {
                    f8.g(e, true);
                }
            }
        }
        HashMap hashMap = new HashMap();
        int size = arrayList.size();
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            Long l4 = (Long) obj;
            n c10 = c(activity, i10, l4.longValue());
            if (c10.e && c10.f53935f) {
                hashMap.put(l4, Boolean.valueOf(!c10.d));
            }
        }
        if (arrayList.isEmpty()) {
            r20Var.a(new ArrayList());
        } else {
            is.a0(i10).f16331a.c(new d11(i10, arrayList, hashMap, r20Var, 21));
        }
    }

    public final boolean a() {
        return this.f53935f;
    }

    public final SecretKey e() {
        if (f53931l == null) {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            f53931l = keyStore;
            keyStore.load(null);
        }
        KeyStore keyStore2 = f53931l;
        StringBuilder sb2 = new StringBuilder("9bot_");
        long j10 = this.f53934c;
        sb2.append(j10);
        if (keyStore2.containsAlias(sb2.toString())) {
            KeyStore keyStore3 = f53931l;
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
        throw new UnsupportedOperationException("Method not decompiled: xh.n.f():org.json.JSONObject");
    }

    public final boolean g() {
        return this.e;
    }

    public final void h() {
        boolean z10;
        SharedPreferences sharedPreferences = this.f53932a.getSharedPreferences("2botbiometry_" + this.f53933b, 0);
        long j10 = this.f53934c;
        this.f53936g = sharedPreferences.getString(String.valueOf(j10), null);
        this.h = sharedPreferences.getString(String.valueOf(j10) + "_iv", null);
        boolean z11 = true;
        if (this.f53936g != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.e = z10;
        if (!z10) {
            if (!sharedPreferences.getBoolean(j10 + "_requested", false)) {
                z11 = false;
            }
        }
        this.f53935f = z11;
        this.d = sharedPreferences.getBoolean(j10 + "_disabled", false);
    }

    public final androidx.biometric.u i(boolean z10) {
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
            SecretKey e = e();
            if (z10) {
                cipher.init(2, e, new IvParameterSpec(Utilities.v(this.h)));
            } else {
                cipher.init(1, e);
            }
            return new androidx.biometric.u(cipher);
        } catch (Exception e7) {
            f8.g(e7, true);
            return null;
        }
    }

    public final void j(String str, boolean z10, String str2, m20 m20Var) {
        androidx.biometric.u uVar;
        int i10;
        this.f53938j = null;
        try {
            if (this.f53937i == null) {
                this.f53937i = new k6.h(LaunchActivity.I1, f0.c.d(this.f53932a), new pc0(this, 1));
            }
            androidx.biometric.u i11 = i(z10);
            TLRPC.User Z1 = wp.r1(this.f53933b).Z1(Long.valueOf(this.f53934c));
            j6.m mVar = new j6.m(1);
            mVar.f9700b = i20.p(Z1);
            mVar.d = dd.L0(2131753756, null);
            int i12 = 15;
            mVar.f9699a = 15;
            if (!TextUtils.isEmpty(str)) {
                mVar.f9701c = str;
            }
            j6.m c10 = mVar.c();
            if (i11 != null) {
                Cipher cipher = i11.f1120b;
                if (!z10 && Build.VERSION.SDK_INT >= 30) {
                    try {
                        if (TextUtils.isEmpty(str2)) {
                            this.f53936g = null;
                        } else {
                            this.f53936g = Utilities.f(cipher.doFinal(str2.getBytes(StandardCharsets.UTF_8)));
                            this.h = Utilities.f(cipher.getIV());
                        }
                        k();
                        m20Var.a(Boolean.TRUE, null, null);
                        return;
                    } catch (Exception e) {
                        f8.g(e, true);
                        i11 = i(z10);
                    }
                }
            }
            if (i11 != null && Build.VERSION.SDK_INT < 30) {
                uVar = i11;
            } else {
                uVar = null;
            }
            this.f53938j = new s6(6, m20Var, uVar);
            if (i11 != null && (i10 = Build.VERSION.SDK_INT) < 30) {
                k6.h hVar = this.f53937i;
                hVar.getClass();
                int i13 = c10.f9699a;
                if (i13 != 0) {
                    i12 = i13;
                }
                if ((i12 & 255) != 255) {
                    if (i10 < 30 && v7.k.a(i12)) {
                        throw new IllegalArgumentException("Crypto-based authentication is not supported for device credential prior to API 30.");
                    }
                    hVar.a(c10, i11);
                    return;
                }
                throw new IllegalArgumentException("Crypto-based authentication is not supported for Class 2 (Weak) biometrics.");
            }
            this.f53937i.a(c10, null);
        } catch (Exception e7) {
            f8.g(e7, true);
            m20Var.a(Boolean.FALSE, null, null);
        }
    }

    public final void k() {
        SharedPreferences.Editor edit = this.f53932a.getSharedPreferences("2botbiometry_" + this.f53933b, 0).edit();
        boolean z10 = this.f53935f;
        long j10 = this.f53934c;
        if (z10) {
            edit.putBoolean(j10 + "_requested", true);
        } else {
            edit.remove(j10 + "_requested");
        }
        if (this.e) {
            String valueOf = String.valueOf(j10);
            String str = this.f53936g;
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

    public final void l(String str, final String str2, final kg.d0 d0Var) {
        j(str, false, str2, new m20() {
            @Override
            public final void a(Object obj, Object obj2, Object obj3) {
                String str3 = str2;
                Boolean bool = (Boolean) obj;
                androidx.biometric.t tVar = (androidx.biometric.t) obj2;
                androidx.biometric.u uVar = (androidx.biometric.u) obj3;
                n nVar = n.this;
                nVar.getClass();
                if (tVar != null) {
                    try {
                        if (TextUtils.isEmpty(str3)) {
                            nVar.f53936g = null;
                            nVar.h = null;
                        } else {
                            if (Build.VERSION.SDK_INT >= 30) {
                                uVar = nVar.i(false);
                            }
                            if (uVar != null) {
                                Cipher cipher = uVar.f1120b;
                                nVar.f53936g = Utilities.f(cipher.doFinal(str3.getBytes(StandardCharsets.UTF_8)));
                                nVar.h = Utilities.f(cipher.getIV());
                            } else {
                                throw new RuntimeException("No cryptoObject found");
                            }
                        }
                        nVar.k();
                    } catch (Exception e) {
                        f8.g(e, true);
                        bool = Boolean.FALSE;
                    }
                }
                d0Var.a(bool);
            }
        });
    }
}
