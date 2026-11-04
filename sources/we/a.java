package we;

import java.util.Hashtable;
import java.util.StringTokenizer;
import org.telegram.ui.Components.i9;
import ui.f;
public final class a {
    public static final Hashtable f57557b;
    public static final Object[] f57558c;
    public static Class d;
    public final ClassLoader f57559a;

    static {
        Hashtable hashtable = new Hashtable();
        f57557b = hashtable;
        hashtable.put("void", Void.TYPE);
        hashtable.put("boolean", Boolean.TYPE);
        hashtable.put("byte", Byte.TYPE);
        hashtable.put("char", Character.TYPE);
        hashtable.put("short", Short.TYPE);
        hashtable.put("int", Integer.TYPE);
        hashtable.put("long", Long.TYPE);
        hashtable.put("float", Float.TYPE);
        hashtable.put("double", Double.TYPE);
        f57558c = new Object[0];
    }

    public a(Class cls, String str) {
        this.f57559a = cls.getClassLoader();
    }

    public static Class a(ClassLoader classLoader, String str) {
        if (str.equals("*")) {
            return null;
        }
        Class cls = (Class) f57557b.get(str);
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

    public static f b(i9 i9Var, Object obj, Object obj2) {
        return new f(i9Var, obj, obj2, f57558c, 15);
    }

    public static f c(i9 i9Var, Object obj, Object obj2, Object obj3) {
        return new f(i9Var, obj, obj2, new Object[]{obj3}, 15);
    }

    public final u4.b d(String str, String str2, String str3, String str4, String str5) {
        int parseInt = Integer.parseInt("1", 16);
        ClassLoader classLoader = this.f57559a;
        Class a10 = a(classLoader, str2);
        StringTokenizer stringTokenizer = new StringTokenizer(str3, ":");
        int countTokens = stringTokenizer.countTokens();
        Class[] clsArr = new Class[countTokens];
        for (int i3 = 0; i3 < countTokens; i3++) {
            clsArr[i3] = a(classLoader, stringTokenizer.nextToken());
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
        u4.b bVar = new u4.b(2);
        bVar.f55504b = parseInt;
        bVar.f55505c = str;
        bVar.f55506e = a10;
        bVar.f55508g = clsArr;
        bVar.h = a11;
        return bVar;
    }

    public final i9 e(u4.b bVar) {
        i9 i9Var = new i9(26, false);
        i9Var.f34636b = bVar;
        return i9Var;
    }
}
