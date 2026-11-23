package ze;

import ab.c0;
import java.util.Hashtable;
import java.util.StringTokenizer;
import ug.m0;
public final class a {
    public static final Hashtable f62040b;
    public static final Object[] f62041c;
    public static Class d;
    public final ClassLoader f62042a;

    static {
        Hashtable hashtable = new Hashtable();
        f62040b = hashtable;
        hashtable.put("void", Void.TYPE);
        hashtable.put("boolean", Boolean.TYPE);
        hashtable.put("byte", Byte.TYPE);
        hashtable.put("char", Character.TYPE);
        hashtable.put("short", Short.TYPE);
        hashtable.put("int", Integer.TYPE);
        hashtable.put("long", Long.TYPE);
        hashtable.put("float", Float.TYPE);
        hashtable.put("double", Double.TYPE);
        f62041c = new Object[0];
    }

    public a(Class cls, String str) {
        this.f62042a = cls.getClassLoader();
    }

    public static Class a(ClassLoader classLoader, String str) {
        if (str.equals("*")) {
            return null;
        }
        Class cls = (Class) f62040b.get(str);
        if (cls != null) {
            return cls;
        }
        try {
            if (classLoader == null) {
                return Class.forName(str);
            }
            return Class.forName(str, false, classLoader);
        } catch (ClassNotFoundException unused) {
            Class<?> cls2 = d;
            if (cls2 == null) {
                try {
                    cls2 = Class.forName("java.lang.ClassNotFoundException");
                    d = cls2;
                } catch (ClassNotFoundException e10) {
                    throw new NoClassDefFoundError(e10.getMessage());
                }
            }
            return cls2;
        }
    }

    public static c0 b(v4.b bVar, Object obj, Object obj2) {
        return new c0(bVar, obj, obj2, f62041c, false, 16);
    }

    public static c0 c(v4.b bVar, Object obj, Object obj2, Object obj3) {
        return new c0(bVar, obj, obj2, new Object[]{obj3}, false, 16);
    }

    public final m0 d(String str, String str2, String str3, String str4, String str5) {
        int parseInt = Integer.parseInt("1", 16);
        ClassLoader classLoader = this.f62042a;
        Class a10 = a(classLoader, str2);
        StringTokenizer stringTokenizer = new StringTokenizer(str3, ":");
        int countTokens = stringTokenizer.countTokens();
        Class[] clsArr = new Class[countTokens];
        for (int i7 = 0; i7 < countTokens; i7++) {
            clsArr[i7] = a(classLoader, stringTokenizer.nextToken());
        }
        StringTokenizer stringTokenizer2 = new StringTokenizer(str4, ":");
        int countTokens2 = stringTokenizer2.countTokens();
        String[] strArr = new String[countTokens2];
        for (int i10 = 0; i10 < countTokens2; i10++) {
            strArr[i10] = stringTokenizer2.nextToken();
        }
        StringTokenizer stringTokenizer3 = new StringTokenizer("", ":");
        int countTokens3 = stringTokenizer3.countTokens();
        Class[] clsArr2 = new Class[countTokens3];
        for (int i11 = 0; i11 < countTokens3; i11++) {
            clsArr2[i11] = a(classLoader, stringTokenizer3.nextToken());
        }
        Class a11 = a(classLoader, str5);
        m0 m0Var = new m0(2);
        m0Var.f58897b = parseInt;
        m0Var.f58898c = str;
        m0Var.f58899e = a10;
        m0Var.f58901g = clsArr;
        m0Var.h = a11;
        return m0Var;
    }

    public final v4.b e(m0 m0Var) {
        v4.b bVar = new v4.b();
        bVar.f59186b = m0Var;
        return bVar;
    }
}
