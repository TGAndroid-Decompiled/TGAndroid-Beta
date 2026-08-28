package s8;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import j$.util.DesugarCollections;
import java.util.HashSet;
import java.util.Set;
import y8.r;
public final class d implements x9.b {
    public final int f47461a;
    public final Object f47462b;
    public final Object f47463c;

    public d(int i9, Object obj, Object obj2) {
        this.f47461a = i9;
        this.f47463c = obj;
        this.f47462b = obj2;
    }

    @Override
    public final Object get() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        boolean z10;
        switch (this.f47461a) {
            case 0:
                h hVar = (h) this.f47463c;
                Context context = (Context) this.f47462b;
                String d = hVar.d();
                u9.a aVar = (u9.a) hVar.d.a(u9.a.class);
                ?? obj = new Object();
                int i9 = Build.VERSION.SDK_INT;
                if (i9 >= 24) {
                    if (i9 >= 24) {
                        context = f0.b.a(context);
                    } else {
                        context = null;
                    }
                }
                SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.common.prefs:" + d, 0);
                boolean z11 = true;
                if (sharedPreferences.contains("firebase_data_collection_default_enabled")) {
                    z11 = sharedPreferences.getBoolean("firebase_data_collection_default_enabled", true);
                } else {
                    try {
                        PackageManager packageManager = context.getPackageManager();
                        if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("firebase_data_collection_default_enabled")) {
                            z11 = applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
                        }
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                }
                obj.f2331a = z11;
                return obj;
            case 1:
                return new v9.g((Context) this.f47462b, (String) this.f47463c);
            default:
                y8.g gVar = (y8.g) this.f47463c;
                y8.a aVar2 = (y8.a) this.f47462b;
                y8.d dVar = aVar2.f49625f;
                ?? obj2 = new Object();
                HashSet hashSet = new HashSet();
                HashSet hashSet2 = new HashSet();
                HashSet hashSet3 = new HashSet();
                HashSet hashSet4 = new HashSet();
                HashSet hashSet5 = new HashSet();
                Set<y8.j> set = aVar2.f49623c;
                Set set2 = aVar2.f49626g;
                for (y8.j jVar : set) {
                    int i10 = jVar.f49644c;
                    int i11 = jVar.f49643b;
                    if (i10 == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    r rVar = jVar.f49642a;
                    if (z10) {
                        if (i11 == 2) {
                            hashSet4.add(rVar);
                        } else {
                            hashSet.add(rVar);
                        }
                    } else if (i10 == 2) {
                        hashSet3.add(rVar);
                    } else if (i11 == 2) {
                        hashSet5.add(rVar);
                    } else {
                        hashSet2.add(rVar);
                    }
                }
                if (!set2.isEmpty()) {
                    hashSet.add(r.a(u9.a.class));
                }
                obj2.f1413a = DesugarCollections.unmodifiableSet(hashSet);
                obj2.f1414b = DesugarCollections.unmodifiableSet(hashSet2);
                obj2.f1415c = DesugarCollections.unmodifiableSet(hashSet3);
                obj2.d = DesugarCollections.unmodifiableSet(hashSet4);
                DesugarCollections.unmodifiableSet(hashSet5);
                obj2.f1416e = gVar;
                return dVar.H1(obj2);
        }
    }

    public d(Context context, String str) {
        this.f47461a = 1;
        this.f47462b = context;
        this.f47463c = str;
    }
}
