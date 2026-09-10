package w;

import android.os.Bundle;
import android.os.Parcel;
import bi.i5;
import e9.f0;
import e9.i0;
import j$.util.DesugarCollections;
import java.io.File;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.telegram.messenger.AndroidUtilities;
import x7.z;
import z3.l;
import z3.m;
import z7.s;
import z7.w;
public abstract class f {
    public static z3.b a(m mVar, byte[] bArr, int i10) {
        f0 u10 = i0.u();
        mVar.A(bArr, 0, i10, l.f47215c, new i5(u10, 8));
        return new z3.b(u10.i());
    }

    public static int b(String str) {
        if (str == null) {
            return 0;
        }
        try {
            return p(str);
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

    public static ia.c f(int i10, of.b bVar) {
        Map unmodifiableMap;
        s sVar = new s(i10);
        if (((HashMap) bVar.f14295c) == null) {
            bVar.f14295c = new HashMap();
        }
        ((HashMap) bVar.f14295c).put(w.class, sVar);
        String str = (String) bVar.f14294b;
        if (((HashMap) bVar.f14295c) == null) {
            unmodifiableMap = Collections.EMPTY_MAP;
        } else {
            unmodifiableMap = DesugarCollections.unmodifiableMap(new HashMap((HashMap) bVar.f14295c));
        }
        return new ia.c(str, unmodifiableMap);
    }

    public static StringBuilder g(String str, String str2) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(str2);
        return sb2;
    }

    public static UnsupportedOperationException h(Parcel parcel) {
        f8.a.b(parcel);
        return new UnsupportedOperationException();
    }

    public static HashMap i(Class cls, w7.a aVar) {
        HashMap hashMap = new HashMap();
        hashMap.put(cls, aVar);
        return hashMap;
    }

    public static HashMap j(Class cls, z zVar) {
        HashMap hashMap = new HashMap();
        hashMap.put(cls, zVar);
        return hashMap;
    }

    public static HashMap k(Class cls, s sVar) {
        HashMap hashMap = new HashMap();
        hashMap.put(cls, sVar);
        return hashMap;
    }

    public static w7.a l(int i10, HashMap hashMap) {
        DesugarCollections.unmodifiableMap(new HashMap(hashMap));
        return new w7.a(i10);
    }

    public static z m(int i10, HashMap hashMap) {
        DesugarCollections.unmodifiableMap(new HashMap(hashMap));
        return new z(i10);
    }

    public static s n(int i10, HashMap hashMap) {
        DesugarCollections.unmodifiableMap(new HashMap(hashMap));
        return new s(i10);
    }

    public static boolean o(String str) {
        return new File(str).exists();
    }

    public static int p(String str) {
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
