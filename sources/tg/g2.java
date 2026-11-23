package tg;

import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.a8;
import org.telegram.messenger.d20;
import org.telegram.messenger.fj;
import org.telegram.messenger.p10;
import org.telegram.messenger.w10;
import org.telegram.tgnet.TLRPC;
public final class g2 {
    public String f57919a;
    public String f57920b;
    public String f57921c;
    public CharSequence d;
    public TLRPC.TL_inputStickerSetItem f57922e;
    public TLRPC.TL_messageMediaDocument f57923f;
    public TLRPC.InputFile f57924g;
    public boolean h;
    public long f57925i;
    public TLRPC.StickerSet f57926j;
    public TLRPC.Document f57927k;
    public String f57928l;
    public p10 f57929m;
    public w10 f57930n;
    public boolean f57931o;
    public ArrayList f57932p;
    public ArrayList f57933q;
    public fj f57934r;
    public d20 f57935s;
    public float f57936t;
    public float f57937u;

    public final void a() {
        ArrayList arrayList = this.f57933q;
        ArrayList arrayList2 = this.f57932p;
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
        if (this.f57929m == null) {
            f10 = 0.9f;
        } else {
            f10 = 1.0f;
        }
        if (this.f57935s == null) {
            return f10 * this.f57937u;
        }
        return com.google.android.gms.internal.vision.e2.B(this.f57937u, 0.5f, this.f57936t * 0.5f, f10);
    }
}
