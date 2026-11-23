package tg;

import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.a8;
import org.telegram.messenger.f20;
import org.telegram.messenger.gj;
import org.telegram.messenger.r10;
import org.telegram.messenger.y10;
import org.telegram.tgnet.TLRPC;
public final class d2 {
    public String f57816a;
    public String f57817b;
    public String f57818c;
    public CharSequence d;
    public TLRPC.TL_inputStickerSetItem f57819e;
    public TLRPC.TL_messageMediaDocument f57820f;
    public TLRPC.InputFile f57821g;
    public boolean h;
    public long f57822i;
    public TLRPC.StickerSet f57823j;
    public TLRPC.Document f57824k;
    public String f57825l;
    public r10 f57826m;
    public y10 f57827n;
    public boolean f57828o;
    public ArrayList f57829p;
    public ArrayList f57830q;
    public gj f57831r;
    public f20 f57832s;
    public float f57833t;
    public float f57834u;

    public final void a() {
        ArrayList arrayList = this.f57830q;
        ArrayList arrayList2 = this.f57829p;
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
        if (this.f57826m == null) {
            f10 = 0.9f;
        } else {
            f10 = 1.0f;
        }
        if (this.f57832s == null) {
            return f10 * this.f57834u;
        }
        return com.google.android.gms.internal.vision.e2.B(this.f57834u, 0.5f, this.f57833t * 0.5f, f10);
    }
}
