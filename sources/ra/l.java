package ra;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.Set;
public final class l extends AbstractMap implements Serializable {
    public static final b7.r f46777r = new b7.r(6);
    public final boolean f46779b;
    public k f46780c;
    public final k f46782f;
    public j h;
    public j f46783n;
    public int d = 0;
    public int f46781e = 0;
    public final Comparator f46778a = f46777r;

    public l(boolean z4) {
        this.f46779b = z4;
        this.f46782f = new k(z4);
    }

    public final k a(Object obj, boolean z4) {
        int i10;
        k kVar;
        Comparable comparable;
        k kVar2;
        k kVar3 = this.f46780c;
        b7.r rVar = f46777r;
        Comparator comparator = this.f46778a;
        if (kVar3 != null) {
            if (comparator == rVar) {
                comparable = (Comparable) obj;
            } else {
                comparable = null;
            }
            while (true) {
                Object obj2 = kVar3.f46774f;
                if (comparable != null) {
                    i10 = comparable.compareTo(obj2);
                } else {
                    i10 = comparator.compare(obj, obj2);
                }
                if (i10 == 0) {
                    return kVar3;
                }
                if (i10 < 0) {
                    kVar2 = kVar3.f46771b;
                } else {
                    kVar2 = kVar3.f46772c;
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
        k kVar5 = this.f46782f;
        if (kVar4 == null) {
            if (comparator == rVar && !(obj instanceof Comparable)) {
                throw new ClassCastException(obj.getClass().getName().concat(" is not Comparable"));
            }
            kVar = new k(this.f46779b, kVar4, obj, kVar5, kVar5.f46773e);
            this.f46780c = kVar;
        } else {
            kVar = new k(this.f46779b, kVar4, obj, kVar5, kVar5.f46773e);
            if (i10 < 0) {
                kVar4.f46771b = kVar;
            } else {
                kVar4.f46772c = kVar;
            }
            b(kVar4, true);
        }
        this.d++;
        this.f46781e++;
        return kVar;
    }

    public final void b(k kVar, boolean z4) {
        int i10;
        int i11;
        int i12;
        int i13;
        while (kVar != null) {
            k kVar2 = kVar.f46771b;
            k kVar3 = kVar.f46772c;
            int i14 = 0;
            if (kVar2 != null) {
                i10 = kVar2.f46776r;
            } else {
                i10 = 0;
            }
            if (kVar3 != null) {
                i11 = kVar3.f46776r;
            } else {
                i11 = 0;
            }
            int i15 = i10 - i11;
            if (i15 == -2) {
                k kVar4 = kVar3.f46771b;
                k kVar5 = kVar3.f46772c;
                if (kVar5 != null) {
                    i13 = kVar5.f46776r;
                } else {
                    i13 = 0;
                }
                if (kVar4 != null) {
                    i14 = kVar4.f46776r;
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
                k kVar6 = kVar2.f46771b;
                k kVar7 = kVar2.f46772c;
                if (kVar7 != null) {
                    i12 = kVar7.f46776r;
                } else {
                    i12 = 0;
                }
                if (kVar6 != null) {
                    i14 = kVar6.f46776r;
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
                kVar.f46776r = i10 + 1;
                if (z4) {
                    return;
                }
            } else {
                kVar.f46776r = Math.max(i10, i11) + 1;
                if (!z4) {
                    return;
                }
            }
            kVar = kVar.f46770a;
        }
    }

    public final void c(k kVar, boolean z4) {
        k kVar2;
        k kVar3;
        int i10;
        if (z4) {
            k kVar4 = kVar.f46773e;
            kVar4.d = kVar.d;
            kVar.d.f46773e = kVar4;
        }
        k kVar5 = kVar.f46771b;
        k kVar6 = kVar.f46772c;
        k kVar7 = kVar.f46770a;
        int i11 = 0;
        if (kVar5 != null && kVar6 != null) {
            if (kVar5.f46776r > kVar6.f46776r) {
                k kVar8 = kVar5.f46772c;
                while (true) {
                    k kVar9 = kVar8;
                    kVar3 = kVar5;
                    kVar5 = kVar9;
                    if (kVar5 == null) {
                        break;
                    }
                    kVar8 = kVar5.f46772c;
                }
            } else {
                k kVar10 = kVar6.f46771b;
                while (true) {
                    kVar2 = kVar6;
                    kVar6 = kVar10;
                    if (kVar6 == null) {
                        break;
                    }
                    kVar10 = kVar6.f46771b;
                }
                kVar3 = kVar2;
            }
            c(kVar3, false);
            k kVar11 = kVar.f46771b;
            if (kVar11 != null) {
                i10 = kVar11.f46776r;
                kVar3.f46771b = kVar11;
                kVar11.f46770a = kVar3;
                kVar.f46771b = null;
            } else {
                i10 = 0;
            }
            k kVar12 = kVar.f46772c;
            if (kVar12 != null) {
                i11 = kVar12.f46776r;
                kVar3.f46772c = kVar12;
                kVar12.f46770a = kVar3;
                kVar.f46772c = null;
            }
            kVar3.f46776r = Math.max(i10, i11) + 1;
            d(kVar, kVar3);
            return;
        }
        if (kVar5 != null) {
            d(kVar, kVar5);
            kVar.f46771b = null;
        } else if (kVar6 != null) {
            d(kVar, kVar6);
            kVar.f46772c = null;
        } else {
            d(kVar, null);
        }
        b(kVar7, false);
        this.d--;
        this.f46781e++;
    }

    @Override
    public final void clear() {
        this.f46780c = null;
        this.d = 0;
        this.f46781e++;
        k kVar = this.f46782f;
        kVar.f46773e = kVar;
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
        k kVar3 = kVar.f46770a;
        kVar.f46770a = null;
        if (kVar2 != null) {
            kVar2.f46770a = kVar3;
        }
        if (kVar3 != null) {
            if (kVar3.f46771b == kVar) {
                kVar3.f46771b = kVar2;
                return;
            } else {
                kVar3.f46772c = kVar2;
                return;
            }
        }
        this.f46780c = kVar2;
    }

    public final void e(k kVar) {
        int i10;
        int i11;
        k kVar2 = kVar.f46771b;
        k kVar3 = kVar.f46772c;
        k kVar4 = kVar3.f46771b;
        k kVar5 = kVar3.f46772c;
        kVar.f46772c = kVar4;
        if (kVar4 != null) {
            kVar4.f46770a = kVar;
        }
        d(kVar, kVar3);
        kVar3.f46771b = kVar;
        kVar.f46770a = kVar3;
        int i12 = 0;
        if (kVar2 != null) {
            i10 = kVar2.f46776r;
        } else {
            i10 = 0;
        }
        if (kVar4 != null) {
            i11 = kVar4.f46776r;
        } else {
            i11 = 0;
        }
        int max = Math.max(i10, i11) + 1;
        kVar.f46776r = max;
        if (kVar5 != null) {
            i12 = kVar5.f46776r;
        }
        kVar3.f46776r = Math.max(max, i12) + 1;
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
        k kVar2 = kVar.f46771b;
        k kVar3 = kVar.f46772c;
        k kVar4 = kVar2.f46771b;
        k kVar5 = kVar2.f46772c;
        kVar.f46771b = kVar5;
        if (kVar5 != null) {
            kVar5.f46770a = kVar;
        }
        d(kVar, kVar2);
        kVar2.f46772c = kVar;
        kVar.f46770a = kVar2;
        int i12 = 0;
        if (kVar3 != null) {
            i10 = kVar3.f46776r;
        } else {
            i10 = 0;
        }
        if (kVar5 != null) {
            i11 = kVar5.f46776r;
        } else {
            i11 = 0;
        }
        int max = Math.max(i10, i11) + 1;
        kVar.f46776r = max;
        if (kVar4 != null) {
            i12 = kVar4.f46776r;
        }
        kVar2.f46776r = Math.max(max, i12) + 1;
    }

    @Override
    public final java.lang.Object get(java.lang.Object r3) {
        throw new UnsupportedOperationException("Method not decompiled: ra.l.get(java.lang.Object):java.lang.Object");
    }

    @Override
    public final Set keySet() {
        j jVar = this.f46783n;
        if (jVar != null) {
            return jVar;
        }
        j jVar2 = new j(this, 1);
        this.f46783n = jVar2;
        return jVar2;
    }

    @Override
    public final Object put(Object obj, Object obj2) {
        if (obj != null) {
            if (obj2 == null && !this.f46779b) {
                throw new NullPointerException("value == null");
            }
            k a2 = a(obj, true);
            Object obj3 = a2.f46775n;
            a2.f46775n = obj2;
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
