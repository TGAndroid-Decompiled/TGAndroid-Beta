package uc;

import i7.c7;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.jvm.internal.j;
import m.y2;
public abstract class a implements sc.c, d, Serializable {
    private final sc.c completion;

    public a(sc.c cVar) {
        this.completion = cVar;
    }

    public sc.c create(sc.c completion) {
        j.e(completion, "completion");
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    public d getCallerFrame() {
        sc.c cVar = this.completion;
        if (cVar instanceof d) {
            return (d) cVar;
        }
        return null;
    }

    public final sc.c getCompletion() {
        return this.completion;
    }

    public StackTraceElement getStackTraceElement() {
        int i10;
        String str;
        Method method;
        Object invoke;
        Method method2;
        Object invoke2;
        Object obj;
        Integer num;
        int i11;
        e eVar = (e) getClass().getAnnotation(e.class);
        String str2 = null;
        if (eVar == null) {
            return null;
        }
        int v = eVar.v();
        if (v <= 1) {
            int i12 = -1;
            try {
                Field declaredField = getClass().getDeclaredField("label");
                declaredField.setAccessible(true);
                Object obj2 = declaredField.get(this);
                if (obj2 instanceof Integer) {
                    num = (Integer) obj2;
                } else {
                    num = null;
                }
                if (num != null) {
                    i11 = num.intValue();
                } else {
                    i11 = 0;
                }
                i10 = i11 - 1;
            } catch (Exception unused) {
                i10 = -1;
            }
            if (i10 >= 0) {
                i12 = eVar.l()[i10];
            }
            y2 y2Var = f.f49170b;
            y2 y2Var2 = f.f49169a;
            if (y2Var == null) {
                try {
                    y2 y2Var3 = new y2(Class.class.getDeclaredMethod("getModule", null), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null));
                    f.f49170b = y2Var3;
                    y2Var = y2Var3;
                } catch (Exception unused2) {
                    f.f49170b = y2Var2;
                    y2Var = y2Var2;
                }
            }
            if (y2Var != y2Var2 && (method = y2Var.f16749a) != null && (invoke = method.invoke(getClass(), null)) != null && (method2 = y2Var.f16750b) != null && (invoke2 = method2.invoke(invoke, null)) != null) {
                Method method3 = y2Var.f16751c;
                if (method3 != null) {
                    obj = method3.invoke(invoke2, null);
                } else {
                    obj = null;
                }
                if (obj instanceof String) {
                    str2 = obj;
                }
            }
            if (str2 == null) {
                str = eVar.c();
            } else {
                str = str2 + '/' + eVar.c();
            }
            return new StackTraceElement(str, eVar.m(), eVar.f(), i12);
        }
        throw new IllegalStateException(("Debug metadata version mismatch. Expected: 1, got " + v + ". Please update the Kotlin standard library.").toString());
    }

    public abstract Object invokeSuspend(Object obj);

    @Override
    public final void resumeWith(Object obj) {
        sc.c cVar = this;
        while (true) {
            a aVar = (a) cVar;
            sc.c cVar2 = aVar.completion;
            j.b(cVar2);
            try {
                obj = aVar.invokeSuspend(obj);
                if (obj == tc.a.f48210a) {
                    return;
                }
            } catch (Throwable th2) {
                obj = c7.a(th2);
            }
            aVar.releaseIntercepted();
            if (cVar2 instanceof a) {
                cVar = cVar2;
            } else {
                cVar2.resumeWith(obj);
                return;
            }
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb2.append(stackTraceElement);
        return sb2.toString();
    }

    public sc.c create(Object obj, sc.c completion) {
        j.e(completion, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public void releaseIntercepted() {
    }
}
