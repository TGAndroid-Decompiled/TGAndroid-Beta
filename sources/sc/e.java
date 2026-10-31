package sc;

import android.os.Parcel;
import android.view.View;
import android.widget.TextView;
import e9.k0;
import e9.n0;
import j$.util.DesugarCollections;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import n4.q;
import org.telegram.messenger.cd;
import org.telegram.messenger.i0;
import org.telegram.ui.Components.ck0;
import s4.c1;
import s4.o0;
import x7.z;
import z3.l;
import z3.m;
import z7.s;
import z7.w;
import zf.k;
public abstract class e {
    public static String A(String str, String str2) {
        return str + str2;
    }

    public static int B(String str) {
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

    public static z3.b a(m mVar, byte[] bArr, int i10) {
        k0 t10 = n0.t();
        mVar.z(bArr, 0, i10, l.f54571c, new wh.b(t10, 13));
        return new z3.b(t10.f());
    }

    public static int b(String str) {
        if (str == null) {
            return 0;
        }
        try {
            return B(str);
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

    public static float d(float f7, float f10, float f11, float f12) {
        return (f7 * f10) + f11 + f12;
    }

    public static int e(int i10, int i11, ArrayList arrayList) {
        return i11 - (arrayList.size() + i10);
    }

    public static ja.c f(int i10, q qVar) {
        Map unmodifiableMap;
        s sVar = new s(i10);
        if (((HashMap) qVar.f13527b) == null) {
            qVar.f13527b = new HashMap();
        }
        ((HashMap) qVar.f13527b).put(w.class, sVar);
        String str = (String) qVar.f13526a;
        if (((HashMap) qVar.f13527b) == null) {
            unmodifiableMap = Collections.EMPTY_MAP;
        } else {
            unmodifiableMap = DesugarCollections.unmodifiableMap(new HashMap((HashMap) qVar.f13527b));
        }
        return new ja.c(str, unmodifiableMap);
    }

    public static Object g(int i10, List list) {
        return list.get(list.size() - i10);
    }

    public static String h(String str, String str2) {
        return str + str2;
    }

    public static StringBuilder i(String str, String str2) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(str2);
        return sb2;
    }

    public static UnsupportedOperationException j(Parcel parcel) {
        f8.a.b(parcel);
        return new UnsupportedOperationException();
    }

    public static HashMap k(Class cls, v7.e eVar) {
        HashMap hashMap = new HashMap();
        hashMap.put(cls, eVar);
        return hashMap;
    }

    public static HashMap l(Class cls, w7.a aVar) {
        HashMap hashMap = new HashMap();
        hashMap.put(cls, aVar);
        return hashMap;
    }

    public static HashMap m(Class cls, z zVar) {
        HashMap hashMap = new HashMap();
        hashMap.put(cls, zVar);
        return hashMap;
    }

    public static HashMap n(Class cls, s sVar) {
        HashMap hashMap = new HashMap();
        hashMap.put(cls, sVar);
        return hashMap;
    }

    public static ck0 o(View view, View view2, int i10, int i11) {
        view.setLayoutParams(new o0(i10, i11));
        return new c1(view2);
    }

    public static v7.e p(HashMap hashMap, int i10) {
        DesugarCollections.unmodifiableMap(new HashMap(hashMap));
        return new v7.e(i10);
    }

    public static w7.a q(HashMap hashMap, int i10) {
        DesugarCollections.unmodifiableMap(new HashMap(hashMap));
        return new w7.a(i10);
    }

    public static z r(HashMap hashMap, int i10) {
        DesugarCollections.unmodifiableMap(new HashMap(hashMap));
        return new z(i10);
    }

    public static s s(HashMap hashMap, int i10) {
        DesugarCollections.unmodifiableMap(new HashMap(hashMap));
        return new s(i10);
    }

    public static void t(TextView textView, int i10, float f7) {
        textView.setTextSize(i10, f7);
        textView.setTypeface(i0.o());
    }

    public static void u(TextView textView, int i10, float f7, String str, int i11) {
        textView.setTextSize(i10, f7);
        textView.setText(cd.L0(i11, str));
    }

    public static void v(HashMap hashMap) {
        DesugarCollections.unmodifiableMap(new HashMap(hashMap));
    }

    public static void w(zf.m mVar, int i10, ArrayList arrayList) {
        arrayList.add(new k(mVar, i10));
    }

    public static boolean x(String str) {
        return new File(str).exists();
    }

    public static boolean y(String str, String str2, String str3) {
        return str3.contains(str + str2);
    }

    public static float z(float f7, float f10, float f11, float f12) {
        return f12 - ((f7 - f10) * f11);
    }
}
