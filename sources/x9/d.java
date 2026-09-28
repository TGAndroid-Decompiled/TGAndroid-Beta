package x9;

import android.util.Log;
import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;
public final class d {
    public final HashMap f45987a = new HashMap();
    public final int f45988b = 64;
    public final int f45989c;

    public d(int i10) {
        this.f45989c = i10;
    }

    public static String b(int i10, String str) {
        if (str != null) {
            str = str.trim();
            if (str.length() > i10) {
                return str.substring(0, i10);
            }
        }
        return str;
    }

    public final synchronized Map a() {
        return DesugarCollections.unmodifiableMap(new HashMap(this.f45987a));
    }

    public final synchronized boolean c(String str, String str2) {
        boolean equals;
        String b10 = b(this.f45989c, str);
        if (this.f45987a.size() >= this.f45988b && !this.f45987a.containsKey(b10)) {
            Log.w("FirebaseCrashlytics", "Ignored entry \"" + str + "\" when adding custom keys. Maximum allowable: " + this.f45988b, null);
            return false;
        }
        String b11 = b(this.f45989c, str2);
        String str3 = (String) this.f45987a.get(b10);
        if (str3 == null) {
            if (b11 == null) {
                equals = true;
            } else {
                equals = false;
            }
        } else {
            equals = str3.equals(b11);
        }
        if (equals) {
            return false;
        }
        HashMap hashMap = this.f45987a;
        if (str2 == null) {
            b11 = "";
        }
        hashMap.put(b10, b11);
        return true;
    }

    public final synchronized void d(Map map) {
        String b10;
        try {
            int i10 = 0;
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str != null) {
                    String b11 = b(this.f45989c, str);
                    if (this.f45987a.size() >= this.f45988b && !this.f45987a.containsKey(b11)) {
                        i10++;
                    }
                    String str2 = (String) entry.getValue();
                    HashMap hashMap = this.f45987a;
                    if (str2 == null) {
                        b10 = "";
                    } else {
                        b10 = b(this.f45989c, str2);
                    }
                    hashMap.put(b11, b10);
                } else {
                    throw new IllegalArgumentException("Custom attribute key must not be null.");
                }
            }
            if (i10 > 0) {
                Log.w("FirebaseCrashlytics", "Ignored " + i10 + " entries when adding custom keys. Maximum allowable: " + this.f45988b, null);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
