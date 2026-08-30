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
public final class i0 {
    public static final HashMap f43554g = new HashMap();
    public static final HashMap h = new HashMap();
    public final Context f43555a;
    public final int f43556b;
    public final long f43557c;
    public final DownloadManager d;
    public final ArrayList e = new ArrayList();
    public h0 f43558f;

    public i0(Context context, int i10, long j10) {
        this.f43555a = context;
        this.f43556b = i10;
        this.f43557c = j10;
        this.d = (DownloadManager) context.getSystemService("download");
        SharedPreferences sharedPreferences = context.getSharedPreferences("botdownloads_" + i10, 0);
        Set<String> stringSet = sharedPreferences.getStringSet("" + j10, null);
        if (stringSet != null) {
            for (String str : stringSet) {
                try {
                    h0 h0Var = new h0(this, new JSONObject(str));
                    File file = h0Var.d;
                    if (file != null && file.exists()) {
                        this.e.add(h0Var);
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
        f43554g.clear();
    }

    public static i0 c(Context context, int i10, long j10) {
        Pair pair = new Pair(Integer.valueOf(i10), Long.valueOf(j10));
        HashMap hashMap = f43554g;
        i0 i0Var = (i0) hashMap.get(pair);
        if (i0Var == null) {
            i0 i0Var2 = new i0(context, i10, j10);
            hashMap.put(pair, i0Var2);
            return i0Var2;
        }
        return i0Var;
    }

    public final void b(String str, String str2) {
        h0 d = d(str);
        if (d != null) {
            this.f43558f = d;
            d.f43544k = true;
            e();
            return;
        }
        h0 h0Var = new h0(this, str, str2);
        this.f43558f = h0Var;
        h0Var.f43545l = false;
        this.e.add(h0Var);
        f();
        e();
    }

    public final h0 d(String str) {
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            h0 h0Var = (h0) obj;
            if (TextUtils.equals(h0Var.f43538b, str) && h0Var.h) {
                return h0Var;
            }
        }
        return null;
    }

    public final void e() {
        NotificationCenter.getInstance(this.f43556b).lambda$postNotificationNameOnUIThread$1(NotificationCenter.botDownloadsUpdate, new Object[0]);
    }

    public final void f() {
        String absolutePath;
        int i10 = 0;
        SharedPreferences.Editor edit = this.f43555a.getSharedPreferences("botdownloads_" + this.f43556b, 0).edit();
        edit.clear();
        HashSet hashSet = new HashSet();
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            h0 h0Var = (h0) obj;
            h0Var.getClass();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("url", h0Var.f43538b);
                jSONObject.put("file_name", h0Var.f43539c);
                jSONObject.put("size", h0Var.f43541g);
                File file = h0Var.d;
                if (file == null) {
                    absolutePath = null;
                } else {
                    absolutePath = file.getAbsolutePath();
                }
                jSONObject.put("path", absolutePath);
                jSONObject.put("done", h0Var.h);
                jSONObject.put("mime", h0Var.e);
            } catch (Exception e) {
                FileLog.e(e);
            }
            hashSet.add(jSONObject.toString());
        }
        edit.putStringSet("" + this.f43557c, hashSet);
        edit.apply();
    }
}
