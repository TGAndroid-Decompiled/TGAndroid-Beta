package sh;

import android.text.TextUtils;
import java.io.File;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class a {
    public final int f48645a;
    public final TLRPC.Document f48646b;
    public final String f48647c;
    public final MessageObject d;
    public final String e;
    public boolean f48648f;
    public boolean f48649g;

    public a(int i10, MessageObject messageObject, TLRPC.Document document, String str) {
        this.f48645a = i10;
        this.d = messageObject;
        this.f48646b = document;
        this.f48647c = str;
        this.e = TextUtils.isEmpty(str) ? FileLoader.getAttachFileName(document) : str;
        a();
    }

    public final void a() {
        boolean z10;
        boolean z11 = false;
        String str = this.f48647c;
        if (str != null) {
            z10 = new File(str).exists();
        } else {
            z10 = false;
        }
        int i10 = this.f48645a;
        if (!z10) {
            z10 = FileLoader.getInstance(i10).getPathToAttach(this.f48646b).exists();
        }
        this.f48648f = z10;
        String str2 = this.e;
        if (!TextUtils.isEmpty(str2) && FileLoader.getInstance(i10).isLoadingFile(str2)) {
            z11 = true;
        }
        this.f48649g = z11;
    }
}
