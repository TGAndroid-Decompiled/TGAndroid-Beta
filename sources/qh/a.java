package qh;

import android.text.TextUtils;
import java.io.File;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class a {
    public final int f46654a;
    public final TLRPC.Document f46655b;
    public final String f46656c;
    public final MessageObject d;
    public final String f46657e;
    public boolean f46658f;
    public boolean f46659g;

    public a(int i10, MessageObject messageObject, TLRPC.Document document, String str) {
        this.f46654a = i10;
        this.d = messageObject;
        this.f46655b = document;
        this.f46656c = str;
        this.f46657e = TextUtils.isEmpty(str) ? FileLoader.getAttachFileName(document) : str;
        a();
    }

    public final void a() {
        boolean z10;
        boolean z11 = false;
        String str = this.f46656c;
        if (str != null) {
            z10 = new File(str).exists();
        } else {
            z10 = false;
        }
        int i10 = this.f46654a;
        if (!z10) {
            z10 = FileLoader.getInstance(i10).getPathToAttach(this.f46655b).exists();
        }
        this.f46658f = z10;
        String str2 = this.f46657e;
        if (!TextUtils.isEmpty(str2) && FileLoader.getInstance(i10).isLoadingFile(str2)) {
            z11 = true;
        }
        this.f46659g = z11;
    }
}
