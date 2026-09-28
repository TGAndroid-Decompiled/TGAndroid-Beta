package qh;

import android.text.TextUtils;
import java.io.File;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class a {
    public final int f42030a;
    public final TLRPC.Document f42031b;
    public final String f42032c;
    public final MessageObject d;
    public final String e;
    public boolean f42033f;
    public boolean f42034g;

    public a(int i10, MessageObject messageObject, TLRPC.Document document, String str) {
        this.f42030a = i10;
        this.d = messageObject;
        this.f42031b = document;
        this.f42032c = str;
        this.e = TextUtils.isEmpty(str) ? FileLoader.getAttachFileName(document) : str;
        a();
    }

    public final void a() {
        boolean z10;
        boolean z11 = false;
        String str = this.f42032c;
        if (str != null) {
            z10 = new File(str).exists();
        } else {
            z10 = false;
        }
        int i10 = this.f42030a;
        if (!z10) {
            z10 = FileLoader.getInstance(i10).getPathToAttach(this.f42031b).exists();
        }
        this.f42033f = z10;
        String str2 = this.e;
        if (!TextUtils.isEmpty(str2) && FileLoader.getInstance(i10).isLoadingFile(str2)) {
            z11 = true;
        }
        this.f42034g = z11;
    }
}
