package qh;

import android.text.TextUtils;
import java.io.File;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class a {
    public final int f45443a;
    public final TLRPC.Document f45444b;
    public final String f45445c;
    public final MessageObject d;
    public final String f45446e;
    public boolean f45447f;
    public boolean f45448g;

    public a(int i10, MessageObject messageObject, TLRPC.Document document, String str) {
        this.f45443a = i10;
        this.d = messageObject;
        this.f45444b = document;
        this.f45445c = str;
        this.f45446e = TextUtils.isEmpty(str) ? FileLoader.getAttachFileName(document) : str;
        a();
    }

    public final void a() {
        boolean z10;
        boolean z11 = false;
        String str = this.f45445c;
        if (str != null) {
            z10 = new File(str).exists();
        } else {
            z10 = false;
        }
        int i10 = this.f45443a;
        if (!z10) {
            z10 = FileLoader.getInstance(i10).getPathToAttach(this.f45444b).exists();
        }
        this.f45447f = z10;
        String str2 = this.f45446e;
        if (!TextUtils.isEmpty(str2) && FileLoader.getInstance(i10).isLoadingFile(str2)) {
            z11 = true;
        }
        this.f45448g = z11;
    }
}
