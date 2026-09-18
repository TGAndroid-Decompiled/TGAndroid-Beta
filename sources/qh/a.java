package qh;

import android.text.TextUtils;
import java.io.File;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class a {
    public final int f41771a;
    public final TLRPC.Document f41772b;
    public final String f41773c;
    public final MessageObject d;
    public final String e;
    public boolean f41774f;
    public boolean f41775g;

    public a(int i10, MessageObject messageObject, TLRPC.Document document, String str) {
        this.f41771a = i10;
        this.d = messageObject;
        this.f41772b = document;
        this.f41773c = str;
        this.e = TextUtils.isEmpty(str) ? FileLoader.getAttachFileName(document) : str;
        a();
    }

    public final void a() {
        boolean z10;
        boolean z11 = false;
        String str = this.f41773c;
        if (str != null) {
            z10 = new File(str).exists();
        } else {
            z10 = false;
        }
        int i10 = this.f41771a;
        if (!z10) {
            z10 = FileLoader.getInstance(i10).getPathToAttach(this.f41772b).exists();
        }
        this.f41774f = z10;
        String str2 = this.e;
        if (!TextUtils.isEmpty(str2) && FileLoader.getInstance(i10).isLoadingFile(str2)) {
            z11 = true;
        }
        this.f41775g = z11;
    }
}
