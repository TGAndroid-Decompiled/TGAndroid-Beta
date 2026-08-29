package ph;

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
public final class g0 {
    public Long f45803a;
    public final String f45804b;
    public final String f45805c;
    public File d;
    public final String f45806e;
    public long f45807f;
    public long f45808g;
    public boolean h;
    public boolean f45809i;
    public long f45810j;
    public boolean f45811k;
    public boolean f45812l;
    public final Runnable f45813m = new org.telegram.ui.web.t1(this, 4);
    public final h0 f45814n;

    public g0(h0 h0Var, String str, String str2) {
        this.f45814n = h0Var;
        this.f45804b = str;
        this.f45805c = str2;
        TLRPC.User user = MessagesController.getInstance(h0Var.f45822b).getUser(Long.valueOf(h0Var.f45823c));
        DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str));
        request.setTitle(UserObject.getUserName(user));
        request.setDescription(TextUtils.isEmpty(str2) ? "Downloading file..." : a4.w.n("Downloading ", str2, "..."));
        request.setNotificationVisibility(0);
        request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, str2);
        this.f45803a = Long.valueOf(h0Var.d.enqueue(request));
    }

    public final void a() {
        h0 h0Var = this.f45814n;
        h0Var.getClass();
        this.f45809i = true;
        Long l10 = this.f45803a;
        if (l10 != null) {
            h0Var.d.remove(l10.longValue());
            this.f45803a = null;
        }
        h0Var.f45824e.remove(this);
        h0Var.e();
    }

    public final Pair b() {
        if (this.h) {
            return new Pair(Long.valueOf(this.f45808g), Long.valueOf(this.f45808g));
        }
        if (this.f45803a != null && !this.f45809i) {
            if (System.currentTimeMillis() - this.f45810j < 150) {
                return new Pair(Long.valueOf(this.f45807f), Long.valueOf(this.f45808g));
            }
            d();
            return new Pair(Long.valueOf(this.f45807f), Long.valueOf(this.f45808g));
        }
        return new Pair(Long.valueOf(this.f45807f), Long.valueOf(this.f45808g));
    }

    public final boolean c() {
        if (!this.h && this.f45803a != null) {
            return true;
        }
        return false;
    }

    public final void d() {
        throw new UnsupportedOperationException("Method not decompiled: ph.g0.d():void");
    }

    public g0(h0 h0Var, JSONObject jSONObject) {
        this.f45814n = h0Var;
        this.f45804b = jSONObject.optString("url");
        this.f45805c = jSONObject.optString("file_name");
        this.f45808g = jSONObject.optLong("size");
        this.h = jSONObject.optBoolean("done");
        this.f45806e = jSONObject.optString("mime");
        String optString = jSONObject.optString("path");
        if (TextUtils.isEmpty(optString)) {
            return;
        }
        this.d = new File(optString);
    }
}
