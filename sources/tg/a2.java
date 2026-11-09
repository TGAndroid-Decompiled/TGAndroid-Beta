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
    public String f55570a;
    public String f55571b;
    public String f55572c;
    public CharSequence d;
    public TLRPC.TL_inputStickerSetItem f55573e;
    public TLRPC.TL_messageMediaDocument f55574f;
    public TLRPC.InputFile f55575g;
    public boolean h;
    public long f55576i;
    public TLRPC.StickerSet f55577j;
    public TLRPC.Document f55578k;
    public String f55579l;
    public v10 f55580m;
    public c20 f55581n;
    public boolean f55582o;
    public ArrayList f55583p;
    public ArrayList f55584q;
    public ij f55585r;
    public j20 f55586s;
    public float f55587t;
    public float f55588u;

    public final void a() {
        ArrayList arrayList = this.f55584q;
        ArrayList arrayList2 = this.f55583p;
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
        if (this.f55580m == null) {
            f10 = 0.9f;
        } else {
            f10 = 1.0f;
        }
        if (this.f55586s == null) {
            return f10 * this.f55588u;
        }
        return com.google.android.recaptcha.internal.a.B(this.f55588u, 0.5f, this.f55587t * 0.5f, f10);
    }
}
