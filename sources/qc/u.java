package qc;

import h7.k6;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public final class u extends tc.h implements ad.p {

    public Object f46220b;

    public Iterator f46221c;
    public int d;

    public int f46222e;

    public Object f46223f;
    public final Iterator h;

    public u(Iterator it, rc.c cVar) {
        super(cVar);
        this.h = it;
    }

    @Override
    public final rc.c create(Object obj, rc.c cVar) {
        u uVar = new u(this.h, cVar);
        uVar.f46223f = obj;
        return uVar;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        return ((u) create((fd.c) obj, (rc.c) obj2)).invokeSuspend(pc.i.f45696a);
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        ArrayList arrayList;
        int i10;
        fd.c cVar;
        Iterator it;
        int i11;
        t tVar;
        fd.c cVar2;
        Object[] array;
        sc.a aVar = sc.a.f47847a;
        int i12 = this.f46222e;
        if (i12 != 0) {
            if (i12 == 1) {
                i10 = this.d;
                Iterator it2 = this.f46221c;
                fd.c cVar3 = (fd.c) this.f46223f;
                k6.b(obj);
                arrayList = new ArrayList(20);
                cVar = cVar3;
                it = it2;
                i11 = i10;
            } else if (i12 == 2) {
                k6.b(obj);
            } else {
                if (i12 == 3) {
                    Iterator it3 = this.f46221c;
                    t tVar2 = (t) this.f46220b;
                    fd.c cVar4 = (fd.c) this.f46223f;
                    k6.b(obj);
                    tVar2.n();
                    while (true) {
                        int i13 = tVar2.f46218b;
                        Object[] objArr = tVar2.f46217a;
                        if (!it3.hasNext()) {
                            tVar = tVar2;
                            cVar2 = cVar4;
                            break;
                        }
                        Object next = it3.next();
                        if (tVar2.i() == i13) {
                            throw new IllegalStateException("ring buffer is full");
                        }
                        int i14 = tVar2.f46219c;
                        int i15 = tVar2.d;
                        objArr[(i14 + i15) % i13] = next;
                        tVar2.d = i15 + 1;
                        if (tVar2.i() == i13) {
                            if (tVar2.d >= 20) {
                                ArrayList arrayList2 = new ArrayList(tVar2);
                                this.f46223f = cVar4;
                                this.f46220b = tVar2;
                                this.f46221c = it3;
                                this.f46222e = 3;
                                cVar4.c(arrayList2, this);
                                sc.a aVar2 = sc.a.f47847a;
                                return aVar;
                            }
                            int i16 = i13 + (i13 >> 1) + 1;
                            if (i16 > 20) {
                                i16 = 20;
                            }
                            if (tVar2.f46219c == 0) {
                                array = Arrays.copyOf(objArr, i16);
                                kotlin.jvm.internal.j.d(array, "copyOf(...)");
                            } else {
                                array = tVar2.toArray(new Object[i16]);
                            }
                            tVar2 = new t(tVar2.d, array);
                        }
                    }
                } else if (i12 != 4) {
                    if (i12 != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    k6.b(obj);
                } else {
                    tVar = (t) this.f46220b;
                    cVar2 = (fd.c) this.f46223f;
                    k6.b(obj);
                    tVar.n();
                }
                if (tVar.d > 20) {
                    ArrayList arrayList3 = new ArrayList(tVar);
                    this.f46223f = cVar2;
                    this.f46220b = tVar;
                    this.f46221c = null;
                    this.f46222e = 4;
                    cVar2.c(arrayList3, this);
                    sc.a aVar3 = sc.a.f47847a;
                    return aVar;
                }
                if (!tVar.isEmpty()) {
                    this.f46223f = null;
                    this.f46220b = null;
                    this.f46221c = null;
                    this.f46222e = 5;
                    cVar2.c(tVar, this);
                    sc.a aVar4 = sc.a.f47847a;
                    return aVar;
                }
            }
            return pc.i.f45696a;
        }
        k6.b(obj);
        fd.c cVar5 = (fd.c) this.f46223f;
        arrayList = new ArrayList(20);
        i10 = 0;
        cVar = cVar5;
        it = this.h;
        i11 = 0;
        while (it.hasNext()) {
            Object next2 = it.next();
            if (i10 > 0) {
                i10--;
            } else {
                arrayList.add(next2);
                if (arrayList.size() == 20) {
                    this.f46223f = cVar;
                    this.f46220b = arrayList;
                    this.f46221c = it;
                    this.d = i11;
                    this.f46222e = 1;
                    cVar.c(arrayList, this);
                    sc.a aVar5 = sc.a.f47847a;
                    return aVar;
                }
            }
        }
        if (!arrayList.isEmpty()) {
            this.f46223f = null;
            this.f46220b = null;
            this.f46221c = null;
            this.f46222e = 2;
            cVar.c(arrayList, this);
            sc.a aVar6 = sc.a.f47847a;
            return aVar;
        }
        return pc.i.f45696a;
    }
}
