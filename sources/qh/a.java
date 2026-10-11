package qh;

import android.text.TextUtils;
import java.io.File;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class a {
    public final int f46729a;
    public final TLRPC.Document f46730b;
    public final String f46731c;
    public final MessageObject d;
    public final String f46732e;
    public boolean f46733f;
    public boolean f46734g;

    public a(int i10, MessageObject messageObject, TLRPC.Document document, String str) {
        this.f46729a = i10;
        this.d = messageObject;
        this.f46730b = document;
        this.f46731c = str;
        this.f46732e = TextUtils.isEmpty(str) ? FileLoader.getAttachFileName(document) : str;
        a();
    }

    public final void a() {
        boolean z10;
        boolean z11 = false;
        String str = this.f46731c;
        if (str != null) {
            z10 = new File(str).exists();
        } else {
            z10 = false;
        }
        int i10 = this.f46729a;
        if (!z10) {
            z10 = FileLoader.getInstance(i10).getPathToAttach(this.f46730b).exists();
        }
        this.f46733f = z10;
        String str2 = this.f46732e;
        if (!TextUtils.isEmpty(str2) && FileLoader.getInstance(i10).isLoadingFile(str2)) {
            z11 = true;
        }
        this.f46734g = z11;
    }
}
