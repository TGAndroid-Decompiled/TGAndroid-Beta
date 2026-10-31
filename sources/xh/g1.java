package xh;

import android.security.keystore.KeyGenParameterSpec;
import android.text.TextUtils;
import android.util.Pair;
import j$.util.Collection;
import j$.util.stream.Collectors;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.security.KeyStore;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import org.json.JSONObject;
import org.telegram.messenger.d20;
import org.telegram.messenger.f8;
import org.telegram.messenger.o5;
public final class g1 {
    public final int f53765a;
    public final long f53766b;
    public final long f53767c;
    public final boolean d;
    public String e;

    public g1(int i10, long j10, long j11, boolean z10) {
        this.f53765a = i10;
        this.f53766b = j11;
        this.f53767c = j10;
        this.d = z10;
    }

    public static File b() {
        try {
            File filesDir = org.telegram.messenger.w0.f19025b.getFilesDir();
            if (filesDir != null) {
                File file = new File(filesDir, "apps_storage/");
                file.mkdirs();
                if (filesDir.exists() || filesDir.mkdirs()) {
                    if (filesDir.canWrite()) {
                        return file;
                    }
                }
            }
        } catch (Exception unused) {
        }
        return new File("");
    }

    public static SecretKey g() {
        KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
        keyStore.load(null);
        if (!keyStore.containsAlias("MiniAppsKey")) {
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
            keyGenerator.init(new KeyGenParameterSpec.Builder("MiniAppsKey", 3).setBlockModes("GCM").setEncryptionPaddings("NoPadding").setUserAuthenticationRequired(false).build());
            keyGenerator.generateKey();
        }
        return (SecretKey) keyStore.getKey("MiniAppsKey", null);
    }

