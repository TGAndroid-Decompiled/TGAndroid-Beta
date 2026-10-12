package rg;

import com.google.android.gms.internal.play_billing.k3;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
public final class n2 {
    public String f44380a;
    public String f44381b;
    public String f44382c;
    public CharSequence d;
    public TLRPC.TL_inputStickerSetItem e;
    public TLRPC.TL_messageMediaDocument f44383f;
    public TLRPC.InputFile f44384g;
    public boolean h;
    public long f44385i;
    public TLRPC.StickerSet f44386j;
    public TLRPC.Document f44387k;
    public String f44388l;
    public Utilities.Callback2 f44389m;
    public Utilities.Callback f44390n;
    public boolean f44391o;
    public ArrayList f44392p;
    public ArrayList f44393q;
    public MessageObject f44394r;
    public VideoEditedInfo f44395s;
    public float f44396t;
    public float f44397u;

    public final void a() {
        ArrayList arrayList = this.f44393q;
        ArrayList arrayList2 = this.f44392p;
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
        if (this.f44389m == null) {
            f7 = 0.9f;
        } else {
            f7 = 1.0f;
        }
        if (this.f44395s == null) {
            return f7 * this.f44397u;
        }
        return k3.A(this.f44397u, 0.5f, this.f44396t * 0.5f, f7);
    }
}
