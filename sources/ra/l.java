package ra;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.Set;
public final class l extends AbstractMap implements Serializable {
    public static final b7.r f46808r = new b7.r(6);
    public final boolean f46810b;
    public k f46811c;
    public final k f46813f;
    public j h;
    public j f46814n;
    public int d = 0;
    public int f46812e = 0;
    public final Comparator f46809a = f46808r;

    public l(boolean z4) {
        this.f46810b = z4;
        this.f46813f = new k(z4);
    }

    public final k a(Object obj, boolean z4) {
        int i10;
        k kVar;
        Comparable comparable;
        k kVar2;
        k kVar3 = this.f46811c;
        b7.r rVar = f46808r;
        Comparator comparator = this.f46809a;
        if (kVar3 != null) {
            if (comparator == rVar) {
                comparable = (Comparable) obj;
            } else {
                comparable = null;
            }
            while (true) {
                Object obj2 = kVar3.f46805f;
                if (comparable != null) {
                    i10 = comparable.compareTo(obj2);
                } else {
                    i10 = comparator.compare(obj, obj2);
                }
                if (i10 == 0) {
                    return kVar3;
                }
                if (i10 < 0) {
                    kVar2 = kVar3.f46802b;
                } else {
                    kVar2 = kVar3.f46803c;
                }
                if (kVar2 == null) {
                    break;
                }
                kVar3 = kVar2;
            }
        } else {
            i10 = 0;
        }
        k kVar4 = kVar3;
        if (!z4) {
            return null;
        }
        k kVar5 = this.f46813f;
        if (kVar4 == null) {
            if (comparator == rVar && !(obj instanceof Comparable)) {
                throw new ClassCastException(obj.getClass().getName().concat(" is not Comparable"));
            }
            kVar = new k(this.f46810b, kVar4, obj, kVar5, kVar5.f46804e);
            this.f46811c = kVar;
        } else {
            kVar = new k(this.f46810b, kVar4, obj, kVar5, kVar5.f46804e);
            if (i10 < 0) {
                kVar4.f46802b = kVar;
            } else {
                kVar4.f46803c = kVar;
            }
            b(kVar4, true);
        }
        this.d++;
        this.f46812e++;
        return kVar;
    }

    public final void b(k kVar, boolean z4) {
        int i10;
        int i11;
        int i12;
        int i13;
        while (kVar != null) {
            k kVar2 = kVar.f46802b;
            k kVar3 = kVar.f46803c;
            int i14 = 0;
            if (kVar2 != null) {
                i10 = kVar2.f46807r;
            } else {
                i10 = 0;
            }
            if (kVar3 != null) {
                i11 = kVar3.f46807r;
            } else {
                i11 = 0;
            }
            int i15 = i10 - i11;
            if (i15 == -2) {
                k kVar4 = kVar3.f46802b;
                k kVar5 = kVar3.f46803c;
                if (kVar5 != null) {
                    i13 = kVar5.f46807r;
                } else {
                    i13 = 0;
                }
                if (kVar4 != null) {
                    i14 = kVar4.f46807r;
                }
                int i16 = i14 - i13;
                if (i16 != -1 && (i16 != 0 || z4)) {
                    f(kVar3);
                    e(kVar);
                } else {
                    e(kVar);
                }
                if (z4) {
                    return;
                }
            } else if (i15 == 2) {
                k kVar6 = kVar2.f46802b;
                k kVar7 = kVar2.f46803c;
                if (kVar7 != null) {
                    i12 = kVar7.f46807r;
                } else {
                    i12 = 0;
                }
                if (kVar6 != null) {
                    i14 = kVar6.f46807r;
                }
                int i17 = i14 - i12;
                if (i17 != 1 && (i17 != 0 || z4)) {
                    e(kVar2);
                    f(kVar);
                } else {
                    f(kVar);
                }
                if (z4) {
                    return;
                }
            } else if (i15 == 0) {
                kVar.f46807r = i10 + 1;
                if (z4) {
                    return;
                }
            } else {
                kVar.f46807r = Math.max(i10, i11) + 1;
                if (!z4) {
                    return;
                }
            }
            kVar = kVar.f46801a;
        }
    }

