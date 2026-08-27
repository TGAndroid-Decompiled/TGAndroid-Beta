package t8;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import j$.util.DesugarCollections;
import java.util.HashSet;
import java.util.Set;
import z8.q;

public final class d implements y9.b {

    public final int f48110a;

    public final Object f48111b;

    public final Object f48112c;

    public d(int i10, Object obj, Object obj2) {
        this.f48110a = i10;
        this.f48112c = obj;
        this.f48111b = obj2;
    }

    @Override
    public final Object get() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        switch (this.f48110a) {
            case 0:
                h hVar = (h) this.f48112c;
                Context contextA = (Context) this.f48111b;
                String strD = hVar.d();
                da.a aVar = new da.a();
                int i10 = Build.VERSION.SDK_INT;
                if (i10 >= 24) {
                    contextA = i10 >= 24 ? f0.b.a(contextA) : null;
                }
                SharedPreferences sharedPreferences = contextA.getSharedPreferences("com.google.firebase.common.prefs:" + strD, 0);
                boolean z10 = true;
                if (sharedPreferences.contains("firebase_data_collection_default_enabled")) {
                    z10 = sharedPreferences.getBoolean("firebase_data_collection_default_enabled", true);
                } else {
                    try {
                        PackageManager packageManager = contextA.getPackageManager();
                        if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(contextA.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("firebase_data_collection_default_enabled")) {
                            z10 = applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
                        }
                        break;
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                }
                aVar.f4875a = z10;
                return aVar;
            case 1:
                return new w9.g((Context) this.f48111b, (String) this.f48112c);
            default:
                z8.f fVar = (z8.f) this.f48112c;
                z8.a aVar2 = (z8.a) this.f48111b;
                z8.d dVar = aVar2.f50222f;
                af.h hVar2 = new af.h();
                HashSet hashSet = new HashSet();
                HashSet hashSet2 = new HashSet();
                HashSet hashSet3 = new HashSet();
                HashSet hashSet4 = new HashSet();
                HashSet hashSet5 = new HashSet();
                Set<z8.i> set = aVar2.f50220c;
                Set set2 = aVar2.f50223g;
                for (z8.i iVar : set) {
                    int i11 = iVar.f50240c;
                    int i12 = iVar.f50239b;
                    boolean z11 = i11 == 0;
                    q qVar = iVar.f50238a;
                    if (z11) {
                        if (i12 == 2) {
                            hashSet4.add(qVar);
                        } else {
                            hashSet.add(qVar);
                        }
                    } else if (i11 == 2) {
                        hashSet3.add(qVar);
                    } else if (i12 == 2) {
                        hashSet5.add(qVar);
                    } else {
                        hashSet2.add(qVar);
                    }
                }
                if (!set2.isEmpty()) {
                    hashSet.add(q.a(v9.a.class));
                }
                hVar2.f274a = DesugarCollections.unmodifiableSet(hashSet);
                hVar2.f275b = DesugarCollections.unmodifiableSet(hashSet2);
                hVar2.f276c = DesugarCollections.unmodifiableSet(hashSet3);
                hVar2.d = DesugarCollections.unmodifiableSet(hashSet4);
                DesugarCollections.unmodifiableSet(hashSet5);
                hVar2.f277e = fVar;
                return dVar.u0(hVar2);
        }
    }

    public d(Context context, String str) {
        this.f48110a = 1;
        this.f48111b = context;
        this.f48112c = str;
    }
}
