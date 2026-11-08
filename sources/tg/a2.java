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
    public String f55558a;
    public String f55559b;
    public String f55560c;
    public CharSequence d;
    public TLRPC.TL_inputStickerSetItem f55561e;
    public TLRPC.TL_messageMediaDocument f55562f;
    public TLRPC.InputFile f55563g;
    public boolean h;
    public long f55564i;
    public TLRPC.StickerSet f55565j;
    public TLRPC.Document f55566k;
    public String f55567l;
    public v10 f55568m;
    public c20 f55569n;
    public boolean f55570o;
    public ArrayList f55571p;
    public ArrayList f55572q;
    public ij f55573r;
    public j20 f55574s;
    public float f55575t;
    public float f55576u;

    public final void a() {
        ArrayList arrayList = this.f55572q;
        ArrayList arrayList2 = this.f55571p;
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
        if (this.f55568m == null) {
            f10 = 0.9f;
        } else {
            f10 = 1.0f;
        }
        if (this.f55574s == null) {
            return f10 * this.f55576u;
        }
        return com.google.android.recaptcha.internal.a.B(this.f55576u, 0.5f, this.f55575t * 0.5f, f10);
    }
}
