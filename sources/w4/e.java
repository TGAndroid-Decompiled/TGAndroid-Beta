package w4;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.content.res.Resources;
import android.media.MediaCodec;
import android.os.Bundle;
import android.os.HandlerThread;
import android.util.Log;
import android.util.SparseIntArray;
import d5.f0;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import n5.e0;
import org.json.JSONException;
import org.json.JSONObject;
import r4.f;
import s8.h;
import x5.l;
import xf.g0;
import xg.i;
import y3.j;
public final class e implements f, y2.b, td.b, j {
    public final int f48760a;
    public Object f48761b;
    public Object f48762c;

    public e(int i9, Object obj, Object obj2) {
        this.f48760a = i9;
        this.f48761b = obj;
        this.f48762c = obj2;
    }

    public static w4.e a(android.content.Context r5) {
        throw new UnsupportedOperationException("Method not decompiled: w4.e.a(android.content.Context):w4.e");
    }

    @Override
    public void B(float r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: w4.e.B(float, int):void");
    }

    @Override
    public void J0(int i9, float f10, float f11, td.c cVar) {
        i iVar = (i) this.f48762c;
        iVar.f49443c.a(f10);
        iVar.d.a(f10);
        iVar.f49442b.a(f10);
        ((Runnable) this.f48761b).run();
    }

    @Override
    public int b(long j10) {
        int i9;
        switch (this.f48760a) {
            case 0:
                ArrayList arrayList = (ArrayList) this.f48762c;
                Long valueOf = Long.valueOf(j10);
                int i10 = f0.f4349a;
                int binarySearch = Collections.binarySearch(arrayList, valueOf);
                if (binarySearch < 0) {
                    i9 = ~binarySearch;
                } else {
                    int size = arrayList.size();
                    do {
                        binarySearch++;
                        if (binarySearch < size) {
                        }
                        i9 = binarySearch;
                    } while (((Comparable) arrayList.get(binarySearch)).compareTo(valueOf) == 0);
                    i9 = binarySearch;
                }
                if (i9 >= arrayList.size()) {
                    return -1;
                }
                return i9;
            default:
                long[] jArr = (long[]) this.f48762c;
                int b10 = f0.b(jArr, j10, false);
                if (b10 >= jArr.length) {
                    return -1;
                }
                return b10;
        }
    }

    public void c(Object obj, String str) {
        ((ArrayList) this.f48761b).add(aa.d.z(str, "=", String.valueOf(obj)));
    }

    @Override
    public y3.c G(y3.i iVar) {
        MediaCodec mediaCodec;
        String str = iVar.f49500a.f49505a;
        y3.c cVar = null;
        try {
            d5.a.c("createCodec:" + str);
            mediaCodec = MediaCodec.createByCodecName(str);
            try {
                y3.c cVar2 = new y3.c(mediaCodec, (HandlerThread) ((y3.b) this.f48761b).get(), (HandlerThread) ((y3.b) this.f48762c).get());
                try {
                    d5.a.q();
                    y3.c.i(cVar2, iVar.f49501b, iVar.d, iVar.f49503e);
                    return cVar2;
                } catch (Exception e10) {
                    e = e10;
                    cVar = cVar2;
                    if (cVar == null) {
                        if (mediaCodec != null) {
                            mediaCodec.release();
                        }
                    } else {
                        cVar.release();
                    }
                    throw e;
                }
            } catch (Exception e11) {
                e = e11;
            }
        } catch (Exception e12) {
            e = e12;
            mediaCodec = null;
        }
    }

