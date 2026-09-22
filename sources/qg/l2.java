package qg;

import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
public final class l2 {
    public String f41771a;
    public String f41772b;
    public String f41773c;
    public CharSequence d;
    public TLRPC.TL_inputStickerSetItem e;
    public TLRPC.TL_messageMediaDocument f41774f;
    public TLRPC.InputFile f41775g;
    public boolean h;
    public long f41776i;
    public TLRPC.StickerSet f41777j;
    public TLRPC.Document f41778k;
    public String f41779l;
    public Utilities.Callback2 f41780m;
    public Utilities.Callback f41781n;
    public boolean f41782o;
    public ArrayList f41783p;
    public ArrayList f41784q;
    public MessageObject f41785r;
    public VideoEditedInfo f41786s;
    public float f41787t;
    public float f41788u;

    public final void a() {
        ArrayList arrayList = this.f41784q;
        ArrayList arrayList2 = this.f41783p;
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
        if (this.f41780m == null) {
            f7 = 0.9f;
        } else {
            f7 = 1.0f;
        }
        if (this.f41786s == null) {
            return f7 * this.f41788u;
        }
        return com.google.android.gms.internal.vision.e2.B(this.f41788u, 0.5f, this.f41787t * 0.5f, f7);
    }
}
