package tc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import k7.q7;
public final class u extends wc.h implements dd.p {
    public Object f48110b;
    public Iterator f48111c;
    public int d;
    public int f48112e;
    public Object f48113f;
    public final Iterator h;

    public u(Iterator it, uc.c cVar) {
        super(cVar);
        this.h = it;
    }

    @Override
    public final uc.c create(Object obj, uc.c cVar) {
        u uVar = new u(this.h, cVar);
        uVar.f48113f = obj;
        return uVar;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        return ((u) create((id.c) obj, (uc.c) obj2)).invokeSuspend(sc.i.f47274a);
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
        vc.a aVar = vc.a.f48998a;
        int i12 = this.f48112e;
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 != 3) {
                        if (i12 != 4) {
                            if (i12 != 5) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            tVar = (t) this.f48110b;
                            cVar2 = (id.c) this.f48113f;
                            q7.b(obj);
                            tVar.n();
                        }
                    } else {
                        Iterator it2 = this.f48111c;
                        t tVar2 = (t) this.f48110b;
                        id.c cVar3 = (id.c) this.f48113f;
                        q7.b(obj);
                        tVar2.n();
                        while (true) {
                            int i13 = tVar2.f48108b;
                            Object[] objArr = tVar2.f48107a;
                            if (it2.hasNext()) {
                                Object next = it2.next();
                                if (tVar2.i() != i13) {
                                    int i14 = tVar2.f48109c;
                                    int i15 = tVar2.d;
                                    objArr[(i14 + i15) % i13] = next;
                                    tVar2.d = i15 + 1;
                                    if (tVar2.i() == i13) {
                                        if (tVar2.d < 20) {
                                            int i16 = i13 + (i13 >> 1) + 1;
                                            if (i16 > 20) {
                                                i16 = 20;
                                            }
                                            if (tVar2.f48109c == 0) {
                                                array = Arrays.copyOf(objArr, i16);
                                                kotlin.jvm.internal.j.d(array, "copyOf(...)");
                                            } else {
                                                array = tVar2.toArray(new Object[i16]);
                                            }
                                            tVar2 = new t(tVar2.d, array);
                                        } else {
                                            ArrayList arrayList2 = new ArrayList(tVar2);
                                            this.f48113f = cVar3;
                                            this.f48110b = tVar2;
                                            this.f48111c = it2;
                                            this.f48112e = 3;
                                            cVar3.c(arrayList2, this);
                                            vc.a aVar2 = vc.a.f48998a;
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
                        this.f48113f = cVar2;
                        this.f48110b = tVar;
                        this.f48111c = null;
                        this.f48112e = 4;
                        cVar2.c(arrayList3, this);
                        vc.a aVar3 = vc.a.f48998a;
                        return aVar;
                    }
                    if (!tVar.isEmpty()) {
                        this.f48113f = null;
                        this.f48110b = null;
                        this.f48111c = null;
                        this.f48112e = 5;
                        cVar2.c(tVar, this);
                        vc.a aVar4 = vc.a.f48998a;
                        return aVar;
                    }
                    return sc.i.f47274a;
                }
                q7.b(obj);
                return sc.i.f47274a;
            }
            i10 = this.d;
            Iterator it3 = this.f48111c;
            ArrayList arrayList4 = (ArrayList) this.f48110b;
            q7.b(obj);
            arrayList = new ArrayList(20);
            cVar = (id.c) this.f48113f;
            it = it3;
            i11 = i10;
        } else {
            q7.b(obj);
            id.c cVar4 = (id.c) this.f48113f;
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
                    this.f48113f = cVar;
                    this.f48110b = arrayList;
                    this.f48111c = it;
                    this.d = i11;
                    this.f48112e = 1;
                    cVar.c(arrayList, this);
                    vc.a aVar5 = vc.a.f48998a;
                    return aVar;
                }
            }
        }
        if (!arrayList.isEmpty()) {
            this.f48113f = null;
            this.f48110b = null;
            this.f48111c = null;
            this.f48112e = 2;
            cVar.c(arrayList, this);
            vc.a aVar6 = vc.a.f48998a;
            return aVar;
        }
        return sc.i.f47274a;
    }
}
