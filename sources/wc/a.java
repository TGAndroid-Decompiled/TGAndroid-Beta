package wc;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import k7.p7;
import kotlin.jvm.internal.j;
import m.y2;
public abstract class a implements uc.c, d, Serializable {
    private final uc.c completion;

    public a(uc.c cVar) {
        this.completion = cVar;
    }

    public uc.c create(uc.c completion) {
        j.e(completion, "completion");
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    public d getCallerFrame() {
        uc.c cVar = this.completion;
        if (cVar instanceof d) {
            return (d) cVar;
        }
        return null;
    }

    public final uc.c getCompletion() {
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
            y2 y2Var = f.f46594b;
            y2 y2Var2 = f.f46593a;
            if (y2Var == null) {
                try {
                    y2 y2Var3 = new y2(Class.class.getDeclaredMethod("getModule", null), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null));
                    f.f46594b = y2Var3;
                    y2Var = y2Var3;
                } catch (Exception unused2) {
                    f.f46594b = y2Var2;
                    y2Var = y2Var2;
                }
            }
            if (y2Var != y2Var2 && (method = y2Var.f13680a) != null && (invoke = method.invoke(getClass(), null)) != null && (method2 = y2Var.f13681b) != null && (invoke2 = method2.invoke(invoke, null)) != null) {
                Method method3 = y2Var.f13682c;
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
        uc.c cVar = this;
        while (true) {
            a aVar = (a) cVar;
            uc.c cVar2 = aVar.completion;
            j.b(cVar2);
            try {
                obj = aVar.invokeSuspend(obj);
                if (obj == vc.a.f45727a) {
                    return;
                }
            } catch (Throwable th2) {
                obj = p7.a(th2);
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
        StringBuilder sb = new StringBuilder("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb.append(stackTraceElement);
        return sb.toString();
    }

    public uc.c create(Object obj, uc.c completion) {
        j.e(completion, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public void releaseIntercepted() {
    }
}
