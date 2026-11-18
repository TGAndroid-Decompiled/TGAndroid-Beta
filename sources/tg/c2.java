package tg;

import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.a8;
import org.telegram.messenger.e20;
import org.telegram.messenger.fj;
import org.telegram.messenger.q10;
import org.telegram.messenger.x10;
import org.telegram.tgnet.TLRPC;
public final class c2 {
    public String f57753a;
    public String f57754b;
    public String f57755c;
    public CharSequence d;
    public TLRPC.TL_inputStickerSetItem f57756e;
    public TLRPC.TL_messageMediaDocument f57757f;
    public TLRPC.InputFile f57758g;
    public boolean h;
    public long f57759i;
    public TLRPC.StickerSet f57760j;
    public TLRPC.Document f57761k;
    public String f57762l;
    public q10 f57763m;
    public x10 f57764n;
    public boolean f57765o;
    public ArrayList f57766p;
    public ArrayList f57767q;
    public fj f57768r;
    public e20 f57769s;
    public float f57770t;
    public float f57771u;

    public final void a() {
        ArrayList arrayList = this.f57767q;
        ArrayList arrayList2 = this.f57766p;
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
        if (this.f57763m == null) {
            f10 = 0.9f;
        } else {
            f10 = 1.0f;
        }
        if (this.f57769s == null) {
            return f10 * this.f57771u;
        }
        return com.google.android.gms.internal.vision.e2.B(this.f57771u, 0.5f, this.f57770t * 0.5f, f10);
    }
}
