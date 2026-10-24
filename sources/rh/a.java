package rh;

import android.text.TextUtils;
import java.io.File;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class a {
    public final int f46158a;
    public final TLRPC.Document f46159b;
    public final String f46160c;
    public final MessageObject d;
    public final String e;
    public boolean f46161f;
    public boolean f46162g;

    public a(int i10, MessageObject messageObject, TLRPC.Document document, String str) {
        this.f46158a = i10;
        this.d = messageObject;
        this.f46159b = document;
        this.f46160c = str;
        this.e = TextUtils.isEmpty(str) ? FileLoader.getAttachFileName(document) : str;
        a();
    }

    public final void a() {
        boolean z10;
        boolean z11 = false;
        String str = this.f46160c;
        if (str != null) {
            z10 = new File(str).exists();
        } else {
            z10 = false;
        }
        int i10 = this.f46158a;
        if (!z10) {
            z10 = FileLoader.getInstance(i10).getPathToAttach(this.f46159b).exists();
        }
        this.f46161f = z10;
        String str2 = this.e;
        if (!TextUtils.isEmpty(str2) && FileLoader.getInstance(i10).isLoadingFile(str2)) {
            z11 = true;
        }
        this.f46162g = z11;
    }
}
