package ug;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class m implements Runnable {
    public final int f47747a;
    public final TLRPC.Chat f47748b;
    public final int f47749c;
    public final ArrayList d;
    public final Utilities.Callback e;

    public m(TLRPC.Chat chat, int i10, ArrayList arrayList, Utilities.Callback callback, int i11) {
        this.f47747a = i11;
        this.f47748b = chat;
        this.f47749c = i10;
        this.d = arrayList;
        this.e = callback;
    }

    @Override
    public final void run() {
        switch (this.f47747a) {
            case 0:
                TLRPC.Chat chat = this.f47748b;
                ArrayList arrayList = this.d;
                if (chat == null) {
                    q.m(this.f47749c, arrayList);
                }
                this.e.run(arrayList);
                return;
            default:
                TLRPC.Chat chat2 = this.f47748b;
                ArrayList arrayList2 = this.d;
                if (chat2 == null) {
                    q.m(this.f47749c, arrayList2);
                }
                this.e.run(arrayList2);
                return;
        }
    }
}
