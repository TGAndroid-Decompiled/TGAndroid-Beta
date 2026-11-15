package tg;

import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.a8;
import org.telegram.messenger.g20;
import org.telegram.messenger.gj;
import org.telegram.messenger.s10;
import org.telegram.messenger.z10;
import org.telegram.tgnet.TLRPC;
public final class c2 {
    public String f57181a;
    public String f57182b;
    public String f57183c;
    public CharSequence d;
    public TLRPC.TL_inputStickerSetItem f57184e;
    public TLRPC.TL_messageMediaDocument f57185f;
    public TLRPC.InputFile f57186g;
    public boolean h;
    public long f57187i;
    public TLRPC.StickerSet f57188j;
    public TLRPC.Document f57189k;
    public String f57190l;
    public s10 f57191m;
    public z10 f57192n;
    public boolean f57193o;
    public ArrayList f57194p;
    public ArrayList f57195q;
    public gj f57196r;
    public g20 f57197s;
    public float f57198t;
    public float f57199u;

    public final void a() {
        ArrayList arrayList = this.f57195q;
        ArrayList arrayList2 = this.f57194p;
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
        if (this.f57191m == null) {
            f10 = 0.9f;
        } else {
            f10 = 1.0f;
        }
        if (this.f57197s == null) {
            return f10 * this.f57199u;
        }
        return com.google.android.gms.internal.vision.e2.B(this.f57199u, 0.5f, this.f57198t * 0.5f, f10);
    }
}
