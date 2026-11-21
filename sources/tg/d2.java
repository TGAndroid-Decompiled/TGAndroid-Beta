package tg;

import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.a8;
import org.telegram.messenger.e20;
import org.telegram.messenger.fj;
import org.telegram.messenger.q10;
import org.telegram.messenger.x10;
import org.telegram.tgnet.TLRPC;
public final class d2 {
    public String f57812a;
    public String f57813b;
    public String f57814c;
    public CharSequence d;
    public TLRPC.TL_inputStickerSetItem f57815e;
    public TLRPC.TL_messageMediaDocument f57816f;
    public TLRPC.InputFile f57817g;
    public boolean h;
    public long f57818i;
    public TLRPC.StickerSet f57819j;
    public TLRPC.Document f57820k;
    public String f57821l;
    public q10 f57822m;
    public x10 f57823n;
    public boolean f57824o;
    public ArrayList f57825p;
    public ArrayList f57826q;
    public fj f57827r;
    public e20 f57828s;
    public float f57829t;
    public float f57830u;

    public final void a() {
        ArrayList arrayList = this.f57826q;
        ArrayList arrayList2 = this.f57825p;
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
        if (this.f57822m == null) {
            f10 = 0.9f;
        } else {
            f10 = 1.0f;
        }
        if (this.f57828s == null) {
            return f10 * this.f57830u;
        }
        return com.google.android.gms.internal.vision.e2.B(this.f57830u, 0.5f, this.f57829t * 0.5f, f10);
    }
}
