package v5;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.SparseArray;
import android.util.SparseIntArray;
import androidx.lifecycle.t;
import androidx.lifecycle.t0;
import c2.u;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import e0.i0;
import f5.c0;
import f5.d0;
import f5.v;
import f5.w;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import y3.b0;
import y3.y;
import y3.z;
public final class n implements Continuation, vd.e, o3.e, y, t4.f, a3.b {
    public final int f49430a;
    public Object f49431b;
    public Object f49432c;

    public n() {
        this.f49430a = 4;
    }

    @Override
    public void a() {
        ((vd.j) this.f49431b).a();
    }

    @Override
    public void c(w wVar) {
        b0 b0Var = (b0) this.f49432c;
        SparseArray sparseArray = b0Var.f50231f;
        v vVar = (v) this.f49431b;
        if (wVar.r() == 0 && (wVar.r() & 128) != 0) {
            wVar.D(6);
            int a2 = wVar.a() / 4;
            for (int i10 = 0; i10 < a2; i10++) {
                wVar.c(0, 4, vVar.f6635b);
                vVar.p(0);
                int i11 = vVar.i(16);
                vVar.s(3);
                if (i11 == 0) {
                    vVar.s(13);
                } else {
                    int i12 = vVar.i(13);
                    if (sparseArray.get(i12) == null) {
                        sparseArray.put(i12, new z(new i0(b0Var, i12)));
                        b0Var.f50236l++;
                    }
                }
            }
            if (b0Var.f50227a != 2) {
                sparseArray.remove(0);
            }
        }
    }

    @Override
    public o3.d d(o3.l lVar, long j10) {
        long position = lVar.getPosition();
        int min = (int) Math.min(20000L, lVar.getLength() - position);
        w wVar = (w) this.f49432c;
        wVar.z(min);
        lVar.a(0, min, wVar.f6640a);
        int i10 = -1;
        long j11 = -9223372036854775807L;
        int i11 = -1;
        while (wVar.a() >= 4) {
            if (r3.a.a(wVar.f6641b, wVar.f6640a) != 442) {
                wVar.D(1);
            } else {
                wVar.D(4);
                long c3 = y3.v.c(wVar);
                if (c3 != -9223372036854775807L) {
                    long b10 = ((c0) this.f49431b).b(c3);
                    if (b10 > j10) {
                        if (j11 == -9223372036854775807L) {
                            return new o3.d(-1, b10, position);
                        }
                        return new o3.d(0, -9223372036854775807L, position + i11);
                    } else if (b10 + 100000 > j10) {
                        return new o3.d(0, -9223372036854775807L, position + wVar.f6641b);
                    } else {
                        j11 = b10;
                        i11 = wVar.f6641b;
                    }
                }
                int i12 = wVar.f6642c;
                if (wVar.a() < 10) {
                    wVar.C(i12);
                } else {
                    wVar.D(9);
                    int r6 = wVar.r() & 7;
                    if (wVar.a() < r6) {
                        wVar.C(i12);
                    } else {
                        wVar.D(r6);
                        if (wVar.a() < 4) {
                            wVar.C(i12);
                        } else {
                            if (r3.a.a(wVar.f6641b, wVar.f6640a) == 443) {
                                wVar.D(4);
                                int w10 = wVar.w();
                                if (wVar.a() < w10) {
                                    wVar.C(i12);
                                } else {
                                    wVar.D(w10);
                                }
                            }
                            while (true) {
                                if (wVar.a() < 4) {
                                    break;
                                }
                                int a2 = r3.a.a(wVar.f6641b, wVar.f6640a);
                                if (a2 == 442 || a2 == 441 || (a2 >>> 8) != 1) {
                                    break;
                                }
                                wVar.D(4);
                                if (wVar.a() < 2) {
                                    wVar.C(i12);
                                    break;
                                }
                                wVar.C(Math.min(wVar.f6642c, wVar.f6641b + wVar.w()));
                            }
                        }
                    }
                }
                i10 = wVar.f6641b;
            }
        }
        if (j11 != -9223372036854775807L) {
            return new o3.d(-2, j11, position + i10);
        }
        return o3.d.d;
    }

