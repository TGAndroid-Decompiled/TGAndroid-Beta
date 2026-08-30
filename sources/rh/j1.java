package rh;

import android.os.Build;
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
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.UserConfig;
public final class j1 {
    public final int f43566a;
    public final long f43567b;
    public final long f43568c;
    public final boolean d;
    public String e;

    public j1(long j10, long j11, int i10, boolean z4) {
        this.f43566a = i10;
        this.f43567b = j11;
        this.f43568c = j10;
        this.d = z4;
    }

    public static File b() {
        try {
            File filesDir = ApplicationLoader.applicationContext.getFilesDir();
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
        if (Build.VERSION.SDK_INT >= 23) {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            if (!keyStore.containsAlias("MiniAppsKey")) {
                KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
                keyGenerator.init(new KeyGenParameterSpec.Builder("MiniAppsKey", 3).setBlockModes("GCM").setEncryptionPaddings("NoPadding").setUserAuthenticationRequired(false).build());
                keyGenerator.generateKey();
            }
            return (SecretKey) keyStore.getKey("MiniAppsKey", null);
        }
        throw new RuntimeException("UNSUPPORTED");
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
                    obj.f43559a = next;
                    obj.f43560b = jSONObject2.getLong("user_id");
                    obj.f43561c = jSONObject2.getString("user_name");
                    obj.d = jSONObject2.getLong("created_at");
                    obj.e = jSONObject2.getLong("edited_at");
                    hashMap.put(next, obj);
                }
                return hashMap;
            } catch (OutOfMemoryError e) {
                FileLog.e(e);
                throw new RuntimeException("QUOTA_EXCEEDED");
            }
        } catch (Exception e6) {
            FileLog.e(e6);
            return hashMap;
        }
    }

    public static void k(HashMap hashMap) {
        try {
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry entry : hashMap.entrySet()) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("user_id", ((i1) entry.getValue()).f43560b);
                jSONObject2.put("user_name", ((i1) entry.getValue()).f43561c);
                jSONObject2.put("created_at", ((i1) entry.getValue()).d);
                jSONObject2.put("edited_at", ((i1) entry.getValue()).e);
                jSONObject.put((String) entry.getKey(), jSONObject2);
            }
            File file = new File(b(), "secure_config.json");
            byte[] bytes = jSONObject.toString().getBytes();
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            fileOutputStream.write(bytes);
            fileOutputStream.close();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final byte[] a(File file) {
        byte[] bArr;
        FileInputStream fileInputStream = new FileInputStream(file);
        int length = (int) file.length();
        boolean z4 = this.d;
        if (z4) {
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
            if (z4) {
                try {
                    Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
                    cipher.init(2, g(), new GCMParameterSpec(128, bArr));
                    return cipher.doFinal(bArr2);
                } catch (Exception e) {
                    FileLog.e(e);
                    l(file, "{}".getBytes());
                    throw new RuntimeException("UNKNOWN_ERROR");
                }
            }
            return bArr2;
        } catch (OutOfMemoryError e6) {
            FileLog.e(e6);
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
                j10 = this.f43568c;
                if (!hasNext) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                if (((i1) entry.getValue()).f43560b == j10) {
                    this.e = (String) entry.getKey();
                    break;
                }
            }
            if (TextUtils.isEmpty(this.e)) {
                String uuid = UUID.randomUUID().toString();
                this.e = uuid;
                ?? obj = new Object();
                obj.f43559a = uuid;
                obj.f43560b = j10;
                obj.f43561c = DialogObject.getName(UserConfig.getInstance(this.f43566a).getCurrentUser());
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
        StringBuilder sb = new StringBuilder();
        long j10 = this.f43568c;
        boolean z4 = this.d;
        Object obj = str;
        if (!z4) {
            obj = Long.valueOf(j10);
        }
        sb.append(obj);
        sb.append("_");
        long j11 = this.f43567b;
        sb.append(j11);
        String str3 = "";
        if (!z4) {
            str2 = "";
        } else {
            str2 = "_s";
        }
        sb.append(str2);
        File file = new File(b10, sb.toString());
        File b11 = b();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(j11);
        if (z4) {
            str3 = "_s";
        }
        sb2.append(str3);
        File file2 = new File(b11, sb2.toString());
        if (!file.exists() && file2.exists()) {
            file2.renameTo(file);
            return file;
        }
        if (z4) {
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
                FileLog.e(e);
                return new JSONObject();
            }
        }
        return new JSONObject();
    }

    public final Pair f(String str) {
        boolean z4 = this.d;
        if (z4 && Build.VERSION.SDK_INT < 23) {
            throw new RuntimeException("UNSUPPORTED");
        }
        JSONObject e = e(c());
        String optString = e.optString(str);
        boolean z10 = false;
        if (z4 && optString == null && !e.keys().hasNext()) {
            HashSet hashSet = new HashSet();
            for (int i10 = 0; i10 < 4; i10++) {
                UserConfig userConfig = UserConfig.getInstance(i10);
                if (userConfig.isClientActivated()) {
                    hashSet.add(Long.valueOf(userConfig.getClientUserId()));
                }
            }
            Iterator it = ((Set) Collection.EL.stream(i().values()).filter(new g1(hashSet, 0)).collect(Collectors.toSet())).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                try {
                    File d = d(((i1) it.next()).f43559a);
                    if (d.exists() && e(d).has(str)) {
                        z10 = true;
                        break;
                    }
                } catch (Exception e6) {
                    FileLog.e(e6);
                }
            }
        }
        return new Pair(optString, Boolean.valueOf(z10));
    }

    public final ArrayList h(String str) {
        if (this.d && Build.VERSION.SDK_INT < 23) {
            throw new RuntimeException("UNSUPPORTED");
        }
        if (!e(c()).keys().hasNext()) {
            ArrayList arrayList = new ArrayList();
            HashSet hashSet = new HashSet();
            for (int i10 = 0; i10 < 4; i10++) {
                UserConfig userConfig = UserConfig.getInstance(i10);
                if (userConfig.isClientActivated()) {
                    hashSet.add(Long.valueOf(userConfig.getClientUserId()));
                }
            }
            for (i1 i1Var : (Set) Collection.EL.stream(i().values()).filter(new g1(hashSet, 1)).collect(Collectors.toSet())) {
                try {
                    File d = d(i1Var.f43559a);
                    if (d.exists() && e(d).has(str)) {
                        arrayList.add(i1Var);
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
            return arrayList;
        }
        throw new RuntimeException("STORAGE_NOT_EMPTY");
    }

    public final void j(String str) {
        if (this.d && Build.VERSION.SDK_INT < 23) {
            throw new RuntimeException("UNSUPPORTED");
        }
        if (!e(c()).keys().hasNext()) {
            HashSet hashSet = new HashSet();
            for (int i10 = 0; i10 < 4; i10++) {
                UserConfig userConfig = UserConfig.getInstance(i10);
                if (userConfig.isClientActivated()) {
                    hashSet.add(Long.valueOf(userConfig.getClientUserId()));
                }
            }
            HashMap i11 = i();
            i1 i1Var = (i1) i11.get(str);
            if (i1Var != null) {
                i1Var.f43560b = this.f43568c;
                i1Var.f43561c = DialogObject.getName(UserConfig.getInstance(this.f43566a).getCurrentUser());
                i1Var.e = System.currentTimeMillis();
                k(i11);
                this.e = i1Var.f43559a;
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
                FileLog.e(e);
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
                    FileLog.e(e);
                    throw new RuntimeException("UNKNOWN_ERROR");
                }
            }
            throw new RuntimeException("QUOTA_EXCEEDED");
        } catch (Exception e6) {
            FileLog.e(e6);
            throw new RuntimeException("UNKNOWN_ERROR");
        } catch (OutOfMemoryError e10) {
            FileLog.e(e10);
            throw new RuntimeException("QUOTA_EXCEEDED");
        }
    }

    public final void n(String str, String str2) {
        boolean z4 = this.d;
        if (z4 && Build.VERSION.SDK_INT < 23) {
            throw new RuntimeException("UNSUPPORTED");
        }
        if (str2.length() + str.length() <= 5242880) {
            JSONObject e = e(c());
            try {
                e.put(str, str2);
                if (e.length() > 10 && z4) {
                    throw new RuntimeException("QUOTA_EXCEEDED");
                }
                m(e);
                if (z4) {
                    try {
                        HashMap i10 = i();
                        i1 i1Var = (i1) i10.get(this.e);
                        if (i1Var != null) {
                            i1Var.e = System.currentTimeMillis();
                            k(i10);
                            return;
                        }
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                return;
            } catch (Exception e6) {
                FileLog.e(e6);
                throw new RuntimeException("UNKNOWN_ERROR");
            }
        }
        throw new RuntimeException("QUOTA_EXCEEDED");
    }
}
