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
public final class h0 {
    public Long f43537a;
    public final String f43538b;
    public final String f43539c;
    public File d;
    public final String e;
    public long f43540f;
    public long f43541g;
    public boolean h;
    public boolean f43542i;
    public long f43543j;
    public boolean f43544k;
    public boolean f43545l;
    public final Runnable f43546m = new ga(this, 6);
    public final i0 f43547n;

    public h0(i0 i0Var, String str, String str2) {
        this.f43547n = i0Var;
        this.f43538b = str;
        this.f43539c = str2;
        TLRPC.User user = MessagesController.getInstance(i0Var.f43556b).getUser(Long.valueOf(i0Var.f43557c));
        DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str));
        request.setTitle(UserObject.getUserName(user));
        request.setDescription(TextUtils.isEmpty(str2) ? "Downloading file..." : android.support.v4.media.a.o("Downloading ", str2, "..."));
        request.setNotificationVisibility(0);
        request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, str2);
        this.f43537a = Long.valueOf(i0Var.d.enqueue(request));
    }

    public final void a() {
        i0 i0Var = this.f43547n;
        i0Var.getClass();
        this.f43542i = true;
        Long l10 = this.f43537a;
        if (l10 != null) {
            i0Var.d.remove(l10.longValue());
            this.f43537a = null;
        }
        i0Var.e.remove(this);
        i0Var.e();
    }

    public final Pair b() {
        if (this.h) {
            return new Pair(Long.valueOf(this.f43541g), Long.valueOf(this.f43541g));
        }
        if (this.f43537a != null && !this.f43542i) {
            if (System.currentTimeMillis() - this.f43543j < 150) {
                return new Pair(Long.valueOf(this.f43540f), Long.valueOf(this.f43541g));
            }
            d();
            return new Pair(Long.valueOf(this.f43540f), Long.valueOf(this.f43541g));
        }
        return new Pair(Long.valueOf(this.f43540f), Long.valueOf(this.f43541g));
    }

    public final boolean c() {
        if (!this.h && this.f43537a != null) {
            return true;
        }
        return false;
    }

    public final void d() {
        throw new UnsupportedOperationException("Method not decompiled: rh.h0.d():void");
    }

    public h0(i0 i0Var, JSONObject jSONObject) {
        this.f43547n = i0Var;
        this.f43538b = jSONObject.optString("url");
        this.f43539c = jSONObject.optString("file_name");
        this.f43541g = jSONObject.optLong("size");
        this.h = jSONObject.optBoolean("done");
        this.e = jSONObject.optString("mime");
        String optString = jSONObject.optString("path");
        if (TextUtils.isEmpty(optString)) {
            return;
        }
        this.d = new File(optString);
    }
}
