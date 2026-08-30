package ra;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.Set;
public final class l extends AbstractMap implements Serializable {
    public static final b7.r f43423r = new b7.r(6);
    public final boolean f43425b;
    public k f43426c;
    public final k f43427f;
    public j h;
    public j f43428n;
    public int d = 0;
    public int e = 0;
    public final Comparator f43424a = f43423r;

    public l(boolean z4) {
        this.f43425b = z4;
        this.f43427f = new k(z4);
    }

    public final k a(Object obj, boolean z4) {
        int i10;
        k kVar;
        Comparable comparable;
        k kVar2;
        k kVar3 = this.f43426c;
        b7.r rVar = f43423r;
        Comparator comparator = this.f43424a;
        if (kVar3 != null) {
            if (comparator == rVar) {
                comparable = (Comparable) obj;
            } else {
                comparable = null;
            }
            while (true) {
                Object obj2 = kVar3.f43420f;
                if (comparable != null) {
                    i10 = comparable.compareTo(obj2);
                } else {
                    i10 = comparator.compare(obj, obj2);
                }
                if (i10 == 0) {
                    return kVar3;
                }
                if (i10 < 0) {
                    kVar2 = kVar3.f43418b;
                } else {
                    kVar2 = kVar3.f43419c;
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
        k kVar5 = this.f43427f;
        if (kVar4 == null) {
            if (comparator == rVar && !(obj instanceof Comparable)) {
                throw new ClassCastException(obj.getClass().getName().concat(" is not Comparable"));
            }
            kVar = new k(this.f43425b, kVar4, obj, kVar5, kVar5.e);
            this.f43426c = kVar;
        } else {
            kVar = new k(this.f43425b, kVar4, obj, kVar5, kVar5.e);
            if (i10 < 0) {
                kVar4.f43418b = kVar;
            } else {
                kVar4.f43419c = kVar;
            }
            b(kVar4, true);
        }
        this.d++;
        this.e++;
        return kVar;
    }

    public final void b(k kVar, boolean z4) {
        int i10;
        int i11;
        int i12;
        int i13;
        while (kVar != null) {
            k kVar2 = kVar.f43418b;
            k kVar3 = kVar.f43419c;
            int i14 = 0;
            if (kVar2 != null) {
                i10 = kVar2.f43422r;
            } else {
                i10 = 0;
            }
            if (kVar3 != null) {
                i11 = kVar3.f43422r;
            } else {
                i11 = 0;
            }
            int i15 = i10 - i11;
            if (i15 == -2) {
                k kVar4 = kVar3.f43418b;
                k kVar5 = kVar3.f43419c;
                if (kVar5 != null) {
                    i13 = kVar5.f43422r;
                } else {
                    i13 = 0;
                }
                if (kVar4 != null) {
                    i14 = kVar4.f43422r;
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
                k kVar6 = kVar2.f43418b;
                k kVar7 = kVar2.f43419c;
                if (kVar7 != null) {
                    i12 = kVar7.f43422r;
                } else {
                    i12 = 0;
                }
                if (kVar6 != null) {
                    i14 = kVar6.f43422r;
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
                kVar.f43422r = i10 + 1;
                if (z4) {
                    return;
                }
            } else {
                kVar.f43422r = Math.max(i10, i11) + 1;
                if (!z4) {
                    return;
                }
            }
            kVar = kVar.f43417a;
        }
    }

    public final void c(k kVar, boolean z4) {
        k kVar2;
        k kVar3;
        int i10;
        if (z4) {
            k kVar4 = kVar.e;
            kVar4.d = kVar.d;
            kVar.d.e = kVar4;
        }
        k kVar5 = kVar.f43418b;
        k kVar6 = kVar.f43419c;
        k kVar7 = kVar.f43417a;
        int i11 = 0;
        if (kVar5 != null && kVar6 != null) {
            if (kVar5.f43422r > kVar6.f43422r) {
                k kVar8 = kVar5.f43419c;
                while (true) {
                    k kVar9 = kVar8;
                    kVar3 = kVar5;
                    kVar5 = kVar9;
                    if (kVar5 == null) {
                        break;
                    }
                    kVar8 = kVar5.f43419c;
                }
            } else {
                k kVar10 = kVar6.f43418b;
                while (true) {
                    kVar2 = kVar6;
                    kVar6 = kVar10;
                    if (kVar6 == null) {
                        break;
                    }
                    kVar10 = kVar6.f43418b;
                }
                kVar3 = kVar2;
            }
            c(kVar3, false);
            k kVar11 = kVar.f43418b;
            if (kVar11 != null) {
                i10 = kVar11.f43422r;
                kVar3.f43418b = kVar11;
                kVar11.f43417a = kVar3;
                kVar.f43418b = null;
            } else {
                i10 = 0;
            }
            k kVar12 = kVar.f43419c;
            if (kVar12 != null) {
                i11 = kVar12.f43422r;
                kVar3.f43419c = kVar12;
                kVar12.f43417a = kVar3;
                kVar.f43419c = null;
            }
            kVar3.f43422r = Math.max(i10, i11) + 1;
            d(kVar, kVar3);
            return;
        }
        if (kVar5 != null) {
            d(kVar, kVar5);
            kVar.f43418b = null;
        } else if (kVar6 != null) {
            d(kVar, kVar6);
            kVar.f43419c = null;
        } else {
            d(kVar, null);
        }
        b(kVar7, false);
        this.d--;
        this.e++;
    }

    @Override
    public final void clear() {
        this.f43426c = null;
        this.d = 0;
        this.e++;
        k kVar = this.f43427f;
        kVar.e = kVar;
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
        k kVar3 = kVar.f43417a;
        kVar.f43417a = null;
        if (kVar2 != null) {
            kVar2.f43417a = kVar3;
        }
        if (kVar3 != null) {
            if (kVar3.f43418b == kVar) {
                kVar3.f43418b = kVar2;
                return;
            } else {
                kVar3.f43419c = kVar2;
                return;
            }
        }
        this.f43426c = kVar2;
    }

    public final void e(k kVar) {
        int i10;
        int i11;
        k kVar2 = kVar.f43418b;
        k kVar3 = kVar.f43419c;
        k kVar4 = kVar3.f43418b;
        k kVar5 = kVar3.f43419c;
        kVar.f43419c = kVar4;
        if (kVar4 != null) {
            kVar4.f43417a = kVar;
        }
        d(kVar, kVar3);
        kVar3.f43418b = kVar;
        kVar.f43417a = kVar3;
        int i12 = 0;
        if (kVar2 != null) {
            i10 = kVar2.f43422r;
        } else {
            i10 = 0;
        }
        if (kVar4 != null) {
            i11 = kVar4.f43422r;
        } else {
            i11 = 0;
        }
        int max = Math.max(i10, i11) + 1;
        kVar.f43422r = max;
        if (kVar5 != null) {
            i12 = kVar5.f43422r;
        }
        kVar3.f43422r = Math.max(max, i12) + 1;
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
        k kVar2 = kVar.f43418b;
        k kVar3 = kVar.f43419c;
        k kVar4 = kVar2.f43418b;
        k kVar5 = kVar2.f43419c;
        kVar.f43418b = kVar5;
        if (kVar5 != null) {
            kVar5.f43417a = kVar;
        }
        d(kVar, kVar2);
        kVar2.f43419c = kVar;
        kVar.f43417a = kVar2;
        int i12 = 0;
        if (kVar3 != null) {
            i10 = kVar3.f43422r;
        } else {
            i10 = 0;
        }
        if (kVar5 != null) {
            i11 = kVar5.f43422r;
        } else {
            i11 = 0;
        }
        int max = Math.max(i10, i11) + 1;
        kVar.f43422r = max;
        if (kVar4 != null) {
            i12 = kVar4.f43422r;
        }
        kVar2.f43422r = Math.max(max, i12) + 1;
    }

    @Override
    public final java.lang.Object get(java.lang.Object r3) {
        throw new UnsupportedOperationException("Method not decompiled: ra.l.get(java.lang.Object):java.lang.Object");
    }

    @Override
    public final Set keySet() {
        j jVar = this.f43428n;
        if (jVar != null) {
            return jVar;
        }
        j jVar2 = new j(this, 1);
        this.f43428n = jVar2;
        return jVar2;
    }

    @Override
    public final Object put(Object obj, Object obj2) {
        if (obj != null) {
            if (obj2 == null && !this.f43425b) {
                throw new NullPointerException("value == null");
            }
            k a2 = a(obj, true);
            Object obj3 = a2.f43421n;
            a2.f43421n = obj2;
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
