package sg;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.util.Log;
import android.view.View;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.telegram.ui.Components.rt;
import org.telegram.ui.cn0;
import org.telegram.ui.l00;
import org.telegram.ui.up0;
import y7.d6;
import z7.qa;
public final class i0 implements te.d, v0, q5.b, com.google.android.gms.common.api.internal.p, b3.q {
    public final int f55067a;
    public final Object f55068b;
    public Object f55069c;

    public i0(int i7, Object obj, Object obj2) {
        this.f55067a = i7;
        this.f55068b = obj;
        this.f55069c = obj2;
    }

    @Override
    public boolean A() {
        return false;
    }

    @Override
    public boolean B(float f10) {
        return false;
    }

    @Override
    public Object L1(Uri uri, j2.k kVar) {
        w2.a aVar = (w2.a) ((b3.q) this.f55068b).L1(uri, kVar);
        List list = (List) this.f55069c;
        if (list != null && !list.isEmpty()) {
            return (w2.a) aVar.a(list);
        }
        return aVar;
    }

    @Override
    public void Y() {
        up0 up0Var = (up0) this.f55069c;
        up0Var.f55682o0.f55147a.f();
        up0Var.U0.setViewHidden(false);
    }

    @Override
    public void Y0() {
        ((te.i) this.f55068b).f((te.j) this.f55069c);
    }

    @Override
    public void a() {
        ((te.i) this.f55068b).a();
    }

    @Override
    public void accept(Object obj, Object obj2) {
        v6.d dVar = new v6.d((v6.f) this.f55068b, (TaskCompletionSource) obj2, 0);
        v6.c cVar = (v6.c) ((v6.g) obj).n();
        Parcel j12 = cVar.j1();
        n7.a.c(j12, dVar);
        n7.a.b(j12, (v6.a) this.f55069c);
        cVar.k1(j12, 1);
    }

