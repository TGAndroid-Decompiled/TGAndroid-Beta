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
    public String f57781a;
    public String f57782b;
    public String f57783c;
    public CharSequence d;
    public TLRPC.TL_inputStickerSetItem f57784e;
    public TLRPC.TL_messageMediaDocument f57785f;
    public TLRPC.InputFile f57786g;
    public boolean h;
    public long f57787i;
    public TLRPC.StickerSet f57788j;
    public TLRPC.Document f57789k;
    public String f57790l;
    public r10 f57791m;
    public y10 f57792n;
    public boolean f57793o;
    public ArrayList f57794p;
    public ArrayList f57795q;
    public gj f57796r;
    public f20 f57797s;
    public float f57798t;
    public float f57799u;

    public final void a() {
        ArrayList arrayList = this.f57795q;
        ArrayList arrayList2 = this.f57794p;
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
        if (this.f57791m == null) {
            f10 = 0.9f;
        } else {
            f10 = 1.0f;
        }
        if (this.f57797s == null) {
            return f10 * this.f57799u;
        }
        return com.google.android.gms.internal.vision.e2.B(this.f57799u, 0.5f, this.f57798t * 0.5f, f10);
    }
}
