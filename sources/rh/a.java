package rh;

import android.text.TextUtils;
import java.io.File;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class a {
    public final int f45594a;
    public final TLRPC.Document f45595b;
    public final String f45596c;
    public final MessageObject d;
    public final String f45597e;
    public boolean f45598f;
    public boolean f45599g;

    public a(int i10, MessageObject messageObject, TLRPC.Document document, String str) {
        this.f45594a = i10;
        this.d = messageObject;
        this.f45595b = document;
        this.f45596c = str;
        this.f45597e = TextUtils.isEmpty(str) ? FileLoader.getAttachFileName(document) : str;
        a();
    }

    public final void a() {
        boolean z10;
        boolean z11 = false;
        String str = this.f45596c;
        if (str != null) {
            z10 = new File(str).exists();
        } else {
            z10 = false;
        }
        int i10 = this.f45594a;
        if (!z10) {
            z10 = FileLoader.getInstance(i10).getPathToAttach(this.f45595b).exists();
        }
        this.f45598f = z10;
        String str2 = this.f45597e;
        if (!TextUtils.isEmpty(str2) && FileLoader.getInstance(i10).isLoadingFile(str2)) {
            z11 = true;
        }
        this.f45599g = z11;
    }
}
