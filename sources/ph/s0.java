package ph;

import android.text.SpannableString;
import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;
public final class s0 {
    public final long A;
    public final ArrayList B;
    public final List C;
    public final String D;
    public final MediaController.SavedFilterState E;
    public final int F;
    public boolean G;
    public int H;
    public long I;
    public long J;
    public long K;
    public long L;
    public final boolean M;
    public final TLRPC.TL_error N;
    public final String O;
    public final TLRPC.InputDocument P;
    public final String Q;
    public final String R;
    public final long S;
    public final long T;
    public final float U;
    public final float V;
    public final float W;
    public final String X;
    public final String Y;
    public final long Z;
    public long f42298a;
    public final long f42299a0;
    public final long f42300b;
    public final float f42301b0;
    public final String f42302c;
    public final float f42303c0;
    public final String d;
    public final float f42304d0;
    public final boolean e;
    public final float f42305e0;
    public final String f42306f;
    public final TLRPC.InputPeer f42307f0;
    public final boolean f42308g;
    public final long f42309g0;
    public final boolean h;
    public final String f42310h0;
    public final long f42311i;
    public final TLRPC.InputMedia f42312i0;
    public final long f42313j;
    public final r f42314j0;
    public final int f42315k;
    public final ArrayList f42316k0;
    public final int f42317l;
    public final int f42318m;
    public final int f42319n;
    public final MediaController.CropState f42320o;
    public final int f42321p;
    public final int f42322q;
    public final long f42323r;
    public final float[] f42324s;
    public final int f42325t;
    public final int f42326u;
    public final String v;
    public final ArrayList f42327w;
    public final ArrayList f42328x;
    public final String f42329y;
    public final String f42330z;

    public s0(t6 t6Var) {
        float[] fArr = new float[9];
        this.f42324s = fArr;
        ArrayList arrayList = new ArrayList();
        this.f42328x = arrayList;
        this.V = 1.0f;
        this.W = 1.0f;
        this.f42304d0 = 1.0f;
        this.f42305e0 = 1.0f;
        this.f42298a = t6Var.f42402b;
        this.f42300b = t6Var.d;
        File file = t6Var.O0;
        this.f42302c = file == null ? "" : file.toString();
        File file2 = t6Var.N0;
        this.d = file2 == null ? "" : file2.toString();
        this.e = t6Var.K;
        File file3 = t6Var.L;
        this.f42306f = file3 == null ? "" : file3.toString();
        this.f42308g = t6Var.M;
        this.h = t6Var.Y;
        float f10 = t6Var.Z;
        long j10 = t6Var.f42416h0;
        this.f42311i = f10 * ((float) j10);
        this.f42313j = t6Var.f42400a0 * ((float) j10);
        this.f42315k = t6Var.Q;
        this.f42317l = t6Var.R;
        this.f42318m = t6Var.f42422k0;
        this.f42319n = t6Var.f42424l0;
        this.f42320o = t6Var.m0;
        this.f42321p = t6Var.f42418i0;
        this.f42322q = t6Var.f42420j0;
        this.f42323r = j10;
        t6Var.f42427n0.getValues(fArr);
        this.f42325t = t6Var.A0;
        this.f42326u = t6Var.B0;
        CharSequence[] charSequenceArr = {t6Var.C0};
        this.f42327w = t6Var.D0 ? MediaDataController.getInstance(t6Var.f42399a).getEntities(charSequenceArr, true) : null;
        CharSequence charSequence = charSequenceArr[0];
        this.v = charSequence == null ? "" : charSequence.toString();
        arrayList.addAll(t6Var.F0);
        File file4 = t6Var.P0;
        this.f42329y = file4 == null ? "" : file4.toString();
        File file5 = t6Var.R0;
        this.f42330z = file5 == null ? "" : file5.toString();
        this.A = t6Var.S0;
        this.B = t6Var.T0;
        this.C = t6Var.U0;
        File file6 = t6Var.Z0;
        this.D = file6 != null ? file6.toString() : "";
        this.E = t6Var.f42401a1;
        this.F = t6Var.I0;
        this.M = t6Var.f42443w;
        this.N = t6Var.f42445x;
        this.O = t6Var.f42447y;
        this.P = t6Var.f42449z;
        this.Q = t6Var.A;
        this.R = t6Var.B;
        this.S = t6Var.C;
        this.T = t6Var.D;
        this.U = t6Var.E;
        this.V = t6Var.F;
        this.W = t6Var.G;
        File file7 = t6Var.f42429o0;
        this.X = file7 != null ? file7.getAbsolutePath() : null;
        this.Y = t6Var.f42431p0;
        this.Z = t6Var.f42433q0;
        this.f42299a0 = t6Var.f42435r0;
        this.f42301b0 = t6Var.f42437s0;
        this.f42303c0 = t6Var.f42439t0;
        this.f42304d0 = t6Var.f42441u0;
        this.f42305e0 = t6Var.P;
        this.f42307f0 = t6Var.f42442v0;
        this.f42309g0 = t6Var.J0;
        this.f42310h0 = t6Var.K0;
        this.f42312i0 = t6Var.L0;
        this.f42314j0 = t6Var.S;
        this.f42316k0 = VideoEditedInfo.Part.toParts(t6Var);
    }

