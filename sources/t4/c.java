package t4;

import j$.util.DesugarCollections;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import z7.y;
public abstract class c {
    public static int a(String str) {
        if (str == null) {
            return 0;
        }
        try {
            return u(str);
        } catch (IllegalArgumentException unused) {
            return 0;
        }
    }

    public static int b(int i3) {
        int i10 = 1;
        if (i3 != 1) {
            i10 = 2;
            if (i3 != 2) {
                i10 = 3;
                if (i3 != 3) {
                    if (i3 == 4) {
                        return 4;
                    }
                    throw null;
                }
            }
        }
        return i10;
    }

    public static float c(float f10, float f11, float f12, float f13) {
        return (f10 * f11) + f12 + f13;
    }

    public static Object d(int i3, List list) {
        return list.get(list.size() - i3);
    }

    public static String e(long j10, String str, String str2) {
        return str + j10 + str2;
    }

    public static String f(String str, String str2) {
        return str + str2;
    }

    public static String g(String str, StringBuilder sb2) {
        return str + ((Object) sb2);
    }

    public static StringBuilder h(String str, String str2) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(str2);
        return sb2;
    }

    public static HashMap i(Class cls, x7.e eVar) {
        HashMap hashMap = new HashMap();
        hashMap.put(cls, eVar);
        return hashMap;
    }

    public static HashMap j(Class cls, y7.a aVar) {
        HashMap hashMap = new HashMap();
        hashMap.put(cls, aVar);
        return hashMap;
    }

    public static HashMap k(Class cls, y yVar) {
        HashMap hashMap = new HashMap();
        hashMap.put(cls, yVar);
        return hashMap;
    }

    public static x7.e l(HashMap hashMap, int i3) {
        DesugarCollections.unmodifiableMap(new HashMap(hashMap));
        return new x7.e(i3);
    }

    public static y7.a m(HashMap hashMap, int i3) {
        DesugarCollections.unmodifiableMap(new HashMap(hashMap));
        return new y7.a(i3);
    }

    public static y n(HashMap hashMap, int i3) {
        DesugarCollections.unmodifiableMap(new HashMap(hashMap));
        return new y(i3);
    }

    public static void o(HashMap hashMap) {
        DesugarCollections.unmodifiableMap(new HashMap(hashMap));
    }

    public static boolean p(String str) {
        return new File(str).exists();
    }

    public static String q(String str, String str2) {
        return str + str2;
    }

    public static String r(int i3) {
        switch (i3) {
            case 1:
                return "IDLE";
            case 2:
                return "STARTING";
            case 3:
                return "RECORDING";
            case 4:
                return "PAUSING";
            case 5:
                return "PREVIEWING";
            case 6:
                return "RESUMING";
            case 7:
                return "FINISHING";
            case 8:
                return "COMPLETED";
            case 9:
                return "ERROR";
            case 10:
                return "RELEASED";
            default:
                return "null";
        }
    }

    public static String s(int i3) {
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 != 3) {
                    if (i3 != 4) {
                        return "null";
                    }
                    return "ERROR";
                }
                return "CANCELLED";
            }
            return "AUDIO_REMOVED";
        }
        return "TRIMMED";
    }

    public static String t(int i3) {
        switch (i3) {
            case 1:
                return "IDLE";
            case 2:
                return "STARTING";
            case 3:
                return "RECORDING";
            case 4:
                return "PAUSING";
            case 5:
                return "PREVIEWING";
            case 6:
                return "RESUMING";
            case 7:
                return "FINISHING";
            case 8:
                return "COMPLETED";
            case 9:
                return "ERROR";
            case 10:
                return "RELEASED";
            default:
                return "null";
        }
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
