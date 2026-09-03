package sh;

import android.app.DownloadManager;
import android.net.Uri;
import android.os.Environment;
import android.text.TextUtils;
import android.util.Pair;
import java.io.File;
import org.json.JSONObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import qh.u9;
public final class g0 {
    public Long f47463a;
    public final String f47464b;
    public final String f47465c;
    public File d;
    public final String f47466e;
    public long f47467f;
    public long f47468g;
    public boolean h;
    public boolean f47469i;
    public long f47470j;
    public boolean f47471k;
    public boolean f47472l;
    public final Runnable f47473m = new u9(this, 8);
    public final h0 f47474n;

    public g0(h0 h0Var, String str, String str2) {
        this.f47474n = h0Var;
        this.f47464b = str;
        this.f47465c = str2;
        TLRPC.User user = MessagesController.getInstance(h0Var.f47483b).getUser(Long.valueOf(h0Var.f47484c));
        DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str));
        request.setTitle(UserObject.getUserName(user));
        request.setDescription(TextUtils.isEmpty(str2) ? "Downloading file..." : android.support.v4.media.a.o("Downloading ", str2, "..."));
        request.setNotificationVisibility(0);
        request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, str2);
        this.f47463a = Long.valueOf(h0Var.d.enqueue(request));
    }

    public final void a() {
        h0 h0Var = this.f47474n;
        h0Var.getClass();
        this.f47469i = true;
        Long l10 = this.f47463a;
        if (l10 != null) {
            h0Var.d.remove(l10.longValue());
            this.f47463a = null;
        }
        h0Var.f47485e.remove(this);
        h0Var.e();
    }

    public final Pair b() {
        if (this.h) {
            return new Pair(Long.valueOf(this.f47468g), Long.valueOf(this.f47468g));
        }
        if (this.f47463a != null && !this.f47469i) {
            if (System.currentTimeMillis() - this.f47470j < 150) {
                return new Pair(Long.valueOf(this.f47467f), Long.valueOf(this.f47468g));
            }
            d();
            return new Pair(Long.valueOf(this.f47467f), Long.valueOf(this.f47468g));
        }
        return new Pair(Long.valueOf(this.f47467f), Long.valueOf(this.f47468g));
    }

    public final boolean c() {
        if (!this.h && this.f47463a != null) {
            return true;
        }
        return false;
    }

    public final void d() {
        throw new UnsupportedOperationException("Method not decompiled: sh.g0.d():void");
    }

    public g0(h0 h0Var, JSONObject jSONObject) {
        this.f47474n = h0Var;
        this.f47464b = jSONObject.optString("url");
        this.f47465c = jSONObject.optString("file_name");
        this.f47468g = jSONObject.optLong("size");
        this.h = jSONObject.optBoolean("done");
        this.f47466e = jSONObject.optString("mime");
        String optString = jSONObject.optString("path");
        if (TextUtils.isEmpty(optString)) {
            return;
        }
        this.d = new File(optString);
    }
}
