package rg;

import com.google.android.gms.internal.play_billing.k3;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
public final class l2 {
    public String f45457a;
    public String f45458b;
    public String f45459c;
    public CharSequence d;
    public TLRPC.TL_inputStickerSetItem e;
    public TLRPC.TL_messageMediaDocument f45460f;
    public TLRPC.InputFile f45461g;
    public boolean h;
    public long f45462i;
    public TLRPC.StickerSet f45463j;
    public TLRPC.Document f45464k;
    public String f45465l;
    public Utilities.Callback2 f45466m;
    public Utilities.Callback f45467n;
    public boolean f45468o;
    public ArrayList f45469p;
    public ArrayList f45470q;
    public MessageObject f45471r;
    public VideoEditedInfo f45472s;
    public float f45473t;
    public float f45474u;

    public final void a() {
        ArrayList arrayList = this.f45470q;
        ArrayList arrayList2 = this.f45469p;
        int size = arrayList2.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList2.get(i11);
            i11++;
            try {
                ((File) obj).delete();
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        arrayList2.clear();
        int size2 = arrayList.size();
        while (i10 < size2) {
            Object obj2 = arrayList.get(i10);
            i10++;
            try {
                ((File) obj2).delete();
            } catch (Exception e7) {
                FileLog.e(e7);
            }
        }
        arrayList.clear();
    }

    public final float b() {
        float f7;
        if (this.f45466m == null) {
            f7 = 0.9f;
        } else {
            f7 = 1.0f;
        }
        if (this.f45472s == null) {
            return f7 * this.f45474u;
        }
        return k3.A(this.f45474u, 0.5f, this.f45473t * 0.5f, f7);
    }
}
