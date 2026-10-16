package te;

import com.google.firebase.messaging.s;
import java.util.Hashtable;
import java.util.StringTokenizer;
import ji.w4;
public final class a {
    public static final Hashtable f45634b;
    public static final Object[] f45635c;
    public static Class d;
    public final ClassLoader f45636a;

    static {
        Hashtable hashtable = new Hashtable();
        f45634b = hashtable;
        hashtable.put("void", Void.TYPE);
        hashtable.put("boolean", Boolean.TYPE);
        hashtable.put("byte", Byte.TYPE);
        hashtable.put("char", Character.TYPE);
        hashtable.put("short", Short.TYPE);
        hashtable.put("int", Integer.TYPE);
        hashtable.put("long", Long.TYPE);
        hashtable.put("float", Float.TYPE);
        hashtable.put("double", Double.TYPE);
        f45635c = new Object[0];
    }

    public a(Class cls, String str) {
        this.f45636a = cls.getClassLoader();
    }

    public static Class a(ClassLoader classLoader, String str) {
        if (str.equals("*")) {
            return null;
        }
        Class cls = (Class) f45634b.get(str);
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
                } catch (ClassNotFoundException e) {
                    throw new NoClassDefFoundError(e.getMessage());
                }
            }
            return cls2;
        }
    }

    public static s b(w4 w4Var, Object obj, Object obj2) {
        return new s(w4Var, obj, obj2, f45635c);
    }

    public static s c(w4 w4Var, Object obj, Object obj2, Object obj3) {
        return new s(w4Var, obj, obj2, new Object[]{obj3});
    }

    public final s4.b d(String str, String str2, String str3, String str4, String str5) {
        int parseInt = Integer.parseInt("1", 16);
        ClassLoader classLoader = this.f45636a;
        Class a2 = a(classLoader, str2);
        StringTokenizer stringTokenizer = new StringTokenizer(str3, ":");
        int countTokens = stringTokenizer.countTokens();
        Class[] clsArr = new Class[countTokens];
        for (int i10 = 0; i10 < countTokens; i10++) {
            clsArr[i10] = a(classLoader, stringTokenizer.nextToken());
        }
        StringTokenizer stringTokenizer2 = new StringTokenizer(str4, ":");
        int countTokens2 = stringTokenizer2.countTokens();
        String[] strArr = new String[countTokens2];
        for (int i11 = 0; i11 < countTokens2; i11++) {
            strArr[i11] = stringTokenizer2.nextToken();
        }
        StringTokenizer stringTokenizer3 = new StringTokenizer("", ":");
        int countTokens3 = stringTokenizer3.countTokens();
        Class[] clsArr2 = new Class[countTokens3];
        for (int i12 = 0; i12 < countTokens3; i12++) {
            clsArr2[i12] = a(classLoader, stringTokenizer3.nextToken());
        }
        Class a10 = a(classLoader, str5);
        s4.b bVar = new s4.b(3);
        bVar.f44822b = parseInt;
        bVar.f44823c = str;
        bVar.e = a2;
        bVar.f44825g = clsArr;
        bVar.h = a10;
        return bVar;
    }

    public final w4 e(s4.b bVar) {
        w4 w4Var = new w4(28);
        w4Var.f13595b = bVar;
        return w4Var;
    }
}
