package qh;

import android.text.TextUtils;
import java.io.File;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class a {
    public final int f42028a;
    public final TLRPC.Document f42029b;
    public final String f42030c;
    public final MessageObject d;
    public final String e;
    public boolean f42031f;
    public boolean f42032g;

    public a(int i10, MessageObject messageObject, TLRPC.Document document, String str) {
        this.f42028a = i10;
        this.d = messageObject;
        this.f42029b = document;
        this.f42030c = str;
        this.e = TextUtils.isEmpty(str) ? FileLoader.getAttachFileName(document) : str;
        a();
    }

    public final void a() {
        boolean z10;
        boolean z11 = false;
        String str = this.f42030c;
        if (str != null) {
            z10 = new File(str).exists();
        } else {
            z10 = false;
        }
        int i10 = this.f42028a;
        if (!z10) {
            z10 = FileLoader.getInstance(i10).getPathToAttach(this.f42029b).exists();
        }
        this.f42031f = z10;
        String str2 = this.e;
        if (!TextUtils.isEmpty(str2) && FileLoader.getInstance(i10).isLoadingFile(str2)) {
            z11 = true;
        }
        this.f42032g = z11;
    }
}
