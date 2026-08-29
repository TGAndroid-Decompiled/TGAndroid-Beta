package sa;

import a4.w;
import i7.r7;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
public abstract class c {
    public static final r7 f47694a;

    static {
        b bVar;
        try {
            bVar = new b();
        } catch (ReflectiveOperationException unused) {
            bVar = new Object();
        }
        f47694a = bVar;
    }

    public static void a(AccessibleObject accessibleObject, StringBuilder sb2) {
        Class<?>[] parameterTypes;
        sb2.append('(');
        if (accessibleObject instanceof Method) {
            parameterTypes = ((Method) accessibleObject).getParameterTypes();
        } else {
            parameterTypes = ((Constructor) accessibleObject).getParameterTypes();
        }
        for (int i10 = 0; i10 < parameterTypes.length; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            sb2.append(parameterTypes[i10].getSimpleName());
        }
        sb2.append(')');
    }

    public static String b(Constructor constructor) {
        StringBuilder sb2 = new StringBuilder(constructor.getDeclaringClass().getName());
        a(constructor, sb2);
        return sb2.toString();
    }

    public static String c(Field field) {
        return field.getDeclaringClass().getName() + "#" + field.getName();
    }

    public static String d(AccessibleObject accessibleObject, boolean z10) {
        String str;
        if (accessibleObject instanceof Field) {
            str = "field '" + c((Field) accessibleObject) + "'";
        } else if (accessibleObject instanceof Method) {
            Method method = (Method) accessibleObject;
            StringBuilder sb2 = new StringBuilder(method.getName());
            a(method, sb2);
            str = "method '" + method.getDeclaringClass().getName() + "#" + sb2.toString() + "'";
        } else if (accessibleObject instanceof Constructor) {
            str = "constructor '" + b((Constructor) accessibleObject) + "'";
        } else {
            str = "<unknown AccessibleObject> " + accessibleObject.toString();
        }
        if (z10 && Character.isLowerCase(str.charAt(0))) {
            return Character.toUpperCase(str.charAt(0)) + str.substring(1);
        }
        return str;
    }

    public static String e(Exception exc) {
        String str;
        if (exc.getClass().getName().equals("java.lang.reflect.InaccessibleObjectException")) {
            String message = exc.getMessage();
            if (message != null && message.contains("to module com.google.gson")) {
                str = "reflection-inaccessible-to-module-gson";
            } else {
                str = "reflection-inaccessible";
            }
            return "\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat(str);
        }
        return "";
    }

    public static void f(AccessibleObject accessibleObject) {
        try {
            accessibleObject.setAccessible(true);
        } catch (Exception e10) {
            StringBuilder s10 = w.s("Failed making ", d(accessibleObject, false), " accessible; either increase its visibility or write a custom TypeAdapter for its declaring type.");
            s10.append(e(e10));
            throw new RuntimeException(s10.toString(), e10);
        }
    }
}
