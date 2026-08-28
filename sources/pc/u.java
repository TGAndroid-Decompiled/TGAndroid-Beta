package pc;

import g7.y5;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
public final class u extends sc.h implements zc.p {
    public Object f45550b;
    public Iterator f45551c;
    public int d;
    public int f45552e;
    public Object f45553f;
    public final Iterator h;

    public u(Iterator it, qc.c cVar) {
        super(cVar);
        this.h = it;
    }

    @Override
    public final qc.c create(Object obj, qc.c cVar) {
        u uVar = new u(this.h, cVar);
        uVar.f45553f = obj;
        return uVar;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        return ((u) create((ed.c) obj, (qc.c) obj2)).invokeSuspend(oc.i.f19197a);
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        ArrayList arrayList;
        int i9;
        ed.c cVar;
        Iterator it;
        int i10;
        t tVar;
        ed.c cVar2;
        Object[] array;
        rc.a aVar = rc.a.f47127a;
        int i11 = this.f45552e;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 != 4) {
                            if (i11 != 5) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            tVar = (t) this.f45550b;
                            cVar2 = (ed.c) this.f45553f;
                            y5.b(obj);
                            tVar.n();
                        }
                    } else {
                        Iterator it2 = this.f45551c;
                        t tVar2 = (t) this.f45550b;
                        ed.c cVar3 = (ed.c) this.f45553f;
                        y5.b(obj);
                        tVar2.n();
                        while (true) {
                            int i12 = tVar2.f45548b;
                            Object[] objArr = tVar2.f45547a;
                            if (it2.hasNext()) {
                                Object next = it2.next();
                                if (tVar2.i() != i12) {
                                    int i13 = tVar2.f45549c;
                                    int i14 = tVar2.d;
                                    objArr[(i13 + i14) % i12] = next;
                                    tVar2.d = i14 + 1;
                                    if (tVar2.i() == i12) {
                                        if (tVar2.d < 20) {
                                            int i15 = i12 + (i12 >> 1) + 1;
                                            if (i15 > 20) {
                                                i15 = 20;
                                            }
                                            if (tVar2.f45549c == 0) {
                                                array = Arrays.copyOf(objArr, i15);
                                                kotlin.jvm.internal.i.d(array, "copyOf(...)");
                                            } else {
                                                array = tVar2.toArray(new Object[i15]);
                                            }
                                            tVar2 = new t(tVar2.d, array);
                                        } else {
                                            ArrayList arrayList2 = new ArrayList(tVar2);
                                            this.f45553f = cVar3;
                                            this.f45550b = tVar2;
                                            this.f45551c = it2;
                                            this.f45552e = 3;
                                            cVar3.c(arrayList2, this);
                                            rc.a aVar2 = rc.a.f47127a;
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
                        this.f45553f = cVar2;
                        this.f45550b = tVar;
                        this.f45551c = null;
                        this.f45552e = 4;
                        cVar2.c(arrayList3, this);
                        rc.a aVar3 = rc.a.f47127a;
                        return aVar;
                    }
                    if (!tVar.isEmpty()) {
                        this.f45553f = null;
                        this.f45550b = null;
                        this.f45551c = null;
                        this.f45552e = 5;
                        cVar2.c(tVar, this);
                        rc.a aVar4 = rc.a.f47127a;
                        return aVar;
                    }
                    return oc.i.f19197a;
                }
                y5.b(obj);
                return oc.i.f19197a;
            }
            i9 = this.d;
            Iterator it3 = this.f45551c;
            ArrayList arrayList4 = (ArrayList) this.f45550b;
            y5.b(obj);
            arrayList = new ArrayList(20);
            cVar = (ed.c) this.f45553f;
            it = it3;
            i10 = i9;
        } else {
            y5.b(obj);
            ed.c cVar4 = (ed.c) this.f45553f;
            arrayList = new ArrayList(20);
            i9 = 0;
            cVar = cVar4;
            it = this.h;
            i10 = 0;
        }
        while (it.hasNext()) {
            Object next2 = it.next();
            if (i9 > 0) {
                i9--;
            } else {
                arrayList.add(next2);
                if (arrayList.size() == 20) {
                    this.f45553f = cVar;
                    this.f45550b = arrayList;
                    this.f45551c = it;
                    this.d = i10;
                    this.f45552e = 1;
                    cVar.c(arrayList, this);
                    rc.a aVar5 = rc.a.f47127a;
                    return aVar;
                }
            }
        }
        if (!arrayList.isEmpty()) {
            this.f45553f = null;
            this.f45550b = null;
            this.f45551c = null;
            this.f45552e = 2;
            cVar.c(arrayList, this);
            rc.a aVar6 = rc.a.f47127a;
            return aVar;
        }
        return oc.i.f19197a;
    }
}
