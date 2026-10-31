package xh;

import android.app.DownloadManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Pair;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONObject;
import org.telegram.messenger.f8;
import org.telegram.messenger.zs;
public final class f0 {
    public static final HashMap f53752g = new HashMap();
    public static final HashMap h = new HashMap();
    public final Context f53753a;
    public final int f53754b;
    public final long f53755c;
    public final DownloadManager d;
    public final ArrayList e = new ArrayList();
    public e0 f53756f;

    public f0(Context context, int i10, long j10) {
        this.f53753a = context;
        this.f53754b = i10;
        this.f53755c = j10;
        this.d = (DownloadManager) context.getSystemService("download");
        SharedPreferences sharedPreferences = context.getSharedPreferences("botdownloads_" + i10, 0);
        Set<String> stringSet = sharedPreferences.getStringSet("" + j10, null);
        if (stringSet != null) {
            for (String str : stringSet) {
                try {
                    e0 e0Var = new e0(this, new JSONObject(str));
                    File file = e0Var.d;
                    if (file != null && file.exists()) {
                        this.e.add(e0Var);
                    }
                } catch (Exception e) {
                    f8.g(e, true);
                }
            }
        }
    }

    public static void a() {
        Context context = org.telegram.messenger.w0.f19025b;
        if (context == null) {
            return;
        }
        for (int i10 = 0; i10 < 4; i10++) {
            context.getSharedPreferences("botdownloads_" + i10, 0).edit().clear().apply();
        }
        f53752g.clear();
    }

    public static f0 c(Context context, int i10, long j10) {
        Pair pair = new Pair(Integer.valueOf(i10), Long.valueOf(j10));
        HashMap hashMap = f53752g;
        f0 f0Var = (f0) hashMap.get(pair);
        if (f0Var == null) {
            f0 f0Var2 = new f0(context, i10, j10);
            hashMap.put(pair, f0Var2);
            return f0Var2;
        }
        return f0Var;
    }

    public final void b(String str, String str2) {
        e0 d = d(str);
        if (d != null) {
            this.f53756f = d;
            d.f53738k = true;
            e();
            return;
        }
        e0 e0Var = new e0(this, str, str2);
        this.f53756f = e0Var;
        e0Var.f53739l = false;
        this.e.add(e0Var);
        f();
        e();
    }

    public final e0 d(String str) {
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            e0 e0Var = (e0) obj;
            if (TextUtils.equals(e0Var.f53732b, str) && e0Var.h) {
                return e0Var;
            }
        }
        return null;
    }

    public final void e() {
        zs.f(this.f53754b).k(zs.J3, new Object[0]);
    }

    public final void f() {
        String absolutePath;
        int i10 = 0;
        SharedPreferences.Editor edit = this.f53753a.getSharedPreferences("botdownloads_" + this.f53754b, 0).edit();
        edit.clear();
        HashSet hashSet = new HashSet();
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            e0 e0Var = (e0) obj;
            e0Var.getClass();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("url", e0Var.f53732b);
                jSONObject.put("file_name", e0Var.f53733c);
                jSONObject.put("size", e0Var.f53735g);
                File file = e0Var.d;
                if (file == null) {
                    absolutePath = null;
                } else {
                    absolutePath = file.getAbsolutePath();
                }
                jSONObject.put("path", absolutePath);
                jSONObject.put("done", e0Var.h);
                jSONObject.put("mime", e0Var.e);
            } catch (Exception e) {
                f8.g(e, true);
            }
            hashSet.add(jSONObject.toString());
        }
        edit.putStringSet("" + this.f53755c, hashSet);
        edit.apply();
    }
}