    public final void c(k kVar, boolean z4) {
        k kVar2;
        k kVar3;
        int i10;
        if (z4) {
            k kVar4 = kVar.f46804e;
            kVar4.d = kVar.d;
            kVar.d.f46804e = kVar4;
        }
        k kVar5 = kVar.f46802b;
        k kVar6 = kVar.f46803c;
        k kVar7 = kVar.f46801a;
        int i11 = 0;
        if (kVar5 != null && kVar6 != null) {
            if (kVar5.f46807r > kVar6.f46807r) {
                k kVar8 = kVar5.f46803c;
                while (true) {
                    k kVar9 = kVar8;
                    kVar3 = kVar5;
                    kVar5 = kVar9;
                    if (kVar5 == null) {
                        break;
                    }
                    kVar8 = kVar5.f46803c;
                }
            } else {
                k kVar10 = kVar6.f46802b;
                while (true) {
                    kVar2 = kVar6;
                    kVar6 = kVar10;
                    if (kVar6 == null) {
                        break;
                    }
                    kVar10 = kVar6.f46802b;
                }
                kVar3 = kVar2;
            }
            c(kVar3, false);
            k kVar11 = kVar.f46802b;
            if (kVar11 != null) {
                i10 = kVar11.f46807r;
                kVar3.f46802b = kVar11;
                kVar11.f46801a = kVar3;
                kVar.f46802b = null;
            } else {
                i10 = 0;
            }
            k kVar12 = kVar.f46803c;
            if (kVar12 != null) {
                i11 = kVar12.f46807r;
                kVar3.f46803c = kVar12;
                kVar12.f46801a = kVar3;
                kVar.f46803c = null;
            }
            kVar3.f46807r = Math.max(i10, i11) + 1;
            d(kVar, kVar3);
            return;
        }
        if (kVar5 != null) {
            d(kVar, kVar5);
            kVar.f46802b = null;
        } else if (kVar6 != null) {
            d(kVar, kVar6);
            kVar.f46803c = null;
        } else {
            d(kVar, null);
        }
        b(kVar7, false);
        this.d--;
        this.f46812e++;
    }

    @Override
    public final void clear() {
        this.f46811c = null;
        this.d = 0;
        this.f46812e++;
        k kVar = this.f46813f;
        kVar.f46804e = kVar;
        kVar.d = kVar;
    }

    @Override
    public final boolean containsKey(Object obj) {
        k kVar = null;
        if (obj != null) {
            try {
                kVar = a(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        if (kVar == null) {
            return false;
        }
        return true;
    }

    public final void d(k kVar, k kVar2) {
        k kVar3 = kVar.f46801a;
        kVar.f46801a = null;
        if (kVar2 != null) {
            kVar2.f46801a = kVar3;
        }
        if (kVar3 != null) {
            if (kVar3.f46802b == kVar) {
                kVar3.f46802b = kVar2;
                return;
            } else {
                kVar3.f46803c = kVar2;
                return;
            }
        }
        this.f46811c = kVar2;
    }

    public final void e(k kVar) {
        int i10;
        int i11;
        k kVar2 = kVar.f46802b;
        k kVar3 = kVar.f46803c;
        k kVar4 = kVar3.f46802b;
        k kVar5 = kVar3.f46803c;
        kVar.f46803c = kVar4;
        if (kVar4 != null) {
            kVar4.f46801a = kVar;
        }
        d(kVar, kVar3);
        kVar3.f46802b = kVar;
        kVar.f46801a = kVar3;
        int i12 = 0;
        if (kVar2 != null) {
            i10 = kVar2.f46807r;
        } else {
            i10 = 0;
        }
        if (kVar4 != null) {
            i11 = kVar4.f46807r;
        } else {
            i11 = 0;
        }
        int max = Math.max(i10, i11) + 1;
        kVar.f46807r = max;
        if (kVar5 != null) {
            i12 = kVar5.f46807r;
        }
        kVar3.f46807r = Math.max(max, i12) + 1;
    }

    @Override
    public final Set entrySet() {
        j jVar = this.h;
        if (jVar != null) {
            return jVar;
        }
        j jVar2 = new j(this, 0);
        this.h = jVar2;
        return jVar2;
    }

    public final void f(k kVar) {
        int i10;
        int i11;
        k kVar2 = kVar.f46802b;
        k kVar3 = kVar.f46803c;
        k kVar4 = kVar2.f46802b;
        k kVar5 = kVar2.f46803c;
        kVar.f46802b = kVar5;
        if (kVar5 != null) {
            kVar5.f46801a = kVar;
        }
        d(kVar, kVar2);
        kVar2.f46803c = kVar;
        kVar.f46801a = kVar2;
        int i12 = 0;
        if (kVar3 != null) {
            i10 = kVar3.f46807r;
        } else {
            i10 = 0;
        }
        if (kVar5 != null) {
            i11 = kVar5.f46807r;
        } else {
            i11 = 0;
        }
        int max = Math.max(i10, i11) + 1;
        kVar.f46807r = max;
        if (kVar4 != null) {
            i12 = kVar4.f46807r;
        }
        kVar2.f46807r = Math.max(max, i12) + 1;
    }

    @Override
    public final java.lang.Object get(java.lang.Object r3) {
        throw new UnsupportedOperationException("Method not decompiled: ra.l.get(java.lang.Object):java.lang.Object");
    }

    @Override
    public final Set keySet() {
        j jVar = this.f46814n;
        if (jVar != null) {
            return jVar;
        }
        j jVar2 = new j(this, 1);
        this.f46814n = jVar2;
        return jVar2;
    }

    @Override
    public final Object put(Object obj, Object obj2) {
        if (obj != null) {
            if (obj2 == null && !this.f46810b) {
                throw new NullPointerException("value == null");
            }
            k a2 = a(obj, true);
            Object obj3 = a2.f46806n;
            a2.f46806n = obj2;
            return obj3;
        }
        throw new NullPointerException("key == null");
    }

    @Override
    public final java.lang.Object remove(java.lang.Object r3) {
        throw new UnsupportedOperationException("Method not decompiled: ra.l.remove(java.lang.Object):java.lang.Object");
    }

    @Override
    public final int size() {
        return this.d;
    }
}