    public ArrayList b() {
        ?? arrayList;
        ArrayList arrayList2 = new ArrayList();
        Context context = (Context) this.f55068b;
        Class cls = (Class) ((rt) this.f55069c).f37758b;
        Bundle bundle = null;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                Log.w("ComponentDiscovery", "Context has no PackageManager.");
            } else {
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, cls), 128);
                if (serviceInfo == null) {
                    Log.w("ComponentDiscovery", cls + " has no service info.");
                } else {
                    bundle = serviceInfo.metaData;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("ComponentDiscovery", "Application info not found.");
        }
        if (bundle == null) {
            Log.w("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
            arrayList = Collections.EMPTY_LIST;
        } else {
            arrayList = new ArrayList();
            for (String str : bundle.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(bundle.get(str)) && str.startsWith("com.google.firebase.components:")) {
                    arrayList.add(str.substring(31));
                }
            }
        }
        for (String str2 : arrayList) {
            arrayList2.add(new u9.c(str2, 0));
        }
        return arrayList2;
    }

    public void c(String str, PrintWriter printWriter) {
        boolean z9;
        z1.b bVar = (z1.b) this.f55069c;
        if (bVar.d.f34c > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            String str2 = str + "    ";
            int i7 = 0;
            while (true) {
                a0.m mVar = bVar.d;
                if (i7 < mVar.f34c) {
                    z1.a aVar = (z1.a) mVar.f33b[i7];
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(bVar.d.f32a[i7]);
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
                    printWriter.println(aVar.f59566l);
                    d6.d dVar = aVar.f59566l;
                    String str3 = str2 + "  ";
                    dVar.getClass();
                    printWriter.print(str3);
                    printWriter.print("mId=");
                    printWriter.print(0);
                    printWriter.print(" mListener=");
                    printWriter.println(dVar.f8195a);
                    if (dVar.f8196b || dVar.f8198e) {
                        printWriter.print(str3);
                        printWriter.print("mStarted=");
                        printWriter.print(dVar.f8196b);
                        printWriter.print(" mContentChanged=");
                        printWriter.print(dVar.f8198e);
                        printWriter.print(" mProcessingChange=");
                        printWriter.println(false);
                    }
                    if (dVar.f8197c || dVar.d) {
                        printWriter.print(str3);
                        printWriter.print("mAbandoned=");
                        printWriter.print(dVar.f8197c);
                        printWriter.print(" mReset=");
                        printWriter.println(dVar.d);
                    }
                    if (dVar.f8200g != null) {
                        printWriter.print(str3);
                        printWriter.print("mTask=");
                        printWriter.print(dVar.f8200g);
                        printWriter.print(" waiting=");
                        dVar.f8200g.getClass();
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
                    if (aVar.f59568n != null) {
                        printWriter.print(str2);
                        printWriter.print("mCallbacks=");
                        printWriter.println(aVar.f59568n);
                        ca.i iVar = aVar.f59568n;
                        iVar.getClass();
                        printWriter.print(str2 + "  ");
                        printWriter.print("mDeliveredData=");
                        printWriter.println(iVar.f6015b);
                    }
                    printWriter.print(str2);
                    printWriter.print("mData=");
                    d6.d dVar2 = aVar.f59566l;
                    Object obj2 = aVar.f2611e;
                    if (obj2 != androidx.lifecycle.z.f2607k) {
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
                    if (aVar.f2610c > 0) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    printWriter.println(z9);
                    i7++;
                } else {
                    return;
                }
            }
        }
    }

    public View d(int i7, int i10, int i11, int i12) {
        int i13;
        v4.h1 h1Var = (v4.h1) this.f55069c;
        v4.i1 i1Var = (v4.i1) this.f55068b;
        int A = i1Var.A();
        int N = i1Var.N();
        if (i10 > i7) {
            i13 = 1;
        } else {
            i13 = -1;
        }
        View view = null;
        while (i7 != i10) {
            View W = i1Var.W(i7);
            int k10 = i1Var.k(W);
            int a02 = i1Var.a0(W);
            h1Var.f57085b = A;
            h1Var.f57086c = N;
            h1Var.d = k10;
            h1Var.f57087e = a02;
            if (i11 != 0) {
                h1Var.f57084a = i11;
                if (h1Var.a()) {
                    return W;
                }
            }
            if (i12 != 0) {
                h1Var.f57084a = i12;
                if (h1Var.a()) {
                    view = W;
                }
            }
            i7 += i13;
        }
        return view;
    }

    @Override
    public void d0() {
        up0 up0Var = (up0) this.f55069c;
        if (up0Var.B0 != null) {
            up0Var.r0(null, true);
        }
        up0Var.U0.setViewHidden(true);
    }

    public boolean e(View view) {
        v4.h1 h1Var = (v4.h1) this.f55069c;
        v4.i1 i1Var = (v4.i1) this.f55068b;
        int A = i1Var.A();
        int N = i1Var.N();
        int k10 = i1Var.k(view);
        int a02 = i1Var.a0(view);
        h1Var.f57085b = A;
        h1Var.f57086c = N;
        h1Var.d = k10;
        h1Var.f57087e = a02;
        h1Var.f57084a = 24579;
        return h1Var.a();
    }

    public f3.j0 f(int i7) {
        int i10 = 0;
        while (true) {
            int[] iArr = (int[]) this.f55068b;
            if (i10 < iArr.length) {
                if (i7 == iArr[i10]) {
                    return ((x2.b1[]) this.f55069c)[i10];
                }
                i10++;
            } else {
                h2.a.c("BaseMediaChunkOutput", "Unmatched track of type: " + i7);
                return new f3.n();
            }
        }
    }

    @Override
    public Object mo24get() {
        nb.a aVar = new nb.a(28);
        w7.s sVar = new w7.s(27, false);
        Object mo24get = ((fd.a) this.f55068b).mo24get();
        fd.a aVar2 = (fd.a) this.f55069c;
        return new v5.g(aVar, sVar, v5.a.f57219f, (v5.i) mo24get, aVar2);
    }

    @Override
    public void n() {
        ((cn0) this.f55068b).run();
    }

    @Override
    public void o() {
        l00 l00Var = ((up0) this.f55069c).G0;
        if (l00Var != null) {
            l00Var.invalidate();
        }
    }

    @Override
    public void p() {
        up0 up0Var = (up0) this.f55069c;
        if (up0Var.T0) {
            up0Var.T0 = false;
            return;
        }
        up0Var.f55668c1.b(1);
        up0Var.w((h) h.f55060a.get(0));
    }

    public String toString() {
        switch (this.f55067a) {
            case 12:
                StringBuilder sb2 = new StringBuilder(128);
                sb2.append("LoaderManager{");
                sb2.append(Integer.toHexString(System.identityHashCode(this)));
                sb2.append(" in ");
                Class<?> cls = ((androidx.lifecycle.t) this.f55068b).getClass();
                sb2.append(cls.getSimpleName());
                sb2.append("{");
                sb2.append(Integer.toHexString(System.identityHashCode(cls)));
                sb2.append("}}");
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    @Override
    public boolean z() {
        boolean z9;
        up0 up0Var = (up0) this.f55069c;
        if (up0Var.B0 == null) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (!z9) {
            up0Var.r0(null, true);
        }
        return z9;
    }

    public i0(Object obj, Object obj2, boolean z9, int i7) {
        this.f55067a = i7;
        this.f55069c = obj;
        this.f55068b = obj2;
    }

    public i0(d6 d6Var) {
        this.f55067a = 13;
        this.f55069c = new Object();
        this.f55068b = d6Var;
        qa.b();
    }

    public i0(Context context) {
        this.f55067a = 10;
        this.f55068b = context;
        this.f55069c = null;
    }

    public i0(androidx.lifecycle.t tVar, androidx.lifecycle.t0 t0Var) {
        this.f55067a = 12;
        this.f55068b = tVar;
        this.f55069c = (z1.b) new android.support.v4.media.session.a0(t0Var, z1.b.f59569f).i(z1.b.class);
    }

    public i0(v4.i1 i1Var) {
        this.f55067a = 5;
        this.f55068b = i1Var;
        ?? obj = new Object();
        obj.f57084a = 0;
        this.f55069c = obj;
    }

    @Override
    public void l(boolean z9) {
    }

    @Override
    public void D() {
    }
}