    @Override
    public int e(long j10) {
        int i10;
        switch (this.f49430a) {
            case 7:
                ArrayList arrayList = (ArrayList) this.f49432c;
                Long valueOf = Long.valueOf(j10);
                int i11 = d0.f6579a;
                int binarySearch = Collections.binarySearch(arrayList, valueOf);
                if (binarySearch < 0) {
                    i10 = ~binarySearch;
                } else {
                    int size = arrayList.size();
                    do {
                        binarySearch++;
                        if (binarySearch < size) {
                        }
                        i10 = binarySearch;
                    } while (((Comparable) arrayList.get(binarySearch)).compareTo(valueOf) == 0);
                    i10 = binarySearch;
                }
                if (i10 >= arrayList.size()) {
                    return -1;
                }
                return i10;
            default:
                long[] jArr = (long[]) this.f49432c;
                int b10 = d0.b(jArr, j10, false);
                if (b10 >= jArr.length) {
                    return -1;
                }
                return b10;
        }
    }

    @Override
    public void f() {
        w wVar = (w) this.f49432c;
        byte[] bArr = d0.f6583f;
        wVar.getClass();
        wVar.A(bArr.length, bArr);
    }

    public void g(Object obj, String str) {
        ((ArrayList) this.f49431b).add(a4.w.y(str, "=", String.valueOf(obj)));
    }

    @Override
    public Object mo18get() {
        return new z2.d((Context) ((a3.c) this.f49431b).f49a, (c) ((org.telegram.ui.Components.n) this.f49432c).mo18get());
    }