    public final t6 a() {
        t6 t6Var = new t6();
        t6Var.f42402b = this.f42298a;
        t6Var.f42405c = true;
        t6Var.d = this.f42300b;
        String str = this.f42302c;
        if (!TextUtils.isEmpty(str)) {
            t6Var.O0 = new File(str);
        }
        String str2 = this.d;
        if (!TextUtils.isEmpty(str2)) {
            t6Var.N0 = new File(str2);
        }
        t6Var.K = this.e;
        String str3 = this.f42306f;
        if (str3 != null) {
            t6Var.L = new File(str3);
        }
        t6Var.M = this.f42308g;
        t6Var.Y = this.h;
        long j10 = this.f42323r;
        t6Var.f42416h0 = j10;
        if (j10 > 0) {
            t6Var.Z = ((float) this.f42311i) / ((float) j10);
            t6Var.f42400a0 = ((float) this.f42313j) / ((float) j10);
        } else {
            t6Var.Z = 0.0f;
            t6Var.f42400a0 = 1.0f;
        }
        t6Var.Q = this.f42315k;
        t6Var.R = this.f42317l;
        t6Var.f42422k0 = this.f42318m;
        t6Var.f42424l0 = this.f42319n;
        t6Var.m0 = this.f42320o;
        t6Var.f42418i0 = this.f42321p;
        t6Var.f42420j0 = this.f42322q;
        t6Var.f42427n0.setValues(this.f42324s);
        t6Var.A0 = this.f42325t;
        t6Var.B0 = this.f42326u;
        String str4 = this.v;
        if (str4 != null) {
            SpannableString spannableString = new SpannableString(str4);
            if (org.telegram.ui.ActionBar.j6.f20074o2 == null) {
                org.telegram.ui.ActionBar.j6.O();
            }
            CharSequence replaceEmoji = Emoji.replaceEmoji(spannableString, org.telegram.ui.ActionBar.j6.f20074o2.getFontMetricsInt(), true);
            MessageObject.addEntitiesToText(replaceEmoji, this.f42327w, true, false, true, false);
            t6Var.C0 = MessageObject.replaceAnimatedEmoji(replaceEmoji, this.f42327w, org.telegram.ui.ActionBar.j6.f20074o2.getFontMetricsInt());
        } else {
            t6Var.C0 = "";
        }
        ArrayList arrayList = t6Var.F0;
        arrayList.clear();
        arrayList.addAll(this.f42328x);
        String str5 = this.f42329y;
        if (str5 != null) {
            t6Var.P0 = new File(str5);
        }
        String str6 = this.f42330z;
        if (str6 != null) {
            t6Var.R0 = new File(str6);
        }
        t6Var.S0 = this.A;
        t6Var.T0 = this.B;
        t6Var.U0 = this.C;
        String str7 = this.D;
        if (str7 != null) {
            t6Var.Z0 = new File(str7);
        }
        t6Var.f42401a1 = this.E;
        t6Var.I0 = this.F;
        t6Var.f42414g = this.G;
        t6Var.f42412f = this.H;
        t6Var.e = this.I;
        t6Var.J = this.L;
        t6Var.I = this.K;
        t6Var.H = this.J;
        t6Var.f42443w = this.M;
        t6Var.f42445x = this.N;
        t6Var.f42447y = this.O;
        t6Var.f42449z = this.P;
        t6Var.A = this.Q;
        t6Var.B = this.R;
        t6Var.C = this.S;
        t6Var.D = this.T;
        t6Var.E = this.U;
        t6Var.F = this.V;
        t6Var.G = this.W;
        String str8 = this.X;
        if (str8 != null) {
            t6Var.f42429o0 = new File(str8);
        }
        t6Var.f42431p0 = this.Y;
        t6Var.f42433q0 = this.Z;
        t6Var.f42435r0 = this.f42299a0;
        t6Var.f42437s0 = this.f42301b0;
        t6Var.f42439t0 = this.f42303c0;
        t6Var.f42441u0 = this.f42304d0;
        t6Var.P = this.f42305e0;
        t6Var.f42442v0 = this.f42307f0;
        t6Var.J0 = this.f42309g0;
        t6Var.K0 = this.f42310h0;
        t6Var.L0 = this.f42312i0;
        t6Var.S = this.f42314j0;
        t6Var.T = VideoEditedInfo.Part.toStoryEntries(this.f42316k0);
        return t6Var;
    }

