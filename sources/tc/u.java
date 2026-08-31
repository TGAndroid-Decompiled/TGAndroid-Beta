package tc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import k7.q7;
public final class u extends wc.h implements dd.p {
    public Object f48074b;
    public Iterator f48075c;
    public int d;
    public int f48076e;
    public Object f48077f;
    public final Iterator h;

    public u(Iterator it, uc.c cVar) {
        super(cVar);
        this.h = it;
    }

    @Override
    public final uc.c create(Object obj, uc.c cVar) {
        u uVar = new u(this.h, cVar);
        uVar.f48077f = obj;
        return uVar;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        return ((u) create((id.c) obj, (uc.c) obj2)).invokeSuspend(sc.i.f47243a);
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        ArrayList arrayList;
        int i10;
        id.c cVar;
        Iterator it;
        int i11;
        t tVar;
        id.c cVar2;
        Object[] array;
        vc.a aVar = vc.a.f48962a;
        int i12 = this.f48076e;
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 != 3) {
                        if (i12 != 4) {
                            if (i12 != 5) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            tVar = (t) this.f48074b;
                            cVar2 = (id.c) this.f48077f;
                            q7.b(obj);
                            tVar.n();
                        }
                    } else {
                        Iterator it2 = this.f48075c;
                        t tVar2 = (t) this.f48074b;
                        id.c cVar3 = (id.c) this.f48077f;
                        q7.b(obj);
                        tVar2.n();
                        while (true) {
                            int i13 = tVar2.f48072b;
                            Object[] objArr = tVar2.f48071a;
                            if (it2.hasNext()) {
                                Object next = it2.next();
                                if (tVar2.i() != i13) {
                                    int i14 = tVar2.f48073c;
                                    int i15 = tVar2.d;
                                    objArr[(i14 + i15) % i13] = next;
                                    tVar2.d = i15 + 1;
                                    if (tVar2.i() == i13) {
                                        if (tVar2.d < 20) {
                                            int i16 = i13 + (i13 >> 1) + 1;
                                            if (i16 > 20) {
                                                i16 = 20;
                                            }
                                            if (tVar2.f48073c == 0) {
                                                array = Arrays.copyOf(objArr, i16);
                                                kotlin.jvm.internal.j.d(array, "copyOf(...)");
                                            } else {
                                                array = tVar2.toArray(new Object[i16]);
                                            }
                                            tVar2 = new t(tVar2.d, array);
                                        } else {
                                            ArrayList arrayList2 = new ArrayList(tVar2);
                                            this.f48077f = cVar3;
                                            this.f48074b = tVar2;
                                            this.f48075c = it2;
                                            this.f48076e = 3;
                                            cVar3.c(arrayList2, this);
                                            vc.a aVar2 = vc.a.f48962a;
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
                        this.f48077f = cVar2;
                        this.f48074b = tVar;
                        this.f48075c = null;
                        this.f48076e = 4;
                        cVar2.c(arrayList3, this);
                        vc.a aVar3 = vc.a.f48962a;
                        return aVar;
                    }
                    if (!tVar.isEmpty()) {
                        this.f48077f = null;
                        this.f48074b = null;
                        this.f48075c = null;
                        this.f48076e = 5;
                        cVar2.c(tVar, this);
                        vc.a aVar4 = vc.a.f48962a;
                        return aVar;
                    }
                    return sc.i.f47243a;
                }
                q7.b(obj);
                return sc.i.f47243a;
            }
            i10 = this.d;
            Iterator it3 = this.f48075c;
            ArrayList arrayList4 = (ArrayList) this.f48074b;
            q7.b(obj);
            arrayList = new ArrayList(20);
            cVar = (id.c) this.f48077f;
            it = it3;
            i11 = i10;
        } else {
            q7.b(obj);
            id.c cVar4 = (id.c) this.f48077f;
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
                    this.f48077f = cVar;
                    this.f48074b = arrayList;
                    this.f48075c = it;
                    this.d = i11;
                    this.f48076e = 1;
                    cVar.c(arrayList, this);
                    vc.a aVar5 = vc.a.f48962a;
                    return aVar;
                }
            }
        }
        if (!arrayList.isEmpty()) {
            this.f48077f = null;
            this.f48074b = null;
            this.f48075c = null;
            this.f48076e = 2;
            cVar.c(arrayList, this);
            vc.a aVar6 = vc.a.f48962a;
            return aVar;
        }
        return sc.i.f47243a;
    }
}
