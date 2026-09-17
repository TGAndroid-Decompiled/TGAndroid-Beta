package rh;

import android.text.TextUtils;
import java.io.File;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class a {
    public final int f45595a;
    public final TLRPC.Document f45596b;
    public final String f45597c;
    public final MessageObject d;
    public final String f45598e;
    public boolean f45599f;
    public boolean f45600g;

    public a(int i10, MessageObject messageObject, TLRPC.Document document, String str) {
        this.f45595a = i10;
        this.d = messageObject;
        this.f45596b = document;
        this.f45597c = str;
        this.f45598e = TextUtils.isEmpty(str) ? FileLoader.getAttachFileName(document) : str;
        a();
    }

    public final void a() {
        boolean z10;
        boolean z11 = false;
        String str = this.f45597c;
        if (str != null) {
            z10 = new File(str).exists();
        } else {
            z10 = false;
        }
        int i10 = this.f45595a;
        if (!z10) {
            z10 = FileLoader.getInstance(i10).getPathToAttach(this.f45596b).exists();
        }
        this.f45599f = z10;
        String str2 = this.f45598e;
        if (!TextUtils.isEmpty(str2) && FileLoader.getInstance(i10).isLoadingFile(str2)) {
            z11 = true;
        }
        this.f45600g = z11;
    }
}