    public void i(String str, PrintWriter printWriter) {
        boolean z10;
        w1.b bVar = (w1.b) this.f49432c;
        if (bVar.d.f31c > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            String str2 = str + "    ";
            int i10 = 0;
            while (true) {
                a0.l lVar = bVar.d;
                if (i10 < lVar.f31c) {
                    w1.a aVar = (w1.a) lVar.f30b[i10];
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(bVar.d.f29a[i10]);
                    printWriter.print(": ");
                    printWriter.println(aVar.toString());
                    printWriter.print(str2);
                    printWriter.print("mId=");
                    printWriter.print(0);
                    printWriter.print(" mArgs=");
                    Object obj = null;
                    printWriter.println((Object) null);
                    printWriter.print(str2);
                    printWriter.print("mLoader=");
                    printWriter.println(aVar.f49616l);
                    m5.d dVar = aVar.f49616l;
                    String str3 = str2 + "  ";
                    dVar.getClass();
                    printWriter.print(str3);
                    printWriter.print("mId=");
                    printWriter.print(0);
                    printWriter.print(" mListener=");
                    printWriter.println(dVar.f16866a);
                    if (dVar.f16867b || dVar.f16869e) {
                        printWriter.print(str3);
                        printWriter.print("mStarted=");
                        printWriter.print(dVar.f16867b);
                        printWriter.print(" mContentChanged=");
                        printWriter.print(dVar.f16869e);
                        printWriter.print(" mProcessingChange=");
                        printWriter.println(false);
                    }
                    if (dVar.f16868c || dVar.d) {
                        printWriter.print(str3);
                        printWriter.print("mAbandoned=");
                        printWriter.print(dVar.f16868c);
                        printWriter.print(" mReset=");
                        printWriter.println(dVar.d);
                    }
                    if (dVar.f16871g != null) {
                        printWriter.print(str3);
                        printWriter.print("mTask=");
                        printWriter.print(dVar.f16871g);
                        printWriter.print(" waiting=");
                        dVar.f16871g.getClass();
                        printWriter.println(false);
                    }
                    if (dVar.h != null) {
                        printWriter.print(str3);
                        printWriter.print("mCancellingTask=");
                        printWriter.print(dVar.h);
                        printWriter.print(" waiting=");
                        dVar.h.getClass();
                        printWriter.println(false);
                    }
                    if (aVar.f49618n != null) {
                        printWriter.print(str2);
                        printWriter.print("mCallbacks=");
                        printWriter.println(aVar.f49618n);
                        u uVar = aVar.f49618n;
                        uVar.getClass();
                        printWriter.print(str2 + "  ");
                        printWriter.print("mDeliveredData=");
                        printWriter.println(uVar.f2911b);
                    }
                    printWriter.print(str2);
                    printWriter.print("mData=");
                    m5.d dVar2 = aVar.f49616l;
                    Object obj2 = aVar.f1652e;
                    if (obj2 != androidx.lifecycle.z.f1648k) {
                        obj = obj2;
                    }
                    dVar2.getClass();
                    StringBuilder sb2 = new StringBuilder(64);
                    if (obj == null) {
                        sb2.append("null");
                    } else {
                        Class<?> cls = obj.getClass();
                        sb2.append(cls.getSimpleName());
                        sb2.append("{");
                        sb2.append(Integer.toHexString(System.identityHashCode(cls)));
                        sb2.append("}");
                    }
                    printWriter.println(sb2.toString());
                    printWriter.print(str2);
                    printWriter.print("mStarted=");
                    if (aVar.f1651c > 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    printWriter.println(z10);
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    @Override
    public boolean j() {
        return false;
    }

    @Override
    public boolean k(float f9) {
        return false;
    }

    @Override
    public long m(int i10) {
        boolean z10;
        boolean z11;
        switch (this.f49430a) {
            case 7:
                ArrayList arrayList = (ArrayList) this.f49432c;
                boolean z12 = false;
                if (i10 >= 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                f5.a.f(z10);
                if (i10 < arrayList.size()) {
                    z12 = true;
                }
                f5.a.f(z12);
                return ((Long) arrayList.get(i10)).longValue();
            default:
                long[] jArr = (long[]) this.f49432c;
                boolean z13 = false;
                if (i10 >= 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                f5.a.f(z11);
                if (i10 < jArr.length) {
                    z13 = true;
                }
                f5.a.f(z13);
                return jArr[i10];
        }
    }

    public com.google.android.datatransport.cct.CctBackendFactory n(java.lang.String r14) {
        throw new UnsupportedOperationException("Method not decompiled: v5.n.n(java.lang.String):com.google.android.datatransport.cct.CctBackendFactory");
    }

    public String o(String str) {
        Resources resources = (Resources) this.f49431b;
        int identifier = resources.getIdentifier(str, "string", (String) this.f49432c);
        if (identifier == 0) {
            return null;
        }
        return resources.getString(identifier);
    }

    public int p(Context context, com.google.android.gms.common.api.c cVar) {
        SparseIntArray sparseIntArray = (SparseIntArray) this.f49431b;
        z5.l.h(context);
        z5.l.h(cVar);
        int i10 = 0;
        if (!cVar.j()) {
            return 0;
        }
        int k9 = cVar.k();
        int i11 = sparseIntArray.get(k9, -1);
        if (i11 != -1) {
            return i11;
        }
        int i12 = 0;
        while (true) {
            if (i12 < sparseIntArray.size()) {
                int keyAt = sparseIntArray.keyAt(i12);
                if (keyAt > k9 && sparseIntArray.get(keyAt) == 0) {
                    break;
                }
                i12++;
            } else {
                i10 = -1;
                break;
            }
        }
        if (i10 == -1) {
            i10 = ((w5.e) this.f49432c).d(context, k9);
        }
        sparseIntArray.put(k9, i10);
        return i10;
    }

    @Override
    public List q(long j10) {
        t4.b bVar;
        switch (this.f49430a) {
            case 7:
                int c3 = d0.c((ArrayList) this.f49432c, Long.valueOf(j10), false);
                if (c3 == -1) {
                    return Collections.EMPTY_LIST;
                }
                return (List) ((ArrayList) this.f49431b).get(c3);
            default:
                int e10 = d0.e((long[]) this.f49432c, j10, false);
                if (e10 != -1 && (bVar = ((t4.b[]) this.f49431b)[e10]) != t4.b.D) {
                    return Collections.singletonList(bVar);
                }
                return Collections.EMPTY_LIST;
        }
    }

    @Override
    public Object then(Task task) {
        a aVar = (a) this.f49431b;
        Bundle bundle = (Bundle) this.f49432c;
        aVar.getClass();
        if (!task.isSuccessful()) {
            return task;
        }
        Bundle bundle2 = (Bundle) task.getResult();
        if (bundle2 != null && bundle2.containsKey("google.messenger")) {
            return aVar.a(bundle).onSuccessTask(m.f49429a, b.f49407b);
        }
        return task;
    }

    public String toString() {
        switch (this.f49430a) {
            case 2:
                StringBuilder sb2 = new StringBuilder(128);
                sb2.append("LoaderManager{");
                sb2.append(Integer.toHexString(System.identityHashCode(this)));
                sb2.append(" in ");
                Class<?> cls = ((t) this.f49431b).getClass();
                sb2.append(cls.getSimpleName());
                sb2.append("{");
                sb2.append(Integer.toHexString(System.identityHashCode(cls)));
                sb2.append("}}");
                return sb2.toString();
            case 11:
                StringBuilder sb3 = new StringBuilder(100);
                sb3.append(this.f49432c.getClass().getSimpleName());
                sb3.append('{');
                ArrayList arrayList = (ArrayList) this.f49431b;
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    sb3.append((String) arrayList.get(i10));
                    if (i10 < size - 1) {
                        sb3.append(", ");
                    }
                }
                sb3.append('}');
                return sb3.toString();
            default:
                return super.toString();
        }
    }

    @Override
    public int v() {
        switch (this.f49430a) {
            case 7:
                return ((ArrayList) this.f49432c).size();
            default:
                return ((long[]) this.f49432c).length;
        }
    }

    @Override
    public void w() {
        ((vd.j) this.f49431b).b((vd.k) this.f49432c);
    }

    public n(int i10, Object obj, Object obj2) {
        this.f49430a = i10;
        this.f49431b = obj;
        this.f49432c = obj2;
    }

    public n(Object obj, Object obj2, boolean z10, int i10) {
        this.f49430a = i10;
        this.f49432c = obj;
        this.f49431b = obj2;
    }

    public n(Object obj) {
        this.f49430a = 11;
        this.f49432c = obj;
        this.f49431b = new ArrayList();
    }

    public n(w5.e eVar) {
        this.f49430a = 13;
        this.f49431b = new SparseIntArray();
        z5.l.h(eVar);
        this.f49432c = eVar;
    }

    public n(t tVar, t0 t0Var) {
        this.f49430a = 2;
        this.f49431b = tVar;
        this.f49432c = (w1.b) new androidx.biometric.e(t0Var, w1.b.f49619f).l(w1.b.class);
    }

    public n(c0 c0Var) {
        this.f49430a = 5;
        this.f49431b = c0Var;
        this.f49432c = new w();
    }

    public n(Context context, int i10) {
        this.f49430a = i10;
        switch (i10) {
            case 12:
                z5.l.h(context);
                Resources resources = context.getResources();
                this.f49431b = resources;
                this.f49432c = resources.getResourcePackageName(2131701331);
                return;
            default:
                this.f49432c = null;
                this.f49431b = context;
                return;
        }
    }

    public n(b0 b0Var) {
        this.f49430a = 6;
        this.f49432c = b0Var;
        this.f49431b = new v(new byte[4], 4);
    }

    @Override
    public void l() {
    }

    @Override
    public void h(boolean z10) {
    }

    @Override
    public void b(c0 c0Var, o3.m mVar, y3.d0 d0Var) {
    }
}
