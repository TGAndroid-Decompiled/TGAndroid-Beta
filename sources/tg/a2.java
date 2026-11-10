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
    public String f55569a;
    public String f55570b;
    public String f55571c;
    public CharSequence d;
    public TLRPC.TL_inputStickerSetItem f55572e;
    public TLRPC.TL_messageMediaDocument f55573f;
    public TLRPC.InputFile f55574g;
    public boolean h;
    public long f55575i;
    public TLRPC.StickerSet f55576j;
    public TLRPC.Document f55577k;
    public String f55578l;
    public v10 f55579m;
    public c20 f55580n;
    public boolean f55581o;
    public ArrayList f55582p;
    public ArrayList f55583q;
    public ij f55584r;
    public j20 f55585s;
    public float f55586t;
    public float f55587u;

    public final void a() {
        ArrayList arrayList = this.f55583q;
        ArrayList arrayList2 = this.f55582p;
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
        if (this.f55579m == null) {
            f10 = 0.9f;
        } else {
            f10 = 1.0f;
        }
        if (this.f55585s == null) {
            return f10 * this.f55587u;
        }
        return com.google.android.recaptcha.internal.a.B(this.f55587u, 0.5f, this.f55586t * 0.5f, f10);
    }
}
