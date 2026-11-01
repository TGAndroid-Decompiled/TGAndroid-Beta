package xh;

import android.app.DownloadManager;
import android.net.Uri;
import android.os.Environment;
import android.text.TextUtils;
import android.util.Pair;
import java.io.File;
import org.json.JSONObject;
import org.telegram.messenger.i20;
import org.telegram.messenger.wp;
import org.telegram.tgnet.TLRPC;
public final class e0 {
    public Long f53749a;
    public final String f53750b;
    public final String f53751c;
    public File d;
    public final String e;
    public long f53752f;
    public long f53753g;
    public boolean h;
    public boolean f53754i;
    public long f53755j;
    public boolean f53756k;
    public boolean f53757l;
    public final Runnable f53758m = new d0(this, 0);
    public final f0 f53759n;

    public e0(f0 f0Var, String str, String str2) {
        this.f53759n = f0Var;
        this.f53750b = str;
        this.f53751c = str2;
        TLRPC.User Z1 = wp.r1(f0Var.f53772b).Z1(Long.valueOf(f0Var.f53773c));
        DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str));
        request.setTitle(i20.p(Z1));
        request.setDescription(TextUtils.isEmpty(str2) ? "Downloading file..." : a1.g.n("Downloading ", str2, "..."));
        request.setNotificationVisibility(0);
        request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, str2);
        this.f53749a = Long.valueOf(f0Var.d.enqueue(request));
    }

    public final void a() {
        f0 f0Var = this.f53759n;
        f0Var.getClass();
        this.f53754i = true;
        Long l4 = this.f53749a;
        if (l4 != null) {
            f0Var.d.remove(l4.longValue());
            this.f53749a = null;
        }
        f0Var.e.remove(this);
        f0Var.e();
    }

    public final Pair b() {
        if (this.h) {
            return new Pair(Long.valueOf(this.f53753g), Long.valueOf(this.f53753g));
        }
        if (this.f53749a != null && !this.f53754i) {
            if (System.currentTimeMillis() - this.f53755j < 150) {
                return new Pair(Long.valueOf(this.f53752f), Long.valueOf(this.f53753g));
            }
            d();
            return new Pair(Long.valueOf(this.f53752f), Long.valueOf(this.f53753g));
        }
        return new Pair(Long.valueOf(this.f53752f), Long.valueOf(this.f53753g));
    }

    public final boolean c() {
        if (!this.h && this.f53749a != null) {
            return true;
        }
        return false;
    }

    public final void d() {
        throw new UnsupportedOperationException("Method not decompiled: xh.e0.d():void");
    }

    public e0(f0 f0Var, JSONObject jSONObject) {
        this.f53759n = f0Var;
        this.f53750b = jSONObject.optString("url");
        this.f53751c = jSONObject.optString("file_name");
        this.f53753g = jSONObject.optLong("size");
        this.h = jSONObject.optBoolean("done");
        this.e = jSONObject.optString("mime");
        String optString = jSONObject.optString("path");
        if (TextUtils.isEmpty(optString)) {
            return;
        }
        this.d = new File(optString);
    }
}
