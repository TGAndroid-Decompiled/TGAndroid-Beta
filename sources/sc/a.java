package sc;

import g7.y5;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import m.y2;
public abstract class a implements qc.c, d, Serializable {
    private final qc.c completion;

    public a(qc.c cVar) {
        this.completion = cVar;
    }

    public qc.c create(qc.c completion) {
        kotlin.jvm.internal.i.e(completion, "completion");
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    public d getCallerFrame() {
        qc.c cVar = this.completion;
        if (cVar instanceof d) {
            return (d) cVar;
        }
        return null;
    }

    public final qc.c getCompletion() {
        return this.completion;
    }

    public StackTraceElement getStackTraceElement() {
        int i9;
        String str;
        Method method;
        Object invoke;
        Method method2;
        Object invoke2;
        Object obj;
        Integer num;
        int i10;
        e eVar = (e) getClass().getAnnotation(e.class);
        String str2 = null;
        if (eVar == null) {
            return null;
        }
        int v = eVar.v();
        if (v <= 1) {
            int i11 = -1;
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
                    i10 = num.intValue();
                } else {
                    i10 = 0;
                }
                i9 = i10 - 1;
            } catch (Exception unused) {
                i9 = -1;
            }
            if (i9 >= 0) {
                i11 = eVar.l()[i9];
            }
            y2 y2Var = f.f47509b;
            y2 y2Var2 = f.f47508a;
            if (y2Var == null) {
                try {
                    y2 y2Var3 = new y2(Class.class.getDeclaredMethod("getModule", null), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null));
                    f.f47509b = y2Var3;
                    y2Var = y2Var3;
                } catch (Exception unused2) {
                    f.f47509b = y2Var2;
                    y2Var = y2Var2;
                }
            }
            if (y2Var != y2Var2 && (method = y2Var.f17152a) != null && (invoke = method.invoke(getClass(), null)) != null && (method2 = y2Var.f17153b) != null && (invoke2 = method2.invoke(invoke, null)) != null) {
                Method method3 = y2Var.f17154c;
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
            return new StackTraceElement(str, eVar.m(), eVar.f(), i11);
        }
        throw new IllegalStateException(("Debug metadata version mismatch. Expected: 1, got " + v + ". Please update the Kotlin standard library.").toString());
    }

    public abstract Object invokeSuspend(Object obj);

    @Override
    public final void resumeWith(Object obj) {
        qc.c cVar = this;
        while (true) {
            a aVar = (a) cVar;
            qc.c cVar2 = aVar.completion;
            kotlin.jvm.internal.i.b(cVar2);
            try {
                obj = aVar.invokeSuspend(obj);
                if (obj == rc.a.f47127a) {
                    return;
                }
            } catch (Throwable th) {
                obj = y5.a(th);
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

    public qc.c create(Object obj, qc.c completion) {
        kotlin.jvm.internal.i.e(completion, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public void releaseIntercepted() {
    }
}
