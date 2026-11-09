package ze;

import java.util.Hashtable;
import java.util.StringTokenizer;
import ug.k0;
import ui.e;
import y7.i6;
public final class a {
    public static final Hashtable f60147b;
    public static final Object[] f60148c;
    public static Class d;
    public final ClassLoader f60149a;

    static {
        Hashtable hashtable = new Hashtable();
        f60147b = hashtable;
        hashtable.put("void", Void.TYPE);
        hashtable.put("boolean", Boolean.TYPE);
        hashtable.put("byte", Byte.TYPE);
        hashtable.put("char", Character.TYPE);
        hashtable.put("short", Short.TYPE);
        hashtable.put("int", Integer.TYPE);
        hashtable.put("long", Long.TYPE);
        hashtable.put("float", Float.TYPE);
        hashtable.put("double", Double.TYPE);
        f60148c = new Object[0];
    }

    public a(Class cls, String str) {
        this.f60149a = cls.getClassLoader();
    }

    public static Class a(ClassLoader classLoader, String str) {
        if (str.equals("*")) {
            return null;
        }
        Class cls = (Class) f60147b.get(str);
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

    public static e b(i6 i6Var, Object obj, Object obj2) {
        return new e(i6Var, obj, obj2, f60148c, 15);
    }

    public static e c(i6 i6Var, Object obj, Object obj2, Object obj3) {
        return new e(i6Var, obj, obj2, new Object[]{obj3}, 15);
    }

    public final k0 d(String str, String str2, String str3, String str4, String str5) {
        int parseInt = Integer.parseInt("1", 16);
        ClassLoader classLoader = this.f60149a;
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
        k0 k0Var = new k0(2);
        k0Var.f56688b = parseInt;
        k0Var.f56689c = str;
        k0Var.f56690e = a10;
        k0Var.f56692g = clsArr;
        k0Var.h = a11;
        return k0Var;
    }

    public final i6 e(k0 k0Var) {
        i6 i6Var = new i6(3);
        i6Var.f59061b = k0Var;
        return i6Var;
    }
}
