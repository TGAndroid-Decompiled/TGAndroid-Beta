package sa;

import i7.r7;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
public final class b extends r7 {
    public final Method f47691a = Class.class.getMethod("isRecord", null);
    public final Method f47692b = Class.class.getMethod("getRecordComponents", null);
    public final Method f47693c;
    public final Method d;

    public b() {
        Class<?> cls = Class.forName("java.lang.reflect.RecordComponent");
        this.f47693c = cls.getMethod("getName", null);
        this.d = cls.getMethod("getType", null);
    }

    @Override
    public final Method a(Class cls, Field field) {
        try {
            return cls.getMethod(field.getName(), null);
        } catch (ReflectiveOperationException e10) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.11.0). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e10);
        }
    }

    @Override
    public final Constructor b(Class cls) {
        try {
            Object[] objArr = (Object[]) this.f47692b.invoke(cls, null);
            Class<?>[] clsArr = new Class[objArr.length];
            for (int i10 = 0; i10 < objArr.length; i10++) {
                clsArr[i10] = (Class) this.d.invoke(objArr[i10], null);
            }
            return cls.getDeclaredConstructor(clsArr);
        } catch (ReflectiveOperationException e10) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.11.0). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e10);
        }
    }

    @Override
    public final String[] c(Class cls) {
        try {
            Object[] objArr = (Object[]) this.f47692b.invoke(cls, null);
            String[] strArr = new String[objArr.length];
            for (int i10 = 0; i10 < objArr.length; i10++) {
                strArr[i10] = (String) this.f47693c.invoke(objArr[i10], null);
            }
            return strArr;
        } catch (ReflectiveOperationException e10) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.11.0). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e10);
        }
    }

    @Override
    public final boolean d(Class cls) {
        try {
            return ((Boolean) this.f47691a.invoke(cls, null)).booleanValue();
        } catch (ReflectiveOperationException e10) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.11.0). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e10);
        }
    }
}
