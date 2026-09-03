package rh;

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
import ph.ga;
public final class g0 {
    public Long f43589a;
    public final String f43590b;
    public final String f43591c;
    public File d;
    public final String e;
    public long f43592f;
    public long f43593g;
    public boolean h;
    public boolean f43594i;
    public long f43595j;
    public boolean f43596k;
    public boolean f43597l;
    public final Runnable f43598m = new ga(this, 7);
    public final h0 f43599n;

    public g0(h0 h0Var, String str, String str2) {
        this.f43599n = h0Var;
        this.f43590b = str;
        this.f43591c = str2;
        TLRPC.User user = MessagesController.getInstance(h0Var.f43608b).getUser(Long.valueOf(h0Var.f43609c));
        DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str));
        request.setTitle(UserObject.getUserName(user));
        request.setDescription(TextUtils.isEmpty(str2) ? "Downloading file..." : android.support.v4.media.a.o("Downloading ", str2, "..."));
        request.setNotificationVisibility(0);
        request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, str2);
        this.f43589a = Long.valueOf(h0Var.d.enqueue(request));
    }

    public final void a() {
        h0 h0Var = this.f43599n;
        h0Var.getClass();
        this.f43594i = true;
        Long l10 = this.f43589a;
        if (l10 != null) {
            h0Var.d.remove(l10.longValue());
            this.f43589a = null;
        }
        h0Var.e.remove(this);
        h0Var.e();
    }

    public final Pair b() {
        if (this.h) {
            return new Pair(Long.valueOf(this.f43593g), Long.valueOf(this.f43593g));
        }
        if (this.f43589a != null && !this.f43594i) {
            if (System.currentTimeMillis() - this.f43595j < 150) {
                return new Pair(Long.valueOf(this.f43592f), Long.valueOf(this.f43593g));
            }
            d();
            return new Pair(Long.valueOf(this.f43592f), Long.valueOf(this.f43593g));
        }
        return new Pair(Long.valueOf(this.f43592f), Long.valueOf(this.f43593g));
    }

    public final boolean c() {
        if (!this.h && this.f43589a != null) {
            return true;
        }
        return false;
    }

    public final void d() {
        throw new UnsupportedOperationException("Method not decompiled: rh.g0.d():void");
    }

    public g0(h0 h0Var, JSONObject jSONObject) {
        this.f43599n = h0Var;
        this.f43590b = jSONObject.optString("url");
        this.f43591c = jSONObject.optString("file_name");
        this.f43593g = jSONObject.optLong("size");
        this.h = jSONObject.optBoolean("done");
        this.e = jSONObject.optString("mime");
        String optString = jSONObject.optString("path");
        if (TextUtils.isEmpty(optString)) {
            return;
        }
        this.d = new File(optString);
    }
}