    public static HashMap i() {
        HashMap hashMap = new HashMap();
        try {
            File file = new File(b(), "secure_config.json");
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                byte[] bArr = new byte[(int) file.length()];
                fileInputStream.read(bArr);
                fileInputStream.close();
                JSONObject jSONObject = new JSONObject(new String(bArr));
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    JSONObject jSONObject2 = jSONObject.getJSONObject(next);
                    ?? obj = new Object();
                    obj.f53757a = next;
                    obj.f53758b = jSONObject2.getLong("user_id");
                    obj.f53759c = jSONObject2.getString("user_name");
                    obj.d = jSONObject2.getLong("created_at");
                    obj.e = jSONObject2.getLong("edited_at");
                    hashMap.put(next, obj);
                }
                return hashMap;
            } catch (OutOfMemoryError e) {
                f8.g(e, true);
                throw new RuntimeException("QUOTA_EXCEEDED");
            }
        } catch (Exception e7) {
            f8.g(e7, true);
            return hashMap;
        }
    }

    public static void k(HashMap hashMap) {
        try {
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry entry : hashMap.entrySet()) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("user_id", ((f1) entry.getValue()).f53758b);
                jSONObject2.put("user_name", ((f1) entry.getValue()).f53759c);
                jSONObject2.put("created_at", ((f1) entry.getValue()).d);
                jSONObject2.put("edited_at", ((f1) entry.getValue()).e);
                jSONObject.put((String) entry.getKey(), jSONObject2);
            }
            File file = new File(b(), "secure_config.json");
            byte[] bytes = jSONObject.toString().getBytes();
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            fileOutputStream.write(bytes);
            fileOutputStream.close();
        } catch (Exception e) {
            f8.g(e, true);
        }
    }

    public final byte[] a(File file) {
        byte[] bArr;
        FileInputStream fileInputStream = new FileInputStream(file);
        int length = (int) file.length();
        boolean z10 = this.d;
        if (z10) {
            int read = fileInputStream.read();
            bArr = new byte[read];
            length = (length - 1) - read;
            fileInputStream.read(bArr);
        } else {
            bArr = null;
        }
        try {
            byte[] bArr2 = new byte[length];
            fileInputStream.read(bArr2);
            fileInputStream.close();
            if (z10) {
                try {
                    Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
                    cipher.init(2, g(), new GCMParameterSpec(128, bArr));
                    return cipher.doFinal(bArr2);
                } catch (Exception e) {
                    f8.g(e, true);
                    l(file, "{}".getBytes());
                    throw new RuntimeException("UNKNOWN_ERROR");
                }
            }
            return bArr2;
        } catch (OutOfMemoryError e7) {
            f8.g(e7, true);
            throw new RuntimeException("QUOTA_EXCEEDED");
        }
    }

    public final File c() {
        long j10;
        if (this.d && TextUtils.isEmpty(this.e)) {
            HashMap i10 = i();
            Iterator it = i10.entrySet().iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                j10 = this.f53767c;
                if (!hasNext) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                if (((f1) entry.getValue()).f53758b == j10) {
                    this.e = (String) entry.getKey();
                    break;
                }
            }
            if (TextUtils.isEmpty(this.e)) {
                String uuid = UUID.randomUUID().toString();
                this.e = uuid;
                ?? obj = new Object();
                obj.f53757a = uuid;
                obj.f53758b = j10;
                obj.f53759c = o5.m(d20.i(this.f53765a).f());
                long currentTimeMillis = System.currentTimeMillis();
                obj.e = currentTimeMillis;
                obj.d = currentTimeMillis;
                i10.put(this.e, obj);
                k(i10);
            }
        }
        return d(this.e);
    }

    public final File d(String str) {
        String str2;
        File b10 = b();
        StringBuilder sb2 = new StringBuilder();
        long j10 = this.f53767c;
        boolean z10 = this.d;
        Object obj = str;
        if (!z10) {
            obj = Long.valueOf(j10);
        }
        sb2.append(obj);
        sb2.append("_");
        long j11 = this.f53766b;
        sb2.append(j11);
        String str3 = "";
        if (!z10) {
            str2 = "";
        } else {
            str2 = "_s";
        }
        sb2.append(str2);
        File file = new File(b10, sb2.toString());
        File b11 = b();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(j11);
        if (z10) {
            str3 = "_s";
        }
        sb3.append(str3);
        File file2 = new File(b11, sb3.toString());
        if (!file.exists() && file2.exists()) {
            file2.renameTo(file);
            return file;
        }
        if (z10) {
            File b12 = b();
            File file3 = new File(b12, j10 + "_" + j11 + "_s");
            if (!file.exists() && file3.exists()) {
                file3.renameTo(file);
            }
        }
        return file;
    }

    public final JSONObject e(File file) {
        if (file.exists() && file.length() <= 5242880) {
            try {
                return new JSONObject(new String(a(file)));
            } catch (Exception e) {
                f8.g(e, true);
                return new JSONObject();
            }
        }
        return new JSONObject();
    }

    public final Pair f(String str) {
        JSONObject e = e(c());
        String optString = e.optString(str);
        boolean z10 = false;
        if (this.d && optString == null && !e.keys().hasNext()) {
            HashSet hashSet = new HashSet();
            for (int i10 = 0; i10 < 4; i10++) {
                d20 i11 = d20.i(i10);
                if (i11.p()) {
                    hashSet.add(Long.valueOf(i11.e()));
                }
            }
            Iterator it = ((Set) Collection.EL.stream(i().values()).filter(new d1(hashSet, 0)).collect(Collectors.toSet())).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                try {
                    File d = d(((f1) it.next()).f53757a);
                    if (d.exists() && e(d).has(str)) {
                        z10 = true;
                        break;
                    }
                } catch (Exception e7) {
                    f8.g(e7, true);
                }
            }
        }
        return new Pair(optString, Boolean.valueOf(z10));
    }

    public final ArrayList h(String str) {
        if (!e(c()).keys().hasNext()) {
            ArrayList arrayList = new ArrayList();
            HashSet hashSet = new HashSet();
            for (int i10 = 0; i10 < 4; i10++) {
                d20 i11 = d20.i(i10);
                if (i11.p()) {
                    hashSet.add(Long.valueOf(i11.e()));
                }
            }
            for (f1 f1Var : (Set) Collection.EL.stream(i().values()).filter(new d1(hashSet, 1)).collect(Collectors.toSet())) {
                try {
                    File d = d(f1Var.f53757a);
                    if (d.exists() && e(d).has(str)) {
                        arrayList.add(f1Var);
                    }
                } catch (Exception e) {
                    f8.g(e, true);
                }
            }
            return arrayList;
        }
        throw new RuntimeException("STORAGE_NOT_EMPTY");
    }

    public final void j(String str) {
        if (!e(c()).keys().hasNext()) {
            HashSet hashSet = new HashSet();
            for (int i10 = 0; i10 < 4; i10++) {
                d20 i11 = d20.i(i10);
                if (i11.p()) {
                    hashSet.add(Long.valueOf(i11.e()));
                }
            }
            HashMap i12 = i();
            f1 f1Var = (f1) i12.get(str);
            if (f1Var != null) {
                f1Var.f53758b = this.f53767c;
                f1Var.f53759c = o5.m(d20.i(this.f53765a).f());
                f1Var.e = System.currentTimeMillis();
                k(i12);
                this.e = f1Var.f53757a;
                return;
            }
            throw new RuntimeException("STORAGE_NOT_FOUND");
        }
        throw new RuntimeException("STORAGE_NOT_EMPTY");
    }

    public final void l(File file, byte[] bArr) {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        if (this.d) {
            try {
                Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
                cipher.init(1, g());
                byte[] iv = cipher.getIV();
                fileOutputStream.write(iv.length);
                fileOutputStream.write(iv);
                bArr = cipher.doFinal(bArr);
            } catch (Exception e) {
                f8.g(e, true);
                throw new RuntimeException("UNKNOWN_ERROR");
            }
        }
        fileOutputStream.write(bArr);
        fileOutputStream.close();
    }

    public final void m(JSONObject jSONObject) {
        try {
            byte[] bytes = jSONObject.toString().getBytes();
            if (bytes.length <= 5242880) {
                try {
                    l(c(), bytes);
                    return;
                } catch (Exception e) {
                    f8.g(e, true);
                    throw new RuntimeException("UNKNOWN_ERROR");
                }
            }
            throw new RuntimeException("QUOTA_EXCEEDED");
        } catch (Exception e7) {
            f8.g(e7, true);
            throw new RuntimeException("UNKNOWN_ERROR");
        } catch (OutOfMemoryError e10) {
            f8.g(e10, true);
            throw new RuntimeException("QUOTA_EXCEEDED");
        }
    }

    public final void n(String str, String str2) {
        if (str2.length() + str.length() <= 5242880) {
            JSONObject e = e(c());
            try {
                e.put(str, str2);
                int length = e.length();
                boolean z10 = this.d;
                if (length > 10 && z10) {
                    throw new RuntimeException("QUOTA_EXCEEDED");
                }
                m(e);
                if (z10) {
                    try {
                        HashMap i10 = i();
                        f1 f1Var = (f1) i10.get(this.e);
                        if (f1Var != null) {
                            f1Var.e = System.currentTimeMillis();
                            k(i10);
                            return;
                        }
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                return;
            } catch (Exception e7) {
                f8.g(e7, true);
                throw new RuntimeException("UNKNOWN_ERROR");
            }
        }
        throw new RuntimeException("QUOTA_EXCEEDED");
    }
}
