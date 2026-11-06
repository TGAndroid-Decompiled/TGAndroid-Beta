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
    public String f55441a;
    public String f55442b;
    public String f55443c;
    public CharSequence d;
    public TLRPC.TL_inputStickerSetItem f55444e;
    public TLRPC.TL_messageMediaDocument f55445f;
    public TLRPC.InputFile f55446g;
    public boolean h;
    public long f55447i;
    public TLRPC.StickerSet f55448j;
    public TLRPC.Document f55449k;
    public String f55450l;
    public v10 f55451m;
    public c20 f55452n;
    public boolean f55453o;
    public ArrayList f55454p;
    public ArrayList f55455q;
    public ij f55456r;
    public j20 f55457s;
    public float f55458t;
    public float f55459u;

    public final void a() {
        ArrayList arrayList = this.f55455q;
        ArrayList arrayList2 = this.f55454p;
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
        if (this.f55451m == null) {
            f10 = 0.9f;
        } else {
            f10 = 1.0f;
        }
        if (this.f55457s == null) {
            return f10 * this.f55459u;
        }
        return com.google.android.recaptcha.internal.a.B(this.f55459u, 0.5f, this.f55458t * 0.5f, f10);
    }
}
