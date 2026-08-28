package pc;

import f7.m7;
import g7.o6;
import j3.r0;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
public abstract class g extends m {
    public static ArrayList f(Iterable iterable) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final void g(Iterable iterable, StringBuilder sb2, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, zc.l lVar) {
        kotlin.jvm.internal.i.e(iterable, "<this>");
        sb2.append(charSequence2);
        int i9 = 0;
        for (Object obj : iterable) {
            i9++;
            if (i9 > 1) {
                sb2.append(charSequence);
            }
            m7.a(sb2, obj, lVar);
        }
        sb2.append(charSequence3);
    }

    public static String h(Iterable iterable, String str, String str2, String str3, zc.l lVar, int i9) {
        String str4;
        String str5;
        if ((i9 & 1) != 0) {
            str = ", ";
        }
        String str6 = str;
        if ((i9 & 2) != 0) {
            str4 = "";
        } else {
            str4 = str2;
        }
        if ((i9 & 4) != 0) {
            str5 = "";
        } else {
            str5 = str3;
        }
        if ((i9 & 32) != 0) {
            lVar = null;
        }
        kotlin.jvm.internal.i.e(iterable, "<this>");
        StringBuilder sb2 = new StringBuilder();
        g(iterable, sb2, str6, str4, str5, "...", lVar);
        return sb2.toString();
    }

    public static List i(Iterable iterable, int i9) {
        Object next;
        kotlin.jvm.internal.i.e(iterable, "<this>");
        if (i9 >= 0) {
            o oVar = o.f45540a;
            if (i9 == 0) {
                return oVar;
            }
            if (iterable instanceof Collection) {
                if (i9 >= ((Collection) iterable).size()) {
                    return m(iterable);
                }
                if (i9 == 1) {
                    if (iterable instanceof List) {
                        List list = (List) iterable;
                        if (!list.isEmpty()) {
                            next = list.get(0);
                        } else {
                            throw new NoSuchElementException("List is empty.");
                        }
                    } else {
                        Iterator it = iterable.iterator();
                        if (it.hasNext()) {
                            next = it.next();
                        } else {
                            throw new NoSuchElementException("Collection is empty.");
                        }
                    }
                    return o6.a(next);
                }
            }
            ArrayList arrayList = new ArrayList(i9);
            int i10 = 0;
            for (Object obj : iterable) {
                arrayList.add(obj);
                i10++;
                if (i10 == i9) {
                    break;
                }
            }
            int size = arrayList.size();
            if (size != 0) {
                if (size != 1) {
                    return arrayList;
                }
                return o6.a(arrayList.get(0));
            }
            return oVar;
        }
        throw new IllegalArgumentException(r0.m(i9, "Requested element count ", " is less than zero.").toString());
    }

    public static byte[] j(ArrayList arrayList) {
        byte[] bArr = new byte[arrayList.size()];
        int size = arrayList.size();
        int i9 = 0;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            bArr[i9] = ((Number) obj).byteValue();
            i9++;
        }
        return bArr;
    }

    public static final void k(Iterable iterable, AbstractCollection abstractCollection) {
        kotlin.jvm.internal.i.e(iterable, "<this>");
        for (Object obj : iterable) {
            abstractCollection.add(obj);
        }
    }

    public static int[] l(ArrayList arrayList) {
        int[] iArr = new int[arrayList.size()];
        int size = arrayList.size();
        int i9 = 0;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            iArr[i9] = ((Number) obj).intValue();
            i9++;
        }
        return iArr;
    }

    public static List m(Iterable iterable) {
        ArrayList arrayList;
        Object next;
        kotlin.jvm.internal.i.e(iterable, "<this>");
        boolean z10 = iterable instanceof Collection;
        o oVar = o.f45540a;
        if (z10) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size != 1) {
                    return o(collection);
                }
                if (iterable instanceof List) {
                    next = ((List) iterable).get(0);
                } else {
                    next = collection.iterator().next();
                }
                return o6.a(next);
            }
            return oVar;
        }
        if (z10) {
            arrayList = o((Collection) iterable);
        } else {
            ArrayList arrayList2 = new ArrayList();
            k(iterable, arrayList2);
            arrayList = arrayList2;
        }
        int size2 = arrayList.size();
        if (size2 != 0) {
            if (size2 != 1) {
                return arrayList;
            }
            return o6.a(arrayList.get(0));
        }
        return oVar;
    }

    public static long[] n(Collection collection) {
        kotlin.jvm.internal.i.e(collection, "<this>");
        long[] jArr = new long[collection.size()];
        Iterator it = collection.iterator();
        int i9 = 0;
        while (it.hasNext()) {
            jArr[i9] = ((Number) it.next()).longValue();
            i9++;
        }
        return jArr;
    }

    public static ArrayList o(Collection collection) {
        kotlin.jvm.internal.i.e(collection, "<this>");
        return new ArrayList(collection);
    }

    public static Set p(Iterable iterable) {
        Object next;
        kotlin.jvm.internal.i.e(iterable, "<this>");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size != 1) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet(r.a(collection.size()));
                    k(iterable, linkedHashSet);
                    return linkedHashSet;
                }
                if (iterable instanceof List) {
                    next = ((List) iterable).get(0);
                } else {
                    next = collection.iterator().next();
                }
                Set singleton = Collections.singleton(next);
                kotlin.jvm.internal.i.d(singleton, "singleton(...)");
                return singleton;
            }
        } else {
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            k(iterable, linkedHashSet2);
            int size2 = linkedHashSet2.size();
            if (size2 != 0) {
                if (size2 != 1) {
                    return linkedHashSet2;
                }
                Set singleton2 = Collections.singleton(linkedHashSet2.iterator().next());
                kotlin.jvm.internal.i.d(singleton2, "singleton(...)");
                return singleton2;
            }
        }
        return q.f45542a;
    }
}
