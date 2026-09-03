package rh;

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
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.NotificationCenter;
public final class h0 {
    public static final HashMap f43606g = new HashMap();
    public static final HashMap h = new HashMap();
    public final Context f43607a;
    public final int f43608b;
    public final long f43609c;
    public final DownloadManager d;
    public final ArrayList e = new ArrayList();
    public g0 f43610f;

    public h0(Context context, int i10, long j10) {
        this.f43607a = context;
        this.f43608b = i10;
        this.f43609c = j10;
        this.d = (DownloadManager) context.getSystemService("download");
        SharedPreferences sharedPreferences = context.getSharedPreferences("botdownloads_" + i10, 0);
        Set<String> stringSet = sharedPreferences.getStringSet("" + j10, null);
        if (stringSet != null) {
            for (String str : stringSet) {
                try {
                    g0 g0Var = new g0(this, new JSONObject(str));
                    File file = g0Var.d;
                    if (file != null && file.exists()) {
                        this.e.add(g0Var);
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
        }
    }

    public static void a() {
        Context context = ApplicationLoader.applicationContext;
        if (context == null) {
            return;
        }
        for (int i10 = 0; i10 < 4; i10++) {
            context.getSharedPreferences("botdownloads_" + i10, 0).edit().clear().apply();
        }
        f43606g.clear();
    }

    public static h0 c(Context context, int i10, long j10) {
        Pair pair = new Pair(Integer.valueOf(i10), Long.valueOf(j10));
        HashMap hashMap = f43606g;
        h0 h0Var = (h0) hashMap.get(pair);
        if (h0Var == null) {
            h0 h0Var2 = new h0(context, i10, j10);
            hashMap.put(pair, h0Var2);
            return h0Var2;
        }
        return h0Var;
    }

    public final void b(String str, String str2) {
        g0 d = d(str);
        if (d != null) {
            this.f43610f = d;
            d.f43596k = true;
            e();
            return;
        }
        g0 g0Var = new g0(this, str, str2);
        this.f43610f = g0Var;
        g0Var.f43597l = false;
        this.e.add(g0Var);
        f();
        e();
    }

    public final g0 d(String str) {
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            g0 g0Var = (g0) obj;
            if (TextUtils.equals(g0Var.f43590b, str) && g0Var.h) {
                return g0Var;
            }
        }
        return null;
    }

    public final void e() {
        NotificationCenter.getInstance(this.f43608b).lambda$postNotificationNameOnUIThread$1(NotificationCenter.botDownloadsUpdate, new Object[0]);
    }

    public final void f() {
        String absolutePath;
        int i10 = 0;
        SharedPreferences.Editor edit = this.f43607a.getSharedPreferences("botdownloads_" + this.f43608b, 0).edit();
        edit.clear();
        HashSet hashSet = new HashSet();
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            g0 g0Var = (g0) obj;
            g0Var.getClass();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("url", g0Var.f43590b);
                jSONObject.put("file_name", g0Var.f43591c);
                jSONObject.put("size", g0Var.f43593g);
                File file = g0Var.d;
                if (file == null) {
                    absolutePath = null;
                } else {
                    absolutePath = file.getAbsolutePath();
                }
                jSONObject.put("path", absolutePath);
                jSONObject.put("done", g0Var.h);
                jSONObject.put("mime", g0Var.e);
            } catch (Exception e) {
                FileLog.e(e);
            }
            hashSet.add(jSONObject.toString());
        }
        edit.putStringSet("" + this.f43609c, hashSet);
        edit.apply();
    }
}
