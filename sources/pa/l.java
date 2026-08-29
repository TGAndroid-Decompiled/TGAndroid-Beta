package pa;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.Set;
public final class l extends AbstractMap implements Serializable {
    public static final d2.a f45697r = new d2.a(5);
    public final boolean f45699b;
    public k f45700c;
    public final k f45702f;
    public j h;
    public j f45703n;
    public int d = 0;
    public int f45701e = 0;
    public final Comparator f45698a = f45697r;

    public l(boolean z10) {
        this.f45699b = z10;
        this.f45702f = new k(z10);
    }

    public final k a(Object obj, boolean z10) {
        int i10;
        k kVar;
        Comparable comparable;
        k kVar2;
        k kVar3 = this.f45700c;
        d2.a aVar = f45697r;
        Comparator comparator = this.f45698a;
        if (kVar3 != null) {
            if (comparator == aVar) {
                comparable = (Comparable) obj;
            } else {
                comparable = null;
            }
            while (true) {
                Object obj2 = kVar3.f45694f;
                if (comparable != null) {
                    i10 = comparable.compareTo(obj2);
                } else {
                    i10 = comparator.compare(obj, obj2);
                }
                if (i10 == 0) {
                    return kVar3;
                }
                if (i10 < 0) {
                    kVar2 = kVar3.f45691b;
                } else {
                    kVar2 = kVar3.f45692c;
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
        if (!z10) {
            return null;
        }
        k kVar5 = this.f45702f;
        if (kVar4 == null) {
            if (comparator == aVar && !(obj instanceof Comparable)) {
                throw new ClassCastException(obj.getClass().getName().concat(" is not Comparable"));
            }
            kVar = new k(this.f45699b, kVar4, obj, kVar5, kVar5.f45693e);
            this.f45700c = kVar;
        } else {
            kVar = new k(this.f45699b, kVar4, obj, kVar5, kVar5.f45693e);
            if (i10 < 0) {
                kVar4.f45691b = kVar;
            } else {
                kVar4.f45692c = kVar;
            }
            b(kVar4, true);
        }
        this.d++;
        this.f45701e++;
        return kVar;
    }

    public final void b(k kVar, boolean z10) {
        int i10;
        int i11;
        int i12;
        int i13;
        while (kVar != null) {
            k kVar2 = kVar.f45691b;
            k kVar3 = kVar.f45692c;
            int i14 = 0;
            if (kVar2 != null) {
                i10 = kVar2.f45696r;
            } else {
                i10 = 0;
            }
            if (kVar3 != null) {
                i11 = kVar3.f45696r;
            } else {
                i11 = 0;
            }
            int i15 = i10 - i11;
            if (i15 == -2) {
                k kVar4 = kVar3.f45691b;
                k kVar5 = kVar3.f45692c;
                if (kVar5 != null) {
                    i13 = kVar5.f45696r;
                } else {
                    i13 = 0;
                }
                if (kVar4 != null) {
                    i14 = kVar4.f45696r;
                }
                int i16 = i14 - i13;
                if (i16 != -1 && (i16 != 0 || z10)) {
                    f(kVar3);
                    e(kVar);
                } else {
                    e(kVar);
                }
                if (z10) {
                    return;
                }
            } else if (i15 == 2) {
                k kVar6 = kVar2.f45691b;
                k kVar7 = kVar2.f45692c;
                if (kVar7 != null) {
                    i12 = kVar7.f45696r;
                } else {
                    i12 = 0;
                }
                if (kVar6 != null) {
                    i14 = kVar6.f45696r;
                }
                int i17 = i14 - i12;
                if (i17 != 1 && (i17 != 0 || z10)) {
                    e(kVar2);
                    f(kVar);
                } else {
                    f(kVar);
                }
                if (z10) {
                    return;
                }
            } else if (i15 == 0) {
                kVar.f45696r = i10 + 1;
                if (z10) {
                    return;
                }
            } else {
                kVar.f45696r = Math.max(i10, i11) + 1;
                if (!z10) {
                    return;
                }
            }
            kVar = kVar.f45690a;
        }
    }

    public final void c(k kVar, boolean z10) {
        k kVar2;
        k kVar3;
        int i10;
        if (z10) {
            k kVar4 = kVar.f45693e;
            kVar4.d = kVar.d;
            kVar.d.f45693e = kVar4;
        }
        k kVar5 = kVar.f45691b;
        k kVar6 = kVar.f45692c;
        k kVar7 = kVar.f45690a;
        int i11 = 0;
        if (kVar5 != null && kVar6 != null) {
            if (kVar5.f45696r > kVar6.f45696r) {
                k kVar8 = kVar5.f45692c;
                while (true) {
                    k kVar9 = kVar8;
                    kVar3 = kVar5;
                    kVar5 = kVar9;
                    if (kVar5 == null) {
                        break;
                    }
                    kVar8 = kVar5.f45692c;
                }
            } else {
                k kVar10 = kVar6.f45691b;
                while (true) {
                    kVar2 = kVar6;
                    kVar6 = kVar10;
                    if (kVar6 == null) {
                        break;
                    }
                    kVar10 = kVar6.f45691b;
                }
                kVar3 = kVar2;
            }
            c(kVar3, false);
            k kVar11 = kVar.f45691b;
            if (kVar11 != null) {
                i10 = kVar11.f45696r;
                kVar3.f45691b = kVar11;
                kVar11.f45690a = kVar3;
                kVar.f45691b = null;
            } else {
                i10 = 0;
            }
            k kVar12 = kVar.f45692c;
            if (kVar12 != null) {
                i11 = kVar12.f45696r;
                kVar3.f45692c = kVar12;
                kVar12.f45690a = kVar3;
                kVar.f45692c = null;
            }
            kVar3.f45696r = Math.max(i10, i11) + 1;
            d(kVar, kVar3);
            return;
        }
        if (kVar5 != null) {
            d(kVar, kVar5);
            kVar.f45691b = null;
        } else if (kVar6 != null) {
            d(kVar, kVar6);
            kVar.f45692c = null;
        } else {
            d(kVar, null);
        }
        b(kVar7, false);
        this.d--;
        this.f45701e++;
    }

    @Override
    public final void clear() {
        this.f45700c = null;
        this.d = 0;
        this.f45701e++;
        k kVar = this.f45702f;
        kVar.f45693e = kVar;
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
        k kVar3 = kVar.f45690a;
        kVar.f45690a = null;
        if (kVar2 != null) {
            kVar2.f45690a = kVar3;
        }
        if (kVar3 != null) {
            if (kVar3.f45691b == kVar) {
                kVar3.f45691b = kVar2;
                return;
            } else {
                kVar3.f45692c = kVar2;
                return;
            }
        }
        this.f45700c = kVar2;
    }

    public final void e(k kVar) {
        int i10;
        int i11;
        k kVar2 = kVar.f45691b;
        k kVar3 = kVar.f45692c;
        k kVar4 = kVar3.f45691b;
        k kVar5 = kVar3.f45692c;
        kVar.f45692c = kVar4;
        if (kVar4 != null) {
            kVar4.f45690a = kVar;
        }
        d(kVar, kVar3);
        kVar3.f45691b = kVar;
        kVar.f45690a = kVar3;
        int i12 = 0;
        if (kVar2 != null) {
            i10 = kVar2.f45696r;
        } else {
            i10 = 0;
        }
        if (kVar4 != null) {
            i11 = kVar4.f45696r;
        } else {
            i11 = 0;
        }
        int max = Math.max(i10, i11) + 1;
        kVar.f45696r = max;
        if (kVar5 != null) {
            i12 = kVar5.f45696r;
        }
        kVar3.f45696r = Math.max(max, i12) + 1;
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
        k kVar2 = kVar.f45691b;
        k kVar3 = kVar.f45692c;
        k kVar4 = kVar2.f45691b;
        k kVar5 = kVar2.f45692c;
        kVar.f45691b = kVar5;
        if (kVar5 != null) {
            kVar5.f45690a = kVar;
        }
        d(kVar, kVar2);
        kVar2.f45692c = kVar;
        kVar.f45690a = kVar2;
        int i12 = 0;
        if (kVar3 != null) {
            i10 = kVar3.f45696r;
        } else {
            i10 = 0;
        }
        if (kVar5 != null) {
            i11 = kVar5.f45696r;
        } else {
            i11 = 0;
        }
        int max = Math.max(i10, i11) + 1;
        kVar.f45696r = max;
        if (kVar4 != null) {
            i12 = kVar4.f45696r;
        }
        kVar2.f45696r = Math.max(max, i12) + 1;
    }

    @Override
    public final java.lang.Object get(java.lang.Object r3) {
        throw new UnsupportedOperationException("Method not decompiled: pa.l.get(java.lang.Object):java.lang.Object");
    }

    @Override
    public final Set keySet() {
        j jVar = this.f45703n;
        if (jVar != null) {
            return jVar;
        }
        j jVar2 = new j(this, 1);
        this.f45703n = jVar2;
        return jVar2;
    }

    @Override
    public final Object put(Object obj, Object obj2) {
        if (obj != null) {
            if (obj2 == null && !this.f45699b) {
                throw new NullPointerException("value == null");
            }
            k a2 = a(obj, true);
            Object obj3 = a2.f45695n;
            a2.f45695n = obj2;
            return obj3;
        }
        throw new NullPointerException("key == null");
    }

    @Override
    public final java.lang.Object remove(java.lang.Object r3) {
        throw new UnsupportedOperationException("Method not decompiled: pa.l.remove(java.lang.Object):java.lang.Object");
    }

    @Override
    public final int size() {
        return this.d;
    }
}
