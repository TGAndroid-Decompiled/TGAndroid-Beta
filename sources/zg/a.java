package zg;

import android.text.TextUtils;
import java.io.File;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

public final class a {

    public final int f50795a;

    public final TLRPC.Document f50796b;

    public final String f50797c;
    public final MessageObject d;

    public final String f50798e;

    public boolean f50799f;

    public boolean f50800g;

    public a(int i10, MessageObject messageObject, TLRPC.Document document, String str) {
        this.f50795a = i10;
        this.d = messageObject;
        this.f50796b = document;
        this.f50797c = str;
        this.f50798e = TextUtils.isEmpty(str) ? FileLoader.getAttachFileName(document) : str;
        a();
    }

    public final void a() {
        boolean z10 = false;
        String str = this.f50797c;
        boolean zExists = str != null ? new File(str).exists() : false;
        int i10 = this.f50795a;
        if (!zExists) {
            zExists = FileLoader.getInstance(i10).getPathToAttach(this.f50796b).exists();
        }
        this.f50799f = zExists;
        String str2 = this.f50798e;
        if (!TextUtils.isEmpty(str2) && FileLoader.getInstance(i10).isLoadingFile(str2)) {
            z10 = true;
        }
        this.f50800g = z10;
    }
}
