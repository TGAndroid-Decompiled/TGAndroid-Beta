package qh;

import android.text.TextUtils;
import java.io.File;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class a {
    public final int f46652a;
    public final TLRPC.Document f46653b;
    public final String f46654c;
    public final MessageObject d;
    public final String f46655e;
    public boolean f46656f;
    public boolean f46657g;

    public a(int i10, MessageObject messageObject, TLRPC.Document document, String str) {
        this.f46652a = i10;
        this.d = messageObject;
        this.f46653b = document;
        this.f46654c = str;
        this.f46655e = TextUtils.isEmpty(str) ? FileLoader.getAttachFileName(document) : str;
        a();
    }

    public final void a() {
        boolean z10;
        boolean z11 = false;
        String str = this.f46654c;
        if (str != null) {
            z10 = new File(str).exists();
        } else {
            z10 = false;
        }
        int i10 = this.f46652a;
        if (!z10) {
            z10 = FileLoader.getInstance(i10).getPathToAttach(this.f46653b).exists();
        }
        this.f46656f = z10;
        String str2 = this.f46655e;
        if (!TextUtils.isEmpty(str2) && FileLoader.getInstance(i10).isLoadingFile(str2)) {
            z11 = true;
        }
        this.f46657g = z11;
    }
}
