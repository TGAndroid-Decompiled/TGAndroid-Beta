package x9;

import android.util.Log;
import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;
public final class d {
    public final HashMap f51314a = new HashMap();
    public final int f51315b = 64;
    public final int f51316c;

    public d(int i10) {
        this.f51316c = i10;
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
        return DesugarCollections.unmodifiableMap(new HashMap(this.f51314a));
    }

    public final synchronized boolean c(String str, String str2) {
        boolean equals;
        String b10 = b(this.f51316c, str);
        if (this.f51314a.size() >= this.f51315b && !this.f51314a.containsKey(b10)) {
            Log.w("FirebaseCrashlytics", "Ignored entry \"" + str + "\" when adding custom keys. Maximum allowable: " + this.f51315b, null);
            return false;
        }
        String b11 = b(this.f51316c, str2);
        String str3 = (String) this.f51314a.get(b10);
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
        HashMap hashMap = this.f51314a;
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
                    String b11 = b(this.f51316c, str);
                    if (this.f51314a.size() >= this.f51315b && !this.f51314a.containsKey(b11)) {
                        i10++;
                    }
                    String str2 = (String) entry.getValue();
                    HashMap hashMap = this.f51314a;
                    if (str2 == null) {
                        b10 = "";
                    } else {
                        b10 = b(this.f51316c, str2);
                    }
                    hashMap.put(b11, b10);
                } else {
                    throw new IllegalArgumentException("Custom attribute key must not be null.");
                }
            }
            if (i10 > 0) {
                Log.w("FirebaseCrashlytics", "Ignored " + i10 + " entries when adding custom keys. Maximum allowable: " + this.f51315b, null);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
