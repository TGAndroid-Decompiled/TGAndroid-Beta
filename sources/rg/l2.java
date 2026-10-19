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
    public String f45445a;
    public String f45446b;
    public String f45447c;
    public CharSequence d;
    public TLRPC.TL_inputStickerSetItem e;
    public TLRPC.TL_messageMediaDocument f45448f;
    public TLRPC.InputFile f45449g;
    public boolean h;
    public long f45450i;
    public TLRPC.StickerSet f45451j;
    public TLRPC.Document f45452k;
    public String f45453l;
    public Utilities.Callback2 f45454m;
    public Utilities.Callback f45455n;
    public boolean f45456o;
    public ArrayList f45457p;
    public ArrayList f45458q;
    public MessageObject f45459r;
    public VideoEditedInfo f45460s;
    public float f45461t;
    public float f45462u;

    public final void a() {
        ArrayList arrayList = this.f45458q;
        ArrayList arrayList2 = this.f45457p;
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
        if (this.f45454m == null) {
            f7 = 0.9f;
        } else {
            f7 = 1.0f;
        }
        if (this.f45460s == null) {
            return f7 * this.f45462u;
        }
        return k3.A(this.f45462u, 0.5f, this.f45461t * 0.5f, f7);
    }
}
