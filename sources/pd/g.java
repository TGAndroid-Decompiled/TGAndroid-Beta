package pd;

import dd.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kh.a2;
import ld.e0;
public final class g extends wc.c implements od.c {
    public final od.c f41195a;
    public final uc.h f41196b;
    public final int f41197c;
    public uc.h d;
    public wc.c e;

    public g(od.c cVar, uc.h hVar) {
        super(d.f41192a, uc.i.f45219a);
        this.f41195a = cVar;
        this.f41196b = hVar;
        this.f41197c = ((Number) hVar.fold(0, f.f41194b)).intValue();
    }

    @Override
    public final Object c(Object obj, wc.c cVar) {
        try {
            Object d = d(cVar, obj);
            if (d == vc.a.f45663a) {
                return d;
            }
            return sc.i.f44253a;
        } catch (Throwable th2) {
            this.d = new c(th2, cVar.getContext());
            throw th2;
        }
    }

    public final Object d(wc.c cVar, Object obj) {
        Comparable comparable;
        int i10;
        String str;
        uc.h context = cVar.getContext();
        e0.h(context);
        uc.h hVar = this.d;
        if (hVar != context) {
            int i11 = 0;
            if (hVar instanceof c) {
                String str2 = "\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((c) hVar).f41190a + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ";
                kotlin.jvm.internal.j.e(str2, "<this>");
                List a2 = id.d.a(new id.e(str2, 2));
                List list = a2;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (!jd.j.e((String) obj2)) {
                        arrayList.add(obj2);
                    }
                }
                ArrayList arrayList2 = new ArrayList(tc.i.d(arrayList));
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
                int b10 = tc.h.b(a2);
                ArrayList arrayList3 = new ArrayList();
                for (Object obj4 : list) {
                    int i14 = i11 + 1;
                    if (i11 >= 0) {
                        String str4 = (String) obj4;
                        if ((i11 == 0 || i11 == b10) && jd.j.e(str4)) {
                            str = null;
                        } else {
                            kotlin.jvm.internal.j.e(str4, "<this>");
                            if (i10 >= 0) {
                                int length3 = str4.length();
                                if (i10 <= length3) {
                                    length3 = i10;
                                }
                                str = str4.substring(length3);
                                kotlin.jvm.internal.j.d(str, "substring(...)");
                            } else {
                                throw new IllegalArgumentException(a2.k(i10, "Requested character count ", " is less than zero.").toString());
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
                StringBuilder sb = new StringBuilder(length2);
                tc.g.g(arrayList3, sb, "\n", "", "", "...", null);
                throw new IllegalStateException(sb.toString().toString());
            } else if (((Number) context.fold(0, new j(this))).intValue() == this.f41197c) {
                this.d = context;
            } else {
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.f41196b + ",\n\t\tbut emission happened in " + context + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
            }
        }
        this.e = cVar;
        q qVar = i.f41199a;
        od.c cVar2 = this.f41195a;
        kotlin.jvm.internal.j.c(cVar2, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        Object a10 = qVar.a(cVar2, obj, this);
        if (!kotlin.jvm.internal.j.a(a10, vc.a.f45663a)) {
            this.e = null;
        }
        return a10;
    }

    @Override
    public final wc.d getCallerFrame() {
        wc.c cVar = this.e;
        if (e2.c.s(cVar)) {
            return cVar;
        }
        return null;
    }

    @Override
    public final uc.h getContext() {
        uc.h hVar = this.d;
        if (hVar == null) {
            return uc.i.f45219a;
        }
        return hVar;
    }

    @Override
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        Throwable a2 = sc.f.a(obj);
        if (a2 != null) {
            this.d = new c(a2, getContext());
        }
        wc.c cVar = this.e;
        if (cVar != null) {
            cVar.resumeWith(obj);
        }
        return vc.a.f45663a;
    }
}
