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
import org.telegram.ui.Cells.c5;
import org.telegram.ui.hn0;
import org.telegram.ui.uv;
import org.telegram.ui.wp0;
import y7.f7;
import z7.qa;
public final class h0 implements te.d, t0, q5.b, com.google.android.gms.common.api.internal.q, b3.r {
    public final int f57225a;
    public final Object f57226b;
    public Object f57227c;

    public h0(int i7, Object obj, Object obj2) {
        this.f57225a = i7;
        this.f57226b = obj;
        this.f57227c = obj2;
    }

    @Override
    public boolean C() {
        return false;
    }

    @Override
    public boolean D(float f10) {
        return false;
    }

    @Override
    public void a() {
        ((te.i) this.f57226b).a();
    }

    @Override
    public void accept(Object obj, Object obj2) {
        v6.d dVar = new v6.d((v6.e) this.f57226b, (TaskCompletionSource) obj2, 0);
        v6.c cVar = (v6.c) ((v6.f) obj).n();
        Parcel j12 = cVar.j1();
        n7.a.c(j12, dVar);
        n7.a.b(j12, (v6.a) this.f57227c);
        cVar.k1(j12, 1);
    }

    public ArrayList b() {
        ?? arrayList;
        ArrayList arrayList2 = new ArrayList();
        Context context = (Context) this.f57226b;
        Class cls = (Class) ((c5) this.f57227c).f30474a;
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
        boolean z10;
        z1.b bVar = (z1.b) this.f57227c;
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
                    printWriter.println(aVar.f61350l);
                    d6.d dVar = aVar.f61350l;
                    String str3 = str2 + "  ";
                    dVar.getClass();
                    printWriter.print(str3);
                    printWriter.print("mId=");
                    printWriter.print(0);
                    printWriter.print(" mListener=");
                    printWriter.println(dVar.f7859a);
                    if (dVar.f7860b || dVar.f7862e) {
                        printWriter.print(str3);
                        printWriter.print("mStarted=");
                        printWriter.print(dVar.f7860b);
                        printWriter.print(" mContentChanged=");
                        printWriter.print(dVar.f7862e);
                        printWriter.print(" mProcessingChange=");
                        printWriter.println(false);
                    }
                    if (dVar.f7861c || dVar.d) {
                        printWriter.print(str3);
                        printWriter.print("mAbandoned=");
                        printWriter.print(dVar.f7861c);
                        printWriter.print(" mReset=");
                        printWriter.println(dVar.d);
                    }
                    if (dVar.f7864g != null) {
                        printWriter.print(str3);
                        printWriter.print("mTask=");
                        printWriter.print(dVar.f7864g);
                        printWriter.print(" waiting=");
                        dVar.f7864g.getClass();
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
                    if (aVar.f61352n != null) {
                        printWriter.print(str2);
                        printWriter.print("mCallbacks=");
                        printWriter.println(aVar.f61352n);
                        ca.i iVar = aVar.f61352n;
                        iVar.getClass();
                        printWriter.print(str2 + "  ");
                        printWriter.print("mDeliveredData=");
                        printWriter.println(iVar.f5117b);
                    }
                    printWriter.print(str2);
                    printWriter.print("mData=");
                    d6.d dVar2 = aVar.f61350l;
                    Object obj2 = aVar.f2528e;
                    if (obj2 != androidx.lifecycle.z.f2524k) {
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
                    if (aVar.f2527c > 0) {
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
        v4.i1 i1Var = (v4.i1) this.f57227c;
        v4.j1 j1Var = (v4.j1) this.f57226b;
        int z10 = j1Var.z();
        int R = j1Var.R();
        if (i10 > i7) {
            i13 = 1;
        } else {
            i13 = -1;
        }
        View view = null;
        while (i7 != i10) {
            View d02 = j1Var.d0(i7);
            int a10 = j1Var.a(d02);
            int f02 = j1Var.f0(d02);
            i1Var.f59154b = z10;
            i1Var.f59155c = R;
            i1Var.d = a10;
            i1Var.f59156e = f02;
            if (i11 != 0) {
                i1Var.f59153a = i11;
                if (i1Var.a()) {
                    return d02;
                }
            }
            if (i12 != 0) {
                i1Var.f59153a = i12;
                if (i1Var.a()) {
                    view = d02;
                }
            }
            i7 += i13;
        }
        return view;
    }

    public boolean e(View view) {
        v4.i1 i1Var = (v4.i1) this.f57227c;
        v4.j1 j1Var = (v4.j1) this.f57226b;
        int z10 = j1Var.z();
        int R = j1Var.R();
        int a10 = j1Var.a(view);
        int f02 = j1Var.f0(view);
        i1Var.f59154b = z10;
        i1Var.f59155c = R;
        i1Var.d = a10;
        i1Var.f59156e = f02;
        i1Var.f59153a = 24579;
        return i1Var.a();
    }

    @Override
    public void e0() {
        wp0 wp0Var = (wp0) this.f57227c;
        wp0Var.f57890p0.f57281a.u();
        wp0Var.V0.setViewHidden(false);
    }

    public f3.i0 f(int i7) {
        int i10 = 0;
        while (true) {
            int[] iArr = (int[]) this.f57226b;
            if (i10 < iArr.length) {
                if (i7 == iArr[i10]) {
                    return ((x2.c1[]) this.f57227c)[i10];
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
        Object mo24get = ((fd.a) this.f57226b).mo24get();
        fd.a aVar2 = (fd.a) this.f57227c;
        return new v5.g(aVar, bVar, v5.a.f59277f, (v5.i) mo24get, aVar2);
    }

    @Override
    public void j() {
        ((hn0) this.f57226b).run();
    }

    @Override
    public void k() {
        uv uvVar = ((wp0) this.f57227c).H0;
        if (uvVar != null) {
            uvVar.invalidate();
        }
    }

    @Override
    public void m1() {
        ((te.i) this.f57226b).f((te.j) this.f57227c);
    }

    @Override
    public void n() {
        wp0 wp0Var = (wp0) this.f57227c;
        if (wp0Var.U0) {
            wp0Var.U0 = false;
            return;
        }
        wp0Var.f57876d1.b(1);
        wp0Var.w((h) h.f57224a.get(0));
    }

    @Override
    public void n0() {
        wp0 wp0Var = (wp0) this.f57227c;
        if (wp0Var.C0 != null) {
            wp0Var.r0(null, true);
        }
        wp0Var.V0.setViewHidden(true);
    }

    @Override
    public Object t(Uri uri, j2.k kVar) {
        w2.a aVar = (w2.a) ((b3.r) this.f57226b).t(uri, kVar);
        List list = (List) this.f57227c;
        if (list != null && !list.isEmpty()) {
            return (w2.a) aVar.a(list);
        }
        return aVar;
    }

    public String toString() {
        switch (this.f57225a) {
            case 12:
                StringBuilder sb2 = new StringBuilder(128);
                sb2.append("LoaderManager{");
                sb2.append(Integer.toHexString(System.identityHashCode(this)));
                sb2.append(" in ");
                Class<?> cls = ((androidx.lifecycle.t) this.f57226b).getClass();
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
    public boolean y() {
        boolean z10;
        wp0 wp0Var = (wp0) this.f57227c;
        if (wp0Var.C0 == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            wp0Var.r0(null, true);
        }
        return z10;
    }

    public h0(Object obj, Object obj2, boolean z10, int i7) {
        this.f57225a = i7;
        this.f57227c = obj;
        this.f57226b = obj2;
    }

    public h0(f7 f7Var) {
        this.f57225a = 13;
        this.f57227c = new Object();
        this.f57226b = f7Var;
        qa.b();
    }

    public h0(Context context) {
        this.f57225a = 10;
        this.f57226b = context;
        this.f57227c = null;
    }

    public h0(androidx.lifecycle.t tVar, androidx.lifecycle.t0 t0Var) {
        this.f57225a = 12;
        this.f57226b = tVar;
        this.f57227c = (z1.b) new android.support.v4.media.session.a0(t0Var, z1.b.f61353f).j(z1.b.class);
    }

    public h0(v4.j1 j1Var) {
        this.f57225a = 5;
        this.f57226b = j1Var;
        ?? obj = new Object();
        obj.f59153a = 0;
        this.f57227c = obj;
    }

    @Override
    public void x(boolean z10) {
    }

    @Override
    public void H() {
    }
}
