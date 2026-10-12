package rh;

import android.text.TextUtils;
import java.io.File;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class a {
    public final int f44644a;
    public final TLRPC.Document f44645b;
    public final String f44646c;
    public final MessageObject d;
    public final String e;
    public boolean f44647f;
    public boolean f44648g;

    public a(int i10, MessageObject messageObject, TLRPC.Document document, String str) {
        this.f44644a = i10;
        this.d = messageObject;
        this.f44645b = document;
        this.f44646c = str;
        this.e = TextUtils.isEmpty(str) ? FileLoader.getAttachFileName(document) : str;
        a();
    }

    public final void a() {
        boolean z10;
        boolean z11 = false;
        String str = this.f44646c;
        if (str != null) {
            z10 = new File(str).exists();
        } else {
            z10 = false;
        }
        int i10 = this.f44644a;
        if (!z10) {
            z10 = FileLoader.getInstance(i10).getPathToAttach(this.f44645b).exists();
        }
        this.f44647f = z10;
        String str2 = this.e;
        if (!TextUtils.isEmpty(str2) && FileLoader.getInstance(i10).isLoadingFile(str2)) {
            z11 = true;
        }
        this.f44648g = z11;
    }
}
