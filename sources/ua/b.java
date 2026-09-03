package ua;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import k7.a8;
public final class b extends a8 {
    public final Method f48496a = Class.class.getMethod("isRecord", null);
    public final Method f48497b = Class.class.getMethod("getRecordComponents", null);
    public final Method f48498c;
    public final Method d;

    public b() {
        Class<?> cls = Class.forName("java.lang.reflect.RecordComponent");
        this.f48498c = cls.getMethod("getName", null);
        this.d = cls.getMethod("getType", null);
    }

    @Override
    public final Method a(Class cls, Field field) {
        try {
            return cls.getMethod(field.getName(), null);
        } catch (ReflectiveOperationException e6) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.11.0). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e6);
        }
    }

    @Override
    public final Constructor b(Class cls) {
        try {
            Object[] objArr = (Object[]) this.f48497b.invoke(cls, null);
            Class<?>[] clsArr = new Class[objArr.length];
            for (int i10 = 0; i10 < objArr.length; i10++) {
                clsArr[i10] = (Class) this.d.invoke(objArr[i10], null);
            }
            return cls.getDeclaredConstructor(clsArr);
        } catch (ReflectiveOperationException e6) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.11.0). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e6);
        }
    }

    @Override
    public final String[] c(Class cls) {
        try {
            Object[] objArr = (Object[]) this.f48497b.invoke(cls, null);
            String[] strArr = new String[objArr.length];
            for (int i10 = 0; i10 < objArr.length; i10++) {
                strArr[i10] = (String) this.f48498c.invoke(objArr[i10], null);
            }
            return strArr;
        } catch (ReflectiveOperationException e6) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.11.0). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e6);
        }
    }

    @Override
    public final boolean d(Class cls) {
        try {
            return ((Boolean) this.f48496a.invoke(cls, null)).booleanValue();
        } catch (ReflectiveOperationException e6) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.11.0). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e6);
        }
    }
}
