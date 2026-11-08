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
    public String f55557a;
    public String f55558b;
    public String f55559c;
    public CharSequence d;
    public TLRPC.TL_inputStickerSetItem f55560e;
    public TLRPC.TL_messageMediaDocument f55561f;
    public TLRPC.InputFile f55562g;
    public boolean h;
    public long f55563i;
    public TLRPC.StickerSet f55564j;
    public TLRPC.Document f55565k;
    public String f55566l;
    public v10 f55567m;
    public c20 f55568n;
    public boolean f55569o;
    public ArrayList f55570p;
    public ArrayList f55571q;
    public ij f55572r;
    public j20 f55573s;
    public float f55574t;
    public float f55575u;

    public final void a() {
        ArrayList arrayList = this.f55571q;
        ArrayList arrayList2 = this.f55570p;
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
        if (this.f55567m == null) {
            f10 = 0.9f;
        } else {
            f10 = 1.0f;
        }
        if (this.f55573s == null) {
            return f10 * this.f55575u;
        }
        return com.google.android.recaptcha.internal.a.B(this.f55575u, 0.5f, this.f55574t * 0.5f, f10);
    }
}