    public ArrayList e() {
        ?? arrayList;
        ArrayList arrayList2 = new ArrayList();
        Context context = (Context) this.f48761b;
        Class cls = ((na.e) this.f48762c).f18529a;
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
            arrayList2.add(new y8.c(str2, 0));
        }
        return arrayList2;
    }

    public com.google.android.datatransport.cct.CctBackendFactory f(java.lang.String r14) {
        throw new UnsupportedOperationException("Method not decompiled: w4.e.f(java.lang.String):com.google.android.datatransport.cct.CctBackendFactory");
    }

    public File g() {
        if (((File) this.f48761b) == null) {
            synchronized (this) {
                try {
                    if (((File) this.f48761b) == null) {
                        h hVar = (h) this.f48762c;
                        hVar.a();
                        File filesDir = hVar.f47470a.getFilesDir();
                        this.f48761b = new File(filesDir, "PersistedInstallation." + ((h) this.f48762c).d() + ".json");
                    }
                } finally {
                }
            }
        }
        return (File) this.f48761b;
    }

    @Override
    public Object mo28get() {
        return new x2.d((Context) ((e0) this.f48761b).f18488b, (t5.c) ((e0) this.f48762c).mo28get());
    }

    @Override
    public long h(int i9) {
        boolean z10;
        boolean z11;
        switch (this.f48760a) {
            case 0:
                ArrayList arrayList = (ArrayList) this.f48762c;
                boolean z12 = false;
                if (i9 >= 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                d5.a.f(z10);
                if (i9 < arrayList.size()) {
                    z12 = true;
                }
                d5.a.f(z12);
                return ((Long) arrayList.get(i9)).longValue();
            default:
                long[] jArr = (long[]) this.f48762c;
                boolean z13 = false;
                if (i9 >= 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                d5.a.f(z11);
                if (i9 < jArr.length) {
                    z13 = true;
                }
                d5.a.f(z13);
                return jArr[i9];
        }
    }

    public String i(String str) {
        Resources resources = (Resources) this.f48761b;
        int identifier = resources.getIdentifier(str, "string", (String) this.f48762c);
        if (identifier == 0) {
            return null;
        }
        return resources.getString(identifier);
    }

    public void j(z9.a aVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", aVar.f50387a);
            jSONObject.put("Status", m1.j.b(aVar.f50388b));
            jSONObject.put("AuthToken", aVar.f50389c);
            jSONObject.put("RefreshToken", aVar.d);
            jSONObject.put("TokenCreationEpochInSecs", aVar.f50391f);
            jSONObject.put("ExpiresInSecs", aVar.f50390e);
            jSONObject.put("FisError", aVar.f50392g);
            h hVar = (h) this.f48762c;
            hVar.a();
            File createTempFile = File.createTempFile("PersistedInstallation", "tmp", hVar.f47470a.getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
            if (!createTempFile.renameTo(g())) {
                throw new IOException("unable to rename the tmpfile to PersistedInstallation");
            }
        } catch (IOException | JSONException unused) {
        }
    }

    public z9.a k() {
        JSONObject jSONObject;
        String str;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            FileInputStream fileInputStream = new FileInputStream(g());
            while (true) {
                int read = fileInputStream.read(bArr, 0, 16384);
                if (read < 0) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
            jSONObject = new JSONObject(byteArrayOutputStream.toString());
            fileInputStream.close();
        } catch (IOException | JSONException unused) {
            jSONObject = new JSONObject();
        }
        String optString = jSONObject.optString("Fid", null);
        int optInt = jSONObject.optInt("Status", 0);
        String optString2 = jSONObject.optString("AuthToken", null);
        String optString3 = jSONObject.optString("RefreshToken", null);
        long optLong = jSONObject.optLong("TokenCreationEpochInSecs", 0L);
        long optLong2 = jSONObject.optLong("ExpiresInSecs", 0L);
        String optString4 = jSONObject.optString("FisError", null);
        int i9 = m1.j.c(5)[optInt];
        if (i9 != 0) {
            if (i9 == 0) {
                str = " registrationStatus";
            } else {
                str = "";
            }
            if (str.isEmpty()) {
                return new z9.a(optString, i9, optString2, optString3, optLong2, optLong, optString4);
            }
            throw new IllegalStateException("Missing required properties:".concat(str));
        }
        throw new NullPointerException("Null registrationStatus");
    }

    public void l() {
        try {
            ((FileLock) this.f48762c).release();
            ((FileChannel) this.f48761b).close();
        } catch (IOException e10) {
            Log.e("CrossProcessLock", "encountered error while releasing, ignoring", e10);
        }
    }

    @Override
    public List m(long j10) {
        r4.b bVar;
        switch (this.f48760a) {
            case 0:
                int c10 = f0.c((ArrayList) this.f48762c, Long.valueOf(j10), false);
                if (c10 == -1) {
                    return Collections.EMPTY_LIST;
                }
                return (List) ((ArrayList) this.f48761b).get(c10);
            default:
                int e10 = f0.e((long[]) this.f48762c, j10, false);
                if (e10 != -1 && (bVar = ((r4.b[]) this.f48761b)[e10]) != r4.b.D) {
                    return Collections.singletonList(bVar);
                }
                return Collections.EMPTY_LIST;
        }
    }

    public int n(Context context, com.google.android.gms.common.api.c cVar) {
        SparseIntArray sparseIntArray = (SparseIntArray) this.f48761b;
        l.h(context);
        l.h(cVar);
        int i9 = 0;
        if (!cVar.k()) {
            return 0;
        }
        int l10 = cVar.l();
        int i10 = sparseIntArray.get(l10, -1);
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        while (true) {
            if (i11 < sparseIntArray.size()) {
                int keyAt = sparseIntArray.keyAt(i11);
                if (keyAt > l10 && sparseIntArray.get(keyAt) == 0) {
                    break;
                }
                i11++;
            } else {
                i9 = -1;
                break;
            }
        }
        if (i9 == -1) {
            i9 = ((u5.e) this.f48762c).d(context, l10);
        }
        sparseIntArray.put(l10, i9);
        return i9;
    }

    @Override
    public int r() {
        switch (this.f48760a) {
            case 0:
                return ((ArrayList) this.f48762c).size();
            default:
                return ((long[]) this.f48762c).length;
        }
    }

    public String toString() {
        switch (this.f48760a) {
            case 4:
                StringBuilder sb2 = new StringBuilder(100);
                sb2.append(this.f48762c.getClass().getSimpleName());
                sb2.append('{');
                ArrayList arrayList = (ArrayList) this.f48761b;
                int size = arrayList.size();
                for (int i9 = 0; i9 < size; i9++) {
                    sb2.append((String) arrayList.get(i9));
                    if (i9 < size - 1) {
                        sb2.append(", ");
                    }
                }
                sb2.append('}');
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public e(Object obj) {
        this.f48760a = 4;
        this.f48762c = obj;
        this.f48761b = new ArrayList();
    }

    public e(u5.e eVar) {
        this.f48760a = 6;
        this.f48761b = new SparseIntArray();
        l.h(eVar);
        this.f48762c = eVar;
    }

    public e(i iVar, Runnable runnable) {
        this.f48760a = 10;
        this.f48762c = iVar;
        this.f48761b = runnable;
    }

    public e(int i9) {
        this.f48760a = 11;
        y3.b bVar = new y3.b(i9, 0);
        y3.b bVar2 = new y3.b(i9, 1);
        this.f48761b = bVar;
        this.f48762c = bVar2;
    }

    public e(g0 g0Var) {
        this.f48760a = 8;
        this.f48761b = g0Var;
    }

    public e(h hVar) {
        this.f48760a = 14;
        this.f48762c = hVar;
    }

    public e(Context context, int i9) {
        this.f48760a = i9;
        switch (i9) {
            case 5:
                l.h(context);
                Resources resources = context.getResources();
                this.f48761b = resources;
                this.f48762c = resources.getResourcePackageName(2131701329);
                return;
            default:
                this.f48762c = null;
                this.f48761b = context;
                return;
        }
    }
}
