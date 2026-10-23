package ug;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class m implements Runnable {
    public final int f48172a;
    public final TLRPC.Chat f48173b;
    public final int f48174c;
    public final ArrayList d;
    public final Utilities.Callback e;

    public m(TLRPC.Chat chat, int i10, ArrayList arrayList, Utilities.Callback callback, int i11) {
        this.f48172a = i11;
        this.f48173b = chat;
        this.f48174c = i10;
        this.d = arrayList;
        this.e = callback;
    }

    @Override
    public final void run() {
        switch (this.f48172a) {
            case 0:
                TLRPC.Chat chat = this.f48173b;
                ArrayList arrayList = this.d;
                if (chat == null) {
                    q.m(this.f48174c, arrayList);
                }
                this.e.run(arrayList);
                return;
            default:
                TLRPC.Chat chat2 = this.f48173b;
                ArrayList arrayList2 = this.d;
                if (chat2 == null) {
                    q.m(this.f48174c, arrayList2);
                }
                this.e.run(arrayList2);
                return;
        }
    }
}
