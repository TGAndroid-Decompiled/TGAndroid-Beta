package xd;

import bd.k;
import c3.i0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ld.q;
import td.e0;
public final class g extends ed.c implements wd.c {
    public final wd.c f53667a;
    public final cd.h f53668b;
    public final int f53669c;
    public cd.h d;
    public ed.c e;

    public g(wd.c cVar, cd.h hVar) {
        super(d.f53664a, cd.i.f4123a);
        this.f53667a = cVar;
        this.f53668b = hVar;
        this.f53669c = ((Number) hVar.fold(0, f.f53666b)).intValue();
    }

    @Override
    public final Object b(Object obj, ed.c cVar) {
        try {
            Object c10 = c(cVar, obj);
            if (c10 == dd.a.f5864a) {
                return c10;
            }
            return ad.j.f401a;
        } catch (Throwable th2) {
            this.d = new c(cVar.getContext(), th2);
            throw th2;
        }
    }

    public final Object c(ed.c cVar, Object obj) {
        Comparable comparable;
        int i10;
        String str;
        cd.h context = cVar.getContext();
        e0.h(context);
        cd.h hVar = this.d;
        if (hVar != context) {
            int i11 = 0;
            if (hVar instanceof c) {
                String str2 = "\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((c) hVar).f53662a + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ";
                kotlin.jvm.internal.i.e(str2, "<this>");
                List a2 = qd.d.a(new qd.e(str2, 2));
                List list = a2;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (!rd.j.e((String) obj2)) {
                        arrayList.add(obj2);
                    }
                }
                ArrayList arrayList2 = new ArrayList(k.d(arrayList));
                int size = arrayList.size();
                int i12 = 0;
                while (i12 < size) {
                    Object obj3 = arrayList.get(i12);
                    i12++;
                    String str3 = (String) obj3;
                    int length = str3.length();
                    int i13 = 0;
                    while (true) {
                        if (i13 < length) {
                            char charAt = str3.charAt(i13);
                            if (!Character.isWhitespace(charAt) && !Character.isSpaceChar(charAt)) {
                                break;
                            }
                            i13++;
                        } else {
                            i13 = -1;
                            break;
                        }
                    }
                    if (i13 == -1) {
                        i13 = str3.length();
                    }
                    arrayList2.add(Integer.valueOf(i13));
                }
                Iterator it = arrayList2.iterator();
                if (!it.hasNext()) {
                    comparable = null;
                } else {
                    comparable = (Comparable) it.next();
                    while (it.hasNext()) {
                        Comparable comparable2 = (Comparable) it.next();
                        if (comparable.compareTo(comparable2) > 0) {
                            comparable = comparable2;
                        }
                    }
                }
                Integer num = (Integer) comparable;
                if (num != null) {
                    i10 = num.intValue();
                } else {
                    i10 = 0;
                }
                int length2 = str2.length();
                a2.size();
                int a10 = bd.j.a(a2);
                ArrayList arrayList3 = new ArrayList();
                for (Object obj4 : list) {
                    int i14 = i11 + 1;
                    if (i11 >= 0) {
                        String str4 = (String) obj4;
                        if ((i11 == 0 || i11 == a10) && rd.j.e(str4)) {
                            str = null;
                        } else {
                            kotlin.jvm.internal.i.e(str4, "<this>");
                            if (i10 >= 0) {
                                int length3 = str4.length();
                                if (i10 <= length3) {
                                    length3 = i10;
                                }
                                str = str4.substring(length3);
                                kotlin.jvm.internal.i.d(str, "substring(...)");
                            } else {
                                throw new IllegalArgumentException(i0.a.j(i10, "Requested character count ", " is less than zero.").toString());
                            }
                        }
                        if (str != null) {
                            arrayList3.add(str);
                        }
                        i11 = i14;
                    } else {
                        throw new ArithmeticException("Index overflow has happened.");
                    }
                }
                StringBuilder sb2 = new StringBuilder(length2);
                bd.i.g(arrayList3, sb2, "\n", "", "", "...", null);
                throw new IllegalStateException(sb2.toString().toString());
            } else if (((Number) context.fold(0, new j(this))).intValue() == this.f53669c) {
                this.d = context;
            } else {
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.f53668b + ",\n\t\tbut emission happened in " + context + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
            }
        }
        this.e = cVar;
        q qVar = i.f53671a;
        wd.c cVar2 = this.f53667a;
        kotlin.jvm.internal.i.c(cVar2, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        Object a11 = qVar.a(cVar2, obj, this);
        if (!kotlin.jvm.internal.i.a(a11, dd.a.f5864a)) {
            this.e = null;
        }
        return a11;
    }

    @Override
    public final ed.d getCallerFrame() {
        ed.c cVar = this.e;
        if (i0.t(cVar)) {
            return cVar;
        }
        return null;
    }

    @Override
    public final cd.h getContext() {
        cd.h hVar = this.d;
        if (hVar == null) {
            return cd.i.f4123a;
        }
        return hVar;
    }

    @Override
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        Throwable a2 = ad.g.a(obj);
        if (a2 != null) {
            this.d = new c(getContext(), a2);
        }
        ed.c cVar = this.e;
        if (cVar != null) {
            cVar.resumeWith(obj);
        }
        return dd.a.f5864a;
    }
}
