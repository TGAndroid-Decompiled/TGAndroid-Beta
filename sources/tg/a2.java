package tg;

import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.a8;
import org.telegram.messenger.c20;
import org.telegram.messenger.ij;
import org.telegram.messenger.j20;
import org.telegram.messenger.v10;
import org.telegram.tgnet.TLRPC;
public final class a2 {
    public String f55465a;
    public String f55466b;
    public String f55467c;
    public CharSequence d;
    public TLRPC.TL_inputStickerSetItem f55468e;
    public TLRPC.TL_messageMediaDocument f55469f;
    public TLRPC.InputFile f55470g;
    public boolean h;
    public long f55471i;
    public TLRPC.StickerSet f55472j;
    public TLRPC.Document f55473k;
    public String f55474l;
    public v10 f55475m;
    public c20 f55476n;
    public boolean f55477o;
    public ArrayList f55478p;
    public ArrayList f55479q;
    public ij f55480r;
    public j20 f55481s;
    public float f55482t;
    public float f55483u;

    public final void a() {
        ArrayList arrayList = this.f55479q;
        ArrayList arrayList2 = this.f55478p;
        int size = arrayList2.size();
        int i7 = 0;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            try {
                ((File) obj).delete();
            } catch (Exception e10) {
                a8.g(e10, true);
            }
        }
        arrayList2.clear();
        int size2 = arrayList.size();
        while (i7 < size2) {
            Object obj2 = arrayList.get(i7);
            i7++;
            try {
                ((File) obj2).delete();
            } catch (Exception e11) {
                a8.g(e11, true);
            }
        }
        arrayList.clear();
    }

    public final float b() {
        float f10;
        if (this.f55475m == null) {
            f10 = 0.9f;
        } else {
            f10 = 1.0f;
        }
        if (this.f55481s == null) {
            return f10 * this.f55483u;
        }
        return com.google.android.recaptcha.internal.a.B(this.f55483u, 0.5f, this.f55482t * 0.5f, f10);
    }
}
