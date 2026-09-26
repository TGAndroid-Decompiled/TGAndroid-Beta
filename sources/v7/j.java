package v7;

import android.os.Bundle;
import android.os.Parcel;
import j$.util.DesugarCollections;
import java.io.File;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.telegram.messenger.AndroidUtilities;
public abstract class j {
    public static z3.b a(z3.m mVar, byte[] bArr, int i10) {
        e9.f0 u10 = e9.i0.u();
        mVar.C(bArr, 0, i10, z3.l.f48372c, new r5.d(u10, 29));
        return new z3.b(u10.i());
    }

    public static int b(String str) {
        if (str == null) {
            return 0;
        }
        try {
            return u(str);
        } catch (IllegalArgumentException unused) {
            return 0;
        }
    }

    public static int c(int i10) {
        int i11 = 1;
        if (i10 != 1) {
            i11 = 2;
            if (i10 != 2) {
                i11 = 3;
                if (i10 != 3) {
                    if (i10 == 4) {
                        return 4;
                    }
                    throw null;
                }
            }
        }
        return i11;
    }

    public static int d(Float f7, float f10) {
        return AndroidUtilities.dp(f7.floatValue() * f10);
    }

    public static Bundle e(long j3, String str) {
        Bundle bundle = new Bundle();
        bundle.putLong(str, j3);
        return bundle;
    }

    public static ia.c f(int i10, n4.y yVar) {
        Map unmodifiableMap;
        z7.s sVar = new z7.s(i10);
        if (((HashMap) yVar.f15223c) == null) {
            yVar.f15223c = new HashMap();
        }
        ((HashMap) yVar.f15223c).put(z7.w.class, sVar);
        String str = (String) yVar.f15222b;
        if (((HashMap) yVar.f15223c) == null) {
            unmodifiableMap = Collections.EMPTY_MAP;
        } else {
            unmodifiableMap = DesugarCollections.unmodifiableMap(new HashMap((HashMap) yVar.f15223c));
        }
        return new ia.c(str, unmodifiableMap);
    }

    public static String g(String str, String str2) {
        return str + str2;
    }

    public static StringBuilder h(String str, String str2) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(str2);
        return sb2;
    }

    public static UnsupportedOperationException i(Parcel parcel) {
        f8.a.b(parcel);
        return new UnsupportedOperationException();
    }

    public static HashMap j(Class cls, e eVar) {
        HashMap hashMap = new HashMap();
        hashMap.put(cls, eVar);
        return hashMap;
    }

    public static HashMap k(Class cls, w7.a aVar) {
        HashMap hashMap = new HashMap();
        hashMap.put(cls, aVar);
        return hashMap;
    }

    public static HashMap l(Class cls, x7.z zVar) {
        HashMap hashMap = new HashMap();
        hashMap.put(cls, zVar);
        return hashMap;
    }

    public static HashMap m(Class cls, z7.s sVar) {
        HashMap hashMap = new HashMap();
        hashMap.put(cls, sVar);
        return hashMap;
    }

    public static e n(int i10, HashMap hashMap) {
        DesugarCollections.unmodifiableMap(new HashMap(hashMap));
        return new e(i10);
    }

    public static w7.a o(int i10, HashMap hashMap) {
        DesugarCollections.unmodifiableMap(new HashMap(hashMap));
        return new w7.a(i10);
    }

    public static x7.z p(int i10, HashMap hashMap) {
        DesugarCollections.unmodifiableMap(new HashMap(hashMap));
        return new x7.z(i10);
    }

    public static z7.s q(int i10, HashMap hashMap) {
        DesugarCollections.unmodifiableMap(new HashMap(hashMap));
        return new z7.s(i10);
    }

    public static void r(HashMap hashMap) {
        DesugarCollections.unmodifiableMap(new HashMap(hashMap));
    }

    public static boolean s(String str) {
        return new File(str).exists();
    }

    public static String t(String str, String str2) {
        return str + str2;
    }

    public static int u(String str) {
        if (str != null) {
            if (str.equals("GET")) {
                return 1;
            }
            if (str.equals("PUT")) {
                return 2;
            }
            if (str.equals("POST")) {
                return 3;
            }
            if (str.equals("DELETE")) {
                return 4;
            }
            if (str.equals("HEAD")) {
                return 5;
            }
            if (str.equals("OPTIONS")) {
                return 6;
            }
            if (str.equals("TRACE")) {
                return 7;
            }
            if (str.equals("CONNECT")) {
                return 8;
            }
            if (str.equals("PATCH")) {
                return 9;
            }
            if (str.equals("PROPFIND")) {
                return 10;
            }
            if (str.equals("PROPPATCH")) {
                return 11;
            }
            if (str.equals("MKCOL")) {
                return 12;
            }
            if (str.equals("MOVE")) {
                return 13;
            }
            if (str.equals("COPY")) {
                return 14;
            }
            if (str.equals("LOCK")) {
                return 15;
            }
            if (str.equals("UNLOCK")) {
                return 16;
            }
            throw new IllegalArgumentException("No enum constant fi.iki.elonen.NanoHTTPD.Method.".concat(str));
        }
        throw new NullPointerException("Name is null");
    }
}
