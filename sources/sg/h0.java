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
import org.telegram.ui.Components.cf;
import org.telegram.ui.en0;
import org.telegram.ui.rv;
import org.telegram.ui.tp0;
import y7.f7;
import z7.qa;
public final class h0 implements te.d, t0, q5.b, com.google.android.gms.common.api.internal.q, b3.q {
    public final int f56641a;
    public final Object f56642b;
    public Object f56643c;

    public h0(int i7, Object obj, Object obj2) {
        this.f56641a = i7;
        this.f56642b = obj;
        this.f56643c = obj2;
    }

    @Override
    public void a() {
        ((te.i) this.f56642b).a();
    }

    @Override
    public void accept(Object obj, Object obj2) {
        v6.d dVar = new v6.d((v6.e) this.f56642b, (TaskCompletionSource) obj2, 0);
        v6.c cVar = (v6.c) ((v6.f) obj).n();
        Parcel j12 = cVar.j1();
        n7.a.c(j12, dVar);
        n7.a.b(j12, (v6.a) this.f56643c);
        cVar.k1(j12, 1);
    }

    public ArrayList b() {
        ?? arrayList;
        ArrayList arrayList2 = new ArrayList();
        Context context = (Context) this.f56642b;
        Class cls = (Class) ((cf) this.f56643c).f33545a;
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

    @Override
    public void b0() {
        ((te.i) this.f56642b).f((te.j) this.f56643c);
    }

    public void c(String str, PrintWriter printWriter) {
        boolean z10;
        z1.b bVar = (z1.b) this.f56643c;
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
                    printWriter.println(aVar.f60775l);
                    d6.d dVar = aVar.f60775l;
                    String str3 = str2 + "  ";
                    dVar.getClass();
                    printWriter.print(str3);
                    printWriter.print("mId=");
                    printWriter.print(0);
                    printWriter.print(" mListener=");
                    printWriter.println(dVar.f7584a);
                    if (dVar.f7585b || dVar.f7587e) {
                        printWriter.print(str3);
                        printWriter.print("mStarted=");
                        printWriter.print(dVar.f7585b);
                        printWriter.print(" mContentChanged=");
                        printWriter.print(dVar.f7587e);
                        printWriter.print(" mProcessingChange=");
                        printWriter.println(false);
                    }
                    if (dVar.f7586c || dVar.d) {
                        printWriter.print(str3);
                        printWriter.print("mAbandoned=");
                        printWriter.print(dVar.f7586c);
                        printWriter.print(" mReset=");
                        printWriter.println(dVar.d);
                    }
                    if (dVar.f7589g != null) {
                        printWriter.print(str3);
                        printWriter.print("mTask=");
                        printWriter.print(dVar.f7589g);
                        printWriter.print(" waiting=");
                        dVar.f7589g.getClass();
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
                    if (aVar.f60777n != null) {
                        printWriter.print(str2);
                        printWriter.print("mCallbacks=");
                        printWriter.println(aVar.f60777n);
                        ca.i iVar = aVar.f60777n;
                        iVar.getClass();
                        printWriter.print(str2 + "  ");
                        printWriter.print("mDeliveredData=");
                        printWriter.println(iVar.f4843b);
                    }
                    printWriter.print(str2);
                    printWriter.print("mData=");
                    d6.d dVar2 = aVar.f60775l;
                    Object obj2 = aVar.f2566e;
                    if (obj2 != androidx.lifecycle.z.f2562k) {
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
                    if (aVar.f2565c > 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    printWriter.println(z10);
                    i7++;
                } else {
                    return;
                }
            }
        }
    }

    public View d(int i7, int i10, int i11, int i12) {
        int i13;
        v4.i1 i1Var = (v4.i1) this.f56643c;
        v4.j1 j1Var = (v4.j1) this.f56642b;
        int B = j1Var.B();
        int S = j1Var.S();
        if (i10 > i7) {
            i13 = 1;
        } else {
            i13 = -1;
        }
        View view = null;
        while (i7 != i10) {
            View g02 = j1Var.g0(i7);
            int e10 = j1Var.e(g02);
            int i02 = j1Var.i0(g02);
            i1Var.f58579b = B;
            i1Var.f58580c = S;
            i1Var.d = e10;
            i1Var.f58581e = i02;
            if (i11 != 0) {
                i1Var.f58578a = i11;
                if (i1Var.a()) {
                    return g02;
                }
            }
            if (i12 != 0) {
                i1Var.f58578a = i12;
                if (i1Var.a()) {
                    view = g02;
                }
            }
            i7 += i13;
        }
        return view;
    }

    public boolean e(View view) {
        v4.i1 i1Var = (v4.i1) this.f56643c;
        v4.j1 j1Var = (v4.j1) this.f56642b;
        int B = j1Var.B();
        int S = j1Var.S();
        int e10 = j1Var.e(view);
        int i02 = j1Var.i0(view);
        i1Var.f58579b = B;
        i1Var.f58580c = S;
        i1Var.d = e10;
        i1Var.f58581e = i02;
        i1Var.f58578a = 24579;
        return i1Var.a();
    }

    public f3.i0 f(int i7) {
        int i10 = 0;
        while (true) {
            int[] iArr = (int[]) this.f56642b;
            if (i10 < iArr.length) {
                if (i7 == iArr[i10]) {
                    return ((x2.a1[]) this.f56643c)[i10];
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
        qb.a aVar = new qb.a(28);
        pb.b bVar = new pb.b(28);
        Object mo24get = ((fd.a) this.f56642b).mo24get();
        fd.a aVar2 = (fd.a) this.f56643c;
        return new v5.g(aVar, bVar, v5.a.f58702f, (v5.i) mo24get, aVar2);
    }

    @Override
    public void h0() {
        tp0 tp0Var = (tp0) this.f56643c;
        tp0Var.f57295p0.f56697a.C();
        tp0Var.V0.setViewHidden(false);
    }

    @Override
    public Object l(Uri uri, j2.k kVar) {
        w2.a aVar = (w2.a) ((b3.q) this.f56642b).l(uri, kVar);
        List list = (List) this.f56643c;
        if (list != null && !list.isEmpty()) {
            return (w2.a) aVar.a(list);
        }
        return aVar;
    }

    @Override
    public void m() {
        ((en0) this.f56642b).run();
    }

    @Override
    public void o() {
        rv rvVar = ((tp0) this.f56643c).H0;
        if (rvVar != null) {
            rvVar.invalidate();
        }
    }

    @Override
    public boolean q() {
        return false;
    }

    @Override
    public void q0() {
        tp0 tp0Var = (tp0) this.f56643c;
        if (tp0Var.C0 != null) {
            tp0Var.r0(null, true);
        }
        tp0Var.V0.setViewHidden(true);
    }

    @Override
    public boolean s(float f10) {
        return false;
    }

    @Override
    public void t() {
        tp0 tp0Var = (tp0) this.f56643c;
        if (tp0Var.U0) {
            tp0Var.U0 = false;
            return;
        }
        tp0Var.f57281d1.b(1);
        tp0Var.w((h) h.f56640a.get(0));
    }

    public String toString() {
        switch (this.f56641a) {
            case 12:
                StringBuilder sb2 = new StringBuilder(128);
                sb2.append("LoaderManager{");
                sb2.append(Integer.toHexString(System.identityHashCode(this)));
                sb2.append(" in ");
                Class<?> cls = ((androidx.lifecycle.t) this.f56642b).getClass();
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
        boolean z10;
        tp0 tp0Var = (tp0) this.f56643c;
        if (tp0Var.C0 == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            tp0Var.r0(null, true);
        }
        return z10;
    }

    public h0(Object obj, Object obj2, boolean z10, int i7) {
        this.f56641a = i7;
        this.f56643c = obj;
        this.f56642b = obj2;
    }

    public h0(f7 f7Var) {
        this.f56641a = 13;
        this.f56643c = new Object();
        this.f56642b = f7Var;
        qa.b();
    }

    public h0(Context context) {
        this.f56641a = 10;
        this.f56642b = context;
        this.f56643c = null;
    }

    public h0(androidx.lifecycle.t tVar, androidx.lifecycle.t0 t0Var) {
        this.f56641a = 12;
        this.f56642b = tVar;
        this.f56643c = (z1.b) new android.support.v4.media.session.a0(t0Var, z1.b.f60778f).j(z1.b.class);
    }

    public h0(v4.j1 j1Var) {
        this.f56641a = 5;
        this.f56642b = j1Var;
        ?? obj = new Object();
        obj.f58578a = 0;
        this.f56643c = obj;
    }

    @Override
    public void n(boolean z10) {
    }

    @Override
    public void v() {
    }
}
