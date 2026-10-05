package qh;

import android.text.TextUtils;
import java.io.File;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class a {
    public final int f45450a;
    public final TLRPC.Document f45451b;
    public final String f45452c;
    public final MessageObject d;
    public final String f45453e;
    public boolean f45454f;
    public boolean f45455g;

    public a(int i10, MessageObject messageObject, TLRPC.Document document, String str) {
        this.f45450a = i10;
        this.d = messageObject;
        this.f45451b = document;
        this.f45452c = str;
        this.f45453e = TextUtils.isEmpty(str) ? FileLoader.getAttachFileName(document) : str;
        a();
    }

    public final void a() {
        boolean z10;
        boolean z11 = false;
        String str = this.f45452c;
        if (str != null) {
            z10 = new File(str).exists();
        } else {
            z10 = false;
        }
        int i10 = this.f45450a;
        if (!z10) {
            z10 = FileLoader.getInstance(i10).getPathToAttach(this.f45451b).exists();
        }
        this.f45454f = z10;
        String str2 = this.f45453e;
        if (!TextUtils.isEmpty(str2) && FileLoader.getInstance(i10).isLoadingFile(str2)) {
            z11 = true;
        }
        this.f45455g = z11;
    }
}