    public final void b(NativeByteBuffer nativeByteBuffer) {
        int size;
        int size2;
        int size3;
        int size4;
        ArrayList arrayList;
        nativeByteBuffer.writeInt32(-1318387531);
        nativeByteBuffer.writeInt64(this.f42300b);
        nativeByteBuffer.writeString(this.f42302c);
        nativeByteBuffer.writeBool(this.e);
        nativeByteBuffer.writeString(this.f42306f);
        nativeByteBuffer.writeBool(this.f42308g);
        nativeByteBuffer.writeBool(this.h);
        nativeByteBuffer.writeInt64(this.f42311i);
        nativeByteBuffer.writeInt64(this.f42313j);
        nativeByteBuffer.writeInt32(this.f42315k);
        nativeByteBuffer.writeInt32(this.f42317l);
        nativeByteBuffer.writeInt32(this.f42318m);
        nativeByteBuffer.writeInt32(this.f42319n);
        nativeByteBuffer.writeInt32(this.f42321p);
        nativeByteBuffer.writeInt32(this.f42322q);
        nativeByteBuffer.writeInt64(this.f42323r);
        int i10 = 0;
        int i11 = 0;
        while (true) {
            float[] fArr = this.f42324s;
            if (i11 >= fArr.length) {
                break;
            }
            nativeByteBuffer.writeFloat(fArr[i11]);
            i11++;
        }
        nativeByteBuffer.writeInt32(this.f42325t);
        nativeByteBuffer.writeInt32(this.f42326u);
        nativeByteBuffer.writeString(this.v);
        nativeByteBuffer.writeInt32(481674261);
        ArrayList arrayList2 = this.f42327w;
        if (arrayList2 == null) {
            size = 0;
        } else {
            size = arrayList2.size();
        }
        nativeByteBuffer.writeInt32(size);
        if (arrayList2 != null) {
            for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                ((TLRPC.MessageEntity) arrayList2.get(i12)).serializeToStream(nativeByteBuffer);
            }
        }
        nativeByteBuffer.writeInt32(481674261);
        ArrayList arrayList3 = this.f42328x;
        if (arrayList3 == null) {
            size2 = 0;
        } else {
            size2 = arrayList3.size();
        }
        nativeByteBuffer.writeInt32(size2);
        if (arrayList3 != null) {
            for (int i13 = 0; i13 < arrayList3.size(); i13++) {
                ((TLRPC.InputPrivacyRule) arrayList3.get(i13)).serializeToStream(nativeByteBuffer);
            }
        }
        nativeByteBuffer.writeBool(false);
        nativeByteBuffer.writeString(this.f42329y);
        nativeByteBuffer.writeInt64(this.A);
        nativeByteBuffer.writeInt32(481674261);
        ArrayList arrayList4 = this.B;
        if (arrayList4 == null) {
            size3 = 0;
        } else {
            size3 = arrayList4.size();
        }
        nativeByteBuffer.writeInt32(size3);
        if (arrayList4 != null) {
            for (int i14 = 0; i14 < arrayList4.size(); i14++) {
                ((VideoEditedInfo.MediaEntity) arrayList4.get(i14)).serializeTo(nativeByteBuffer, true);
            }
        }
        nativeByteBuffer.writeInt32(481674261);
        List list = this.C;
        if (list == null) {
            size4 = 0;
        } else {
            size4 = list.size();
        }
        nativeByteBuffer.writeInt32(size4);
        if (list != null) {
            for (int i15 = 0; i15 < list.size(); i15++) {
                ((TLRPC.InputDocument) list.get(i15)).serializeToStream(nativeByteBuffer);
            }
        }
        String str = "";
        String str2 = this.D;
        if (str2 == null) {
            str2 = "";
        }
        nativeByteBuffer.writeString(str2);
        MediaController.SavedFilterState savedFilterState = this.E;
        if (savedFilterState == null) {
            nativeByteBuffer.writeInt32(1450380236);
        } else {
            nativeByteBuffer.writeInt32(-1318387530);
            savedFilterState.serializeToStream(nativeByteBuffer);
        }
        nativeByteBuffer.writeInt32(this.F);
        nativeByteBuffer.writeInt32(481674261);
        nativeByteBuffer.writeInt32(0);
        nativeByteBuffer.writeBool(this.G);
        nativeByteBuffer.writeInt32(this.H);
        nativeByteBuffer.writeInt64(this.I);
        nativeByteBuffer.writeInt64(this.L);
        nativeByteBuffer.writeInt64(this.K);
        nativeByteBuffer.writeInt64(this.J);
        nativeByteBuffer.writeString(this.f42330z);
        nativeByteBuffer.writeBool(this.M);
        TLRPC.TL_error tL_error = this.N;
        if (tL_error == null) {
            nativeByteBuffer.writeInt32(1450380236);
        } else {
            tL_error.serializeToStream(nativeByteBuffer);
        }
        nativeByteBuffer.writeString(this.d);
        String str3 = this.O;
        if (str3 == null) {
            nativeByteBuffer.writeInt32(1450380236);
        } else {
            nativeByteBuffer.writeInt32(-1739392570);
            nativeByteBuffer.writeString(str3);
            String str4 = this.Q;
            if (str4 == null) {
                nativeByteBuffer.writeInt32(1450380236);
            } else {
                nativeByteBuffer.writeInt32(-1222740358);
                nativeByteBuffer.writeString(str4);
            }
            String str5 = this.R;
            if (str5 == null) {
                nativeByteBuffer.writeInt32(1450380236);
            } else {
                nativeByteBuffer.writeInt32(-1222740358);
                nativeByteBuffer.writeString(str5);
            }
            nativeByteBuffer.writeInt64(this.S);
            nativeByteBuffer.writeInt64(this.T);
            nativeByteBuffer.writeFloat(this.U);
            nativeByteBuffer.writeFloat(this.V);
            nativeByteBuffer.writeFloat(this.W);
        }
        TLRPC.InputPeer inputPeer = this.f42307f0;
        if (inputPeer != null) {
            inputPeer.serializeToStream(nativeByteBuffer);
        } else {
            new TLRPC.TL_inputPeerSelf().serializeToStream(nativeByteBuffer);
        }
        String str6 = this.X;
        if (TextUtils.isEmpty(str6)) {
            nativeByteBuffer.writeInt32(1450380236);
        } else {
            nativeByteBuffer.writeInt32(1137015880);
            nativeByteBuffer.writeString(str6);
            nativeByteBuffer.writeInt64(this.Z);
            nativeByteBuffer.writeInt64(this.f42299a0);
            nativeByteBuffer.writeFloat(this.f42301b0);
            nativeByteBuffer.writeFloat(this.f42303c0);
            nativeByteBuffer.writeFloat(this.f42304d0);
        }
        nativeByteBuffer.writeFloat(this.f42305e0);
        nativeByteBuffer.writeInt64(this.f42309g0);
        String str7 = this.f42310h0;
        if (str7 != null) {
            str = str7;
        }
        nativeByteBuffer.writeString(str);
        TLRPC.InputMedia inputMedia = this.f42312i0;
        if (inputMedia == null) {
            nativeByteBuffer.writeInt32(1450380236);
        } else {
            inputMedia.serializeToStream(nativeByteBuffer);
        }
        r rVar = this.f42314j0;
        if (rVar != null && rVar.e.size() > 1 && (arrayList = this.f42316k0) != null && arrayList.size() > 1) {
            nativeByteBuffer.writeInt32(-559038737);
            nativeByteBuffer.writeString(rVar.f42261a);
            int size5 = arrayList.size();
            while (i10 < size5) {
                Object obj = arrayList.get(i10);
                i10++;
                ((VideoEditedInfo.Part) obj).serializeToStream(nativeByteBuffer);
            }
        } else {
            nativeByteBuffer.writeInt32(1450380236);
        }
        MediaController.CropState cropState = this.f42320o;
        if (cropState == null) {
            nativeByteBuffer.writeInt32(1450380236);
        } else {
            cropState.serializeToStream(nativeByteBuffer);
        }
        TLRPC.InputDocument inputDocument = this.P;
        if (inputDocument == null) {
            nativeByteBuffer.writeInt32(1450380236);
        } else {
            inputDocument.serializeToStream(nativeByteBuffer);
        }
    }

    public s0(NativeByteBuffer nativeByteBuffer) {
        int readInt32;
        this.f42324s = new float[9];
        this.f42328x = new ArrayList();
        this.V = 1.0f;
        this.W = 1.0f;
        this.f42304d0 = 1.0f;
        this.f42305e0 = 1.0f;
        if (nativeByteBuffer.readInt32(true) == -1318387531) {
            this.f42300b = nativeByteBuffer.readInt64(true);
            String readString = nativeByteBuffer.readString(true);
            this.f42302c = readString;
            if (readString != null && readString.length() == 0) {
                this.f42302c = null;
            }
            this.e = nativeByteBuffer.readBool(true);
            String readString2 = nativeByteBuffer.readString(true);
            this.f42306f = readString2;
            if (readString2 != null && readString2.length() == 0) {
                this.f42306f = null;
            }
            this.f42308g = nativeByteBuffer.readBool(true);
            this.h = nativeByteBuffer.readBool(true);
            this.f42311i = nativeByteBuffer.readInt64(true);
            this.f42313j = nativeByteBuffer.readInt64(true);
            this.f42315k = nativeByteBuffer.readInt32(true);
            this.f42317l = nativeByteBuffer.readInt32(true);
            this.f42318m = nativeByteBuffer.readInt32(true);
            this.f42319n = nativeByteBuffer.readInt32(true);
            this.f42321p = nativeByteBuffer.readInt32(true);
            this.f42322q = nativeByteBuffer.readInt32(true);
            this.f42323r = nativeByteBuffer.readInt64(true);
            int i10 = 0;
            while (true) {
                float[] fArr = this.f42324s;
                if (i10 >= fArr.length) {
                    break;
                }
                fArr[i10] = nativeByteBuffer.readFloat(true);
                i10++;
            }
            this.f42325t = nativeByteBuffer.readInt32(true);
            this.f42326u = nativeByteBuffer.readInt32(true);
            String readString3 = nativeByteBuffer.readString(true);
            this.v = readString3;
            if (readString3 != null && readString3.length() == 0) {
                this.v = null;
            }
            if (nativeByteBuffer.readInt32(true) == 481674261) {
                int readInt322 = nativeByteBuffer.readInt32(true);
                for (int i11 = 0; i11 < readInt322; i11++) {
                    if (this.f42327w == null) {
                        this.f42327w = new ArrayList();
                    }
                    this.f42327w.add(TLRPC.MessageEntity.TLdeserialize(nativeByteBuffer, nativeByteBuffer.readInt32(true), true));
                }
                if (nativeByteBuffer.readInt32(true) == 481674261) {
                    int readInt323 = nativeByteBuffer.readInt32(true);
                    this.f42328x.clear();
                    for (int i12 = 0; i12 < readInt323; i12++) {
                        this.f42328x.add(TLRPC.InputPrivacyRule.TLdeserialize(nativeByteBuffer, nativeByteBuffer.readInt32(true), true));
                    }
                    nativeByteBuffer.readBool(true);
                    String readString4 = nativeByteBuffer.readString(true);
                    this.f42329y = readString4;
                    if (readString4 != null && readString4.length() == 0) {
                        this.f42329y = null;
                    }
                    this.A = nativeByteBuffer.readInt64(true);
                    if (nativeByteBuffer.readInt32(true) == 481674261) {
                        int readInt324 = nativeByteBuffer.readInt32(true);
                        for (int i13 = 0; i13 < readInt324; i13++) {
                            if (this.B == null) {
                                this.B = new ArrayList();
                            }
                            this.B.add(new VideoEditedInfo.MediaEntity(nativeByteBuffer, true, true));
                        }
                        if (nativeByteBuffer.readInt32(true) == 481674261) {
                            int readInt325 = nativeByteBuffer.readInt32(true);
                            for (int i14 = 0; i14 < readInt325; i14++) {
                                if (this.C == null) {
                                    this.C = new ArrayList();
                                }
                                this.C.add(TLRPC.InputDocument.TLdeserialize(nativeByteBuffer, nativeByteBuffer.readInt32(true), true));
                            }
                            String readString5 = nativeByteBuffer.readString(true);
                            this.D = readString5;
                            if (readString5 != null && readString5.length() == 0) {
                                this.D = null;
                            }
                            int readInt326 = nativeByteBuffer.readInt32(true);
                            if (readInt326 == 1450380236) {
                                this.E = null;
                            } else if (readInt326 == -1318387530) {
                                MediaController.SavedFilterState savedFilterState = new MediaController.SavedFilterState();
                                this.E = savedFilterState;
                                savedFilterState.readParams(nativeByteBuffer, true);
                            }
                            if (nativeByteBuffer.remaining() >= 4) {
                                this.F = nativeByteBuffer.readInt32(true);
                            }
                            if (nativeByteBuffer.remaining() > 0) {
                                if (nativeByteBuffer.readInt32(true) == 481674261) {
                                    nativeByteBuffer.readInt32(true);
                                } else {
                                    throw new RuntimeException("Vector magic in StoryDraft parse error (5)");
                                }
                            }
                            if (nativeByteBuffer.remaining() > 0) {
                                this.G = nativeByteBuffer.readBool(true);
                                this.H = nativeByteBuffer.readInt32(true);
                                this.I = nativeByteBuffer.readInt64(true);
                                this.L = nativeByteBuffer.readInt64(true);
                                this.K = nativeByteBuffer.readInt64(true);
                                this.J = nativeByteBuffer.readInt64(true);
                            }
                            if (nativeByteBuffer.remaining() > 0) {
                                String readString6 = nativeByteBuffer.readString(true);
                                this.f42330z = readString6;
                                if (readString6 != null && readString6.length() == 0) {
                                    this.f42330z = null;
                                }
                            }
                            if (nativeByteBuffer.remaining() > 0) {
                                this.M = nativeByteBuffer.readBool(true);
                                int readInt327 = nativeByteBuffer.readInt32(true);
                                if (readInt327 == 1450380236) {
                                    this.N = null;
                                } else {
                                    this.N = TLRPC.TL_error.TLdeserialize(nativeByteBuffer, readInt327, true);
                                }
                                this.d = nativeByteBuffer.readString(true);
                            }
                            if (nativeByteBuffer.remaining() > 0 && nativeByteBuffer.readInt32(true) == -1739392570) {
                                this.O = nativeByteBuffer.readString(true);
                                if (nativeByteBuffer.readInt32(true) == -1222740358) {
                                    this.Q = nativeByteBuffer.readString(true);
                                }
                                if (nativeByteBuffer.readInt32(true) == -1222740358) {
                                    this.R = nativeByteBuffer.readString(true);
                                }
                                this.S = nativeByteBuffer.readInt64(true);
                                this.T = nativeByteBuffer.readInt64(true);
                                this.U = nativeByteBuffer.readFloat(true);
                                this.V = nativeByteBuffer.readFloat(true);
                                this.W = nativeByteBuffer.readFloat(true);
                            }
                            if (nativeByteBuffer.remaining() > 0) {
                                this.f42307f0 = TLRPC.InputPeer.TLdeserialize(nativeByteBuffer, nativeByteBuffer.readInt32(true), true);
                            }
                            if (nativeByteBuffer.remaining() > 0 && nativeByteBuffer.readInt32(true) == 1137015880) {
                                this.X = nativeByteBuffer.readString(true);
                                this.Z = nativeByteBuffer.readInt64(true);
                                this.f42299a0 = nativeByteBuffer.readInt64(true);
                                this.f42301b0 = nativeByteBuffer.readFloat(true);
                                this.f42303c0 = nativeByteBuffer.readFloat(true);
                                this.f42304d0 = nativeByteBuffer.readFloat(true);
                            }
                            if (nativeByteBuffer.remaining() > 0) {
                                this.f42305e0 = nativeByteBuffer.readFloat(true);
                            }
                            if (nativeByteBuffer.remaining() > 0) {
                                this.f42309g0 = nativeByteBuffer.readInt64(true);
                                this.f42310h0 = nativeByteBuffer.readString(true);
                                int readInt328 = nativeByteBuffer.readInt32(true);
                                if (readInt328 != 1450380236) {
                                    this.f42312i0 = TLRPC.InputMedia.TLdeserialize(nativeByteBuffer, readInt328, true);
                                }
                            }
                            if (nativeByteBuffer.remaining() > 0 && nativeByteBuffer.readInt32(true) == -559038737) {
                                this.f42314j0 = new r(nativeByteBuffer.readString(true));
                                this.f42316k0 = new ArrayList();
                                for (int i15 = 0; i15 < this.f42314j0.e.size(); i15++) {
                                    VideoEditedInfo.Part part = new VideoEditedInfo.Part();
                                    part.readParams(nativeByteBuffer, true);
                                    part.part = (q) this.f42314j0.e.get(i15);
                                    this.f42316k0.add(part);
                                }
                            }
                            if (nativeByteBuffer.remaining() > 0 && nativeByteBuffer.readInt32(true) == 1151577037) {
                                MediaController.CropState cropState = new MediaController.CropState();
                                this.f42320o = cropState;
                                cropState.readParams(nativeByteBuffer, true);
                            }
                            if (nativeByteBuffer.remaining() <= 0 || (readInt32 = nativeByteBuffer.readInt32(true)) != 448771445) {
                                return;
                            }
                            this.P = TLRPC.InputDocument.TLdeserialize(nativeByteBuffer, readInt32, true);
                            return;
                        }
                        throw new RuntimeException("Vector magic in StoryDraft parse error (4)");
                    }
                    throw new RuntimeException("Vector magic in StoryDraft parse error (3)");
                }
                throw new RuntimeException("Vector magic in StoryDraft parse error (2)");
            }
            throw new RuntimeException("Vector magic in StoryDraft parse error (1)");
        }
        throw new RuntimeException("StoryDraft parse error");
    }
}
