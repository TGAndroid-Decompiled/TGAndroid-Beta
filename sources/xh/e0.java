package xh;

import android.app.DownloadManager;
import android.net.Uri;
import android.os.Environment;
import android.text.TextUtils;
import android.util.Pair;
import java.io.File;
import org.json.JSONObject;
import org.telegram.messenger.h20;
import org.telegram.messenger.vp;
import org.telegram.tgnet.TLRPC;
public final class e0 {
    public Long f53731a;
    public final String f53732b;
    public final String f53733c;
    public File d;
    public final String e;
    public long f53734f;
    public long f53735g;
    public boolean h;
    public boolean f53736i;
    public long f53737j;
    public boolean f53738k;
    public boolean f53739l;
    public final Runnable f53740m = new d0(this, 0);
    public final f0 f53741n;

    public e0(f0 f0Var, String str, String str2) {
        this.f53741n = f0Var;
        this.f53732b = str;
        this.f53733c = str2;
        TLRPC.User Z1 = vp.r1(f0Var.f53754b).Z1(Long.valueOf(f0Var.f53755c));
        DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str));
        request.setTitle(h20.p(Z1));
        request.setDescription(TextUtils.isEmpty(str2) ? "Downloading file..." : a1.g.n("Downloading ", str2, "..."));
        request.setNotificationVisibility(0);
        request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, str2);
        this.f53731a = Long.valueOf(f0Var.d.enqueue(request));
    }

    public final void a() {
        f0 f0Var = this.f53741n;
        f0Var.getClass();
        this.f53736i = true;
        Long l4 = this.f53731a;
        if (l4 != null) {
            f0Var.d.remove(l4.longValue());
            this.f53731a = null;
        }
        f0Var.e.remove(this);
        f0Var.e();
    }

    public final Pair b() {
        if (this.h) {
            return new Pair(Long.valueOf(this.f53735g), Long.valueOf(this.f53735g));
        }
        if (this.f53731a != null && !this.f53736i) {
            if (System.currentTimeMillis() - this.f53737j < 150) {
                return new Pair(Long.valueOf(this.f53734f), Long.valueOf(this.f53735g));
            }
            d();
            return new Pair(Long.valueOf(this.f53734f), Long.valueOf(this.f53735g));
        }
        return new Pair(Long.valueOf(this.f53734f), Long.valueOf(this.f53735g));
    }

    public final boolean c() {
        if (!this.h && this.f53731a != null) {
            return true;
        }
        return false;
    }

    public final void d() {
        throw new UnsupportedOperationException("Method not decompiled: xh.e0.d():void");
    }

    public e0(f0 f0Var, JSONObject jSONObject) {
        this.f53741n = f0Var;
        this.f53732b = jSONObject.optString("url");
        this.f53733c = jSONObject.optString("file_name");
        this.f53735g = jSONObject.optLong("size");
        this.h = jSONObject.optBoolean("done");
        this.e = jSONObject.optString("mime");
        String optString = jSONObject.optString("path");
        if (TextUtils.isEmpty(optString)) {
            return;
        }
        this.d = new File(optString);
    }
}
