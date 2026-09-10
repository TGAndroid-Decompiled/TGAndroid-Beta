package ph;

import android.text.TextUtils;
import java.io.File;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class a {
    public final int f40387a;
    public final TLRPC.Document f40388b;
    public final String f40389c;
    public final MessageObject d;
    public final String e;
    public boolean f40390f;
    public boolean f40391g;

    public a(int i10, MessageObject messageObject, TLRPC.Document document, String str) {
        this.f40387a = i10;
        this.d = messageObject;
        this.f40388b = document;
        this.f40389c = str;
        this.e = TextUtils.isEmpty(str) ? FileLoader.getAttachFileName(document) : str;
        a();
    }

    public final void a() {
        boolean z10;
        boolean z11 = false;
        String str = this.f40389c;
        if (str != null) {
            z10 = new File(str).exists();
        } else {
            z10 = false;
        }
        int i10 = this.f40387a;
        if (!z10) {
            z10 = FileLoader.getInstance(i10).getPathToAttach(this.f40388b).exists();
        }
        this.f40390f = z10;
        String str2 = this.e;
        if (!TextUtils.isEmpty(str2) && FileLoader.getInstance(i10).isLoadingFile(str2)) {
            z11 = true;
        }
        this.f40391g = z11;
    }
}
