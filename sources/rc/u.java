package rc;

import i7.c7;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
public final class u extends uc.h implements bd.p {
    public Object f47131b;
    public Iterator f47132c;
    public int d;
    public int f47133e;
    public Object f47134f;
    public final Iterator h;

    public u(Iterator it, sc.c cVar) {
        super(cVar);
        this.h = it;
    }

    @Override
    public final sc.c create(Object obj, sc.c cVar) {
        u uVar = new u(this.h, cVar);
        uVar.f47134f = obj;
        return uVar;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        return ((u) create((gd.c) obj, (sc.c) obj2)).invokeSuspend(qc.i.f46603a);
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        ArrayList arrayList;
        int i10;
        gd.c cVar;
        Iterator it;
        int i11;
        t tVar;
        gd.c cVar2;
        Object[] array;
        tc.a aVar = tc.a.f48210a;
        int i12 = this.f47133e;
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 != 3) {
                        if (i12 != 4) {
                            if (i12 != 5) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            tVar = (t) this.f47131b;
                            cVar2 = (gd.c) this.f47134f;
                            c7.b(obj);
                            tVar.n();
                        }
                    } else {
                        Iterator it2 = this.f47132c;
                        t tVar2 = (t) this.f47131b;
                        gd.c cVar3 = (gd.c) this.f47134f;
                        c7.b(obj);
                        tVar2.n();
                        while (true) {
                            int i13 = tVar2.f47129b;
                            Object[] objArr = tVar2.f47128a;
                            if (it2.hasNext()) {
                                Object next = it2.next();
                                if (tVar2.i() != i13) {
                                    int i14 = tVar2.f47130c;
                                    int i15 = tVar2.d;
                                    objArr[(i14 + i15) % i13] = next;
                                    tVar2.d = i15 + 1;
                                    if (tVar2.i() == i13) {
                                        if (tVar2.d < 20) {
                                            int i16 = i13 + (i13 >> 1) + 1;
                                            if (i16 > 20) {
                                                i16 = 20;
                                            }
                                            if (tVar2.f47130c == 0) {
                                                array = Arrays.copyOf(objArr, i16);
                                                kotlin.jvm.internal.j.d(array, "copyOf(...)");
                                            } else {
                                                array = tVar2.toArray(new Object[i16]);
                                            }
                                            tVar2 = new t(tVar2.d, array);
                                        } else {
                                            ArrayList arrayList2 = new ArrayList(tVar2);
                                            this.f47134f = cVar3;
                                            this.f47131b = tVar2;
                                            this.f47132c = it2;
                                            this.f47133e = 3;
                                            cVar3.c(arrayList2, this);
                                            tc.a aVar2 = tc.a.f48210a;
                                            return aVar;
                                        }
                                    }
                                } else {
                                    throw new IllegalStateException("ring buffer is full");
                                }
                            } else {
                                tVar = tVar2;
                                cVar2 = cVar3;
                                break;
                            }
                        }
                    }
                    if (tVar.d > 20) {
                        ArrayList arrayList3 = new ArrayList(tVar);
                        this.f47134f = cVar2;
                        this.f47131b = tVar;
                        this.f47132c = null;
                        this.f47133e = 4;
                        cVar2.c(arrayList3, this);
                        tc.a aVar3 = tc.a.f48210a;
                        return aVar;
                    }
                    if (!tVar.isEmpty()) {
                        this.f47134f = null;
                        this.f47131b = null;
                        this.f47132c = null;
                        this.f47133e = 5;
                        cVar2.c(tVar, this);
                        tc.a aVar4 = tc.a.f48210a;
                        return aVar;
                    }
                    return qc.i.f46603a;
                }
                c7.b(obj);
                return qc.i.f46603a;
            }
            i10 = this.d;
            Iterator it3 = this.f47132c;
            ArrayList arrayList4 = (ArrayList) this.f47131b;
            c7.b(obj);
            arrayList = new ArrayList(20);
            cVar = (gd.c) this.f47134f;
            it = it3;
            i11 = i10;
        } else {
            c7.b(obj);
            gd.c cVar4 = (gd.c) this.f47134f;
            arrayList = new ArrayList(20);
            i10 = 0;
            cVar = cVar4;
            it = this.h;
            i11 = 0;
        }
        while (it.hasNext()) {
            Object next2 = it.next();
            if (i10 > 0) {
                i10--;
            } else {
                arrayList.add(next2);
                if (arrayList.size() == 20) {
                    this.f47134f = cVar;
                    this.f47131b = arrayList;
                    this.f47132c = it;
                    this.d = i11;
                    this.f47133e = 1;
                    cVar.c(arrayList, this);
                    tc.a aVar5 = tc.a.f48210a;
                    return aVar;
                }
            }
        }
        if (!arrayList.isEmpty()) {
            this.f47134f = null;
            this.f47131b = null;
            this.f47132c = null;
            this.f47133e = 2;
            cVar.c(arrayList, this);
            tc.a aVar6 = tc.a.f48210a;
            return aVar;
        }
        return qc.i.f46603a;
    }
}
