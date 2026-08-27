package w3;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.content.res.Resources;
import android.media.MediaCodec;
import android.os.Bundle;
import android.os.HandlerThread;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import com.google.android.datatransport.cct.CctBackendFactory;
import com.google.android.datatransport.runtime.backends.TransportBackendDiscovery;
import d5.g0;
import e0.i0;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.InvocationTargetException;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class b0 implements y, r4.g, y2.b, y3.j, ud.b {

    public final int f48997a;

    public final Object f48998b;

    public Object f48999c;

    public b0(int i10, Object obj, Object obj2) {
        this.f48997a = i10;
        this.f48998b = obj;
        this.f48999c = obj2;
    }

    public static b0 d(Context context) {
        FileChannel channel;
        FileLock fileLockLock;
        try {
            channel = new RandomAccessFile(new File(context.getFilesDir(), "generatefid.lock"), "rw").getChannel();
            try {
                fileLockLock = channel.lock();
                try {
                    return new b0(14, channel, fileLockLock);
                } catch (IOException e9) {
                    e = e9;
                    Log.e("CrossProcessLock", "encountered error while creating and acquiring the lock, ignoring", e);
                    if (fileLockLock != null) {
                        try {
                            fileLockLock.release();
                        } catch (IOException unused) {
                        }
                    }
                    if (channel != null) {
                        try {
                            channel.close();
                        } catch (IOException unused2) {
                        }
                    }
                    return null;
                } catch (Error e10) {
                    e = e10;
                    Log.e("CrossProcessLock", "encountered error while creating and acquiring the lock, ignoring", e);
                    if (fileLockLock != null) {
                        fileLockLock.release();
                    }
                    if (channel != null) {
                        channel.close();
                    }
                    return null;
                } catch (OverlappingFileLockException e11) {
                    e = e11;
                    Log.e("CrossProcessLock", "encountered error while creating and acquiring the lock, ignoring", e);
                    if (fileLockLock != null) {
                        fileLockLock.release();
                    }
                    if (channel != null) {
                        channel.close();
                    }
                    return null;
                }
            } catch (IOException | Error | OverlappingFileLockException e12) {
                e = e12;
                fileLockLock = null;
            }
        } catch (IOException | Error | OverlappingFileLockException e13) {
            e = e13;
            channel = null;
            fileLockLock = null;
        }
    }

    @Override
    public void A(float f10, int i10) {
        boolean z10;
        yg.i iVar = (yg.i) this.f48999c;
        boolean z11 = true;
        if ((iVar.b() == 0.0f && iVar.f50161s == 2) || iVar.f50161s == 3) {
            iVar.f50161s = 1;
            z10 = true;
        } else {
            z10 = false;
        }
        if (f10 == 1.0f) {
            int i11 = iVar.f50162w;
            int i12 = iVar.v;
            if (i11 != i12) {
                iVar.f50162w = i12;
            } else {
                z11 = z10;
            }
        } else {
            z11 = z10;
        }
        if (z11) {
            ((Runnable) this.f48998b).run();
        }
        iVar.a();
    }

    @Override
    public void b(d5.z zVar) {
        c0 c0Var = (c0) this.f48999c;
        SparseArray sparseArray = c0Var.f49007f;
        d5.y yVar = (d5.y) this.f48998b;
        if (zVar.r() == 0 && (zVar.r() & 128) != 0) {
            zVar.D(6);
            int iA = zVar.a() / 4;
            for (int i10 = 0; i10 < iA; i10++) {
                zVar.c(0, 4, yVar.f4853b);
                yVar.p(0);
                int i11 = yVar.i(16);
                yVar.s(3);
                if (i11 == 0) {
                    yVar.s(13);
                } else {
                    int i12 = yVar.i(13);
                    if (sparseArray.get(i12) == null) {
                        sparseArray.put(i12, new z(new i0(c0Var, i12)));
                        c0Var.f49012l++;
                    }
                }
            }
            if (c0Var.f49003a != 2) {
                sparseArray.remove(0);
            }
        }
    }

    @Override
    public int c(long j10) {
        int i10;
        switch (this.f48997a) {
            case 1:
                ArrayList arrayList = (ArrayList) this.f48999c;
                Long lValueOf = Long.valueOf(j10);
                int i11 = g0.f4795a;
                int iBinarySearch = Collections.binarySearch(arrayList, lValueOf);
                if (iBinarySearch < 0) {
                    i10 = ~iBinarySearch;
                } else {
                    int size = arrayList.size();
                    do {
                        iBinarySearch++;
                        if (iBinarySearch < size) {
                        }
                        i10 = iBinarySearch;
                    } while (((Comparable) arrayList.get(iBinarySearch)).compareTo(lValueOf) == 0);
                    i10 = iBinarySearch;
                }
                if (i10 < arrayList.size()) {
                    return i10;
                }
                return -1;
            default:
                long[] jArr = (long[]) this.f48999c;
                int iB = g0.b(jArr, j10, false);
                if (iB < jArr.length) {
                    return iB;
                }
                return -1;
        }
    }

    public void e(Object obj, String str) {
        ((ArrayList) this.f48998b).add(a9.p.w(str, "=", String.valueOf(obj)));
    }

    @Override
    public long f(int i10) {
        switch (this.f48997a) {
            case 1:
                ArrayList arrayList = (ArrayList) this.f48999c;
                d5.a.f(i10 >= 0);
                d5.a.f(i10 < arrayList.size());
                return ((Long) arrayList.get(i10)).longValue();
            default:
                long[] jArr = (long[]) this.f48999c;
                d5.a.f(i10 >= 0);
                d5.a.f(i10 < jArr.length);
                return jArr[i10];
        }
    }

    @Override
    public y3.c t1(y3.i iVar) throws Exception {
        MediaCodec mediaCodecCreateByCodecName;
        String str = iVar.f49490a.f49495a;
        y3.c cVar = null;
        try {
            d5.a.c("createCodec:" + str);
            mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
            try {
                y3.c cVar2 = new y3.c(mediaCodecCreateByCodecName, (HandlerThread) ((y3.b) this.f48998b).get(), (HandlerThread) ((y3.b) this.f48999c).get());
                try {
                    d5.a.q();
                    y3.c.i(cVar2, iVar.f49491b, iVar.d, iVar.f49493e);
                    return cVar2;
                } catch (Exception e9) {
                    e = e9;
                    cVar = cVar2;
                    if (cVar != null) {
                        cVar.release();
                    } else if (mediaCodecCreateByCodecName != null) {
                        mediaCodecCreateByCodecName.release();
                    }
                    throw e;
                }
            } catch (Exception e10) {
                e = e10;
            }
        } catch (Exception e11) {
            e = e11;
            mediaCodecCreateByCodecName = null;
        }
    }

    @Override
    public Object mo28get() {
        return new x2.d((Context) ((e.a) this.f48998b).f5035a, (u2.b) ((n1.d) this.f48999c).mo28get());
    }

    @Override
    public List h(long j10) {
        r4.c cVar;
        switch (this.f48997a) {
            case 1:
                int iC = g0.c((ArrayList) this.f48999c, Long.valueOf(j10), false);
                return iC == -1 ? Collections.EMPTY_LIST : (List) ((ArrayList) this.f48998b).get(iC);
            default:
                int iE = g0.e((long[]) this.f48999c, j10, false);
                return (iE == -1 || (cVar = ((r4.c[]) this.f48998b)[iE]) == r4.c.D) ? Collections.EMPTY_LIST : Collections.singletonList(cVar);
        }
    }

    public ArrayList i() {
        ?? arrayList;
        ArrayList arrayList2 = new ArrayList();
        m5.o oVar = (m5.o) this.f48999c;
        Context context = (Context) this.f48998b;
        Class cls = (Class) oVar.f17823b;
        Bundle bundle = null;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                Log.w("ComponentDiscovery", "Context has no PackageManager.");
            } else {
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) cls), 128);
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
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new z8.c((String) it.next(), 0));
        }
        return arrayList2;
    }

    public CctBackendFactory j(String str) {
        Bundle bundle;
        Map map;
        Object obj;
        if (((Map) this.f48999c) == null) {
            Context context = (Context) this.f48998b;
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    Log.w("BackendRegistry", "Context has no PackageManager.");
                } else {
                    ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) TransportBackendDiscovery.class), 128);
                    if (serviceInfo == null) {
                        Log.w("BackendRegistry", "TransportBackendDiscovery has no service info.");
                    } else {
                        bundle = serviceInfo.metaData;
                    }
                    if (bundle == null) {
                        Log.w("BackendRegistry", "Could not retrieve metadata, returning empty list of transport backends.");
                        map = Collections.EMPTY_MAP;
                    } else {
                        HashMap map2 = new HashMap();
                        for (String str2 : bundle.keySet()) {
                            obj = bundle.get(str2);
                            if (!(obj instanceof String) && str2.startsWith("backend:")) {
                                for (String str3 : ((String) obj).split(",", -1)) {
                                    String strTrim = str3.trim();
                                    if (!strTrim.isEmpty()) {
                                        map2.put(strTrim, str2.substring(8));
                                    }
                                }
                            }
                        }
                        map = map2;
                    }
                    this.f48999c = map;
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("BackendRegistry", "Application info not found.");
            }
            bundle = null;
            if (bundle == null) {
                Log.w("BackendRegistry", "Could not retrieve metadata, returning empty list of transport backends.");
                map = Collections.EMPTY_MAP;
            } else {
                HashMap map3 = new HashMap();
                while (r6.hasNext()) {
                    obj = bundle.get(str2);
                    if (!(obj instanceof String)) {
                    }
                }
                map = map3;
            }
            this.f48999c = map;
        }
        String str4 = (String) ((Map) this.f48999c).get(str);
        if (str4 == null) {
            return null;
        }
        try {
            return (CctBackendFactory) Class.forName(str4).asSubclass(CctBackendFactory.class).getDeclaredConstructor(null).newInstance(null);
        } catch (ClassNotFoundException e9) {
            Log.w("BackendRegistry", "Class " + str4 + " is not found.", e9);
            return null;
        } catch (IllegalAccessException e10) {
            Log.w("BackendRegistry", "Could not instantiate " + str4 + ".", e10);
            return null;
        } catch (InstantiationException e11) {
            Log.w("BackendRegistry", "Could not instantiate " + str4 + ".", e11);
            return null;
        } catch (NoSuchMethodException e12) {
            Log.w("BackendRegistry", "Could not instantiate ".concat(str4), e12);
            return null;
        } catch (InvocationTargetException e13) {
            Log.w("BackendRegistry", "Could not instantiate ".concat(str4), e13);
            return null;
        }
    }

    public String k(String str) {
        String str2 = (String) this.f48999c;
        Resources resources = (Resources) this.f48998b;
        int identifier = resources.getIdentifier(str, "string", str2);
        if (identifier == 0) {
            return null;
        }
        return resources.getString(identifier);
    }

    public void l() {
        try {
            ((FileLock) this.f48999c).release();
            ((FileChannel) this.f48998b).close();
        } catch (IOException e9) {
            Log.e("CrossProcessLock", "encountered error while releasing, ignoring", e9);
        }
    }

    public int m(Context context, com.google.android.gms.common.api.c cVar) {
        SparseIntArray sparseIntArray = (SparseIntArray) this.f48998b;
        y5.l.h(context);
        y5.l.h(cVar);
        int iD = 0;
        if (!cVar.j()) {
            return 0;
        }
        int iK = cVar.k();
        int i10 = sparseIntArray.get(iK, -1);
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        while (true) {
            if (i11 >= sparseIntArray.size()) {
                iD = -1;
                break;
            }
            int iKeyAt = sparseIntArray.keyAt(i11);
            if (iKeyAt > iK && sparseIntArray.get(iKeyAt) == 0) {
                break;
            }
            i11++;
        }
        if (iD == -1) {
            iD = ((v5.e) this.f48999c).d(context, iK);
        }
        sparseIntArray.put(iK, iD);
        return iD;
    }

    @Override
    public void o(int i10, float f10, float f11, ud.c cVar) {
        yg.i iVar = (yg.i) this.f48999c;
        iVar.f50156c.a(f10);
        iVar.d.a(f10);
        iVar.f50155b.a(f10);
        ((Runnable) this.f48998b).run();
    }

    @Override
    public int p() {
        switch (this.f48997a) {
            case 1:
                return ((ArrayList) this.f48999c).size();
            default:
                return ((long[]) this.f48999c).length;
        }
    }

    public String toString() {
        switch (this.f48997a) {
            case 6:
                StringBuilder sb2 = new StringBuilder(100);
                sb2.append(this.f48999c.getClass().getSimpleName());
                sb2.append('{');
                ArrayList arrayList = (ArrayList) this.f48998b;
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    sb2.append((String) arrayList.get(i10));
                    if (i10 < size - 1) {
                        sb2.append(", ");
                    }
                }
                sb2.append('}');
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public b0(Object obj) {
        this.f48997a = 6;
        this.f48999c = obj;
        this.f48998b = new ArrayList();
    }

    public b0(v5.e eVar) {
        this.f48997a = 8;
        this.f48998b = new SparseIntArray();
        y5.l.h(eVar);
        this.f48999c = eVar;
    }

    public b0(yg.i iVar, Runnable runnable) {
        this.f48997a = 12;
        this.f48999c = iVar;
        this.f48998b = runnable;
    }

    public b0(int i10) {
        this.f48997a = 5;
        y3.b bVar = new y3.b(i10, 0);
        y3.b bVar2 = new y3.b(i10, 1);
        this.f48998b = bVar;
        this.f48999c = bVar2;
    }

    public b0(yf.g0 g0Var) {
        this.f48997a = 10;
        this.f48998b = g0Var;
    }

    public b0(Context context, int i10) {
        this.f48997a = i10;
        switch (i10) {
            case 7:
                y5.l.h(context);
                Resources resources = context.getResources();
                this.f48998b = resources;
                this.f48999c = resources.getResourcePackageName(2131701329);
                break;
            default:
                this.f48999c = null;
                this.f48998b = context;
                break;
        }
    }

    public b0(c0 c0Var) {
        this.f48997a = 0;
        this.f48999c = c0Var;
        this.f48998b = new d5.y(new byte[4], 4);
    }

    @Override
    public void a(d5.f0 f0Var, m3.m mVar, e0 e0Var) {
    }
}
