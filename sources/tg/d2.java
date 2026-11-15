package tg;

import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.a8;
import org.telegram.messenger.g20;
import org.telegram.messenger.gj;
import org.telegram.messenger.s10;
import org.telegram.messenger.z10;
import org.telegram.tgnet.TLRPC;
public final class d2 {
    public String f57188a;
    public String f57189b;
    public String f57190c;
    public CharSequence d;
    public TLRPC.TL_inputStickerSetItem f57191e;
    public TLRPC.TL_messageMediaDocument f57192f;
    public TLRPC.InputFile f57193g;
    public boolean h;
    public long f57194i;
    public TLRPC.StickerSet f57195j;
    public TLRPC.Document f57196k;
    public String f57197l;
    public s10 f57198m;
    public z10 f57199n;
    public boolean f57200o;
    public ArrayList f57201p;
    public ArrayList f57202q;
    public gj f57203r;
    public g20 f57204s;
    public float f57205t;
    public float f57206u;

    public final void a() {
        ArrayList arrayList = this.f57202q;
        ArrayList arrayList2 = this.f57201p;
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
        if (this.f57198m == null) {
            f10 = 0.9f;
        } else {
            f10 = 1.0f;
        }
        if (this.f57204s == null) {
            return f10 * this.f57206u;
        }
        return com.google.android.gms.internal.vision.e2.B(this.f57206u, 0.5f, this.f57205t * 0.5f, f10);
    }
}
