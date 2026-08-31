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
import qh.v9;
public final class g0 {
    public Long f47427a;
    public final String f47428b;
    public final String f47429c;
    public File d;
    public final String f47430e;
    public long f47431f;
    public long f47432g;
    public boolean h;
    public boolean f47433i;
    public long f47434j;
    public boolean f47435k;
    public boolean f47436l;
    public final Runnable f47437m = new v9(this, 8);
    public final h0 f47438n;

    public g0(h0 h0Var, String str, String str2) {
        this.f47438n = h0Var;
        this.f47428b = str;
        this.f47429c = str2;
        TLRPC.User user = MessagesController.getInstance(h0Var.f47447b).getUser(Long.valueOf(h0Var.f47448c));
        DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str));
        request.setTitle(UserObject.getUserName(user));
        request.setDescription(TextUtils.isEmpty(str2) ? "Downloading file..." : android.support.v4.media.a.o("Downloading ", str2, "..."));
        request.setNotificationVisibility(0);
        request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, str2);
        this.f47427a = Long.valueOf(h0Var.d.enqueue(request));
    }

    public final void a() {
        h0 h0Var = this.f47438n;
        h0Var.getClass();
        this.f47433i = true;
        Long l10 = this.f47427a;
        if (l10 != null) {
            h0Var.d.remove(l10.longValue());
            this.f47427a = null;
        }
        h0Var.f47449e.remove(this);
        h0Var.e();
    }

    public final Pair b() {
        if (this.h) {
            return new Pair(Long.valueOf(this.f47432g), Long.valueOf(this.f47432g));
        }
        if (this.f47427a != null && !this.f47433i) {
            if (System.currentTimeMillis() - this.f47434j < 150) {
                return new Pair(Long.valueOf(this.f47431f), Long.valueOf(this.f47432g));
            }
            d();
            return new Pair(Long.valueOf(this.f47431f), Long.valueOf(this.f47432g));
        }
        return new Pair(Long.valueOf(this.f47431f), Long.valueOf(this.f47432g));
    }

    public final boolean c() {
        if (!this.h && this.f47427a != null) {
            return true;
        }
        return false;
    }

    public final void d() {
        throw new UnsupportedOperationException("Method not decompiled: sh.g0.d():void");
    }

    public g0(h0 h0Var, JSONObject jSONObject) {
        this.f47438n = h0Var;
        this.f47428b = jSONObject.optString("url");
        this.f47429c = jSONObject.optString("file_name");
        this.f47432g = jSONObject.optLong("size");
        this.h = jSONObject.optBoolean("done");
        this.f47430e = jSONObject.optString("mime");
        String optString = jSONObject.optString("path");
        if (TextUtils.isEmpty(optString)) {
            return;
        }
        this.d = new File(optString);
    }
}
